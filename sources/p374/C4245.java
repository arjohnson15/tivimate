package p374;

import java.util.Arrays;
import java.util.Random;

/* renamed from: ᵢˎ.ʿˊ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4245 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final int[] f16492;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final int[] f16493;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final Random f16494;

    public C4245() {
        this(new Random());
    }

    public C4245(Random random) {
        this(new int[0], random);
    }

    public C4245(int[] iArr, Random random) {
        this.f16492 = iArr;
        this.f16494 = random;
        this.f16493 = new int[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            this.f16493[iArr[i]] = i;
        }
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C4245 m9708(int i) {
        Random random;
        int[] iArr;
        int[] iArr2 = new int[i];
        int[] iArr3 = new int[i];
        int i2 = 0;
        while (true) {
            random = this.f16494;
            iArr = this.f16492;
            if (i2 >= i) {
                break;
            }
            iArr2[i2] = random.nextInt(iArr.length + 1);
            int i3 = i2 + 1;
            int iNextInt = random.nextInt(i3);
            iArr3[i2] = iArr3[iNextInt];
            iArr3[iNextInt] = i2;
            i2 = i3;
        }
        Arrays.sort(iArr2);
        int[] iArr4 = new int[iArr.length + i];
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < iArr.length + i; i6++) {
            if (i4 >= i || i5 != iArr2[i4]) {
                int i7 = i5 + 1;
                int i8 = iArr[i5];
                iArr4[i6] = i8;
                if (i8 >= 0) {
                    iArr4[i6] = i8 + i;
                }
                i5 = i7;
            } else {
                iArr4[i6] = iArr3[i4];
                i4++;
            }
        }
        return new C4245(iArr4, new Random(random.nextLong()));
    }
}
