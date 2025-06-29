package androidx.fragment.app;

import android.util.Log;
import androidx.lifecycle.RunnableC0246;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.CopyOnWriteArrayList;
import p070.C1554;
import p291.C3414;

/* renamed from: androidx.fragment.app.ﾞˊ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0118 {

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public C1554 f712;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC0104 f714;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public boolean f713 = false;

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final CopyOnWriteArrayList f711 = new CopyOnWriteArrayList();

    public C0118(AbstractC0104 abstractC0104) {
        this.f714 = abstractC0104;
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final void m745() {
        boolean zIsLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractC0104 abstractC0104 = this.f714;
        if (zIsLoggable) {
            String str = "handleOnBackPressed. PREDICTIVE_BACK = true fragment manager " + abstractC0104;
        }
        abstractC0104.m644(true);
        C0105 c0105 = abstractC0104.f611;
        C0118 c0118 = abstractC0104.f633;
        if (c0105 == null) {
            if (c0118.f713) {
                if (Log.isLoggable("FragmentManager", 3)) {
                }
                abstractC0104.m694();
                return;
            } else {
                if (Log.isLoggable("FragmentManager", 3)) {
                }
                abstractC0104.f620.m7526();
                return;
            }
        }
        ArrayList arrayList = abstractC0104.f624;
        if (!arrayList.isEmpty()) {
            LinkedHashSet<AbstractComponentCallbacksC0100> linkedHashSet = new LinkedHashSet(AbstractC0104.m632(abstractC0104.f611));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ٴˉ.ﹳﹳ r7 = (ٴˉ.ﹳﹳ) it.next();
                for (AbstractComponentCallbacksC0100 abstractComponentCallbacksC0100 : linkedHashSet) {
                    r7.getClass();
                }
            }
        }
        Iterator it2 = abstractC0104.f611.f648.iterator();
        while (it2.hasNext()) {
            AbstractComponentCallbacksC0100 abstractComponentCallbacksC01002 = ((C3414) it2.next()).f13278;
            if (abstractComponentCallbacksC01002 != null) {
                abstractComponentCallbacksC01002.mTransitioning = false;
            }
        }
        Iterator it3 = abstractC0104.m671(new ArrayList(Collections.singletonList(abstractC0104.f611)), 0, 1).iterator();
        while (it3.hasNext()) {
            C0101 c0101 = (C0101) it3.next();
            c0101.getClass();
            if (Log.isLoggable("FragmentManager", 3)) {
            }
            ArrayList arrayList2 = c0101.f590;
            c0101.m620(arrayList2);
            c0101.m624(arrayList2);
        }
        Iterator it4 = abstractC0104.f611.f648.iterator();
        while (it4.hasNext()) {
            AbstractComponentCallbacksC0100 abstractComponentCallbacksC01003 = ((C3414) it4.next()).f13278;
            if (abstractComponentCallbacksC01003 != null && abstractComponentCallbacksC01003.mContainer == null) {
                abstractC0104.m674(abstractComponentCallbacksC01003).m719();
            }
        }
        abstractC0104.f611 = null;
        abstractC0104.m663();
        if (Log.isLoggable("FragmentManager", 3)) {
            String str2 = "OnBackPressedCallback enabled=" + c0118.f713 + " for  FragmentManager " + abstractC0104;
        }
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void m746() {
        boolean zIsLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractC0104 abstractC0104 = this.f714;
        if (zIsLoggable) {
            String str = "handleOnBackCancelled. PREDICTIVE_BACK = true fragment manager " + abstractC0104;
        }
        C0105 c0105 = abstractC0104.f611;
        if (c0105 != null) {
            c0105.f652 = false;
            RunnableC0246 runnableC0246 = new RunnableC0246(19, abstractC0104);
            if (c0105.f653 == null) {
                c0105.f653 = new ArrayList();
            }
            c0105.f653.add(runnableC0246);
            abstractC0104.f611.m697(false);
            abstractC0104.m644(true);
            abstractC0104.m643();
        }
        abstractC0104.f611 = null;
    }
}
