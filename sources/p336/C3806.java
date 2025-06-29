package p336;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLSocket;
import p070.AbstractC1549;
import p127.C2030;
import p127.C2034;
import p317.AbstractC3625;
import ᵔʼ.ˑʽ;

/* renamed from: ᵎʿ.ٴˎ, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C3806 implements InterfaceC3801 {

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public static final C3798 f14658 = new C3798();

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final Method f14659;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final Method f14660;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final Method f14661;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final Class f14662;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final Method f14663;

    public C3806(Class cls) {
        this.f14662 = cls;
        this.f14659 = cls.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE);
        this.f14661 = cls.getMethod("setHostname", String.class);
        this.f14663 = cls.getMethod("getAlpnSelectedProtocol", null);
        this.f14660 = cls.getMethod("setAlpnProtocols", byte[].class);
    }

    @Override // p336.InterfaceC3801
    /* renamed from: ʽᐧ */
    public final String mo8894(SSLSocket sSLSocket) {
        if (!this.f14662.isInstance(sSLSocket)) {
            return null;
        }
        try {
            byte[] bArr = (byte[]) this.f14663.invoke(sSLSocket, null);
            if (bArr != null) {
                return new String(bArr, AbstractC3625.f13869);
            }
            return null;
        } catch (IllegalAccessException e) {
            throw new AssertionError(e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if ((cause instanceof NullPointerException) && AbstractC1549.m5138(((NullPointerException) cause).getMessage(), "ssl == null")) {
                return null;
            }
            throw new AssertionError(e2);
        }
    }

    @Override // p336.InterfaceC3801
    /* renamed from: ˑʽ */
    public final boolean mo8895() {
        boolean z = C2030.f7693;
        return C2030.f7693;
    }

    @Override // p336.InterfaceC3801
    /* renamed from: ـﹶ */
    public final boolean mo8896(SSLSocket sSLSocket) {
        return this.f14662.isInstance(sSLSocket);
    }

    @Override // p336.InterfaceC3801
    /* renamed from: ﹳﹳ */
    public final void mo8897(SSLSocket sSLSocket, String str, List list) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (this.f14662.isInstance(sSLSocket)) {
            try {
                this.f14659.invoke(sSLSocket, Boolean.TRUE);
                if (str != null) {
                    this.f14661.invoke(sSLSocket, str);
                }
                Method method = this.f14660;
                C2034 c2034 = C2034.f7700;
                method.invoke(sSLSocket, ˑʽ.ˏᴵ(list));
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            } catch (InvocationTargetException e2) {
                throw new AssertionError(e2);
            }
        }
    }
}
