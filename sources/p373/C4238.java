package p373;

import android.net.Uri;
import ar.tvplayer.core.domain2.SmbDataSource$SmbDataSourceException;
import java.io.EOFException;
import java.util.EnumSet;
import p000.AbstractC0863;
import p000.C0882;
import p078.EnumC1687;
import p132.C2077;
import p143.C2227;
import p193.C2687;
import p215.EnumC2820;
import p252.AbstractC3139;
import p260.C3222;
import p296.C3486;
import p317.AbstractC3616;
import p446.C5158;
import p446.C5166;
import p446.C5168;

/* renamed from: ᵢˈ.ˊᵔ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4238 extends AbstractC0863 {

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public Uri f16446;

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public C5158 f16447;

    /* renamed from: ـˆ, reason: contains not printable characters */
    public C5166 f16448;

    /* renamed from: ᴵʼ, reason: contains not printable characters */
    public long f16449;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public C3486 f16450;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public C5168 f16451;

    /* renamed from: ﾞᐧ, reason: contains not printable characters */
    public boolean f16452;

    @Override // p000.InterfaceC0875
    public final void close() {
        try {
            try {
                C5166 c5166 = this.f16448;
                if (c5166 != null) {
                    c5166.close();
                }
                C5158 c5158 = this.f16447;
                if (c5158 != null) {
                    c5158.close();
                }
                C5168 c5168 = this.f16451;
                if (c5168 != null) {
                    c5168.close();
                }
                C3486 c3486 = this.f16450;
                if (c3486 != null) {
                    c3486.close();
                }
                this.f16446 = null;
                this.f16449 = 0L;
                this.f16448 = null;
                this.f16447 = null;
                this.f16451 = null;
                this.f16450 = null;
                if (this.f16452) {
                    this.f16452 = false;
                    m3675();
                }
            } catch (Exception e) {
                throw new SmbDataSource$SmbDataSourceException(e);
            }
        } catch (Throwable th) {
            this.f16446 = null;
            this.f16449 = 0L;
            this.f16448 = null;
            this.f16447 = null;
            this.f16451 = null;
            this.f16450 = null;
            if (this.f16452) {
                this.f16452 = false;
                m3675();
            }
            throw th;
        }
    }

    @Override // p166.InterfaceC2442
    /* renamed from: ˆʿ */
    public final int mo3679(byte[] bArr, int i, int i2) throws SmbDataSource$SmbDataSourceException {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f16449;
        if (j == 0) {
            return -1;
        }
        try {
            int i3 = this.f16448.read(bArr, i, (int) Math.min(j, i2));
            if (i3 <= 0) {
                return i3;
            }
            this.f16449 -= i3;
            m3676(i3);
            return i3;
        } catch (Exception e) {
            throw new SmbDataSource$SmbDataSourceException(e);
        }
    }

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public final void m9696(Uri uri) {
        String string = uri.toString();
        this.f16450 = AbstractC3139.m7724().m4527(AbstractC3616.m8531(AbstractC3616.m8538(string, "://", string), "/"));
        C2077 c2077 = C2077.f7939;
        C2227 c2227M8373 = this.f16450.m8373(new C3222(c2077.m5753(), c2077.m5747().toCharArray()));
        String strM8538 = AbstractC3616.m8538(string, "://", string);
        this.f16451 = (C5168) c2227M8373.m6208(AbstractC3616.m8531(AbstractC3616.m8538(strM8538, "/", strM8538), "/"));
        String strM85382 = AbstractC3616.m8538(string, "://", string);
        String strM85383 = AbstractC3616.m8538(strM85382, "/", strM85382);
        String strM85384 = AbstractC3616.m8538(strM85383, "/", strM85383);
        C5168 c5168 = this.f16451;
        EnumSet enumSetOf = EnumSet.of(EnumC2820.f10962);
        EnumC1687 enumC1687 = EnumC1687.f6565;
        C5158 c5158M11467 = c5168.m11467(strM85384, enumSetOf, null, 2, null);
        this.f16447 = c5158M11467;
        C5168 c51682 = c5158M11467.f19732;
        this.f16448 = new C5166(c5158M11467, c51682.f19720, c51682.f19721);
    }

    @Override // p000.InterfaceC0875
    /* renamed from: ˏᴵ */
    public final long mo3680(C0882 c0882) throws SmbDataSource$SmbDataSourceException, EOFException {
        long j = c0882.f4001;
        try {
            this.f16446 = c0882.f4004;
            m3673();
            m9696(this.f16446);
            this.f16448.skip(j);
            long j2 = ((C2687) this.f16447.m11460()).f10597;
            long j3 = c0882.f4005;
            if (j3 == -1) {
                j3 = j2 - j;
            }
            this.f16449 = j3;
            if (j3 < 0) {
                throw new EOFException();
            }
            this.f16452 = true;
            m3677(c0882);
            return this.f16449;
        } catch (Exception e) {
            throw new SmbDataSource$SmbDataSourceException(e);
        }
    }

    @Override // p000.InterfaceC0875
    /* renamed from: ˑי */
    public final Uri mo3681() {
        return this.f16446;
    }
}
