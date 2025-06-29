package p380;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p305.C3529;
import p383.AbstractC4470;

/* renamed from: ᵢᴵ.ﹳﹳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4436 extends AbstractC4424 {
    public static final Parcelable.Creator<C4436> CREATOR = new C3529(13);

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final String f17096;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final String[] f17097;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final boolean f17098;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final boolean f17099;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final AbstractC4424[] f17100;

    public C4436(Parcel parcel) {
        super("CTOC");
        String string = parcel.readString();
        int i = AbstractC4470.f17202;
        this.f17096 = string;
        this.f17098 = parcel.readByte() != 0;
        this.f17099 = parcel.readByte() != 0;
        this.f17097 = parcel.createStringArray();
        int i2 = parcel.readInt();
        this.f17100 = new AbstractC4424[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            this.f17100[i3] = (AbstractC4424) parcel.readParcelable(AbstractC4424.class.getClassLoader());
        }
    }

    public C4436(String str, boolean z, boolean z2, String[] strArr, AbstractC4424[] abstractC4424Arr) {
        super("CTOC");
        this.f17096 = str;
        this.f17098 = z;
        this.f17099 = z2;
        this.f17097 = strArr;
        this.f17100 = abstractC4424Arr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4436.class != obj.getClass()) {
            return false;
        }
        C4436 c4436 = (C4436) obj;
        return this.f17098 == c4436.f17098 && this.f17099 == c4436.f17099 && AbstractC4470.m10194(this.f17096, c4436.f17096) && Arrays.equals(this.f17097, c4436.f17097) && Arrays.equals(this.f17100, c4436.f17100);
    }

    public final int hashCode() {
        int i = (((527 + (this.f17098 ? 1 : 0)) * 31) + (this.f17099 ? 1 : 0)) * 31;
        String str = this.f17096;
        return i + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f17096);
        parcel.writeByte(this.f17098 ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f17099 ? (byte) 1 : (byte) 0);
        parcel.writeStringArray(this.f17097);
        AbstractC4424[] abstractC4424Arr = this.f17100;
        parcel.writeInt(abstractC4424Arr.length);
        for (AbstractC4424 abstractC4424 : abstractC4424Arr) {
            parcel.writeParcelable(abstractC4424, 0);
        }
    }
}
