package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;
import p334.C3789;

/* renamed from: com.google.android.gms.internal.measurement.ˉ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0369 extends AbstractC0583 {
    private static final C0369 zzc;
    private static volatile InterfaceC0318 zzd;
    private int zze;
    private long zzh;
    private float zzi;
    private double zzj;
    private String zzf = "";
    private String zzg = "";
    private InterfaceC0465 zzk = C0386.f2659;

    static {
        C0369 c0369 = new C0369();
        zzc = c0369;
        AbstractC0583.m2532(C0369.class, c0369);
    }

    /* renamed from: ʿˏ, reason: contains not printable characters */
    public static /* synthetic */ void m2050(C0369 c0369, String str) {
        str.getClass();
        c0369.zze |= 1;
        c0369.zzf = str;
    }

    /* renamed from: ˋˊ, reason: contains not printable characters */
    public static void m2051(C0369 c0369, ArrayList arrayList) {
        InterfaceC0465 interfaceC0465 = c0369.zzk;
        if (!((AbstractC0325) interfaceC0465).f2443) {
            c0369.zzk = AbstractC0583.m2531(interfaceC0465);
        }
        AbstractC0563.m2511(arrayList, c0369.zzk);
    }

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public static /* synthetic */ void m2052(C0369 c0369) {
        c0369.zze &= -3;
        c0369.zzg = zzc.zzg;
    }

    /* renamed from: ˎٴ, reason: contains not printable characters */
    public static /* synthetic */ void m2053(C0369 c0369, double d) {
        c0369.zze |= 16;
        c0369.zzj = d;
    }

    /* renamed from: יʻ, reason: contains not printable characters */
    public static /* synthetic */ void m2054(C0369 c0369) {
        c0369.zze &= -5;
        c0369.zzh = 0L;
    }

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public static C0473 m2055() {
        return (C0473) zzc.m2538();
    }

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public static void m2056(C0369 c0369) {
        c0369.zzk = C0386.f2659;
    }

    /* renamed from: ᵎˏ, reason: contains not printable characters */
    public static /* synthetic */ void m2057(C0369 c0369, long j) {
        c0369.zze |= 4;
        c0369.zzh = j;
    }

    /* renamed from: ﹳˎ, reason: contains not printable characters */
    public static void m2058(C0369 c0369, C0369 c03692) {
        InterfaceC0465 interfaceC0465 = c0369.zzk;
        if (!((AbstractC0325) interfaceC0465).f2443) {
            c0369.zzk = AbstractC0583.m2531(interfaceC0465);
        }
        c0369.zzk.add(c03692);
    }

    /* renamed from: ﹳˑ, reason: contains not printable characters */
    public static /* synthetic */ void m2059(C0369 c0369, String str) {
        str.getClass();
        c0369.zze |= 2;
        c0369.zzg = str;
    }

    /* renamed from: ﾞˊ, reason: contains not printable characters */
    public static /* synthetic */ void m2060(C0369 c0369) {
        c0369.zze &= -17;
        c0369.zzj = 0.0d;
    }

    /* renamed from: ʾʼ, reason: contains not printable characters */
    public final boolean m2061() {
        return (this.zze & 2) != 0;
    }

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final long m2062() {
        return this.zzh;
    }

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final String m2063() {
        return this.zzf;
    }

    /* renamed from: ˈٴ, reason: contains not printable characters */
    public final int m2064() {
        return this.zzk.size();
    }

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public final boolean m2065() {
        return (this.zze & 16) != 0;
    }

    /* renamed from: ـˆ, reason: contains not printable characters */
    public final boolean m2066() {
        return (this.zze & 8) != 0;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0583
    /* renamed from: ᐧʻ */
    public final Object mo1622(int i) {
        switch (AbstractC0347.f2474[i - 1]) {
            case 1:
                return new C0369();
            case 2:
                return new C0473(zzc);
            case 3:
                return new C0371(zzc, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ခ\u0003\u0005က\u0004\u0006\u001b", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", C0369.class});
            case 4:
                return zzc;
            case 5:
                InterfaceC0318 c0553 = zzd;
                if (c0553 == null) {
                    synchronized (C0369.class) {
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
    public final boolean m2067() {
        return (this.zze & 4) != 0;
    }

    /* renamed from: ᵎـ, reason: contains not printable characters */
    public final double m2068() {
        return this.zzj;
    }

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final String m2069() {
        return this.zzg;
    }

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public final List m2070() {
        return this.zzk;
    }

    /* renamed from: ﾞʽ, reason: contains not printable characters */
    public final float m2071() {
        return this.zzi;
    }

    /* renamed from: ﾞᐧ, reason: contains not printable characters */
    public final boolean m2072() {
        return (this.zze & 1) != 0;
    }
}
