package p076;

import android.os.SystemClock;

/* renamed from: ʿˉ.ٴˎ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final /* synthetic */ class C1664 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final /* synthetic */ C1660 f6500;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void m5339(int i) {
        C1660 c1660 = this.f6500;
        synchronized (c1660) {
            int i2 = c1660.f6486;
            if (i2 == 0 || c1660.f6493) {
                if (i2 == i) {
                    return;
                }
                c1660.f6486 = i;
                if (i != 1 && i != 0 && i != 8) {
                    c1660.f6487 = c1660.m5337(i);
                    c1660.f6489.getClass();
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    c1660.m5338(c1660.f6491 > 0 ? (int) (jElapsedRealtime - c1660.f6492) : 0, c1660.f6488, c1660.f6487);
                    c1660.f6492 = jElapsedRealtime;
                    c1660.f6488 = 0L;
                    c1660.f6484 = 0L;
                    c1660.f6494 = 0L;
                    C1669 c1669 = c1660.f6483;
                    c1669.f6511.clear();
                    c1669.f6517 = -1;
                    c1669.f6512 = 0;
                    c1669.f6515 = 0;
                }
            }
        }
    }
}
