package p186;

import android.content.Context;
import android.content.SharedPreferences;
import ar.tvplayer.tv.LibTvPlayerApplication;
import ar.tvplayer.tv.ProtectedTvPlayerApplication;

/* renamed from: ˎʼ.ᐧⁱ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC2592 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static final Object f10294 = null;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public static volatile boolean f10295 = true;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static volatile boolean f10296 = false;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static volatile SharedPreferences f10297 = null;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public static volatile String f10298 = "";

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public static volatile boolean f10299 = true;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static volatile boolean f10300;

    static {
        Object objM1484i = LibTvPlayerApplication.m1484i(61);
        LibTvPlayerApplication.m1498i(66, objM1484i);
        LibTvPlayerApplication.m1498i(246, objM1484i);
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static final boolean m6734() {
        return LibTvPlayerApplication.m1510i(176);
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static final boolean m6735() {
        return LibTvPlayerApplication.m1510i(301);
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final SharedPreferences m6736(Context context) {
        if (LibTvPlayerApplication.m1484i(79) == null) {
            synchronized (LibTvPlayerApplication.m1484i(445)) {
                if (LibTvPlayerApplication.m1484i(79) == null) {
                    Object objM1484i = LibTvPlayerApplication.m1484i(783);
                    LibTvPlayerApplication.m1498i(227, objM1484i);
                    LibTvPlayerApplication.m1490i(17, objM1484i, LibTvPlayerApplication.m1488i(529, (Object) context));
                    LibTvPlayerApplication.m1490i(17, objM1484i, (Object) ProtectedTvPlayerApplication.s("\u0087"));
                    LibTvPlayerApplication.m1498i(252, LibTvPlayerApplication.m1491i(690, (Object) context, LibTvPlayerApplication.m1488i(319, objM1484i), 0));
                }
            }
        }
        return (SharedPreferences) LibTvPlayerApplication.m1484i(79);
    }
}
