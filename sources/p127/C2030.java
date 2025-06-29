package p127;

import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import p013.AbstractC1036;
import p185.C2564;
import p229.InterfaceC3061;
import p336.C3797;
import p336.C3799;
import p336.C3800;
import p336.C3803;
import p336.C3806;
import p336.C3808;
import p336.InterfaceC3801;
import ᵔʼ.ˑʽ;

/* renamed from: ˈⁱ.ˑʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2030 extends C2034 {

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public static final boolean f7693;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final ArrayList f7694;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final C2564 f7695;

    static {
        boolean z = false;
        if (ˑʽ.ﾞʽ() && Build.VERSION.SDK_INT < 30) {
            z = true;
        }
        f7693 = z;
    }

    public C2030() throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        C3808 c3808;
        Method method;
        Method method2;
        Method method3 = null;
        try {
            Class<?> cls = Class.forName("com.android.org.conscrypt".concat(".OpenSSLSocketImpl"));
            Class.forName("com.android.org.conscrypt".concat(".OpenSSLSocketFactoryImpl"));
            Class.forName("com.android.org.conscrypt".concat(".SSLParametersImpl"));
            c3808 = new C3808(cls);
        } catch (Exception e) {
            C2034.f7700.getClass();
            C2034.m5684(5, "unable to load android socket classes", e);
            c3808 = null;
        }
        ArrayList arrayListM4001 = AbstractC1036.m4001(new InterfaceC3801[]{c3808, new C3800(C3806.f14658), new C3800(C3799.f14652), new C3800(C3803.f14655)});
        ArrayList arrayList = new ArrayList();
        Iterator it = arrayListM4001.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((InterfaceC3801) next).mo8895()) {
                arrayList.add(next);
            }
        }
        this.f7694 = arrayList;
        try {
            Class<?> cls2 = Class.forName("dalvik.system.CloseGuard");
            Method method4 = cls2.getMethod("get", null);
            method = cls2.getMethod("open", String.class);
            method2 = cls2.getMethod("warnIfOpen", null);
            method3 = method4;
        } catch (Exception unused) {
            method = null;
            method2 = null;
        }
        this.f7695 = new C2564(method3, method, method2);
    }

    @Override // p127.C2034
    /* renamed from: ʽᐧ, reason: contains not printable characters */
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
    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final void mo5677(Socket socket, InetSocketAddress inetSocketAddress, int i) throws IOException {
        try {
            socket.connect(inetSocketAddress, i);
        } catch (ClassCastException e) {
            if (Build.VERSION.SDK_INT != 26) {
                throw e;
            }
            throw new IOException("Exception in connect", e);
        }
    }

    @Override // p127.C2034
    /* renamed from: ˉי, reason: contains not printable characters */
    public final void mo5678(Object obj, String str) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        C2564 c2564 = this.f7695;
        c2564.getClass();
        if (obj != null) {
            try {
                c2564.f10147.invoke(obj, null);
                return;
            } catch (Exception unused) {
            }
        }
        C2034.m5684(5, str, null);
    }

    @Override // p127.C2034
    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final boolean mo5679(String str) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 24) {
            return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
        }
        if (i >= 23) {
            return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted();
        }
        return true;
    }

    @Override // p127.C2034
    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final InterfaceC3061 mo5680(X509TrustManager x509TrustManager) throws NoSuchMethodException, SecurityException {
        try {
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            declaredMethod.setAccessible(true);
            return new C2024(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return super.mo5680(x509TrustManager);
        }
    }

    @Override // p127.C2034
    /* renamed from: ٴˎ */
    public final String mo5672(SSLSocket sSLSocket) {
        Object next;
        Iterator it = this.f7694.iterator();
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
    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final Object mo5681() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        C2564 c2564 = this.f7695;
        Method method = c2564.f10148;
        if (method == null) {
            return null;
        }
        try {
            Object objInvoke = method.invoke(null, null);
            c2564.f10146.invoke(objInvoke, "response.body().close()");
            return objInvoke;
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // p127.C2034
    /* renamed from: ﹳﹳ */
    public final void mo5673(SSLSocket sSLSocket, String str, List list) {
        Object next;
        Iterator it = this.f7694.iterator();
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
