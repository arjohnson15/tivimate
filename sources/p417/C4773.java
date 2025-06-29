package p417;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import p305.C3524;

/* renamed from: ﹳᴵ.ﹳˑ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4773 extends AbstractC4761 {

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC4747 f18300;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final IBinder f18301;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4773(AbstractC4747 abstractC4747, int i, IBinder iBinder, Bundle bundle) {
        super(abstractC4747, i, bundle);
        this.f18300 = abstractC4747;
        this.f18301 = iBinder;
    }

    @Override // p417.AbstractC4761
    /* renamed from: ʽᐧ */
    public final boolean mo10677() throws RemoteException {
        IBinder iBinder = this.f18301;
        try {
            AbstractC4753.m10683(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            AbstractC4747 abstractC4747 = this.f18300;
            if (!abstractC4747.mo8565().equals(interfaceDescriptor)) {
                String str = "service descriptor mismatch: " + abstractC4747.mo8565() + " vs. " + interfaceDescriptor;
                return false;
            }
            IInterface iInterfaceMo8568 = abstractC4747.mo8568(iBinder);
            if (iInterfaceMo8568 == null || !(AbstractC4747.m10657(abstractC4747, 2, 4, iInterfaceMo8568) || AbstractC4747.m10657(abstractC4747, 3, 4, iInterfaceMo8568))) {
                return false;
            }
            abstractC4747.f18221 = null;
            InterfaceC4746 interfaceC4746 = abstractC4747.f18211;
            if (interfaceC4746 == null) {
                return true;
            }
            interfaceC4746.mo10430();
            return true;
        } catch (RemoteException unused) {
            return false;
        }
    }

    @Override // p417.AbstractC4761
    /* renamed from: ـﹶ */
    public final void mo10678(C3524 c3524) {
        InterfaceC4760 interfaceC4760 = this.f18300.f18214;
        if (interfaceC4760 != null) {
            interfaceC4760.mo10693(c3524);
        }
        System.currentTimeMillis();
    }
}
