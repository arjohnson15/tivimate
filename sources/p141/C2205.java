package p141;

import android.os.Handler;
import com.bumptech.glide.ﹳﹳ;
import p015.C1067;
import p076.InterfaceC1656;
import p166.C2430;
import p254.C3159;
import p383.AbstractC4470;
import p456.C5349;

/* renamed from: ˉˑ.ٴˎ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2205 implements InterfaceC1656 {

    /* renamed from: ʾʼ, reason: contains not printable characters */
    public volatile long f8674;

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final C2194 f8675;

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public C2206 f8677;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final C1067 f8678;

    /* renamed from: ـˆ, reason: contains not printable characters */
    public C3159 f8679;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final C5349 f8680;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final int f8681;

    /* renamed from: ᴵʼ, reason: contains not printable characters */
    public volatile boolean f8682;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final InterfaceC2201 f8683;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public InterfaceC2215 f8684;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final Handler f8676 = AbstractC4470.m10200(null);

    /* renamed from: ﾞᐧ, reason: contains not printable characters */
    public volatile long f8685 = -9223372036854775807L;

    public C2205(int i, C2194 c2194, C1067 c1067, C5349 c5349, InterfaceC2201 interfaceC2201) {
        this.f8681 = i;
        this.f8675 = c2194;
        this.f8678 = c1067;
        this.f8680 = c5349;
        this.f8683 = interfaceC2201;
    }

    @Override // p076.InterfaceC1656
    /* renamed from: ﹳˎ */
    public final void mo5325() {
        this.f8682 = true;
    }

    @Override // p076.InterfaceC1656
    /* renamed from: ﹳﹳ */
    public final void mo5326() {
        if (this.f8682) {
            this.f8682 = false;
        }
        try {
            if (this.f8684 == null) {
                InterfaceC2215 interfaceC2215M6135 = this.f8683.m6135(this.f8681);
                this.f8684 = interfaceC2215M6135;
                this.f8676.post(new RunnableC2187(this, interfaceC2215M6135.mo6175(), this.f8684, 0));
                InterfaceC2215 interfaceC2215 = this.f8684;
                interfaceC2215.getClass();
                this.f8679 = new C3159(interfaceC2215, 0L, -1L);
                C2206 c2206 = new C2206(this.f8675.f8626, this.f8681);
                this.f8677 = c2206;
                c2206.mo4084(this.f8680);
            }
            while (!this.f8682) {
                if (this.f8685 != -9223372036854775807L) {
                    C2206 c22062 = this.f8677;
                    c22062.getClass();
                    c22062.mo4082(this.f8674, this.f8685);
                    this.f8685 = -9223372036854775807L;
                }
                C2206 c22063 = this.f8677;
                c22063.getClass();
                C3159 c3159 = this.f8679;
                c3159.getClass();
                if (c22063.mo4075(c3159, new C2430()) == -1) {
                    break;
                }
            }
            this.f8682 = false;
            InterfaceC2215 interfaceC22152 = this.f8684;
            interfaceC22152.getClass();
            if (interfaceC22152.mo6177()) {
                ﹳﹳ.ﹶˆ(this.f8684);
                this.f8684 = null;
            }
        } catch (Throwable th) {
            InterfaceC2215 interfaceC22153 = this.f8684;
            interfaceC22153.getClass();
            if (interfaceC22153.mo6177()) {
                ﹳﹳ.ﹶˆ(this.f8684);
                this.f8684 = null;
            }
            throw th;
        }
    }
}
