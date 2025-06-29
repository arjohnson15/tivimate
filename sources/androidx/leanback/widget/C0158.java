package androidx.leanback.widget;

import android.graphics.PointF;
import android.view.View;

/* renamed from: androidx.leanback.widget.ˎٴ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0158 extends AbstractC0167 {

    /* renamed from: ʿˏ, reason: contains not printable characters */
    public final /* synthetic */ GridLayoutManager f1087;

    /* renamed from: ᵎˏ, reason: contains not printable characters */
    public final boolean f1088;

    /* renamed from: ﹳˎ, reason: contains not printable characters */
    public int f1089;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0158(GridLayoutManager gridLayoutManager, int i, boolean z) {
        super(gridLayoutManager);
        this.f1087 = gridLayoutManager;
        this.f1089 = i;
        this.f1088 = z;
        this.f5814 = -2;
    }

    @Override // androidx.leanback.widget.AbstractC0167
    /* renamed from: ˏʾ, reason: contains not printable characters */
    public final void mo943() {
        super.mo943();
        this.f1089 = 0;
        View viewMo1262 = this.f5804.f1683.mo1262(this.f5814);
        if (viewMo1262 != null) {
            this.f1087.m825(viewMo1262, true);
        }
    }

    @Override // p061.C1425
    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final PointF mo944(int i) {
        int i2 = this.f1089;
        if (i2 == 0) {
            return null;
        }
        GridLayoutManager gridLayoutManager = this.f1087;
        int i3 = ((gridLayoutManager.f790 & 262144) == 0 ? i2 >= 0 : i2 <= 0) ? 1 : -1;
        return gridLayoutManager.f813 == 0 ? new PointF(i3, 0.0f) : new PointF(0.0f, i3);
    }
}
