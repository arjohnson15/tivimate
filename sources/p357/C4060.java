package p357;

import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.EditText;
import androidx.lifecycle.RunnableC0246;
import com.google.android.gms.internal.play_billing.ˎˑ;
import com.google.android.material.datepicker.ViewOnClickListenerC0689;
import com.google.android.material.internal.CheckableImageButton;
import org.lsposed.hiddenapibypass.library.R;
import p219.AbstractC2840;
import ʽᵔ.ﹳˎ;

/* renamed from: ᵔˎ.ˑʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4060 extends AbstractC4065 {

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final int f15640;

    /* renamed from: ˉי, reason: contains not printable characters */
    public final ViewOnClickListenerC0689 f15641;

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public AnimatorSet f15642;

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public ValueAnimator f15643;

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public final ﹳˎ f15644;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final TimeInterpolator f15645;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final int f15646;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final TimeInterpolator f15647;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public EditText f15648;

    public C4060(C4055 c4055) {
        super(c4055);
        this.f15641 = new ViewOnClickListenerC0689(12, this);
        this.f15644 = new ﹳˎ(13, this);
        this.f15640 = ˎˑ.ᵎˏ(c4055.getContext(), R.attr._2_res_0x7f04040d, 100);
        this.f15646 = ˎˑ.ᵎˏ(c4055.getContext(), R.attr._2_res_0x7f04040d, 150);
        this.f15647 = ˎˑ.ﹳˎ(c4055.getContext(), R.attr._2_res_0x7f040416, AbstractC2840.f11003);
        this.f15645 = ˎˑ.ﹳˎ(c4055.getContext(), R.attr._2_res_0x7f040414, AbstractC2840.f11004);
    }

    @Override // p357.AbstractC4065
    /* renamed from: ʿʼ */
    public final View.OnFocusChangeListener mo9310() {
        return this.f15644;
    }

    /* renamed from: ʿˏ, reason: contains not printable characters */
    public final boolean m9344() {
        EditText editText = this.f15648;
        return editText != null && (editText.hasFocus() || this.f15685.hasFocus()) && this.f15648.getText().length() > 0;
    }

    @Override // p357.AbstractC4065
    /* renamed from: ˋⁱ */
    public final void mo9314(EditText editText) {
        this.f15648 = editText;
        this.f15684.setEndIconVisible(m9344());
    }

    @Override // p357.AbstractC4065
    /* renamed from: ˎٴ */
    public final void mo9315() {
        final int i = 1;
        final int i2 = 0;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        valueAnimatorOfFloat.setInterpolator(this.f15645);
        valueAnimatorOfFloat.setDuration(this.f15646);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: ᵔˎ.ـﹶ

            /* renamed from: ʽᐧ, reason: contains not printable characters */
            public final /* synthetic */ C4060 f15677;

            {
                this.f15677 = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i) {
                    case 0:
                        C4060 c4060 = this.f15677;
                        c4060.getClass();
                        c4060.f15685.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        C4060 c40602 = this.f15677;
                        c40602.getClass();
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = c40602.f15685;
                        checkableImageButton.setScaleX(fFloatValue);
                        checkableImageButton.setScaleY(fFloatValue);
                        break;
                }
            }
        });
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.f15647;
        valueAnimatorOfFloat2.setInterpolator(timeInterpolator);
        int i3 = this.f15640;
        valueAnimatorOfFloat2.setDuration(i3);
        valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: ᵔˎ.ـﹶ

            /* renamed from: ʽᐧ, reason: contains not printable characters */
            public final /* synthetic */ C4060 f15677;

            {
                this.f15677 = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i2) {
                    case 0:
                        C4060 c4060 = this.f15677;
                        c4060.getClass();
                        c4060.f15685.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        C4060 c40602 = this.f15677;
                        c40602.getClass();
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = c40602.f15685;
                        checkableImageButton.setScaleX(fFloatValue);
                        checkableImageButton.setScaleY(fFloatValue);
                        break;
                }
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        this.f15642 = animatorSet;
        animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2);
        this.f15642.addListener(new C4049(this, i2));
        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat3.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat3.setDuration(i3);
        valueAnimatorOfFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: ᵔˎ.ـﹶ

            /* renamed from: ʽᐧ, reason: contains not printable characters */
            public final /* synthetic */ C4060 f15677;

            {
                this.f15677 = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i2) {
                    case 0:
                        C4060 c4060 = this.f15677;
                        c4060.getClass();
                        c4060.f15685.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        C4060 c40602 = this.f15677;
                        c40602.getClass();
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = c40602.f15685;
                        checkableImageButton.setScaleX(fFloatValue);
                        checkableImageButton.setScaleY(fFloatValue);
                        break;
                }
            }
        });
        this.f15643 = valueAnimatorOfFloat3;
        valueAnimatorOfFloat3.addListener(new C4049(this, i));
    }

    @Override // p357.AbstractC4065
    /* renamed from: ˑʽ */
    public final int mo9318() {
        return R.string._2_res_0x7f130039;
    }

    @Override // p357.AbstractC4065
    /* renamed from: ˑי, reason: contains not printable characters */
    public final void mo9345(boolean z) {
        if (this.f15682.f15610 == null) {
            return;
        }
        m9347(z);
    }

    @Override // p357.AbstractC4065
    /* renamed from: ـﹶ */
    public final void mo9319() {
        if (this.f15682.f15610 != null) {
            return;
        }
        m9347(m9344());
    }

    @Override // p357.AbstractC4065
    /* renamed from: ٴˎ */
    public final View.OnClickListener mo9320() {
        return this.f15641;
    }

    @Override // p357.AbstractC4065
    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final View.OnFocusChangeListener mo9346() {
        return this.f15644;
    }

    @Override // p357.AbstractC4065
    /* renamed from: ᵎˏ */
    public final void mo9322() {
        EditText editText = this.f15648;
        if (editText != null) {
            editText.post(new RunnableC0246(22, this));
        }
    }

    /* renamed from: ﹳˎ, reason: contains not printable characters */
    public final void m9347(boolean z) {
        boolean z2 = this.f15682.m9339() == z;
        if (z && !this.f15642.isRunning()) {
            this.f15643.cancel();
            this.f15642.start();
            if (z2) {
                this.f15642.end();
                return;
            }
            return;
        }
        if (z) {
            return;
        }
        this.f15642.cancel();
        this.f15643.start();
        if (z2) {
            this.f15643.end();
        }
    }

    @Override // p357.AbstractC4065
    /* renamed from: ﹳﹳ */
    public final int mo9324() {
        return R.drawable._2_res_0x7f0801d4;
    }
}
