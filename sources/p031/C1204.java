package p031;

import com.bumptech.glide.ˑʽ;
import com.bumptech.glide.ﹳﹳ;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.InvalidRegistrarException;
import com.google.firebase.components.MissingDependencyException;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import p266.C3264;
import p292.InterfaceC3461;
import p292.InterfaceC3462;
import p450.InterfaceC5190;
import ʻˉ.ᐧˋ;

/* renamed from: ʼـ.ﹶˆ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1204 implements InterfaceC1203 {

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public static final C1198 f4947 = new C1198(0);

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final C1189 f4949;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public final C3264 f4954;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final HashMap f4952 = new HashMap();

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final HashMap f4948 = new HashMap();

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final HashMap f4950 = new HashMap();

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final HashSet f4951 = new HashSet();

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final AtomicReference f4953 = new AtomicReference();

    public C1204(ArrayList arrayList, ArrayList arrayList2, C3264 c3264) {
        C1189 c1189 = new C1189();
        this.f4949 = c1189;
        this.f4954 = c3264;
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add(C1194.m4246(c1189, C1189.class, InterfaceC3461.class, InterfaceC3462.class));
        arrayList3.add(C1194.m4246(this, C1204.class, new Class[0]));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            C1194 c1194 = (C1194) it.next();
            if (c1194 != null) {
                arrayList3.add(c1194);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList4.add(it2.next());
        }
        ArrayList arrayList5 = new ArrayList();
        synchronized (this) {
            Iterator it3 = arrayList4.iterator();
            while (it3.hasNext()) {
                try {
                    ComponentRegistrar componentRegistrar = (ComponentRegistrar) ((InterfaceC5190) it3.next()).get();
                    if (componentRegistrar != null) {
                        arrayList3.addAll(this.f4954.m8050(componentRegistrar));
                        it3.remove();
                    }
                } catch (InvalidRegistrarException e) {
                    it3.remove();
                }
            }
            Iterator it4 = arrayList3.iterator();
            while (it4.hasNext()) {
                Object[] array = ((C1194) it4.next()).f4926.toArray();
                int length = array.length;
                int i = 0;
                while (true) {
                    if (i < length) {
                        Object obj = array[i];
                        if (obj.toString().contains("kotlinx.coroutines.CoroutineDispatcher")) {
                            if (this.f4951.contains(obj.toString())) {
                                it4.remove();
                                break;
                            }
                            this.f4951.add(obj.toString());
                        }
                        i++;
                    }
                }
            }
            if (this.f4952.isEmpty()) {
                ˑʽ.ﹶˆ(arrayList3);
            } else {
                ArrayList arrayList6 = new ArrayList(this.f4952.keySet());
                arrayList6.addAll(arrayList3);
                ˑʽ.ﹶˆ(arrayList6);
            }
            Iterator it5 = arrayList3.iterator();
            while (it5.hasNext()) {
                C1194 c11942 = (C1194) it5.next();
                this.f4952.put(c11942, new C1199(new C1193(this, 0, c11942)));
            }
            arrayList5.addAll(m4263(arrayList3));
            arrayList5.addAll(m4260());
            m4261();
        }
        Iterator it6 = arrayList5.iterator();
        while (it6.hasNext()) {
            ((Runnable) it6.next()).run();
        }
        Boolean bool = (Boolean) this.f4953.get();
        if (bool != null) {
            m4262(this.f4952, bool.booleanValue());
        }
    }

    @Override // p031.InterfaceC1203
    /* renamed from: ʽᐧ */
    public final synchronized InterfaceC5190 mo4254(C1200 c1200) {
        ﹳﹳ.ᐧʻ(c1200, "Null interface requested.");
        return (InterfaceC5190) this.f4948.get(c1200);
    }

    @Override // p031.InterfaceC1203
    /* renamed from: ʿʼ */
    public final Object mo4255(C1200 c1200) {
        InterfaceC5190 interfaceC5190Mo4254 = mo4254(c1200);
        if (interfaceC5190Mo4254 == null) {
            return null;
        }
        return interfaceC5190Mo4254.get();
    }

    /* renamed from: ˉי, reason: contains not printable characters */
    public final ArrayList m4260() {
        ArrayList arrayList = new ArrayList();
        HashMap map = new HashMap();
        for (Map.Entry entry : this.f4952.entrySet()) {
            C1194 c1194 = (C1194) entry.getKey();
            if (c1194.f4927 != 0) {
                InterfaceC5190 interfaceC5190 = (InterfaceC5190) entry.getValue();
                for (C1200 c1200 : c1194.f4926) {
                    if (!map.containsKey(c1200)) {
                        map.put(c1200, new HashSet());
                    }
                    ((Set) map.get(c1200)).add(interfaceC5190);
                }
            }
        }
        for (Map.Entry entry2 : map.entrySet()) {
            Object key = entry2.getKey();
            HashMap map2 = this.f4950;
            if (map2.containsKey(key)) {
                C1192 c1192 = (C1192) map2.get(entry2.getKey());
                Iterator it = ((Set) entry2.getValue()).iterator();
                while (it.hasNext()) {
                    arrayList.add(new ᐧˋ(c1192, 5, (InterfaceC5190) it.next()));
                }
            } else {
                C1200 c12002 = (C1200) entry2.getKey();
                Set set = (Set) ((Collection) entry2.getValue());
                C1192 c11922 = new C1192();
                c11922.f4921 = null;
                c11922.f4922 = Collections.newSetFromMap(new ConcurrentHashMap());
                c11922.f4922.addAll(set);
                map2.put(c12002, c11922);
            }
        }
        return arrayList;
    }

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final void m4261() {
        for (C1194 c1194 : this.f4952.keySet()) {
            for (C1188 c1188 : c1194.f4928) {
                boolean z = c1188.f4914 == 2;
                C1200 c1200 = c1188.f4916;
                if (z) {
                    HashMap map = this.f4950;
                    if (!map.containsKey(c1200)) {
                        Set setEmptySet = Collections.emptySet();
                        C1192 c1192 = new C1192();
                        c1192.f4921 = null;
                        c1192.f4922 = Collections.newSetFromMap(new ConcurrentHashMap());
                        c1192.f4922.addAll(setEmptySet);
                        map.put(c1200, c1192);
                    }
                }
                HashMap map2 = this.f4948;
                if (map2.containsKey(c1200)) {
                    continue;
                } else {
                    int i = c1188.f4914;
                    if (i == 1) {
                        throw new MissingDependencyException("Unsatisfied dependency for component " + c1194 + ": " + c1200);
                    }
                    if (i != 2) {
                        map2.put(c1200, new C1201(C1201.f4943, C1201.f4944));
                    }
                }
            }
        }
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final void m4262(HashMap map, boolean z) {
        ArrayDeque arrayDeque;
        for (Map.Entry entry : map.entrySet()) {
            C1194 c1194 = (C1194) entry.getKey();
            InterfaceC5190 interfaceC5190 = (InterfaceC5190) entry.getValue();
            int i = c1194.f4932;
            if (i == 1 || (i == 2 && z)) {
                interfaceC5190.get();
            }
        }
        C1189 c1189 = this.f4949;
        synchronized (c1189) {
            arrayDeque = c1189.f4917;
            if (arrayDeque != null) {
                c1189.f4917 = null;
            } else {
                arrayDeque = null;
            }
        }
        if (arrayDeque != null) {
            Iterator it = arrayDeque.iterator();
            if (it.hasNext()) {
                it.next().getClass();
                throw new ClassCastException();
            }
        }
    }

    @Override // p031.InterfaceC1203
    /* renamed from: ـﹶ */
    public final Object mo4256(Class cls) {
        return mo4255(C1200.m4252(cls));
    }

    @Override // p031.InterfaceC1203
    /* renamed from: ٴˎ */
    public final C1201 mo4257(C1200 c1200) {
        InterfaceC5190 interfaceC5190Mo4254 = mo4254(c1200);
        return interfaceC5190Mo4254 == null ? new C1201(C1201.f4943, C1201.f4944) : interfaceC5190Mo4254 instanceof C1201 ? (C1201) interfaceC5190Mo4254 : new C1201(null, interfaceC5190Mo4254);
    }

    @Override // p031.InterfaceC1203
    /* renamed from: ᐧʻ */
    public final Set mo4258(C1200 c1200) {
        InterfaceC5190 interfaceC5190;
        synchronized (this) {
            interfaceC5190 = (C1192) this.f4950.get(c1200);
            if (interfaceC5190 == null) {
                interfaceC5190 = f4947;
            }
        }
        return (Set) interfaceC5190.get();
    }

    @Override // p031.InterfaceC1203
    /* renamed from: ﹳﹳ */
    public final InterfaceC5190 mo4259(Class cls) {
        return mo4254(C1200.m4252(cls));
    }

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final ArrayList m4263(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C1194 c1194 = (C1194) it.next();
            if (c1194.f4927 == 0) {
                InterfaceC5190 interfaceC5190 = (InterfaceC5190) this.f4952.get(c1194);
                for (C1200 c1200 : c1194.f4926) {
                    HashMap map = this.f4948;
                    if (map.containsKey(c1200)) {
                        arrayList2.add(new ᐧˋ((C1201) ((InterfaceC5190) map.get(c1200)), 4, interfaceC5190));
                    } else {
                        map.put(c1200, interfaceC5190);
                    }
                }
            }
        }
        return arrayList2;
    }
}
