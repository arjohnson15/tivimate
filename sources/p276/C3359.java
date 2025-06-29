package p276;

import java.io.IOException;
import p366.C4143;

/* renamed from: ـⁱ.ٴˎ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3359 extends AbstractC3358 {

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public boolean f13157;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f13154) {
            return;
        }
        if (!this.f13157) {
            m8178();
        }
        this.f13154 = true;
    }

    @Override // p276.AbstractC3358, p366.InterfaceC4163
    /* renamed from: ʿˊ */
    public final long mo4577(C4143 c4143, long j) throws IOException {
        if (this.f13154) {
            throw new IllegalStateException("closed");
        }
        if (this.f13157) {
            return -1L;
        }
        long jMo4577 = super.mo4577(c4143, 8192L);
        if (jMo4577 != -1) {
            return jMo4577;
        }
        this.f13157 = true;
        m8178();
        return -1L;
    }
}
