package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import p222.C2900;
import p222.C2969;
import p222.InterfaceC2890;
import p300.AbstractC3505;
import p320.AbstractC3639;
import p320.C3644;
import p320.InterfaceC3645;
import p320.InterfaceC3663;
import p320.MenuC3643;
import ˈⁱ.ˉⁱ;

/* loaded from: classes.dex */
public class ActionMenuItemView extends C2900 implements InterfaceC3645, View.OnClickListener, InterfaceC2890 {

    /* renamed from: ʻʿ, reason: contains not printable characters */
    public final int f44;

    /* renamed from: ʾʼ, reason: contains not printable characters */
    public C2969 f45;

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public C3644 f46;

    /* renamed from: ˎᵔ, reason: contains not printable characters */
    public final int f47;

    /* renamed from: ˑⁱ, reason: contains not printable characters */
    public boolean f48;

    /* renamed from: ˑﾞ, reason: contains not printable characters */
    public AbstractC3639 f49;

    /* renamed from: ـˆ, reason: contains not printable characters */
    public CharSequence f50;

    /* renamed from: ᴵʼ, reason: contains not printable characters */
    public Drawable f51;

    /* renamed from: ᵔﹳ, reason: contains not printable characters */
    public int f52;

    /* renamed from: ᵢٴ, reason: contains not printable characters */
    public boolean f53;

    /* renamed from: ﾞᐧ, reason: contains not printable characters */
    public InterfaceC3663 f54;

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Resources resources = context.getResources();
        this.f48 = m105();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC3505.f13585, 0, 0);
        this.f47 = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.f44 = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f52 = -1;
        setSaveEnabled(false);
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    @Override // p320.InterfaceC3645
    public C3644 getItemData() {
        return this.f46;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC3663 interfaceC3663 = this.f54;
        if (interfaceC3663 != null) {
            interfaceC3663.mo109(this.f46);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f48 = m105();
        m108();
    }

    @Override // p222.C2900, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        boolean zIsEmpty = TextUtils.isEmpty(getText());
        if (!zIsEmpty && (i3 = this.f52) >= 0) {
            super.setPadding(i3, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        int i4 = this.f47;
        int iMin = mode == Integer.MIN_VALUE ? Math.min(size, i4) : i4;
        if (mode != 1073741824 && i4 > 0 && measuredWidth < iMin) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(iMin, 1073741824), i2);
        }
        if (!zIsEmpty || this.f51 == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.f51.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C2969 c2969;
        if (this.f46.hasSubMenu() && (c2969 = this.f45) != null && c2969.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCheckable(boolean z) {
    }

    public void setChecked(boolean z) {
    }

    public void setExpandedFormat(boolean z) {
        if (this.f53 != z) {
            this.f53 = z;
            C3644 c3644 = this.f46;
            if (c3644 != null) {
                MenuC3643 menuC3643 = c3644.f13945;
                menuC3643.f13909 = true;
                menuC3643.m8592(true);
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f51 = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i = this.f44;
            if (intrinsicWidth > i) {
                intrinsicHeight = (int) (intrinsicHeight * (i / intrinsicWidth));
                intrinsicWidth = i;
            }
            if (intrinsicHeight > i) {
                intrinsicWidth = (int) (intrinsicWidth * (i / intrinsicHeight));
            } else {
                i = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i);
        }
        setCompoundDrawables(drawable, null, null, null);
        m108();
    }

    public void setItemInvoker(InterfaceC3663 interfaceC3663) {
        this.f54 = interfaceC3663;
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
        this.f52 = i;
        super.setPadding(i, i2, i3, i4);
    }

    public void setPopupCallback(AbstractC3639 abstractC3639) {
        this.f49 = abstractC3639;
    }

    public void setTitle(CharSequence charSequence) {
        this.f50 = charSequence;
        m108();
    }

    @Override // p222.InterfaceC2890
    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final boolean mo104() {
        return !TextUtils.isEmpty(getText()) && this.f46.getIcon() == null;
    }

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final boolean m105() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        return i >= 480 || (i >= 640 && configuration.screenHeightDp >= 480) || configuration.orientation == 2;
    }

    @Override // p320.InterfaceC3645
    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final void mo106(C3644 c3644) {
        this.f46 = c3644;
        setIcon(c3644.getIcon());
        setTitle(c3644.getTitleCondensed());
        setId(c3644.f13941);
        setVisibility(c3644.isVisible() ? 0 : 8);
        setEnabled(c3644.isEnabled());
        if (c3644.hasSubMenu() && this.f45 == null) {
            this.f45 = new C2969(this);
        }
    }

    @Override // p222.InterfaceC2890
    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final boolean mo107() {
        return !TextUtils.isEmpty(getText());
    }

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final void m108() {
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.f50);
        if (this.f51 != null && ((this.f46.f13940 & 4) != 4 || (!this.f48 && !this.f53))) {
            z = false;
        }
        boolean z3 = z2 & z;
        setText(z3 ? this.f50 : null);
        CharSequence charSequence = this.f46.f13947;
        if (TextUtils.isEmpty(charSequence)) {
            setContentDescription(z3 ? null : this.f46.f13926);
        } else {
            setContentDescription(charSequence);
        }
        CharSequence charSequence2 = this.f46.f13934;
        if (TextUtils.isEmpty(charSequence2)) {
            ˉⁱ.ˈٴ(this, z3 ? null : this.f46.f13926);
        } else {
            ˉⁱ.ˈٴ(this, charSequence2);
        }
    }
}
