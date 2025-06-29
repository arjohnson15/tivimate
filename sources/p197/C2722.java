package p197;

import android.util.AndroidRuntimeException;

/* renamed from: ˎˑ.ˏᵢ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2722 extends AbstractC2727 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final /* synthetic */ C2718 f10669;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final /* synthetic */ int f10670;

    public /* synthetic */ C2722(C2718 c2718, int i) {
        this.f10670 = i;
        this.f10669 = c2718;
    }

    @Override // p197.InterfaceC2732
    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final void mo6925(AbstractC2726 abstractC2726) {
        switch (this.f10670) {
            case 0:
                C2718 c2718 = this.f10669;
                if (c2718.f10636.get(abstractC2726) == null) {
                    throw new AndroidRuntimeException("Error: animation ended is not in the node map");
                }
                ((C2720) c2718.f10636.get(abstractC2726)).f10659 = true;
                return;
            default:
                C2718 c27182 = this.f10669;
                if (c27182.f10636.get(abstractC2726) == null) {
                    throw new AndroidRuntimeException("Error: animation ended is not in the node map");
                }
                ((C2720) c27182.f10636.get(abstractC2726)).f10659 = true;
                return;
        }
    }
}
