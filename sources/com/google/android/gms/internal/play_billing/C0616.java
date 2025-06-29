package com.google.android.gms.internal.play_billing;

/* renamed from: com.google.android.gms.internal.play_billing.ˋˏ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0616 extends AbstractC0662 {
    private static final C0616 zzb;
    private int zzd;
    private int zzf;
    private InterfaceC0680 zze = C0641.f3024;
    private String zzg = "";

    static {
        C0616 c0616 = new C0616();
        zzb = c0616;
        AbstractC0662.m2704(C0616.class, c0616);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0662
    /* renamed from: ˏʾ */
    public final Object mo2555(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C0642(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001a\u0002င\u0000\u0003ဈ\u0001", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new C0616();
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
