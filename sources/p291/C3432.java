package p291;

import android.util.Log;
import android.view.ViewGroup;
import androidx.fragment.app.C0107;
import p023.C1149;
import p070.AbstractC1547;
import p070.C1561;
import p288.C3397;
import p338.InterfaceC3865;

/* renamed from: ٴᐧ.ˏᵢ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3432 extends AbstractC1547 implements InterfaceC3865 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final /* synthetic */ C0107 f13315;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final /* synthetic */ C1561 f13316;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final /* synthetic */ ViewGroup f13317;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final /* synthetic */ Object f13318;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3432(C0107 c0107, ViewGroup viewGroup, Object obj, C1561 c1561) {
        super(0);
        this.f13315 = c0107;
        this.f13317 = viewGroup;
        this.f13318 = obj;
        this.f13316 = c1561;
    }

    @Override // p338.InterfaceC3865
    /* renamed from: ـﹶ */
    public final Object mo1053() {
        C0107 c0107 = this.f13315;
        AbstractC3448 abstractC3448 = c0107.f667;
        ViewGroup viewGroup = this.f13317;
        Object obj = this.f13318;
        Object objMo6064 = abstractC3448.mo6064(viewGroup, obj);
        c0107.f670 = objMo6064;
        if (objMo6064 == null) {
            throw new IllegalStateException(("Unable to start transition " + obj + " for container " + viewGroup + '.').toString());
        }
        this.f13316.f6302 = new C1149(c0107, 2, viewGroup);
        if (Log.isLoggable("FragmentManager", 2)) {
            String str = "Started executing operations from " + c0107.f671 + " to " + c0107.f658;
        }
        return C3397.f13249;
    }
}
