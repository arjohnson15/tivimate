package com.google.android.gms.internal.measurement;

import java.util.List;
import p334.C3789;

/* renamed from: com.google.android.gms.internal.measurement.ʻـ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0303 extends AbstractC0583 {
    private static final C0303 zzc;
    private static volatile InterfaceC0318 zzd;
    private int zze;
    private int zzf;
    private InterfaceC0309 zzg = C0548.f2895;

    static {
        C0303 c0303 = new C0303();
        zzc = c0303;
        AbstractC0583.m2532(C0303.class, c0303);
    }

    /* renamed from: ˋˊ, reason: contains not printable characters */
    public static C0426 m1784() {
        return (C0426) zzc.m2538();
    }

    /* renamed from: ᵎˏ, reason: contains not printable characters */
    public static /* synthetic */ void m1785(C0303 c0303, int i) {
        c0303.zze |= 1;
        c0303.zzf = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ﹳˎ, reason: contains not printable characters */
    public static void m1786(C0303 c0303, List list) {
        InterfaceC0309 interfaceC0309 = c0303.zzg;
        if (!((AbstractC0325) interfaceC0309).f2443) {
            c0303.zzg = AbstractC0583.m2535(interfaceC0309);
        }
        AbstractC0563.m2511(list, c0303.zzg);
    }

    /* renamed from: ʿˏ, reason: contains not printable characters */
    public final int m1787() {
        return this.zzf;
    }

    /* renamed from: ˎٴ, reason: contains not printable characters */
    public final long m1788(int i) {
        return ((C0548) this.zzg).m2469(i);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0583
    /* renamed from: ᐧʻ */
    public final Object mo1622(int i) {
        switch (AbstractC0347.f2474[i - 1]) {
            case 1:
                return new C0303();
            case 2:
                return new C0426(zzc);
            case 3:
                return new C0371(zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001င\u0000\u0002\u0014", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                InterfaceC0318 c0553 = zzd;
                if (c0553 == null) {
                    synchronized (C0303.class) {
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

    /* renamed from: ᵎـ, reason: contains not printable characters */
    public final int m1789() {
        return this.zzg.size();
    }

    /* renamed from: ﾞʽ, reason: contains not printable characters */
    public final boolean m1790() {
        return (this.zze & 1) != 0;
    }

    /* renamed from: ﾞˊ, reason: contains not printable characters */
    public final List m1791() {
        return this.zzg;
    }
}
