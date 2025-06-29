package p357;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.gms.internal.play_billing.ˎˑ;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Iterator;
import java.util.LinkedHashSet;
import org.lsposed.hiddenapibypass.library.R;
import p044.AbstractC1296;
import p044.AbstractC1298;
import p220.AbstractC2845;
import p222.C2900;
import p230.C3071;
import p291.ViewOnAttachStateChangeListenerC3460;
import p331.C3762;
import ˈⁱ.ˉⁱ;
import ـˈ.ˉᵎ;
import ᴵﹳ.ٴˎ;
import ﹶⁱ.ـﹶ;

/* renamed from: ᵔˎ.ˋⁱ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4055 extends LinearLayout {

    /* renamed from: ʻʿ, reason: contains not printable characters */
    public boolean f15603;

    /* renamed from: ʾʼ, reason: contains not printable characters */
    public PorterDuff.Mode f15604;

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final FrameLayout f15605;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public PorterDuff.Mode f15606;

    /* renamed from: ˊᵔ, reason: contains not printable characters */
    public final C4057 f15607;

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public final C3071 f15608;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final CheckableImageButton f15609;

    /* renamed from: ˎᵔ, reason: contains not printable characters */
    public CharSequence f15610;

    /* renamed from: ˑⁱ, reason: contains not printable characters */
    public ImageView.ScaleType f15611;

    /* renamed from: ˑﾞ, reason: contains not printable characters */
    public int f15612;

    /* renamed from: ـˆ, reason: contains not printable characters */
    public int f15613;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public ColorStateList f15614;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final TextInputLayout f15615;

    /* renamed from: ᴵʼ, reason: contains not printable characters */
    public final LinkedHashSet f15616;

    /* renamed from: ᵔ, reason: contains not printable characters */
    public final AccessibilityManager f15617;

    /* renamed from: ᵔٴ, reason: contains not printable characters */
    public EditText f15618;

    /* renamed from: ᵔﹳ, reason: contains not printable characters */
    public final C2900 f15619;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public View.OnLongClickListener f15620;

    /* renamed from: ᵢٴ, reason: contains not printable characters */
    public View.OnLongClickListener f15621;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public final CheckableImageButton f15622;

    /* renamed from: ﾞˎ, reason: contains not printable characters */
    public AccessibilityManager.TouchExplorationStateChangeListener f15623;

    /* renamed from: ﾞᐧ, reason: contains not printable characters */
    public ColorStateList f15624;

    public C4055(TextInputLayout textInputLayout, C3762 c3762) {
        CharSequence text;
        super(textInputLayout.getContext());
        this.f15613 = 0;
        this.f15616 = new LinkedHashSet();
        this.f15607 = new C4057(this);
        C4053 c4053 = new C4053(this);
        this.f15617 = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.f15615 = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f15605 = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        CheckableImageButton checkableImageButtonM9335 = m9335(this, layoutInflaterFrom, R.id._2_res_0x7f0b038c);
        this.f15609 = checkableImageButtonM9335;
        CheckableImageButton checkableImageButtonM93352 = m9335(frameLayout, layoutInflaterFrom, R.id._2_res_0x7f0b038b);
        this.f15622 = checkableImageButtonM93352;
        C3071 c3071 = new C3071();
        c3071.f11849 = new SparseArray();
        c3071.f11850 = this;
        TypedArray typedArray = (TypedArray) c3762.f14531;
        c3071.f11851 = typedArray.getResourceId(28, 0);
        c3071.f11848 = typedArray.getResourceId(52, 0);
        this.f15608 = c3071;
        C2900 c2900 = new C2900(getContext(), null);
        this.f15619 = c2900;
        TypedArray typedArray2 = (TypedArray) c3762.f14531;
        if (typedArray2.hasValue(38)) {
            this.f15614 = ـﹶ.ﾞʽ(getContext(), c3762, 38);
        }
        if (typedArray2.hasValue(39)) {
            this.f15606 = AbstractC2845.m7132(typedArray2.getInt(39, -1), null);
        }
        if (typedArray2.hasValue(37)) {
            m9340(c3762.m8784(37));
        }
        checkableImageButtonM9335.setContentDescription(getResources().getText(R.string._2_res_0x7f13008b));
        checkableImageButtonM9335.setImportantForAccessibility(2);
        checkableImageButtonM9335.setClickable(false);
        checkableImageButtonM9335.setPressable(false);
        checkableImageButtonM9335.setFocusable(false);
        if (!typedArray2.hasValue(53)) {
            if (typedArray2.hasValue(32)) {
                this.f15624 = ـﹶ.ﾞʽ(getContext(), c3762, 32);
            }
            if (typedArray2.hasValue(33)) {
                this.f15604 = AbstractC2845.m7132(typedArray2.getInt(33, -1), null);
            }
        }
        if (typedArray2.hasValue(30)) {
            m9337(typedArray2.getInt(30, 0));
            if (typedArray2.hasValue(27) && checkableImageButtonM93352.getContentDescription() != (text = typedArray2.getText(27))) {
                checkableImageButtonM93352.setContentDescription(text);
            }
            checkableImageButtonM93352.setCheckable(typedArray2.getBoolean(26, true));
        } else if (typedArray2.hasValue(53)) {
            if (typedArray2.hasValue(54)) {
                this.f15624 = ـﹶ.ﾞʽ(getContext(), c3762, 54);
            }
            if (typedArray2.hasValue(55)) {
                this.f15604 = AbstractC2845.m7132(typedArray2.getInt(55, -1), null);
            }
            m9337(typedArray2.getBoolean(53, false) ? 1 : 0);
            CharSequence text2 = typedArray2.getText(51);
            if (checkableImageButtonM93352.getContentDescription() != text2) {
                checkableImageButtonM93352.setContentDescription(text2);
            }
        }
        int dimensionPixelSize = typedArray2.getDimensionPixelSize(29, getResources().getDimensionPixelSize(R.dimen._2_res_0x7f070405));
        if (dimensionPixelSize < 0) {
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (dimensionPixelSize != this.f15612) {
            this.f15612 = dimensionPixelSize;
            checkableImageButtonM93352.setMinimumWidth(dimensionPixelSize);
            checkableImageButtonM93352.setMinimumHeight(dimensionPixelSize);
            checkableImageButtonM9335.setMinimumWidth(dimensionPixelSize);
            checkableImageButtonM9335.setMinimumHeight(dimensionPixelSize);
        }
        if (typedArray2.hasValue(31)) {
            ImageView.ScaleType scaleType = ˎˑ.ʿʼ(typedArray2.getInt(31, -1));
            this.f15611 = scaleType;
            checkableImageButtonM93352.setScaleType(scaleType);
            checkableImageButtonM9335.setScaleType(scaleType);
        }
        c2900.setVisibility(8);
        c2900.setId(R.id._2_res_0x7f0b0393);
        c2900.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
        c2900.setAccessibilityLiveRegion(1);
        ˉⁱ.ﹳˑ(c2900, typedArray2.getResourceId(72, 0));
        if (typedArray2.hasValue(73)) {
            c2900.setTextColor(c3762.m8782(73));
        }
        CharSequence text3 = typedArray2.getText(71);
        this.f15610 = TextUtils.isEmpty(text3) ? null : text3;
        c2900.setText(text3);
        m9338();
        frameLayout.addView(checkableImageButtonM93352);
        addView(c2900);
        addView(frameLayout);
        addView(checkableImageButtonM9335);
        textInputLayout.f3401.add(c4053);
        if (textInputLayout.f3443 != null) {
            c4053.m9326(textInputLayout);
        }
        addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC3460(3, this));
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final AbstractC4065 m9327() {
        AbstractC4065 c4069;
        int i = this.f15613;
        C3071 c3071 = this.f15608;
        SparseArray sparseArray = (SparseArray) c3071.f11849;
        AbstractC4065 c4066 = (AbstractC4065) sparseArray.get(i);
        if (c4066 == null) {
            C4055 c4055 = (C4055) c3071.f11850;
            if (i == -1) {
                c4069 = new C4069(c4055, 0);
            } else if (i == 0) {
                c4069 = new C4069(c4055, 1);
            } else if (i == 1) {
                c4066 = new C4066(c4055, c3071.f11848);
                sparseArray.append(i, c4066);
            } else if (i == 2) {
                c4069 = new C4060(c4055);
            } else {
                if (i != 3) {
                    throw new IllegalArgumentException(ˉᵎ.ˉⁱ("Invalid end icon mode: ", i));
                }
                c4069 = new C4052(c4055);
            }
            c4066 = c4069;
            sparseArray.append(i, c4066);
        }
        return c4066;
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final boolean m9328() {
        return this.f15609.getVisibility() == 0;
    }

    /* renamed from: ˉי, reason: contains not printable characters */
    public final void m9329(AbstractC4065 abstractC4065) {
        if (this.f15618 == null) {
            return;
        }
        if (abstractC4065.mo9310() != null) {
            this.f15618.setOnFocusChangeListener(abstractC4065.mo9310());
        }
        if (abstractC4065.mo9346() != null) {
            this.f15622.setOnFocusChangeListener(abstractC4065.mo9346());
        }
    }

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public final void m9330() {
        CheckableImageButton checkableImageButton = this.f15609;
        Drawable drawable = checkableImageButton.getDrawable();
        TextInputLayout textInputLayout = this.f15615;
        checkableImageButton.setVisibility((drawable != null && textInputLayout.f3446.f15670 && textInputLayout.m2890()) ? 0 : 8);
        m9332();
        m9331();
        if (this.f15613 != 0) {
            return;
        }
        textInputLayout.m2901();
    }

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public final void m9331() {
        TextInputLayout textInputLayout = this.f15615;
        if (textInputLayout.f3443 == null) {
            return;
        }
        this.f15619.setPaddingRelative(getContext().getResources().getDimensionPixelSize(R.dimen._2_res_0x7f070381), textInputLayout.f3443.getPaddingTop(), (m9339() || m9328()) ? 0 : textInputLayout.f3443.getPaddingEnd(), textInputLayout.f3443.getPaddingBottom());
    }

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public final void m9332() {
        this.f15605.setVisibility((this.f15622.getVisibility() != 0 || m9328()) ? 8 : 0);
        setVisibility((m9339() || m9328() || ((this.f15610 == null || this.f15603) ? '\b' : (char) 0) == 0) ? 0 : 8);
    }

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final void m9333(boolean z) {
        if (m9339() != z) {
            this.f15622.setVisibility(z ? 0 : 8);
            m9332();
            m9331();
            this.f15615.m2901();
        }
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final int m9334() {
        int marginStart;
        if (m9339() || m9328()) {
            CheckableImageButton checkableImageButton = this.f15622;
            marginStart = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginStart() + checkableImageButton.getMeasuredWidth();
        } else {
            marginStart = 0;
        }
        return this.f15619.getPaddingEnd() + getPaddingEnd() + marginStart;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final CheckableImageButton m9335(ViewGroup viewGroup, LayoutInflater layoutInflater, int i) {
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflater.inflate(R.layout._2_res_0x7f0e0034, viewGroup, false);
        checkableImageButton.setId(i);
        if (Build.VERSION.SDK_INT <= 22) {
            Context context = checkableImageButton.getContext();
            int iApplyDimension = (int) TypedValue.applyDimension(1, 4, checkableImageButton.getContext().getResources().getDisplayMetrics());
            int[] iArr = AbstractC1298.f5320;
            checkableImageButton.setBackground(AbstractC1296.m4594(context, iApplyDimension));
        }
        if (ـﹶ.ˈٴ(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginStart(0);
        }
        return checkableImageButton;
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final void m9336(boolean z) {
        boolean z2;
        boolean zIsActivated;
        boolean z3;
        AbstractC4065 abstractC4065M9327 = m9327();
        boolean zMo9360 = abstractC4065M9327.mo9360();
        CheckableImageButton checkableImageButton = this.f15622;
        boolean z4 = true;
        if (!zMo9360 || (z3 = checkableImageButton.f3351) == abstractC4065M9327.mo9313()) {
            z2 = false;
        } else {
            checkableImageButton.setChecked(!z3);
            z2 = true;
        }
        if (!(abstractC4065M9327 instanceof C4052) || (zIsActivated = checkableImageButton.isActivated()) == abstractC4065M9327.mo9312()) {
            z4 = z2;
        } else {
            checkableImageButton.setActivated(!zIsActivated);
        }
        if (z || z4) {
            ˎˑ.ˎٴ(this.f15615, checkableImageButton, this.f15624);
        }
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final void m9337(int i) {
        if (this.f15613 == i) {
            return;
        }
        AbstractC4065 abstractC4065M9327 = m9327();
        AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener = this.f15623;
        AccessibilityManager accessibilityManager = this.f15617;
        if (touchExplorationStateChangeListener != null && accessibilityManager != null) {
            accessibilityManager.removeTouchExplorationStateChangeListener(touchExplorationStateChangeListener);
        }
        this.f15623 = null;
        abstractC4065M9327.mo9322();
        this.f15613 = i;
        Iterator it = this.f15616.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
        m9333(i != 0);
        AbstractC4065 abstractC4065M93272 = m9327();
        int iMo9324 = this.f15608.f11851;
        if (iMo9324 == 0) {
            iMo9324 = abstractC4065M93272.mo9324();
        }
        Drawable drawable = iMo9324 != 0 ? ٴˎ.ˏᵢ(getContext(), iMo9324) : null;
        CheckableImageButton checkableImageButton = this.f15622;
        checkableImageButton.setImageDrawable(drawable);
        TextInputLayout textInputLayout = this.f15615;
        if (drawable != null) {
            ˎˑ.ـﹶ(textInputLayout, checkableImageButton, this.f15624, this.f15604);
            ˎˑ.ˎٴ(textInputLayout, checkableImageButton, this.f15624);
        }
        int iMo9318 = abstractC4065M93272.mo9318();
        CharSequence text = iMo9318 != 0 ? getResources().getText(iMo9318) : null;
        if (checkableImageButton.getContentDescription() != text) {
            checkableImageButton.setContentDescription(text);
        }
        checkableImageButton.setCheckable(abstractC4065M93272.mo9360());
        if (!abstractC4065M93272.mo9325(textInputLayout.getBoxBackgroundMode())) {
            throw new IllegalStateException("The current box background mode " + textInputLayout.getBoxBackgroundMode() + " is not supported by the end icon mode " + i);
        }
        abstractC4065M93272.mo9315();
        AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListenerMo9317 = abstractC4065M93272.mo9317();
        this.f15623 = touchExplorationStateChangeListenerMo9317;
        if (touchExplorationStateChangeListenerMo9317 != null && accessibilityManager != null && isAttachedToWindow()) {
            accessibilityManager.addTouchExplorationStateChangeListener(this.f15623);
        }
        View.OnClickListener onClickListenerMo9320 = abstractC4065M93272.mo9320();
        View.OnLongClickListener onLongClickListener = this.f15621;
        checkableImageButton.setOnClickListener(onClickListenerMo9320);
        ˎˑ.ﾞˊ(checkableImageButton, onLongClickListener);
        EditText editText = this.f15618;
        if (editText != null) {
            abstractC4065M93272.mo9314(editText);
            m9329(abstractC4065M93272);
        }
        ˎˑ.ـﹶ(textInputLayout, checkableImageButton, this.f15624, this.f15604);
        m9336(true);
    }

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public final void m9338() {
        C2900 c2900 = this.f15619;
        int visibility = c2900.getVisibility();
        int i = (this.f15610 == null || this.f15603) ? 8 : 0;
        if (visibility != i) {
            m9327().mo9345(i == 0);
        }
        m9332();
        c2900.setVisibility(i);
        this.f15615.m2901();
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final boolean m9339() {
        return this.f15605.getVisibility() == 0 && this.f15622.getVisibility() == 0;
    }

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final void m9340(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.f15609;
        checkableImageButton.setImageDrawable(drawable);
        m9330();
        ˎˑ.ـﹶ(this.f15615, checkableImageButton, this.f15614, this.f15606);
    }
}
