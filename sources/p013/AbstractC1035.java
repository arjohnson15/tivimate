package p013;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.TreeMap;
import p288.C3395;
import ᴵﹳ.ٴˎ;

/* renamed from: ʻי.ˈٴ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC1035 extends ٴˎ {
    /* renamed from: ˆʿ, reason: contains not printable characters */
    public static Map m3983(ArrayList arrayList) {
        C1034 c1034 = C1034.f4436;
        int size = arrayList.size();
        if (size == 0) {
            return c1034;
        }
        if (size == 1) {
            C3395 c3395 = (C3395) arrayList.get(0);
            return Collections.singletonMap(c3395.f13245, c3395.f13244);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(m3985(arrayList.size()));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C3395 c33952 = (C3395) it.next();
            linkedHashMap.put(c33952.f13245, c33952.f13244);
        }
        return linkedHashMap;
    }

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public static TreeMap m3984(LinkedHashMap linkedHashMap, Comparator comparator) {
        TreeMap treeMap = new TreeMap(comparator);
        treeMap.putAll(linkedHashMap);
        return treeMap;
    }

    /* renamed from: ˈٴ, reason: contains not printable characters */
    public static int m3985(int i) {
        if (i < 0) {
            return i;
        }
        if (i < 3) {
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) ((i / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public static Map m3986(Map map) {
        int size = map.size();
        if (size == 0) {
            return C1034.f4436;
        }
        if (size != 1) {
            return new LinkedHashMap(map);
        }
        Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
        return Collections.singletonMap(entry.getKey(), entry.getValue());
    }

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public static LinkedHashMap m3987(LinkedHashMap linkedHashMap) {
        return new LinkedHashMap(linkedHashMap);
    }

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public static Map m3988(C3395... c3395Arr) {
        if (c3395Arr.length <= 0) {
            return C1034.f4436;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(m3985(c3395Arr.length));
        for (C3395 c3395 : c3395Arr) {
            linkedHashMap.put(c3395.f13245, c3395.f13244);
        }
        return linkedHashMap;
    }

    /* renamed from: ﹳˑ, reason: contains not printable characters */
    public static Object m3989(Map map, Object obj) {
        if (map instanceof InterfaceC1054) {
            return ((InterfaceC1054) map).m4044();
        }
        Object obj2 = map.get(obj);
        if (obj2 != null || map.containsKey(obj)) {
            return obj2;
        }
        throw new NoSuchElementException("Key " + obj + " is missing in the map.");
    }
}
