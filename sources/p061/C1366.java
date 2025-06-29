package p061;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: ʾـ.ʿˊ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1366 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final /* synthetic */ RecyclerView f5546;

    public /* synthetic */ C1366(RecyclerView recyclerView) {
        this.f5546 = recyclerView;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public void m4741(int i) {
        RecyclerView recyclerView = this.f5546;
        View childAt = recyclerView.getChildAt(i);
        if (childAt != null) {
            AbstractC1375 abstractC1375M1270 = RecyclerView.m1270(childAt);
            AbstractC1373 abstractC1373 = recyclerView.f1684;
            if (abstractC1373 != null && abstractC1375M1270 != null) {
                abstractC1373.m4761(abstractC1375M1270);
            }
            childAt.clearAnimation();
        }
        recyclerView.removeViewAt(i);
    }
}
