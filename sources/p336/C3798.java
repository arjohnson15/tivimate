package p336;

import javax.net.ssl.SSLSocket;
import p317.AbstractC3629;

/* renamed from: ᵎʿ.ʿʼ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3798 implements InterfaceC3802 {
    @Override // p336.InterfaceC3802
    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final InterfaceC3801 mo8892(SSLSocket sSLSocket) {
        Class<?> cls = sSLSocket.getClass();
        Class<?> superclass = cls;
        while (!superclass.getSimpleName().equals("OpenSSLSocketImpl")) {
            superclass = superclass.getSuperclass();
            if (superclass == null) {
                throw new AssertionError("No OpenSSLSocketImpl superclass of socket of type " + cls);
            }
        }
        return new C3806(superclass);
    }

    @Override // p336.InterfaceC3802
    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final boolean mo8893(SSLSocket sSLSocket) {
        return AbstractC3629.m8560(sSLSocket.getClass().getName(), "com.google.android.gms.org.conscrypt.", false);
    }
}
