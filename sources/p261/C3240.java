package p261;

import com.bumptech.glide.C0290;
import com.bumptech.glide.load.data.InterfaceC0281;
import j$.util.DesugarCollections;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import p003.C0910;
import p003.InterfaceC0913;
import p200.C2741;
import p314.InterfaceC3594;
import p314.InterfaceC3596;
import p329.C3734;
import p331.C3761;

/* renamed from: ـ.יʻ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3240 implements InterfaceC3243, InterfaceC0281 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final C3237 f12636;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public InterfaceC3594 f12637;

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public volatile C0910 f12638;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public int f12639;

    /* renamed from: ـˆ, reason: contains not printable characters */
    public File f12640;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public int f12641 = -1;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final RunnableC3230 f12642;

    /* renamed from: ᴵʼ, reason: contains not printable characters */
    public C3248 f12643;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public List f12644;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public int f12645;

    public C3240(C3237 c3237, RunnableC3230 runnableC3230) {
        this.f12636 = c3237;
        this.f12642 = runnableC3230;
    }

    @Override // p261.InterfaceC3243
    public final void cancel() {
        C0910 c0910 = this.f12638;
        if (c0910 != null) {
            c0910.f4067.cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.InterfaceC0281
    /* renamed from: ʿʼ */
    public final void mo1540(Object obj) {
        this.f12642.mo7959(this.f12637, obj, this.f12638.f4067, 4, this.f12643);
    }

    @Override // com.bumptech.glide.load.data.InterfaceC0281
    /* renamed from: ˑʽ */
    public final void mo1541(Exception exc) {
        this.f12642.mo7961(this.f12643, exc, this.f12638.f4067, 4);
    }

    @Override // p261.InterfaceC3243
    /* renamed from: ﹳﹳ */
    public final boolean mo7962() {
        List list;
        ArrayList arrayListM7993 = this.f12636.m7993();
        boolean z = false;
        if (arrayListM7993.isEmpty()) {
            return false;
        }
        C3237 c3237 = this.f12636;
        C0290 c0290M1555 = c3237.f12626.m1555();
        Class<?> cls = c3237.f12633.getClass();
        Class cls2 = c3237.f12630;
        Class cls3 = c3237.f12623;
        C3761 c3761 = c0290M1555.f2378;
        C3734 c3734 = (C3734) ((AtomicReference) c3761.f14527).getAndSet(null);
        if (c3734 == null) {
            c3734 = new C3734(cls, cls2, cls3);
        } else {
            c3734.f14491 = cls;
            c3734.f14489 = cls2;
            c3734.f14490 = cls3;
        }
        synchronized (((C2741) c3761.f14528)) {
            list = (List) ((C2741) c3761.f14528).get(c3734);
        }
        ((AtomicReference) c3761.f14527).set(c3734);
        List list2 = list;
        if (list == null) {
            ArrayList arrayList = new ArrayList();
            Iterator it = c0290M1555.f2380.m3739(cls).iterator();
            while (it.hasNext()) {
                Iterator it2 = c0290M1555.f2379.m8752((Class) it.next(), cls2).iterator();
                while (it2.hasNext()) {
                    Class cls4 = (Class) it2.next();
                    if (!c0290M1555.f2381.m4165(cls4, cls3).isEmpty() && !arrayList.contains(cls4)) {
                        arrayList.add(cls4);
                    }
                }
            }
            c0290M1555.f2378.m8766(cls, cls2, cls3, DesugarCollections.unmodifiableList(arrayList));
            list2 = arrayList;
        }
        if (list2.isEmpty()) {
            if (File.class.equals(this.f12636.f12623)) {
                return false;
            }
            throw new IllegalStateException("Failed to find any load path from " + this.f12636.f12633.getClass() + " to " + this.f12636.f12623);
        }
        while (true) {
            List list3 = this.f12644;
            if (list3 != null && this.f12645 < list3.size()) {
                this.f12638 = null;
                while (!z && this.f12645 < this.f12644.size()) {
                    List list4 = this.f12644;
                    int i = this.f12645;
                    this.f12645 = i + 1;
                    InterfaceC0913 interfaceC0913 = (InterfaceC0913) list4.get(i);
                    File file = this.f12640;
                    C3237 c32372 = this.f12636;
                    this.f12638 = interfaceC0913.mo3705(file, c32372.f12618, c32372.f12629, c32372.f12634);
                    if (this.f12638 != null && this.f12636.m7992(this.f12638.f4067.mo1533()) != null) {
                        this.f12638.f4067.mo1529(this.f12636.f12624, this);
                        z = true;
                    }
                }
                return z;
            }
            int i2 = this.f12641 + 1;
            this.f12641 = i2;
            if (i2 >= list2.size()) {
                int i3 = this.f12639 + 1;
                this.f12639 = i3;
                if (i3 >= arrayListM7993.size()) {
                    return false;
                }
                this.f12641 = 0;
            }
            InterfaceC3594 interfaceC3594 = (InterfaceC3594) arrayListM7993.get(this.f12639);
            Class cls5 = (Class) list2.get(this.f12641);
            InterfaceC3596 interfaceC3596M7991 = this.f12636.m7991(cls5);
            C3237 c32373 = this.f12636;
            this.f12643 = new C3248(c32373.f12626.f2351, interfaceC3594, c32373.f12631, c32373.f12618, c32373.f12629, interfaceC3596M7991, cls5, c32373.f12634);
            File fileMo7037 = c32373.f12625.m8419().mo7037(this.f12643);
            this.f12640 = fileMo7037;
            if (fileMo7037 != null) {
                this.f12637 = interfaceC3594;
                this.f12644 = this.f12636.f12626.m1555().m1592(fileMo7037);
                this.f12645 = 0;
            }
        }
    }
}
