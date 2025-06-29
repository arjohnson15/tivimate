package p139;

/* renamed from: ˉˋ.ᐧⁱ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2146 extends AbstractC2159 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public AbstractC2160 f8413;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final /* synthetic */ int f8414;

    public /* synthetic */ C2146() {
        this.f8414 = 1;
    }

    public /* synthetic */ C2146(AbstractC2160 abstractC2160, int i) {
        this.f8414 = i;
        this.f8413 = abstractC2160;
    }

    @Override // p139.AbstractC2159, p139.InterfaceC2121
    /* renamed from: ˑʽ */
    public void mo5990(AbstractC2160 abstractC2160) {
        switch (this.f8414) {
            case 0:
                C2122 c2122 = (C2122) this.f8413;
                c2122.f8356.remove(abstractC2160);
                if (!c2122.mo6017()) {
                    c2122.m6087(c2122, InterfaceC2128.f8377, false);
                    c2122.f8476 = true;
                    c2122.m6087(c2122, InterfaceC2128.f8374, false);
                    break;
                }
                break;
        }
    }

    @Override // p139.AbstractC2159, p139.InterfaceC2121
    /* renamed from: ـﹶ */
    public void mo5991(AbstractC2160 abstractC2160) {
        switch (this.f8414) {
            case 1:
                C2122 c2122 = (C2122) this.f8413;
                int i = c2122.f8359 - 1;
                c2122.f8359 = i;
                if (i == 0) {
                    c2122.f8357 = false;
                    c2122.m6084();
                }
                abstractC2160.mo6019(this);
                break;
            case 2:
                this.f8413.mo6008();
                abstractC2160.mo6019(this);
                break;
        }
    }

    @Override // p139.AbstractC2159, p139.InterfaceC2121
    /* renamed from: ﹳﹳ */
    public void mo5994(AbstractC2160 abstractC2160) {
        switch (this.f8414) {
            case 1:
                C2122 c2122 = (C2122) this.f8413;
                if (!c2122.f8357) {
                    c2122.m6079();
                    c2122.f8357 = true;
                    break;
                }
                break;
        }
    }
}
