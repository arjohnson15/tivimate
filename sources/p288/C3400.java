package p288;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p338.InterfaceC3865;

/* renamed from: ٴˑ.ˏᵢ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3400 implements InterfaceC3401, Serializable {

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public static final AtomicReferenceFieldUpdater f13253 = AtomicReferenceFieldUpdater.newUpdater(C3400.class, Object.class, "ˆʿ");

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public volatile Object f13254;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public volatile InterfaceC3865 f13255;

    @Override // p288.InterfaceC3401
    public final Object getValue() {
        Object obj = this.f13254;
        C3399 c3399 = C3399.f13252;
        if (obj != c3399) {
            return obj;
        }
        InterfaceC3865 interfaceC3865 = this.f13255;
        if (interfaceC3865 != null) {
            Object objMo1053 = interfaceC3865.mo1053();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f13253;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, c3399, objMo1053)) {
                if (atomicReferenceFieldUpdater.get(this) != c3399) {
                }
            }
            this.f13255 = null;
            return objMo1053;
        }
        return this.f13254;
    }

    public final String toString() {
        return this.f13254 != C3399.f13252 ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
