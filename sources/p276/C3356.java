package p276;

import p036.C1262;
import p158.AbstractC2339;
import p366.C4143;
import p366.C4144;
import p366.C4148;
import p366.C4151;
import p366.InterfaceC4168;

/* renamed from: ـⁱ.ʿʼ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3356 implements InterfaceC4168 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public boolean f13147;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final /* synthetic */ C1262 f13148;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final C4148 f13149;

    public C3356(C1262 c1262) {
        this.f13148 = c1262;
        this.f13149 = new C4148(((C4144) c1262.f5176).f16045.mo4565());
    }

    @Override // p366.InterfaceC4168, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f13147) {
            return;
        }
        this.f13147 = true;
        C1262 c1262 = this.f13148;
        c1262.getClass();
        C4148 c4148 = this.f13149;
        C4151 c4151 = c4148.f16048;
        c4148.f16048 = C4151.f16057;
        c4151.mo9546();
        c4151.mo9543();
        c1262.f5178 = 3;
    }

    @Override // p366.InterfaceC4168, java.io.Flushable
    public final void flush() {
        if (this.f13147) {
            return;
        }
        ((C4144) this.f13148.f5176).flush();
    }

    @Override // p366.InterfaceC4168
    /* renamed from: ˉי */
    public final C4151 mo4565() {
        return this.f13149;
    }

    @Override // p366.InterfaceC4168
    /* renamed from: ˋˉ */
    public final void mo4566(C4143 c4143, long j) {
        if (this.f13147) {
            throw new IllegalStateException("closed");
        }
        long j2 = c4143.f16041;
        byte[] bArr = AbstractC2339.f9301;
        if (j < 0 || 0 > j2 || j2 < j) {
            throw new ArrayIndexOutOfBoundsException();
        }
        ((C4144) this.f13148.f5176).mo4566(c4143, j);
    }
}
