package p412;

import java.util.Arrays;

/* renamed from: ﹳˑ.ᐧʻ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4705 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public int[] f17930;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public float[] f17931;

    /* renamed from: ˉי, reason: contains not printable characters */
    public int[] f17932;

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public int f17933;

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public boolean[] f17934;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public String[] f17935;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public int f17936;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public int[] f17937;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public int f17938;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public int[] f17939;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public int[] f17940;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public int f17941;

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final void m10622(int i, int i2) {
        int i3 = this.f17936;
        int[] iArr = this.f17937;
        if (i3 >= iArr.length) {
            this.f17937 = Arrays.copyOf(iArr, iArr.length * 2);
            int[] iArr2 = this.f17930;
            this.f17930 = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.f17937;
        int i4 = this.f17936;
        iArr3[i4] = i;
        int[] iArr4 = this.f17930;
        this.f17936 = i4 + 1;
        iArr4[i4] = i2;
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final void m10623(int i, String str) {
        int i2 = this.f17941;
        int[] iArr = this.f17939;
        if (i2 >= iArr.length) {
            this.f17939 = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.f17935;
            this.f17935 = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
        }
        int[] iArr2 = this.f17939;
        int i3 = this.f17941;
        iArr2[i3] = i;
        String[] strArr2 = this.f17935;
        this.f17941 = i3 + 1;
        strArr2[i3] = str;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void m10624(int i, float f) {
        int i2 = this.f17938;
        int[] iArr = this.f17940;
        if (i2 >= iArr.length) {
            this.f17940 = Arrays.copyOf(iArr, iArr.length * 2);
            float[] fArr = this.f17931;
            this.f17931 = Arrays.copyOf(fArr, fArr.length * 2);
        }
        int[] iArr2 = this.f17940;
        int i3 = this.f17938;
        iArr2[i3] = i;
        float[] fArr2 = this.f17931;
        this.f17938 = i3 + 1;
        fArr2[i3] = f;
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final void m10625(int i, boolean z) {
        int i2 = this.f17933;
        int[] iArr = this.f17932;
        if (i2 >= iArr.length) {
            this.f17932 = Arrays.copyOf(iArr, iArr.length * 2);
            boolean[] zArr = this.f17934;
            this.f17934 = Arrays.copyOf(zArr, zArr.length * 2);
        }
        int[] iArr2 = this.f17932;
        int i3 = this.f17933;
        iArr2[i3] = i;
        boolean[] zArr2 = this.f17934;
        this.f17933 = i3 + 1;
        zArr2[i3] = z;
    }
}
