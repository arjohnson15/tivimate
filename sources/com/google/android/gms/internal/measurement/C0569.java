package com.google.android.gms.internal.measurement;

import p334.C3789;

/* renamed from: com.google.android.gms.internal.measurement.ﹶﾞ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0569 extends AbstractC0583 {
    private static final C0569 zzc;
    private static volatile InterfaceC0318 zzd;
    private int zze;
    private int zzf;
    private String zzg = "";
    private C0296 zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;

    static {
        C0569 c0569 = new C0569();
        zzc = c0569;
        AbstractC0583.m2532(C0569.class, c0569);
    }

    /* renamed from: ˎٴ, reason: contains not printable characters */
    public static /* synthetic */ void m2514(C0569 c0569, String str) {
        c0569.zze |= 2;
        c0569.zzg = str;
    }

    /* renamed from: ﹳˎ, reason: contains not printable characters */
    public static C0483 m2515() {
        return (C0483) zzc.m2538();
    }

    /* renamed from: ʿˏ, reason: contains not printable characters */
    public final String m2516() {
        return this.zzg;
    }

    /* renamed from: ˋˊ, reason: contains not printable characters */
    public final boolean m2517() {
        return this.zzi;
    }

    /* renamed from: יʻ, reason: contains not printable characters */
    public final boolean m2518() {
        return (this.zze & 1) != 0;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0583
    /* renamed from: ᐧʻ */
    public final Object mo1622(int i) {
        switch (AbstractC0478.f2813[i - 1]) {
            case 1:
                return new C0569();
            case 2:
                return new C0483(zzc);
            case 3:
                return new C0371(zzc, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
            case 4:
                return zzc;
            case 5:
                InterfaceC0318 c0553 = zzd;
                if (c0553 == null) {
                    synchronized (C0569.class) {
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
    public final C0296 m2519() {
        C0296 c0296 = this.zzh;
        return c0296 == null ? C0296.m1617() : c0296;
    }

    /* renamed from: ᵎـ, reason: contains not printable characters */
    public final int m2520() {
        return this.zzf;
    }

    /* renamed from: ﹳˑ, reason: contains not printable characters */
    public final boolean m2521() {
        return (this.zze & 32) != 0;
    }

    /* renamed from: ﾞʽ, reason: contains not printable characters */
    public final boolean m2522() {
        return this.zzk;
    }

    /* renamed from: ﾞˊ, reason: contains not printable characters */
    public final boolean m2523() {
        return this.zzj;
    }
}
