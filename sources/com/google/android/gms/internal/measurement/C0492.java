package com.google.android.gms.internal.measurement;

import p334.C3789;

/* renamed from: com.google.android.gms.internal.measurement.ᴵˊ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0492 extends AbstractC0583 {
    private static final C0492 zzc;
    private static volatile InterfaceC0318 zzd;
    private int zze;
    private long zzf;
    private String zzg = "";
    private String zzh = "";
    private long zzi;
    private float zzj;
    private double zzk;

    static {
        C0492 c0492 = new C0492();
        zzc = c0492;
        AbstractC0583.m2532(C0492.class, c0492);
    }

    /* renamed from: ʿˏ, reason: contains not printable characters */
    public static /* synthetic */ void m2306(C0492 c0492) {
        c0492.zze &= -33;
        c0492.zzk = 0.0d;
    }

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public static C0394 m2307() {
        return (C0394) zzc.m2538();
    }

    /* renamed from: ˈٴ, reason: contains not printable characters */
    public static /* synthetic */ void m2308(C0492 c0492) {
        c0492.zze &= -5;
        c0492.zzh = zzc.zzh;
    }

    /* renamed from: ˎٴ, reason: contains not printable characters */
    public static /* synthetic */ void m2309(C0492 c0492, double d) {
        c0492.zze |= 32;
        c0492.zzk = d;
    }

    /* renamed from: יʻ, reason: contains not printable characters */
    public static /* synthetic */ void m2310(C0492 c0492, String str) {
        str.getClass();
        c0492.zze |= 4;
        c0492.zzh = str;
    }

    /* renamed from: ᵎˏ, reason: contains not printable characters */
    public static /* synthetic */ void m2311(C0492 c0492, long j) {
        c0492.zze |= 8;
        c0492.zzi = j;
    }

    /* renamed from: ﹳˎ, reason: contains not printable characters */
    public static /* synthetic */ void m2312(C0492 c0492, String str) {
        str.getClass();
        c0492.zze |= 2;
        c0492.zzg = str;
    }

    /* renamed from: ﾞʽ, reason: contains not printable characters */
    public static /* synthetic */ void m2313(C0492 c0492, long j) {
        c0492.zze |= 1;
        c0492.zzf = j;
    }

    /* renamed from: ﾞˊ, reason: contains not printable characters */
    public static /* synthetic */ void m2314(C0492 c0492) {
        c0492.zze &= -9;
        c0492.zzi = 0L;
    }

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final boolean m2315() {
        return (this.zze & 32) != 0;
    }

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public final boolean m2316() {
        return (this.zze & 1) != 0;
    }

    /* renamed from: ˋˊ, reason: contains not printable characters */
    public final float m2317() {
        return this.zzj;
    }

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final String m2318() {
        return this.zzg;
    }

    /* renamed from: ـˆ, reason: contains not printable characters */
    public final boolean m2319() {
        return (this.zze & 4) != 0;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0583
    /* renamed from: ᐧʻ */
    public final Object mo1622(int i) {
        switch (AbstractC0347.f2474[i - 1]) {
            case 1:
                return new C0492();
            case 2:
                return new C0394(zzc);
            case 3:
                return new C0371(zzc, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ခ\u0004\u0006က\u0005", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
            case 4:
                return zzc;
            case 5:
                InterfaceC0318 c0553 = zzd;
                if (c0553 == null) {
                    synchronized (C0492.class) {
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
    public final String m2320() {
        return this.zzh;
    }

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final long m2321() {
        return this.zzf;
    }

    /* renamed from: ᵎـ, reason: contains not printable characters */
    public final double m2322() {
        return this.zzk;
    }

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final boolean m2323() {
        return (this.zze & 16) != 0;
    }

    /* renamed from: ﹳˑ, reason: contains not printable characters */
    public final long m2324() {
        return this.zzi;
    }

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public final boolean m2325() {
        return (this.zze & 8) != 0;
    }
}
