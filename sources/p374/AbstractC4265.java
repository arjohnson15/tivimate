package p374;

import android.os.Handler;
import java.util.HashMap;
import java.util.Iterator;
import p000.InterfaceC0880;
import p033.C1215;
import p166.AbstractC2394;
import p383.AbstractC4464;
import p385.C4480;
import ᴵﹳ.ﹶˆ;

/* renamed from: ᵢˎ.ˏᵢ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC4265 extends AbstractC4273 {

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public final HashMap f16566 = new HashMap();

    /* renamed from: ـˆ, reason: contains not printable characters */
    public Handler f16567;

    /* renamed from: ᴵʼ, reason: contains not printable characters */
    public InterfaceC0880 f16568;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [ᵢˎ.ˈٴ, ᵢˎ.ٴˎ] */
    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final void m9725(final Object obj, InterfaceC4277 interfaceC4277) {
        HashMap map = this.f16566;
        AbstractC4464.m10142(!map.containsKey(obj));
        ?? r1 = new InterfaceC4249() { // from class: ᵢˎ.ٴˎ
            @Override // p374.InterfaceC4249
            /* renamed from: ـﹶ */
            public final void mo9709(AbstractC4273 abstractC4273, AbstractC2394 abstractC2394) {
                this.f16599.mo9716(obj, abstractC4273, abstractC2394);
            }
        };
        ﹶˆ r2 = new ﹶˆ();
        r2.ᐧˋ = this;
        r2.ˆʿ = m9731(null);
        r2.ˎˑ = new C4480(this.f16594.f17251, 0, null);
        r2.ᐧⁱ = obj;
        map.put(obj, new C4275(interfaceC4277, r1, r2));
        Handler handler = this.f16567;
        handler.getClass();
        interfaceC4277.mo9737(handler, r2);
        Handler handler2 = this.f16567;
        handler2.getClass();
        interfaceC4277.mo9729(handler2, r2);
        InterfaceC0880 interfaceC0880 = this.f16568;
        C1215 c1215 = this.f16597;
        AbstractC4464.m10146(c1215);
        interfaceC4277.mo9733(r1, interfaceC0880, c1215);
        if (this.f16591.isEmpty()) {
            interfaceC4277.mo9736(r1);
        }
    }

    /* renamed from: ˈٴ */
    public int mo9711(int i, Object obj) {
        return i;
    }

    @Override // p374.InterfaceC4277
    /* renamed from: ˏᵢ */
    public void mo6117() {
        Iterator it = this.f16566.values().iterator();
        while (it.hasNext()) {
            ((C4275) it.next()).f16602.mo6117();
        }
    }

    /* renamed from: יʻ */
    public abstract C4290 mo9715(Object obj, C4290 c4290);

    /* renamed from: ᐧⁱ */
    public abstract void mo9716(Object obj, AbstractC4273 abstractC4273, AbstractC2394 abstractC2394);

    @Override // p374.AbstractC4273
    /* renamed from: ᵎˏ, reason: contains not printable characters */
    public final void mo9726() {
        for (C4275 c4275 : this.f16566.values()) {
            c4275.f16602.mo9736(c4275.f16600);
        }
    }

    @Override // p374.AbstractC4273
    /* renamed from: ﹳˎ, reason: contains not printable characters */
    public final void mo9727() {
        for (C4275 c4275 : this.f16566.values()) {
            c4275.f16602.mo9734(c4275.f16600);
        }
    }

    /* renamed from: ﹳˑ */
    public long mo9718(long j, Object obj) {
        return j;
    }

    @Override // p374.AbstractC4273
    /* renamed from: ﾞˊ */
    public void mo6120() {
        HashMap map = this.f16566;
        for (C4275 c4275 : map.values()) {
            c4275.f16602.mo9735(c4275.f16600);
            ﹶˆ r3 = c4275.f16601;
            InterfaceC4277 interfaceC4277 = c4275.f16602;
            interfaceC4277.mo9732(r3);
            interfaceC4277.mo9738(r3);
        }
        map.clear();
    }
}
