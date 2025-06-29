package p457;

/* renamed from: ﾞﹶ.ﹳˎ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C5385 extends AbstractC5359 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C5363 f20857;

    public C5385(C5363 c5363) {
        this.f20857 = c5363;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5385.class != obj.getClass()) {
            return false;
        }
        return this.f20857.equals(((C5385) obj).f20857);
    }

    public final int hashCode() {
        return this.f20857.hashCode() + (C5385.class.getName().hashCode() * 31);
    }

    public final String toString() {
        return "Success {mOutputData=" + this.f20857 + '}';
    }
}
