package p033;

import android.media.metrics.LogSessionId;
import j$.util.Objects;
import p383.AbstractC4464;
import p383.AbstractC4470;

/* renamed from: ʼᵎ.ˏᴵ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1215 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final C1221 f4988;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final Object f4989;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final String f4990;

    static {
        if (AbstractC4470.f17202 < 31) {
            new C1215("");
        } else {
            new C1215(C1221.f5020, "");
        }
    }

    public C1215(LogSessionId logSessionId, String str) {
        this(new C1221(logSessionId), str);
    }

    public C1215(String str) {
        AbstractC4464.m10132(AbstractC4470.f17202 < 31);
        this.f4990 = str;
        this.f4988 = null;
        this.f4989 = new Object();
    }

    public C1215(C1221 c1221, String str) {
        this.f4988 = c1221;
        this.f4990 = str;
        this.f4989 = new Object();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1215)) {
            return false;
        }
        C1215 c1215 = (C1215) obj;
        return Objects.equals(this.f4990, c1215.f4990) && Objects.equals(this.f4988, c1215.f4988) && Objects.equals(this.f4989, c1215.f4989);
    }

    public final int hashCode() {
        return Objects.hash(this.f4990, this.f4988, this.f4989);
    }
}
