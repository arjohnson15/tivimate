package androidx.fragment.app;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import p291.C3414;
import p291.InterfaceC3418;
import ـˈ.ˉᵎ;

/* renamed from: androidx.fragment.app.ﾞʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0117 implements InterfaceC3418 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC0104 f710;

    public C0117(AbstractC0104 abstractC0104) {
        this.f710 = abstractC0104;
    }

    @Override // p291.InterfaceC3418
    /* renamed from: ـﹶ */
    public final boolean mo703(ArrayList arrayList, ArrayList arrayList2) {
        AbstractC0104 abstractC0104 = this.f710;
        C0105 c0105 = (C0105) ˉᵎ.ﹶˆ(1, abstractC0104.f631);
        abstractC0104.f611 = c0105;
        Iterator it = c0105.f648.iterator();
        while (it.hasNext()) {
            AbstractComponentCallbacksC0100 abstractComponentCallbacksC0100 = ((C3414) it.next()).f13278;
            if (abstractComponentCallbacksC0100 != null) {
                abstractComponentCallbacksC0100.mTransitioning = true;
            }
        }
        boolean zM653 = abstractC0104.m653(arrayList, arrayList2, -1, 0);
        if (!abstractC0104.f624.isEmpty() && arrayList.size() > 0) {
            ((Boolean) arrayList2.get(arrayList.size() - 1)).getClass();
            LinkedHashSet<AbstractComponentCallbacksC0100> linkedHashSet = new LinkedHashSet();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                linkedHashSet.addAll(AbstractC0104.m632((C0105) it2.next()));
            }
            Iterator it3 = abstractC0104.f624.iterator();
            while (it3.hasNext()) {
                ٴˉ.ﹳﹳ r0 = (ٴˉ.ﹳﹳ) it3.next();
                for (AbstractComponentCallbacksC0100 abstractComponentCallbacksC01002 : linkedHashSet) {
                    r0.getClass();
                }
            }
        }
        return zM653;
    }
}
