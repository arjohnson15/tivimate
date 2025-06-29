package androidx.leanback.transition;

import android.graphics.Rect;
import android.support.v4.media.session.AbstractC0001;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: androidx.leanback.transition.ʽᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0122 extends AbstractC0001 {

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final /* synthetic */ int f750;

    public /* synthetic */ C0122(int i) {
        this.f750 = i;
    }

    @Override // android.support.v4.media.session.AbstractC0001
    /* renamed from: ʿˏ */
    public float mo29(FadeAndShortSlide fadeAndShortSlide, ViewGroup viewGroup, View view, int[] iArr) {
        switch (this.f750) {
            case 3:
                return fadeAndShortSlide.m771(viewGroup) + view.getTranslationY();
            case 4:
                return view.getTranslationY() - fadeAndShortSlide.m771(viewGroup);
            default:
                return super.mo29(fadeAndShortSlide, viewGroup, view, iArr);
        }
    }

    @Override // android.support.v4.media.session.AbstractC0001
    /* renamed from: ﹳˎ */
    public float mo33(FadeAndShortSlide fadeAndShortSlide, ViewGroup viewGroup, View view, int[] iArr) {
        switch (this.f750) {
            case 0:
                if (viewGroup.getLayoutDirection() == 1) {
                    return fadeAndShortSlide.m769(viewGroup) + view.getTranslationX();
                }
                return view.getTranslationX() - fadeAndShortSlide.m769(viewGroup);
            case 1:
                return viewGroup.getLayoutDirection() == 1 ? view.getTranslationX() - fadeAndShortSlide.m769(viewGroup) : view.getTranslationX() + fadeAndShortSlide.m769(viewGroup);
            case 2:
                int width = (view.getWidth() / 2) + iArr[0];
                viewGroup.getLocationOnScreen(iArr);
                Rect epicenter = fadeAndShortSlide.getEpicenter();
                return width < (epicenter == null ? (viewGroup.getWidth() / 2) + iArr[0] : epicenter.centerX()) ? view.getTranslationX() - fadeAndShortSlide.m769(viewGroup) : view.getTranslationX() + fadeAndShortSlide.m769(viewGroup);
            default:
                return super.mo33(fadeAndShortSlide, viewGroup, view, iArr);
        }
    }
}
