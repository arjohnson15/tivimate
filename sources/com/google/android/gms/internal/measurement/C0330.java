package com.google.android.gms.internal.measurement;

import java.util.List;
import p334.C3789;

/* renamed from: com.google.android.gms.internal.measurement.ʾˈ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0330 extends AbstractC0583 {
    private static final C0330 zzc;
    private static volatile InterfaceC0318 zzd;
    private int zze;
    private int zzf;
    private InterfaceC0465 zzg;
    private InterfaceC0465 zzh;
    private boolean zzi;
    private boolean zzj;

    static {
        C0330 c0330 = new C0330();
        zzc = c0330;
        AbstractC0583.m2532(C0330.class, c0330);
    }

    public C0330() {
        C0386 c0386 = C0386.f2659;
        this.zzg = c0386;
        this.zzh = c0386;
    }

    /* renamed from: ᵎˏ, reason: contains not printable characters */
    public static void m1850(C0330 c0330, int i, C0530 c0530) {
        InterfaceC0465 interfaceC0465 = c0330.zzh;
        if (!((AbstractC0325) interfaceC0465).f2443) {
            c0330.zzh = AbstractC0583.m2531(interfaceC0465);
        }
        c0330.zzh.set(i, c0530);
    }

    /* renamed from: ﹳˎ, reason: contains not printable characters */
    public static void m1851(C0330 c0330, int i, C0569 c0569) {
        InterfaceC0465 interfaceC0465 = c0330.zzg;
        if (!((AbstractC0325) interfaceC0465).f2443) {
            c0330.zzg = AbstractC0583.m2531(interfaceC0465);
        }
        c0330.zzg.set(i, c0569);
    }

    /* renamed from: ʿˏ, reason: contains not printable characters */
    public final int m1852() {
        return this.zzh.size();
    }

    /* renamed from: ˋˊ, reason: contains not printable characters */
    public final C0569 m1853(int i) {
        return (C0569) this.zzg.get(i);
    }

    /* renamed from: ˎٴ, reason: contains not printable characters */
    public final C0530 m1854(int i) {
        return (C0530) this.zzh.get(i);
    }

    /* renamed from: יʻ, reason: contains not printable characters */
    public final List m1855() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0583
    /* renamed from: ᐧʻ */
    public final Object mo1622(int i) {
        switch (AbstractC0478.f2813[i - 1]) {
            case 1:
                return new C0330();
            case 2:
                return new C0393(zzc);
            case 3:
                return new C0371(zzc, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဇ\u0001\u0005ဇ\u0002", new Object[]{"zze", "zzf", "zzg", C0569.class, "zzh", C0530.class, "zzi", "zzj"});
            case 4:
                return zzc;
            case 5:
                InterfaceC0318 c0553 = zzd;
                if (c0553 == null) {
                    synchronized (C0330.class) {
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
    public final int m1856() {
        return this.zzf;
    }

    /* renamed from: ﹳˑ, reason: contains not printable characters */
    public final boolean m1857() {
        return (this.zze & 1) != 0;
    }

    /* renamed from: ﾞʽ, reason: contains not printable characters */
    public final List m1858() {
        return this.zzh;
    }

    /* renamed from: ﾞˊ, reason: contains not printable characters */
    public final int m1859() {
        return this.zzg.size();
    }
}
