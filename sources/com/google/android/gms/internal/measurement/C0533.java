package com.google.android.gms.internal.measurement;

import android.support.v4.media.session.AbstractC0002;
import p334.C3789;

/* renamed from: com.google.android.gms.internal.measurement.ᵢﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0533 extends AbstractC0583 {
    private static final C0533 zzc;
    private static volatile InterfaceC0318 zzd;
    private int zze;
    private int zzf;
    private int zzg;

    static {
        C0533 c0533 = new C0533();
        zzc = c0533;
        AbstractC0583.m2532(C0533.class, c0533);
    }

    /* renamed from: ˎٴ, reason: contains not printable characters */
    public final int m2432() {
        int iM35 = AbstractC0002.m35(this.zzf);
        if (iM35 == 0) {
            return 1;
        }
        return iM35;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0583
    /* renamed from: ᐧʻ */
    public final Object mo1622(int i) {
        switch (AbstractC0561.f2915[i - 1]) {
            case 1:
                return new C0533();
            case 2:
                return new C0323(zzc);
            case 3:
                C0502 c0502 = C0502.f2840;
                return new C0371(zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zze", "zzf", c0502, "zzg", c0502});
            case 4:
                return zzc;
            case 5:
                InterfaceC0318 c0553 = zzd;
                if (c0553 == null) {
                    synchronized (C0533.class) {
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
    public final int m2433() {
        int iM35 = AbstractC0002.m35(this.zzg);
        if (iM35 == 0) {
            return 1;
        }
        return iM35;
    }
}
