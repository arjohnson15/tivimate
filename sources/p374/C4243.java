package p374;

import android.net.Uri;
import com.bumptech.glide.ﹳﹳ;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.Map;
import p000.C0878;
import p000.C0882;
import p000.InterfaceC0875;
import p011.C1027;
import p076.InterfaceC1656;
import p166.C2430;
import p168.C2456;
import p193.C2705;
import p254.C3159;
import p254.InterfaceC3165;
import p254.InterfaceC3178;
import p260.C3222;
import p383.AbstractC4464;

/* renamed from: ᵢˎ.ʾʼ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4243 implements InterfaceC1656 {

    /* renamed from: ʾʼ, reason: contains not printable characters */
    public InterfaceC3178 f16470;

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final Uri f16471;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final C4287 f16472;

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public volatile boolean f16473;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final C0878 f16474;

    /* renamed from: ˑⁱ, reason: contains not printable characters */
    public final /* synthetic */ C4287 f16475;

    /* renamed from: ˑﾞ, reason: contains not printable characters */
    public boolean f16476;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final C3222 f16478;

    /* renamed from: ᴵʼ, reason: contains not printable characters */
    public long f16480;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final C2705 f16481;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public final C2430 f16482 = new C2430();

    /* renamed from: ـˆ, reason: contains not printable characters */
    public boolean f16477 = true;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final long f16479 = C4261.f16556.getAndIncrement();

    /* renamed from: ﾞᐧ, reason: contains not printable characters */
    public C0882 f16483 = m9705(0);

    public C4243(C4287 c4287, Uri uri, InterfaceC0875 interfaceC0875, C3222 c3222, C4287 c42872, C2705 c2705) {
        this.f16475 = c4287;
        this.f16471 = uri;
        this.f16474 = new C0878(interfaceC0875);
        this.f16478 = c3222;
        this.f16472 = c42872;
        this.f16481 = c2705;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C0882 m9705(long j) {
        Collections.emptyMap();
        this.f16475.getClass();
        Map map = C4287.f16644;
        Uri uri = this.f16471;
        AbstractC4464.m10136(uri, "The uri must be set.");
        return new C0882(uri, 1, null, map, j, -1L, null, 6);
    }

    @Override // p076.InterfaceC1656
    /* renamed from: ﹳˎ */
    public final void mo5325() {
        this.f16473 = true;
    }

    @Override // p076.InterfaceC1656
    /* renamed from: ﹳﹳ */
    public final void mo5326() {
        InterfaceC0875 c4282;
        InterfaceC3165 interfaceC3165;
        int i;
        int iMo4075 = 0;
        while (iMo4075 == 0 && !this.f16473) {
            try {
                long j = this.f16482.f9656;
                C0882 c0882M9705 = m9705(j);
                this.f16483 = c0882M9705;
                long jMo3680 = this.f16474.mo3680(c0882M9705);
                if (this.f16473) {
                    if (iMo4075 != 1 && this.f16478.m7937() != -1) {
                        this.f16482.f9656 = this.f16478.m7937();
                    }
                    ﹳﹳ.ﹶˆ(this.f16474);
                    return;
                }
                if (jMo3680 != -1) {
                    jMo3680 += j;
                    C4287 c4287 = this.f16475;
                    c4287.f16660.post(new RunnableC4278(c4287, 0));
                }
                long j2 = jMo3680;
                this.f16475.f16646 = C1027.m3976(this.f16474.f3993.mo3674());
                C0878 c0878 = this.f16474;
                C1027 c1027 = this.f16475.f16646;
                if (c1027 == null || (i = c1027.f4420) == -1) {
                    c4282 = c0878;
                } else {
                    c4282 = new C4282(c0878, i, this);
                    C4287 c42872 = this.f16475;
                    c42872.getClass();
                    InterfaceC3178 interfaceC3178M9749 = c42872.m9749(new C4268(0, true));
                    this.f16470 = interfaceC3178M9749;
                    interfaceC3178M9749.mo7840(C4287.f16645);
                }
                long jM7937 = j;
                this.f16478.m7945(c4282, this.f16471, this.f16474.f3993.mo3674(), j, j2, this.f16472);
                if (this.f16475.f16646 != null && (interfaceC3165 = (InterfaceC3165) this.f16478.f12539) != null) {
                    InterfaceC3165 interfaceC3165Mo4086 = interfaceC3165.mo4086();
                    if (interfaceC3165Mo4086 instanceof C2456) {
                        ((C2456) interfaceC3165Mo4086).f9769 = true;
                    }
                }
                if (this.f16477) {
                    C3222 c3222 = this.f16478;
                    long j3 = this.f16480;
                    InterfaceC3165 interfaceC31652 = (InterfaceC3165) c3222.f12539;
                    interfaceC31652.getClass();
                    interfaceC31652.mo4082(jM7937, j3);
                    this.f16477 = false;
                }
                while (true) {
                    long j4 = jM7937;
                    while (iMo4075 == 0 && !this.f16473) {
                        try {
                            C2705 c2705 = this.f16481;
                            synchronized (c2705) {
                                while (!c2705.f10605) {
                                    c2705.wait();
                                }
                            }
                            C3222 c32222 = this.f16478;
                            C2430 c2430 = this.f16482;
                            InterfaceC3165 interfaceC31653 = (InterfaceC3165) c32222.f12539;
                            interfaceC31653.getClass();
                            C3159 c3159 = (C3159) c32222.f12540;
                            c3159.getClass();
                            iMo4075 = interfaceC31653.mo4075(c3159, c2430);
                            jM7937 = this.f16478.m7937();
                            if (jM7937 > this.f16475.f16666 + j4) {
                                break;
                            }
                        } catch (InterruptedException unused) {
                            throw new InterruptedIOException();
                        }
                    }
                    this.f16481.m6870();
                    C4287 c42873 = this.f16475;
                    c42873.f16660.post(c42873.f16680);
                }
                if (iMo4075 == 1) {
                    iMo4075 = 0;
                } else if (this.f16478.m7937() != -1) {
                    this.f16482.f9656 = this.f16478.m7937();
                }
                ﹳﹳ.ﹶˆ(this.f16474);
            } catch (Throwable th) {
                if (iMo4075 != 1 && this.f16478.m7937() != -1) {
                    this.f16482.f9656 = this.f16478.m7937();
                }
                ﹳﹳ.ﹶˆ(this.f16474);
                throw th;
            }
        }
    }
}
