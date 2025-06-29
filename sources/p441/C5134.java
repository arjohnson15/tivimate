package p441;

import java.util.ArrayList;
import java.util.Iterator;
import p447.C5171;
import p447.C5175;
import p447.C5177;
import ـˈ.ˉᵎ;

/* renamed from: ﾞʽ.ˑʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C5134 extends AbstractC5132 {

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public int f19634;

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public final ArrayList f19635;

    public C5134(C5171 c5171, int i) {
        C5171 c51712;
        super(c5171);
        this.f19635 = new ArrayList();
        this.f19629 = i;
        C5171 c51713 = this.f19623;
        C5171 c5171M11486 = c51713.m11486(i);
        while (true) {
            C5171 c51714 = c5171M11486;
            c51712 = c51713;
            c51713 = c51714;
            if (c51713 == null) {
                break;
            } else {
                c5171M11486 = c51713.m11486(this.f19629);
            }
        }
        this.f19623 = c51712;
        int i2 = this.f19629;
        InterfaceC5139 interfaceC5139 = i2 == 0 ? c51712.f19832 : i2 == 1 ? c51712.f19777 : null;
        ArrayList arrayList = this.f19635;
        arrayList.add(interfaceC5139);
        C5171 c5171M11483 = c51712.m11483(this.f19629);
        while (c5171M11483 != null) {
            int i3 = this.f19629;
            arrayList.add(i3 == 0 ? c5171M11483.f19832 : i3 == 1 ? c5171M11483.f19777 : null);
            c5171M11483 = c5171M11483.m11483(this.f19629);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AbstractC5132 abstractC5132 = (AbstractC5132) it.next();
            int i4 = this.f19629;
            if (i4 == 0) {
                abstractC5132.f19623.f19775 = this;
            } else if (i4 == 1) {
                abstractC5132.f19623.f19800 = this;
            }
        }
        if (this.f19629 == 0 && ((C5177) this.f19623.f19824).f19910 && arrayList.size() > 1) {
            this.f19623 = ((AbstractC5132) ˉᵎ.ﹶˆ(1, arrayList)).f19623;
        }
        this.f19634 = this.f19629 == 0 ? this.f19623.f19812 : this.f19623.f19808;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChainRun ");
        sb.append(this.f19629 == 0 ? "horizontal : " : "vertical : ");
        Iterator it = this.f19635.iterator();
        while (it.hasNext()) {
            AbstractC5132 abstractC5132 = (AbstractC5132) it.next();
            sb.append("<");
            sb.append(abstractC5132);
            sb.append("> ");
        }
        return sb.toString();
    }

    @Override // p441.AbstractC5132
    /* renamed from: ʿʼ */
    public final void mo11406() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f19635;
            if (i >= arrayList.size()) {
                return;
            }
            ((AbstractC5132) arrayList.get(i)).mo11406();
            i++;
        }
    }

    @Override // p441.AbstractC5132
    /* renamed from: ˉי */
    public final long mo11420() {
        ArrayList arrayList = this.f19635;
        int size = arrayList.size();
        long jMo11420 = 0;
        for (int i = 0; i < size; i++) {
            jMo11420 = r5.f19632.f19644 + ((AbstractC5132) arrayList.get(i)).mo11420() + jMo11420 + r5.f19626.f19644;
        }
        return jMo11420;
    }

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public final C5171 m11433() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f19635;
            if (i >= arrayList.size()) {
                return null;
            }
            C5171 c5171 = ((AbstractC5132) arrayList.get(i)).f19623;
            if (c5171.f19774 != 8) {
                return c5171;
            }
            i++;
        }
    }

    @Override // p441.AbstractC5132
    /* renamed from: ˏʾ */
    public final boolean mo11408() {
        ArrayList arrayList = this.f19635;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (!((AbstractC5132) arrayList.get(i)).mo11408()) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0153  */
    @Override // p441.InterfaceC5139
    /* renamed from: ـﹶ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo11409(p441.InterfaceC5139 r27) {
        /*
            Method dump skipped, instructions count: 971
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p441.C5134.mo11409(ﾞʽ.ﹳﹳ):void");
    }

    @Override // p441.AbstractC5132
    /* renamed from: ٴˎ */
    public final void mo11410() {
        this.f19627 = null;
        Iterator it = this.f19635.iterator();
        while (it.hasNext()) {
            ((AbstractC5132) it.next()).mo11410();
        }
    }

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public final C5171 m11434() {
        ArrayList arrayList = this.f19635;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C5171 c5171 = ((AbstractC5132) arrayList.get(size)).f19623;
            if (c5171.f19774 != 8) {
                return c5171;
            }
        }
        return null;
    }

    @Override // p441.AbstractC5132
    /* renamed from: ﹳﹳ */
    public final void mo11411() {
        ArrayList arrayList = this.f19635;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((AbstractC5132) it.next()).mo11411();
        }
        int size = arrayList.size();
        if (size < 1) {
            return;
        }
        C5171 c5171 = ((AbstractC5132) arrayList.get(0)).f19623;
        C5171 c51712 = ((AbstractC5132) arrayList.get(size - 1)).f19623;
        int i = this.f19629;
        C5136 c5136 = this.f19632;
        C5136 c51362 = this.f19626;
        if (i == 0) {
            C5175 c5175 = c5171.f19788;
            C5175 c51752 = c51712.f19816;
            C5136 c5136M11419 = AbstractC5132.m11419(c5175, 0);
            int iM11523 = c5175.m11523();
            C5171 c5171M11433 = m11433();
            if (c5171M11433 != null) {
                iM11523 = c5171M11433.f19788.m11523();
            }
            if (c5136M11419 != null) {
                AbstractC5132.m11417(c51362, c5136M11419, iM11523);
            }
            C5136 c5136M114192 = AbstractC5132.m11419(c51752, 0);
            int iM115232 = c51752.m11523();
            C5171 c5171M11434 = m11434();
            if (c5171M11434 != null) {
                iM115232 = c5171M11434.f19816.m11523();
            }
            if (c5136M114192 != null) {
                AbstractC5132.m11417(c5136, c5136M114192, -iM115232);
            }
        } else {
            C5175 c51753 = c5171.f19807;
            C5175 c51754 = c51712.f19838;
            C5136 c5136M114193 = AbstractC5132.m11419(c51753, 1);
            int iM115233 = c51753.m11523();
            C5171 c5171M114332 = m11433();
            if (c5171M114332 != null) {
                iM115233 = c5171M114332.f19807.m11523();
            }
            if (c5136M114193 != null) {
                AbstractC5132.m11417(c51362, c5136M114193, iM115233);
            }
            C5136 c5136M114194 = AbstractC5132.m11419(c51754, 1);
            int iM115234 = c51754.m11523();
            C5171 c5171M114342 = m11434();
            if (c5171M114342 != null) {
                iM115234 = c5171M114342.f19838.m11523();
            }
            if (c5136M114194 != null) {
                AbstractC5132.m11417(c5136, c5136M114194, -iM115234);
            }
        }
        c51362.f19643 = this;
        c5136.f19643 = this;
    }
}
