package p404;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import java.io.File;
import java.io.IOException;
import p266.C3264;
import p410.C4680;

/* renamed from: ﹳʻ.ˏᵢ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC4632 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final C4680 f17746 = new C4680();

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static final Object f17744 = new Object();

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static C3264 f17745 = null;

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static C3264 m10537() {
        C3264 c3264 = new C3264(10);
        f17745 = c3264;
        f17746.m10591(c3264);
        return f17745;
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static void m10538(Context context, boolean z) {
        C4636 c4636M10543;
        int i;
        if (z || f17745 == null) {
            synchronized (f17744) {
                if (!z) {
                    try {
                        if (f17745 != null) {
                            return;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                int i2 = Build.VERSION.SDK_INT;
                if (i2 >= 28 && i2 != 30) {
                    File file = new File(new File("/data/misc/profiles/ref/", context.getPackageName()), "primary.prof");
                    long length = file.length();
                    int i3 = 0;
                    boolean z2 = file.exists() && length > 0;
                    File file2 = new File(new File("/data/misc/profiles/cur/0/", context.getPackageName()), "primary.prof");
                    long length2 = file2.length();
                    boolean z3 = file2.exists() && length2 > 0;
                    try {
                        long jM10539 = m10539(context);
                        File file3 = new File(context.getFilesDir(), "profileInstalled");
                        if (file3.exists()) {
                            try {
                                c4636M10543 = C4636.m10543(file3);
                            } catch (IOException unused) {
                                m10537();
                                return;
                            }
                        } else {
                            c4636M10543 = null;
                        }
                        if (c4636M10543 != null && c4636M10543.f17749 == jM10539 && (i = c4636M10543.f17748) != 2) {
                            i3 = i;
                        } else if (z2) {
                            i3 = 1;
                        } else if (z3) {
                            i3 = 2;
                        }
                        if (z && z3 && i3 != 1) {
                            i3 = 2;
                        }
                        C4636 c4636 = new C4636(1, (c4636M10543 == null || c4636M10543.f17748 != 2 || i3 != 1 || length >= c4636M10543.f17751) ? i3 : 3, jM10539, length2);
                        if (c4636M10543 == null || !c4636M10543.equals(c4636)) {
                            try {
                                c4636.m10544(file3);
                            } catch (IOException unused2) {
                            }
                        }
                        m10537();
                        return;
                    } catch (PackageManager.NameNotFoundException unused3) {
                        m10537();
                        return;
                    }
                }
                m10537();
            }
        }
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static long m10539(Context context) {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        return Build.VERSION.SDK_INT >= 33 ? AbstractC4635.m10542(packageManager, context).lastUpdateTime : packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }
}
