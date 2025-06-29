package androidx.leanback.widget;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import org.lsposed.hiddenapibypass.library.R;

/* loaded from: classes.dex */
public final class CustomSearchBar extends SearchBar {
    public CustomSearchBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    @Override // androidx.leanback.widget.SearchBar, android.view.View
    public final void onFinishInflate() throws Resources.NotFoundException {
        View viewFindViewById = findViewById(R.id._2_res_0x7f0b0242);
        if (viewFindViewById != null) {
            viewFindViewById.setBackgroundResource(R.drawable._2_res_0x7f080095);
        }
        super.onFinishInflate();
    }

    @Override // androidx.leanback.widget.SearchBar
    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final void mo782() {
    }

    @Override // androidx.leanback.widget.SearchBar
    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final void mo783() {
    }

    @Override // androidx.leanback.widget.SearchBar
    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final void mo784() {
    }
}
