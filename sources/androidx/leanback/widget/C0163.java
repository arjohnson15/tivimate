package androidx.leanback.widget;

import android.graphics.PointF;
import p061.AbstractC1402;

/* renamed from: androidx.leanback.widget.ˏᴵ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0163 extends AbstractC0167 {

    /* renamed from: ᵎˏ, reason: contains not printable characters */
    public final /* synthetic */ GridLayoutManager f1113;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0163(GridLayoutManager gridLayoutManager) {
        super(gridLayoutManager);
        this.f1113 = gridLayoutManager;
    }

    @Override // p061.C1425
    /* renamed from: ٴˎ */
    public final PointF mo944(int i) {
        if (this.f5804.f1683.m4846() == 0) {
            return null;
        }
        GridLayoutManager gridLayoutManager = this.f1113;
        int iM4815 = AbstractC1402.m4815(gridLayoutManager.m4847(0));
        int i2 = ((gridLayoutManager.f790 & 262144) == 0 ? i >= iM4815 : i <= iM4815) ? 1 : -1;
        return gridLayoutManager.f813 == 0 ? new PointF(i2, 0.0f) : new PointF(0.0f, i2);
    }
}
