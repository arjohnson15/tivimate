package androidx.media3.common;

import p383.AbstractC4470;
import ˆʽ.ᵎˏ;

/* loaded from: classes.dex */
public class PlaybackException extends Exception {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final long f1335;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final int f1336;

    static {
        ᵎˏ.ﹳˎ(0, 1, 2, 3, 4);
        AbstractC4470.m10164(5);
    }

    public PlaybackException(String str, Throwable th, int i, long j) {
        super(str, th);
        this.f1336 = i;
        this.f1335 = j;
    }
}
