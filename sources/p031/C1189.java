package p031;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayDeque;
import java.util.HashMap;
import p150.ExecutorC2314;
import p292.InterfaceC3461;
import p292.InterfaceC3462;
import ˏʼ.ʽᐧ;
import ﹳᴵ.ˉי;

/* renamed from: ʼـ.ˋⁱ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1189 implements InterfaceC3461, InterfaceC3462 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final HashMap f4918 = new HashMap();

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public ArrayDeque f4917 = new ArrayDeque();

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final synchronized void m4243(ExecutorC2314 executorC2314, ˉי r5) {
        try {
            if (!this.f4918.containsKey(ʽᐧ.class)) {
                this.f4918.put(ʽᐧ.class, new ConcurrentHashMap());
            }
            ((ConcurrentHashMap) this.f4918.get(ʽᐧ.class)).put(r5, executorC2314);
        } catch (Throwable th) {
            throw th;
        }
    }
}
