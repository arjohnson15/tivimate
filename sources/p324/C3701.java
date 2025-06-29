package p324;

import android.net.Uri;
import android.os.SystemClock;
import androidx.media3.common.ParserException;
import java.io.IOException;
import java.util.List;
import p000.InterfaceC0864;
import p000.InterfaceC0875;
import p076.C1657;
import p076.C1659;
import p076.InterfaceC1656;
import p076.InterfaceC1658;
import p166.C2431;
import p193.C2705;
import p345.AbstractC3968;
import p345.AbstractC3980;
import p374.C4261;
import ʻˉ.ᐧˋ;

/* renamed from: ᴵˋ.ʽᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3701 implements InterfaceC1658 {

    /* renamed from: ʾʼ, reason: contains not printable characters */
    public final /* synthetic */ C3709 f14272;

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final C1659 f14273 = new C1659("DefaultHlsPlaylistTracker:MediaPlaylist");

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public long f14274;

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public long f14275;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final InterfaceC0875 f14276;

    /* renamed from: ـˆ, reason: contains not printable characters */
    public boolean f14277;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public C3716 f14278;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final Uri f14279;

    /* renamed from: ᴵʼ, reason: contains not printable characters */
    public IOException f14280;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public long f14281;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public long f14282;

    /* renamed from: ﾞᐧ, reason: contains not printable characters */
    public boolean f14283;

    public C3701(C3709 c3709, Uri uri) {
        this.f14272 = c3709;
        this.f14279 = uri;
        this.f14276 = ((InterfaceC0864) c3709.f14323.ˆʿ).mo900();
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static boolean m8660(C3701 c3701, long j) {
        c3701.f14275 = SystemClock.elapsedRealtime() + j;
        C3709 c3709 = c3701.f14272;
        if (!c3701.f14279.equals(c3709.f14327)) {
            return false;
        }
        List list = c3709.f14324.f14291;
        int size = list.size();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        for (int i = 0; i < size; i++) {
            C3701 c37012 = (C3701) c3709.f14322.get(((C3706) list.get(i)).f14305);
            c37012.getClass();
            if (jElapsedRealtime > c37012.f14275) {
                Uri uri = c37012.f14279;
                c3709.f14327 = uri;
                c37012.m8665(c3709.m8668(uri));
                return false;
            }
        }
        return true;
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final Uri m8661() {
        C3716 c3716 = this.f14278;
        Uri uri = this.f14279;
        if (c3716 != null) {
            C3708 c3708 = c3716.f14402;
            if (c3708.f14311 != -9223372036854775807L || c3708.f14309) {
                Uri.Builder builderBuildUpon = uri.buildUpon();
                C3716 c37162 = this.f14278;
                if (c37162.f14402.f14309) {
                    builderBuildUpon.appendQueryParameter("_HLS_msn", String.valueOf(c37162.f14405 + c37162.f14404.size()));
                    C3716 c37163 = this.f14278;
                    if (c37163.f14411 != -9223372036854775807L) {
                        AbstractC3980 abstractC3980 = c37163.f14412;
                        int size = abstractC3980.size();
                        if (!abstractC3980.isEmpty() && ((C3715) AbstractC3968.m9180(abstractC3980)).f14397) {
                            size--;
                        }
                        builderBuildUpon.appendQueryParameter("_HLS_part", String.valueOf(size));
                    }
                }
                C3708 c37082 = this.f14278.f14402;
                if (c37082.f14311 != -9223372036854775807L) {
                    builderBuildUpon.appendQueryParameter("_HLS_skip", c37082.f14308 ? "v2" : "YES");
                }
                return builderBuildUpon.build();
            }
        }
        return uri;
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final void m8662(Uri uri) {
        C3709 c3709 = this.f14272;
        C1657 c1657 = new C1657(this.f14276, uri, 4, c3709.f14315.mo8059(c3709.f14324, this.f14278));
        C2705 c2705 = c3709.f14318;
        int i = c1657.f6465;
        c3709.f14325.ʿˏ(new C4261(c1657.f6467, c1657.f6463, this.f14273.m5334(c1657, this, c2705.m6869(i))), i, -1, (C2431) null, 0, (Object) null, -9223372036854775807L, -9223372036854775807L);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:112:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0218  */
    /* renamed from: ˏᵢ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m8663(p324.C3716 r47, p374.C4261 r48) {
        /*
            Method dump skipped, instructions count: 587
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p324.C3701.m8663(ᴵˋ.ﹶˆ, ᵢˎ.ˎٴ):void");
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final void m8664(boolean z) {
        m8665(z ? m8661() : this.f14279);
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final void m8665(Uri uri) {
        this.f14275 = 0L;
        if (this.f14277) {
            return;
        }
        C1659 c1659 = this.f14273;
        if (c1659.m5335() || c1659.m5332()) {
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j = this.f14282;
        if (jElapsedRealtime >= j) {
            m8662(uri);
        } else {
            this.f14277 = true;
            this.f14272.f14317.postDelayed(new ᐧˋ(this, 16, uri), j - jElapsedRealtime);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003e  */
    @Override // p076.InterfaceC1658
    /* renamed from: ᐧʻ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final p076.C1654 mo5327(p076.InterfaceC1656 r8, long r9, long r11, java.io.IOException r13, int r14) {
        /*
            r7 = this;
            r9 = 1
            r10 = 0
            ʿˉ.ˎٴ r8 = (p076.C1657) r8
            ᵢˎ.ˎٴ r0 = new ᵢˎ.ˎٴ
            long r1 = r8.f6467
            ʻ.ᵎˏ r1 = r8.f6466
            android.net.Uri r1 = r1.f3992
            r0.<init>(r11)
            java.lang.String r11 = "_HLS_msn"
            java.lang.String r11 = r1.getQueryParameter(r11)
            if (r11 == 0) goto L19
            r11 = 1
            goto L1a
        L19:
            r11 = 0
        L1a:
            boolean r12 = r13 instanceof androidx.media3.exoplayer.hls.playlist.HlsPlaylistParser$DeltaUpdateException
            ʿˉ.ˉי r1 = p076.C1659.f6469
            ᴵˋ.ˑʽ r2 = r7.f14272
            int r8 = r8.f6465
            if (r11 != 0) goto L26
            if (r12 == 0) goto L3e
        L26:
            boolean r11 = r13 instanceof androidx.media3.datasource.HttpDataSource$InvalidResponseCodeException
            if (r11 == 0) goto L30
            r11 = r13
            androidx.media3.datasource.HttpDataSource$InvalidResponseCodeException r11 = (androidx.media3.datasource.HttpDataSource$InvalidResponseCodeException) r11
            int r11 = r11.f1342
            goto L33
        L30:
            r11 = 2147483647(0x7fffffff, float:NaN)
        L33:
            if (r12 != 0) goto L8a
            r12 = 400(0x190, float:5.6E-43)
            if (r11 == r12) goto L8a
            r12 = 503(0x1f7, float:7.05E-43)
            if (r11 != r12) goto L3e
            goto L8a
        L3e:
            ʻـ.ʿʼ r11 = new ʻـ.ʿʼ
            r11.<init>(r14, r13)
            java.util.concurrent.CopyOnWriteArrayList r12 = r2.f14316
            java.util.Iterator r12 = r12.iterator()
            r14 = 0
        L4a:
            boolean r3 = r12.hasNext()
            if (r3 == 0) goto L5f
            java.lang.Object r3 = r12.next()
            ᴵˋ.ˑי r3 = (p324.InterfaceC3710) r3
            android.net.Uri r4 = r7.f14279
            boolean r3 = r3.mo8672(r4, r11, r10)
            r3 = r3 ^ r9
            r14 = r14 | r3
            goto L4a
        L5f:
            ˎˊ.ﹶˆ r12 = r2.f14318
            if (r14 == 0) goto L7a
            long r3 = r12.m6871(r11)
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r11 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r11 == 0) goto L77
            ʿˉ.ˉי r11 = new ʿˉ.ˉי
            r11.<init>(r3, r10, r10)
            r1 = r11
            goto L7a
        L77:
            ʿˉ.ˉי r10 = p076.C1659.f6471
            r1 = r10
        L7a:
            boolean r10 = r1.m5323()
            r9 = r9 ^ r10
            com.google.android.gms.internal.play_billing.ᐧʻ r11 = r2.f14325
            r11.ᵎˏ(r0, r8, r13, r9)
            if (r10 != 0) goto L9a
            r12.getClass()
            goto L9a
        L8a:
            long r11 = android.os.SystemClock.elapsedRealtime()
            r7.f14282 = r11
            r7.m8664(r10)
            com.google.android.gms.internal.play_billing.ᐧʻ r10 = r2.f14325
            int r11 = p383.AbstractC4470.f17202
            r10.ᵎˏ(r0, r8, r13, r9)
        L9a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p324.C3701.mo5327(ʿˉ.ˋⁱ, long, long, java.io.IOException, int):ʿˉ.ˉי");
    }

    @Override // p076.InterfaceC1658
    /* renamed from: ﹳﹳ */
    public final void mo5328(InterfaceC1656 interfaceC1656, long j, long j2, boolean z) {
        C1657 c1657 = (C1657) interfaceC1656;
        long j3 = c1657.f6467;
        Uri uri = c1657.f6466.f3992;
        C4261 c4261 = new C4261(j2);
        C3709 c3709 = this.f14272;
        c3709.f14318.getClass();
        c3709.f14325.ˋⁱ(c4261, 4, -1, (C2431) null, 0, (Object) null, -9223372036854775807L, -9223372036854775807L);
    }

    @Override // p076.InterfaceC1658
    /* renamed from: ﾞʽ */
    public final void mo5329(InterfaceC1656 interfaceC1656, long j, long j2) {
        C1657 c1657 = (C1657) interfaceC1656;
        AbstractC3705 abstractC3705 = (AbstractC3705) c1657.f6468;
        Uri uri = c1657.f6466.f3992;
        C4261 c4261 = new C4261(j2);
        if (abstractC3705 instanceof C3716) {
            m8663((C3716) abstractC3705, c4261);
            this.f14272.f14325.ˏᴵ(c4261, 4);
        } else {
            ParserException parserExceptionM1095 = ParserException.m1095("Loaded playlist has unexpected type.", null);
            this.f14280 = parserExceptionM1095;
            this.f14272.f14325.ᵎˏ(c4261, 4, parserExceptionM1095, true);
        }
        this.f14272.f14318.getClass();
    }
}
