package p336;

import java.util.List;
import javax.net.ssl.SSLSocket;
import org.conscrypt.Conscrypt;
import p127.C2029;
import p127.C2034;
import ᵔʼ.ˑʽ;

/* renamed from: ᵎʿ.ˉי, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3799 implements InterfaceC3801 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final C3810 f14652 = new C3810();

    @Override // p336.InterfaceC3801
    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final String mo8894(SSLSocket sSLSocket) {
        if (mo8896(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return null;
    }

    @Override // p336.InterfaceC3801
    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final boolean mo8895() {
        boolean z = C2029.f7691;
        return C2029.f7691;
    }

    @Override // p336.InterfaceC3801
    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final boolean mo8896(SSLSocket sSLSocket) {
        return Conscrypt.isConscrypt(sSLSocket);
    }

    @Override // p336.InterfaceC3801
    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final void mo8897(SSLSocket sSLSocket, String str, List list) {
        if (mo8896(sSLSocket)) {
            Conscrypt.setUseSessionTickets(sSLSocket, true);
            C2034 c2034 = C2034.f7700;
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) ˑʽ.ˑʽ(list).toArray(new String[0]));
        }
    }
}
