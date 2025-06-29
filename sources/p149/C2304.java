package p149;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import p061.AbstractC1360;
import p061.AbstractC1375;

/* renamed from: ˊʾ.ᵎˏ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2304 extends AbstractC1360 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public int f9093;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public boolean f9094 = true;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public Drawable f9095;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC2282 f9096;

    public C2304(AbstractC2282 abstractC2282) {
        this.f9096 = abstractC2282;
    }

    @Override // p061.AbstractC1360
    /* renamed from: ˑʽ */
    public final void mo4727(Canvas canvas, RecyclerView recyclerView) {
        if (this.f9095 == null) {
            return;
        }
        int childCount = recyclerView.getChildCount();
        int width = recyclerView.getWidth();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            if (m6348(childAt, recyclerView)) {
                int height = childAt.getHeight() + ((int) childAt.getY());
                this.f9095.setBounds(0, height, width, this.f9093 + height);
                this.f9095.draw(canvas);
            }
        }
    }

    @Override // p061.AbstractC1360
    /* renamed from: ـﹶ */
    public final void mo4728(Rect rect, View view, RecyclerView recyclerView) {
        if (m6348(view, recyclerView)) {
            rect.bottom = this.f9093;
        }
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final boolean m6348(View view, RecyclerView recyclerView) {
        AbstractC1375 abstractC1375M1331 = recyclerView.m1331(view);
        boolean z = false;
        if (!(abstractC1375M1331 instanceof C2302) || !((C2302) abstractC1375M1331).f9088) {
            return false;
        }
        boolean z2 = this.f9094;
        int iIndexOfChild = recyclerView.indexOfChild(view);
        if (iIndexOfChild >= recyclerView.getChildCount() - 1) {
            return z2;
        }
        AbstractC1375 abstractC1375M13312 = recyclerView.m1331(recyclerView.getChildAt(iIndexOfChild + 1));
        if ((abstractC1375M13312 instanceof C2302) && ((C2302) abstractC1375M13312).f9091) {
            z = true;
        }
        return z;
    }
}
