package p076;

import android.content.Context;
import android.os.Handler;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import p000.InterfaceC0880;
import p033.C1210;
import p033.C1218;
import p033.C1220;
import p345.AbstractC3968;
import p345.AbstractC3980;
import p345.C3930;
import p345.C3932;
import p374.C4290;
import p375.C4305;
import p383.C4456;
import p383.C4460;
import ʻˉ.ᐧˋ;
import ʾי.ˑʽ;

/* renamed from: ʿˉ.ˏᵢ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1660 implements InterfaceC1670, InterfaceC0880 {

    /* renamed from: ﹳˎ, reason: contains not printable characters */
    public static C1660 f6481;

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final ˑʽ f6482 = new ˑʽ(19);

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final C1669 f6483;

    /* renamed from: ˉי, reason: contains not printable characters */
    public long f6484;

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public long f6485;

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public int f6486;

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public long f6487;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public long f6488;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final C4460 f6489;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C3930 f6490;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public int f6491;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public long f6492;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final boolean f6493;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public long f6494;

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public static final C3932 f6478 = AbstractC3980.m9212(4300000L, 3200000L, 2400000L, 1700000L, 860000L);

    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public static final C3932 f6476 = AbstractC3980.m9212(1500000L, 980000L, 750000L, 520000L, 290000L);

    /* renamed from: ˑי, reason: contains not printable characters */
    public static final C3932 f6477 = AbstractC3980.m9212(2000000L, 1300000L, 1000000L, 860000L, 610000L);

    /* renamed from: ᵎـ, reason: contains not printable characters */
    public static final C3932 f6480 = AbstractC3980.m9212(2500000L, 1700000L, 1200000L, 970000L, 680000L);

    /* renamed from: ˎٴ, reason: contains not printable characters */
    public static final C3932 f6475 = AbstractC3980.m9212(4700000L, 2800000L, 2100000L, 1700000L, 980000L);

    /* renamed from: ᵎˏ, reason: contains not printable characters */
    public static final C3932 f6479 = AbstractC3980.m9212(2700000L, 2000000L, 1600000L, 1300000L, 1000000L);

    public C1660(Context context, HashMap map, int i, C4460 c4460, boolean z) {
        this.f6490 = C3930.m9140(map);
        this.f6483 = new C1669(i);
        this.f6489 = c4460;
        this.f6493 = z;
        if (context == null) {
            this.f6486 = 0;
            this.f6487 = m5337(0);
            return;
        }
        C4456 c4456M10067 = C4456.m10067(context);
        int iM10073 = c4456M10067.m10073();
        this.f6486 = iM10073;
        this.f6487 = m5337(iM10073);
        C1664 c1664 = new C1664(this);
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) c4456M10067.f17164;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            if (weakReference.get() == null) {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
        copyOnWriteArrayList.add(new WeakReference(c1664));
        ((Handler) c4456M10067.f17163).post(new ᐧˋ(c4456M10067, 27, c1664));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0011  */
    /* renamed from: ـﹶ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int[] m5336(java.lang.String r8) {
        /*
            Method dump skipped, instructions count: 8582
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p076.C1660.m5336(java.lang.String):int[]");
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final long m5337(int i) {
        Integer numValueOf = Integer.valueOf(i);
        C3930 c3930 = this.f6490;
        Long l = (Long) c3930.get(numValueOf);
        if (l == null) {
            l = (Long) c3930.get(0);
        }
        if (l == null) {
            l = 1000000L;
        }
        return l.longValue();
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final void m5338(final int i, final long j, final long j2) {
        if (i == 0 && j == 0 && j2 == this.f6485) {
            return;
        }
        this.f6485 = j2;
        Iterator it = ((CopyOnWriteArrayList) this.f6482.ˆʿ).iterator();
        while (it.hasNext()) {
            final C1661 c1661 = (C1661) it.next();
            if (!c1661.f6496) {
                c1661.f6497.post(new Runnable() { // from class: ʿˉ.ʽᐧ
                    @Override // java.lang.Runnable
                    public final void run() {
                        C1220 c1220 = c1661.f6495;
                        C4305 c4305 = c1220.f5016;
                        C1218 c1218M4366 = c1220.m4366(((AbstractC3980) c4305.f16745).isEmpty() ? null : (C4290) AbstractC3968.m9180((AbstractC3980) c4305.f16745));
                        c1220.m4338(c1218M4366, 1006, new C1210(c1218M4366, i, j, j2));
                    }
                });
            }
        }
    }
}
