package p361;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import p239.AbstractC3098;
import ˈי.ʾˈ;
import ˈⁱ.ﹳﹳ;

/* renamed from: ᵔᵔ.ˋⁱ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4089 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public ʾˈ f15778 = new C4091();

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public ʾˈ f15771 = new C4091();

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public ʾˈ f15777 = new C4091();

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public ʾˈ f15781 = new C4091();

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public InterfaceC4104 f15772 = new C4097(0.0f);

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public InterfaceC4104 f15779 = new C4097(0.0f);

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public InterfaceC4104 f15780 = new C4097(0.0f);

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public InterfaceC4104 f15776 = new C4097(0.0f);

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public ٴˎ f15782 = new ٴˎ(0);

    /* renamed from: ˉי, reason: contains not printable characters */
    public ٴˎ f15773 = new ٴˎ(0);

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public ٴˎ f15775 = new ٴˎ(0);

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public ٴˎ f15774 = new ٴˎ(0);

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static C4087 m9377(Context context, AttributeSet attributeSet, int i, int i2) {
        C4097 c4097 = new C4097(0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC3098.f11967, i, i2);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        return m9379(context, resourceId, resourceId2, c4097);
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static InterfaceC4104 m9378(TypedArray typedArray, int i, InterfaceC4104 interfaceC4104) {
        TypedValue typedValuePeekValue = typedArray.peekValue(i);
        if (typedValuePeekValue == null) {
            return interfaceC4104;
        }
        int i2 = typedValuePeekValue.type;
        return i2 == 5 ? new C4097(TypedValue.complexToDimensionPixelSize(typedValuePeekValue.data, typedArray.getResources().getDisplayMetrics())) : i2 == 6 ? new C4086(typedValuePeekValue.getFraction(1.0f, 1.0f)) : interfaceC4104;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static C4087 m9379(Context context, int i, int i2, C4097 c4097) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i);
        if (i2 != 0) {
            contextThemeWrapper = new ContextThemeWrapper(contextThemeWrapper, i2);
        }
        TypedArray typedArrayObtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(AbstractC3098.f11960);
        try {
            int i3 = typedArrayObtainStyledAttributes.getInt(0, 0);
            int i4 = typedArrayObtainStyledAttributes.getInt(3, i3);
            int i5 = typedArrayObtainStyledAttributes.getInt(4, i3);
            int i6 = typedArrayObtainStyledAttributes.getInt(2, i3);
            int i7 = typedArrayObtainStyledAttributes.getInt(1, i3);
            InterfaceC4104 interfaceC4104M9378 = m9378(typedArrayObtainStyledAttributes, 5, c4097);
            InterfaceC4104 interfaceC4104M93782 = m9378(typedArrayObtainStyledAttributes, 8, interfaceC4104M9378);
            InterfaceC4104 interfaceC4104M93783 = m9378(typedArrayObtainStyledAttributes, 9, interfaceC4104M9378);
            InterfaceC4104 interfaceC4104M93784 = m9378(typedArrayObtainStyledAttributes, 7, interfaceC4104M9378);
            InterfaceC4104 interfaceC4104M93785 = m9378(typedArrayObtainStyledAttributes, 6, interfaceC4104M9378);
            C4087 c4087 = new C4087();
            ʾˈ r8 = ﹳﹳ.ᐧʻ(i4);
            c4087.f15764 = r8;
            C4087.m9374(r8);
            c4087.f15758 = interfaceC4104M93782;
            ʾˈ r82 = ﹳﹳ.ᐧʻ(i5);
            c4087.f15757 = r82;
            C4087.m9374(r82);
            c4087.f15765 = interfaceC4104M93783;
            ʾˈ r83 = ﹳﹳ.ᐧʻ(i6);
            c4087.f15763 = r83;
            C4087.m9374(r83);
            c4087.f15766 = interfaceC4104M93784;
            ʾˈ r7 = ﹳﹳ.ᐧʻ(i7);
            c4087.f15767 = r7;
            C4087.m9374(r7);
            c4087.f15762 = interfaceC4104M93785;
            return c4087;
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public final String toString() {
        return "[" + this.f15772 + ", " + this.f15779 + ", " + this.f15780 + ", " + this.f15776 + "]";
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final boolean m9380(RectF rectF) {
        boolean z = this.f15774.getClass().equals(ٴˎ.class) && this.f15773.getClass().equals(ٴˎ.class) && this.f15782.getClass().equals(ٴˎ.class) && this.f15775.getClass().equals(ٴˎ.class);
        float fMo9371 = this.f15772.mo9371(rectF);
        return z && ((this.f15779.mo9371(rectF) > fMo9371 ? 1 : (this.f15779.mo9371(rectF) == fMo9371 ? 0 : -1)) == 0 && (this.f15776.mo9371(rectF) > fMo9371 ? 1 : (this.f15776.mo9371(rectF) == fMo9371 ? 0 : -1)) == 0 && (this.f15780.mo9371(rectF) > fMo9371 ? 1 : (this.f15780.mo9371(rectF) == fMo9371 ? 0 : -1)) == 0) && m9382();
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final C4087 m9381() {
        C4087 c4087 = new C4087();
        c4087.f15764 = this.f15778;
        c4087.f15757 = this.f15771;
        c4087.f15763 = this.f15777;
        c4087.f15767 = this.f15781;
        c4087.f15758 = this.f15772;
        c4087.f15765 = this.f15779;
        c4087.f15766 = this.f15780;
        c4087.f15762 = this.f15776;
        c4087.f15768 = this.f15782;
        c4087.f15759 = this.f15773;
        c4087.f15761 = this.f15775;
        c4087.f15760 = this.f15774;
        return c4087;
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final boolean m9382() {
        return (this.f15771 instanceof C4091) && (this.f15778 instanceof C4091) && (this.f15777 instanceof C4091) && (this.f15781 instanceof C4091);
    }
}
