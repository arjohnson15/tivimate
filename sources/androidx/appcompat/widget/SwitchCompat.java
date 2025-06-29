package androidx.appcompat.widget;

import android.R;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import androidx.leanback.widget.C0148;
import com.bumptech.glide.ﹳﹳ;
import java.lang.reflect.InvocationTargetException;
import java.util.WeakHashMap;
import p019.C1122;
import p146.C2246;
import p192.C2676;
import p222.AbstractC2873;
import p222.AbstractC2926;
import p222.AbstractC2962;
import p222.C2941;
import p222.C2972;
import p300.AbstractC3505;
import p331.C3762;
import p378.AbstractC4345;
import p378.C4393;
import ˈⁱ.ˉⁱ;
import ᴵﹳ.ٴˎ;
import ⁱـ.ˑי;

/* loaded from: classes.dex */
public class SwitchCompat extends CompoundButton {

    /* renamed from: ʻʻ, reason: contains not printable characters */
    public C1122 f165;

    /* renamed from: ʻʿ, reason: contains not printable characters */
    public CharSequence f166;

    /* renamed from: ʻﹳ, reason: contains not printable characters */
    public int f167;

    /* renamed from: ʽˆ, reason: contains not printable characters */
    public int f168;

    /* renamed from: ʾʼ, reason: contains not printable characters */
    public int f169;

    /* renamed from: ʿˊ, reason: contains not printable characters */
    public final int f170;

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public ColorStateList f171;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public boolean f172;

    /* renamed from: ˈﹳ, reason: contains not printable characters */
    public int f173;

    /* renamed from: ˉᵎ, reason: contains not printable characters */
    public float f174;

    /* renamed from: ˊᵔ, reason: contains not printable characters */
    public float f175;

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public PorterDuff.Mode f176;

    /* renamed from: ˋﾞ, reason: contains not printable characters */
    public float f177;

    /* renamed from: ˎˉ, reason: contains not printable characters */
    public int f178;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public PorterDuff.Mode f179;

    /* renamed from: ˎᵔ, reason: contains not printable characters */
    public CharSequence f180;

    /* renamed from: ˎᵢ, reason: contains not printable characters */
    public StaticLayout f181;

    /* renamed from: ˑʾ, reason: contains not printable characters */
    public final C2246 f182;

    /* renamed from: ˑⁱ, reason: contains not printable characters */
    public boolean f183;

    /* renamed from: ˑﾞ, reason: contains not printable characters */
    public int f184;

    /* renamed from: יˋ, reason: contains not printable characters */
    public int f185;

    /* renamed from: ـˆ, reason: contains not printable characters */
    public boolean f186;

    /* renamed from: ـᵎ, reason: contains not printable characters */
    public final TextPaint f187;

    /* renamed from: ٴᐧ, reason: contains not printable characters */
    public int f188;

    /* renamed from: ٴﹶ, reason: contains not printable characters */
    public boolean f189;

    /* renamed from: ᐧʼ, reason: contains not printable characters */
    public final Rect f190;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public boolean f191;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public Drawable f192;

    /* renamed from: ᴵʼ, reason: contains not printable characters */
    public boolean f193;

    /* renamed from: ᵎʽ, reason: contains not printable characters */
    public final VelocityTracker f194;

    /* renamed from: ᵎʾ, reason: contains not printable characters */
    public StaticLayout f195;

    /* renamed from: ᵎᵢ, reason: contains not printable characters */
    public final ColorStateList f196;

    /* renamed from: ᵔ, reason: contains not printable characters */
    public int f197;

    /* renamed from: ᵔٴ, reason: contains not printable characters */
    public boolean f198;

    /* renamed from: ᵔﹳ, reason: contains not printable characters */
    public CharSequence f199;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public Drawable f200;

    /* renamed from: ᵢٴ, reason: contains not printable characters */
    public CharSequence f201;

    /* renamed from: ⁱʿ, reason: contains not printable characters */
    public int f202;

    /* renamed from: ⁱⁱ, reason: contains not printable characters */
    public ObjectAnimator f203;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public ColorStateList f204;

    /* renamed from: ﾞˎ, reason: contains not printable characters */
    public final int f205;

    /* renamed from: ﾞᐧ, reason: contains not printable characters */
    public int f206;

    /* renamed from: ﾞﾞ, reason: contains not printable characters */
    public C2972 f207;

    /* renamed from: ˊﹶ, reason: contains not printable characters */
    public static final C0148 f164 = new C0148(Float.class, "thumbPos", 16);

    /* renamed from: ʾˈ, reason: contains not printable characters */
    public static final int[] f163 = {R.attr.state_checked};

    public SwitchCompat(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        int resourceId;
        super(context, attributeSet, org.lsposed.hiddenapibypass.library.R.attr._2_res_0x7f040577);
        this.f171 = null;
        this.f179 = null;
        this.f191 = false;
        this.f172 = false;
        this.f204 = null;
        this.f176 = null;
        this.f186 = false;
        this.f193 = false;
        this.f194 = VelocityTracker.obtain();
        this.f189 = true;
        this.f190 = new Rect();
        AbstractC2873.m7187(getContext(), this);
        TextPaint textPaint = new TextPaint(1);
        this.f187 = textPaint;
        textPaint.density = getResources().getDisplayMetrics().density;
        int[] iArr = AbstractC3505.f13579;
        C3762 c3762M8778 = C3762.m8778(context, attributeSet, iArr, org.lsposed.hiddenapibypass.library.R.attr._2_res_0x7f040577);
        AbstractC4345.m9881(this, context, iArr, attributeSet, (TypedArray) c3762M8778.f14531, org.lsposed.hiddenapibypass.library.R.attr._2_res_0x7f040577);
        Drawable drawableM8784 = c3762M8778.m8784(2);
        this.f192 = drawableM8784;
        if (drawableM8784 != null) {
            drawableM8784.setCallback(this);
        }
        Drawable drawableM87842 = c3762M8778.m8784(11);
        this.f200 = drawableM87842;
        if (drawableM87842 != null) {
            drawableM87842.setCallback(this);
        }
        TypedArray typedArray = (TypedArray) c3762M8778.f14531;
        setTextOnInternal(typedArray.getText(0));
        setTextOffInternal(typedArray.getText(1));
        this.f198 = typedArray.getBoolean(3, true);
        this.f206 = typedArray.getDimensionPixelSize(8, 0);
        this.f169 = typedArray.getDimensionPixelSize(5, 0);
        this.f184 = typedArray.getDimensionPixelSize(6, 0);
        this.f183 = typedArray.getBoolean(4, false);
        ColorStateList colorStateListM8782 = c3762M8778.m8782(9);
        if (colorStateListM8782 != null) {
            this.f171 = colorStateListM8782;
            this.f191 = true;
        }
        PorterDuff.Mode modeM7331 = AbstractC2962.m7331(typedArray.getInt(10, -1), null);
        if (this.f179 != modeM7331) {
            this.f179 = modeM7331;
            this.f172 = true;
        }
        if (this.f191 || this.f172) {
            m141();
        }
        ColorStateList colorStateListM87822 = c3762M8778.m8782(12);
        if (colorStateListM87822 != null) {
            this.f204 = colorStateListM87822;
            this.f186 = true;
        }
        PorterDuff.Mode modeM73312 = AbstractC2962.m7331(typedArray.getInt(13, -1), null);
        if (this.f176 != modeM73312) {
            this.f176 = modeM73312;
            this.f193 = true;
        }
        if (this.f186 || this.f193) {
            m139();
        }
        int resourceId2 = typedArray.getResourceId(7, 0);
        if (resourceId2 != 0) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(resourceId2, AbstractC3505.f13599);
            ColorStateList colorStateList = (!typedArrayObtainStyledAttributes.hasValue(3) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(3, 0)) == 0 || (colorStateList = ﹳﹳ.ˑי(context, resourceId)) == null) ? typedArrayObtainStyledAttributes.getColorStateList(3) : colorStateList;
            if (colorStateList != null) {
                this.f196 = colorStateList;
            } else {
                this.f196 = getTextColors();
            }
            int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
            if (dimensionPixelSize != 0) {
                float f = dimensionPixelSize;
                if (f != textPaint.getTextSize()) {
                    textPaint.setTextSize(f);
                    requestLayout();
                }
            }
            int i = typedArrayObtainStyledAttributes.getInt(1, -1);
            int i2 = typedArrayObtainStyledAttributes.getInt(2, -1);
            Typeface typeface = i != 1 ? i != 2 ? i != 3 ? null : Typeface.MONOSPACE : Typeface.SERIF : Typeface.SANS_SERIF;
            if (i2 > 0) {
                Typeface typefaceDefaultFromStyle = typeface == null ? Typeface.defaultFromStyle(i2) : Typeface.create(typeface, i2);
                setSwitchTypeface(typefaceDefaultFromStyle);
                int i3 = (~(typefaceDefaultFromStyle != null ? typefaceDefaultFromStyle.getStyle() : 0)) & i2;
                textPaint.setFakeBoldText((i3 & 1) != 0);
                textPaint.setTextSkewX((2 & i3) != 0 ? -0.25f : 0.0f);
            } else {
                textPaint.setFakeBoldText(false);
                textPaint.setTextSkewX(0.0f);
                setSwitchTypeface(typeface);
            }
            if (typedArrayObtainStyledAttributes.getBoolean(14, false)) {
                Context context2 = getContext();
                C2246 c2246 = new C2246();
                c2246.f8947 = context2.getResources().getConfiguration().locale;
                this.f182 = c2246;
            } else {
                this.f182 = null;
            }
            setTextOnInternal(this.f201);
            setTextOffInternal(this.f199);
            typedArrayObtainStyledAttributes.recycle();
        }
        new C2941(this).m7308(attributeSet, org.lsposed.hiddenapibypass.library.R.attr._2_res_0x7f040577);
        c3762M8778.m8783();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f205 = viewConfiguration.getScaledTouchSlop();
        this.f170 = viewConfiguration.getScaledMinimumFlingVelocity();
        getEmojiTextViewHelper().m7344(attributeSet, org.lsposed.hiddenapibypass.library.R.attr._2_res_0x7f040577);
        refreshDrawableState();
        setChecked(isChecked());
    }

    private C2972 getEmojiTextViewHelper() {
        if (this.f207 == null) {
            this.f207 = new C2972(this);
        }
        return this.f207;
    }

    private boolean getTargetCheckedState() {
        return this.f174 > 0.5f;
    }

    private int getThumbOffset() {
        boolean z = AbstractC2926.f11335;
        return (int) (((getLayoutDirection() == 1 ? 1.0f - this.f174 : this.f174) * getThumbScrollRange()) + 0.5f);
    }

    private int getThumbScrollRange() {
        Drawable drawable = this.f200;
        if (drawable == null) {
            return 0;
        }
        Rect rect = this.f190;
        drawable.getPadding(rect);
        Drawable drawable2 = this.f192;
        Rect rectM7330 = drawable2 != null ? AbstractC2962.m7330(drawable2) : AbstractC2962.f11433;
        return ((((this.f202 - this.f185) - rect.left) - rect.right) - rectM7330.left) - rectM7330.right;
    }

    private void setTextOffInternal(CharSequence charSequence) {
        this.f199 = charSequence;
        C2972 emojiTextViewHelper = getEmojiTextViewHelper();
        TransformationMethod transformationMethod = ((ˑי) emojiTextViewHelper.f11446.ˆʿ).ﹳˑ(this.f182);
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, this);
        }
        this.f166 = charSequence;
        this.f181 = null;
        if (this.f198) {
            m142();
        }
    }

    private void setTextOnInternal(CharSequence charSequence) {
        this.f201 = charSequence;
        C2972 emojiTextViewHelper = getEmojiTextViewHelper();
        TransformationMethod transformationMethod = ((ˑי) emojiTextViewHelper.f11446.ˆʿ).ﹳˑ(this.f182);
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, this);
        }
        this.f180 = charSequence;
        this.f195 = null;
        if (this.f198) {
            m142();
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i;
        int i2;
        int i3 = this.f167;
        int i4 = this.f173;
        int i5 = this.f168;
        int i6 = this.f188;
        int thumbOffset = getThumbOffset() + i3;
        Drawable drawable = this.f192;
        Rect rectM7330 = drawable != null ? AbstractC2962.m7330(drawable) : AbstractC2962.f11433;
        Drawable drawable2 = this.f200;
        Rect rect = this.f190;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            int i7 = rect.left;
            thumbOffset += i7;
            if (rectM7330 != null) {
                int i8 = rectM7330.left;
                if (i8 > i7) {
                    i3 += i8 - i7;
                }
                int i9 = rectM7330.top;
                int i10 = rect.top;
                i = i9 > i10 ? (i9 - i10) + i4 : i4;
                int i11 = rectM7330.right;
                int i12 = rect.right;
                if (i11 > i12) {
                    i5 -= i11 - i12;
                }
                int i13 = rectM7330.bottom;
                int i14 = rect.bottom;
                if (i13 > i14) {
                    i2 = i6 - (i13 - i14);
                }
                this.f200.setBounds(i3, i, i5, i2);
            } else {
                i = i4;
            }
            i2 = i6;
            this.f200.setBounds(i3, i, i5, i2);
        }
        Drawable drawable3 = this.f192;
        if (drawable3 != null) {
            drawable3.getPadding(rect);
            int i15 = thumbOffset - rect.left;
            int i16 = thumbOffset + this.f185 + rect.right;
            this.f192.setBounds(i15, i4, i16, i6);
            Drawable background = getBackground();
            if (background != null) {
                background.setHotspotBounds(i15, i4, i16, i6);
            }
        }
        super.draw(canvas);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableHotspotChanged(float f, float f2) {
        super.drawableHotspotChanged(f, f2);
        Drawable drawable = this.f192;
        if (drawable != null) {
            drawable.setHotspot(f, f2);
        }
        Drawable drawable2 = this.f200;
        if (drawable2 != null) {
            drawable2.setHotspot(f, f2);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f192;
        boolean state = (drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState);
        Drawable drawable2 = this.f200;
        if (drawable2 != null && drawable2.isStateful()) {
            state |= drawable2.setState(drawableState);
        }
        if (state) {
            invalidate();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        boolean z = AbstractC2926.f11335;
        if (getLayoutDirection() != 1) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.f202;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingLeft + this.f184 : compoundPaddingLeft;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingRight() {
        boolean z = AbstractC2926.f11335;
        if (getLayoutDirection() == 1) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.f202;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingRight + this.f184 : compoundPaddingRight;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return ˉⁱ.ˆᵔ(super.getCustomSelectionActionModeCallback());
    }

    public boolean getShowText() {
        return this.f198;
    }

    public boolean getSplitTrack() {
        return this.f183;
    }

    public int getSwitchMinWidth() {
        return this.f169;
    }

    public int getSwitchPadding() {
        return this.f184;
    }

    public CharSequence getTextOff() {
        return this.f199;
    }

    public CharSequence getTextOn() {
        return this.f201;
    }

    public Drawable getThumbDrawable() {
        return this.f192;
    }

    public final float getThumbPosition() {
        return this.f174;
    }

    public int getThumbTextPadding() {
        return this.f206;
    }

    public ColorStateList getThumbTintList() {
        return this.f171;
    }

    public PorterDuff.Mode getThumbTintMode() {
        return this.f179;
    }

    public Drawable getTrackDrawable() {
        return this.f200;
    }

    public ColorStateList getTrackTintList() {
        return this.f204;
    }

    public PorterDuff.Mode getTrackTintMode() {
        return this.f176;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f192;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f200;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.f203;
        if (objectAnimator == null || !objectAnimator.isStarted()) {
            return;
        }
        this.f203.end();
        this.f203 = null;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f163);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        int width;
        super.onDraw(canvas);
        Drawable drawable = this.f200;
        Rect rect = this.f190;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i = this.f173;
        int i2 = this.f188;
        int i3 = i + rect.top;
        int i4 = i2 - rect.bottom;
        Drawable drawable2 = this.f192;
        if (drawable != null) {
            if (!this.f183 || drawable2 == null) {
                drawable.draw(canvas);
            } else {
                Rect rectM7330 = AbstractC2962.m7330(drawable2);
                drawable2.copyBounds(rect);
                rect.left += rectM7330.left;
                rect.right -= rectM7330.right;
                int iSave = canvas.save();
                canvas.clipRect(rect, Region.Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(iSave);
            }
        }
        int iSave2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        StaticLayout staticLayout = getTargetCheckedState() ? this.f195 : this.f181;
        if (staticLayout != null) {
            int[] drawableState = getDrawableState();
            ColorStateList colorStateList = this.f196;
            TextPaint textPaint = this.f187;
            if (colorStateList != null) {
                textPaint.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            textPaint.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                width = bounds.left + bounds.right;
            } else {
                width = getWidth();
            }
            canvas.translate((width / 2) - (staticLayout.getWidth() / 2), ((i3 + i4) / 2) - (staticLayout.getHeight() / 2));
            staticLayout.draw(canvas);
        }
        canvas.restoreToCount(iSave2);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("android.widget.Switch");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        if (Build.VERSION.SDK_INT < 30) {
            CharSequence charSequence = isChecked() ? this.f201 : this.f199;
            if (TextUtils.isEmpty(charSequence)) {
                return;
            }
            CharSequence text = accessibilityNodeInfo.getText();
            if (TextUtils.isEmpty(text)) {
                accessibilityNodeInfo.setText(charSequence);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(text);
            sb.append(' ');
            sb.append(charSequence);
            accessibilityNodeInfo.setText(sb);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        int iMax;
        int width;
        int paddingLeft;
        int height;
        int paddingTop;
        super.onLayout(z, i, i2, i3, i4);
        int iMax2 = 0;
        if (this.f192 != null) {
            Drawable drawable = this.f200;
            Rect rect = this.f190;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect rectM7330 = AbstractC2962.m7330(this.f192);
            iMax = Math.max(0, rectM7330.left - rect.left);
            iMax2 = Math.max(0, rectM7330.right - rect.right);
        } else {
            iMax = 0;
        }
        boolean z2 = AbstractC2926.f11335;
        if (getLayoutDirection() == 1) {
            paddingLeft = getPaddingLeft() + iMax;
            width = ((this.f202 + paddingLeft) - iMax) - iMax2;
        } else {
            width = (getWidth() - getPaddingRight()) - iMax2;
            paddingLeft = (width - this.f202) + iMax + iMax2;
        }
        int gravity = getGravity() & 112;
        if (gravity == 16) {
            int height2 = ((getHeight() + getPaddingTop()) - getPaddingBottom()) / 2;
            int i5 = this.f178;
            int i6 = height2 - (i5 / 2);
            height = i5 + i6;
            paddingTop = i6;
        } else if (gravity != 80) {
            paddingTop = getPaddingTop();
            height = this.f178 + paddingTop;
        } else {
            height = getHeight() - getPaddingBottom();
            paddingTop = height - this.f178;
        }
        this.f167 = paddingLeft;
        this.f173 = paddingTop;
        this.f188 = height;
        this.f168 = width;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        int intrinsicWidth;
        int intrinsicHeight;
        int intrinsicHeight2 = 0;
        if (this.f198) {
            StaticLayout staticLayout = this.f195;
            TextPaint textPaint = this.f187;
            if (staticLayout == null) {
                CharSequence charSequence = this.f180;
                this.f195 = new StaticLayout(charSequence, textPaint, charSequence != null ? (int) Math.ceil(Layout.getDesiredWidth(charSequence, textPaint)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
            }
            if (this.f181 == null) {
                CharSequence charSequence2 = this.f166;
                this.f181 = new StaticLayout(charSequence2, textPaint, charSequence2 != null ? (int) Math.ceil(Layout.getDesiredWidth(charSequence2, textPaint)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
            }
        }
        Drawable drawable = this.f192;
        Rect rect = this.f190;
        if (drawable != null) {
            drawable.getPadding(rect);
            intrinsicWidth = (this.f192.getIntrinsicWidth() - rect.left) - rect.right;
            intrinsicHeight = this.f192.getIntrinsicHeight();
        } else {
            intrinsicWidth = 0;
            intrinsicHeight = 0;
        }
        this.f185 = Math.max(this.f198 ? (this.f206 * 2) + Math.max(this.f195.getWidth(), this.f181.getWidth()) : 0, intrinsicWidth);
        Drawable drawable2 = this.f200;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            intrinsicHeight2 = this.f200.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int iMax = rect.left;
        int iMax2 = rect.right;
        Drawable drawable3 = this.f192;
        if (drawable3 != null) {
            Rect rectM7330 = AbstractC2962.m7330(drawable3);
            iMax = Math.max(iMax, rectM7330.left);
            iMax2 = Math.max(iMax2, rectM7330.right);
        }
        int iMax3 = this.f189 ? Math.max(this.f169, (this.f185 * 2) + iMax + iMax2) : this.f169;
        int iMax4 = Math.max(intrinsicHeight2, intrinsicHeight);
        this.f202 = iMax3;
        this.f178 = iMax4;
        super.onMeasure(i, i2);
        if (getMeasuredHeight() < iMax4) {
            setMeasuredDimension(getMeasuredWidthAndState(), iMax4);
        }
    }

    @Override // android.view.View
    public final void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        CharSequence charSequence = isChecked() ? this.f201 : this.f199;
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0091  */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(android.view.MotionEvent r10) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 332
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SwitchCompat.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().m7345(z);
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) throws Resources.NotFoundException {
        super.setChecked(z);
        boolean zIsChecked = isChecked();
        if (zIsChecked) {
            if (Build.VERSION.SDK_INT >= 30) {
                Object string = this.f201;
                if (string == null) {
                    string = getResources().getString(org.lsposed.hiddenapibypass.library.R.string._2_res_0x7f130007);
                }
                Object obj = string;
                WeakHashMap weakHashMap = AbstractC4345.f16838;
                new C4393(org.lsposed.hiddenapibypass.library.R.id._2_res_0x7f0b037e, CharSequence.class, 64, 30, 2).m4694(this, obj);
            }
        } else if (Build.VERSION.SDK_INT >= 30) {
            Object string2 = this.f199;
            if (string2 == null) {
                string2 = getResources().getString(org.lsposed.hiddenapibypass.library.R.string._2_res_0x7f130006);
            }
            Object obj2 = string2;
            WeakHashMap weakHashMap2 = AbstractC4345.f16838;
            new C4393(org.lsposed.hiddenapibypass.library.R.id._2_res_0x7f0b037e, CharSequence.class, 64, 30, 2).m4694(this, obj2);
        }
        if (getWindowToken() == null || !isLaidOut()) {
            ObjectAnimator objectAnimator = this.f203;
            if (objectAnimator != null) {
                objectAnimator.cancel();
            }
            setThumbPosition(zIsChecked ? 1.0f : 0.0f);
            return;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, f164, zIsChecked ? 1.0f : 0.0f);
        this.f203 = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setDuration(250L);
        this.f203.setAutoCancel(true);
        this.f203.start();
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(ˉⁱ.ᵢʿ(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().m7347(z);
        setTextOnInternal(this.f201);
        setTextOffInternal(this.f199);
        requestLayout();
    }

    public final void setEnforceSwitchWidth(boolean z) {
        this.f189 = z;
        invalidate();
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().m7346(inputFilterArr));
    }

    public void setShowText(boolean z) {
        if (this.f198 != z) {
            this.f198 = z;
            requestLayout();
            if (z) {
                m142();
            }
        }
    }

    public void setSplitTrack(boolean z) {
        this.f183 = z;
        invalidate();
    }

    public void setSwitchMinWidth(int i) {
        this.f169 = i;
        requestLayout();
    }

    public void setSwitchPadding(int i) {
        this.f184 = i;
        requestLayout();
    }

    public void setSwitchTypeface(Typeface typeface) {
        TextPaint textPaint = this.f187;
        if ((textPaint.getTypeface() == null || textPaint.getTypeface().equals(typeface)) && (textPaint.getTypeface() != null || typeface == null)) {
            return;
        }
        textPaint.setTypeface(typeface);
        requestLayout();
        invalidate();
    }

    public void setTextOff(CharSequence charSequence) throws Resources.NotFoundException {
        setTextOffInternal(charSequence);
        requestLayout();
        if (isChecked() || Build.VERSION.SDK_INT < 30) {
            return;
        }
        Object string = this.f199;
        if (string == null) {
            string = getResources().getString(org.lsposed.hiddenapibypass.library.R.string._2_res_0x7f130006);
        }
        WeakHashMap weakHashMap = AbstractC4345.f16838;
        new C4393(org.lsposed.hiddenapibypass.library.R.id._2_res_0x7f0b037e, CharSequence.class, 64, 30, 2).m4694(this, string);
    }

    public void setTextOn(CharSequence charSequence) throws Resources.NotFoundException {
        setTextOnInternal(charSequence);
        requestLayout();
        if (!isChecked() || Build.VERSION.SDK_INT < 30) {
            return;
        }
        Object string = this.f201;
        if (string == null) {
            string = getResources().getString(org.lsposed.hiddenapibypass.library.R.string._2_res_0x7f130007);
        }
        WeakHashMap weakHashMap = AbstractC4345.f16838;
        new C4393(org.lsposed.hiddenapibypass.library.R.id._2_res_0x7f0b037e, CharSequence.class, 64, 30, 2).m4694(this, string);
    }

    public void setThumbDrawable(Drawable drawable) {
        Drawable drawable2 = this.f192;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f192 = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setThumbPosition(float f) {
        this.f174 = f;
        invalidate();
    }

    public void setThumbResource(int i) {
        setThumbDrawable(ٴˎ.ˏᵢ(getContext(), i));
    }

    public void setThumbTextPadding(int i) {
        this.f206 = i;
        requestLayout();
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        this.f171 = colorStateList;
        this.f191 = true;
        m141();
    }

    public void setThumbTintMode(PorterDuff.Mode mode) {
        this.f179 = mode;
        this.f172 = true;
        m141();
    }

    public void setTrackDrawable(Drawable drawable) {
        Drawable drawable2 = this.f200;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f200 = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackResource(int i) {
        setTrackDrawable(ٴˎ.ˏᵢ(getContext(), i));
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        this.f204 = colorStateList;
        this.f186 = true;
        m139();
    }

    public void setTrackTintMode(PorterDuff.Mode mode) {
        this.f176 = mode;
        this.f193 = true;
        m139();
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() throws Resources.NotFoundException {
        setChecked(!isChecked());
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f192 || drawable == this.f200;
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final void m139() {
        Drawable drawable = this.f200;
        if (drawable != null) {
            if (this.f186 || this.f193) {
                Drawable drawableMutate = ˆˑ.ﹳﹳ.ᵢʿ(drawable).mutate();
                this.f200 = drawableMutate;
                if (this.f186) {
                    drawableMutate.setTintList(this.f204);
                }
                if (this.f193) {
                    this.f200.setTintMode(this.f176);
                }
                if (this.f200.isStateful()) {
                    this.f200.setState(getDrawableState());
                }
            }
        }
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final void m140() {
        setTextOnInternal(this.f201);
        setTextOffInternal(this.f199);
        requestLayout();
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void m141() {
        Drawable drawable = this.f192;
        if (drawable != null) {
            if (this.f191 || this.f172) {
                Drawable drawableMutate = ˆˑ.ﹳﹳ.ᵢʿ(drawable).mutate();
                this.f192 = drawableMutate;
                if (this.f191) {
                    drawableMutate.setTintList(this.f171);
                }
                if (this.f172) {
                    this.f192.setTintMode(this.f179);
                }
                if (this.f192.isStateful()) {
                    this.f192.setState(getDrawableState());
                }
            }
        }
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final void m142() {
        if (this.f165 == null && ((ˑי) this.f207.f11446.ˆʿ).ˑי() && C2676.f10575 != null) {
            C2676 c2676M6853 = C2676.m6853();
            int iM6854 = c2676M6853.m6854();
            if (iM6854 == 3 || iM6854 == 0) {
                C1122 c1122 = new C1122(this);
                this.f165 = c1122;
                c2676M6853.m6857(c1122);
            }
        }
    }
}
