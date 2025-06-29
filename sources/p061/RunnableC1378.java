package p061;

import android.os.Trace;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import p453.AbstractC5202;
import ʽᵔ.ʽⁱ;

/* renamed from: ʾـ.ˋˉ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class RunnableC1378 implements Runnable {

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public static final ThreadLocal f5629 = new ThreadLocal();

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public static final ʽⁱ f5630 = new ʽⁱ(4);

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public long f5631;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public long f5632;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public ArrayList f5633;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public ArrayList f5634;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static AbstractC1375 m4785(RecyclerView recyclerView, int i, long j) {
        int iM4792 = recyclerView.f1709.m4792();
        for (int i2 = 0; i2 < iM4792; i2++) {
            AbstractC1375 abstractC1375M1270 = RecyclerView.m1270(recyclerView.f1709.m4794(i2));
            if (abstractC1375M1270.f5612 == i && !abstractC1375M1270.m4784()) {
                return null;
            }
        }
        C1429 c1429 = recyclerView.f1677;
        try {
            recyclerView.m1318();
            AbstractC1375 abstractC1375M4960 = c1429.m4960(i, j);
            if (abstractC1375M4960 != null) {
                if (!abstractC1375M4960.m4774() || abstractC1375M4960.m4784()) {
                    c1429.m4965(abstractC1375M4960, false);
                } else {
                    c1429.m4970(abstractC1375M4960.f5618);
                }
            }
            recyclerView.m1330(false);
            return abstractC1375M4960;
        } catch (Throwable th) {
            recyclerView.m1330(false);
            throw th;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            int i = AbstractC5202.f20025;
            Trace.beginSection("RV Prefetch");
            ArrayList arrayList = this.f5634;
            if (arrayList.isEmpty()) {
                this.f5631 = 0L;
                Trace.endSection();
                return;
            }
            int size = arrayList.size();
            long jMax = 0;
            for (int i2 = 0; i2 < size; i2++) {
                RecyclerView recyclerView = (RecyclerView) arrayList.get(i2);
                if (recyclerView.getWindowVisibility() == 0) {
                    jMax = Math.max(recyclerView.getDrawingTime(), jMax);
                }
            }
            if (jMax == 0) {
                this.f5631 = 0L;
                Trace.endSection();
            } else {
                m4786(TimeUnit.MILLISECONDS.toNanos(jMax) + this.f5632);
                this.f5631 = 0L;
                Trace.endSection();
            }
        } catch (Throwable th) {
            this.f5631 = 0L;
            int i3 = AbstractC5202.f20025;
            Trace.endSection();
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x0135  */
    /* renamed from: ʽᐧ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m4786(long r17) {
        /*
            Method dump skipped, instructions count: 326
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p061.RunnableC1378.m4786(long):void");
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void m4787(RecyclerView recyclerView, int i, int i2) {
        if (recyclerView.f1704) {
            if (RecyclerView.f1643 && !this.f5634.contains(recyclerView)) {
                throw new IllegalStateException("attempting to post unregistered view!");
            }
            if (this.f5631 == 0) {
                this.f5631 = recyclerView.getNanoTime();
                recyclerView.post(this);
            }
        }
        C1423 c1423 = recyclerView.f1718;
        c1423.f5793 = i;
        c1423.f5794 = i2;
    }
}
