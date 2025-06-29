package p139;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.View;
import org.lsposed.hiddenapibypass.library.R;
import ᵔᵔ.ٴˎ;

/* renamed from: ˉˋ.ﹶˆ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2158 extends AbstractC2117 {
    public C2158(int i) {
        this.f8349 = i;
    }

    /* renamed from: ʿˊ, reason: contains not printable characters */
    public static float m6074(C2123 c2123, float f) {
        Float f2;
        return (c2123 == null || (f2 = (Float) c2123.f8363.get("android:fade:transitionAlpha")) == null) ? f : f2.floatValue();
    }

    @Override // p139.AbstractC2160
    /* renamed from: ˈٴ */
    public final boolean mo5998() {
        return true;
    }

    @Override // p139.AbstractC2117, p139.AbstractC2160
    /* renamed from: ˉⁱ */
    public final void mo5979(C2123 c2123) {
        AbstractC2117.m5977(c2123);
        View view = c2123.f8361;
        Float fValueOf = (Float) view.getTag(R.id._2_res_0x7f0b03ae);
        if (fValueOf == null) {
            fValueOf = view.getVisibility() == 0 ? Float.valueOf(AbstractC2157.f8452.ᴵʿ(view)) : Float.valueOf(0.0f);
        }
        c2123.f8363.put("android:fade:transitionAlpha", fValueOf);
    }

    @Override // p139.AbstractC2117
    /* renamed from: ˊᵔ */
    public final Animator mo5980(View view, C2123 c2123) {
        AbstractC2157.f8452.getClass();
        return m6075(view, m6074(c2123, 0.0f), 1.0f);
    }

    @Override // p139.AbstractC2117
    /* renamed from: ˋﾞ */
    public final Animator mo5981(View view, C2123 c2123, C2123 c21232) {
        ٴˎ r0 = AbstractC2157.f8452;
        r0.getClass();
        ObjectAnimator objectAnimatorM6075 = m6075(view, m6074(c2123, 1.0f), 0.0f);
        if (objectAnimatorM6075 == null) {
            r0.ﾞˊ(view, m6074(c21232, 1.0f));
        }
        return objectAnimatorM6075;
    }

    /* renamed from: ᵎʽ, reason: contains not printable characters */
    public final ObjectAnimator m6075(View view, float f, float f2) {
        if (f == f2) {
            return null;
        }
        AbstractC2157.f8452.ﾞˊ(view, f);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, AbstractC2157.f8451, f2);
        C2135 c2135 = new C2135(view);
        objectAnimatorOfFloat.addListener(c2135);
        m6082().m6085(c2135);
        return objectAnimatorOfFloat;
    }
}
