package p061;

import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.ExecutorService;
import ʽᵔ.ʽⁱ;

/* renamed from: ʾـ.ʽᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC1361 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static ExecutorService f5517;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final Object f5519 = new Object();

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static final ʽⁱ f5518 = new ʽⁱ(3);

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public static C1395 m4729(AbstractC1361 abstractC1361) {
        ArrayList arrayList;
        ArrayList arrayList2;
        C1370 c1370;
        C1407 c1407;
        ArrayList arrayList3;
        ArrayList arrayList4;
        C1370 c13702;
        C1370 c13703;
        int i;
        C1407 c14072;
        C1407 c14073;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z;
        int iMo965 = abstractC1361.mo965();
        int iMo966 = abstractC1361.mo966();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        C1370 c13704 = new C1370();
        c13704.f5585 = 0;
        c13704.f5583 = iMo965;
        c13704.f5584 = 0;
        c13704.f5586 = iMo966;
        arrayList6.add(c13704);
        int i7 = iMo965 + iMo966;
        int i8 = 1;
        int i9 = (((i7 + 1) / 2) * 2) + 1;
        int[] iArr = new int[i9];
        int i10 = i9 / 2;
        int[] iArr2 = new int[i9];
        ArrayList arrayList7 = new ArrayList();
        while (!arrayList6.isEmpty()) {
            C1370 c13705 = (C1370) arrayList6.remove(arrayList6.size() - i8);
            if (c13705.m4747() < i8 || c13705.m4748() < i8) {
                arrayList = arrayList6;
                arrayList2 = arrayList7;
                c1370 = c13705;
                c1407 = null;
            } else {
                int iM4748 = ((c13705.m4748() + c13705.m4747()) + i8) / 2;
                int i11 = i8 + i10;
                iArr[i11] = c13705.f5585;
                iArr2[i11] = c13705.f5583;
                int i12 = 0;
                while (i12 < iM4748) {
                    boolean z2 = Math.abs(c13705.m4747() - c13705.m4748()) % 2 == i8;
                    int iM4747 = c13705.m4747() - c13705.m4748();
                    int i13 = -i12;
                    int i14 = i13;
                    while (true) {
                        if (i14 > i12) {
                            arrayList = arrayList6;
                            arrayList2 = arrayList7;
                            i = iM4748;
                            c14072 = null;
                            break;
                        }
                        if (i14 == i13 || (i14 != i12 && iArr[i14 + 1 + i10] > iArr[(i14 - 1) + i10])) {
                            i5 = iArr[i14 + 1 + i10];
                            i6 = i5;
                        } else {
                            i5 = iArr[(i14 - 1) + i10];
                            i6 = i5 + 1;
                        }
                        i = iM4748;
                        arrayList = arrayList6;
                        int i15 = ((i6 - c13705.f5585) + c13705.f5584) - i14;
                        int i16 = (i12 == 0 || i6 != i5) ? i15 : i15 - 1;
                        arrayList2 = arrayList7;
                        while (i6 < c13705.f5583 && i15 < c13705.f5586 && abstractC1361.mo967(i6, i15)) {
                            i6++;
                            i15++;
                        }
                        iArr[i14 + i10] = i6;
                        if (z2) {
                            int i17 = iM4747 - i14;
                            z = z2;
                            if (i17 >= i13 + 1 && i17 <= i12 - 1 && iArr2[i17 + i10] <= i6) {
                                c14072 = new C1407();
                                c14072.f5743 = i5;
                                c14072.f5740 = i16;
                                c14072.f5742 = i6;
                                c14072.f5744 = i15;
                                c14072.f5741 = false;
                                break;
                            }
                        } else {
                            z = z2;
                        }
                        i14 += 2;
                        iM4748 = i;
                        arrayList6 = arrayList;
                        arrayList7 = arrayList2;
                        z2 = z;
                    }
                    if (c14072 != null) {
                        c1407 = c14072;
                        c1370 = c13705;
                        break;
                    }
                    boolean z3 = (c13705.m4747() - c13705.m4748()) % 2 == 0;
                    int iM47472 = c13705.m4747() - c13705.m4748();
                    int i18 = i13;
                    while (true) {
                        if (i18 > i12) {
                            c1370 = c13705;
                            c14073 = null;
                            break;
                        }
                        if (i18 == i13 || (i18 != i12 && iArr2[i18 + 1 + i10] < iArr2[(i18 - 1) + i10])) {
                            i2 = iArr2[i18 + 1 + i10];
                            i3 = i2;
                        } else {
                            i2 = iArr2[(i18 - 1) + i10];
                            i3 = i2 - 1;
                        }
                        int i19 = c13705.f5586 - ((c13705.f5583 - i3) - i18);
                        int i20 = (i12 == 0 || i3 != i2) ? i19 : i19 + 1;
                        while (i3 > c13705.f5585 && i19 > c13705.f5584) {
                            c1370 = c13705;
                            if (!abstractC1361.mo967(i3 - 1, i19 - 1)) {
                                break;
                            }
                            i3--;
                            i19--;
                            c13705 = c1370;
                        }
                        c1370 = c13705;
                        iArr2[i18 + i10] = i3;
                        if (z3 && (i4 = iM47472 - i18) >= i13 && i4 <= i12 && iArr[i4 + i10] >= i3) {
                            c14073 = new C1407();
                            c14073.f5743 = i3;
                            c14073.f5740 = i19;
                            c14073.f5742 = i2;
                            c14073.f5744 = i20;
                            c14073.f5741 = true;
                            break;
                        }
                        i18 += 2;
                        c13705 = c1370;
                    }
                    if (c14073 != null) {
                        c1407 = c14073;
                        break;
                    }
                    i12++;
                    iM4748 = i;
                    arrayList6 = arrayList;
                    arrayList7 = arrayList2;
                    c13705 = c1370;
                    i8 = 1;
                }
                arrayList = arrayList6;
                arrayList2 = arrayList7;
                c1370 = c13705;
                c1407 = null;
            }
            if (c1407 != null) {
                if (c1407.m4887() > 0) {
                    int i21 = c1407.f5744;
                    int i22 = c1407.f5740;
                    int i23 = i21 - i22;
                    int i24 = c1407.f5742;
                    int i25 = c1407.f5743;
                    int i26 = i24 - i25;
                    arrayList5.add(i23 != i26 ? c1407.f5741 ? new C1437(i25, i22, c1407.m4887()) : i23 > i26 ? new C1437(i25, i22 + 1, c1407.m4887()) : new C1437(i25 + 1, i22, c1407.m4887()) : new C1437(i25, i22, i26));
                }
                if (arrayList2.isEmpty()) {
                    c13702 = new C1370();
                    arrayList4 = arrayList2;
                    c13703 = c1370;
                } else {
                    arrayList4 = arrayList2;
                    c13702 = (C1370) arrayList4.remove(arrayList2.size() - 1);
                    c13703 = c1370;
                }
                c13702.f5585 = c13703.f5585;
                c13702.f5584 = c13703.f5584;
                c13702.f5583 = c1407.f5743;
                c13702.f5586 = c1407.f5740;
                arrayList3 = arrayList;
                arrayList3.add(c13702);
                c13703.f5583 = c13703.f5583;
                c13703.f5586 = c13703.f5586;
                c13703.f5585 = c1407.f5742;
                c13703.f5584 = c1407.f5744;
                arrayList3.add(c13703);
            } else {
                arrayList3 = arrayList;
                arrayList4 = arrayList2;
                arrayList4.add(c1370);
            }
            arrayList6 = arrayList3;
            i8 = 1;
            arrayList7 = arrayList4;
        }
        Collections.sort(arrayList5, f5518);
        return new C1395(abstractC1361, arrayList5, iArr, iArr2);
    }

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public static int m4730(C1426 c1426, AbstractC1420 abstractC1420, View view, View view2, AbstractC1402 abstractC1402, boolean z) {
        if (abstractC1402.m4846() == 0 || c1426.m4948() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return c1426.m4948();
        }
        return (int) (((abstractC1420.mo4725(view2) - abstractC1420.mo4722(view)) / (Math.abs(AbstractC1402.m4815(view) - AbstractC1402.m4815(view2)) + 1)) * c1426.m4948());
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public static int m4731(C1426 c1426, AbstractC1420 abstractC1420, View view, View view2, AbstractC1402 abstractC1402, boolean z) {
        if (abstractC1402.m4846() == 0 || c1426.m4948() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return Math.abs(AbstractC1402.m4815(view) - AbstractC1402.m4815(view2)) + 1;
        }
        return Math.min(abstractC1420.mo4723(), abstractC1420.mo4725(view2) - abstractC1420.mo4722(view));
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public static int m4732(C1426 c1426, AbstractC1420 abstractC1420, View view, View view2, AbstractC1402 abstractC1402, boolean z, boolean z2) {
        if (abstractC1402.m4846() == 0 || c1426.m4948() == 0 || view == null || view2 == null) {
            return 0;
        }
        int iMax = z2 ? Math.max(0, (c1426.m4948() - Math.max(AbstractC1402.m4815(view), AbstractC1402.m4815(view2))) - 1) : Math.max(0, Math.min(AbstractC1402.m4815(view), AbstractC1402.m4815(view2)));
        if (z) {
            return Math.round((iMax * (Math.abs(abstractC1420.mo4725(view2) - abstractC1420.mo4722(view)) / (Math.abs(AbstractC1402.m4815(view) - AbstractC1402.m4815(view2)) + 1))) + (abstractC1420.mo4716() - abstractC1420.mo4722(view)));
        }
        return iMax;
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public abstract boolean m4733(Object obj, Object obj2);

    /* renamed from: ˉי, reason: contains not printable characters */
    public Object m4734(Object obj, Object obj2) {
        return null;
    }

    /* renamed from: ˉⁱ */
    public abstract int mo965();

    /* renamed from: ˏʾ */
    public abstract int mo966();

    /* renamed from: ˑʽ */
    public abstract boolean mo967(int i, int i2);

    /* renamed from: ـﹶ */
    public abstract boolean mo968(int i, int i2);

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public abstract boolean m4735(Object obj, Object obj2);

    /* renamed from: ﹶˆ */
    public abstract Object mo969(int i, int i2);
}
