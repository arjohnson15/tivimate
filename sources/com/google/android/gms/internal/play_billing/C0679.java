package com.google.android.gms.internal.play_billing;

import java.nio.charset.Charset;
import java.util.List;

/* renamed from: com.google.android.gms.internal.play_billing.ﾞˎ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0679 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static final C0644 f3102 = new C0644(1);

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final Object f3103;

    public C0679() {
        InterfaceC0598 interfaceC0598;
        try {
            interfaceC0598 = (InterfaceC0598) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            interfaceC0598 = f3102;
        }
        C0657 c0657 = new C0657(C0644.f3031, interfaceC0598);
        Charset charset = AbstractC0595.f2962;
        this.f3103 = c0657;
    }

    public C0679(C0678 c0678) {
        Charset charset = AbstractC0595.f2962;
        this.f3103 = c0678;
        c0678.f3101 = this;
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public void m2765(int i, long j) throws zzbw {
        ((C0678) this.f3103).m2752(i, (j >> 63) ^ (j + j));
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public void m2766(int i, long j) throws zzbw {
        ((C0678) this.f3103).m2752(i, j);
    }

    /* renamed from: ˉי, reason: contains not printable characters */
    public void m2767(int i, int i2) throws zzbw {
        ((C0678) this.f3103).m2762(i, i2);
    }

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public void m2768(int i, long j) {
        ((C0678) this.f3103).m2763(i, j);
    }

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public void m2769(int i, float f) throws zzbw {
        ((C0678) this.f3103).m2754(i, Float.floatToRawIntBits(f));
    }

    /* renamed from: ˎٴ, reason: contains not printable characters */
    public void m2770(int i, int i2) throws zzbw {
        ((C0678) this.f3103).m2754(i, i2);
    }

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public void m2771(int i, int i2) {
        ((C0678) this.f3103).m2754(i, i2);
    }

    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public void m2772(int i, int i2) throws zzbw {
        ((C0678) this.f3103).m2762(i, i2);
    }

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public void m2773(int i, List list) throws zzbw {
        for (int i2 = 0; i2 < list.size(); i2++) {
            ((C0678) this.f3103).m2750(i, (C0615) list.get(i2));
        }
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public void m2774(int i, List list) throws zzbw {
        boolean z = list instanceof InterfaceC0665;
        int i2 = 0;
        C0678 c0678 = (C0678) this.f3103;
        if (!z) {
            while (i2 < list.size()) {
                c0678.m2758(i, (String) list.get(i2));
                i2++;
            }
            return;
        }
        InterfaceC0665 interfaceC0665 = (InterfaceC0665) list;
        while (i2 < list.size()) {
            Object objMo2652 = interfaceC0665.mo2652(i2);
            if (objMo2652 instanceof String) {
                c0678.m2758(i, (String) objMo2652);
            } else {
                c0678.m2750(i, (C0615) objMo2652);
            }
            i2++;
        }
    }

    /* renamed from: ˑי, reason: contains not printable characters */
    public void m2775(int i, long j) {
        ((C0678) this.f3103).m2752(i, j);
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public void m2776(int i, int i2) throws zzbw {
        ((C0678) this.f3103).m2755(i, (i2 >> 31) ^ (i2 + i2));
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public void m2777(int i, boolean z) throws zzbw {
        C0678 c0678 = (C0678) this.f3103;
        c0678.m2757(i << 3);
        c0678.m2759(z ? (byte) 1 : (byte) 0);
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public void m2778(int i, C0615 c0615) {
        ((C0678) this.f3103).m2750(i, c0615);
    }

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public void m2779(int i, Object obj, InterfaceC0638 interfaceC0638) {
        C0678 c0678 = (C0678) this.f3103;
        c0678.m2751(i, 3);
        interfaceC0638.mo2627((AbstractC0625) obj, c0678.f3101);
        c0678.m2751(i, 4);
    }

    /* renamed from: ᵎˏ, reason: contains not printable characters */
    public void m2780(int i, long j) throws zzbw {
        ((C0678) this.f3103).m2763(i, j);
    }

    /* renamed from: ᵎـ, reason: contains not printable characters */
    public void m2781(int i, Object obj, InterfaceC0638 interfaceC0638) throws zzbw {
        AbstractC0625 abstractC0625 = (AbstractC0625) obj;
        C0678 c0678 = (C0678) this.f3103;
        c0678.m2757((i << 3) | 2);
        c0678.m2757(abstractC0625.mo2639(interfaceC0638));
        interfaceC0638.mo2627(abstractC0625, c0678.f3101);
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public void m2782(int i, int i2) throws zzbw {
        ((C0678) this.f3103).m2755(i, i2);
    }

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public void m2783(int i, double d) throws zzbw {
        ((C0678) this.f3103).m2763(i, Double.doubleToRawLongBits(d));
    }
}
