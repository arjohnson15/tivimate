package p072;

import p330.InterfaceC3747;

/* renamed from: ʿʽ.ˑʾ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1606 extends AbstractC1636 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public static final C1606 f6380 = new C1606();

    @Override // p072.AbstractC1636
    public final String toString() {
        return "Dispatchers.Unconfined";
    }

    @Override // p072.AbstractC1636
    /* renamed from: ˈﹳ */
    public final void mo5198(InterfaceC3747 interfaceC3747, Runnable runnable) {
        C1619 c1619 = (C1619) interfaceC3747.mo3966(C1619.f6395);
        if (c1619 == null) {
            throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
        }
        c1619.f6396 = true;
    }

    @Override // p072.AbstractC1636
    /* renamed from: ٴﹶ, reason: contains not printable characters */
    public final AbstractC1636 mo5222(int i, String str) {
        throw new UnsupportedOperationException("limitedParallelism is not supported for Dispatchers.Unconfined");
    }
}
