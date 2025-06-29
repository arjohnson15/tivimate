package androidx.media3.decoder.ffmpeg;

import android.os.Handler;
import android.os.SystemClock;
import android.os.Trace;
import android.view.Surface;
import androidx.media3.decoder.DecoderException;
import androidx.media3.exoplayer.ExoPlaybackException;
import p007.InterfaceC0962;
import p007.InterfaceC0963;
import p007.RunnableC0941;
import p007.RunnableC0947;
import p166.C2431;
import p166.C2437;
import p230.C3071;
import p312.C3589;
import p331.C3761;
import p383.AbstractC4464;
import p383.AbstractC4470;
import p385.InterfaceC4493;
import p438.AbstractC5115;
import p438.C5074;
import p456.C5349;
import ʻˉ.ᐧˋ;
import ᵎﹳ.ᐧʻ;

/* renamed from: androidx.media3.decoder.ffmpeg.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0267 extends AbstractC5115 {

    /* renamed from: ʻʿ, reason: contains not printable characters */
    public final long f1381;

    /* renamed from: ʻﹳ, reason: contains not printable characters */
    public long f1382;

    /* renamed from: ʽˆ, reason: contains not printable characters */
    public C2437 f1383;

    /* renamed from: ʿˊ, reason: contains not printable characters */
    public Surface f1384;

    /* renamed from: ˈﹳ, reason: contains not printable characters */
    public boolean f1385;

    /* renamed from: ˉᵎ, reason: contains not printable characters */
    public InterfaceC0963 f1386;

    /* renamed from: ˊᵔ, reason: contains not printable characters */
    public C2431 f1387;

    /* renamed from: ˋﾞ, reason: contains not printable characters */
    public int f1388;

    /* renamed from: ˎˉ, reason: contains not printable characters */
    public InterfaceC4493 f1389;

    /* renamed from: יˋ, reason: contains not printable characters */
    public int f1390;

    /* renamed from: ـᵎ, reason: contains not printable characters */
    public C5074 f1391;

    /* renamed from: ٴᐧ, reason: contains not printable characters */
    public long f1392;

    /* renamed from: ٴﹶ, reason: contains not printable characters */
    public int f1393;

    /* renamed from: ᵎʽ, reason: contains not printable characters */
    public Object f1394;

    /* renamed from: ᵔ, reason: contains not printable characters */
    public final C3071 f1395;

    /* renamed from: ᵔٴ, reason: contains not printable characters */
    public final C3761 f1396;

    /* renamed from: ⁱʿ, reason: contains not printable characters */
    public InterfaceC4493 f1397;

    /* renamed from: ﾞˎ, reason: contains not printable characters */
    public final C3589 f1398;

    public C0267(long j, Handler handler, InterfaceC0962 interfaceC0962, int i) {
        super(2);
        this.f1381 = j;
        this.f1382 = -9223372036854775807L;
        this.f1395 = new C3071();
        this.f1398 = new C3589(0, 0);
        this.f1396 = new C3761(handler, interfaceC0962);
        this.f1388 = -1;
        this.f1390 = 0;
        this.f1391 = new C5074();
    }

    @Override // p438.AbstractC5115
    /* renamed from: ʿˏ */
    public final void mo1115(C2431[] c2431Arr, long j, long j2) {
    }

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final void m1139() throws ExoPlaybackException {
        InterfaceC4493 interfaceC4493 = this.f1389;
        ᐧʻ.יʻ(this.f1397, interfaceC4493);
        this.f1397 = interfaceC4493;
        if (interfaceC4493 != null && interfaceC4493.mo10249() == null && this.f1397.mo10248() == null) {
            return;
        }
        try {
            SystemClock.elapsedRealtime();
            this.f1387.getClass();
            Trace.beginSection("createFfmpegVideoDecoder");
            Trace.endSection();
            throw null;
        } catch (DecoderException e) {
            AbstractC4464.m10147("DecoderVideoRenderer", "Video codec error", e);
            C3761 c3761 = this.f1396;
            Handler handler = (Handler) c3761.f14527;
            if (handler != null) {
                handler.post(new RunnableC0947(c3761, e, 3));
            }
            throw m11339(e, this.f1387, false, 4001);
        } catch (OutOfMemoryError e2) {
            throw m11339(e2, this.f1387, false, 4001);
        }
    }

    @Override // p438.AbstractC5115
    /* renamed from: ˈٴ */
    public final int mo1118(C2431 c2431) {
        return ᐧʻ.ˑʽ(0, 0, 0, 0);
    }

    @Override // p438.AbstractC5115
    /* renamed from: ˉⁱ */
    public final boolean mo1119() {
        if (this.f1387 != null && m11337() && (this.f1390 == 3 || this.f1388 == -1)) {
            this.f1382 = -9223372036854775807L;
            return true;
        }
        if (this.f1382 == -9223372036854775807L) {
            return false;
        }
        if (SystemClock.elapsedRealtime() < this.f1382) {
            return true;
        }
        this.f1382 = -9223372036854775807L;
        return false;
    }

    @Override // p438.AbstractC5115
    /* renamed from: ˏʾ */
    public final boolean mo1122() {
        return this.f1385;
    }

    @Override // p438.AbstractC5115
    /* renamed from: ˏᴵ */
    public final void mo1123(boolean z, boolean z2) {
        C5074 c5074 = new C5074();
        this.f1391 = c5074;
        C3761 c3761 = this.f1396;
        Handler handler = (Handler) c3761.f14527;
        if (handler != null) {
            handler.post(new RunnableC0947(c3761, c5074, 4));
        }
        this.f1390 = z2 ? 1 : 0;
    }

    @Override // p438.AbstractC5115, p438.InterfaceC5109
    /* renamed from: ˑʽ */
    public final void mo1125(int i, Object obj) {
        Object obj2;
        Handler handler;
        if (i != 1) {
            if (i == 7) {
                return;
            }
            return;
        }
        if (obj instanceof Surface) {
            this.f1384 = (Surface) obj;
            this.f1388 = 1;
        } else if (obj instanceof InterfaceC0963) {
            this.f1386 = (InterfaceC0963) obj;
            this.f1388 = 0;
        } else {
            this.f1388 = -1;
            obj = null;
        }
        Object obj3 = this.f1394;
        C3761 c3761 = this.f1396;
        if (obj3 == obj) {
            if (obj != null) {
                C2437 c2437 = this.f1383;
                if (c2437 != null) {
                    c3761.m8773(c2437);
                }
                if (this.f1390 != 3 || (obj2 = this.f1394) == null || (handler = (Handler) c3761.f14527) == null) {
                    return;
                }
                handler.post(new RunnableC0941(c3761, obj2, SystemClock.elapsedRealtime()));
                return;
            }
            return;
        }
        this.f1394 = obj;
        if (obj == null) {
            this.f1383 = null;
            this.f1390 = Math.min(this.f1390, 1);
            return;
        }
        C2437 c24372 = this.f1383;
        if (c24372 != null) {
            c3761.m8773(c24372);
        }
        this.f1390 = Math.min(this.f1390, 1);
        if (this.f19478 == 2) {
            long j = this.f1381;
            this.f1382 = j > 0 ? SystemClock.elapsedRealtime() + j : -9223372036854775807L;
        }
    }

    @Override // p438.AbstractC5115
    /* renamed from: ˑי */
    public final void mo1126(boolean z, long j) {
        this.f1385 = false;
        this.f1390 = Math.min(this.f1390, 1);
        if (z) {
            long j2 = this.f1381;
            this.f1382 = j2 > 0 ? SystemClock.elapsedRealtime() + j2 : -9223372036854775807L;
        } else {
            this.f1382 = -9223372036854775807L;
        }
        this.f1395.m7570();
    }

    @Override // p438.AbstractC5115
    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final void mo1140() {
        if (this.f1390 == 0) {
            this.f1390 = 1;
        }
    }

    @Override // p438.AbstractC5115
    /* renamed from: ᴵʿ */
    public final void mo1131() {
        C3761 c3761 = this.f1396;
        this.f1387 = null;
        this.f1383 = null;
        this.f1390 = Math.min(this.f1390, 0);
        try {
            ᐧʻ.יʻ(this.f1389, (InterfaceC4493) null);
            this.f1389 = null;
            ᐧʻ.יʻ(this.f1397, (InterfaceC4493) null);
            this.f1397 = null;
        } finally {
            c3761.m8768(this.f1391);
        }
    }

    @Override // p438.AbstractC5115
    /* renamed from: ᵎˏ */
    public final void mo1132() {
        this.f1393 = 0;
        this.f1392 = SystemClock.elapsedRealtime();
        SystemClock.elapsedRealtime();
        int i = AbstractC4470.f17202;
    }

    @Override // p438.AbstractC5115
    /* renamed from: ﹳˎ */
    public final void mo1134() {
        this.f1382 = -9223372036854775807L;
        if (this.f1393 > 0) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j = jElapsedRealtime - this.f1392;
            int i = this.f1393;
            C3761 c3761 = this.f1396;
            Handler handler = (Handler) c3761.f14527;
            if (handler != null) {
                handler.post(new RunnableC0947(c3761, i, j));
            }
            this.f1393 = 0;
            this.f1392 = jElapsedRealtime;
        }
    }

    @Override // p438.AbstractC5115
    /* renamed from: ﹶˆ */
    public final String mo1137() {
        return "ExperimentalFfmpegVideoRenderer";
    }

    @Override // p438.AbstractC5115
    /* renamed from: ﾞˊ */
    public final void mo1138(long j, long j2) throws ExoPlaybackException {
        if (this.f1385) {
            return;
        }
        if (this.f1387 == null) {
            C5349 c5349 = this.f19479;
            c5349.m12099();
            C3589 c3589 = this.f1398;
            c3589.mo8492();
            int iM11336 = m11336(c5349, c3589, 2);
            if (iM11336 != -5) {
                if (iM11336 == -4) {
                    AbstractC4464.m10132(c3589.m4401(4));
                    this.f1385 = true;
                    return;
                }
                return;
            }
            C2431 c2431 = (C2431) c5349.f20757;
            c2431.getClass();
            InterfaceC4493 interfaceC4493 = (InterfaceC4493) c5349.f20756;
            ᐧʻ.יʻ(this.f1389, interfaceC4493);
            this.f1389 = interfaceC4493;
            this.f1387 = c2431;
            m1139();
            C2431 c24312 = this.f1387;
            c24312.getClass();
            C3761 c3761 = this.f1396;
            Handler handler = (Handler) c3761.f14527;
            if (handler != null) {
                handler.post(new ᐧˋ(c3761, c24312, (Object) null, 1));
            }
        }
        m1139();
    }
}
