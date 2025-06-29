package p221;

/* renamed from: ˏᐧ.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2856 extends AbstractC2855 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final byte[] f11098;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public int f11099;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public int f11100;

    public C2856(int i, byte[] bArr) {
        this.f11098 = bArr;
        this.f11097 = 0L;
        this.f11099 = 0;
        this.f11100 = i;
    }

    @Override // p221.AbstractC2855
    /* renamed from: ʽᐧ */
    public final int mo7170(byte[] bArr) {
        int length = bArr.length;
        int i = this.f11100;
        if (length > i) {
            length = i;
        }
        System.arraycopy(this.f11098, this.f11099, bArr, 0, length);
        this.f11099 += length;
        this.f11100 -= length;
        return length;
    }

    @Override // p221.AbstractC2855
    /* renamed from: ـﹶ */
    public final int mo7171() {
        return this.f11100;
    }
}
