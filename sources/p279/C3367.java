package p279;

import android.content.Context;
import android.net.ConnectivityManager;
import p406.AbstractC4661;
import p406.AbstractC4667;
import p457.C5391;
import ʻˋ.ˎٴ;
import ᴵﹳ.ﹶˆ;

/* renamed from: ٴ.ˏᵢ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3367 extends AbstractC3370 {

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final ConnectivityManager f13186;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final ˎٴ f13187;

    public C3367(Context context, ﹶˆ r2) {
        super(context, r2);
        this.f13186 = (ConnectivityManager) this.f13190.getSystemService("connectivity");
        this.f13187 = new ˎٴ(2, this);
    }

    @Override // p279.AbstractC3370
    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final void mo8225() {
        try {
            C5391.m12163().m12168(AbstractC3373.f13197, "Registering network callback");
            AbstractC4667.m10571(this.f13186, this.f13187);
        } catch (IllegalArgumentException e) {
            C5391.m12163().m12170(AbstractC3373.f13197, "Received exception while registering network callback", e);
        } catch (SecurityException e2) {
            C5391.m12163().m12170(AbstractC3373.f13197, "Received exception while registering network callback", e2);
        }
    }

    @Override // p279.AbstractC3370
    /* renamed from: ـﹶ */
    public final Object mo8223() {
        return AbstractC3373.m8228(this.f13186);
    }

    @Override // p279.AbstractC3370
    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final void mo8226() {
        try {
            C5391.m12163().m12168(AbstractC3373.f13197, "Unregistering network callback");
            AbstractC4661.m10565(this.f13186, this.f13187);
        } catch (IllegalArgumentException e) {
            C5391.m12163().m12170(AbstractC3373.f13197, "Received exception while unregistering network callback", e);
        } catch (SecurityException e2) {
            C5391.m12163().m12170(AbstractC3373.f13197, "Received exception while unregistering network callback", e2);
        }
    }
}
