package androidx.leanback.widget;

import android.content.res.Resources;
import android.view.KeyEvent;
import android.view.View;

/* renamed from: androidx.leanback.widget.ˆʿ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class ViewOnKeyListenerC0142 implements View.OnKeyListener {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final /* synthetic */ C0180 f1038;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public boolean f1039 = false;

    public ViewOnKeyListenerC0142(C0180 c0180) {
        this.f1038 = c0180;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) throws Resources.NotFoundException {
        if (view != null && keyEvent != null) {
            C0180 c0180 = this.f1038;
            VerticalGridView verticalGridView = c0180.f1152;
            if (verticalGridView.f1704) {
                if (i == 23 || i == 66 || i == 160 || i == 99 || i == 100) {
                    C0193 c0193 = (C0193) verticalGridView.m1331(view);
                    C0203 c0203 = c0193.f1184;
                    if (!c0203.m988() || (c0203.f1202 & 8) == 8) {
                        keyEvent.getAction();
                        return true;
                    }
                    int action = keyEvent.getAction();
                    C0159 c0159 = c0180.f1144;
                    if (action != 0) {
                        if (action == 1 && this.f1039) {
                            this.f1039 = false;
                            c0159.m945(c0193, false);
                        }
                    } else if (!this.f1039) {
                        this.f1039 = true;
                        c0159.m945(c0193, true);
                    }
                }
                return false;
            }
        }
        return false;
    }
}
