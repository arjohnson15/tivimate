package p305;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import java.util.concurrent.atomic.AtomicBoolean;
import p436.C5068;

/* renamed from: ᐧˆ.ᐧʻ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC3537 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static boolean f13677;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public static final /* synthetic */ int f13678 = 0;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static boolean f13679;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final AtomicBoolean f13680 = new AtomicBoolean();

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static final AtomicBoolean f13681 = new AtomicBoolean();

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static boolean m8428(Context context) {
        if (!f13679) {
            try {
                PackageInfo packageInfoM3955 = C5068.m11225(context).m3955(64, "com.google.android.gms");
                C3532.m8417(context);
                if (packageInfoM3955 == null || C3532.m8418(packageInfoM3955, false) || !C3532.m8418(packageInfoM3955, true)) {
                    f13677 = false;
                } else {
                    f13677 = true;
                }
                f13679 = true;
            } catch (PackageManager.NameNotFoundException e) {
                f13679 = true;
            } catch (Throwable th) {
                f13679 = true;
                throw th;
            }
        }
        return f13677 || !"user".equals(Build.TYPE);
    }
}
