package p423;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p034.C1228;
import p072.AbstractC1642;
import p072.C1602;
import p072.InterfaceC1576;
import p118.C1848;
import p148.AbstractC2263;
import p148.AbstractC2273;
import p185.AbstractC2562;
import p288.C3403;
import p338.InterfaceC3856;
import ⁱـ.ˑי;

/* renamed from: ﹶʻ.ˑʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4879 implements InterfaceC1576 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public C1602 f18400;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final /* synthetic */ C4883 f18401;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public Object f18402 = AbstractC4889.f18431;

    public C4879(C4883 c4883) {
        this.f18401 = c4883;
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final Object m10962(AbstractC2562 abstractC2562) throws Throwable {
        C4880 c4880;
        Boolean bool;
        C4880 c48802;
        int i = 2;
        Object obj = this.f18402;
        boolean z = true;
        if (obj == AbstractC4889.f18431 || obj == AbstractC4889.f18424) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C4883.f18409;
            C4883 c4883 = this.f18401;
            C4880 c48803 = (C4880) atomicReferenceFieldUpdater.get(c4883);
            while (true) {
                if (c4883.m10999()) {
                    this.f18402 = AbstractC4889.f18424;
                    Throwable thM10983 = c4883.m10983();
                    if (thM10983 != null) {
                        int i2 = AbstractC2273.f9018;
                        throw thM10983;
                    }
                    z = false;
                } else {
                    long andIncrement = C4883.f18412.getAndIncrement(c4883);
                    long j = AbstractC4889.f18421;
                    long j2 = andIncrement / j;
                    int i3 = (int) (andIncrement % j);
                    if (c48803.f8996 != j2) {
                        C4880 c4880M10992 = c4883.m10992(j2, c48803);
                        if (c4880M10992 == null) {
                            continue;
                        } else {
                            c4880 = c4880M10992;
                        }
                    } else {
                        c4880 = c48803;
                    }
                    Object objM10987 = c4883.m10987(c4880, i3, andIncrement, null);
                    C1228 c1228 = AbstractC4889.f18425;
                    if (objM10987 == c1228) {
                        throw new IllegalStateException("unreachable");
                    }
                    C1228 c12282 = AbstractC4889.f18428;
                    if (objM10987 == c12282) {
                        if (andIncrement < c4883.m10975()) {
                            c4880.m6256();
                        }
                        c48803 = c4880;
                    } else {
                        if (objM10987 == AbstractC4889.f18435) {
                            C4883 c48832 = this.f18401;
                            C1602 c1602M5286 = AbstractC1642.m5286(ˑי.ˏᴵ(abstractC2562));
                            try {
                                this.f18400 = c1602M5286;
                                C4880 c48804 = c4880;
                                Object objM109872 = c48832.m10987(c4880, i3, andIncrement, this);
                                if (objM109872 == c1228) {
                                    mo5165(c48804, i3);
                                } else {
                                    C1848 c1848 = null;
                                    InterfaceC3856 interfaceC3856 = c48832.f18417;
                                    if (objM109872 == c12282) {
                                        if (andIncrement < c48832.m10975()) {
                                            c48804.m6256();
                                        }
                                        C4880 c48805 = (C4880) C4883.f18409.get(c48832);
                                        while (true) {
                                            if (c48832.m10999()) {
                                                C1602 c1602 = this.f18400;
                                                this.f18400 = null;
                                                this.f18402 = AbstractC4889.f18424;
                                                Throwable thM109832 = c4883.m10983();
                                                if (thM109832 == null) {
                                                    c1602.mo3974(Boolean.FALSE);
                                                } else {
                                                    c1602.mo3974(new C3403(thM109832));
                                                }
                                            } else {
                                                long andIncrement2 = C4883.f18412.getAndIncrement(c48832);
                                                long j3 = AbstractC4889.f18421;
                                                long j4 = andIncrement2 / j3;
                                                int i4 = (int) (andIncrement2 % j3);
                                                if (c48805.f8996 != j4) {
                                                    C4880 c4880M109922 = c48832.m10992(j4, c48805);
                                                    if (c4880M109922 != null) {
                                                        c48802 = c4880M109922;
                                                    }
                                                } else {
                                                    c48802 = c48805;
                                                }
                                                Object objM109873 = c48832.m10987(c48802, i4, andIncrement2, this);
                                                if (objM109873 == AbstractC4889.f18425) {
                                                    mo5165(c48802, i4);
                                                    break;
                                                }
                                                if (objM109873 == AbstractC4889.f18428) {
                                                    if (andIncrement2 < c48832.m10975()) {
                                                        c48802.m6256();
                                                    }
                                                    c48805 = c48802;
                                                } else {
                                                    if (objM109873 == AbstractC4889.f18435) {
                                                        throw new IllegalStateException("unexpected");
                                                    }
                                                    c48802.m6256();
                                                    this.f18402 = objM109873;
                                                    this.f18400 = null;
                                                    bool = Boolean.TRUE;
                                                    if (interfaceC3856 != null) {
                                                        c1848 = new C1848(interfaceC3856, i, objM109873);
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        c48804.m6256();
                                        this.f18402 = objM109872;
                                        this.f18400 = null;
                                        bool = Boolean.TRUE;
                                        if (interfaceC3856 != null) {
                                            c1848 = new C1848(interfaceC3856, i, objM109872);
                                        }
                                    }
                                    c1602M5286.mo5182(bool, c1848);
                                }
                                return c1602M5286.m5203();
                            } catch (Throwable th) {
                                c1602M5286.m5204();
                                throw th;
                            }
                        }
                        c4880.m6256();
                        this.f18402 = objM10987;
                    }
                }
            }
        }
        return Boolean.valueOf(z);
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final Object m10963() throws Throwable {
        Object obj = this.f18402;
        C1228 c1228 = AbstractC4889.f18431;
        if (obj == c1228) {
            throw new IllegalStateException("`hasNext()` has not been invoked");
        }
        this.f18402 = c1228;
        if (obj != AbstractC4889.f18424) {
            return obj;
        }
        Throwable thM10993 = this.f18401.m10993();
        int i = AbstractC2273.f9018;
        throw thM10993;
    }

    @Override // p072.InterfaceC1576
    /* renamed from: ـﹶ */
    public final void mo5165(AbstractC2263 abstractC2263, int i) {
        C1602 c1602 = this.f18400;
        if (c1602 != null) {
            c1602.mo5165(abstractC2263, i);
        }
    }
}
