package p396;

import java.lang.reflect.Type;

/* renamed from: ⁱᴵ.ﹶˆ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4593 implements InterfaceC4575 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final Type f17588;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final /* synthetic */ int f17589;

    public /* synthetic */ C4593(int i, Type type) {
        this.f17589 = i;
        this.f17588 = type;
    }

    @Override // p396.InterfaceC4575
    /* renamed from: ʽᐧ */
    public final Type mo2479() {
        switch (this.f17589) {
        }
        return this.f17588;
    }

    @Override // p396.InterfaceC4575
    /* renamed from: ˉי */
    public final Object mo2484(C4590 c4590) {
        switch (this.f17589) {
            case 0:
                C4555 c4555 = new C4555(c4590);
                c4590.mo10461(new C4567(c4555, 0));
                return c4555;
            default:
                C4555 c45552 = new C4555(c4590);
                c4590.mo10461(new C4567(c45552, 1));
                return c45552;
        }
    }
}
