package androidx.work;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import p065.C1496;
import p457.AbstractC5382;
import p457.C5363;

/* loaded from: classes.dex */
public final class OverwritingInputMerger extends AbstractC5382 {
    @Override // p457.AbstractC5382
    /* renamed from: ـﹶ */
    public final C5363 mo1366(ArrayList arrayList) {
        C1496 c1496 = new C1496(2);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            linkedHashMap.putAll(DesugarCollections.unmodifiableMap(((C5363) it.next()).f20821));
        }
        c1496.m5061(linkedHashMap);
        return c1496.m5058();
    }
}
