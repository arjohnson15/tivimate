package p000;

import android.net.Uri;
import androidx.media3.datasource.UdpDataSource$UdpDataSourceException;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;

/* renamed from: ʻ.ʿˏ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0865 extends AbstractC0863 {

    /* renamed from: ʾʼ, reason: contains not printable characters */
    public boolean f3925;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final int f3926;

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public Uri f3927;

    /* renamed from: ˑﾞ, reason: contains not printable characters */
    public int f3928;

    /* renamed from: ـˆ, reason: contains not printable characters */
    public DatagramSocket f3929;

    /* renamed from: ᴵʼ, reason: contains not printable characters */
    public MulticastSocket f3930;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final byte[] f3931;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public final DatagramPacket f3932;

    /* renamed from: ﾞᐧ, reason: contains not printable characters */
    public InetAddress f3933;

    public C0865() {
        this(8000);
    }

    public C0865(int i) {
        super(true);
        this.f3926 = i;
        byte[] bArr = new byte[2000];
        this.f3931 = bArr;
        this.f3932 = new DatagramPacket(bArr, 0, 2000);
    }

    @Override // p000.InterfaceC0875
    public final void close() throws IOException {
        this.f3927 = null;
        MulticastSocket multicastSocket = this.f3930;
        if (multicastSocket != null) {
            try {
                InetAddress inetAddress = this.f3933;
                inetAddress.getClass();
                multicastSocket.leaveGroup(inetAddress);
            } catch (IOException unused) {
            }
            this.f3930 = null;
        }
        DatagramSocket datagramSocket = this.f3929;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.f3929 = null;
        }
        this.f3933 = null;
        this.f3928 = 0;
        if (this.f3925) {
            this.f3925 = false;
            m3675();
        }
    }

    @Override // p166.InterfaceC2442
    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final int mo3679(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.f3928;
        DatagramPacket datagramPacket = this.f3932;
        if (i3 == 0) {
            try {
                DatagramSocket datagramSocket = this.f3929;
                datagramSocket.getClass();
                datagramSocket.receive(datagramPacket);
                int length = datagramPacket.getLength();
                this.f3928 = length;
                m3676(length);
            } catch (SocketTimeoutException e) {
                throw new UdpDataSource$UdpDataSourceException(e, 2002);
            } catch (IOException e2) {
                throw new UdpDataSource$UdpDataSourceException(e2, 2001);
            }
        }
        int length2 = datagramPacket.getLength();
        int i4 = this.f3928;
        int iMin = Math.min(i4, i2);
        System.arraycopy(this.f3931, length2 - i4, bArr, i, iMin);
        this.f3928 -= iMin;
        return iMin;
    }

    @Override // p000.InterfaceC0875
    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public final long mo3680(C0882 c0882) throws IOException {
        Uri uri = c0882.f4004;
        this.f3927 = uri;
        String host = uri.getHost();
        host.getClass();
        int port = this.f3927.getPort();
        m3673();
        try {
            this.f3933 = InetAddress.getByName(host);
            InetSocketAddress inetSocketAddress = new InetSocketAddress(this.f3933, port);
            if (this.f3933.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(inetSocketAddress);
                this.f3930 = multicastSocket;
                multicastSocket.joinGroup(this.f3933);
                this.f3929 = this.f3930;
            } else {
                this.f3929 = new DatagramSocket(inetSocketAddress);
            }
            this.f3929.setSoTimeout(this.f3926);
            this.f3925 = true;
            m3677(c0882);
            return -1L;
        } catch (IOException e) {
            throw new UdpDataSource$UdpDataSourceException(e, 2001);
        } catch (SecurityException e2) {
            throw new UdpDataSource$UdpDataSourceException(e2, 2006);
        }
    }

    @Override // p000.InterfaceC0875
    /* renamed from: ˑי, reason: contains not printable characters */
    public final Uri mo3681() {
        return this.f3927;
    }
}
