package p036;

import java.util.Comparator;
import p166.C2433;
import p345.AbstractC3952;
import p345.AbstractC3980;
import p345.C3932;
import p345.C3958;
import p345.C3965;
import ᵎﹳ.ᐧʻ;

/* renamed from: ʼﹶ.ˏᴵ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1246 extends AbstractC1256 implements Comparable {

    /* renamed from: ʾʼ, reason: contains not printable characters */
    public final int f5099;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final int f5100;

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public final boolean f5101;

    /* renamed from: ˑﾞ, reason: contains not printable characters */
    public final boolean f5102;

    /* renamed from: ـˆ, reason: contains not printable characters */
    public final int f5103;

    /* renamed from: ᴵʼ, reason: contains not printable characters */
    public final int f5104;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final boolean f5105;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public final boolean f5106;

    /* renamed from: ﾞᐧ, reason: contains not printable characters */
    public final int f5107;

    public C1246(int i, C2433 c2433, int i2, C1245 c1245, int i3, String str) {
        int iM4476;
        super(i, c2433, i2);
        int i4 = 0;
        this.f5105 = ᐧʻ.ˏᵢ(i3, false);
        int i5 = this.f5160.f9658 & (~c1245.f9538);
        this.f5106 = (i5 & 1) != 0;
        this.f5101 = (i5 & 2) != 0;
        C3932 c3932 = c1245.f9542;
        C3932 c3932M9207 = c3932.isEmpty() ? AbstractC3980.m9207("") : c3932;
        int i6 = 0;
        while (true) {
            if (i6 >= c3932M9207.size()) {
                i6 = Integer.MAX_VALUE;
                iM4476 = 0;
                break;
            } else {
                iM4476 = C1255.m4476(this.f5160, (String) c3932M9207.get(i6), c1245.f9544);
                if (iM4476 > 0) {
                    break;
                } else {
                    i6++;
                }
            }
        }
        this.f5103 = i6;
        this.f5104 = iM4476;
        int iM4479 = C1255.m4479(this.f5160.f9678, c1245.f9535);
        this.f5107 = iM4479;
        this.f5102 = (this.f5160.f9678 & 1088) != 0;
        int iM44762 = C1255.m4476(this.f5160, str, C1255.m4478(str) == null);
        this.f5099 = iM44762;
        boolean z = iM4476 > 0 || (c3932.isEmpty() && iM4479 > 0) || this.f5106 || (this.f5101 && iM44762 > 0);
        if (ᐧʻ.ˏᵢ(i3, c1245.f5093) && z) {
            i4 = 1;
        }
        this.f5100 = i4;
    }

    @Override // p036.AbstractC1256
    /* renamed from: ʽᐧ */
    public final /* bridge */ /* synthetic */ boolean mo4469(AbstractC1256 abstractC1256) {
        return false;
    }

    @Override // java.lang.Comparable
    /* renamed from: ˑʽ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final int compareTo(C1246 c1246) {
        AbstractC3952 abstractC3952Mo9157 = AbstractC3952.f15315.mo9157(this.f5105, c1246.f5105);
        Integer numValueOf = Integer.valueOf(this.f5103);
        Integer numValueOf2 = Integer.valueOf(c1246.f5103);
        Comparator comparator = C3965.f15337;
        comparator.getClass();
        C3958 c3958 = C3958.f15329;
        AbstractC3952 abstractC3952Mo9155 = abstractC3952Mo9157.mo9155(numValueOf, numValueOf2, c3958);
        int i = this.f5104;
        AbstractC3952 abstractC3952Mo9158 = abstractC3952Mo9155.mo9158(i, c1246.f5104);
        int i2 = this.f5107;
        AbstractC3952 abstractC3952Mo91572 = abstractC3952Mo9158.mo9158(i2, c1246.f5107).mo9157(this.f5106, c1246.f5106);
        Boolean boolValueOf = Boolean.valueOf(this.f5101);
        Boolean boolValueOf2 = Boolean.valueOf(c1246.f5101);
        if (i != 0) {
            comparator = c3958;
        }
        AbstractC3952 abstractC3952Mo91582 = abstractC3952Mo91572.mo9155(boolValueOf, boolValueOf2, comparator).mo9158(this.f5099, c1246.f5099);
        if (i2 == 0) {
            abstractC3952Mo91582 = abstractC3952Mo91582.mo9159(this.f5102, c1246.f5102);
        }
        return abstractC3952Mo91582.mo9156();
    }

    @Override // p036.AbstractC1256
    /* renamed from: ـﹶ */
    public final int mo4470() {
        return this.f5100;
    }
}
