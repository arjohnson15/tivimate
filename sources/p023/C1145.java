package p023;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import p072.C1617;
import p423.AbstractC4872;
import p423.InterfaceC4887;
import p457.C5391;

/* renamed from: ʼʾ.ٴˎ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1145 extends ConnectivityManager.NetworkCallback {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC4887 f4783;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final /* synthetic */ C1617 f4784;

    public C1145(C1617 c1617, InterfaceC4887 interfaceC4887) {
        this.f4784 = c1617;
        this.f4783 = interfaceC4887;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        this.f4784.mo5172(null);
        C5391.m12163().m12168(AbstractC1148.f4791, "NetworkRequestConstraintController onCapabilitiesChanged callback");
        ((AbstractC4872) this.f4783).mo10958(C1144.f4782);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        this.f4784.mo5172(null);
        C5391.m12163().m12168(AbstractC1148.f4791, "NetworkRequestConstraintController onLost callback");
        ((AbstractC4872) this.f4783).mo10958(new C1134(7));
    }
}
