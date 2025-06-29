package p160;

import java.util.Collection;
import p001.C0883;
import p037.C1263;
import p037.C1264;
import p129.C2053;
import p129.InterfaceC2054;
import p266.C3262;
import ʿﾞ.ﹳﹳ;

/* renamed from: ˊٴ.ﹳﹳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2349 extends AbstractC2342 {

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final InterfaceC2054[] f9315;

    public C2349(InterfaceC2347 interfaceC2347) {
        super(interfaceC2347);
        this.f9315 = ((C2053) ((C3262) ((ﹳﹳ) interfaceC2347).ᐧⁱ).f12726).f7770;
    }

    @Override // p160.InterfaceC2347
    /* renamed from: ˋⁱ */
    public final void mo6452(C0883 c0883, Object obj, Collection collection) {
        InterfaceC2054[] interfaceC2054Arr = this.f9315;
        if (interfaceC2054Arr != null) {
            for (InterfaceC2054 interfaceC2054 : interfaceC2054Arr) {
                ((C1263) interfaceC2054).getClass();
                C3262 c3262 = (C3262) ((ﹳﹳ) this).ᐧⁱ;
                if (!C1263.m4523(((C2053) c3262.f12726).f7775, new C1264(obj), c3262, obj)) {
                    return;
                }
            }
        }
        this.f9311.mo6452(c0883, obj, collection);
    }
}
