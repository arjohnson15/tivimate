package com.google.android.gms.internal.measurement;

import p334.C3789;

/* renamed from: com.google.android.gms.internal.measurement.ⁱᵎ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0540 extends AbstractC0583 {
    private static final C0540 zzc;
    private static volatile InterfaceC0318 zzd;
    private int zze;
    private InterfaceC0465 zzf = C0386.f2659;
    private C0353 zzg;

    static {
        C0540 c0540 = new C0540();
        zzc = c0540;
        AbstractC0583.m2532(C0540.class, c0540);
    }

    /* renamed from: ˎٴ, reason: contains not printable characters */
    public final InterfaceC0465 m2434() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0583
    /* renamed from: ᐧʻ */
    public final Object mo1622(int i) {
        switch (AbstractC0449.f2754[i - 1]) {
            case 1:
                return new C0540();
            case 2:
                return new C0323(zzc);
            case 3:
                return new C0371(zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"zze", "zzf", C0389.class, "zzg"});
            case 4:
                return zzc;
            case 5:
                InterfaceC0318 c0553 = zzd;
                if (c0553 == null) {
                    synchronized (C0540.class) {
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
    public final C0353 m2435() {
        C0353 c0353 = this.zzg;
        return c0353 == null ? C0353.m1964() : c0353;
    }
}
