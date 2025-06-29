package p337;

import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioDeviceInfo;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.lifecycle.RunnableC0246;
import androidx.media3.exoplayer.audio.AudioSink$WriteException;
import com.google.android.gms.internal.measurement.C0372;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import p007.C0937;
import p009.C0996;
import p015.C1067;
import p033.C1215;
import p056.C1333;
import p056.C1336;
import p056.C1337;
import p056.C1338;
import p056.InterfaceC1335;
import p061.C1403;
import p166.C2397;
import p166.C2423;
import p166.C2431;
import p166.C2441;
import p192.ThreadFactoryC2667;
import p193.C2705;
import p220.AbstractC2850;
import p260.C3222;
import p331.C3767;
import p345.AbstractC3980;
import p345.C3928;
import p345.C3932;
import p383.AbstractC4464;
import p383.AbstractC4470;
import p383.C4460;
import ʻˉ.ᐧˋ;
import ˊﹶ.ˋˉ;
import ˏᵢ.ᵢٴ;

/* renamed from: ᵎˆ.ﹳﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3847 implements InterfaceC3840 {

    /* renamed from: ˎᵢ, reason: contains not printable characters */
    public static final Object f14795 = new Object();

    /* renamed from: ˑʾ, reason: contains not printable characters */
    public static ExecutorService f14796;

    /* renamed from: ⁱⁱ, reason: contains not printable characters */
    public static int f14797;

    /* renamed from: ʻʿ, reason: contains not printable characters */
    public ByteBuffer f14798;

    /* renamed from: ʻﹳ, reason: contains not printable characters */
    public long f14799;

    /* renamed from: ʽˆ, reason: contains not printable characters */
    public boolean f14800;

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final C3222 f14801;

    /* renamed from: ʾʼ, reason: contains not printable characters */
    public boolean f14802;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final C3830 f14803;

    /* renamed from: ʿˊ, reason: contains not printable characters */
    public boolean f14804;

    /* renamed from: ʿˏ, reason: contains not printable characters */
    public C3817 f14805;

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public C3838 f14806;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public ByteBuffer f14807;

    /* renamed from: ˈٴ, reason: contains not printable characters */
    public C2397 f14808;

    /* renamed from: ˈﹳ, reason: contains not printable characters */
    public long f14809;

    /* renamed from: ˉי, reason: contains not printable characters */
    public final ArrayDeque f14810;

    /* renamed from: ˉᵎ, reason: contains not printable characters */
    public int f14811;

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public final int f14812;

    /* renamed from: ˊᵔ, reason: contains not printable characters */
    public boolean f14813;

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public long f14814;

    /* renamed from: ˋˊ, reason: contains not printable characters */
    public C1336 f14815;

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public C3843 f14816;

    /* renamed from: ˋﾞ, reason: contains not printable characters */
    public boolean f14817;

    /* renamed from: ˎˉ, reason: contains not printable characters */
    public C3818 f14818;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public C2441 f14819;

    /* renamed from: ˎٴ, reason: contains not printable characters */
    public C1215 f14820;

    /* renamed from: ˎᵔ, reason: contains not printable characters */
    public ByteBuffer f14821;

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public final boolean f14822;

    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public final C1403 f14823;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final C2705 f14824;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final boolean f14825;

    /* renamed from: ˑי, reason: contains not printable characters */
    public final C3820 f14826;

    /* renamed from: ˑⁱ, reason: contains not printable characters */
    public long f14827;

    /* renamed from: ˑﾞ, reason: contains not printable characters */
    public boolean f14828;

    /* renamed from: יʻ, reason: contains not printable characters */
    public C0372 f14829;

    /* renamed from: יˋ, reason: contains not printable characters */
    public boolean f14830;

    /* renamed from: ـˆ, reason: contains not printable characters */
    public long f14831;

    /* renamed from: ـᵎ, reason: contains not printable characters */
    public long f14832;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final Context f14833;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final C3932 f14834;

    /* renamed from: ٴᐧ, reason: contains not printable characters */
    public boolean f14835;

    /* renamed from: ٴﹶ, reason: contains not printable characters */
    public Looper f14836;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final C3932 f14837;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public boolean f14838;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public C3838 f14839;

    /* renamed from: ᴵʼ, reason: contains not printable characters */
    public long f14840;

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public final C1403 f14841;

    /* renamed from: ᵎʽ, reason: contains not printable characters */
    public boolean f14842;

    /* renamed from: ᵎʾ, reason: contains not printable characters */
    public Handler f14843;

    /* renamed from: ᵎˏ, reason: contains not printable characters */
    public ˋˉ f14844;

    /* renamed from: ᵎـ, reason: contains not printable characters */
    public final C3767 f14845;

    /* renamed from: ᵎᵢ, reason: contains not printable characters */
    public long f14846;

    /* renamed from: ᵔ, reason: contains not printable characters */
    public int f14847;

    /* renamed from: ᵔٴ, reason: contains not printable characters */
    public byte[] f14848;

    /* renamed from: ᵔﹳ, reason: contains not printable characters */
    public int f14849;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public int f14850;

    /* renamed from: ᵢٴ, reason: contains not printable characters */
    public float f14851;

    /* renamed from: ⁱʿ, reason: contains not printable characters */
    public C2423 f14852;

    /* renamed from: ﹳˎ, reason: contains not printable characters */
    public C3817 f14853;

    /* renamed from: ﹳˑ, reason: contains not printable characters */
    public C3823 f14854;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final C3824 f14855;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public long f14856;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final C3842 f14857;

    /* renamed from: ﾞʽ, reason: contains not printable characters */
    public C3835 f14858;

    /* renamed from: ﾞˊ, reason: contains not printable characters */
    public AudioTrack f14859;

    /* renamed from: ﾞˎ, reason: contains not printable characters */
    public boolean f14860;

    /* renamed from: ﾞᐧ, reason: contains not printable characters */
    public int f14861;

    public C3847(C0937 c0937) {
        C3835 c3835M8980;
        Context context = (Context) c0937.f4128;
        this.f14833 = context;
        C2397 c2397 = C2397.f9462;
        this.f14808 = c2397;
        if (context != null) {
            C3835 c3835 = C3835.f14733;
            int i = AbstractC4470.f17202;
            c3835M8980 = C3835.m8980(context, c2397, null);
        } else {
            c3835M8980 = (C3835) c0937.f4126;
        }
        this.f14858 = c3835M8980;
        this.f14801 = (C3222) c0937.f4127;
        int i2 = AbstractC4470.f17202;
        this.f14825 = false;
        this.f14822 = false;
        this.f14812 = 0;
        this.f14826 = (C3820) c0937.f4125;
        C3767 c3767 = (C3767) c0937.f4129;
        c3767.getClass();
        this.f14845 = c3767;
        C2705 c2705 = new C2705();
        this.f14824 = c2705;
        c2705.m6868();
        this.f14857 = new C3842(new ᵢٴ(13, this));
        C3824 c3824 = new C3824();
        this.f14855 = c3824;
        C3830 c3830 = new C3830();
        c3830.f14726 = AbstractC4470.f17203;
        this.f14803 = c3830;
        this.f14834 = AbstractC3980.m9203(new C1338(), c3824, c3830);
        this.f14837 = AbstractC3980.m9207(new C3831());
        this.f14851 = 1.0f;
        this.f14811 = 0;
        this.f14852 = new C2423();
        C2441 c2441 = C2441.f9727;
        this.f14806 = new C3838(c2441, 0L, 0L);
        this.f14819 = c2441;
        this.f14838 = false;
        this.f14810 = new ArrayDeque();
        this.f14841 = new C1403(6);
        this.f14823 = new C1403(6);
    }

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public static boolean m9055(AudioTrack audioTrack) {
        return AbstractC4470.f17202 >= 29 && audioTrack.isOffloadedPlayback();
    }

    @Override // p337.InterfaceC3840
    public final void flush() throws IllegalStateException {
        C3823 c3823;
        if (m9061()) {
            this.f14856 = 0L;
            this.f14814 = 0L;
            this.f14831 = 0L;
            this.f14840 = 0L;
            this.f14835 = false;
            this.f14861 = 0;
            this.f14806 = new C3838(this.f14819, 0L, 0L);
            this.f14827 = 0L;
            this.f14839 = null;
            this.f14810.clear();
            this.f14821 = null;
            this.f14849 = 0;
            this.f14798 = null;
            this.f14813 = false;
            this.f14860 = false;
            this.f14817 = false;
            this.f14807 = null;
            this.f14850 = 0;
            this.f14803.f14728 = 0L;
            C1336 c1336 = this.f14805.f14696;
            this.f14815 = c1336;
            c1336.m4659();
            AudioTrack audioTrack = this.f14857.f14770;
            audioTrack.getClass();
            if (audioTrack.getPlayState() == 3) {
                this.f14859.pause();
            }
            if (m9055(this.f14859)) {
                C3843 c3843 = this.f14816;
                c3843.getClass();
                c3843.m9022(this.f14859);
            }
            int i = AbstractC4470.f17202;
            if (i < 21 && !this.f14804) {
                this.f14811 = 0;
            }
            this.f14805.getClass();
            final C3820 c3820 = new C3820();
            C3817 c3817 = this.f14853;
            if (c3817 != null) {
                this.f14805 = c3817;
                this.f14853 = null;
            }
            C3842 c3842 = this.f14857;
            c3842.m9021();
            c3842.f14770 = null;
            c3842.f14775 = null;
            c3842.f14762 = false;
            if (i >= 24 && (c3823 = this.f14854) != null) {
                c3823.m8941();
                this.f14854 = null;
            }
            final AudioTrack audioTrack2 = this.f14859;
            final C2705 c2705 = this.f14824;
            final ˋˉ r8 = this.f14844;
            c2705.m6870();
            final Handler handler = new Handler(Looper.myLooper());
            synchronized (f14795) {
                try {
                    if (f14796 == null) {
                        f14796 = Executors.newSingleThreadExecutor(new ThreadFactoryC2667("ExoPlayer:AudioTrackReleaseThread", 1));
                    }
                    f14797++;
                    f14796.execute(new Runnable() { // from class: ᵎˆ.ﾞˊ
                        @Override // java.lang.Runnable
                        public final void run() {
                            AudioTrack audioTrack3 = audioTrack2;
                            ˋˉ r1 = r8;
                            Handler handler2 = handler;
                            C3820 c38202 = c3820;
                            C2705 c27052 = c2705;
                            try {
                                audioTrack3.flush();
                                audioTrack3.release();
                                if (r1 != null && handler2.getLooper().getThread().isAlive()) {
                                    handler2.post(new ᐧˋ(r1, 21, c38202));
                                }
                                c27052.m6868();
                                synchronized (C3847.f14795) {
                                    try {
                                        int i2 = C3847.f14797 - 1;
                                        C3847.f14797 = i2;
                                        if (i2 == 0) {
                                            C3847.f14796.shutdown();
                                            C3847.f14796 = null;
                                        }
                                    } finally {
                                    }
                                }
                            } catch (Throwable th) {
                                if (r1 != null && handler2.getLooper().getThread().isAlive()) {
                                    handler2.post(new ᐧˋ(r1, 21, c38202));
                                }
                                c27052.m6868();
                                synchronized (C3847.f14795) {
                                    try {
                                        int i3 = C3847.f14797 - 1;
                                        C3847.f14797 = i3;
                                        if (i3 == 0) {
                                            C3847.f14796.shutdown();
                                            C3847.f14796 = null;
                                        }
                                        throw th;
                                    } finally {
                                    }
                                }
                            }
                        }
                    });
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.f14859 = null;
        }
        this.f14823.f5733 = null;
        this.f14841.f5733 = null;
        this.f14832 = 0L;
        this.f14846 = 0L;
        Handler handler2 = this.f14843;
        if (handler2 != null) {
            handler2.removeCallbacksAndMessages(null);
        }
    }

    @Override // p337.InterfaceC3840
    /* renamed from: ʽᐧ */
    public final void mo8992(C2441 c2441) {
        this.f14819 = new C2441(AbstractC4470.m10214(c2441.f9730, 0.1f, 8.0f), AbstractC4470.m10214(c2441.f9728, 0.1f, 8.0f));
        if (m9063()) {
            m9060();
            return;
        }
        C3838 c3838 = new C3838(c2441, -9223372036854775807L, -9223372036854775807L);
        if (m9061()) {
            this.f14839 = c3838;
        } else {
            this.f14806 = c3838;
        }
    }

    @Override // p337.InterfaceC3840
    /* renamed from: ʿʼ */
    public final C2441 mo8993() {
        return this.f14819;
    }

    @Override // p337.InterfaceC3840
    /* renamed from: ʿˏ */
    public final void mo8994(C1215 c1215) {
        this.f14820 = c1215;
    }

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final long m9056() {
        C3817 c3817 = this.f14805;
        if (c3817.f14691 != 0) {
            return this.f14840;
        }
        long j = this.f14831;
        long j2 = c3817.f14695;
        int i = AbstractC4470.f17202;
        return ((j + j2) - 1) / j2;
    }

    /* renamed from: ˈٴ, reason: contains not printable characters */
    public final boolean m9057() throws AudioSink$WriteException {
        if (!this.f14815.m4660()) {
            ByteBuffer byteBuffer = this.f14798;
            if (byteBuffer == null) {
                return true;
            }
            m9067(byteBuffer, Long.MIN_VALUE);
            return this.f14798 == null;
        }
        C1336 c1336 = this.f14815;
        if (c1336.m4660() && !c1336.f5446) {
            c1336.f5446 = true;
            ((InterfaceC1335) c1336.f5443.get(0)).mo4656();
        }
        m9058(Long.MIN_VALUE);
        if (!this.f14815.m4664()) {
            return false;
        }
        ByteBuffer byteBuffer2 = this.f14798;
        return byteBuffer2 == null || !byteBuffer2.hasRemaining();
    }

    @Override // p337.InterfaceC3840
    /* renamed from: ˉי */
    public final void mo8995() throws IllegalStateException {
        if (!this.f14860 && m9061() && m9057()) {
            m9066();
            this.f14860 = true;
        }
    }

    @Override // p337.InterfaceC3840
    /* renamed from: ˉⁱ */
    public final boolean mo8996() {
        return m9061() && !(AbstractC4470.f17202 >= 29 && this.f14859.isOffloadedPlayback() && this.f14817) && this.f14857.m9019(m9056());
    }

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public final void m9058(long j) throws AudioSink$WriteException {
        ByteBuffer byteBuffer;
        if (!this.f14815.m4660()) {
            ByteBuffer byteBuffer2 = this.f14821;
            if (byteBuffer2 == null) {
                byteBuffer2 = InterfaceC1335.f5442;
            }
            m9067(byteBuffer2, j);
            return;
        }
        while (!this.f14815.m4664()) {
            do {
                C1336 c1336 = this.f14815;
                if (c1336.m4660()) {
                    ByteBuffer byteBuffer3 = c1336.f5444[c1336.m4661()];
                    if (byteBuffer3.hasRemaining()) {
                        byteBuffer = byteBuffer3;
                    } else {
                        c1336.m4663(InterfaceC1335.f5442);
                        byteBuffer = c1336.f5444[c1336.m4661()];
                    }
                } else {
                    byteBuffer = InterfaceC1335.f5442;
                }
                if (byteBuffer.hasRemaining()) {
                    m9067(byteBuffer, j);
                } else {
                    ByteBuffer byteBuffer4 = this.f14821;
                    if (byteBuffer4 == null || !byteBuffer4.hasRemaining()) {
                        return;
                    }
                    C1336 c13362 = this.f14815;
                    ByteBuffer byteBuffer5 = this.f14821;
                    if (c13362.m4660() && !c13362.f5446) {
                        c13362.m4663(byteBuffer5);
                    }
                }
            } while (!byteBuffer.hasRemaining());
            return;
        }
    }

    @Override // p337.InterfaceC3840
    /* renamed from: ˋˊ */
    public final void mo8997(C2423 c2423) {
        if (this.f14852.equals(c2423)) {
            return;
        }
        c2423.getClass();
        if (this.f14859 != null) {
            this.f14852.getClass();
        }
        this.f14852 = c2423;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:144:0x026d  */
    @Override // p337.InterfaceC3840
    /* renamed from: ˋⁱ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo8998(p166.C2431 r28, int[] r29) throws androidx.media3.exoplayer.audio.AudioSink$ConfigurationException {
        /*
            Method dump skipped, instructions count: 888
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p337.C3847.mo8998(ˊﹶ.ᵎـ, int[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:107:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01ae  */
    /* renamed from: ˎˑ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m9059() throws androidx.media3.exoplayer.audio.AudioSink$InitializationException {
        /*
            Method dump skipped, instructions count: 442
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p337.C3847.m9059():boolean");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0104, code lost:
    
        if (r9.m9018() == 0) goto L72;
     */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0291  */
    @Override // p337.InterfaceC3840
    /* renamed from: ˎٴ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean mo8999(java.nio.ByteBuffer r24, long r25, int r27) throws java.lang.IllegalStateException, androidx.media3.exoplayer.audio.AudioSink$WriteException, androidx.media3.exoplayer.audio.AudioSink$InitializationException {
        /*
            Method dump skipped, instructions count: 1230
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p337.C3847.mo8999(java.nio.ByteBuffer, long, int):boolean");
    }

    @Override // p337.InterfaceC3840
    /* renamed from: ˏʾ */
    public final void mo9000(C2397 c2397) throws IllegalStateException {
        if (this.f14808.equals(c2397)) {
            return;
        }
        this.f14808 = c2397;
        if (this.f14830) {
            return;
        }
        C0372 c0372 = this.f14829;
        if (c0372 != null) {
            c0372.f2631 = c2397;
            c0372.m2083(C3835.m8980((Context) c0372.f2629, c2397, (C3818) c0372.f2638));
        }
        flush();
    }

    @Override // p337.InterfaceC3840
    /* renamed from: ˏᴵ */
    public final void mo9001(C4460 c4460) {
        this.f14857.f14791 = c4460;
    }

    @Override // p337.InterfaceC3840
    /* renamed from: ˏᵢ */
    public final void mo9002() throws IllegalStateException {
        AbstractC4464.m10132(AbstractC4470.f17202 >= 21);
        AbstractC4464.m10132(this.f14804);
        if (this.f14830) {
            return;
        }
        this.f14830 = true;
        flush();
    }

    @Override // p337.InterfaceC3840
    /* renamed from: ˑʽ */
    public final boolean mo9003() {
        return !m9061() || (this.f14860 && !mo8996());
    }

    @Override // p337.InterfaceC3840
    /* renamed from: ˑי */
    public final void mo9004(int i) throws IllegalStateException {
        if (this.f14811 != i) {
            this.f14811 = i;
            this.f14804 = i != 0;
            flush();
        }
    }

    @Override // p337.InterfaceC3840
    /* renamed from: יʻ */
    public final void mo9005(float f) {
        if (this.f14851 != f) {
            this.f14851 = f;
            if (m9061()) {
                if (AbstractC4470.f17202 >= 21) {
                    this.f14859.setVolume(this.f14851);
                    return;
                }
                AudioTrack audioTrack = this.f14859;
                float f2 = this.f14851;
                audioTrack.setStereoVolume(f2, f2);
            }
        }
    }

    /* renamed from: ـˆ, reason: contains not printable characters */
    public final void m9060() {
        if (m9061()) {
            try {
                this.f14859.setPlaybackParams(AbstractC2850.m7164().allowDefaults().setSpeed(this.f14819.f9730).setPitch(this.f14819.f9728).setAudioFallbackMode(2));
            } catch (IllegalArgumentException e) {
                AbstractC4464.m10127("DefaultAudioSink", "Failed to set playback params", e);
            }
            C2441 c2441 = new C2441(this.f14859.getPlaybackParams().getSpeed(), this.f14859.getPlaybackParams().getPitch());
            this.f14819 = c2441;
            float f = c2441.f9730;
            C3842 c3842 = this.f14857;
            c3842.f14760 = f;
            C3829 c3829 = c3842.f14775;
            if (c3829 != null) {
                c3829.m8945();
            }
            c3842.m9021();
        }
    }

    @Override // p337.InterfaceC3840
    /* renamed from: ـﹶ */
    public final void mo9006() throws IllegalStateException {
        flush();
        C3928 c3928ListIterator = this.f14834.listIterator(0);
        while (c3928ListIterator.hasNext()) {
            ((InterfaceC1335) c3928ListIterator.next()).mo4655();
        }
        C3928 c3928ListIterator2 = this.f14837.listIterator(0);
        while (c3928ListIterator2.hasNext()) {
            ((InterfaceC1335) c3928ListIterator2.next()).mo4655();
        }
        C1336 c1336 = this.f14815;
        if (c1336 != null) {
            int i = 0;
            while (true) {
                C3932 c3932 = c1336.f5445;
                if (i >= c3932.size()) {
                    break;
                }
                InterfaceC1335 interfaceC1335 = (InterfaceC1335) c3932.get(i);
                interfaceC1335.flush();
                interfaceC1335.mo4655();
                i++;
            }
            c1336.f5444 = new ByteBuffer[0];
            C1333 c1333 = C1333.f5415;
            c1336.f5446 = false;
        }
        this.f14842 = false;
        this.f14800 = false;
    }

    @Override // p337.InterfaceC3840
    /* renamed from: ٴˎ */
    public final boolean mo9007(C2431 c2431) {
        return mo9008(c2431) != 0;
    }

    @Override // p337.InterfaceC3840
    /* renamed from: ᐧʻ */
    public final int mo9008(C2431 c2431) {
        m9064();
        if (!"audio/raw".equals(c2431.f9667)) {
            return this.f14858.m8983(this.f14808, c2431) != null ? 2 : 0;
        }
        int i = c2431.f9660;
        if (AbstractC4470.m10190(i)) {
            return (i == 2 || (this.f14825 && i == 4)) ? 2 : 1;
        }
        AbstractC4464.m10144("DefaultAudioSink", "Invalid PCM encoding: " + i);
        return 0;
    }

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final boolean m9061() {
        return this.f14859 != null;
    }

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final long m9062() {
        return this.f14805.f14691 == 0 ? this.f14856 / r0.f14685 : this.f14814;
    }

    /* renamed from: ᴵʼ, reason: contains not printable characters */
    public final boolean m9063() {
        C3817 c3817 = this.f14805;
        return c3817 != null && c3817.f14687 && AbstractC4470.f17202 >= 23;
    }

    @Override // p337.InterfaceC3840
    /* renamed from: ᴵʿ */
    public final void mo9009(ˋˉ r1) {
        this.f14844 = r1;
    }

    @Override // p337.InterfaceC3840
    /* renamed from: ᵎˏ */
    public final long mo9010(boolean z) {
        ArrayDeque arrayDeque;
        long jM10211;
        long jM10166;
        if (!m9061() || this.f14828) {
            return Long.MIN_VALUE;
        }
        long jMin = Math.min(this.f14857.m9020(z), AbstractC4470.m10179(this.f14805.f14686, m9056()));
        while (true) {
            arrayDeque = this.f14810;
            if (arrayDeque.isEmpty() || jMin < ((C3838) arrayDeque.getFirst()).f14739) {
                break;
            }
            this.f14806 = (C3838) arrayDeque.remove();
        }
        long j = jMin - this.f14806.f14739;
        boolean zIsEmpty = arrayDeque.isEmpty();
        C3222 c3222 = this.f14801;
        if (zIsEmpty) {
            C1337 c1337 = (C1337) c3222.f12540;
            if (c1337.mo4652()) {
                if (c1337.f5453 >= 1024) {
                    long j2 = c1337.f5459;
                    c1337.f5449.getClass();
                    long j3 = j2 - ((r2.f5428 * r2.f5420) * 2);
                    int i = c1337.f5454.f5418;
                    int i2 = c1337.f5458.f5418;
                    jM10166 = i == i2 ? AbstractC4470.m10166(j, j3, c1337.f5453, RoundingMode.FLOOR) : AbstractC4470.m10166(j, j3 * i, c1337.f5453 * i2, RoundingMode.FLOOR);
                } else {
                    jM10166 = (long) (c1337.f5455 * j);
                }
                j = jM10166;
            }
            jM10211 = this.f14806.f14738 + j;
        } else {
            C3838 c3838 = (C3838) arrayDeque.getFirst();
            jM10211 = c3838.f14738 - AbstractC4470.m10211(c3838.f14739 - jMin, this.f14806.f14740.f9730);
        }
        long j4 = ((C3812) c3222.f12539).f14676;
        long jM10179 = AbstractC4470.m10179(this.f14805.f14686, j4) + jM10211;
        long j5 = this.f14832;
        if (j4 > j5) {
            long jM101792 = AbstractC4470.m10179(this.f14805.f14686, j4 - j5);
            this.f14832 = j4;
            this.f14846 += jM101792;
            if (this.f14843 == null) {
                this.f14843 = new Handler(Looper.myLooper());
            }
            this.f14843.removeCallbacksAndMessages(null);
            this.f14843.postDelayed(new RunnableC0246(21, this), 100L);
        }
        return jM10179;
    }

    @Override // p337.InterfaceC3840
    /* renamed from: ᵎـ */
    public final void mo9011() throws IllegalStateException {
        this.f14842 = true;
        if (m9061()) {
            C3842 c3842 = this.f14857;
            if (c3842.f14772 != -9223372036854775807L) {
                c3842.f14791.getClass();
                c3842.f14772 = AbstractC4470.m10206(SystemClock.elapsedRealtime());
            }
            C3829 c3829 = c3842.f14775;
            c3829.getClass();
            c3829.m8945();
            this.f14859.play();
        }
    }

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final void m9064() {
        Context context;
        C3835 c3835M8979;
        C3827 c3827;
        if (this.f14829 != null || (context = this.f14833) == null) {
            return;
        }
        this.f14836 = Looper.myLooper();
        C0372 c0372 = new C0372(context, new C1067(26, this), this.f14808, this.f14818);
        this.f14829 = c0372;
        if (c0372.f2634) {
            c3835M8979 = (C3835) c0372.f2632;
            c3835M8979.getClass();
        } else {
            c0372.f2634 = true;
            C3848 c3848 = (C3848) c0372.f2636;
            if (c3848 != null) {
                c3848.f14864.registerContentObserver(c3848.f14862, false, c3848);
            }
            int i = AbstractC4470.f17202;
            Handler handler = (Handler) c0372.f2637;
            Context context2 = (Context) c0372.f2629;
            if (i >= 23 && (c3827 = (C3827) c0372.f2630) != null) {
                AbstractC3836.m8985(context2, c3827, handler);
            }
            C0996 c0996 = (C0996) c0372.f2635;
            c3835M8979 = C3835.m8979(context2, c0996 != null ? context2.registerReceiver(c0996, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"), null, handler) : null, (C2397) c0372.f2631, (C3818) c0372.f2638);
            c0372.f2632 = c3835M8979;
        }
        this.f14858 = c3835M8979;
    }

    @Override // p337.InterfaceC3840
    /* renamed from: ﹳˎ */
    public final void mo9012() throws IllegalStateException {
        if (this.f14830) {
            this.f14830 = false;
            flush();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0084  */
    /* renamed from: ﹳˑ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m9065(long r17) {
        /*
            Method dump skipped, instructions count: 234
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p337.C3847.m9065(long):void");
    }

    @Override // p337.InterfaceC3840
    /* renamed from: ﹳﹳ */
    public final void mo9013() throws IllegalStateException {
        this.f14842 = false;
        if (m9061()) {
            C3842 c3842 = this.f14857;
            c3842.f14762 = true;
            c3842.m9021();
            if (c3842.f14772 == -9223372036854775807L) {
                C3829 c3829 = c3842.f14775;
                c3829.getClass();
                c3829.m8945();
            } else {
                c3842.f14759 = c3842.m9018();
                if (!m9055(this.f14859)) {
                    return;
                }
            }
            this.f14859.pause();
        }
    }

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public final void m9066() throws IllegalStateException {
        if (this.f14813) {
            return;
        }
        this.f14813 = true;
        long jM9056 = m9056();
        C3842 c3842 = this.f14857;
        c3842.f14759 = c3842.m9018();
        c3842.f14791.getClass();
        c3842.f14772 = AbstractC4470.m10206(SystemClock.elapsedRealtime());
        c3842.f14778 = jM9056;
        if (m9055(this.f14859)) {
            this.f14817 = false;
        }
        this.f14859.stop();
        this.f14850 = 0;
    }

    @Override // p337.InterfaceC3840
    /* renamed from: ﹶˆ */
    public final void mo9014(AudioDeviceInfo audioDeviceInfo) {
        this.f14818 = audioDeviceInfo == null ? null : new C3818(audioDeviceInfo);
        C0372 c0372 = this.f14829;
        if (c0372 != null) {
            c0372.m2082(audioDeviceInfo);
        }
        AudioTrack audioTrack = this.f14859;
        if (audioTrack != null) {
            AbstractC3849.m9068(audioTrack, this.f14818);
        }
    }

    @Override // p337.InterfaceC3840
    /* renamed from: ﾞʽ */
    public final void mo9015() {
        this.f14802 = true;
    }

    @Override // p337.InterfaceC3840
    /* renamed from: ﾞˊ */
    public final void mo9016(boolean z) {
        this.f14838 = z;
        C3838 c3838 = new C3838(m9063() ? C2441.f9727 : this.f14819, -9223372036854775807L, -9223372036854775807L);
        if (m9061()) {
            this.f14839 = c3838;
        } else {
            this.f14806 = c3838;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0136  */
    /* renamed from: ﾞᐧ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m9067(java.nio.ByteBuffer r10, long r11) throws androidx.media3.exoplayer.audio.AudioSink$WriteException {
        /*
            Method dump skipped, instructions count: 438
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p337.C3847.m9067(java.nio.ByteBuffer, long):void");
    }
}
