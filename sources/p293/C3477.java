package p293;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.leanback.widget.RunnableC0183;
import p456.C5349;

/* renamed from: ٴᵎ.ᴵʿ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3477 extends BroadcastReceiver {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final C5349 f13431;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public Context f13432;

    public C3477(C5349 c5349) {
        this.f13431 = c5349;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Uri data = intent.getData();
        if ("com.google.android.gms".equals(data != null ? data.getSchemeSpecificPart() : null)) {
            ((RunnableC0183) this.f13431.f20757).getClass();
            throw null;
        }
    }
}
