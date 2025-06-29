package p379;

import java.io.IOException;
import p158.AbstractC2339;
import p288.C3397;
import p338.InterfaceC3865;

/* renamed from: ᵢᐧ.ˉי, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4399 implements InterfaceC3865 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final /* synthetic */ C4413 f16939;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final C4403 f16940;

    public C4399(C4413 c4413, C4403 c4403) {
        this.f16939 = c4413;
        this.f16940 = c4403;
    }

    @Override // p338.InterfaceC3865
    /* renamed from: ـﹶ */
    public final Object mo1053() {
        C4413 c4413 = this.f16939;
        C4403 c4403 = this.f16940;
        try {
        } catch (IOException e) {
            c4413.m10022(2, 2, e);
        } catch (Throwable th) {
            c4413.m10022(3, 3, null);
            AbstractC2339.m6438(c4403);
            throw th;
        }
        if (!c4403.m10008(true, this)) {
            throw new IOException("Required SETTINGS preface not received");
        }
        while (c4403.m10008(false, this)) {
        }
        c4413.m10022(1, 9, null);
        AbstractC2339.m6438(c4403);
        return C3397.f13249;
    }
}
