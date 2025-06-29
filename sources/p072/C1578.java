package p072;

import java.util.concurrent.CancellationException;
import p330.AbstractC3752;
import p338.InterfaceC3856;
import ʽᵔ.ᴵʿ;

/* renamed from: ʿʽ.ʻﹳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1578 extends AbstractC3752 implements InterfaceC1643 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public static final C1578 f6332 = new C1578(C1584.f6341);

    @Override // p072.InterfaceC1643
    public final boolean isCancelled() {
        return false;
    }

    @Override // p072.InterfaceC1643
    public final boolean start() {
        return false;
    }

    public final String toString() {
        return "NonCancellable";
    }

    @Override // p072.InterfaceC1643
    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final boolean mo5168() {
        return true;
    }

    @Override // p072.InterfaceC1643
    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final CancellationException mo5169() {
        throw new IllegalStateException("This job is always active");
    }

    @Override // p072.InterfaceC1643
    /* renamed from: ˏʾ, reason: contains not printable characters */
    public final InterfaceC1639 mo5170(InterfaceC3856 interfaceC3856) {
        return C1588.f6346;
    }

    @Override // p072.InterfaceC1643
    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final InterfaceC1639 mo5171(boolean z, boolean z2, ᴵʿ r3) {
        return C1588.f6346;
    }

    @Override // p072.InterfaceC1643
    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void mo5172(CancellationException cancellationException) {
    }

    @Override // p072.InterfaceC1643
    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public final InterfaceC1623 mo5173(C1634 c1634) {
        return C1588.f6346;
    }
}
