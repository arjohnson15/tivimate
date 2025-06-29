package com.google.android.gms.internal.play_billing;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.play_billing.ˊᵔ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0612 extends LinkedHashMap {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public static final C0612 f2981;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public boolean f2982 = true;

    static {
        C0612 c0612 = new C0612();
        f2981 = c0612;
        c0612.f2982 = false;
    }

    /* renamed from: ˉי, reason: contains not printable characters */
    public static int m2614(Object obj) {
        if (!(obj instanceof byte[])) {
            if (obj instanceof EnumC0658) {
                throw new UnsupportedOperationException();
            }
            return obj.hashCode();
        }
        byte[] bArr = (byte[]) obj;
        Charset charset = AbstractC0595.f2962;
        int length = bArr.length;
        for (byte b : bArr) {
            length = (length * 31) + b;
        }
        if (length == 0) {
            return 1;
        }
        return length;
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static C0612 m2615() {
        return f2981;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        m2616();
        super.clear();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return isEmpty() ? Collections.emptySet() : super.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (this == map) {
            return true;
        }
        if (size() != map.size()) {
            return false;
        }
        for (Map.Entry entry : entrySet()) {
            if (!map.containsKey(entry.getKey())) {
                return false;
            }
            Object value = entry.getValue();
            Object obj2 = map.get(entry.getKey());
            if (!(((value instanceof byte[]) && (obj2 instanceof byte[])) ? Arrays.equals((byte[]) value, (byte[]) obj2) : value.equals(obj2))) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int iM2614 = 0;
        for (Map.Entry entry : entrySet()) {
            iM2614 += m2614(entry.getValue()) ^ m2614(entry.getKey());
        }
        return iM2614;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        m2616();
        Charset charset = AbstractC0595.f2962;
        obj.getClass();
        obj2.getClass();
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        m2616();
        for (Object obj : map.keySet()) {
            Charset charset = AbstractC0595.f2962;
            obj.getClass();
            map.get(obj).getClass();
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        m2616();
        return super.remove(obj);
    }

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public final void m2616() {
        if (!this.f2982) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final C0612 m2617() {
        if (isEmpty()) {
            return new C0612();
        }
        C0612 c0612 = new C0612(this);
        c0612.f2982 = true;
        return c0612;
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final void m2618() {
        this.f2982 = false;
    }

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final boolean m2619() {
        return this.f2982;
    }
}
