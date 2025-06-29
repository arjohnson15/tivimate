package androidx.fragment.app;

/* renamed from: androidx.fragment.app.ˉי, reason: contains not printable characters */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0093 implements Runnable {

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final /* synthetic */ AbstractComponentCallbacksC0100 f576;

    public /* synthetic */ RunnableC0093(AbstractComponentCallbacksC0100 abstractComponentCallbacksC0100) {
        this.f576 = abstractComponentCallbacksC0100;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractComponentCallbacksC0100 abstractComponentCallbacksC0100 = this.f576;
        C0097 c0097 = abstractComponentCallbacksC0100.mViewLifecycleOwner;
        c0097.f585.m8245(abstractComponentCallbacksC0100.mSavedViewRegistryState);
        abstractComponentCallbacksC0100.mSavedViewRegistryState = null;
    }
}
