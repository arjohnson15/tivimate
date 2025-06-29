package p222;

import android.os.Handler;
import android.widget.AbsListView;

/* renamed from: ˏᴵ.ﹶʾ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2968 implements AbsListView.OnScrollListener {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final /* synthetic */ C2959 f11440;

    public C2968(C2959 c2959) {
        this.f11440 = c2959;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i) {
        if (i == 1) {
            C2959 c2959 = this.f11440;
            if (c2959.f11410.getInputMethodMode() == 2 || c2959.f11410.getContentView() == null) {
                return;
            }
            Handler handler = c2959.f11411;
            RunnableC2865 runnableC2865 = c2959.f11405;
            handler.removeCallbacks(runnableC2865);
            runnableC2865.run();
        }
    }
}
