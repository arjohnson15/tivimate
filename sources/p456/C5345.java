package p456;

import android.os.Parcel;
import android.os.Parcelable;
import p177.AbstractC2491;
import p417.AbstractC4753;
import p417.C4749;
import ˈⁱ.ˉⁱ;

/* renamed from: ﾞⁱ.ﹳﹳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C5345 extends AbstractC2491 {
    public static final Parcelable.Creator<C5345> CREATOR = new C4749(6);

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public String f20725;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public boolean f20726;

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public long f20727;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public C5290 f20728;

    /* renamed from: ـˆ, reason: contains not printable characters */
    public C5343 f20729;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public long f20730;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public String f20731;

    /* renamed from: ᴵʼ, reason: contains not printable characters */
    public final long f20732;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public String f20733;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public final C5343 f20734;

    /* renamed from: ﾞᐧ, reason: contains not printable characters */
    public final C5343 f20735;

    public C5345(String str, String str2, C5290 c5290, long j, boolean z, String str3, C5343 c5343, long j2, C5343 c53432, long j3, C5343 c53433) {
        this.f20731 = str;
        this.f20725 = str2;
        this.f20728 = c5290;
        this.f20730 = j;
        this.f20726 = z;
        this.f20733 = str3;
        this.f20734 = c5343;
        this.f20727 = j2;
        this.f20729 = c53432;
        this.f20732 = j3;
        this.f20735 = c53433;
    }

    public C5345(C5345 c5345) {
        AbstractC4753.m10683(c5345);
        this.f20731 = c5345.f20731;
        this.f20725 = c5345.f20725;
        this.f20728 = c5345.f20728;
        this.f20730 = c5345.f20730;
        this.f20726 = c5345.f20726;
        this.f20733 = c5345.f20733;
        this.f20734 = c5345.f20734;
        this.f20727 = c5345.f20727;
        this.f20729 = c5345.f20729;
        this.f20732 = c5345.f20732;
        this.f20735 = c5345.f20735;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = ˉⁱ.ˑﾞ(parcel, 20293);
        ˉⁱ.ᴵʼ(parcel, 2, this.f20731);
        ˉⁱ.ᴵʼ(parcel, 3, this.f20725);
        ˉⁱ.ـˆ(parcel, 4, this.f20728, i);
        long j = this.f20730;
        ˉⁱ.ᵢٴ(parcel, 5, 8);
        parcel.writeLong(j);
        boolean z = this.f20726;
        ˉⁱ.ᵢٴ(parcel, 6, 4);
        parcel.writeInt(z ? 1 : 0);
        ˉⁱ.ᴵʼ(parcel, 7, this.f20733);
        ˉⁱ.ـˆ(parcel, 8, this.f20734, i);
        long j2 = this.f20727;
        ˉⁱ.ᵢٴ(parcel, 9, 8);
        parcel.writeLong(j2);
        ˉⁱ.ـˆ(parcel, 10, this.f20729, i);
        ˉⁱ.ᵢٴ(parcel, 11, 8);
        parcel.writeLong(this.f20732);
        ˉⁱ.ـˆ(parcel, 12, this.f20735, i);
        ˉⁱ.ˑⁱ(parcel, i2);
    }
}
