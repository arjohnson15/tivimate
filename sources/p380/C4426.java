package p380;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p305.C3529;
import p383.AbstractC4470;

/* renamed from: ᵢᴵ.ˋⁱ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4426 extends AbstractC4424 {
    public static final Parcelable.Creator<C4426> CREATOR = new C3529(17);

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final int f17067;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final int[] f17068;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final int f17069;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final int f17070;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final int[] f17071;

    public C4426(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.f17067 = i;
        this.f17069 = i2;
        this.f17070 = i3;
        this.f17068 = iArr;
        this.f17071 = iArr2;
    }

    public C4426(Parcel parcel) {
        super("MLLT");
        this.f17067 = parcel.readInt();
        this.f17069 = parcel.readInt();
        this.f17070 = parcel.readInt();
        int[] iArrCreateIntArray = parcel.createIntArray();
        int i = AbstractC4470.f17202;
        this.f17068 = iArrCreateIntArray;
        this.f17071 = parcel.createIntArray();
    }

    @Override // p380.AbstractC4424, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4426.class != obj.getClass()) {
            return false;
        }
        C4426 c4426 = (C4426) obj;
        return this.f17067 == c4426.f17067 && this.f17069 == c4426.f17069 && this.f17070 == c4426.f17070 && Arrays.equals(this.f17068, c4426.f17068) && Arrays.equals(this.f17071, c4426.f17071);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f17071) + ((Arrays.hashCode(this.f17068) + ((((((527 + this.f17067) * 31) + this.f17069) * 31) + this.f17070) * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f17067);
        parcel.writeInt(this.f17069);
        parcel.writeInt(this.f17070);
        parcel.writeIntArray(this.f17068);
        parcel.writeIntArray(this.f17071);
    }
}
