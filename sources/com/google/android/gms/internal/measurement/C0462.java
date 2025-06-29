package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;
import p334.C3789;

/* renamed from: com.google.android.gms.internal.measurement.ـᵢ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0462 extends AbstractC0583 {
    private static final C0462 zzc;
    private static volatile InterfaceC0318 zzd;
    private InterfaceC0309 zze;
    private InterfaceC0309 zzf;
    private InterfaceC0465 zzg;
    private InterfaceC0465 zzh;

    static {
        C0462 c0462 = new C0462();
        zzc = c0462;
        AbstractC0583.m2532(C0462.class, c0462);
    }

    public C0462() {
        C0548 c0548 = C0548.f2895;
        this.zze = c0548;
        this.zzf = c0548;
        C0386 c0386 = C0386.f2659;
        this.zzg = c0386;
        this.zzh = c0386;
    }

    /* renamed from: ʿˏ, reason: contains not printable characters */
    public static void m2242(C0462 c0462) {
        c0462.zzf = C0548.f2895;
    }

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public static C0400 m2243() {
        return (C0400) zzc.m2538();
    }

    /* renamed from: ˈٴ, reason: contains not printable characters */
    public static void m2244(C0462 c0462) {
        c0462.zze = C0548.f2895;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ˋˊ, reason: contains not printable characters */
    public static void m2245(C0462 c0462, List list) {
        InterfaceC0309 interfaceC0309 = c0462.zzf;
        if (!((AbstractC0325) interfaceC0309).f2443) {
            c0462.zzf = AbstractC0583.m2535(interfaceC0309);
        }
        AbstractC0563.m2511(list, c0462.zzf);
    }

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public static C0462 m2246() {
        return zzc;
    }

    /* renamed from: ˎٴ, reason: contains not printable characters */
    public static void m2247(C0462 c0462) {
        c0462.zzg = C0386.f2659;
    }

    /* renamed from: יʻ, reason: contains not printable characters */
    public static void m2248(C0462 c0462, List list) {
        InterfaceC0465 interfaceC0465 = c0462.zzh;
        if (!((AbstractC0325) interfaceC0465).f2443) {
            c0462.zzh = AbstractC0583.m2531(interfaceC0465);
        }
        AbstractC0563.m2511(list, c0462.zzh);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public static void m2249(C0462 c0462, List list) {
        InterfaceC0309 interfaceC0309 = c0462.zze;
        if (!((AbstractC0325) interfaceC0309).f2443) {
            c0462.zze = AbstractC0583.m2535(interfaceC0309);
        }
        AbstractC0563.m2511(list, c0462.zze);
    }

    /* renamed from: ᵎˏ, reason: contains not printable characters */
    public static void m2250(C0462 c0462, ArrayList arrayList) {
        InterfaceC0465 interfaceC0465 = c0462.zzg;
        if (!((AbstractC0325) interfaceC0465).f2443) {
            c0462.zzg = AbstractC0583.m2531(interfaceC0465);
        }
        AbstractC0563.m2511(arrayList, c0462.zzg);
    }

    /* renamed from: ﾞʽ, reason: contains not printable characters */
    public static void m2251(C0462 c0462) {
        c0462.zzh = C0386.f2659;
    }

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final List m2252() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0583
    /* renamed from: ᐧʻ */
    public final Object mo1622(int i) {
        switch (AbstractC0347.f2474[i - 1]) {
            case 1:
                return new C0462();
            case 2:
                return new C0400(zzc);
            case 3:
                return new C0371(zzc, "\u0004\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u0015\u0002\u0015\u0003\u001b\u0004\u001b", new Object[]{"zze", "zzf", "zzg", C0357.class, "zzh", C0303.class});
            case 4:
                return zzc;
            case 5:
                InterfaceC0318 c0553 = zzd;
                if (c0553 == null) {
                    synchronized (C0462.class) {
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
    public final InterfaceC0465 m2253() {
        return this.zzg;
    }

    /* renamed from: ᵎـ, reason: contains not printable characters */
    public final int m2254() {
        return this.zzg.size();
    }

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final InterfaceC0465 m2255() {
        return this.zzh;
    }

    /* renamed from: ﹳˎ, reason: contains not printable characters */
    public final int m2256() {
        return this.zzf.size();
    }

    /* renamed from: ﹳˑ, reason: contains not printable characters */
    public final int m2257() {
        return this.zze.size();
    }

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public final List m2258() {
        return this.zze;
    }

    /* renamed from: ﾞˊ, reason: contains not printable characters */
    public final int m2259() {
        return this.zzh.size();
    }
}
