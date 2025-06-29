package androidx.leanback.preference.internal;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import p205.C2786;

/* loaded from: classes.dex */
public class OutlineOnlyWithChildrenFrameLayout extends FrameLayout {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public ViewOutlineProvider f729;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public C2786 f730;

    public OutlineOnlyWithChildrenFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        invalidateOutline();
    }

    @Override // android.view.View
    public void setOutlineProvider(ViewOutlineProvider viewOutlineProvider) {
        this.f729 = viewOutlineProvider;
        if (this.f730 == null) {
            this.f730 = new C2786(this, 0);
        }
        super.setOutlineProvider(this.f730);
    }
}
