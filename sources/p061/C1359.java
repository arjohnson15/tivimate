package p061;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: ʾـ.ʼᵎ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1359 extends AbstractC1413 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final /* synthetic */ C1439 f5515;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public boolean f5516 = false;

    public C1359(C1439 c1439) {
        this.f5515 = c1439;
    }

    @Override // p061.AbstractC1413
    /* renamed from: ʽᐧ */
    public final void mo2863(RecyclerView recyclerView, int i, int i2) {
        if (i == 0 && i2 == 0) {
            return;
        }
        this.f5516 = true;
    }

    @Override // p061.AbstractC1413
    /* renamed from: ـﹶ */
    public final void mo2864(RecyclerView recyclerView, int i) {
        if (i == 0 && this.f5516) {
            this.f5516 = false;
            this.f5515.m4987();
        }
    }
}
