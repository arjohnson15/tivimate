package p197;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import p080.AbstractC1702;
import p200.C2755;
import ـˈ.ˉᵎ;
import ᵎﹳ.ᐧʻ;

/* renamed from: ˎˑ.ˋⁱ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2718 extends AbstractC2726 implements InterfaceC2725 {

    /* renamed from: ˋﾞ, reason: contains not printable characters */
    public static final C2733 f10633 = new C2733();

    /* renamed from: ʻʿ, reason: contains not printable characters */
    public boolean f10634;

    /* renamed from: ʾʼ, reason: contains not printable characters */
    public long f10635;

    /* renamed from: ˊᵔ, reason: contains not printable characters */
    public AbstractC2727 f10637;

    /* renamed from: ˎᵔ, reason: contains not printable characters */
    public int f10639;

    /* renamed from: ˑⁱ, reason: contains not printable characters */
    public long f10640;

    /* renamed from: ˑﾞ, reason: contains not printable characters */
    public C2729 f10641;

    /* renamed from: ᴵʼ, reason: contains not printable characters */
    public C2734 f10644;

    /* renamed from: ᵔ, reason: contains not printable characters */
    public boolean f10645;

    /* renamed from: ᵔٴ, reason: contains not printable characters */
    public C2716 f10646;

    /* renamed from: ᵔﹳ, reason: contains not printable characters */
    public boolean f10647;

    /* renamed from: ᵢٴ, reason: contains not printable characters */
    public long f10649;

    /* renamed from: ﾞˎ, reason: contains not printable characters */
    public long f10651;

    /* renamed from: ﾞᐧ, reason: contains not printable characters */
    public C2720 f10652;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public ArrayList f10643 = new ArrayList();

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public C2755 f10636 = new C2755(0);

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public ArrayList f10648 = new ArrayList();

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public ArrayList f10650 = new ArrayList();

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public boolean f10638 = false;

    /* renamed from: ـˆ, reason: contains not printable characters */
    public boolean f10642 = false;

    public C2718() {
        C2734 c2734M6939 = C2734.m6939(0.0f, 1.0f);
        c2734M6939.mo6907(0L);
        this.f10644 = c2734M6939;
        C2720 c2720 = new C2720(c2734M6939);
        this.f10652 = c2720;
        this.f10635 = -1L;
        this.f10641 = null;
        this.f10640 = 0L;
        this.f10649 = -1L;
        this.f10639 = -1;
        this.f10647 = false;
        this.f10634 = true;
        this.f10646 = new C2716(this);
        this.f10645 = false;
        this.f10651 = -1L;
        this.f10637 = new C2722(this, 0);
        this.f10636.put(c2734M6939, c2720);
        this.f10650.add(this.f10652);
    }

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public static boolean m6884(C2718 c2718) {
        c2718.getClass();
        for (int i = 0; i < c2718.m6889().size(); i++) {
            AbstractC2726 abstractC2726 = (AbstractC2726) c2718.m6889().get(i);
            if (!(abstractC2726 instanceof C2718) || !m6884((C2718) abstractC2726)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: ﹳˑ, reason: contains not printable characters */
    public static void m6885(C2720 c2720, ArrayList arrayList) {
        if (arrayList.contains(c2720)) {
            return;
        }
        arrayList.add(c2720);
        if (c2720.f10661 == null) {
            return;
        }
        for (int i = 0; i < c2720.f10661.size(); i++) {
            m6885((C2720) c2720.f10661.get(i), arrayList);
        }
    }

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public static void m6886(long j, C2720 c2720) {
        if (c2720.f10659) {
            return;
        }
        c2720.f10659 = c2720.f10662.mo6897((long) (j * 1.0f));
    }

    @Override // p197.AbstractC2726
    public final void cancel() {
        if (Looper.myLooper() == null) {
            throw new AndroidRuntimeException("Animators may only be run on Looper threads");
        }
        if (this.f10642) {
            ArrayList arrayList = this.f10677;
            if (arrayList != null) {
                ArrayList arrayList2 = (ArrayList) arrayList.clone();
                int size = arrayList2.size();
                for (int i = 0; i < size; i++) {
                    ((InterfaceC2732) arrayList2.get(i)).mo6932();
                }
            }
            ArrayList arrayList3 = new ArrayList(this.f10643);
            int size2 = arrayList3.size();
            for (int i2 = 0; i2 < size2; i2++) {
                ((C2720) arrayList3.get(i2)).f10662.cancel();
            }
            this.f10643.clear();
            m6911();
        }
    }

    public final String toString() {
        String string = "AnimatorSet@" + Integer.toHexString(hashCode()) + "{";
        int size = this.f10650.size();
        for (int i = 0; i < size; i++) {
            C2720 c2720 = (C2720) this.f10650.get(i);
            StringBuilder sbM5409 = AbstractC1702.m5409(string, "\n    ");
            sbM5409.append(c2720.f10662.toString());
            string = sbM5409.toString();
        }
        return ᐧʻ.ˉⁱ(string, "\n}");
    }

    @Override // p197.AbstractC2726
    /* renamed from: ʿˏ, reason: contains not printable characters */
    public final void mo6887(boolean z) {
        m6892(z, false);
    }

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final long m6888(long j, C2720 c2720) {
        long jMo6891;
        if (this.f10647) {
            jMo6891 = mo6891() - j;
            j = c2720.f10660;
        } else {
            jMo6891 = c2720.f10658;
        }
        return j - jMo6891;
    }

    /* renamed from: ˈٴ, reason: contains not printable characters */
    public final ArrayList m6889() {
        ArrayList arrayList = new ArrayList();
        int size = this.f10650.size();
        for (int i = 0; i < size; i++) {
            C2720 c2720 = (C2720) this.f10650.get(i);
            if (c2720 != this.f10652) {
                arrayList.add(c2720.f10662);
            }
        }
        return arrayList;
    }

    @Override // p197.AbstractC2726
    /* renamed from: ˉי, reason: contains not printable characters */
    public final void mo6890() {
        if (Looper.myLooper() == null) {
            throw new AndroidRuntimeException("Animators may only be run on Looper threads");
        }
        if (this.f10642) {
            if (this.f10647) {
                int size = this.f10639;
                if (size == -1) {
                    size = this.f10648.size();
                }
                this.f10639 = size;
                while (true) {
                    int i = this.f10639;
                    if (i <= 0) {
                        break;
                    }
                    int i2 = i - 1;
                    this.f10639 = i2;
                    C2715 c2715 = (C2715) this.f10648.get(i2);
                    AbstractC2726 abstractC2726 = c2715.f10629.f10662;
                    if (!((C2720) this.f10636.get(abstractC2726)).f10659) {
                        int i3 = c2715.f10628;
                        if (i3 == 2) {
                            abstractC2726.mo6899();
                        } else if (i3 == 1 && abstractC2726.mo6905()) {
                            abstractC2726.mo6890();
                        }
                    }
                }
            } else {
                while (this.f10639 < this.f10648.size() - 1) {
                    int i4 = this.f10639 + 1;
                    this.f10639 = i4;
                    C2715 c27152 = (C2715) this.f10648.get(i4);
                    AbstractC2726 abstractC27262 = c27152.f10629.f10662;
                    if (!((C2720) this.f10636.get(abstractC27262)).f10659) {
                        int i5 = c27152.f10628;
                        if (i5 == 0) {
                            abstractC27262.mo6909();
                        } else if (i5 == 2 && abstractC27262.mo6905()) {
                            abstractC27262.mo6890();
                        }
                    }
                }
            }
            this.f10643.clear();
        }
        m6911();
    }

    @Override // p197.AbstractC2726
    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public final long mo6891() {
        m6901();
        m6912();
        return this.f10640;
    }

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public final void m6892(boolean z, boolean z2) {
        if (Looper.myLooper() == null) {
            throw new AndroidRuntimeException("Animators may only be run on Looper threads");
        }
        this.f10642 = true;
        this.f10634 = z2;
        this.f10651 = -1L;
        int size = this.f10650.size();
        for (int i = 0; i < size; i++) {
            ((C2720) this.f10650.get(i)).f10659 = false;
        }
        m6902();
        if (z && mo6891() == -1) {
            throw new UnsupportedOperationException("Cannot reverse infinite AnimatorSet");
        }
        this.f10647 = z;
        boolean zM6884 = m6884(this);
        if (!zM6884) {
            for (int i2 = 1; i2 < this.f10650.size(); i2++) {
                ((C2720) this.f10650.get(i2)).f10662.m6928(this.f10637);
            }
            C2716 c2716 = this.f10646;
            C2718 c2718 = c2716.f10631;
            long j = 0;
            if ((c2718.f10647 ? c2718.mo6891() - c2716.f10632 : c2716.f10632) == 0 && this.f10647) {
                C2716 c27162 = this.f10646;
                c27162.f10632 = -1L;
                c27162.f10630 = false;
            }
            if (mo6894()) {
                mo6906(!this.f10647);
            } else if (this.f10647) {
                if (!mo6894()) {
                    this.f10645 = true;
                    mo6906(false);
                }
                mo6906(!this.f10647);
            } else {
                for (int size2 = this.f10648.size() - 1; size2 >= 0; size2--) {
                    if (((C2715) this.f10648.get(size2)).f10628 == 1) {
                        AbstractC2726 abstractC2726 = ((C2715) this.f10648.get(size2)).f10629.f10662;
                        if (abstractC2726.mo6894()) {
                            abstractC2726.mo6906(true);
                        }
                    }
                }
            }
            C2716 c27163 = this.f10646;
            if (c27163.f10632 != -1) {
                c27163.m6882(this.f10647);
                j = this.f10646.f10632;
            }
            int iM6900 = m6900(j);
            m6895(-1, j, iM6900);
            for (int size3 = this.f10643.size() - 1; size3 >= 0; size3--) {
                if (((C2720) this.f10643.get(size3)).f10659) {
                    this.f10643.remove(size3);
                }
            }
            this.f10639 = iM6900;
            if (this.f10634) {
                AbstractC2726.m6927(this);
            }
        }
        ArrayList arrayList = this.f10677;
        if (arrayList != null) {
            ArrayList arrayList2 = (ArrayList) arrayList.clone();
            int size4 = arrayList2.size();
            for (int i3 = 0; i3 < size4; i3++) {
                ((InterfaceC2732) arrayList2.get(i3)).mo6933(this);
            }
        }
        if (zM6884) {
            mo6890();
        }
    }

    @Override // p197.AbstractC2726
    /* renamed from: ˋˊ, reason: contains not printable characters and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final C2718 mo6910() {
        C2718 c2718 = (C2718) super.mo6910();
        int size = this.f10650.size();
        c2718.f10642 = false;
        c2718.f10649 = -1L;
        c2718.f10639 = -1;
        c2718.f10651 = -1L;
        c2718.f10646 = new C2716(this);
        c2718.f10634 = true;
        c2718.f10643 = new ArrayList();
        c2718.f10636 = new C2755(0);
        c2718.f10650 = new ArrayList(size);
        c2718.f10648 = new ArrayList();
        c2718.f10637 = new C2722(c2718, 1);
        c2718.f10647 = false;
        c2718.f10638 = true;
        HashMap map = new HashMap(size);
        for (int i = 0; i < size; i++) {
            C2720 c2720 = (C2720) this.f10650.get(i);
            C2720 c2720Clone = c2720.clone();
            AbstractC2726 abstractC2726 = c2720Clone.f10662;
            AbstractC2727 abstractC2727 = this.f10637;
            ArrayList arrayList = abstractC2726.f10677;
            if (arrayList != null) {
                arrayList.remove(abstractC2727);
                if (abstractC2726.f10677.size() == 0) {
                    abstractC2726.f10677 = null;
                }
            }
            map.put(c2720, c2720Clone);
            c2718.f10650.add(c2720Clone);
            c2718.f10636.put(c2720Clone.f10662, c2720Clone);
        }
        C2720 c27202 = (C2720) map.get(this.f10652);
        c2718.f10652 = c27202;
        c2718.f10644 = (C2734) c27202.f10662;
        for (int i2 = 0; i2 < size; i2++) {
            C2720 c27203 = (C2720) this.f10650.get(i2);
            C2720 c27204 = (C2720) map.get(c27203);
            C2720 c27205 = c27203.f10664;
            c27204.f10664 = c27205 == null ? null : (C2720) map.get(c27205);
            ArrayList arrayList2 = c27203.f10656;
            int size2 = arrayList2 == null ? 0 : arrayList2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                c27204.f10656.set(i3, (C2720) map.get(c27203.f10656.get(i3)));
            }
            ArrayList arrayList3 = c27203.f10661;
            int size3 = arrayList3 == null ? 0 : arrayList3.size();
            for (int i4 = 0; i4 < size3; i4++) {
                c27204.f10661.set(i4, (C2720) map.get(c27203.f10661.get(i4)));
            }
            ArrayList arrayList4 = c27203.f10657;
            int size4 = arrayList4 == null ? 0 : arrayList4.size();
            for (int i5 = 0; i5 < size4; i5++) {
                c27204.f10657.set(i5, (C2720) map.get(c27203.f10657.get(i5)));
            }
        }
        return c2718;
    }

    @Override // p197.AbstractC2726
    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public final boolean mo6894() {
        boolean z = true;
        if (this.f10645) {
            return true;
        }
        int i = 0;
        while (true) {
            if (i >= this.f10650.size()) {
                break;
            }
            if (!((C2720) this.f10650.get(i)).f10662.mo6894()) {
                z = false;
                break;
            }
            i++;
        }
        this.f10645 = z;
        return z;
    }

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final void m6895(int i, long j, int i2) {
        if (!this.f10647) {
            for (int i3 = i + 1; i3 <= i2; i3++) {
                C2715 c2715 = (C2715) this.f10648.get(i3);
                C2720 c2720 = c2715.f10629;
                int i4 = c2715.f10628;
                if (i4 == 0) {
                    this.f10643.add(c2720);
                    if (c2720.f10662.mo6905()) {
                        c2720.f10662.cancel();
                    }
                    c2720.f10659 = false;
                    c2720.f10662.mo6887(false);
                    m6886(0L, c2720);
                } else if (i4 == 2 && !c2720.f10659) {
                    m6886(m6888(j, c2720), c2720);
                }
            }
            return;
        }
        if (i == -1) {
            i = this.f10648.size();
        }
        for (int i5 = i - 1; i5 >= i2; i5--) {
            C2715 c27152 = (C2715) this.f10648.get(i5);
            C2720 c27202 = c27152.f10629;
            int i6 = c27152.f10628;
            if (i6 == 2) {
                if (c27202.f10662.mo6905()) {
                    c27202.f10662.cancel();
                }
                c27202.f10659 = false;
                this.f10643.add(c27152.f10629);
                c27202.f10662.mo6887(true);
                m6886(0L, c27202);
            } else if (i6 == 1 && !c27202.f10659) {
                m6886(m6888(j, c27202), c27202);
            }
        }
    }

    @Override // p197.AbstractC2726
    /* renamed from: ˎٴ, reason: contains not printable characters */
    public final void mo6896(C2729 c2729) {
        this.f10641 = c2729;
    }

    @Override // p197.AbstractC2726
    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public final boolean mo6897(long j) {
        return mo6898(j);
    }

    @Override // p197.InterfaceC2725
    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final boolean mo6898(long j) {
        if (this.f10649 < 0) {
            this.f10649 = j;
        }
        long j2 = this.f10651;
        if (j2 > 0) {
            this.f10649 = (j - j2) + this.f10649;
            this.f10651 = -1L;
        }
        C2716 c2716 = this.f10646;
        if (c2716.f10632 != -1) {
            c2716.m6882(this.f10647);
            boolean z = this.f10647;
            if (z) {
                this.f10649 = j - ((long) (this.f10646.f10632 * 1.0f));
            } else {
                this.f10649 = j - ((long) (this.f10646.f10632 * 1.0f));
            }
            mo6906(!z);
            this.f10643.clear();
            for (int size = this.f10650.size() - 1; size >= 0; size--) {
                ((C2720) this.f10650.get(size)).f10659 = false;
            }
            this.f10639 = -1;
            C2716 c27162 = this.f10646;
            c27162.f10632 = -1L;
            c27162.f10630 = false;
        }
        if (!this.f10647 && j < this.f10649 + ((long) (0 * 1.0f))) {
            return false;
        }
        long j3 = (long) ((j - this.f10649) / 1.0f);
        int iM6900 = m6900(j3);
        m6895(this.f10639, j3, iM6900);
        this.f10639 = iM6900;
        for (int i = 0; i < this.f10643.size(); i++) {
            C2720 c2720 = (C2720) this.f10643.get(i);
            if (!c2720.f10659) {
                m6886(m6888(j3, c2720), c2720);
            }
        }
        for (int size2 = this.f10643.size() - 1; size2 >= 0; size2--) {
            if (((C2720) this.f10643.get(size2)).f10659) {
                this.f10643.remove(size2);
            }
        }
        boolean z2 = !this.f10647 ? !(this.f10643.isEmpty() && this.f10639 == this.f10648.size() - 1) : !(this.f10643.size() == 1 && this.f10643.get(0) == this.f10652) && (!this.f10643.isEmpty() || this.f10639 >= 3);
        if (this.f10676 != null) {
            for (int i2 = 0; i2 < this.f10676.size(); i2++) {
                ((InterfaceC2713) this.f10676.get(i2)).m6875(this);
            }
        }
        if (!z2) {
            return false;
        }
        m6911();
        return true;
    }

    @Override // p197.AbstractC2726
    /* renamed from: ˑי, reason: contains not printable characters */
    public final void mo6899() {
        m6892(true, true);
    }

    /* renamed from: יʻ, reason: contains not printable characters */
    public final int m6900(long j) {
        int size = this.f10648.size();
        int i = this.f10639;
        if (this.f10647) {
            long jMo6891 = mo6891() - j;
            int i2 = this.f10639;
            if (i2 != -1) {
                size = i2;
            }
            this.f10639 = size;
            for (int i3 = size - 1; i3 >= 0; i3--) {
                if (((C2715) this.f10648.get(i3)).m6881() >= jMo6891) {
                    i = i3;
                }
            }
        } else {
            for (int i4 = i + 1; i4 < size; i4++) {
                C2715 c2715 = (C2715) this.f10648.get(i4);
                if (c2715.m6881() != -1 && c2715.m6881() <= j) {
                    i = i4;
                }
            }
        }
        return i;
    }

    /* renamed from: ـˆ, reason: contains not printable characters */
    public final void m6901() {
        if (this.f10635 >= 0) {
            int size = this.f10650.size();
            for (int i = 0; i < size; i++) {
                ((C2720) this.f10650.get(i)).f10662.mo6907(this.f10635);
            }
        }
        this.f10644.mo6907(0L);
    }

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final void m6902() {
        if (this.f10641 != null) {
            for (int i = 0; i < this.f10650.size(); i++) {
                ((C2720) this.f10650.get(i)).f10662.mo6896(this.f10641);
            }
        }
        m6901();
        m6912();
    }

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final C2720 m6903(AbstractC2726 abstractC2726) {
        C2720 c2720 = (C2720) this.f10636.get(abstractC2726);
        if (c2720 == null) {
            c2720 = new C2720(abstractC2726);
            this.f10636.put(abstractC2726, c2720);
            this.f10650.add(c2720);
            if (abstractC2726 instanceof C2718) {
                ((C2718) abstractC2726).f10634 = false;
            }
        }
        return c2720;
    }

    /* renamed from: ᴵʼ, reason: contains not printable characters */
    public final void m6904(C2720 c2720, ArrayList arrayList) {
        int i = 0;
        if (c2720.f10656 == null) {
            if (c2720 == this.f10652) {
                while (i < this.f10650.size()) {
                    C2720 c27202 = (C2720) this.f10650.get(i);
                    if (c27202 != this.f10652) {
                        c27202.f10658 = -1L;
                        c27202.f10660 = -1L;
                    }
                    i++;
                }
                return;
            }
            return;
        }
        arrayList.add(c2720);
        int size = c2720.f10656.size();
        while (i < size) {
            C2720 c27203 = (C2720) c2720.f10656.get(i);
            c27203.f10663 = c27203.f10662.mo6891();
            int iIndexOf = arrayList.indexOf(c27203);
            if (iIndexOf >= 0) {
                while (iIndexOf < arrayList.size()) {
                    ((C2720) arrayList.get(iIndexOf)).f10664 = null;
                    ((C2720) arrayList.get(iIndexOf)).f10658 = -1L;
                    ((C2720) arrayList.get(iIndexOf)).f10660 = -1L;
                    iIndexOf++;
                }
                c27203.f10658 = -1L;
                c27203.f10660 = -1L;
                c27203.f10664 = null;
                String str = "Cycle found in AnimatorSet: " + this;
            } else {
                long j = c27203.f10658;
                if (j != -1) {
                    long j2 = c2720.f10660;
                    if (j2 == -1) {
                        c27203.f10664 = c2720;
                        c27203.f10658 = -1L;
                        c27203.f10660 = -1L;
                    } else {
                        if (j2 >= j) {
                            c27203.f10664 = c2720;
                            c27203.f10658 = j2;
                        }
                        long j3 = c27203.f10663;
                        c27203.f10660 = j3 == -1 ? -1L : c27203.f10658 + j3;
                    }
                }
                m6904(c27203, arrayList);
            }
            i++;
        }
        arrayList.remove(c2720);
    }

    @Override // p197.AbstractC2726
    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public final boolean mo6905() {
        return this.f10642;
    }

    @Override // p197.AbstractC2726
    /* renamed from: ᵎˏ, reason: contains not printable characters */
    public final void mo6906(boolean z) {
        if (this.f10634 && !mo6894()) {
            throw new UnsupportedOperationException("Children must be initialized.");
        }
        m6902();
        if (z) {
            for (int size = this.f10648.size() - 1; size >= 0; size--) {
                if (((C2715) this.f10648.get(size)).f10628 == 1) {
                    ((C2715) this.f10648.get(size)).f10629.f10662.mo6906(true);
                }
            }
            return;
        }
        for (int i = 0; i < this.f10648.size(); i++) {
            if (((C2715) this.f10648.get(i)).f10628 == 2) {
                ((C2715) this.f10648.get(i)).f10629.f10662.mo6906(false);
            }
        }
    }

    @Override // p197.AbstractC2726
    /* renamed from: ᵎـ, reason: contains not printable characters */
    public final AbstractC2726 mo6907(long j) {
        if (j < 0) {
            throw new IllegalArgumentException("duration must be a value of zero or greater");
        }
        this.f10638 = true;
        this.f10635 = j;
        return this;
    }

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final void m6908(AbstractC2726... abstractC2726Arr) {
        AbstractC2726 abstractC2726 = abstractC2726Arr[0];
        this.f10638 = true;
        C2720 c2720M6903 = m6903(abstractC2726);
        for (int i = 1; i < abstractC2726Arr.length; i++) {
            c2720M6903.m6923(m6903(abstractC2726Arr[i]));
        }
    }

    @Override // p197.AbstractC2726
    /* renamed from: ﹳˎ, reason: contains not printable characters */
    public final void mo6909() {
        m6892(false, true);
    }

    /* renamed from: ﾞʽ, reason: contains not printable characters */
    public final void m6911() {
        C2723 c2723M6926;
        ArrayList arrayList;
        int iIndexOf;
        this.f10642 = false;
        this.f10649 = -1L;
        this.f10639 = -1;
        this.f10651 = -1L;
        C2716 c2716 = this.f10646;
        c2716.f10632 = -1L;
        c2716.f10630 = false;
        this.f10643.clear();
        if (this.f10634 && (iIndexOf = (arrayList = (c2723M6926 = C2723.m6926()).f10672).indexOf(this)) >= 0) {
            arrayList.set(iIndexOf, null);
            c2723M6926.f10673 = true;
        }
        ArrayList arrayList2 = this.f10677;
        if (arrayList2 != null) {
            ArrayList arrayList3 = (ArrayList) arrayList2.clone();
            int size = arrayList3.size();
            for (int i = 0; i < size; i++) {
                ((InterfaceC2732) arrayList3.get(i)).mo6931(this);
            }
        }
        for (int i2 = 1; i2 < this.f10650.size(); i2++) {
            AbstractC2726 abstractC2726 = ((C2720) this.f10650.get(i2)).f10662;
            AbstractC2727 abstractC2727 = this.f10637;
            ArrayList arrayList4 = abstractC2726.f10677;
            if (arrayList4 != null) {
                arrayList4.remove(abstractC2727);
                if (abstractC2726.f10677.size() == 0) {
                    abstractC2726.f10677 = null;
                }
            }
        }
        this.f10634 = true;
        this.f10647 = false;
    }

    /* renamed from: ﾞˊ, reason: contains not printable characters */
    public final void m6912() {
        boolean z;
        if (!this.f10638) {
            for (int i = 0; i < this.f10650.size(); i++) {
                if (((C2720) this.f10650.get(i)).f10663 == ((C2720) this.f10650.get(i)).f10662.mo6891()) {
                }
            }
            return;
        }
        this.f10638 = false;
        int size = this.f10650.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((C2720) this.f10650.get(i2)).f10665 = false;
        }
        for (int i3 = 0; i3 < size; i3++) {
            C2720 c2720 = (C2720) this.f10650.get(i3);
            if (!c2720.f10665) {
                c2720.f10665 = true;
                ArrayList arrayList = c2720.f10661;
                if (arrayList != null) {
                    m6885(c2720, arrayList);
                    c2720.f10661.remove(c2720);
                    int size2 = c2720.f10661.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        ArrayList arrayList2 = ((C2720) c2720.f10661.get(i4)).f10657;
                        if (arrayList2 != null) {
                            int size3 = arrayList2.size();
                            for (int i5 = 0; i5 < size3; i5++) {
                                c2720.m6921((C2720) arrayList2.get(i5));
                            }
                        }
                    }
                    for (int i6 = 0; i6 < size2; i6++) {
                        C2720 c27202 = (C2720) c2720.f10661.get(i6);
                        ArrayList arrayList3 = c2720.f10657;
                        c27202.getClass();
                        if (arrayList3 != null) {
                            int size4 = arrayList3.size();
                            for (int i7 = 0; i7 < size4; i7++) {
                                c27202.m6921((C2720) arrayList3.get(i7));
                            }
                        }
                        c27202.f10665 = true;
                    }
                }
            }
        }
        for (int i8 = 0; i8 < size; i8++) {
            C2720 c27203 = (C2720) this.f10650.get(i8);
            C2720 c27204 = this.f10652;
            if (c27203 != c27204 && c27203.f10657 == null) {
                c27203.m6921(c27204);
            }
        }
        ArrayList arrayList4 = new ArrayList(this.f10650.size());
        C2720 c27205 = this.f10652;
        c27205.f10658 = 0L;
        c27205.f10660 = this.f10644.f10692;
        m6904(c27205, arrayList4);
        this.f10648.clear();
        for (int i9 = 1; i9 < this.f10650.size(); i9++) {
            C2720 c27206 = (C2720) this.f10650.get(i9);
            this.f10648.add(new C2715(c27206, 0));
            this.f10648.add(new C2715(c27206, 1));
            this.f10648.add(new C2715(c27206, 2));
        }
        Collections.sort(this.f10648, f10633);
        int size5 = this.f10648.size();
        int i10 = 0;
        while (i10 < size5) {
            C2715 c2715 = (C2715) this.f10648.get(i10);
            if (c2715.f10628 == 2) {
                C2720 c27207 = c2715.f10629;
                long j = c27207.f10658;
                long j2 = c27207.f10660;
                if (j == j2) {
                    z = true;
                } else {
                    c27207.f10662.getClass();
                    if (j2 == j) {
                        z = false;
                    }
                }
                int i11 = i10 + 1;
                int i12 = size5;
                int i13 = i12;
                for (int i14 = i11; i14 < size5 && (i12 >= size5 || i13 >= size5); i14++) {
                    if (((C2715) this.f10648.get(i14)).f10629 == c27207) {
                        if (((C2715) this.f10648.get(i14)).f10628 == 0) {
                            i12 = i14;
                        } else if (((C2715) this.f10648.get(i14)).f10628 == 1) {
                            i13 = i14;
                        }
                    }
                }
                if (z && i12 == this.f10648.size()) {
                    throw new UnsupportedOperationException("Something went wrong, no start isfound after stop for an animation that has the same start and endtime.");
                }
                if (i13 == this.f10648.size()) {
                    throw new UnsupportedOperationException("Something went wrong, no startdelay end is found after stop for an animation");
                }
                if (z) {
                    this.f10648.add(i10, (C2715) this.f10648.remove(i12));
                    i10 = i11;
                }
                this.f10648.add(i10, (C2715) this.f10648.remove(i13));
                i10 += 2;
            }
            i10++;
        }
        if (!this.f10648.isEmpty() && ((C2715) this.f10648.get(0)).f10628 != 0) {
            throw new UnsupportedOperationException("Sorting went bad, the start event should always be at index 0");
        }
        this.f10648.add(0, new C2715(this.f10652, 0));
        this.f10648.add(1, new C2715(this.f10652, 1));
        this.f10648.add(2, new C2715(this.f10652, 2));
        if (((C2715) ˉᵎ.ﹶˆ(1, this.f10648)).f10628 == 0 || ((C2715) ˉᵎ.ﹶˆ(1, this.f10648)).f10628 == 1) {
            throw new UnsupportedOperationException("Something went wrong, the last event is not an end event");
        }
        this.f10640 = ((C2715) ˉᵎ.ﹶˆ(1, this.f10648)).m6881();
    }
}
