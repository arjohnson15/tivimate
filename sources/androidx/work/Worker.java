package androidx.work;

import android.content.Context;
import p031.C1195;
import p410.C4681;
import p457.AbstractC5366;
import p457.C5365;
import p457.C5385;
import ﾞﹶ.ᵢʿ;

/* loaded from: classes.dex */
public abstract class Worker extends AbstractC5366 {
    public Worker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public abstract C5385 mo1371();

    @Override // p457.AbstractC5366
    /* renamed from: ـﹶ */
    public final C4681 mo1368() {
        return ᵢʿ.ᴵʿ(new C1195(this.f20826.f1754, new C5365(this, 0)));
    }

    @Override // p457.AbstractC5366
    /* renamed from: ﹳﹳ */
    public final C4681 mo1370() {
        return ᵢʿ.ᴵʿ(new C1195(this.f20826.f1754, new C5365(this, 1)));
    }
}
