package p013;

import p034.InterfaceC1224;
import p065.AbstractC1484;
import p065.C1509;
import p065.C1514;
import p070.AbstractC1547;
import p140.C2171;
import p140.C2183;
import p164.C2363;
import p164.C2373;
import p288.C3397;
import p331.CallableC3763;
import p338.InterfaceC3856;
import p395.InterfaceFutureC4542;

/* renamed from: ʻי.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1047 extends AbstractC1547 implements InterfaceC3856 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final /* synthetic */ int f4446;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final /* synthetic */ Object f4447;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1047(int i, Object obj) {
        super(1);
        this.f4446 = i;
        this.f4447 = obj;
    }

    @Override // p338.InterfaceC3856
    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final Object mo4036(Object obj) {
        switch (this.f4446) {
            case 0:
                return obj == ((AbstractC1033) this.f4447) ? "(this Collection)" : String.valueOf(obj);
            case 1:
                return ((CallableC3763) this.f4447).call();
            case 2:
                ((C1514) this.f4447).f6166 = (InterfaceC1224) obj;
                return C3397.f13249;
            case 3:
                return ((AbstractC1484) this.f4447).mo1379((C1509) obj);
            case 4:
                ((C2171) this.f4447).m6093((C2183) obj);
                return C3397.f13249;
            case 5:
                Throwable th = (Throwable) obj;
                if (th != null) {
                    ((C2363) this.f4447).f9355.m6675(new C2373(th));
                }
                Object obj2 = C2363.f9348;
                C2363 c2363 = (C2363) this.f4447;
                synchronized (obj2) {
                    C2363.f9349.remove(c2363.m6461().getAbsolutePath());
                }
                return C3397.f13249;
            default:
                ((InterfaceFutureC4542) this.f4447).cancel(false);
                return C3397.f13249;
        }
    }
}
