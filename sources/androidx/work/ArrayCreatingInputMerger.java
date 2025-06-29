package androidx.work;

import j$.util.DesugarCollections;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import p065.C1496;
import p070.AbstractC1549;
import p457.AbstractC5382;
import p457.C5363;

/* loaded from: classes.dex */
public final class ArrayCreatingInputMerger extends AbstractC5382 {
    @Override // p457.AbstractC5382
    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C5363 mo1366(ArrayList arrayList) throws ArrayIndexOutOfBoundsException, IllegalArgumentException, NegativeArraySizeException {
        Object objNewInstance;
        C1496 c1496 = new C1496(2);
        HashMap map = new HashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            for (Map.Entry entry : DesugarCollections.unmodifiableMap(((C5363) it.next()).f20821).entrySet()) {
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                Class cls = value != null ? value.getClass() : String.class;
                Object obj = map.get(str);
                if (obj != null) {
                    Class<?> cls2 = obj.getClass();
                    if (cls2.equals(cls)) {
                        int length = Array.getLength(obj);
                        int length2 = Array.getLength(value);
                        Object objNewInstance2 = Array.newInstance(obj.getClass().getComponentType(), length + length2);
                        System.arraycopy(obj, 0, objNewInstance2, 0, length);
                        System.arraycopy(value, 0, objNewInstance2, length, length2);
                        value = objNewInstance2;
                    } else {
                        if (!AbstractC1549.m5138(cls2.getComponentType(), cls)) {
                            throw new IllegalArgumentException();
                        }
                        int length3 = Array.getLength(obj);
                        objNewInstance = Array.newInstance(cls, length3 + 1);
                        System.arraycopy(obj, 0, objNewInstance, 0, length3);
                        Array.set(objNewInstance, length3, value);
                        value = objNewInstance;
                    }
                } else if (!cls.isArray()) {
                    objNewInstance = Array.newInstance(cls, 1);
                    Array.set(objNewInstance, 0, value);
                    value = objNewInstance;
                }
                map.put(str, value);
            }
        }
        c1496.m5061(map);
        return c1496.m5058();
    }
}
