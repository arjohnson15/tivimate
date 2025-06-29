package p127;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import p013.AbstractC1039;
import p430.EnumC5022;

/* renamed from: ˈⁱ.ˉי, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2026 extends C2034 {

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final Method f7683;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final Method f7684;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final Class f7685;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final Class f7686;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final Method f7687;

    public C2026(Method method, Method method2, Method method3, Class cls, Class cls2) {
        this.f7684 = method;
        this.f7687 = method2;
        this.f7683 = method3;
        this.f7685 = cls;
        this.f7686 = cls2;
    }

    @Override // p127.C2034
    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void mo5674(SSLSocket sSLSocket) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        try {
            this.f7683.invoke(null, sSLSocket);
        } catch (IllegalAccessException e) {
            throw new AssertionError("failed to remove ALPN", e);
        } catch (InvocationTargetException e2) {
            throw new AssertionError("failed to remove ALPN", e2);
        }
    }

    @Override // p127.C2034
    /* renamed from: ٴˎ */
    public final String mo5672(SSLSocket sSLSocket) {
        try {
            C2035 c2035 = (C2035) Proxy.getInvocationHandler(this.f7687.invoke(null, sSLSocket));
            boolean z = c2035.f7701;
            if (!z && c2035.f7702 == null) {
                C2034.m5684(4, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", null);
                return null;
            }
            if (z) {
                return null;
            }
            return c2035.f7702;
        } catch (IllegalAccessException e) {
            throw new AssertionError("failed to get ALPN selected protocol", e);
        } catch (InvocationTargetException e2) {
            throw new AssertionError("failed to get ALPN selected protocol", e2);
        }
    }

    @Override // p127.C2034
    /* renamed from: ﹳﹳ */
    public final void mo5673(SSLSocket sSLSocket, String str, List list) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((EnumC5022) obj) != EnumC5022.f19055) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC1039.m4012(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((EnumC5022) it.next()).f19062);
        }
        try {
            this.f7684.invoke(null, sSLSocket, Proxy.newProxyInstance(C2034.class.getClassLoader(), new Class[]{this.f7685, this.f7686}, new C2035(arrayList2)));
        } catch (IllegalAccessException e) {
            throw new AssertionError("failed to set ALPN", e);
        } catch (InvocationTargetException e2) {
            throw new AssertionError("failed to set ALPN", e2);
        }
    }
}
