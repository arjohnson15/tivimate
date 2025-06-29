package p141;

import android.net.Uri;
import android.support.v4.media.session.AbstractC0001;
import android.support.v4.media.session.AbstractC0002;
import androidx.media3.datasource.UdpDataSource$UdpDataSourceException;
import java.io.IOException;
import java.net.DatagramSocket;
import java.util.Collections;
import java.util.Locale;
import java.util.Map;
import p000.C0865;
import p000.C0882;
import p000.InterfaceC0880;
import p383.AbstractC4464;
import p383.AbstractC4470;

/* renamed from: ˉˑ.ﹳﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2216 implements InterfaceC2215 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public C2216 f8773;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final C0865 f8774 = new C0865(AbstractC0001.m12(8000));

    @Override // p000.InterfaceC0875
    public final void close() throws IOException {
        this.f8774.close();
        C2216 c2216 = this.f8773;
        if (c2216 != null) {
            c2216.close();
        }
    }

    @Override // p141.InterfaceC2215
    /* renamed from: ʽᐧ */
    public final String mo6175() {
        int iMo6176 = mo6176();
        AbstractC4464.m10132(iMo6176 != -1);
        int i = AbstractC4470.f17202;
        Locale locale = Locale.US;
        return AbstractC0002.m55(iMo6176, 1 + iMo6176, "RTP/AVP;unicast;client_port=", "-");
    }

    @Override // p166.InterfaceC2442
    /* renamed from: ˆʿ */
    public final int mo3679(byte[] bArr, int i, int i2) throws UdpDataSource$UdpDataSourceException {
        try {
            return this.f8774.mo3679(bArr, i, i2);
        } catch (UdpDataSource$UdpDataSourceException e) {
            if (e.f1339 == 2002) {
                return -1;
            }
            throw e;
        }
    }

    @Override // p000.InterfaceC0875
    /* renamed from: ˉי */
    public final Map mo3674() {
        return Collections.emptyMap();
    }

    @Override // p000.InterfaceC0875
    /* renamed from: ˏᴵ */
    public final long mo3680(C0882 c0882) throws IOException {
        this.f8774.mo3680(c0882);
        return -1L;
    }

    @Override // p000.InterfaceC0875
    /* renamed from: ˑי */
    public final Uri mo3681() {
        return this.f8774.f3927;
    }

    @Override // p141.InterfaceC2215
    /* renamed from: ٴˎ */
    public final int mo6176() {
        DatagramSocket datagramSocket = this.f8774.f3929;
        int localPort = datagramSocket == null ? -1 : datagramSocket.getLocalPort();
        if (localPort == -1) {
            return -1;
        }
        return localPort;
    }

    @Override // p141.InterfaceC2215
    /* renamed from: ᴵʿ */
    public final boolean mo6177() {
        return true;
    }

    @Override // p141.InterfaceC2215
    /* renamed from: ﹳˑ */
    public final C2212 mo6178() {
        return null;
    }

    @Override // p000.InterfaceC0875
    /* renamed from: ﹶˆ */
    public final void mo3678(InterfaceC0880 interfaceC0880) {
        this.f8774.mo3678(interfaceC0880);
    }
}
