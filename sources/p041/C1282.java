package p041;

import java.io.IOException;
import okhttp3.internal.connection.RouteException;
import p070.AbstractC1549;
import p126.C2021;
import p430.C4994;
import p430.C4999;
import p430.InterfaceC5016;

/* renamed from: ʽˉ.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1282 implements InterfaceC5016 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final C1282 f5271 = new C1282();

    @Override // p430.InterfaceC5016
    /* renamed from: ـﹶ */
    public final C4994 mo3528(C2021 c2021) throws IOException {
        C1274 c1274 = c2021.f7670;
        synchronized (c1274) {
            try {
                if (!c1274.f5227) {
                    throw new IllegalStateException("released");
                }
                if (c1274.f5220) {
                    throw new IllegalStateException("Check failed.");
                }
                if (c1274.f5235) {
                    throw new IllegalStateException("Check failed.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        C1283 c1283 = c1274.f5234;
        C4999 c4999 = c1274.f5230;
        c1283.getClass();
        try {
            C1273 c1273 = new C1273(c1274, c1283, c1283.m4573(c2021.f7671, c2021.f7672, c2021.f7668, c4999.f18937, !AbstractC1549.m5138(c2021.f7667.f19049, "GET")).m4553(c4999, c2021));
            c1274.f5231 = c1273;
            c1274.f5233 = c1273;
            synchronized (c1274) {
                c1274.f5235 = true;
                c1274.f5220 = true;
            }
            if (c1274.f5226) {
                throw new IOException("Canceled");
            }
            return C2021.m5664(c2021, 0, c1273, null, 61).m5665(c2021.f7667);
        } catch (IOException e) {
            c1283.m4575(e);
            throw new RouteException(e);
        } catch (RouteException e2) {
            c1283.m4575(e2.f3909);
            throw e2;
        }
    }
}
