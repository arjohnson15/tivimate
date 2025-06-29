package p456;

import android.os.Parcel;
import android.os.Parcelable;
import p177.AbstractC2491;
import p417.AbstractC4753;
import p417.C4749;
import ˈⁱ.ˉⁱ;

/* renamed from: ﾞⁱ.ˑˉ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C5290 extends AbstractC2491 {
    public static final Parcelable.Creator<C5290> CREATOR = new C4749(12);

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final String f20532;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final String f20533;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final long f20534;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final Long f20535;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final int f20536;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final String f20537;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public final Double f20538;

    public C5290(int i, String str, long j, Long l, Float f, String str2, String str3, Double d) {
        this.f20536 = i;
        this.f20532 = str;
        this.f20534 = j;
        this.f20535 = l;
        if (i == 1) {
            this.f20538 = f != null ? Double.valueOf(f.doubleValue()) : null;
        } else {
            this.f20538 = d;
        }
        this.f20533 = str2;
        this.f20537 = str3;
    }

    public C5290(long j, Object obj, String str, String str2) {
        AbstractC4753.m10688(str);
        this.f20536 = 2;
        this.f20532 = str;
        this.f20534 = j;
        this.f20537 = str2;
        if (obj == null) {
            this.f20535 = null;
            this.f20538 = null;
            this.f20533 = null;
            return;
        }
        if (obj instanceof Long) {
            this.f20535 = (Long) obj;
            this.f20538 = null;
            this.f20533 = null;
        } else if (obj instanceof String) {
            this.f20535 = null;
            this.f20538 = null;
            this.f20533 = (String) obj;
        } else {
            if (!(obj instanceof Double)) {
                throw new IllegalArgumentException("User attribute given of un-supported type");
            }
            this.f20535 = null;
            this.f20538 = (Double) obj;
            this.f20533 = null;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C5290(C5234 c5234) {
        String str = c5234.f20086;
        this(c5234.f20088, c5234.f20085, str, c5234.f20084);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = ˉⁱ.ˑﾞ(parcel, 20293);
        ˉⁱ.ᵢٴ(parcel, 1, 4);
        parcel.writeInt(this.f20536);
        ˉⁱ.ᴵʼ(parcel, 2, this.f20532);
        ˉⁱ.ᵢٴ(parcel, 3, 8);
        parcel.writeLong(this.f20534);
        Long l = this.f20535;
        if (l != null) {
            ˉⁱ.ᵢٴ(parcel, 4, 8);
            parcel.writeLong(l.longValue());
        }
        ˉⁱ.ᴵʼ(parcel, 6, this.f20533);
        ˉⁱ.ᴵʼ(parcel, 7, this.f20537);
        Double d = this.f20538;
        if (d != null) {
            ˉⁱ.ᵢٴ(parcel, 8, 8);
            parcel.writeDouble(d.doubleValue());
        }
        ˉⁱ.ˑⁱ(parcel, i2);
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final Object m11869() {
        Long l = this.f20535;
        if (l != null) {
            return l;
        }
        Double d = this.f20538;
        if (d != null) {
            return d;
        }
        String str = this.f20533;
        if (str != null) {
            return str;
        }
        return null;
    }
}
