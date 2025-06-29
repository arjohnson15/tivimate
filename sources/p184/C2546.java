package p184;

import kotlinx.coroutines.flow.internal.AbortFlowException;
import p070.C1561;
import p288.C3397;
import p330.InterfaceC3746;
import p429.C4949;
import p429.C4975;

/* renamed from: ˎ.ˏᴵ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2546 implements InterfaceC2552 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final /* synthetic */ Object f10099;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final /* synthetic */ int f10100;

    public /* synthetic */ C2546(int i, Object obj) {
        this.f10100 = i;
        this.f10099 = obj;
    }

    @Override // p184.InterfaceC2552
    /* renamed from: ˏʾ */
    public final Object mo3959(Object obj, InterfaceC3746 interfaceC3746) {
        switch (this.f10100) {
            case 0:
                ((C1561) this.f10099).f6302 = obj;
                throw new AbortFlowException(this);
            default:
                ((C4949) this.f10099).f18721.set((C4975) obj);
                return C3397.f13249;
        }
    }
}
