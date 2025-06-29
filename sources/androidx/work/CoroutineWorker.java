package androidx.work;

import android.content.Context;
import p070.AbstractC1549;
import p072.AbstractC1642;
import p072.C1592;
import p278.AbstractC3362;
import p330.InterfaceC3746;
import p330.InterfaceC3747;
import p410.C4681;
import p457.AbstractC5366;
import p457.C5372;
import p457.C5378;
import p457.C5379;
import ᴵﹳ.ٴˎ;

/* loaded from: classes.dex */
public abstract class CoroutineWorker extends AbstractC5366 {

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final WorkerParameters f1750;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final C5378 f1751;

    public CoroutineWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.f1750 = workerParameters;
        this.f1751 = C5378.f20847;
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public abstract Object mo1367(InterfaceC3746 interfaceC3746);

    @Override // p457.AbstractC5366
    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C4681 mo1368() {
        C1592 c1592M5281 = AbstractC1642.m5281();
        C5378 c5378 = this.f1751;
        c5378.getClass();
        return AbstractC3362.m8192(ٴˎ.ˋⁱ(c5378, c1592M5281), new C5379(this, null));
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public Object mo1369() {
        throw new IllegalStateException("Not implemented");
    }

    @Override // p457.AbstractC5366
    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final C4681 mo1370() {
        C5378 c5378 = C5378.f20847;
        InterfaceC3747 interfaceC3747 = this.f1751;
        if (AbstractC1549.m5138(interfaceC3747, c5378)) {
            interfaceC3747 = this.f1750.f1758;
        }
        C1592 c1592M5281 = AbstractC1642.m5281();
        interfaceC3747.getClass();
        return AbstractC3362.m8192(ٴˎ.ˋⁱ(interfaceC3747, c1592M5281), new C5372(this, null));
    }
}
