package p061;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import p013.AbstractC1036;

/* renamed from: ʾـ.ᵢʿ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1423 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public int f5793;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public int f5794;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public int[] f5795;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public int f5796;

    public C1423() {
        int iHighestOneBit = Integer.bitCount(8) != 1 ? Integer.highestOneBit(7) << 1 : 8;
        this.f5796 = iHighestOneBit - 1;
        this.f5795 = new int[iHighestOneBit];
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public void m4925(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException("Layout positions must be non-negative");
        }
        if (i2 < 0) {
            throw new IllegalArgumentException("Pixel distance must be non-negative");
        }
        int i3 = this.f5796;
        int i4 = i3 * 2;
        int[] iArr = this.f5795;
        if (iArr == null) {
            int[] iArr2 = new int[4];
            this.f5795 = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i4 >= iArr.length) {
            int[] iArr3 = new int[i3 * 4];
            this.f5795 = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
        }
        int[] iArr4 = this.f5795;
        iArr4[i4] = i;
        iArr4[i4 + 1] = i2;
        this.f5796++;
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public int m4926() {
        return (this.f5794 - this.f5793) & this.f5796;
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public void m4927(RecyclerView recyclerView, boolean z) {
        this.f5796 = 0;
        int[] iArr = this.f5795;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        AbstractC1402 abstractC1402 = recyclerView.f1683;
        if (recyclerView.f1684 == null || abstractC1402 == null || !abstractC1402.f5731) {
            return;
        }
        if (z) {
            if (!recyclerView.f1664.m4516()) {
                abstractC1402.mo810(recyclerView.f1684.mo974(), this);
            }
        } else if (!recyclerView.m1304()) {
            abstractC1402.mo858(this.f5793, this.f5794, recyclerView.f1705, this);
        }
        int i = this.f5796;
        if (i > abstractC1402.f5719) {
            abstractC1402.f5719 = i;
            abstractC1402.f5722 = z;
            recyclerView.f1677.m4968();
        }
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public void m4928(int i) {
        int[] iArr = this.f5795;
        int i2 = this.f5794;
        iArr[i2] = i;
        int i3 = this.f5796 & (i2 + 1);
        this.f5794 = i3;
        int i4 = this.f5793;
        if (i3 == i4) {
            int length = iArr.length;
            int i5 = length - i4;
            int i6 = length << 1;
            if (i6 < 0) {
                throw new RuntimeException("Max array capacity exceeded");
            }
            int[] iArr2 = new int[i6];
            AbstractC1036.m4004(0, i4, length, iArr, iArr2);
            AbstractC1036.m4004(i5, 0, this.f5793, this.f5795, iArr2);
            this.f5795 = iArr2;
            this.f5793 = 0;
            this.f5794 = length;
            this.f5796 = i6 - 1;
        }
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public int m4929(int i) {
        if (i < 0 || i >= m4926()) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return this.f5795[this.f5796 & (this.f5793 + i)];
    }
}
