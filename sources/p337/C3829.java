package p337;

import android.media.AudioTrack;

/* renamed from: ᵎˆ.ˑי, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3829 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public int f14718;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public long f14719;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public long f14720;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C3826 f14721;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public long f14722;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public long f14723;

    public C3829(AudioTrack audioTrack) {
        this.f14721 = new C3826(audioTrack);
        m8945();
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final void m8944(int i) {
        this.f14718 = i;
        if (i == 0) {
            this.f14719 = 0L;
            this.f14722 = -1L;
            this.f14720 = System.nanoTime() / 1000;
            this.f14723 = 10000L;
            return;
        }
        if (i == 1) {
            this.f14723 = 10000L;
            return;
        }
        if (i == 2 || i == 3) {
            this.f14723 = 10000000L;
        } else {
            if (i != 4) {
                throw new IllegalStateException();
            }
            this.f14723 = 500000L;
        }
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void m8945() {
        if (this.f14721 != null) {
            m8944(0);
        }
    }
}
