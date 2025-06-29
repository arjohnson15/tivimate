package androidx.fragment.app;

import android.support.v4.media.session.AbstractC0002;
import android.util.Log;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import p013.AbstractC1041;
import p080.AbstractC1702;
import p291.AbstractC3459;
import ـˈ.ˉᵎ;

/* renamed from: androidx.fragment.app.ˆᵔ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0091 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public int f549;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public boolean f550;

    /* renamed from: ˉי, reason: contains not printable characters */
    public final ArrayList f551;

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public final C0109 f552;

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public final ArrayList f553;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public boolean f554;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final AbstractComponentCallbacksC0100 f555;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public int f556;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public boolean f557;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public boolean f558;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final ArrayList f559;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public boolean f560;

    public C0091(int i, int i2, C0109 c0109) {
        AbstractComponentCallbacksC0100 abstractComponentCallbacksC0100 = c0109.f677;
        this.f556 = i;
        this.f549 = i2;
        this.f555 = abstractComponentCallbacksC0100;
        this.f559 = new ArrayList();
        this.f560 = true;
        ArrayList arrayList = new ArrayList();
        this.f551 = arrayList;
        this.f553 = arrayList;
        this.f552 = c0109;
    }

    public final String toString() {
        StringBuilder sbM50 = AbstractC0002.m50("Operation {", Integer.toHexString(System.identityHashCode(this)), "} {finalState = ");
        sbM50.append(ˉᵎ.ﾞˊ(this.f556));
        sbM50.append(" lifecycleImpact = ");
        sbM50.append(ˉᵎ.ˋˊ(this.f549));
        sbM50.append(" fragment = ");
        sbM50.append(this.f555);
        sbM50.append('}');
        return sbM50.toString();
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final void m601() {
        this.f554 = false;
        if (!this.f557) {
            if (Log.isLoggable("FragmentManager", 2)) {
                String str = "SpecialEffectsController: " + this + " has called complete.";
            }
            this.f557 = true;
            Iterator it = this.f559.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        }
        this.f555.mTransitioning = false;
        this.f552.m719();
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final void m602(AbstractC3459 abstractC3459) {
        ArrayList arrayList = this.f551;
        if (arrayList.remove(abstractC3459) && arrayList.isEmpty()) {
            m601();
        }
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void m603(ViewGroup viewGroup) {
        this.f554 = false;
        if (this.f550) {
            return;
        }
        this.f550 = true;
        if (this.f551.isEmpty()) {
            m601();
            return;
        }
        for (AbstractC3459 abstractC3459 : AbstractC1041.m4016(this.f553)) {
            if (!abstractC3459.f13389) {
                abstractC3459.mo588(viewGroup);
            }
            abstractC3459.f13389 = true;
        }
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final void m604(int i, int i2) {
        int iM5411 = AbstractC1702.m5411(i2);
        AbstractComponentCallbacksC0100 abstractComponentCallbacksC0100 = this.f555;
        if (iM5411 == 0) {
            if (this.f556 != 1) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    String str = "SpecialEffectsController: For fragment " + abstractComponentCallbacksC0100 + " mFinalState = " + ˉᵎ.ﾞˊ(this.f556) + " -> " + ˉᵎ.ﾞˊ(i) + '.';
                }
                this.f556 = i;
                return;
            }
            return;
        }
        if (iM5411 == 1) {
            if (this.f556 == 1) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    String str2 = "SpecialEffectsController: For fragment " + abstractComponentCallbacksC0100 + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + ˉᵎ.ˋˊ(this.f549) + " to ADDING.";
                }
                this.f556 = 2;
                this.f549 = 2;
                this.f560 = true;
                return;
            }
            return;
        }
        if (iM5411 != 2) {
            return;
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            String str3 = "SpecialEffectsController: For fragment " + abstractComponentCallbacksC0100 + " mFinalState = " + ˉᵎ.ﾞˊ(this.f556) + " -> REMOVED. mLifecycleImpact  = " + ˉᵎ.ˋˊ(this.f549) + " to REMOVING.";
        }
        this.f556 = 1;
        this.f549 = 3;
        this.f560 = true;
    }
}
