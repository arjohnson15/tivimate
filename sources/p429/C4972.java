package p429;

/* renamed from: ﹶˎ.ᐧˋ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4972 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final C4945 f18800;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C4946 f18801;

    public C4972(C4946 c4946, C4945 c4945) {
        this.f18801 = c4946;
        this.f18800 = c4945;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4972)) {
            return false;
        }
        C4972 c4972 = (C4972) obj;
        c4972.getClass();
        return this.f18801.equals(c4972.f18801) && this.f18800.equals(c4972.f18800);
    }

    public final int hashCode() {
        return this.f18800.hashCode() + ((this.f18801.hashCode() + (EnumC4960.f18753.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "SessionEvent(eventType=" + EnumC4960.f18753 + ", sessionData=" + this.f18801 + ", applicationInfo=" + this.f18800 + ')';
    }
}
