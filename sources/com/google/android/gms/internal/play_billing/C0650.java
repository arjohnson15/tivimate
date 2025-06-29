package com.google.android.gms.internal.play_billing;

/* renamed from: com.google.android.gms.internal.play_billing.ᴵᴵ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0650 extends AbstractC0662 {
    private static final C0650 zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";
    private int zzg;

    static {
        C0650 c0650 = new C0650();
        zzb = c0650;
        AbstractC0662.m2704(C0650.class, c0650);
    }

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public static /* synthetic */ void m2663(C0650 c0650, String str) {
        str.getClass();
        c0650.zzd |= 1;
        c0650.zze = str;
    }

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public static /* synthetic */ void m2664(C0650 c0650, String str) {
        str.getClass();
        c0650.zzd |= 2;
        c0650.zzf = str;
    }

    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public static C0649 m2665() {
        return (C0649) ((AbstractC0602) zzb.mo2555(5));
    }

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public static /* synthetic */ void m2666(C0650 c0650, int i) {
        c0650.zzd |= 4;
        c0650.zzg = i;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0662
    /* renamed from: ˏʾ */
    public final Object mo2555(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C0642(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003င\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new C0650();
        }
        if (i2 == 4) {
            return new C0649(zzb);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
