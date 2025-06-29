package p438;

import android.os.SystemClock;
import androidx.media3.exoplayer.ExoPlaybackException;
import java.util.List;
import p036.C1258;
import p166.AbstractC2394;
import p166.C2436;
import p166.C2441;
import p345.C3932;
import p374.C4241;
import p374.C4290;
import p383.AbstractC4470;

/* renamed from: ﹶﾞ.ᵔﹳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C5110 {

    /* renamed from: ʿˏ, reason: contains not printable characters */
    public static final C4290 f19447 = new C4290(new Object());

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final C4290 f19448;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final int f19449;

    /* renamed from: ˉי, reason: contains not printable characters */
    public final List f19450;

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public final boolean f19451;

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public final int f19452;

    /* renamed from: ˎٴ, reason: contains not printable characters */
    public volatile long f19453;

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public final C4290 f19454;

    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public final C2441 f19455;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final C4241 f19456;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final long f19457;

    /* renamed from: ˑי, reason: contains not printable characters */
    public final boolean f19458;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final AbstractC2394 f19459;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final ExoPlaybackException f19460;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final boolean f19461;

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public final int f19462;

    /* renamed from: ᵎˏ, reason: contains not printable characters */
    public volatile long f19463;

    /* renamed from: ᵎـ, reason: contains not printable characters */
    public volatile long f19464;

    /* renamed from: ﹳˎ, reason: contains not printable characters */
    public volatile long f19465;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final long f19466;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final C1258 f19467;

    public C5110(AbstractC2394 abstractC2394, C4290 c4290, long j, long j2, int i, ExoPlaybackException exoPlaybackException, boolean z, C4241 c4241, C1258 c1258, List list, C4290 c42902, boolean z2, int i2, int i3, C2441 c2441, long j3, long j4, long j5, long j6, boolean z3) {
        this.f19459 = abstractC2394;
        this.f19448 = c4290;
        this.f19457 = j;
        this.f19466 = j2;
        this.f19449 = i;
        this.f19460 = exoPlaybackException;
        this.f19461 = z;
        this.f19456 = c4241;
        this.f19467 = c1258;
        this.f19450 = list;
        this.f19454 = c42902;
        this.f19451 = z2;
        this.f19452 = i2;
        this.f19462 = i3;
        this.f19455 = c2441;
        this.f19464 = j3;
        this.f19453 = j4;
        this.f19463 = j5;
        this.f19465 = j6;
        this.f19458 = z3;
    }

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public static C5110 m11323(C1258 c1258) {
        C2436 c2436 = AbstractC2394.f9448;
        C4290 c4290 = f19447;
        return new C5110(c2436, c4290, -9223372036854775807L, 0L, 1, null, false, C4241.f16463, c1258, C3932.f15274, c4290, false, 1, 0, C2441.f9727, 0L, 0L, 0L, 0L, false);
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final C5110 m11324(C4290 c4290) {
        return new C5110(this.f19459, this.f19448, this.f19457, this.f19466, this.f19449, this.f19460, this.f19461, this.f19456, this.f19467, this.f19450, c4290, this.f19451, this.f19452, this.f19462, this.f19455, this.f19464, this.f19453, this.f19463, this.f19465, this.f19458);
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final C5110 m11325(ExoPlaybackException exoPlaybackException) {
        return new C5110(this.f19459, this.f19448, this.f19457, this.f19466, this.f19449, exoPlaybackException, this.f19461, this.f19456, this.f19467, this.f19450, this.f19454, this.f19451, this.f19452, this.f19462, this.f19455, this.f19464, this.f19453, this.f19463, this.f19465, this.f19458);
    }

    /* renamed from: ˉי, reason: contains not printable characters */
    public final long m11326() {
        long j;
        long j2;
        if (!m11327()) {
            return this.f19463;
        }
        do {
            j = this.f19465;
            j2 = this.f19463;
        } while (j != this.f19465);
        return AbstractC4470.m10206(AbstractC4470.m10171(j2) + ((long) ((SystemClock.elapsedRealtime() - j) * this.f19455.f9730)));
    }

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public final boolean m11327() {
        return this.f19449 == 3 && this.f19451 && this.f19462 == 0;
    }

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final C5110 m11328(AbstractC2394 abstractC2394) {
        return new C5110(abstractC2394, this.f19448, this.f19457, this.f19466, this.f19449, this.f19460, this.f19461, this.f19456, this.f19467, this.f19450, this.f19454, this.f19451, this.f19452, this.f19462, this.f19455, this.f19464, this.f19453, this.f19463, this.f19465, this.f19458);
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final C5110 m11329(C4290 c4290, long j, long j2, long j3, long j4, C4241 c4241, C1258 c1258, List list) {
        return new C5110(this.f19459, c4290, j2, j3, this.f19449, this.f19460, this.f19461, c4241, c1258, list, this.f19454, this.f19451, this.f19452, this.f19462, this.f19455, this.f19464, j4, j, SystemClock.elapsedRealtime(), this.f19458);
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C5110 m11330() {
        return new C5110(this.f19459, this.f19448, this.f19457, this.f19466, this.f19449, this.f19460, this.f19461, this.f19456, this.f19467, this.f19450, this.f19454, this.f19451, this.f19452, this.f19462, this.f19455, this.f19464, this.f19453, m11326(), SystemClock.elapsedRealtime(), this.f19458);
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final C5110 m11331(C2441 c2441) {
        return new C5110(this.f19459, this.f19448, this.f19457, this.f19466, this.f19449, this.f19460, this.f19461, this.f19456, this.f19467, this.f19450, this.f19454, this.f19451, this.f19452, this.f19462, c2441, this.f19464, this.f19453, this.f19463, this.f19465, this.f19458);
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final C5110 m11332(int i) {
        return new C5110(this.f19459, this.f19448, this.f19457, this.f19466, i, this.f19460, this.f19461, this.f19456, this.f19467, this.f19450, this.f19454, this.f19451, this.f19452, this.f19462, this.f19455, this.f19464, this.f19453, this.f19463, this.f19465, this.f19458);
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final C5110 m11333(int i, boolean z, int i2) {
        return new C5110(this.f19459, this.f19448, this.f19457, this.f19466, this.f19449, this.f19460, this.f19461, this.f19456, this.f19467, this.f19450, this.f19454, z, i, i2, this.f19455, this.f19464, this.f19453, this.f19463, this.f19465, this.f19458);
    }
}
