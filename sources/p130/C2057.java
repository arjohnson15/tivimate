package p130;

import p061.C1403;
import p254.AbstractC3154;
import p254.C3174;
import p254.C3180;
import p254.InterfaceC3157;

/* renamed from: ˉ.ˑʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2057 extends AbstractC3154 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC3157 f7785;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final /* synthetic */ C1403 f7786;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2057(C1403 c1403, InterfaceC3157 interfaceC3157, InterfaceC3157 interfaceC31572) {
        super(interfaceC3157);
        this.f7786 = c1403;
        this.f7785 = interfaceC31572;
    }

    @Override // p254.AbstractC3154, p254.InterfaceC3157
    /* renamed from: ˏʾ */
    public final C3180 mo5503(long j) {
        C3180 c3180Mo5503 = this.f7785.mo5503(j);
        C3174 c3174 = c3180Mo5503.f12289;
        long j2 = c3174.f12270;
        long j3 = this.f7786.f5732;
        C3174 c31742 = new C3174(j2, c3174.f12269 + j3);
        C3174 c31743 = c3180Mo5503.f12288;
        return new C3180(c31742, new C3174(c31743.f12270, c31743.f12269 + j3));
    }
}
