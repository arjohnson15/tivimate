package p033;

import p166.C2396;
import p166.InterfaceC2446;
import p383.InterfaceC4461;

/* renamed from: ʼᵎ.ˑʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final /* synthetic */ class C1217 implements InterfaceC4461 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final /* synthetic */ int f4998;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final /* synthetic */ int f4999 = 1;

    public /* synthetic */ C1217(int i) {
        this.f4998 = i;
    }

    public /* synthetic */ C1217(C1218 c1218, int i, C2396 c2396, C2396 c23962) {
        this.f4998 = i;
    }

    @Override // p383.InterfaceC4461
    /* renamed from: ʽᐧ */
    public final void mo4092(Object obj) {
        switch (this.f4999) {
            case 0:
                C1213 c1213 = (C1213) obj;
                c1213.getClass();
                int i = this.f4998;
                if (i == 1) {
                    c1213.f4963 = true;
                }
                c1213.f4970 = i;
                break;
            default:
                ((InterfaceC2446) obj).mo4343(this.f4998);
                break;
        }
    }
}
