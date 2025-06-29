package p080;

import java.util.Arrays;

/* renamed from: ʿˏ.ᐧʻ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1703 implements Comparable {

    /* renamed from: ʾʼ, reason: contains not printable characters */
    public int f6654;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public float f6656;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public boolean f6661;

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public int f6655 = -1;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public int f6658 = -1;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public int f6660 = 0;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public boolean f6663 = false;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public final float[] f6664 = new float[9];

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public final float[] f6657 = new float[9];

    /* renamed from: ـˆ, reason: contains not printable characters */
    public C1698[] f6659 = new C1698[16];

    /* renamed from: ᴵʼ, reason: contains not printable characters */
    public int f6662 = 0;

    /* renamed from: ﾞᐧ, reason: contains not printable characters */
    public int f6665 = 0;

    public C1703(int i) {
        this.f6654 = i;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f6655 - ((C1703) obj).f6655;
    }

    public final String toString() {
        return "" + this.f6655;
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final void m5412(C1698 c1698) {
        int i = this.f6662;
        int i2 = 0;
        while (i2 < i) {
            if (this.f6659[i2] == c1698) {
                while (i2 < i - 1) {
                    C1698[] c1698Arr = this.f6659;
                    int i3 = i2 + 1;
                    c1698Arr[i2] = c1698Arr[i3];
                    i2 = i3;
                }
                this.f6662--;
                return;
            }
            i2++;
        }
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final void m5413(C1700 c1700, C1698 c1698) {
        int i = this.f6662;
        for (int i2 = 0; i2 < i; i2++) {
            this.f6659[i2].mo5376(c1700, c1698, false);
        }
        this.f6662 = 0;
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final void m5414() {
        this.f6654 = 5;
        this.f6660 = 0;
        this.f6655 = -1;
        this.f6658 = -1;
        this.f6656 = 0.0f;
        this.f6663 = false;
        int i = this.f6662;
        for (int i2 = 0; i2 < i; i2++) {
            this.f6659[i2] = null;
        }
        this.f6662 = 0;
        this.f6665 = 0;
        this.f6661 = false;
        Arrays.fill(this.f6657, 0.0f);
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void m5415(C1698 c1698) {
        int i = 0;
        while (true) {
            int i2 = this.f6662;
            if (i >= i2) {
                C1698[] c1698Arr = this.f6659;
                if (i2 >= c1698Arr.length) {
                    this.f6659 = (C1698[]) Arrays.copyOf(c1698Arr, c1698Arr.length * 2);
                }
                C1698[] c1698Arr2 = this.f6659;
                int i3 = this.f6662;
                c1698Arr2[i3] = c1698;
                this.f6662 = i3 + 1;
                return;
            }
            if (this.f6659[i] == c1698) {
                return;
            } else {
                i++;
            }
        }
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final void m5416(C1700 c1700, float f) {
        this.f6656 = f;
        this.f6663 = true;
        int i = this.f6662;
        this.f6658 = -1;
        for (int i2 = 0; i2 < i; i2++) {
            this.f6659[i2].m5370(c1700, this, false);
        }
        this.f6662 = 0;
    }
}
