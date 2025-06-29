package p061;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import p378.AbstractC4345;

/* renamed from: ʾـ.ﾞˊ, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C1438 extends AbstractC1371 {

    /* renamed from: ʿˏ, reason: contains not printable characters */
    public static TimeInterpolator f5886;

    /* renamed from: ﹳˎ, reason: contains not printable characters */
    public static TimeInterpolator f5887;

    /* renamed from: ˉי, reason: contains not printable characters */
    public ArrayList f5888;

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public ArrayList f5889;

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public ArrayList f5890;

    /* renamed from: ˎٴ, reason: contains not printable characters */
    public ArrayList f5891;

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public ArrayList f5892;

    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public ArrayList f5893;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final /* synthetic */ int f5894;

    /* renamed from: ˑי, reason: contains not printable characters */
    public ArrayList f5895;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public boolean f5896;

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public ArrayList f5897;

    /* renamed from: ᵎˏ, reason: contains not printable characters */
    public ArrayList f5898;

    /* renamed from: ᵎـ, reason: contains not printable characters */
    public ArrayList f5899;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public ArrayList f5900;

    public C1438(byte b) {
        this.f5590 = null;
        this.f5587 = new ArrayList();
        this.f5589 = 120L;
        this.f5592 = 120L;
        this.f5588 = 250L;
        this.f5591 = 250L;
        this.f5896 = true;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1438(int i) {
        this((byte) 0);
        this.f5894 = i;
        switch (i) {
            case 1:
                this((byte) 0);
                break;
            default:
                this.f5900 = new ArrayList();
                this.f5888 = new ArrayList();
                this.f5892 = new ArrayList();
                this.f5889 = new ArrayList();
                this.f5890 = new ArrayList();
                this.f5897 = new ArrayList();
                this.f5893 = new ArrayList();
                this.f5895 = new ArrayList();
                this.f5899 = new ArrayList();
                this.f5891 = new ArrayList();
                this.f5898 = new ArrayList();
                break;
        }
    }

    @Override // p061.AbstractC1371
    /* renamed from: ʽᐧ */
    public final boolean mo4750(AbstractC1375 abstractC1375, List list) {
        switch (this.f5894) {
            case 0:
                if (!list.isEmpty() || !this.f5896 || abstractC1375.m4784()) {
                }
                break;
            default:
                if (!list.isEmpty() || !this.f5896 || abstractC1375.m4784()) {
                }
                break;
        }
        return true;
    }

    @Override // p061.AbstractC1371
    /* renamed from: ʿʼ */
    public final void mo4751(AbstractC1375 abstractC1375) {
        switch (this.f5894) {
            case 0:
                View view = abstractC1375.f5618;
                view.animate().cancel();
                ArrayList arrayList = this.f5892;
                int size = arrayList.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        m4980(this.f5889, abstractC1375);
                        if (this.f5900.remove(abstractC1375)) {
                            view.setAlpha(1.0f);
                            m4753(abstractC1375);
                        }
                        if (this.f5888.remove(abstractC1375)) {
                            view.setAlpha(1.0f);
                            m4753(abstractC1375);
                        }
                        ArrayList arrayList2 = this.f5893;
                        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
                            ArrayList arrayList3 = (ArrayList) arrayList2.get(size2);
                            m4980(arrayList3, abstractC1375);
                            if (arrayList3.isEmpty()) {
                                arrayList2.remove(size2);
                            }
                        }
                        ArrayList arrayList4 = this.f5897;
                        for (int size3 = arrayList4.size() - 1; size3 >= 0; size3--) {
                            ArrayList arrayList5 = (ArrayList) arrayList4.get(size3);
                            int size4 = arrayList5.size() - 1;
                            while (true) {
                                if (size4 < 0) {
                                    break;
                                }
                                if (((C1379) arrayList5.get(size4)).f5638 == abstractC1375) {
                                    view.setTranslationY(0.0f);
                                    view.setTranslationX(0.0f);
                                    m4753(abstractC1375);
                                    arrayList5.remove(size4);
                                    if (arrayList5.isEmpty()) {
                                        arrayList4.remove(size3);
                                    }
                                } else {
                                    size4--;
                                }
                            }
                        }
                        ArrayList arrayList6 = this.f5890;
                        for (int size5 = arrayList6.size() - 1; size5 >= 0; size5--) {
                            ArrayList arrayList7 = (ArrayList) arrayList6.get(size5);
                            if (arrayList7.remove(abstractC1375)) {
                                view.setAlpha(1.0f);
                                m4753(abstractC1375);
                                if (arrayList7.isEmpty()) {
                                    arrayList6.remove(size5);
                                }
                            }
                        }
                        this.f5891.remove(abstractC1375);
                        this.f5895.remove(abstractC1375);
                        this.f5898.remove(abstractC1375);
                        this.f5899.remove(abstractC1375);
                        m4974();
                        break;
                    } else if (((C1379) arrayList.get(size)).f5638 == abstractC1375) {
                        view.setTranslationY(0.0f);
                        view.setTranslationX(0.0f);
                        m4753(abstractC1375);
                        arrayList.remove(size);
                    }
                }
                break;
            default:
                View view2 = abstractC1375.f5618;
                view2.animate().cancel();
                ArrayList arrayList8 = this.f5892;
                int size6 = arrayList8.size();
                while (true) {
                    size6--;
                    if (size6 < 0) {
                        m4975(this.f5889, abstractC1375);
                        if (this.f5900.remove(abstractC1375)) {
                            view2.setAlpha(1.0f);
                            m4753(abstractC1375);
                        }
                        if (this.f5888.remove(abstractC1375)) {
                            view2.setAlpha(1.0f);
                            m4753(abstractC1375);
                        }
                        ArrayList arrayList9 = this.f5893;
                        for (int size7 = arrayList9.size() - 1; size7 >= 0; size7--) {
                            ArrayList arrayList10 = (ArrayList) arrayList9.get(size7);
                            m4975(arrayList10, abstractC1375);
                            if (arrayList10.isEmpty()) {
                                arrayList9.remove(size7);
                            }
                        }
                        ArrayList arrayList11 = this.f5897;
                        for (int size8 = arrayList11.size() - 1; size8 >= 0; size8--) {
                            ArrayList arrayList12 = (ArrayList) arrayList11.get(size8);
                            int size9 = arrayList12.size() - 1;
                            while (true) {
                                if (size9 < 0) {
                                    break;
                                }
                                if (((C1388) arrayList12.get(size9)).f5662 == abstractC1375) {
                                    view2.setTranslationY(0.0f);
                                    view2.setTranslationX(0.0f);
                                    m4753(abstractC1375);
                                    arrayList12.remove(size9);
                                    if (arrayList12.isEmpty()) {
                                        arrayList11.remove(size8);
                                    }
                                } else {
                                    size9--;
                                }
                            }
                        }
                        ArrayList arrayList13 = this.f5890;
                        for (int size10 = arrayList13.size() - 1; size10 >= 0; size10--) {
                            ArrayList arrayList14 = (ArrayList) arrayList13.get(size10);
                            if (arrayList14.remove(abstractC1375)) {
                                view2.setAlpha(1.0f);
                                m4753(abstractC1375);
                                if (arrayList14.isEmpty()) {
                                    arrayList13.remove(size10);
                                }
                            }
                        }
                        this.f5891.remove(abstractC1375);
                        this.f5895.remove(abstractC1375);
                        this.f5898.remove(abstractC1375);
                        this.f5899.remove(abstractC1375);
                        m4974();
                        break;
                    } else if (((C1388) arrayList8.get(size6)).f5662 == abstractC1375) {
                        view2.setTranslationY(0.0f);
                        view2.setTranslationX(0.0f);
                        m4753(abstractC1375);
                        arrayList8.remove(size6);
                    }
                }
                break;
        }
    }

    /* renamed from: ˉי, reason: contains not printable characters */
    public final boolean m4973(AbstractC1375 abstractC1375, int i, int i2, int i3, int i4) {
        switch (this.f5894) {
            case 0:
                View view = abstractC1375.f5618;
                int translationX = i + ((int) view.getTranslationX());
                int translationY = i2 + ((int) abstractC1375.f5618.getTranslationY());
                m4976(abstractC1375);
                int i5 = i3 - translationX;
                int i6 = i4 - translationY;
                if (i5 != 0 || i6 != 0) {
                    if (i5 != 0) {
                        view.setTranslationX(-i5);
                    }
                    if (i6 != 0) {
                        view.setTranslationY(-i6);
                    }
                    ArrayList arrayList = this.f5892;
                    C1379 c1379 = new C1379();
                    c1379.f5638 = abstractC1375;
                    c1379.f5635 = translationX;
                    c1379.f5637 = translationY;
                    c1379.f5639 = i3;
                    c1379.f5636 = i4;
                    arrayList.add(c1379);
                    break;
                } else {
                    m4753(abstractC1375);
                    break;
                }
            default:
                View view2 = abstractC1375.f5618;
                int translationX2 = i + ((int) view2.getTranslationX());
                int translationY2 = i2 + ((int) abstractC1375.f5618.getTranslationY());
                m4981(abstractC1375);
                int i7 = i3 - translationX2;
                int i8 = i4 - translationY2;
                if (i7 != 0 || i8 != 0) {
                    if (i7 != 0) {
                        view2.setTranslationX(-i7);
                    }
                    if (i8 != 0) {
                        view2.setTranslationY(-i8);
                    }
                    ArrayList arrayList2 = this.f5892;
                    C1388 c1388 = new C1388();
                    c1388.f5662 = abstractC1375;
                    c1388.f5659 = translationX2;
                    c1388.f5661 = translationY2;
                    c1388.f5663 = i3;
                    c1388.f5660 = i4;
                    arrayList2.add(c1388);
                    break;
                } else {
                    m4753(abstractC1375);
                    break;
                }
        }
        return true;
    }

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public final void m4974() {
        switch (this.f5894) {
            case 0:
                if (!mo4755()) {
                    m4756();
                    break;
                }
                break;
            default:
                if (!mo4755()) {
                    m4756();
                    break;
                }
                break;
        }
    }

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public void m4975(ArrayList arrayList, AbstractC1375 abstractC1375) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C1409 c1409 = (C1409) arrayList.get(size);
            if (m4978(c1409, abstractC1375) && c1409.f5757 == null && c1409.f5754 == null) {
                arrayList.remove(c1409);
            }
        }
    }

    /* renamed from: ˎٴ, reason: contains not printable characters */
    public void m4976(AbstractC1375 abstractC1375) {
        if (f5887 == null) {
            f5887 = new ValueAnimator().getInterpolator();
        }
        abstractC1375.f5618.animate().setInterpolator(f5887);
        mo4751(abstractC1375);
    }

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public final void m4977(ArrayList arrayList) {
        switch (this.f5894) {
            case 0:
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    ((AbstractC1375) arrayList.get(size)).f5618.animate().cancel();
                }
                break;
            default:
                for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                    ((AbstractC1375) arrayList.get(size2)).f5618.animate().cancel();
                }
                break;
        }
    }

    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public boolean m4978(C1409 c1409, AbstractC1375 abstractC1375) {
        if (c1409.f5754 == abstractC1375) {
            c1409.f5754 = null;
        } else {
            if (c1409.f5757 != abstractC1375) {
                return false;
            }
            c1409.f5757 = null;
        }
        abstractC1375.f5618.setAlpha(1.0f);
        View view = abstractC1375.f5618;
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        m4753(abstractC1375);
        return true;
    }

    @Override // p061.AbstractC1371
    /* renamed from: ˏᵢ */
    public final void mo4752() {
        switch (this.f5894) {
            case 0:
                ArrayList arrayList = this.f5900;
                boolean zIsEmpty = arrayList.isEmpty();
                ArrayList arrayList2 = this.f5892;
                boolean zIsEmpty2 = arrayList2.isEmpty();
                ArrayList arrayList3 = this.f5889;
                boolean zIsEmpty3 = arrayList3.isEmpty();
                ArrayList arrayList4 = this.f5888;
                boolean zIsEmpty4 = arrayList4.isEmpty();
                if (!zIsEmpty || !zIsEmpty2 || !zIsEmpty4 || !zIsEmpty3) {
                    Iterator it = arrayList.iterator();
                    while (true) {
                        boolean zHasNext = it.hasNext();
                        long j = this.f5592;
                        if (!zHasNext) {
                            arrayList.clear();
                            if (!zIsEmpty2) {
                                ArrayList arrayList5 = new ArrayList();
                                arrayList5.addAll(arrayList2);
                                this.f5897.add(arrayList5);
                                arrayList2.clear();
                                RunnableC1383 runnableC1383 = new RunnableC1383(this, arrayList5, 0);
                                if (zIsEmpty) {
                                    runnableC1383.run();
                                } else {
                                    View view = ((C1379) arrayList5.get(0)).f5638.f5618;
                                    WeakHashMap weakHashMap = AbstractC4345.f16838;
                                    view.postOnAnimationDelayed(runnableC1383, j);
                                }
                            }
                            if (!zIsEmpty3) {
                                ArrayList arrayList6 = new ArrayList();
                                arrayList6.addAll(arrayList3);
                                this.f5893.add(arrayList6);
                                arrayList3.clear();
                                RunnableC1383 runnableC13832 = new RunnableC1383(this, arrayList6, 1);
                                if (zIsEmpty) {
                                    runnableC13832.run();
                                } else {
                                    View view2 = ((C1367) arrayList6.get(0)).f5550.f5618;
                                    WeakHashMap weakHashMap2 = AbstractC4345.f16838;
                                    view2.postOnAnimationDelayed(runnableC13832, j);
                                }
                            }
                            if (!zIsEmpty4) {
                                ArrayList arrayList7 = new ArrayList();
                                arrayList7.addAll(arrayList4);
                                this.f5890.add(arrayList7);
                                arrayList4.clear();
                                RunnableC1383 runnableC13833 = new RunnableC1383(this, arrayList7, 2);
                                if (!zIsEmpty || !zIsEmpty2 || !zIsEmpty3) {
                                    if (zIsEmpty) {
                                        j = 0;
                                    }
                                    long jMax = Math.max(!zIsEmpty2 ? this.f5588 : 0L, !zIsEmpty3 ? this.f5591 : 0L) + j;
                                    View view3 = ((AbstractC1375) arrayList7.get(0)).f5618;
                                    WeakHashMap weakHashMap3 = AbstractC4345.f16838;
                                    view3.postOnAnimationDelayed(runnableC13833, jMax);
                                    break;
                                } else {
                                    runnableC13833.run();
                                    break;
                                }
                            }
                        } else {
                            AbstractC1375 abstractC1375 = (AbstractC1375) it.next();
                            View view4 = abstractC1375.f5618;
                            ViewPropertyAnimator viewPropertyAnimatorAnimate = view4.animate();
                            this.f5891.add(abstractC1375);
                            viewPropertyAnimatorAnimate.setDuration(j).alpha(0.0f).setListener(new C1415(this, abstractC1375, viewPropertyAnimatorAnimate, view4)).start();
                        }
                    }
                }
                break;
            default:
                ArrayList arrayList8 = this.f5900;
                boolean zIsEmpty5 = arrayList8.isEmpty();
                ArrayList arrayList9 = this.f5892;
                boolean zIsEmpty6 = arrayList9.isEmpty();
                ArrayList arrayList10 = this.f5889;
                boolean zIsEmpty7 = arrayList10.isEmpty();
                ArrayList arrayList11 = this.f5888;
                boolean zIsEmpty8 = arrayList11.isEmpty();
                if (!zIsEmpty5 || !zIsEmpty6 || !zIsEmpty8 || !zIsEmpty7) {
                    Iterator it2 = arrayList8.iterator();
                    while (true) {
                        boolean zHasNext2 = it2.hasNext();
                        long j2 = this.f5592;
                        if (!zHasNext2) {
                            arrayList8.clear();
                            if (!zIsEmpty6) {
                                ArrayList arrayList12 = new ArrayList();
                                arrayList12.addAll(arrayList9);
                                this.f5897.add(arrayList12);
                                arrayList9.clear();
                                RunnableC1372 runnableC1372 = new RunnableC1372(this, arrayList12, 0);
                                if (zIsEmpty5) {
                                    runnableC1372.run();
                                } else {
                                    View view5 = ((C1388) arrayList12.get(0)).f5662.f5618;
                                    WeakHashMap weakHashMap4 = AbstractC4345.f16838;
                                    view5.postOnAnimationDelayed(runnableC1372, j2);
                                }
                            }
                            if (!zIsEmpty7) {
                                ArrayList arrayList13 = new ArrayList();
                                arrayList13.addAll(arrayList10);
                                this.f5893.add(arrayList13);
                                arrayList10.clear();
                                RunnableC1372 runnableC13722 = new RunnableC1372(this, arrayList13, 1);
                                if (zIsEmpty5) {
                                    runnableC13722.run();
                                } else {
                                    View view6 = ((C1409) arrayList13.get(0)).f5757.f5618;
                                    WeakHashMap weakHashMap5 = AbstractC4345.f16838;
                                    view6.postOnAnimationDelayed(runnableC13722, j2);
                                }
                            }
                            if (!zIsEmpty8) {
                                ArrayList arrayList14 = new ArrayList();
                                arrayList14.addAll(arrayList11);
                                this.f5890.add(arrayList14);
                                arrayList11.clear();
                                RunnableC1372 runnableC13723 = new RunnableC1372(this, arrayList14, 2);
                                if (!zIsEmpty5 || !zIsEmpty6 || !zIsEmpty7) {
                                    if (zIsEmpty5) {
                                        j2 = 0;
                                    }
                                    long jMax2 = Math.max(!zIsEmpty6 ? this.f5588 : 0L, !zIsEmpty7 ? this.f5591 : 0L) + j2;
                                    View view7 = ((AbstractC1375) arrayList14.get(0)).f5618;
                                    WeakHashMap weakHashMap6 = AbstractC4345.f16838;
                                    view7.postOnAnimationDelayed(runnableC13723, jMax2);
                                    break;
                                } else {
                                    runnableC13723.run();
                                    break;
                                }
                            }
                        } else {
                            AbstractC1375 abstractC13752 = (AbstractC1375) it2.next();
                            View view8 = abstractC13752.f5618;
                            ViewPropertyAnimator viewPropertyAnimatorAnimate2 = view8.animate();
                            this.f5891.add(abstractC13752);
                            viewPropertyAnimatorAnimate2.setDuration(j2).alpha(0.0f).setListener(new C1387(this, abstractC13752, viewPropertyAnimatorAnimate2, view8)).start();
                        }
                    }
                }
                break;
        }
    }

    /* renamed from: ˑי, reason: contains not printable characters */
    public boolean m4979(C1367 c1367, AbstractC1375 abstractC1375) {
        if (c1367.f5547 == abstractC1375) {
            c1367.f5547 = null;
        } else {
            if (c1367.f5550 != abstractC1375) {
                return false;
            }
            c1367.f5550 = null;
        }
        abstractC1375.f5618.setAlpha(1.0f);
        View view = abstractC1375.f5618;
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        m4753(abstractC1375);
        return true;
    }

    @Override // p061.AbstractC1371
    /* renamed from: ٴˎ */
    public final void mo4754() {
        switch (this.f5894) {
            case 0:
                ArrayList arrayList = this.f5892;
                int size = arrayList.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        ArrayList arrayList2 = this.f5900;
                        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
                            m4753((AbstractC1375) arrayList2.get(size2));
                            arrayList2.remove(size2);
                        }
                        ArrayList arrayList3 = this.f5888;
                        int size3 = arrayList3.size();
                        while (true) {
                            size3--;
                            if (size3 < 0) {
                                ArrayList arrayList4 = this.f5889;
                                for (int size4 = arrayList4.size() - 1; size4 >= 0; size4--) {
                                    C1367 c1367 = (C1367) arrayList4.get(size4);
                                    AbstractC1375 abstractC1375 = c1367.f5550;
                                    if (abstractC1375 != null) {
                                        m4979(c1367, abstractC1375);
                                    }
                                    AbstractC1375 abstractC13752 = c1367.f5547;
                                    if (abstractC13752 != null) {
                                        m4979(c1367, abstractC13752);
                                    }
                                }
                                arrayList4.clear();
                                if (mo4755()) {
                                    ArrayList arrayList5 = this.f5897;
                                    for (int size5 = arrayList5.size() - 1; size5 >= 0; size5--) {
                                        ArrayList arrayList6 = (ArrayList) arrayList5.get(size5);
                                        for (int size6 = arrayList6.size() - 1; size6 >= 0; size6--) {
                                            C1379 c1379 = (C1379) arrayList6.get(size6);
                                            View view = c1379.f5638.f5618;
                                            view.setTranslationY(0.0f);
                                            view.setTranslationX(0.0f);
                                            m4753(c1379.f5638);
                                            arrayList6.remove(size6);
                                            if (arrayList6.isEmpty()) {
                                                arrayList5.remove(arrayList6);
                                            }
                                        }
                                    }
                                    ArrayList arrayList7 = this.f5890;
                                    for (int size7 = arrayList7.size() - 1; size7 >= 0; size7--) {
                                        ArrayList arrayList8 = (ArrayList) arrayList7.get(size7);
                                        for (int size8 = arrayList8.size() - 1; size8 >= 0; size8--) {
                                            AbstractC1375 abstractC13753 = (AbstractC1375) arrayList8.get(size8);
                                            abstractC13753.f5618.setAlpha(1.0f);
                                            m4753(abstractC13753);
                                            arrayList8.remove(size8);
                                            if (arrayList8.isEmpty()) {
                                                arrayList7.remove(arrayList8);
                                            }
                                        }
                                    }
                                    ArrayList arrayList9 = this.f5893;
                                    for (int size9 = arrayList9.size() - 1; size9 >= 0; size9--) {
                                        ArrayList arrayList10 = (ArrayList) arrayList9.get(size9);
                                        for (int size10 = arrayList10.size() - 1; size10 >= 0; size10--) {
                                            C1367 c13672 = (C1367) arrayList10.get(size10);
                                            AbstractC1375 abstractC13754 = c13672.f5550;
                                            if (abstractC13754 != null) {
                                                m4979(c13672, abstractC13754);
                                            }
                                            AbstractC1375 abstractC13755 = c13672.f5547;
                                            if (abstractC13755 != null) {
                                                m4979(c13672, abstractC13755);
                                            }
                                            if (arrayList10.isEmpty()) {
                                                arrayList9.remove(arrayList10);
                                            }
                                        }
                                    }
                                    m4977(this.f5891);
                                    m4977(this.f5899);
                                    m4977(this.f5895);
                                    m4977(this.f5898);
                                    m4756();
                                    break;
                                }
                            } else {
                                AbstractC1375 abstractC13756 = (AbstractC1375) arrayList3.get(size3);
                                abstractC13756.f5618.setAlpha(1.0f);
                                m4753(abstractC13756);
                                arrayList3.remove(size3);
                            }
                        }
                    } else {
                        C1379 c13792 = (C1379) arrayList.get(size);
                        View view2 = c13792.f5638.f5618;
                        view2.setTranslationY(0.0f);
                        view2.setTranslationX(0.0f);
                        m4753(c13792.f5638);
                        arrayList.remove(size);
                    }
                }
                break;
            default:
                ArrayList arrayList11 = this.f5892;
                int size11 = arrayList11.size();
                while (true) {
                    size11--;
                    if (size11 < 0) {
                        ArrayList arrayList12 = this.f5900;
                        for (int size12 = arrayList12.size() - 1; size12 >= 0; size12--) {
                            m4753((AbstractC1375) arrayList12.get(size12));
                            arrayList12.remove(size12);
                        }
                        ArrayList arrayList13 = this.f5888;
                        int size13 = arrayList13.size();
                        while (true) {
                            size13--;
                            if (size13 < 0) {
                                ArrayList arrayList14 = this.f5889;
                                for (int size14 = arrayList14.size() - 1; size14 >= 0; size14--) {
                                    C1409 c1409 = (C1409) arrayList14.get(size14);
                                    AbstractC1375 abstractC13757 = c1409.f5757;
                                    if (abstractC13757 != null) {
                                        m4978(c1409, abstractC13757);
                                    }
                                    AbstractC1375 abstractC13758 = c1409.f5754;
                                    if (abstractC13758 != null) {
                                        m4978(c1409, abstractC13758);
                                    }
                                }
                                arrayList14.clear();
                                if (mo4755()) {
                                    ArrayList arrayList15 = this.f5897;
                                    for (int size15 = arrayList15.size() - 1; size15 >= 0; size15--) {
                                        ArrayList arrayList16 = (ArrayList) arrayList15.get(size15);
                                        for (int size16 = arrayList16.size() - 1; size16 >= 0; size16--) {
                                            C1388 c1388 = (C1388) arrayList16.get(size16);
                                            View view3 = c1388.f5662.f5618;
                                            view3.setTranslationY(0.0f);
                                            view3.setTranslationX(0.0f);
                                            m4753(c1388.f5662);
                                            arrayList16.remove(size16);
                                            if (arrayList16.isEmpty()) {
                                                arrayList15.remove(arrayList16);
                                            }
                                        }
                                    }
                                    ArrayList arrayList17 = this.f5890;
                                    for (int size17 = arrayList17.size() - 1; size17 >= 0; size17--) {
                                        ArrayList arrayList18 = (ArrayList) arrayList17.get(size17);
                                        for (int size18 = arrayList18.size() - 1; size18 >= 0; size18--) {
                                            AbstractC1375 abstractC13759 = (AbstractC1375) arrayList18.get(size18);
                                            abstractC13759.f5618.setAlpha(1.0f);
                                            m4753(abstractC13759);
                                            arrayList18.remove(size18);
                                            if (arrayList18.isEmpty()) {
                                                arrayList17.remove(arrayList18);
                                            }
                                        }
                                    }
                                    ArrayList arrayList19 = this.f5893;
                                    for (int size19 = arrayList19.size() - 1; size19 >= 0; size19--) {
                                        ArrayList arrayList20 = (ArrayList) arrayList19.get(size19);
                                        for (int size20 = arrayList20.size() - 1; size20 >= 0; size20--) {
                                            C1409 c14092 = (C1409) arrayList20.get(size20);
                                            AbstractC1375 abstractC137510 = c14092.f5757;
                                            if (abstractC137510 != null) {
                                                m4978(c14092, abstractC137510);
                                            }
                                            AbstractC1375 abstractC137511 = c14092.f5754;
                                            if (abstractC137511 != null) {
                                                m4978(c14092, abstractC137511);
                                            }
                                            if (arrayList20.isEmpty()) {
                                                arrayList19.remove(arrayList20);
                                            }
                                        }
                                    }
                                    m4977(this.f5891);
                                    m4977(this.f5899);
                                    m4977(this.f5895);
                                    m4977(this.f5898);
                                    m4756();
                                    break;
                                }
                            } else {
                                AbstractC1375 abstractC137512 = (AbstractC1375) arrayList13.get(size13);
                                abstractC137512.f5618.setAlpha(1.0f);
                                m4753(abstractC137512);
                                arrayList13.remove(size13);
                            }
                        }
                    } else {
                        C1388 c13882 = (C1388) arrayList11.get(size11);
                        View view4 = c13882.f5662.f5618;
                        view4.setTranslationY(0.0f);
                        view4.setTranslationX(0.0f);
                        m4753(c13882.f5662);
                        arrayList11.remove(size11);
                    }
                }
                break;
        }
    }

    @Override // p061.AbstractC1371
    /* renamed from: ᐧʻ */
    public final boolean mo4755() {
        switch (this.f5894) {
            case 0:
                if (!this.f5888.isEmpty() || !this.f5889.isEmpty() || !this.f5892.isEmpty() || !this.f5900.isEmpty() || !this.f5899.isEmpty() || !this.f5891.isEmpty() || !this.f5895.isEmpty() || !this.f5898.isEmpty() || !this.f5897.isEmpty() || !this.f5890.isEmpty() || !this.f5893.isEmpty()) {
                }
                break;
            default:
                if (!this.f5888.isEmpty() || !this.f5889.isEmpty() || !this.f5892.isEmpty() || !this.f5900.isEmpty() || !this.f5899.isEmpty() || !this.f5891.isEmpty() || !this.f5895.isEmpty() || !this.f5898.isEmpty() || !this.f5897.isEmpty() || !this.f5890.isEmpty() || !this.f5893.isEmpty()) {
                }
                break;
        }
        return true;
    }

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public void m4980(ArrayList arrayList, AbstractC1375 abstractC1375) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C1367 c1367 = (C1367) arrayList.get(size);
            if (m4979(c1367, abstractC1375) && c1367.f5550 == null && c1367.f5547 == null) {
                arrayList.remove(c1367);
            }
        }
    }

    /* renamed from: ᵎـ, reason: contains not printable characters */
    public void m4981(AbstractC1375 abstractC1375) {
        if (f5886 == null) {
            f5886 = new ValueAnimator().getInterpolator();
        }
        abstractC1375.f5618.animate().setInterpolator(f5886);
        mo4751(abstractC1375);
    }

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final boolean m4982(AbstractC1375 abstractC1375, AbstractC1375 abstractC13752, int i, int i2, int i3, int i4) {
        switch (this.f5894) {
            case 0:
                if (abstractC1375 != abstractC13752) {
                    View view = abstractC1375.f5618;
                    float translationX = view.getTranslationX();
                    float translationY = view.getTranslationY();
                    float alpha = view.getAlpha();
                    m4976(abstractC1375);
                    view.setTranslationX(translationX);
                    view.setTranslationY(translationY);
                    view.setAlpha(alpha);
                    m4976(abstractC13752);
                    float f = -((int) ((i3 - i) - translationX));
                    View view2 = abstractC13752.f5618;
                    view2.setTranslationX(f);
                    view2.setTranslationY(-((int) ((i4 - i2) - translationY)));
                    view2.setAlpha(0.0f);
                    ArrayList arrayList = this.f5889;
                    C1367 c1367 = new C1367();
                    c1367.f5550 = abstractC1375;
                    c1367.f5547 = abstractC13752;
                    c1367.f5549 = i;
                    c1367.f5552 = i2;
                    c1367.f5548 = i3;
                    c1367.f5551 = i4;
                    arrayList.add(c1367);
                    break;
                } else {
                    break;
                }
            default:
                if (abstractC1375 != abstractC13752) {
                    View view3 = abstractC1375.f5618;
                    float translationX2 = view3.getTranslationX();
                    float translationY2 = view3.getTranslationY();
                    float alpha2 = view3.getAlpha();
                    m4981(abstractC1375);
                    view3.setTranslationX(translationX2);
                    view3.setTranslationY(translationY2);
                    view3.setAlpha(alpha2);
                    m4981(abstractC13752);
                    float f2 = -((int) ((i3 - i) - translationX2));
                    View view4 = abstractC13752.f5618;
                    view4.setTranslationX(f2);
                    view4.setTranslationY(-((int) ((i4 - i2) - translationY2)));
                    view4.setAlpha(0.0f);
                    ArrayList arrayList2 = this.f5889;
                    C1409 c1409 = new C1409();
                    c1409.f5757 = abstractC1375;
                    c1409.f5754 = abstractC13752;
                    c1409.f5756 = i;
                    c1409.f5759 = i2;
                    c1409.f5755 = i3;
                    c1409.f5758 = i4;
                    arrayList2.add(c1409);
                    break;
                } else {
                    break;
                }
        }
        return true;
    }
}
