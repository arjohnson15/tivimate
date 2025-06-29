package p380;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p305.C3529;
import p383.AbstractC4470;

/* renamed from: ᵢᴵ.ˑʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4430 extends AbstractC4424 {
    public static final Parcelable.Creator<C4430> CREATOR = new C3529(12);

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final String f17078;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final long f17079;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final int f17080;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final int f17081;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final long f17082;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public final AbstractC4424[] f17083;

    public C4430(Parcel parcel) {
        super("CHAP");
        String string = parcel.readString();
        int i = AbstractC4470.f17202;
        this.f17078 = string;
        this.f17080 = parcel.readInt();
        this.f17081 = parcel.readInt();
        this.f17079 = parcel.readLong();
        this.f17082 = parcel.readLong();
        int i2 = parcel.readInt();
        this.f17083 = new AbstractC4424[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            this.f17083[i3] = (AbstractC4424) parcel.readParcelable(AbstractC4424.class.getClassLoader());
        }
    }

    public C4430(String str, int i, int i2, long j, long j2, AbstractC4424[] abstractC4424Arr) {
        super("CHAP");
        this.f17078 = str;
        this.f17080 = i;
        this.f17081 = i2;
        this.f17079 = j;
        this.f17082 = j2;
        this.f17083 = abstractC4424Arr;
    }

    @Override // p380.AbstractC4424, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4430.class != obj.getClass()) {
            return false;
        }
        C4430 c4430 = (C4430) obj;
        return this.f17080 == c4430.f17080 && this.f17081 == c4430.f17081 && this.f17079 == c4430.f17079 && this.f17082 == c4430.f17082 && AbstractC4470.m10194(this.f17078, c4430.f17078) && Arrays.equals(this.f17083, c4430.f17083);
    }

    public final int hashCode() {
        int i = (((((((527 + this.f17080) * 31) + this.f17081) * 31) + ((int) this.f17079)) * 31) + ((int) this.f17082)) * 31;
        String str = this.f17078;
        return i + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f17078);
        parcel.writeInt(this.f17080);
        parcel.writeInt(this.f17081);
        parcel.writeLong(this.f17079);
        parcel.writeLong(this.f17082);
        AbstractC4424[] abstractC4424Arr = this.f17083;
        parcel.writeInt(abstractC4424Arr.length);
        for (AbstractC4424 abstractC4424 : abstractC4424Arr) {
            parcel.writeParcelable(abstractC4424, 0);
        }
    }
}
