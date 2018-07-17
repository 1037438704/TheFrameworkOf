package mycanera.txunda.com.theframeworkof;

import android.support.v7.widget.ButtonBarLayout;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import mycanera.txunda.com.frame.base.BaseActivity;
import mycanera.txunda.com.frame.interfaces.DarkNavigationBarTheme;
import mycanera.txunda.com.frame.interfaces.DarkStatusBarTheme;
import mycanera.txunda.com.frame.interfaces.Layout;
import mycanera.txunda.com.frame.interfaces.NavigationBarBackgroundColor;
import mycanera.txunda.com.frame.util.JumpParameter;


/**
 * @author dell-pc
 */
@Layout(R.layout.activity_main2)
@DarkStatusBarTheme(true) //开启顶部状态栏图标、文字暗色模式
@NavigationBarBackgroundColor(a = 0, r = 0, g = 0, b = 0)
//透明颜色   设置底部导航栏背景颜色（a = 255,r = 255,g = 255,b = 255 黑色的）
@DarkNavigationBarTheme(true) //开启底部导航栏按钮暗色模式
public class Main2Activity extends BaseActivity {
    private Button button_1;
    private Button button_2;

    @Override
    public void initViews() {
        button_1 = findViewById(R.id.button_1);
        button_2 = findViewById(R.id.button_2);
    }

    @Override
    public void initDatas(JumpParameter paramer) {
        if (paramer != null) {
            toast(new StringBuffer("我是传过来的数据").append(paramer.get("can1")).toString());
        }
    }

    @Override
    public void setEvents() {
        button_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        button_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setResponse(new JumpParameter().put("返回数据1", "测试成功"));
            }
        });
    }
}
