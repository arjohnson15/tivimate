package com.google.android.gms.internal.play_billing;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.play_billing.ˊˆ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0611 extends AbstractC0662 {
    private static final C0611 zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private int zzg;
    private C0674 zzh;

    static {
        C0611 c0611 = new C0611();
        zzb = c0611;
        AbstractC0662.m2704(C0611.class, c0611);
    }

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public static C0611 m2610(byte[] bArr, AbstractC0632 abstractC0632) throws zzdc {
        AbstractC0662 abstractC0662 = zzb;
        int length = bArr.length;
        if (length != 0) {
            abstractC0662 = (AbstractC0662) abstractC0662.mo2555(4);
            try {
                InterfaceC0638 interfaceC0638M2557 = C0592.f2957.m2557(abstractC0662.getClass());
                C0654 c0654 = new C0654();
                abstractC0632.getClass();
                interfaceC0638M2557.mo2631(abstractC0662, bArr, 0, length, c0654);
                interfaceC0638M2557.mo2628(abstractC0662);
            } catch (zzdc e) {
                throw e;
            } catch (zzfe e2) {
                throw new zzdc(e2.getMessage());
            } catch (IOException e3) {
                if (e3.getCause() instanceof zzdc) {
                    throw ((zzdc) e3.getCause());
                }
                throw new zzdc(e3.getMessage(), e3);
            } catch (IndexOutOfBoundsException unused) {
                throw zzdc.m2546();
            }
        }
        if (abstractC0662 == null || AbstractC0662.m2706(abstractC0662, true)) {
            return (C0611) abstractC0662;
        }
        throw new zzdc(new zzfe().getMessage());
    }

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public static /* synthetic */ void m2611(C0611 c0611, C0674 c0674) {
        c0611.zzh = c0674;
        c0611.zzd |= 2;
    }

    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public static C0594 m2612() {
        return (C0594) ((AbstractC0602) zzb.mo2555(5));
    }

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public static /* synthetic */ void m2613(C0611 c0611, int i) {
        c0611.zzg = i - 1;
        c0611.zzd |= 1;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0662
    /* renamed from: ˏʾ */
    public final Object mo2555(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C0642(zzb, "\u0001\u0003\u0001\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0004<\u0000", new Object[]{"zzf", "zze", "zzd", "zzg", C0645.f3033, "zzh", C0634.class});
        }
        if (i2 == 3) {
            return new C0611();
        }
        if (i2 == 4) {
            return new C0594(zzb);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
