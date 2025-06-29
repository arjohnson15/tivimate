package p061;

import android.view.View;
import java.util.List;

/* renamed from: ʾـ.ˑﾞ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1394 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public int f5679;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public int f5680;

    /* renamed from: ˉי, reason: contains not printable characters */
    public int f5681;

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public boolean f5682;

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public List f5683;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public int f5684;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public int f5685;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public boolean f5686;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public int f5687;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public int f5688;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public int f5689;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public int f5690;

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final View m4805(C1429 c1429) {
        List list = this.f5683;
        if (list == null) {
            View viewM4969 = c1429.m4969(this.f5689);
            this.f5689 += this.f5680;
            return viewM4969;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            View view = ((AbstractC1375) this.f5683.get(i)).f5618;
            C1398 c1398 = (C1398) view.getLayoutParams();
            if (!c1398.f5702.m4772() && this.f5689 == c1398.f5702.m4783()) {
                m4806(view);
                return view;
            }
        }
        return null;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void m4806(View view) {
        int iM4783;
        int size = this.f5683.size();
        View view2 = null;
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < size; i2++) {
            View view3 = ((AbstractC1375) this.f5683.get(i2)).f5618;
            C1398 c1398 = (C1398) view3.getLayoutParams();
            if (view3 != view && !c1398.f5702.m4772() && (iM4783 = (c1398.f5702.m4783() - this.f5689) * this.f5680) >= 0 && iM4783 < i) {
                view2 = view3;
                if (iM4783 == 0) {
                    break;
                } else {
                    i = iM4783;
                }
            }
        }
        if (view2 == null) {
            this.f5689 = -1;
        } else {
            this.f5689 = ((C1398) view2.getLayoutParams()).f5702.m4783();
        }
    }
}
