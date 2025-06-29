package androidx.media3.exoplayer.hls;

import java.util.List;
import p000.InterfaceC0864;
import p096.C1763;
import p166.C2402;
import p166.C2443;
import p193.C2705;
import p266.C3264;
import p293.C3474;
import p310.C3581;
import p324.C3709;
import p324.InterfaceC3707;
import p362.C4125;
import p372.C4221;
import p372.C4227;
import p372.InterfaceC4237;
import p374.InterfaceC4270;
import p374.InterfaceC4277;
import p383.AbstractC4464;
import p385.InterfaceC4483;
import p385.InterfaceC4494;
import p456.C5349;
import ˏᵢ.ᵢٴ;

/* loaded from: classes.dex */
public final class HlsMediaSource$Factory implements InterfaceC4270 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public InterfaceC4237 f1424;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final C3264 f1425;

    /* renamed from: ˉי, reason: contains not printable characters */
    public final long f1426;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public boolean f1427;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final ᵢٴ f1429;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public C2705 f1431;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final int f1433;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public InterfaceC4494 f1430 = new C1763(1);

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final C3264 f1428 = new C3264(2);

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final C3581 f1432 = C3709.f14313;

    public HlsMediaSource$Factory(InterfaceC0864 interfaceC0864) {
        this.f1429 = new ᵢٴ(20, interfaceC0864);
        C4227 c4227 = InterfaceC4237.f16445;
        this.f1424 = c4227;
        this.f1431 = new C2705();
        this.f1425 = new C3264(6);
        this.f1433 = 1;
        this.f1426 = -9223372036854775807L;
        this.f1427 = true;
        c4227.f16369 = true;
    }

    @Override // p374.InterfaceC4270
    /* renamed from: ʽᐧ */
    public final InterfaceC4270 mo1142(C3474 c3474) {
        ((C4227) this.f1424).f16368 = c3474;
        return this;
    }

    @Override // p374.InterfaceC4270
    /* renamed from: ʿʼ */
    public final InterfaceC4277 mo1143(C2402 c2402) {
        C2443 c2443 = c2402.f9492;
        c2443.getClass();
        InterfaceC3707 c5349 = this.f1428;
        List list = c2443.f9733;
        if (!list.isEmpty()) {
            c5349 = new C5349(13, c5349, list, false);
        }
        InterfaceC4237 interfaceC4237 = this.f1424;
        InterfaceC4483 interfaceC4483Mo5480 = this.f1430.mo5480(c2402);
        C2705 c2705 = this.f1431;
        this.f1432.getClass();
        ᵢٴ r4 = this.f1429;
        return new C4221(c2402, r4, interfaceC4237, this.f1425, interfaceC4483Mo5480, c2705, new C3709(r4, c2705, c5349), this.f1426, this.f1427, this.f1433);
    }

    @Override // p374.InterfaceC4270
    /* renamed from: ˑʽ */
    public final InterfaceC4270 mo1144(C2705 c2705) {
        AbstractC4464.m10135(c2705, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
        this.f1431 = c2705;
        return this;
    }

    @Override // p374.InterfaceC4270
    /* renamed from: ـﹶ */
    public final InterfaceC4270 mo1145(boolean z) {
        ((C4227) this.f1424).f16369 = z;
        return this;
    }

    @Override // p374.InterfaceC4270
    /* renamed from: ﹳﹳ */
    public final InterfaceC4270 mo1146(C4125 c4125) {
        AbstractC4464.m10135(c4125, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
        this.f1430 = c4125;
        return this;
    }
}
