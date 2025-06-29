package p357;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import androidx.leanback.widget.C0160;
import androidx.leanback.widget.C0168;
import androidx.lifecycle.RunnableC0246;
import com.bumptech.glide.ﹳﹳ;
import com.google.android.gms.internal.play_billing.ˎˑ;
import com.google.android.material.datepicker.ViewOnClickListenerC0689;
import com.google.android.material.textfield.TextInputLayout;
import org.lsposed.hiddenapibypass.library.R;
import p204.C2784;
import p219.AbstractC2840;
import ʽᵔ.ﹳˎ;

/* renamed from: ᵔˎ.ˉי, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4052 extends AbstractC4065 {

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final int f15587;

    /* renamed from: ˉי, reason: contains not printable characters */
    public final ﹳˎ f15588;

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public boolean f15589;

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public boolean f15590;

    /* renamed from: ˎٴ, reason: contains not printable characters */
    public ValueAnimator f15591;

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public final AccessibilityManagerTouchExplorationStateChangeListenerC4070 f15592;

    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public long f15593;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public AutoCompleteTextView f15594;

    /* renamed from: ˑי, reason: contains not printable characters */
    public AccessibilityManager f15595;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final int f15596;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final TimeInterpolator f15597;

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public boolean f15598;

    /* renamed from: ᵎـ, reason: contains not printable characters */
    public ValueAnimator f15599;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final ViewOnClickListenerC0689 f15600;

    /* JADX WARN: Type inference failed for: r0v2, types: [ᵔˎ.ﹶˆ] */
    public C4052(C4055 c4055) {
        super(c4055);
        this.f15600 = new ViewOnClickListenerC0689(13, this);
        this.f15588 = new ﹳˎ(14, this);
        this.f15592 = new AccessibilityManager.TouchExplorationStateChangeListener() { // from class: ᵔˎ.ﹶˆ
            @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
            public final void onTouchExplorationStateChanged(boolean z) {
                C4052 c4052 = this.f15703;
                AutoCompleteTextView autoCompleteTextView = c4052.f15594;
                if (autoCompleteTextView == null || ﹳﹳ.ˋˊ(autoCompleteTextView)) {
                    return;
                }
                c4052.f15685.setImportantForAccessibility(z ? 2 : 1);
            }
        };
        this.f15593 = Long.MAX_VALUE;
        this.f15596 = ˎˑ.ᵎˏ(c4055.getContext(), R.attr._2_res_0x7f04040d, 67);
        this.f15587 = ˎˑ.ᵎˏ(c4055.getContext(), R.attr._2_res_0x7f04040d, 50);
        this.f15597 = ˎˑ.ﹳˎ(c4055.getContext(), R.attr._2_res_0x7f040416, AbstractC2840.f11003);
    }

    @Override // p357.AbstractC4065
    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final View.OnFocusChangeListener mo9310() {
        return this.f15588;
    }

    /* renamed from: ʿˏ, reason: contains not printable characters */
    public final void m9311() {
        if (this.f15594 == null) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - this.f15593;
        if (jCurrentTimeMillis < 0 || jCurrentTimeMillis > 300) {
            this.f15590 = false;
        }
        if (this.f15590) {
            this.f15590 = false;
            return;
        }
        m9323(!this.f15598);
        if (!this.f15598) {
            this.f15594.dismissDropDown();
        } else {
            this.f15594.requestFocus();
            this.f15594.showDropDown();
        }
    }

    @Override // p357.AbstractC4065
    /* renamed from: ˉי, reason: contains not printable characters */
    public final boolean mo9312() {
        return this.f15589;
    }

    @Override // p357.AbstractC4065
    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public final boolean mo9313() {
        return this.f15598;
    }

    @Override // p357.AbstractC4065
    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public final void mo9314(EditText editText) {
        if (!(editText instanceof AutoCompleteTextView)) {
            throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
        }
        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
        this.f15594 = autoCompleteTextView;
        autoCompleteTextView.setOnTouchListener(new View.OnTouchListener() { // from class: ᵔˎ.ᐧʻ
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                C4052 c4052 = this.f15681;
                c4052.getClass();
                if (motionEvent.getAction() == 1) {
                    long jCurrentTimeMillis = System.currentTimeMillis() - c4052.f15593;
                    if (jCurrentTimeMillis < 0 || jCurrentTimeMillis > 300) {
                        c4052.f15590 = false;
                    }
                    c4052.m9311();
                    c4052.f15590 = true;
                    c4052.f15593 = System.currentTimeMillis();
                }
                return false;
            }
        });
        this.f15594.setOnDismissListener(new AutoCompleteTextView.OnDismissListener() { // from class: ᵔˎ.ˏᵢ
            @Override // android.widget.AutoCompleteTextView.OnDismissListener
            public final void onDismiss() {
                C4052 c4052 = this.f15639;
                c4052.f15590 = true;
                c4052.f15593 = System.currentTimeMillis();
                c4052.m9323(false);
            }
        });
        this.f15594.setThreshold(0);
        TextInputLayout textInputLayout = this.f15684;
        textInputLayout.setErrorIconDrawable((Drawable) null);
        if (!ﹳﹳ.ˋˊ(editText) && this.f15595.isTouchExplorationEnabled()) {
            this.f15685.setImportantForAccessibility(2);
        }
        textInputLayout.setEndIconVisible(true);
    }

    @Override // p357.AbstractC4065
    /* renamed from: ˎٴ, reason: contains not printable characters */
    public final void mo9315() {
        int i = 2;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.f15597;
        valueAnimatorOfFloat.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat.setDuration(this.f15596);
        valueAnimatorOfFloat.addUpdateListener(new C0160(i, this));
        this.f15591 = valueAnimatorOfFloat;
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat2.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat2.setDuration(this.f15587);
        valueAnimatorOfFloat2.addUpdateListener(new C0160(i, this));
        this.f15599 = valueAnimatorOfFloat2;
        valueAnimatorOfFloat2.addListener(new C0168(6, this));
        this.f15595 = (AccessibilityManager) this.f15683.getSystemService("accessibility");
    }

    @Override // p357.AbstractC4065
    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public final void mo9316(AccessibilityEvent accessibilityEvent) {
        if (!this.f15595.isEnabled() || ﹳﹳ.ˋˊ(this.f15594)) {
            return;
        }
        boolean z = (accessibilityEvent.getEventType() == 32768 || accessibilityEvent.getEventType() == 8) && this.f15598 && !this.f15594.isPopupShowing();
        if (accessibilityEvent.getEventType() == 1 || z) {
            m9311();
            this.f15590 = true;
            this.f15593 = System.currentTimeMillis();
        }
    }

    @Override // p357.AbstractC4065
    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final AccessibilityManager.TouchExplorationStateChangeListener mo9317() {
        return this.f15592;
    }

    @Override // p357.AbstractC4065
    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final int mo9318() {
        return R.string._2_res_0x7f1300c1;
    }

    @Override // p357.AbstractC4065
    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void mo9319() {
        if (this.f15595.isTouchExplorationEnabled() && ﹳﹳ.ˋˊ(this.f15594) && !this.f15685.hasFocus()) {
            this.f15594.dismissDropDown();
        }
        this.f15594.post(new RunnableC0246(23, this));
    }

    @Override // p357.AbstractC4065
    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final View.OnClickListener mo9320() {
        return this.f15600;
    }

    @Override // p357.AbstractC4065
    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public final void mo9321(C2784 c2784) {
        if (!ﹳﹳ.ˋˊ(this.f15594)) {
            c2784.m7063(Spinner.class.getName());
        }
        if (Build.VERSION.SDK_INT >= 26 ? c2784.f10848.isShowingHintText() : c2784.m7052(4)) {
            c2784.m7054(null);
        }
    }

    @Override // p357.AbstractC4065
    /* renamed from: ᵎˏ, reason: contains not printable characters */
    public final void mo9322() {
        AutoCompleteTextView autoCompleteTextView = this.f15594;
        if (autoCompleteTextView != null) {
            autoCompleteTextView.setOnTouchListener(null);
            this.f15594.setOnDismissListener(null);
        }
    }

    /* renamed from: ﹳˎ, reason: contains not printable characters */
    public final void m9323(boolean z) {
        if (this.f15598 != z) {
            this.f15598 = z;
            this.f15591.cancel();
            this.f15599.start();
        }
    }

    @Override // p357.AbstractC4065
    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final int mo9324() {
        return R.drawable._2_res_0x7f0801d1;
    }

    @Override // p357.AbstractC4065
    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final boolean mo9325(int i) {
        return i != 0;
    }
}
