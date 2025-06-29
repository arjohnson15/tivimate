package p061;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.leanback.widget.ﾞᐧ;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;
import p204.C2784;
import p378.C4332;

/* renamed from: ʾـ.ᐧᴵ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1406 extends C4332 {

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final WeakHashMap f5738 = new WeakHashMap();

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final C1436 f5739;

    public C1406(C1436 c1436) {
        this.f5739 = c1436;
    }

    @Override // p378.C4332
    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final ﾞᐧ mo4881(View view) {
        C4332 c4332 = (C4332) this.f5738.get(view);
        return c4332 != null ? c4332.mo4881(view) : super.mo4881(view);
    }

    @Override // p378.C4332
    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final void mo4882(View view, AccessibilityEvent accessibilityEvent) {
        C4332 c4332 = (C4332) this.f5738.get(view);
        if (c4332 != null) {
            c4332.mo4882(view, accessibilityEvent);
        } else {
            super.mo4882(view, accessibilityEvent);
        }
    }

    @Override // p378.C4332
    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final void mo4883(View view, int i) {
        C4332 c4332 = (C4332) this.f5738.get(view);
        if (c4332 != null) {
            c4332.mo4883(view, i);
        } else {
            super.mo4883(view, i);
        }
    }

    @Override // p378.C4332
    /* renamed from: ˑʽ */
    public final void mo2855(View view, AccessibilityEvent accessibilityEvent) {
        C4332 c4332 = (C4332) this.f5738.get(view);
        if (c4332 != null) {
            c4332.mo2855(view, accessibilityEvent);
        } else {
            super.mo2855(view, accessibilityEvent);
        }
    }

    @Override // p378.C4332
    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final boolean mo4884(View view, AccessibilityEvent accessibilityEvent) {
        C4332 c4332 = (C4332) this.f5738.get(view);
        return c4332 != null ? c4332.mo4884(view, accessibilityEvent) : this.f16820.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // p378.C4332
    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final boolean mo4885(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        C4332 c4332 = (C4332) this.f5738.get(viewGroup);
        return c4332 != null ? c4332.mo4885(viewGroup, view, accessibilityEvent) : this.f16820.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    @Override // p378.C4332
    /* renamed from: ᐧʻ */
    public final boolean mo2856(View view, int i, Bundle bundle) {
        C1436 c1436 = this.f5739;
        if (!c1436.f5882.m1304()) {
            RecyclerView recyclerView = c1436.f5882;
            if (recyclerView.getLayoutManager() != null) {
                C4332 c4332 = (C4332) this.f5738.get(view);
                if (c4332 != null) {
                    if (c4332.mo2856(view, i, bundle)) {
                        return true;
                    }
                } else if (super.mo2856(view, i, bundle)) {
                    return true;
                }
                C1429 c1429 = recyclerView.getLayoutManager().f5717.f1677;
                return false;
            }
        }
        return super.mo2856(view, i, bundle);
    }

    @Override // p378.C4332
    /* renamed from: ﹳﹳ */
    public final void mo2857(View view, C2784 c2784) {
        C1436 c1436 = this.f5739;
        boolean zM1304 = c1436.f5882.m1304();
        View.AccessibilityDelegate accessibilityDelegate = this.f16820;
        AccessibilityNodeInfo accessibilityNodeInfo = c2784.f10848;
        if (!zM1304) {
            RecyclerView recyclerView = c1436.f5882;
            if (recyclerView.getLayoutManager() != null) {
                recyclerView.getLayoutManager().m4825(view, c2784);
                C4332 c4332 = (C4332) this.f5738.get(view);
                if (c4332 != null) {
                    c4332.mo2857(view, c2784);
                    return;
                } else {
                    accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                    return;
                }
            }
        }
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
    }

    @Override // p378.C4332
    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final void mo4886(View view, AccessibilityEvent accessibilityEvent) {
        C4332 c4332 = (C4332) this.f5738.get(view);
        if (c4332 != null) {
            c4332.mo4886(view, accessibilityEvent);
        } else {
            super.mo4886(view, accessibilityEvent);
        }
    }
}
