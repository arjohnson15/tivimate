package p396;

import p366.C4155;
import p366.InterfaceC4160;
import p430.AbstractC4996;
import p430.C5002;

/* renamed from: ⁱᴵ.ˑﾞ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4571 extends AbstractC4996 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final C5002 f17506;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final Object f17507;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final /* synthetic */ int f17508 = 0;

    public C4571(AbstractC4996 abstractC4996, C5002 c5002) {
        this.f17507 = abstractC4996;
        this.f17506 = c5002;
    }

    public C4571(C5002 c5002, C4155 c4155) {
        this.f17506 = c5002;
        this.f17507 = c4155;
    }

    @Override // p430.AbstractC4996
    public final long contentLength() {
        switch (this.f17508) {
            case 0:
                return ((AbstractC4996) this.f17507).contentLength();
            default:
                return ((C4155) this.f17507).mo9566();
        }
    }

    @Override // p430.AbstractC4996
    public final C5002 contentType() {
        switch (this.f17508) {
        }
        return this.f17506;
    }

    @Override // p430.AbstractC4996
    public final void writeTo(InterfaceC4160 interfaceC4160) {
        switch (this.f17508) {
            case 0:
                ((AbstractC4996) this.f17507).writeTo(interfaceC4160);
                break;
            default:
                interfaceC4160.mo9504((C4155) this.f17507);
                break;
        }
    }
}
