package p341;

import java.util.Arrays;

/* renamed from: ᵎˑ.ﹶˆ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3906 {

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public static final byte[] f15185 = {0, 0, 1};

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public int f15186;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public int f15187;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public boolean f15188;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public byte[] f15189;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void m9096(byte[] bArr, int i, int i2) {
        if (this.f15188) {
            int i3 = i2 - i;
            byte[] bArr2 = this.f15189;
            int length = bArr2.length;
            int i4 = this.f15186 + i3;
            if (length < i4) {
                this.f15189 = Arrays.copyOf(bArr2, i4 * 2);
            }
            System.arraycopy(bArr, i, this.f15189, this.f15186, i3);
            this.f15186 += i3;
        }
    }
}
