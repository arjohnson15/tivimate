package p197;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import android.view.animation.AnimationUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import p080.AbstractC1702;
import ˆʽ.ᵎˏ;
import ᵎﹳ.ᐧʻ;

/* renamed from: ˎˑ.ﾞˊ, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C2734 extends AbstractC2726 implements InterfaceC2725 {

    /* renamed from: ˊᵔ, reason: contains not printable characters */
    public static final C2728 f10686 = new C2728(2);

    /* renamed from: ᵔ, reason: contains not printable characters */
    public C2714[] f10697;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public boolean f10700;

    /* renamed from: ﾞˎ, reason: contains not printable characters */
    public HashMap f10703;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public long f10695 = -1;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public float f10689 = -1.0f;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public float f10702 = 0.0f;

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public long f10690 = -1;

    /* renamed from: ـˆ, reason: contains not printable characters */
    public boolean f10694 = false;

    /* renamed from: ᴵʼ, reason: contains not printable characters */
    public boolean f10696 = false;

    /* renamed from: ﾞᐧ, reason: contains not printable characters */
    public boolean f10704 = false;

    /* renamed from: ʾʼ, reason: contains not printable characters */
    public boolean f10688 = false;

    /* renamed from: ˑﾞ, reason: contains not printable characters */
    public boolean f10693 = false;

    /* renamed from: ˑⁱ, reason: contains not printable characters */
    public long f10692 = 300;

    /* renamed from: ᵢٴ, reason: contains not printable characters */
    public int f10701 = 0;

    /* renamed from: ˎᵔ, reason: contains not printable characters */
    public int f10691 = 1;

    /* renamed from: ᵔﹳ, reason: contains not printable characters */
    public boolean f10699 = true;

    /* renamed from: ʻʿ, reason: contains not printable characters */
    public boolean f10687 = false;

    /* renamed from: ᵔٴ, reason: contains not printable characters */
    public InterfaceC2724 f10698 = f10686;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public static C2734 m6939(float... fArr) {
        C2734 c2734 = new C2734();
        c2734.mo6919(fArr);
        return c2734;
    }

    @Override // p197.AbstractC2726
    public final void cancel() {
        if (Looper.myLooper() == null) {
            throw new AndroidRuntimeException("Animators may only be run on Looper threads");
        }
        if (this.f10693) {
            return;
        }
        if ((this.f10696 || this.f10694) && this.f10677 != null) {
            if (!this.f10694) {
                m6940();
            }
            Iterator it = ((ArrayList) this.f10677.clone()).iterator();
            while (it.hasNext()) {
                ((InterfaceC2732) it.next()).mo6932();
            }
        }
        m6943();
    }

    public String toString() {
        String string = "ValueAnimator@" + Integer.toHexString(hashCode());
        if (this.f10697 != null) {
            for (int i = 0; i < this.f10697.length; i++) {
                StringBuilder sbM5409 = AbstractC1702.m5409(string, "\n    ");
                sbM5409.append(this.f10697[i].toString());
                string = sbM5409.toString();
            }
        }
        return string;
    }

    @Override // p197.AbstractC2726
    /* renamed from: ʿˏ */
    public final void mo6887(boolean z) {
        this.f10687 = true;
        if (z) {
            mo6899();
        } else {
            mo6909();
        }
        this.f10687 = false;
    }

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final void m6940() {
        ArrayList arrayList = this.f10677;
        if (arrayList != null && !this.f10704) {
            ArrayList arrayList2 = (ArrayList) arrayList.clone();
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                ((InterfaceC2732) arrayList2.get(i)).mo6933(this);
            }
        }
        this.f10704 = true;
    }

    @Override // p197.AbstractC2726
    /* renamed from: ˆᵔ, reason: merged with bridge method [inline-methods] */
    public C2734 mo6907(long j) {
        if (j < 0) {
            throw new IllegalArgumentException(ᵎˏ.ˏᴵ("Animators cannot have negative duration: ", j));
        }
        this.f10692 = j;
        return this;
    }

    /* renamed from: ˈٴ, reason: contains not printable characters */
    public final float m6941(float f, boolean z) {
        float fM6949 = m6949(f);
        float fM69492 = m6949(fM6949);
        double d = fM69492;
        double dFloor = Math.floor(d);
        if (d == dFloor && fM69492 > 0.0f) {
            dFloor -= 1.0d;
        }
        int i = (int) dFloor;
        float f2 = fM6949 - i;
        return m6942(i, z) ? 1.0f - f2 : f2;
    }

    @Override // p197.AbstractC2726
    /* renamed from: ˉי */
    public final void mo6890() {
        if (Looper.myLooper() == null) {
            throw new AndroidRuntimeException("Animators may only be run on Looper threads");
        }
        if (!this.f10694) {
            m6946();
            this.f10696 = true;
        } else if (!this.f10688) {
            mo6918();
        }
        mo6916(m6942(this.f10701, this.f10700) ? 0.0f : 1.0f);
        m6943();
    }

    @Override // p197.AbstractC2726
    /* renamed from: ˉⁱ */
    public final long mo6891() {
        if (this.f10701 == -1) {
            return -1L;
        }
        return this.f10692 * (r0 + 1);
    }

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public final boolean m6942(int i, boolean z) {
        if (i > 0 && this.f10691 == 2) {
            int i2 = this.f10701;
            if (i < i2 + 1 || i2 == -1) {
                return z ? i % 2 == 0 : i % 2 != 0;
            }
        }
        return z;
    }

    /* renamed from: ˋˊ */
    public void mo6916(float f) {
        float f2;
        float interpolation = this.f10698.getInterpolation(f);
        int length = this.f10697.length;
        for (int i = 0; i < length; i++) {
            C2714 c2714 = this.f10697[i];
            C2721 c2721 = c2714.f10622;
            List list = c2721.f10666;
            int i2 = 1;
            if (interpolation > 0.0f) {
                int i3 = c2721.f10668;
                if (interpolation < 1.0f) {
                    C2730 c2730 = (C2730) list.get(0);
                    while (true) {
                        if (i2 >= i3) {
                            f2 = ((C2730) list.get(i3 - 1)).f10684;
                            break;
                        }
                        C2730 c27302 = (C2730) list.get(i2);
                        float f3 = c27302.f10683;
                        if (interpolation < f3) {
                            float f4 = c2730.f10683;
                            float f5 = (interpolation - f4) / (f3 - f4);
                            float f6 = c2730.f10684;
                            float f7 = c27302.f10684;
                            InterfaceC2717 interfaceC2717 = c2721.f10667;
                            f2 = interfaceC2717 == null ? ᐧʻ.ﹶˆ(f7, f6, f5, f6) : ((Float) interfaceC2717.mo6883(f5, Float.valueOf(f6), Float.valueOf(f7))).floatValue();
                        } else {
                            i2++;
                            c2730 = c27302;
                        }
                    }
                } else {
                    C2730 c27303 = (C2730) list.get(i3 - 2);
                    C2730 c27304 = (C2730) list.get(i3 - 1);
                    float f8 = c27303.f10684;
                    float f9 = c27304.f10684;
                    float f10 = c27303.f10683;
                    float f11 = (interpolation - f10) / (c27304.f10683 - f10);
                    InterfaceC2717 interfaceC27172 = c2721.f10667;
                    f2 = interfaceC27172 == null ? ᐧʻ.ﹶˆ(f9, f8, f11, f8) : ((Float) interfaceC27172.mo6883(f11, Float.valueOf(f8), Float.valueOf(f9))).floatValue();
                }
            } else {
                C2730 c27305 = (C2730) list.get(0);
                C2730 c27306 = (C2730) list.get(1);
                float f12 = c27305.f10684;
                float f13 = c27306.f10684;
                float f14 = c27305.f10683;
                float f15 = (interpolation - f14) / (c27306.f10683 - f14);
                InterfaceC2717 interfaceC27173 = c2721.f10667;
                f2 = interfaceC27173 == null ? ᐧʻ.ﹶˆ(f13, f12, f15, f12) : ((Float) interfaceC27173.mo6883(f15, Float.valueOf(f12), Float.valueOf(f13))).floatValue();
            }
            c2714.f10625 = f2;
        }
        ArrayList arrayList = this.f10676;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i4 = 0; i4 < size; i4++) {
                ((InterfaceC2713) this.f10676.get(i4)).m6875(this);
            }
        }
    }

    @Override // p197.AbstractC2726
    /* renamed from: ˋⁱ */
    public boolean mo6894() {
        return this.f10688;
    }

    @Override // p197.AbstractC2726
    /* renamed from: ˎٴ */
    public final void mo6896(C2729 c2729) {
        if (c2729 != null) {
            this.f10698 = c2729;
        } else {
            this.f10698 = new C2728(3);
        }
    }

    @Override // p197.AbstractC2726
    /* renamed from: ˏᴵ */
    public final boolean mo6897(long j) {
        if (this.f10699) {
            return false;
        }
        return mo6898(j);
    }

    @Override // p197.InterfaceC2725
    /* renamed from: ˑʽ */
    public final boolean mo6898(long j) {
        if (this.f10695 < 0) {
            this.f10695 = this.f10700 ? j : ((long) (0 * 1.0f)) + j;
        }
        boolean z = true;
        boolean z2 = false;
        if (!this.f10694) {
            if (this.f10695 > j && this.f10689 == -1.0f) {
                return false;
            }
            this.f10694 = true;
            m6946();
        }
        if (this.f10690 < 0) {
            float f = this.f10689;
            if (f >= 0.0f) {
                this.f10695 = j - ((long) (((long) (this.f10692 * 1.0f)) * f));
                this.f10689 = -1.0f;
            }
        }
        this.f10690 = j;
        long jMax = Math.max(j, this.f10695);
        if (this.f10694) {
            long j2 = (long) (this.f10692 * 1.0f);
            float f2 = j2 > 0 ? (jMax - this.f10695) / j2 : 1.0f;
            boolean z3 = ((int) f2) > ((int) this.f10702);
            int i = this.f10701;
            boolean z4 = f2 >= ((float) (i + 1)) && i != -1;
            if (j2 != 0) {
                if (z3 && !z4) {
                    ArrayList arrayList = this.f10677;
                    if (arrayList != null) {
                        int size = arrayList.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            ((InterfaceC2732) this.f10677.get(i2)).getClass();
                        }
                    }
                } else if (!z4) {
                }
                z = false;
            }
            float fM6949 = m6949(f2);
            this.f10702 = fM6949;
            mo6916(m6941(fM6949, this.f10700));
            z2 = z;
        }
        if (z2) {
            m6943();
        }
        return z2;
    }

    @Override // p197.AbstractC2726
    /* renamed from: ˑי */
    public final void mo6899() {
        if (this.f10690 >= 0) {
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f10695 = jCurrentAnimationTimeMillis - (((long) (this.f10692 * 1.0f)) - (jCurrentAnimationTimeMillis - this.f10695));
            this.f10700 = !this.f10700;
        } else if (!this.f10696) {
            m6944(true);
        } else {
            this.f10700 = !this.f10700;
            mo6890();
        }
    }

    /* renamed from: יʻ, reason: contains not printable characters */
    public final void m6943() {
        ArrayList arrayList;
        C2723 c2723M6926;
        ArrayList arrayList2;
        int iIndexOf;
        if (this.f10693) {
            return;
        }
        if (this.f10699 && (iIndexOf = (arrayList2 = (c2723M6926 = C2723.m6926()).f10672).indexOf(this)) >= 0) {
            arrayList2.set(iIndexOf, null);
            c2723M6926.f10673 = true;
        }
        this.f10693 = true;
        boolean z = (this.f10696 || this.f10694) && this.f10677 != null;
        if (z && !this.f10694) {
            m6940();
        }
        this.f10694 = false;
        this.f10696 = false;
        this.f10704 = false;
        this.f10690 = -1L;
        this.f10695 = -1L;
        if (z && (arrayList = this.f10677) != null) {
            ArrayList arrayList3 = (ArrayList) arrayList.clone();
            int size = arrayList3.size();
            for (int i = 0; i < size; i++) {
                ((InterfaceC2732) arrayList3.get(i)).mo6931(this);
            }
        }
        this.f10700 = false;
    }

    /* renamed from: ـˆ, reason: contains not printable characters */
    public final void m6944(boolean z) {
        if (Looper.myLooper() == null) {
            throw new AndroidRuntimeException("Animators may only be run on Looper threads");
        }
        this.f10700 = z;
        this.f10699 = !this.f10687;
        if (z) {
            float f = this.f10689;
            if (f != -1.0f && f != 0.0f) {
                if (this.f10701 == -1) {
                    double d = f;
                    this.f10689 = 1.0f - ((float) (d - Math.floor(d)));
                } else {
                    this.f10689 = (r3 + 1) - f;
                }
            }
        }
        this.f10696 = true;
        this.f10694 = false;
        this.f10693 = false;
        this.f10690 = -1L;
        this.f10695 = -1L;
        m6946();
        float f2 = this.f10689;
        if (f2 == -1.0f) {
            long j = this.f10692;
            m6945(j > 0 ? 0 / j : 1.0f);
        } else {
            m6945(f2);
        }
        if (this.f10699) {
            AbstractC2726.m6927(this);
        }
    }

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final void m6945(float f) {
        mo6918();
        float fM6949 = m6949(f);
        if (this.f10690 >= 0) {
            this.f10695 = AnimationUtils.currentAnimationTimeMillis() - ((long) (((long) (this.f10692 * 1.0f)) * fM6949));
        } else {
            this.f10689 = fM6949;
        }
        this.f10702 = fM6949;
        mo6916(m6941(fM6949, this.f10700));
    }

    /* renamed from: ᐧⁱ */
    public void mo6918() {
        if (this.f10688) {
            return;
        }
        int length = this.f10697.length;
        for (int i = 0; i < length; i++) {
            C2714 c2714 = this.f10697[i];
            if (c2714.f10620 == null) {
                Class cls = c2714.f10619;
                c2714.f10620 = cls == Integer.class ? C2728.f10679 : cls == Float.class ? C2728.f10678 : null;
            }
            InterfaceC2717 interfaceC2717 = c2714.f10620;
            if (interfaceC2717 != null) {
                c2714.f10626.f10667 = interfaceC2717;
            }
        }
        this.f10688 = true;
    }

    /* renamed from: ᴵʼ, reason: contains not printable characters */
    public final void m6946() {
        this.f10693 = false;
        mo6918();
        this.f10694 = true;
        float f = this.f10689;
        if (f >= 0.0f) {
            this.f10702 = f;
        } else {
            this.f10702 = 0.0f;
        }
        if (this.f10677 != null) {
            m6940();
        }
    }

    @Override // p197.AbstractC2726
    /* renamed from: ᴵʿ */
    public final boolean mo6905() {
        return this.f10696;
    }

    @Override // p197.AbstractC2726
    /* renamed from: ᵎˏ */
    public final void mo6906(boolean z) {
        mo6918();
        mo6916((this.f10701 % 2 == 1 && this.f10691 == 2) ? 0.0f : z ? 0.0f : 1.0f);
    }

    /* renamed from: ᵢʿ */
    public void mo6919(float... fArr) {
        if (fArr.length == 0) {
            return;
        }
        C2714[] c2714Arr = this.f10697;
        if (c2714Arr == null || c2714Arr.length == 0) {
            m6948(new C2714("", fArr));
        } else {
            c2714Arr[0].m6879(fArr);
        }
        this.f10688 = false;
    }

    @Override // p197.AbstractC2726
    /* renamed from: ﹳˎ */
    public void mo6909() {
        m6944(false);
    }

    /* renamed from: ﹳˑ, reason: contains not printable characters */
    public final Float m6947() {
        C2714[] c2714Arr = this.f10697;
        if (c2714Arr == null || c2714Arr.length <= 0) {
            return null;
        }
        return Float.valueOf(c2714Arr[0].f10625);
    }

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public final void m6948(C2714... c2714Arr) {
        int length = c2714Arr.length;
        this.f10697 = c2714Arr;
        this.f10703 = new HashMap(length);
        for (C2714 c2714 : c2714Arr) {
            this.f10703.put(c2714.f10624, c2714);
        }
        this.f10688 = false;
    }

    @Override // p197.AbstractC2726
    /* renamed from: ﾞʽ, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public C2734 clone() {
        C2734 c2734 = (C2734) super.clone();
        if (this.f10676 != null) {
            c2734.f10676 = new ArrayList(this.f10676);
        }
        c2734.f10689 = -1.0f;
        c2734.f10700 = false;
        c2734.f10688 = false;
        c2734.f10696 = false;
        c2734.f10694 = false;
        c2734.f10704 = false;
        c2734.f10695 = -1L;
        c2734.f10693 = false;
        c2734.f10690 = -1L;
        c2734.f10702 = 0.0f;
        c2734.f10699 = true;
        c2734.f10687 = false;
        C2714[] c2714Arr = this.f10697;
        if (c2714Arr != null) {
            int length = c2714Arr.length;
            c2734.f10697 = new C2714[length];
            c2734.f10703 = new HashMap(length);
            for (int i = 0; i < length; i++) {
                C2714 c2714Clone = c2714Arr[i].clone();
                c2734.f10697[i] = c2714Clone;
                c2734.f10703.put(c2714Clone.f10624, c2714Clone);
            }
        }
        return c2734;
    }

    /* renamed from: ﾞˊ, reason: contains not printable characters */
    public final float m6949(float f) {
        if (f < 0.0f) {
            return 0.0f;
        }
        return this.f10701 != -1 ? Math.min(f, r0 + 1) : f;
    }
}
