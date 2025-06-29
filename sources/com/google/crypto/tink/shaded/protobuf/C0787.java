package com.google.crypto.tink.shaded.protobuf;

import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.crypto.tink.shaded.protobuf.ﾞᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0787 {
    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static void m3250(Object obj, Object obj2) {
        C0765 c0765 = (C0765) obj;
        if (obj2 != null) {
            throw new ClassCastException();
        }
        if (c0765.isEmpty()) {
            return;
        }
        Iterator it = c0765.entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            entry.getKey();
            entry.getValue();
            throw null;
        }
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public static C0765 m3251() {
        return C0765.f3615.m3175();
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static boolean m3252(Object obj) {
        return !((C0765) obj).f3616;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static void m3253(Object obj) {
        ᵎﹳ.ᐧʻ.ᵎˏ(obj);
        throw null;
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public static void m3254(Object obj) {
        ((C0765) obj).f3616 = false;
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static C0765 m3255(Object obj, Object obj2) {
        C0765 c0765M3175 = (C0765) obj;
        C0765 c0765 = (C0765) obj2;
        if (!c0765.isEmpty()) {
            if (!c0765M3175.f3616) {
                c0765M3175 = c0765M3175.m3175();
            }
            c0765M3175.m3174();
            if (!c0765.isEmpty()) {
                c0765M3175.putAll(c0765);
            }
        }
        return c0765M3175;
    }
}
