package androidx.leanback.app;

import androidx.leanback.widget.C0159;
import androidx.leanback.widget.C0172;
import androidx.leanback.widget.C0180;
import androidx.leanback.widget.C0203;
import androidx.leanback.widget.InterfaceC0157;

/* renamed from: androidx.leanback.app.ʽᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0119 implements InterfaceC0157 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final /* synthetic */ C0120 f715;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final /* synthetic */ int f716;

    public /* synthetic */ C0119(C0120 c0120, int i) {
        this.f716 = i;
        this.f715 = c0120;
    }

    @Override // androidx.leanback.widget.InterfaceC0157
    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void mo747(C0203 c0203) {
        int iIndexOf;
        switch (this.f716) {
            case 0:
                C0120 c0120 = this.f715;
                c0120.m754(c0203);
                C0159 c0159 = c0120.f720;
                if (c0159.f1096 == null) {
                    c0203.getClass();
                    if (c0203.m991()) {
                        C0159 c01592 = c0120.f720;
                        if (c01592.f1106 == null && c01592.f1096 == null && (iIndexOf = ((C0180) c01592.f1091.getAdapter()).f1143.indexOf(c0203)) >= 0) {
                            c01592.f1091.m954(iIndexOf, new C0172(c01592));
                            break;
                        }
                    }
                } else if (c0159 != null && c0159.f1091 != null) {
                    c0159.m949(true);
                    break;
                }
                break;
            default:
                C0159 c01593 = this.f715.f720;
                if (c01593.f1106 == null && c01593 != null && c01593.f1091 != null) {
                    c01593.m949(true);
                    break;
                }
                break;
        }
    }
}
