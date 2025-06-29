package p441;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import p080.AbstractC1702;
import p080.C1700;
import p447.AbstractC5173;
import p447.AbstractC5179;
import p447.C5171;
import p447.C5177;
import ٴᐧ.ᐧⁱ;
import ᵎﹳ.ᐧʻ;

/* renamed from: ﾞʽ.ᴵʿ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C5138 {

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public static int f19649;

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public int f19650;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public int f19651;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public int f19652;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public ArrayList f19653;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public ArrayList f19654;

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int i = this.f19652;
        sb.append(i == 0 ? "Horizontal" : i == 1 ? "Vertical" : i == 2 ? "Both" : "Unknown");
        sb.append(" [");
        String strM11550 = AbstractC5179.m11550(sb, this.f19650, "] <");
        Iterator it = this.f19653.iterator();
        while (it.hasNext()) {
            C5171 c5171 = (C5171) it.next();
            StringBuilder sbM5409 = AbstractC1702.m5409(strM11550, " ");
            sbM5409.append(c5171.f19811);
            strM11550 = sbM5409.toString();
        }
        return ᐧʻ.ˉⁱ(strM11550, " >");
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final int m11438(C1700 c1700, int i) {
        int iM5379;
        int iM53792;
        ArrayList arrayList = this.f19653;
        if (arrayList.size() == 0) {
            return 0;
        }
        C5177 c5177 = (C5177) ((C5171) arrayList.get(0)).f19824;
        c1700.m5396();
        c5177.mo11475(c1700, false);
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            ((C5171) arrayList.get(i2)).mo11475(c1700, false);
        }
        if (i == 0 && c5177.f19898 > 0) {
            AbstractC5173.m11518(c5177, c1700, arrayList, 0);
        }
        if (i == 1 && c5177.f19903 > 0) {
            AbstractC5173.m11518(c5177, c1700, arrayList, 1);
        }
        try {
            c1700.m5390();
        } catch (Exception e) {
            System.err.println(e.toString() + "\n" + Arrays.toString(e.getStackTrace()).replace("[", "   at ").replace(",", "\n   at").replace("]", ""));
        }
        this.f19654 = new ArrayList();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            C5171 c5171 = (C5171) arrayList.get(i3);
            ᐧⁱ r4 = new ᐧⁱ(14);
            new WeakReference(c5171);
            C1700.m5379(c5171.f19788);
            C1700.m5379(c5171.f19807);
            C1700.m5379(c5171.f19816);
            C1700.m5379(c5171.f19838);
            C1700.m5379(c5171.f19776);
            this.f19654.add(r4);
        }
        if (i == 0) {
            iM5379 = C1700.m5379(c5177.f19788);
            iM53792 = C1700.m5379(c5177.f19816);
            c1700.m5396();
        } else {
            iM5379 = C1700.m5379(c5177.f19807);
            iM53792 = C1700.m5379(c5177.f19838);
            c1700.m5396();
        }
        return iM53792 - iM5379;
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final void m11439(int i, C5138 c5138) {
        Iterator it = this.f19653.iterator();
        while (it.hasNext()) {
            C5171 c5171 = (C5171) it.next();
            ArrayList arrayList = c5138.f19653;
            if (!arrayList.contains(c5171)) {
                arrayList.add(c5171);
            }
            int i2 = c5138.f19650;
            if (i == 0) {
                c5171.f19801 = i2;
            } else {
                c5171.f19829 = i2;
            }
        }
        this.f19651 = c5138.f19650;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void m11440(ArrayList arrayList) {
        int size = this.f19653.size();
        if (this.f19651 != -1 && size > 0) {
            for (int i = 0; i < arrayList.size(); i++) {
                C5138 c5138 = (C5138) arrayList.get(i);
                if (this.f19651 == c5138.f19650) {
                    m11439(this.f19652, c5138);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }
}
