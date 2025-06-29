package p041;

import java.io.IOException;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.http2.StreamResetException;
import p126.InterfaceC2023;
import p166.C2441;
import p383.C4460;
import p430.C5013;
import p438.C5076;
import p438.C5105;
import p438.InterfaceC5111;

/* renamed from: ʽˉ.ʿʼ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1273 implements InterfaceC5111 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public boolean f5214;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public Object f5215;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final Object f5216;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final Object f5217;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public boolean f5218;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public Object f5219;

    public C1273(C1274 c1274, C1283 c1283, InterfaceC2023 interfaceC2023) {
        this.f5216 = c1274;
        this.f5217 = c1283;
        this.f5215 = interfaceC2023;
        this.f5219 = interfaceC2023.mo4503();
    }

    public C1273(C5076 c5076, C4460 c4460) {
        this.f5217 = c5076;
        this.f5216 = new C5105(c4460);
        this.f5218 = true;
    }

    @Override // p438.InterfaceC5111
    /* renamed from: ʽᐧ */
    public void mo1113(C2441 c2441) {
        InterfaceC5111 interfaceC5111 = (InterfaceC5111) this.f5219;
        if (interfaceC5111 != null) {
            interfaceC5111.mo1113(c2441);
            c2441 = ((InterfaceC5111) this.f5219).mo1114();
        }
        ((C5105) this.f5216).mo1113(c2441);
    }

    @Override // p438.InterfaceC5111
    /* renamed from: ʿʼ */
    public C2441 mo1114() {
        InterfaceC5111 interfaceC5111 = (InterfaceC5111) this.f5219;
        return interfaceC5111 != null ? interfaceC5111.mo1114() : (C2441) ((C5105) this.f5216).f19432;
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public IOException m4534(boolean z, boolean z2, IOException iOException) {
        if (iOException != null) {
            m4536(iOException);
        }
        return ((C1274) this.f5216).m4540(this, z2, z, iOException);
    }

    @Override // p438.InterfaceC5111
    /* renamed from: ـﹶ */
    public boolean mo1128() {
        if (this.f5218) {
            ((C5105) this.f5216).getClass();
            return false;
        }
        InterfaceC5111 interfaceC5111 = (InterfaceC5111) this.f5219;
        interfaceC5111.getClass();
        return interfaceC5111.mo1128();
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public C5013 m4535(boolean z) throws IOException {
        try {
            C5013 c5013Mo4508 = ((InterfaceC2023) this.f5215).mo4508(z);
            if (c5013Mo4508 != null) {
                c5013Mo4508.f19021 = this;
            }
            return c5013Mo4508;
        } catch (IOException e) {
            m4536(e);
            throw e;
        }
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public void m4536(IOException iOException) {
        this.f5214 = true;
        ((C1283) this.f5217).m4575(iOException);
        C1276 c1276Mo4503 = ((InterfaceC2023) this.f5215).mo4503();
        C1274 c1274 = (C1274) this.f5216;
        synchronized (c1276Mo4503) {
            try {
                if (!(iOException instanceof StreamResetException)) {
                    if (!(c1276Mo4503.f5251 != null) || (iOException instanceof ConnectionShutdownException)) {
                        c1276Mo4503.f5242 = true;
                        if (c1276Mo4503.f5244 == 0) {
                            C1276.m4547(c1274.f5230, c1276Mo4503.f5240, iOException);
                            c1276Mo4503.f5243++;
                        }
                    }
                } else if (((StreamResetException) iOException).f3911 == 8) {
                    int i = c1276Mo4503.f5252 + 1;
                    c1276Mo4503.f5252 = i;
                    if (i > 1) {
                        c1276Mo4503.f5242 = true;
                        c1276Mo4503.f5243++;
                    }
                } else if (((StreamResetException) iOException).f3911 != 9 || !c1274.f5226) {
                    c1276Mo4503.f5242 = true;
                    c1276Mo4503.f5243++;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p438.InterfaceC5111
    /* renamed from: ﹳﹳ */
    public long mo1135() {
        if (this.f5218) {
            return ((C5105) this.f5216).mo1135();
        }
        InterfaceC5111 interfaceC5111 = (InterfaceC5111) this.f5219;
        interfaceC5111.getClass();
        return interfaceC5111.mo1135();
    }
}
