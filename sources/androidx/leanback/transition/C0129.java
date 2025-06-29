package androidx.leanback.transition;

import android.view.View;

/* renamed from: androidx.leanback.transition.ﹳﹳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0129 extends com.bumptech.glide.ˑʽ {

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final /* synthetic */ int f765;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final float m781(View view) {
        switch (this.f765) {
            case 0:
                return view.getTranslationX() - view.getWidth();
            case 1:
                return view.getTranslationX() + view.getWidth();
            case 2:
                return view.getLayoutDirection() == 1 ? view.getTranslationX() + view.getWidth() : view.getTranslationX() - view.getWidth();
            default:
                return view.getLayoutDirection() == 1 ? view.getTranslationX() - view.getWidth() : view.getTranslationX() + view.getWidth();
        }
    }
}
