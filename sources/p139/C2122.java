package p139;

import android.animation.TimeInterpolator;
import android.util.AndroidRuntimeException;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import p080.AbstractC1702;
import יˏ.ٴᐧ;
import ـˈ.ˉᵎ;
import ᴵﹳ.ٴˎ;
import ᵔʼ.ˑʽ;
import ﹶˋ.ـﹶ;

/* renamed from: ˉˋ.ˆʿ, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C2122 extends AbstractC2160 {

    /* renamed from: ٴﹶ, reason: contains not printable characters */
    public int f8359;

    /* renamed from: ʽˆ, reason: contains not printable characters */
    public ArrayList f8356 = new ArrayList();

    /* renamed from: ٴᐧ, reason: contains not printable characters */
    public boolean f8358 = true;

    /* renamed from: ـᵎ, reason: contains not printable characters */
    public boolean f8357 = false;

    /* renamed from: ᵎᵢ, reason: contains not printable characters */
    public int f8360 = 0;

    @Override // p139.AbstractC2160
    public final void cancel() {
        super.cancel();
        int size = this.f8356.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC2160) this.f8356.get(i)).cancel();
        }
    }

    /* renamed from: ʿˊ, reason: contains not printable characters */
    public final void m5996(int i) {
        if (i == 0) {
            this.f8358 = true;
        } else {
            if (i != 1) {
                throw new AndroidRuntimeException(ˉᵎ.ˉⁱ("Invalid parameter for TransitionSet ordering: ", i));
            }
            this.f8358 = false;
        }
    }

    @Override // p139.AbstractC2160
    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final void mo5997(ViewGroup viewGroup) {
        super.mo5997(viewGroup);
        int size = this.f8356.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC2160) this.f8356.get(i)).mo5997(viewGroup);
        }
    }

    @Override // p139.AbstractC2160
    /* renamed from: ˈٴ, reason: contains not printable characters */
    public final boolean mo5998() {
        int size = this.f8356.size();
        for (int i = 0; i < size; i++) {
            if (!((AbstractC2160) this.f8356.get(i)).mo5998()) {
                return false;
            }
        }
        return true;
    }

    @Override // p139.AbstractC2160
    /* renamed from: ˉי, reason: contains not printable characters */
    public final void mo5999(C2123 c2123) {
        int size = this.f8356.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC2160) this.f8356.get(i)).mo5999(c2123);
        }
    }

    @Override // p139.AbstractC2160
    /* renamed from: ˉⁱ */
    public final void mo5979(C2123 c2123) {
        if (m6081(c2123.f8361)) {
            Iterator it = this.f8356.iterator();
            while (it.hasNext()) {
                AbstractC2160 abstractC2160 = (AbstractC2160) it.next();
                if (abstractC2160.m6081(c2123.f8361)) {
                    abstractC2160.mo5979(c2123);
                    c2123.f8362.add(abstractC2160);
                }
            }
        }
    }

    /* renamed from: ˊᵔ, reason: contains not printable characters */
    public final AbstractC2160 m6000(int i) {
        if (i < 0 || i >= this.f8356.size()) {
            return null;
        }
        return (AbstractC2160) this.f8356.get(i);
    }

    @Override // p139.AbstractC2160
    /* renamed from: ˋˉ, reason: contains not printable characters */
    public final void mo6001(View view) {
        for (int i = 0; i < this.f8356.size(); i++) {
            ((AbstractC2160) this.f8356.get(i)).mo6001(view);
        }
        this.f8478.remove(view);
    }

    @Override // p139.AbstractC2160
    /* renamed from: ˋﾞ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final void mo5995(long j) {
        ArrayList arrayList;
        this.f8466 = j;
        if (j < 0 || (arrayList = this.f8356) == null) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC2160) this.f8356.get(i)).mo5995(j);
        }
    }

    @Override // p139.AbstractC2160
    /* renamed from: ˎᵔ, reason: contains not printable characters */
    public final void mo6003() {
        this.f8360 |= 2;
        int size = this.f8356.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC2160) this.f8356.get(i)).mo6003();
        }
    }

    @Override // p139.AbstractC2160
    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public final AbstractC2160 clone() {
        C2122 c2122 = (C2122) super.clone();
        c2122.f8356 = new ArrayList();
        int size = this.f8356.size();
        for (int i = 0; i < size; i++) {
            AbstractC2160 abstractC2160Clone = ((AbstractC2160) this.f8356.get(i)).clone();
            c2122.f8356.add(abstractC2160Clone);
            abstractC2160Clone.f8473 = c2122;
        }
        return c2122;
    }

    @Override // p139.AbstractC2160
    /* renamed from: ˑﾞ, reason: contains not printable characters */
    public final void mo6006(ٴˎ r4) {
        this.f8465 = r4;
        this.f8360 |= 8;
        int size = this.f8356.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC2160) this.f8356.get(i)).mo6006(r4);
        }
    }

    @Override // p139.AbstractC2160
    /* renamed from: ـˆ, reason: contains not printable characters */
    public final void mo6007(View view) {
        super.mo6007(view);
        int size = this.f8356.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC2160) this.f8356.get(i)).mo6007(view);
        }
    }

    @Override // p139.AbstractC2160
    /* renamed from: ᐧʻ */
    public final void mo5983(C2123 c2123) {
        if (m6081(c2123.f8361)) {
            Iterator it = this.f8356.iterator();
            while (it.hasNext()) {
                AbstractC2160 abstractC2160 = (AbstractC2160) it.next();
                if (abstractC2160.m6081(c2123.f8361)) {
                    abstractC2160.mo5983(c2123);
                    c2123.f8362.add(abstractC2160);
                }
            }
        }
    }

    @Override // p139.AbstractC2160
    /* renamed from: ᴵʼ, reason: contains not printable characters */
    public final void mo6008() {
        if (this.f8356.isEmpty()) {
            m6079();
            m6084();
            return;
        }
        C2146 c2146 = new C2146();
        c2146.f8413 = this;
        Iterator it = this.f8356.iterator();
        while (it.hasNext()) {
            ((AbstractC2160) it.next()).m6085(c2146);
        }
        this.f8359 = this.f8356.size();
        if (this.f8358) {
            Iterator it2 = this.f8356.iterator();
            while (it2.hasNext()) {
                ((AbstractC2160) it2.next()).mo6008();
            }
            return;
        }
        for (int i = 1; i < this.f8356.size(); i++) {
            ((AbstractC2160) this.f8356.get(i - 1)).m6085(new C2146((AbstractC2160) this.f8356.get(i), 2));
        }
        AbstractC2160 abstractC2160 = (AbstractC2160) this.f8356.get(0);
        if (abstractC2160 != null) {
            abstractC2160.mo6008();
        }
    }

    @Override // p139.AbstractC2160
    /* renamed from: ᵎʽ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final void mo6005(TimeInterpolator timeInterpolator) {
        this.f8360 |= 1;
        ArrayList arrayList = this.f8356;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((AbstractC2160) this.f8356.get(i)).mo6005(timeInterpolator);
            }
        }
        this.f8471 = timeInterpolator;
    }

    @Override // p139.AbstractC2160
    /* renamed from: ᵎـ, reason: contains not printable characters */
    public final void mo6010(ViewGroup viewGroup, ـﹶ r14, ـﹶ r15, ArrayList arrayList, ArrayList arrayList2) {
        long j = this.f8460;
        int size = this.f8356.size();
        for (int i = 0; i < size; i++) {
            AbstractC2160 abstractC2160 = (AbstractC2160) this.f8356.get(i);
            if (j > 0 && (this.f8358 || i == 0)) {
                long j2 = abstractC2160.f8460;
                if (j2 > 0) {
                    abstractC2160.mo6013(j2 + j);
                } else {
                    abstractC2160.mo6013(j);
                }
            }
            abstractC2160.mo6010(viewGroup, r14, r15, arrayList, arrayList2);
        }
    }

    /* renamed from: ᵔ, reason: contains not printable characters */
    public final void m6011(ٴᐧ r1) {
        super.m6085(r1);
    }

    @Override // p139.AbstractC2160
    /* renamed from: ᵔٴ, reason: contains not printable characters */
    public final String mo6012(String str) {
        String strMo6012 = super.mo6012(str);
        for (int i = 0; i < this.f8356.size(); i++) {
            StringBuilder sbM5409 = AbstractC1702.m5409(strMo6012, "\n");
            sbM5409.append(((AbstractC2160) this.f8356.get(i)).mo6012(str + "  "));
            strMo6012 = sbM5409.toString();
        }
        return strMo6012;
    }

    @Override // p139.AbstractC2160
    /* renamed from: ᵔﹳ, reason: contains not printable characters */
    public final void mo6013(long j) {
        this.f8460 = j;
    }

    @Override // p139.AbstractC2160
    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final void mo6014() {
        this.f8459 = 0L;
        int i = 0;
        C2146 c2146 = new C2146(this, i);
        while (i < this.f8356.size()) {
            AbstractC2160 abstractC2160 = (AbstractC2160) this.f8356.get(i);
            abstractC2160.m6085(c2146);
            abstractC2160.mo6014();
            long j = abstractC2160.f8459;
            if (this.f8358) {
                this.f8459 = Math.max(this.f8459, j);
            } else {
                long j2 = this.f8459;
                abstractC2160.f8480 = j2;
                this.f8459 = j2 + j;
            }
            i++;
        }
    }

    @Override // p139.AbstractC2160
    /* renamed from: ᵢٴ, reason: contains not printable characters */
    public final void mo6015(ˑʽ r3) {
        super.mo6015(r3);
        this.f8360 |= 4;
        if (this.f8356 != null) {
            for (int i = 0; i < this.f8356.size(); i++) {
                ((AbstractC2160) this.f8356.get(i)).mo6015(r3);
            }
        }
    }

    @Override // p139.AbstractC2160
    /* renamed from: ﹳˎ, reason: contains not printable characters */
    public final void mo6016(ViewGroup viewGroup) {
        super.mo6016(viewGroup);
        int size = this.f8356.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC2160) this.f8356.get(i)).mo6016(viewGroup);
        }
    }

    @Override // p139.AbstractC2160
    /* renamed from: ﹳˑ, reason: contains not printable characters */
    public final boolean mo6017() {
        for (int i = 0; i < this.f8356.size(); i++) {
            if (((AbstractC2160) this.f8356.get(i)).mo6017()) {
                return true;
            }
        }
        return false;
    }

    @Override // p139.AbstractC2160
    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final void mo6018(View view) {
        for (int i = 0; i < this.f8356.size(); i++) {
            ((AbstractC2160) this.f8356.get(i)).mo6018(view);
        }
        this.f8478.add(view);
    }

    @Override // p139.AbstractC2160
    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public final AbstractC2160 mo6019(InterfaceC2121 interfaceC2121) {
        super.mo6019(interfaceC2121);
        return this;
    }

    /* renamed from: ﾞˎ, reason: contains not printable characters */
    public final void m6020(AbstractC2160 abstractC2160) {
        this.f8356.add(abstractC2160);
        abstractC2160.f8473 = this;
        long j = this.f8466;
        if (j >= 0) {
            abstractC2160.mo5995(j);
        }
        if ((this.f8360 & 1) != 0) {
            abstractC2160.mo6005(this.f8471);
        }
        if ((this.f8360 & 2) != 0) {
            abstractC2160.mo6003();
        }
        if ((this.f8360 & 4) != 0) {
            abstractC2160.mo6015(this.f8474);
        }
        if ((this.f8360 & 8) != 0) {
            abstractC2160.mo6006(this.f8465);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    @Override // p139.AbstractC2160
    /* renamed from: ﾞᐧ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo6021(long r20, long r22) {
        /*
            Method dump skipped, instructions count: 234
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p139.C2122.mo6021(long, long):void");
    }
}
