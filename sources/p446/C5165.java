package p446;

import com.google.android.gms.internal.measurement.C0559;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.NoSuchElementException;
import p018.C1099;
import p018.C1101;
import p018.EnumC1103;
import p078.C1696;
import p193.AbstractC2685;
import p193.AbstractC2690;
import p193.C2681;
import p193.C2686;
import p193.InterfaceC2689;
import p283.InterfaceC3379;
import ʿﾞ.ﹳﹳ;

/* renamed from: ﾞˉ.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C5165 implements Iterator {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public C2681 f19736;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final String f19737;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public byte[] f19738;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public AbstractC2690 f19739;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final InterfaceC2689 f19740 = AbstractC2685.m6863(C2686.class);

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final /* synthetic */ C5157 f19741;

    public C5165(C5157 c5157, String str) {
        AbstractC2690 abstractC2690;
        this.f19741 = c5157;
        this.f19737 = str;
        m11462(true);
        while (true) {
            C2681 c2681 = this.f19736;
            if (c2681 == null) {
                abstractC2690 = null;
                break;
            } else {
                if (c2681.hasNext()) {
                    abstractC2690 = (AbstractC2690) this.f19736.next();
                    break;
                }
                m11462(false);
            }
        }
        this.f19739 = abstractC2690;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f19739 != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        AbstractC2690 abstractC2690;
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        AbstractC2690 abstractC26902 = this.f19739;
        while (true) {
            C2681 c2681 = this.f19736;
            if (c2681 == null) {
                abstractC2690 = null;
                break;
            }
            if (c2681.hasNext()) {
                abstractC2690 = (AbstractC2690) this.f19736.next();
                break;
            }
            m11462(false);
        }
        this.f19739 = abstractC2690;
        return abstractC26902;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void m11462(boolean z) {
        byte[] bArr;
        C5157 c5157 = this.f19741;
        C5168 c5168 = c5157.f19732;
        EnumSet enumSetOf = z ? EnumSet.of(EnumC1103.f4697) : EnumSet.noneOf(EnumC1103.class);
        InterfaceC2689 interfaceC2689 = this.f19740;
        int iMo6865 = interfaceC2689.mo6865();
        C0559 c0559 = c5157.f19733;
        C1101 c1101 = (C1101) c5168.m11457(new C1099(c5168.f19712, c5168.f19710, c5168.f19714, c0559, iMo6865, enumSetOf, this.f19737, c5168.f19719), "Query directory", c0559, AbstractC5160.f19708, c5168.f19722);
        long j = ((C1696) ((InterfaceC3379) ((ﹳﹳ) c1101).ᐧⁱ)).f6598;
        byte[] bArr2 = c1101.f4693;
        if (j == 2147483654L || j == 3221225487L || ((bArr = this.f19738) != null && Arrays.equals(bArr, bArr2))) {
            this.f19736 = null;
            this.f19738 = null;
        } else {
            this.f19738 = bArr2;
            HashMap map = AbstractC2685.f10595;
            this.f19736 = new C2681(bArr2, interfaceC2689);
        }
    }
}
