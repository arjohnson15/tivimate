package p341;

import java.util.Arrays;

/* renamed from: ᵎˑ.ˏʾ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3889 {

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public static final byte[] f15017 = {0, 0, 1};

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public int f15018;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public byte[] f15019;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public int f15020;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public boolean f15021;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public int f15022;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void m9086(byte[] bArr, int i, int i2) {
        if (this.f15021) {
            int i3 = i2 - i;
            byte[] bArr2 = this.f15019;
            int length = bArr2.length;
            int i4 = this.f15020 + i3;
            if (length < i4) {
                this.f15019 = Arrays.copyOf(bArr2, i4 * 2);
            }
            System.arraycopy(bArr, i, this.f15019, this.f15020, i3);
            this.f15020 += i3;
        }
    }
}
