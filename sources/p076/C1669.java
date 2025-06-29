package p076;

import java.util.ArrayList;
import java.util.Collections;
import p036.C1259;
import ـˈ.ˉᵎ;

/* renamed from: ʿˉ.ﹳˎ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1669 {

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public static final C1259 f6509 = new C1259(9);

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public static final C1259 f6510 = new C1259(10);

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public int f6512;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final int f6514;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public int f6515;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public int f6516;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final C1667[] f6513 = new C1667[5];

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final ArrayList f6511 = new ArrayList();

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public int f6517 = -1;

    public C1669(int i) {
        this.f6514 = i;
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final float m5359() {
        int i = this.f6517;
        ArrayList arrayList = this.f6511;
        if (i != 0) {
            Collections.sort(arrayList, f6510);
            this.f6517 = 0;
        }
        float f = 0.5f * this.f6515;
        int i2 = 0;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            C1667 c1667 = (C1667) arrayList.get(i3);
            i2 += c1667.f6506;
            if (i2 >= f) {
                return c1667.f6507;
            }
        }
        if (arrayList.isEmpty()) {
            return Float.NaN;
        }
        return ((C1667) ˉᵎ.ﹶˆ(1, arrayList)).f6507;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void m5360(int i, float f) {
        C1667 c1667;
        int i2 = this.f6517;
        ArrayList arrayList = this.f6511;
        if (i2 != 1) {
            Collections.sort(arrayList, f6509);
            this.f6517 = 1;
        }
        int i3 = this.f6516;
        C1667[] c1667Arr = this.f6513;
        if (i3 > 0) {
            int i4 = i3 - 1;
            this.f6516 = i4;
            c1667 = c1667Arr[i4];
        } else {
            c1667 = new C1667();
        }
        int i5 = this.f6512;
        this.f6512 = i5 + 1;
        c1667.f6508 = i5;
        c1667.f6506 = i;
        c1667.f6507 = f;
        arrayList.add(c1667);
        this.f6515 += i;
        while (true) {
            int i6 = this.f6515;
            int i7 = this.f6514;
            if (i6 <= i7) {
                return;
            }
            int i8 = i6 - i7;
            C1667 c16672 = (C1667) arrayList.get(0);
            int i9 = c16672.f6506;
            if (i9 <= i8) {
                this.f6515 -= i9;
                arrayList.remove(0);
                int i10 = this.f6516;
                if (i10 < 5) {
                    this.f6516 = i10 + 1;
                    c1667Arr[i10] = c16672;
                }
            } else {
                c16672.f6506 = i9 - i8;
                this.f6515 -= i8;
            }
        }
    }
}
