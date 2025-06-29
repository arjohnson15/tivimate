package androidx.leanback.widget;

import android.os.Parcelable;
import android.util.SparseArray;
import p061.AbstractC1375;
import p061.C1424;
import p061.InterfaceC1441;

/* renamed from: androidx.leanback.widget.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0174 implements InterfaceC1441 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC0164 f1136;

    public C0174(AbstractC0164 abstractC0164) {
        this.f1136 = abstractC0164;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void m970(AbstractC1375 abstractC1375) {
        int i;
        GridLayoutManager gridLayoutManager = this.f1136.f1119;
        gridLayoutManager.getClass();
        int iM4766 = abstractC1375.m4766();
        if (iM4766 != -1) {
            C0137 c0137 = gridLayoutManager.f785;
            int i2 = c0137.f1034;
            if (i2 != 1) {
                if ((i2 == 2 || i2 == 3) && ((C1424) c0137.f1033) != null) {
                    String string = Integer.toString(iM4766);
                    SparseArray<Parcelable> sparseArray = new SparseArray<>();
                    abstractC1375.f5618.saveHierarchyState(sparseArray);
                    ((C1424) c0137.f1033).m4933(string, sparseArray);
                    return;
                }
                return;
            }
            C1424 c1424 = (C1424) c0137.f1033;
            if (c1424 != null) {
                synchronized (((ٴᐧ.ᐧⁱ) c1424.f5802)) {
                    i = c1424.f5799;
                }
                if (i != 0) {
                    ((C1424) c0137.f1033).m4934(Integer.toString(iM4766));
                }
            }
        }
    }
}
