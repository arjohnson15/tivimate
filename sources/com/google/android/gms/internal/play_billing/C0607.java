package com.google.android.gms.internal.play_billing;

/* renamed from: com.google.android.gms.internal.play_billing.ˉˑ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0607 extends AbstractC0662 {
    private static final C0607 zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private C0650 zzg;
    private C0660 zzh;

    static {
        C0607 c0607 = new C0607();
        zzb = c0607;
        AbstractC0662.m2704(C0607.class, c0607);
    }

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public static /* synthetic */ void m2602(C0607 c0607, C0633 c0633) {
        c0607.zzf = c0633;
        c0607.zze = 4;
    }

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public static /* synthetic */ void m2603(C0607 c0607, C0650 c0650) {
        c0650.getClass();
        c0607.zzg = c0650;
        c0607.zzd |= 1;
    }

    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public static /* synthetic */ void m2604(C0607 c0607, C0590 c0590) {
        c0607.zzf = c0590;
        c0607.zze = 3;
    }

    /* renamed from: ˑי, reason: contains not printable characters */
    public static C0589 m2605() {
        return (C0589) ((AbstractC0602) zzb.mo2555(5));
    }

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public static /* synthetic */ void m2606(C0607 c0607, C0611 c0611) {
        c0607.zzf = c0611;
        c0607.zze = 2;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0662
    /* renamed from: ˏʾ */
    public final Object mo2555(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C0642(zzb, "\u0001\u0006\u0001\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006ဉ\u0001", new Object[]{"zzf", "zze", "zzd", "zzg", C0611.class, C0590.class, C0633.class, C0663.class, "zzh"});
        }
        if (i2 == 3) {
            return new C0607();
        }
        if (i2 == 4) {
            return new C0589(zzb);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
