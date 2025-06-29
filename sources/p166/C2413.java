package p166;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.UUID;
import p383.AbstractC4470;
import ˆʽ.ᵎˏ;
import ˆٴ.ˉˏ;

/* renamed from: ˊﹶ.ˏʾ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2413 implements Parcelable {
    public static final Parcelable.Creator<C2413> CREATOR = new ˉˏ(20);

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final UUID f9581;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final byte[] f9582;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final String f9583;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final String f9584;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public int f9585;

    public C2413(Parcel parcel) {
        this.f9581 = new UUID(parcel.readLong(), parcel.readLong());
        this.f9583 = parcel.readString();
        String string = parcel.readString();
        int i = AbstractC4470.f17202;
        this.f9584 = string;
        this.f9582 = parcel.createByteArray();
    }

    public C2413(UUID uuid, String str, String str2, byte[] bArr) {
        uuid.getClass();
        this.f9581 = uuid;
        this.f9583 = str;
        str2.getClass();
        this.f9584 = AbstractC2435.m6559(str2);
        this.f9582 = bArr;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2413)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        C2413 c2413 = (C2413) obj;
        return AbstractC4470.m10194(this.f9583, c2413.f9583) && AbstractC4470.m10194(this.f9584, c2413.f9584) && AbstractC4470.m10194(this.f9581, c2413.f9581) && Arrays.equals(this.f9582, c2413.f9582);
    }

    public final int hashCode() {
        if (this.f9585 == 0) {
            int iHashCode = this.f9581.hashCode() * 31;
            String str = this.f9583;
            this.f9585 = Arrays.hashCode(this.f9582) + ᵎˏ.ˏʾ((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f9584);
        }
        return this.f9585;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        UUID uuid = this.f9581;
        parcel.writeLong(uuid.getMostSignificantBits());
        parcel.writeLong(uuid.getLeastSignificantBits());
        parcel.writeString(this.f9583);
        parcel.writeString(this.f9584);
        parcel.writeByteArray(this.f9582);
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final boolean m6507(UUID uuid) {
        UUID uuid2 = AbstractC2424.f9644;
        UUID uuid3 = this.f9581;
        return uuid2.equals(uuid3) || uuid.equals(uuid3);
    }
}
