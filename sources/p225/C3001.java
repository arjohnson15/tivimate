package p225;

import android.view.View;
import android.widget.AbsListView;

/* renamed from: ˏᵢ.ˑʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3001 implements AbsListView.OnScrollListener {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final /* synthetic */ View f11526;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final /* synthetic */ View f11527;

    public C3001(View view, View view2) {
        this.f11527 = view;
        this.f11526 = view2;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
        C3022.m7513(absListView, this.f11527, this.f11526);
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i) {
    }
}
