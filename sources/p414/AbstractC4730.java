package p414;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import p072.C1602;
import p164.C2365;
import p185.AbstractC2567;
import p395.InterfaceFutureC4542;
import p410.RunnableC4687;
import p457.AbstractC5366;
import p457.C5391;
import p457.EnumC5364;
import ⁱـ.ˑי;

/* renamed from: ﹳـ.ᐧⁱ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC4730 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final String f18154 = C5391.m12164("WorkerWrapper");

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static final Object m10643(Future future) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final Object m10644(InterfaceFutureC4542 interfaceFutureC4542, AbstractC5366 abstractC5366, AbstractC2567 abstractC2567) throws Throwable {
        try {
            if (interfaceFutureC4542.isDone()) {
                return m10643(interfaceFutureC4542);
            }
            C1602 c1602 = new C1602(1, ˑי.ˏᴵ(abstractC2567));
            c1602.m5205();
            interfaceFutureC4542.mo10415(new RunnableC4687(interfaceFutureC4542, c1602, 1), EnumC5364.f20823);
            c1602.m5219(new C2365(abstractC5366, 1, interfaceFutureC4542));
            return c1602.m5203();
        } catch (ExecutionException e) {
            throw e.getCause();
        }
    }
}
