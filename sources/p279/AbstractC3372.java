package p279;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import p009.C0996;
import p457.C5391;
import ᴵﹳ.ﹶˆ;

/* renamed from: ٴ.ﹳﹳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC3372 extends AbstractC3370 {

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final C0996 f13196;

    public AbstractC3372(Context context, ﹶˆ r2) {
        super(context, r2);
        this.f13196 = new C0996(3, this);
    }

    /* renamed from: ʿʼ */
    public abstract IntentFilter mo8222();

    @Override // p279.AbstractC3370
    /* renamed from: ˑʽ */
    public final void mo8225() {
        C5391.m12163().m12168(AbstractC3364.f13183, getClass().getSimpleName().concat(": registering receiver"));
        this.f13190.registerReceiver(this.f13196, mo8222());
    }

    /* renamed from: ٴˎ */
    public abstract void mo8224(Intent intent);

    @Override // p279.AbstractC3370
    /* renamed from: ﹳﹳ */
    public final void mo8226() {
        C5391.m12163().m12168(AbstractC3364.f13183, getClass().getSimpleName().concat(": unregistering receiver"));
        this.f13190.unregisterReceiver(this.f13196);
    }
}
