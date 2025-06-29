package androidx.lifecycle;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import p001.C0883;

/* renamed from: androidx.lifecycle.ʻﹳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC0207 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C0883 f1218 = new C0883();

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final AutoCloseable m999(String str) {
        AutoCloseable autoCloseable;
        C0883 c0883 = this.f1218;
        if (c0883 == null) {
            return null;
        }
        synchronized (((ˈˉ.ﹳﹳ) c0883.f4008)) {
            autoCloseable = (AutoCloseable) ((LinkedHashMap) c0883.f4009).get(str);
        }
        return autoCloseable;
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final void m1000(String str, AutoCloseable autoCloseable) throws Exception {
        AutoCloseable autoCloseable2;
        C0883 c0883 = this.f1218;
        if (c0883 != null) {
            if (c0883.f4010) {
                C0883.m3701(autoCloseable);
                return;
            }
            synchronized (((ˈˉ.ﹳﹳ) c0883.f4008)) {
                autoCloseable2 = (AutoCloseable) ((LinkedHashMap) c0883.f4009).put(str, autoCloseable);
            }
            C0883.m3701(autoCloseable2);
        }
    }

    /* renamed from: ٴˎ */
    public void mo735() {
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final void m1001() {
        C0883 c0883 = this.f1218;
        if (c0883 != null && !c0883.f4010) {
            c0883.f4010 = true;
            synchronized (((ˈˉ.ﹳﹳ) c0883.f4008)) {
                try {
                    Iterator it = ((LinkedHashMap) c0883.f4009).values().iterator();
                    while (it.hasNext()) {
                        C0883.m3701((AutoCloseable) it.next());
                    }
                    Iterator it2 = ((LinkedHashSet) c0883.f4011).iterator();
                    while (it2.hasNext()) {
                        C0883.m3701((AutoCloseable) it2.next());
                    }
                    ((LinkedHashSet) c0883.f4011).clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        mo735();
    }
}
