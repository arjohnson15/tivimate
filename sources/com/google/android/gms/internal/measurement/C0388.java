package com.google.android.gms.internal.measurement;

import android.support.v4.media.session.AbstractC0002;
import p334.C3789;

/* renamed from: com.google.android.gms.internal.measurement.ˊˆ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0388 extends AbstractC0583 {
    private static final C0388 zzc;
    private static volatile InterfaceC0318 zzd;
    private int zze;
    private int zzf;
    private boolean zzg;
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";

    static {
        C0388 c0388 = new C0388();
        zzc = c0388;
        AbstractC0583.m2532(C0388.class, c0388);
    }

    /* renamed from: ˎٴ, reason: contains not printable characters */
    public static C0388 m2110() {
        return zzc;
    }

    /* renamed from: ʿˏ, reason: contains not printable characters */
    public final String m2111() {
        return this.zzi;
    }

    /* renamed from: ˈٴ, reason: contains not printable characters */
    public final boolean m2112() {
        return (this.zze & 8) != 0;
    }

    /* renamed from: ˋˊ, reason: contains not printable characters */
    public final boolean m2113() {
        return this.zzg;
    }

    /* renamed from: יʻ, reason: contains not printable characters */
    public final boolean m2114() {
        return (this.zze & 2) != 0;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0583
    /* renamed from: ᐧʻ */
    public final Object mo1622(int i) {
        switch (AbstractC0478.f2813[i - 1]) {
            case 1:
                return new C0388();
            case 2:
                return new C0323(zzc);
            case 3:
                return new C0371(zzc, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{"zze", "zzf", C0502.f2839, "zzg", "zzh", "zzi", "zzj"});
            case 4:
                return zzc;
            case 5:
                InterfaceC0318 c0553 = zzd;
                if (c0553 == null) {
                    synchronized (C0388.class) {
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
    public final String m2115() {
        return this.zzh;
    }

    /* renamed from: ᵎـ, reason: contains not printable characters */
    public final int m2116() {
        int iM54 = AbstractC0002.m54(this.zzf);
        if (iM54 == 0) {
            return 1;
        }
        return iM54;
    }

    /* renamed from: ﹳˎ, reason: contains not printable characters */
    public final String m2117() {
        return this.zzj;
    }

    /* renamed from: ﹳˑ, reason: contains not printable characters */
    public final boolean m2118() {
        return (this.zze & 16) != 0;
    }

    /* renamed from: ﾞʽ, reason: contains not printable characters */
    public final boolean m2119() {
        return (this.zze & 4) != 0;
    }

    /* renamed from: ﾞˊ, reason: contains not printable characters */
    public final boolean m2120() {
        return (this.zze & 1) != 0;
    }
}
