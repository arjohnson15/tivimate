package com.google.android.gms.internal.measurement;

import android.support.v4.media.session.AbstractC0002;
import java.util.List;
import p334.C3789;

/* renamed from: com.google.android.gms.internal.measurement.ˊˉ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0389 extends AbstractC0583 {
    private static final C0389 zzc;
    private static volatile InterfaceC0318 zzd;
    private int zze;
    private int zzf;
    private InterfaceC0465 zzg = C0386.f2659;
    private String zzh = "";
    private String zzi = "";
    private boolean zzj;
    private double zzk;

    static {
        C0389 c0389 = new C0389();
        zzc = c0389;
        AbstractC0583.m2532(C0389.class, c0389);
    }

    /* renamed from: ʿˏ, reason: contains not printable characters */
    public final List m2121() {
        return this.zzg;
    }

    /* renamed from: ˋˊ, reason: contains not printable characters */
    public final boolean m2122() {
        return this.zzj;
    }

    /* renamed from: ˎٴ, reason: contains not printable characters */
    public final int m2123() {
        int iM48 = AbstractC0002.m48(this.zzf);
        if (iM48 == 0) {
            return 1;
        }
        return iM48;
    }

    /* renamed from: יʻ, reason: contains not printable characters */
    public final boolean m2124() {
        return (this.zze & 4) != 0;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0583
    /* renamed from: ᐧʻ */
    public final Object mo1622(int i) {
        switch (AbstractC0449.f2754[i - 1]) {
            case 1:
                return new C0389();
            case 2:
                return new C0323(zzc);
            case 3:
                return new C0371(zzc, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001᠌\u0000\u0002\u001b\u0003ဈ\u0001\u0004ဈ\u0002\u0005ဇ\u0003\u0006က\u0004", new Object[]{"zze", "zzf", C0502.f2846, "zzg", C0389.class, "zzh", "zzi", "zzj", "zzk"});
            case 4:
                return zzc;
            case 5:
                InterfaceC0318 c0553 = zzd;
                if (c0553 == null) {
                    synchronized (C0389.class) {
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
    public final String m2125() {
        return this.zzh;
    }

    /* renamed from: ᵎـ, reason: contains not printable characters */
    public final double m2126() {
        return this.zzk;
    }

    /* renamed from: ﹳˎ, reason: contains not printable characters */
    public final String m2127() {
        return this.zzi;
    }

    /* renamed from: ﾞʽ, reason: contains not printable characters */
    public final boolean m2128() {
        return (this.zze & 16) != 0;
    }

    /* renamed from: ﾞˊ, reason: contains not printable characters */
    public final boolean m2129() {
        return (this.zze & 8) != 0;
    }
}
