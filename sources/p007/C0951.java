package p007;

import android.content.Context;
import android.os.SystemClock;
import android.util.Pair;
import androidx.leanback.widget.ﾞᐧ;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.CopyOnWriteArraySet;
import p166.AbstractC2435;
import p166.C2417;
import p166.C2431;
import p166.C2437;
import p200.C2753;
import p383.AbstractC4464;
import p383.AbstractC4470;
import p383.C4460;
import p383.C4469;

/* renamed from: ʻˉ.ˏᵢ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0951 {

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public static final ExecutorC0955 f4207 = new ExecutorC0955(0);

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final C0969 f4208;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final C4460 f4209;

    /* renamed from: ˉי, reason: contains not printable characters */
    public Pair f4210;

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public int f4211;

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public int f4212;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public InterfaceC0939 f4213;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final C0940 f4214;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C0957 f4215;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final CopyOnWriteArraySet f4216;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public C2431 f4217;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final C0938 f4218;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public C4469 f4219;

    public C0951(C0937 c0937) {
        C0957 c0957 = new C0957(this, (Context) c0937.f4128);
        this.f4215 = c0957;
        C4460 c4460 = (C4460) c0937.f4129;
        this.f4209 = c4460;
        C0969 c0969 = (C0969) c0937.f4126;
        this.f4208 = c0969;
        c0969.f4279 = c4460;
        this.f4214 = new C0940(new ﾞᐧ(5, this), c0969);
        C0938 c0938 = (C0938) c0937.f4125;
        AbstractC4464.m10146(c0938);
        this.f4218 = c0938;
        CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
        this.f4216 = copyOnWriteArraySet;
        this.f4211 = 0;
        copyOnWriteArraySet.add(c0957);
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void m3881(long j, long j2) {
        C0940 c0940;
        C2753 c2753;
        int i;
        if (this.f4212 != 0 || (i = (c2753 = (c0940 = this.f4214).f4137).f10768) == 0) {
            return;
        }
        if (i == 0) {
            throw new NoSuchElementException();
        }
        long j3 = ((long[]) c2753.f10767)[c2753.f10766];
        Long l = (Long) c0940.f4132.m7565(j3);
        C0969 c0969 = c0940.f4131;
        if (l != null && l.longValue() != c0940.f4140) {
            c0940.f4140 = l.longValue();
            c0969.m3935(2);
        }
        int iM3936 = c0940.f4131.m3936(j3, j, j2, c0940.f4140, false, c0940.f4135);
        C0951 c0951 = (C0951) c0940.f4136.ˆʿ;
        if (iM3936 != 0 && iM3936 != 1) {
            if (iM3936 != 2 && iM3936 != 3 && iM3936 != 4) {
                if (iM3936 != 5) {
                    throw new IllegalStateException(String.valueOf(iM3936));
                }
                return;
            }
            c0940.f4133 = j3;
            c2753.m7004();
            Iterator it = c0951.f4216.iterator();
            while (it.hasNext()) {
                C0957 c0957 = (C0957) it.next();
                c0957.f4238.execute(new RunnableC0956(c0957, c0957.f4232, 1));
            }
            AbstractC4464.m10146(null);
            throw null;
        }
        c0940.f4133 = j3;
        long jM7004 = c2753.m7004();
        C2437 c2437 = (C2437) c0940.f4139.m7565(jM7004);
        if (c2437 != null && !c2437.equals(C2437.f9721) && !c2437.equals(c0940.f4134)) {
            c0940.f4134 = c2437;
            C2417 c2417 = new C2417();
            c2417.f9607 = c2437.f9724;
            c2417.f9620 = c2437.f9722;
            c2417.f9602 = AbstractC2435.m6559("video/raw");
            c0951.f4217 = new C2431(c2417);
            Iterator it2 = c0951.f4216.iterator();
            while (it2.hasNext()) {
                C0957 c09572 = (C0957) it2.next();
                c09572.f4238.execute(new RunnableC0956(c09572, c09572.f4232, c2437));
            }
        }
        boolean z = c0969.f4277 != 3;
        c0969.f4277 = 3;
        c0969.f4279.getClass();
        c0969.f4285 = AbstractC4470.m10206(SystemClock.elapsedRealtime());
        if (z && c0951.f4210 != null) {
            Iterator it3 = c0951.f4216.iterator();
            while (it3.hasNext()) {
                C0957 c09573 = (C0957) it3.next();
                c09573.f4238.execute(new RunnableC0956(c09573, c09573.f4232, 2));
            }
        }
        if (c0951.f4213 != null) {
            C2431 c2431 = c0951.f4217;
            C2431 c24312 = c2431 == null ? new C2431(new C2417()) : c2431;
            InterfaceC0939 interfaceC0939 = c0951.f4213;
            c0951.f4209.getClass();
            interfaceC0939.mo3808(jM7004, System.nanoTime(), c24312, null);
        }
        AbstractC4464.m10146(null);
        throw null;
    }
}
