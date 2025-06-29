package androidx.fragment.app;

import p071.InterfaceC1575;

/* renamed from: androidx.fragment.app.ᴵʿ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0110 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final /* synthetic */ AbstractComponentCallbacksC0100 f680;

    public C0110(AbstractComponentCallbacksC0100 abstractComponentCallbacksC0100) {
        this.f680 = abstractComponentCallbacksC0100;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final Object m729(Object obj) {
        AbstractComponentCallbacksC0100 abstractComponentCallbacksC0100 = this.f680;
        Object obj2 = abstractComponentCallbacksC0100.mHost;
        return obj2 instanceof InterfaceC1575 ? ((InterfaceC1575) obj2).getActivityResultRegistry() : abstractComponentCallbacksC0100.requireActivity().getActivityResultRegistry();
    }
}
