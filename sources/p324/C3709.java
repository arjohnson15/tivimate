package p324;

import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import com.google.android.gms.internal.play_billing.ᐧʻ;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p014.C1060;
import p076.C1654;
import p076.C1657;
import p076.C1659;
import p076.InterfaceC1656;
import p076.InterfaceC1658;
import p166.AbstractC2435;
import p166.C2417;
import p166.C2431;
import p193.C2705;
import p310.C3581;
import p372.C4221;
import p374.C4261;
import p383.AbstractC4470;
import ˏᵢ.ᵢٴ;

/* renamed from: ᴵˋ.ˑʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3709 implements InterfaceC1658 {

    /* renamed from: ᵢٴ, reason: contains not printable characters */
    public static final C3581 f14313 = new C3581(21);

    /* renamed from: ʾʼ, reason: contains not printable characters */
    public C3716 f14314;

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final InterfaceC3707 f14315;

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public Handler f14317;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final C2705 f14318;

    /* renamed from: ˑﾞ, reason: contains not printable characters */
    public boolean f14320;

    /* renamed from: ـˆ, reason: contains not printable characters */
    public C4221 f14321;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final ᵢٴ f14323;

    /* renamed from: ᴵʼ, reason: contains not printable characters */
    public C3704 f14324;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public ᐧʻ f14325;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public C1659 f14326;

    /* renamed from: ﾞᐧ, reason: contains not printable characters */
    public Uri f14327;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final CopyOnWriteArrayList f14316 = new CopyOnWriteArrayList();

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final HashMap f14322 = new HashMap();

    /* renamed from: ˑⁱ, reason: contains not printable characters */
    public long f14319 = -9223372036854775807L;

    public C3709(ᵢٴ r1, C2705 c2705, InterfaceC3707 interfaceC3707) {
        this.f14323 = r1;
        this.f14315 = interfaceC3707;
        this.f14318 = c2705;
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final Uri m8668(Uri uri) {
        C3702 c3702;
        C3716 c3716 = this.f14314;
        if (c3716 == null || !c3716.f14402.f14309 || (c3702 = (C3702) c3716.f14414.get(uri)) == null) {
            return uri;
        }
        Uri.Builder builderBuildUpon = uri.buildUpon();
        builderBuildUpon.appendQueryParameter("_HLS_msn", String.valueOf(c3702.f14284));
        int i = c3702.f14285;
        if (i != -1) {
            builderBuildUpon.appendQueryParameter("_HLS_part", String.valueOf(i));
        }
        return builderBuildUpon.build();
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final boolean m8669(Uri uri) {
        int i;
        C3701 c3701 = (C3701) this.f14322.get(uri);
        if (c3701.f14278 == null) {
            return false;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long jMax = Math.max(30000L, AbstractC4470.m10171(c3701.f14278.f14399));
        C3716 c3716 = c3701.f14278;
        return c3716.f14406 || (i = c3716.f14415) == 2 || i == 1 || c3701.f14274 + jMax > jElapsedRealtime;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C3716 m8670(Uri uri, boolean z) {
        HashMap map = this.f14322;
        C3716 c3716 = ((C3701) map.get(uri)).f14278;
        if (c3716 != null && z) {
            if (!uri.equals(this.f14327)) {
                List list = this.f14324.f14291;
                int i = 0;
                while (true) {
                    if (i >= list.size()) {
                        break;
                    }
                    if (uri.equals(((C3706) list.get(i)).f14305)) {
                        C3716 c37162 = this.f14314;
                        if (c37162 == null || !c37162.f14406) {
                            this.f14327 = uri;
                            C3701 c3701 = (C3701) map.get(uri);
                            C3716 c37163 = c3701.f14278;
                            if (c37163 == null || !c37163.f14406) {
                                c3701.m8665(m8668(uri));
                            } else {
                                this.f14314 = c37163;
                                this.f14321.m9669(c37163);
                            }
                        }
                    } else {
                        i++;
                    }
                }
            }
            C3701 c37012 = (C3701) map.get(uri);
            C3716 c37164 = c37012.f14278;
            if (!c37012.f14283) {
                c37012.f14283 = true;
                if (c37164 != null && !c37164.f14406) {
                    c37012.m8664(true);
                }
            }
        }
        return c3716;
    }

    @Override // p076.InterfaceC1658
    /* renamed from: ᐧʻ */
    public final C1654 mo5327(InterfaceC1656 interfaceC1656, long j, long j2, IOException iOException, int i) {
        C1657 c1657 = (C1657) interfaceC1656;
        long j3 = c1657.f6467;
        Uri uri = c1657.f6466.f3992;
        C4261 c4261 = new C4261(j2);
        long jM6871 = this.f14318.m6871(new C1060(i, iOException));
        boolean z = jM6871 == -9223372036854775807L;
        this.f14325.ᵎˏ(c4261, c1657.f6465, iOException, z);
        return z ? C1659.f6471 : new C1654(jM6871, false, 0);
    }

    @Override // p076.InterfaceC1658
    /* renamed from: ﹳﹳ */
    public final void mo5328(InterfaceC1656 interfaceC1656, long j, long j2, boolean z) {
        C1657 c1657 = (C1657) interfaceC1656;
        long j3 = c1657.f6467;
        Uri uri = c1657.f6466.f3992;
        C4261 c4261 = new C4261(j2);
        this.f14318.getClass();
        this.f14325.ˋⁱ(c4261, 4, -1, (C2431) null, 0, (Object) null, -9223372036854775807L, -9223372036854775807L);
    }

    @Override // p076.InterfaceC1658
    /* renamed from: ﾞʽ */
    public final void mo5329(InterfaceC1656 interfaceC1656, long j, long j2) {
        C3704 c3704;
        C1657 c1657 = (C1657) interfaceC1656;
        AbstractC3705 abstractC3705 = (AbstractC3705) c1657.f6468;
        boolean z = abstractC3705 instanceof C3716;
        if (z) {
            String str = abstractC3705.f14301;
            C3704 c37042 = C3704.f14290;
            Uri uri = Uri.parse(str);
            C2417 c2417 = new C2417();
            c2417.f9614 = "0";
            c2417.f9608 = AbstractC2435.m6559("application/x-mpegURL");
            c3704 = new C3704("", Collections.emptyList(), Collections.singletonList(new C3706(uri, new C2431(c2417), null, null, null, null)), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), null, null, false, Collections.emptyMap(), Collections.emptyList());
        } else {
            c3704 = (C3704) abstractC3705;
        }
        this.f14324 = c3704;
        this.f14327 = ((C3706) c3704.f14291.get(0)).f14305;
        this.f14316.add(new C3711(this));
        List list = c3704.f14297;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Uri uri2 = (Uri) list.get(i);
            this.f14322.put(uri2, new C3701(this, uri2));
        }
        Uri uri3 = c1657.f6466.f3992;
        C4261 c4261 = new C4261(j2);
        C3701 c3701 = (C3701) this.f14322.get(this.f14327);
        if (z) {
            c3701.m8663((C3716) abstractC3705, c4261);
        } else {
            c3701.m8664(false);
        }
        this.f14318.getClass();
        this.f14325.ˏᴵ(c4261, 4);
    }
}
