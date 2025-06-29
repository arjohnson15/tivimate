package androidx.media3.exoplayer;

import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.media3.common.PlaybackException;
import java.io.IOException;
import p166.C2431;
import p374.C4290;
import p383.AbstractC4464;
import p383.AbstractC4470;
import ˆʽ.ᵎˏ;
import ᵎﹳ.ᐧʻ;

/* loaded from: classes.dex */
public final class ExoPlaybackException extends PlaybackException {

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final int f1402;

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public final C4290 f1403;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final int f1404;

    /* renamed from: ـˆ, reason: contains not printable characters */
    public final boolean f1405;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final String f1406;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final C2431 f1407;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public final int f1408;

    static {
        ᵎˏ.ﹳˎ(1001, 1002, 1003, 1004, 1005);
        AbstractC4470.m10164(1006);
    }

    public ExoPlaybackException(int i, Exception exc, int i2) {
        this(i, exc, i2, null, -1, null, 4, false);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ExoPlaybackException(int i, Throwable th, int i2, String str, int i3, C2431 c2431, int i4, boolean z) {
        String string;
        String str2;
        if (i == 0) {
            string = "Source error";
        } else if (i != 1) {
            string = i != 3 ? "Unexpected runtime error" : "Remote error";
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" error, index=");
            sb.append(i3);
            sb.append(", format=");
            sb.append(c2431);
            sb.append(", format_supported=");
            int i5 = AbstractC4470.f17202;
            if (i4 == 0) {
                str2 = "NO";
            } else if (i4 == 1) {
                str2 = "NO_UNSUPPORTED_TYPE";
            } else if (i4 == 2) {
                str2 = "NO_UNSUPPORTED_DRM";
            } else if (i4 == 3) {
                str2 = "NO_EXCEEDS_CAPABILITIES";
            } else {
                if (i4 != 4) {
                    throw new IllegalStateException();
                }
                str2 = "YES";
            }
            sb.append(str2);
            string = sb.toString();
        }
        this(TextUtils.isEmpty(null) ? string : ᐧʻ.ˉⁱ(string, ": null"), th, i2, i, str, i3, c2431, i4, null, SystemClock.elapsedRealtime(), z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExoPlaybackException(String str, Throwable th, int i, int i2, String str2, int i3, C2431 c2431, int i4, C4290 c4290, long j, boolean z) {
        super(str, th, i, j);
        Bundle bundle = Bundle.EMPTY;
        AbstractC4464.m10142(!z || i2 == 1);
        AbstractC4464.m10142(th != null || i2 == 3);
        this.f1404 = i2;
        this.f1406 = str2;
        this.f1402 = i3;
        this.f1407 = c2431;
        this.f1408 = i4;
        this.f1403 = c4290;
        this.f1405 = z;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final IOException m1141() {
        AbstractC4464.m10132(this.f1404 == 0);
        Throwable cause = getCause();
        cause.getClass();
        return (IOException) cause;
    }
}
