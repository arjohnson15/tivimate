package p099;

import java.util.List;
import p130.C2058;
import p166.C2430;
import p254.C3155;
import p254.InterfaceC3165;
import p254.InterfaceC3168;
import p254.InterfaceC3177;
import p345.AbstractC3980;
import p345.C3928;
import p345.C3932;

/* renamed from: ˆˋ.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1772 implements InterfaceC3165 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final InterfaceC3165 f6852;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final /* synthetic */ int f6853;

    public C1772(byte b, int i) {
        this.f6853 = i;
        switch (i) {
            case 1:
                this.f6852 = new C3155(35152, 2, "image/png");
                break;
            default:
                this.f6852 = new C3155(16973, 2, "image/bmp");
                break;
        }
    }

    public C1772(int i) {
        this.f6853 = 2;
        if ((i & 1) != 0) {
            this.f6852 = new C3155(65496, 2, "image/jpeg");
        } else {
            this.f6852 = new C2058();
        }
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    private final void m5488() {
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    private final void m5489() {
    }

    @Override // p254.InterfaceC3165
    /* renamed from: ʽᐧ */
    public final void mo4073() {
        switch (this.f6853) {
            case 0:
            case 1:
                break;
            default:
                this.f6852.mo4073();
                break;
        }
    }

    @Override // p254.InterfaceC3165
    /* renamed from: ʿʼ */
    public final boolean mo4074(InterfaceC3168 interfaceC3168) {
        switch (this.f6853) {
            case 0:
                return ((C3155) this.f6852).mo4074(interfaceC3168);
            case 1:
                return ((C3155) this.f6852).mo4074(interfaceC3168);
            default:
                return this.f6852.mo4074(interfaceC3168);
        }
    }

    @Override // p254.InterfaceC3165
    /* renamed from: ˉי */
    public final int mo4075(InterfaceC3168 interfaceC3168, C2430 c2430) {
        switch (this.f6853) {
            case 0:
                return ((C3155) this.f6852).mo4075(interfaceC3168, c2430);
            case 1:
                return ((C3155) this.f6852).mo4075(interfaceC3168, c2430);
            default:
                return this.f6852.mo4075(interfaceC3168, c2430);
        }
    }

    @Override // p254.InterfaceC3165
    /* renamed from: ˏᵢ */
    public final List mo4079() {
        switch (this.f6853) {
            case 0:
                C3928 c3928 = AbstractC3980.f15360;
                break;
            case 1:
                C3928 c39282 = AbstractC3980.f15360;
                break;
            default:
                C3928 c39283 = AbstractC3980.f15360;
                break;
        }
        return C3932.f15274;
    }

    @Override // p254.InterfaceC3165
    /* renamed from: ـﹶ */
    public final void mo4082(long j, long j2) {
        switch (this.f6853) {
            case 0:
                ((C3155) this.f6852).mo4082(j, j2);
                break;
            case 1:
                ((C3155) this.f6852).mo4082(j, j2);
                break;
            default:
                this.f6852.mo4082(j, j2);
                break;
        }
    }

    @Override // p254.InterfaceC3165
    /* renamed from: ᐧʻ */
    public final void mo4084(InterfaceC3177 interfaceC3177) {
        switch (this.f6853) {
            case 0:
                ((C3155) this.f6852).mo4084(interfaceC3177);
                break;
            case 1:
                ((C3155) this.f6852).mo4084(interfaceC3177);
                break;
            default:
                this.f6852.mo4084(interfaceC3177);
                break;
        }
    }

    @Override // p254.InterfaceC3165
    /* renamed from: ﹳﹳ */
    public final InterfaceC3165 mo4086() {
        int i = this.f6853;
        return this;
    }
}
