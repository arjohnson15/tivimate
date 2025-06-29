package com.google.android.gms.internal.play_billing;

/* renamed from: com.google.android.gms.internal.play_billing.יˆ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0633 extends AbstractC0662 {
    private static final C0633 zzb;
    private int zzd;
    private int zze;

    static {
        C0633 c0633 = new C0633();
        zzb = c0633;
        AbstractC0662.m2704(C0633.class, c0633);
    }

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public static C0633 m2654() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0662
    /* renamed from: ˏʾ */
    public final Object mo2555(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C0642(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zzd", "zze", C0645.f3037});
        }
        if (i2 == 3) {
            return new C0633();
        }
        if (i2 == 4) {
            return new C0667(zzb);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
