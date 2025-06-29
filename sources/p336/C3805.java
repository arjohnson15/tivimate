package p336;

import android.net.ssl.SSLSockets;
import android.os.Build;
import java.io.IOException;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import p127.C2034;
import ᵔʼ.ˑʽ;

/* renamed from: ᵎʿ.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3805 implements InterfaceC3801 {
    @Override // p336.InterfaceC3801
    /* renamed from: ʽᐧ */
    public final String mo8894(SSLSocket sSLSocket) {
        String applicationProtocol = sSLSocket.getApplicationProtocol();
        if (applicationProtocol == null ? true : applicationProtocol.equals("")) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // p336.InterfaceC3801
    /* renamed from: ˑʽ */
    public final boolean mo8895() {
        C2034 c2034 = C2034.f7700;
        return ˑʽ.ﾞʽ() && Build.VERSION.SDK_INT >= 29;
    }

    @Override // p336.InterfaceC3801
    /* renamed from: ـﹶ */
    public final boolean mo8896(SSLSocket sSLSocket) {
        return SSLSockets.isSupportedSocket(sSLSocket);
    }

    @Override // p336.InterfaceC3801
    /* renamed from: ﹳﹳ */
    public final void mo8897(SSLSocket sSLSocket, String str, List list) throws IOException {
        try {
            SSLSockets.setUseSessionTickets(sSLSocket, true);
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            C2034 c2034 = C2034.f7700;
            sSLParameters.setApplicationProtocols((String[]) ˑʽ.ˑʽ(list).toArray(new String[0]));
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (IllegalArgumentException e) {
            throw new IOException("Android internal error", e);
        }
    }
}
