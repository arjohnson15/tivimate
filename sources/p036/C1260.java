package p036;

import p166.C2431;
import p345.AbstractC3952;
import ᵎﹳ.ᐧʻ;

/* renamed from: ʼﹶ.ﹶˆ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1260 implements Comparable {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final boolean f5170;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final boolean f5171;

    public C1260(C2431 c2431, int i) {
        this.f5171 = (c2431.f9658 & 1) != 0;
        this.f5170 = ᐧʻ.ˏᵢ(i, false);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C1260 c1260 = (C1260) obj;
        return AbstractC3952.f15315.mo9157(this.f5170, c1260.f5170).mo9157(this.f5171, c1260.f5171).mo9156();
    }
}
