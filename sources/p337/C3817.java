package p337;

import android.media.AudioAttributes;
import android.media.AudioTrack;
import androidx.media3.exoplayer.audio.AudioSink$InitializationException;
import p056.C1336;
import p166.C2397;
import p166.C2431;
import p383.AbstractC4470;

/* renamed from: ᵎˆ.ˈٴ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3817 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final int f14685;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final int f14686;

    /* renamed from: ˉי, reason: contains not printable characters */
    public final boolean f14687;

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public final boolean f14688;

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public final boolean f14689;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final int f14690;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final int f14691;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C2431 f14692;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final int f14693;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final int f14694;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final int f14695;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final C1336 f14696;

    public C3817(C2431 c2431, int i, int i2, int i3, int i4, int i5, int i6, int i7, C1336 c1336, boolean z, boolean z2, boolean z3) {
        this.f14692 = c2431;
        this.f14685 = i;
        this.f14691 = i2;
        this.f14695 = i3;
        this.f14686 = i4;
        this.f14693 = i5;
        this.f14694 = i6;
        this.f14690 = i7;
        this.f14696 = c1336;
        this.f14687 = z;
        this.f14689 = z2;
        this.f14688 = z3;
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static AudioAttributes m8905(C2397 c2397, boolean z) {
        return z ? new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build() : (AudioAttributes) c2397.m6485().ˆʿ;
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final AudioTrack m8906(C2397 c2397, int i) {
        int i2 = AbstractC4470.f17202;
        boolean z = this.f14688;
        int i3 = this.f14686;
        int i4 = this.f14694;
        int i5 = this.f14693;
        if (i2 >= 29) {
            return AbstractC3845.m9049().setAudioAttributes(m8905(c2397, z)).setAudioFormat(AbstractC4470.m10182(i3, i5, i4)).setTransferMode(1).setBufferSizeInBytes(this.f14690).setSessionId(i).setOffloadedPlayback(this.f14691 == 1).build();
        }
        if (i2 >= 21) {
            return new AudioTrack(m8905(c2397, z), AbstractC4470.m10182(i3, i5, i4), this.f14690, 1, i);
        }
        c2397.getClass();
        if (i == 0) {
            return new AudioTrack(3, this.f14686, this.f14693, this.f14694, this.f14690, 1);
        }
        return new AudioTrack(3, this.f14686, this.f14693, this.f14694, this.f14690, 1, i);
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final AudioTrack m8907(C2397 c2397, int i) {
        int i2 = this.f14691;
        try {
            AudioTrack audioTrackM8906 = m8906(c2397, i);
            int state = audioTrackM8906.getState();
            if (state == 1) {
                return audioTrackM8906;
            }
            try {
                audioTrackM8906.release();
            } catch (Exception unused) {
            }
            throw new AudioSink$InitializationException(state, this.f14686, this.f14693, this.f14690, this.f14692, i2 == 1, null);
        } catch (IllegalArgumentException | UnsupportedOperationException e) {
            throw new AudioSink$InitializationException(0, this.f14686, this.f14693, this.f14690, this.f14692, i2 == 1, e);
        }
    }
}
