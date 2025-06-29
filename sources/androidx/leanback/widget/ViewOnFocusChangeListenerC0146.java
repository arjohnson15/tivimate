package androidx.leanback.widget;

import android.view.View;

/* renamed from: androidx.leanback.widget.ˈﹳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class ViewOnFocusChangeListenerC0146 implements View.OnFocusChangeListener {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final /* synthetic */ SearchBar f1049;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final /* synthetic */ int f1050;

    public /* synthetic */ ViewOnFocusChangeListenerC0146(SearchBar searchBar, int i) {
        this.f1050 = i;
        this.f1049 = searchBar;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        switch (this.f1050) {
            case 0:
                SearchBar searchBar = this.f1049;
                if (z) {
                    searchBar.f917.post(new RunnableC0135(searchBar, 1));
                } else {
                    searchBar.m875();
                }
                searchBar.m874(z);
                break;
            default:
                SearchBar searchBar2 = this.f1049;
                if (z) {
                    searchBar2.m875();
                    if (searchBar2.f929) {
                        searchBar2.m873();
                        searchBar2.f929 = false;
                    }
                } else {
                    searchBar2.m876();
                }
                searchBar2.m874(z);
                break;
        }
    }
}
