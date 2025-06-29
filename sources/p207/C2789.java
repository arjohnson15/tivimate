package p207;

import kotlin.KotlinNullPointerException;
import p072.C1602;
import p251.C3130;
import p251.InterfaceC3133;
import p288.C3403;
import p396.C4586;
import p396.C4589;
import p396.InterfaceC4576;
import p396.InterfaceC4591;
import retrofit2.HttpException;

/* renamed from: ˎﹶ.ʽᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2789 implements InterfaceC3133, InterfaceC4576 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final /* synthetic */ C1602 f10854;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final /* synthetic */ int f10855;

    public /* synthetic */ C2789(C1602 c1602, int i) {
        this.f10855 = i;
        this.f10854 = c1602;
    }

    @Override // p251.InterfaceC3133
    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public void mo7068(C3130 c3130) {
        Exception excM7684 = c3130.m7684();
        if (excM7684 != null) {
            this.f10854.mo3974(new C3403(excM7684));
        } else if (c3130.f12086) {
            this.f10854.m5209(null);
        } else {
            this.f10854.mo3974(c3130.m7689());
        }
    }

    @Override // p396.InterfaceC4576
    /* renamed from: ˉי, reason: contains not printable characters */
    public void mo7069(Throwable th) {
        switch (this.f10855) {
            case 1:
                this.f10854.mo3974(new C3403(th));
                break;
            default:
                this.f10854.mo3974(new C3403(th));
                break;
        }
    }

    @Override // p396.InterfaceC4576
    /* renamed from: ٴˎ, reason: contains not printable characters */
    public void mo7070(InterfaceC4591 interfaceC4591, C4586 c4586) {
        switch (this.f10855) {
            case 1:
                boolean zM11083 = c4586.f17538.m11083();
                C1602 c1602 = this.f10854;
                if (!zM11083) {
                    c1602.mo3974(new C3403(new HttpException(c4586)));
                    break;
                } else {
                    Object obj = c4586.f17537;
                    if (obj != null) {
                        c1602.mo3974(obj);
                        break;
                    } else {
                        C4589 c4589 = (C4589) C4589.class.cast(interfaceC4591.mo10463().f19050.get(C4589.class));
                        c1602.mo3974(new C3403(new KotlinNullPointerException("Response from " + c4589.f17572.getName() + '.' + c4589.f17571.getName() + " was null but response body type was declared as non-null")));
                        break;
                    }
                }
            default:
                this.f10854.mo3974(c4586);
                break;
        }
    }
}
