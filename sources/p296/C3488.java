package p296;

import com.hierynomus.protocol.transport.TransportException;
import p018.C1108;
import p078.C1696;
import p078.EnumC1683;
import p078.EnumC1689;
import p200.C2753;
import p283.InterfaceC3379;
import ʿﾞ.ﹳﹳ;

/* renamed from: ٴﹳ.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3488 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final long f13480;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final /* synthetic */ C3486 f13481;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C3487 f13482;

    public C3488(C3486 c3486, C3487 c3487, long j) {
        this.f13481 = c3486;
        this.f13482 = c3487;
        this.f13480 = j;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void m8378() {
        C3486 c3486 = this.f13481;
        EnumC1689 enumC1689 = (EnumC1689) ((C2753) c3486.f13462.f11939).f10767;
        C3487 c3487 = this.f13482;
        long j = c3487.f13478;
        C1108 c1108 = new C1108(4, enumC1689, EnumC1683.f6539);
        C1696 c1696 = (C1696) ((InterfaceC3379) ((ﹳﹳ) c1108).ᐧⁱ);
        c1696.f6605 = c3487.f13476;
        if (j != 0) {
            c1696.f6601 |= 2;
            c1696.f6606 = j;
        }
        try {
            c3486.f13465.m8813(Long.valueOf(this.f13480)).m6209(c1108);
        } catch (TransportException unused) {
            C3486.f13460.mo5518(c1108, "Failed to send {}");
        }
    }
}
