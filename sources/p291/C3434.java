package p291;

import androidx.fragment.app.AbstractComponentCallbacksC0100;
import androidx.fragment.app.C0110;
import java.util.concurrent.atomic.AtomicReference;
import p071.AbstractC1569;
import p071.InterfaceC1566;
import p286.AbstractC3390;

/* renamed from: ٴᐧ.ˑי, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3434 extends AbstractC3428 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final /* synthetic */ AtomicReference f13323;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final /* synthetic */ AbstractComponentCallbacksC0100 f13324;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC3390 f13325;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final /* synthetic */ C0110 f13326;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC1566 f13327;

    public C3434(AbstractComponentCallbacksC0100 abstractComponentCallbacksC0100, C0110 c0110, AtomicReference atomicReference, AbstractC3390 abstractC3390, InterfaceC1566 interfaceC1566) {
        this.f13324 = abstractComponentCallbacksC0100;
        this.f13326 = c0110;
        this.f13323 = atomicReference;
        this.f13325 = abstractC3390;
        this.f13327 = interfaceC1566;
    }

    @Override // p291.AbstractC3428
    /* renamed from: ـﹶ */
    public final void mo611() {
        AbstractComponentCallbacksC0100 abstractComponentCallbacksC0100 = this.f13324;
        this.f13323.set(((AbstractC1569) this.f13326.m729(null)).m5161(abstractComponentCallbacksC0100.generateActivityResultKey(), abstractComponentCallbacksC0100, this.f13325, this.f13327));
    }
}
