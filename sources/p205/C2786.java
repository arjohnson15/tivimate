package p205;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.leanback.preference.internal.OutlineOnlyWithChildrenFrameLayout;
import com.google.android.material.chip.Chip;
import p255.C3189;

/* renamed from: ˎᵢ.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2786 extends ViewOutlineProvider {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final /* synthetic */ View f10849;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final /* synthetic */ int f10850;

    public /* synthetic */ C2786(View view, int i) {
        this.f10850 = i;
        this.f10849 = view;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        switch (this.f10850) {
            case 0:
                OutlineOnlyWithChildrenFrameLayout outlineOnlyWithChildrenFrameLayout = (OutlineOnlyWithChildrenFrameLayout) this.f10849;
                if (outlineOnlyWithChildrenFrameLayout.getChildCount() <= 0) {
                    ViewOutlineProvider.BACKGROUND.getOutline(view, outline);
                    break;
                } else {
                    outlineOnlyWithChildrenFrameLayout.f729.getOutline(view, outline);
                    break;
                }
            default:
                C3189 c3189 = ((Chip) this.f10849).f3237;
                if (c3189 == null) {
                    outline.setAlpha(0.0f);
                    break;
                } else {
                    c3189.getOutline(outline);
                    break;
                }
        }
    }
}
