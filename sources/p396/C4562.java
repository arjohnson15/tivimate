package p396;

import j$.util.Objects;

/* renamed from: ⁱᴵ.ˎˑ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4562 extends AbstractC4581 {

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final String f17472;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final C4574 f17473;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final boolean f17474;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final /* synthetic */ int f17475;

    public C4562(String str, boolean z, int i) {
        this.f17475 = i;
        switch (i) {
            case 1:
                C4574 c4574 = C4574.f17512;
                Objects.requireNonNull(str, "name == null");
                this.f17472 = str;
                this.f17473 = c4574;
                this.f17474 = z;
                break;
            case 2:
                C4574 c45742 = C4574.f17512;
                Objects.requireNonNull(str, "name == null");
                this.f17472 = str;
                this.f17473 = c45742;
                this.f17474 = z;
                break;
            default:
                C4574 c45743 = C4574.f17512;
                Objects.requireNonNull(str, "name == null");
                this.f17472 = str;
                this.f17473 = c45743;
                this.f17474 = z;
                break;
        }
    }

    @Override // p396.AbstractC4581
    /* renamed from: ـﹶ */
    public final void mo10422(C4570 c4570, Object obj) {
        switch (this.f17475) {
            case 0:
                if (obj != null) {
                    this.f17473.getClass();
                    String string = obj.toString();
                    if (string != null) {
                        c4570.m10458(this.f17472, string, this.f17474);
                        break;
                    }
                }
                break;
            case 1:
                if (obj != null) {
                    this.f17473.getClass();
                    String string2 = obj.toString();
                    if (string2 != null) {
                        c4570.m10456(this.f17472, string2, this.f17474);
                        break;
                    }
                }
                break;
            default:
                if (obj != null) {
                    this.f17473.getClass();
                    String string3 = obj.toString();
                    if (string3 != null) {
                        c4570.m10459(this.f17472, string3, this.f17474);
                        break;
                    }
                }
                break;
        }
    }
}
