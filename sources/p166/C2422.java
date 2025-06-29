package p166;

import android.net.Uri;
import java.util.Arrays;
import p383.AbstractC4464;
import p383.AbstractC4470;
import ˆʽ.ᵎˏ;

/* renamed from: ˊﹶ.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2422 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final int f9635;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final int[] f9636;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final Uri[] f9637;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final int f9638;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final long[] f9639;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final C2402[] f9640;

    static {
        ᵎˏ.ﹳˎ(0, 1, 2, 3, 4);
        AbstractC4470.m10164(5);
        AbstractC4470.m10164(6);
        AbstractC4470.m10164(7);
        AbstractC4470.m10164(8);
    }

    public C2422(int i, int i2, int[] iArr, C2402[] c2402Arr, long[] jArr) {
        Uri uri;
        int i3 = 0;
        AbstractC4464.m10142(iArr.length == c2402Arr.length);
        this.f9638 = i;
        this.f9635 = i2;
        this.f9636 = iArr;
        this.f9640 = c2402Arr;
        this.f9639 = jArr;
        this.f9637 = new Uri[c2402Arr.length];
        while (true) {
            Uri[] uriArr = this.f9637;
            if (i3 >= uriArr.length) {
                return;
            }
            C2402 c2402 = c2402Arr[i3];
            if (c2402 == null) {
                uri = null;
            } else {
                C2443 c2443 = c2402.f9492;
                c2443.getClass();
                uri = c2443.f9734;
            }
            uriArr[i3] = uri;
            i3++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2422.class != obj.getClass()) {
            return false;
        }
        C2422 c2422 = (C2422) obj;
        return this.f9638 == c2422.f9638 && this.f9635 == c2422.f9635 && Arrays.equals(this.f9640, c2422.f9640) && Arrays.equals(this.f9636, c2422.f9636) && Arrays.equals(this.f9639, c2422.f9639);
    }

    public final int hashCode() {
        int i = (int) 0;
        return (((Arrays.hashCode(this.f9639) + ((Arrays.hashCode(this.f9636) + ((Arrays.hashCode(this.f9640) + (((((this.f9638 * 31) + this.f9635) * 31) + i) * 31)) * 31)) * 31)) * 31) + i) * 31;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final int m6525(int i) {
        int i2;
        int i3 = i + 1;
        while (true) {
            int[] iArr = this.f9636;
            if (i3 >= iArr.length || (i2 = iArr[i3]) == 0 || i2 == 1) {
                break;
            }
            i3++;
        }
        return i3;
    }
}
