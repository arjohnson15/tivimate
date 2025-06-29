package p033;

import android.content.Context;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.TrackChangeEvent;
import android.os.SystemClock;
import android.util.Pair;
import androidx.media3.exoplayer.ExoPlaybackException;
import com.google.android.gms.internal.play_billing.ᐧʻ;
import java.util.HashMap;
import p166.AbstractC2394;
import p166.C2412;
import p166.C2431;
import p166.C2434;
import p166.C2443;
import p374.C4290;
import p383.AbstractC4470;

/* renamed from: ʼᵎ.ˋⁱ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1213 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final C1223 f4961;

    /* renamed from: ʿˏ, reason: contains not printable characters */
    public boolean f4963;

    /* renamed from: ˈٴ, reason: contains not printable characters */
    public boolean f4964;

    /* renamed from: ˉי, reason: contains not printable characters */
    public PlaybackMetrics.Builder f4965;

    /* renamed from: ˋˊ, reason: contains not printable characters */
    public int f4967;

    /* renamed from: ˎٴ, reason: contains not printable characters */
    public C2431 f4969;

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public int f4970;

    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public ᐧʻ f4971;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final PlaybackSession f4973;

    /* renamed from: ˑי, reason: contains not printable characters */
    public ᐧʻ f4974;

    /* renamed from: יʻ, reason: contains not printable characters */
    public int f4975;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final Context f4976;

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public ExoPlaybackException f4979;

    /* renamed from: ᵎˏ, reason: contains not printable characters */
    public C2431 f4980;

    /* renamed from: ᵎـ, reason: contains not printable characters */
    public ᐧʻ f4981;

    /* renamed from: ﹳˎ, reason: contains not printable characters */
    public C2431 f4982;

    /* renamed from: ﹳˑ, reason: contains not printable characters */
    public int f4983;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public String f4985;

    /* renamed from: ﾞʽ, reason: contains not printable characters */
    public int f4986;

    /* renamed from: ﾞˊ, reason: contains not printable characters */
    public boolean f4987;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final C2434 f4962 = new C2434();

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final C2412 f4977 = new C2412();

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final HashMap f4972 = new HashMap();

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final HashMap f4978 = new HashMap();

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final long f4984 = SystemClock.elapsedRealtime();

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public int f4966 = 0;

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public int f4968 = 0;

    public C1213(Context context, PlaybackSession playbackSession) {
        this.f4976 = context.getApplicationContext();
        this.f4973 = playbackSession;
        C1223 c1223 = new C1223();
        this.f4961 = c1223;
        c1223.f5032 = this;
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final void m4296() {
        PlaybackMetrics.Builder builder = this.f4965;
        if (builder != null && this.f4964) {
            builder.setAudioUnderrunCount(this.f4983);
            this.f4965.setVideoFramesDropped(this.f4986);
            this.f4965.setVideoFramesPlayed(this.f4975);
            Long l = (Long) this.f4978.get(this.f4985);
            this.f4965.setNetworkTransferDurationMillis(l == null ? 0L : l.longValue());
            Long l2 = (Long) this.f4972.get(this.f4985);
            this.f4965.setNetworkBytesRead(l2 == null ? 0L : l2.longValue());
            this.f4965.setStreamSource((l2 == null || l2.longValue() <= 0) ? 0 : 1);
            this.f4973.reportPlaybackMetrics(this.f4965.build());
        }
        this.f4965 = null;
        this.f4985 = null;
        this.f4983 = 0;
        this.f4986 = 0;
        this.f4975 = 0;
        this.f4969 = null;
        this.f4980 = null;
        this.f4982 = null;
        this.f4964 = false;
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final void m4297(int i, long j, C2431 c2431, int i2) {
        int i3;
        TrackChangeEvent.Builder timeSinceCreatedMillis = AbstractC1214.m4307(i).setTimeSinceCreatedMillis(j - this.f4984);
        if (c2431 != null) {
            timeSinceCreatedMillis.setTrackState(1);
            if (i2 != 1) {
                i3 = 3;
                if (i2 != 2) {
                    i3 = i2 != 3 ? 1 : 4;
                }
            } else {
                i3 = 2;
            }
            timeSinceCreatedMillis.setTrackChangeReason(i3);
            String str = c2431.f9664;
            if (str != null) {
                timeSinceCreatedMillis.setContainerMimeType(str);
            }
            String str2 = c2431.f9667;
            if (str2 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str2);
            }
            String str3 = c2431.f9663;
            if (str3 != null) {
                timeSinceCreatedMillis.setCodecName(str3);
            }
            int i4 = c2431.f9691;
            if (i4 != -1) {
                timeSinceCreatedMillis.setBitrate(i4);
            }
            int i5 = c2431.f9684;
            if (i5 != -1) {
                timeSinceCreatedMillis.setWidth(i5);
            }
            int i6 = c2431.f9687;
            if (i6 != -1) {
                timeSinceCreatedMillis.setHeight(i6);
            }
            int i7 = c2431.f9662;
            if (i7 != -1) {
                timeSinceCreatedMillis.setChannelCount(i7);
            }
            int i8 = c2431.f9681;
            if (i8 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i8);
            }
            String str4 = c2431.f9689;
            if (str4 != null) {
                int i9 = AbstractC4470.f17202;
                String[] strArrSplit = str4.split("-", -1);
                Pair pairCreate = Pair.create(strArrSplit[0], strArrSplit.length >= 2 ? strArrSplit[1] : null);
                timeSinceCreatedMillis.setLanguage((String) pairCreate.first);
                Object obj = pairCreate.second;
                if (obj != null) {
                    timeSinceCreatedMillis.setLanguageRegion((String) obj);
                }
            }
            float f = c2431.f9659;
            if (f != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.f4964 = true;
        this.f4973.reportTrackChangeEvent(timeSinceCreatedMillis.build());
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final void m4298(AbstractC2394 abstractC2394, C4290 c4290) {
        int iMo6469;
        int i = 3;
        int iM10199 = 0;
        PlaybackMetrics.Builder builder = this.f4965;
        if (c4290 == null || (iMo6469 = abstractC2394.mo6469(c4290.f16693)) == -1) {
            return;
        }
        C2412 c2412 = this.f4977;
        abstractC2394.mo6180(iMo6469, c2412, false);
        int i2 = c2412.f9576;
        C2434 c2434 = this.f4962;
        abstractC2394.m6480(i2, c2434);
        C2443 c2443 = c2434.f9711.f9492;
        if (c2443 == null) {
            i = 0;
        } else {
            String str = c2443.f9731;
            if (str != null) {
                switch (str) {
                    case "application/x-mpegURL":
                        iM10199 = 2;
                        break;
                    case "application/vnd.ms-sstr+xml":
                        iM10199 = 1;
                        break;
                    case "application/dash+xml":
                        break;
                    case "application/x-rtsp":
                        iM10199 = 3;
                        break;
                    default:
                        iM10199 = 4;
                        break;
                }
            } else {
                iM10199 = AbstractC4470.m10199(c2443.f9734);
            }
            if (iM10199 != 0) {
                i = iM10199 != 1 ? iM10199 != 2 ? 1 : 4 : 5;
            }
        }
        builder.setStreamType(i);
        if (c2434.f9707 != -9223372036854775807L && !c2434.f9708 && !c2434.f9718 && !c2434.m6547()) {
            builder.setMediaDurationMillis(AbstractC4470.m10171(c2434.f9707));
        }
        builder.setPlaybackType(c2434.m6547() ? 2 : 1);
        this.f4964 = true;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final boolean m4299(ᐧʻ r3) {
        String str;
        if (r3 != null) {
            String str2 = (String) r3.ᐧˋ;
            C1223 c1223 = this.f4961;
            synchronized (c1223) {
                str = c1223.f5030;
            }
            if (str2.equals(str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final void m4300(C1218 c1218, String str) {
        C4290 c4290 = c1218.f5008;
        if ((c4290 == null || !c4290.m9753()) && str.equals(this.f4985)) {
            m4296();
        }
        this.f4978.remove(str);
        this.f4972.remove(str);
    }
}
