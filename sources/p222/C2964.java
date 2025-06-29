package p222;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import org.lsposed.hiddenapibypass.library.R;
import p375.C4305;

/* renamed from: ˏᴵ.ﹳˎ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2964 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static final PorterDuff.Mode f11435 = PorterDuff.Mode.SRC_IN;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static C2964 f11436;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public C2886 f11437;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public static void m7337(Drawable drawable, C2860 c2860, int[] iArr) {
        PorterDuff.Mode mode = C2886.f11186;
        int[] state = drawable.getState();
        if (drawable.mutate() == drawable) {
            if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
                drawable.setState(new int[0]);
                drawable.setState(state);
            }
            boolean z = c2860.f11118;
            if (z || c2860.f11120) {
                PorterDuffColorFilter porterDuffColorFilterM7212 = null;
                ColorStateList colorStateList = z ? (ColorStateList) c2860.f11119 : null;
                PorterDuff.Mode mode2 = c2860.f11120 ? (PorterDuff.Mode) c2860.f11121 : C2886.f11186;
                if (colorStateList != null && mode2 != null) {
                    porterDuffColorFilterM7212 = C2886.m7212(colorStateList.getColorForState(iArr, 0), mode2);
                }
                drawable.setColorFilter(porterDuffColorFilterM7212);
            } else {
                drawable.clearColorFilter();
            }
            if (Build.VERSION.SDK_INT <= 23) {
                drawable.invalidateSelf();
            }
        }
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static synchronized PorterDuffColorFilter m7338(int i, PorterDuff.Mode mode) {
        return C2886.m7212(i, mode);
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static synchronized C2964 m7339() {
        try {
            if (f11436 == null) {
                m7340();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f11436;
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static synchronized void m7340() {
        if (f11436 == null) {
            C2964 c2964 = new C2964();
            f11436 = c2964;
            c2964.f11437 = C2886.m7213();
            C2886 c2886 = f11436.f11437;
            C4305 c4305 = new C4305();
            c4305.f16748 = new int[]{R.drawable._2_res_0x7f08007d, R.drawable._2_res_0x7f08007b, R.drawable._2_res_0x7f080031};
            c4305.f16745 = new int[]{R.drawable._2_res_0x7f080049, R.drawable._2_res_0x7f08006c, R.drawable._2_res_0x7f080050, R.drawable._2_res_0x7f08004b, R.drawable._2_res_0x7f08004c, R.drawable._2_res_0x7f08004f, R.drawable._2_res_0x7f08004e};
            c4305.f16747 = new int[]{R.drawable._2_res_0x7f08007a, R.drawable._2_res_0x7f08007c, R.drawable._2_res_0x7f080042, R.drawable._2_res_0x7f080076, R.drawable._2_res_0x7f080077, R.drawable._2_res_0x7f080078, R.drawable._2_res_0x7f080079};
            c4305.f16750 = new int[]{R.drawable._2_res_0x7f080062, R.drawable._2_res_0x7f080040, R.drawable._2_res_0x7f080061};
            c4305.f16746 = new int[]{R.drawable._2_res_0x7f080074, R.drawable._2_res_0x7f08007e};
            c4305.f16749 = new int[]{R.drawable._2_res_0x7f080034, R.drawable._2_res_0x7f08003a, R.drawable._2_res_0x7f080035, R.drawable._2_res_0x7f08003b};
            c2886.m7217(c4305);
        }
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final synchronized Drawable m7341(Context context, int i) {
        return this.f11437.m7221(context, i);
    }
}
