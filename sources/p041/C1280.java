package p041;

import java.io.IOException;
import java.net.ProtocolException;
import p366.C4143;
import p366.C4151;
import p366.InterfaceC4168;
import ᵎﹳ.ᐧʻ;

/* renamed from: ʽˉ.ˑʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1280 implements InterfaceC4168 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final long f5263;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public boolean f5264;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public boolean f5265;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public long f5266;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final InterfaceC4168 f5267;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final /* synthetic */ C1273 f5268;

    public C1280(C1273 c1273, InterfaceC4168 interfaceC4168, long j) {
        this.f5268 = c1273;
        this.f5267 = interfaceC4168;
        this.f5263 = j;
    }

    @Override // p366.InterfaceC4168, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f5264) {
            return;
        }
        this.f5264 = true;
        long j = this.f5263;
        if (j != -1 && this.f5266 != j) {
            throw new ProtocolException("unexpected end of stream");
        }
        try {
            m4568();
            m4564(null);
        } catch (IOException e) {
            throw m4564(e);
        }
    }

    @Override // p366.InterfaceC4168, java.io.Flushable
    public final void flush() throws IOException {
        try {
            m4567();
        } catch (IOException e) {
            throw m4564(e);
        }
    }

    public final String toString() {
        return C1280.class.getSimpleName() + '(' + this.f5267 + ')';
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final IOException m4564(IOException iOException) {
        if (this.f5265) {
            return iOException;
        }
        this.f5265 = true;
        return this.f5268.m4534(false, true, iOException);
    }

    @Override // p366.InterfaceC4168
    /* renamed from: ˉי, reason: contains not printable characters */
    public final C4151 mo4565() {
        return this.f5267.mo4565();
    }

    @Override // p366.InterfaceC4168
    /* renamed from: ˋˉ, reason: contains not printable characters */
    public final void mo4566(C4143 c4143, long j) throws IOException {
        if (this.f5264) {
            throw new IllegalStateException("closed");
        }
        long j2 = this.f5263;
        if (j2 != -1 && this.f5266 + j > j2) {
            StringBuilder sb = ᐧʻ.ˑי(j2, "expected ", " bytes but received ");
            sb.append(this.f5266 + j);
            throw new ProtocolException(sb.toString());
        }
        try {
            this.f5267.mo4566(c4143, j);
            this.f5266 += j;
        } catch (IOException e) {
            throw m4564(e);
        }
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final void m4567() {
        this.f5267.flush();
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void m4568() {
        this.f5267.close();
    }
}
