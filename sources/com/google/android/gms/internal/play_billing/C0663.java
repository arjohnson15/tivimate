package com.google.android.gms.internal.play_billing;

/* renamed from: com.google.android.gms.internal.play_billing.ᵢˆ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0663 extends AbstractC0662 {
    private static final InterfaceC0647 zzb = new C0666();
    private static final C0663 zzd;
    private int zze;
    private int zzg;
    private C0674 zzj;
    private boolean zzk;
    private boolean zzl;
    private String zzf = "";
    private InterfaceC0637 zzh = C0673.f3090;
    private InterfaceC0680 zzi = C0641.f3024;

    static {
        C0663 c0663 = new C0663();
        zzd = c0663;
        AbstractC0662.m2704(C0663.class, c0663);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0662
    /* renamed from: ˏʾ */
    public final Object mo2555(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C0642(zzd, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0002\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003ࠬ\u0004\u001b\u0005ဉ\u0002\u0006ဇ\u0003\u0007ဇ\u0004", new Object[]{"zze", "zzf", "zzg", C0645.f3034, "zzh", C0645.f3038, "zzi", C0616.class, "zzj", "zzk", "zzl"});
        }
        if (i2 == 3) {
            return new C0663();
        }
        if (i2 == 4) {
            return new C0667(zzd);
        }
        if (i2 != 5) {
            return null;
        }
        return zzd;
    }
}
