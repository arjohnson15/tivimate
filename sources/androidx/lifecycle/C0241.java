package androidx.lifecycle;

import java.util.Iterator;
import java.util.LinkedHashMap;

/* renamed from: androidx.lifecycle.ٴᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0241 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final LinkedHashMap f1281 = new LinkedHashMap();

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void m1039() {
        LinkedHashMap linkedHashMap = this.f1281;
        Iterator it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            ((AbstractC0207) it.next()).m1001();
        }
        linkedHashMap.clear();
    }
}
