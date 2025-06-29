package com.google.android.gms.internal.play_billing;

/* renamed from: com.google.android.gms.internal.play_billing.ʼᵎ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0590 extends AbstractC0662 {
    private static final C0590 zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private int zzg;

    static {
        C0590 c0590 = new C0590();
        zzb = c0590;
        AbstractC0662.m2704(C0590.class, c0590);
    }

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public static /* synthetic */ void m2553(C0590 c0590, int i) {
        c0590.zzg = i - 1;
        c0590.zzd |= 1;
    }

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public static C0676 m2554() {
        return (C0676) ((AbstractC0602) zzb.mo2555(5));
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0662
    /* renamed from: ˏʾ, reason: contains not printable characters */
    public final Object mo2555(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C0642(zzb, "\u0001\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002<\u0000\u0003<\u0000", new Object[]{"zzf", "zze", "zzd", "zzg", C0645.f3033, C0634.class, C0606.class});
        }
        if (i2 == 3) {
            return new C0590();
        }
        if (i2 == 4) {
            return new C0676(zzb);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
