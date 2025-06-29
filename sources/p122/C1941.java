package p122;

/* renamed from: ˈי.ˑʾ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1941 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final String f7396;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final boolean f7397;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final String f7398;

    public C1941(String str, String str2, boolean z) {
        if (str == null) {
            throw new NullPointerException("Null osRelease");
        }
        this.f7398 = str;
        if (str2 == null) {
            throw new NullPointerException("Null osCodeName");
        }
        this.f7396 = str2;
        this.f7397 = z;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1941)) {
            return false;
        }
        C1941 c1941 = (C1941) obj;
        return this.f7398.equals(c1941.f7398) && this.f7396.equals(c1941.f7396) && this.f7397 == c1941.f7397;
    }

    public final int hashCode() {
        return ((((this.f7398.hashCode() ^ 1000003) * 1000003) ^ this.f7396.hashCode()) * 1000003) ^ (this.f7397 ? 1231 : 1237);
    }

    public final String toString() {
        return "OsData{osRelease=" + this.f7398 + ", osCodeName=" + this.f7396 + ", isRooted=" + this.f7397 + "}";
    }
}
