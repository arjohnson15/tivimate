package p013;

import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import p070.AbstractC1549;
import p338.InterfaceC3856;
import p407.InterfaceC4670;
import p407.InterfaceC4671;

/* renamed from: ʻי.ᵎـ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC1052 extends AbstractC1045 {
    /* renamed from: ʻﹳ, reason: contains not printable characters */
    public static Object m4040(AbstractList abstractList) {
        if (abstractList.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return abstractList.remove(AbstractC1037.m4009(abstractList));
    }

    /* renamed from: ˎˉ, reason: contains not printable characters */
    public static final boolean m4041(Iterable iterable, InterfaceC3856 interfaceC3856, boolean z) {
        Iterator it = iterable.iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            if (((Boolean) interfaceC3856.mo4036(it.next())).booleanValue() == z) {
                it.remove();
                z2 = true;
            }
        }
        return z2;
    }

    /* renamed from: יˋ, reason: contains not printable characters */
    public static void m4042(ArrayList arrayList, InterfaceC3856 interfaceC3856) {
        int iM4009;
        if (!(arrayList instanceof RandomAccess)) {
            if (!(arrayList instanceof InterfaceC4671) || (arrayList instanceof InterfaceC4670)) {
                m4041(arrayList, interfaceC3856, true);
                return;
            } else {
                AbstractC1549.m5140(arrayList, "kotlin.collections.MutableIterable");
                throw null;
            }
        }
        int iM40092 = AbstractC1037.m4009(arrayList);
        int i = 0;
        if (iM40092 >= 0) {
            int i2 = 0;
            while (true) {
                Object obj = arrayList.get(i);
                if (!((Boolean) interfaceC3856.mo4036(obj)).booleanValue()) {
                    if (i2 != i) {
                        arrayList.set(i2, obj);
                    }
                    i2++;
                }
                if (i == iM40092) {
                    break;
                } else {
                    i++;
                }
            }
            i = i2;
        }
        if (i >= arrayList.size() || i > (iM4009 = AbstractC1037.m4009(arrayList))) {
            return;
        }
        while (true) {
            arrayList.remove(iM4009);
            if (iM4009 == i) {
                return;
            } else {
                iM4009--;
            }
        }
    }

    /* renamed from: ⁱʿ, reason: contains not printable characters */
    public static void m4043(Iterable iterable, AbstractCollection abstractCollection) {
        if (iterable instanceof Collection) {
            abstractCollection.addAll((Collection) iterable);
            return;
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            abstractCollection.add(it.next());
        }
    }
}
