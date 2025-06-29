package p209;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p166.AbstractC2435;
import p166.C2400;
import p166.C2431;
import p166.InterfaceC2425;
import p353.AbstractC4010;
import p383.AbstractC4470;
import p383.C4457;
import ˆʽ.ᵎˏ;
import ˏ.ˑʽ;

/* renamed from: ˏʻ.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2799 implements InterfaceC2425 {
    public static final Parcelable.Creator<C2799> CREATOR = new ˑʽ(1);

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final String f10908;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final int f10909;

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public final byte[] f10910;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final String f10911;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final int f10912;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final int f10913;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final int f10914;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public final int f10915;

    public C2799(int i, String str, String str2, int i2, int i3, int i4, int i5, byte[] bArr) {
        this.f10913 = i;
        this.f10908 = str;
        this.f10911 = str2;
        this.f10912 = i2;
        this.f10909 = i3;
        this.f10914 = i4;
        this.f10915 = i5;
        this.f10910 = bArr;
    }

    public C2799(Parcel parcel) {
        this.f10913 = parcel.readInt();
        String string = parcel.readString();
        int i = AbstractC4470.f17202;
        this.f10908 = string;
        this.f10911 = parcel.readString();
        this.f10912 = parcel.readInt();
        this.f10909 = parcel.readInt();
        this.f10914 = parcel.readInt();
        this.f10915 = parcel.readInt();
        this.f10910 = parcel.createByteArray();
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static C2799 m7077(C4457 c4457) {
        int iM10092 = c4457.m10092();
        String strM6559 = AbstractC2435.m6559(c4457.m10105(c4457.m10092(), AbstractC4010.f15451));
        String strM10105 = c4457.m10105(c4457.m10092(), AbstractC4010.f15450);
        int iM100922 = c4457.m10092();
        int iM100923 = c4457.m10092();
        int iM100924 = c4457.m10092();
        int iM100925 = c4457.m10092();
        int iM100926 = c4457.m10092();
        byte[] bArr = new byte[iM100926];
        c4457.m10097(bArr, 0, iM100926);
        return new C2799(iM10092, strM6559, strM10105, iM100922, iM100923, iM100924, iM100925, bArr);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2799.class != obj.getClass()) {
            return false;
        }
        C2799 c2799 = (C2799) obj;
        return this.f10913 == c2799.f10913 && this.f10908.equals(c2799.f10908) && this.f10911.equals(c2799.f10911) && this.f10912 == c2799.f10912 && this.f10909 == c2799.f10909 && this.f10914 == c2799.f10914 && this.f10915 == c2799.f10915 && Arrays.equals(this.f10910, c2799.f10910);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f10910) + ((((((((ᵎˏ.ˏʾ(ᵎˏ.ˏʾ((527 + this.f10913) * 31, 31, this.f10908), 31, this.f10911) + this.f10912) * 31) + this.f10909) * 31) + this.f10914) * 31) + this.f10915) * 31);
    }

    public final String toString() {
        return "Picture: mimeType=" + this.f10908 + ", description=" + this.f10911;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f10913);
        parcel.writeString(this.f10908);
        parcel.writeString(this.f10911);
        parcel.writeInt(this.f10912);
        parcel.writeInt(this.f10909);
        parcel.writeInt(this.f10914);
        parcel.writeInt(this.f10915);
        parcel.writeByteArray(this.f10910);
    }

    @Override // p166.InterfaceC2425
    /* renamed from: ٴˎ */
    public final /* synthetic */ C2431 mo3977() {
        return null;
    }

    @Override // p166.InterfaceC2425
    /* renamed from: ᐧʻ */
    public final /* synthetic */ byte[] mo3978() {
        return null;
    }

    @Override // p166.InterfaceC2425
    /* renamed from: ﹳﹳ */
    public final void mo3979(C2400 c2400) {
        c2400.m6490(this.f10913, this.f10910);
    }
}
