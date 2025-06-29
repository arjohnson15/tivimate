package p279;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import p070.AbstractC1549;
import p457.C5391;
import ᴵﹳ.ﹶˆ;

/* renamed from: ٴ.ˉי, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3365 extends AbstractC3372 {

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final ConnectivityManager f13184;

    public C3365(Context context, ﹶˆ r2) {
        super(context, r2);
        this.f13184 = (ConnectivityManager) this.f13190.getSystemService("connectivity");
    }

    @Override // p279.AbstractC3372
    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final IntentFilter mo8222() {
        return new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
    }

    @Override // p279.AbstractC3370
    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final Object mo8223() {
        return AbstractC3373.m8228(this.f13184);
    }

    @Override // p279.AbstractC3372
    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final void mo8224(Intent intent) {
        if (AbstractC1549.m5138(intent.getAction(), "android.net.conn.CONNECTIVITY_CHANGE")) {
            C5391.m12163().m12168(AbstractC3373.f13197, "Network broadcast received");
            m8227(AbstractC3373.m8228(this.f13184));
        }
    }
}
