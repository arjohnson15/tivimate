package p379;

import java.net.SocketTimeoutException;
import p041.C1285;
import p366.C4169;
import ˆʽ.ᵎˏ;

/* renamed from: ᵢᐧ.ʿˏ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4398 extends C4169 {

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public final /* synthetic */ C4401 f16938;

    public C4398(C4401 c4401) {
        this.f16938 = c4401;
    }

    @Override // p366.C4169
    /* renamed from: ˉי */
    public final void mo4579() {
        this.f16938.m9992(9);
        C4413 c4413 = this.f16938.f16944;
        synchronized (c4413) {
            long j = c4413.f17011;
            long j2 = c4413.f17012;
            if (j < j2) {
                return;
            }
            c4413.f17012 = j2 + 1;
            c4413.f17022 = System.nanoTime() + 1000000000;
            c4413.f17007.m9479(new C1285(c4413, ᵎˏ.ˎٴ(new StringBuilder(), c4413.f17009, " ping"), 2), 0L);
        }
    }

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public final void m9988() throws SocketTimeoutException {
        if (m9583()) {
            throw new SocketTimeoutException("timeout");
        }
    }
}
