package p411;

import p452.InterfaceC5193;

/* renamed from: ﹳˏ.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4691 implements InterfaceC5193 {

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public static final Object f17847 = new Object();

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public volatile Object f17848;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public volatile InterfaceC4690 f17849;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static InterfaceC5193 m10598(InterfaceC4690 interfaceC4690) {
        if (interfaceC4690 instanceof C4691) {
            return interfaceC4690;
        }
        C4691 c4691 = new C4691();
        c4691.f17848 = f17847;
        c4691.f17849 = interfaceC4690;
        return c4691;
    }

    @Override // p452.InterfaceC5193
    public final Object get() {
        Object obj = this.f17848;
        Object obj2 = f17847;
        if (obj == obj2) {
            synchronized (this) {
                try {
                    obj = this.f17848;
                    if (obj == obj2) {
                        obj = this.f17849.get();
                        Object obj3 = this.f17848;
                        if (obj3 != obj2 && obj3 != obj) {
                            throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + obj + ". This is likely due to a circular dependency.");
                        }
                        this.f17848 = obj;
                        this.f17849 = null;
                    }
                } finally {
                }
            }
        }
        return obj;
    }
}
