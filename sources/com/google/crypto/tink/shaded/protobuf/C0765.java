package com.google.crypto.tink.shaded.protobuf;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.crypto.tink.shaded.protobuf.ᴵʼ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0765 extends LinkedHashMap {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public static final C0765 f3615;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public boolean f3616 = true;

    static {
        C0765 c0765 = new C0765();
        f3615 = c0765;
        c0765.f3616 = false;
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static int m3173(Object obj) {
        if (!(obj instanceof byte[])) {
            if (obj instanceof InterfaceC0754) {
                throw new UnsupportedOperationException();
            }
            return obj.hashCode();
        }
        byte[] bArr = (byte[]) obj;
        Charset charset = AbstractC0731.f3531;
        int length = bArr.length;
        for (byte b : bArr) {
            length = (length * 31) + b;
        }
        if (length == 0) {
            return 1;
        }
        return length;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        m3174();
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
        int iM3173 = 0;
        for (Map.Entry entry : entrySet()) {
            iM3173 += m3173(entry.getValue()) ^ m3173(entry.getKey());
        }
        return iM3173;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        m3174();
        Charset charset = AbstractC0731.f3531;
        obj.getClass();
        obj2.getClass();
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        m3174();
        for (Object obj : map.keySet()) {
            Charset charset = AbstractC0731.f3531;
            obj.getClass();
            map.get(obj).getClass();
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        m3174();
        return super.remove(obj);
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final void m3174() {
        if (!this.f3616) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final C0765 m3175() {
        if (isEmpty()) {
            return new C0765();
        }
        C0765 c0765 = new C0765(this);
        c0765.f3616 = true;
        return c0765;
    }
}
