package j$.time.format;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
final class B {
    private final Map a;
    private final HashMap b;

    B(Map map) {
        this.a = map;
        HashMap map2 = new HashMap();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            HashMap map3 = new HashMap();
            for (Map.Entry entry2 : ((Map) entry.getValue()).entrySet()) {
                String str = (String) entry2.getValue();
                String str2 = (String) entry2.getValue();
                Long l = (Long) entry2.getKey();
                int i = C.d;
                map3.put(str, new AbstractMap.SimpleImmutableEntry(str2, l));
            }
            ArrayList arrayList2 = new ArrayList(map3.values());
            Collections.sort(arrayList2, C.b);
            map2.put((TextStyle) entry.getKey(), arrayList2);
            arrayList.addAll(arrayList2);
            map2.put(null, arrayList);
        }
        Collections.sort(arrayList, C.b);
        this.b = map2;
    }

    final String a(long j, TextStyle textStyle) {
        Map map = (Map) this.a.get(textStyle);
        if (map != null) {
            return (String) map.get(Long.valueOf(j));
        }
        return null;
    }

    final Iterator b(TextStyle textStyle) {
        List list = (List) this.b.get(textStyle);
        if (list != null) {
            return list.iterator();
        }
        return null;
    }
}
