package androidx.media3.exoplayer.dash;

import com.google.android.gms.internal.play_billing.ᐧʻ;
import java.util.List;
import p000.InterfaceC0864;
import p096.C1763;
import p166.C2402;
import p166.C2428;
import p166.C2443;
import p193.C2705;
import p266.C3264;
import p293.C3474;
import p331.C3767;
import p356.C4031;
import p362.C4125;
import p374.InterfaceC4270;
import p374.InterfaceC4277;
import p383.AbstractC4464;
import p385.InterfaceC4494;
import p424.C4899;

/* loaded from: classes.dex */
public final class DashMediaSource$Factory implements InterfaceC4270 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final InterfaceC0864 f1416;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public C2705 f1417;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public InterfaceC4494 f1418;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final ᐧʻ f1419;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final long f1420;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final long f1421;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final C3264 f1422;

    public DashMediaSource$Factory(InterfaceC0864 interfaceC0864) {
        ᐧʻ r0 = new ᐧʻ(interfaceC0864);
        this.f1419 = r0;
        this.f1416 = interfaceC0864;
        this.f1418 = new C1763(1);
        this.f1417 = new C2705();
        this.f1420 = 30000L;
        this.f1421 = 5000000L;
        this.f1422 = new C3264(6);
        ((C2428) r0.ᐧˋ).f9650 = true;
    }

    @Override // p374.InterfaceC4270
    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final InterfaceC4270 mo1142(C3474 c3474) {
        C2428 c2428 = (C2428) this.f1419.ᐧˋ;
        c2428.getClass();
        c2428.f9649 = c3474;
        return this;
    }

    @Override // p374.InterfaceC4270
    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final InterfaceC4277 mo1143(C2402 c2402) {
        C2443 c2443 = c2402.f9492;
        c2443.getClass();
        C4031 c4031 = new C4031();
        List list = c2443.f9733;
        return new C4899(c2402, this.f1416, !list.isEmpty() ? new C3767(c4031, 3, list) : c4031, this.f1419, this.f1422, this.f1418.mo5480(c2402), this.f1417, this.f1420, this.f1421);
    }

    @Override // p374.InterfaceC4270
    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final InterfaceC4270 mo1144(C2705 c2705) {
        AbstractC4464.m10135(c2705, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
        this.f1417 = c2705;
        return this;
    }

    @Override // p374.InterfaceC4270
    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final InterfaceC4270 mo1145(boolean z) {
        ((C2428) this.f1419.ᐧˋ).f9650 = z;
        return this;
    }

    @Override // p374.InterfaceC4270
    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final InterfaceC4270 mo1146(C4125 c4125) {
        AbstractC4464.m10135(c4125, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
        this.f1418 = c4125;
        return this;
    }
}
