package p065;

import android.os.RemoteException;
import java.util.Set;

/* renamed from: ʾᵔ.ˎٴ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1497 extends AbstractC1487 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final /* synthetic */ C1526 f6089;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1497(C1526 c1526, String[] strArr) {
        super(strArr);
        this.f6089 = c1526;
    }

    @Override // p065.AbstractC1487
    /* renamed from: ـﹶ */
    public final void mo5057(Set set) {
        C1526 c1526 = this.f6089;
        if (c1526.f6200.get()) {
            return;
        }
        try {
            InterfaceC1513 interfaceC1513 = c1526.f6206;
            if (interfaceC1513 != null) {
                interfaceC1513.mo5035(c1526.f6205, (String[]) set.toArray(new String[0]));
            }
        } catch (RemoteException e) {
        }
    }
}
