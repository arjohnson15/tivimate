package p061;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import p033.C1212;

/* renamed from: ʾـ.ᵎʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1412 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final /* synthetic */ RecyclerView f5765;

    public /* synthetic */ C1412(RecyclerView recyclerView) {
        this.f5765 = recyclerView;
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public AbstractC1375 m4901(int i) {
        RecyclerView recyclerView = this.f5765;
        AbstractC1375 abstractC1375M1292 = recyclerView.m1292(i, true);
        if (abstractC1375M1292 == null) {
            return null;
        }
        if (!((ArrayList) recyclerView.f1709.f5665).contains(abstractC1375M1292.f5618)) {
            return abstractC1375M1292;
        }
        if (RecyclerView.f1644) {
        }
        return null;
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public void m4902(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        RecyclerView recyclerView = this.f5765;
        int iM4792 = recyclerView.f1709.m4792();
        if (i < i2) {
            i4 = i;
            i3 = i2;
            i5 = -1;
        } else {
            i3 = i;
            i4 = i2;
            i5 = 1;
        }
        boolean z = false;
        for (int i11 = 0; i11 < iM4792; i11++) {
            AbstractC1375 abstractC1375M1270 = RecyclerView.m1270(recyclerView.f1709.m4794(i11));
            if (abstractC1375M1270 != null && (i10 = abstractC1375M1270.f5612) >= i4 && i10 <= i3) {
                if (RecyclerView.f1644) {
                    String str = "offsetPositionRecordsForMove attached child " + i11 + " holder " + abstractC1375M1270;
                }
                if (abstractC1375M1270.f5612 == i) {
                    abstractC1375M1270.m4773(i2 - i, false);
                } else {
                    abstractC1375M1270.m4773(i5, false);
                }
                recyclerView.f1705.f5831 = true;
            }
        }
        C1429 c1429 = recyclerView.f1677;
        c1429.getClass();
        if (i < i2) {
            i7 = i;
            i6 = i2;
            i8 = -1;
        } else {
            i6 = i;
            i7 = i2;
            i8 = 1;
        }
        ArrayList arrayList = c1429.f5849;
        int size = arrayList.size();
        int i12 = 0;
        while (i12 < size) {
            AbstractC1375 abstractC1375 = (AbstractC1375) arrayList.get(i12);
            if (abstractC1375 != null && (i9 = abstractC1375.f5612) >= i7 && i9 <= i6) {
                if (i9 == i) {
                    abstractC1375.m4773(i2 - i, z);
                } else {
                    abstractC1375.m4773(i8, z);
                }
                if (RecyclerView.f1644) {
                    String str2 = "offsetPositionRecordsForMove cached child " + i12 + " holder " + abstractC1375;
                }
            }
            i12++;
            z = false;
        }
        recyclerView.requestLayout();
        recyclerView.f1698 = true;
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public void m4903(int i, int i2, Object obj) {
        int i3;
        int i4;
        RecyclerView recyclerView = this.f5765;
        int iM4792 = recyclerView.f1709.m4792();
        int i5 = i2 + i;
        for (int i6 = 0; i6 < iM4792; i6++) {
            View viewM4794 = recyclerView.f1709.m4794(i6);
            AbstractC1375 abstractC1375M1270 = RecyclerView.m1270(viewM4794);
            if (abstractC1375M1270 != null && !abstractC1375M1270.m4771() && (i4 = abstractC1375M1270.f5612) >= i && i4 < i5) {
                abstractC1375M1270.m4777(2);
                if (obj == null) {
                    abstractC1375M1270.m4777(1024);
                } else if ((1024 & abstractC1375M1270.f5619) == 0) {
                    if (abstractC1375M1270.f5625 == null) {
                        ArrayList arrayList = new ArrayList();
                        abstractC1375M1270.f5625 = arrayList;
                        abstractC1375M1270.f5608 = DesugarCollections.unmodifiableList(arrayList);
                    }
                    abstractC1375M1270.f5625.add(obj);
                }
                ((C1398) viewM4794.getLayoutParams()).f5701 = true;
            }
        }
        C1429 c1429 = recyclerView.f1677;
        ArrayList arrayList2 = c1429.f5849;
        for (int size = arrayList2.size() - 1; size >= 0; size--) {
            AbstractC1375 abstractC1375 = (AbstractC1375) arrayList2.get(size);
            if (abstractC1375 != null && (i3 = abstractC1375.f5612) >= i && i3 < i5) {
                abstractC1375.m4777(2);
                c1429.m4963(size);
            }
        }
        recyclerView.f1699 = true;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public void m4904(C1399 c1399) {
        int i = c1399.f5706;
        RecyclerView recyclerView = this.f5765;
        if (i == 1) {
            recyclerView.f1683.mo831(c1399.f5704, c1399.f5707);
            return;
        }
        if (i == 2) {
            recyclerView.f1683.mo837(c1399.f5704, c1399.f5707);
        } else if (i == 4) {
            recyclerView.f1683.mo1220(recyclerView, c1399.f5704, c1399.f5707);
        } else {
            if (i != 8) {
                return;
            }
            recyclerView.f1683.mo839(c1399.f5704, c1399.f5707);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /* renamed from: ٴˎ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m4905(p061.AbstractC1375 r9, p033.C1212 r10, p033.C1212 r11) {
        /*
            r8 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r8.f5765
            r0.getClass()
            r1 = 0
            r9.m4782(r1)
            ʾـ.ˈﹳ r1 = r0.f1682
            r2 = r1
            ʾـ.ﾞˊ r2 = (p061.C1438) r2
            if (r10 == 0) goto L29
            r2.getClass()
            int r4 = r10.f4960
            int r6 = r11.f4960
            if (r4 != r6) goto L1f
            int r1 = r10.f4959
            int r3 = r11.f4959
            if (r1 == r3) goto L29
        L1f:
            int r5 = r10.f4959
            int r7 = r11.f4959
            r3 = r9
            boolean r9 = r2.m4973(r3, r4, r5, r6, r7)
            goto L4c
        L29:
            int r10 = r2.f5894
            switch(r10) {
                case 0: goto L3d;
                default: goto L2e;
            }
        L2e:
            r2.m4981(r9)
            android.view.View r10 = r9.f5618
            r11 = 0
            r10.setAlpha(r11)
            java.util.ArrayList r10 = r2.f5888
            r10.add(r9)
            goto L4b
        L3d:
            r2.m4976(r9)
            android.view.View r10 = r9.f5618
            r11 = 0
            r10.setAlpha(r11)
            java.util.ArrayList r10 = r2.f5888
            r10.add(r9)
        L4b:
            r9 = 1
        L4c:
            if (r9 == 0) goto L51
            r0.m1315()
        L51:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p061.C1412.m4905(ʾـ.ˊˆ, ʼᵎ.ˉⁱ, ʼᵎ.ˉⁱ):void");
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public void m4906(AbstractC1375 abstractC1375, C1212 c1212, C1212 c12122) {
        boolean zM4973;
        RecyclerView recyclerView = this.f5765;
        recyclerView.f1677.m4961(abstractC1375);
        recyclerView.m1302(abstractC1375);
        abstractC1375.m4782(false);
        C1438 c1438 = (C1438) recyclerView.f1682;
        c1438.getClass();
        int i = c1212.f4960;
        int i2 = c1212.f4959;
        View view = abstractC1375.f5618;
        int left = c12122 == null ? view.getLeft() : c12122.f4960;
        int top = c12122 == null ? view.getTop() : c12122.f4959;
        if (abstractC1375.m4772() || (i == left && i2 == top)) {
            switch (c1438.f5894) {
                case 0:
                    c1438.m4976(abstractC1375);
                    c1438.f5900.add(abstractC1375);
                    break;
                default:
                    c1438.m4981(abstractC1375);
                    c1438.f5900.add(abstractC1375);
                    break;
            }
            zM4973 = true;
        } else {
            view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
            zM4973 = c1438.m4973(abstractC1375, i, i2, left, top);
        }
        if (zM4973) {
            recyclerView.m1315();
        }
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public void m4907(int i, int i2) {
        RecyclerView recyclerView = this.f5765;
        int iM4792 = recyclerView.f1709.m4792();
        for (int i3 = 0; i3 < iM4792; i3++) {
            AbstractC1375 abstractC1375M1270 = RecyclerView.m1270(recyclerView.f1709.m4794(i3));
            if (abstractC1375M1270 != null && !abstractC1375M1270.m4771() && abstractC1375M1270.f5612 >= i) {
                if (RecyclerView.f1644) {
                    String str = "offsetPositionRecordsForInsert attached child " + i3 + " holder " + abstractC1375M1270 + " now at position " + (abstractC1375M1270.f5612 + i2);
                }
                abstractC1375M1270.m4773(i2, false);
                recyclerView.f1705.f5831 = true;
            }
        }
        ArrayList arrayList = recyclerView.f1677.f5849;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            AbstractC1375 abstractC1375 = (AbstractC1375) arrayList.get(i4);
            if (abstractC1375 != null && abstractC1375.f5612 >= i) {
                if (RecyclerView.f1644) {
                    String str2 = "offsetPositionRecordsForInsert cached " + i4 + " holder " + abstractC1375 + " now at position " + (abstractC1375.f5612 + i2);
                }
                abstractC1375.m4773(i2, false);
            }
        }
        recyclerView.requestLayout();
        recyclerView.f1698 = true;
    }
}
