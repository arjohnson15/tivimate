package p007;

import android.content.Context;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import androidx.lifecycle.RunnableC0246;
import androidx.media3.common.VideoFrameProcessingException;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.video.VideoSink$VideoSinkException;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import p166.C2415;
import p166.C2417;
import p166.C2431;
import p345.AbstractC3980;
import p345.C3928;
import p345.C3932;
import p383.AbstractC4464;
import p383.AbstractC4470;
import p383.C4467;
import p383.C4469;

/* renamed from: ʻˉ.ᐧʻ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0957 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final int f4229;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public long f4230;

    /* renamed from: ˉי, reason: contains not printable characters */
    public final /* synthetic */ C0951 f4231;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public InterfaceC0966 f4232;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final ArrayList f4233;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final Context f4234;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public boolean f4235;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public long f4236;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public C2431 f4237;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public Executor f4238;

    public C0957(C0951 c0951, Context context) {
        this.f4231 = c0951;
        this.f4234 = context;
        this.f4229 = AbstractC4470.m10189(context) ? 1 : 5;
        this.f4233 = new ArrayList();
        this.f4230 = -9223372036854775807L;
        this.f4232 = InterfaceC0966.f4267;
        this.f4238 = C0951.f4207;
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final void m3886(C2431 c2431) throws VideoSink$VideoSinkException {
        C0951 c0951 = this.f4231;
        AbstractC4464.m10132(c0951.f4211 == 0);
        C2415 c2415 = c2431.f9688;
        if (c2415 == null || !c2415.m6515()) {
            c2415 = C2415.f9587;
        }
        if (c2415.f9590 != 7 || AbstractC4470.f17202 < 34) {
        }
        Looper looperMyLooper = Looper.myLooper();
        AbstractC4464.m10146(looperMyLooper);
        c0951.f4219 = c0951.f4209.m10120(looperMyLooper, null);
        try {
            C0938 c0938 = c0951.f4218;
            C3928 c3928 = AbstractC3980.f15360;
            C3932 c3932 = C3932.f15274;
            c0938.m3807();
            Pair pair = c0951.f4210;
            if (pair == null) {
                throw null;
            }
            int i = ((C4467) pair.second).f17189;
            throw null;
        } catch (VideoFrameProcessingException e) {
            throw new VideoSink$VideoSinkException(e, c2431);
        }
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final void m3887(Surface surface, C4467 c4467) {
        C0951 c0951 = this.f4231;
        Pair pair = c0951.f4210;
        if (pair != null && ((Surface) pair.first).equals(surface) && ((C4467) c0951.f4210.second).equals(c4467)) {
            return;
        }
        c0951.f4210 = Pair.create(surface, c4467);
        int i = c4467.f17189;
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final void m3888() {
        if (this.f4237 == null) {
            return;
        }
        new ArrayList().addAll(this.f4233);
        C2431 c2431 = this.f4237;
        c2431.getClass();
        AbstractC4464.m10146(null);
        C2415 c2415 = c2431.f9688;
        if (c2415 == null || !c2415.m6515()) {
            C2415 c24152 = C2415.f9587;
        }
        int i = c2431.f9684;
        AbstractC4464.m10124("width must be positive, but is: " + i, i > 0);
        int i2 = c2431.f9687;
        AbstractC4464.m10124("height must be positive, but is: " + i2, i2 > 0);
        throw null;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void m3889(boolean z) {
        this.f4235 = false;
        this.f4230 = -9223372036854775807L;
        C0951 c0951 = this.f4231;
        if (c0951.f4211 == 1) {
            c0951.f4212++;
            c0951.f4214.m3809();
            C4469 c4469 = c0951.f4219;
            AbstractC4464.m10146(c4469);
            c4469.m10158(new RunnableC0246(1, c0951));
        }
        if (z) {
            C0969 c0969 = c0951.f4208;
            C0958 c0958 = c0969.f4276;
            c0958.f4243 = 0L;
            c0958.f4248 = -1L;
            c0958.f4252 = -1L;
            c0969.f4281 = -9223372036854775807L;
            c0969.f4284 = -9223372036854775807L;
            c0969.m3935(1);
            c0969.f4287 = -9223372036854775807L;
        }
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final void m3890(long j, long j2) throws VideoSink$VideoSinkException {
        try {
            this.f4231.m3881(j, j2);
        } catch (ExoPlaybackException e) {
            C2431 c2431 = this.f4237;
            if (c2431 == null) {
                c2431 = new C2431(new C2417());
            }
            throw new VideoSink$VideoSinkException(e, c2431);
        }
    }
}
