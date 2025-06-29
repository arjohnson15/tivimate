package androidx.datastore.preferences.protobuf;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: androidx.datastore.preferences.protobuf.ﾞᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0085 extends LinkedHashMap {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public static final C0085 f519;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public boolean f520 = true;

    static {
        C0085 c0085 = new C0085();
        f519 = c0085;
        c0085.f520 = false;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        m582();
        super.clear();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return isEmpty() ? Collections.emptySet() : super.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        boolean z;
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (this != map) {
            if (size() == map.size()) {
                for (Map.Entry entry : entrySet()) {
                    if (map.containsKey(entry.getKey())) {
                        Object value = entry.getValue();
                        Object obj2 = map.get(entry.getKey());
                        if (!(((value instanceof byte[]) && (obj2 instanceof byte[])) ? Arrays.equals((byte[]) value, (byte[]) obj2) : value.equals(obj2))) {
                        }
                    }
                }
                z = true;
            }
            z = false;
            break;
        }
        z = true;
        return z;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int iHashCode;
        int iHashCode2;
        int i = 0;
        for (Map.Entry entry : entrySet()) {
            Object key = entry.getKey();
            if (key instanceof byte[]) {
                byte[] bArr = (byte[]) key;
                Charset charset = AbstractC0077.f505;
                iHashCode = bArr.length;
                for (byte b : bArr) {
                    iHashCode = (iHashCode * 31) + b;
                }
                if (iHashCode == 0) {
                    iHashCode = 1;
                }
            } else {
                iHashCode = key.hashCode();
            }
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                byte[] bArr2 = (byte[]) value;
                Charset charset2 = AbstractC0077.f505;
                iHashCode2 = bArr2.length;
                for (byte b2 : bArr2) {
                    iHashCode2 = (iHashCode2 * 31) + b2;
                }
                if (iHashCode2 == 0) {
                    iHashCode2 = 1;
                }
            } else {
                iHashCode2 = value.hashCode();
            }
            i += iHashCode ^ iHashCode2;
        }
        return i;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        m582();
        Charset charset = AbstractC0077.f505;
        obj.getClass();
        obj2.getClass();
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        m582();
        for (Object obj : map.keySet()) {
            Charset charset = AbstractC0077.f505;
            obj.getClass();
            map.get(obj).getClass();
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        m582();
        return super.remove(obj);
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final void m582() {
        if (!this.f520) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final C0085 m583() {
        if (isEmpty()) {
            return new C0085();
        }
        C0085 c0085 = new C0085(this);
        c0085.f520 = true;
        return c0085;
    }
}
