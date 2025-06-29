package p041;

import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import p158.AbstractC2339;
import p363.AbstractC4133;
import p363.C4131;
import p379.C4399;
import p379.C4413;

/* renamed from: ʽˉ.ᴵʿ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1285 extends AbstractC4133 {

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final /* synthetic */ int f5284;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final /* synthetic */ Object f5285;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1285(Object obj, String str, int i) {
        super(str, true);
        this.f5284 = i;
        this.f5285 = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1285(C1278 c1278, String str) {
        super(str, true);
        this.f5284 = 0;
        this.f5285 = c1278;
    }

    @Override // p363.AbstractC4133
    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final long mo4576() throws IOException {
        switch (this.f5284) {
            case 0:
                C1278 c1278 = (C1278) this.f5285;
                long jNanoTime = System.nanoTime();
                Iterator it = ((ConcurrentLinkedQueue) c1278.f5258).iterator();
                int i = 0;
                long j = Long.MIN_VALUE;
                C1276 c1276 = null;
                int i2 = 0;
                while (it.hasNext()) {
                    C1276 c12762 = (C1276) it.next();
                    synchronized (c12762) {
                        if (c1278.m4561(c12762, jNanoTime) > 0) {
                            i2++;
                        } else {
                            i++;
                            long j2 = jNanoTime - c12762.f5253;
                            if (j2 > j) {
                                c1276 = c12762;
                                j = j2;
                            }
                        }
                    }
                }
                long j3 = c1278.f5257;
                if (j < j3 && i <= 5) {
                    if (i > 0) {
                        return j3 - j;
                    }
                    if (i2 > 0) {
                        return j3;
                    }
                    return -1L;
                }
                synchronized (c1276) {
                    if (!c1276.f5249.isEmpty()) {
                        return 0L;
                    }
                    if (c1276.f5253 + j != jNanoTime) {
                        return 0L;
                    }
                    c1276.f5242 = true;
                    ((ConcurrentLinkedQueue) c1278.f5258).remove(c1276);
                    AbstractC2339.m6447(c1276.f5254);
                    if (!((ConcurrentLinkedQueue) c1278.f5258).isEmpty()) {
                        return 0L;
                    }
                    ((C4131) c1278.f5259).m9480();
                    return 0L;
                }
            case 1:
                ((C4399) this.f5285).mo1053();
                return -1L;
            default:
                C4413 c4413 = (C4413) this.f5285;
                c4413.getClass();
                try {
                    c4413.f17008.m10033(2, false, 0);
                    return -1L;
                } catch (IOException e) {
                    c4413.m10022(2, 2, e);
                    return -1L;
                }
        }
    }
}
