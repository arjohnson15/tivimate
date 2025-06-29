package p061;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: ʾـ.ﾞˎ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1439 extends AbstractC1417 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final C1359 f5901 = new C1359(this);

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public C1357 f5902;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public RecyclerView f5903;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public C1357 f5904;

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static int m4983(View view, AbstractC1420 abstractC1420) {
        return ((abstractC1420.mo4713(view) / 2) + abstractC1420.mo4722(view)) - ((abstractC1420.mo4723() / 2) + abstractC1420.mo4716());
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static View m4984(AbstractC1402 abstractC1402, AbstractC1420 abstractC1420) {
        int iM4846 = abstractC1402.m4846();
        View view = null;
        if (iM4846 == 0) {
            return null;
        }
        int iMo4723 = (abstractC1420.mo4723() / 2) + abstractC1420.mo4716();
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < iM4846; i2++) {
            View viewM4847 = abstractC1402.m4847(i2);
            int iAbs = Math.abs(((abstractC1420.mo4713(viewM4847) / 2) + abstractC1420.mo4722(viewM4847)) - iMo4723);
            if (iAbs < i) {
                view = viewM4847;
                i = iAbs;
            }
        }
        return view;
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final AbstractC1420 m4985(AbstractC1402 abstractC1402) {
        C1357 c1357 = this.f5902;
        if (c1357 == null || ((AbstractC1402) c1357.f5785) != abstractC1402) {
            this.f5902 = new C1357(abstractC1402, 1);
        }
        return this.f5902;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final int[] m4986(AbstractC1402 abstractC1402, View view) {
        int[] iArr = new int[2];
        if (abstractC1402.mo797()) {
            iArr[0] = m4983(view, m4988(abstractC1402));
        } else {
            iArr[0] = 0;
        }
        if (abstractC1402.mo828()) {
            iArr[1] = m4983(view, m4985(abstractC1402));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final void m4987() {
        AbstractC1402 layoutManager;
        RecyclerView recyclerView = this.f5903;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null) {
            return;
        }
        View viewM4984 = layoutManager.mo828() ? m4984(layoutManager, m4985(layoutManager)) : layoutManager.mo797() ? m4984(layoutManager, m4988(layoutManager)) : null;
        if (viewM4984 == null) {
            return;
        }
        int[] iArrM4986 = m4986(layoutManager, viewM4984);
        int i = iArrM4986[0];
        if (i == 0 && iArrM4986[1] == 0) {
            return;
        }
        this.f5903.mo959(i, iArrM4986[1]);
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final AbstractC1420 m4988(AbstractC1402 abstractC1402) {
        C1357 c1357 = this.f5904;
        if (c1357 == null || ((AbstractC1402) c1357.f5785) != abstractC1402) {
            this.f5904 = new C1357(abstractC1402, 0);
        }
        return this.f5904;
    }
}
