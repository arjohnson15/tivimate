package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.ʾʾ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0328 implements InterfaceC0494 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final AbstractC0563 f2450;

    public C0328(AbstractC0563 abstractC0563) {
        this.f2450 = abstractC0563;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0494
    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final int mo1841(AbstractC0583 abstractC0583) {
        C0405 c0405 = abstractC0583.zzb;
        int i = c0405.f2693;
        if (i != -1) {
            return i;
        }
        int iM1927 = 0;
        for (int i2 = 0; i2 < c0405.f2692; i2++) {
            int i3 = c0405.f2689[i2] >>> 3;
            C0315 c0315 = (C0315) c0405.f2691[i2];
            iM1927 += C0346.m1927(3, c0315) + C0346.m1920(2, i3) + (C0346.m1913(8) << 1);
        }
        c0405.f2693 = iM1927;
        return iM1927;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0494
    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final void mo1842(Object obj, C0355 c0355) {
        ᵎﹳ.ᐧʻ.ᵎˏ(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0494
    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final void mo1843(Object obj, Object obj2) {
        AbstractC0361.m2005(obj, obj2);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0494
    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final boolean mo1844(AbstractC0583 abstractC0583, Object obj) {
        return abstractC0583.zzb.equals(((AbstractC0583) obj).zzb);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0494
    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final AbstractC0583 mo1845() {
        AbstractC0563 abstractC0563 = this.f2450;
        return abstractC0563 instanceof AbstractC0583 ? (AbstractC0583) ((AbstractC0583) abstractC0563).mo1622(4) : ((AbstractC0312) ((AbstractC0583) abstractC0563).mo1622(5)).m1819();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0494
    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final void mo1846(Object obj) {
        C0553.m2475(obj);
        ᵎﹳ.ᐧʻ.ᵎˏ(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0494
    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final void mo1847(Object obj, byte[] bArr, int i, int i2, C0382 c0382) {
        AbstractC0583 abstractC0583 = (AbstractC0583) obj;
        if (abstractC0583.zzb == C0405.f2688) {
            abstractC0583.zzb = C0405.m2137();
        }
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0494
    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final boolean mo1848(Object obj) {
        ᵎﹳ.ᐧʻ.ᵎˏ(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0494
    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final int mo1849(AbstractC0583 abstractC0583) {
        return abstractC0583.zzb.hashCode();
    }
}
