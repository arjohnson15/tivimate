package p353;

import p007.C0952;

/* renamed from: ᵔʿ.ᴵʿ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4021 implements InterfaceC4012 {

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public static final C0952 f15468 = new C0952(2);

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public Object f15469;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public volatile InterfaceC4012 f15470;

    @Override // p353.InterfaceC4012
    public final Object get() {
        InterfaceC4012 interfaceC4012 = this.f15470;
        C0952 c0952 = f15468;
        if (interfaceC4012 != c0952) {
            synchronized (this) {
                try {
                    if (this.f15470 != c0952) {
                        Object obj = this.f15470.get();
                        this.f15469 = obj;
                        this.f15470 = c0952;
                        return obj;
                    }
                } finally {
                }
            }
        }
        return this.f15469;
    }

    public final String toString() {
        Object obj = this.f15470;
        StringBuilder sb = new StringBuilder("Suppliers.memoize(");
        if (obj == f15468) {
            obj = "<supplier that returned " + this.f15469 + ">";
        }
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }
}
