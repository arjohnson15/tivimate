package p396;

import retrofit2.HttpException;
import ـˈ.ˎـ;

/* renamed from: ⁱᴵ.ˏᵢ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4567 implements InterfaceC4576 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final C4555 f17491;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final /* synthetic */ int f17492;

    public /* synthetic */ C4567(C4555 c4555, int i) {
        this.f17492 = i;
        this.f17491 = c4555;
    }

    @Override // p396.InterfaceC4576
    /* renamed from: ˉי */
    public final void mo7069(Throwable th) {
        switch (this.f17492) {
            case 0:
                ˎـ.ʿˏ(this.f17491, th);
                break;
            default:
                ˎـ.ʿˏ(this.f17491, th);
                break;
        }
    }

    @Override // p396.InterfaceC4576
    /* renamed from: ٴˎ */
    public final void mo7070(InterfaceC4591 interfaceC4591, C4586 c4586) {
        switch (this.f17492) {
            case 0:
                boolean zM11083 = c4586.f17538.m11083();
                C4555 c4555 = this.f17491;
                if (!zM11083) {
                    ˎـ.ˋˊ(c4555, new HttpException(c4586));
                    break;
                } else {
                    ˎـ.ﹳˎ(c4555, c4586.f17537);
                    break;
                }
            default:
                ˎـ.ﾞˊ(this.f17491, c4586);
                break;
        }
    }
}
