package p357;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.internal.play_billing.ˎˑ;
import com.google.android.material.textfield.TextInputLayout;
import java.util.ArrayList;
import org.lsposed.hiddenapibypass.library.R;
import p219.AbstractC2840;
import p222.C2900;
import ﹶⁱ.ـﹶ;

/* renamed from: ᵔˎ.ˑי, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4061 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final int f15649;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final TimeInterpolator f15650;

    /* renamed from: ʿˏ, reason: contains not printable characters */
    public int f15651;

    /* renamed from: ˈٴ, reason: contains not printable characters */
    public ColorStateList f15652;

    /* renamed from: ˉי, reason: contains not printable characters */
    public int f15653;

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public AnimatorSet f15654;

    /* renamed from: ˋˊ, reason: contains not printable characters */
    public ColorStateList f15655;

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public final float f15656;

    /* renamed from: ˎٴ, reason: contains not printable characters */
    public C2900 f15657;

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public FrameLayout f15658;

    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public int f15659;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final TextInputLayout f15660;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final int f15661;

    /* renamed from: ˑי, reason: contains not printable characters */
    public CharSequence f15662;

    /* renamed from: יʻ, reason: contains not printable characters */
    public C2900 f15663;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final int f15664;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final TimeInterpolator f15665;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final Context f15666;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public Typeface f15667;

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public int f15668;

    /* renamed from: ᵎˏ, reason: contains not printable characters */
    public CharSequence f15669;

    /* renamed from: ᵎـ, reason: contains not printable characters */
    public boolean f15670;

    /* renamed from: ﹳˎ, reason: contains not printable characters */
    public int f15671;

    /* renamed from: ﹳˑ, reason: contains not printable characters */
    public int f15672;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final TimeInterpolator f15673;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public LinearLayout f15674;

    /* renamed from: ﾞʽ, reason: contains not printable characters */
    public boolean f15675;

    /* renamed from: ﾞˊ, reason: contains not printable characters */
    public CharSequence f15676;

    public C4061(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.f15666 = context;
        this.f15660 = textInputLayout;
        this.f15656 = context.getResources().getDimensionPixelSize(R.dimen._2_res_0x7f07009b);
        this.f15664 = ˎˑ.ᵎˏ(context, R.attr._2_res_0x7f04040e, 217);
        this.f15649 = ˎˑ.ᵎˏ(context, R.attr._2_res_0x7f04040a, 167);
        this.f15661 = ˎˑ.ᵎˏ(context, R.attr._2_res_0x7f04040e, 167);
        this.f15673 = ˎˑ.ﹳˎ(context, R.attr._2_res_0x7f040413, AbstractC2840.f11004);
        LinearInterpolator linearInterpolator = AbstractC2840.f11003;
        this.f15650 = ˎˑ.ﹳˎ(context, R.attr._2_res_0x7f040413, linearInterpolator);
        this.f15665 = ˎˑ.ﹳˎ(context, R.attr._2_res_0x7f040416, linearInterpolator);
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final void m9348() {
        if (this.f15674 != null) {
            TextInputLayout textInputLayout = this.f15660;
            if (textInputLayout.getEditText() != null) {
                EditText editText = textInputLayout.getEditText();
                Context context = this.f15666;
                boolean z = ـﹶ.ˈٴ(context);
                LinearLayout linearLayout = this.f15674;
                int paddingStart = editText.getPaddingStart();
                if (z) {
                    paddingStart = context.getResources().getDimensionPixelSize(R.dimen._2_res_0x7f07037f);
                }
                int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen._2_res_0x7f07037e);
                if (z) {
                    dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen._2_res_0x7f070380);
                }
                int paddingEnd = editText.getPaddingEnd();
                if (z) {
                    paddingEnd = context.getResources().getDimensionPixelSize(R.dimen._2_res_0x7f07037f);
                }
                linearLayout.setPaddingRelative(paddingStart, dimensionPixelSize, paddingEnd, 0);
            }
        }
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final TextView m9349(int i) {
        if (i == 1) {
            return this.f15657;
        }
        if (i != 2) {
            return null;
        }
        return this.f15663;
    }

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final boolean m9350(C2900 c2900, CharSequence charSequence) {
        TextInputLayout textInputLayout = this.f15660;
        return textInputLayout.isLaidOut() && textInputLayout.isEnabled() && !(this.f15659 == this.f15668 && c2900 != null && TextUtils.equals(c2900.getText(), charSequence));
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final void m9351() {
        AnimatorSet animatorSet = this.f15654;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void m9352(C2900 c2900, int i) {
        if (this.f15674 == null && this.f15658 == null) {
            Context context = this.f15666;
            LinearLayout linearLayout = new LinearLayout(context);
            this.f15674 = linearLayout;
            linearLayout.setOrientation(0);
            LinearLayout linearLayout2 = this.f15674;
            TextInputLayout textInputLayout = this.f15660;
            textInputLayout.addView(linearLayout2, -1, -2);
            this.f15658 = new FrameLayout(context);
            this.f15674.addView(this.f15658, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (textInputLayout.getEditText() != null) {
                m9348();
            }
        }
        if (i == 0 || i == 1) {
            this.f15658.setVisibility(0);
            this.f15658.addView(c2900);
        } else {
            this.f15674.addView(c2900, new LinearLayout.LayoutParams(-2, -2));
        }
        this.f15674.setVisibility(0);
        this.f15653++;
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final void m9353() {
        this.f15662 = null;
        m9351();
        if (this.f15668 == 1) {
            if (!this.f15675 || TextUtils.isEmpty(this.f15676)) {
                this.f15659 = 0;
            } else {
                this.f15659 = 2;
            }
        }
        m9356(this.f15668, m9350(this.f15657, ""), this.f15659);
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final void m9354(C2900 c2900, int i) {
        FrameLayout frameLayout;
        LinearLayout linearLayout = this.f15674;
        if (linearLayout == null) {
            return;
        }
        if ((i == 0 || i == 1) && (frameLayout = this.f15658) != null) {
            frameLayout.removeView(c2900);
        } else {
            linearLayout.removeView(c2900);
        }
        int i2 = this.f15653 - 1;
        this.f15653 = i2;
        LinearLayout linearLayout2 = this.f15674;
        if (i2 == 0) {
            linearLayout2.setVisibility(8);
        }
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final void m9355(ArrayList arrayList, boolean z, C2900 c2900, int i, int i2, int i3) {
        if (c2900 == null || !z) {
            return;
        }
        if (i == i3 || i == i2) {
            boolean z2 = i3 == i;
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(c2900, (Property<C2900, Float>) View.ALPHA, z2 ? 1.0f : 0.0f);
            int i4 = this.f15661;
            objectAnimatorOfFloat.setDuration(z2 ? this.f15649 : i4);
            objectAnimatorOfFloat.setInterpolator(z2 ? this.f15650 : this.f15665);
            if (i == i3 && i2 != 0) {
                objectAnimatorOfFloat.setStartDelay(i4);
            }
            arrayList.add(objectAnimatorOfFloat);
            if (i3 != i || i2 == 0) {
                return;
            }
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(c2900, (Property<C2900, Float>) View.TRANSLATION_Y, -this.f15656, 0.0f);
            objectAnimatorOfFloat2.setDuration(this.f15664);
            objectAnimatorOfFloat2.setInterpolator(this.f15673);
            objectAnimatorOfFloat2.setStartDelay(i4);
            arrayList.add(objectAnimatorOfFloat2);
        }
    }

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final void m9356(int i, boolean z, int i2) {
        TextView textViewM9349;
        TextView textViewM93492;
        if (i == i2) {
            return;
        }
        if (z) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.f15654 = animatorSet;
            ArrayList arrayList = new ArrayList();
            m9355(arrayList, this.f15675, this.f15663, 2, i, i2);
            m9355(arrayList, this.f15670, this.f15657, 1, i, i2);
            int size = arrayList.size();
            long jMax = 0;
            for (int i3 = 0; i3 < size; i3++) {
                Animator animator = (Animator) arrayList.get(i3);
                jMax = Math.max(jMax, animator.getDuration() + animator.getStartDelay());
            }
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, 0);
            valueAnimatorOfInt.setDuration(jMax);
            arrayList.add(0, valueAnimatorOfInt);
            animatorSet.playTogether(arrayList);
            animatorSet.addListener(new C4058(this, i2, m9349(i), i, m9349(i2)));
            animatorSet.start();
        } else if (i != i2) {
            if (i2 != 0 && (textViewM93492 = m9349(i2)) != null) {
                textViewM93492.setVisibility(0);
                textViewM93492.setAlpha(1.0f);
            }
            if (i != 0 && (textViewM9349 = m9349(i)) != null) {
                textViewM9349.setVisibility(4);
                if (i == 1) {
                    textViewM9349.setText((CharSequence) null);
                }
            }
            this.f15668 = i2;
        }
        TextInputLayout textInputLayout = this.f15660;
        textInputLayout.m2891();
        textInputLayout.m2886(z, false);
        textInputLayout.m2905();
    }
}
