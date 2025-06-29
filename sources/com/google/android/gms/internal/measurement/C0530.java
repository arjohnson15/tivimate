package com.google.android.gms.internal.measurement;

import p334.C3789;

/* renamed from: com.google.android.gms.internal.measurement.ᵢᵢ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0530 extends AbstractC0583 {
    private static final C0530 zzc;
    private static volatile InterfaceC0318 zzd;
    private int zze;
    private int zzf;
    private String zzg = "";
    private InterfaceC0465 zzh = C0386.f2659;
    private boolean zzi;
    private C0388 zzj;
    private boolean zzk;
    private boolean zzl;
    private boolean zzm;

    static {
        C0530 c0530 = new C0530();
        zzc = c0530;
        AbstractC0583.m2532(C0530.class, c0530);
    }

    /* renamed from: ˋˊ, reason: contains not printable characters */
    public static C0358 m2416() {
        return (C0358) zzc.m2538();
    }

    /* renamed from: ᵎˏ, reason: contains not printable characters */
    public static void m2417(C0530 c0530, int i, C0296 c0296) {
        InterfaceC0465 interfaceC0465 = c0530.zzh;
        if (!((AbstractC0325) interfaceC0465).f2443) {
            c0530.zzh = AbstractC0583.m2531(interfaceC0465);
        }
        c0530.zzh.set(i, c0296);
    }

    /* renamed from: ﹳˎ, reason: contains not printable characters */
    public static /* synthetic */ void m2418(C0530 c0530, String str) {
        c0530.zze |= 2;
        c0530.zzg = str;
    }

    /* renamed from: ʿˏ, reason: contains not printable characters */
    public final int m2419() {
        return this.zzf;
    }

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final boolean m2420() {
        return (this.zze & 8) != 0;
    }

    /* renamed from: ˈٴ, reason: contains not printable characters */
    public final boolean m2421() {
        return this.zzl;
    }

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final boolean m2422() {
        return (this.zze & 1) != 0;
    }

    /* renamed from: ˎٴ, reason: contains not printable characters */
    public final C0296 m2423(int i) {
        return (C0296) this.zzh.get(i);
    }

    /* renamed from: יʻ, reason: contains not printable characters */
    public final InterfaceC0465 m2424() {
        return this.zzh;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0583
    /* renamed from: ᐧʻ */
    public final Object mo1622(int i) {
        switch (AbstractC0478.f2813[i - 1]) {
            case 1:
                return new C0530();
            case 2:
                return new C0358(zzc);
            case 3:
                return new C0371(zzc, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u001b\u0004ဇ\u0002\u0005ဉ\u0003\u0006ဇ\u0004\u0007ဇ\u0005\bဇ\u0006", new Object[]{"zze", "zzf", "zzg", "zzh", C0296.class, "zzi", "zzj", "zzk", "zzl", "zzm"});
            case 4:
                return zzc;
            case 5:
                InterfaceC0318 c0553 = zzd;
                if (c0553 == null) {
                    synchronized (C0530.class) {
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
    public final boolean m2425() {
        return (this.zze & 64) != 0;
    }

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final boolean m2426() {
        return this.zzm;
    }

    /* renamed from: ᵎـ, reason: contains not printable characters */
    public final int m2427() {
        return this.zzh.size();
    }

    /* renamed from: ﹳˑ, reason: contains not printable characters */
    public final boolean m2428() {
        return this.zzk;
    }

    /* renamed from: ﾞʽ, reason: contains not printable characters */
    public final String m2429() {
        return this.zzg;
    }

    /* renamed from: ﾞˊ, reason: contains not printable characters */
    public final C0388 m2430() {
        C0388 c0388 = this.zzj;
        return c0388 == null ? C0388.m2110() : c0388;
    }
}
