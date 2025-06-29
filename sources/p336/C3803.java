package p336;

import java.util.List;
import javax.net.ssl.SSLSocket;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;
import p070.AbstractC1549;
import p127.C2025;
import p127.C2034;
import ᵔʼ.ˑʽ;

/* renamed from: ᵎʿ.ˏᵢ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3803 implements InterfaceC3801 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final C3807 f14655 = new C3807();

    @Override // p336.InterfaceC3801
    /* renamed from: ʽᐧ */
    public final String mo8894(SSLSocket sSLSocket) {
        String applicationProtocol = ((BCSSLSocket) sSLSocket).getApplicationProtocol();
        if (applicationProtocol == null ? true : AbstractC1549.m5138(applicationProtocol, "")) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // p336.InterfaceC3801
    /* renamed from: ˑʽ */
    public final boolean mo8895() {
        boolean z = C2025.f7681;
        return C2025.f7681;
    }

    @Override // p336.InterfaceC3801
    /* renamed from: ـﹶ */
    public final boolean mo8896(SSLSocket sSLSocket) {
        return false;
    }

    @Override // p336.InterfaceC3801
    /* renamed from: ﹳﹳ */
    public final void mo8897(SSLSocket sSLSocket, String str, List list) {
        if (mo8896(sSLSocket)) {
            BCSSLSocket bCSSLSocket = (BCSSLSocket) sSLSocket;
            BCSSLParameters parameters = bCSSLSocket.getParameters();
            C2034 c2034 = C2034.f7700;
            parameters.setApplicationProtocols((String[]) ˑʽ.ˑʽ(list).toArray(new String[0]));
            bCSSLSocket.setParameters(parameters);
        }
    }
}
