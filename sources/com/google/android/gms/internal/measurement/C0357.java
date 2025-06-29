package com.google.android.gms.internal.measurement;

import p334.C3789;

/* renamed from: com.google.android.gms.internal.measurement.ˆﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0357 extends AbstractC0583 {
    private static final C0357 zzc;
    private static volatile InterfaceC0318 zzd;
    private int zze;
    private int zzf;
    private long zzg;

    static {
        C0357 c0357 = new C0357();
        zzc = c0357;
        AbstractC0583.m2532(C0357.class, c0357);
    }

    /* renamed from: ʿˏ, reason: contains not printable characters */
    public static C0545 m1987() {
        return (C0545) zzc.m2538();
    }

    /* renamed from: ˎٴ, reason: contains not printable characters */
    public static /* synthetic */ void m1988(C0357 c0357, int i) {
        c0357.zze |= 1;
        c0357.zzf = i;
    }

    /* renamed from: ᵎˏ, reason: contains not printable characters */
    public static /* synthetic */ void m1989(C0357 c0357, long j) {
        c0357.zze |= 2;
        c0357.zzg = j;
    }

    /* renamed from: ˋˊ, reason: contains not printable characters */
    public final boolean m1990() {
        return (this.zze & 2) != 0;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0583
    /* renamed from: ᐧʻ */
    public final Object mo1622(int i) {
        switch (AbstractC0347.f2474[i - 1]) {
            case 1:
                return new C0357();
            case 2:
                return new C0545(zzc);
            case 3:
                return new C0371(zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဂ\u0001", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                InterfaceC0318 c0553 = zzd;
                if (c0553 == null) {
                    synchronized (C0357.class) {
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

    /* renamed from: ᵎـ, reason: contains not printable characters */
    public final int m1991() {
        return this.zzf;
    }

    /* renamed from: ﹳˎ, reason: contains not printable characters */
    public final long m1992() {
        return this.zzg;
    }

    /* renamed from: ﾞˊ, reason: contains not printable characters */
    public final boolean m1993() {
        return (this.zze & 1) != 0;
    }
}
