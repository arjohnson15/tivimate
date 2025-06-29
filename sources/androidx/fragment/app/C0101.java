package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.WeakHashMap;
import org.lsposed.hiddenapibypass.library.R;
import p013.AbstractC1041;
import p013.AbstractC1052;
import p070.AbstractC1549;
import p200.C2741;
import p291.AbstractC3459;
import p291.RunnableC3413;
import p378.AbstractC4339;
import p378.AbstractC4345;
import ـˈ.ˉᵎ;

/* renamed from: androidx.fragment.app.ˏᵢ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0101 {

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public boolean f589;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final ViewGroup f591;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public boolean f592;

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final ArrayList f588 = new ArrayList();

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final ArrayList f590 = new ArrayList();

    public C0101(ViewGroup viewGroup) {
        this.f591 = viewGroup;
    }

    /* renamed from: ˉי, reason: contains not printable characters */
    public static final C0101 m616(ViewGroup viewGroup, AbstractC0104 abstractC0104) {
        abstractC0104.m695();
        Object tag = viewGroup.getTag(R.id._2_res_0x7f0b0358);
        if (tag instanceof C0101) {
            return (C0101) tag;
        }
        C0101 c0101 = new C0101(viewGroup);
        viewGroup.setTag(R.id._2_res_0x7f0b0358, c0101);
        return c0101;
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public static void m617(C2741 c2741, View view) {
        WeakHashMap weakHashMap = AbstractC4345.f16838;
        String strM9863 = AbstractC4339.m9863(view);
        if (strM9863 != null) {
            c2741.put(strM9863, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt.getVisibility() == 0) {
                    m617(c2741, childAt);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0455 A[LOOP:7: B:162:0x044f->B:164:0x0455, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0472  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x04e6  */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v7, types: [java.lang.Object] */
    /* renamed from: ʽᐧ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m618(java.util.ArrayList r27, boolean r28) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 1332
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C0101.m618(java.util.ArrayList, boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:80:0x0166  */
    /* renamed from: ʿʼ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m619() {
        /*
            Method dump skipped, instructions count: 411
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C0101.m619():void");
    }

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public final void m620(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C0091 c0091 = (C0091) arrayList.get(i);
            if (!c0091.f554) {
                c0091.f554 = true;
                int i2 = c0091.f549;
                C0109 c0109 = c0091.f552;
                if (i2 == 2) {
                    AbstractComponentCallbacksC0100 abstractComponentCallbacksC0100 = c0109.f677;
                    View viewFindFocus = abstractComponentCallbacksC0100.mView.findFocus();
                    if (viewFindFocus != null) {
                        abstractComponentCallbacksC0100.setFocusedView(viewFindFocus);
                        if (Log.isLoggable("FragmentManager", 2)) {
                            String str = "requestFocus: Saved focused view " + viewFindFocus + " for Fragment " + abstractComponentCallbacksC0100;
                        }
                    }
                    View viewRequireView = c0091.f555.requireView();
                    if (viewRequireView.getParent() == null) {
                        c0109.m714();
                        viewRequireView.setAlpha(0.0f);
                    }
                    if (viewRequireView.getAlpha() == 0.0f && viewRequireView.getVisibility() == 0) {
                        viewRequireView.setVisibility(4);
                    }
                    viewRequireView.setAlpha(abstractComponentCallbacksC0100.getPostOnViewCreatedAlpha());
                } else if (i2 == 3) {
                    AbstractComponentCallbacksC0100 abstractComponentCallbacksC01002 = c0109.f677;
                    View viewRequireView2 = abstractComponentCallbacksC01002.requireView();
                    if (Log.isLoggable("FragmentManager", 2)) {
                        String str2 = "Clearing focus " + viewRequireView2.findFocus() + " on view " + viewRequireView2 + " for Fragment " + abstractComponentCallbacksC01002;
                    }
                    viewRequireView2.clearFocus();
                }
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AbstractC1052.m4043(((C0091) it.next()).f553, arrayList2);
        }
        List listM4016 = AbstractC1041.m4016(AbstractC1041.m4029(arrayList2));
        int size2 = listM4016.size();
        for (int i3 = 0; i3 < size2; i3++) {
            AbstractC3459 abstractC3459 = (AbstractC3459) listM4016.get(i3);
            if (!abstractC3459.f13390) {
                abstractC3459.mo589(this.f591);
            }
            abstractC3459.f13390 = true;
        }
    }

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public final void m621() {
        Iterator it = this.f588.iterator();
        while (it.hasNext()) {
            C0091 c0091 = (C0091) it.next();
            int i = 2;
            if (c0091.f549 == 2) {
                int visibility = c0091.f555.requireView().getVisibility();
                if (visibility != 0) {
                    i = 4;
                    if (visibility != 4) {
                        if (visibility != 8) {
                            throw new IllegalArgumentException(ˉᵎ.ˉⁱ("Unknown visibility ", visibility));
                        }
                        i = 3;
                    }
                }
                c0091.m604(i, 1);
            }
        }
    }

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public final void m622() {
        Object objPrevious;
        synchronized (this.f588) {
            try {
                m621();
                ArrayList arrayList = this.f588;
                ListIterator listIterator = arrayList.listIterator(arrayList.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        objPrevious = null;
                        break;
                    }
                    objPrevious = listIterator.previous();
                    C0091 c0091 = (C0091) objPrevious;
                    View view = c0091.f555.mView;
                    char c = 4;
                    if (view.getAlpha() != 0.0f || view.getVisibility() != 0) {
                        int visibility = view.getVisibility();
                        if (visibility == 0) {
                            c = 2;
                        } else if (visibility != 4) {
                            if (visibility != 8) {
                                throw new IllegalArgumentException("Unknown visibility " + visibility);
                            }
                            c = 3;
                        }
                    }
                    if (c0091.f556 == 2 && c != 2) {
                        break;
                    }
                }
                C0091 c00912 = (C0091) objPrevious;
                AbstractComponentCallbacksC0100 abstractComponentCallbacksC0100 = c00912 != null ? c00912.f555 : null;
                this.f589 = abstractComponentCallbacksC0100 != null ? abstractComponentCallbacksC0100.isPostponed() : false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final C0091 m623(AbstractComponentCallbacksC0100 abstractComponentCallbacksC0100) {
        Object next;
        Iterator it = this.f590.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            C0091 c0091 = (C0091) next;
            if (AbstractC1549.m5138(c0091.f555, abstractComponentCallbacksC0100) && !c0091.f550) {
                break;
            }
        }
        return (C0091) next;
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final void m624(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AbstractC1052.m4043(((C0091) it.next()).f553, arrayList2);
        }
        List listM4016 = AbstractC1041.m4016(AbstractC1041.m4029(arrayList2));
        int size = listM4016.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC3459) listM4016.get(i)).mo590(this.f591);
        }
        int size2 = arrayList.size();
        for (int i2 = 0; i2 < size2; i2++) {
            m625((C0091) arrayList.get(i2));
        }
        List listM40162 = AbstractC1041.m4016(arrayList);
        int size3 = listM40162.size();
        for (int i3 = 0; i3 < size3; i3++) {
            C0091 c0091 = (C0091) listM40162.get(i3);
            if (c0091.f553.isEmpty()) {
                c0091.m601();
            }
        }
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void m625(C0091 c0091) {
        if (c0091.f560) {
            ˉᵎ.ـﹶ(c0091.f556, c0091.f555.requireView(), this.f591);
            c0091.f560 = false;
        }
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final C0091 m626(AbstractComponentCallbacksC0100 abstractComponentCallbacksC0100) {
        Object next;
        Iterator it = this.f588.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            C0091 c0091 = (C0091) next;
            if (AbstractC1549.m5138(c0091.f555, abstractComponentCallbacksC0100) && !c0091.f550) {
                break;
            }
        }
        return (C0091) next;
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final void m627(int i, int i2, C0109 c0109) {
        synchronized (this.f588) {
            try {
                C0091 c0091M626 = m626(c0109.f677);
                if (c0091M626 == null) {
                    AbstractComponentCallbacksC0100 abstractComponentCallbacksC0100 = c0109.f677;
                    c0091M626 = abstractComponentCallbacksC0100.mTransitioning ? m623(abstractComponentCallbacksC0100) : null;
                }
                if (c0091M626 != null) {
                    c0091M626.m604(i, i2);
                    return;
                }
                final C0091 c0091 = new C0091(i, i2, c0109);
                this.f588.add(c0091);
                c0091.f559.add(new Runnable() { // from class: androidx.fragment.app.ᐧˋ
                    @Override // java.lang.Runnable
                    public final void run() {
                        C0101 c0101 = this.f674;
                        ArrayList arrayList = c0101.f588;
                        C0091 c00912 = c0091;
                        if (arrayList.contains(c00912)) {
                            ˉᵎ.ـﹶ(c00912.f556, c00912.f555.mView, c0101.f591);
                        }
                    }
                });
                c0091.f559.add(new RunnableC3413(this, c0091, 1));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final void m628() {
        String str;
        String str2;
        if (Log.isLoggable("FragmentManager", 2)) {
        }
        boolean zIsAttachedToWindow = this.f591.isAttachedToWindow();
        synchronized (this.f588) {
            try {
                m621();
                m620(this.f588);
                Iterator it = new ArrayList(this.f590).iterator();
                while (it.hasNext()) {
                    C0091 c0091 = (C0091) it.next();
                    if (Log.isLoggable("FragmentManager", 2)) {
                        if (zIsAttachedToWindow) {
                            str2 = "";
                        } else {
                            str2 = "Container " + this.f591 + " is not attached to window. ";
                        }
                        String str3 = "SpecialEffectsController: " + str2 + "Cancelling running operation " + c0091;
                    }
                    c0091.m603(this.f591);
                }
                Iterator it2 = new ArrayList(this.f588).iterator();
                while (it2.hasNext()) {
                    C0091 c00912 = (C0091) it2.next();
                    if (Log.isLoggable("FragmentManager", 2)) {
                        if (zIsAttachedToWindow) {
                            str = "";
                        } else {
                            str = "Container " + this.f591 + " is not attached to window. ";
                        }
                        String str4 = "SpecialEffectsController: " + str + "Cancelling pending operation " + c00912;
                    }
                    c00912.m603(this.f591);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
