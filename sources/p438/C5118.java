package p438;

import android.content.Context;
import android.graphics.Rect;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.util.SparseBooleanArray;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.ExoTimeoutException;
import androidx.media3.exoplayer.image.ImageOutput;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeoutException;
import p033.C1209;
import p033.C1212;
import p033.C1215;
import p033.C1217;
import p033.C1218;
import p033.C1220;
import p036.AbstractC1261;
import p036.C1240;
import p036.C1245;
import p036.C1250;
import p036.C1255;
import p036.C1258;
import p036.C1262;
import p036.InterfaceC1239;
import p061.C1440;
import p076.C1660;
import p076.C1661;
import p076.InterfaceC1670;
import p112.C1811;
import p166.AbstractC2394;
import p166.AbstractC2426;
import p166.C2396;
import p166.C2397;
import p166.C2398;
import p166.C2400;
import p166.C2401;
import p166.C2402;
import p166.C2403;
import p166.C2409;
import p166.C2410;
import p166.C2412;
import p166.C2414;
import p166.C2421;
import p166.C2428;
import p166.C2431;
import p166.C2434;
import p166.C2437;
import p166.InterfaceC2419;
import p166.InterfaceC2425;
import p166.InterfaceC2446;
import p193.C2705;
import p230.C3065;
import p266.C3264;
import p293.C3474;
import p334.C3789;
import p345.AbstractC3980;
import p345.C3928;
import p345.C3932;
import p362.C4125;
import p374.C4241;
import p374.C4245;
import p374.C4290;
import p383.AbstractC4464;
import p383.AbstractC4470;
import p383.C4455;
import p383.C4460;
import p383.C4463;
import p383.C4467;
import p383.C4469;
import p383.InterfaceC4461;
import p383.InterfaceC4472;
import p406.RunnableC4645;
import ʻˋ.ˋˊ;
import ʾי.ˑʽ;
import ʿﾞ.ﹳﹳ;
import ˆٴ.ᵎᵢ;
import ˊﹶ.ˋˉ;
import ᴵˎ.ˎˋ;
import ᵢˈ.ˑי;

/* renamed from: ﹶﾞ.ﾞʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C5118 extends ﹳﹳ implements ExoPlayer {

    /* renamed from: ʻ, reason: contains not printable characters */
    public TextureView f19516;

    /* renamed from: ʻʻ, reason: contains not printable characters */
    public C2431 f19517;

    /* renamed from: ʻʿ, reason: contains not printable characters */
    public final Looper f19518;

    /* renamed from: ʻﹳ, reason: contains not printable characters */
    public final long f19519;

    /* renamed from: ʼʼ, reason: contains not printable characters */
    public C5110 f19520;

    /* renamed from: ʼᵎ, reason: contains not printable characters */
    public C2397 f19521;

    /* renamed from: ʽˆ, reason: contains not printable characters */
    public boolean f19522;

    /* renamed from: ʽⁱ, reason: contains not printable characters */
    public final int f19523;

    /* renamed from: ʾʼ, reason: contains not printable characters */
    public final ˎˋ f19524;

    /* renamed from: ʾˈ, reason: contains not printable characters */
    public Surface f19525;

    /* renamed from: ʿˊ, reason: contains not printable characters */
    public final C5083 f19526;

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final C1258 f19527;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final Context f19528;

    /* renamed from: ˆﾞ, reason: contains not printable characters */
    public SurfaceHolder f19529;

    /* renamed from: ˈﹳ, reason: contains not printable characters */
    public int f19530;

    /* renamed from: ˉˑ, reason: contains not printable characters */
    public int f19531;

    /* renamed from: ˉᵎ, reason: contains not printable characters */
    public final ˋˊ f19532;

    /* renamed from: ˊˆ, reason: contains not printable characters */
    public final int f19533;

    /* renamed from: ˊᵔ, reason: contains not printable characters */
    public final long f19534;

    /* renamed from: ˊﹶ, reason: contains not printable characters */
    public Object f19535;

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public final AbstractC1261 f19536;

    /* renamed from: ˋˏ, reason: contains not printable characters */
    public long f19537;

    /* renamed from: ˋﾞ, reason: contains not printable characters */
    public final C4460 f19538;

    /* renamed from: ˎˉ, reason: contains not printable characters */
    public final C3474 f19539;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final C2421 f19540;

    /* renamed from: ˎᵔ, reason: contains not printable characters */
    public final boolean f19541;

    /* renamed from: ˎᵢ, reason: contains not printable characters */
    public final C5080 f19542;

    /* renamed from: ˏ, reason: contains not printable characters */
    public boolean f19543;

    /* renamed from: ˑʾ, reason: contains not printable characters */
    public C2421 f19544;

    /* renamed from: ˑⁱ, reason: contains not printable characters */
    public final C2412 f19545;

    /* renamed from: ˑﾞ, reason: contains not printable characters */
    public final CopyOnWriteArraySet f19546;

    /* renamed from: יˊ, reason: contains not printable characters */
    public C2410 f19547;

    /* renamed from: יˋ, reason: contains not printable characters */
    public final C3264 f19548;

    /* renamed from: ـˆ, reason: contains not printable characters */
    public final C4469 f19549;

    /* renamed from: ـᵎ, reason: contains not printable characters */
    public boolean f19550;

    /* renamed from: ٴᐧ, reason: contains not printable characters */
    public int f19551;

    /* renamed from: ٴﹶ, reason: contains not printable characters */
    public int f19552;

    /* renamed from: ᐧʼ, reason: contains not printable characters */
    public AudioTrack f19553;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final C2705 f19554;

    /* renamed from: ᐧᴵ, reason: contains not printable characters */
    public C4467 f19555;

    /* renamed from: ᴵʼ, reason: contains not printable characters */
    public final C5093 f19556;

    /* renamed from: ᴵˋ, reason: contains not printable characters */
    public final int f19557;

    /* renamed from: ᴵᴵ, reason: contains not printable characters */
    public boolean f19558;

    /* renamed from: ᵎʽ, reason: contains not printable characters */
    public final SurfaceHolderCallbackC5075 f19559;

    /* renamed from: ᵎʾ, reason: contains not printable characters */
    public C4245 f19560;

    /* renamed from: ᵎˆ, reason: contains not printable characters */
    public float f19561;

    /* renamed from: ᵎᵢ, reason: contains not printable characters */
    public final C5085 f19562;

    /* renamed from: ᵔ, reason: contains not printable characters */
    public final long f19563;

    /* renamed from: ᵔˋ, reason: contains not printable characters */
    public C1811 f19564;

    /* renamed from: ᵔٴ, reason: contains not printable characters */
    public final InterfaceC1670 f19565;

    /* renamed from: ᵔᵢ, reason: contains not printable characters */
    public C2437 f19566;

    /* renamed from: ᵔﹳ, reason: contains not printable characters */
    public final C1220 f19567;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final InterfaceC2419 f19568;

    /* renamed from: ᵢˆ, reason: contains not printable characters */
    public boolean f19569;

    /* renamed from: ᵢٴ, reason: contains not printable characters */
    public final ArrayList f19570;

    /* renamed from: ᵢᵢ, reason: contains not printable characters */
    public C3065 f19571;

    /* renamed from: ᵢﹶ, reason: contains not printable characters */
    public final boolean f19572;

    /* renamed from: ⁱʿ, reason: contains not printable characters */
    public final C5092 f19573;

    /* renamed from: ⁱⁱ, reason: contains not printable characters */
    public C2410 f19574;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public final AbstractC5115[] f19575;

    /* renamed from: ﹶʾ, reason: contains not printable characters */
    public boolean f19576;

    /* renamed from: ﹶﾞ, reason: contains not printable characters */
    public final int f19577;

    /* renamed from: ﾞˎ, reason: contains not printable characters */
    public final long f19578;

    /* renamed from: ﾞᐧ, reason: contains not printable characters */
    public final C5076 f19579;

    /* renamed from: ﾞﾞ, reason: contains not printable characters */
    public C2431 f19580;

    static {
        AbstractC2426.m6526("media3.exoplayer");
    }

    public C5118(C5089 c5089) {
        super(4);
        this.f19554 = new C2705();
        try {
            AbstractC4464.m10131("ExoPlayerImpl", "Init " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.4.0] [" + AbstractC4470.f17193 + "]");
            Context context = c5089.f19352;
            Looper looper = c5089.f19349;
            this.f19528 = context.getApplicationContext();
            C4460 c4460 = c5089.f19339;
            this.f19567 = new C1220(c4460);
            this.f19557 = c5089.f19360;
            this.f19521 = c5089.f19342;
            this.f19523 = c5089.f19347;
            this.f19533 = c5089.f19343;
            this.f19576 = false;
            this.f19519 = c5089.f19358;
            SurfaceHolderCallbackC5075 surfaceHolderCallbackC5075 = new SurfaceHolderCallbackC5075(this);
            this.f19559 = surfaceHolderCallbackC5075;
            this.f19526 = new C5083();
            Handler handler = new Handler(looper);
            AbstractC5115[] abstractC5115Arr = ((ˑי) c5089.f19350.f16519).ـﹶ(handler, surfaceHolderCallbackC5075, surfaceHolderCallbackC5075, surfaceHolderCallbackC5075, surfaceHolderCallbackC5075);
            this.f19575 = abstractC5115Arr;
            AbstractC4464.m10132(abstractC5115Arr.length > 0);
            this.f19536 = (AbstractC1261) c5089.f19340.get();
            c5089.f19359.get();
            this.f19565 = (InterfaceC1670) c5089.f19354.get();
            this.f19541 = c5089.f19345;
            this.f19562 = c5089.f19355;
            this.f19563 = c5089.f19348;
            this.f19578 = c5089.f19351;
            this.f19534 = c5089.f19357;
            this.f19518 = looper;
            this.f19538 = c4460;
            this.f19568 = this;
            this.f19524 = new ˎˋ(looper, c4460, new C5093(this));
            this.f19546 = new CopyOnWriteArraySet();
            this.f19570 = new ArrayList();
            this.f19560 = new C4245();
            this.f19542 = C5080.f19305;
            this.f19527 = new C1258(new C5081[abstractC5115Arr.length], new InterfaceC1239[abstractC5115Arr.length], C2398.f9465, null);
            this.f19545 = new C2412();
            SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
            int[] iArr = {1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 35, 22, 24, 27, 28, 32};
            for (int i = 0; i < 20; i++) {
                int i2 = iArr[i];
                AbstractC4464.m10132(!false);
                sparseBooleanArray.append(i2, true);
            }
            this.f19536.getClass();
            AbstractC4464.m10132(!false);
            sparseBooleanArray.append(29, true);
            AbstractC4464.m10132(!false);
            C2414 c2414 = new C2414(sparseBooleanArray);
            this.f19540 = new C2421(c2414);
            SparseBooleanArray sparseBooleanArray2 = new SparseBooleanArray();
            for (int i3 = 0; i3 < c2414.f9586.size(); i3++) {
                int iM6508 = c2414.m6508(i3);
                AbstractC4464.m10132(!false);
                sparseBooleanArray2.append(iM6508, true);
            }
            AbstractC4464.m10132(!false);
            sparseBooleanArray2.append(4, true);
            AbstractC4464.m10132(!false);
            sparseBooleanArray2.append(10, true);
            AbstractC4464.m10132(!false);
            this.f19544 = new C2421(new C2414(sparseBooleanArray2));
            this.f19549 = this.f19538.m10120(this.f19518, null);
            C5093 c5093 = new C5093(this);
            this.f19556 = c5093;
            this.f19520 = C5110.m11323(this.f19527);
            this.f19567.m4363(this.f19568, this.f19518);
            int i4 = AbstractC4470.f17202;
            String str = c5089.f19361;
            this.f19579 = new C5076(this.f19575, this.f19536, this.f19527, (C5117) c5089.f19353.get(), this.f19565, this.f19530, this.f19522, this.f19567, this.f19562, c5089.f19346, c5089.f19356, this.f19518, this.f19538, c5093, i4 < 31 ? new C1215(str) : AbstractC5113.m11334(this.f19528, this, c5089.f19341, str), this.f19542);
            this.f19561 = 1.0f;
            this.f19530 = 0;
            C2410 c2410 = C2410.f9547;
            this.f19574 = c2410;
            this.f19547 = c2410;
            this.f19531 = -1;
            if (i4 < 21) {
                AudioTrack audioTrack = this.f19553;
                if (audioTrack != null && audioTrack.getAudioSessionId() != 0) {
                    this.f19553.release();
                    this.f19553 = null;
                }
                if (this.f19553 == null) {
                    this.f19553 = new AudioTrack(3, 4000, 4, 2, 2, 0, 0);
                }
                this.f19577 = this.f19553.getAudioSessionId();
            } else {
                AudioManager audioManager = (AudioManager) this.f19528.getSystemService("audio");
                this.f19577 = audioManager == null ? -1 : audioManager.generateAudioSessionId();
            }
            this.f19564 = C1811.f7008;
            this.f19572 = true;
            C1220 c1220 = this.f19567;
            c1220.getClass();
            this.f19524.ـﹶ(c1220);
            InterfaceC1670 interfaceC1670 = this.f19565;
            Handler handler2 = new Handler(this.f19518);
            C1220 c12202 = this.f19567;
            C1660 c1660 = (C1660) interfaceC1670;
            c1660.getClass();
            c12202.getClass();
            ˑʽ r2 = c1660.f6482;
            r2.getClass();
            CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) r2.ˆʿ;
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                C1661 c1661 = (C1661) it.next();
                if (c1661.f6495 == c12202) {
                    c1661.f6496 = true;
                    copyOnWriteArrayList.remove(c1661);
                }
            }
            copyOnWriteArrayList.add(new C1661(handler2, c12202));
            this.f19546.add(this.f19559);
            ˋˊ r22 = new ˋˊ(context, handler, this.f19559);
            this.f19532 = r22;
            r22.ˉⁱ();
            C5092 c5092 = new C5092(context, handler, this.f19559);
            this.f19573 = c5092;
            c5092.m11292(null);
            C3474 c3474 = new C3474(13);
            context.getApplicationContext();
            this.f19539 = c3474;
            this.f19548 = new C3264(context);
            C1212 c1212 = new C1212();
            c1212.f4960 = 0;
            c1212.f4959 = 0;
            new C2403(c1212);
            this.f19566 = C2437.f9721;
            this.f19555 = C4467.f17187;
            this.f19536.mo4481(this.f19521);
            m11359(1, 10, Integer.valueOf(this.f19577));
            m11359(2, 10, Integer.valueOf(this.f19577));
            m11359(1, 3, this.f19521);
            m11359(2, 4, Integer.valueOf(this.f19523));
            m11359(2, 5, Integer.valueOf(this.f19533));
            m11359(1, 9, Boolean.valueOf(this.f19576));
            m11359(2, 7, this.f19526);
            m11359(6, 8, this.f19526);
            m11359(-1, 16, Integer.valueOf(this.f19557));
            this.f19554.m6868();
        } catch (Throwable th) {
            this.f19554.m6868();
            throw th;
        }
    }

    /* renamed from: ʿˉ, reason: contains not printable characters */
    public static long m11354(C5110 c5110) {
        C2434 c2434 = new C2434();
        C2412 c2412 = new C2412();
        c5110.f19459.mo6479(c5110.f19448.f16693, c2412);
        long j = c5110.f19457;
        if (j != -9223372036854775807L) {
            return c2412.f9575 + j;
        }
        return c5110.f19459.mo6179(c2412.f9576, c2434, 0L).f9706;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void setImageOutput(ImageOutput imageOutput) {
        m11358();
        m11359(4, 15, imageOutput);
    }

    /* renamed from: ʻʻ, reason: contains not printable characters */
    public final void m11355(long j, boolean z, int i) {
        m11358();
        if (i == -1) {
            return;
        }
        AbstractC4464.m10142(i >= 0);
        AbstractC2394 abstractC2394 = this.f19520.f19459;
        if (abstractC2394.m6477() || i < abstractC2394.mo6474()) {
            C1220 c1220 = this.f19567;
            if (!c1220.f5015) {
                C1218 c1218M4339 = c1220.m4339();
                c1220.f5015 = true;
                c1220.m4338(c1218M4339, -1, new C1209(0));
            }
            this.f19551++;
            if (m11356()) {
                AbstractC4464.m10144("ExoPlayerImpl", "seekTo ignored because an ad is playing");
                C1440 c1440 = new C1440(this.f19520);
                c1440.m4994(1);
                C5118 c5118 = this.f19556.f19374;
                c5118.f19549.m10158(new RunnableC4645(c5118, 2, c1440));
                return;
            }
            C5110 c5110M11332 = this.f19520;
            int i2 = c5110M11332.f19449;
            if (i2 == 3 || (i2 == 4 && !abstractC2394.m6477())) {
                c5110M11332 = this.f19520.m11332(2);
            }
            int iM11386 = m11386();
            C5110 c5110M11373 = m11373(c5110M11332, abstractC2394, m11378(abstractC2394, i, j));
            this.f19579.f19262.m10159(3, new C5102(abstractC2394, i, AbstractC4470.m10206(j))).m10121();
            m11380(c5110M11373, 0, true, 1, m11368(c5110M11373), iM11386, z);
        }
    }

    /* renamed from: ʻˉ, reason: contains not printable characters */
    public final boolean m11356() {
        m11358();
        return this.f19520.f19448.m9753();
    }

    /* renamed from: ʻˏ, reason: contains not printable characters */
    public final void m11357(ExoPlaybackException exoPlaybackException) {
        C5110 c5110 = this.f19520;
        C5110 c5110M11324 = c5110.m11324(c5110.f19448);
        c5110M11324.f19464 = c5110M11324.f19463;
        c5110M11324.f19453 = 0L;
        C5110 c5110M11332 = c5110M11324.m11332(1);
        if (exoPlaybackException != null) {
            c5110M11332 = c5110M11332.m11325(exoPlaybackException);
        }
        C5110 c51102 = c5110M11332;
        this.f19551++;
        C4469 c4469 = this.f19579.f19262;
        c4469.getClass();
        C4463 c4463M10156 = C4469.m10156();
        c4463M10156.f17178 = c4469.f17191.obtainMessage(6);
        c4463M10156.m10121();
        m11380(c51102, 0, false, 5, -9223372036854775807L, -1, false);
    }

    /* renamed from: ʻـ, reason: contains not printable characters */
    public final void m11358() {
        C2705 c2705 = this.f19554;
        synchronized (c2705) {
            boolean z = false;
            while (!c2705.f10605) {
                try {
                    c2705.wait();
                } catch (InterruptedException unused) {
                    z = true;
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
        }
        if (Thread.currentThread() != this.f19518.getThread()) {
            String name = Thread.currentThread().getName();
            String name2 = this.f19518.getThread().getName();
            int i = AbstractC4470.f17202;
            Locale locale = Locale.US;
            String str = "Player is accessed on the wrong thread.\nCurrent thread: '" + name + "'\nExpected thread: '" + name2 + "'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread";
            if (this.f19572) {
                throw new IllegalStateException(str);
            }
            AbstractC4464.m10127("ExoPlayerImpl", str, this.f19569 ? null : new IllegalStateException());
            this.f19569 = true;
        }
    }

    /* renamed from: ʻٴ, reason: contains not printable characters */
    public final void m11359(int i, int i2, Object obj) {
        for (AbstractC5115 abstractC5115 : this.f19575) {
            if (i == -1 || abstractC5115.f19476 == i) {
                C5108 c5108M11385 = m11385(abstractC5115);
                AbstractC4464.m10132(!c5108M11385.f19444);
                c5108M11385.f19445 = i2;
                AbstractC4464.m10132(!c5108M11385.f19444);
                c5108M11385.f19439 = obj;
                c5108M11385.m11321();
            }
        }
    }

    /* renamed from: ʼʼ, reason: contains not printable characters */
    public final long m11360() {
        m11358();
        return AbstractC4470.m10171(m11368(this.f19520));
    }

    /* renamed from: ʼﹶ, reason: contains not printable characters */
    public final int m11361() {
        m11358();
        return this.f19520.f19449;
    }

    /* renamed from: ˆʼ, reason: contains not printable characters */
    public final boolean m11362() {
        m11358();
        return this.f19520.f19451;
    }

    /* renamed from: ˆˋ, reason: contains not printable characters */
    public final void m11363() {
        C3065 c3065 = this.f19571;
        SurfaceHolderCallbackC5075 surfaceHolderCallbackC5075 = this.f19559;
        if (c3065 != null) {
            C5108 c5108M11385 = m11385(this.f19526);
            AbstractC4464.m10132(!c5108M11385.f19444);
            c5108M11385.f19445 = 10000;
            AbstractC4464.m10132(!c5108M11385.f19444);
            c5108M11385.f19439 = null;
            c5108M11385.m11321();
            this.f19571.f11815.remove(surfaceHolderCallbackC5075);
            this.f19571 = null;
        }
        TextureView textureView = this.f19516;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != surfaceHolderCallbackC5075) {
                AbstractC4464.m10144("ExoPlayerImpl", "SurfaceTextureListener already unset or replaced.");
            } else {
                this.f19516.setSurfaceTextureListener(null);
            }
            this.f19516 = null;
        }
        SurfaceHolder surfaceHolder = this.f19529;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(surfaceHolderCallbackC5075);
            this.f19529 = null;
        }
    }

    /* renamed from: ˆˎ, reason: contains not printable characters */
    public final void m11364(final int i, final int i2) {
        C4467 c4467 = this.f19555;
        if (i == c4467.f17189 && i2 == c4467.f17188) {
            return;
        }
        this.f19555 = new C4467(i, i2);
        this.f19524.ᐧʻ(24, new InterfaceC4461() { // from class: ﹶﾞ.ˏᴵ
            @Override // p383.InterfaceC4461
            /* renamed from: ʽᐧ */
            public final void mo4092(Object obj) {
                ((InterfaceC2446) obj).mo4365(i, i2);
            }
        });
        m11359(2, 14, new C4467(i, i2));
    }

    /* renamed from: ˆﹶ, reason: contains not printable characters */
    public final void m11365(InterfaceC2446 interfaceC2446) {
        m11358();
        interfaceC2446.getClass();
        ˎˋ r0 = this.f19524;
        r0.ˏᵢ();
        CopyOnWriteArraySet copyOnWriteArraySet = (CopyOnWriteArraySet) r0.ٴˎ;
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            C4455 c4455 = (C4455) it.next();
            if (c4455.f17158.equals(interfaceC2446)) {
                c4455.f17159 = true;
                if (c4455.f17157) {
                    c4455.f17157 = false;
                    C2414 c2414M6531 = c4455.f17156.m6531();
                    ((InterfaceC4472) r0.ʿʼ).mo4103(c4455.f17158, c2414M6531);
                }
                copyOnWriteArraySet.remove(c4455);
            }
        }
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    public final void m11366(int i) {
        m11358();
        if (this.f19530 != i) {
            this.f19530 = i;
            C4469 c4469 = this.f19579.f19262;
            c4469.getClass();
            C4463 c4463M10156 = C4469.m10156();
            c4463M10156.f17178 = c4469.f17191.obtainMessage(11, i, 0);
            c4463M10156.m10121();
            C1217 c1217 = new C1217(i);
            ˎˋ r1 = this.f19524;
            r1.ﹳﹳ(8, c1217);
            m11389();
            r1.ˑʽ();
        }
    }

    /* renamed from: ˉʾ, reason: contains not printable characters */
    public final C2398 m11367() {
        m11358();
        return this.f19520.f19467.f5168;
    }

    /* renamed from: ˉˑ, reason: contains not printable characters */
    public final long m11368(C5110 c5110) {
        if (c5110.f19459.m6477()) {
            return AbstractC4470.m10206(this.f19537);
        }
        long jM11326 = c5110.f19458 ? c5110.m11326() : c5110.f19463;
        if (c5110.f19448.m9753()) {
            return jM11326;
        }
        AbstractC2394 abstractC2394 = c5110.f19459;
        Object obj = c5110.f19448.f16693;
        C2412 c2412 = this.f19545;
        abstractC2394.mo6479(obj, c2412);
        return jM11326 + c2412.f9575;
    }

    /* renamed from: ˋˏ, reason: contains not printable characters */
    public final AbstractC2394 m11369() {
        m11358();
        return this.f19520.f19459;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* renamed from: ˋᴵ, reason: contains not printable characters */
    public final void m11370(int i, boolean z, int i2) {
        ?? r13 = (!z || i == -1) ? 0 : 1;
        int i3 = i == 0 ? 1 : 0;
        C5110 c5110 = this.f19520;
        if (c5110.f19451 == r13 && c5110.f19462 == i3 && c5110.f19452 == i2) {
            return;
        }
        this.f19551++;
        C5110 c51102 = this.f19520;
        boolean z2 = c51102.f19458;
        C5110 c5110M11330 = c51102;
        if (z2) {
            c5110M11330 = c51102.m11330();
        }
        C5110 c5110M11333 = c5110M11330.m11333(i2, r13, i3);
        int i4 = (i3 << 4) | i2;
        C4469 c4469 = this.f19579.f19262;
        c4469.getClass();
        C4463 c4463M10156 = C4469.m10156();
        c4463M10156.f17178 = c4469.f17191.obtainMessage(1, r13, i4);
        c4463M10156.m10121();
        m11380(c5110M11333, 0, false, 5, -9223372036854775807L, -1, false);
    }

    /* renamed from: ˎי, reason: contains not printable characters */
    public final C1245 m11371() {
        m11358();
        return ((C1255) this.f19536).m4484();
    }

    /* renamed from: ˏʻ, reason: contains not printable characters */
    public final void m11372() {
        m11358();
        this.f19573.m11295(1, m11362());
        m11357(null);
        C3932 c3932 = C3932.f15274;
        long j = this.f19520.f19463;
        this.f19564 = new C1811(c3932);
    }

    /* renamed from: ˑˈ, reason: contains not printable characters */
    public final C5110 m11373(C5110 c5110, AbstractC2394 abstractC2394, Pair pair) {
        List list;
        AbstractC4464.m10142(abstractC2394.m6477() || pair != null);
        AbstractC2394 abstractC23942 = c5110.f19459;
        long jM11387 = m11387(c5110);
        C5110 c5110M11328 = c5110.m11328(abstractC2394);
        if (abstractC2394.m6477()) {
            C4290 c4290 = C5110.f19447;
            long jM10206 = AbstractC4470.m10206(this.f19537);
            C5110 c5110M11324 = c5110M11328.m11329(c4290, jM10206, jM10206, jM10206, 0L, C4241.f16463, this.f19527, C3932.f15274).m11324(c4290);
            c5110M11324.f19464 = c5110M11324.f19463;
            return c5110M11324;
        }
        Object obj = c5110M11328.f19448.f16693;
        boolean zEquals = obj.equals(pair.first);
        C4290 c42902 = !zEquals ? new C4290(pair.first) : c5110M11328.f19448;
        long jLongValue = ((Long) pair.second).longValue();
        long jM102062 = AbstractC4470.m10206(jM11387);
        if (!abstractC23942.m6477()) {
            jM102062 -= abstractC23942.mo6479(obj, this.f19545).f9575;
        }
        if (!zEquals || jLongValue < jM102062) {
            AbstractC4464.m10132(!c42902.m9753());
            C4241 c4241 = !zEquals ? C4241.f16463 : c5110M11328.f19456;
            C1258 c1258 = !zEquals ? this.f19527 : c5110M11328.f19467;
            if (zEquals) {
                list = c5110M11328.f19450;
            } else {
                C3928 c3928 = AbstractC3980.f15360;
                list = C3932.f15274;
            }
            C5110 c5110M113242 = c5110M11328.m11329(c42902, jLongValue, jLongValue, jLongValue, 0L, c4241, c1258, list).m11324(c42902);
            c5110M113242.f19464 = jLongValue;
            return c5110M113242;
        }
        if (jLongValue != jM102062) {
            AbstractC4464.m10132(!c42902.m9753());
            long jMax = Math.max(0L, c5110M11328.f19453 - (jLongValue - jM102062));
            long j = c5110M11328.f19464;
            if (c5110M11328.f19454.equals(c5110M11328.f19448)) {
                j = jLongValue + jMax;
            }
            C5110 c5110M11329 = c5110M11328.m11329(c42902, jLongValue, jLongValue, jLongValue, jMax, c5110M11328.f19456, c5110M11328.f19467, c5110M11328.f19450);
            c5110M11329.f19464 = j;
            return c5110M11329;
        }
        int iMo6469 = abstractC2394.mo6469(c5110M11328.f19454.f16693);
        if (iMo6469 != -1 && abstractC2394.mo6180(iMo6469, this.f19545, false).f9576 == abstractC2394.mo6479(c42902.f16693, this.f19545).f9576) {
            return c5110M11328;
        }
        abstractC2394.mo6479(c42902.f16693, this.f19545);
        long jM6503 = c42902.m9753() ? this.f19545.m6503(c42902.f16690, c42902.f16692) : this.f19545.f9580;
        C5110 c5110M113243 = c5110M11328.m11329(c42902, c5110M11328.f19463, c5110M11328.f19463, c5110M11328.f19466, jM6503 - c5110M11328.f19463, c5110M11328.f19456, c5110M11328.f19467, c5110M11328.f19450).m11324(c42902);
        c5110M113243.f19464 = jM6503;
        return c5110M113243;
    }

    /* renamed from: ˑˉ, reason: contains not printable characters */
    public final void m11374() {
        int iM11361 = m11361();
        C3264 c3264 = this.f19548;
        C3474 c3474 = this.f19539;
        if (iM11361 != 1) {
            if (iM11361 == 2 || iM11361 == 3) {
                m11358();
                boolean z = this.f19520.f19458;
                m11362();
                c3474.getClass();
                m11362();
                c3264.getClass();
                return;
            }
            if (iM11361 != 4) {
                throw new IllegalStateException();
            }
        }
        c3474.getClass();
        c3264.getClass();
    }

    /* renamed from: יʾ, reason: contains not printable characters */
    public final void m11375(float f) {
        m11358();
        final float fM10214 = AbstractC4470.m10214(f, 0.0f, 1.0f);
        if (this.f19561 == fM10214) {
            return;
        }
        this.f19561 = fM10214;
        m11359(1, 2, Float.valueOf(this.f19573.f19372 * fM10214));
        this.f19524.ᐧʻ(22, new InterfaceC4461() { // from class: ﹶﾞ.ᴵʿ
            @Override // p383.InterfaceC4461
            /* renamed from: ʽᐧ */
            public final void mo4092(Object obj) {
                ((InterfaceC2446) obj).mo4345(fM10214);
            }
        });
    }

    /* renamed from: יˆ, reason: contains not printable characters */
    public final C1250 m11376() {
        m11358();
        return new C1250(this.f19520.f19467.f5166);
    }

    /* renamed from: יˊ, reason: contains not printable characters */
    public final int m11377() {
        m11358();
        if (this.f19520.f19459.m6477()) {
            return 0;
        }
        C5110 c5110 = this.f19520;
        return c5110.f19459.mo6469(c5110.f19448.f16693);
    }

    /* renamed from: יי, reason: contains not printable characters */
    public final Pair m11378(AbstractC2394 abstractC2394, int i, long j) {
        if (abstractC2394.m6477()) {
            this.f19531 = i;
            if (j == -9223372036854775807L) {
                j = 0;
            }
            this.f19537 = j;
            return null;
        }
        if (i == -1 || i >= abstractC2394.mo6474()) {
            i = abstractC2394.mo6478(this.f19522);
            j = AbstractC4470.m10171(abstractC2394.mo6179(i, (C2434) ((ﹳﹳ) this).ᐧⁱ, 0L).f9706);
        }
        return abstractC2394.m6482((C2434) ((ﹳﹳ) this).ᐧⁱ, this.f19545, i, AbstractC4470.m10206(j));
    }

    /* renamed from: יᴵ, reason: contains not printable characters */
    public final long m11379() {
        m11358();
        if (!m11356()) {
            return ᐧˋ();
        }
        C5110 c5110 = this.f19520;
        C4290 c4290 = c5110.f19448;
        AbstractC2394 abstractC2394 = c5110.f19459;
        Object obj = c4290.f16693;
        C2412 c2412 = this.f19545;
        abstractC2394.mo6479(obj, c2412);
        return AbstractC4470.m10171(c2412.m6503(c4290.f16690, c4290.f16692));
    }

    /* renamed from: ـᵢ, reason: contains not printable characters */
    public final void m11380(final C5110 c5110, int i, boolean z, int i2, long j, int i3, boolean z2) {
        Pair pair;
        int i4;
        C2402 c2402;
        boolean z3;
        boolean z4;
        int i5;
        Object obj;
        C2402 c24022;
        Object obj2;
        int i6;
        long j2;
        long j3;
        long jM11354;
        long jM113542;
        Object obj3;
        C2402 c24023;
        Object obj4;
        int i7;
        C5110 c51102 = this.f19520;
        this.f19520 = c5110;
        boolean zEquals = c51102.f19459.equals(c5110.f19459);
        AbstractC2394 abstractC2394 = c51102.f19459;
        AbstractC2394 abstractC23942 = c5110.f19459;
        if (abstractC23942.m6477() && abstractC2394.m6477()) {
            pair = new Pair(Boolean.FALSE, -1);
        } else if (abstractC23942.m6477() != abstractC2394.m6477()) {
            pair = new Pair(Boolean.TRUE, 3);
        } else {
            C4290 c4290 = c51102.f19448;
            Object obj5 = c4290.f16693;
            C2412 c2412 = this.f19545;
            int i8 = abstractC2394.mo6479(obj5, c2412).f9576;
            C2434 c2434 = (C2434) ((ﹳﹳ) this).ᐧⁱ;
            Object obj6 = abstractC2394.mo6179(i8, c2434, 0L).f9713;
            C4290 c42902 = c5110.f19448;
            if (obj6.equals(abstractC23942.mo6179(abstractC23942.mo6479(c42902.f16693, c2412).f9576, c2434, 0L).f9713)) {
                pair = (z && i2 == 0 && c4290.f16694 < c42902.f16694) ? new Pair(Boolean.TRUE, 0) : (z && i2 == 1 && z2) ? new Pair(Boolean.TRUE, 2) : new Pair(Boolean.FALSE, -1);
            } else {
                if (z && i2 == 0) {
                    i4 = 1;
                } else if (z && i2 == 1) {
                    i4 = 2;
                } else {
                    if (zEquals) {
                        throw new IllegalStateException();
                    }
                    i4 = 3;
                }
                pair = new Pair(Boolean.TRUE, Integer.valueOf(i4));
            }
        }
        boolean zBooleanValue = ((Boolean) pair.first).booleanValue();
        int iIntValue = ((Integer) pair.second).intValue();
        if (zBooleanValue) {
            c2402 = !c5110.f19459.m6477() ? c5110.f19459.mo6179(c5110.f19459.mo6479(c5110.f19448.f16693, this.f19545).f9576, (C2434) ((ﹳﹳ) this).ᐧⁱ, 0L).f9711 : null;
            this.f19547 = C2410.f9547;
        } else {
            c2402 = null;
        }
        if (zBooleanValue || !c51102.f19450.equals(c5110.f19450)) {
            C2400 c2400M6498 = this.f19547.m6498();
            List list = c5110.f19450;
            for (int i9 = 0; i9 < list.size(); i9++) {
                C2401 c2401 = (C2401) list.get(i9);
                int i10 = 0;
                while (true) {
                    InterfaceC2425[] interfaceC2425Arr = c2401.f9491;
                    if (i10 < interfaceC2425Arr.length) {
                        interfaceC2425Arr[i10].mo3979(c2400M6498);
                        i10++;
                    }
                }
            }
            this.f19547 = new C2410(c2400M6498);
        }
        C2410 c2410M11384 = m11384();
        boolean zEquals2 = c2410M11384.equals(this.f19574);
        this.f19574 = c2410M11384;
        boolean z5 = c51102.f19451 != c5110.f19451;
        boolean z6 = c51102.f19449 != c5110.f19449;
        if (z6 || z5) {
            m11374();
        }
        boolean z7 = c51102.f19461 != c5110.f19461;
        if (!zEquals) {
            this.f19524.ﹳﹳ(0, new ᵎᵢ(i, 2, c5110));
        }
        if (z) {
            C2412 c24122 = new C2412();
            if (c51102.f19459.m6477()) {
                z3 = z6;
                z4 = z7;
                i5 = i3;
                obj = null;
                c24022 = null;
                obj2 = null;
                i6 = -1;
            } else {
                Object obj7 = c51102.f19448.f16693;
                c51102.f19459.mo6479(obj7, c24122);
                int i11 = c24122.f9576;
                int iMo6469 = c51102.f19459.mo6469(obj7);
                z3 = z6;
                z4 = z7;
                obj = c51102.f19459.mo6179(i11, (C2434) ((ﹳﹳ) this).ᐧⁱ, 0L).f9713;
                c24022 = ((C2434) ((ﹳﹳ) this).ᐧⁱ).f9711;
                i5 = i11;
                i6 = iMo6469;
                obj2 = obj7;
            }
            if (i2 == 0) {
                if (c51102.f19448.m9753()) {
                    C4290 c42903 = c51102.f19448;
                    jM11354 = c24122.m6503(c42903.f16690, c42903.f16692);
                    jM113542 = m11354(c51102);
                } else if (c51102.f19448.f16691 != -1) {
                    jM11354 = m11354(this.f19520);
                    jM113542 = jM11354;
                } else {
                    j2 = c24122.f9575;
                    j3 = c24122.f9580;
                    jM11354 = j2 + j3;
                    jM113542 = jM11354;
                }
            } else if (c51102.f19448.m9753()) {
                jM11354 = c51102.f19463;
                jM113542 = m11354(c51102);
            } else {
                j2 = c24122.f9575;
                j3 = c51102.f19463;
                jM11354 = j2 + j3;
                jM113542 = jM11354;
            }
            long jM10171 = AbstractC4470.m10171(jM11354);
            long jM101712 = AbstractC4470.m10171(jM113542);
            C4290 c42904 = c51102.f19448;
            C2396 c2396 = new C2396(obj, i5, c24022, obj2, i6, jM10171, jM101712, c42904.f16690, c42904.f16692);
            int iM11386 = m11386();
            if (this.f19520.f19459.m6477()) {
                obj3 = null;
                c24023 = null;
                obj4 = null;
                i7 = -1;
            } else {
                C5110 c51103 = this.f19520;
                Object obj8 = c51103.f19448.f16693;
                c51103.f19459.mo6479(obj8, this.f19545);
                int iMo64692 = this.f19520.f19459.mo6469(obj8);
                AbstractC2394 abstractC23943 = this.f19520.f19459;
                C2434 c24342 = (C2434) ((ﹳﹳ) this).ᐧⁱ;
                i7 = iMo64692;
                obj3 = abstractC23943.mo6179(iM11386, c24342, 0L).f9713;
                c24023 = c24342.f9711;
                obj4 = obj8;
            }
            long jM101713 = AbstractC4470.m10171(j);
            long jM101714 = this.f19520.f19448.m9753() ? AbstractC4470.m10171(m11354(this.f19520)) : jM101713;
            C4290 c42905 = this.f19520.f19448;
            this.f19524.ﹳﹳ(11, new C5087(i2, c2396, new C2396(obj3, iM11386, c24023, obj4, i7, jM101713, jM101714, c42905.f16690, c42905.f16692)));
        } else {
            z3 = z6;
            z4 = z7;
        }
        if (zBooleanValue) {
            this.f19524.ﹳﹳ(1, new ᵎᵢ(iIntValue, 3, c2402));
        }
        if (c51102.f19460 != c5110.f19460) {
            final int i12 = 7;
            this.f19524.ﹳﹳ(10, new InterfaceC4461() { // from class: ﹶﾞ.ˋⁱ
                @Override // p383.InterfaceC4461
                /* renamed from: ʽᐧ */
                public final void mo4092(Object obj9) {
                    InterfaceC2446 interfaceC2446 = (InterfaceC2446) obj9;
                    switch (i12) {
                        case 0:
                            C5110 c51104 = c5110;
                            boolean z8 = c51104.f19461;
                            interfaceC2446.getClass();
                            interfaceC2446.mo4346(c51104.f19461);
                            break;
                        case 1:
                            C5110 c51105 = c5110;
                            interfaceC2446.mo4367(c51105.f19449, c51105.f19451);
                            break;
                        case 2:
                            interfaceC2446.mo4360(c5110.f19449);
                            break;
                        case 3:
                            C5110 c51106 = c5110;
                            interfaceC2446.mo4342(c51106.f19452, c51106.f19451);
                            break;
                        case 4:
                            interfaceC2446.mo4357(c5110.f19462);
                            break;
                        case 5:
                            interfaceC2446.mo4355(c5110.m11327());
                            break;
                        case C3789.STRING_SET_FIELD_NUMBER /* 6 */:
                            interfaceC2446.mo4361(c5110.f19455);
                            break;
                        case C3789.DOUBLE_FIELD_NUMBER /* 7 */:
                            interfaceC2446.mo4362(c5110.f19460);
                            break;
                        case 8:
                            interfaceC2446.mo4344(c5110.f19460);
                            break;
                        default:
                            interfaceC2446.mo4358(c5110.f19467.f5168);
                            break;
                    }
                }
            });
            if (c5110.f19460 != null) {
                final int i13 = 8;
                this.f19524.ﹳﹳ(10, new InterfaceC4461() { // from class: ﹶﾞ.ˋⁱ
                    @Override // p383.InterfaceC4461
                    /* renamed from: ʽᐧ */
                    public final void mo4092(Object obj9) {
                        InterfaceC2446 interfaceC2446 = (InterfaceC2446) obj9;
                        switch (i13) {
                            case 0:
                                C5110 c51104 = c5110;
                                boolean z8 = c51104.f19461;
                                interfaceC2446.getClass();
                                interfaceC2446.mo4346(c51104.f19461);
                                break;
                            case 1:
                                C5110 c51105 = c5110;
                                interfaceC2446.mo4367(c51105.f19449, c51105.f19451);
                                break;
                            case 2:
                                interfaceC2446.mo4360(c5110.f19449);
                                break;
                            case 3:
                                C5110 c51106 = c5110;
                                interfaceC2446.mo4342(c51106.f19452, c51106.f19451);
                                break;
                            case 4:
                                interfaceC2446.mo4357(c5110.f19462);
                                break;
                            case 5:
                                interfaceC2446.mo4355(c5110.m11327());
                                break;
                            case C3789.STRING_SET_FIELD_NUMBER /* 6 */:
                                interfaceC2446.mo4361(c5110.f19455);
                                break;
                            case C3789.DOUBLE_FIELD_NUMBER /* 7 */:
                                interfaceC2446.mo4362(c5110.f19460);
                                break;
                            case 8:
                                interfaceC2446.mo4344(c5110.f19460);
                                break;
                            default:
                                interfaceC2446.mo4358(c5110.f19467.f5168);
                                break;
                        }
                    }
                });
            }
        }
        C1258 c1258 = c51102.f19467;
        C1258 c12582 = c5110.f19467;
        if (c1258 != c12582) {
            AbstractC1261 abstractC1261 = this.f19536;
            C1262 c1262 = c12582.f5165;
            abstractC1261.getClass();
            abstractC1261.f5173 = c1262;
            final int i14 = 9;
            this.f19524.ﹳﹳ(2, new InterfaceC4461() { // from class: ﹶﾞ.ˋⁱ
                @Override // p383.InterfaceC4461
                /* renamed from: ʽᐧ */
                public final void mo4092(Object obj9) {
                    InterfaceC2446 interfaceC2446 = (InterfaceC2446) obj9;
                    switch (i14) {
                        case 0:
                            C5110 c51104 = c5110;
                            boolean z8 = c51104.f19461;
                            interfaceC2446.getClass();
                            interfaceC2446.mo4346(c51104.f19461);
                            break;
                        case 1:
                            C5110 c51105 = c5110;
                            interfaceC2446.mo4367(c51105.f19449, c51105.f19451);
                            break;
                        case 2:
                            interfaceC2446.mo4360(c5110.f19449);
                            break;
                        case 3:
                            C5110 c51106 = c5110;
                            interfaceC2446.mo4342(c51106.f19452, c51106.f19451);
                            break;
                        case 4:
                            interfaceC2446.mo4357(c5110.f19462);
                            break;
                        case 5:
                            interfaceC2446.mo4355(c5110.m11327());
                            break;
                        case C3789.STRING_SET_FIELD_NUMBER /* 6 */:
                            interfaceC2446.mo4361(c5110.f19455);
                            break;
                        case C3789.DOUBLE_FIELD_NUMBER /* 7 */:
                            interfaceC2446.mo4362(c5110.f19460);
                            break;
                        case 8:
                            interfaceC2446.mo4344(c5110.f19460);
                            break;
                        default:
                            interfaceC2446.mo4358(c5110.f19467.f5168);
                            break;
                    }
                }
            });
        }
        if (!zEquals2) {
            this.f19524.ﹳﹳ(14, new C4125(13, this.f19574));
        }
        if (z4) {
            final int i15 = 0;
            this.f19524.ﹳﹳ(3, new InterfaceC4461() { // from class: ﹶﾞ.ˋⁱ
                @Override // p383.InterfaceC4461
                /* renamed from: ʽᐧ */
                public final void mo4092(Object obj9) {
                    InterfaceC2446 interfaceC2446 = (InterfaceC2446) obj9;
                    switch (i15) {
                        case 0:
                            C5110 c51104 = c5110;
                            boolean z8 = c51104.f19461;
                            interfaceC2446.getClass();
                            interfaceC2446.mo4346(c51104.f19461);
                            break;
                        case 1:
                            C5110 c51105 = c5110;
                            interfaceC2446.mo4367(c51105.f19449, c51105.f19451);
                            break;
                        case 2:
                            interfaceC2446.mo4360(c5110.f19449);
                            break;
                        case 3:
                            C5110 c51106 = c5110;
                            interfaceC2446.mo4342(c51106.f19452, c51106.f19451);
                            break;
                        case 4:
                            interfaceC2446.mo4357(c5110.f19462);
                            break;
                        case 5:
                            interfaceC2446.mo4355(c5110.m11327());
                            break;
                        case C3789.STRING_SET_FIELD_NUMBER /* 6 */:
                            interfaceC2446.mo4361(c5110.f19455);
                            break;
                        case C3789.DOUBLE_FIELD_NUMBER /* 7 */:
                            interfaceC2446.mo4362(c5110.f19460);
                            break;
                        case 8:
                            interfaceC2446.mo4344(c5110.f19460);
                            break;
                        default:
                            interfaceC2446.mo4358(c5110.f19467.f5168);
                            break;
                    }
                }
            });
        }
        if (z3 || z5) {
            final int i16 = 1;
            this.f19524.ﹳﹳ(-1, new InterfaceC4461() { // from class: ﹶﾞ.ˋⁱ
                @Override // p383.InterfaceC4461
                /* renamed from: ʽᐧ */
                public final void mo4092(Object obj9) {
                    InterfaceC2446 interfaceC2446 = (InterfaceC2446) obj9;
                    switch (i16) {
                        case 0:
                            C5110 c51104 = c5110;
                            boolean z8 = c51104.f19461;
                            interfaceC2446.getClass();
                            interfaceC2446.mo4346(c51104.f19461);
                            break;
                        case 1:
                            C5110 c51105 = c5110;
                            interfaceC2446.mo4367(c51105.f19449, c51105.f19451);
                            break;
                        case 2:
                            interfaceC2446.mo4360(c5110.f19449);
                            break;
                        case 3:
                            C5110 c51106 = c5110;
                            interfaceC2446.mo4342(c51106.f19452, c51106.f19451);
                            break;
                        case 4:
                            interfaceC2446.mo4357(c5110.f19462);
                            break;
                        case 5:
                            interfaceC2446.mo4355(c5110.m11327());
                            break;
                        case C3789.STRING_SET_FIELD_NUMBER /* 6 */:
                            interfaceC2446.mo4361(c5110.f19455);
                            break;
                        case C3789.DOUBLE_FIELD_NUMBER /* 7 */:
                            interfaceC2446.mo4362(c5110.f19460);
                            break;
                        case 8:
                            interfaceC2446.mo4344(c5110.f19460);
                            break;
                        default:
                            interfaceC2446.mo4358(c5110.f19467.f5168);
                            break;
                    }
                }
            });
        }
        if (z3) {
            final int i17 = 2;
            this.f19524.ﹳﹳ(4, new InterfaceC4461() { // from class: ﹶﾞ.ˋⁱ
                @Override // p383.InterfaceC4461
                /* renamed from: ʽᐧ */
                public final void mo4092(Object obj9) {
                    InterfaceC2446 interfaceC2446 = (InterfaceC2446) obj9;
                    switch (i17) {
                        case 0:
                            C5110 c51104 = c5110;
                            boolean z8 = c51104.f19461;
                            interfaceC2446.getClass();
                            interfaceC2446.mo4346(c51104.f19461);
                            break;
                        case 1:
                            C5110 c51105 = c5110;
                            interfaceC2446.mo4367(c51105.f19449, c51105.f19451);
                            break;
                        case 2:
                            interfaceC2446.mo4360(c5110.f19449);
                            break;
                        case 3:
                            C5110 c51106 = c5110;
                            interfaceC2446.mo4342(c51106.f19452, c51106.f19451);
                            break;
                        case 4:
                            interfaceC2446.mo4357(c5110.f19462);
                            break;
                        case 5:
                            interfaceC2446.mo4355(c5110.m11327());
                            break;
                        case C3789.STRING_SET_FIELD_NUMBER /* 6 */:
                            interfaceC2446.mo4361(c5110.f19455);
                            break;
                        case C3789.DOUBLE_FIELD_NUMBER /* 7 */:
                            interfaceC2446.mo4362(c5110.f19460);
                            break;
                        case 8:
                            interfaceC2446.mo4344(c5110.f19460);
                            break;
                        default:
                            interfaceC2446.mo4358(c5110.f19467.f5168);
                            break;
                    }
                }
            });
        }
        if (z5 || c51102.f19452 != c5110.f19452) {
            final int i18 = 3;
            this.f19524.ﹳﹳ(5, new InterfaceC4461() { // from class: ﹶﾞ.ˋⁱ
                @Override // p383.InterfaceC4461
                /* renamed from: ʽᐧ */
                public final void mo4092(Object obj9) {
                    InterfaceC2446 interfaceC2446 = (InterfaceC2446) obj9;
                    switch (i18) {
                        case 0:
                            C5110 c51104 = c5110;
                            boolean z8 = c51104.f19461;
                            interfaceC2446.getClass();
                            interfaceC2446.mo4346(c51104.f19461);
                            break;
                        case 1:
                            C5110 c51105 = c5110;
                            interfaceC2446.mo4367(c51105.f19449, c51105.f19451);
                            break;
                        case 2:
                            interfaceC2446.mo4360(c5110.f19449);
                            break;
                        case 3:
                            C5110 c51106 = c5110;
                            interfaceC2446.mo4342(c51106.f19452, c51106.f19451);
                            break;
                        case 4:
                            interfaceC2446.mo4357(c5110.f19462);
                            break;
                        case 5:
                            interfaceC2446.mo4355(c5110.m11327());
                            break;
                        case C3789.STRING_SET_FIELD_NUMBER /* 6 */:
                            interfaceC2446.mo4361(c5110.f19455);
                            break;
                        case C3789.DOUBLE_FIELD_NUMBER /* 7 */:
                            interfaceC2446.mo4362(c5110.f19460);
                            break;
                        case 8:
                            interfaceC2446.mo4344(c5110.f19460);
                            break;
                        default:
                            interfaceC2446.mo4358(c5110.f19467.f5168);
                            break;
                    }
                }
            });
        }
        if (c51102.f19462 != c5110.f19462) {
            final int i19 = 4;
            this.f19524.ﹳﹳ(6, new InterfaceC4461() { // from class: ﹶﾞ.ˋⁱ
                @Override // p383.InterfaceC4461
                /* renamed from: ʽᐧ */
                public final void mo4092(Object obj9) {
                    InterfaceC2446 interfaceC2446 = (InterfaceC2446) obj9;
                    switch (i19) {
                        case 0:
                            C5110 c51104 = c5110;
                            boolean z8 = c51104.f19461;
                            interfaceC2446.getClass();
                            interfaceC2446.mo4346(c51104.f19461);
                            break;
                        case 1:
                            C5110 c51105 = c5110;
                            interfaceC2446.mo4367(c51105.f19449, c51105.f19451);
                            break;
                        case 2:
                            interfaceC2446.mo4360(c5110.f19449);
                            break;
                        case 3:
                            C5110 c51106 = c5110;
                            interfaceC2446.mo4342(c51106.f19452, c51106.f19451);
                            break;
                        case 4:
                            interfaceC2446.mo4357(c5110.f19462);
                            break;
                        case 5:
                            interfaceC2446.mo4355(c5110.m11327());
                            break;
                        case C3789.STRING_SET_FIELD_NUMBER /* 6 */:
                            interfaceC2446.mo4361(c5110.f19455);
                            break;
                        case C3789.DOUBLE_FIELD_NUMBER /* 7 */:
                            interfaceC2446.mo4362(c5110.f19460);
                            break;
                        case 8:
                            interfaceC2446.mo4344(c5110.f19460);
                            break;
                        default:
                            interfaceC2446.mo4358(c5110.f19467.f5168);
                            break;
                    }
                }
            });
        }
        if (c51102.m11327() != c5110.m11327()) {
            final int i20 = 5;
            this.f19524.ﹳﹳ(7, new InterfaceC4461() { // from class: ﹶﾞ.ˋⁱ
                @Override // p383.InterfaceC4461
                /* renamed from: ʽᐧ */
                public final void mo4092(Object obj9) {
                    InterfaceC2446 interfaceC2446 = (InterfaceC2446) obj9;
                    switch (i20) {
                        case 0:
                            C5110 c51104 = c5110;
                            boolean z8 = c51104.f19461;
                            interfaceC2446.getClass();
                            interfaceC2446.mo4346(c51104.f19461);
                            break;
                        case 1:
                            C5110 c51105 = c5110;
                            interfaceC2446.mo4367(c51105.f19449, c51105.f19451);
                            break;
                        case 2:
                            interfaceC2446.mo4360(c5110.f19449);
                            break;
                        case 3:
                            C5110 c51106 = c5110;
                            interfaceC2446.mo4342(c51106.f19452, c51106.f19451);
                            break;
                        case 4:
                            interfaceC2446.mo4357(c5110.f19462);
                            break;
                        case 5:
                            interfaceC2446.mo4355(c5110.m11327());
                            break;
                        case C3789.STRING_SET_FIELD_NUMBER /* 6 */:
                            interfaceC2446.mo4361(c5110.f19455);
                            break;
                        case C3789.DOUBLE_FIELD_NUMBER /* 7 */:
                            interfaceC2446.mo4362(c5110.f19460);
                            break;
                        case 8:
                            interfaceC2446.mo4344(c5110.f19460);
                            break;
                        default:
                            interfaceC2446.mo4358(c5110.f19467.f5168);
                            break;
                    }
                }
            });
        }
        if (!c51102.f19455.equals(c5110.f19455)) {
            final int i21 = 6;
            this.f19524.ﹳﹳ(12, new InterfaceC4461() { // from class: ﹶﾞ.ˋⁱ
                @Override // p383.InterfaceC4461
                /* renamed from: ʽᐧ */
                public final void mo4092(Object obj9) {
                    InterfaceC2446 interfaceC2446 = (InterfaceC2446) obj9;
                    switch (i21) {
                        case 0:
                            C5110 c51104 = c5110;
                            boolean z8 = c51104.f19461;
                            interfaceC2446.getClass();
                            interfaceC2446.mo4346(c51104.f19461);
                            break;
                        case 1:
                            C5110 c51105 = c5110;
                            interfaceC2446.mo4367(c51105.f19449, c51105.f19451);
                            break;
                        case 2:
                            interfaceC2446.mo4360(c5110.f19449);
                            break;
                        case 3:
                            C5110 c51106 = c5110;
                            interfaceC2446.mo4342(c51106.f19452, c51106.f19451);
                            break;
                        case 4:
                            interfaceC2446.mo4357(c5110.f19462);
                            break;
                        case 5:
                            interfaceC2446.mo4355(c5110.m11327());
                            break;
                        case C3789.STRING_SET_FIELD_NUMBER /* 6 */:
                            interfaceC2446.mo4361(c5110.f19455);
                            break;
                        case C3789.DOUBLE_FIELD_NUMBER /* 7 */:
                            interfaceC2446.mo4362(c5110.f19460);
                            break;
                        case 8:
                            interfaceC2446.mo4344(c5110.f19460);
                            break;
                        default:
                            interfaceC2446.mo4358(c5110.f19467.f5168);
                            break;
                    }
                }
            });
        }
        m11389();
        this.f19524.ˑʽ();
        if (c51102.f19458 != c5110.f19458) {
            Iterator it = this.f19546.iterator();
            while (it.hasNext()) {
                ((SurfaceHolderCallbackC5075) it.next()).f19247.m11374();
            }
        }
    }

    /* renamed from: ٴᵔ, reason: contains not printable characters */
    public final void m11381(boolean z) {
        m11358();
        int iM11295 = this.f19573.m11295(m11361(), z);
        m11370(iM11295, z, iM11295 == -1 ? 2 : 1);
    }

    /* renamed from: ᴵˋ, reason: contains not printable characters */
    public final int m11382() {
        m11358();
        if (m11356()) {
            return this.f19520.f19448.f16690;
        }
        return -1;
    }

    /* renamed from: ᴵᴵ, reason: contains not printable characters */
    public final int m11383() {
        m11358();
        if (m11356()) {
            return this.f19520.f19448.f16692;
        }
        return -1;
    }

    /* renamed from: ᵎˆ, reason: contains not printable characters */
    public final C2410 m11384() {
        AbstractC2394 abstractC2394M11369 = m11369();
        if (abstractC2394M11369.m6477()) {
            return this.f19547;
        }
        C2402 c2402 = abstractC2394M11369.mo6179(m11386(), (C2434) ((ﹳﹳ) this).ᐧⁱ, 0L).f9711;
        C2400 c2400M6498 = this.f19547.m6498();
        C2410 c2410 = c2402.f9497;
        if (c2410 != null) {
            CharSequence charSequence = c2410.f9561;
            if (charSequence != null) {
                c2400M6498.f9480 = charSequence;
            }
            CharSequence charSequence2 = c2410.f9548;
            if (charSequence2 != null) {
                c2400M6498.f9467 = charSequence2;
            }
            CharSequence charSequence3 = c2410.f9559;
            if (charSequence3 != null) {
                c2400M6498.f9478 = charSequence3;
            }
            CharSequence charSequence4 = c2410.f9568;
            if (charSequence4 != null) {
                c2400M6498.f9487 = charSequence4;
            }
            CharSequence charSequence5 = c2410.f9549;
            if (charSequence5 != null) {
                c2400M6498.f9468 = charSequence5;
            }
            byte[] bArr = c2410.f9562;
            if (bArr != null) {
                c2400M6498.f9481 = bArr == null ? null : (byte[]) bArr.clone();
                c2400M6498.f9482 = c2410.f9563;
            }
            Integer num = c2410.f9558;
            if (num != null) {
                c2400M6498.f9477 = num;
            }
            Integer num2 = c2410.f9569;
            if (num2 != null) {
                c2400M6498.f9488 = num2;
            }
            Integer num3 = c2410.f9551;
            if (num3 != null) {
                c2400M6498.f9470 = num3;
            }
            Boolean bool = c2410.f9556;
            if (bool != null) {
                c2400M6498.f9475 = bool;
            }
            Integer num4 = c2410.f9552;
            if (num4 != null) {
                c2400M6498.f9471 = num4;
            }
            Integer num5 = c2410.f9554;
            if (num5 != null) {
                c2400M6498.f9471 = num5;
            }
            Integer num6 = c2410.f9564;
            if (num6 != null) {
                c2400M6498.f9473 = num6;
            }
            Integer num7 = c2410.f9557;
            if (num7 != null) {
                c2400M6498.f9483 = num7;
            }
            Integer num8 = c2410.f9560;
            if (num8 != null) {
                c2400M6498.f9476 = num8;
            }
            Integer num9 = c2410.f9566;
            if (num9 != null) {
                c2400M6498.f9479 = num9;
            }
            Integer num10 = c2410.f9555;
            if (num10 != null) {
                c2400M6498.f9485 = num10;
            }
            CharSequence charSequence6 = c2410.f9565;
            if (charSequence6 != null) {
                c2400M6498.f9474 = charSequence6;
            }
            CharSequence charSequence7 = c2410.f9567;
            if (charSequence7 != null) {
                c2400M6498.f9484 = charSequence7;
            }
            CharSequence charSequence8 = c2410.f9550;
            if (charSequence8 != null) {
                c2400M6498.f9486 = charSequence8;
            }
            CharSequence charSequence9 = c2410.f9553;
            if (charSequence9 != null) {
                c2400M6498.f9469 = charSequence9;
            }
            CharSequence charSequence10 = c2410.f9571;
            if (charSequence10 != null) {
                c2400M6498.f9472 = charSequence10;
            }
            Integer num11 = c2410.f9570;
            if (num11 != null) {
                c2400M6498.f9489 = num11;
            }
        }
        return new C2410(c2400M6498);
    }

    /* renamed from: ᵔˋ, reason: contains not printable characters */
    public final C5108 m11385(InterfaceC5109 interfaceC5109) {
        int iM11388 = m11388(this.f19520);
        AbstractC2394 abstractC2394 = this.f19520.f19459;
        int i = iM11388 == -1 ? 0 : iM11388;
        C5076 c5076 = this.f19579;
        return new C5108(c5076, interfaceC5109, abstractC2394, i, this.f19538, c5076.f19279);
    }

    /* renamed from: ᵔᵢ, reason: contains not printable characters */
    public final int m11386() {
        m11358();
        int iM11388 = m11388(this.f19520);
        if (iM11388 == -1) {
            return 0;
        }
        return iM11388;
    }

    /* renamed from: ᵢˆ, reason: contains not printable characters */
    public final long m11387(C5110 c5110) {
        if (!c5110.f19448.m9753()) {
            return AbstractC4470.m10171(m11368(c5110));
        }
        Object obj = c5110.f19448.f16693;
        AbstractC2394 abstractC2394 = c5110.f19459;
        C2412 c2412 = this.f19545;
        abstractC2394.mo6479(obj, c2412);
        long j = c5110.f19457;
        return j == -9223372036854775807L ? AbstractC4470.m10171(abstractC2394.mo6179(m11388(c5110), (C2434) ((ﹳﹳ) this).ᐧⁱ, 0L).f9706) : AbstractC4470.m10171(c2412.f9575) + AbstractC4470.m10171(j);
    }

    /* renamed from: ᵢˎ, reason: contains not printable characters */
    public final int m11388(C5110 c5110) {
        if (c5110.f19459.m6477()) {
            return this.f19531;
        }
        return c5110.f19459.mo6479(c5110.f19448.f16693, this.f19545).f9576;
    }

    /* renamed from: ᵢᴵ, reason: contains not printable characters */
    public final void m11389() {
        int iMo6473;
        int iMo6470;
        boolean z = false;
        C2421 c2421 = this.f19544;
        int i = AbstractC4470.f17202;
        C5118 c5118 = (C5118) this.f19568;
        boolean zM11356 = c5118.m11356();
        boolean z2 = c5118.ᵎᵢ();
        AbstractC2394 abstractC2394M11369 = c5118.m11369();
        if (abstractC2394M11369.m6477()) {
            iMo6473 = -1;
        } else {
            int iM11386 = c5118.m11386();
            c5118.m11358();
            int i2 = c5118.f19530;
            if (i2 == 1) {
                i2 = 0;
            }
            c5118.m11358();
            iMo6473 = abstractC2394M11369.mo6473(iM11386, c5118.f19522, i2);
        }
        boolean z3 = iMo6473 != -1;
        AbstractC2394 abstractC2394M113692 = c5118.m11369();
        if (abstractC2394M113692.m6477()) {
            iMo6470 = -1;
        } else {
            int iM113862 = c5118.m11386();
            c5118.m11358();
            int i3 = c5118.f19530;
            if (i3 == 1) {
                i3 = 0;
            }
            c5118.m11358();
            iMo6470 = abstractC2394M113692.mo6470(iM113862, c5118.f19522, i3);
        }
        boolean z4 = iMo6470 != -1;
        boolean z5 = c5118.ـᵎ();
        boolean z6 = c5118.ٴﹶ();
        boolean zM6477 = c5118.m11369().m6477();
        ˋˉ r10 = new ˋˉ(0);
        C2414 c2414 = this.f19540.f9634;
        C2428 c2428 = (C2428) r10.ˆʿ;
        c2428.getClass();
        for (int i4 = 0; i4 < c2414.f9586.size(); i4++) {
            c2428.m6528(c2414.m6508(i4));
        }
        boolean z7 = !zM11356;
        r10.ˈٴ(4, z7);
        r10.ˈٴ(5, z2 && !zM11356);
        r10.ˈٴ(6, z3 && !zM11356);
        r10.ˈٴ(7, !zM6477 && (z3 || !z5 || z2) && !zM11356);
        r10.ˈٴ(8, z4 && !zM11356);
        r10.ˈٴ(9, !zM6477 && (z4 || (z5 && z6)) && !zM11356);
        r10.ˈٴ(10, z7);
        r10.ˈٴ(11, z2 && !zM11356);
        if (z2 && !zM11356) {
            z = true;
        }
        r10.ˈٴ(12, z);
        C2421 c24212 = new C2421(c2428.m6531());
        this.f19544 = c24212;
        if (c24212.equals(c2421)) {
            return;
        }
        this.f19524.ﹳﹳ(13, new C5093(this));
    }

    /* renamed from: ᵢⁱ, reason: contains not printable characters */
    public final void m11390(SurfaceHolder surfaceHolder) {
        this.f19543 = false;
        this.f19529 = surfaceHolder;
        surfaceHolder.addCallback(this.f19559);
        Surface surface = this.f19529.getSurface();
        if (surface == null || !surface.isValid()) {
            m11364(0, 0);
        } else {
            Rect surfaceFrame = this.f19529.getSurfaceFrame();
            m11364(surfaceFrame.width(), surfaceFrame.height());
        }
    }

    /* renamed from: ᵢﹶ, reason: contains not printable characters */
    public final long m11391() {
        m11358();
        if (this.f19520.f19459.m6477()) {
            return this.f19537;
        }
        C5110 c5110 = this.f19520;
        long j = 0;
        if (c5110.f19454.f16694 != c5110.f19448.f16694) {
            return AbstractC4470.m10171(c5110.f19459.mo6179(m11386(), (C2434) ((ﹳﹳ) this).ᐧⁱ, 0L).f9707);
        }
        long j2 = c5110.f19464;
        if (this.f19520.f19454.m9753()) {
            C5110 c51102 = this.f19520;
            c51102.f19459.mo6479(c51102.f19454.f16693, this.f19545).m6506(this.f19520.f19454.f16690);
        } else {
            j = j2;
        }
        C5110 c51103 = this.f19520;
        AbstractC2394 abstractC2394 = c51103.f19459;
        Object obj = c51103.f19454.f16693;
        C2412 c2412 = this.f19545;
        abstractC2394.mo6479(obj, c2412);
        return AbstractC4470.m10171(j + c2412.f9575);
    }

    /* renamed from: ⁱˏ, reason: contains not printable characters */
    public final void m11392(C2409 c2409) {
        m11358();
        AbstractC1261 abstractC1261 = this.f19536;
        abstractC1261.getClass();
        C1255 c1255 = (C1255) abstractC1261;
        if (c2409.equals(c1255.m4484())) {
            return;
        }
        if (c2409 instanceof C1245) {
            c1255.m4482((C1245) c2409);
        }
        C1240 c1240 = new C1240(c1255.m4484());
        c1240.m6495(c2409);
        c1255.m4482(new C1245(c1240));
        this.f19524.ᐧʻ(19, new C4125(15, c2409));
    }

    /* renamed from: ﹳ, reason: contains not printable characters */
    public final void m11393() {
        m11358();
        boolean zM11362 = m11362();
        int iM11295 = this.f19573.m11295(2, zM11362);
        m11370(iM11295, zM11362, iM11295 == -1 ? 2 : 1);
        C5110 c5110 = this.f19520;
        if (c5110.f19449 != 1) {
            return;
        }
        C5110 c5110M11325 = c5110.m11325(null);
        C5110 c5110M11332 = c5110M11325.m11332(c5110M11325.f19459.m6477() ? 4 : 2);
        this.f19551++;
        C4469 c4469 = this.f19579.f19262;
        c4469.getClass();
        C4463 c4463M10156 = C4469.m10156();
        c4463M10156.f17178 = c4469.f17191.obtainMessage(29);
        c4463M10156.m10121();
        m11380(c5110M11332, 1, false, 5, -9223372036854775807L, -1, false);
    }

    /* renamed from: ﹶʾ, reason: contains not printable characters */
    public final void m11394() {
        m11358();
        m11363();
        m11395(null);
        m11364(0, 0);
    }

    /* renamed from: ﾞי, reason: contains not printable characters */
    public final void m11395(Object obj) {
        ArrayList arrayList = new ArrayList();
        boolean z = false;
        for (AbstractC5115 abstractC5115 : this.f19575) {
            if (abstractC5115.f19476 == 2) {
                C5108 c5108M11385 = m11385(abstractC5115);
                AbstractC4464.m10132(!c5108M11385.f19444);
                c5108M11385.f19445 = 1;
                AbstractC4464.m10132(true ^ c5108M11385.f19444);
                c5108M11385.f19439 = obj;
                c5108M11385.m11321();
                arrayList.add(c5108M11385);
            }
        }
        Object obj2 = this.f19535;
        if (obj2 != null && obj2 != obj) {
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((C5108) it.next()).m11322(this.f19519);
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (TimeoutException unused2) {
                z = true;
            }
            Object obj3 = this.f19535;
            Surface surface = this.f19525;
            if (obj3 == surface) {
                surface.release();
                this.f19525 = null;
            }
        }
        this.f19535 = obj;
        if (z) {
            m11357(new ExoPlaybackException(2, new ExoTimeoutException("Detaching surface timed out."), 1003));
        }
    }
}
