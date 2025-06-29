package p160;

import java.util.Collection;
import java.util.Iterator;
import p001.C0883;
import p266.C3262;
import ʿﾞ.ﹳﹳ;

/* renamed from: ˊٴ.ᐧʻ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2348 extends ﹳﹳ implements InterfaceC2347 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final InterfaceC2343 f9314;

    public C2348(C3262 c3262, InterfaceC2343 interfaceC2343) {
        super(c3262);
        this.f9314 = interfaceC2343;
    }

    @Override // p160.InterfaceC2347
    /* renamed from: ˋⁱ */
    public final void mo6452(C0883 c0883, Object obj, Collection collection) {
        c0883.f4010 = true;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            this.f9314.mo6451(it.next(), obj, c0883);
        }
    }
}
