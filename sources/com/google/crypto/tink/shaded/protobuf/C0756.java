package com.google.crypto.tink.shaded.protobuf;

import java.nio.charset.Charset;

/* renamed from: com.google.crypto.tink.shaded.protobuf.ـˆ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0756 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static final C0779 f3597 = new C0779(1);

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final Object f3598;

    public C0756() {
        InterfaceC0753 interfaceC0753;
        try {
            interfaceC0753 = (InterfaceC0753) Class.forName("com.google.crypto.tink.shaded.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            interfaceC0753 = f3597;
        }
        InterfaceC0753[] interfaceC0753Arr = {C0779.f3640, interfaceC0753};
        C0737 c0737 = new C0737();
        c0737.f3554 = interfaceC0753Arr;
        Charset charset = AbstractC0731.f3531;
        this.f3598 = c0737;
    }

    public C0756(C0735 c0735) {
        AbstractC0731.m2954(c0735, "output");
        this.f3598 = c0735;
        c0735.f3547 = this;
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public void m3137(int i, AbstractC0748 abstractC0748) {
        C0735 c0735 = (C0735) this.f3598;
        c0735.m3038(i, 2);
        c0735.m3041(abstractC0748);
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public void m3138(int i, int i2) {
        ((C0735) this.f3598).m3048(i, i2);
    }

    /* renamed from: ˉי, reason: contains not printable characters */
    public void m3139(int i, long j) {
        ((C0735) this.f3598).m3046(i, j);
    }

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public void m3140(int i, int i2) throws CodedOutputStream$OutOfSpaceException {
        ((C0735) this.f3598).m3048(i, i2);
    }

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public void m3141(int i, long j) throws CodedOutputStream$OutOfSpaceException {
        ((C0735) this.f3598).m3043(i, j);
    }

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public void m3142(int i, Object obj, InterfaceC0727 interfaceC0727) throws CodedOutputStream$OutOfSpaceException {
        AbstractC0758 abstractC0758 = (AbstractC0758) obj;
        C0735 c0735 = (C0735) this.f3598;
        c0735.m3038(i, 2);
        c0735.m3045(abstractC0758.mo3166(interfaceC0727));
        interfaceC0727.mo2943(abstractC0758, c0735.f3547);
    }

    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public void m3143(int i, long j) throws CodedOutputStream$OutOfSpaceException {
        ((C0735) this.f3598).m3046(i, (j >> 63) ^ (j << 1));
    }

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public void m3144(int i, Object obj, InterfaceC0727 interfaceC0727) throws CodedOutputStream$OutOfSpaceException {
        C0735 c0735 = (C0735) this.f3598;
        c0735.m3038(i, 3);
        interfaceC0727.mo2943((AbstractC0758) obj, c0735.f3547);
        c0735.m3038(i, 4);
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public void m3145(int i, double d) throws CodedOutputStream$OutOfSpaceException {
        C0735 c0735 = (C0735) this.f3598;
        c0735.getClass();
        c0735.m3043(i, Double.doubleToRawLongBits(d));
    }

    /* renamed from: ˑי, reason: contains not printable characters */
    public void m3146(int i, int i2) throws CodedOutputStream$OutOfSpaceException {
        C0735 c0735 = (C0735) this.f3598;
        c0735.m3038(i, 0);
        c0735.m3045(i2);
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public void m3147(int i, boolean z) throws CodedOutputStream$OutOfSpaceException {
        C0735 c0735 = (C0735) this.f3598;
        c0735.m3038(i, 0);
        c0735.m3047(z ? (byte) 1 : (byte) 0);
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public void m3148(int i, long j) {
        ((C0735) this.f3598).m3043(i, j);
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public void m3149(int i, float f) throws CodedOutputStream$OutOfSpaceException {
        C0735 c0735 = (C0735) this.f3598;
        c0735.getClass();
        c0735.m3048(i, Float.floatToRawIntBits(f));
    }

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public void m3150(int i, int i2) throws CodedOutputStream$OutOfSpaceException {
        C0735 c0735 = (C0735) this.f3598;
        c0735.m3038(i, 0);
        c0735.m3045((i2 >> 31) ^ (i2 << 1));
    }

    /* renamed from: ᵎـ, reason: contains not printable characters */
    public void m3151(int i, long j) throws CodedOutputStream$OutOfSpaceException {
        ((C0735) this.f3598).m3046(i, j);
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public void m3152(int i, int i2) throws CodedOutputStream$OutOfSpaceException {
        C0735 c0735 = (C0735) this.f3598;
        c0735.m3038(i, 0);
        c0735.m3040(i2);
    }

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public void m3153(int i, int i2) throws CodedOutputStream$OutOfSpaceException {
        C0735 c0735 = (C0735) this.f3598;
        c0735.m3038(i, 0);
        c0735.m3040(i2);
    }
}
