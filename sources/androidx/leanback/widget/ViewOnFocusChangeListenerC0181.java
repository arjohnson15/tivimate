package androidx.leanback.widget;

import android.content.res.Resources;
import android.view.View;
import androidx.leanback.app.C0120;

/* renamed from: androidx.leanback.widget.ᐧⁱ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class ViewOnFocusChangeListenerC0181 implements View.OnFocusChangeListener {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final /* synthetic */ C0180 f1154;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public View f1155;

    public ViewOnFocusChangeListenerC0181(C0180 c0180, C0120 c0120) {
        this.f1154 = c0180;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) throws Resources.NotFoundException {
        C0180 c0180 = this.f1154;
        VerticalGridView verticalGridView = c0180.f1152;
        if (verticalGridView.f1704) {
            C0193 c0193 = (C0193) verticalGridView.m1331(view);
            C0159 c0159 = c0180.f1144;
            if (z) {
                this.f1155 = view;
                C0203 c0203 = c0193.f1184;
            } else if (this.f1155 == view) {
                c0159.getClass();
                c0193.m983(false);
                this.f1155 = null;
            }
            c0159.getClass();
        }
    }
}
