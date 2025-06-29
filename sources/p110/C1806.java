package p110;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import javax.net.SocketFactory;
import p344.AbstractC3917;
import p344.InterfaceC3918;

/* renamed from: ˆﹳ.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1806 extends SocketFactory {

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static final InterfaceC3918 f6960 = AbstractC3917.m9105(C1806.class);

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final Proxy f6962 = Proxy.NO_PROXY;

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final int f6961 = 5000;

    @Override // javax.net.SocketFactory
    public final Socket createSocket() {
        return new Socket(this.f6962);
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i) {
        return m5551(new InetSocketAddress(str, i), null);
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i, InetAddress inetAddress, int i2) {
        return m5551(new InetSocketAddress(str, i), new InetSocketAddress(inetAddress, i2));
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i) {
        return m5551(new InetSocketAddress(inetAddress, i), null);
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) {
        return m5551(new InetSocketAddress(inetAddress, i), new InetSocketAddress(inetAddress2, i2));
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final Socket m5551(InetSocketAddress inetSocketAddress, InetSocketAddress inetSocketAddress2) throws IOException {
        Socket socket = new Socket(this.f6962);
        if (inetSocketAddress2 != null) {
            socket.bind(inetSocketAddress2);
        }
        f6960.mo5517(inetSocketAddress, "Connecting to {}");
        socket.connect(inetSocketAddress, this.f6961);
        return socket;
    }
}
