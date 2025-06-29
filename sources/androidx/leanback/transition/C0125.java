package androidx.leanback.transition;

import android.graphics.Rect;
import android.support.v4.media.session.AbstractC0001;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: androidx.leanback.transition.ˑʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0125 extends AbstractC0001 {

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final /* synthetic */ FadeAndShortSlide f754;

    public C0125(FadeAndShortSlide fadeAndShortSlide) {
        this.f754 = fadeAndShortSlide;
    }

    @Override // android.support.v4.media.session.AbstractC0001
    /* renamed from: ʿˏ */
    public final float mo29(FadeAndShortSlide fadeAndShortSlide, ViewGroup viewGroup, View view, int[] iArr) {
        int iCenterY;
        int height = (view.getHeight() / 2) + iArr[1];
        viewGroup.getLocationOnScreen(iArr);
        Rect epicenter = this.f754.getEpicenter();
        if (epicenter == null) {
            iCenterY = (viewGroup.getHeight() / 2) + iArr[1];
        } else {
            iCenterY = epicenter.centerY();
        }
        if (height < iCenterY) {
            return view.getTranslationY() - fadeAndShortSlide.m771(viewGroup);
        }
        return fadeAndShortSlide.m771(viewGroup) + view.getTranslationY();
    }
}
