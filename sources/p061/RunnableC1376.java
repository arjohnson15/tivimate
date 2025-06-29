package p061;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: ʾـ.ˊᵔ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class RunnableC1376 implements Runnable {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final /* synthetic */ RecyclerView f5626;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final /* synthetic */ int f5627;

    public /* synthetic */ RunnableC1376(RecyclerView recyclerView, int i) {
        this.f5627 = i;
        this.f5626 = recyclerView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5627) {
            case 0:
                RecyclerView recyclerView = this.f5626;
                if (recyclerView.f1671 && !recyclerView.isLayoutRequested()) {
                    if (!recyclerView.f1704) {
                        recyclerView.requestLayout();
                        break;
                    } else if (!recyclerView.f1661) {
                        recyclerView.m1303();
                        break;
                    } else {
                        recyclerView.f1700 = true;
                        break;
                    }
                }
                break;
            default:
                RecyclerView recyclerView2 = this.f5626;
                AbstractC1371 abstractC1371 = recyclerView2.f1682;
                if (abstractC1371 != null) {
                    abstractC1371.mo4752();
                }
                recyclerView2.f1686 = false;
                break;
        }
    }
}
