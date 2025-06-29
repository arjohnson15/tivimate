package amimo.dcc;

import android.app.Application;

/* loaded from: classes.dex */
public class DccApplication extends Application {
    static {
        System.loadLibrary("hax");
    }

    public static final native void initDcc();
}
