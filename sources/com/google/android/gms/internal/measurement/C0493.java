package com.google.android.gms.internal.measurement;

import java.util.List;
import p334.C3789;

/* renamed from: com.google.android.gms.internal.measurement.ᴵˋ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0493 extends AbstractC0583 {
    private static final C0493 zzc;
    private static volatile InterfaceC0318 zzd;
    private int zze;
    private InterfaceC0465 zzf;
    private InterfaceC0465 zzg;
    private InterfaceC0465 zzh;
    private boolean zzi;
    private InterfaceC0465 zzj;

    static {
        C0493 c0493 = new C0493();
        zzc = c0493;
        AbstractC0583.m2532(C0493.class, c0493);
    }

    public C0493() {
        C0386 c0386 = C0386.f2659;
        this.zzf = c0386;
        this.zzg = c0386;
        this.zzh = c0386;
        this.zzj = c0386;
    }

    /* renamed from: ᵎـ, reason: contains not printable characters */
    public static C0493 m2326() {
        return zzc;
    }

    /* renamed from: ʿˏ, reason: contains not printable characters */
    public final List m2327() {
        return this.zzj;
    }

    /* renamed from: ˋˊ, reason: contains not printable characters */
    public final boolean m2328() {
        return this.zzi;
    }

    /* renamed from: ˎٴ, reason: contains not printable characters */
    public final InterfaceC0465 m2329() {
        return this.zzh;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0583
    /* renamed from: ᐧʻ */
    public final Object mo1622(int i) {
        switch (AbstractC0561.f2915[i - 1]) {
            case 1:
                return new C0493();
            case 2:
                return new C0323(zzc);
            case 3:
                return new C0371(zzc, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0004\u0000\u0001\u001b\u0002\u001b\u0003\u001b\u0004ဇ\u0000\u0005\u001b", new Object[]{"zze", "zzf", C0514.class, "zzg", C0533.class, "zzh", C0523.class, "zzi", "zzj", C0514.class});
            case 4:
                return zzc;
            case 5:
                InterfaceC0318 c0553 = zzd;
                if (c0553 == null) {
                    synchronized (C0493.class) {
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

    /* renamed from: ᵎˏ, reason: contains not printable characters */
    public final List m2330() {
        return this.zzf;
    }

    /* renamed from: ﹳˎ, reason: contains not printable characters */
    public final List m2331() {
        return this.zzg;
    }

    /* renamed from: ﾞˊ, reason: contains not printable characters */
    public final boolean m2332() {
        return (this.zze & 1) != 0;
    }
}
