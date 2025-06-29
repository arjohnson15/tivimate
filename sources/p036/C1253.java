package p036;

import android.text.TextUtils;
import p166.C2431;
import p166.C2433;
import p345.AbstractC3925;
import p345.AbstractC3952;
import p345.C3932;
import p345.C3958;
import p345.C3965;
import p383.AbstractC4470;
import ᵎﹳ.ᐧʻ;

/* renamed from: ʼﹶ.ᐧʻ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1253 extends AbstractC1256 implements Comparable {

    /* renamed from: ʻʿ, reason: contains not printable characters */
    public final int f5130;

    /* renamed from: ʾʼ, reason: contains not printable characters */
    public final int f5131;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final int f5132;

    /* renamed from: ˊᵔ, reason: contains not printable characters */
    public final boolean f5133;

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public final C1245 f5134;

    /* renamed from: ˋﾞ, reason: contains not printable characters */
    public final boolean f5135;

    /* renamed from: ˎᵔ, reason: contains not printable characters */
    public final int f5136;

    /* renamed from: ˑⁱ, reason: contains not printable characters */
    public final boolean f5137;

    /* renamed from: ˑﾞ, reason: contains not printable characters */
    public final boolean f5138;

    /* renamed from: ـˆ, reason: contains not printable characters */
    public final boolean f5139;

    /* renamed from: ᴵʼ, reason: contains not printable characters */
    public final int f5140;

    /* renamed from: ᵔ, reason: contains not printable characters */
    public final int f5141;

    /* renamed from: ᵔٴ, reason: contains not printable characters */
    public final int f5142;

    /* renamed from: ᵔﹳ, reason: contains not printable characters */
    public final boolean f5143;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final boolean f5144;

    /* renamed from: ᵢٴ, reason: contains not printable characters */
    public final int f5145;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public final String f5146;

    /* renamed from: ﾞˎ, reason: contains not printable characters */
    public final int f5147;

    /* renamed from: ﾞᐧ, reason: contains not printable characters */
    public final int f5148;

    public C1253(int i, C2433 c2433, int i2, C1245 c1245, int i3, boolean z, C1252 c1252, int i4) {
        int i5;
        int iM4476;
        int iM44762;
        boolean z2;
        super(i, c2433, i2);
        this.f5134 = c1245;
        int i6 = c1245.f5098 ? 24 : 16;
        int i7 = 0;
        this.f5138 = false;
        this.f5146 = C1255.m4478(this.f5160.f9689);
        this.f5139 = ᐧʻ.ˏᵢ(i3, false);
        int i8 = 0;
        while (true) {
            C3932 c3932 = c1245.f9546;
            i5 = Integer.MAX_VALUE;
            if (i8 >= c3932.size()) {
                i8 = Integer.MAX_VALUE;
                iM4476 = 0;
                break;
            } else {
                iM4476 = C1255.m4476(this.f5160, (String) c3932.get(i8), false);
                if (iM4476 > 0) {
                    break;
                } else {
                    i8++;
                }
            }
        }
        this.f5148 = i8;
        this.f5140 = iM4476;
        this.f5131 = C1255.m4479(this.f5160.f9678, 0);
        C2431 c2431 = this.f5160;
        int i9 = c2431.f9678;
        this.f5137 = i9 == 0 || (i9 & 1) != 0;
        this.f5143 = (c2431.f9658 & 1) != 0;
        int i10 = c2431.f9662;
        this.f5130 = i10;
        this.f5142 = c2431.f9681;
        int i11 = c2431.f9691;
        this.f5141 = i11;
        this.f5144 = (i11 == -1 || i11 <= c1245.f9534) && (i10 == -1 || i10 <= c1245.f9530) && c1252.apply(c2431);
        String[] strArrM10207 = AbstractC4470.m10207();
        int i12 = 0;
        while (true) {
            if (i12 >= strArrM10207.length) {
                i12 = Integer.MAX_VALUE;
                iM44762 = 0;
                break;
            } else {
                iM44762 = C1255.m4476(this.f5160, strArrM10207[i12], false);
                if (iM44762 > 0) {
                    break;
                } else {
                    i12++;
                }
            }
        }
        this.f5145 = i12;
        this.f5136 = iM44762;
        int i13 = 0;
        while (true) {
            C3932 c39322 = c1245.f9531;
            if (i13 < c39322.size()) {
                String str = this.f5160.f9667;
                if (str != null && str.equals(c39322.get(i13))) {
                    i5 = i13;
                    break;
                }
                i13++;
            } else {
                break;
            }
        }
        this.f5147 = i5;
        this.f5133 = ᐧʻ.ﹳﹳ(i3) == 128;
        this.f5135 = ᐧʻ.ʿʼ(i3) == 64;
        C1245 c12452 = this.f5134;
        if (ᐧʻ.ˏᵢ(i3, c12452.f5093) && ((z2 = this.f5144) || c12452.f5092)) {
            c12452.f9532.getClass();
            i7 = (!ᐧʻ.ˏᵢ(i3, false) || !z2 || this.f5160.f9691 == -1 || (!c12452.f5091 && z) || (i6 & i3) == 0) ? 1 : 2;
        }
        this.f5132 = i7;
    }

    @Override // p036.AbstractC1256
    /* renamed from: ʽᐧ */
    public final boolean mo4469(AbstractC1256 abstractC1256) {
        int i;
        String str;
        C1253 c1253 = (C1253) abstractC1256;
        this.f5134.getClass();
        C2431 c2431 = this.f5160;
        int i2 = c2431.f9662;
        if (i2 != -1) {
            C2431 c24312 = c1253.f5160;
            if (i2 == c24312.f9662 && ((this.f5138 || ((str = c2431.f9667) != null && TextUtils.equals(str, c24312.f9667))) && (i = c2431.f9681) != -1 && i == c24312.f9681)) {
                if (this.f5133 == c1253.f5133 && this.f5135 == c1253.f5135) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.lang.Comparable
    /* renamed from: ˑʽ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final int compareTo(C1253 c1253) {
        boolean z = this.f5139;
        boolean z2 = this.f5144;
        AbstractC3925 abstractC3925Mo9123 = (z2 && z) ? C1255.f5150 : C1255.f5150.mo9123();
        AbstractC3952 abstractC3952Mo9157 = AbstractC3952.f15315.mo9157(z, c1253.f5139);
        Integer numValueOf = Integer.valueOf(this.f5148);
        Integer numValueOf2 = Integer.valueOf(c1253.f5148);
        C3965.f15337.getClass();
        C3958 c3958 = C3958.f15329;
        AbstractC3952 abstractC3952Mo9155 = abstractC3952Mo9157.mo9155(numValueOf, numValueOf2, c3958).mo9158(this.f5140, c1253.f5140).mo9158(this.f5131, c1253.f5131).mo9157(this.f5143, c1253.f5143).mo9157(this.f5137, c1253.f5137).mo9155(Integer.valueOf(this.f5145), Integer.valueOf(c1253.f5145), c3958).mo9158(this.f5136, c1253.f5136).mo9157(z2, c1253.f5144).mo9155(Integer.valueOf(this.f5147), Integer.valueOf(c1253.f5147), c3958);
        this.f5134.getClass();
        AbstractC3952 abstractC3952Mo91552 = abstractC3952Mo9155.mo9157(this.f5133, c1253.f5133).mo9157(this.f5135, c1253.f5135).mo9155(Integer.valueOf(this.f5130), Integer.valueOf(c1253.f5130), abstractC3925Mo9123).mo9155(Integer.valueOf(this.f5142), Integer.valueOf(c1253.f5142), abstractC3925Mo9123);
        if (AbstractC4470.m10194(this.f5146, c1253.f5146)) {
            abstractC3952Mo91552 = abstractC3952Mo91552.mo9155(Integer.valueOf(this.f5141), Integer.valueOf(c1253.f5141), abstractC3925Mo9123);
        }
        return abstractC3952Mo91552.mo9156();
    }

    @Override // p036.AbstractC1256
    /* renamed from: ـﹶ */
    public final int mo4470() {
        return this.f5132;
    }
}
