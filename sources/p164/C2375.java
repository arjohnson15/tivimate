package p164;

import java.util.concurrent.CancellationException;
import p070.AbstractC1547;
import p072.C1626;
import p288.C3397;
import p338.InterfaceC3864;

/* renamed from: ˊᵔ.ˑי, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2375 extends AbstractC1547 implements InterfaceC3864 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public static final C2375 f9394 = new C2375(2);

    @Override // p338.InterfaceC3864
    /* renamed from: ʿʼ */
    public final Object mo1054(Object obj, Object obj2) {
        AbstractC2382 abstractC2382 = (AbstractC2382) obj;
        Throwable cancellationException = (Throwable) obj2;
        if (abstractC2382 instanceof C2368) {
            C2368 c2368 = (C2368) abstractC2382;
            if (cancellationException == null) {
                cancellationException = new CancellationException("DataStore scope was cancelled before updateData could complete");
            }
            c2368.f9376.m5264(new C1626(cancellationException, false));
        }
        return C3397.f13249;
    }
}
