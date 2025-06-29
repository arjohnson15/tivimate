package com.google.android.gms.internal.measurement;

import p334.C3789;

/* renamed from: com.google.android.gms.internal.measurement.יˊ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0442 extends AbstractC0583 {
    private static final C0442 zzc;
    private static volatile InterfaceC0318 zzd;
    private int zze;
    private String zzf = "";
    private boolean zzg;
    private boolean zzh;
    private int zzi;

    static {
        C0442 c0442 = new C0442();
        zzc = c0442;
        AbstractC0583.m2532(C0442.class, c0442);
    }

    /* renamed from: ˎٴ, reason: contains not printable characters */
    public static /* synthetic */ void m2223(C0442 c0442, String str) {
        str.getClass();
        c0442.zze |= 1;
        c0442.zzf = str;
    }

    /* renamed from: ʿˏ, reason: contains not printable characters */
    public final boolean m2224() {
        return this.zzh;
    }

    /* renamed from: ˋˊ, reason: contains not printable characters */
    public final boolean m2225() {
        return (this.zze & 2) != 0;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0583
    /* renamed from: ᐧʻ */
    public final Object mo1622(int i) {
        switch (AbstractC0561.f2915[i - 1]) {
            case 1:
                return new C0442();
            case 2:
                return new C0518(zzc);
            case 3:
                return new C0371(zzc, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004င\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
            case 4:
                return zzc;
            case 5:
                InterfaceC0318 c0553 = zzd;
                if (c0553 == null) {
                    synchronized (C0442.class) {
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
    public final String m2226() {
        return this.zzf;
    }

    /* renamed from: ᵎـ, reason: contains not printable characters */
    public final int m2227() {
        return this.zzi;
    }

    /* renamed from: ﹳˎ, reason: contains not printable characters */
    public final boolean m2228() {
        return this.zzg;
    }

    /* renamed from: ﾞʽ, reason: contains not printable characters */
    public final boolean m2229() {
        return (this.zze & 8) != 0;
    }

    /* renamed from: ﾞˊ, reason: contains not printable characters */
    public final boolean m2230() {
        return (this.zze & 4) != 0;
    }
}
