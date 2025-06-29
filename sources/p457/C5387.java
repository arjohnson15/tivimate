package p457;

import android.net.Uri;
import p070.AbstractC1549;

/* renamed from: ﾞﹶ.ﹳﹳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C5387 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final boolean f20859;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final Uri f20860;

    public C5387(Uri uri, boolean z) {
        this.f20860 = uri;
        this.f20859 = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C5387.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        C5387 c5387 = (C5387) obj;
        return AbstractC1549.m5138(this.f20860, c5387.f20860) && this.f20859 == c5387.f20859;
    }

    public final int hashCode() {
        return (this.f20860.hashCode() * 31) + (this.f20859 ? 1231 : 1237);
    }
}
