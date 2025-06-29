package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import p331.C3762;
import p331.C3767;

/* renamed from: com.google.android.gms.internal.measurement.ˋˊ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0397 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public ﹶˋ.ـﹶ f2674;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final C3762 f2675;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final ᴵﹳ.ﹶˆ f2676;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final C3767 f2677;

    public C0397() {
        ᴵﹳ.ﹶˆ r0 = new ᴵﹳ.ﹶˆ(2);
        this.f2676 = r0;
        this.f2674 = ((ﹶˋ.ـﹶ) r0.ˆʿ).ﹳˑ();
        C3762 c3762 = new C3762(1);
        c3762.f14530 = new C0423("", 0L, null);
        c3762.f14531 = new C0423("", 0L, null);
        c3762.f14532 = new ArrayList();
        this.f2675 = c3762;
        this.f2677 = new C3767(1);
        CallableC0463 callableC0463 = new CallableC0463(0);
        callableC0463.f2782 = this;
        C0355 c0355 = (C0355) r0.ᐧˋ;
        ((HashMap) c0355.f2536).put("internal.registerCallback", callableC0463);
        CallableC0463 callableC04632 = new CallableC0463(1);
        callableC04632.f2782 = this;
        ((HashMap) c0355.f2536).put("internal.eventLogger", callableC04632);
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final boolean m2135(C0423 c0423) {
        C3762 c3762 = this.f2675;
        try {
            c3762.f14530 = c0423;
            c3762.f14531 = (C0423) c0423.clone();
            ((ArrayList) c3762.f14532).clear();
            ((ﹶˋ.ـﹶ) this.f2676.ˎˑ).ˆʿ("runtime.counter", new C0477(Double.valueOf(0.0d)));
            this.f2677.m8815(this.f2674.ﹳˑ(), c3762);
            C3762 c37622 = this.f2675;
            if (((C0423) c37622.f14531).equals((C0423) c37622.f14530)) {
                return !((ArrayList) this.f2675.f14532).isEmpty();
            }
            return true;
        } catch (Throwable th) {
            throw new zzc(th);
        }
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void m2136(C0540 c0540) {
        AbstractC0381 abstractC0381;
        ᴵﹳ.ﹶˆ r1 = this.f2676;
        try {
            this.f2674 = ((ﹶˋ.ـﹶ) r1.ˆʿ).ﹳˑ();
            if (r1.ʻʿ(this.f2674, (C0389[]) c0540.m2434().toArray(new C0389[0])) instanceof C0421) {
                throw new IllegalStateException("Program loading failed");
            }
            for (C0582 c0582 : c0540.m2435().m1965()) {
                InterfaceC0465 interfaceC0465M2529 = c0582.m2529();
                String strM2530 = c0582.m2530();
                Iterator it = interfaceC0465M2529.iterator();
                while (it.hasNext()) {
                    InterfaceC0489 interfaceC0489 = r1.ʻʿ(this.f2674, new C0389[]{(C0389) it.next()});
                    if (!(interfaceC0489 instanceof C0402)) {
                        throw new IllegalArgumentException("Invalid rule definition");
                    }
                    ﹶˋ.ـﹶ r5 = this.f2674;
                    if (r5.ᐧⁱ(strM2530)) {
                        InterfaceC0489 interfaceC04892 = r5.יʻ(strM2530);
                        if (!(interfaceC04892 instanceof AbstractC0381)) {
                            throw new IllegalStateException("Invalid function name: " + strM2530);
                        }
                        abstractC0381 = (AbstractC0381) interfaceC04892;
                    } else {
                        abstractC0381 = null;
                    }
                    if (abstractC0381 == null) {
                        throw new IllegalStateException("Rule function is undefined: " + strM2530);
                    }
                    abstractC0381.mo1817(this.f2674, Collections.singletonList(interfaceC0489));
                }
            }
        } catch (Throwable th) {
            throw new zzc(th);
        }
    }
}
