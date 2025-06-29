package androidx.media3.exoplayer.rtsp;

import javax.net.SocketFactory;
import p141.C2188;
import p166.C2402;
import p193.C2705;
import p293.C3474;
import p362.C4125;
import p374.InterfaceC4270;
import p374.InterfaceC4277;
import ᵔʼ.ˑʽ;

/* loaded from: classes.dex */
public final class RtspMediaSource$Factory implements InterfaceC4270 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final SocketFactory f1440 = SocketFactory.getDefault();

    @Override // p374.InterfaceC4270
    /* renamed from: ʽᐧ */
    public final InterfaceC4270 mo1142(C3474 c3474) {
        return this;
    }

    @Override // p374.InterfaceC4270
    /* renamed from: ʿʼ */
    public final InterfaceC4277 mo1143(C2402 c2402) {
        c2402.f9492.getClass();
        return new C2188(c2402, new ˑʽ(), this.f1440);
    }

    @Override // p374.InterfaceC4270
    /* renamed from: ˑʽ */
    public final InterfaceC4270 mo1144(C2705 c2705) {
        return this;
    }

    @Override // p374.InterfaceC4270
    /* renamed from: ـﹶ */
    public final InterfaceC4270 mo1145(boolean z) {
        return this;
    }

    @Override // p374.InterfaceC4270
    /* renamed from: ﹳﹳ */
    public final InterfaceC4270 mo1146(C4125 c4125) {
        return this;
    }
}
