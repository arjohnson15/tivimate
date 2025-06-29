package p357;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.gms.internal.play_billing.ˎˑ;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import org.lsposed.hiddenapibypass.library.R;
import p044.AbstractC1296;
import p044.AbstractC1298;
import p220.AbstractC2845;
import p222.C2900;
import p331.C3762;
import ˈⁱ.ˉⁱ;
import ﹶⁱ.ـﹶ;

/* renamed from: ᵔˎ.ﹳˎ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4068 extends LinearLayout {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final C2900 f15692;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public ColorStateList f15693;

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public ImageView.ScaleType f15694;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public CharSequence f15695;

    /* renamed from: ـˆ, reason: contains not printable characters */
    public View.OnLongClickListener f15696;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final CheckableImageButton f15697;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final TextInputLayout f15698;

    /* renamed from: ᴵʼ, reason: contains not printable characters */
    public boolean f15699;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public PorterDuff.Mode f15700;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public int f15701;

    public C4068(TextInputLayout textInputLayout, C3762 c3762) {
        CharSequence text;
        super(textInputLayout.getContext());
        this.f15698 = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(R.layout._2_res_0x7f0e0035, (ViewGroup) this, false);
        this.f15697 = checkableImageButton;
        if (Build.VERSION.SDK_INT <= 22) {
            Context context = checkableImageButton.getContext();
            int iApplyDimension = (int) TypedValue.applyDimension(1, 4, checkableImageButton.getContext().getResources().getDisplayMetrics());
            int[] iArr = AbstractC1298.f5320;
            checkableImageButton.setBackground(AbstractC1296.m4594(context, iApplyDimension));
        }
        C2900 c2900 = new C2900(getContext(), null);
        this.f15692 = c2900;
        if (ـﹶ.ˈٴ(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginEnd(0);
        }
        View.OnLongClickListener onLongClickListener = this.f15696;
        checkableImageButton.setOnClickListener(null);
        ˎˑ.ﾞˊ(checkableImageButton, onLongClickListener);
        this.f15696 = null;
        checkableImageButton.setOnLongClickListener(null);
        ˎˑ.ﾞˊ(checkableImageButton, (View.OnLongClickListener) null);
        TypedArray typedArray = (TypedArray) c3762.f14531;
        if (typedArray.hasValue(69)) {
            this.f15693 = ـﹶ.ﾞʽ(getContext(), c3762, 69);
        }
        if (typedArray.hasValue(70)) {
            this.f15700 = AbstractC2845.m7132(typedArray.getInt(70, -1), null);
        }
        if (typedArray.hasValue(66)) {
            m9363(c3762.m8784(66));
            if (typedArray.hasValue(65) && checkableImageButton.getContentDescription() != (text = typedArray.getText(65))) {
                checkableImageButton.setContentDescription(text);
            }
            checkableImageButton.setCheckable(typedArray.getBoolean(64, true));
        }
        int dimensionPixelSize = typedArray.getDimensionPixelSize(67, getResources().getDimensionPixelSize(R.dimen._2_res_0x7f070405));
        if (dimensionPixelSize < 0) {
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        }
        if (dimensionPixelSize != this.f15701) {
            this.f15701 = dimensionPixelSize;
            checkableImageButton.setMinimumWidth(dimensionPixelSize);
            checkableImageButton.setMinimumHeight(dimensionPixelSize);
        }
        if (typedArray.hasValue(68)) {
            ImageView.ScaleType scaleType = ˎˑ.ʿʼ(typedArray.getInt(68, -1));
            this.f15694 = scaleType;
            checkableImageButton.setScaleType(scaleType);
        }
        c2900.setVisibility(8);
        c2900.setId(R.id._2_res_0x7f0b0392);
        c2900.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        c2900.setAccessibilityLiveRegion(1);
        ˉⁱ.ﹳˑ(c2900, typedArray.getResourceId(60, 0));
        if (typedArray.hasValue(61)) {
            c2900.setTextColor(c3762.m8782(61));
        }
        CharSequence text2 = typedArray.getText(59);
        this.f15695 = TextUtils.isEmpty(text2) ? null : text2;
        c2900.setText(text2);
        m9364();
        addView(checkableImageButton);
        addView(c2900);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        m9367();
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final void m9363(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.f15697;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            ColorStateList colorStateList = this.f15693;
            PorterDuff.Mode mode = this.f15700;
            TextInputLayout textInputLayout = this.f15698;
            ˎˑ.ـﹶ(textInputLayout, checkableImageButton, colorStateList, mode);
            m9365(true);
            ˎˑ.ˎٴ(textInputLayout, checkableImageButton, this.f15693);
            return;
        }
        m9365(false);
        View.OnLongClickListener onLongClickListener = this.f15696;
        checkableImageButton.setOnClickListener(null);
        ˎˑ.ﾞˊ(checkableImageButton, onLongClickListener);
        this.f15696 = null;
        checkableImageButton.setOnLongClickListener(null);
        ˎˑ.ﾞˊ(checkableImageButton, (View.OnLongClickListener) null);
        if (checkableImageButton.getContentDescription() != null) {
            checkableImageButton.setContentDescription(null);
        }
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final void m9364() {
        int i = (this.f15695 == null || this.f15699) ? 8 : 0;
        setVisibility((this.f15697.getVisibility() == 0 || i == 0) ? 0 : 8);
        this.f15692.setVisibility(i);
        this.f15698.m2901();
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final void m9365(boolean z) {
        CheckableImageButton checkableImageButton = this.f15697;
        if ((checkableImageButton.getVisibility() == 0) != z) {
            checkableImageButton.setVisibility(z ? 0 : 8);
            m9367();
            m9364();
        }
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final int m9366() {
        int marginEnd;
        CheckableImageButton checkableImageButton = this.f15697;
        if (checkableImageButton.getVisibility() == 0) {
            marginEnd = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginEnd() + checkableImageButton.getMeasuredWidth();
        } else {
            marginEnd = 0;
        }
        return this.f15692.getPaddingStart() + getPaddingStart() + marginEnd;
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final void m9367() {
        EditText editText = this.f15698.f3443;
        if (editText == null) {
            return;
        }
        this.f15692.setPaddingRelative(this.f15697.getVisibility() == 0 ? 0 : editText.getPaddingStart(), editText.getCompoundPaddingTop(), getContext().getResources().getDimensionPixelSize(R.dimen._2_res_0x7f070381), editText.getCompoundPaddingBottom());
    }
}
