package p276;

import java.io.IOException;
import p036.C1262;
import p041.C1276;
import p366.C4143;
import p366.C4148;
import p366.C4149;
import p366.C4151;
import p366.InterfaceC4163;

/* renamed from: ـⁱ.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC3358 implements InterfaceC4163 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public boolean f13154;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final /* synthetic */ C1262 f13155;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final C4148 f13156;

    public AbstractC3358(C1262 c1262) {
        this.f13155 = c1262;
        this.f13156 = new C4148(((C4149) c1262.f5180).f16051.mo8177());
    }

    @Override // p366.InterfaceC4163
    /* renamed from: ʿˊ */
    public long mo4577(C4143 c4143, long j) throws IOException {
        C1262 c1262 = this.f13155;
        try {
            return ((C4149) c1262.f5180).mo4577(c4143, j);
        } catch (IOException e) {
            ((C1276) c1262.f5177).m4551();
            m8178();
            throw e;
        }
    }

    @Override // p366.InterfaceC4163
    /* renamed from: ˉי, reason: contains not printable characters */
    public final C4151 mo8177() {
        return this.f13156;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void m8178() {
        C1262 c1262 = this.f13155;
        int i = c1262.f5178;
        if (i == 6) {
            return;
        }
        if (i != 5) {
            throw new IllegalStateException("state: " + c1262.f5178);
        }
        C4148 c4148 = this.f13156;
        C4151 c4151 = c4148.f16048;
        c4148.f16048 = C4151.f16057;
        c4151.mo9546();
        c4151.mo9543();
        c1262.f5178 = 6;
    }
}
