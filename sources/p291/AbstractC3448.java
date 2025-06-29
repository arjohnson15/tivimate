package p291;

import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.AbstractComponentCallbacksC0100;
import androidx.lifecycle.RunnableC0246;
import androidx.media3.decoder.ffmpeg.C0268;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import p378.AbstractC4339;
import p378.AbstractC4345;
import ʻˉ.ᐧˋ;

/* renamed from: ٴᐧ.ᵔٴ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC3448 {
    /* renamed from: ˉי, reason: contains not printable characters */
    public static void m8298(View view, Rect rect) {
        if (view.isAttachedToWindow()) {
            RectF rectF = new RectF();
            rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
            view.getMatrix().mapRect(rectF);
            rectF.offset(view.getLeft(), view.getTop());
            Object parent = view.getParent();
            while (parent instanceof View) {
                View view2 = (View) parent;
                rectF.offset(-view2.getScrollX(), -view2.getScrollY());
                view2.getMatrix().mapRect(rectF);
                rectF.offset(view2.getLeft(), view2.getTop());
                parent = view2.getParent();
            }
            view.getRootView().getLocationOnScreen(new int[2]);
            rectF.offset(r1[0], r1[1]);
            rect.set(Math.round(rectF.left), Math.round(rectF.top), Math.round(rectF.right), Math.round(rectF.bottom));
        }
    }

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public static boolean m8299(List list) {
        return list == null || list.isEmpty();
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public static void m8300(List list, View view) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (list.get(i) == view) {
                return;
            }
        }
        WeakHashMap weakHashMap = AbstractC4345.f16838;
        if (AbstractC4339.m9863(view) != null) {
            list.add(view);
        }
        for (int i2 = size; i2 < list.size(); i2++) {
            View view2 = (View) list.get(i2);
            if (view2 instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view2;
                int childCount = viewGroup.getChildCount();
                for (int i3 = 0; i3 < childCount; i3++) {
                    View childAt = viewGroup.getChildAt(i3);
                    int i4 = 0;
                    while (true) {
                        if (i4 < size) {
                            if (list.get(i4) == childAt) {
                                break;
                            } else {
                                i4++;
                            }
                        } else if (AbstractC4339.m9863(childAt) != null) {
                            list.add(childAt);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: ʽᐧ */
    public abstract void mo6044(Object obj, ArrayList arrayList);

    /* renamed from: ʿʼ */
    public abstract void mo6045(ViewGroup viewGroup, Object obj);

    /* renamed from: ʿˏ */
    public abstract void mo6046(AbstractComponentCallbacksC0100 abstractComponentCallbacksC0100, Object obj, C0268 c0268, RunnableC3441 runnableC3441);

    /* renamed from: ˉⁱ */
    public abstract boolean mo6047();

    /* renamed from: ˋˊ */
    public void mo6048(Object obj, C0268 c0268, RunnableC0246 runnableC0246, Runnable runnable) {
        ((RunnableC3441) runnable).run();
    }

    /* renamed from: ˋⁱ */
    public abstract boolean mo6049(Object obj);

    /* renamed from: ˎٴ */
    public void mo6050(Object obj, float f) {
    }

    /* renamed from: ˏᴵ */
    public abstract Object mo6051(Object obj, Object obj2);

    /* renamed from: ˏᵢ */
    public abstract Object mo6052(Object obj);

    /* renamed from: ˑʽ */
    public void mo6053(Object obj) {
    }

    /* renamed from: ˑי */
    public abstract void mo6054(Object obj, View view, ArrayList arrayList);

    /* renamed from: יʻ */
    public abstract Object mo6055(Object obj);

    /* renamed from: ـﹶ */
    public abstract void mo6056(View view, Object obj);

    /* renamed from: ᐧʻ */
    public abstract boolean mo6057(Object obj);

    /* renamed from: ᴵʿ */
    public abstract Object mo6058(Object obj, Object obj2, Object obj3);

    /* renamed from: ᵎˏ */
    public abstract void mo6059(View view, Object obj);

    /* renamed from: ᵎـ */
    public abstract void mo6060(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2);

    /* renamed from: ﹳˎ */
    public abstract void mo6061(Object obj, Rect rect);

    /* renamed from: ﹳﹳ */
    public void mo6063(Object obj, ᐧˋ r2) {
    }

    /* renamed from: ﹶˆ */
    public Object mo6064(ViewGroup viewGroup, Object obj) {
        return null;
    }

    /* renamed from: ﾞʽ */
    public abstract void mo6065(Object obj, ArrayList arrayList, ArrayList arrayList2);

    /* renamed from: ﾞˊ */
    public abstract void mo6066(Object obj, View view, ArrayList arrayList);
}
