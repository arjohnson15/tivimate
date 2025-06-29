package p031;

import p450.InterfaceC5190;

/* renamed from: ʼـ.ᴵʿ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1199 implements InterfaceC5190 {

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static final Object f4938 = new Object();

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public volatile InterfaceC5190 f4939;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public volatile Object f4940 = f4938;

    public C1199(InterfaceC5190 interfaceC5190) {
        this.f4939 = interfaceC5190;
    }

    @Override // p450.InterfaceC5190
    public final Object get() {
        Object obj = this.f4940;
        Object obj2 = f4938;
        if (obj == obj2) {
            synchronized (this) {
                try {
                    obj = this.f4940;
                    if (obj == obj2) {
                        obj = this.f4939.get();
                        this.f4940 = obj;
                        this.f4939 = null;
                    }
                } finally {
                }
            }
        }
        return obj;
    }
}
