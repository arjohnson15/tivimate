package p380;

import android.os.Parcel;
import android.os.Parcelable;
import p305.C3529;
import p383.AbstractC4470;
import ˆʽ.ᵎˏ;

/* renamed from: ᵢᴵ.ˑי, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4431 extends AbstractC4424 {
    public static final Parcelable.Creator<C4431> CREATOR = new C3529(20);

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final String f17084;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final String f17085;

    /* JADX WARN: Illegal instructions before constructor call */
    public C4431(Parcel parcel) {
        String string = parcel.readString();
        int i = AbstractC4470.f17202;
        super(string);
        this.f17084 = parcel.readString();
        this.f17085 = parcel.readString();
    }

    public C4431(String str, String str2, String str3) {
        super(str);
        this.f17084 = str2;
        this.f17085 = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4431.class != obj.getClass()) {
            return false;
        }
        C4431 c4431 = (C4431) obj;
        return this.f17063.equals(c4431.f17063) && AbstractC4470.m10194(this.f17084, c4431.f17084) && AbstractC4470.m10194(this.f17085, c4431.f17085);
    }

    public final int hashCode() {
        int i = ᵎˏ.ˏʾ(527, 31, this.f17063);
        String str = this.f17084;
        int iHashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f17085;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // p380.AbstractC4424
    public final String toString() {
        return this.f17063 + ": url=" + this.f17085;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f17063);
        parcel.writeString(this.f17084);
        parcel.writeString(this.f17085);
    }
}
