package com.google.android.gms.internal.measurement;

import p334.C3789;

/* renamed from: com.google.android.gms.internal.measurement.ᵢˎ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0525 extends AbstractC0583 {
    private static final C0525 zzc;
    private static volatile InterfaceC0318 zzd;
    private int zze;
    private String zzf = "";
    private String zzg = "";

    static {
        C0525 c0525 = new C0525();
        zzc = c0525;
        AbstractC0583.m2532(C0525.class, c0525);
    }

    /* renamed from: ˎٴ, reason: contains not printable characters */
    public final String m2389() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0583
    /* renamed from: ᐧʻ */
    public final Object mo1622(int i) {
        switch (AbstractC0561.f2915[i - 1]) {
            case 1:
                return new C0525();
            case 2:
                return new C0323(zzc);
            case 3:
                return new C0371(zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                InterfaceC0318 c0553 = zzd;
                if (c0553 == null) {
                    synchronized (C0525.class) {
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
    public final String m2390() {
        return this.zzf;
    }
}
