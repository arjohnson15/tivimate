package p210;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import p119.C1860;
import p293.InterfaceC3472;

/* renamed from: ˏʼ.ﹳﹳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2806 implements InterfaceC3472 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final AtomicReference f10946 = new AtomicReference();

    @Override // p293.InterfaceC3472
    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void mo7087(boolean z) {
        synchronized (C2804.f10930) {
            try {
                Iterator it = new ArrayList(C2804.f10929.values()).iterator();
                while (it.hasNext()) {
                    C2804 c2804 = (C2804) it.next();
                    if (c2804.f10932.get()) {
                        Iterator it2 = c2804.f10940.iterator();
                        while (it2.hasNext()) {
                            C2804 c28042 = ((C2802) it2.next()).f10925;
                            if (z) {
                                c28042.getClass();
                            } else {
                                ((C1860) c28042.f10934.get()).m5617();
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
