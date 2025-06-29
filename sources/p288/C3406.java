package p288;

import java.io.Serializable;
import p338.InterfaceC3865;

/* renamed from: ٴˑ.ﹶˆ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3406 implements InterfaceC3401, Serializable {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public volatile Object f13257 = C3399.f13252;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final Object f13258 = this;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public InterfaceC3865 f13259;

    public C3406(InterfaceC3865 interfaceC3865) {
        this.f13259 = interfaceC3865;
    }

    @Override // p288.InterfaceC3401
    public final Object getValue() {
        Object objMo1053;
        Object obj = this.f13257;
        C3399 c3399 = C3399.f13252;
        if (obj != c3399) {
            return obj;
        }
        synchronized (this.f13258) {
            objMo1053 = this.f13257;
            if (objMo1053 == c3399) {
                objMo1053 = this.f13259.mo1053();
                this.f13257 = objMo1053;
                this.f13259 = null;
            }
        }
        return objMo1053;
    }

    public final String toString() {
        return this.f13257 != C3399.f13252 ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
