package bin.mt.signature;

import amimo.dcc.DccApplication;
import android.app.Application;

/* loaded from: classes.dex */
public class KillerApplication extends Application {
    private static native String getApkPath(String str);

    private static native void inject(String str);

    private static native void inject(String str, String str2, int[] iArr);

    private static native boolean isApkPath(String str, String str2);

    static {
        DccApplication.initDcc();
        inject("ar.tvplayer.tv");
    }
}
