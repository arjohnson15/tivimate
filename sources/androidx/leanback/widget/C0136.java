package androidx.leanback.widget;

import java.util.ArrayList;
import p061.AbstractC1375;

/* renamed from: androidx.leanback.widget.ʽᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0136 extends AbstractC0141 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC0131 f1029;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final /* synthetic */ VerticalGridView f1030;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final /* synthetic */ int f1031;

    public C0136(VerticalGridView verticalGridView, int i, InterfaceC0131 interfaceC0131) {
        this.f1030 = verticalGridView;
        this.f1031 = i;
        this.f1029 = interfaceC0131;
    }

    @Override // androidx.leanback.widget.AbstractC0141
    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final void mo898(AbstractC1375 abstractC1375, int i) {
        if (i == this.f1031) {
            ArrayList arrayList = this.f1030.f1119.f809;
            if (arrayList != null) {
                arrayList.remove(this);
            }
            this.f1029.mo897(abstractC1375);
        }
    }
}
