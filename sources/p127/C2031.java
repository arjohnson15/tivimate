package p127;

import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import p013.AbstractC1036;
import p336.C3797;
import p336.C3799;
import p336.C3800;
import p336.C3803;
import p336.C3805;
import p336.C3806;
import p336.InterfaceC3801;
import ᵔʼ.ˑʽ;

/* renamed from: ˈⁱ.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2031 extends C2034 {

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static final boolean f7696;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final ArrayList f7697;

    static {
        f7696 = ˑʽ.ﾞʽ() && Build.VERSION.SDK_INT >= 29;
    }

    public C2031() {
        ArrayList arrayListM4001 = AbstractC1036.m4001(new InterfaceC3801[]{(!ˑʽ.ﾞʽ() || Build.VERSION.SDK_INT < 29) ? null : new C3805(), new C3800(C3806.f14658), new C3800(C3799.f14652), new C3800(C3803.f14655)});
        ArrayList arrayList = new ArrayList();
        Iterator it = arrayListM4001.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((InterfaceC3801) next).mo8895()) {
                arrayList.add(next);
            }
        }
        this.f7697 = arrayList;
    }

    @Override // p127.C2034
    /* renamed from: ʽᐧ */
    public final com.bumptech.glide.ˑʽ mo5676(X509TrustManager x509TrustManager) {
        X509TrustManagerExtensions x509TrustManagerExtensions;
        try {
            x509TrustManagerExtensions = new X509TrustManagerExtensions(x509TrustManager);
        } catch (IllegalArgumentException unused) {
            x509TrustManagerExtensions = null;
        }
        C3797 c3797 = x509TrustManagerExtensions != null ? new C3797(x509TrustManager, x509TrustManagerExtensions) : null;
        return c3797 != null ? c3797 : super.mo5676(x509TrustManager);
    }

    @Override // p127.C2034
    /* renamed from: ˏᵢ */
    public final boolean mo5679(String str) {
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }

    @Override // p127.C2034
    /* renamed from: ٴˎ */
    public final String mo5672(SSLSocket sSLSocket) {
        Object next;
        Iterator it = this.f7697.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((InterfaceC3801) next).mo8896(sSLSocket)) {
                break;
            }
        }
        InterfaceC3801 interfaceC3801 = (InterfaceC3801) next;
        if (interfaceC3801 != null) {
            return interfaceC3801.mo8894(sSLSocket);
        }
        return null;
    }

    @Override // p127.C2034
    /* renamed from: ﹳﹳ */
    public final void mo5673(SSLSocket sSLSocket, String str, List list) {
        Object next;
        Iterator it = this.f7697.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((InterfaceC3801) next).mo8896(sSLSocket)) {
                    break;
                }
            }
        }
        InterfaceC3801 interfaceC3801 = (InterfaceC3801) next;
        if (interfaceC3801 != null) {
            interfaceC3801.mo8897(sSLSocket, str, list);
        }
    }
}
