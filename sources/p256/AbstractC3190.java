package p256;

import java.util.NoSuchElementException;

/* renamed from: יᴵ.ʽᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC3190 implements InterfaceC3194 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final long f12387;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public long f12388;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final long f12389;

    public AbstractC3190(long j, long j2) {
        this.f12389 = j;
        this.f12387 = j2;
        this.f12388 = j - 1;
    }

    @Override // p256.InterfaceC3194
    public final boolean next() {
        long j = this.f12388 + 1;
        this.f12388 = j;
        return !(j > this.f12387);
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final void m7890() {
        long j = this.f12388;
        if (j < this.f12389 || j > this.f12387) {
            throw new NoSuchElementException();
        }
    }
}
