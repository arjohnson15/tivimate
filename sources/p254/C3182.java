package p254;

import p383.AbstractC4464;

/* renamed from: יי.ﹳﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3182 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public boolean f12302;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public int f12303;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public int f12304;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final byte[] f12305 = new byte[10];

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public int f12306;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public int f12307;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public long f12308;

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final void m7850(InterfaceC3178 interfaceC3178, long j, int i, int i2, int i3, C3156 c3156) {
        AbstractC4464.m10130("TrueHD chunk samples must be contiguous in the sample queue.", this.f12307 <= i2 + i3);
        if (this.f12302) {
            int i4 = this.f12304;
            int i5 = i4 + 1;
            this.f12304 = i5;
            if (i4 == 0) {
                this.f12308 = j;
                this.f12303 = i;
                this.f12306 = 0;
            }
            this.f12306 += i2;
            this.f12307 = i3;
            if (i5 >= 16) {
                m7852(interfaceC3178, c3156);
            }
        }
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final void m7851(InterfaceC3168 interfaceC3168) {
        if (this.f12302) {
            return;
        }
        byte[] bArr = this.f12305;
        int i = 0;
        interfaceC3168.mo4853(bArr, 0, 10);
        interfaceC3168.mo4860();
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111) {
            byte b = bArr[7];
            if ((b & 254) == 186) {
                i = 40 << ((bArr[(b & 255) == 187 ? '\t' : '\b'] >> 4) & 7);
            }
        }
        if (i == 0) {
            return;
        }
        this.f12302 = true;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void m7852(InterfaceC3178 interfaceC3178, C3156 c3156) {
        if (this.f12304 > 0) {
            interfaceC3178.mo7842(this.f12308, this.f12303, this.f12306, this.f12307, c3156);
            this.f12304 = 0;
        }
    }
}
