package p061;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* renamed from: ʾـ.יʻ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1395 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final int[] f5691;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final int f5692;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final int[] f5693;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final ArrayList f5694;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final int f5695;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final boolean f5696;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final AbstractC1361 f5697;

    public C1395(AbstractC1361 abstractC1361, ArrayList arrayList, int[] iArr, int[] iArr2) {
        int[] iArr3;
        int[] iArr4;
        AbstractC1361 abstractC13612;
        int i;
        C1437 c1437;
        int i2;
        this.f5694 = arrayList;
        this.f5691 = iArr;
        this.f5693 = iArr2;
        Arrays.fill(iArr, 0);
        Arrays.fill(iArr2, 0);
        this.f5697 = abstractC1361;
        int iMo965 = abstractC1361.mo965();
        this.f5692 = iMo965;
        int iMo966 = abstractC1361.mo966();
        this.f5695 = iMo966;
        this.f5696 = true;
        C1437 c14372 = arrayList.isEmpty() ? null : (C1437) arrayList.get(0);
        if (c14372 == null || c14372.f5885 != 0 || c14372.f5883 != 0) {
            arrayList.add(0, new C1437(0, 0, 0));
        }
        arrayList.add(new C1437(iMo965, iMo966, 0));
        Iterator it = arrayList.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            iArr3 = this.f5693;
            iArr4 = this.f5691;
            abstractC13612 = this.f5697;
            if (!zHasNext) {
                break;
            }
            C1437 c14373 = (C1437) it.next();
            for (int i3 = 0; i3 < c14373.f5884; i3++) {
                int i4 = c14373.f5885 + i3;
                int i5 = c14373.f5883 + i3;
                int i6 = abstractC13612.mo968(i4, i5) ? 1 : 2;
                iArr4[i4] = (i5 << 4) | i6;
                iArr3[i5] = (i4 << 4) | i6;
            }
        }
        if (this.f5696) {
            Iterator it2 = arrayList.iterator();
            int i7 = 0;
            while (it2.hasNext()) {
                C1437 c14374 = (C1437) it2.next();
                while (true) {
                    i = c14374.f5885;
                    if (i7 < i) {
                        if (iArr4[i7] == 0) {
                            int size = arrayList.size();
                            int i8 = 0;
                            int i9 = 0;
                            while (true) {
                                if (i8 < size) {
                                    c1437 = (C1437) arrayList.get(i8);
                                    while (true) {
                                        i2 = c1437.f5883;
                                        if (i9 < i2) {
                                            if (iArr3[i9] == 0 && abstractC13612.mo967(i7, i9)) {
                                                int i10 = abstractC13612.mo968(i7, i9) ? 8 : 4;
                                                iArr4[i7] = (i9 << 4) | i10;
                                                iArr3[i9] = i10 | (i7 << 4);
                                            } else {
                                                i9++;
                                            }
                                        }
                                    }
                                }
                                i9 = c1437.f5884 + i2;
                                i8++;
                            }
                        }
                        i7++;
                    }
                }
                i7 = c14374.f5884 + i;
            }
        }
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static C1431 m4807(ArrayDeque arrayDeque, int i, boolean z) {
        C1431 c1431;
        Iterator it = arrayDeque.iterator();
        while (true) {
            if (!it.hasNext()) {
                c1431 = null;
                break;
            }
            c1431 = (C1431) it.next();
            if (c1431.f5861 == i && c1431.f5860 == z) {
                it.remove();
                break;
            }
        }
        while (it.hasNext()) {
            C1431 c14312 = (C1431) it.next();
            if (z) {
                c14312.f5859--;
            } else {
                c14312.f5859++;
            }
        }
        return c1431;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00f0  */
    /* renamed from: ـﹶ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m4808(androidx.leanback.widget.ﾞᐧ r19) {
        /*
            Method dump skipped, instructions count: 304
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p061.C1395.m4808(androidx.leanback.widget.ﾞᐧ):void");
    }
}
