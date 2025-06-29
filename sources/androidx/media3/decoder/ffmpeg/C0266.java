package androidx.media3.decoder.ffmpeg;

import android.os.Handler;
import android.os.SystemClock;
import android.os.Trace;
import androidx.media3.decoder.DecoderException;
import androidx.media3.decoder.SimpleDecoderOutputBuffer;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.audio.AudioSink$ConfigurationException;
import androidx.media3.exoplayer.audio.AudioSink$InitializationException;
import androidx.media3.exoplayer.audio.AudioSink$WriteException;
import com.google.android.gms.internal.measurement.C0559;
import p033.C1215;
import p166.AbstractC2435;
import p166.C2397;
import p166.C2417;
import p166.C2423;
import p166.C2431;
import p166.C2441;
import p312.AbstractC3587;
import p312.C3589;
import p312.InterfaceC3585;
import p337.AbstractC3841;
import p337.InterfaceC3822;
import p337.InterfaceC3840;
import p337.RunnableC3819;
import p345.AbstractC3980;
import p383.AbstractC4464;
import p383.AbstractC4470;
import p383.C4460;
import p385.InterfaceC4493;
import p438.AbstractC5115;
import p438.C5074;
import p438.C5081;
import p438.C5099;
import p438.InterfaceC5111;
import p456.C5349;
import ʻˉ.ᐧˋ;
import ˊﹶ.ˋˉ;
import ᵎﹳ.ᐧʻ;

/* renamed from: androidx.media3.decoder.ffmpeg.ˑʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0266 extends AbstractC5115 implements InterfaceC5111 {

    /* renamed from: ʻʿ, reason: contains not printable characters */
    public final C0559 f1357;

    /* renamed from: ʻﹳ, reason: contains not printable characters */
    public InterfaceC4493 f1358;

    /* renamed from: ʽˆ, reason: contains not printable characters */
    public boolean f1359;

    /* renamed from: ʿˊ, reason: contains not printable characters */
    public boolean f1360;

    /* renamed from: ˈﹳ, reason: contains not printable characters */
    public int f1361;

    /* renamed from: ˉᵎ, reason: contains not printable characters */
    public InterfaceC3585 f1362;

    /* renamed from: ˊᵔ, reason: contains not printable characters */
    public C2431 f1363;

    /* renamed from: ˋﾞ, reason: contains not printable characters */
    public int f1364;

    /* renamed from: ˎˉ, reason: contains not printable characters */
    public SimpleDecoderOutputBuffer f1365;

    /* renamed from: ˎᵢ, reason: contains not printable characters */
    public long f1366;

    /* renamed from: ˑʾ, reason: contains not printable characters */
    public final long[] f1367;

    /* renamed from: יˋ, reason: contains not printable characters */
    public InterfaceC4493 f1368;

    /* renamed from: ـᵎ, reason: contains not printable characters */
    public boolean f1369;

    /* renamed from: ٴᐧ, reason: contains not printable characters */
    public boolean f1370;

    /* renamed from: ٴﹶ, reason: contains not printable characters */
    public long f1371;

    /* renamed from: ᵎʽ, reason: contains not printable characters */
    public int f1372;

    /* renamed from: ᵎʾ, reason: contains not printable characters */
    public boolean f1373;

    /* renamed from: ᵎᵢ, reason: contains not printable characters */
    public boolean f1374;

    /* renamed from: ᵔ, reason: contains not printable characters */
    public final C3589 f1375;

    /* renamed from: ᵔٴ, reason: contains not printable characters */
    public final InterfaceC3840 f1376;

    /* renamed from: ⁱʿ, reason: contains not printable characters */
    public C3589 f1377;

    /* renamed from: ⁱⁱ, reason: contains not printable characters */
    public int f1378;

    /* renamed from: ﾞˎ, reason: contains not printable characters */
    public C5074 f1379;

    /* renamed from: ﾞﾞ, reason: contains not printable characters */
    public boolean f1380;

    public C0266(Handler handler, InterfaceC3822 interfaceC3822, InterfaceC3840 interfaceC3840) {
        super(1);
        this.f1357 = new C0559(handler, interfaceC3822);
        this.f1376 = interfaceC3840;
        interfaceC3840.mo9009(new ˋˉ(24, this));
        this.f1375 = new C3589(0, 0);
        this.f1361 = 0;
        this.f1370 = true;
        m1120(-9223372036854775807L);
        this.f1367 = new long[10];
    }

    @Override // p438.InterfaceC5111
    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final void mo1113(C2441 c2441) {
        this.f1376.mo8992(c2441);
    }

    @Override // p438.InterfaceC5111
    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final C2441 mo1114() {
        return this.f1376.mo8993();
    }

    @Override // p438.AbstractC5115
    /* renamed from: ʿˏ, reason: contains not printable characters */
    public final void mo1115(C2431[] c2431Arr, long j, long j2) {
        this.f1360 = false;
        if (this.f1366 == -9223372036854775807L) {
            m1120(j2);
            return;
        }
        int i = this.f1378;
        long[] jArr = this.f1367;
        if (i == jArr.length) {
            AbstractC4464.m10144("DecoderAudioRenderer", "Too many stream changes, so dropping offset: " + jArr[this.f1378 - 1]);
        } else {
            this.f1378 = i + 1;
        }
        jArr[this.f1378 - 1] = j2;
    }

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final InterfaceC3585 m1116(C2431 c2431) {
        Trace.beginSection("createFfmpegAudioDecoder");
        int i = c2431.f9683;
        if (i == -1) {
            i = 5760;
        }
        int i2 = c2431.f9662;
        int i3 = c2431.f9681;
        C2431 c2431M10168 = AbstractC4470.m10168(2, i2, i3);
        InterfaceC3840 interfaceC3840 = this.f1376;
        FfmpegAudioDecoder ffmpegAudioDecoder = new FfmpegAudioDecoder(i, c2431, interfaceC3840.mo9007(c2431M10168) ? interfaceC3840.mo9008(AbstractC4470.m10168(4, i2, i3)) != 2 ? false : true ^ "audio/ac3".equals(c2431.f9667) : true);
        Trace.endSection();
        return ffmpegAudioDecoder;
    }

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final void m1117() throws ExoPlaybackException {
        C0559 c0559 = this.f1357;
        if (this.f1362 != null) {
            return;
        }
        InterfaceC4493 interfaceC4493 = this.f1358;
        ᐧʻ.יʻ(this.f1368, interfaceC4493);
        this.f1368 = interfaceC4493;
        if (interfaceC4493 != null && interfaceC4493.mo10249() == null && this.f1368.mo10248() == null) {
            return;
        }
        try {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            Trace.beginSection("createAudioDecoder");
            InterfaceC3585 interfaceC3585M1116 = m1116(this.f1363);
            this.f1362 = interfaceC3585M1116;
            ((AbstractC3587) interfaceC3585M1116).mo6381(this.f19475);
            Trace.endSection();
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            String strM1105 = ((FfmpegAudioDecoder) this.f1362).m1105();
            long j = jElapsedRealtime2 - jElapsedRealtime;
            Handler handler = (Handler) c0559.f2912;
            if (handler != null) {
                handler.post(new RunnableC3819(c0559, strM1105, jElapsedRealtime2, j));
            }
            this.f1379.f19242++;
        } catch (DecoderException e) {
            AbstractC4464.m10147("DecoderAudioRenderer", "Audio codec error", e);
            Handler handler2 = (Handler) c0559.f2912;
            if (handler2 != null) {
                handler2.post(new RunnableC3819(c0559, e, 3));
            }
            throw m11339(e, this.f1363, false, 4001);
        } catch (OutOfMemoryError e2) {
            throw m11339(e2, this.f1363, false, 4001);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0049  */
    @Override // p438.AbstractC5115
    /* renamed from: ˈٴ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int mo1118(p166.C2431 r8) {
        /*
            r7 = this;
            java.lang.String r0 = r8.f9667
            boolean r0 = p166.AbstractC2435.m6550(r0)
            r1 = 0
            if (r0 != 0) goto Le
            int r8 = ᵎﹳ.ᐧʻ.ˑʽ(r1, r1, r1, r1)
            return r8
        Le:
            java.lang.String r0 = r8.f9667
            r0.getClass()
            boolean r2 = androidx.media3.decoder.ffmpeg.FfmpegLibrary.m1112()
            r3 = 2
            if (r2 == 0) goto L4b
            boolean r2 = p166.AbstractC2435.m6550(r0)
            if (r2 != 0) goto L21
            goto L4b
        L21:
            boolean r0 = androidx.media3.decoder.ffmpeg.FfmpegLibrary.m1109(r0)
            if (r0 == 0) goto L49
            int r0 = r8.f9662
            int r2 = r8.f9681
            ˊﹶ.ᵎـ r4 = p383.AbstractC4470.m10168(r3, r0, r2)
            ᵎˆ.ᴵʿ r5 = r7.f1376
            boolean r4 = r5.mo9007(r4)
            r6 = 4
            if (r4 != 0) goto L43
            ˊﹶ.ᵎـ r0 = p383.AbstractC4470.m10168(r6, r0, r2)
            boolean r0 = r5.mo9007(r0)
            if (r0 != 0) goto L43
            goto L49
        L43:
            int r8 = r8.f9676
            if (r8 == 0) goto L4c
            r6 = 2
            goto L4c
        L49:
            r6 = 1
            goto L4c
        L4b:
            r6 = 0
        L4c:
            if (r6 > r3) goto L53
            int r8 = ᵎﹳ.ᐧʻ.ˑʽ(r6, r1, r1, r1)
            return r8
        L53:
            int r8 = p383.AbstractC4470.f17202
            r0 = 21
            if (r8 < r0) goto L5b
            r1 = 32
        L5b:
            r8 = r6 | 8
            r8 = r8 | r1
            r8 = r8 | 128(0x80, float:1.8E-43)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.decoder.ffmpeg.C0266.mo1118(ˊﹶ.ᵎـ):int");
    }

    @Override // p438.AbstractC5115
    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public final boolean mo1119() {
        return this.f1376.mo8996() || (this.f1363 != null && (m11337() || this.f1365 != null));
    }

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public final void m1120(long j) {
        this.f1366 = j;
        if (j != -9223372036854775807L) {
            this.f1376.getClass();
        }
    }

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final boolean m1121() throws ExoPlaybackException, InterruptedException {
        if (this.f1365 == null) {
            SimpleDecoderOutputBuffer simpleDecoderOutputBuffer = (SimpleDecoderOutputBuffer) ((AbstractC3587) this.f1362).mo6378();
            this.f1365 = simpleDecoderOutputBuffer;
            if (simpleDecoderOutputBuffer == null) {
                return false;
            }
            int i = simpleDecoderOutputBuffer.f13785;
            if (i > 0) {
                this.f1379.f19243 += i;
                this.f1376.mo9015();
            }
            if (this.f1365.m4401(134217728)) {
                this.f1376.mo9015();
                if (this.f1378 != 0) {
                    long[] jArr = this.f1367;
                    m1120(jArr[0]);
                    int i2 = this.f1378 - 1;
                    this.f1378 = i2;
                    System.arraycopy(jArr, 1, jArr, 0, i2);
                }
            }
        }
        if (this.f1365.m4401(4)) {
            if (this.f1361 == 2) {
                m1136();
                m1117();
                this.f1370 = true;
            } else {
                this.f1365.mo1101();
                this.f1365 = null;
                try {
                    this.f1373 = true;
                    this.f1376.mo8995();
                } catch (AudioSink$WriteException e) {
                    throw m11339(e, e.f1414, e.f1413, 5002);
                }
            }
            return false;
        }
        if (this.f1370) {
            FfmpegAudioDecoder ffmpegAudioDecoder = (FfmpegAudioDecoder) this.f1362;
            ffmpegAudioDecoder.getClass();
            C2417 c2417 = new C2417();
            c2417.f9602 = AbstractC2435.m6559("audio/raw");
            c2417.f9624 = ffmpegAudioDecoder.f1345;
            c2417.f9600 = ffmpegAudioDecoder.f1346;
            c2417.f9618 = ffmpegAudioDecoder.f1351;
            C2417 c2417M6541 = new C2431(c2417).m6541();
            c2417M6541.f9598 = this.f1364;
            c2417M6541.f9606 = this.f1372;
            C2431 c2431 = this.f1363;
            c2417M6541.f9601 = c2431.f9670;
            c2417M6541.f9614 = c2431.f9677;
            c2417M6541.f9595 = c2431.f9657;
            c2417M6541.f9611 = AbstractC3980.m9209(c2431.f9673);
            C2431 c24312 = this.f1363;
            c2417M6541.f9625 = c24312.f9689;
            c2417M6541.f9596 = c24312.f9658;
            c2417M6541.f9615 = c24312.f9678;
            this.f1376.mo8998(new C2431(c2417M6541), null);
            this.f1370 = false;
        }
        InterfaceC3840 interfaceC3840 = this.f1376;
        SimpleDecoderOutputBuffer simpleDecoderOutputBuffer2 = this.f1365;
        if (!interfaceC3840.mo8999(simpleDecoderOutputBuffer2.f1344, simpleDecoderOutputBuffer2.f13784, 1)) {
            return false;
        }
        this.f1379.f19236++;
        this.f1365.mo1101();
        this.f1365 = null;
        return true;
    }

    @Override // p438.AbstractC5115
    /* renamed from: ˏʾ, reason: contains not printable characters */
    public final boolean mo1122() {
        return this.f1373 && this.f1376.mo9003();
    }

    @Override // p438.AbstractC5115
    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public final void mo1123(boolean z, boolean z2) {
        C5074 c5074 = new C5074();
        this.f1379 = c5074;
        C0559 c0559 = this.f1357;
        Handler handler = (Handler) c0559.f2912;
        if (handler != null) {
            handler.post(new RunnableC3819(c0559, c5074, 0));
        }
        C5081 c5081 = this.f19484;
        c5081.getClass();
        boolean z3 = c5081.f19307;
        InterfaceC3840 interfaceC3840 = this.f1376;
        if (z3) {
            interfaceC3840.mo9002();
        } else {
            interfaceC3840.mo9012();
        }
        C1215 c1215 = this.f19488;
        c1215.getClass();
        interfaceC3840.mo8994(c1215);
        C4460 c4460 = this.f19490;
        c4460.getClass();
        interfaceC3840.mo9001(c4460);
    }

    @Override // p438.AbstractC5115
    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final InterfaceC5111 mo1124() {
        return this;
    }

    @Override // p438.AbstractC5115, p438.InterfaceC5109
    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final void mo1125(int i, Object obj) {
        InterfaceC3840 interfaceC3840 = this.f1376;
        if (i == 2) {
            interfaceC3840.mo9005(((Float) obj).floatValue());
            return;
        }
        if (i == 3) {
            interfaceC3840.mo9000((C2397) obj);
            return;
        }
        if (i == 6) {
            interfaceC3840.mo8997((C2423) obj);
            return;
        }
        if (i == 12) {
            if (AbstractC4470.f17202 >= 23) {
                AbstractC3841.m9017(interfaceC3840, obj);
            }
        } else if (i == 9) {
            interfaceC3840.mo9016(((Boolean) obj).booleanValue());
        } else {
            if (i != 10) {
                return;
            }
            interfaceC3840.mo9004(((Integer) obj).intValue());
        }
    }

    @Override // p438.AbstractC5115
    /* renamed from: ˑי, reason: contains not printable characters */
    public final void mo1126(boolean z, long j) throws ExoPlaybackException, InterruptedException {
        this.f1376.flush();
        this.f1371 = j;
        this.f1380 = false;
        this.f1369 = true;
        this.f1374 = false;
        this.f1373 = false;
        if (this.f1362 != null) {
            if (this.f1361 != 0) {
                m1136();
                m1117();
                return;
            }
            this.f1377 = null;
            SimpleDecoderOutputBuffer simpleDecoderOutputBuffer = this.f1365;
            if (simpleDecoderOutputBuffer != null) {
                simpleDecoderOutputBuffer.mo1101();
                this.f1365 = null;
            }
            InterfaceC3585 interfaceC3585 = this.f1362;
            interfaceC3585.getClass();
            AbstractC3587 abstractC3587 = (AbstractC3587) interfaceC3585;
            abstractC3587.flush();
            abstractC3587.mo6381(this.f19475);
            this.f1359 = false;
        }
    }

    /* renamed from: ـˆ, reason: contains not printable characters */
    public final void m1127() {
        long jMo9010 = this.f1376.mo9010(mo1122());
        if (jMo9010 != Long.MIN_VALUE) {
            if (!this.f1369) {
                jMo9010 = Math.max(this.f1371, jMo9010);
            }
            this.f1371 = jMo9010;
            this.f1369 = false;
        }
    }

    @Override // p438.InterfaceC5111
    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final boolean mo1128() {
        boolean z = this.f1380;
        this.f1380 = false;
        return z;
    }

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final boolean m1129() throws ExoPlaybackException, InterruptedException {
        InterfaceC3585 interfaceC3585 = this.f1362;
        if (interfaceC3585 == null || this.f1361 == 2 || this.f1374) {
            return false;
        }
        if (this.f1377 == null) {
            C3589 c3589 = (C3589) ((AbstractC3587) interfaceC3585).mo6382();
            this.f1377 = c3589;
            if (c3589 == null) {
                return false;
            }
        }
        if (this.f1361 == 1) {
            C3589 c35892 = this.f1377;
            c35892.f5033 = 4;
            AbstractC3587 abstractC3587 = (AbstractC3587) this.f1362;
            abstractC3587.getClass();
            abstractC3587.mo6384(c35892);
            this.f1377 = null;
            this.f1361 = 2;
            return false;
        }
        C5349 c5349 = this.f19479;
        c5349.m12099();
        int iM11336 = m11336(c5349, this.f1377, 0);
        if (iM11336 == -5) {
            m1133(c5349);
            return true;
        }
        if (iM11336 != -4) {
            if (iM11336 == -3) {
                return false;
            }
            throw new IllegalStateException();
        }
        if (this.f1377.m4401(4)) {
            this.f1374 = true;
            InterfaceC3585 interfaceC35852 = this.f1362;
            C3589 c35893 = this.f1377;
            AbstractC3587 abstractC35872 = (AbstractC3587) interfaceC35852;
            abstractC35872.getClass();
            abstractC35872.mo6384(c35893);
            this.f1377 = null;
            return false;
        }
        if (!this.f1360) {
            this.f1360 = true;
            this.f1377.m4409(134217728);
        }
        this.f1377.m8494();
        C3589 c35894 = this.f1377;
        c35894.f13802 = this.f1363;
        AbstractC3587 abstractC35873 = (AbstractC3587) this.f1362;
        abstractC35873.getClass();
        abstractC35873.mo6384(c35894);
        this.f1359 = true;
        this.f1379.f19241++;
        this.f1377 = null;
        return true;
    }

    @Override // p438.AbstractC5115
    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final int mo1130() {
        return 8;
    }

    @Override // p438.AbstractC5115
    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public final void mo1131() {
        C0559 c0559 = this.f1357;
        this.f1363 = null;
        this.f1370 = true;
        m1120(-9223372036854775807L);
        this.f1380 = false;
        try {
            ᐧʻ.יʻ(this.f1358, (InterfaceC4493) null);
            this.f1358 = null;
            m1136();
            this.f1376.mo9006();
        } finally {
            c0559.m2491(this.f1379);
        }
    }

    @Override // p438.AbstractC5115
    /* renamed from: ᵎˏ, reason: contains not printable characters */
    public final void mo1132() {
        this.f1376.mo9011();
    }

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final void m1133(C5349 c5349) throws ExoPlaybackException, InterruptedException {
        C2431 c2431 = (C2431) c5349.f20757;
        c2431.getClass();
        InterfaceC4493 interfaceC4493 = (InterfaceC4493) c5349.f20756;
        ᐧʻ.יʻ(this.f1358, interfaceC4493);
        this.f1358 = interfaceC4493;
        C2431 c24312 = this.f1363;
        this.f1363 = c2431;
        this.f1364 = c2431.f9668;
        this.f1372 = c2431.f9680;
        InterfaceC3585 interfaceC3585 = this.f1362;
        C0559 c0559 = this.f1357;
        if (interfaceC3585 == null) {
            m1117();
            C2431 c24313 = this.f1363;
            Handler handler = (Handler) c0559.f2912;
            if (handler != null) {
                handler.post(new ᐧˋ(c0559, c24313, (Object) null, 19));
                return;
            }
            return;
        }
        C5099 c5099 = interfaceC4493 != this.f1368 ? new C5099(((FfmpegAudioDecoder) interfaceC3585).m1105(), c24312, c2431, 0, 128) : new C5099(((FfmpegAudioDecoder) interfaceC3585).m1105(), c24312, c2431, 0, 1);
        if (c5099.f19406 == 0) {
            if (this.f1359) {
                this.f1361 = 1;
            } else {
                m1136();
                m1117();
                this.f1370 = true;
            }
        }
        C2431 c24314 = this.f1363;
        Handler handler2 = (Handler) c0559.f2912;
        if (handler2 != null) {
            handler2.post(new ᐧˋ(c0559, c24314, c5099, 19));
        }
    }

    @Override // p438.AbstractC5115
    /* renamed from: ﹳˎ, reason: contains not printable characters */
    public final void mo1134() {
        m1127();
        this.f1376.mo9013();
    }

    @Override // p438.InterfaceC5111
    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final long mo1135() {
        if (this.f19478 == 2) {
            m1127();
        }
        return this.f1371;
    }

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public final void m1136() throws InterruptedException {
        this.f1377 = null;
        this.f1365 = null;
        this.f1361 = 0;
        this.f1359 = false;
        InterfaceC3585 interfaceC3585 = this.f1362;
        if (interfaceC3585 != null) {
            this.f1379.f19235++;
            ((FfmpegAudioDecoder) interfaceC3585).mo1102();
            String strM1105 = ((FfmpegAudioDecoder) this.f1362).m1105();
            C0559 c0559 = this.f1357;
            Handler handler = (Handler) c0559.f2912;
            if (handler != null) {
                handler.post(new RunnableC3819(c0559, strM1105, 6));
            }
            this.f1362 = null;
        }
        ᐧʻ.יʻ(this.f1368, (InterfaceC4493) null);
        this.f1368 = null;
    }

    @Override // p438.AbstractC5115
    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final String mo1137() {
        return "FfmpegAudioRenderer";
    }

    @Override // p438.AbstractC5115
    /* renamed from: ﾞˊ, reason: contains not printable characters */
    public final void mo1138(long j, long j2) throws ExoPlaybackException, InterruptedException {
        if (this.f1373) {
            try {
                this.f1376.mo8995();
                return;
            } catch (AudioSink$WriteException e) {
                throw m11339(e, e.f1414, e.f1413, 5002);
            }
        }
        if (this.f1363 == null) {
            C5349 c5349 = this.f19479;
            c5349.m12099();
            this.f1375.mo8492();
            int iM11336 = m11336(c5349, this.f1375, 2);
            if (iM11336 != -5) {
                if (iM11336 == -4) {
                    AbstractC4464.m10132(this.f1375.m4401(4));
                    this.f1374 = true;
                    try {
                        this.f1373 = true;
                        this.f1376.mo8995();
                        return;
                    } catch (AudioSink$WriteException e2) {
                        throw m11339(e2, null, false, 5002);
                    }
                }
                return;
            }
            m1133(c5349);
        }
        m1117();
        if (this.f1362 != null) {
            try {
                Trace.beginSection("drainAndFeed");
                while (m1121()) {
                }
                while (m1129()) {
                }
                Trace.endSection();
                synchronized (this.f1379) {
                }
            } catch (DecoderException e3) {
                AbstractC4464.m10147("DecoderAudioRenderer", "Audio codec error", e3);
                C0559 c0559 = this.f1357;
                Handler handler = (Handler) c0559.f2912;
                if (handler != null) {
                    handler.post(new RunnableC3819(c0559, e3, 3));
                }
                throw m11339(e3, this.f1363, false, 4003);
            } catch (AudioSink$ConfigurationException e4) {
                throw m11339(e4, e4.f1409, false, 5001);
            } catch (AudioSink$InitializationException e5) {
                throw m11339(e5, e5.f1411, e5.f1410, 5001);
            } catch (AudioSink$WriteException e6) {
                throw m11339(e6, e6.f1414, e6.f1413, 5002);
            }
        }
    }
}
