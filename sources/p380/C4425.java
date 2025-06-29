package p380;

import android.os.Parcel;
import android.os.Parcelable;
import p305.C3529;
import p383.AbstractC4470;

/* renamed from: ᵢᴵ.ˉⁱ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4425 extends AbstractC4424 {
    public static final Parcelable.Creator<C4425> CREATOR = new C3529(16);

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final String f17064;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final String f17065;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final String f17066;

    public C4425(Parcel parcel) {
        super("----");
        String string = parcel.readString();
        int i = AbstractC4470.f17202;
        this.f17064 = string;
        this.f17065 = parcel.readString();
        this.f17066 = parcel.readString();
    }

    public C4425(String str, String str2, String str3) {
        super("----");
        this.f17064 = str;
        this.f17065 = str2;
        this.f17066 = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4425.class != obj.getClass()) {
            return false;
        }
        C4425 c4425 = (C4425) obj;
        return AbstractC4470.m10194(this.f17065, c4425.f17065) && AbstractC4470.m10194(this.f17064, c4425.f17064) && AbstractC4470.m10194(this.f17066, c4425.f17066);
    }

    public final int hashCode() {
        String str = this.f17064;
        int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f17065;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f17066;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // p380.AbstractC4424
    public final String toString() {
        return this.f17063 + ": domain=" + this.f17064 + ", description=" + this.f17065;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f17063);
        parcel.writeString(this.f17064);
        parcel.writeString(this.f17066);
    }
}
