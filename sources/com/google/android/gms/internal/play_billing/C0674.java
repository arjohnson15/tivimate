package com.google.android.gms.internal.play_billing;

/* renamed from: com.google.android.gms.internal.play_billing.ﹶʾ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0674 extends AbstractC0662 {
    private static final C0674 zzb;
    private int zzd;
    private int zze;
    private int zzg;
    private String zzf = "";
    private String zzh = "";

    static {
        C0674 c0674 = new C0674();
        zzb = c0674;
        AbstractC0662.m2704(C0674.class, c0674);
    }

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public static /* synthetic */ void m2740(C0674 c0674, int i) {
        c0674.zzd |= 1;
        c0674.zze = i;
    }

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public static /* synthetic */ void m2741(C0674 c0674, String str) {
        str.getClass();
        c0674.zzd |= 2;
        c0674.zzf = str;
    }

    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public static /* synthetic */ void m2742(C0674 c0674, int i) {
        c0674.zzg = i - 1;
        c0674.zzd |= 4;
    }

    /* renamed from: ˑי, reason: contains not printable characters */
    public static C0653 m2743() {
        return (C0653) ((AbstractC0602) zzb.mo2555(5));
    }

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public static /* synthetic */ void m2744(C0674 c0674, String str) {
        c0674.zzd |= 8;
        c0674.zzh = str;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0662
    /* renamed from: ˏʾ */
    public final Object mo2555(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C0642(zzb, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0004᠌\u0002\u0005ဈ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", C0645.f3035, "zzh"});
        }
        if (i2 == 3) {
            return new C0674();
        }
        if (i2 == 4) {
            return new C0653(zzb);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
