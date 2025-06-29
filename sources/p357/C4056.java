package p357;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AdapterView;
import android.widget.Filterable;
import android.widget.ListAdapter;
import com.google.android.material.textfield.TextInputLayout;
import java.util.List;
import java.util.Locale;
import org.lsposed.hiddenapibypass.library.R;
import p211.AbstractC2807;
import p220.AbstractC2845;
import p222.C2909;
import p222.C2959;
import p222.C2975;
import p239.AbstractC3098;
import p361.C4105;
import ﹶⁱ.ـﹶ;

/* renamed from: ᵔˎ.ˎٴ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4056 extends C2909 {

    /* renamed from: ʾʼ, reason: contains not printable characters */
    public ColorStateList f15625;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final C2959 f15626;

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public final int f15627;

    /* renamed from: ـˆ, reason: contains not printable characters */
    public final float f15628;

    /* renamed from: ᴵʼ, reason: contains not printable characters */
    public ColorStateList f15629;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final AccessibilityManager f15630;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public final Rect f15631;

    /* renamed from: ﾞᐧ, reason: contains not printable characters */
    public int f15632;

    public C4056(Context context, AttributeSet attributeSet) {
        super(AbstractC2807.m7088(context, attributeSet, R.attr._2_res_0x7f04004d, 0), attributeSet);
        this.f15631 = new Rect();
        Context context2 = getContext();
        TypedArray typedArrayM7129 = AbstractC2845.m7129(context2, attributeSet, AbstractC3098.f11979, R.attr._2_res_0x7f04004d, R.style._2_res_0x7f1403b7, new int[0]);
        if (typedArrayM7129.hasValue(0) && typedArrayM7129.getInt(0, 0) == 0) {
            setKeyListener(null);
        }
        this.f15627 = typedArrayM7129.getResourceId(3, R.layout._2_res_0x7f0e00f4);
        this.f15628 = typedArrayM7129.getDimensionPixelOffset(1, R.dimen._2_res_0x7f0703e6);
        if (typedArrayM7129.hasValue(2)) {
            this.f15629 = ColorStateList.valueOf(typedArrayM7129.getColor(2, 0));
        }
        this.f15632 = typedArrayM7129.getColor(4, 0);
        this.f15625 = ـﹶ.ﾞˊ(context2, typedArrayM7129, 5);
        this.f15630 = (AccessibilityManager) context2.getSystemService("accessibility");
        C2959 c2959 = new C2959(context2, null, R.attr._2_res_0x7f0403a2);
        this.f15626 = c2959;
        c2959.f11407 = true;
        c2959.f11410.setFocusable(true);
        c2959.f11427 = this;
        c2959.f11410.setInputMethodMode(2);
        c2959.mo7261(getAdapter());
        c2959.f11415 = new C2975(1, this);
        if (typedArrayM7129.hasValue(6)) {
            setSimpleItems(typedArrayM7129.getResourceId(6, 0));
        }
        typedArrayM7129.recycle();
    }

    @Override // android.widget.AutoCompleteTextView
    public final void dismissDropDown() {
        if (m9343()) {
            this.f15626.dismiss();
        } else {
            super.dismissDropDown();
        }
    }

    public ColorStateList getDropDownBackgroundTintList() {
        return this.f15629;
    }

    @Override // android.widget.TextView
    public CharSequence getHint() {
        TextInputLayout textInputLayoutM9342 = m9342();
        return (textInputLayoutM9342 == null || !textInputLayoutM9342.f3413) ? super.getHint() : textInputLayoutM9342.getHint();
    }

    public float getPopupElevation() {
        return this.f15628;
    }

    public int getSimpleItemSelectedColor() {
        return this.f15632;
    }

    public ColorStateList getSimpleItemSelectedRippleColor() {
        return this.f15625;
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout textInputLayoutM9342 = m9342();
        if (textInputLayoutM9342 != null && textInputLayoutM9342.f3413 && super.getHint() == null) {
            String str = Build.MANUFACTURER;
            if ((str != null ? str.toLowerCase(Locale.ENGLISH) : "").equals("meizu")) {
                setHint("");
            }
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f15626.dismiss();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            int measuredWidth = getMeasuredWidth();
            ListAdapter adapter = getAdapter();
            TextInputLayout textInputLayoutM9342 = m9342();
            int measuredWidth2 = 0;
            if (adapter != null && textInputLayoutM9342 != null) {
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
                int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
                C2959 c2959 = this.f15626;
                int iMin = Math.min(adapter.getCount(), Math.max(0, !c2959.f11410.isShowing() ? -1 : c2959.f11414.getSelectedItemPosition()) + 15);
                View view = null;
                int iMax = 0;
                for (int iMax2 = Math.max(0, iMin - 15); iMax2 < iMin; iMax2++) {
                    int itemViewType = adapter.getItemViewType(iMax2);
                    if (itemViewType != measuredWidth2) {
                        view = null;
                        measuredWidth2 = itemViewType;
                    }
                    view = adapter.getView(iMax2, view, textInputLayoutM9342);
                    if (view.getLayoutParams() == null) {
                        view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                    }
                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                    iMax = Math.max(iMax, view.getMeasuredWidth());
                }
                Drawable background = c2959.f11410.getBackground();
                if (background != null) {
                    Rect rect = this.f15631;
                    background.getPadding(rect);
                    iMax += rect.left + rect.right;
                }
                measuredWidth2 = textInputLayoutM9342.getEndIconView().getMeasuredWidth() + iMax;
            }
            setMeasuredDimension(Math.min(Math.max(measuredWidth, measuredWidth2), View.MeasureSpec.getSize(i)), getMeasuredHeight());
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onWindowFocusChanged(boolean z) {
        if (m9343()) {
            return;
        }
        super.onWindowFocusChanged(z);
    }

    @Override // android.widget.AutoCompleteTextView
    public <T extends ListAdapter & Filterable> void setAdapter(T t) {
        super.setAdapter(t);
        this.f15626.mo7261(getAdapter());
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundDrawable(Drawable drawable) {
        super.setDropDownBackgroundDrawable(drawable);
        C2959 c2959 = this.f15626;
        if (c2959 != null) {
            c2959.m7322(drawable);
        }
    }

    public void setDropDownBackgroundTint(int i) {
        setDropDownBackgroundTintList(ColorStateList.valueOf(i));
    }

    public void setDropDownBackgroundTintList(ColorStateList colorStateList) {
        this.f15629 = colorStateList;
        Drawable dropDownBackground = getDropDownBackground();
        if (dropDownBackground instanceof C4105) {
            ((C4105) dropDownBackground).m9407(this.f15629);
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        super.setOnItemSelectedListener(onItemSelectedListener);
        this.f15626.f11425 = getOnItemSelectedListener();
    }

    @Override // android.widget.TextView
    public void setRawInputType(int i) {
        super.setRawInputType(i);
        TextInputLayout textInputLayoutM9342 = m9342();
        if (textInputLayoutM9342 != null) {
            textInputLayoutM9342.m2900();
        }
    }

    public void setSimpleItemSelectedColor(int i) {
        this.f15632 = i;
        if (getAdapter() instanceof C4067) {
            ((C4067) getAdapter()).m9362();
        }
    }

    public void setSimpleItemSelectedRippleColor(ColorStateList colorStateList) {
        this.f15625 = colorStateList;
        if (getAdapter() instanceof C4067) {
            ((C4067) getAdapter()).m9362();
        }
    }

    public void setSimpleItems(int i) {
        setSimpleItems(getResources().getStringArray(i));
    }

    public void setSimpleItems(String[] strArr) {
        setAdapter(new C4067(this, getContext(), this.f15627, strArr));
    }

    @Override // android.widget.AutoCompleteTextView
    public final void showDropDown() {
        if (m9343()) {
            this.f15626.mo7326();
        } else {
            super.showDropDown();
        }
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final TextInputLayout m9342() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final boolean m9343() {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        AccessibilityManager accessibilityManager = this.f15630;
        if (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) {
            if (accessibilityManager != null && accessibilityManager.isEnabled() && (enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(16)) != null) {
                for (AccessibilityServiceInfo accessibilityServiceInfo : enabledAccessibilityServiceList) {
                    if (accessibilityServiceInfo.getSettingsActivityName() == null || !accessibilityServiceInfo.getSettingsActivityName().contains("SwitchAccess")) {
                    }
                }
            }
            return false;
        }
        return true;
    }
}
