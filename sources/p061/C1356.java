package p061;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p036.C1262;
import p080.AbstractC1702;
import p378.AbstractC4345;

/* renamed from: ʾـ.ʻʻ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1356 extends AbstractC1382 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final /* synthetic */ RecyclerView f5513;

    public C1356(RecyclerView recyclerView) {
        this.f5513 = recyclerView;
    }

    @Override // p061.AbstractC1382
    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final void mo4706(int i, int i2, Object obj) {
        RecyclerView recyclerView = this.f5513;
        recyclerView.m1301(null);
        C1262 c1262 = recyclerView.f1664;
        if (i2 < 1) {
            c1262.getClass();
            return;
        }
        ArrayList arrayList = (ArrayList) c1262.f5177;
        arrayList.add(c1262.m4521(obj, 4, i, i2));
        c1262.f5178 |= 4;
        if (arrayList.size() == 1) {
            m4711();
        }
    }

    @Override // p061.AbstractC1382
    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final void mo4707(int i, int i2) {
        RecyclerView recyclerView = this.f5513;
        recyclerView.m1301(null);
        C1262 c1262 = recyclerView.f1664;
        if (i2 < 1) {
            c1262.getClass();
            return;
        }
        ArrayList arrayList = (ArrayList) c1262.f5177;
        arrayList.add(c1262.m4521(null, 2, i, i2));
        c1262.f5178 |= 2;
        if (arrayList.size() == 1) {
            m4711();
        }
    }

    @Override // p061.AbstractC1382
    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final void mo4708(int i, int i2) {
        RecyclerView recyclerView = this.f5513;
        recyclerView.m1301(null);
        C1262 c1262 = recyclerView.f1664;
        if (i2 < 1) {
            c1262.getClass();
            return;
        }
        ArrayList arrayList = (ArrayList) c1262.f5177;
        arrayList.add(c1262.m4521(null, 1, i, i2));
        c1262.f5178 |= 1;
        if (arrayList.size() == 1) {
            m4711();
        }
    }

    @Override // p061.AbstractC1382
    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void mo4709() {
        RecyclerView recyclerView = this.f5513;
        recyclerView.m1301(null);
        recyclerView.f1705.f5831 = true;
        recyclerView.m1290(true);
        if (recyclerView.f1664.m4516()) {
            return;
        }
        recyclerView.requestLayout();
    }

    @Override // p061.AbstractC1382
    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final void mo4710() {
        AbstractC1373 abstractC1373;
        RecyclerView recyclerView = this.f5513;
        if (recyclerView.f1694 == null || (abstractC1373 = recyclerView.f1684) == null) {
            return;
        }
        int iM5411 = AbstractC1702.m5411(abstractC1373.f5597);
        if (iM5411 != 1) {
            if (iM5411 == 2) {
                return;
            }
        } else if (abstractC1373.mo974() <= 0) {
            return;
        }
        recyclerView.requestLayout();
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final void m4711() {
        boolean z = RecyclerView.f1639;
        RecyclerView recyclerView = this.f5513;
        if (z && recyclerView.f1720 && recyclerView.f1704) {
            WeakHashMap weakHashMap = AbstractC4345.f16838;
            recyclerView.postOnAnimation(recyclerView.f1689);
        } else {
            recyclerView.f1676 = true;
            recyclerView.requestLayout();
        }
    }

    @Override // p061.AbstractC1382
    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final void mo4712(int i, int i2) {
        RecyclerView recyclerView = this.f5513;
        recyclerView.m1301(null);
        C1262 c1262 = recyclerView.f1664;
        c1262.getClass();
        if (i == i2) {
            return;
        }
        ArrayList arrayList = (ArrayList) c1262.f5177;
        arrayList.add(c1262.m4521(null, 8, i, i2));
        c1262.f5178 |= 8;
        if (arrayList.size() == 1) {
            m4711();
        }
    }
}
