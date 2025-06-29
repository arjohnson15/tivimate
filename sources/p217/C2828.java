package p217;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;
import p070.AbstractC1549;
import p072.AbstractC1586;
import p072.AbstractC1636;
import p072.AbstractC1642;
import p072.C1588;
import p072.C1602;
import p072.InterfaceC1621;
import p072.InterfaceC1639;
import p072.RunnableC1625;
import p148.AbstractC2262;
import p148.AbstractC2269;
import p148.C2272;
import p253.C3150;
import p253.ExecutorC3146;
import p330.InterfaceC3747;
import p395.RunnableC4533;
import ᵎﹳ.ᐧʻ;
import ᵢˈ.ـﹶ;

/* renamed from: ˏˏ.ﹳﹳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2828 extends AbstractC1636 implements InterfaceC1621 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final Handler f10975;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final C2828 f10976;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final String f10977;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final boolean f10978;

    public C2828(Handler handler) {
        this(handler, null, false);
    }

    public C2828(Handler handler, String str, boolean z) {
        this.f10975 = handler;
        this.f10977 = str;
        this.f10978 = z;
        this.f10976 = z ? this : new C2828(handler, str, true);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C2828) {
            C2828 c2828 = (C2828) obj;
            if (c2828.f10975 == this.f10975 && c2828.f10978 == this.f10978) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f10975) ^ (this.f10978 ? 1231 : 1237);
    }

    @Override // p072.AbstractC1636
    public final String toString() {
        C2828 c2828;
        String str;
        C3150 c3150 = AbstractC1586.f6345;
        C2828 c28282 = AbstractC2262.f8994;
        if (this == c28282) {
            str = "Dispatchers.Main";
        } else {
            try {
                c2828 = c28282.f10976;
            } catch (UnsupportedOperationException unused) {
                c2828 = null;
            }
            str = this == c2828 ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        String string = this.f10977;
        if (string == null) {
            string = this.f10975.toString();
        }
        return this.f10978 ? ᐧʻ.ˉⁱ(string, ".immediate") : string;
    }

    @Override // p072.InterfaceC1621
    /* renamed from: ʿʼ */
    public final void mo5197(long j, C1602 c1602) {
        RunnableC4533 runnableC4533 = new RunnableC4533(c1602, 28, this);
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (this.f10975.postDelayed(runnableC4533, j)) {
            c1602.m5219(new ـﹶ(this, 1, runnableC4533));
        } else {
            m7103(c1602.f6371, runnableC4533);
        }
    }

    @Override // p072.AbstractC1636
    /* renamed from: ˈﹳ */
    public final void mo5198(InterfaceC3747 interfaceC3747, Runnable runnable) {
        if (this.f10975.post(runnable)) {
            return;
        }
        m7103(interfaceC3747, runnable);
    }

    /* renamed from: ـᵎ, reason: contains not printable characters */
    public final void m7103(InterfaceC3747 interfaceC3747, Runnable runnable) {
        AbstractC1642.m5282(interfaceC3747, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        C3150 c3150 = AbstractC1586.f6345;
        ExecutorC3146.f12150.mo5198(interfaceC3747, runnable);
    }

    @Override // p072.AbstractC1636
    /* renamed from: ٴᐧ */
    public final boolean mo5276(InterfaceC3747 interfaceC3747) {
        return (this.f10978 && AbstractC1549.m5138(Looper.myLooper(), this.f10975.getLooper())) ? false : true;
    }

    @Override // p072.AbstractC1636
    /* renamed from: ٴﹶ */
    public AbstractC1636 mo5222(int i, String str) {
        AbstractC2269.m6283(1);
        return str != null ? new C2272(this, str) : this;
    }

    @Override // p072.InterfaceC1621
    /* renamed from: ᵎـ */
    public final InterfaceC1639 mo5200(long j, final RunnableC1625 runnableC1625, InterfaceC3747 interfaceC3747) {
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (this.f10975.postDelayed(runnableC1625, j)) {
            return new InterfaceC1639() { // from class: ˏˏ.ˑʽ
                @Override // p072.InterfaceC1639
                /* renamed from: ـﹶ */
                public final void mo5179() {
                    this.f10974.f10975.removeCallbacks(runnableC1625);
                }
            };
        }
        m7103(interfaceC3747, runnableC1625);
        return C1588.f6346;
    }
}
