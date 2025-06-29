package p441;

import java.util.ArrayList;
import java.util.Iterator;
import p334.C3789;

/* renamed from: ﾞʽ.ٴˎ, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C5136 implements InterfaceC5139 {

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public int f19644;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public int f19645;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final AbstractC5132 f19646;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public AbstractC5132 f19643 = null;

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public boolean f19636 = false;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public boolean f19642 = false;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public int f19637 = 1;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public int f19641 = 1;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public C5137 f19647 = null;

    /* renamed from: ˉי, reason: contains not printable characters */
    public boolean f19638 = false;

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public final ArrayList f19640 = new ArrayList();

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public final ArrayList f19639 = new ArrayList();

    public C5136(AbstractC5132 abstractC5132) {
        this.f19646 = abstractC5132;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f19646.f19623.f19811);
        sb.append(":");
        switch (this.f19637) {
            case 1:
                str = "UNKNOWN";
                break;
            case 2:
                str = "HORIZONTAL_DIMENSION";
                break;
            case 3:
                str = "VERTICAL_DIMENSION";
                break;
            case 4:
                str = "LEFT";
                break;
            case 5:
                str = "RIGHT";
                break;
            case C3789.STRING_SET_FIELD_NUMBER /* 6 */:
                str = "TOP";
                break;
            case C3789.DOUBLE_FIELD_NUMBER /* 7 */:
                str = "BOTTOM";
                break;
            case 8:
                str = "BASELINE";
                break;
            default:
                str = "null";
                break;
        }
        sb.append(str);
        sb.append("(");
        sb.append(this.f19638 ? Integer.valueOf(this.f19645) : "unresolved");
        sb.append(") <t=");
        sb.append(this.f19639.size());
        sb.append(":d=");
        sb.append(this.f19640.size());
        sb.append(">");
        return sb.toString();
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final void m11435(AbstractC5132 abstractC5132) {
        this.f19640.add(abstractC5132);
        if (this.f19638) {
            abstractC5132.mo11409(abstractC5132);
        }
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final void m11436() {
        this.f19639.clear();
        this.f19640.clear();
        this.f19638 = false;
        this.f19645 = 0;
        this.f19642 = false;
        this.f19636 = false;
    }

    @Override // p441.InterfaceC5139
    /* renamed from: ـﹶ */
    public final void mo11409(InterfaceC5139 interfaceC5139) {
        ArrayList arrayList = this.f19639;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (!((C5136) it.next()).f19638) {
                return;
            }
        }
        this.f19642 = true;
        AbstractC5132 abstractC5132 = this.f19643;
        if (abstractC5132 != null) {
            abstractC5132.mo11409(this);
        }
        if (this.f19636) {
            this.f19646.mo11409(this);
            return;
        }
        Iterator it2 = arrayList.iterator();
        C5136 c5136 = null;
        int i = 0;
        while (it2.hasNext()) {
            C5136 c51362 = (C5136) it2.next();
            if (!(c51362 instanceof C5137)) {
                i++;
                c5136 = c51362;
            }
        }
        if (c5136 != null && i == 1 && c5136.f19638) {
            C5137 c5137 = this.f19647;
            if (c5137 != null) {
                if (!c5137.f19638) {
                    return;
                } else {
                    this.f19644 = this.f19641 * c5137.f19645;
                }
            }
            mo11437(c5136.f19645 + this.f19644);
        }
        AbstractC5132 abstractC51322 = this.f19643;
        if (abstractC51322 != null) {
            abstractC51322.mo11409(this);
        }
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public void mo11437(int i) {
        if (this.f19638) {
            return;
        }
        this.f19638 = true;
        this.f19645 = i;
        Iterator it = this.f19640.iterator();
        while (it.hasNext()) {
            InterfaceC5139 interfaceC5139 = (InterfaceC5139) it.next();
            interfaceC5139.mo11409(interfaceC5139);
        }
    }
}
