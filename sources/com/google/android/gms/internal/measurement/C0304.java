package com.google.android.gms.internal.measurement;

import p334.C3789;

/* renamed from: com.google.android.gms.internal.measurement.ʻٴ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0304 extends AbstractC0583 {
    private static final C0304 zzc;
    private static volatile InterfaceC0318 zzd;
    private int zze;
    private InterfaceC0465 zzf = C0386.f2659;
    private String zzg = "";
    private long zzh;
    private long zzi;
    private int zzj;

    static {
        C0304 c0304 = new C0304();
        zzc = c0304;
        AbstractC0583.m2532(C0304.class, c0304);
    }

    /* renamed from: ʿˏ, reason: contains not printable characters */
    public static void m1792(C0304 c0304) {
        c0304.zzf = C0386.f2659;
    }

    /* renamed from: ˈٴ, reason: contains not printable characters */
    public static /* synthetic */ void m1793(long j, C0304 c0304) {
        c0304.zze |= 2;
        c0304.zzh = j;
    }

    /* renamed from: ˋˊ, reason: contains not printable characters */
    public static /* synthetic */ void m1794(C0304 c0304, int i, C0369 c0369) {
        c0304.m1805();
        c0304.zzf.set(i, c0369);
    }

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public static C0351 m1795() {
        return (C0351) zzc.m2538();
    }

    /* renamed from: יʻ, reason: contains not printable characters */
    public static /* synthetic */ void m1796(C0304 c0304, String str) {
        str.getClass();
        c0304.zze |= 1;
        c0304.zzg = str;
    }

    /* renamed from: ᵎˏ, reason: contains not printable characters */
    public static /* synthetic */ void m1797(int i, C0304 c0304) {
        c0304.m1805();
        c0304.zzf.remove(i);
    }

    /* renamed from: ﹳˎ, reason: contains not printable characters */
    public static /* synthetic */ void m1798(long j, C0304 c0304) {
        c0304.zze |= 4;
        c0304.zzi = j;
    }

    /* renamed from: ﾞʽ, reason: contains not printable characters */
    public static /* synthetic */ void m1799(C0304 c0304, Iterable iterable) {
        c0304.m1805();
        AbstractC0563.m2511(iterable, c0304.zzf);
    }

    /* renamed from: ﾞˊ, reason: contains not printable characters */
    public static /* synthetic */ void m1800(C0304 c0304, C0369 c0369) {
        c0369.getClass();
        c0304.m1805();
        c0304.zzf.add(c0369);
    }

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final long m1801() {
        return this.zzh;
    }

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final InterfaceC0465 m1802() {
        return this.zzf;
    }

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public final boolean m1803() {
        return (this.zze & 2) != 0;
    }

    /* renamed from: ˎٴ, reason: contains not printable characters */
    public final C0369 m1804(int i) {
        return (C0369) this.zzf.get(i);
    }

    /* renamed from: ـˆ, reason: contains not printable characters */
    public final void m1805() {
        InterfaceC0465 interfaceC0465 = this.zzf;
        if (((AbstractC0325) interfaceC0465).f2443) {
            return;
        }
        this.zzf = AbstractC0583.m2531(interfaceC0465);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0583
    /* renamed from: ᐧʻ */
    public final Object mo1622(int i) {
        switch (AbstractC0347.f2474[i - 1]) {
            case 1:
                return new C0304();
            case 2:
                return new C0351(zzc);
            case 3:
                return new C0371(zzc, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဂ\u0001\u0004ဂ\u0002\u0005င\u0003", new Object[]{"zze", "zzf", C0369.class, "zzg", "zzh", "zzi", "zzj"});
            case 4:
                return zzc;
            case 5:
                InterfaceC0318 c0553 = zzd;
                if (c0553 == null) {
                    synchronized (C0304.class) {
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
    public final String m1806() {
        return this.zzg;
    }

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final long m1807() {
        return this.zzi;
    }

    /* renamed from: ᵎـ, reason: contains not printable characters */
    public final int m1808() {
        return this.zzj;
    }

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final boolean m1809() {
        return (this.zze & 8) != 0;
    }

    /* renamed from: ﹳˑ, reason: contains not printable characters */
    public final int m1810() {
        return this.zzf.size();
    }

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public final boolean m1811() {
        return (this.zze & 4) != 0;
    }
}
