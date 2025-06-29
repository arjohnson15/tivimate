package p288;

import java.io.Serializable;
import p338.InterfaceC3865;

/* renamed from: ٴˑ.ˋⁱ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3398 implements InterfaceC3401, Serializable {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public Object f13250;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public InterfaceC3865 f13251;

    @Override // p288.InterfaceC3401
    public final Object getValue() {
        if (this.f13250 == C3399.f13252) {
            this.f13250 = this.f13251.mo1053();
            this.f13251 = null;
        }
        return this.f13250;
    }

    public final String toString() {
        return this.f13250 != C3399.f13252 ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
