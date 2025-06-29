package p374;

import p000.InterfaceC0864;
import p096.C1763;
import p166.C2402;
import p193.C2705;
import p254.C3161;
import p293.C3474;
import p362.C4125;
import p383.AbstractC4464;
import p385.InterfaceC4494;

/* renamed from: ᵢˎ.ˎᵔ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4262 implements InterfaceC4270 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final C4125 f16558;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final int f16559;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public InterfaceC4494 f16560;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final InterfaceC0864 f16561;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public C2705 f16562;

    public C4262(InterfaceC0864 interfaceC0864, C3161 c3161) {
        C4125 c4125 = new C4125(3, c3161);
        C1763 c1763 = new C1763(1);
        C2705 c2705 = new C2705();
        this.f16561 = interfaceC0864;
        this.f16558 = c4125;
        this.f16560 = c1763;
        this.f16562 = c2705;
        this.f16559 = 1048576;
    }

    @Override // p374.InterfaceC4270
    /* renamed from: ʽᐧ */
    public final InterfaceC4270 mo1142(C3474 c3474) {
        return this;
    }

    @Override // p374.InterfaceC4270
    /* renamed from: ʿʼ */
    public final InterfaceC4277 mo1143(C2402 c2402) {
        c2402.f9492.getClass();
        return new C4285(c2402, this.f16561, this.f16558, this.f16560.mo5480(c2402), this.f16562, this.f16559);
    }

    @Override // p374.InterfaceC4270
    /* renamed from: ˑʽ */
    public final InterfaceC4270 mo1144(C2705 c2705) {
        AbstractC4464.m10135(c2705, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
        this.f16562 = c2705;
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
        AbstractC4464.m10135(c4125, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
        this.f16560 = c4125;
        return this;
    }
}
