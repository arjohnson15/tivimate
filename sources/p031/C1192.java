package p031;

import j$.util.DesugarCollections;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import p450.InterfaceC5190;

/* renamed from: ʼـ.ˏᴵ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1192 implements InterfaceC5190 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public volatile Set f4921;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public volatile Set f4922;

    @Override // p450.InterfaceC5190
    public final Object get() {
        if (this.f4921 == null) {
            synchronized (this) {
                try {
                    if (this.f4921 == null) {
                        this.f4921 = Collections.newSetFromMap(new ConcurrentHashMap());
                        m4244();
                    }
                } finally {
                }
            }
        }
        return DesugarCollections.unmodifiableSet(this.f4921);
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final synchronized void m4244() {
        try {
            Iterator it = this.f4922.iterator();
            while (it.hasNext()) {
                this.f4921.add(((InterfaceC5190) it.next()).get());
            }
            this.f4922 = null;
        } catch (Throwable th) {
            throw th;
        }
    }
}
