package com.google.android.gms.internal.measurement;

import p334.C3789;

/* renamed from: com.google.android.gms.internal.measurement.ˆˎ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0352 extends AbstractC0583 {
    private static final C0352 zzc;
    private static volatile InterfaceC0318 zzd;
    private int zze;
    private int zzf;
    private C0462 zzg;
    private C0462 zzh;
    private boolean zzi;

    static {
        C0352 c0352 = new C0352();
        zzc = c0352;
        AbstractC0583.m2532(C0352.class, c0352);
    }

    /* renamed from: ʿˏ, reason: contains not printable characters */
    public static C0445 m1952() {
        return (C0445) zzc.m2538();
    }

    /* renamed from: ˋˊ, reason: contains not printable characters */
    public static /* synthetic */ void m1953(C0352 c0352, C0462 c0462) {
        c0462.getClass();
        c0352.zzh = c0462;
        c0352.zze |= 4;
    }

    /* renamed from: ˎٴ, reason: contains not printable characters */
    public static /* synthetic */ void m1954(C0352 c0352, int i) {
        c0352.zze |= 1;
        c0352.zzf = i;
    }

    /* renamed from: ᵎˏ, reason: contains not printable characters */
    public static /* synthetic */ void m1955(C0352 c0352, C0462 c0462) {
        c0352.zzg = c0462;
        c0352.zze |= 2;
    }

    /* renamed from: ﹳˎ, reason: contains not printable characters */
    public static /* synthetic */ void m1956(C0352 c0352, boolean z) {
        c0352.zze |= 8;
        c0352.zzi = z;
    }

    /* renamed from: ˈٴ, reason: contains not printable characters */
    public final boolean m1957() {
        return (this.zze & 8) != 0;
    }

    /* renamed from: יʻ, reason: contains not printable characters */
    public final boolean m1958() {
        return this.zzi;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0583
    /* renamed from: ᐧʻ */
    public final Object mo1622(int i) {
        switch (AbstractC0347.f2474[i - 1]) {
            case 1:
                return new C0352();
            case 2:
                return new C0445(zzc);
            case 3:
                return new C0371(zzc, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဇ\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
            case 4:
                return zzc;
            case 5:
                InterfaceC0318 c0553 = zzd;
                if (c0553 == null) {
                    synchronized (C0352.class) {
                        try {
                            c0553 = zzd;
                            if (c0553 == null) {
                                c0553 = new C0553(7);
                                zzd = c0553;
                            }
                        } finally {
                        }
                    }
                }
                return c0553;
            case C3789.STRING_SET_FIELD_NUMBER /* 6 */:
                return (byte) 1;
            case C3789.DOUBLE_FIELD_NUMBER /* 7 */:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final boolean m1959() {
        return (this.zze & 4) != 0;
    }

    /* renamed from: ᵎـ, reason: contains not printable characters */
    public final int m1960() {
        return this.zzf;
    }

    /* renamed from: ﹳˑ, reason: contains not printable characters */
    public final boolean m1961() {
        return (this.zze & 1) != 0;
    }

    /* renamed from: ﾞʽ, reason: contains not printable characters */
    public final C0462 m1962() {
        C0462 c0462 = this.zzh;
        return c0462 == null ? C0462.m2246() : c0462;
    }

    /* renamed from: ﾞˊ, reason: contains not printable characters */
    public final C0462 m1963() {
        C0462 c0462 = this.zzg;
        return c0462 == null ? C0462.m2246() : c0462;
    }
}
