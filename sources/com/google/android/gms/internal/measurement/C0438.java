package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;
import p334.C3789;

/* renamed from: com.google.android.gms.internal.measurement.יʾ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0438 extends AbstractC0583 {
    private static final C0438 zzc;
    private static volatile InterfaceC0318 zzd;
    private int zze;
    private InterfaceC0465 zzf = C0386.f2659;
    private String zzg = "";
    private String zzh = "";
    private int zzi;

    static {
        C0438 c0438 = new C0438();
        zzc = c0438;
        AbstractC0583.m2532(C0438.class, c0438);
    }

    /* renamed from: ʿˏ, reason: contains not printable characters */
    public static /* synthetic */ void m2208(C0438 c0438, String str) {
        str.getClass();
        c0438.zze |= 1;
        c0438.zzg = str;
    }

    /* renamed from: ˋˊ, reason: contains not printable characters */
    public static void m2209(C0438 c0438, ArrayList arrayList) {
        InterfaceC0465 interfaceC0465 = c0438.zzf;
        if (!((AbstractC0325) interfaceC0465).f2443) {
            c0438.zzf = AbstractC0583.m2531(interfaceC0465);
        }
        AbstractC0563.m2511(arrayList, c0438.zzf);
    }

    /* renamed from: ˎٴ, reason: contains not printable characters */
    public static C0579 m2210(C0438 c0438) {
        AbstractC0312 abstractC0312M2538 = zzc.m2538();
        abstractC0312M2538.m1818(c0438);
        return (C0579) abstractC0312M2538;
    }

    /* renamed from: יʻ, reason: contains not printable characters */
    public static /* synthetic */ void m2211(C0438 c0438, String str) {
        str.getClass();
        c0438.zze |= 2;
        c0438.zzh = str;
    }

    /* renamed from: ﹳˎ, reason: contains not printable characters */
    public static void m2212(C0438 c0438, C0302 c0302) {
        InterfaceC0465 interfaceC0465 = c0438.zzf;
        if (!((AbstractC0325) interfaceC0465).f2443) {
            c0438.zzf = AbstractC0583.m2531(interfaceC0465);
        }
        c0438.zzf.add(c0302);
    }

    /* renamed from: ﾞʽ, reason: contains not printable characters */
    public static void m2213(C0438 c0438) {
        c0438.zzf = C0386.f2659;
    }

    /* renamed from: ﾞˊ, reason: contains not printable characters */
    public static C0579 m2214() {
        return (C0579) zzc.m2538();
    }

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final boolean m2215() {
        return (this.zze & 1) != 0;
    }

    /* renamed from: ˈٴ, reason: contains not printable characters */
    public final String m2216() {
        return this.zzh;
    }

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final boolean m2217() {
        return (this.zze & 2) != 0;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0583
    /* renamed from: ᐧʻ */
    public final Object mo1622(int i) {
        switch (AbstractC0347.f2474[i - 1]) {
            case 1:
                return new C0438();
            case 2:
                return new C0579(zzc);
            case 3:
                return new C0371(zzc, "\u0004\u0004\u0000\u0001\u0001\t\u0004\u0000\u0001\u0000\u0001\u001b\u0007ဈ\u0000\bဈ\u0001\t᠌\u0002", new Object[]{"zze", "zzf", C0302.class, "zzg", "zzh", "zzi", C0502.f2844});
            case 4:
                return zzc;
            case 5:
                InterfaceC0318 c0553 = zzd;
                if (c0553 == null) {
                    synchronized (C0438.class) {
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

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final List m2218() {
        return this.zzf;
    }

    /* renamed from: ᵎˏ, reason: contains not printable characters */
    public final C0302 m2219() {
        return (C0302) this.zzf.get(0);
    }

    /* renamed from: ᵎـ, reason: contains not printable characters */
    public final int m2220() {
        return this.zzf.size();
    }

    /* renamed from: ﹳˑ, reason: contains not printable characters */
    public final String m2221() {
        return this.zzg;
    }
}
