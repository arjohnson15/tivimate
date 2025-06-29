package com.google.android.gms.internal.measurement;

import android.support.v4.media.session.AbstractC0002;
import p334.C3789;

/* renamed from: com.google.android.gms.internal.measurement.ᵔˋ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0514 extends AbstractC0583 {
    private static final C0514 zzc;
    private static volatile InterfaceC0318 zzd;
    private int zze;
    private int zzf;
    private int zzg;

    static {
        C0514 c0514 = new C0514();
        zzc = c0514;
        AbstractC0583.m2532(C0514.class, c0514);
    }

    /* renamed from: ˎٴ, reason: contains not printable characters */
    public final int m2376() {
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
                return new C0514();
            case 2:
                return new C0323(zzc);
            case 3:
                return new C0371(zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zze", "zzf", C0502.f2840, "zzg", C0502.f2845});
            case 4:
                return zzc;
            case 5:
                InterfaceC0318 c0553 = zzd;
                if (c0553 == null) {
                    synchronized (C0514.class) {
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
    public final int m2377() {
        int i;
        int i2 = this.zzg;
        if (i2 != 0) {
            i = 2;
            if (i2 != 1) {
                i = i2 != 2 ? 0 : 3;
            }
        } else {
            i = 1;
        }
        if (i == 0) {
            return 1;
        }
        return i;
    }
}
