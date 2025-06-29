package androidx.lifecycle;

import java.io.Closeable;

/* renamed from: androidx.lifecycle.ﾞˎ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0263 implements InterfaceC0213, Closeable {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final C0251 f1322;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public boolean f1323;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final String f1324;

    public C0263(String str, C0251 c0251) {
        this.f1324 = str;
        this.f1322 = c0251;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // androidx.lifecycle.InterfaceC0213
    /* renamed from: ـﹶ */
    public final void mo607(InterfaceC0262 interfaceC0262, EnumC0247 enumC0247) {
        if (enumC0247 == EnumC0247.ON_DESTROY) {
            this.f1323 = false;
            interfaceC0262.getLifecycle().mo1031(this);
        }
    }
}
