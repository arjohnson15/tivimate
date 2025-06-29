package p368;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import ᵢ.ʿʼ;

/* renamed from: ᵢʻ.ﹳﹳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4181 {

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public static final int f16126;

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final ActivityManager f16127;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final ʿʼ f16128;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final Context f16129;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final float f16130;

    static {
        f16126 = Build.VERSION.SDK_INT < 26 ? 4 : 1;
    }

    public C4181(Context context) {
        this.f16130 = f16126;
        this.f16129 = context;
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        this.f16127 = activityManager;
        this.f16128 = new ʿʼ(2, context.getResources().getDisplayMetrics());
        if (Build.VERSION.SDK_INT < 26 || !activityManager.isLowRamDevice()) {
            return;
        }
        this.f16130 = 0.0f;
    }
}
