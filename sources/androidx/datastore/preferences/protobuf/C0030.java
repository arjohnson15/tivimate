package androidx.datastore.preferences.protobuf;

import java.nio.charset.Charset;

/* renamed from: androidx.datastore.preferences.protobuf.ˋˉ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0030 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static final C0076 f397 = new C0076(1);

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final Object f398;

    public C0030() {
        InterfaceC0046 interfaceC0046;
        try {
            interfaceC0046 = (InterfaceC0046) Class.forName("androidx.datastore.preferences.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            interfaceC0046 = f397;
        }
        InterfaceC0046[] interfaceC0046Arr = {C0076.f502, interfaceC0046};
        C0079 c0079 = new C0079();
        c0079.f506 = interfaceC0046Arr;
        Charset charset = AbstractC0077.f505;
        this.f398 = c0079;
    }

    public C0030(C0040 c0040) {
        AbstractC0077.m565(c0040, "output");
        this.f398 = c0040;
        c0040.f436 = this;
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public void m327(int i, C0056 c0056) {
        ((C0040) this.f398).m430(i, c0056);
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public void m328(int i, int i2) {
        ((C0040) this.f398).m416(i, i2);
    }

    /* renamed from: ˉי, reason: contains not printable characters */
    public void m329(int i, long j) {
        ((C0040) this.f398).m425(i, j);
    }

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public void m330(int i, int i2) {
        ((C0040) this.f398).m416(i, i2);
    }

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public void m331(int i, long j) {
        ((C0040) this.f398).m428(i, j);
    }

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public void m332(int i, Object obj, InterfaceC0025 interfaceC0025) {
        C0040 c0040 = (C0040) this.f398;
        AbstractC0052 abstractC0052 = (AbstractC0052) obj;
        c0040.m411(i, 2);
        c0040.m412(abstractC0052.m479(interfaceC0025));
        interfaceC0025.mo300(abstractC0052, c0040.f436);
    }

    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public void m333(int i, long j) {
        ((C0040) this.f398).m425(i, (j >> 63) ^ (j << 1));
    }

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public void m334(int i, Object obj, InterfaceC0025 interfaceC0025) {
        C0040 c0040 = (C0040) this.f398;
        c0040.m411(i, 3);
        interfaceC0025.mo300((AbstractC0052) obj, c0040.f436);
        c0040.m411(i, 4);
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public void m335(int i, double d) {
        C0040 c0040 = (C0040) this.f398;
        c0040.getClass();
        c0040.m428(i, Double.doubleToRawLongBits(d));
    }

    /* renamed from: ˑי, reason: contains not printable characters */
    public void m336(int i, int i2) {
        ((C0040) this.f398).m414(i, i2);
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public void m337(int i, boolean z) {
        ((C0040) this.f398).m431(i, z);
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public void m338(int i, long j) {
        ((C0040) this.f398).m428(i, j);
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public void m339(int i, float f) {
        C0040 c0040 = (C0040) this.f398;
        c0040.getClass();
        c0040.m416(i, Float.floatToRawIntBits(f));
    }

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public void m340(int i, int i2) {
        ((C0040) this.f398).m414(i, (i2 >> 31) ^ (i2 << 1));
    }

    /* renamed from: ᵎـ, reason: contains not printable characters */
    public void m341(int i, long j) {
        ((C0040) this.f398).m425(i, j);
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public void m342(int i, int i2) {
        ((C0040) this.f398).m415(i, i2);
    }

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public void m343(int i, int i2) {
        ((C0040) this.f398).m415(i, i2);
    }
}
