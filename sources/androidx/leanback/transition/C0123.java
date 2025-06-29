package androidx.leanback.transition;

import android.view.View;

/* renamed from: androidx.leanback.transition.ʿʼ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0123 extends com.bumptech.glide.ﹳﹳ {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final /* synthetic */ int f751;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final float m773(View view) {
        switch (this.f751) {
            case 0:
                return view.getTranslationY() - view.getHeight();
            default:
                return view.getTranslationY() + view.getHeight();
        }
    }
}
