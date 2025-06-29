package com.google.android.gms.internal.measurement;

import p334.C3789;

/* renamed from: com.google.android.gms.internal.measurement.יᴵ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0447 extends AbstractC0583 {
    private static final C0447 zzc;
    private static volatile InterfaceC0318 zzd;
    private int zze;
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";
    private int zzi;

    static {
        C0447 c0447 = new C0447();
        zzc = c0447;
        AbstractC0583.m2532(C0447.class, c0447);
    }

    /* renamed from: ˎٴ, reason: contains not printable characters */
    public static C0447 m2235() {
        return zzc;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0583
    /* renamed from: ᐧʻ */
    public final Object mo1622(int i) {
        switch (AbstractC0561.f2915[i - 1]) {
            case 1:
                return new C0447();
            case 2:
                return new C0323(zzc);
            case 3:
                return new C0371(zzc, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004င\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
            case 4:
                return zzc;
            case 5:
                InterfaceC0318 c0553 = zzd;
                if (c0553 == null) {
                    synchronized (C0447.class) {
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
    public final String m2236() {
        return this.zzg;
    }

    /* renamed from: ᵎـ, reason: contains not printable characters */
    public final int m2237() {
        return this.zzi;
    }

    /* renamed from: ﹳˎ, reason: contains not printable characters */
    public final String m2238() {
        return this.zzf;
    }
}
