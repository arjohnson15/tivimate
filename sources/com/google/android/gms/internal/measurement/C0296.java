package com.google.android.gms.internal.measurement;

import p334.C3789;

/* renamed from: com.google.android.gms.internal.measurement.ʻ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0296 extends AbstractC0583 {
    private static final C0296 zzc;
    private static volatile InterfaceC0318 zzd;
    private int zze;
    private C0314 zzf;
    private C0388 zzg;
    private boolean zzh;
    private String zzi = "";

    static {
        C0296 c0296 = new C0296();
        zzc = c0296;
        AbstractC0583.m2532(C0296.class, c0296);
    }

    /* renamed from: ˎٴ, reason: contains not printable characters */
    public static C0296 m1617() {
        return zzc;
    }

    /* renamed from: ᵎـ, reason: contains not printable characters */
    public static /* synthetic */ void m1618(C0296 c0296, String str) {
        c0296.zze |= 8;
        c0296.zzi = str;
    }

    /* renamed from: ʿˏ, reason: contains not printable characters */
    public final String m1619() {
        return this.zzi;
    }

    /* renamed from: ˋˊ, reason: contains not printable characters */
    public final boolean m1620() {
        return this.zzh;
    }

    /* renamed from: יʻ, reason: contains not printable characters */
    public final boolean m1621() {
        return (this.zze & 8) != 0;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0583
    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final Object mo1622(int i) {
        switch (AbstractC0478.f2813[i - 1]) {
            case 1:
                return new C0296();
            case 2:
                return new C0415(zzc);
            case 3:
                return new C0371(zzc, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဇ\u0002\u0004ဈ\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
            case 4:
                return zzc;
            case 5:
                InterfaceC0318 c0553 = zzd;
                if (c0553 == null) {
                    synchronized (C0296.class) {
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

    /* renamed from: ᵎˏ, reason: contains not printable characters */
    public final C0388 m1623() {
        C0388 c0388 = this.zzg;
        return c0388 == null ? C0388.m2110() : c0388;
    }

    /* renamed from: ﹳˎ, reason: contains not printable characters */
    public final C0314 m1624() {
        C0314 c0314 = this.zzf;
        return c0314 == null ? C0314.m1823() : c0314;
    }

    /* renamed from: ﹳˑ, reason: contains not printable characters */
    public final boolean m1625() {
        return (this.zze & 1) != 0;
    }

    /* renamed from: ﾞʽ, reason: contains not printable characters */
    public final boolean m1626() {
        return (this.zze & 2) != 0;
    }

    /* renamed from: ﾞˊ, reason: contains not printable characters */
    public final boolean m1627() {
        return (this.zze & 4) != 0;
    }
}
