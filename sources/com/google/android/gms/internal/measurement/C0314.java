package com.google.android.gms.internal.measurement;

import java.util.List;
import p334.C3789;

/* renamed from: com.google.android.gms.internal.measurement.ʼᵎ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0314 extends AbstractC0583 {
    private static final C0314 zzc;
    private static volatile InterfaceC0318 zzd;
    private int zze;
    private int zzf;
    private boolean zzh;
    private String zzg = "";
    private InterfaceC0465 zzi = C0386.f2659;

    static {
        C0314 c0314 = new C0314();
        zzc = c0314;
        AbstractC0583.m2532(C0314.class, c0314);
    }

    /* renamed from: ᵎˏ, reason: contains not printable characters */
    public static C0314 m1823() {
        return zzc;
    }

    /* renamed from: ʿˏ, reason: contains not printable characters */
    public final List m1824() {
        return this.zzi;
    }

    /* renamed from: ˋˊ, reason: contains not printable characters */
    public final boolean m1825() {
        return this.zzh;
    }

    /* renamed from: ˎٴ, reason: contains not printable characters */
    public final int m1826() {
        int i;
        switch (this.zzf) {
            case 0:
                i = 1;
                break;
            case 1:
                i = 2;
                break;
            case 2:
                i = 3;
                break;
            case 3:
                i = 4;
                break;
            case 4:
                i = 5;
                break;
            case 5:
                i = 6;
                break;
            case C3789.STRING_SET_FIELD_NUMBER /* 6 */:
                i = 7;
                break;
            default:
                i = 0;
                break;
        }
        if (i == 0) {
            return 1;
        }
        return i;
    }

    /* renamed from: יʻ, reason: contains not printable characters */
    public final boolean m1827() {
        return (this.zze & 1) != 0;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0583
    /* renamed from: ᐧʻ */
    public final Object mo1622(int i) {
        switch (AbstractC0478.f2813[i - 1]) {
            case 1:
                return new C0314();
            case 2:
                return new C0323(zzc);
            case 3:
                return new C0371(zzc, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004\u001a", new Object[]{"zze", "zzf", C0502.f2842, "zzg", "zzh", "zzi"});
            case 4:
                return zzc;
            case 5:
                InterfaceC0318 c0553 = zzd;
                if (c0553 == null) {
                    synchronized (C0314.class) {
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
    public final int m1828() {
        return this.zzi.size();
    }

    /* renamed from: ﹳˎ, reason: contains not printable characters */
    public final String m1829() {
        return this.zzg;
    }

    /* renamed from: ﾞʽ, reason: contains not printable characters */
    public final boolean m1830() {
        return (this.zze & 2) != 0;
    }

    /* renamed from: ﾞˊ, reason: contains not printable characters */
    public final boolean m1831() {
        return (this.zze & 4) != 0;
    }
}
