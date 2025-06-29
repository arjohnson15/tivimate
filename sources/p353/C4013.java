package p353;

import java.io.Serializable;

/* renamed from: ᵔʿ.ˋⁱ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4013 implements InterfaceC4012, Serializable {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public volatile transient boolean f15455;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public transient Object f15456;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final InterfaceC4012 f15457;

    public C4013(InterfaceC4012 interfaceC4012) {
        this.f15457 = interfaceC4012;
    }

    @Override // p353.InterfaceC4012
    public final Object get() {
        if (!this.f15455) {
            synchronized (this) {
                try {
                    if (!this.f15455) {
                        Object obj = this.f15457.get();
                        this.f15456 = obj;
                        this.f15455 = true;
                        return obj;
                    }
                } finally {
                }
            }
        }
        return this.f15456;
    }

    public final String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder("Suppliers.memoize(");
        if (this.f15455) {
            obj = "<supplier that returned " + this.f15456 + ">";
        } else {
            obj = this.f15457;
        }
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }
}
