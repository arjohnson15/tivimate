package androidx.media3.exoplayer.smoothstreaming;

import java.util.List;
import p000.InterfaceC0864;
import p096.C1763;
import p166.C2402;
import p166.C2443;
import p193.C2705;
import p248.C3122;
import p266.C3264;
import p293.C3474;
import p331.C3767;
import p362.C4125;
import p374.InterfaceC4270;
import p374.InterfaceC4277;
import p383.AbstractC4464;
import p385.InterfaceC4483;
import p385.InterfaceC4494;
import ʻˋ.ˋˊ;
import ʾי.ˑʽ;

/* loaded from: classes.dex */
public final class SsMediaSource$Factory implements InterfaceC4270 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final InterfaceC0864 f1441;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public C2705 f1442;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final C3264 f1443;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final ˋˊ f1444;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final long f1445;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public InterfaceC4494 f1446;

    public SsMediaSource$Factory(InterfaceC0864 interfaceC0864) {
        ˋˊ r0 = new ˋˊ(interfaceC0864);
        this.f1444 = r0;
        this.f1441 = interfaceC0864;
        this.f1446 = new C1763(1);
        this.f1442 = new C2705();
        this.f1445 = 30000L;
        this.f1443 = new C3264(6);
        r0.ˆʿ = true;
    }

    @Override // p374.InterfaceC4270
    /* renamed from: ʽᐧ */
    public final InterfaceC4270 mo1142(C3474 c3474) {
        this.f1444.ᐧˋ = c3474;
        return this;
    }

    @Override // p374.InterfaceC4270
    /* renamed from: ʿʼ */
    public final InterfaceC4277 mo1143(C2402 c2402) {
        C2443 c2443 = c2402.f9492;
        c2443.getClass();
        C3767 c3767 = new ˑʽ(25);
        List list = c2443.f9733;
        C3767 c37672 = !list.isEmpty() ? new C3767(c3767, 3, list) : c3767;
        InterfaceC4483 interfaceC4483Mo5480 = this.f1446.mo5480(c2402);
        C2705 c2705 = this.f1442;
        return new C3122(c2402, this.f1441, c37672, this.f1444, this.f1443, interfaceC4483Mo5480, c2705, this.f1445);
    }

    @Override // p374.InterfaceC4270
    /* renamed from: ˑʽ */
    public final InterfaceC4270 mo1144(C2705 c2705) {
        AbstractC4464.m10135(c2705, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
        this.f1442 = c2705;
        return this;
    }

    @Override // p374.InterfaceC4270
    /* renamed from: ـﹶ */
    public final InterfaceC4270 mo1145(boolean z) {
        this.f1444.ˆʿ = z;
        return this;
    }

    @Override // p374.InterfaceC4270
    /* renamed from: ﹳﹳ */
    public final InterfaceC4270 mo1146(C4125 c4125) {
        AbstractC4464.m10135(c4125, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
        this.f1446 = c4125;
        return this;
    }
}
