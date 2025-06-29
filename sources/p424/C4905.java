package p424;

import android.net.Uri;
import androidx.media3.common.ParserException;
import androidx.media3.exoplayer.dash.DashManifestStaleException;
import java.io.IOException;
import p014.C1060;
import p076.C1654;
import p076.C1657;
import p076.C1659;
import p076.InterfaceC1656;
import p076.InterfaceC1658;
import p166.C2431;
import p198.AbstractC2735;
import p293.C3474;
import p331.C3761;
import p356.C4039;
import p374.C4261;
import p383.AbstractC4464;
import p383.AbstractC4470;

/* renamed from: ﹶʾ.ﹳﹳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4905 implements InterfaceC1658 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final /* synthetic */ C4899 f18568;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final /* synthetic */ int f18569;

    public /* synthetic */ C4905(C4899 c4899, int i) {
        this.f18569 = i;
        this.f18568 = c4899;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public void m11025() {
        long j;
        C4899 c4899 = this.f18568;
        synchronized (AbstractC2735.f10705) {
            try {
                j = AbstractC2735.f10706 ? AbstractC2735.f10708 : -9223372036854775807L;
            } catch (Throwable th) {
                throw th;
            }
        }
        c4899.f18529 = j;
        c4899.m11020(true);
    }

    @Override // p076.InterfaceC1658
    /* renamed from: ᐧʻ */
    public C1654 mo5327(InterfaceC1656 interfaceC1656, long j, long j2, IOException iOException, int i) {
        switch (this.f18569) {
            case 1:
                C1657 c1657 = (C1657) interfaceC1656;
                C4899 c4899 = this.f18568;
                c4899.getClass();
                long j3 = c1657.f6467;
                Uri uri = c1657.f6466.f3992;
                C4261 c4261 = new C4261(j2);
                long jM6871 = c4899.f18532.m6871(new C1060(i, iOException));
                C1654 c1654 = jM6871 == -9223372036854775807L ? C1659.f6471 : new C1654(jM6871, false, 0);
                c4899.f18544.ᵎˏ(c4261, c1657.f6465, iOException, !c1654.m5323());
                return c1654;
            default:
                C1657 c16572 = (C1657) interfaceC1656;
                C4899 c48992 = this.f18568;
                c48992.getClass();
                long j4 = c16572.f6467;
                Uri uri2 = c16572.f6466.f3992;
                c48992.f18544.ᵎˏ(new C4261(j2), c16572.f6465, iOException, true);
                c48992.f18532.getClass();
                c48992.m11023(iOException);
                return C1659.f6469;
        }
    }

    @Override // p076.InterfaceC1658
    /* renamed from: ﹳﹳ */
    public void mo5328(InterfaceC1656 interfaceC1656, long j, long j2, boolean z) {
        switch (this.f18569) {
            case 1:
                this.f18568.m11021((C1657) interfaceC1656, j, j2);
                break;
            default:
                this.f18568.m11021((C1657) interfaceC1656, j, j2);
                break;
        }
    }

    @Override // p076.InterfaceC1658
    /* renamed from: ﾞʽ */
    public void mo5329(InterfaceC1656 interfaceC1656, long j, long j2) {
        switch (this.f18569) {
            case 1:
                C1657 c1657 = (C1657) interfaceC1656;
                C4899 c4899 = this.f18568;
                c4899.getClass();
                long j3 = c1657.f6467;
                Uri uri = c1657.f6466.f3992;
                C4261 c4261 = new C4261(j2);
                c4899.f18532.getClass();
                c4899.f18544.ˏᴵ(c4261, c1657.f6465);
                C4039 c4039 = (C4039) c1657.f6468;
                C4039 c40392 = c4899.f18537;
                int size = c40392 == null ? 0 : c40392.f15533.size();
                long j4 = c4039.m9300(0).f15525;
                int i = 0;
                while (i < size && c4899.f18537.m9300(i).f15525 < j4) {
                    i++;
                }
                if (c4039.f15540) {
                    if (size - i > c4039.f15533.size()) {
                        AbstractC4464.m10144("DashMediaSource", "Loaded out of sync manifest");
                    } else {
                        long j5 = c4899.f18547;
                        if (j5 == -9223372036854775807L || c4039.f15535 * 1000 > j5) {
                            c4899.f18530 = 0;
                        } else {
                            AbstractC4464.m10144("DashMediaSource", "Loaded stale dynamic manifest: " + c4039.f15535 + ", " + c4899.f18547);
                        }
                    }
                    int i2 = c4899.f18530;
                    c4899.f18530 = i2 + 1;
                    if (i2 < c4899.f18532.m6869(c1657.f6465)) {
                        c4899.f18518.postDelayed(c4899.f18524, Math.min((c4899.f18530 - 1) * 1000, 5000));
                        return;
                    } else {
                        c4899.f18533 = new DashManifestStaleException();
                        return;
                    }
                }
                c4899.f18537 = c4039;
                c4899.f18535 = c4039.f15540 & c4899.f18535;
                c4899.f18541 = j - j2;
                c4899.f18540 = j;
                c4899.f18550 += i;
                synchronized (c4899.f18542) {
                    try {
                        if (c1657.f6463.f4004 == c4899.f18519) {
                            Uri uri2 = c4899.f18537.f15534;
                            if (uri2 == null) {
                                uri2 = c1657.f6466.f3992;
                            }
                            c4899.f18519 = uri2;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                C4039 c40393 = c4899.f18537;
                if (!c40393.f15540 || c4899.f18529 != -9223372036854775807L) {
                    c4899.m11020(true);
                    return;
                }
                C3761 c3761 = c40393.f15541;
                if (c3761 == null) {
                    c4899.m11024();
                    return;
                }
                String str = (String) c3761.f14527;
                if (AbstractC4470.m10194(str, "urn:mpeg:dash:utc:direct:2014") || AbstractC4470.m10194(str, "urn:mpeg:dash:utc:direct:2012")) {
                    try {
                        c4899.f18529 = AbstractC4470.m10204((String) c3761.f14528) - c4899.f18540;
                        c4899.m11020(true);
                        return;
                    } catch (ParserException e) {
                        c4899.m11023(e);
                        return;
                    }
                }
                if (AbstractC4470.m10194(str, "urn:mpeg:dash:utc:http-iso:2014") || AbstractC4470.m10194(str, "urn:mpeg:dash:utc:http-iso:2012")) {
                    C1657 c16572 = new C1657(c4899.f18523, Uri.parse((String) c3761.f14528), 5, new C4903());
                    c4899.f18544.ʿˏ(new C4261(c16572.f6467, c16572.f6463, c4899.f18546.m5334(c16572, new C4905(c4899, 2), 1)), c16572.f6465, -1, (C2431) null, 0, (Object) null, -9223372036854775807L, -9223372036854775807L);
                    return;
                } else if (AbstractC4470.m10194(str, "urn:mpeg:dash:utc:http-xsdate:2014") || AbstractC4470.m10194(str, "urn:mpeg:dash:utc:http-xsdate:2012")) {
                    C1657 c16573 = new C1657(c4899.f18523, Uri.parse((String) c3761.f14528), 5, new C3474(11));
                    c4899.f18544.ʿˏ(new C4261(c16573.f6467, c16573.f6463, c4899.f18546.m5334(c16573, new C4905(c4899, 2), 1)), c16573.f6465, -1, (C2431) null, 0, (Object) null, -9223372036854775807L, -9223372036854775807L);
                    return;
                } else if (AbstractC4470.m10194(str, "urn:mpeg:dash:utc:ntp:2014") || AbstractC4470.m10194(str, "urn:mpeg:dash:utc:ntp:2012")) {
                    c4899.m11024();
                    return;
                } else {
                    c4899.m11023(new IOException("Unsupported UTC timing scheme"));
                    return;
                }
            default:
                C1657 c16574 = (C1657) interfaceC1656;
                C4899 c48992 = this.f18568;
                c48992.getClass();
                long j6 = c16574.f6467;
                Uri uri3 = c16574.f6466.f3992;
                C4261 c42612 = new C4261(j2);
                c48992.f18532.getClass();
                c48992.f18544.ˏᴵ(c42612, c16574.f6465);
                c48992.f18529 = ((Long) c16574.f6468).longValue() - j;
                c48992.m11020(true);
                return;
        }
    }
}
