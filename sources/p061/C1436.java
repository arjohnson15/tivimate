package p061;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import p204.C2784;
import p378.C4332;

/* renamed from: ʾـ.ﹶﾞ, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C1436 extends C4332 {

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final C1406 f5881;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final RecyclerView f5882;

    public C1436(RecyclerView recyclerView) {
        this.f5882 = recyclerView;
        C4332 c4332Mo4972 = mo4972();
        if (c4332Mo4972 == null || !(c4332Mo4972 instanceof C1406)) {
            this.f5881 = new C1406(this);
        } else {
            this.f5881 = (C1406) c4332Mo4972;
        }
    }

    /* renamed from: ˉי, reason: contains not printable characters */
    public C4332 mo4972() {
        return this.f5881;
    }

    @Override // p378.C4332
    /* renamed from: ˑʽ */
    public final void mo2855(View view, AccessibilityEvent accessibilityEvent) {
        super.mo2855(view, accessibilityEvent);
        if (!(view instanceof RecyclerView) || this.f5882.m1304()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().mo1255(accessibilityEvent);
        }
    }

    @Override // p378.C4332
    /* renamed from: ᐧʻ */
    public final boolean mo2856(View view, int i, Bundle bundle) {
        if (super.mo2856(view, i, bundle)) {
            return true;
        }
        RecyclerView recyclerView = this.f5882;
        if (recyclerView.m1304() || recyclerView.getLayoutManager() == null) {
            return false;
        }
        AbstractC1402 layoutManager = recyclerView.getLayoutManager();
        RecyclerView recyclerView2 = layoutManager.f5717;
        return layoutManager.mo847(i, recyclerView2.f1677, recyclerView2.f1705);
    }

    @Override // p378.C4332
    /* renamed from: ﹳﹳ */
    public final void mo2857(View view, C2784 c2784) {
        this.f16820.onInitializeAccessibilityNodeInfo(view, c2784.f10848);
        RecyclerView recyclerView = this.f5882;
        if (recyclerView.m1304() || recyclerView.getLayoutManager() == null) {
            return;
        }
        AbstractC1402 layoutManager = recyclerView.getLayoutManager();
        RecyclerView recyclerView2 = layoutManager.f5717;
        layoutManager.mo793(recyclerView2.f1677, recyclerView2.f1705, c2784);
    }
}
