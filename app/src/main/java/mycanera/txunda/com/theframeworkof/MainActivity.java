package mycanera.txunda.com.theframeworkof;

import android.view.View;
import android.widget.Button;

import java.util.jar.Manifest;

import mycanera.txunda.com.frame.base.BaseActivity;
import mycanera.txunda.com.frame.interfaces.DarkNavigationBarTheme;
import mycanera.txunda.com.frame.interfaces.DarkStatusBarTheme;
import mycanera.txunda.com.frame.interfaces.Layout;
import mycanera.txunda.com.frame.interfaces.NavigationBarBackgroundColor;
import mycanera.txunda.com.frame.util.JumpParameter;
import mycanera.txunda.com.frame.util.OnResponseListener;


/**
 * @author dell-pc
 */
@Layout(R.layout.activity_main) //布局
@DarkStatusBarTheme(true) //开启顶部状态栏图标、文字暗色模式
@NavigationBarBackgroundColor(a = 0, r = 0, g = 0, b = 0)
//透明颜色   设置底部导航栏背景颜色（a = 255,r = 255,g = 255,b = 255 黑色的）
@DarkNavigationBarTheme(true) //开启底部导航栏按钮暗色模式
public class MainActivity extends BaseActivity {

    private Button button_1;
    private Button button_2;
    private Button button_3;
    private Button button_4;
    private Button button_5;

    @Override
    public void initViews() {
        button_1 = findViewById(R.id.button_1);
        button_2 = findViewById(R.id.button_2);
        button_3 = findViewById(R.id.button_3);
        button_4 = findViewById(R.id.button_4);
        button_5 = findViewById(R.id.button_5);
    }

    @Override
    public void initDatas(JumpParameter paramer) {

    }

    @Override
    public void setEvents() {
        button_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                jump(Main2Activity.class,new JumpParameter()
                .put("can1","10000000000000000000000")
                );
            }
        });
        button_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                jump(Main2Activity.class, new JumpParameter()
                        .put("can1", "我是要返回的值")
                        .put("can2", "你猜"), new OnResponseListener() {
                    @Override
                    public void OnResponse(JumpParameter jumpParameter) {
                        if (jumpParameter == null){
                            toast("未返回任何数据");
                        }else {
                            toast("收到返回数据，参数“返回数据1”中的值为：" + jumpParameter.get("返回数据1"));
                        }
                    }
                });
            }
        });
        button_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toast("我吐司了一下 ! 呵呵呵");
            }
        });
        button_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                log("我打印了一个log日志");
            }
        });
        button_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                jump(Main2Activity.class);
            }
        });
    }
}
