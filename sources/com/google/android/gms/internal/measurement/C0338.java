package com.google.android.gms.internal.measurement;

import p334.C3789;

/* renamed from: com.google.android.gms.internal.measurement.ʿˉ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0338 extends AbstractC0583 {
    private static final C0338 zzc;
    private static volatile InterfaceC0318 zzd;
    private int zze;
    private long zzi;
    private long zzm;
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";
    private String zzj = "";
    private String zzk = "";
    private String zzl = "";

    static {
        C0338 c0338 = new C0338();
        zzc = c0338;
        AbstractC0583.m2532(C0338.class, c0338);
    }

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public static /* synthetic */ void m1878(C0338 c0338, String str) {
        c0338.zze |= 64;
        c0338.zzl = str;
    }

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public static /* synthetic */ void m1879(C0338 c0338, String str) {
        c0338.zze |= 32;
        c0338.zzk = str;
    }

    /* renamed from: ˈٴ, reason: contains not printable characters */
    public static C0317 m1880() {
        return (C0317) zzc.m2538();
    }

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public static /* synthetic */ void m1881(C0338 c0338, String str) {
        c0338.zze |= 16;
        c0338.zzj = str;
    }

    /* renamed from: ˋˊ, reason: contains not printable characters */
    public static /* synthetic */ void m1882(C0338 c0338) {
        c0338.zze &= -3;
        c0338.zzg = zzc.zzg;
    }

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public static C0338 m1883() {
        return zzc;
    }

    /* renamed from: ˎٴ, reason: contains not printable characters */
    public static /* synthetic */ void m1884(C0338 c0338) {
        c0338.zze &= -5;
        c0338.zzh = zzc.zzh;
    }

    /* renamed from: יʻ, reason: contains not printable characters */
    public static /* synthetic */ void m1885(C0338 c0338) {
        c0338.zze &= -2;
        c0338.zzf = zzc.zzf;
    }

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public static /* synthetic */ void m1886(C0338 c0338) {
        c0338.zze &= -33;
        c0338.zzk = zzc.zzk;
    }

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public static /* synthetic */ void m1887(C0338 c0338) {
        c0338.zze &= -65;
        c0338.zzl = zzc.zzl;
    }

    /* renamed from: ᵎˏ, reason: contains not printable characters */
    public static /* synthetic */ void m1888(C0338 c0338, long j) {
        c0338.zze |= 8;
        c0338.zzi = j;
    }

    /* renamed from: ﹳˎ, reason: contains not printable characters */
    public static /* synthetic */ void m1889(C0338 c0338, String str) {
        c0338.zze |= 4;
        c0338.zzh = str;
    }

    /* renamed from: ﹳˑ, reason: contains not printable characters */
    public static /* synthetic */ void m1890(C0338 c0338, String str) {
        c0338.zze |= 1;
        c0338.zzf = str;
    }

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public static /* synthetic */ void m1891(C0338 c0338) {
        c0338.zze &= -17;
        c0338.zzj = zzc.zzj;
    }

    /* renamed from: ﾞʽ, reason: contains not printable characters */
    public static /* synthetic */ void m1892(C0338 c0338, String str) {
        c0338.zze |= 2;
        c0338.zzg = str;
    }

    /* renamed from: ﾞˊ, reason: contains not printable characters */
    public static /* synthetic */ void m1893(C0338 c0338, long j) {
        c0338.zze |= 128;
        c0338.zzm = j;
    }

    /* renamed from: ʻʿ, reason: contains not printable characters */
    public final boolean m1894() {
        return (this.zze & 128) != 0;
    }

    /* renamed from: ʾʼ, reason: contains not printable characters */
    public final String m1895() {
        return this.zzk;
    }

    /* renamed from: ʿˏ, reason: contains not printable characters */
    public final long m1896() {
        return this.zzm;
    }

    /* renamed from: ˎᵔ, reason: contains not printable characters */
    public final boolean m1897() {
        return (this.zze & 1) != 0;
    }

    /* renamed from: ˑⁱ, reason: contains not printable characters */
    public final boolean m1898() {
        return (this.zze & 4) != 0;
    }

    /* renamed from: ˑﾞ, reason: contains not printable characters */
    public final String m1899() {
        return this.zzj;
    }

    /* renamed from: ـˆ, reason: contains not printable characters */
    public final String m1900() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0583
    /* renamed from: ᐧʻ */
    public final Object mo1622(int i) {
        switch (AbstractC0347.f2474[i - 1]) {
            case 1:
                return new C0338();
            case 2:
                return new C0317(zzc);
            case 3:
                return new C0371(zzc, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\bဂ\u0007", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm"});
            case 4:
                return zzc;
            case 5:
                InterfaceC0318 c0553 = zzd;
                if (c0553 == null) {
                    synchronized (C0338.class) {
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

    /* renamed from: ᴵʼ, reason: contains not printable characters */
    public final String m1901() {
        return this.zzf;
    }

    /* renamed from: ᵎـ, reason: contains not printable characters */
    public final long m1902() {
        return this.zzi;
    }

    /* renamed from: ᵔ, reason: contains not printable characters */
    public final boolean m1903() {
        return (this.zze & 32) != 0;
    }

    /* renamed from: ᵔٴ, reason: contains not printable characters */
    public final boolean m1904() {
        return (this.zze & 64) != 0;
    }

    /* renamed from: ᵔﹳ, reason: contains not printable characters */
    public final boolean m1905() {
        return (this.zze & 8) != 0;
    }

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final String m1906() {
        return this.zzh;
    }

    /* renamed from: ᵢٴ, reason: contains not printable characters */
    public final boolean m1907() {
        return (this.zze & 2) != 0;
    }

    /* renamed from: ﾞˎ, reason: contains not printable characters */
    public final boolean m1908() {
        return (this.zze & 16) != 0;
    }

    /* renamed from: ﾞᐧ, reason: contains not printable characters */
    public final String m1909() {
        return this.zzl;
    }
}
