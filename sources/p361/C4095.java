package p361;

import android.graphics.Canvas;
import android.graphics.Matrix;
import java.util.ArrayList;
import java.util.Iterator;
import p086.C1730;

/* renamed from: ᵔᵔ.ˑי, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4095 extends AbstractC4088 {

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final /* synthetic */ ArrayList f15800;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final /* synthetic */ Matrix f15801;

    public C4095(ArrayList arrayList, Matrix matrix) {
        this.f15800 = arrayList;
        this.f15801 = matrix;
    }

    @Override // p361.AbstractC4088
    /* renamed from: ـﹶ */
    public final void mo9376(Matrix matrix, C1730 c1730, int i, Canvas canvas) {
        Iterator it = this.f15800.iterator();
        while (it.hasNext()) {
            ((AbstractC4088) it.next()).mo9376(this.f15801, c1730, i, canvas);
        }
    }
}
