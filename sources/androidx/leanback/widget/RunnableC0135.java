package androidx.leanback.widget;

import android.os.SystemClock;
import android.view.MotionEvent;

/* renamed from: androidx.leanback.widget.ʽˆ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class RunnableC0135 implements Runnable {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final /* synthetic */ SearchBar f1027;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final /* synthetic */ int f1028;

    public /* synthetic */ RunnableC0135(SearchBar searchBar, int i) {
        this.f1028 = i;
        this.f1027 = searchBar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1028) {
            case 0:
                SearchBar searchBar = this.f1027;
                searchBar.setSearchQueryInternal(searchBar.f908.getText().toString());
                break;
            default:
                SearchBar searchBar2 = this.f1027;
                searchBar2.f908.requestFocusFromTouch();
                searchBar2.f908.dispatchTouchEvent(MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), 0, searchBar2.f908.getWidth(), searchBar2.f908.getHeight(), 0));
                searchBar2.f908.dispatchTouchEvent(MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), 1, searchBar2.f908.getWidth(), searchBar2.f908.getHeight(), 0));
                break;
        }
    }
}
