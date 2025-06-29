package com.google.android.material.chip;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Locale;
import p044.AbstractC1298;
import p166.C2428;
import p171.C2467;
import p171.InterfaceC2465;
import p205.C2786;
import p211.AbstractC2807;
import p219.C2838;
import p220.AbstractC2845;
import p220.C2846;
import p220.C2854;
import p220.InterfaceC2842;
import p222.C2945;
import p228.C3057;
import p239.AbstractC3098;
import p243.AbstractC3112;
import p243.C3107;
import p255.C3186;
import p255.C3189;
import p255.InterfaceC3187;
import p361.C4089;
import p361.InterfaceC4106;
import p378.AbstractC4339;
import p378.AbstractC4345;
import ˆˑ.ﹳﹳ;
import ᴵﹳ.ٴˎ;
import ﹶⁱ.ـﹶ;

/* loaded from: classes.dex */
public class Chip extends C2945 implements InterfaceC3187, InterfaceC4106, Checkable {

    /* renamed from: ʻʿ, reason: contains not printable characters */
    public final C3186 f3235;

    /* renamed from: ʾʼ, reason: contains not printable characters */
    public boolean f3236;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public C3189 f3237;

    /* renamed from: ˊᵔ, reason: contains not printable characters */
    public final C2854 f3238;

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public View.OnClickListener f3239;

    /* renamed from: ˎᵔ, reason: contains not printable characters */
    public int f3240;

    /* renamed from: ˑⁱ, reason: contains not printable characters */
    public boolean f3241;

    /* renamed from: ˑﾞ, reason: contains not printable characters */
    public boolean f3242;

    /* renamed from: ـˆ, reason: contains not printable characters */
    public CompoundButton.OnCheckedChangeListener f3243;

    /* renamed from: ᴵʼ, reason: contains not printable characters */
    public boolean f3244;

    /* renamed from: ᵔ, reason: contains not printable characters */
    public final Rect f3245;

    /* renamed from: ᵔٴ, reason: contains not printable characters */
    public boolean f3246;

    /* renamed from: ᵔﹳ, reason: contains not printable characters */
    public CharSequence f3247;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public InsetDrawable f3248;

    /* renamed from: ᵢٴ, reason: contains not printable characters */
    public int f3249;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public RippleDrawable f3250;

    /* renamed from: ﾞˎ, reason: contains not printable characters */
    public final RectF f3251;

    /* renamed from: ﾞᐧ, reason: contains not printable characters */
    public boolean f3252;

    /* renamed from: ˋﾞ, reason: contains not printable characters */
    public static final Rect f3233 = new Rect();

    /* renamed from: ᵎʽ, reason: contains not printable characters */
    public static final int[] f3234 = {R.attr.state_selected};

    /* renamed from: ʿˊ, reason: contains not printable characters */
    public static final int[] f3232 = {R.attr.state_checkable};

    public Chip(Context context, AttributeSet attributeSet) {
        int resourceId;
        int resourceId2;
        int resourceId3;
        super(AbstractC2807.m7088(context, attributeSet, org.lsposed.hiddenapibypass.library.R.attr._2_res_0x7f040101, org.lsposed.hiddenapibypass.library.R.style._2_res_0x7f140521), attributeSet, org.lsposed.hiddenapibypass.library.R.attr._2_res_0x7f040101);
        this.f3245 = new Rect();
        this.f3251 = new RectF();
        this.f3238 = new C2854(1, this);
        Context context2 = getContext();
        if (attributeSet != null) {
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "background") != null) {
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableLeft") != null) {
                throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableStart") != null) {
                throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableEnd") != null) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableRight") != null) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            }
            if (!attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "singleLine", true) || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "lines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minLines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLines", 1) != 1) {
                throw new UnsupportedOperationException("Chip does not support multi-line text");
            }
            if (attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 8388627) != 8388627) {
            }
        }
        C3189 c3189 = new C3189(context2, attributeSet);
        int[] iArr = AbstractC3098.f11966;
        TypedArray typedArrayM7129 = AbstractC2845.m7129(c3189.f12332, attributeSet, iArr, org.lsposed.hiddenapibypass.library.R.attr._2_res_0x7f040101, org.lsposed.hiddenapibypass.library.R.style._2_res_0x7f140521, new int[0]);
        c3189.f12330 = typedArrayM7129.hasValue(37);
        Context context3 = c3189.f12332;
        ColorStateList colorStateList = ـﹶ.ﾞˊ(context3, typedArrayM7129, 24);
        if (c3189.f12344 != colorStateList) {
            c3189.f12344 = colorStateList;
            c3189.onStateChange(c3189.getState());
        }
        ColorStateList colorStateList2 = ـﹶ.ﾞˊ(context3, typedArrayM7129, 11);
        if (c3189.f12335 != colorStateList2) {
            c3189.f12335 = colorStateList2;
            c3189.onStateChange(c3189.getState());
        }
        float dimension = typedArrayM7129.getDimension(19, 0.0f);
        if (c3189.f12363 != dimension) {
            c3189.f12363 = dimension;
            c3189.invalidateSelf();
            c3189.m7885();
        }
        if (typedArrayM7129.hasValue(12)) {
            c3189.m7863(typedArrayM7129.getDimension(12, 0.0f));
        }
        c3189.m7876(ـﹶ.ﾞˊ(context3, typedArrayM7129, 22));
        c3189.m7889(typedArrayM7129.getDimension(23, 0.0f));
        c3189.m7879(ـﹶ.ﾞˊ(context3, typedArrayM7129, 36));
        String text = typedArrayM7129.getText(5);
        text = text == null ? "" : text;
        if (!TextUtils.equals(c3189.f12352, text)) {
            c3189.f12352 = text;
            c3189.f12361.f11070 = true;
            c3189.invalidateSelf();
            c3189.m7885();
        }
        C3057 c3057 = (!typedArrayM7129.hasValue(0) || (resourceId3 = typedArrayM7129.getResourceId(0, 0)) == 0) ? null : new C3057(context3, resourceId3);
        c3057.f11773 = typedArrayM7129.getDimension(1, c3057.f11773);
        int i = Build.VERSION.SDK_INT;
        if (i < 23) {
            c3057.f11775 = ـﹶ.ﾞˊ(context3, typedArrayM7129, 2);
        }
        c3189.m7888(c3057);
        int i2 = typedArrayM7129.getInt(3, 0);
        if (i2 == 1) {
            c3189.f12385 = TextUtils.TruncateAt.START;
        } else if (i2 == 2) {
            c3189.f12385 = TextUtils.TruncateAt.MIDDLE;
        } else if (i2 == 3) {
            c3189.f12385 = TextUtils.TruncateAt.END;
        }
        c3189.m7873(typedArrayM7129.getBoolean(18, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") == null) {
            c3189.m7873(typedArrayM7129.getBoolean(15, false));
        }
        c3189.m7882(ـﹶ.יʻ(context3, typedArrayM7129, 14));
        if (typedArrayM7129.hasValue(17)) {
            c3189.m7866(ـﹶ.ﾞˊ(context3, typedArrayM7129, 17));
        }
        c3189.m7886(typedArrayM7129.getDimension(16, -1.0f));
        c3189.m7881(typedArrayM7129.getBoolean(31, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") == null) {
            c3189.m7881(typedArrayM7129.getBoolean(26, false));
        }
        c3189.m7860(ـﹶ.יʻ(context3, typedArrayM7129, 25));
        c3189.m7870(ـﹶ.ﾞˊ(context3, typedArrayM7129, 30));
        c3189.m7871(typedArrayM7129.getDimension(28, 0.0f));
        c3189.m7875(typedArrayM7129.getBoolean(6, false));
        c3189.m7874(typedArrayM7129.getBoolean(10, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") == null) {
            c3189.m7874(typedArrayM7129.getBoolean(8, false));
        }
        c3189.m7862(ـﹶ.יʻ(context3, typedArrayM7129, 7));
        if (typedArrayM7129.hasValue(9)) {
            c3189.m7869(ـﹶ.ﾞˊ(context3, typedArrayM7129, 9));
        }
        c3189.f12333 = (!typedArrayM7129.hasValue(39) || (resourceId2 = typedArrayM7129.getResourceId(39, 0)) == 0) ? null : C2838.m7110(context3, resourceId2);
        c3189.f12371 = (!typedArrayM7129.hasValue(33) || (resourceId = typedArrayM7129.getResourceId(33, 0)) == 0) ? null : C2838.m7110(context3, resourceId);
        float dimension2 = typedArrayM7129.getDimension(21, 0.0f);
        if (c3189.f12383 != dimension2) {
            c3189.f12383 = dimension2;
            c3189.invalidateSelf();
            c3189.m7885();
        }
        c3189.m7880(typedArrayM7129.getDimension(35, 0.0f));
        c3189.m7859(typedArrayM7129.getDimension(34, 0.0f));
        float dimension3 = typedArrayM7129.getDimension(41, 0.0f);
        if (c3189.f12375 != dimension3) {
            c3189.f12375 = dimension3;
            c3189.invalidateSelf();
            c3189.m7885();
        }
        float dimension4 = typedArrayM7129.getDimension(40, 0.0f);
        if (c3189.f12368 != dimension4) {
            c3189.f12368 = dimension4;
            c3189.invalidateSelf();
            c3189.m7885();
        }
        c3189.m7883(typedArrayM7129.getDimension(29, 0.0f));
        c3189.m7872(typedArrayM7129.getDimension(27, 0.0f));
        float dimension5 = typedArrayM7129.getDimension(13, 0.0f);
        if (c3189.f12359 != dimension5) {
            c3189.f12359 = dimension5;
            c3189.invalidateSelf();
            c3189.m7885();
        }
        c3189.f12354 = typedArrayM7129.getDimensionPixelSize(4, Integer.MAX_VALUE);
        typedArrayM7129.recycle();
        AbstractC2845.m7131(context2, attributeSet, org.lsposed.hiddenapibypass.library.R.attr._2_res_0x7f040101, org.lsposed.hiddenapibypass.library.R.style._2_res_0x7f140521);
        AbstractC2845.m7128(context2, attributeSet, iArr, org.lsposed.hiddenapibypass.library.R.attr._2_res_0x7f040101, org.lsposed.hiddenapibypass.library.R.style._2_res_0x7f140521, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, org.lsposed.hiddenapibypass.library.R.attr._2_res_0x7f040101, org.lsposed.hiddenapibypass.library.R.style._2_res_0x7f140521);
        this.f3241 = typedArrayObtainStyledAttributes.getBoolean(32, false);
        this.f3240 = (int) Math.ceil(typedArrayObtainStyledAttributes.getDimension(20, (float) Math.ceil(TypedValue.applyDimension(1, 48, getContext().getResources().getDisplayMetrics()))));
        typedArrayObtainStyledAttributes.recycle();
        setChipDrawable(c3189);
        c3189.m9406(AbstractC4339.m9852(this));
        AbstractC2845.m7131(context2, attributeSet, org.lsposed.hiddenapibypass.library.R.attr._2_res_0x7f040101, org.lsposed.hiddenapibypass.library.R.style._2_res_0x7f140521);
        AbstractC2845.m7128(context2, attributeSet, iArr, org.lsposed.hiddenapibypass.library.R.attr._2_res_0x7f040101, org.lsposed.hiddenapibypass.library.R.style._2_res_0x7f140521, new int[0]);
        TypedArray typedArrayObtainStyledAttributes2 = context2.obtainStyledAttributes(attributeSet, iArr, org.lsposed.hiddenapibypass.library.R.attr._2_res_0x7f040101, org.lsposed.hiddenapibypass.library.R.style._2_res_0x7f140521);
        if (i < 23) {
            setTextColor(ـﹶ.ﾞˊ(context2, typedArrayObtainStyledAttributes2, 2));
        }
        boolean zHasValue = typedArrayObtainStyledAttributes2.hasValue(37);
        typedArrayObtainStyledAttributes2.recycle();
        this.f3235 = new C3186(this, this);
        m2847();
        if (!zHasValue) {
            setOutlineProvider(new C2786(this, 1));
        }
        setChecked(this.f3244);
        setText(c3189.f12352);
        setEllipsize(c3189.f12385);
        m2848();
        if (!this.f3237.f12357) {
            setLines(1);
            setHorizontallyScrolling(true);
        }
        setGravity(8388627);
        m2851();
        if (this.f3241) {
            setMinHeight(this.f3240);
        }
        this.f3249 = getLayoutDirection();
        super.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: יـ.ـﹶ
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                CompoundButton.OnCheckedChangeListener onCheckedChangeListener = this.f12324.f3243;
                if (onCheckedChangeListener != null) {
                    onCheckedChangeListener.onCheckedChanged(compoundButton, z);
                }
            }
        });
    }

    private RectF getCloseIconTouchBounds() {
        RectF rectF = this.f3251;
        rectF.setEmpty();
        if (m2849() && this.f3239 != null) {
            C3189 c3189 = this.f3237;
            Rect bounds = c3189.getBounds();
            rectF.setEmpty();
            if (c3189.m7877()) {
                float f = c3189.f12359 + c3189.f12374 + c3189.f12353 + c3189.f12369 + c3189.f12368;
                if (ﹳﹳ.ᴵʿ(c3189) == 0) {
                    float f2 = bounds.right;
                    rectF.right = f2;
                    rectF.left = f2 - f;
                } else {
                    float f3 = bounds.left;
                    rectF.left = f3;
                    rectF.right = f3 + f;
                }
                rectF.top = bounds.top;
                rectF.bottom = bounds.bottom;
            }
        }
        return rectF;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        int i = (int) closeIconTouchBounds.left;
        int i2 = (int) closeIconTouchBounds.top;
        int i3 = (int) closeIconTouchBounds.right;
        int i4 = (int) closeIconTouchBounds.bottom;
        Rect rect = this.f3245;
        rect.set(i, i2, i3, i4);
        return rect;
    }

    private C3057 getTextAppearance() {
        C3189 c3189 = this.f3237;
        if (c3189 != null) {
            return c3189.f12361.f11069;
        }
        return null;
    }

    private void setCloseIconHovered(boolean z) {
        if (this.f3236 != z) {
            this.f3236 = z;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z) {
        if (this.f3252 != z) {
            this.f3252 = z;
            refreshDrawableState();
        }
    }

    @Override // android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        int i;
        if (!this.f3246) {
            return super.dispatchHoverEvent(motionEvent);
        }
        C3186 c3186 = this.f3235;
        AccessibilityManager accessibilityManager = c3186.f19946;
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            int action = motionEvent.getAction();
            if (action == 7 || action == 9) {
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                Chip chip = c3186.f12323;
                int i2 = (chip.m2849() && chip.getCloseIconTouchBounds().contains(x, y)) ? 1 : 0;
                int i3 = c3186.f19944;
                if (i3 != i2) {
                    c3186.f19944 = i2;
                    c3186.m11562(i2, 128);
                    c3186.m11562(i3, 256);
                }
                if (i2 != Integer.MIN_VALUE) {
                    return true;
                }
            } else if (action == 10 && (i = c3186.f19944) != Integer.MIN_VALUE) {
                if (i == Integer.MIN_VALUE) {
                    return true;
                }
                c3186.f19944 = Integer.MIN_VALUE;
                c3186.m11562(i, 256);
                return true;
            }
        }
        return super.dispatchHoverEvent(motionEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0058  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean dispatchKeyEvent(android.view.KeyEvent r10) {
        /*
            r9 = this;
            boolean r0 = r9.f3246
            if (r0 != 0) goto L9
            boolean r10 = super.dispatchKeyEvent(r10)
            return r10
        L9:
            יـ.ʽᐧ r0 = r9.f3235
            r0.getClass()
            int r1 = r10.getAction()
            r2 = 0
            r3 = 1
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 == r3) goto L9f
            int r1 = r10.getKeyCode()
            r5 = 61
            r6 = 0
            if (r1 == r5) goto L89
            r5 = 66
            if (r1 == r5) goto L58
            switch(r1) {
                case 19: goto L2a;
                case 20: goto L2a;
                case 21: goto L2a;
                case 22: goto L2a;
                case 23: goto L58;
                default: goto L28;
            }
        L28:
            goto L9f
        L2a:
            boolean r7 = r10.hasNoModifiers()
            if (r7 == 0) goto L9f
            r7 = 19
            if (r1 == r7) goto L42
            r7 = 21
            if (r1 == r7) goto L3f
            r7 = 22
            if (r1 == r7) goto L44
            r5 = 130(0x82, float:1.82E-43)
            goto L44
        L3f:
            r5 = 17
            goto L44
        L42:
            r5 = 33
        L44:
            int r1 = r10.getRepeatCount()
            int r1 = r1 + r3
            r7 = 0
        L4a:
            if (r2 >= r1) goto L56
            boolean r8 = r0.m11558(r5, r6)
            if (r8 == 0) goto L56
            int r2 = r2 + 1
            r7 = 1
            goto L4a
        L56:
            r2 = r7
            goto L9f
        L58:
            boolean r1 = r10.hasNoModifiers()
            if (r1 == 0) goto L9f
            int r1 = r10.getRepeatCount()
            if (r1 != 0) goto L9f
            int r1 = r0.f19943
            if (r1 == r4) goto L87
            com.google.android.material.chip.Chip r5 = r0.f12323
            if (r1 != 0) goto L71
            boolean r2 = r5.performClick()
            goto L87
        L71:
            if (r1 != r3) goto L87
            r5.playSoundEffect(r2)
            android.view.View$OnClickListener r1 = r5.f3239
            if (r1 == 0) goto L7e
            r1.onClick(r5)
            r2 = 1
        L7e:
            boolean r1 = r5.f3246
            if (r1 == 0) goto L87
            יـ.ʽᐧ r1 = r5.f3235
            r1.m11562(r3, r3)
        L87:
            r2 = 1
            goto L9f
        L89:
            boolean r1 = r10.hasNoModifiers()
            if (r1 == 0) goto L95
            r1 = 2
            boolean r2 = r0.m11558(r1, r6)
            goto L9f
        L95:
            boolean r1 = r10.hasModifiers(r3)
            if (r1 == 0) goto L9f
            boolean r2 = r0.m11558(r3, r6)
        L9f:
            if (r2 == 0) goto La6
            int r0 = r0.f19943
            if (r0 == r4) goto La6
            return r3
        La6:
            boolean r10 = super.dispatchKeyEvent(r10)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.dispatchKeyEvent(android.view.KeyEvent):boolean");
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [boolean, int] */
    @Override // p222.C2945, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        int i;
        super.drawableStateChanged();
        C3189 c3189 = this.f3237;
        boolean zM7864 = false;
        if (c3189 != null && C3189.m7857(c3189.f12337)) {
            C3189 c31892 = this.f3237;
            ?? IsEnabled = isEnabled();
            int i2 = IsEnabled;
            if (this.f3242) {
                i2 = IsEnabled + 1;
            }
            int i3 = i2;
            if (this.f3236) {
                i3 = i2 + 1;
            }
            int i4 = i3;
            if (this.f3252) {
                i4 = i3 + 1;
            }
            int i5 = i4;
            if (isChecked()) {
                i5 = i4 + 1;
            }
            int[] iArr = new int[i5];
            if (isEnabled()) {
                iArr[0] = 16842910;
                i = 1;
            } else {
                i = 0;
            }
            if (this.f3242) {
                iArr[i] = 16842908;
                i++;
            }
            if (this.f3236) {
                iArr[i] = 16843623;
                i++;
            }
            if (this.f3252) {
                iArr[i] = 16842919;
                i++;
            }
            if (isChecked()) {
                iArr[i] = 16842913;
            }
            if (!Arrays.equals(c31892.f12364, iArr)) {
                c31892.f12364 = iArr;
                if (c31892.m7877()) {
                    zM7864 = c31892.m7864(c31892.getState(), iArr);
                }
            }
        }
        if (zM7864) {
            invalidate();
        }
    }

    @Override // android.widget.CheckBox, android.widget.CompoundButton, android.widget.Button, android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        if (!TextUtils.isEmpty(this.f3247)) {
            return this.f3247;
        }
        if (!m2852()) {
            return isClickable() ? "android.widget.Button" : "android.view.View";
        }
        getParent();
        return "android.widget.Button";
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.f3248;
        return insetDrawable == null ? this.f3237 : insetDrawable;
    }

    public Drawable getCheckedIcon() {
        C3189 c3189 = this.f3237;
        if (c3189 != null) {
            return c3189.f12367;
        }
        return null;
    }

    public ColorStateList getCheckedIconTint() {
        C3189 c3189 = this.f3237;
        if (c3189 != null) {
            return c3189.f12384;
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        C3189 c3189 = this.f3237;
        if (c3189 != null) {
            return c3189.f12335;
        }
        return null;
    }

    public float getChipCornerRadius() {
        C3189 c3189 = this.f3237;
        if (c3189 != null) {
            return Math.max(0.0f, c3189.m7887());
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.f3237;
    }

    public float getChipEndPadding() {
        C3189 c3189 = this.f3237;
        if (c3189 != null) {
            return c3189.f12359;
        }
        return 0.0f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Drawable getChipIcon() {
        Drawable drawable;
        C3189 c3189 = this.f3237;
        if (c3189 == null || (drawable = c3189.f12381) == 0) {
            return null;
        }
        boolean z = drawable instanceof InterfaceC2465;
        Drawable drawable2 = drawable;
        if (z) {
            drawable2 = ((C2467) ((InterfaceC2465) drawable)).f9810;
        }
        return drawable2;
    }

    public float getChipIconSize() {
        C3189 c3189 = this.f3237;
        if (c3189 != null) {
            return c3189.f12328;
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        C3189 c3189 = this.f3237;
        if (c3189 != null) {
            return c3189.f12386;
        }
        return null;
    }

    public float getChipMinHeight() {
        C3189 c3189 = this.f3237;
        if (c3189 != null) {
            return c3189.f12363;
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        C3189 c3189 = this.f3237;
        if (c3189 != null) {
            return c3189.f12383;
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        C3189 c3189 = this.f3237;
        if (c3189 != null) {
            return c3189.f12362;
        }
        return null;
    }

    public float getChipStrokeWidth() {
        C3189 c3189 = this.f3237;
        if (c3189 != null) {
            return c3189.f12372;
        }
        return 0.0f;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Drawable getCloseIcon() {
        Drawable drawable;
        C3189 c3189 = this.f3237;
        if (c3189 == null || (drawable = c3189.f12337) == 0) {
            return null;
        }
        boolean z = drawable instanceof InterfaceC2465;
        Drawable drawable2 = drawable;
        if (z) {
            drawable2 = ((C2467) ((InterfaceC2465) drawable)).f9810;
        }
        return drawable2;
    }

    public CharSequence getCloseIconContentDescription() {
        C3189 c3189 = this.f3237;
        if (c3189 != null) {
            return c3189.f12327;
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        C3189 c3189 = this.f3237;
        if (c3189 != null) {
            return c3189.f12374;
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        C3189 c3189 = this.f3237;
        if (c3189 != null) {
            return c3189.f12353;
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        C3189 c3189 = this.f3237;
        if (c3189 != null) {
            return c3189.f12369;
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        C3189 c3189 = this.f3237;
        if (c3189 != null) {
            return c3189.f12377;
        }
        return null;
    }

    @Override // android.widget.TextView
    public TextUtils.TruncateAt getEllipsize() {
        C3189 c3189 = this.f3237;
        if (c3189 != null) {
            return c3189.f12385;
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public final void getFocusedRect(Rect rect) {
        if (this.f3246) {
            C3186 c3186 = this.f3235;
            if (c3186.f19943 == 1 || c3186.f19945 == 1) {
                rect.set(getCloseIconTouchBoundsInt());
                return;
            }
        }
        super.getFocusedRect(rect);
    }

    public C2838 getHideMotionSpec() {
        C3189 c3189 = this.f3237;
        if (c3189 != null) {
            return c3189.f12371;
        }
        return null;
    }

    public float getIconEndPadding() {
        C3189 c3189 = this.f3237;
        if (c3189 != null) {
            return c3189.f12379;
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        C3189 c3189 = this.f3237;
        if (c3189 != null) {
            return c3189.f12373;
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        C3189 c3189 = this.f3237;
        if (c3189 != null) {
            return c3189.f12370;
        }
        return null;
    }

    public C4089 getShapeAppearanceModel() {
        return this.f3237.f15848.f15817;
    }

    public C2838 getShowMotionSpec() {
        C3189 c3189 = this.f3237;
        if (c3189 != null) {
            return c3189.f12333;
        }
        return null;
    }

    public float getTextEndPadding() {
        C3189 c3189 = this.f3237;
        if (c3189 != null) {
            return c3189.f12368;
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        C3189 c3189 = this.f3237;
        if (c3189 != null) {
            return c3189.f12375;
        }
        return 0.0f;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ˈⁱ.ﹳﹳ.ᵢٴ(this, this.f3237);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f3234);
        }
        if (m2852()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f3232);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (this.f3246) {
            C3186 c3186 = this.f3235;
            int i2 = c3186.f19943;
            if (i2 != Integer.MIN_VALUE) {
                c3186.m11557(i2);
            }
            if (z) {
                c3186.m11558(i, rect);
            }
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 7) {
            setCloseIconHovered(getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()));
        } else if (actionMasked == 10) {
            setCloseIconHovered(false);
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getAccessibilityClassName());
        accessibilityNodeInfo.setCheckable(m2852());
        accessibilityNodeInfo.setClickable(isClickable());
        getParent();
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i) {
        return (getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) && isEnabled()) ? PointerIcon.getSystemIcon(getContext(), 1002) : super.onResolvePointerIcon(motionEvent, i);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        if (this.f3249 != i) {
            this.f3249 = i;
            m2851();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
    
        if (r0 != 3) goto L28;
     */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            int r0 = r6.getActionMasked()
            android.graphics.RectF r1 = r5.getCloseIconTouchBounds()
            float r2 = r6.getX()
            float r3 = r6.getY()
            boolean r1 = r1.contains(r2, r3)
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L4a
            if (r0 == r3) goto L2c
            r4 = 2
            if (r0 == r4) goto L21
            r1 = 3
            if (r0 == r1) goto L45
            goto L50
        L21:
            boolean r0 = r5.f3252
            if (r0 == 0) goto L50
            if (r1 != 0) goto L2a
            r5.setCloseIconPressed(r2)
        L2a:
            r0 = 1
            goto L51
        L2c:
            boolean r0 = r5.f3252
            if (r0 == 0) goto L45
            r5.playSoundEffect(r2)
            android.view.View$OnClickListener r0 = r5.f3239
            if (r0 == 0) goto L3a
            r0.onClick(r5)
        L3a:
            boolean r0 = r5.f3246
            if (r0 == 0) goto L43
            יـ.ʽᐧ r0 = r5.f3235
            r0.m11562(r3, r3)
        L43:
            r0 = 1
            goto L46
        L45:
            r0 = 0
        L46:
            r5.setCloseIconPressed(r2)
            goto L51
        L4a:
            if (r1 == 0) goto L50
            r5.setCloseIconPressed(r3)
            goto L2a
        L50:
            r0 = 0
        L51:
            if (r0 != 0) goto L59
            boolean r6 = super.onTouchEvent(r6)
            if (r6 == 0) goto L5a
        L59:
            r2 = 1
        L5a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setAccessibilityClassName(CharSequence charSequence) {
        this.f3247 = charSequence;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f3250) {
            super.setBackground(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
    }

    @Override // p222.C2945, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f3250) {
            super.setBackgroundDrawable(drawable);
        }
    }

    @Override // p222.C2945, android.view.View
    public void setBackgroundResource(int i) {
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
    }

    public void setCheckable(boolean z) {
        C3189 c3189 = this.f3237;
        if (c3189 != null) {
            c3189.m7875(z);
        }
    }

    public void setCheckableResource(int i) {
        C3189 c3189 = this.f3237;
        if (c3189 != null) {
            c3189.m7875(c3189.f12332.getResources().getBoolean(i));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        C3189 c3189 = this.f3237;
        if (c3189 == null) {
            this.f3244 = z;
        } else if (c3189.f12336) {
            super.setChecked(z);
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        C3189 c3189 = this.f3237;
        if (c3189 != null) {
            c3189.m7862(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z) {
        setCheckedIconVisible(z);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i) {
        setCheckedIconVisible(i);
    }

    public void setCheckedIconResource(int i) {
        C3189 c3189 = this.f3237;
        if (c3189 != null) {
            c3189.m7862(ٴˎ.ˏᵢ(c3189.f12332, i));
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        C3189 c3189 = this.f3237;
        if (c3189 != null) {
            c3189.m7869(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i) {
        C3189 c3189 = this.f3237;
        if (c3189 != null) {
            c3189.m7869(com.bumptech.glide.ﹳﹳ.ˑי(c3189.f12332, i));
        }
    }

    public void setCheckedIconVisible(int i) {
        C3189 c3189 = this.f3237;
        if (c3189 != null) {
            c3189.m7874(c3189.f12332.getResources().getBoolean(i));
        }
    }

    public void setCheckedIconVisible(boolean z) {
        C3189 c3189 = this.f3237;
        if (c3189 != null) {
            c3189.m7874(z);
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        C3189 c3189 = this.f3237;
        if (c3189 == null || c3189.f12335 == colorStateList) {
            return;
        }
        c3189.f12335 = colorStateList;
        c3189.onStateChange(c3189.getState());
    }

    public void setChipBackgroundColorResource(int i) {
        ColorStateList colorStateList;
        C3189 c3189 = this.f3237;
        if (c3189 == null || c3189.f12335 == (colorStateList = com.bumptech.glide.ﹳﹳ.ˑי(c3189.f12332, i))) {
            return;
        }
        c3189.f12335 = colorStateList;
        c3189.onStateChange(c3189.getState());
    }

    @Deprecated
    public void setChipCornerRadius(float f) {
        C3189 c3189 = this.f3237;
        if (c3189 != null) {
            c3189.m7863(f);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i) {
        C3189 c3189 = this.f3237;
        if (c3189 != null) {
            c3189.m7863(c3189.f12332.getResources().getDimension(i));
        }
    }

    public void setChipDrawable(C3189 c3189) {
        C3189 c31892 = this.f3237;
        if (c31892 != c3189) {
            if (c31892 != null) {
                c31892.f12380 = new WeakReference(null);
            }
            this.f3237 = c3189;
            c3189.f12357 = false;
            c3189.f12380 = new WeakReference(this);
            m2846(this.f3240);
        }
    }

    public void setChipEndPadding(float f) {
        C3189 c3189 = this.f3237;
        if (c3189 == null || c3189.f12359 == f) {
            return;
        }
        c3189.f12359 = f;
        c3189.invalidateSelf();
        c3189.m7885();
    }

    public void setChipEndPaddingResource(int i) throws Resources.NotFoundException {
        C3189 c3189 = this.f3237;
        if (c3189 != null) {
            float dimension = c3189.f12332.getResources().getDimension(i);
            if (c3189.f12359 != dimension) {
                c3189.f12359 = dimension;
                c3189.invalidateSelf();
                c3189.m7885();
            }
        }
    }

    public void setChipIcon(Drawable drawable) {
        C3189 c3189 = this.f3237;
        if (c3189 != null) {
            c3189.m7882(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z) {
        setChipIconVisible(z);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i) {
        setChipIconVisible(i);
    }

    public void setChipIconResource(int i) {
        C3189 c3189 = this.f3237;
        if (c3189 != null) {
            c3189.m7882(ٴˎ.ˏᵢ(c3189.f12332, i));
        }
    }

    public void setChipIconSize(float f) {
        C3189 c3189 = this.f3237;
        if (c3189 != null) {
            c3189.m7886(f);
        }
    }

    public void setChipIconSizeResource(int i) {
        C3189 c3189 = this.f3237;
        if (c3189 != null) {
            c3189.m7886(c3189.f12332.getResources().getDimension(i));
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        C3189 c3189 = this.f3237;
        if (c3189 != null) {
            c3189.m7866(colorStateList);
        }
    }

    public void setChipIconTintResource(int i) {
        C3189 c3189 = this.f3237;
        if (c3189 != null) {
            c3189.m7866(com.bumptech.glide.ﹳﹳ.ˑי(c3189.f12332, i));
        }
    }

    public void setChipIconVisible(int i) {
        C3189 c3189 = this.f3237;
        if (c3189 != null) {
            c3189.m7873(c3189.f12332.getResources().getBoolean(i));
        }
    }

    public void setChipIconVisible(boolean z) {
        C3189 c3189 = this.f3237;
        if (c3189 != null) {
            c3189.m7873(z);
        }
    }

    public void setChipMinHeight(float f) {
        C3189 c3189 = this.f3237;
        if (c3189 == null || c3189.f12363 == f) {
            return;
        }
        c3189.f12363 = f;
        c3189.invalidateSelf();
        c3189.m7885();
    }

    public void setChipMinHeightResource(int i) throws Resources.NotFoundException {
        C3189 c3189 = this.f3237;
        if (c3189 != null) {
            float dimension = c3189.f12332.getResources().getDimension(i);
            if (c3189.f12363 != dimension) {
                c3189.f12363 = dimension;
                c3189.invalidateSelf();
                c3189.m7885();
            }
        }
    }

    public void setChipStartPadding(float f) {
        C3189 c3189 = this.f3237;
        if (c3189 == null || c3189.f12383 == f) {
            return;
        }
        c3189.f12383 = f;
        c3189.invalidateSelf();
        c3189.m7885();
    }

    public void setChipStartPaddingResource(int i) throws Resources.NotFoundException {
        C3189 c3189 = this.f3237;
        if (c3189 != null) {
            float dimension = c3189.f12332.getResources().getDimension(i);
            if (c3189.f12383 != dimension) {
                c3189.f12383 = dimension;
                c3189.invalidateSelf();
                c3189.m7885();
            }
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        C3189 c3189 = this.f3237;
        if (c3189 != null) {
            c3189.m7876(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i) {
        C3189 c3189 = this.f3237;
        if (c3189 != null) {
            c3189.m7876(com.bumptech.glide.ﹳﹳ.ˑי(c3189.f12332, i));
        }
    }

    public void setChipStrokeWidth(float f) {
        C3189 c3189 = this.f3237;
        if (c3189 != null) {
            c3189.m7889(f);
        }
    }

    public void setChipStrokeWidthResource(int i) {
        C3189 c3189 = this.f3237;
        if (c3189 != null) {
            c3189.m7889(c3189.f12332.getResources().getDimension(i));
        }
    }

    @Deprecated
    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(int i) {
        setText(getResources().getString(i));
    }

    public void setCloseIcon(Drawable drawable) {
        C3189 c3189 = this.f3237;
        if (c3189 != null) {
            c3189.m7860(drawable);
        }
        m2847();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        C3189 c3189 = this.f3237;
        if (c3189 == null || c3189.f12327 == charSequence) {
            return;
        }
        String str = C3107.f11991;
        C3107 c3107 = TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1 ? C3107.f11992 : C3107.f11994;
        c3107.getClass();
        C2428 c2428 = AbstractC3112.f12004;
        c3189.f12327 = c3107.m7624(charSequence);
        c3189.invalidateSelf();
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z) {
        setCloseIconVisible(z);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i) {
        setCloseIconVisible(i);
    }

    public void setCloseIconEndPadding(float f) {
        C3189 c3189 = this.f3237;
        if (c3189 != null) {
            c3189.m7872(f);
        }
    }

    public void setCloseIconEndPaddingResource(int i) {
        C3189 c3189 = this.f3237;
        if (c3189 != null) {
            c3189.m7872(c3189.f12332.getResources().getDimension(i));
        }
    }

    public void setCloseIconResource(int i) {
        C3189 c3189 = this.f3237;
        if (c3189 != null) {
            c3189.m7860(ٴˎ.ˏᵢ(c3189.f12332, i));
        }
        m2847();
    }

    public void setCloseIconSize(float f) {
        C3189 c3189 = this.f3237;
        if (c3189 != null) {
            c3189.m7871(f);
        }
    }

    public void setCloseIconSizeResource(int i) {
        C3189 c3189 = this.f3237;
        if (c3189 != null) {
            c3189.m7871(c3189.f12332.getResources().getDimension(i));
        }
    }

    public void setCloseIconStartPadding(float f) {
        C3189 c3189 = this.f3237;
        if (c3189 != null) {
            c3189.m7883(f);
        }
    }

    public void setCloseIconStartPaddingResource(int i) {
        C3189 c3189 = this.f3237;
        if (c3189 != null) {
            c3189.m7883(c3189.f12332.getResources().getDimension(i));
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        C3189 c3189 = this.f3237;
        if (c3189 != null) {
            c3189.m7870(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i) {
        C3189 c3189 = this.f3237;
        if (c3189 != null) {
            c3189.m7870(com.bumptech.glide.ﹳﹳ.ˑי(c3189.f12332, i));
        }
    }

    public void setCloseIconVisible(int i) {
        setCloseIconVisible(getResources().getBoolean(i));
    }

    public void setCloseIconVisible(boolean z) {
        C3189 c3189 = this.f3237;
        if (c3189 != null) {
            c3189.m7881(z);
        }
        m2847();
    }

    @Override // p222.C2945, android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
    }

    @Override // p222.C2945, android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i3 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(i, i2, i3, i4);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i3 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesWithIntrinsicBounds(i, i2, i3, i4);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        C3189 c3189 = this.f3237;
        if (c3189 != null) {
            c3189.m9406(f);
        }
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.f3237 == null) {
            return;
        }
        if (truncateAt == TextUtils.TruncateAt.MARQUEE) {
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
        super.setEllipsize(truncateAt);
        C3189 c3189 = this.f3237;
        if (c3189 != null) {
            c3189.f12385 = truncateAt;
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z) {
        this.f3241 = z;
        m2846(this.f3240);
    }

    @Override // android.widget.TextView
    public void setGravity(int i) {
        if (i != 8388627) {
            return;
        }
        super.setGravity(i);
    }

    public void setHideMotionSpec(C2838 c2838) {
        C3189 c3189 = this.f3237;
        if (c3189 != null) {
            c3189.f12371 = c2838;
        }
    }

    public void setHideMotionSpecResource(int i) {
        C3189 c3189 = this.f3237;
        if (c3189 != null) {
            c3189.f12371 = C2838.m7110(c3189.f12332, i);
        }
    }

    public void setIconEndPadding(float f) {
        C3189 c3189 = this.f3237;
        if (c3189 != null) {
            c3189.m7859(f);
        }
    }

    public void setIconEndPaddingResource(int i) {
        C3189 c3189 = this.f3237;
        if (c3189 != null) {
            c3189.m7859(c3189.f12332.getResources().getDimension(i));
        }
    }

    public void setIconStartPadding(float f) {
        C3189 c3189 = this.f3237;
        if (c3189 != null) {
            c3189.m7880(f);
        }
    }

    public void setIconStartPaddingResource(int i) {
        C3189 c3189 = this.f3237;
        if (c3189 != null) {
            c3189.m7880(c3189.f12332.getResources().getDimension(i));
        }
    }

    public void setInternalOnCheckedChangeListener(InterfaceC2842 interfaceC2842) {
    }

    @Override // android.view.View
    public void setLayoutDirection(int i) {
        if (this.f3237 == null) {
            return;
        }
        super.setLayoutDirection(i);
    }

    @Override // android.widget.TextView
    public void setLines(int i) {
        if (i > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setLines(i);
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i) {
        if (i > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMaxLines(i);
    }

    @Override // android.widget.TextView
    public void setMaxWidth(int i) {
        super.setMaxWidth(i);
        C3189 c3189 = this.f3237;
        if (c3189 != null) {
            c3189.f12354 = i;
        }
    }

    @Override // android.widget.TextView
    public void setMinLines(int i) {
        if (i > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMinLines(i);
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f3243 = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.f3239 = onClickListener;
        m2847();
    }

    public void setRippleColor(ColorStateList colorStateList) {
        C3189 c3189 = this.f3237;
        if (c3189 != null) {
            c3189.m7879(colorStateList);
        }
        this.f3237.getClass();
        m2850();
    }

    public void setRippleColorResource(int i) {
        C3189 c3189 = this.f3237;
        if (c3189 != null) {
            c3189.m7879(com.bumptech.glide.ﹳﹳ.ˑי(c3189.f12332, i));
            this.f3237.getClass();
            m2850();
        }
    }

    @Override // p361.InterfaceC4106
    public void setShapeAppearanceModel(C4089 c4089) {
        this.f3237.setShapeAppearanceModel(c4089);
    }

    public void setShowMotionSpec(C2838 c2838) {
        C3189 c3189 = this.f3237;
        if (c3189 != null) {
            c3189.f12333 = c2838;
        }
    }

    public void setShowMotionSpecResource(int i) {
        C3189 c3189 = this.f3237;
        if (c3189 != null) {
            c3189.f12333 = C2838.m7110(c3189.f12332, i);
        }
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z) {
        if (!z) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setSingleLine(z);
    }

    @Override // android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        C3189 c3189 = this.f3237;
        if (c3189 == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = "";
        }
        super.setText(c3189.f12357 ? null : charSequence, bufferType);
        C3189 c31892 = this.f3237;
        if (c31892 == null || TextUtils.equals(c31892.f12352, charSequence)) {
            return;
        }
        c31892.f12352 = charSequence;
        c31892.f12361.f11070 = true;
        c31892.invalidateSelf();
        c31892.m7885();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i) {
        super.setTextAppearance(i);
        C3189 c3189 = this.f3237;
        if (c3189 != null) {
            c3189.m7888(new C3057(c3189.f12332, i));
        }
        m2848();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C3189 c3189 = this.f3237;
        if (c3189 != null) {
            c3189.m7888(new C3057(c3189.f12332, i));
        }
        m2848();
    }

    public void setTextAppearance(C3057 c3057) {
        C3189 c3189 = this.f3237;
        if (c3189 != null) {
            c3189.m7888(c3057);
        }
        m2848();
    }

    public void setTextAppearanceResource(int i) {
        setTextAppearance(getContext(), i);
    }

    public void setTextEndPadding(float f) {
        C3189 c3189 = this.f3237;
        if (c3189 == null || c3189.f12368 == f) {
            return;
        }
        c3189.f12368 = f;
        c3189.invalidateSelf();
        c3189.m7885();
    }

    public void setTextEndPaddingResource(int i) throws Resources.NotFoundException {
        C3189 c3189 = this.f3237;
        if (c3189 != null) {
            float dimension = c3189.f12332.getResources().getDimension(i);
            if (c3189.f12368 != dimension) {
                c3189.f12368 = dimension;
                c3189.invalidateSelf();
                c3189.m7885();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f) {
        super.setTextSize(i, f);
        C3189 c3189 = this.f3237;
        if (c3189 != null) {
            float fApplyDimension = TypedValue.applyDimension(i, f, getResources().getDisplayMetrics());
            C2846 c2846 = c3189.f12361;
            C3057 c3057 = c2846.f11069;
            if (c3057 != null) {
                c3057.f11773 = fApplyDimension;
                c2846.f11068.setTextSize(fApplyDimension);
                c3189.m7885();
                c3189.invalidateSelf();
            }
        }
        m2848();
    }

    public void setTextStartPadding(float f) {
        C3189 c3189 = this.f3237;
        if (c3189 == null || c3189.f12375 == f) {
            return;
        }
        c3189.f12375 = f;
        c3189.invalidateSelf();
        c3189.m7885();
    }

    public void setTextStartPaddingResource(int i) throws Resources.NotFoundException {
        C3189 c3189 = this.f3237;
        if (c3189 != null) {
            float dimension = c3189.f12332.getResources().getDimension(i);
            if (c3189.f12375 != dimension) {
                c3189.f12375 = dimension;
                c3189.invalidateSelf();
                c3189.m7885();
            }
        }
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final void m2846(int i) {
        this.f3240 = i;
        if (!this.f3241) {
            InsetDrawable insetDrawable = this.f3248;
            if (insetDrawable == null) {
                int[] iArr = AbstractC1298.f5320;
                m2850();
                return;
            } else {
                if (insetDrawable != null) {
                    this.f3248 = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    int[] iArr2 = AbstractC1298.f5320;
                    m2850();
                    return;
                }
                return;
            }
        }
        int iMax = Math.max(0, i - ((int) this.f3237.f12363));
        int iMax2 = Math.max(0, i - this.f3237.getIntrinsicWidth());
        if (iMax2 <= 0 && iMax <= 0) {
            InsetDrawable insetDrawable2 = this.f3248;
            if (insetDrawable2 == null) {
                int[] iArr3 = AbstractC1298.f5320;
                m2850();
                return;
            } else {
                if (insetDrawable2 != null) {
                    this.f3248 = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    int[] iArr4 = AbstractC1298.f5320;
                    m2850();
                    return;
                }
                return;
            }
        }
        int i2 = iMax2 > 0 ? iMax2 / 2 : 0;
        int i3 = iMax > 0 ? iMax / 2 : 0;
        if (this.f3248 != null) {
            Rect rect = new Rect();
            this.f3248.getPadding(rect);
            if (rect.top == i3 && rect.bottom == i3 && rect.left == i2 && rect.right == i2) {
                int[] iArr5 = AbstractC1298.f5320;
                m2850();
                return;
            }
        }
        if (getMinHeight() != i) {
            setMinHeight(i);
        }
        if (getMinWidth() != i) {
            setMinWidth(i);
        }
        this.f3248 = new InsetDrawable((Drawable) this.f3237, i2, i3, i2, i3);
        int[] iArr6 = AbstractC1298.f5320;
        m2850();
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final void m2847() {
        C3189 c3189;
        if (!m2849() || (c3189 = this.f3237) == null || !c3189.f12349 || this.f3239 == null) {
            AbstractC4345.m9884(this, null);
            this.f3246 = false;
        } else {
            AbstractC4345.m9884(this, this.f3235);
            this.f3246 = true;
        }
    }

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final void m2848() {
        TextPaint paint = getPaint();
        C3189 c3189 = this.f3237;
        if (c3189 != null) {
            paint.drawableState = c3189.getState();
        }
        C3057 textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.m7549(getContext(), paint, this.f3238);
        }
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final boolean m2849() {
        C3189 c3189 = this.f3237;
        if (c3189 != null) {
            Object obj = c3189.f12337;
            if (obj == null) {
                obj = null;
            } else if (obj instanceof InterfaceC2465) {
                obj = ((C2467) ((InterfaceC2465) obj)).f9810;
            }
            if (obj != null) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final void m2850() {
        this.f3250 = new RippleDrawable(AbstractC1298.m4597(this.f3237.f12370), getBackgroundDrawable(), null);
        this.f3237.getClass();
        setBackground(this.f3250);
        m2851();
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final void m2851() {
        C3189 c3189;
        if (TextUtils.isEmpty(getText()) || (c3189 = this.f3237) == null) {
            return;
        }
        int iM7867 = (int) (c3189.m7867() + c3189.f12359 + c3189.f12368);
        C3189 c31892 = this.f3237;
        int iM7861 = (int) (c31892.m7861() + c31892.f12383 + c31892.f12375);
        if (this.f3248 != null) {
            Rect rect = new Rect();
            this.f3248.getPadding(rect);
            iM7861 += rect.left;
            iM7867 += rect.right;
        }
        setPaddingRelative(iM7861, getPaddingTop(), iM7867, getPaddingBottom());
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final boolean m2852() {
        C3189 c3189 = this.f3237;
        return c3189 != null && c3189.f12336;
    }
}
