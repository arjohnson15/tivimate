package p427;

import androidx.lifecycle.C0248;
import java.io.IOException;
import p034.InterfaceC1229;
import p140.InterfaceC2162;
import p185.AbstractC2562;
import p338.InterfaceC3864;
import p396.C4554;
import ˈⁱ.ﹳﹳ;

/* renamed from: ﹶˉ.ʽᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4911 implements InterfaceC2162 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final Object f18574 = ﹳﹳ.ᐧⁱ(2, new C0248(10, this));

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C4554 f18575;

    public C4911(C4554 c4554) {
        this.f18575 = c4554;
    }

    @Override // p140.InterfaceC2162
    public final void close() throws IOException {
        ((InterfaceC1229) this.f18575.f17462).close();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, ٴˑ.ˑʽ] */
    @Override // p140.InterfaceC2162
    /* renamed from: ـﹶ */
    public final Object mo6091(boolean z, InterfaceC3864 interfaceC3864, AbstractC2562 abstractC2562) {
        return interfaceC3864.mo1054((C4917) this.f18574.getValue(), abstractC2562);
    }
}
