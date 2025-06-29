package p276;

import p036.C1262;
import p366.C4143;
import p366.C4144;
import p366.C4148;
import p366.C4151;
import p366.InterfaceC4168;

/* renamed from: ـⁱ.ʽᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3355 implements InterfaceC4168 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public boolean f13144;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final /* synthetic */ C1262 f13145;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final C4148 f13146;

    public C3355(C1262 c1262) {
        this.f13145 = c1262;
        this.f13146 = new C4148(((C4144) c1262.f5176).f16045.mo4565());
    }

    @Override // p366.InterfaceC4168, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.f13144) {
            return;
        }
        this.f13144 = true;
        ((C4144) this.f13145.f5176).mo9525("0\r\n\r\n");
        C1262 c1262 = this.f13145;
        C4148 c4148 = this.f13146;
        c1262.getClass();
        C4151 c4151 = c4148.f16048;
        c4148.f16048 = C4151.f16057;
        c4151.mo9546();
        c4151.mo9543();
        this.f13145.f5178 = 3;
    }

    @Override // p366.InterfaceC4168, java.io.Flushable
    public final synchronized void flush() {
        if (this.f13144) {
            return;
        }
        ((C4144) this.f13145.f5176).flush();
    }

    @Override // p366.InterfaceC4168
    /* renamed from: ˉי */
    public final C4151 mo4565() {
        return this.f13146;
    }

    @Override // p366.InterfaceC4168
    /* renamed from: ˋˉ */
    public final void mo4566(C4143 c4143, long j) {
        if (this.f13144) {
            throw new IllegalStateException("closed");
        }
        if (j == 0) {
            return;
        }
        C1262 c1262 = this.f13145;
        C4144 c4144 = (C4144) c1262.f5176;
        if (c4144.f16044) {
            throw new IllegalStateException("closed");
        }
        c4144.f16043.m9535(j);
        c4144.m9537();
        C4144 c41442 = (C4144) c1262.f5176;
        c41442.mo9525("\r\n");
        c41442.mo4566(c4143, j);
        c41442.mo9525("\r\n");
    }
}
