package com.google.android.material.textfield;

import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.animation.LinearInterpolator;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.leanback.widget.C0169;
import androidx.leanback.widget.RunnableC0183;
import androidx.lifecycle.RunnableC0246;
import com.bumptech.glide.ﹳﹳ;
import com.google.android.gms.internal.play_billing.ˎˑ;
import com.google.android.material.internal.CheckableImageButton;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;
import p061.C1405;
import p139.AbstractC2124;
import p139.C2158;
import p166.C2428;
import p211.AbstractC2807;
import p219.AbstractC2840;
import p220.AbstractC2845;
import p220.AbstractC2848;
import p220.C2841;
import p222.AbstractC2962;
import p222.C2900;
import p222.C2964;
import p228.C3056;
import p228.C3057;
import p239.AbstractC3098;
import p243.AbstractC3112;
import p243.C3107;
import p278.AbstractC3362;
import p310.C3581;
import p331.C3762;
import p357.C4050;
import p357.C4051;
import p357.C4052;
import p357.C4053;
import p357.C4054;
import p357.C4055;
import p357.C4056;
import p357.C4061;
import p357.C4063;
import p357.C4068;
import p357.C4071;
import p357.InterfaceC4072;
import p361.C4087;
import p361.C4089;
import p361.C4091;
import p361.C4097;
import p361.C4098;
import p361.C4105;
import p361.InterfaceC4104;
import p378.AbstractC4345;
import p421.AbstractC4862;
import p447.AbstractC5179;
import ˈי.ʾˈ;
import ˈⁱ.ˉⁱ;
import ˊﹶ.ˋˉ;
import ᵔᵔ.ٴˎ;
import ⁱـ.ˑי;
import ﹶⁱ.ـﹶ;

/* loaded from: classes.dex */
public class TextInputLayout extends LinearLayout implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: ˆˎ, reason: contains not printable characters */
    public static final int[][] f3394 = {new int[]{R.attr.state_pressed}, new int[0]};

    /* renamed from: ʻ, reason: contains not printable characters */
    public final Rect f3395;

    /* renamed from: ʻʻ, reason: contains not printable characters */
    public int f3396;

    /* renamed from: ʻʿ, reason: contains not printable characters */
    public CharSequence f3397;

    /* renamed from: ʻˉ, reason: contains not printable characters */
    public boolean f3398;

    /* renamed from: ʻﹳ, reason: contains not printable characters */
    public CharSequence f3399;

    /* renamed from: ʼʼ, reason: contains not printable characters */
    public int f3400;

    /* renamed from: ʼᵎ, reason: contains not printable characters */
    public final LinkedHashSet f3401;

    /* renamed from: ʼﹶ, reason: contains not printable characters */
    public boolean f3402;

    /* renamed from: ʽˆ, reason: contains not printable characters */
    public C4105 f3403;

    /* renamed from: ʽⁱ, reason: contains not printable characters */
    public final RectF f3404;

    /* renamed from: ʾʼ, reason: contains not printable characters */
    public int f3405;

    /* renamed from: ʾˈ, reason: contains not printable characters */
    public int f3406;

    /* renamed from: ʿˉ, reason: contains not printable characters */
    public boolean f3407;

    /* renamed from: ʿˊ, reason: contains not printable characters */
    public ColorStateList f3408;

    /* renamed from: ˆʼ, reason: contains not printable characters */
    public final C2841 f3409;

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final C4068 f3410;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public CharSequence f3411;

    /* renamed from: ˆﾞ, reason: contains not printable characters */
    public int f3412;

    /* renamed from: ˈﹳ, reason: contains not printable characters */
    public boolean f3413;

    /* renamed from: ˉʾ, reason: contains not printable characters */
    public int f3414;

    /* renamed from: ˉˑ, reason: contains not printable characters */
    public int f3415;

    /* renamed from: ˉᵎ, reason: contains not printable characters */
    public ColorStateList f3416;

    /* renamed from: ˊˆ, reason: contains not printable characters */
    public Typeface f3417;

    /* renamed from: ˊᵔ, reason: contains not printable characters */
    public int f3418;

    /* renamed from: ˊﹶ, reason: contains not printable characters */
    public int f3419;

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public int f3420;

    /* renamed from: ˋˏ, reason: contains not printable characters */
    public int f3421;

    /* renamed from: ˋﾞ, reason: contains not printable characters */
    public C2158 f3422;

    /* renamed from: ˎˉ, reason: contains not printable characters */
    public ColorStateList f3423;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final C4055 f3424;

    /* renamed from: ˎי, reason: contains not printable characters */
    public ValueAnimator f3425;

    /* renamed from: ˎᵔ, reason: contains not printable characters */
    public int f3426;

    /* renamed from: ˎᵢ, reason: contains not printable characters */
    public C4089 f3427;

    /* renamed from: ˏ, reason: contains not printable characters */
    public final Rect f3428;

    /* renamed from: ˑʾ, reason: contains not printable characters */
    public boolean f3429;

    /* renamed from: ˑˈ, reason: contains not printable characters */
    public boolean f3430;

    /* renamed from: ˑⁱ, reason: contains not printable characters */
    public InterfaceC4072 f3431;

    /* renamed from: ˑﾞ, reason: contains not printable characters */
    public boolean f3432;

    /* renamed from: יˆ, reason: contains not printable characters */
    public int f3433;

    /* renamed from: יˊ, reason: contains not printable characters */
    public ColorStateList f3434;

    /* renamed from: יˋ, reason: contains not printable characters */
    public boolean f3435;

    /* renamed from: יי, reason: contains not printable characters */
    public boolean f3436;

    /* renamed from: יᴵ, reason: contains not printable characters */
    public boolean f3437;

    /* renamed from: ـˆ, reason: contains not printable characters */
    public int f3438;

    /* renamed from: ـᵎ, reason: contains not printable characters */
    public boolean f3439;

    /* renamed from: ٴᐧ, reason: contains not printable characters */
    public C4105 f3440;

    /* renamed from: ٴﹶ, reason: contains not printable characters */
    public StateListDrawable f3441;

    /* renamed from: ᐧʼ, reason: contains not printable characters */
    public int f3442;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public EditText f3443;

    /* renamed from: ᐧᴵ, reason: contains not printable characters */
    public ColorDrawable f3444;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final FrameLayout f3445;

    /* renamed from: ᴵʼ, reason: contains not printable characters */
    public final C4061 f3446;

    /* renamed from: ᴵˋ, reason: contains not printable characters */
    public int f3447;

    /* renamed from: ᴵᴵ, reason: contains not printable characters */
    public int f3448;

    /* renamed from: ᵎʽ, reason: contains not printable characters */
    public C2158 f3449;

    /* renamed from: ᵎʾ, reason: contains not printable characters */
    public C4105 f3450;

    /* renamed from: ᵎˆ, reason: contains not printable characters */
    public ColorDrawable f3451;

    /* renamed from: ᵎᵢ, reason: contains not printable characters */
    public C4105 f3452;

    /* renamed from: ᵔ, reason: contains not printable characters */
    public C2900 f3453;

    /* renamed from: ᵔˋ, reason: contains not printable characters */
    public Drawable f3454;

    /* renamed from: ᵔٴ, reason: contains not printable characters */
    public boolean f3455;

    /* renamed from: ᵔᵢ, reason: contains not printable characters */
    public int f3456;

    /* renamed from: ᵔﹳ, reason: contains not printable characters */
    public int f3457;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public int f3458;

    /* renamed from: ᵢˆ, reason: contains not printable characters */
    public ColorStateList f3459;

    /* renamed from: ᵢˎ, reason: contains not printable characters */
    public int f3460;

    /* renamed from: ᵢٴ, reason: contains not printable characters */
    public C2900 f3461;

    /* renamed from: ᵢᵢ, reason: contains not printable characters */
    public int f3462;

    /* renamed from: ᵢﹶ, reason: contains not printable characters */
    public ColorStateList f3463;

    /* renamed from: ⁱʿ, reason: contains not printable characters */
    public ColorStateList f3464;

    /* renamed from: ⁱⁱ, reason: contains not printable characters */
    public final int f3465;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public int f3466;

    /* renamed from: ﹶʾ, reason: contains not printable characters */
    public int f3467;

    /* renamed from: ﹶﾞ, reason: contains not printable characters */
    public int f3468;

    /* renamed from: ﾞˎ, reason: contains not printable characters */
    public ColorStateList f3469;

    /* renamed from: ﾞᐧ, reason: contains not printable characters */
    public boolean f3470;

    /* renamed from: ﾞﾞ, reason: contains not printable characters */
    public int f3471;

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        super(AbstractC2807.m7088(context, attributeSet, org.lsposed.hiddenapibypass.library.R.attr._2_res_0x7f0405d2, org.lsposed.hiddenapibypass.library.R.style._2_res_0x7f140402), attributeSet, org.lsposed.hiddenapibypass.library.R.attr._2_res_0x7f0405d2);
        this.f3458 = -1;
        this.f3466 = -1;
        this.f3420 = -1;
        this.f3438 = -1;
        this.f3446 = new C4061(this);
        this.f3431 = new C3581(8);
        this.f3428 = new Rect();
        this.f3395 = new Rect();
        this.f3404 = new RectF();
        this.f3401 = new LinkedHashSet();
        C2841 c2841 = new C2841(this);
        this.f3409 = c2841;
        this.f3436 = false;
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.f3445 = frameLayout;
        frameLayout.setAddStatesFromChildren(true);
        LinearInterpolator linearInterpolator = AbstractC2840.f11003;
        c2841.f11051 = linearInterpolator;
        c2841.m7127(false);
        c2841.f11032 = linearInterpolator;
        c2841.m7127(false);
        if (c2841.f11039 != 8388659) {
            c2841.f11039 = 8388659;
            c2841.m7127(false);
        }
        int[] iArr = AbstractC3098.f11957;
        AbstractC2845.m7131(context2, attributeSet, org.lsposed.hiddenapibypass.library.R.attr._2_res_0x7f0405d2, org.lsposed.hiddenapibypass.library.R.style._2_res_0x7f140402);
        AbstractC2845.m7128(context2, attributeSet, iArr, org.lsposed.hiddenapibypass.library.R.attr._2_res_0x7f0405d2, org.lsposed.hiddenapibypass.library.R.style._2_res_0x7f140402, 22, 20, 40, 45, 49);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, org.lsposed.hiddenapibypass.library.R.attr._2_res_0x7f0405d2, org.lsposed.hiddenapibypass.library.R.style._2_res_0x7f140402);
        C3762 c3762 = new C3762(context2, typedArrayObtainStyledAttributes);
        C4068 c4068 = new C4068(this, c3762);
        this.f3410 = c4068;
        this.f3435 = typedArrayObtainStyledAttributes.getBoolean(48, true);
        setHint(typedArrayObtainStyledAttributes.getText(4));
        this.f3407 = typedArrayObtainStyledAttributes.getBoolean(47, true);
        this.f3402 = typedArrayObtainStyledAttributes.getBoolean(42, true);
        if (typedArrayObtainStyledAttributes.hasValue(6)) {
            setMinEms(typedArrayObtainStyledAttributes.getInt(6, -1));
        } else if (typedArrayObtainStyledAttributes.hasValue(3)) {
            setMinWidth(typedArrayObtainStyledAttributes.getDimensionPixelSize(3, -1));
        }
        if (typedArrayObtainStyledAttributes.hasValue(5)) {
            setMaxEms(typedArrayObtainStyledAttributes.getInt(5, -1));
        } else if (typedArrayObtainStyledAttributes.hasValue(2)) {
            setMaxWidth(typedArrayObtainStyledAttributes.getDimensionPixelSize(2, -1));
        }
        this.f3427 = C4089.m9377(context2, attributeSet, org.lsposed.hiddenapibypass.library.R.attr._2_res_0x7f0405d2, org.lsposed.hiddenapibypass.library.R.style._2_res_0x7f140402).m9375();
        this.f3465 = context2.getResources().getDimensionPixelOffset(org.lsposed.hiddenapibypass.library.R.dimen._2_res_0x7f070441);
        this.f3396 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(9, 0);
        this.f3419 = typedArrayObtainStyledAttributes.getDimensionPixelSize(16, context2.getResources().getDimensionPixelSize(org.lsposed.hiddenapibypass.library.R.dimen._2_res_0x7f070442));
        this.f3406 = typedArrayObtainStyledAttributes.getDimensionPixelSize(17, context2.getResources().getDimensionPixelSize(org.lsposed.hiddenapibypass.library.R.dimen._2_res_0x7f070443));
        this.f3442 = this.f3419;
        float dimension = typedArrayObtainStyledAttributes.getDimension(13, -1.0f);
        float dimension2 = typedArrayObtainStyledAttributes.getDimension(12, -1.0f);
        float dimension3 = typedArrayObtainStyledAttributes.getDimension(10, -1.0f);
        float dimension4 = typedArrayObtainStyledAttributes.getDimension(11, -1.0f);
        C4087 c4087M9381 = this.f3427.m9381();
        if (dimension >= 0.0f) {
            c4087M9381.f15758 = new C4097(dimension);
        }
        if (dimension2 >= 0.0f) {
            c4087M9381.f15765 = new C4097(dimension2);
        }
        if (dimension3 >= 0.0f) {
            c4087M9381.f15766 = new C4097(dimension3);
        }
        if (dimension4 >= 0.0f) {
            c4087M9381.f15762 = new C4097(dimension4);
        }
        this.f3427 = c4087M9381.m9375();
        ColorStateList colorStateList = ـﹶ.ﾞʽ(context2, c3762, 7);
        if (colorStateList != null) {
            int defaultColor = colorStateList.getDefaultColor();
            this.f3400 = defaultColor;
            this.f3462 = defaultColor;
            if (colorStateList.isStateful()) {
                this.f3415 = colorStateList.getColorForState(new int[]{-16842910}, -1);
                this.f3421 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
                this.f3433 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            } else {
                this.f3421 = this.f3400;
                ColorStateList colorStateList2 = ﹳﹳ.ˑי(context2, org.lsposed.hiddenapibypass.library.R.color._2_res_0x7f060378);
                this.f3415 = colorStateList2.getColorForState(new int[]{-16842910}, -1);
                this.f3433 = colorStateList2.getColorForState(new int[]{R.attr.state_hovered}, -1);
            }
        } else {
            this.f3462 = 0;
            this.f3400 = 0;
            this.f3415 = 0;
            this.f3421 = 0;
            this.f3433 = 0;
        }
        if (typedArrayObtainStyledAttributes.hasValue(1)) {
            ColorStateList colorStateListM8782 = c3762.m8782(1);
            this.f3459 = colorStateListM8782;
            this.f3463 = colorStateListM8782;
        }
        ColorStateList colorStateList3 = ـﹶ.ﾞʽ(context2, c3762, 14);
        this.f3456 = typedArrayObtainStyledAttributes.getColor(14, 0);
        this.f3447 = ﹳﹳ.ˏᴵ(context2, org.lsposed.hiddenapibypass.library.R.color._2_res_0x7f060393);
        this.f3414 = ﹳﹳ.ˏᴵ(context2, org.lsposed.hiddenapibypass.library.R.color._2_res_0x7f060394);
        this.f3448 = ﹳﹳ.ˏᴵ(context2, org.lsposed.hiddenapibypass.library.R.color._2_res_0x7f060397);
        if (colorStateList3 != null) {
            setBoxStrokeColorStateList(colorStateList3);
        }
        if (typedArrayObtainStyledAttributes.hasValue(15)) {
            setBoxStrokeErrorColor(ـﹶ.ﾞʽ(context2, c3762, 15));
        }
        if (typedArrayObtainStyledAttributes.getResourceId(49, -1) != -1) {
            setHintTextAppearance(typedArrayObtainStyledAttributes.getResourceId(49, 0));
        }
        this.f3464 = c3762.m8782(24);
        this.f3423 = c3762.m8782(25);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(40, 0);
        CharSequence text = typedArrayObtainStyledAttributes.getText(35);
        int i = typedArrayObtainStyledAttributes.getInt(34, 1);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(36, false);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(45, 0);
        boolean z2 = typedArrayObtainStyledAttributes.getBoolean(44, false);
        CharSequence text2 = typedArrayObtainStyledAttributes.getText(43);
        int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(57, 0);
        CharSequence text3 = typedArrayObtainStyledAttributes.getText(56);
        boolean z3 = typedArrayObtainStyledAttributes.getBoolean(18, false);
        setCounterMaxLength(typedArrayObtainStyledAttributes.getInt(19, -1));
        this.f3457 = typedArrayObtainStyledAttributes.getResourceId(22, 0);
        this.f3426 = typedArrayObtainStyledAttributes.getResourceId(20, 0);
        setBoxBackgroundMode(typedArrayObtainStyledAttributes.getInt(8, 0));
        setErrorContentDescription(text);
        setErrorAccessibilityLiveRegion(i);
        setCounterOverflowTextAppearance(this.f3426);
        setHelperTextTextAppearance(resourceId2);
        setErrorTextAppearance(resourceId);
        setCounterTextAppearance(this.f3457);
        setPlaceholderText(text3);
        setPlaceholderTextAppearance(resourceId3);
        if (typedArrayObtainStyledAttributes.hasValue(41)) {
            setErrorTextColor(c3762.m8782(41));
        }
        if (typedArrayObtainStyledAttributes.hasValue(46)) {
            setHelperTextColor(c3762.m8782(46));
        }
        if (typedArrayObtainStyledAttributes.hasValue(50)) {
            setHintTextColor(c3762.m8782(50));
        }
        if (typedArrayObtainStyledAttributes.hasValue(23)) {
            setCounterTextColor(c3762.m8782(23));
        }
        if (typedArrayObtainStyledAttributes.hasValue(21)) {
            setCounterOverflowTextColor(c3762.m8782(21));
        }
        if (typedArrayObtainStyledAttributes.hasValue(58)) {
            setPlaceholderTextColor(c3762.m8782(58));
        }
        C4055 c4055 = new C4055(this, c3762);
        this.f3424 = c4055;
        boolean z4 = typedArrayObtainStyledAttributes.getBoolean(0, true);
        c3762.m8783();
        setImportantForAccessibility(2);
        if (Build.VERSION.SDK_INT >= 26) {
            setImportantForAutofill(1);
        }
        frameLayout.addView(c4068);
        frameLayout.addView(c4055);
        addView(frameLayout);
        setEnabled(z4);
        setHelperTextEnabled(z2);
        setErrorEnabled(z);
        setCounterEnabled(z3);
        setHelperText(text2);
    }

    private Drawable getEditTextBoxBackground() {
        EditText editText = this.f3443;
        if (!(editText instanceof AutoCompleteTextView) || ﹳﹳ.ˋˊ(editText)) {
            return this.f3403;
        }
        int iM8199 = AbstractC3362.m8199(this.f3443, org.lsposed.hiddenapibypass.library.R.attr._2_res_0x7f040133);
        int i = this.f3471;
        int[][] iArr = f3394;
        if (i != 2) {
            if (i != 1) {
                return null;
            }
            C4105 c4105 = this.f3403;
            int i2 = this.f3462;
            return new RippleDrawable(new ColorStateList(iArr, new int[]{AbstractC3362.m8206(0.1f, iM8199, i2), i2}), c4105, c4105);
        }
        Context context = getContext();
        C4105 c41052 = this.f3403;
        TypedValue typedValue = ˑי.ʿˏ(org.lsposed.hiddenapibypass.library.R.attr._2_res_0x7f040169, context, "TextInputLayout");
        int i3 = typedValue.resourceId;
        int i4 = i3 != 0 ? ﹳﹳ.ˏᴵ(context, i3) : typedValue.data;
        C4105 c41053 = new C4105(c41052.f15848.f15817);
        int iM8206 = AbstractC3362.m8206(0.1f, iM8199, i4);
        c41053.m9407(new ColorStateList(iArr, new int[]{iM8206, 0}));
        c41053.setTint(i4);
        ColorStateList colorStateList = new ColorStateList(iArr, new int[]{iM8206, i4});
        C4105 c41054 = new C4105(c41052.f15848.f15817);
        c41054.setTint(-1);
        return new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, c41053, c41054), c41052});
    }

    private Drawable getOrCreateFilledDropDownMenuBackground() {
        if (this.f3441 == null) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            this.f3441 = stateListDrawable;
            stateListDrawable.addState(new int[]{R.attr.state_above_anchor}, getOrCreateOutlinedDropDownMenuBackground());
            this.f3441.addState(new int[0], m2897(false));
        }
        return this.f3441;
    }

    private Drawable getOrCreateOutlinedDropDownMenuBackground() {
        if (this.f3440 == null) {
            this.f3440 = m2897(true);
        }
        return this.f3440;
    }

    private void setEditText(EditText editText) {
        if (this.f3443 != null) {
            throw new IllegalArgumentException("We already have an EditText, can only have one");
        }
        if (getEndIconMode() == 3 || !(editText instanceof TextInputEditText)) {
        }
        this.f3443 = editText;
        int i = this.f3458;
        if (i != -1) {
            setMinEms(i);
        } else {
            setMinWidth(this.f3420);
        }
        int i2 = this.f3466;
        if (i2 != -1) {
            setMaxEms(i2);
        } else {
            setMaxWidth(this.f3438);
        }
        this.f3439 = false;
        m2904();
        setTextInputAccessibilityDelegate(new C4054(this));
        Typeface typeface = this.f3443.getTypeface();
        C2841 c2841 = this.f3409;
        c2841.m7121(typeface);
        float textSize = this.f3443.getTextSize();
        if (c2841.f11029 != textSize) {
            c2841.f11029 = textSize;
            c2841.m7127(false);
        }
        int i3 = Build.VERSION.SDK_INT;
        float letterSpacing = this.f3443.getLetterSpacing();
        if (c2841.f11060 != letterSpacing) {
            c2841.f11060 = letterSpacing;
            c2841.m7127(false);
        }
        int gravity = this.f3443.getGravity();
        int i4 = (gravity & (-113)) | 48;
        if (c2841.f11039 != i4) {
            c2841.f11039 = i4;
            c2841.m7127(false);
        }
        if (c2841.f11038 != gravity) {
            c2841.f11038 = gravity;
            c2841.m7127(false);
        }
        this.f3460 = editText.getMinimumHeight();
        this.f3443.addTextChangedListener(new C4051(this, editText));
        if (this.f3463 == null) {
            this.f3463 = this.f3443.getHintTextColors();
        }
        if (this.f3435) {
            if (TextUtils.isEmpty(this.f3399)) {
                CharSequence hint = this.f3443.getHint();
                this.f3411 = hint;
                setHint(hint);
                this.f3443.setHint((CharSequence) null);
            }
            this.f3413 = true;
        }
        if (i3 >= 29) {
            m2895();
        }
        if (this.f3461 != null) {
            m2899(this.f3443.getText());
        }
        m2891();
        this.f3446.m9348();
        this.f3410.bringToFront();
        C4055 c4055 = this.f3424;
        c4055.bringToFront();
        Iterator it = this.f3401.iterator();
        while (it.hasNext()) {
            ((C4053) it.next()).m9326(this);
        }
        c4055.m9331();
        if (!isEnabled()) {
            editText.setEnabled(false);
        }
        m2886(false, true);
    }

    private void setHintInternal(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.f3399)) {
            return;
        }
        this.f3399 = charSequence;
        C2841 c2841 = this.f3409;
        if (charSequence == null || !TextUtils.equals(c2841.f11014, charSequence)) {
            c2841.f11014 = charSequence;
            c2841.f11041 = null;
            c2841.m7127(false);
        }
        if (this.f3437) {
            return;
        }
        m2887();
    }

    private void setPlaceholderTextEnabled(boolean z) {
        if (this.f3455 == z) {
            return;
        }
        if (z) {
            C2900 c2900 = this.f3453;
            if (c2900 != null) {
                this.f3445.addView(c2900);
                this.f3453.setVisibility(0);
            }
        } else {
            C2900 c29002 = this.f3453;
            if (c29002 != null) {
                c29002.setVisibility(8);
            }
            this.f3453 = null;
        }
        this.f3455 = z;
    }

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public static void m2883(ViewGroup viewGroup, boolean z) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            childAt.setEnabled(z);
            if (childAt instanceof ViewGroup) {
                m2883((ViewGroup) childAt, z);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof EditText)) {
            super.addView(view, i, layoutParams);
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
        layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
        FrameLayout frameLayout = this.f3445;
        frameLayout.addView(view, layoutParams2);
        frameLayout.setLayoutParams(layoutParams);
        m2902();
        setEditText((EditText) view);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i) {
        EditText editText = this.f3443;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i);
            return;
        }
        if (this.f3411 != null) {
            boolean z = this.f3413;
            this.f3413 = false;
            CharSequence hint = editText.getHint();
            this.f3443.setHint(this.f3411);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i);
                return;
            } finally {
                this.f3443.setHint(hint);
                this.f3413 = z;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i);
        onProvideAutofillVirtualStructure(viewStructure, i);
        FrameLayout frameLayout = this.f3445;
        viewStructure.setChildCount(frameLayout.getChildCount());
        for (int i2 = 0; i2 < frameLayout.getChildCount(); i2++) {
            View childAt = frameLayout.getChildAt(i2);
            ViewStructure viewStructureNewChild = viewStructure.newChild(i2);
            childAt.dispatchProvideAutofillStructure(viewStructureNewChild, i);
            if (childAt == this.f3443) {
                viewStructureNewChild.setHint(getHint());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        this.f3430 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.f3430 = false;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        C4105 c4105;
        int i;
        super.draw(canvas);
        boolean z = this.f3435;
        C2841 c2841 = this.f3409;
        if (z) {
            c2841.getClass();
            int iSave = canvas.save();
            if (c2841.f11041 != null) {
                RectF rectF = c2841.f11009;
                if (rectF.width() > 0.0f && rectF.height() > 0.0f) {
                    TextPaint textPaint = c2841.f11008;
                    textPaint.setTextSize(c2841.f11013);
                    float f = c2841.f11031;
                    float f2 = c2841.f11046;
                    float f3 = c2841.f11040;
                    if (f3 != 1.0f) {
                        canvas.scale(f3, f3, f, f2);
                    }
                    if (c2841.f11023 <= 1 || c2841.f11012) {
                        canvas.translate(f, f2);
                        c2841.f11022.draw(canvas);
                    } else {
                        float lineStart = c2841.f11031 - c2841.f11022.getLineStart(0);
                        int alpha = textPaint.getAlpha();
                        canvas.translate(lineStart, f2);
                        float f4 = alpha;
                        textPaint.setAlpha((int) (c2841.f11016 * f4));
                        int i2 = Build.VERSION.SDK_INT;
                        if (i2 >= 31) {
                            float f5 = c2841.f11050;
                            float f6 = c2841.f11056;
                            float f7 = c2841.f11019;
                            int i3 = c2841.f11036;
                            textPaint.setShadowLayer(f5, f6, f7, AbstractC4862.m10942(i3, (textPaint.getAlpha() * Color.alpha(i3)) / 255));
                        }
                        c2841.f11022.draw(canvas);
                        textPaint.setAlpha((int) (c2841.f11010 * f4));
                        if (i2 >= 31) {
                            float f8 = c2841.f11050;
                            float f9 = c2841.f11056;
                            float f10 = c2841.f11019;
                            int i4 = c2841.f11036;
                            textPaint.setShadowLayer(f8, f9, f10, AbstractC4862.m10942(i4, (Color.alpha(i4) * textPaint.getAlpha()) / 255));
                        }
                        int lineBaseline = c2841.f11022.getLineBaseline(0);
                        CharSequence charSequence = c2841.f11052;
                        float f11 = lineBaseline;
                        canvas.drawText(charSequence, 0, charSequence.length(), 0.0f, f11, textPaint);
                        if (i2 >= 31) {
                            textPaint.setShadowLayer(c2841.f11050, c2841.f11056, c2841.f11019, c2841.f11036);
                        }
                        String strTrim = c2841.f11052.toString().trim();
                        if (strTrim.endsWith("…")) {
                            i = 0;
                            strTrim = strTrim.substring(0, strTrim.length() - 1);
                        } else {
                            i = 0;
                        }
                        String str = strTrim;
                        textPaint.setAlpha(alpha);
                        canvas.drawText(str, 0, Math.min(c2841.f11022.getLineEnd(i), str.length()), 0.0f, f11, (Paint) textPaint);
                    }
                    canvas.restoreToCount(iSave);
                }
            }
        }
        if (this.f3450 == null || (c4105 = this.f3452) == null) {
            return;
        }
        c4105.draw(canvas);
        if (this.f3443.isFocused()) {
            Rect bounds = this.f3450.getBounds();
            Rect bounds2 = this.f3452.getBounds();
            float f12 = c2841.f11007;
            int iCenterX = bounds2.centerX();
            bounds.left = AbstractC2840.m7113(f12, iCenterX, bounds2.left);
            bounds.right = AbstractC2840.m7113(f12, iCenterX, bounds2.right);
            this.f3450.draw(canvas);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002f  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void drawableStateChanged() {
        /*
            r4 = this;
            boolean r0 = r4.f3398
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            r4.f3398 = r0
            super.drawableStateChanged()
            int[] r1 = r4.getDrawableState()
            r2 = 0
            ˏٴ.ʽᐧ r3 = r4.f3409
            if (r3 == 0) goto L2f
            r3.f11042 = r1
            android.content.res.ColorStateList r1 = r3.f11027
            if (r1 == 0) goto L20
            boolean r1 = r1.isStateful()
            if (r1 != 0) goto L2a
        L20:
            android.content.res.ColorStateList r1 = r3.f11015
            if (r1 == 0) goto L2f
            boolean r1 = r1.isStateful()
            if (r1 == 0) goto L2f
        L2a:
            r3.m7127(r2)
            r1 = 1
            goto L30
        L2f:
            r1 = 0
        L30:
            android.widget.EditText r3 = r4.f3443
            if (r3 == 0) goto L45
            boolean r3 = r4.isLaidOut()
            if (r3 == 0) goto L41
            boolean r3 = r4.isEnabled()
            if (r3 == 0) goto L41
            goto L42
        L41:
            r0 = 0
        L42:
            r4.m2886(r0, r2)
        L45:
            r4.m2891()
            r4.m2905()
            if (r1 == 0) goto L50
            r4.invalidate()
        L50:
            r4.f3398 = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.drawableStateChanged():void");
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.f3443;
        if (editText == null) {
            return super.getBaseline();
        }
        return m2894() + getPaddingTop() + editText.getBaseline();
    }

    public C4105 getBoxBackground() {
        int i = this.f3471;
        if (i == 1 || i == 2) {
            return this.f3403;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.f3462;
    }

    public int getBoxBackgroundMode() {
        return this.f3471;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.f3396;
    }

    public float getBoxCornerRadiusBottomEnd() {
        int layoutDirection = getLayoutDirection();
        RectF rectF = this.f3404;
        return layoutDirection == 1 ? this.f3427.f15776.mo9371(rectF) : this.f3427.f15780.mo9371(rectF);
    }

    public float getBoxCornerRadiusBottomStart() {
        int layoutDirection = getLayoutDirection();
        RectF rectF = this.f3404;
        return layoutDirection == 1 ? this.f3427.f15780.mo9371(rectF) : this.f3427.f15776.mo9371(rectF);
    }

    public float getBoxCornerRadiusTopEnd() {
        int layoutDirection = getLayoutDirection();
        RectF rectF = this.f3404;
        return layoutDirection == 1 ? this.f3427.f15772.mo9371(rectF) : this.f3427.f15779.mo9371(rectF);
    }

    public float getBoxCornerRadiusTopStart() {
        int layoutDirection = getLayoutDirection();
        RectF rectF = this.f3404;
        return layoutDirection == 1 ? this.f3427.f15779.mo9371(rectF) : this.f3427.f15772.mo9371(rectF);
    }

    public int getBoxStrokeColor() {
        return this.f3456;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.f3434;
    }

    public int getBoxStrokeWidth() {
        return this.f3419;
    }

    public int getBoxStrokeWidthFocused() {
        return this.f3406;
    }

    public int getCounterMaxLength() {
        return this.f3405;
    }

    public CharSequence getCounterOverflowDescription() {
        C2900 c2900;
        if (this.f3470 && this.f3432 && (c2900 = this.f3461) != null) {
            return c2900.getContentDescription();
        }
        return null;
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.f3416;
    }

    public ColorStateList getCounterTextColor() {
        return this.f3408;
    }

    public ColorStateList getCursorColor() {
        return this.f3464;
    }

    public ColorStateList getCursorErrorColor() {
        return this.f3423;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.f3463;
    }

    public EditText getEditText() {
        return this.f3443;
    }

    public CharSequence getEndIconContentDescription() {
        return this.f3424.f15622.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.f3424.f15622.getDrawable();
    }

    public int getEndIconMinSize() {
        return this.f3424.f15612;
    }

    public int getEndIconMode() {
        return this.f3424.f15613;
    }

    public ImageView.ScaleType getEndIconScaleType() {
        return this.f3424.f15611;
    }

    public CheckableImageButton getEndIconView() {
        return this.f3424.f15622;
    }

    public CharSequence getError() {
        C4061 c4061 = this.f3446;
        if (c4061.f15670) {
            return c4061.f15662;
        }
        return null;
    }

    public int getErrorAccessibilityLiveRegion() {
        return this.f3446.f15671;
    }

    public CharSequence getErrorContentDescription() {
        return this.f3446.f15669;
    }

    public int getErrorCurrentTextColors() {
        C2900 c2900 = this.f3446.f15657;
        if (c2900 != null) {
            return c2900.getCurrentTextColor();
        }
        return -1;
    }

    public Drawable getErrorIconDrawable() {
        return this.f3424.f15609.getDrawable();
    }

    public CharSequence getHelperText() {
        C4061 c4061 = this.f3446;
        if (c4061.f15675) {
            return c4061.f15676;
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        C2900 c2900 = this.f3446.f15663;
        if (c2900 != null) {
            return c2900.getCurrentTextColor();
        }
        return -1;
    }

    public CharSequence getHint() {
        if (this.f3435) {
            return this.f3399;
        }
        return null;
    }

    public final float getHintCollapsedTextHeight() {
        return this.f3409.m7118();
    }

    public final int getHintCurrentCollapsedTextColor() {
        C2841 c2841 = this.f3409;
        return c2841.m7125(c2841.f11027);
    }

    public ColorStateList getHintTextColor() {
        return this.f3459;
    }

    public InterfaceC4072 getLengthCounter() {
        return this.f3431;
    }

    public int getMaxEms() {
        return this.f3466;
    }

    public int getMaxWidth() {
        return this.f3438;
    }

    public int getMinEms() {
        return this.f3458;
    }

    public int getMinWidth() {
        return this.f3420;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.f3424.f15622.getContentDescription();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.f3424.f15622.getDrawable();
    }

    public CharSequence getPlaceholderText() {
        if (this.f3455) {
            return this.f3397;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.f3418;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.f3469;
    }

    public CharSequence getPrefixText() {
        return this.f3410.f15695;
    }

    public ColorStateList getPrefixTextColor() {
        return this.f3410.f15692.getTextColors();
    }

    public TextView getPrefixTextView() {
        return this.f3410.f15692;
    }

    public C4089 getShapeAppearanceModel() {
        return this.f3427;
    }

    public CharSequence getStartIconContentDescription() {
        return this.f3410.f15697.getContentDescription();
    }

    public Drawable getStartIconDrawable() {
        return this.f3410.f15697.getDrawable();
    }

    public int getStartIconMinSize() {
        return this.f3410.f15701;
    }

    public ImageView.ScaleType getStartIconScaleType() {
        return this.f3410.f15694;
    }

    public CharSequence getSuffixText() {
        return this.f3424.f15610;
    }

    public ColorStateList getSuffixTextColor() {
        return this.f3424.f15619.getTextColors();
    }

    public TextView getSuffixTextView() {
        return this.f3424.f15619;
    }

    public Typeface getTypeface() {
        return this.f3417;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f3409.m7123(configuration);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int iMax;
        C4055 c4055 = this.f3424;
        c4055.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        boolean z = false;
        this.f3436 = false;
        if (this.f3443 != null && this.f3443.getMeasuredHeight() < (iMax = Math.max(c4055.getMeasuredHeight(), this.f3410.getMeasuredHeight()))) {
            this.f3443.setMinimumHeight(iMax);
            z = true;
        }
        boolean zM2901 = m2901();
        if (z || zM2901) {
            this.f3443.post(new RunnableC0246(24, this));
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        EditText editText = this.f3443;
        if (editText != null) {
            ThreadLocal threadLocal = AbstractC2848.f11087;
            int width = editText.getWidth();
            int height = editText.getHeight();
            Rect rect = this.f3428;
            rect.set(0, 0, width, height);
            ThreadLocal threadLocal2 = AbstractC2848.f11087;
            Matrix matrix = (Matrix) threadLocal2.get();
            if (matrix == null) {
                matrix = new Matrix();
                threadLocal2.set(matrix);
            } else {
                matrix.reset();
            }
            AbstractC2848.m7136(this, editText, matrix);
            ThreadLocal threadLocal3 = AbstractC2848.f11086;
            RectF rectF = (RectF) threadLocal3.get();
            if (rectF == null) {
                rectF = new RectF();
                threadLocal3.set(rectF);
            }
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
            C4105 c4105 = this.f3452;
            if (c4105 != null) {
                int i5 = rect.bottom;
                c4105.setBounds(rect.left, i5 - this.f3419, rect.right, i5);
            }
            C4105 c41052 = this.f3450;
            if (c41052 != null) {
                int i6 = rect.bottom;
                c41052.setBounds(rect.left, i6 - this.f3406, rect.right, i6);
            }
            if (this.f3435) {
                float textSize = this.f3443.getTextSize();
                C2841 c2841 = this.f3409;
                if (c2841.f11029 != textSize) {
                    c2841.f11029 = textSize;
                    c2841.m7127(false);
                }
                int gravity = this.f3443.getGravity();
                int i7 = (gravity & (-113)) | 48;
                if (c2841.f11039 != i7) {
                    c2841.f11039 = i7;
                    c2841.m7127(false);
                }
                if (c2841.f11038 != gravity) {
                    c2841.f11038 = gravity;
                    c2841.m7127(false);
                }
                if (this.f3443 == null) {
                    throw new IllegalStateException();
                }
                boolean z2 = getLayoutDirection() == 1;
                int i8 = rect.bottom;
                Rect rect2 = this.f3395;
                rect2.bottom = i8;
                int i9 = this.f3471;
                if (i9 == 1) {
                    rect2.left = m2898(rect.left, z2);
                    rect2.top = rect.top + this.f3396;
                    rect2.right = m2893(rect.right, z2);
                } else if (i9 != 2) {
                    rect2.left = m2898(rect.left, z2);
                    rect2.top = getPaddingTop();
                    rect2.right = m2893(rect.right, z2);
                } else {
                    rect2.left = this.f3443.getPaddingLeft() + rect.left;
                    rect2.top = rect.top - m2894();
                    rect2.right = rect.right - this.f3443.getPaddingRight();
                }
                int i10 = rect2.left;
                int i11 = rect2.top;
                int i12 = rect2.right;
                int i13 = rect2.bottom;
                Rect rect3 = c2841.f11055;
                if (rect3.left != i10 || rect3.top != i11 || rect3.right != i12 || rect3.bottom != i13) {
                    rect3.set(i10, i11, i12, i13);
                    c2841.f11061 = true;
                }
                if (this.f3443 == null) {
                    throw new IllegalStateException();
                }
                TextPaint textPaint = c2841.f11033;
                textPaint.setTextSize(c2841.f11029);
                textPaint.setTypeface(c2841.f11011);
                textPaint.setLetterSpacing(c2841.f11060);
                float f = -textPaint.ascent();
                rect2.left = this.f3443.getCompoundPaddingLeft() + rect.left;
                rect2.top = (this.f3471 != 1 || this.f3443.getMinLines() > 1) ? rect.top + this.f3443.getCompoundPaddingTop() : (int) (rect.centerY() - (f / 2.0f));
                rect2.right = rect.right - this.f3443.getCompoundPaddingRight();
                int compoundPaddingBottom = (this.f3471 != 1 || this.f3443.getMinLines() > 1) ? rect.bottom - this.f3443.getCompoundPaddingBottom() : (int) (rect2.top + f);
                rect2.bottom = compoundPaddingBottom;
                int i14 = rect2.left;
                int i15 = rect2.top;
                int i16 = rect2.right;
                Rect rect4 = c2841.f11030;
                if (rect4.left != i14 || rect4.top != i15 || rect4.right != i16 || rect4.bottom != compoundPaddingBottom) {
                    rect4.set(i14, i15, i16, compoundPaddingBottom);
                    c2841.f11061 = true;
                }
                c2841.m7127(false);
                if (!m2885() || this.f3437) {
                    return;
                }
                m2887();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        EditText editText;
        super.onMeasure(i, i2);
        boolean z = this.f3436;
        C4055 c4055 = this.f3424;
        if (!z) {
            c4055.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.f3436 = true;
        }
        if (this.f3453 != null && (editText = this.f3443) != null) {
            this.f3453.setGravity(editText.getGravity());
            this.f3453.setPadding(this.f3443.getCompoundPaddingLeft(), this.f3443.getCompoundPaddingTop(), this.f3443.getCompoundPaddingRight(), this.f3443.getCompoundPaddingBottom());
        }
        c4055.m9331();
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C4071)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C4071 c4071 = (C4071) parcelable;
        super.onRestoreInstanceState(c4071.f15438);
        setError(c4071.f15704);
        if (c4071.f15705) {
            post(new RunnableC0183(28, this));
        }
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        boolean z = i == 1;
        if (z != this.f3429) {
            InterfaceC4104 interfaceC4104 = this.f3427.f15772;
            RectF rectF = this.f3404;
            float fMo9371 = interfaceC4104.mo9371(rectF);
            float fMo93712 = this.f3427.f15779.mo9371(rectF);
            float fMo93713 = this.f3427.f15776.mo9371(rectF);
            float fMo93714 = this.f3427.f15780.mo9371(rectF);
            C4089 c4089 = this.f3427;
            ʾˈ r5 = c4089.f15778;
            ʾˈ r6 = c4089.f15771;
            ʾˈ r7 = c4089.f15781;
            ʾˈ r4 = c4089.f15777;
            ٴˎ r8 = new ٴˎ(0);
            ٴˎ r9 = new ٴˎ(0);
            ٴˎ r10 = new ٴˎ(0);
            ٴˎ r11 = new ٴˎ(0);
            C4087.m9374(r6);
            C4087.m9374(r5);
            C4087.m9374(r4);
            C4087.m9374(r7);
            C4097 c4097 = new C4097(fMo93712);
            C4097 c40972 = new C4097(fMo9371);
            C4097 c40973 = new C4097(fMo93714);
            C4097 c40974 = new C4097(fMo93713);
            C4089 c40892 = new C4089();
            c40892.f15778 = r6;
            c40892.f15771 = r5;
            c40892.f15777 = r7;
            c40892.f15781 = r4;
            c40892.f15772 = c4097;
            c40892.f15779 = c40972;
            c40892.f15780 = c40974;
            c40892.f15776 = c40973;
            c40892.f15782 = r8;
            c40892.f15773 = r9;
            c40892.f15775 = r10;
            c40892.f15774 = r11;
            this.f3429 = z;
            setShapeAppearanceModel(c40892);
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C4071 c4071 = new C4071(super.onSaveInstanceState());
        if (m2890()) {
            c4071.f15704 = getError();
        }
        C4055 c4055 = this.f3424;
        c4071.f15705 = c4055.f15613 != 0 && c4055.f15622.f3351;
        return c4071;
    }

    public void setBoxBackgroundColor(int i) {
        if (this.f3462 != i) {
            this.f3462 = i;
            this.f3400 = i;
            this.f3421 = i;
            this.f3433 = i;
            m2884();
        }
    }

    public void setBoxBackgroundColorResource(int i) {
        setBoxBackgroundColor(ﹳﹳ.ˏᴵ(getContext(), i));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.f3400 = defaultColor;
        this.f3462 = defaultColor;
        this.f3415 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.f3421 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        this.f3433 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
        m2884();
    }

    public void setBoxBackgroundMode(int i) {
        if (i == this.f3471) {
            return;
        }
        this.f3471 = i;
        if (this.f3443 != null) {
            m2904();
        }
    }

    public void setBoxCollapsedPaddingTop(int i) {
        this.f3396 = i;
    }

    public void setBoxCornerFamily(int i) {
        C4087 c4087M9381 = this.f3427.m9381();
        InterfaceC4104 interfaceC4104 = this.f3427.f15772;
        ʾˈ r2 = ˈⁱ.ﹳﹳ.ᐧʻ(i);
        c4087M9381.f15764 = r2;
        C4087.m9374(r2);
        c4087M9381.f15758 = interfaceC4104;
        InterfaceC4104 interfaceC41042 = this.f3427.f15779;
        ʾˈ r22 = ˈⁱ.ﹳﹳ.ᐧʻ(i);
        c4087M9381.f15757 = r22;
        C4087.m9374(r22);
        c4087M9381.f15765 = interfaceC41042;
        InterfaceC4104 interfaceC41043 = this.f3427.f15776;
        ʾˈ r23 = ˈⁱ.ﹳﹳ.ᐧʻ(i);
        c4087M9381.f15767 = r23;
        C4087.m9374(r23);
        c4087M9381.f15762 = interfaceC41043;
        InterfaceC4104 interfaceC41044 = this.f3427.f15780;
        ʾˈ r4 = ˈⁱ.ﹳﹳ.ᐧʻ(i);
        c4087M9381.f15763 = r4;
        C4087.m9374(r4);
        c4087M9381.f15766 = interfaceC41044;
        this.f3427 = c4087M9381.m9375();
        m2884();
    }

    public void setBoxStrokeColor(int i) {
        if (this.f3456 != i) {
            this.f3456 = i;
            m2905();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.f3447 = colorStateList.getDefaultColor();
            this.f3414 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.f3448 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            this.f3456 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        } else if (this.f3456 != colorStateList.getDefaultColor()) {
            this.f3456 = colorStateList.getDefaultColor();
        }
        m2905();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.f3434 != colorStateList) {
            this.f3434 = colorStateList;
            m2905();
        }
    }

    public void setBoxStrokeWidth(int i) {
        this.f3419 = i;
        m2905();
    }

    public void setBoxStrokeWidthFocused(int i) {
        this.f3406 = i;
        m2905();
    }

    public void setBoxStrokeWidthFocusedResource(int i) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i));
    }

    public void setBoxStrokeWidthResource(int i) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i));
    }

    public void setCounterEnabled(boolean z) {
        if (this.f3470 != z) {
            C4061 c4061 = this.f3446;
            if (z) {
                C2900 c2900 = new C2900(getContext(), null);
                this.f3461 = c2900;
                c2900.setId(org.lsposed.hiddenapibypass.library.R.id._2_res_0x7f0b038e);
                Typeface typeface = this.f3417;
                if (typeface != null) {
                    this.f3461.setTypeface(typeface);
                }
                this.f3461.setMaxLines(1);
                c4061.m9352(this.f3461, 2);
                ((ViewGroup.MarginLayoutParams) this.f3461.getLayoutParams()).setMarginStart(getResources().getDimensionPixelOffset(org.lsposed.hiddenapibypass.library.R.dimen._2_res_0x7f070444));
                m2892();
                if (this.f3461 != null) {
                    EditText editText = this.f3443;
                    m2899(editText != null ? editText.getText() : null);
                }
            } else {
                c4061.m9354(this.f3461, 2);
                this.f3461 = null;
            }
            this.f3470 = z;
        }
    }

    public void setCounterMaxLength(int i) {
        if (this.f3405 != i) {
            if (i > 0) {
                this.f3405 = i;
            } else {
                this.f3405 = -1;
            }
            if (!this.f3470 || this.f3461 == null) {
                return;
            }
            EditText editText = this.f3443;
            m2899(editText == null ? null : editText.getText());
        }
    }

    public void setCounterOverflowTextAppearance(int i) {
        if (this.f3426 != i) {
            this.f3426 = i;
            m2892();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.f3416 != colorStateList) {
            this.f3416 = colorStateList;
            m2892();
        }
    }

    public void setCounterTextAppearance(int i) {
        if (this.f3457 != i) {
            this.f3457 = i;
            m2892();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.f3408 != colorStateList) {
            this.f3408 = colorStateList;
            m2892();
        }
    }

    public void setCursorColor(ColorStateList colorStateList) {
        if (this.f3464 != colorStateList) {
            this.f3464 = colorStateList;
            m2895();
        }
    }

    public void setCursorErrorColor(ColorStateList colorStateList) {
        if (this.f3423 != colorStateList) {
            this.f3423 = colorStateList;
            if (m2890() || (this.f3461 != null && this.f3432)) {
                m2895();
            }
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.f3463 = colorStateList;
        this.f3459 = colorStateList;
        if (this.f3443 != null) {
            m2886(false, false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        m2883(this, z);
        super.setEnabled(z);
    }

    public void setEndIconActivated(boolean z) {
        this.f3424.f15622.setActivated(z);
    }

    public void setEndIconCheckable(boolean z) {
        this.f3424.f15622.setCheckable(z);
    }

    public void setEndIconContentDescription(int i) {
        C4055 c4055 = this.f3424;
        CharSequence text = i != 0 ? c4055.getResources().getText(i) : null;
        CheckableImageButton checkableImageButton = c4055.f15622;
        if (checkableImageButton.getContentDescription() != text) {
            checkableImageButton.setContentDescription(text);
        }
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.f3424.f15622;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(int i) {
        C4055 c4055 = this.f3424;
        Drawable drawable = i != 0 ? ᴵﹳ.ٴˎ.ˏᵢ(c4055.getContext(), i) : null;
        CheckableImageButton checkableImageButton = c4055.f15622;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            ColorStateList colorStateList = c4055.f15624;
            PorterDuff.Mode mode = c4055.f15604;
            TextInputLayout textInputLayout = c4055.f15615;
            ˎˑ.ـﹶ(textInputLayout, checkableImageButton, colorStateList, mode);
            ˎˑ.ˎٴ(textInputLayout, checkableImageButton, c4055.f15624);
        }
    }

    public void setEndIconDrawable(Drawable drawable) {
        C4055 c4055 = this.f3424;
        CheckableImageButton checkableImageButton = c4055.f15622;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            ColorStateList colorStateList = c4055.f15624;
            PorterDuff.Mode mode = c4055.f15604;
            TextInputLayout textInputLayout = c4055.f15615;
            ˎˑ.ـﹶ(textInputLayout, checkableImageButton, colorStateList, mode);
            ˎˑ.ˎٴ(textInputLayout, checkableImageButton, c4055.f15624);
        }
    }

    public void setEndIconMinSize(int i) {
        C4055 c4055 = this.f3424;
        if (i < 0) {
            c4055.getClass();
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (i != c4055.f15612) {
            c4055.f15612 = i;
            CheckableImageButton checkableImageButton = c4055.f15622;
            checkableImageButton.setMinimumWidth(i);
            checkableImageButton.setMinimumHeight(i);
            CheckableImageButton checkableImageButton2 = c4055.f15609;
            checkableImageButton2.setMinimumWidth(i);
            checkableImageButton2.setMinimumHeight(i);
        }
    }

    public void setEndIconMode(int i) {
        this.f3424.m9337(i);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        C4055 c4055 = this.f3424;
        View.OnLongClickListener onLongClickListener = c4055.f15621;
        CheckableImageButton checkableImageButton = c4055.f15622;
        checkableImageButton.setOnClickListener(onClickListener);
        ˎˑ.ﾞˊ(checkableImageButton, onLongClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        C4055 c4055 = this.f3424;
        c4055.f15621 = onLongClickListener;
        CheckableImageButton checkableImageButton = c4055.f15622;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        ˎˑ.ﾞˊ(checkableImageButton, onLongClickListener);
    }

    public void setEndIconScaleType(ImageView.ScaleType scaleType) {
        C4055 c4055 = this.f3424;
        c4055.f15611 = scaleType;
        c4055.f15622.setScaleType(scaleType);
        c4055.f15609.setScaleType(scaleType);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        C4055 c4055 = this.f3424;
        if (c4055.f15624 != colorStateList) {
            c4055.f15624 = colorStateList;
            ˎˑ.ـﹶ(c4055.f15615, c4055.f15622, colorStateList, c4055.f15604);
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        C4055 c4055 = this.f3424;
        if (c4055.f15604 != mode) {
            c4055.f15604 = mode;
            ˎˑ.ـﹶ(c4055.f15615, c4055.f15622, c4055.f15624, mode);
        }
    }

    public void setEndIconVisible(boolean z) {
        this.f3424.m9333(z);
    }

    public void setError(CharSequence charSequence) {
        C4061 c4061 = this.f3446;
        if (!c4061.f15670) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            } else {
                setErrorEnabled(true);
            }
        }
        if (TextUtils.isEmpty(charSequence)) {
            c4061.m9353();
            return;
        }
        c4061.m9351();
        c4061.f15662 = charSequence;
        c4061.f15657.setText(charSequence);
        int i = c4061.f15668;
        if (i != 1) {
            c4061.f15659 = 1;
        }
        c4061.m9356(i, c4061.m9350(c4061.f15657, charSequence), c4061.f15659);
    }

    public void setErrorAccessibilityLiveRegion(int i) {
        C4061 c4061 = this.f3446;
        c4061.f15671 = i;
        C2900 c2900 = c4061.f15657;
        if (c2900 != null) {
            c2900.setAccessibilityLiveRegion(i);
        }
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        C4061 c4061 = this.f3446;
        c4061.f15669 = charSequence;
        C2900 c2900 = c4061.f15657;
        if (c2900 != null) {
            c2900.setContentDescription(charSequence);
        }
    }

    public void setErrorEnabled(boolean z) {
        C4061 c4061 = this.f3446;
        if (c4061.f15670 == z) {
            return;
        }
        c4061.m9351();
        TextInputLayout textInputLayout = c4061.f15660;
        if (z) {
            C2900 c2900 = new C2900(c4061.f15666, null);
            c4061.f15657 = c2900;
            c2900.setId(org.lsposed.hiddenapibypass.library.R.id._2_res_0x7f0b038f);
            c4061.f15657.setTextAlignment(5);
            Typeface typeface = c4061.f15667;
            if (typeface != null) {
                c4061.f15657.setTypeface(typeface);
            }
            int i = c4061.f15651;
            c4061.f15651 = i;
            C2900 c29002 = c4061.f15657;
            if (c29002 != null) {
                textInputLayout.m2888(c29002, i);
            }
            ColorStateList colorStateList = c4061.f15655;
            c4061.f15655 = colorStateList;
            C2900 c29003 = c4061.f15657;
            if (c29003 != null && colorStateList != null) {
                c29003.setTextColor(colorStateList);
            }
            CharSequence charSequence = c4061.f15669;
            c4061.f15669 = charSequence;
            C2900 c29004 = c4061.f15657;
            if (c29004 != null) {
                c29004.setContentDescription(charSequence);
            }
            int i2 = c4061.f15671;
            c4061.f15671 = i2;
            C2900 c29005 = c4061.f15657;
            if (c29005 != null) {
                c29005.setAccessibilityLiveRegion(i2);
            }
            c4061.f15657.setVisibility(4);
            c4061.m9352(c4061.f15657, 0);
        } else {
            c4061.m9353();
            c4061.m9354(c4061.f15657, 0);
            c4061.f15657 = null;
            textInputLayout.m2891();
            textInputLayout.m2905();
        }
        c4061.f15670 = z;
    }

    public void setErrorIconDrawable(int i) {
        C4055 c4055 = this.f3424;
        c4055.m9340(i != 0 ? ᴵﹳ.ٴˎ.ˏᵢ(c4055.getContext(), i) : null);
        ˎˑ.ˎٴ(c4055.f15615, c4055.f15609, c4055.f15614);
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.f3424.m9340(drawable);
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        C4055 c4055 = this.f3424;
        CheckableImageButton checkableImageButton = c4055.f15609;
        View.OnLongClickListener onLongClickListener = c4055.f15620;
        checkableImageButton.setOnClickListener(onClickListener);
        ˎˑ.ﾞˊ(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        C4055 c4055 = this.f3424;
        c4055.f15620 = onLongClickListener;
        CheckableImageButton checkableImageButton = c4055.f15609;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        ˎˑ.ﾞˊ(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        C4055 c4055 = this.f3424;
        if (c4055.f15614 != colorStateList) {
            c4055.f15614 = colorStateList;
            ˎˑ.ـﹶ(c4055.f15615, c4055.f15609, colorStateList, c4055.f15606);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        C4055 c4055 = this.f3424;
        if (c4055.f15606 != mode) {
            c4055.f15606 = mode;
            ˎˑ.ـﹶ(c4055.f15615, c4055.f15609, c4055.f15614, mode);
        }
    }

    public void setErrorTextAppearance(int i) {
        C4061 c4061 = this.f3446;
        c4061.f15651 = i;
        C2900 c2900 = c4061.f15657;
        if (c2900 != null) {
            c4061.f15660.m2888(c2900, i);
        }
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        C4061 c4061 = this.f3446;
        c4061.f15655 = colorStateList;
        C2900 c2900 = c4061.f15657;
        if (c2900 == null || colorStateList == null) {
            return;
        }
        c2900.setTextColor(colorStateList);
    }

    public void setExpandedHintEnabled(boolean z) {
        if (this.f3402 != z) {
            this.f3402 = z;
            m2886(false, false);
        }
    }

    public void setHelperText(CharSequence charSequence) {
        boolean zIsEmpty = TextUtils.isEmpty(charSequence);
        C4061 c4061 = this.f3446;
        if (zIsEmpty) {
            if (c4061.f15675) {
                setHelperTextEnabled(false);
                return;
            }
            return;
        }
        if (!c4061.f15675) {
            setHelperTextEnabled(true);
        }
        c4061.m9351();
        c4061.f15676 = charSequence;
        c4061.f15663.setText(charSequence);
        int i = c4061.f15668;
        if (i != 2) {
            c4061.f15659 = 2;
        }
        c4061.m9356(i, c4061.m9350(c4061.f15663, charSequence), c4061.f15659);
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        C4061 c4061 = this.f3446;
        c4061.f15652 = colorStateList;
        C2900 c2900 = c4061.f15663;
        if (c2900 == null || colorStateList == null) {
            return;
        }
        c2900.setTextColor(colorStateList);
    }

    public void setHelperTextEnabled(boolean z) {
        C4061 c4061 = this.f3446;
        if (c4061.f15675 == z) {
            return;
        }
        c4061.m9351();
        if (z) {
            C2900 c2900 = new C2900(c4061.f15666, null);
            c4061.f15663 = c2900;
            c2900.setId(org.lsposed.hiddenapibypass.library.R.id._2_res_0x7f0b0390);
            c4061.f15663.setTextAlignment(5);
            Typeface typeface = c4061.f15667;
            if (typeface != null) {
                c4061.f15663.setTypeface(typeface);
            }
            c4061.f15663.setVisibility(4);
            c4061.f15663.setAccessibilityLiveRegion(1);
            int i = c4061.f15672;
            c4061.f15672 = i;
            C2900 c29002 = c4061.f15663;
            if (c29002 != null) {
                ˉⁱ.ﹳˑ(c29002, i);
            }
            ColorStateList colorStateList = c4061.f15652;
            c4061.f15652 = colorStateList;
            C2900 c29003 = c4061.f15663;
            if (c29003 != null && colorStateList != null) {
                c29003.setTextColor(colorStateList);
            }
            c4061.m9352(c4061.f15663, 1);
            c4061.f15663.setAccessibilityDelegate(new C0169(1, c4061));
        } else {
            c4061.m9351();
            int i2 = c4061.f15668;
            if (i2 == 2) {
                c4061.f15659 = 0;
            }
            c4061.m9356(i2, c4061.m9350(c4061.f15663, ""), c4061.f15659);
            c4061.m9354(c4061.f15663, 1);
            c4061.f15663 = null;
            TextInputLayout textInputLayout = c4061.f15660;
            textInputLayout.m2891();
            textInputLayout.m2905();
        }
        c4061.f15675 = z;
    }

    public void setHelperTextTextAppearance(int i) {
        C4061 c4061 = this.f3446;
        c4061.f15672 = i;
        C2900 c2900 = c4061.f15663;
        if (c2900 != null) {
            ˉⁱ.ﹳˑ(c2900, i);
        }
    }

    public void setHint(int i) {
        setHint(i != 0 ? getResources().getText(i) : null);
    }

    public void setHint(CharSequence charSequence) {
        if (this.f3435) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z) {
        this.f3407 = z;
    }

    public void setHintEnabled(boolean z) {
        if (z != this.f3435) {
            this.f3435 = z;
            if (z) {
                CharSequence hint = this.f3443.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.f3399)) {
                        setHint(hint);
                    }
                    this.f3443.setHint((CharSequence) null);
                }
                this.f3413 = true;
            } else {
                this.f3413 = false;
                if (!TextUtils.isEmpty(this.f3399) && TextUtils.isEmpty(this.f3443.getHint())) {
                    this.f3443.setHint(this.f3399);
                }
                setHintInternal(null);
            }
            if (this.f3443 != null) {
                m2902();
            }
        }
    }

    public void setHintTextAppearance(int i) {
        C2841 c2841 = this.f3409;
        TextInputLayout textInputLayout = c2841.f11037;
        C3057 c3057 = new C3057(textInputLayout.getContext(), i);
        ColorStateList colorStateList = c3057.f11775;
        if (colorStateList != null) {
            c2841.f11027 = colorStateList;
        }
        float f = c3057.f11773;
        if (f != 0.0f) {
            c2841.f11057 = f;
        }
        ColorStateList colorStateList2 = c3057.f11780;
        if (colorStateList2 != null) {
            c2841.f11048 = colorStateList2;
        }
        c2841.f11049 = c3057.f11781;
        c2841.f11005 = c3057.f11782;
        c2841.f11026 = c3057.f11777;
        c2841.f11047 = c3057.f11772;
        C3056 c3056 = c2841.f11034;
        if (c3056 != null) {
            c3056.f11767 = true;
        }
        ˋˉ r3 = new ˋˉ(5, c2841);
        c3057.m7547();
        c2841.f11034 = new C3056(r3, c3057.f11779);
        c3057.m7544(textInputLayout.getContext(), c2841.f11034);
        c2841.m7127(false);
        this.f3459 = c2841.f11027;
        if (this.f3443 != null) {
            m2886(false, false);
            m2902();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.f3459 != colorStateList) {
            if (this.f3463 == null) {
                C2841 c2841 = this.f3409;
                if (c2841.f11027 != colorStateList) {
                    c2841.f11027 = colorStateList;
                    c2841.m7127(false);
                }
            }
            this.f3459 = colorStateList;
            if (this.f3443 != null) {
                m2886(false, false);
            }
        }
    }

    public void setLengthCounter(InterfaceC4072 interfaceC4072) {
        this.f3431 = interfaceC4072;
    }

    public void setMaxEms(int i) {
        this.f3466 = i;
        EditText editText = this.f3443;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMaxEms(i);
    }

    public void setMaxWidth(int i) {
        this.f3438 = i;
        EditText editText = this.f3443;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMaxWidth(i);
    }

    public void setMaxWidthResource(int i) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i));
    }

    public void setMinEms(int i) {
        this.f3458 = i;
        EditText editText = this.f3443;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMinEms(i);
    }

    public void setMinWidth(int i) {
        this.f3420 = i;
        EditText editText = this.f3443;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMinWidth(i);
    }

    public void setMinWidthResource(int i) {
        setMinWidth(getContext().getResources().getDimensionPixelSize(i));
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i) {
        C4055 c4055 = this.f3424;
        c4055.f15622.setContentDescription(i != 0 ? c4055.getResources().getText(i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.f3424.f15622.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i) {
        C4055 c4055 = this.f3424;
        c4055.f15622.setImageDrawable(i != 0 ? ᴵﹳ.ٴˎ.ˏᵢ(c4055.getContext(), i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.f3424.f15622.setImageDrawable(drawable);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z) {
        C4055 c4055 = this.f3424;
        if (z && c4055.f15613 != 1) {
            c4055.m9337(1);
        } else if (z) {
            c4055.getClass();
        } else {
            c4055.m9337(0);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        C4055 c4055 = this.f3424;
        c4055.f15624 = colorStateList;
        ˎˑ.ـﹶ(c4055.f15615, c4055.f15622, colorStateList, c4055.f15604);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        C4055 c4055 = this.f3424;
        c4055.f15604 = mode;
        ˎˑ.ـﹶ(c4055.f15615, c4055.f15622, c4055.f15624, mode);
    }

    public void setPlaceholderText(CharSequence charSequence) {
        if (this.f3453 == null) {
            C2900 c2900 = new C2900(getContext(), null);
            this.f3453 = c2900;
            c2900.setId(org.lsposed.hiddenapibypass.library.R.id._2_res_0x7f0b0391);
            this.f3453.setImportantForAccessibility(2);
            C2158 c2158M2903 = m2903();
            this.f3422 = c2158M2903;
            c2158M2903.f8460 = 67L;
            this.f3449 = m2903();
            setPlaceholderTextAppearance(this.f3418);
            setPlaceholderTextColor(this.f3469);
        }
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.f3455) {
                setPlaceholderTextEnabled(true);
            }
            this.f3397 = charSequence;
        }
        EditText editText = this.f3443;
        m2889(editText != null ? editText.getText() : null);
    }

    public void setPlaceholderTextAppearance(int i) {
        this.f3418 = i;
        C2900 c2900 = this.f3453;
        if (c2900 != null) {
            ˉⁱ.ﹳˑ(c2900, i);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.f3469 != colorStateList) {
            this.f3469 = colorStateList;
            C2900 c2900 = this.f3453;
            if (c2900 == null || colorStateList == null) {
                return;
            }
            c2900.setTextColor(colorStateList);
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        C4068 c4068 = this.f3410;
        c4068.getClass();
        c4068.f15695 = TextUtils.isEmpty(charSequence) ? null : charSequence;
        c4068.f15692.setText(charSequence);
        c4068.m9364();
    }

    public void setPrefixTextAppearance(int i) {
        ˉⁱ.ﹳˑ(this.f3410.f15692, i);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.f3410.f15692.setTextColor(colorStateList);
    }

    public void setShapeAppearanceModel(C4089 c4089) {
        C4105 c4105 = this.f3403;
        if (c4105 == null || c4105.f15848.f15817 == c4089) {
            return;
        }
        this.f3427 = c4089;
        m2884();
    }

    public void setStartIconCheckable(boolean z) {
        this.f3410.f15697.setCheckable(z);
    }

    public void setStartIconContentDescription(int i) {
        setStartIconContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.f3410.f15697;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setStartIconDrawable(int i) {
        setStartIconDrawable(i != 0 ? ᴵﹳ.ٴˎ.ˏᵢ(getContext(), i) : null);
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.f3410.m9363(drawable);
    }

    public void setStartIconMinSize(int i) {
        C4068 c4068 = this.f3410;
        if (i < 0) {
            c4068.getClass();
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        }
        if (i != c4068.f15701) {
            c4068.f15701 = i;
            CheckableImageButton checkableImageButton = c4068.f15697;
            checkableImageButton.setMinimumWidth(i);
            checkableImageButton.setMinimumHeight(i);
        }
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        C4068 c4068 = this.f3410;
        View.OnLongClickListener onLongClickListener = c4068.f15696;
        CheckableImageButton checkableImageButton = c4068.f15697;
        checkableImageButton.setOnClickListener(onClickListener);
        ˎˑ.ﾞˊ(checkableImageButton, onLongClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        C4068 c4068 = this.f3410;
        c4068.f15696 = onLongClickListener;
        CheckableImageButton checkableImageButton = c4068.f15697;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        ˎˑ.ﾞˊ(checkableImageButton, onLongClickListener);
    }

    public void setStartIconScaleType(ImageView.ScaleType scaleType) {
        C4068 c4068 = this.f3410;
        c4068.f15694 = scaleType;
        c4068.f15697.setScaleType(scaleType);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        C4068 c4068 = this.f3410;
        if (c4068.f15693 != colorStateList) {
            c4068.f15693 = colorStateList;
            ˎˑ.ـﹶ(c4068.f15698, c4068.f15697, colorStateList, c4068.f15700);
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        C4068 c4068 = this.f3410;
        if (c4068.f15700 != mode) {
            c4068.f15700 = mode;
            ˎˑ.ـﹶ(c4068.f15698, c4068.f15697, c4068.f15693, mode);
        }
    }

    public void setStartIconVisible(boolean z) {
        this.f3410.m9365(z);
    }

    public void setSuffixText(CharSequence charSequence) {
        C4055 c4055 = this.f3424;
        c4055.getClass();
        c4055.f15610 = TextUtils.isEmpty(charSequence) ? null : charSequence;
        c4055.f15619.setText(charSequence);
        c4055.m9338();
    }

    public void setSuffixTextAppearance(int i) {
        ˉⁱ.ﹳˑ(this.f3424.f15619, i);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.f3424.f15619.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(C4054 c4054) {
        EditText editText = this.f3443;
        if (editText != null) {
            AbstractC4345.m9884(editText, c4054);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.f3417) {
            this.f3417 = typeface;
            this.f3409.m7121(typeface);
            C4061 c4061 = this.f3446;
            if (typeface != c4061.f15667) {
                c4061.f15667 = typeface;
                C2900 c2900 = c4061.f15657;
                if (c2900 != null) {
                    c2900.setTypeface(typeface);
                }
                C2900 c29002 = c4061.f15663;
                if (c29002 != null) {
                    c29002.setTypeface(typeface);
                }
            }
            C2900 c29003 = this.f3461;
            if (c29003 != null) {
                c29003.setTypeface(typeface);
            }
        }
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final void m2884() {
        int i;
        int i2;
        C4105 c4105 = this.f3403;
        if (c4105 == null) {
            return;
        }
        C4089 c4089 = c4105.f15848.f15817;
        C4089 c40892 = this.f3427;
        if (c4089 != c40892) {
            c4105.setShapeAppearanceModel(c40892);
        }
        if (this.f3471 == 2 && (i = this.f3442) > -1 && (i2 = this.f3412) != 0) {
            C4105 c41052 = this.f3403;
            c41052.f15848.f15812 = i;
            c41052.invalidateSelf();
            ColorStateList colorStateListValueOf = ColorStateList.valueOf(i2);
            C4098 c4098 = c41052.f15848;
            if (c4098.f15808 != colorStateListValueOf) {
                c4098.f15808 = colorStateListValueOf;
                c41052.onStateChange(c41052.getState());
            }
        }
        int iM10939 = this.f3462;
        if (this.f3471 == 1) {
            iM10939 = AbstractC4862.m10939(this.f3462, AbstractC3362.m8196(getContext(), org.lsposed.hiddenapibypass.library.R.attr._2_res_0x7f040169, 0));
        }
        this.f3462 = iM10939;
        this.f3403.m9407(ColorStateList.valueOf(iM10939));
        C4105 c41053 = this.f3452;
        if (c41053 != null && this.f3450 != null) {
            if (this.f3442 > -1 && this.f3412 != 0) {
                c41053.m9407(this.f3443.isFocused() ? ColorStateList.valueOf(this.f3447) : ColorStateList.valueOf(this.f3412));
                this.f3450.m9407(ColorStateList.valueOf(this.f3412));
            }
            invalidate();
        }
        m2900();
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final boolean m2885() {
        return this.f3435 && !TextUtils.isEmpty(this.f3399) && (this.f3403 instanceof C4063);
    }

    /* renamed from: ʿˏ, reason: contains not printable characters */
    public final void m2886(boolean z, boolean z2) {
        ColorStateList colorStateList;
        C2900 c2900;
        boolean zIsEnabled = isEnabled();
        EditText editText = this.f3443;
        boolean z3 = (editText == null || TextUtils.isEmpty(editText.getText())) ? false : true;
        EditText editText2 = this.f3443;
        boolean z4 = editText2 != null && editText2.hasFocus();
        ColorStateList colorStateList2 = this.f3463;
        C2841 c2841 = this.f3409;
        if (colorStateList2 != null) {
            c2841.m7119(colorStateList2);
        }
        if (!zIsEnabled) {
            ColorStateList colorStateList3 = this.f3463;
            c2841.m7119(ColorStateList.valueOf(colorStateList3 != null ? colorStateList3.getColorForState(new int[]{-16842910}, this.f3414) : this.f3414));
        } else if (m2890()) {
            C2900 c29002 = this.f3446.f15657;
            c2841.m7119(c29002 != null ? c29002.getTextColors() : null);
        } else if (this.f3432 && (c2900 = this.f3461) != null) {
            c2841.m7119(c2900.getTextColors());
        } else if (z4 && (colorStateList = this.f3459) != null && c2841.f11027 != colorStateList) {
            c2841.f11027 = colorStateList;
            c2841.m7127(false);
        }
        C4055 c4055 = this.f3424;
        C4068 c4068 = this.f3410;
        if (z3 || !this.f3402 || (isEnabled() && z4)) {
            if (z2 || this.f3437) {
                ValueAnimator valueAnimator = this.f3425;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.f3425.cancel();
                }
                if (z && this.f3407) {
                    m2896(1.0f);
                } else {
                    c2841.m7120(1.0f);
                }
                this.f3437 = false;
                if (m2885()) {
                    m2887();
                }
                EditText editText3 = this.f3443;
                m2889(editText3 != null ? editText3.getText() : null);
                c4068.f15699 = false;
                c4068.m9364();
                c4055.f15603 = false;
                c4055.m9338();
                return;
            }
            return;
        }
        if (z2 || !this.f3437) {
            ValueAnimator valueAnimator2 = this.f3425;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.f3425.cancel();
            }
            if (z && this.f3407) {
                m2896(0.0f);
            } else {
                c2841.m7120(0.0f);
            }
            if (m2885() && !((C4063) this.f3403).f15680.f15583.isEmpty() && m2885()) {
                ((C4063) this.f3403).m9358(0.0f, 0.0f, 0.0f, 0.0f);
            }
            this.f3437 = true;
            C2900 c29003 = this.f3453;
            if (c29003 != null && this.f3455) {
                c29003.setText((CharSequence) null);
                AbstractC2124.m6024(this.f3445, this.f3449);
                this.f3453.setVisibility(4);
            }
            c4068.f15699 = true;
            c4068.m9364();
            c4055.f15603 = true;
            c4055.m9338();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x008d  */
    /* renamed from: ˉי, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m2887() {
        /*
            Method dump skipped, instructions count: 241
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.m2887():void");
    }

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public final void m2888(C2900 c2900, int i) {
        try {
            ˉⁱ.ﹳˑ(c2900, i);
        } catch (Exception unused) {
        }
        if (Build.VERSION.SDK_INT >= 23) {
            if (c2900.getTextColors().getDefaultColor() != -65281) {
                return;
            }
            ˉⁱ.ﹳˑ(c2900, org.lsposed.hiddenapibypass.library.R.style._2_res_0x7f1401f0);
            c2900.setTextColor(ﹳﹳ.ˏᴵ(getContext(), org.lsposed.hiddenapibypass.library.R.color._2_res_0x7f060095));
        }
    }

    /* renamed from: ˋˊ, reason: contains not printable characters */
    public final void m2889(Editable editable) {
        ((C3581) this.f3431).getClass();
        int length = editable != null ? editable.length() : 0;
        FrameLayout frameLayout = this.f3445;
        if (length != 0 || this.f3437) {
            C2900 c2900 = this.f3453;
            if (c2900 == null || !this.f3455) {
                return;
            }
            c2900.setText((CharSequence) null);
            AbstractC2124.m6024(frameLayout, this.f3449);
            this.f3453.setVisibility(4);
            return;
        }
        if (this.f3453 == null || !this.f3455 || TextUtils.isEmpty(this.f3397)) {
            return;
        }
        this.f3453.setText(this.f3397);
        AbstractC2124.m6024(frameLayout, this.f3422);
        this.f3453.setVisibility(0);
        this.f3453.bringToFront();
        announceForAccessibility(this.f3397);
    }

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public final boolean m2890() {
        C4061 c4061 = this.f3446;
        return (c4061.f15659 != 1 || c4061.f15657 == null || TextUtils.isEmpty(c4061.f15662)) ? false : true;
    }

    /* renamed from: ˎٴ, reason: contains not printable characters */
    public final void m2891() {
        Drawable background;
        C2900 c2900;
        EditText editText = this.f3443;
        if (editText == null || this.f3471 != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        int[] iArr = AbstractC2962.f11434;
        Drawable drawableMutate = background.mutate();
        if (m2890()) {
            drawableMutate.setColorFilter(C2964.m7338(getErrorCurrentTextColors(), PorterDuff.Mode.SRC_IN));
        } else if (this.f3432 && (c2900 = this.f3461) != null) {
            drawableMutate.setColorFilter(C2964.m7338(c2900.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
        } else {
            ˆˑ.ﹳﹳ.ʽᐧ(drawableMutate);
            this.f3443.refreshDrawableState();
        }
    }

    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public final void m2892() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        C2900 c2900 = this.f3461;
        if (c2900 != null) {
            m2888(c2900, this.f3432 ? this.f3426 : this.f3457);
            if (!this.f3432 && (colorStateList2 = this.f3408) != null) {
                this.f3461.setTextColor(colorStateList2);
            }
            if (!this.f3432 || (colorStateList = this.f3416) == null) {
                return;
            }
            this.f3461.setTextColor(colorStateList);
        }
    }

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final int m2893(int i, boolean z) {
        return i - ((z || getSuffixText() == null) ? (!z || getPrefixText() == null) ? this.f3443.getCompoundPaddingRight() : this.f3410.m9366() : this.f3424.m9334());
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final int m2894() {
        float fM7118;
        if (!this.f3435) {
            return 0;
        }
        int i = this.f3471;
        C2841 c2841 = this.f3409;
        if (i == 0) {
            fM7118 = c2841.m7118();
        } else {
            if (i != 2) {
                return 0;
            }
            fM7118 = c2841.m7118() / 2.0f;
        }
        return (int) fM7118;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: ˑי, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m2895() {
        /*
            r4 = this;
            android.content.res.ColorStateList r0 = r4.f3464
            if (r0 == 0) goto L5
            goto L26
        L5:
            android.content.Context r0 = r4.getContext()
            r1 = 2130968882(0x7f040132, float:1.754643E38)
            android.util.TypedValue r1 = ⁱـ.ˑי.ᵎˏ(r0, r1)
            r2 = 0
            if (r1 != 0) goto L15
        L13:
            r0 = r2
            goto L26
        L15:
            int r3 = r1.resourceId
            if (r3 == 0) goto L1e
            android.content.res.ColorStateList r0 = com.bumptech.glide.ﹳﹳ.ˑי(r0, r3)
            goto L26
        L1e:
            int r0 = r1.data
            if (r0 == 0) goto L13
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r0)
        L26:
            android.widget.EditText r1 = r4.f3443
            if (r1 == 0) goto L55
            android.graphics.drawable.Drawable r1 = p337.AbstractC3821.m8909(r1)
            if (r1 != 0) goto L31
            goto L55
        L31:
            android.widget.EditText r1 = r4.f3443
            android.graphics.drawable.Drawable r1 = p337.AbstractC3821.m8909(r1)
            android.graphics.drawable.Drawable r1 = ˆˑ.ﹳﹳ.ᵢʿ(r1)
            android.graphics.drawable.Drawable r1 = r1.mutate()
            boolean r2 = r4.m2890()
            if (r2 != 0) goto L4d
            ˏᴵ.ˎˉ r2 = r4.f3461
            if (r2 == 0) goto L52
            boolean r2 = r4.f3432
            if (r2 == 0) goto L52
        L4d:
            android.content.res.ColorStateList r2 = r4.f3423
            if (r2 == 0) goto L52
            r0 = r2
        L52:
            r1.setTintList(r0)
        L55:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.m2895():void");
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void m2896(float f) {
        int i = 1;
        C2841 c2841 = this.f3409;
        if (c2841.f11007 == f) {
            return;
        }
        if (this.f3425 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f3425 = valueAnimator;
            valueAnimator.setInterpolator(ˎˑ.ﹳˎ(getContext(), org.lsposed.hiddenapibypass.library.R.attr._2_res_0x7f040414, AbstractC2840.f11001));
            this.f3425.setDuration(ˎˑ.ᵎˏ(getContext(), org.lsposed.hiddenapibypass.library.R.attr._2_res_0x7f04040a, 167));
            this.f3425.addUpdateListener(new C1405(i, this));
        }
        this.f3425.setFloatValues(c2841.f11007, f);
        this.f3425.start();
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final C4105 m2897(boolean z) throws Resources.NotFoundException {
        float dimensionPixelOffset = getResources().getDimensionPixelOffset(org.lsposed.hiddenapibypass.library.R.dimen._2_res_0x7f070427);
        float f = z ? dimensionPixelOffset : 0.0f;
        EditText editText = this.f3443;
        float popupElevation = editText instanceof C4056 ? ((C4056) editText).getPopupElevation() : getResources().getDimensionPixelOffset(org.lsposed.hiddenapibypass.library.R.dimen._2_res_0x7f070283);
        int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(org.lsposed.hiddenapibypass.library.R.dimen._2_res_0x7f0703e8);
        C4091 c4091 = new C4091();
        C4091 c40912 = new C4091();
        C4091 c40913 = new C4091();
        C4091 c40914 = new C4091();
        ٴˎ r10 = new ٴˎ(0);
        ٴˎ r11 = new ٴˎ(0);
        ٴˎ r12 = new ٴˎ(0);
        ٴˎ r13 = new ٴˎ(0);
        C4097 c4097 = new C4097(f);
        C4097 c40972 = new C4097(f);
        C4097 c40973 = new C4097(dimensionPixelOffset);
        C4097 c40974 = new C4097(dimensionPixelOffset);
        C4089 c4089 = new C4089();
        c4089.f15778 = c4091;
        c4089.f15771 = c40912;
        c4089.f15777 = c40913;
        c4089.f15781 = c40914;
        c4089.f15772 = c4097;
        c4089.f15779 = c40972;
        c4089.f15780 = c40974;
        c4089.f15776 = c40973;
        c4089.f15782 = r10;
        c4089.f15773 = r11;
        c4089.f15775 = r12;
        c4089.f15774 = r13;
        EditText editText2 = this.f3443;
        ColorStateList dropDownBackgroundTintList = editText2 instanceof C4056 ? ((C4056) editText2).getDropDownBackgroundTintList() : null;
        Context context = getContext();
        if (dropDownBackgroundTintList == null) {
            Paint paint = C4105.f15844;
            TypedValue typedValue = ˑי.ʿˏ(org.lsposed.hiddenapibypass.library.R.attr._2_res_0x7f040169, context, C4105.class.getSimpleName());
            int i = typedValue.resourceId;
            dropDownBackgroundTintList = ColorStateList.valueOf(i != 0 ? ﹳﹳ.ˏᴵ(context, i) : typedValue.data);
        }
        C4105 c4105 = new C4105();
        c4105.m9405(context);
        c4105.m9407(dropDownBackgroundTintList);
        c4105.m9406(popupElevation);
        c4105.setShapeAppearanceModel(c4089);
        C4098 c4098 = c4105.f15848;
        if (c4098.f15814 == null) {
            c4098.f15814 = new Rect();
        }
        c4105.f15848.f15814.set(0, dimensionPixelOffset2, 0, dimensionPixelOffset2);
        c4105.invalidateSelf();
        return c4105;
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final int m2898(int i, boolean z) {
        return ((z || getPrefixText() == null) ? (!z || getSuffixText() == null) ? this.f3443.getCompoundPaddingLeft() : this.f3424.m9334() : this.f3410.m9366()) + i;
    }

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public final void m2899(Editable editable) {
        ((C3581) this.f3431).getClass();
        int length = editable != null ? editable.length() : 0;
        boolean z = this.f3432;
        int i = this.f3405;
        String string = null;
        if (i == -1) {
            this.f3461.setText(String.valueOf(length));
            this.f3461.setContentDescription(null);
            this.f3432 = false;
        } else {
            this.f3432 = length > i;
            Context context = getContext();
            this.f3461.setContentDescription(context.getString(this.f3432 ? org.lsposed.hiddenapibypass.library.R.string._2_res_0x7f130036 : org.lsposed.hiddenapibypass.library.R.string._2_res_0x7f130035, Integer.valueOf(length), Integer.valueOf(this.f3405)));
            if (z != this.f3432) {
                m2892();
            }
            String str = C3107.f11991;
            C3107 c3107 = TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1 ? C3107.f11992 : C3107.f11994;
            C2900 c2900 = this.f3461;
            String string2 = getContext().getString(org.lsposed.hiddenapibypass.library.R.string._2_res_0x7f130037, Integer.valueOf(length), Integer.valueOf(this.f3405));
            if (string2 == null) {
                c3107.getClass();
            } else {
                c3107.getClass();
                C2428 c2428 = AbstractC3112.f12004;
                string = c3107.m7624(string2).toString();
            }
            c2900.setText(string);
        }
        if (this.f3443 == null || z == this.f3432) {
            return;
        }
        m2886(false, false);
        m2905();
        m2891();
    }

    /* renamed from: ᵎˏ, reason: contains not printable characters */
    public final void m2900() {
        EditText editText = this.f3443;
        if (editText == null || this.f3403 == null) {
            return;
        }
        if ((this.f3439 || editText.getBackground() == null) && this.f3471 != 0) {
            this.f3443.setBackground(getEditTextBoxBackground());
            this.f3439 = true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005f  */
    /* renamed from: ᵎـ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m2901() {
        /*
            Method dump skipped, instructions count: 307
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.m2901():boolean");
    }

    /* renamed from: ﹳˎ, reason: contains not printable characters */
    public final void m2902() {
        if (this.f3471 != 1) {
            FrameLayout frameLayout = this.f3445;
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) frameLayout.getLayoutParams();
            int iM2894 = m2894();
            if (iM2894 != layoutParams.topMargin) {
                layoutParams.topMargin = iM2894;
                frameLayout.requestLayout();
            }
        }
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final C2158 m2903() {
        C2158 c2158 = new C2158();
        c2158.f8466 = ˎˑ.ᵎˏ(getContext(), org.lsposed.hiddenapibypass.library.R.attr._2_res_0x7f04040c, 87);
        c2158.f8471 = ˎˑ.ﹳˎ(getContext(), org.lsposed.hiddenapibypass.library.R.attr._2_res_0x7f040416, AbstractC2840.f11003);
        return c2158;
    }

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final void m2904() {
        int i = this.f3471;
        if (i == 0) {
            this.f3403 = null;
            this.f3452 = null;
            this.f3450 = null;
        } else if (i == 1) {
            this.f3403 = new C4105(this.f3427);
            this.f3452 = new C4105();
            this.f3450 = new C4105();
        } else {
            if (i != 2) {
                throw new IllegalArgumentException(AbstractC5179.m11550(new StringBuilder(), this.f3471, " is illegal; only @BoxBackgroundMode constants are supported."));
            }
            if (!this.f3435 || (this.f3403 instanceof C4063)) {
                this.f3403 = new C4105(this.f3427);
            } else {
                C4089 c4089 = this.f3427;
                int i2 = C4063.f15679;
                if (c4089 == null) {
                    c4089 = new C4089();
                }
                C4050 c4050 = new C4050(c4089, new RectF());
                C4063 c4063 = new C4063(c4050);
                c4063.f15680 = c4050;
                this.f3403 = c4063;
            }
            this.f3452 = null;
            this.f3450 = null;
        }
        m2900();
        m2905();
        if (this.f3471 == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                this.f3396 = getResources().getDimensionPixelSize(org.lsposed.hiddenapibypass.library.R.dimen._2_res_0x7f07037d);
            } else if (ـﹶ.ˈٴ(getContext())) {
                this.f3396 = getResources().getDimensionPixelSize(org.lsposed.hiddenapibypass.library.R.dimen._2_res_0x7f07037c);
            }
        }
        if (this.f3443 != null && this.f3471 == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                EditText editText = this.f3443;
                editText.setPaddingRelative(editText.getPaddingStart(), getResources().getDimensionPixelSize(org.lsposed.hiddenapibypass.library.R.dimen._2_res_0x7f07037b), this.f3443.getPaddingEnd(), getResources().getDimensionPixelSize(org.lsposed.hiddenapibypass.library.R.dimen._2_res_0x7f07037a));
            } else if (ـﹶ.ˈٴ(getContext())) {
                EditText editText2 = this.f3443;
                editText2.setPaddingRelative(editText2.getPaddingStart(), getResources().getDimensionPixelSize(org.lsposed.hiddenapibypass.library.R.dimen._2_res_0x7f070379), this.f3443.getPaddingEnd(), getResources().getDimensionPixelSize(org.lsposed.hiddenapibypass.library.R.dimen._2_res_0x7f070378));
            }
        }
        if (this.f3471 != 0) {
            m2902();
        }
        EditText editText3 = this.f3443;
        if (editText3 instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText3;
            if (autoCompleteTextView.getDropDownBackground() == null) {
                int i3 = this.f3471;
                if (i3 == 2) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateOutlinedDropDownMenuBackground());
                } else if (i3 == 1) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateFilledDropDownMenuBackground());
                }
            }
        }
    }

    /* renamed from: ﾞʽ, reason: contains not printable characters */
    public final void m2905() {
        C2900 c2900;
        EditText editText;
        EditText editText2;
        if (this.f3403 == null || this.f3471 == 0) {
            return;
        }
        boolean z = false;
        boolean z2 = isFocused() || ((editText2 = this.f3443) != null && editText2.hasFocus());
        if (isHovered() || ((editText = this.f3443) != null && editText.isHovered())) {
            z = true;
        }
        if (!isEnabled()) {
            this.f3412 = this.f3414;
        } else if (m2890()) {
            if (this.f3434 != null) {
                m2906(z2, z);
            } else {
                this.f3412 = getErrorCurrentTextColors();
            }
        } else if (!this.f3432 || (c2900 = this.f3461) == null) {
            if (z2) {
                this.f3412 = this.f3456;
            } else if (z) {
                this.f3412 = this.f3448;
            } else {
                this.f3412 = this.f3447;
            }
        } else if (this.f3434 != null) {
            m2906(z2, z);
        } else {
            this.f3412 = c2900.getCurrentTextColor();
        }
        if (Build.VERSION.SDK_INT >= 29) {
            m2895();
        }
        C4055 c4055 = this.f3424;
        c4055.m9330();
        CheckableImageButton checkableImageButton = c4055.f15609;
        ColorStateList colorStateList = c4055.f15614;
        TextInputLayout textInputLayout = c4055.f15615;
        ˎˑ.ˎٴ(textInputLayout, checkableImageButton, colorStateList);
        ColorStateList colorStateList2 = c4055.f15624;
        CheckableImageButton checkableImageButton2 = c4055.f15622;
        ˎˑ.ˎٴ(textInputLayout, checkableImageButton2, colorStateList2);
        if (c4055.m9327() instanceof C4052) {
            if (!textInputLayout.m2890() || checkableImageButton2.getDrawable() == null) {
                ˎˑ.ـﹶ(textInputLayout, checkableImageButton2, c4055.f15624, c4055.f15604);
            } else {
                Drawable drawableMutate = ˆˑ.ﹳﹳ.ᵢʿ(checkableImageButton2.getDrawable()).mutate();
                drawableMutate.setTint(textInputLayout.getErrorCurrentTextColors());
                checkableImageButton2.setImageDrawable(drawableMutate);
            }
        }
        C4068 c4068 = this.f3410;
        ˎˑ.ˎٴ(c4068.f15698, c4068.f15697, c4068.f15693);
        if (this.f3471 == 2) {
            int i = this.f3442;
            if (z2 && isEnabled()) {
                this.f3442 = this.f3406;
            } else {
                this.f3442 = this.f3419;
            }
            if (this.f3442 != i && m2885() && !this.f3437) {
                if (m2885()) {
                    ((C4063) this.f3403).m9358(0.0f, 0.0f, 0.0f, 0.0f);
                }
                m2887();
            }
        }
        if (this.f3471 == 1) {
            if (!isEnabled()) {
                this.f3462 = this.f3415;
            } else if (z && !z2) {
                this.f3462 = this.f3433;
            } else if (z2) {
                this.f3462 = this.f3421;
            } else {
                this.f3462 = this.f3400;
            }
        }
        m2884();
    }

    /* renamed from: ﾞˊ, reason: contains not printable characters */
    public final void m2906(boolean z, boolean z2) {
        int defaultColor = this.f3434.getDefaultColor();
        int colorForState = this.f3434.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, defaultColor);
        int colorForState2 = this.f3434.getColorForState(new int[]{R.attr.state_activated, R.attr.state_enabled}, defaultColor);
        if (z) {
            this.f3412 = colorForState2;
        } else if (z2) {
            this.f3412 = colorForState;
        } else {
            this.f3412 = defaultColor;
        }
    }
}
