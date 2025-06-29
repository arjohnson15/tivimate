package p336;

import javax.net.ssl.SSLSocket;
import org.conscrypt.Conscrypt;
import p127.AbstractC2032;
import p127.C2029;

/* renamed from: ᵎʿ.ﹶˆ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3810 implements InterfaceC3802 {
    @Override // p336.InterfaceC3802
    /* renamed from: ʽᐧ */
    public final InterfaceC3801 mo8892(SSLSocket sSLSocket) {
        return new C3799();
    }

    @Override // p336.InterfaceC3802
    /* renamed from: ـﹶ */
    public final boolean mo8893(SSLSocket sSLSocket) {
        boolean z = C2029.f7691;
        return AbstractC2032.m5682() && Conscrypt.isConscrypt(sSLSocket);
    }
}
