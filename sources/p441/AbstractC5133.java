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

/* renamed from: ﾞʽ.ˏᵢ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC5133 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final C5126 f19633 = new C5126();

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static C5138 m11424(C5171 c5171, int i, ArrayList arrayList, C5138 c5138) {
        int i2;
        int i3 = i == 0 ? c5171.f19801 : c5171.f19829;
        if (i3 != -1 && (c5138 == null || i3 != c5138.f19650)) {
            int i4 = 0;
            while (true) {
                if (i4 >= arrayList.size()) {
                    break;
                }
                C5138 c51382 = (C5138) arrayList.get(i4);
                if (c51382.f19650 == i3) {
                    if (c5138 != null) {
                        c5138.m11439(i, c51382);
                        arrayList.remove(c5138);
                    }
                    c5138 = c51382;
                } else {
                    i4++;
                }
            }
        } else if (i3 != -1) {
            return c5138;
        }
        if (c5138 == null) {
            if (c5171 instanceof AbstractC5172) {
                AbstractC5172 abstractC5172 = (AbstractC5172) c5171;
                int i5 = 0;
                while (true) {
                    if (i5 >= abstractC5172.f19841) {
                        i2 = -1;
                        break;
                    }
                    C5171 c51712 = abstractC5172.f19840[i5];
                    if ((i == 0 && (i2 = c51712.f19801) != -1) || (i == 1 && (i2 = c51712.f19829) != -1)) {
                        break;
                    }
                    i5++;
                }
                if (i2 != -1) {
                    int i6 = 0;
                    while (true) {
                        if (i6 >= arrayList.size()) {
                            break;
                        }
                        C5138 c51383 = (C5138) arrayList.get(i6);
                        if (c51383.f19650 == i2) {
                            c5138 = c51383;
                            break;
                        }
                        i6++;
                    }
                }
            }
            if (c5138 == null) {
                c5138 = new C5138();
                c5138.f19653 = new ArrayList();
                c5138.f19654 = null;
                c5138.f19651 = -1;
                int i7 = C5138.f19649;
                C5138.f19649 = i7 + 1;
                c5138.f19650 = i7;
                c5138.f19652 = i;
            }
            arrayList.add(c5138);
        }
        ArrayList arrayList2 = c5138.f19653;
        if (!arrayList2.contains(c5171)) {
            arrayList2.add(c5171);
            if (c5171 instanceof C5180) {
                C5180 c5180 = (C5180) c5171;
                c5180.f19933.m11528(c5180.f19934 == 0 ? 1 : 0, arrayList, c5138);
            }
            int i8 = c5138.f19650;
            if (i == 0) {
                c5171.f19801 = i8;
                c5171.f19788.m11528(i, arrayList, c5138);
                c5171.f19816.m11528(i, arrayList, c5138);
            } else {
                c5171.f19829 = i8;
                c5171.f19807.m11528(i, arrayList, c5138);
                c5171.f19776.m11528(i, arrayList, c5138);
                c5171.f19838.m11528(i, arrayList, c5138);
            }
            c5171.f19827.m11528(i, arrayList, c5138);
        }
        return c5138;
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public static void m11425(int i, C5171 c5171, C4693 c4693, C5171 c51712, boolean z) {
        float f = c51712.f19806;
        C5175 c5175 = c51712.f19788;
        int iM11523 = c5175.m11523() + c5175.f19884.m11532();
        C5175 c51752 = c51712.f19816;
        int iM11532 = c51752.f19884.m11532() - c51752.m11523();
        if (iM11532 >= iM11523) {
            int iM11505 = c51712.m11505();
            if (c51712.f19774 != 8) {
                int i2 = c51712.f19794;
                if (i2 == 2) {
                    iM11505 = (int) (c51712.f19806 * 0.5f * (c5171 instanceof C5177 ? c5171.m11505() : c5171.f19824.m11505()));
                } else if (i2 == 0) {
                    iM11505 = iM11532 - iM11523;
                }
                iM11505 = Math.max(c51712.f19779, iM11505);
                int i3 = c51712.f19789;
                if (i3 > 0) {
                    iM11505 = Math.min(i3, iM11505);
                }
            }
            int i4 = iM11523 + ((int) ((f * ((iM11532 - iM11523) - iM11505)) + 0.5f));
            c51712.m11496(i4, iM11505 + i4);
            m11427(i + 1, c4693, c51712, z);
        }
    }

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public static boolean m11426(int i, int i2, int i3, int i4) {
        return (i3 == 1 || i3 == 2 || (i3 == 4 && i != 2)) || (i4 == 1 || i4 == 2 || (i4 == 4 && i2 != 2));
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static void m11427(int i, C4693 c4693, C5171 c5171, boolean z) {
        C5175 c5175;
        C5175 c51752;
        C5175 c51753;
        C5175 c51754;
        if (c5171.f19790) {
            return;
        }
        if (!(c5171 instanceof C5177) && c5171.m11508() && m11428(c5171)) {
            C5177.m11536(c5171, c4693, new C5126());
        }
        C5175 c5175Mo11510 = c5171.mo11510(2);
        C5175 c5175Mo115102 = c5171.mo11510(4);
        int iM11532 = c5175Mo11510.m11532();
        int iM115322 = c5175Mo115102.m11532();
        HashSet hashSet = c5175Mo11510.f19883;
        char c = 0;
        if (hashSet != null && c5175Mo11510.f19882) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                C5175 c51755 = (C5175) it.next();
                C5171 c51712 = c51755.f19886;
                int i2 = i + 1;
                boolean zM11428 = m11428(c51712);
                if (c51712.m11508() && zM11428) {
                    C5177.m11536(c51712, c4693, new C5126());
                }
                C5175 c51756 = c51712.f19788;
                C5175 c51757 = c51712.f19816;
                boolean z2 = (c51755 == c51756 && (c51754 = c51757.f19884) != null && c51754.f19882) || (c51755 == c51757 && (c51753 = c51756.f19884) != null && c51753.f19882);
                int i3 = c51712.f19839[c];
                if (i3 != 3 || zM11428) {
                    if (!c51712.m11508()) {
                        if (c51755 == c51756 && c51757.f19884 == null) {
                            int iM11523 = c51756.m11523() + iM11532;
                            c51712.m11496(iM11523, c51712.m11505() + iM11523);
                            m11427(i2, c4693, c51712, z);
                        } else if (c51755 == c51757 && c51756.f19884 == null) {
                            int iM115232 = iM11532 - c51757.m11523();
                            c51712.m11496(iM115232 - c51712.m11505(), iM115232);
                            m11427(i2, c4693, c51712, z);
                        } else if (z2 && !c51712.m11511()) {
                            m11431(i2, c4693, c51712, z);
                        }
                    }
                } else if (i3 == 3 && c51712.f19789 >= 0 && c51712.f19779 >= 0 && ((c51712.f19774 == 8 || (c51712.f19794 == 0 && c51712.f19787 == 0.0f)) && !c51712.m11511() && !c51712.f19781 && z2 && !c51712.m11511())) {
                    m11425(i2, c5171, c4693, c51712, z);
                }
                c = 0;
            }
        }
        if (c5171 instanceof C5180) {
            return;
        }
        HashSet hashSet2 = c5175Mo115102.f19883;
        if (hashSet2 != null && c5175Mo115102.f19882) {
            Iterator it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                C5175 c51758 = (C5175) it2.next();
                C5171 c51713 = c51758.f19886;
                int i4 = i + 1;
                boolean zM114282 = m11428(c51713);
                if (c51713.m11508() && zM114282) {
                    C5177.m11536(c51713, c4693, new C5126());
                }
                C5175 c51759 = c51713.f19788;
                C5175 c517510 = c51713.f19816;
                boolean z3 = (c51758 == c51759 && (c51752 = c517510.f19884) != null && c51752.f19882) || (c51758 == c517510 && (c5175 = c51759.f19884) != null && c5175.f19882);
                int i5 = c51713.f19839[0];
                if (i5 != 3 || zM114282) {
                    if (!c51713.m11508()) {
                        if (c51758 == c51759 && c517510.f19884 == null) {
                            int iM115233 = c51759.m11523() + iM115322;
                            c51713.m11496(iM115233, c51713.m11505() + iM115233);
                            m11427(i4, c4693, c51713, z);
                        } else if (c51758 == c517510 && c51759.f19884 == null) {
                            int iM115234 = iM115322 - c517510.m11523();
                            c51713.m11496(iM115234 - c51713.m11505(), iM115234);
                            m11427(i4, c4693, c51713, z);
                        } else if (z3 && !c51713.m11511()) {
                            m11431(i4, c4693, c51713, z);
                        }
                    }
                } else if (i5 == 3 && c51713.f19789 >= 0 && c51713.f19779 >= 0) {
                    if (c51713.f19774 != 8) {
                        if (c51713.f19794 == 0) {
                            if (c51713.f19787 == 0.0f) {
                            }
                        }
                    }
                    if (!c51713.m11511() && !c51713.f19781 && z3 && !c51713.m11511()) {
                        m11425(i4, c5171, c4693, c51713, z);
                    }
                }
            }
        }
        c5171.f19790 = true;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static boolean m11428(C5171 c5171) {
        int[] iArr = c5171.f19839;
        int i = iArr[0];
        int i2 = iArr[1];
        C5171 c51712 = c5171.f19824;
        C5177 c5177 = c51712 != null ? (C5177) c51712 : null;
        if (c5177 != null) {
            int i3 = c5177.f19839[0];
        }
        if (c5177 != null) {
            int i4 = c5177.f19839[1];
        }
        boolean z = i == 1 || c5171.mo11481() || i == 2 || (i == 3 && c5171.f19794 == 0 && c5171.f19787 == 0.0f && c5171.m11507(0)) || (i == 3 && c5171.f19794 == 1 && c5171.m11478(0, c5171.m11505()));
        boolean z2 = i2 == 1 || c5171.mo11501() || i2 == 2 || (i2 == 3 && c5171.f19820 == 0 && c5171.f19787 == 0.0f && c5171.m11507(1)) || (i2 == 3 && c5171.f19820 == 1 && c5171.m11478(1, c5171.m11490()));
        if (c5171.f19787 <= 0.0f || !(z || z2)) {
            return z && z2;
        }
        return true;
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public static void m11429(int i, C4693 c4693, C5171 c5171) {
        float f = c5171.f19773;
        C5175 c5175 = c5171.f19807;
        int iM11532 = c5175.f19884.m11532();
        C5175 c51752 = c5171.f19838;
        int iM115322 = c51752.f19884.m11532();
        int iM11523 = c5175.m11523() + iM11532;
        int iM115232 = iM115322 - c51752.m11523();
        if (iM11532 == iM115322) {
            f = 0.5f;
        } else {
            iM11532 = iM11523;
            iM115322 = iM115232;
        }
        int iM11490 = c5171.m11490();
        int i2 = (iM115322 - iM11532) - iM11490;
        if (iM11532 > iM115322) {
            i2 = (iM11532 - iM115322) - iM11490;
        }
        int i3 = (int) (i2 > 0 ? (f * i2) + 0.5f : f * i2);
        int i4 = iM11532 + i3;
        int i5 = i4 + iM11490;
        if (iM11532 > iM115322) {
            i4 = iM11532 - i3;
            i5 = i4 - iM11490;
        }
        c5171.m11502(i4, i5);
        m11432(i + 1, c4693, c5171);
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public static void m11430(int i, C5171 c5171, C4693 c4693, C5171 c51712) {
        float f = c51712.f19773;
        C5175 c5175 = c51712.f19807;
        int iM11523 = c5175.m11523() + c5175.f19884.m11532();
        C5175 c51752 = c51712.f19838;
        int iM11532 = c51752.f19884.m11532() - c51752.m11523();
        if (iM11532 >= iM11523) {
            int iM11490 = c51712.m11490();
            if (c51712.f19774 != 8) {
                int i2 = c51712.f19820;
                if (i2 == 2) {
                    iM11490 = (int) (f * 0.5f * (c5171 instanceof C5177 ? c5171.m11490() : c5171.f19824.m11490()));
                } else if (i2 == 0) {
                    iM11490 = iM11532 - iM11523;
                }
                iM11490 = Math.max(c51712.f19835, iM11490);
                int i3 = c51712.f19805;
                if (i3 > 0) {
                    iM11490 = Math.min(i3, iM11490);
                }
            }
            int i4 = iM11523 + ((int) ((f * ((iM11532 - iM11523) - iM11490)) + 0.5f));
            c51712.m11502(i4, iM11490 + i4);
            m11432(i + 1, c4693, c51712);
        }
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static void m11431(int i, C4693 c4693, C5171 c5171, boolean z) {
        float f = c5171.f19806;
        C5175 c5175 = c5171.f19788;
        int iM11532 = c5175.f19884.m11532();
        C5175 c51752 = c5171.f19816;
        int iM115322 = c51752.f19884.m11532();
        int iM11523 = c5175.m11523() + iM11532;
        int iM115232 = iM115322 - c51752.m11523();
        if (iM11532 == iM115322) {
            f = 0.5f;
        } else {
            iM11532 = iM11523;
            iM115322 = iM115232;
        }
        int iM11505 = c5171.m11505();
        int i2 = (iM115322 - iM11532) - iM11505;
        if (iM11532 > iM115322) {
            i2 = (iM11532 - iM115322) - iM11505;
        }
        int i3 = ((int) (i2 > 0 ? (f * i2) + 0.5f : f * i2)) + iM11532;
        int i4 = i3 + iM11505;
        if (iM11532 > iM115322) {
            i4 = i3 - iM11505;
        }
        c5171.m11496(i3, i4);
        m11427(i + 1, c4693, c5171, z);
    }

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public static void m11432(int i, C4693 c4693, C5171 c5171) {
        C5175 c5175;
        C5175 c51752;
        C5175 c51753;
        C5175 c51754;
        C5175 c51755;
        if (c5171.f19817) {
            return;
        }
        if (!(c5171 instanceof C5177) && c5171.m11508() && m11428(c5171)) {
            C5177.m11536(c5171, c4693, new C5126());
        }
        C5175 c5175Mo11510 = c5171.mo11510(3);
        C5175 c5175Mo115102 = c5171.mo11510(5);
        int iM11532 = c5175Mo11510.m11532();
        int iM115322 = c5175Mo115102.m11532();
        HashSet hashSet = c5175Mo11510.f19883;
        if (hashSet != null && c5175Mo11510.f19882) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                C5175 c51756 = (C5175) it.next();
                C5171 c51712 = c51756.f19886;
                int i2 = i + 1;
                boolean zM11428 = m11428(c51712);
                if (c51712.m11508() && zM11428) {
                    C5177.m11536(c51712, c4693, new C5126());
                }
                C5175 c51757 = c51712.f19807;
                C5175 c51758 = c51712.f19838;
                boolean z = (c51756 == c51757 && (c51755 = c51758.f19884) != null && c51755.f19882) || (c51756 == c51758 && (c51754 = c51757.f19884) != null && c51754.f19882);
                int i3 = c51712.f19839[1];
                if (i3 != 3 || zM11428) {
                    if (!c51712.m11508()) {
                        if (c51756 == c51757 && c51758.f19884 == null) {
                            int iM11523 = c51757.m11523() + iM11532;
                            c51712.m11502(iM11523, c51712.m11490() + iM11523);
                            m11432(i2, c4693, c51712);
                        } else if (c51756 == c51758 && c51757.f19884 == null) {
                            int iM115232 = iM11532 - c51758.m11523();
                            c51712.m11502(iM115232 - c51712.m11490(), iM115232);
                            m11432(i2, c4693, c51712);
                        } else if (z && !c51712.m11495()) {
                            m11429(i2, c4693, c51712);
                        }
                    }
                } else if (i3 == 3 && c51712.f19805 >= 0 && c51712.f19835 >= 0 && (c51712.f19774 == 8 || (c51712.f19820 == 0 && c51712.f19787 == 0.0f))) {
                    if (!c51712.m11495() && !c51712.f19781 && z && !c51712.m11495()) {
                        m11430(i2, c5171, c4693, c51712);
                    }
                }
            }
        }
        if (c5171 instanceof C5180) {
            return;
        }
        HashSet hashSet2 = c5175Mo115102.f19883;
        if (hashSet2 != null && c5175Mo115102.f19882) {
            Iterator it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                C5175 c51759 = (C5175) it2.next();
                C5171 c51713 = c51759.f19886;
                int i4 = i + 1;
                boolean zM114282 = m11428(c51713);
                if (c51713.m11508() && zM114282) {
                    C5177.m11536(c51713, c4693, new C5126());
                }
                C5175 c517510 = c51713.f19807;
                C5175 c517511 = c51713.f19838;
                boolean z2 = (c51759 == c517510 && (c51753 = c517511.f19884) != null && c51753.f19882) || (c51759 == c517511 && (c51752 = c517510.f19884) != null && c51752.f19882);
                int i5 = c51713.f19839[1];
                if (i5 != 3 || zM114282) {
                    if (!c51713.m11508()) {
                        if (c51759 == c517510 && c517511.f19884 == null) {
                            int iM115233 = c517510.m11523() + iM115322;
                            c51713.m11502(iM115233, c51713.m11490() + iM115233);
                            m11432(i4, c4693, c51713);
                        } else if (c51759 == c517511 && c517510.f19884 == null) {
                            int iM115234 = iM115322 - c517511.m11523();
                            c51713.m11502(iM115234 - c51713.m11490(), iM115234);
                            m11432(i4, c4693, c51713);
                        } else if (z2 && !c51713.m11495()) {
                            m11429(i4, c4693, c51713);
                        }
                    }
                } else if (i5 == 3 && c51713.f19805 >= 0 && c51713.f19835 >= 0) {
                    if (c51713.f19774 != 8) {
                        if (c51713.f19820 == 0) {
                            if (c51713.f19787 == 0.0f) {
                            }
                        }
                    }
                    if (!c51713.m11495() && !c51713.f19781 && z2 && !c51713.m11495()) {
                        m11430(i4, c5171, c4693, c51713);
                    }
                }
            }
        }
        C5175 c5175Mo115103 = c5171.mo11510(6);
        if (c5175Mo115103.f19883 != null && c5175Mo115103.f19882) {
            int iM115323 = c5175Mo115103.m11532();
            Iterator it3 = c5175Mo115103.f19883.iterator();
            while (it3.hasNext()) {
                C5175 c517512 = (C5175) it3.next();
                C5171 c51714 = c517512.f19886;
                int i6 = i + 1;
                boolean zM114283 = m11428(c51714);
                if (c51714.m11508() && zM114283) {
                    C5177.m11536(c51714, c4693, new C5126());
                }
                if (c51714.f19839[1] != 3 || zM114283) {
                    if (!c51714.m11508() && c517512 == (c5175 = c51714.f19776)) {
                        int iM115235 = c517512.m11523() + iM115323;
                        if (c51714.f19814) {
                            int i7 = iM115235 - c51714.f19785;
                            int i8 = c51714.f19837 + i7;
                            c51714.f19778 = i7;
                            c51714.f19807.m11525(i7);
                            c51714.f19838.m11525(i8);
                            c5175.m11525(iM115235);
                            c51714.f19786 = true;
                        }
                        m11432(i6, c4693, c51714);
                    }
                }
            }
        }
        c5171.f19817 = true;
    }
}
