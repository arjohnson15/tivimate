package androidx.leanback.widget;

import android.text.TextUtils;

/* renamed from: androidx.leanback.widget.ٴᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class RunnableC0176 implements Runnable {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final /* synthetic */ C0145 f1137;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final /* synthetic */ int f1138;

    public /* synthetic */ RunnableC0176(C0145 c0145, int i) {
        this.f1138 = i;
        this.f1137 = c0145;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ʾי.ˑʽ r1;
        switch (this.f1138) {
            case 0:
                SearchBar searchBar = (SearchBar) this.f1137.f1047;
                if (!TextUtils.isEmpty(searchBar.f909) && (r1 = searchBar.f919) != null) {
                    ʽᵔ.ﾞﾞ.ᵎˆ((ʽᵔ.ﾞﾞ) r1.ˆʿ, searchBar.f909, true);
                    break;
                }
                break;
            case 1:
                ـˈ.ˑʽ activity = ((ʽᵔ.ﾞﾞ) ((SearchBar) this.f1137.f1047).f919.ˆʿ).getActivity();
                ـˈ.ˑʽ r0 = activity instanceof ـˈ.ˑʽ ? activity : null;
                if (r0 != null) {
                    r0.ˏʾ(false);
                    break;
                }
                break;
            default:
                SearchBar searchBar2 = (SearchBar) this.f1137.f1047;
                searchBar2.f929 = true;
                searchBar2.f913.requestFocus();
                break;
        }
    }
}
