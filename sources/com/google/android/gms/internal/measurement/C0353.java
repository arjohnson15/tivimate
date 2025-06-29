package com.google.android.gms.internal.measurement;

import java.util.List;
import p334.C3789;

/* renamed from: com.google.android.gms.internal.measurement.ˆˏ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0353 extends AbstractC0583 {
    private static final C0353 zzc;
    private static volatile InterfaceC0318 zzd;
    private InterfaceC0465 zze = C0386.f2659;

    static {
        C0353 c0353 = new C0353();
        zzc = c0353;
        AbstractC0583.m2532(C0353.class, c0353);
    }

    /* renamed from: ˎٴ, reason: contains not printable characters */
    public static C0353 m1964() {
        return zzc;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0583
    /* renamed from: ᐧʻ */
    public final Object mo1622(int i) {
        switch (AbstractC0449.f2754[i - 1]) {
            case 1:
                return new C0353();
            case 2:
                return new C0323(zzc);
            case 3:
                return new C0371(zzc, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zze", C0582.class});
            case 4:
                return zzc;
            case 5:
                InterfaceC0318 c0553 = zzd;
                if (c0553 == null) {
                    synchronized (C0353.class) {
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
    public final List m1965() {
        return this.zze;
    }

    /* renamed from: ᵎـ, reason: contains not printable characters */
    public final int m1966() {
        return this.zze.size();
    }
}
