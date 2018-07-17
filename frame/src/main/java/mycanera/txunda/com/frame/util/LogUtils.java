package mycanera.txunda.com.frame.util;

import android.util.Log;

/**
 * ===============Txunda===============
 * 作者：DUKE_HwangZj
 * 日期：2017/6/30 0030
 * 时间：上午 11:27
 * 描述：Log统一管理类
 * ===============Txunda===============
 */
public class LogUtils {
    /**
     * 是否需要打印bug，可以在application的onCreate函数里面初始化
     */
    public static boolean isDebug = true;
    private static final String TAG = "=====LogByHzj=====";

    /**
     * 下面四个是默认tag的函数
     * */
    public static void i(String msg) {
        if (isDebug) {
            Log.i(TAG, msg);
        }
    }

    public static void d(String msg) {
        if (isDebug) {
            Log.d(TAG, msg);
        }
    }

    public static void e(String msg) {
        if (isDebug) {
            Log.e(TAG, msg);
        }
    }

    public static void v(String msg) {
        if (isDebug) {
            Log.v(TAG, msg);
        }
    }

    /**
     * 下面是传入类名打印log
     * */
    public static void i(Class<?> _class, String msg) {
        if (isDebug) {
            Log.i(_class.getName(), msg);
        }
    }

    public static void d(Class<?> _class, String msg) {
        if (isDebug) {
            Log.i(_class.getName(), msg);
        }
    }

    public static void e(Class<?> _class, String msg) {
        if (isDebug) {
            Log.i(_class.getName(), msg);
        }
    }

    public static void v(Class<?> _class, String msg) {
        if (isDebug) {
            Log.i(_class.getName(), msg);
        }
    }

    /**
    *下面是传入自定义tag的函数
     * */
    public static void i(String tag, String msg) {
        if (isDebug) {
            Log.i(tag, msg);
        }
    }

    public static void d(String tag, String msg) {
        if (isDebug) {
            Log.d(tag, msg);
        }
    }

    public static void e(String tag, String msg) {
        if (isDebug) {
            Log.e(tag, msg);
        }
    }

    public static void v(String tag, String msg) {
        if (isDebug) {
            Log.v(tag, msg);
        }
    }
}