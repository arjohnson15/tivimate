package p432;

/* renamed from: ﹶٴ.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC5026 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public int f19075;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public long f19076;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final byte[] f19077;

    public AbstractC5026() {
        this.f19077 = new byte[4];
        this.f19075 = 0;
    }

    public AbstractC5026(AbstractC5026 abstractC5026) {
        this.f19077 = new byte[4];
        m11130(abstractC5026);
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final void m11130(AbstractC5026 abstractC5026) {
        byte[] bArr = abstractC5026.f19077;
        System.arraycopy(bArr, 0, this.f19077, 0, bArr.length);
        this.f19075 = abstractC5026.f19075;
        this.f19076 = abstractC5026.f19076;
    }

    /* renamed from: ʿʼ */
    public abstract int mo11116();

    /* renamed from: ˉי */
    public abstract void mo11117(AbstractC5026 abstractC5026);

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public final void m11131(byte[] bArr, int i, int i2) {
        int i3 = 0;
        int iMax = Math.max(0, i2);
        int i4 = this.f19075;
        byte[] bArr2 = this.f19077;
        if (i4 != 0) {
            int i5 = 0;
            while (true) {
                if (i5 >= iMax) {
                    i3 = i5;
                    break;
                }
                int i6 = this.f19075;
                int i7 = i6 + 1;
                this.f19075 = i7;
                int i8 = i5 + 1;
                bArr2[i6] = bArr[i5 + i];
                if (i7 == 4) {
                    mo11119(0, bArr2);
                    this.f19075 = 0;
                    i3 = i8;
                    break;
                }
                i5 = i8;
            }
        }
        int i9 = ((iMax - i3) & (-4)) + i3;
        while (i3 < i9) {
            mo11119(i + i3, bArr);
            i3 += 4;
        }
        while (i3 < iMax) {
            int i10 = this.f19075;
            this.f19075 = i10 + 1;
            bArr2[i10] = bArr[i3 + i];
            i3++;
        }
        this.f19076 += iMax;
    }

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public final void m11132(byte b) {
        int i = this.f19075;
        int i2 = i + 1;
        this.f19075 = i2;
        byte[] bArr = this.f19077;
        bArr[i] = b;
        if (i2 == bArr.length) {
            mo11119(0, bArr);
            this.f19075 = 0;
        }
        this.f19076++;
    }

    /* renamed from: ˏᵢ */
    public abstract void mo11119(int i, byte[] bArr);

    /* renamed from: ˑʽ */
    public abstract int mo11120(int i, byte[] bArr);

    /* renamed from: ـﹶ */
    public abstract AbstractC5026 mo11121();

    /* renamed from: ٴˎ */
    public abstract void mo11122();

    /* renamed from: ᐧʻ */
    public abstract void mo11123(long j);

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final void m11133() {
        long j = this.f19076 << 3;
        byte b = Byte.MIN_VALUE;
        while (true) {
            m11132(b);
            if (this.f19075 == 0) {
                mo11123(j);
                mo11122();
                return;
            }
            b = 0;
        }
    }

    /* renamed from: ﹶˆ */
    public void mo11124() {
        this.f19076 = 0L;
        this.f19075 = 0;
        int i = 0;
        while (true) {
            byte[] bArr = this.f19077;
            if (i >= bArr.length) {
                return;
            }
            bArr[i] = 0;
            i++;
        }
    }
}
