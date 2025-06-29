package p192;

import android.os.Trace;
import com.google.android.gms.internal.measurement.C0395;
import p293.AbstractBinderC3468;
import p453.AbstractC5202;

/* renamed from: ˎˉ.ˉⁱ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class RunnableC2657 implements Runnable {

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final /* synthetic */ int f10536;

    public RunnableC2657(AbstractBinderC3468 abstractBinderC3468) {
        this.f10536 = 1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f10536) {
            case 0:
                try {
                    int i = AbstractC5202.f20025;
                    Trace.beginSection("EmojiCompat.EmojiCompatInitializer.run");
                    if (C2676.f10575 != null) {
                        C2676.m6853().m6856();
                    }
                    Trace.endSection();
                    return;
                } catch (Throwable th) {
                    int i2 = AbstractC5202.f20025;
                    Trace.endSection();
                    throw th;
                }
            case 1:
                throw null;
            default:
                C0395.f2666.incrementAndGet();
                return;
        }
    }
}
