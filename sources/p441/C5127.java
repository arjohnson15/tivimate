package p441;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import p412.C4693;
import p447.AbstractC5172;
import p447.C5171;
import p447.C5175;
import p447.C5177;
import p447.C5180;
import ᵎﹳ.ᐧʻ;

/* renamed from: ﾞʽ.ʿʼ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C5127 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public boolean f19610;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public ArrayList f19611;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public ArrayList f19612;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public boolean f19613;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public C5177 f19614;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public C4693 f19615;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public C5126 f19616;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public C5177 f19617;

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final void m11399(C5177 c5177) {
        int iM11505;
        int i;
        int iM11490;
        Iterator it = c5177.f19893.iterator();
        while (it.hasNext()) {
            C5171 c5171 = (C5171) it.next();
            int[] iArr = c5171.f19839;
            int i2 = iArr[0];
            int i3 = iArr[1];
            if (c5171.f19774 == 8) {
                c5171.f19809 = true;
            } else {
                float f = c5171.f19836;
                if (f < 1.0f && i2 == 3) {
                    c5171.f19794 = 2;
                }
                float f2 = c5171.f19831;
                if (f2 < 1.0f && i3 == 3) {
                    c5171.f19820 = 2;
                }
                if (c5171.f19787 > 0.0f) {
                    if (i2 == 3 && (i3 == 2 || i3 == 1)) {
                        c5171.f19794 = 3;
                    } else if (i3 == 3 && (i2 == 2 || i2 == 1)) {
                        c5171.f19820 = 3;
                    } else if (i2 == 3 && i3 == 3) {
                        if (c5171.f19794 == 0) {
                            c5171.f19794 = 3;
                        }
                        if (c5171.f19820 == 0) {
                            c5171.f19820 = 3;
                        }
                    }
                }
                C5175 c5175 = c5171.f19816;
                C5175 c51752 = c5171.f19788;
                if (i2 == 3 && c5171.f19794 == 1 && (c51752.f19884 == null || c5175.f19884 == null)) {
                    i2 = 2;
                }
                C5175 c51753 = c5171.f19838;
                C5175 c51754 = c5171.f19807;
                int i4 = (i3 == 3 && c5171.f19820 == 1 && (c51754.f19884 == null || c51753.f19884 == null)) ? 2 : i3;
                C5131 c5131 = c5171.f19832;
                c5131.f19631 = i2;
                int i5 = c5171.f19794;
                c5131.f19628 = i5;
                C5130 c5130 = c5171.f19777;
                c5130.f19631 = i4;
                int i6 = c5171.f19820;
                c5130.f19628 = i6;
                if ((i2 == 4 || i2 == 1 || i2 == 2) && (i4 == 4 || i4 == 1 || i4 == 2)) {
                    int iM115052 = c5171.m11505();
                    if (i2 == 4) {
                        iM11505 = (c5177.m11505() - c51752.f19885) - c5175.f19885;
                        i2 = 1;
                    } else {
                        iM11505 = iM115052;
                    }
                    int iM114902 = c5171.m11490();
                    if (i4 == 4) {
                        iM11490 = (c5177.m11490() - c51754.f19885) - c51753.f19885;
                        i = 1;
                    } else {
                        i = i4;
                        iM11490 = iM114902;
                    }
                    m11403(i2, iM11505, i, iM11490, c5171);
                    c5171.f19832.f19624.mo11437(c5171.m11505());
                    c5171.f19777.f19624.mo11437(c5171.m11490());
                    c5171.f19809 = true;
                } else {
                    int[] iArr2 = c5177.f19839;
                    C5175[] c5175Arr = c5171.f19795;
                    if (i2 == 3 && (i4 == 2 || i4 == 1)) {
                        if (i5 == 3) {
                            if (i4 == 2) {
                                m11403(2, 0, 2, 0, c5171);
                            }
                            int iM114903 = c5171.m11490();
                            m11403(1, (int) ((iM114903 * c5171.f19787) + 0.5f), 1, iM114903, c5171);
                            c5171.f19832.f19624.mo11437(c5171.m11505());
                            c5171.f19777.f19624.mo11437(c5171.m11490());
                            c5171.f19809 = true;
                        } else if (i5 == 1) {
                            m11403(2, 0, i4, 0, c5171);
                            c5171.f19832.f19624.f19648 = c5171.m11505();
                        } else if (i5 == 2) {
                            int i7 = iArr2[0];
                            if (i7 == 1 || i7 == 4) {
                                m11403(1, (int) ((f * c5177.m11505()) + 0.5f), i4, c5171.m11490(), c5171);
                                c5171.f19832.f19624.mo11437(c5171.m11505());
                                c5171.f19777.f19624.mo11437(c5171.m11490());
                                c5171.f19809 = true;
                            }
                        } else if (c5175Arr[0].f19884 == null || c5175Arr[1].f19884 == null) {
                            m11403(2, 0, i4, 0, c5171);
                            c5171.f19832.f19624.mo11437(c5171.m11505());
                            c5171.f19777.f19624.mo11437(c5171.m11490());
                            c5171.f19809 = true;
                        }
                    }
                    if (i4 == 3 && (i2 == 2 || i2 == 1)) {
                        if (i6 == 3) {
                            if (i2 == 2) {
                                m11403(2, 0, 2, 0, c5171);
                            }
                            int iM115053 = c5171.m11505();
                            float f3 = c5171.f19787;
                            if (c5171.f19791 == -1) {
                                f3 = 1.0f / f3;
                            }
                            m11403(1, iM115053, 1, (int) ((iM115053 * f3) + 0.5f), c5171);
                            c5171.f19832.f19624.mo11437(c5171.m11505());
                            c5171.f19777.f19624.mo11437(c5171.m11490());
                            c5171.f19809 = true;
                        } else if (i6 == 1) {
                            m11403(i2, 0, 2, 0, c5171);
                            c5171.f19777.f19624.f19648 = c5171.m11490();
                        } else if (i6 == 2) {
                            int i8 = iArr2[1];
                            if (i8 == 1 || i8 == 4) {
                                m11403(i2, c5171.m11505(), 1, (int) ((f2 * c5177.m11490()) + 0.5f), c5171);
                                c5171.f19832.f19624.mo11437(c5171.m11505());
                                c5171.f19777.f19624.mo11437(c5171.m11490());
                                c5171.f19809 = true;
                            }
                        } else if (c5175Arr[2].f19884 == null || c5175Arr[3].f19884 == null) {
                            m11403(2, 0, i4, 0, c5171);
                            c5171.f19832.f19624.mo11437(c5171.m11505());
                            c5171.f19777.f19624.mo11437(c5171.m11490());
                            c5171.f19809 = true;
                        }
                    }
                    if (i2 == 3 && i4 == 3) {
                        if (i5 == 1 || i6 == 1) {
                            m11403(2, 0, 2, 0, c5171);
                            c5171.f19832.f19624.f19648 = c5171.m11505();
                            c5171.f19777.f19624.f19648 = c5171.m11490();
                        } else if (i6 == 2 && i5 == 2 && iArr2[0] == 1 && iArr2[1] == 1) {
                            m11403(1, (int) ((f * c5177.m11505()) + 0.5f), 1, (int) ((f2 * c5177.m11490()) + 0.5f), c5171);
                            c5171.f19832.f19624.mo11437(c5171.m11505());
                            c5171.f19777.f19624.mo11437(c5171.m11490());
                            c5171.f19809 = true;
                        }
                    }
                }
            }
        }
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final void m11400(AbstractC5132 abstractC5132, int i, ArrayList arrayList) {
        C5136 c5136;
        Iterator it = abstractC5132.f19626.f19640.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            c5136 = abstractC5132.f19632;
            if (!zHasNext) {
                break;
            }
            InterfaceC5139 interfaceC5139 = (InterfaceC5139) it.next();
            if (interfaceC5139 instanceof C5136) {
                m11402((C5136) interfaceC5139, i, arrayList, null);
            } else if (interfaceC5139 instanceof AbstractC5132) {
                m11402(((AbstractC5132) interfaceC5139).f19626, i, arrayList, null);
            }
        }
        Iterator it2 = c5136.f19640.iterator();
        while (it2.hasNext()) {
            InterfaceC5139 interfaceC51392 = (InterfaceC5139) it2.next();
            if (interfaceC51392 instanceof C5136) {
                m11402((C5136) interfaceC51392, i, arrayList, null);
            } else if (interfaceC51392 instanceof AbstractC5132) {
                m11402(((AbstractC5132) interfaceC51392).f19632, i, arrayList, null);
            }
        }
        if (i == 1) {
            Iterator it3 = ((C5130) abstractC5132).f19621.f19640.iterator();
            while (it3.hasNext()) {
                InterfaceC5139 interfaceC51393 = (InterfaceC5139) it3.next();
                if (interfaceC51393 instanceof C5136) {
                    m11402((C5136) interfaceC51393, i, arrayList, null);
                }
            }
        }
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final void m11401() {
        ArrayList arrayList = this.f19611;
        arrayList.clear();
        C5177 c5177 = this.f19617;
        c5177.f19832.mo11410();
        c5177.f19777.mo11410();
        arrayList.add(c5177.f19832);
        arrayList.add(c5177.f19777);
        Iterator it = c5177.f19893.iterator();
        HashSet hashSet = null;
        while (it.hasNext()) {
            C5171 c5171 = (C5171) it.next();
            if (c5171 instanceof C5180) {
                C5140 c5140 = new C5140(c5171);
                c5171.f19832.mo11410();
                c5171.f19777.mo11410();
                c5140.f19629 = ((C5180) c5171).f19934;
                arrayList.add(c5140);
            } else {
                if (c5171.m11511()) {
                    if (c5171.f19775 == null) {
                        c5171.f19775 = new C5134(c5171, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(c5171.f19775);
                } else {
                    arrayList.add(c5171.f19832);
                }
                if (c5171.m11495()) {
                    if (c5171.f19800 == null) {
                        c5171.f19800 = new C5134(c5171, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(c5171.f19800);
                } else {
                    arrayList.add(c5171.f19777);
                }
                if (c5171 instanceof AbstractC5172) {
                    arrayList.add(new C5128(c5171));
                }
            }
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((AbstractC5132) it2.next()).mo11410();
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            AbstractC5132 abstractC5132 = (AbstractC5132) it3.next();
            if (abstractC5132.f19623 != c5177) {
                abstractC5132.mo11411();
            }
        }
        ArrayList arrayList2 = this.f19612;
        arrayList2.clear();
        C5177 c51772 = this.f19614;
        m11400(c51772.f19832, 0, arrayList2);
        m11400(c51772.f19777, 1, arrayList2);
        this.f19610 = false;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void m11402(C5136 c5136, int i, ArrayList arrayList, C5129 c5129) {
        AbstractC5132 abstractC5132 = c5136.f19646;
        if (abstractC5132.f19627 == null) {
            C5177 c5177 = this.f19614;
            if (abstractC5132 == c5177.f19832 || abstractC5132 == c5177.f19777) {
                return;
            }
            if (c5129 == null) {
                c5129 = new C5129();
                c5129.f19619 = null;
                c5129.f19618 = new ArrayList();
                c5129.f19619 = abstractC5132;
                arrayList.add(c5129);
            }
            abstractC5132.f19627 = c5129;
            c5129.f19618.add(abstractC5132);
            C5136 c51362 = abstractC5132.f19626;
            Iterator it = c51362.f19640.iterator();
            while (it.hasNext()) {
                InterfaceC5139 interfaceC5139 = (InterfaceC5139) it.next();
                if (interfaceC5139 instanceof C5136) {
                    m11402((C5136) interfaceC5139, i, arrayList, c5129);
                }
            }
            C5136 c51363 = abstractC5132.f19632;
            Iterator it2 = c51363.f19640.iterator();
            while (it2.hasNext()) {
                InterfaceC5139 interfaceC51392 = (InterfaceC5139) it2.next();
                if (interfaceC51392 instanceof C5136) {
                    m11402((C5136) interfaceC51392, i, arrayList, c5129);
                }
            }
            if (i == 1 && (abstractC5132 instanceof C5130)) {
                Iterator it3 = ((C5130) abstractC5132).f19621.f19640.iterator();
                while (it3.hasNext()) {
                    InterfaceC5139 interfaceC51393 = (InterfaceC5139) it3.next();
                    if (interfaceC51393 instanceof C5136) {
                        m11402((C5136) interfaceC51393, i, arrayList, c5129);
                    }
                }
            }
            Iterator it4 = c51362.f19639.iterator();
            while (it4.hasNext()) {
                m11402((C5136) it4.next(), i, arrayList, c5129);
            }
            Iterator it5 = c51363.f19639.iterator();
            while (it5.hasNext()) {
                m11402((C5136) it5.next(), i, arrayList, c5129);
            }
            if (i == 1 && (abstractC5132 instanceof C5130)) {
                Iterator it6 = ((C5130) abstractC5132).f19621.f19639.iterator();
                while (it6.hasNext()) {
                    m11402((C5136) it6.next(), i, arrayList, c5129);
                }
            }
        }
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final void m11403(int i, int i2, int i3, int i4, C5171 c5171) {
        C5126 c5126 = this.f19616;
        c5126.f19605 = i;
        c5126.f19600 = i3;
        c5126.f19604 = i2;
        c5126.f19608 = i4;
        this.f19615.m10607(c5171, c5126);
        c5171.m11493(c5126.f19601);
        c5171.m11513(c5126.f19606);
        c5171.f19814 = c5126.f19603;
        c5171.m11484(c5126.f19607);
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final void m11404() {
        C5135 c5135;
        Iterator it = this.f19614.f19893.iterator();
        while (it.hasNext()) {
            C5171 c5171 = (C5171) it.next();
            if (!c5171.f19809) {
                int[] iArr = c5171.f19839;
                boolean z = false;
                int i = iArr[0];
                int i2 = iArr[1];
                int i3 = c5171.f19794;
                int i4 = c5171.f19820;
                boolean z2 = i == 2 || (i == 3 && i3 == 1);
                if (i2 == 2 || (i2 == 3 && i4 == 1)) {
                    z = true;
                }
                C5137 c5137 = c5171.f19832.f19624;
                boolean z3 = c5137.f19638;
                C5137 c51372 = c5171.f19777.f19624;
                boolean z4 = c51372.f19638;
                if (z3 && z4) {
                    m11403(1, c5137.f19645, 1, c51372.f19645, c5171);
                    c5171.f19809 = true;
                } else if (z3 && z) {
                    m11403(1, c5137.f19645, 2, c51372.f19645, c5171);
                    if (i2 == 3) {
                        c5171.f19777.f19624.f19648 = c5171.m11490();
                    } else {
                        c5171.f19777.f19624.mo11437(c5171.m11490());
                        c5171.f19809 = true;
                    }
                } else if (z4 && z2) {
                    m11403(2, c5137.f19645, 1, c51372.f19645, c5171);
                    if (i == 3) {
                        c5171.f19832.f19624.f19648 = c5171.m11505();
                    } else {
                        c5171.f19832.f19624.mo11437(c5171.m11505());
                        c5171.f19809 = true;
                    }
                }
                if (c5171.f19809 && (c5135 = c5171.f19777.f19620) != null) {
                    c5135.mo11437(c5171.f19785);
                }
            }
        }
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final int m11405(C5177 c5177, int i) {
        ArrayList arrayList;
        int i2;
        int i3;
        long jMax;
        float f;
        C5177 c51772 = c5177;
        ArrayList arrayList2 = this.f19612;
        int size = arrayList2.size();
        int i4 = 0;
        long jMax2 = 0;
        while (i4 < size) {
            AbstractC5132 abstractC5132 = ((C5129) arrayList2.get(i4)).f19619;
            if (!(abstractC5132 instanceof C5134) ? !(i != 0 ? (abstractC5132 instanceof C5130) : (abstractC5132 instanceof C5131)) : ((C5134) abstractC5132).f19629 != i) {
                C5136 c5136 = (i == 0 ? c51772.f19832 : c51772.f19777).f19626;
                C5136 c51362 = (i == 0 ? c51772.f19832 : c51772.f19777).f19632;
                boolean zContains = abstractC5132.f19626.f19639.contains(c5136);
                C5136 c51363 = abstractC5132.f19632;
                boolean zContains2 = c51363.f19639.contains(c51362);
                long jMo11420 = abstractC5132.mo11420();
                C5136 c51364 = abstractC5132.f19626;
                if (zContains && zContains2) {
                    long jM11412 = C5129.m11412(c51364, 0L);
                    ArrayList arrayList3 = arrayList2;
                    i2 = size;
                    long jM11413 = C5129.m11413(c51363, 0L);
                    long j = jM11412 - jMo11420;
                    int i5 = c51363.f19644;
                    arrayList = arrayList3;
                    i3 = i4;
                    if (j >= (-i5)) {
                        j += i5;
                    }
                    long j2 = (-jM11413) - jMo11420;
                    long j3 = c51364.f19644;
                    long j4 = j2 - j3;
                    if (j4 >= j3) {
                        j4 -= j3;
                    }
                    C5171 c5171 = abstractC5132.f19623;
                    if (i == 0) {
                        f = c5171.f19806;
                    } else if (i == 1) {
                        f = c5171.f19773;
                    } else {
                        c5171.getClass();
                        f = -1.0f;
                    }
                    float f2 = f > 0.0f ? (long) ((j / (1.0f - f)) + (j4 / f)) : 0L;
                    jMax = (c51364.f19644 + ((((long) ((f2 * f) + 0.5f)) + jMo11420) + ((long) ᐧʻ.ﹶˆ(1.0f, f, f2, 0.5f)))) - c51363.f19644;
                } else {
                    arrayList = arrayList2;
                    i2 = size;
                    i3 = i4;
                    jMax = zContains ? Math.max(C5129.m11412(c51364, c51364.f19644), c51364.f19644 + jMo11420) : zContains2 ? Math.max(-C5129.m11413(c51363, c51363.f19644), (-c51363.f19644) + jMo11420) : (abstractC5132.mo11420() + c51364.f19644) - c51363.f19644;
                }
            } else {
                arrayList = arrayList2;
                i2 = size;
                i3 = i4;
                jMax = 0;
            }
            jMax2 = Math.max(jMax2, jMax);
            i4 = i3 + 1;
            c51772 = c5177;
            size = i2;
            arrayList2 = arrayList;
        }
        return (int) jMax2;
    }
}
