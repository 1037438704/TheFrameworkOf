package mycanera.txunda.com.theframeworkof;


import android.widget.TextView;
import mycanera.txunda.com.frame.base.BaseFragment;
import mycanera.txunda.com.frame.interfaces.Layout;


/**
 * A simple {@link } subclass.
 * @author dell-pc
 */
@Layout(R.layout.fragment_blank)
public class BlankFragment extends BaseFragment {
    private TextView textView;
    @Override
    public void initViews() {
        textView = findViewById(R.id.textView);
    }

    @Override
    public void initDatas() {

    }

    @Override
    public void setEvents() {

    }

}
