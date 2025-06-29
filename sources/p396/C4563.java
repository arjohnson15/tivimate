package p396;

import p155.EnumC2332;
import p330.InterfaceC3746;
import p430.InterfaceC5019;

/* renamed from: ⁱᴵ.ˎٴ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4563 extends AbstractC4582 {

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final boolean f17476;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final InterfaceC4575 f17477;

    public C4563(C4564 c4564, InterfaceC5019 interfaceC5019, InterfaceC4560 interfaceC4560, InterfaceC4575 interfaceC4575, boolean z) {
        super(c4564, interfaceC5019, interfaceC4560);
        this.f17477 = interfaceC4575;
        this.f17476 = z;
    }

    @Override // p396.AbstractC4582
    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final Object mo10435(C4590 c4590, Object[] objArr) {
        InterfaceC4591 interfaceC4591 = (InterfaceC4591) this.f17477.mo2484(c4590);
        InterfaceC3746 interfaceC3746 = (InterfaceC3746) objArr[objArr.length - 1];
        try {
            return this.f17476 ? AbstractC4581.m10474(interfaceC4591, interfaceC3746) : AbstractC4581.m10465(interfaceC4591, interfaceC3746);
        } catch (LinkageError e) {
            throw e;
        } catch (ThreadDeath e2) {
            throw e2;
        } catch (VirtualMachineError e3) {
            throw e3;
        } catch (Throwable th) {
            AbstractC4581.m10470(th, interfaceC3746);
            return EnumC2332.f9250;
        }
    }
}
