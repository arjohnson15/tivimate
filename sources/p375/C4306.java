package p375;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;
import p115.InterfaceC1824;
import p331.C3761;

/* renamed from: ᵢˏ.ˏᵢ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4306 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static final C4306 f16751 = new C4306();

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final AtomicReference f16752 = new AtomicReference(new C4312(new C3761(16)));

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final synchronized void m9798(C4301 c4301) {
        C3761 c3761 = new C3761((C4312) this.f16752.get());
        c3761.m8767(c4301);
        this.f16752.set(new C4312(c3761));
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final synchronized void m9799(InterfaceC1824 interfaceC1824) {
        C3761 c3761 = new C3761((C4312) this.f16752.get());
        c3761.m8772(interfaceC1824);
        this.f16752.set(new C4312(c3761));
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final Class m9800(Class cls) {
        HashMap map = ((C4312) this.f16752.get()).f16760;
        if (map.containsKey(cls)) {
            return ((InterfaceC1824) map.get(cls)).mo4101();
        }
        throw new GeneralSecurityException("No input primitive class for " + cls + " available");
    }
}
