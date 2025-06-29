package p428;

import java.io.File;
import p122.C1958;

/* renamed from: ﹶˊ.ʽᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4918 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final String f18593;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final File f18594;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C1958 f18595;

    public C4918(C1958 c1958, String str, File file) {
        this.f18595 = c1958;
        if (str == null) {
            throw new NullPointerException("Null sessionId");
        }
        this.f18593 = str;
        this.f18594 = file;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4918)) {
            return false;
        }
        C4918 c4918 = (C4918) obj;
        return this.f18595.equals(c4918.f18595) && this.f18593.equals(c4918.f18593) && this.f18594.equals(c4918.f18594);
    }

    public final int hashCode() {
        return ((((this.f18595.hashCode() ^ 1000003) * 1000003) ^ this.f18593.hashCode()) * 1000003) ^ this.f18594.hashCode();
    }

    public final String toString() {
        return "CrashlyticsReportWithSessionId{report=" + this.f18595 + ", sessionId=" + this.f18593 + ", reportFile=" + this.f18594 + "}";
    }
}
