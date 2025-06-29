package p222;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import java.lang.reflect.InvocationTargetException;
import p004.InterfaceC0925;
import p036.C1262;
import ˈⁱ.ˉⁱ;

/* renamed from: ˏᴵ.ˑי, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C2914 extends Button implements InterfaceC0925 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final C2941 f11291;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public C2972 f11292;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final C1262 f11293;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2914(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        AbstractC2902.m7248(context);
        AbstractC2873.m7187(getContext(), this);
        C1262 c1262 = new C1262(this);
        this.f11293 = c1262;
        c1262.m4491(attributeSet, i);
        C2941 c2941 = new C2941(this);
        this.f11291 = c2941;
        c2941.m7308(attributeSet, i);
        c2941.m7301();
        getEmojiTextViewHelper().m7344(attributeSet, i);
    }

    private C2972 getEmojiTextViewHelper() {
        if (this.f11292 == null) {
            this.f11292 = new C2972(this);
        }
        return this.f11292;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C1262 c1262 = this.f11293;
        if (c1262 != null) {
            c1262.m4520();
        }
        C2941 c2941 = this.f11291;
        if (c2941 != null) {
            c2941.m7301();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (AbstractC2926.f11334) {
            return super.getAutoSizeMaxTextSize();
        }
        C2941 c2941 = this.f11291;
        if (c2941 != null) {
            return Math.round(c2941.f11377.f11342);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (AbstractC2926.f11334) {
            return super.getAutoSizeMinTextSize();
        }
        C2941 c2941 = this.f11291;
        if (c2941 != null) {
            return Math.round(c2941.f11377.f11350);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (AbstractC2926.f11334) {
            return super.getAutoSizeStepGranularity();
        }
        C2941 c2941 = this.f11291;
        if (c2941 != null) {
            return Math.round(c2941.f11377.f11346);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (AbstractC2926.f11334) {
            return super.getAutoSizeTextAvailableSizes();
        }
        C2941 c2941 = this.f11291;
        return c2941 != null ? c2941.f11377.f11348 : new int[0];
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (AbstractC2926.f11334) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        C2941 c2941 = this.f11291;
        if (c2941 != null) {
            return c2941.f11377.f11347;
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return ˉⁱ.ˆᵔ(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        C1262 c1262 = this.f11293;
        if (c1262 != null) {
            return c1262.m4505();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C1262 c1262 = this.f11293;
        if (c1262 != null) {
            return c1262.m4514();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f11291.m7311();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f11291.m7302();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        C2941 c2941 = this.f11291;
        if (c2941 == null || AbstractC2926.f11334) {
            return;
        }
        c2941.f11377.m7289();
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        C2941 c2941 = this.f11291;
        if (c2941 == null || AbstractC2926.f11334) {
            return;
        }
        C2929 c2929 = c2941.f11377;
        if (c2929.m7290()) {
            c2929.m7289();
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().m7345(z);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (AbstractC2926.f11334) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        C2941 c2941 = this.f11291;
        if (c2941 != null) {
            c2941.m7312(i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (AbstractC2926.f11334) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        C2941 c2941 = this.f11291;
        if (c2941 != null) {
            c2941.m7303(iArr, i);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (AbstractC2926.f11334) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        C2941 c2941 = this.f11291;
        if (c2941 != null) {
            c2941.m7306(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1262 c1262 = this.f11293;
        if (c1262 != null) {
            c1262.m4506();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C1262 c1262 = this.f11293;
        if (c1262 != null) {
            c1262.m4517(i);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(ˉⁱ.ᵢʿ(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().m7347(z);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().m7346(inputFilterArr));
    }

    public void setSupportAllCaps(boolean z) {
        C2941 c2941 = this.f11291;
        if (c2941 != null) {
            c2941.f11373.setAllCaps(z);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C1262 c1262 = this.f11293;
        if (c1262 != null) {
            c1262.m4510(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C1262 c1262 = this.f11293;
        if (c1262 != null) {
            c1262.m4493(mode);
        }
    }

    @Override // p004.InterfaceC0925
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C2941 c2941 = this.f11291;
        c2941.m7304(colorStateList);
        c2941.m7301();
    }

    @Override // p004.InterfaceC0925
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C2941 c2941 = this.f11291;
        c2941.m7305(mode);
        c2941.m7301();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C2941 c2941 = this.f11291;
        if (c2941 != null) {
            c2941.m7309(context, i);
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        boolean z = AbstractC2926.f11334;
        if (z) {
            super.setTextSize(i, f);
            return;
        }
        C2941 c2941 = this.f11291;
        if (c2941 == null || z) {
            return;
        }
        C2929 c2929 = c2941.f11377;
        if (c2929.m7290()) {
            return;
        }
        c2929.m7291(i, f);
    }
}
