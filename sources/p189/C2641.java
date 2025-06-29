package p189;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.AnimatedStateListDrawable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillManager;
import android.widget.CompoundButton;
import androidx.leanback.widget.C0168;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import org.lsposed.hiddenapibypass.library.R;
import p131.C2060;
import p131.C2061;
import p131.C2075;
import p222.C2945;
import p278.AbstractC3362;
import ʼˉ.ٴˎ;
import ˈⁱ.ﹳﹳ;
import ᵎﹳ.ᐧʻ;

/* renamed from: ˎʿ.ˑʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2641 extends C2945 {

    /* renamed from: ʻʿ, reason: contains not printable characters */
    public int f10458;

    /* renamed from: ʾʼ, reason: contains not printable characters */
    public Drawable f10459;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final LinkedHashSet f10460;

    /* renamed from: ˊᵔ, reason: contains not printable characters */
    public CompoundButton.OnCheckedChangeListener f10461;

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public boolean f10462;

    /* renamed from: ˋﾞ, reason: contains not printable characters */
    public final C2061 f10463;

    /* renamed from: ˎᵔ, reason: contains not printable characters */
    public ColorStateList f10464;

    /* renamed from: ˑⁱ, reason: contains not printable characters */
    public boolean f10465;

    /* renamed from: ˑﾞ, reason: contains not printable characters */
    public Drawable f10466;

    /* renamed from: ـˆ, reason: contains not printable characters */
    public boolean f10467;

    /* renamed from: ᴵʼ, reason: contains not printable characters */
    public boolean f10468;

    /* renamed from: ᵎʽ, reason: contains not printable characters */
    public final C2642 f10469;

    /* renamed from: ᵔ, reason: contains not printable characters */
    public boolean f10470;

    /* renamed from: ᵔٴ, reason: contains not printable characters */
    public int[] f10471;

    /* renamed from: ᵔﹳ, reason: contains not printable characters */
    public PorterDuff.Mode f10472;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final LinkedHashSet f10473;

    /* renamed from: ᵢٴ, reason: contains not printable characters */
    public ColorStateList f10474;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public ColorStateList f10475;

    /* renamed from: ﾞˎ, reason: contains not printable characters */
    public CharSequence f10476;

    /* renamed from: ﾞᐧ, reason: contains not printable characters */
    public CharSequence f10477;

    /* renamed from: ʿˊ, reason: contains not printable characters */
    public static final int[] f10454 = {R.attr._2_res_0x7f040555};

    /* renamed from: ˉᵎ, reason: contains not printable characters */
    public static final int[] f10455 = {R.attr._2_res_0x7f040554};

    /* renamed from: ⁱʿ, reason: contains not printable characters */
    public static final int[][] f10457 = {new int[]{android.R.attr.state_enabled, R.attr._2_res_0x7f040554}, new int[]{android.R.attr.state_enabled, android.R.attr.state_checked}, new int[]{android.R.attr.state_enabled, -16842912}, new int[]{-16842910, android.R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* renamed from: ˎˉ, reason: contains not printable characters */
    public static final int f10456 = Resources.getSystem().getIdentifier("btn_check_material_anim", "drawable", "android");

    /* JADX WARN: Removed duplicated region for block: B:24:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x013f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C2641(android.content.Context r14, android.util.AttributeSet r15) throws org.xmlpull.v1.XmlPullParserException, android.content.res.Resources.NotFoundException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 333
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p189.C2641.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    private String getButtonStateDescription() {
        int i = this.f10458;
        return i == 1 ? getResources().getString(R.string._2_res_0x7f130134) : i == 0 ? getResources().getString(R.string._2_res_0x7f130136) : getResources().getString(R.string._2_res_0x7f130135);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f10475 == null) {
            int iM8199 = AbstractC3362.m8199(this, R.attr._2_res_0x7f040132);
            int iM81992 = AbstractC3362.m8199(this, R.attr._2_res_0x7f040135);
            int iM81993 = AbstractC3362.m8199(this, R.attr._2_res_0x7f040169);
            int iM81994 = AbstractC3362.m8199(this, R.attr._2_res_0x7f04014f);
            this.f10475 = new ColorStateList(f10457, new int[]{AbstractC3362.m8206(1.0f, iM81993, iM81992), AbstractC3362.m8206(1.0f, iM81993, iM8199), AbstractC3362.m8206(0.54f, iM81993, iM81994), AbstractC3362.m8206(0.38f, iM81993, iM81994), AbstractC3362.m8206(0.38f, iM81993, iM81994)});
        }
        return this.f10475;
    }

    private ColorStateList getSuperButtonTintList() {
        ColorStateList colorStateList = this.f10474;
        return colorStateList != null ? colorStateList : super.getButtonTintList() != null ? super.getButtonTintList() : getSupportButtonTintList();
    }

    @Override // android.widget.CompoundButton
    public Drawable getButtonDrawable() {
        return this.f10459;
    }

    public Drawable getButtonIconDrawable() {
        return this.f10466;
    }

    public ColorStateList getButtonIconTintList() {
        return this.f10464;
    }

    public PorterDuff.Mode getButtonIconTintMode() {
        return this.f10472;
    }

    @Override // android.widget.CompoundButton
    public ColorStateList getButtonTintList() {
        return this.f10474;
    }

    public int getCheckedState() {
        return this.f10458;
    }

    public CharSequence getErrorAccessibilityLabel() {
        return this.f10477;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final boolean isChecked() {
        return this.f10458 == 1;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f10462 && this.f10474 == null && this.f10464 == null) {
            setUseMaterialThemeColors(true);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrCopyOf;
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (getCheckedState() == 2) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f10454);
        }
        if (this.f10468) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f10455);
        }
        int i2 = 0;
        while (true) {
            if (i2 >= iArrOnCreateDrawableState.length) {
                iArrCopyOf = Arrays.copyOf(iArrOnCreateDrawableState, iArrOnCreateDrawableState.length + 1);
                iArrCopyOf[iArrOnCreateDrawableState.length] = 16842912;
                break;
            }
            int i3 = iArrOnCreateDrawableState[i2];
            if (i3 == 16842912) {
                iArrCopyOf = iArrOnCreateDrawableState;
                break;
            }
            if (i3 == 0) {
                iArrCopyOf = (int[]) iArrOnCreateDrawableState.clone();
                iArrCopyOf[i2] = 16842912;
                break;
            }
            i2++;
        }
        this.f10471 = iArrCopyOf;
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        Drawable drawable;
        if (!this.f10467 || !TextUtils.isEmpty(getText()) || (drawable = ٴˎ.ˑי(this)) == null) {
            super.onDraw(canvas);
            return;
        }
        int width = ((getWidth() - drawable.getIntrinsicWidth()) / 2) * (getLayoutDirection() == 1 ? -1 : 1);
        int iSave = canvas.save();
        canvas.translate(width, 0.0f);
        super.onDraw(canvas);
        canvas.restoreToCount(iSave);
        if (getBackground() != null) {
            Rect bounds = drawable.getBounds();
            getBackground().setHotspotBounds(bounds.left + width, bounds.top, bounds.right + width, bounds.bottom);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo != null && this.f10468) {
            accessibilityNodeInfo.setText(((Object) accessibilityNodeInfo.getText()) + ", " + ((Object) this.f10477));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C2640)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C2640 c2640 = (C2640) parcelable;
        super.onRestoreInstanceState(c2640.getSuperState());
        setCheckedState(c2640.f10453);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        C2640 c2640 = new C2640(super.onSaveInstanceState());
        c2640.f10453 = getCheckedState();
        return c2640;
    }

    @Override // p222.C2945, android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(ᴵﹳ.ٴˎ.ˏᵢ(getContext(), i));
    }

    @Override // p222.C2945, android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        this.f10459 = drawable;
        this.f10465 = false;
        m6824();
    }

    public void setButtonIconDrawable(Drawable drawable) {
        this.f10466 = drawable;
        m6824();
    }

    public void setButtonIconDrawableResource(int i) {
        setButtonIconDrawable(ᴵﹳ.ٴˎ.ˏᵢ(getContext(), i));
    }

    public void setButtonIconTintList(ColorStateList colorStateList) {
        if (this.f10464 == colorStateList) {
            return;
        }
        this.f10464 = colorStateList;
        m6824();
    }

    public void setButtonIconTintMode(PorterDuff.Mode mode) {
        if (this.f10472 == mode) {
            return;
        }
        this.f10472 = mode;
        m6824();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintList(ColorStateList colorStateList) {
        if (this.f10474 == colorStateList) {
            return;
        }
        this.f10474 = colorStateList;
        m6824();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintMode(PorterDuff.Mode mode) {
        setSupportButtonTintMode(mode);
        m6824();
    }

    public void setCenterIfNoTextEnabled(boolean z) {
        this.f10467 = z;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        setCheckedState(z ? 1 : 0);
    }

    public void setCheckedState(int i) {
        AutofillManager autofillManager;
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        if (this.f10458 != i) {
            this.f10458 = i;
            super.setChecked(i == 1);
            refreshDrawableState();
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 30 && this.f10476 == null) {
                super.setStateDescription(getButtonStateDescription());
            }
            if (this.f10470) {
                return;
            }
            this.f10470 = true;
            LinkedHashSet linkedHashSet = this.f10473;
            if (linkedHashSet != null) {
                Iterator it = linkedHashSet.iterator();
                if (it.hasNext()) {
                    it.next().getClass();
                    throw new ClassCastException();
                }
            }
            if (this.f10458 != 2 && (onCheckedChangeListener = this.f10461) != null) {
                onCheckedChangeListener.onCheckedChanged(this, isChecked());
            }
            if (i2 >= 26 && (autofillManager = (AutofillManager) getContext().getSystemService(AutofillManager.class)) != null) {
                autofillManager.notifyValueChanged(this);
            }
            this.f10470 = false;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
    }

    public void setErrorAccessibilityLabel(CharSequence charSequence) {
        this.f10477 = charSequence;
    }

    public void setErrorAccessibilityLabelResource(int i) {
        setErrorAccessibilityLabel(i != 0 ? getResources().getText(i) : null);
    }

    public void setErrorShown(boolean z) {
        if (this.f10468 == z) {
            return;
        }
        this.f10468 = z;
        refreshDrawableState();
        Iterator it = this.f10460.iterator();
        if (it.hasNext()) {
            ᐧʻ.ᵎˏ(it.next());
            throw null;
        }
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f10461 = onCheckedChangeListener;
    }

    @Override // android.widget.CompoundButton, android.view.View
    public void setStateDescription(CharSequence charSequence) {
        this.f10476 = charSequence;
        if (charSequence != null) {
            super.setStateDescription(charSequence);
        } else {
            if (Build.VERSION.SDK_INT < 30 || charSequence != null) {
                return;
            }
            super.setStateDescription(getButtonStateDescription());
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.f10462 = z;
        if (z) {
            setButtonTintList(getMaterialThemeColorsTintList());
        } else {
            setButtonTintList(null);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        setChecked(!isChecked());
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void m6824() {
        LayerDrawable layerDrawable;
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        C0168 c0168;
        this.f10459 = ﹳﹳ.ˏʾ(this.f10459, this.f10474, getButtonTintMode());
        this.f10466 = ﹳﹳ.ˏʾ(this.f10466, this.f10464, this.f10472);
        if (this.f10465) {
            C2061 c2061 = this.f10463;
            if (c2061 != null) {
                Drawable drawable = c2061.f7844;
                C2642 c2642 = this.f10469;
                if (drawable != null) {
                    AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) drawable;
                    if (c2642.f10479 == null) {
                        c2642.f10479 = new C2060(c2642);
                    }
                    animatedVectorDrawable.unregisterAnimationCallback(c2642.f10479);
                }
                ArrayList arrayList = c2061.f7803;
                C2075 c2075 = c2061.f7802;
                if (arrayList != null && c2642 != null) {
                    arrayList.remove(c2642);
                    if (c2061.f7803.size() == 0 && (c0168 = c2061.f7805) != null) {
                        c2075.f7886.removeListener(c0168);
                        c2061.f7805 = null;
                    }
                }
                Drawable drawable2 = c2061.f7844;
                if (drawable2 != null) {
                    AnimatedVectorDrawable animatedVectorDrawable2 = (AnimatedVectorDrawable) drawable2;
                    if (c2642.f10479 == null) {
                        c2642.f10479 = new C2060(c2642);
                    }
                    animatedVectorDrawable2.registerAnimationCallback(c2642.f10479);
                } else if (c2642 != null) {
                    if (c2061.f7803 == null) {
                        c2061.f7803 = new ArrayList();
                    }
                    if (!c2061.f7803.contains(c2642)) {
                        c2061.f7803.add(c2642);
                        if (c2061.f7805 == null) {
                            c2061.f7805 = new C0168(1, c2061);
                        }
                        c2075.f7886.addListener(c2061.f7805);
                    }
                }
            }
            if (Build.VERSION.SDK_INT >= 24) {
                Drawable drawable3 = this.f10459;
                if ((drawable3 instanceof AnimatedStateListDrawable) && c2061 != null) {
                    ((AnimatedStateListDrawable) drawable3).addTransition(R.id._2_res_0x7f0b00c5, R.id._2_res_0x7f0b0404, c2061, false);
                    ((AnimatedStateListDrawable) this.f10459).addTransition(R.id._2_res_0x7f0b01f4, R.id._2_res_0x7f0b0404, c2061, false);
                }
            }
        }
        Drawable drawable4 = this.f10459;
        if (drawable4 != null && (colorStateList2 = this.f10474) != null) {
            drawable4.setTintList(colorStateList2);
        }
        Drawable drawable5 = this.f10466;
        if (drawable5 != null && (colorStateList = this.f10464) != null) {
            drawable5.setTintList(colorStateList);
        }
        Drawable drawable6 = this.f10459;
        Drawable drawable7 = this.f10466;
        if (drawable6 == null) {
            drawable6 = drawable7;
        } else if (drawable7 != null) {
            int intrinsicWidth = drawable7.getIntrinsicWidth();
            if (intrinsicWidth == -1) {
                intrinsicWidth = drawable6.getIntrinsicWidth();
            }
            int intrinsicHeight = drawable7.getIntrinsicHeight();
            if (intrinsicHeight == -1) {
                intrinsicHeight = drawable6.getIntrinsicHeight();
            }
            if (intrinsicWidth > drawable6.getIntrinsicWidth() || intrinsicHeight > drawable6.getIntrinsicHeight()) {
                float f = intrinsicWidth / intrinsicHeight;
                if (f >= drawable6.getIntrinsicWidth() / drawable6.getIntrinsicHeight()) {
                    int intrinsicWidth2 = drawable6.getIntrinsicWidth();
                    intrinsicHeight = (int) (intrinsicWidth2 / f);
                    intrinsicWidth = intrinsicWidth2;
                } else {
                    intrinsicHeight = drawable6.getIntrinsicHeight();
                    intrinsicWidth = (int) (f * intrinsicHeight);
                }
            }
            if (Build.VERSION.SDK_INT >= 23) {
                layerDrawable = new LayerDrawable(new Drawable[]{drawable6, drawable7});
                layerDrawable.setLayerSize(1, intrinsicWidth, intrinsicHeight);
                layerDrawable.setLayerGravity(1, 17);
            } else {
                layerDrawable = new LayerDrawable(new Drawable[]{drawable6, drawable7});
                int iMax = Math.max((drawable6.getIntrinsicWidth() - intrinsicWidth) / 2, 0);
                int iMax2 = Math.max((drawable6.getIntrinsicHeight() - intrinsicHeight) / 2, 0);
                layerDrawable.setLayerInset(1, iMax, iMax2, iMax, iMax2);
            }
            drawable6 = layerDrawable;
        }
        super.setButtonDrawable(drawable6);
        refreshDrawableState();
    }
}
