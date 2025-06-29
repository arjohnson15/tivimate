package p396;

import android.os.Build;
import p052.ExecutorC1321;

/* renamed from: ⁱᴵ.ﾞᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC4597 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static final C4574 f17595;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static final C4574 f17596;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final ExecutorC1321 f17597;

    static {
        String property = System.getProperty("java.vm.name");
        property.getClass();
        if (property.equals("RoboVM")) {
            f17597 = null;
            f17595 = new C4574(7);
            f17596 = new C4574(6);
        } else {
            if (!property.equals("Dalvik")) {
                f17597 = null;
                f17595 = new C4549(1);
                f17596 = new C4568(6);
                return;
            }
            f17597 = new ExecutorC1321(3);
            if (Build.VERSION.SDK_INT >= 24) {
                f17595 = new C4549(0);
                f17596 = new C4568(6);
            } else {
                f17595 = new C4574(7);
                f17596 = new C4574(6);
            }
        }
    }
}
