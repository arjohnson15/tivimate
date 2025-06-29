package p061;

import android.support.v4.media.session.AbstractC0002;
import android.util.SparseArray;
import android.view.View;
import androidx.leanback.widget.C0174;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import p378.AbstractC4345;
import p378.C4332;
import ˆˑ.ﹳﹳ;

/* renamed from: ʾـ.ⁱⁱ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1429 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public ArrayList f5846;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public int f5847;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final /* synthetic */ RecyclerView f5848;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final ArrayList f5849;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final ArrayList f5850;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public int f5851;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public C1391 f5852;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final List f5853;

    public C1429(RecyclerView recyclerView) {
        this.f5848 = recyclerView;
        ArrayList arrayList = new ArrayList();
        this.f5850 = arrayList;
        this.f5846 = null;
        this.f5849 = new ArrayList();
        this.f5853 = DesugarCollections.unmodifiableList(arrayList);
        this.f5847 = 2;
        this.f5851 = 2;
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final int m4957(int i) {
        RecyclerView recyclerView = this.f5848;
        if (i >= 0 && i < recyclerView.f1705.m4948()) {
            return !recyclerView.f1705.f5832 ? i : recyclerView.f1664.m4502(i, 0);
        }
        StringBuilder sbM40 = AbstractC0002.m40(i, "invalid position ", ". State item count is ");
        sbM40.append(recyclerView.f1705.m4948());
        sbM40.append(recyclerView.m1312());
        throw new IndexOutOfBoundsException(sbM40.toString());
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final void m4958() {
        RecyclerView recyclerView;
        AbstractC1373 abstractC1373;
        C1391 c1391 = this.f5852;
        if (c1391 == null || (abstractC1373 = (recyclerView = this.f5848).f1684) == null || !recyclerView.f1704) {
            return;
        }
        c1391.f5673.add(abstractC1373);
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x00b2, code lost:
    
        r5 = r5 - 1;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ea A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:86:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* renamed from: ˉי, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m4959(p061.AbstractC1375 r13) {
        /*
            Method dump skipped, instructions count: 330
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p061.C1429.m4959(ʾـ.ˊˆ):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0450  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x05e7  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x05f1  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x060b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0082  */
    /* renamed from: ˉⁱ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final p061.AbstractC1375 m4960(int r27, long r28) {
        /*
            Method dump skipped, instructions count: 1587
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p061.C1429.m4960(int, long):ʾـ.ˊˆ");
    }

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public final void m4961(AbstractC1375 abstractC1375) {
        if (abstractC1375.f5623) {
            this.f5846.remove(abstractC1375);
        } else {
            this.f5850.remove(abstractC1375);
        }
        abstractC1375.f5614 = null;
        abstractC1375.f5623 = false;
        abstractC1375.f5619 &= -33;
    }

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public final void m4962(View view) {
        AbstractC1371 abstractC1371;
        AbstractC1375 abstractC1375M1270 = RecyclerView.m1270(view);
        boolean zM4778 = abstractC1375M1270.m4778(12);
        RecyclerView recyclerView = this.f5848;
        if (!zM4778 && abstractC1375M1270.m4780() && (abstractC1371 = recyclerView.f1682) != null && !abstractC1371.mo4750(abstractC1375M1270, abstractC1375M1270.m4767())) {
            if (this.f5846 == null) {
                this.f5846 = new ArrayList();
            }
            abstractC1375M1270.f5614 = this;
            abstractC1375M1270.f5623 = true;
            this.f5846.add(abstractC1375M1270);
            return;
        }
        if (abstractC1375M1270.m4784() && !abstractC1375M1270.m4772() && !recyclerView.f1684.f5596) {
            throw new IllegalArgumentException(AbstractC0002.m37(recyclerView, new StringBuilder("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.")));
        }
        abstractC1375M1270.f5614 = this;
        abstractC1375M1270.f5623 = false;
        this.f5850.add(abstractC1375M1270);
    }

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final void m4963(int i) {
        if (RecyclerView.f1644) {
            String str = "Recycling cached view at index " + i;
        }
        ArrayList arrayList = this.f5849;
        AbstractC1375 abstractC1375 = (AbstractC1375) arrayList.get(i);
        if (RecyclerView.f1644) {
            String str2 = "CachedViewHolder to be recycled: " + abstractC1375;
        }
        m4965(abstractC1375, true);
        arrayList.remove(i);
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final C1391 m4964() {
        if (this.f5852 == null) {
            this.f5852 = new C1391();
            m4958();
        }
        return this.f5852;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void m4965(AbstractC1375 abstractC1375, boolean z) {
        RecyclerView.m1272(abstractC1375);
        RecyclerView recyclerView = this.f5848;
        C1436 c1436 = recyclerView.f1653;
        View view = abstractC1375.f5618;
        if (c1436 != null) {
            C4332 c4332Mo4972 = c1436.mo4972();
            AbstractC4345.m9884(view, c4332Mo4972 instanceof C1406 ? (C4332) ((C1406) c4332Mo4972).f5738.remove(view) : null);
        }
        if (z) {
            InterfaceC1441 interfaceC1441 = recyclerView.f1712;
            if (interfaceC1441 != null) {
                ((C0174) interfaceC1441).m970(abstractC1375);
            }
            ArrayList arrayList = recyclerView.f1679;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((C0174) ((InterfaceC1441) arrayList.get(i))).m970(abstractC1375);
            }
            AbstractC1373 abstractC1373 = recyclerView.f1684;
            if (abstractC1373 != null) {
                abstractC1373.m4759(abstractC1375);
            }
            if (recyclerView.f1705 != null) {
                recyclerView.f1717.m8810(abstractC1375);
            }
            if (RecyclerView.f1644) {
                String str = "dispatchViewRecycled: " + abstractC1375;
            }
        }
        abstractC1375.f5620 = null;
        abstractC1375.f5607 = null;
        C1391 c1391M4964 = m4964();
        c1391M4964.getClass();
        int i2 = abstractC1375.f5622;
        ArrayList arrayList2 = c1391M4964.m4804(i2).f5652;
        if (((C1385) c1391M4964.f5674.get(i2)).f5650 <= arrayList2.size()) {
            ﹳﹳ.ـﹶ(view);
        } else {
            if (RecyclerView.f1643 && arrayList2.contains(abstractC1375)) {
                throw new IllegalArgumentException("this scrap item already exists");
            }
            abstractC1375.m4776();
            arrayList2.add(abstractC1375);
        }
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final void m4966(AbstractC1373 abstractC1373, boolean z) {
        C1391 c1391 = this.f5852;
        if (c1391 == null) {
            return;
        }
        Set set = c1391.f5673;
        set.remove(abstractC1373);
        if (set.size() != 0 || z) {
            return;
        }
        int i = 0;
        while (true) {
            SparseArray sparseArray = c1391.f5674;
            if (i >= sparseArray.size()) {
                return;
            }
            ArrayList arrayList = ((C1385) sparseArray.get(sparseArray.keyAt(i))).f5652;
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                ﹳﹳ.ـﹶ(((AbstractC1375) arrayList.get(i2)).f5618);
            }
            i++;
        }
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final void m4967() {
        ArrayList arrayList = this.f5849;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            m4963(size);
        }
        arrayList.clear();
        if (RecyclerView.f1638) {
            C1423 c1423 = this.f5848.f1718;
            int[] iArr = c1423.f5795;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            c1423.f5796 = 0;
        }
    }

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public final void m4968() {
        AbstractC1402 abstractC1402 = this.f5848.f1683;
        this.f5851 = this.f5847 + (abstractC1402 != null ? abstractC1402.f5719 : 0);
        ArrayList arrayList = this.f5849;
        for (int size = arrayList.size() - 1; size >= 0 && arrayList.size() > this.f5851; size--) {
            m4963(size);
        }
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final View m4969(int i) {
        return m4960(i, Long.MAX_VALUE).f5618;
    }

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final void m4970(View view) {
        AbstractC1375 abstractC1375M1270 = RecyclerView.m1270(view);
        boolean zM4770 = abstractC1375M1270.m4770();
        RecyclerView recyclerView = this.f5848;
        if (zM4770) {
            recyclerView.removeDetachedView(view, false);
        }
        if (abstractC1375M1270.m4769()) {
            abstractC1375M1270.f5614.m4961(abstractC1375M1270);
        } else if (abstractC1375M1270.m4781()) {
            abstractC1375M1270.f5619 &= -33;
        }
        m4959(abstractC1375M1270);
        if (recyclerView.f1682 == null || abstractC1375M1270.m4768()) {
            return;
        }
        recyclerView.f1682.mo4751(abstractC1375M1270);
    }
}
