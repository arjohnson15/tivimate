package p061;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: ʾـ.ˎٴ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class RunnableC1383 implements Runnable {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final /* synthetic */ ArrayList f5646;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final /* synthetic */ C1438 f5647;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final /* synthetic */ int f5648;

    public /* synthetic */ RunnableC1383(C1438 c1438, ArrayList arrayList, int i) {
        this.f5648 = i;
        this.f5647 = c1438;
        this.f5646 = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Iterator it;
        switch (this.f5648) {
            case 0:
                ArrayList arrayList = this.f5646;
                Iterator it2 = arrayList.iterator();
                while (true) {
                    boolean zHasNext = it2.hasNext();
                    C1438 c1438 = this.f5647;
                    if (!zHasNext) {
                        arrayList.clear();
                        c1438.f5897.remove(arrayList);
                        break;
                    } else {
                        C1379 c1379 = (C1379) it2.next();
                        AbstractC1375 abstractC1375 = c1379.f5638;
                        c1438.getClass();
                        View view = abstractC1375.f5618;
                        int i = c1379.f5639 - c1379.f5635;
                        int i2 = c1379.f5636 - c1379.f5637;
                        if (i != 0) {
                            view.animate().translationX(0.0f);
                        }
                        if (i2 != 0) {
                            view.animate().translationY(0.0f);
                        }
                        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
                        c1438.f5899.add(abstractC1375);
                        viewPropertyAnimatorAnimate.setDuration(c1438.f5588).setListener(new C1374(c1438, abstractC1375, i, view, i2, viewPropertyAnimatorAnimate, 1)).start();
                    }
                }
            case 1:
                ArrayList arrayList2 = this.f5646;
                Iterator it3 = arrayList2.iterator();
                while (true) {
                    boolean zHasNext2 = it3.hasNext();
                    C1438 c14382 = this.f5647;
                    if (!zHasNext2) {
                        arrayList2.clear();
                        c14382.f5893.remove(arrayList2);
                        break;
                    } else {
                        C1367 c1367 = (C1367) it3.next();
                        c14382.getClass();
                        AbstractC1375 abstractC13752 = c1367.f5550;
                        View view2 = abstractC13752 == null ? null : abstractC13752.f5618;
                        AbstractC1375 abstractC13753 = c1367.f5547;
                        View view3 = abstractC13753 != null ? abstractC13753.f5618 : null;
                        ArrayList arrayList3 = c14382.f5898;
                        long j = c14382.f5591;
                        if (view2 != null) {
                            ViewPropertyAnimator duration = view2.animate().setDuration(j);
                            arrayList3.add(c1367.f5550);
                            duration.translationX(c1367.f5548 - c1367.f5549);
                            duration.translationY(c1367.f5551 - c1367.f5552);
                            it = it3;
                            duration.alpha(0.0f).setListener(new C1430(c14382, c1367, duration, view2, 0)).start();
                        } else {
                            it = it3;
                        }
                        if (view3 != null) {
                            ViewPropertyAnimator viewPropertyAnimatorAnimate2 = view3.animate();
                            arrayList3.add(c1367.f5547);
                            viewPropertyAnimatorAnimate2.translationX(0.0f).translationY(0.0f).setDuration(j).alpha(1.0f).setListener(new C1430(c14382, c1367, viewPropertyAnimatorAnimate2, view3, 1)).start();
                        }
                        it3 = it;
                    }
                }
            default:
                ArrayList arrayList4 = this.f5646;
                Iterator it4 = arrayList4.iterator();
                while (true) {
                    boolean zHasNext3 = it4.hasNext();
                    C1438 c14383 = this.f5647;
                    if (!zHasNext3) {
                        arrayList4.clear();
                        c14383.f5890.remove(arrayList4);
                        break;
                    } else {
                        AbstractC1375 abstractC13754 = (AbstractC1375) it4.next();
                        c14383.getClass();
                        View view4 = abstractC13754.f5618;
                        ViewPropertyAnimator viewPropertyAnimatorAnimate3 = view4.animate();
                        c14383.f5895.add(abstractC13754);
                        viewPropertyAnimatorAnimate3.alpha(1.0f).setDuration(c14383.f5589).setListener(new C1415(c14383, abstractC13754, view4, viewPropertyAnimatorAnimate3)).start();
                    }
                }
        }
    }
}
