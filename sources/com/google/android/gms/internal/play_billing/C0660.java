package com.google.android.gms.internal.play_billing;

/* renamed from: com.google.android.gms.internal.play_billing.ᵔᵢ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0660 extends AbstractC0662 {
    private static final C0660 zzb;
    private int zzd;
    private boolean zze;
    private boolean zzf;

    static {
        C0660 c0660 = new C0660();
        zzb = c0660;
        AbstractC0662.m2704(C0660.class, c0660);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0662
    /* renamed from: ˏʾ */
    public final Object mo2555(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C0642(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new C0660();
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
