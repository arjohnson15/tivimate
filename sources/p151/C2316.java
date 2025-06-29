package p151;

import android.net.Uri;
import io.antmedia.rtmp_client.RtmpClient;
import p000.AbstractC0863;
import p000.C0882;
import p166.AbstractC2426;
import p383.AbstractC4470;

/* renamed from: ˊˆ.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2316 extends AbstractC0863 {

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public static final /* synthetic */ int f9137 = 0;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public RtmpClient f9138;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public Uri f9139;

    static {
        AbstractC2426.m6526("media3.datasource.rtmp");
    }

    public C2316() {
        super(true);
    }

    @Override // p000.InterfaceC0875
    public final void close() {
        if (this.f9139 != null) {
            this.f9139 = null;
            m3675();
        }
        RtmpClient rtmpClient = this.f9138;
        if (rtmpClient != null) {
            rtmpClient.m3533();
            this.f9138 = null;
        }
    }

    @Override // p166.InterfaceC2442
    /* renamed from: ˆʿ */
    public final int mo3679(byte[] bArr, int i, int i2) throws RtmpClient.RtmpIOException {
        RtmpClient rtmpClient = this.f9138;
        int i3 = AbstractC4470.f17202;
        int iM3532 = rtmpClient.m3532(bArr, i, i2);
        if (iM3532 == -1) {
            return -1;
        }
        m3676(iM3532);
        return iM3532;
    }

    @Override // p000.InterfaceC0875
    /* renamed from: ˏᴵ */
    public final long mo3680(C0882 c0882) throws RtmpClient.RtmpIOException {
        m3673();
        RtmpClient rtmpClient = new RtmpClient();
        rtmpClient.f3888 = 0L;
        this.f9138 = rtmpClient;
        rtmpClient.m3531(c0882.f4004.toString());
        this.f9139 = c0882.f4004;
        m3677(c0882);
        return -1L;
    }

    @Override // p000.InterfaceC0875
    /* renamed from: ˑי */
    public final Uri mo3681() {
        return this.f9139;
    }
}
