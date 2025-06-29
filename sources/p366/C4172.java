package p366;

import p013.AbstractC1036;

/* renamed from: ᵔﾞ.ﾞˊ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4172 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public int f16099;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final boolean f16100;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public int f16101;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final byte[] f16102;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public C4172 f16103;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public C4172 f16104;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public boolean f16105;

    public C4172() {
        this.f16102 = new byte[8192];
        this.f16100 = true;
        this.f16105 = false;
    }

    public C4172(byte[] bArr, int i, int i2, boolean z) {
        this.f16102 = bArr;
        this.f16099 = i;
        this.f16101 = i2;
        this.f16105 = z;
        this.f16100 = false;
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final void m9586(C4172 c4172) {
        c4172.f16104 = this;
        c4172.f16103 = this.f16103;
        this.f16103.f16104 = c4172;
        this.f16103 = c4172;
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final C4172 m9587() {
        this.f16105 = true;
        return new C4172(this.f16102, this.f16099, this.f16101, true);
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C4172 m9588() {
        C4172 c4172 = this.f16103;
        C4172 c41722 = c4172 != this ? c4172 : null;
        C4172 c41723 = this.f16104;
        c41723.f16103 = c4172;
        this.f16103.f16104 = c41723;
        this.f16103 = null;
        this.f16104 = null;
        return c41722;
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final void m9589(C4172 c4172, int i) {
        if (!c4172.f16100) {
            throw new IllegalStateException("only owner can write");
        }
        int i2 = c4172.f16101;
        int i3 = i2 + i;
        byte[] bArr = c4172.f16102;
        if (i3 > 8192) {
            if (c4172.f16105) {
                throw new IllegalArgumentException();
            }
            int i4 = c4172.f16099;
            if (i3 - i4 > 8192) {
                throw new IllegalArgumentException();
            }
            AbstractC1036.m3995(i4, i2, bArr, bArr);
            c4172.f16101 -= c4172.f16099;
            c4172.f16099 = 0;
        }
        int i5 = c4172.f16101;
        int i6 = this.f16099;
        System.arraycopy(this.f16102, i6, bArr, i5, (i6 + i) - i6);
        c4172.f16101 += i;
        this.f16099 += i;
    }
}
