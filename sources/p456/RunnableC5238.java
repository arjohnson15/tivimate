package p456;

import android.content.pm.PackageManager;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicReference;
import p438.C5105;
import ʿﾞ.ﹳﹳ;

/* renamed from: ﾞⁱ.ʼᵎ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class RunnableC5238 implements Runnable {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final /* synthetic */ long f20128;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final /* synthetic */ C5244 f20129;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final /* synthetic */ int f20130;

    public /* synthetic */ RunnableC5238(C5244 c5244, long j, int i) {
        this.f20130 = i;
        this.f20128 = j;
        this.f20129 = c5244;
    }

    @Override // java.lang.Runnable
    public final void run() throws IllegalAccessException, PackageManager.NameNotFoundException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
        switch (this.f20130) {
            case 0:
                C5244 c5244 = this.f20129;
                C5105 c5105 = c5244.ᐧᴵ().f20463;
                long j = this.f20128;
                c5105.m11314(j);
                C5301 c5301 = c5244.ˏᵢ();
                c5301.f20567.m4531(Long.valueOf(j), "Session timeout duration set");
                break;
            default:
                C5244 c52442 = this.f20129;
                c52442.m11697(true, this.f20128);
                ((C5236) ((ﹳﹳ) c52442).ᐧⁱ).m11652().m11786(new AtomicReference());
                break;
        }
    }
}
