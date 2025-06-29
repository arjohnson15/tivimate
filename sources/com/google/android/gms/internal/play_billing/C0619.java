package com.google.android.gms.internal.play_billing;

import android.support.v4.media.session.AbstractC0002;
import ᵎﹳ.ᐧʻ;

/* renamed from: com.google.android.gms.internal.play_billing.ˎˉ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0619 implements InterfaceC0638 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final C0622 f2989;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final C0671 f2990;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final AbstractC0625 f2991;

    public C0619(C0622 c0622, C0671 c0671, AbstractC0625 abstractC0625) {
        this.f2989 = c0622;
        this.f2990 = c0671;
        this.f2991 = abstractC0625;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC0638
    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final void mo2624(Object obj, Object obj2) {
        AbstractC0656.m2676(this.f2989, obj, obj2);
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC0638
    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final AbstractC0662 mo2625() {
        AbstractC0625 abstractC0625 = this.f2991;
        return abstractC0625 instanceof AbstractC0662 ? (AbstractC0662) ((AbstractC0662) abstractC0625).mo2555(4) : ((AbstractC0602) ((AbstractC0662) abstractC0625).mo2555(5)).m2580();
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC0638
    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final boolean mo2626(Object obj) {
        this.f2990.getClass();
        ᐧʻ.ᵎˏ(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC0638
    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final void mo2627(Object obj, C0679 c0679) {
        this.f2990.getClass();
        ᐧʻ.ᵎˏ(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC0638
    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void mo2628(Object obj) {
        this.f2989.getClass();
        C0622.m2634(obj);
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC0638
    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final int mo2629(AbstractC0662 abstractC0662) {
        this.f2989.getClass();
        C0652 c0652 = abstractC0662.zzc;
        int i = c0652.f3058;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < c0652.f3057; i3++) {
            int i4 = c0652.f3054[i3] >>> 3;
            C0615 c0615 = (C0615) c0652.f3056[i3];
            int iM2747 = C0678.m2747(8);
            int iM27472 = C0678.m2747(i4) + C0678.m2747(16);
            int iM27473 = C0678.m2747(24);
            int iMo2574 = c0615.mo2574();
            i2 = ˆʽ.ᵎˏ.ˋˊ(iM2747 + iM2747, iM27472, AbstractC0002.m49(iMo2574, iMo2574, iM27473), i2);
        }
        c0652.f3058 = i2;
        return i2;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC0638
    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final boolean mo2630(AbstractC0662 abstractC0662, Object obj) {
        this.f2989.getClass();
        return abstractC0662.zzc.equals(((AbstractC0662) obj).zzc);
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC0638
    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final void mo2631(Object obj, byte[] bArr, int i, int i2, C0654 c0654) {
        AbstractC0662 abstractC0662 = (AbstractC0662) obj;
        if (abstractC0662.zzc == C0652.f3053) {
            abstractC0662.zzc = C0652.m2667();
        }
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC0638
    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final int mo2632(AbstractC0662 abstractC0662) {
        this.f2989.getClass();
        return abstractC0662.zzc.hashCode();
    }
}
