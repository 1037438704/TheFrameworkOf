package mycanera.txunda.com.frame.util;

public interface OnPermissionResponseListener {
    void onSuccess(String[] permissions);
    void onFail();
}
