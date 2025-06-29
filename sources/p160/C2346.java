package p160;

import java.util.concurrent.ExecutorService;
import p001.C0883;
import p266.C3262;
import p331.C3758;
import ʿﾞ.ﹳﹳ;
import ˆʽ.ˑˉ;

/* renamed from: ˊٴ.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2346 extends ﹳﹳ implements InterfaceC2343 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final InterfaceC2343 f9312;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final ExecutorService f9313;

    /* JADX WARN: Illegal instructions before constructor call */
    public C2346(InterfaceC2343 interfaceC2343) {
        C3262 c3262 = (C3262) ((ﹳﹳ) interfaceC2343).ᐧⁱ;
        super(c3262);
        this.f9312 = interfaceC2343;
        this.f9313 = (ExecutorService) ((C3758) c3262.f12725).m8727("bus.handlers.async-executor");
    }

    @Override // p160.InterfaceC2343
    /* renamed from: ʿʼ */
    public final void mo6451(Object obj, Object obj2, C0883 c0883) {
        this.f9313.execute(new ˑˉ(this, obj, obj2, c0883, 1));
    }
}
