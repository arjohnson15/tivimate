package p441;

import java.util.Iterator;

/* renamed from: ﾞʽ.ᐧʻ, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C5137 extends C5136 {

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public int f19648;

    public C5137(AbstractC5132 abstractC5132) {
        super(abstractC5132);
        if (abstractC5132 instanceof C5131) {
            this.f19637 = 2;
        } else {
            this.f19637 = 3;
        }
    }

    @Override // p441.C5136
    /* renamed from: ﹳﹳ */
    public final void mo11437(int i) {
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
