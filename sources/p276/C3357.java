package p276;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import p036.C1262;
import p041.C1276;
import p061.C1403;
import p126.AbstractC2018;
import p158.AbstractC2339;
import p317.AbstractC3616;
import p317.AbstractC3629;
import p366.C4143;
import p366.C4149;
import p430.C4999;
import p430.C5004;
import ﹶⁱ.ـﹶ;

/* renamed from: ـⁱ.ˑʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3357 extends AbstractC3358 {

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public long f13150;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final C5004 f13151;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public boolean f13152;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public final /* synthetic */ C1262 f13153;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3357(C1262 c1262, C5004 c5004) {
        super(c1262);
        this.f13153 = c1262;
        this.f13151 = c5004;
        this.f13150 = -1L;
        this.f13152 = true;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean zM6444;
        if (this.f13154) {
            return;
        }
        if (this.f13152) {
            try {
                zM6444 = AbstractC2339.m6444(this, 100, TimeUnit.MILLISECONDS);
            } catch (IOException unused) {
                zM6444 = false;
            }
            if (!zM6444) {
                ((C1276) this.f13153.f5177).m4551();
                m8178();
            }
        }
        this.f13154 = true;
    }

    @Override // p276.AbstractC3358, p366.InterfaceC4163
    /* renamed from: ʿˊ */
    public final long mo4577(C4143 c4143, long j) throws IOException {
        C4143 c41432;
        byte bM9520;
        if (this.f13154) {
            throw new IllegalStateException("closed");
        }
        if (!this.f13152) {
            return -1L;
        }
        long j2 = this.f13150;
        C1262 c1262 = this.f13153;
        if (j2 == 0 || j2 == -1) {
            if (j2 != -1) {
                ((C4149) c1262.f5180).m9549(Long.MAX_VALUE);
            }
            try {
                C4149 c4149 = (C4149) c1262.f5180;
                c4149.mo9526(1L);
                int i = 0;
                while (true) {
                    int i2 = i + 1;
                    boolean zMo9511 = c4149.mo9511(i2);
                    c41432 = c4149.f16049;
                    if (!zMo9511) {
                        break;
                    }
                    bM9520 = c41432.m9520(i);
                    if ((bM9520 < 48 || bM9520 > 57) && ((bM9520 < 97 || bM9520 > 102) && (bM9520 < 65 || bM9520 > 70))) {
                        break;
                    }
                    i = i2;
                }
                if (i == 0) {
                    ـﹶ.ˏʾ(16);
                    throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(Integer.toString(bM9520, 16)));
                }
                this.f13150 = c41432.m9493();
                String string = AbstractC3616.m8539(((C4149) c1262.f5180).m9549(Long.MAX_VALUE)).toString();
                if (this.f13150 < 0 || (string.length() > 0 && !AbstractC3629.m8560(string, ";", false))) {
                    throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.f13150 + string + '\"');
                }
                if (this.f13150 == 0) {
                    this.f13152 = false;
                    AbstractC2018.m5659(((C4999) c1262.f5175).f18932, this.f13151, ((C1403) c1262.f5179).m4871());
                    m8178();
                }
                if (!this.f13152) {
                    return -1L;
                }
            } catch (NumberFormatException e) {
                throw new ProtocolException(e.getMessage());
            }
        }
        long jMo4577 = super.mo4577(c4143, Math.min(8192L, this.f13150));
        if (jMo4577 != -1) {
            this.f13150 -= jMo4577;
            return jMo4577;
        }
        ((C1276) c1262.f5177).m4551();
        ProtocolException protocolException = new ProtocolException("unexpected end of stream");
        m8178();
        throw protocolException;
    }
}
