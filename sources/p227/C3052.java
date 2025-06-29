package p227;

import androidx.leanback.widget.AbstractC0141;
import androidx.leanback.widget.VerticalGridView;
import androidx.leanback.widget.picker.Picker;
import androidx.recyclerview.widget.RecyclerView;
import p061.AbstractC1375;

/* renamed from: ˑʾ.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3052 extends AbstractC0141 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final /* synthetic */ Picker f11755;

    public C3052(Picker picker) {
        this.f11755 = picker;
    }

    @Override // androidx.leanback.widget.AbstractC0141
    /* renamed from: ـﹶ */
    public final void mo906(RecyclerView recyclerView, AbstractC1375 abstractC1375, int i) {
        Picker picker = this.f11755;
        int iIndexOf = picker.f997.indexOf((VerticalGridView) recyclerView);
        picker.m889(iIndexOf);
        if (abstractC1375 != null) {
            picker.mo885(iIndexOf, ((C3053) picker.f1000.get(iIndexOf)).f11756 + i);
        }
    }
}
