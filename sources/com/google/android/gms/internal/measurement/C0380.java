package com.google.android.gms.internal.measurement;

import java.util.List;
import p334.C3789;

/* renamed from: com.google.android.gms.internal.measurement.ˉˑ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0380 extends AbstractC0583 {
    private static final C0380 zzc;
    private static volatile InterfaceC0318 zzd;
    private int zze;
    private long zzf;
    private String zzg = "";
    private int zzh;
    private InterfaceC0465 zzi;
    private InterfaceC0465 zzj;
    private InterfaceC0465 zzk;
    private String zzl;
    private boolean zzm;
    private InterfaceC0465 zzn;
    private InterfaceC0465 zzo;
    private String zzp;
    private String zzq;
    private C0493 zzr;
    private C0439 zzs;
    private C0447 zzt;
    private C0373 zzu;
    private C0398 zzv;

    static {
        C0380 c0380 = new C0380();
        zzc = c0380;
        AbstractC0583.m2532(C0380.class, c0380);
    }

    public C0380() {
        C0386 c0386 = C0386.f2659;
        this.zzi = c0386;
        this.zzj = c0386;
        this.zzk = c0386;
        this.zzl = "";
        this.zzn = c0386;
        this.zzo = c0386;
        this.zzp = "";
        this.zzq = "";
    }

    /* renamed from: יʻ, reason: contains not printable characters */
    public static C0380 m2086() {
        return zzc;
    }

    /* renamed from: ᵎˏ, reason: contains not printable characters */
    public static void m2087(C0380 c0380) {
        c0380.zzk = C0386.f2659;
    }

    /* renamed from: ﹳˎ, reason: contains not printable characters */
    public static void m2088(C0380 c0380, int i, C0442 c0442) {
        InterfaceC0465 interfaceC0465 = c0380.zzj;
        if (!((AbstractC0325) interfaceC0465).f2443) {
            c0380.zzj = AbstractC0583.m2531(interfaceC0465);
        }
        c0380.zzj.set(i, c0442);
    }

    /* renamed from: ﾞʽ, reason: contains not printable characters */
    public static C0307 m2089() {
        return (C0307) zzc.m2538();
    }

    /* renamed from: ʿˏ, reason: contains not printable characters */
    public final int m2090() {
        return this.zzj.size();
    }

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final List m2091() {
        return this.zzk;
    }

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final InterfaceC0465 m2092() {
        return this.zzi;
    }

    /* renamed from: ˈٴ, reason: contains not printable characters */
    public final String m2093() {
        return this.zzg;
    }

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public final boolean m2094() {
        return (this.zze & 2) != 0;
    }

    /* renamed from: ˋˊ, reason: contains not printable characters */
    public final long m2095() {
        return this.zzf;
    }

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final InterfaceC0465 m2096() {
        return this.zzo;
    }

    /* renamed from: ˎٴ, reason: contains not printable characters */
    public final C0442 m2097(int i) {
        return (C0442) this.zzj.get(i);
    }

    /* renamed from: ـˆ, reason: contains not printable characters */
    public final boolean m2098() {
        return (this.zze & 512) != 0;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0583
    /* renamed from: ᐧʻ */
    public final Object mo1622(int i) {
        switch (AbstractC0561.f2915[i - 1]) {
            case 1:
                return new C0380();
            case 2:
                return new C0307(zzc);
            case 3:
                return new C0371(zzc, "\u0004\u0011\u0000\u0001\u0001\u0013\u0011\u0000\u0005\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004\u001b\u0005\u001b\u0006\u001b\u0007ဈ\u0003\bဇ\u0004\t\u001b\n\u001b\u000bဈ\u0005\u000eဈ\u0006\u000fဉ\u0007\u0010ဉ\b\u0011ဉ\t\u0012ဉ\n\u0013ဉ\u000b", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", C0525.class, "zzj", C0442.class, "zzk", C0330.class, "zzl", "zzm", "zzn", C0540.class, "zzo", C0497.class, "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv"});
            case 4:
                return zzc;
            case 5:
                InterfaceC0318 c0553 = zzd;
                if (c0553 == null) {
                    synchronized (C0380.class) {
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
    public final InterfaceC0465 m2099() {
        return this.zzn;
    }

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final String m2100() {
        return this.zzp;
    }

    /* renamed from: ᴵʼ, reason: contains not printable characters */
    public final boolean m2101() {
        return (this.zze & 1) != 0;
    }

    /* renamed from: ᵎـ, reason: contains not printable characters */
    public final int m2102() {
        return this.zzn.size();
    }

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final boolean m2103() {
        return this.zzm;
    }

    /* renamed from: ﹳˑ, reason: contains not printable characters */
    public final C0447 m2104() {
        C0447 c0447 = this.zzt;
        return c0447 == null ? C0447.m2235() : c0447;
    }

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public final boolean m2105() {
        return (this.zze & 128) != 0;
    }

    /* renamed from: ﾞˊ, reason: contains not printable characters */
    public final C0493 m2106() {
        C0493 c0493 = this.zzr;
        return c0493 == null ? C0493.m2326() : c0493;
    }
}
