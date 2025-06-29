package p202;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import androidx.leanback.widget.ʿˏ;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import p023.AbstractC1142;
import p023.AbstractC1148;
import p023.C1134;
import p023.C1144;
import p023.C1147;
import p023.InterfaceC1136;
import p072.AbstractC1636;
import p072.InterfaceC1643;
import p141.RunnableC2187;
import p331.C3759;
import p331.C3760;
import p331.C3768;
import p395.RunnableC4533;
import p406.AbstractC4662;
import p414.C4736;
import p414.C4737;
import p414.InterfaceC4712;
import p414.InterfaceC4728;
import p456.C5349;
import p457.C5357;
import p457.C5358;
import p457.C5368;
import p457.C5391;
import ᴵﹳ.ﹶˆ;
import ᵢ.ʿʼ;
import ﹶⁱ.ـﹶ;

/* renamed from: ˎᴵ.ˑʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2764 implements InterfaceC4728, InterfaceC1136, InterfaceC4712 {

    /* renamed from: ᵢٴ, reason: contains not printable characters */
    public static final String f10797 = C5391.m12164("GreedyScheduler");

    /* renamed from: ʾʼ, reason: contains not printable characters */
    public final C1147 f10798;

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public final C5349 f10801;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final C2765 f10802;

    /* renamed from: ˑⁱ, reason: contains not printable characters */
    public final C2766 f10803;

    /* renamed from: ˑﾞ, reason: contains not printable characters */
    public final ﹶˆ f10804;

    /* renamed from: ـˆ, reason: contains not printable characters */
    public final C5357 f10805;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public boolean f10806;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final Context f10807;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public final C4736 f10810;

    /* renamed from: ﾞᐧ, reason: contains not printable characters */
    public Boolean f10811;

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final HashMap f10799 = new HashMap();

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final Object f10800 = new Object();

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final C3759 f10809 = new C3759((byte) 0, 17);

    /* renamed from: ᴵʼ, reason: contains not printable characters */
    public final HashMap f10808 = new HashMap();

    public C2764(Context context, C5357 c5357, ʿˏ r6, C4736 c4736, C5349 c5349, ﹶˆ r9) {
        this.f10807 = context;
        C5368 c5368 = c5357.f20795;
        ʿʼ r1 = c5357.f20794;
        this.f10802 = new C2765(this, r1, c5368);
        this.f10803 = new C2766(r1, c5349);
        this.f10804 = r9;
        this.f10798 = new C1147(r6);
        this.f10805 = c5357;
        this.f10810 = c4736;
        this.f10801 = c5349;
    }

    @Override // p414.InterfaceC4712
    /* renamed from: ʽᐧ */
    public final void mo1386(C3760 c3760, boolean z) {
        C4737 c4737M8753 = this.f10809.m8753(c3760);
        if (c4737M8753 != null) {
            this.f10803.m7041(c4737M8753);
        }
        m7034(c3760);
        if (z) {
            return;
        }
        synchronized (this.f10800) {
            this.f10808.remove(c3760);
        }
    }

    @Override // p414.InterfaceC4728
    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final void mo7032(C3768... c3768Arr) {
        if (this.f10811 == null) {
            this.f10811 = Boolean.valueOf(AbstractC4662.m10567(this.f10807));
        }
        if (!this.f10811.booleanValue()) {
            C5391.m12163().m12169(f10797, "Ignoring schedule request in a secondary process");
            return;
        }
        if (!this.f10806) {
            this.f10810.m10651(this);
            this.f10806 = true;
        }
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (C3768 c3768 : c3768Arr) {
            if (!this.f10809.m8754(ـﹶ.ˋˊ(c3768))) {
                long jMax = Math.max(c3768.m8818(), m7035(c3768));
                this.f10805.f20795.getClass();
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (c3768.f14562 == 1) {
                    if (jCurrentTimeMillis < jMax) {
                        C2765 c2765 = this.f10802;
                        if (c2765 != null) {
                            HashMap map = c2765.f10816;
                            Runnable runnable = (Runnable) map.remove(c3768.f14575);
                            ʿʼ r11 = c2765.f10813;
                            if (runnable != null) {
                                ((Handler) r11.ˆʿ).removeCallbacks(runnable);
                            }
                            RunnableC4533 runnableC4533 = new RunnableC4533(27, c2765, c3768, false);
                            map.put(c3768.f14575, runnableC4533);
                            c2765.f10814.getClass();
                            ((Handler) r11.ˆʿ).postDelayed(runnableC4533, jMax - System.currentTimeMillis());
                        }
                    } else if (c3768.m8817()) {
                        C5358 c5358 = c3768.f14565;
                        int i = Build.VERSION.SDK_INT;
                        if (i >= 23 && c5358.f20805) {
                            C5391.m12163().m12168(f10797, "Ignoring " + c3768 + ". Requires device idle.");
                        } else if (i < 24 || !c5358.m12152()) {
                            hashSet.add(c3768);
                            hashSet2.add(c3768.f14575);
                        } else {
                            C5391.m12163().m12168(f10797, "Ignoring " + c3768 + ". Requires ContentUri triggers.");
                        }
                    } else if (!this.f10809.m8754(ـﹶ.ˋˊ(c3768))) {
                        C5391.m12163().m12168(f10797, "Starting work for " + c3768.f14575);
                        C4737 c4737M8758 = this.f10809.m8758(ـﹶ.ˋˊ(c3768));
                        this.f10803.m7042(c4737M8758);
                        C5349 c5349 = this.f10801;
                        c5349.getClass();
                        ((ﹶˆ) c5349.f20757).ˏᴵ(new RunnableC2187(c5349, c4737M8758, null, 11));
                    }
                }
            }
        }
        synchronized (this.f10800) {
            try {
                if (!hashSet.isEmpty()) {
                    C5391.m12163().m12168(f10797, "Starting tracking for " + TextUtils.join(",", hashSet2));
                    Iterator it = hashSet.iterator();
                    while (it.hasNext()) {
                        C3768 c37682 = (C3768) it.next();
                        C3760 c3760 = ـﹶ.ˋˊ(c37682);
                        if (!this.f10799.containsKey(c3760)) {
                            this.f10799.put(c3760, AbstractC1148.m4175(this.f10798, c37682, (AbstractC1636) this.f10804.ˆʿ, this));
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p023.InterfaceC1136
    /* renamed from: ˑʽ */
    public final void mo4159(C3768 c3768, AbstractC1142 abstractC1142) {
        C3760 c3760 = ـﹶ.ˋˊ(c3768);
        boolean z = abstractC1142 instanceof C1144;
        C5349 c5349 = this.f10801;
        C2766 c2766 = this.f10803;
        String str = f10797;
        C3759 c3759 = this.f10809;
        if (!z) {
            C5391.m12163().m12168(str, "Constraints not met: Cancelling work ID " + c3760);
            C4737 c4737M8753 = c3759.m8753(c3760);
            if (c4737M8753 != null) {
                c2766.m7041(c4737M8753);
                c5349.m12103(c4737M8753, ((C1134) abstractC1142).f4762);
                return;
            }
            return;
        }
        if (c3759.m8754(c3760)) {
            return;
        }
        C5391.m12163().m12168(str, "Constraints met: Scheduling work ID " + c3760);
        C4737 c4737M8758 = c3759.m8758(c3760);
        c2766.m7042(c4737M8758);
        c5349.getClass();
        ((ﹶˆ) c5349.f20757).ˏᴵ(new RunnableC2187(c5349, c4737M8758, null, 11));
    }

    @Override // p414.InterfaceC4728
    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void mo7033(String str) {
        Runnable runnable;
        if (this.f10811 == null) {
            this.f10811 = Boolean.valueOf(AbstractC4662.m10567(this.f10807));
        }
        boolean zBooleanValue = this.f10811.booleanValue();
        String str2 = f10797;
        if (!zBooleanValue) {
            C5391.m12163().m12169(str2, "Ignoring schedule request in non-main process");
            return;
        }
        if (!this.f10806) {
            this.f10810.m10651(this);
            this.f10806 = true;
        }
        C5391.m12163().m12168(str2, "Cancelling work ID " + str);
        C2765 c2765 = this.f10802;
        if (c2765 != null && (runnable = (Runnable) c2765.f10816.remove(str)) != null) {
            ((Handler) c2765.f10813.ˆʿ).removeCallbacks(runnable);
        }
        for (C4737 c4737 : this.f10809.m8759(str)) {
            this.f10803.m7041(c4737);
            this.f10801.m12103(c4737, -512);
        }
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final void m7034(C3760 c3760) {
        InterfaceC1643 interfaceC1643;
        synchronized (this.f10800) {
            interfaceC1643 = (InterfaceC1643) this.f10799.remove(c3760);
        }
        if (interfaceC1643 != null) {
            C5391.m12163().m12168(f10797, "Stopping tracking for " + c3760);
            interfaceC1643.mo5172(null);
        }
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final long m7035(C3768 c3768) {
        long jMax;
        synchronized (this.f10800) {
            try {
                C3760 c3760 = ـﹶ.ˋˊ(c3768);
                C2763 c2763 = (C2763) this.f10808.get(c3760);
                if (c2763 == null) {
                    int i = c3768.f14570;
                    this.f10805.f20795.getClass();
                    c2763 = new C2763(i, System.currentTimeMillis());
                    this.f10808.put(c3760, c2763);
                }
                jMax = (Math.max((c3768.f14570 - c2763.f10796) - 5, 0) * 30000) + c2763.f10795;
            } catch (Throwable th) {
                throw th;
            }
        }
        return jMax;
    }

    @Override // p414.InterfaceC4728
    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final boolean mo7036() {
        return false;
    }
}
