package p325;

import p072.InterfaceC1594;
import p185.AbstractC2567;
import p288.C3397;
import p330.InterfaceC3746;
import p338.InterfaceC3864;

/* renamed from: ᴵˎ.ﹶʾ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3719 extends AbstractC2567 implements InterfaceC3864 {

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final /* synthetic */ long f14428;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final /* synthetic */ long f14429;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3719(long j, long j2, InterfaceC3746 interfaceC3746) {
        super(2, interfaceC3746);
        this.f14428 = j;
        this.f14429 = j2;
    }

    @Override // p338.InterfaceC3864
    /* renamed from: ʿʼ */
    public final Object mo1054(Object obj, Object obj2) {
        C3719 c3719 = (C3719) mo1056((InterfaceC1594) obj, (InterfaceC3746) obj2);
        C3397 c3397 = C3397.f13249;
        c3719.mo1055(c3397);
        return c3397;
    }

    /* JADX WARN: Removed duplicated region for block: B:145:0x025a  */
    @Override // p185.AbstractC2563
    /* renamed from: ˑי */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object mo1055(java.lang.Object r19) {
        /*
            Method dump skipped, instructions count: 1012
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p325.C3719.mo1055(java.lang.Object):java.lang.Object");
    }

    @Override // p185.AbstractC2563
    /* renamed from: ᴵʿ */
    public final InterfaceC3746 mo1056(Object obj, InterfaceC3746 interfaceC3746) {
        return new C3719(this.f14428, this.f14429, interfaceC3746);
    }
}
