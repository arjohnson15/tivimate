package p447;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import p080.C1700;
import p331.C3762;
import p412.C4693;
import p441.AbstractC5132;
import p441.C5126;
import p441.C5127;
import p441.C5134;

/* renamed from: ﾞˊ.ٴˎ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C5177 extends C5171 {

    /* renamed from: ʻ, reason: contains not printable characters */
    public int f19892;

    /* renamed from: ʼᵎ, reason: contains not printable characters */
    public C5170[] f19894;

    /* renamed from: ʽⁱ, reason: contains not printable characters */
    public int f19895;

    /* renamed from: ʾˈ, reason: contains not printable characters */
    public int f19896;

    /* renamed from: ˆﾞ, reason: contains not printable characters */
    public C4693 f19897;

    /* renamed from: ˊˆ, reason: contains not printable characters */
    public int f19898;

    /* renamed from: ˊﹶ, reason: contains not printable characters */
    public final C5127 f19899;

    /* renamed from: ˏ, reason: contains not printable characters */
    public final C1700 f19900;

    /* renamed from: יˊ, reason: contains not printable characters */
    public final C5126 f19901;

    /* renamed from: ᐧᴵ, reason: contains not printable characters */
    public int f19903;

    /* renamed from: ᴵˋ, reason: contains not printable characters */
    public WeakReference f19904;

    /* renamed from: ᴵᴵ, reason: contains not printable characters */
    public WeakReference f19905;

    /* renamed from: ᵎˆ, reason: contains not printable characters */
    public int f19906;

    /* renamed from: ᵔˋ, reason: contains not printable characters */
    public boolean f19907;

    /* renamed from: ᵔᵢ, reason: contains not printable characters */
    public final HashSet f19908;

    /* renamed from: ᵢˆ, reason: contains not printable characters */
    public WeakReference f19909;

    /* renamed from: ᵢᵢ, reason: contains not printable characters */
    public boolean f19910;

    /* renamed from: ᵢﹶ, reason: contains not printable characters */
    public WeakReference f19911;

    /* renamed from: ﹶʾ, reason: contains not printable characters */
    public boolean f19912;

    /* renamed from: ﹶﾞ, reason: contains not printable characters */
    public C5170[] f19913;

    /* renamed from: ʻʻ, reason: contains not printable characters */
    public ArrayList f19893 = new ArrayList();

    /* renamed from: ᐧʼ, reason: contains not printable characters */
    public final C3762 f19902 = new C3762(this);

    public C5177() {
        C5127 c5127 = new C5127();
        c5127.f19610 = true;
        c5127.f19613 = true;
        c5127.f19611 = new ArrayList();
        new ArrayList();
        c5127.f19615 = null;
        c5127.f19616 = new C5126();
        c5127.f19612 = new ArrayList();
        c5127.f19614 = this;
        c5127.f19617 = this;
        this.f19899 = c5127;
        this.f19897 = null;
        this.f19910 = false;
        this.f19900 = new C1700();
        this.f19898 = 0;
        this.f19903 = 0;
        this.f19913 = new C5170[4];
        this.f19894 = new C5170[4];
        this.f19906 = 257;
        this.f19912 = false;
        this.f19907 = false;
        this.f19911 = null;
        this.f19909 = null;
        this.f19904 = null;
        this.f19905 = null;
        this.f19908 = new HashSet();
        this.f19901 = new C5126();
    }

    /* renamed from: ﾞˎ, reason: contains not printable characters */
    public static void m11536(C5171 c5171, C4693 c4693, C5126 c5126) {
        int i;
        int i2;
        if (c4693 == null) {
            return;
        }
        if (c5171.f19774 == 8 || (c5171 instanceof C5180) || (c5171 instanceof C5176)) {
            c5126.f19601 = 0;
            c5126.f19606 = 0;
            return;
        }
        int[] iArr = c5171.f19839;
        c5126.f19605 = iArr[0];
        c5126.f19600 = iArr[1];
        c5126.f19604 = c5171.m11505();
        c5126.f19608 = c5171.m11490();
        c5126.f19609 = false;
        c5126.f19602 = 0;
        boolean z = c5126.f19605 == 3;
        boolean z2 = c5126.f19600 == 3;
        boolean z3 = z && c5171.f19787 > 0.0f;
        boolean z4 = z2 && c5171.f19787 > 0.0f;
        if (z && c5171.m11507(0) && c5171.f19794 == 0 && !z3) {
            c5126.f19605 = 2;
            if (z2 && c5171.f19820 == 0) {
                c5126.f19605 = 1;
            }
            z = false;
        }
        if (z2 && c5171.m11507(1) && c5171.f19820 == 0 && !z4) {
            c5126.f19600 = 2;
            if (z && c5171.f19794 == 0) {
                c5126.f19600 = 1;
            }
            z2 = false;
        }
        if (c5171.mo11481()) {
            c5126.f19605 = 1;
            z = false;
        }
        if (c5171.mo11501()) {
            c5126.f19600 = 1;
            z2 = false;
        }
        int[] iArr2 = c5171.f19830;
        if (z3) {
            if (iArr2[0] == 4) {
                c5126.f19605 = 1;
            } else if (!z2) {
                if (c5126.f19600 == 1) {
                    i2 = c5126.f19608;
                } else {
                    c5126.f19605 = 2;
                    c4693.m10607(c5171, c5126);
                    i2 = c5126.f19606;
                }
                c5126.f19605 = 1;
                c5126.f19604 = (int) (c5171.f19787 * i2);
            }
        }
        if (z4) {
            if (iArr2[1] == 4) {
                c5126.f19600 = 1;
            } else if (!z) {
                if (c5126.f19605 == 1) {
                    i = c5126.f19604;
                } else {
                    c5126.f19600 = 2;
                    c4693.m10607(c5171, c5126);
                    i = c5126.f19601;
                }
                c5126.f19600 = 1;
                if (c5171.f19791 == -1) {
                    c5126.f19608 = (int) (i / c5171.f19787);
                } else {
                    c5126.f19608 = (int) (c5171.f19787 * i);
                }
            }
        }
        c4693.m10607(c5171, c5126);
        c5171.m11493(c5126.f19601);
        c5171.m11513(c5126.f19606);
        c5171.f19814 = c5126.f19603;
        c5171.m11484(c5126.f19607);
        c5126.f19602 = 0;
    }

    /* renamed from: ʻʿ, reason: contains not printable characters */
    public final void m11537(C1700 c1700) {
        boolean zM11538 = m11538(64);
        mo11475(c1700, zM11538);
        int size = this.f19893.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            C5171 c5171 = (C5171) this.f19893.get(i);
            boolean[] zArr = c5171.f19772;
            zArr[0] = false;
            zArr[1] = false;
            if (c5171 instanceof C5176) {
                z = true;
            }
        }
        if (z) {
            for (int i2 = 0; i2 < size; i2++) {
                C5171 c51712 = (C5171) this.f19893.get(i2);
                if (c51712 instanceof C5176) {
                    C5176 c5176 = (C5176) c51712;
                    for (int i3 = 0; i3 < c5176.f19841; i3++) {
                        C5171 c51713 = c5176.f19840[i3];
                        if (c5176.f19888 || c51713.mo11492()) {
                            int i4 = c5176.f19890;
                            if (i4 == 0 || i4 == 1) {
                                c51713.f19772[0] = true;
                            } else if (i4 == 2 || i4 == 3) {
                                c51713.f19772[1] = true;
                            }
                        }
                    }
                }
            }
        }
        HashSet hashSet = this.f19908;
        hashSet.clear();
        for (int i5 = 0; i5 < size; i5++) {
            C5171 c51714 = (C5171) this.f19893.get(i5);
            c51714.getClass();
            boolean z2 = c51714 instanceof C5174;
            if (z2 || (c51714 instanceof C5180)) {
                if (z2) {
                    hashSet.add(c51714);
                } else {
                    c51714.mo11475(c1700, zM11538);
                }
            }
        }
        while (hashSet.size() > 0) {
            int size2 = hashSet.size();
            Iterator it = hashSet.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C5174 c5174 = (C5174) ((C5171) it.next());
                for (int i6 = 0; i6 < c5174.f19841; i6++) {
                    if (hashSet.contains(c5174.f19840[i6])) {
                        c5174.mo11475(c1700, zM11538);
                        hashSet.remove(c5174);
                        break;
                    }
                }
            }
            if (size2 == hashSet.size()) {
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    ((C5171) it2.next()).mo11475(c1700, zM11538);
                }
                hashSet.clear();
            }
        }
        if (C1700.f6626) {
            HashSet hashSet2 = new HashSet();
            for (int i7 = 0; i7 < size; i7++) {
                C5171 c51715 = (C5171) this.f19893.get(i7);
                c51715.getClass();
                if (!(c51715 instanceof C5174) && !(c51715 instanceof C5180)) {
                    hashSet2.add(c51715);
                }
            }
            m11497(this, c1700, hashSet2, this.f19839[0] == 2 ? 0 : 1, false);
            Iterator it3 = hashSet2.iterator();
            while (it3.hasNext()) {
                C5171 c51716 = (C5171) it3.next();
                AbstractC5173.m11516(this, c1700, c51716);
                c51716.mo11475(c1700, zM11538);
            }
        } else {
            for (int i8 = 0; i8 < size; i8++) {
                C5171 c51717 = (C5171) this.f19893.get(i8);
                if (c51717 instanceof C5177) {
                    int[] iArr = c51717.f19839;
                    int i9 = iArr[0];
                    int i10 = iArr[1];
                    if (i9 == 2) {
                        c51717.m11476(1);
                    }
                    if (i10 == 2) {
                        c51717.m11494(1);
                    }
                    c51717.mo11475(c1700, zM11538);
                    if (i9 == 2) {
                        c51717.m11476(i9);
                    }
                    if (i10 == 2) {
                        c51717.m11494(i10);
                    }
                } else {
                    AbstractC5173.m11516(this, c1700, c51717);
                    if (!(c51717 instanceof C5174) && !(c51717 instanceof C5180)) {
                        c51717.mo11475(c1700, zM11538);
                    }
                }
            }
        }
        if (this.f19898 > 0) {
            AbstractC5173.m11518(this, c1700, null, 0);
        }
        if (this.f19903 > 0) {
            AbstractC5173.m11518(this, c1700, null, 1);
        }
    }

    @Override // p447.C5171
    /* renamed from: ˆʿ */
    public final void mo11479() {
        this.f19900.m5396();
        this.f19892 = 0;
        this.f19895 = 0;
        this.f19893.clear();
        super.mo11479();
    }

    @Override // p447.C5171
    /* renamed from: ˆᵔ */
    public final void mo11480(C3762 c3762) {
        super.mo11480(c3762);
        int size = this.f19893.size();
        for (int i = 0; i < size; i++) {
            ((C5171) this.f19893.get(i)).mo11480(c3762);
        }
    }

    /* renamed from: ˊᵔ, reason: contains not printable characters */
    public final boolean m11538(int i) {
        return (this.f19906 & i) == i;
    }

    @Override // p447.C5171
    /* renamed from: ᴵʿ */
    public final void mo11503(StringBuilder sb) {
        sb.append(this.f19784 + ":{\n");
        StringBuilder sb2 = new StringBuilder("  actualWidth:");
        sb2.append(this.f19823);
        sb.append(sb2.toString());
        sb.append("\n");
        sb.append("  actualHeight:" + this.f19837);
        sb.append("\n");
        Iterator it = this.f19893.iterator();
        while (it.hasNext()) {
            ((C5171) it.next()).mo11503(sb);
            sb.append(",\n");
        }
        sb.append("}");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:349:0x05dd  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x0608  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x063b  */
    /* JADX WARN: Removed duplicated region for block: B:381:0x0651  */
    /* JADX WARN: Removed duplicated region for block: B:387:0x0661  */
    /* JADX WARN: Removed duplicated region for block: B:391:0x066c  */
    /* JADX WARN: Removed duplicated region for block: B:394:0x0677 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:396:0x067d  */
    /* JADX WARN: Removed duplicated region for block: B:399:0x0685  */
    /* JADX WARN: Removed duplicated region for block: B:403:0x068c  */
    /* JADX WARN: Removed duplicated region for block: B:406:0x0696  */
    /* JADX WARN: Removed duplicated region for block: B:412:0x06b3  */
    /* JADX WARN: Removed duplicated region for block: B:436:0x0715  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:480:0x07c2  */
    /* JADX WARN: Removed duplicated region for block: B:489:0x07ff  */
    /* JADX WARN: Removed duplicated region for block: B:495:0x081a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:500:0x0826 A[LOOP:14: B:499:0x0824->B:500:0x0826, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:512:0x088c  */
    /* JADX WARN: Removed duplicated region for block: B:513:0x0898  */
    /* JADX WARN: Removed duplicated region for block: B:516:0x08ab  */
    /* JADX WARN: Removed duplicated region for block: B:517:0x08b4  */
    /* JADX WARN: Removed duplicated region for block: B:519:0x08b8  */
    /* JADX WARN: Removed duplicated region for block: B:532:0x08ef  */
    /* JADX WARN: Removed duplicated region for block: B:534:0x08f3  */
    /* JADX WARN: Removed duplicated region for block: B:538:0x0900  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:611:0x08f4 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r6v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* renamed from: ᵔ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m11539() {
        /*
            Method dump skipped, instructions count: 2316
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p447.C5177.m11539():void");
    }

    /* renamed from: ᵔٴ, reason: contains not printable characters */
    public final boolean m11540(int i, boolean z) {
        boolean z2;
        C5127 c5127 = this.f19899;
        C5177 c5177 = c5127.f19614;
        boolean z3 = false;
        int iM11482 = c5177.m11482(0);
        int iM114822 = c5177.m11482(1);
        int iM11488 = c5177.m11488();
        int iM11504 = c5177.m11504();
        ArrayList arrayList = c5127.f19611;
        if (z && (iM11482 == 2 || iM114822 == 2)) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                AbstractC5132 abstractC5132 = (AbstractC5132) it.next();
                if (abstractC5132.f19629 == i && !abstractC5132.mo11408()) {
                    z = false;
                    break;
                }
            }
            if (i == 0) {
                if (z && iM11482 == 2) {
                    c5177.m11476(1);
                    c5177.m11493(c5127.m11405(c5177, 0));
                    c5177.f19832.f19624.mo11437(c5177.m11505());
                }
            } else if (z && iM114822 == 2) {
                c5177.m11494(1);
                c5177.m11513(c5127.m11405(c5177, 1));
                c5177.f19777.f19624.mo11437(c5177.m11490());
            }
        }
        int[] iArr = c5177.f19839;
        if (i == 0) {
            int i2 = iArr[0];
            if (i2 == 1 || i2 == 4) {
                int iM11505 = c5177.m11505() + iM11488;
                c5177.f19832.f19632.mo11437(iM11505);
                c5177.f19832.f19624.mo11437(iM11505 - iM11488);
                z2 = true;
            }
            z2 = false;
        } else {
            int i3 = iArr[1];
            if (i3 == 1 || i3 == 4) {
                int iM11490 = c5177.m11490() + iM11504;
                c5177.f19777.f19632.mo11437(iM11490);
                c5177.f19777.f19624.mo11437(iM11490 - iM11504);
                z2 = true;
            }
            z2 = false;
        }
        c5127.m11404();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            AbstractC5132 abstractC51322 = (AbstractC5132) it2.next();
            if (abstractC51322.f19629 == i && (abstractC51322.f19623 != c5177 || abstractC51322.f19630)) {
                abstractC51322.mo11406();
            }
        }
        Iterator it3 = arrayList.iterator();
        while (true) {
            if (!it3.hasNext()) {
                z3 = true;
                break;
            }
            AbstractC5132 abstractC51323 = (AbstractC5132) it3.next();
            if (abstractC51323.f19629 == i && (z2 || abstractC51323.f19623 != c5177)) {
                if (!abstractC51323.f19626.f19638 || !abstractC51323.f19632.f19638 || (!(abstractC51323 instanceof C5134) && !abstractC51323.f19624.f19638)) {
                    break;
                }
            }
        }
        c5177.m11476(iM11482);
        c5177.m11494(iM114822);
        return z3;
    }

    /* renamed from: ᵔﹳ, reason: contains not printable characters */
    public final void m11541(C5171 c5171, int i) {
        if (i == 0) {
            int i2 = this.f19898 + 1;
            C5170[] c5170Arr = this.f19894;
            if (i2 >= c5170Arr.length) {
                this.f19894 = (C5170[]) Arrays.copyOf(c5170Arr, c5170Arr.length * 2);
            }
            C5170[] c5170Arr2 = this.f19894;
            int i3 = this.f19898;
            c5170Arr2[i3] = new C5170(c5171, 0, this.f19910);
            this.f19898 = i3 + 1;
            return;
        }
        if (i == 1) {
            int i4 = this.f19903 + 1;
            C5170[] c5170Arr3 = this.f19913;
            if (i4 >= c5170Arr3.length) {
                this.f19913 = (C5170[]) Arrays.copyOf(c5170Arr3, c5170Arr3.length * 2);
            }
            C5170[] c5170Arr4 = this.f19913;
            int i5 = this.f19903;
            c5170Arr4[i5] = new C5170(c5171, 1, this.f19910);
            this.f19903 = i5 + 1;
        }
    }

    @Override // p447.C5171
    /* renamed from: ᵢٴ */
    public final void mo11506(boolean z, boolean z2) {
        super.mo11506(z, z2);
        int size = this.f19893.size();
        for (int i = 0; i < size; i++) {
            ((C5171) this.f19893.get(i)).mo11506(z, z2);
        }
    }
}
