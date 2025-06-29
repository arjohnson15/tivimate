package p396;

import java.util.concurrent.Executor;
import p331.C3767;
import p430.C5021;

/* renamed from: ⁱᴵ.ᴵʿ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4580 implements InterfaceC4591 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final InterfaceC4591 f17526;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final Executor f17527;

    public C4580(Executor executor, InterfaceC4591 interfaceC4591) {
        this.f17527 = executor;
        this.f17526 = interfaceC4591;
    }

    @Override // p396.InterfaceC4591
    public final void cancel() {
        this.f17526.cancel();
    }

    @Override // p396.InterfaceC4591
    /* renamed from: ʽᐧ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final InterfaceC4591 clone() {
        return new C4580(this.f17527, this.f17526.clone());
    }

    @Override // p396.InterfaceC4591
    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final void mo10461(InterfaceC4576 interfaceC4576) {
        this.f17526.mo10461(new C3767(this, interfaceC4576));
    }

    @Override // p396.InterfaceC4591
    /* renamed from: ˏʾ, reason: contains not printable characters */
    public final boolean mo10462() {
        return this.f17526.mo10462();
    }

    @Override // p396.InterfaceC4591
    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final C5021 mo10463() {
        return this.f17526.mo10463();
    }

    @Override // p396.InterfaceC4591
    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C4586 mo10464() {
        return this.f17526.mo10464();
    }
}
