package p423;

import kotlinx.coroutines.internal.UndeliveredElementException;
import p070.AbstractC1563;
import p072.InterfaceC1576;
import p148.AbstractC2269;
import p192.InterfaceC2670;
import p288.C3397;
import p330.InterfaceC3746;
import p338.InterfaceC3856;
import p447.AbstractC5179;
import ˈי.ʾˈ;

/* renamed from: ﹶʻ.ᵎـ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4886 extends C4883 {

    /* renamed from: ʾʼ, reason: contains not printable characters */
    public final int f18419;

    public C4886(int i, int i2, InterfaceC3856 interfaceC3856) {
        super(i, interfaceC3856);
        this.f18419 = i2;
        if (i2 != 1) {
            if (i < 1) {
                throw new IllegalArgumentException(AbstractC5179.m11548(i, "Buffered channel capacity must be at least 1, but ", " was specified").toString());
            }
        } else {
            throw new IllegalArgumentException(("This implementation does not support suspension for senders, use " + AbstractC1563.m5154(C4883.class).m5133() + " instead").toString());
        }
    }

    /* renamed from: ʾʼ, reason: contains not printable characters */
    public final Object m11002(Object obj, boolean z) {
        C4880 c4880;
        InterfaceC3856 interfaceC3856;
        UndeliveredElementException undeliveredElementExceptionM6276;
        C3397 c3397 = C3397.f13249;
        if (this.f18419 == 3) {
            Object objMo10958 = super.mo10958(obj);
            if (!(objMo10958 instanceof C4884) || (objMo10958 instanceof C4874)) {
                return objMo10958;
            }
            if (!z || (interfaceC3856 = this.f18417) == null || (undeliveredElementExceptionM6276 = AbstractC2269.m6276(interfaceC3856, obj, null)) == null) {
                return c3397;
            }
            throw undeliveredElementExceptionM6276;
        }
        InterfaceC2670 interfaceC2670 = AbstractC4889.f18438;
        C4880 c48802 = (C4880) C4883.f18415.get(this);
        while (true) {
            long andIncrement = C4883.f18410.getAndIncrement(this);
            long j = andIncrement & 1152921504606846975L;
            boolean zM11000 = m11000(false, andIncrement);
            int i = AbstractC4889.f18421;
            long j2 = i;
            long j3 = j / j2;
            int i2 = (int) (j % j2);
            if (c48802.f8996 != j3) {
                C4880 c4880M10969 = C4883.m10969(this, j3, c48802);
                if (c4880M10969 != null) {
                    c4880 = c4880M10969;
                } else if (zM11000) {
                    return new C4874(m10995());
                }
            } else {
                c4880 = c48802;
            }
            int iM10974 = C4883.m10974(this, c4880, i2, obj, j, interfaceC2670, zM11000);
            if (iM10974 == 0) {
                c4880.m6256();
                return c3397;
            }
            if (iM10974 == 1) {
                return c3397;
            }
            if (iM10974 == 2) {
                if (zM11000) {
                    c4880.m6272();
                    return new C4874(m10995());
                }
                InterfaceC1576 interfaceC1576 = interfaceC2670 instanceof InterfaceC1576 ? (InterfaceC1576) interfaceC2670 : null;
                if (interfaceC1576 != null) {
                    interfaceC1576.mo5165(c4880, i2 + i);
                }
                m10980((c4880.f8996 * j2) + i2);
                return c3397;
            }
            if (iM10974 == 3) {
                throw new IllegalStateException("unexpected");
            }
            if (iM10974 == 4) {
                if (j < C4883.f18412.get(this)) {
                    c4880.m6256();
                }
                return new C4874(m10995());
            }
            if (iM10974 == 5) {
                c4880.m6256();
            }
            c48802 = c4880;
        }
    }

    @Override // p423.C4883, p423.InterfaceC4891
    /* renamed from: ʿʼ */
    public final Object mo10956(Object obj, InterfaceC3746 interfaceC3746) throws Throwable {
        UndeliveredElementException undeliveredElementExceptionM6276;
        if (!(m11002(obj, true) instanceof C4874)) {
            return C3397.f13249;
        }
        InterfaceC3856 interfaceC3856 = this.f18417;
        if (interfaceC3856 == null || (undeliveredElementExceptionM6276 = AbstractC2269.m6276(interfaceC3856, obj, null)) == null) {
            throw m10995();
        }
        ʾˈ.ـﹶ(undeliveredElementExceptionM6276, m10995());
        throw undeliveredElementExceptionM6276;
    }

    @Override // p423.C4883, p423.InterfaceC4891
    /* renamed from: ˑי */
    public final Object mo10958(Object obj) {
        return m11002(obj, false);
    }

    @Override // p423.C4883
    /* renamed from: ﹳˑ */
    public final boolean mo10996() {
        return this.f18419 == 2;
    }
}
