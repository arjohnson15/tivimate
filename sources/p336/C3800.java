package p336;

import java.util.List;
import javax.net.ssl.SSLSocket;

/* renamed from: ᵎʿ.ˉⁱ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3800 implements InterfaceC3801 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public InterfaceC3801 f14653;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final InterfaceC3802 f14654;

    public C3800(InterfaceC3802 interfaceC3802) {
        this.f14654 = interfaceC3802;
    }

    @Override // p336.InterfaceC3801
    /* renamed from: ʽᐧ */
    public final String mo8894(SSLSocket sSLSocket) {
        InterfaceC3801 interfaceC3801M8898 = m8898(sSLSocket);
        if (interfaceC3801M8898 != null) {
            return interfaceC3801M8898.mo8894(sSLSocket);
        }
        return null;
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final synchronized InterfaceC3801 m8898(SSLSocket sSLSocket) {
        try {
            if (this.f14653 == null && this.f14654.mo8893(sSLSocket)) {
                this.f14653 = this.f14654.mo8892(sSLSocket);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f14653;
    }

    @Override // p336.InterfaceC3801
    /* renamed from: ˑʽ */
    public final boolean mo8895() {
        return true;
    }

    @Override // p336.InterfaceC3801
    /* renamed from: ـﹶ */
    public final boolean mo8896(SSLSocket sSLSocket) {
        return this.f14654.mo8893(sSLSocket);
    }

    @Override // p336.InterfaceC3801
    /* renamed from: ﹳﹳ */
    public final void mo8897(SSLSocket sSLSocket, String str, List list) {
        InterfaceC3801 interfaceC3801M8898 = m8898(sSLSocket);
        if (interfaceC3801M8898 != null) {
            interfaceC3801M8898.mo8897(sSLSocket, str, list);
        }
    }
}
