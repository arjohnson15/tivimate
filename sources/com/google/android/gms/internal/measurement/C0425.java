package com.google.android.gms.internal.measurement;

import p334.C3789;

/* renamed from: com.google.android.gms.internal.measurement.ˑˈ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0425 extends AbstractC0583 {
    private static final C0425 zzc;
    private static volatile InterfaceC0318 zzd;
    private int zze;
    private boolean zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;
    private boolean zzl;

    static {
        C0425 c0425 = new C0425();
        zzc = c0425;
        AbstractC0583.m2532(C0425.class, c0425);
    }

    /* renamed from: ʿˏ, reason: contains not printable characters */
    public static /* synthetic */ void m2190(C0425 c0425, boolean z) {
        c0425.zze |= 1;
        c0425.zzf = z;
    }

    /* renamed from: ˋˊ, reason: contains not printable characters */
    public static /* synthetic */ void m2191(C0425 c0425, boolean z) {
        c0425.zze |= 64;
        c0425.zzl = z;
    }

    /* renamed from: ˎٴ, reason: contains not printable characters */
    public static /* synthetic */ void m2192(C0425 c0425, boolean z) {
        c0425.zze |= 32;
        c0425.zzk = z;
    }

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public static /* synthetic */ void m2193(C0425 c0425, boolean z) {
        c0425.zze |= 8;
        c0425.zzi = z;
    }

    /* renamed from: ᵎˏ, reason: contains not printable characters */
    public static /* synthetic */ void m2194(C0425 c0425, boolean z) {
        c0425.zze |= 16;
        c0425.zzj = z;
    }

    /* renamed from: ᵎـ, reason: contains not printable characters */
    public static C0300 m2195() {
        return (C0300) zzc.m2538();
    }

    /* renamed from: ﹳˎ, reason: contains not printable characters */
    public static C0425 m2196() {
        return zzc;
    }

    /* renamed from: ﹳˑ, reason: contains not printable characters */
    public static /* synthetic */ void m2197(C0425 c0425, boolean z) {
        c0425.zze |= 4;
        c0425.zzh = z;
    }

    /* renamed from: ﾞʽ, reason: contains not printable characters */
    public static /* synthetic */ void m2198(C0425 c0425, boolean z) {
        c0425.zze |= 2;
        c0425.zzg = z;
    }

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final boolean m2199() {
        return this.zzl;
    }

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final boolean m2200() {
        return this.zzi;
    }

    /* renamed from: ˈٴ, reason: contains not printable characters */
    public final boolean m2201() {
        return this.zzf;
    }

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final boolean m2202() {
        return this.zzg;
    }

    /* renamed from: יʻ, reason: contains not printable characters */
    public final boolean m2203() {
        return this.zzj;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0583
    /* renamed from: ᐧʻ */
    public final Object mo1622(int i) {
        switch (AbstractC0347.f2474[i - 1]) {
            case 1:
                return new C0425();
            case 2:
                return new C0300(zzc);
            case 3:
                return new C0371(zzc, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005\u0007ဇ\u0006", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl"});
            case 4:
                return zzc;
            case 5:
                InterfaceC0318 c0553 = zzd;
                if (c0553 == null) {
                    synchronized (C0425.class) {
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

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final boolean m2204() {
        return this.zzh;
    }

    /* renamed from: ﾞˊ, reason: contains not printable characters */
    public final boolean m2205() {
        return this.zzk;
    }
}
