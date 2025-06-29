package androidx.fragment.app;

import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.RunnableC0246;
import androidx.media3.decoder.ffmpeg.C0268;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import p013.AbstractC1039;
import p013.AbstractC1041;
import p041.C1275;
import p070.C1561;
import p139.C2125;
import p141.RunnableC2187;
import p200.C2741;
import p226.C3026;
import p288.C3395;
import p291.AbstractC3436;
import p291.AbstractC3448;
import p291.AbstractC3459;
import p291.C3432;
import p291.C3449;
import p291.C3456;
import p291.RunnableC3412;
import p291.RunnableC3441;
import p338.InterfaceC3865;
import p378.AbstractC4339;
import p378.AbstractC4345;
import p378.ViewTreeObserverOnPreDrawListenerC4351;

/* renamed from: androidx.fragment.app.ᐧʻ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0107 extends AbstractC3459 {

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final C0091 f658;

    /* renamed from: ˉי, reason: contains not printable characters */
    public final C2741 f659;

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public final ArrayList f660;

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public final C2741 f661;

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public final ArrayList f662;

    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public final boolean f663;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final ArrayList f664;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final ArrayList f665;

    /* renamed from: ˑי, reason: contains not printable characters */
    public final C0268 f666 = new C0268();

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final AbstractC3448 f667;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final Object f668;

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public final C2741 f669;

    /* renamed from: ᵎـ, reason: contains not printable characters */
    public Object f670;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final C0091 f671;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final ArrayList f672;

    public C0107(ArrayList arrayList, C0091 c0091, C0091 c00912, AbstractC3448 abstractC3448, Object obj, ArrayList arrayList2, ArrayList arrayList3, C2741 c2741, ArrayList arrayList4, ArrayList arrayList5, C2741 c27412, C2741 c27413, boolean z) {
        this.f665 = arrayList;
        this.f671 = c0091;
        this.f658 = c00912;
        this.f667 = abstractC3448;
        this.f668 = obj;
        this.f664 = arrayList2;
        this.f672 = arrayList3;
        this.f659 = c2741;
        this.f662 = arrayList4;
        this.f660 = arrayList5;
        this.f661 = c27412;
        this.f669 = c27413;
        this.f663 = z;
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public static void m709(View view, ArrayList arrayList) {
        if (!(view instanceof ViewGroup)) {
            if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(view);
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        if (viewGroup.isTransitionGroup()) {
            if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(view);
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt.getVisibility() == 0) {
                m709(childAt, arrayList);
            }
        }
    }

    @Override // p291.AbstractC3459
    /* renamed from: ʽᐧ */
    public final void mo588(ViewGroup viewGroup) {
        C0268 c0268 = this.f666;
        synchronized (c0268) {
            try {
                if (c0268.f1401) {
                    return;
                }
                c0268.f1401 = true;
                c0268.f1399 = true;
                C2125 c2125 = (C2125) c0268.f1400;
                if (c2125 != null) {
                    try {
                        c2125.m6025();
                    } catch (Throwable th) {
                        synchronized (c0268) {
                            c0268.f1399 = false;
                            c0268.notifyAll();
                            throw th;
                        }
                    }
                }
                synchronized (c0268) {
                    c0268.f1399 = false;
                    c0268.notifyAll();
                }
            } finally {
            }
        }
    }

    @Override // p291.AbstractC3459
    /* renamed from: ʿʼ */
    public final void mo589(ViewGroup viewGroup) {
        Object obj;
        boolean zIsLaidOut = viewGroup.isLaidOut();
        ArrayList arrayList = this.f665;
        if (!zIsLaidOut) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C0091 c0091 = ((C3456) it.next()).f657;
                if (Log.isLoggable("FragmentManager", 2)) {
                    String str = "SpecialEffectsController: Container " + viewGroup + " has not been laid out. Skipping onStart for operation " + c0091;
                }
            }
            return;
        }
        boolean zM710 = m710();
        C0091 c00912 = this.f658;
        C0091 c00913 = this.f671;
        if (zM710 && (obj = this.f668) != null && !mo711()) {
            String str2 = "Ignoring shared elements transition " + obj + " between " + c00913 + " and " + c00912 + " as neither fragment has set a Transition. In order to run a SharedElementTransition, you must also set either an enter or exit transition on a fragment involved in the transaction. The sharedElementTransition will run after the back gesture has been committed.";
        }
        if (!mo711() || !m710()) {
            return;
        }
        C1561 c1561 = new C1561();
        C3395 c3395M712 = m712(viewGroup, c00912, c00913);
        ArrayList arrayList2 = (ArrayList) c3395M712.f13245;
        ArrayList arrayList3 = new ArrayList(AbstractC1039.m4012(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList3.add(((C3456) it2.next()).f657);
        }
        Iterator it3 = arrayList3.iterator();
        while (true) {
            boolean zHasNext = it3.hasNext();
            Object obj2 = c3395M712.f13244;
            if (!zHasNext) {
                m713(arrayList2, viewGroup, new C3432(this, viewGroup, obj2, c1561));
                return;
            }
            C0091 c00914 = (C0091) it3.next();
            RunnableC0246 runnableC0246 = new RunnableC0246(17, c1561);
            AbstractComponentCallbacksC0100 abstractComponentCallbacksC0100 = c00914.f555;
            this.f667.mo6048(obj2, this.f666, runnableC0246, new RunnableC3441(c00914, this, 0));
        }
    }

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final boolean m710() {
        ArrayList arrayList = this.f665;
        if (arrayList.isEmpty()) {
            return true;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (!((C3456) it.next()).f657.f555.mTransitioning) {
                return false;
            }
        }
        return true;
    }

    @Override // p291.AbstractC3459
    /* renamed from: ˑʽ */
    public final void mo590(ViewGroup viewGroup) {
        Object obj;
        boolean zIsLaidOut = viewGroup.isLaidOut();
        ArrayList<C3456> arrayList = this.f665;
        if (!zIsLaidOut) {
            for (C3456 c3456 : arrayList) {
                C0091 c0091 = c3456.f657;
                if (Log.isLoggable("FragmentManager", 2)) {
                    String str = "SpecialEffectsController: Container " + viewGroup + " has not been laid out. Completing operation " + c0091;
                }
                c3456.f657.m602(this);
            }
            return;
        }
        Object obj2 = this.f670;
        AbstractC3448 abstractC3448 = this.f667;
        C0091 c00912 = this.f658;
        C0091 c00913 = this.f671;
        if (obj2 != null) {
            abstractC3448.mo6053(obj2);
            if (Log.isLoggable("FragmentManager", 2)) {
                String str2 = "Ending execution of operations from " + c00913 + " to " + c00912;
                return;
            }
            return;
        }
        C3395 c3395M712 = m712(viewGroup, c00912, c00913);
        ArrayList arrayList2 = (ArrayList) c3395M712.f13245;
        ArrayList arrayList3 = new ArrayList(AbstractC1039.m4012(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList3.add(((C3456) it.next()).f657);
        }
        Iterator it2 = arrayList3.iterator();
        while (true) {
            boolean zHasNext = it2.hasNext();
            obj = c3395M712.f13244;
            if (!zHasNext) {
                break;
            }
            C0091 c00914 = (C0091) it2.next();
            abstractC3448.mo6046(c00914.f555, obj, this.f666, new RunnableC3441(c00914, this, 1));
        }
        m713(arrayList2, viewGroup, new C1275(this, viewGroup, obj, 2));
        if (Log.isLoggable("FragmentManager", 2)) {
            String str3 = "Completed executing operations from " + c00913 + " to " + c00912;
        }
    }

    @Override // p291.AbstractC3459
    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final boolean mo711() {
        Object obj;
        Object obj2;
        AbstractC3448 abstractC3448 = this.f667;
        if (abstractC3448.mo6047()) {
            ArrayList<C3456> arrayList = this.f665;
            if (!arrayList.isEmpty()) {
                for (C3456 c3456 : arrayList) {
                    if (Build.VERSION.SDK_INT < 34 || (obj2 = c3456.f13380) == null || !abstractC3448.mo6049(obj2)) {
                        break;
                    }
                }
                obj = this.f668;
                if (obj != null) {
                }
                return true;
            }
            obj = this.f668;
            if (obj != null || abstractC3448.mo6049(obj)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final C3395 m712(ViewGroup viewGroup, C0091 c0091, C0091 c00912) {
        ArrayList arrayList;
        ArrayList arrayList2;
        AbstractC3448 abstractC3448;
        Object obj;
        C3456 c3456;
        Iterator it;
        View view;
        C0091 c00913 = c0091;
        C0091 c00914 = c00912;
        View view2 = new View(viewGroup.getContext());
        Rect rect = new Rect();
        ArrayList arrayList3 = this.f665;
        Iterator it2 = arrayList3.iterator();
        View view3 = null;
        boolean z = false;
        while (true) {
            boolean zHasNext = it2.hasNext();
            arrayList = this.f672;
            arrayList2 = this.f664;
            abstractC3448 = this.f667;
            obj = this.f668;
            if (!zHasNext) {
                break;
            }
            if (((C3456) it2.next()).f13382 == null || c00914 == null || c00913 == null || this.f659.isEmpty() || obj == null) {
                it = it2;
            } else {
                C2741 c2741 = this.f661;
                C3449 c3449 = AbstractC3436.f13331;
                if (this.f663) {
                    c00914.f555.getEnterTransitionCallback();
                } else {
                    c00913.f555.getEnterTransitionCallback();
                }
                it = it2;
                ViewTreeObserverOnPreDrawListenerC4351.m9908(viewGroup, new RunnableC2187(c00913, c00914, this, 4));
                arrayList2.addAll(c2741.values());
                ArrayList arrayList4 = this.f660;
                if (!arrayList4.isEmpty()) {
                    View view4 = (View) c2741.get((String) arrayList4.get(0));
                    abstractC3448.mo6059(view4, obj);
                    view3 = view4;
                }
                C2741 c27412 = this.f669;
                arrayList.addAll(c27412.values());
                ArrayList arrayList5 = this.f662;
                if (!arrayList5.isEmpty() && (view = (View) c27412.get((String) arrayList5.get(0))) != null) {
                    ViewTreeObserverOnPreDrawListenerC4351.m9908(viewGroup, new ʻˉ.ᐧˋ(abstractC3448, view, rect));
                    z = true;
                }
                abstractC3448.mo6066(obj, view2, arrayList2);
                Object obj2 = this.f668;
                abstractC3448.mo6060(obj2, null, null, obj2, arrayList);
            }
            it2 = it;
        }
        ArrayList arrayList6 = new ArrayList();
        Iterator it3 = arrayList3.iterator();
        Object objMo6051 = null;
        Object objMo60512 = null;
        while (it3.hasNext()) {
            Iterator it4 = it3;
            C3456 c34562 = (C3456) it3.next();
            Object obj3 = objMo60512;
            C0091 c00915 = c34562.f657;
            Object obj4 = objMo6051;
            Object objMo6052 = abstractC3448.mo6052(c34562.f13380);
            if (objMo6052 != null) {
                ArrayList arrayList7 = new ArrayList();
                View view5 = view3;
                m709(c00915.f555.mView, arrayList7);
                if (obj != null && (c00915 == c00914 || c00915 == c00913)) {
                    if (c00915 == c00914) {
                        arrayList7.removeAll(AbstractC1041.m4029(arrayList2));
                    } else {
                        arrayList7.removeAll(AbstractC1041.m4029(arrayList));
                    }
                }
                if (arrayList7.isEmpty()) {
                    abstractC3448.mo6056(view2, objMo6052);
                } else {
                    abstractC3448.mo6044(objMo6052, arrayList7);
                    abstractC3448.mo6060(objMo6052, objMo6052, arrayList7, null, null);
                    if (c00915.f556 == 3) {
                        c00915.f560 = false;
                        ArrayList arrayList8 = new ArrayList(arrayList7);
                        AbstractComponentCallbacksC0100 abstractComponentCallbacksC0100 = c00915.f555;
                        arrayList8.remove(abstractComponentCallbacksC0100.mView);
                        abstractC3448.mo6054(objMo6052, abstractComponentCallbacksC0100.mView, arrayList8);
                        ViewTreeObserverOnPreDrawListenerC4351.m9908(viewGroup, new RunnableC0246(18, arrayList7));
                    }
                }
                if (c00915.f556 == 2) {
                    arrayList6.addAll(arrayList7);
                    if (z) {
                        abstractC3448.mo6061(objMo6052, rect);
                    }
                    if (Log.isLoggable("FragmentManager", 2)) {
                        String str = "Entering Transition: " + objMo6052;
                        Iterator it5 = arrayList7.iterator();
                        while (it5.hasNext()) {
                            String str2 = "View: " + ((View) it5.next());
                        }
                    }
                    c3456 = c34562;
                    view3 = view5;
                } else {
                    view3 = view5;
                    abstractC3448.mo6059(view3, objMo6052);
                    if (Log.isLoggable("FragmentManager", 2)) {
                        String str3 = "Exiting Transition: " + objMo6052;
                        Iterator it6 = arrayList7.iterator();
                        while (it6.hasNext()) {
                            String str4 = "View: " + ((View) it6.next());
                        }
                    }
                    c3456 = c34562;
                }
                if (c3456.f13381) {
                    objMo6051 = abstractC3448.mo6051(obj4, objMo6052);
                    c00913 = c0091;
                    c00914 = c00912;
                    it3 = it4;
                    objMo60512 = obj3;
                } else {
                    objMo60512 = abstractC3448.mo6051(obj3, objMo6052);
                    c00914 = c00912;
                    objMo6051 = obj4;
                    it3 = it4;
                    c00913 = c0091;
                }
            } else {
                objMo6051 = obj4;
                objMo60512 = obj3;
                it3 = it4;
                c00913 = c0091;
                c00914 = c00912;
            }
        }
        Object objMo6058 = abstractC3448.mo6058(objMo6051, objMo60512, obj);
        if (Log.isLoggable("FragmentManager", 2)) {
            String str5 = "Final merged transition: " + objMo6058;
        }
        return new C3395(arrayList6, objMo6058);
    }

    @Override // p291.AbstractC3459
    /* renamed from: ﹳﹳ */
    public final void mo591(C3026 c3026) {
        Object obj = this.f670;
        if (obj != null) {
            this.f667.mo6050(obj, c3026.f11701);
        }
    }

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final void m713(ArrayList arrayList, ViewGroup viewGroup, InterfaceC3865 interfaceC3865) {
        AbstractC3436.m8293(4, arrayList);
        AbstractC3448 abstractC3448 = this.f667;
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = this.f672;
        int size = arrayList3.size();
        for (int i = 0; i < size; i++) {
            View view = (View) arrayList3.get(i);
            WeakHashMap weakHashMap = AbstractC4345.f16838;
            arrayList2.add(AbstractC4339.m9863(view));
            AbstractC4339.m9864(view, null);
        }
        boolean zIsLoggable = Log.isLoggable("FragmentManager", 2);
        ArrayList arrayList4 = this.f664;
        if (zIsLoggable) {
            Iterator it = arrayList4.iterator();
            while (it.hasNext()) {
                View view2 = (View) it.next();
                StringBuilder sb = new StringBuilder("View: ");
                sb.append(view2);
                sb.append(" Name: ");
                WeakHashMap weakHashMap2 = AbstractC4345.f16838;
                sb.append(AbstractC4339.m9863(view2));
                sb.toString();
            }
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                View view3 = (View) it2.next();
                StringBuilder sb2 = new StringBuilder("View: ");
                sb2.append(view3);
                sb2.append(" Name: ");
                WeakHashMap weakHashMap3 = AbstractC4345.f16838;
                sb2.append(AbstractC4339.m9863(view3));
                sb2.toString();
            }
        }
        interfaceC3865.mo1053();
        int size2 = arrayList3.size();
        ArrayList arrayList5 = new ArrayList();
        for (int i2 = 0; i2 < size2; i2++) {
            View view4 = (View) arrayList4.get(i2);
            WeakHashMap weakHashMap4 = AbstractC4345.f16838;
            String strM9863 = AbstractC4339.m9863(view4);
            arrayList5.add(strM9863);
            if (strM9863 != null) {
                AbstractC4339.m9864(view4, null);
                String str = (String) this.f659.get(strM9863);
                int i3 = 0;
                while (true) {
                    if (i3 >= size2) {
                        break;
                    }
                    if (str.equals(arrayList2.get(i3))) {
                        AbstractC4339.m9864((View) arrayList3.get(i3), strM9863);
                        break;
                    }
                    i3++;
                }
            }
        }
        ViewTreeObserverOnPreDrawListenerC4351.m9908(viewGroup, new RunnableC3412(size2, arrayList3, arrayList2, arrayList4, arrayList5));
        AbstractC3436.m8293(0, arrayList);
        abstractC3448.mo6065(this.f668, arrayList4, arrayList3);
    }
}
