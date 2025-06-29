package p374;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.internal.play_billing.ᐧʻ;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import p000.InterfaceC0880;
import p033.C1215;
import p166.AbstractC2394;
import p383.AbstractC4464;
import p385.C4480;
import p385.C4499;
import p385.InterfaceC4485;

/* renamed from: ᵢˎ.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC4273 implements InterfaceC4277 {

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public Looper f16592;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public AbstractC2394 f16596;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public C1215 f16597;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final ArrayList f16595 = new ArrayList(1);

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final HashSet f16591 = new HashSet(1);

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final ᐧʻ f16593 = new ᐧʻ(new CopyOnWriteArrayList(), 0, (C4290) null);

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final C4480 f16594 = new C4480(new CopyOnWriteArrayList(), 0, null);

    @Override // p374.InterfaceC4277
    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final void mo9729(Handler handler, InterfaceC4485 interfaceC4485) {
        handler.getClass();
        C4480 c4480 = this.f16594;
        c4480.getClass();
        C4499 c4499 = new C4499();
        c4499.f17317 = handler;
        c4499.f17316 = interfaceC4485;
        c4480.f17251.add(c4499);
    }

    /* renamed from: ʿˏ */
    public abstract void mo6114(InterfaceC0880 interfaceC0880);

    @Override // p374.InterfaceC4277
    /* renamed from: ˉי */
    public /* synthetic */ boolean mo9712() {
        return true;
    }

    /* renamed from: ˋˊ, reason: contains not printable characters */
    public final void m9730(AbstractC2394 abstractC2394) {
        this.f16596 = abstractC2394;
        Iterator it = this.f16595.iterator();
        while (it.hasNext()) {
            ((InterfaceC4249) it.next()).mo9709(this, abstractC2394);
        }
    }

    /* renamed from: ˎٴ, reason: contains not printable characters */
    public final ᐧʻ m9731(C4290 c4290) {
        return new ᐧʻ((CopyOnWriteArrayList) this.f16593.ᐧˋ, 0, c4290);
    }

    @Override // p374.InterfaceC4277
    /* renamed from: ˏʾ */
    public /* synthetic */ AbstractC2394 mo9714() {
        return null;
    }

    @Override // p374.InterfaceC4277
    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public final void mo9732(InterfaceC4286 interfaceC4286) {
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) this.f16593.ᐧˋ;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            C4248 c4248 = (C4248) it.next();
            if (c4248.f16501 == interfaceC4286) {
                copyOnWriteArrayList.remove(c4248);
            }
        }
    }

    @Override // p374.InterfaceC4277
    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final void mo9733(InterfaceC4249 interfaceC4249, InterfaceC0880 interfaceC0880, C1215 c1215) {
        Looper looperMyLooper = Looper.myLooper();
        Looper looper = this.f16592;
        AbstractC4464.m10142(looper == null || looper == looperMyLooper);
        this.f16597 = c1215;
        AbstractC2394 abstractC2394 = this.f16596;
        this.f16595.add(interfaceC4249);
        if (this.f16592 == null) {
            this.f16592 = looperMyLooper;
            this.f16591.add(interfaceC4249);
            mo6114(interfaceC0880);
        } else if (abstractC2394 != null) {
            mo9734(interfaceC4249);
            interfaceC4249.mo9709(this, abstractC2394);
        }
    }

    @Override // p374.InterfaceC4277
    /* renamed from: ˑי, reason: contains not printable characters */
    public final void mo9734(InterfaceC4249 interfaceC4249) {
        this.f16592.getClass();
        HashSet hashSet = this.f16591;
        boolean zIsEmpty = hashSet.isEmpty();
        hashSet.add(interfaceC4249);
        if (zIsEmpty) {
            mo9727();
        }
    }

    @Override // p374.InterfaceC4277
    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final void mo9735(InterfaceC4249 interfaceC4249) {
        ArrayList arrayList = this.f16595;
        arrayList.remove(interfaceC4249);
        if (!arrayList.isEmpty()) {
            mo9736(interfaceC4249);
            return;
        }
        this.f16592 = null;
        this.f16596 = null;
        this.f16597 = null;
        this.f16591.clear();
        mo6120();
    }

    @Override // p374.InterfaceC4277
    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public final void mo9736(InterfaceC4249 interfaceC4249) {
        HashSet hashSet = this.f16591;
        boolean zIsEmpty = hashSet.isEmpty();
        hashSet.remove(interfaceC4249);
        if (zIsEmpty || !hashSet.isEmpty()) {
            return;
        }
        mo9726();
    }

    /* renamed from: ᵎˏ */
    public void mo9726() {
    }

    @Override // p374.InterfaceC4277
    /* renamed from: ᵎـ, reason: contains not printable characters */
    public final void mo9737(Handler handler, InterfaceC4286 interfaceC4286) {
        handler.getClass();
        ᐧʻ r0 = this.f16593;
        r0.getClass();
        C4248 c4248 = new C4248();
        c4248.f16502 = handler;
        c4248.f16501 = interfaceC4286;
        ((CopyOnWriteArrayList) r0.ᐧˋ).add(c4248);
    }

    /* renamed from: ﹳˎ */
    public void mo9727() {
    }

    @Override // p374.InterfaceC4277
    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final void mo9738(InterfaceC4485 interfaceC4485) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f16594.f17251;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            C4499 c4499 = (C4499) it.next();
            if (c4499.f17316 == interfaceC4485) {
                copyOnWriteArrayList.remove(c4499);
            }
        }
    }

    /* renamed from: ﾞˊ */
    public abstract void mo6120();
}
