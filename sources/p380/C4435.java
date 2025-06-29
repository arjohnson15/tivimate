package p380;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p305.C3529;
import p383.AbstractC4470;

/* renamed from: ᵢᴵ.ᴵʿ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4435 extends AbstractC4424 {
    public static final Parcelable.Creator<C4435> CREATOR = new C3529(18);

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final String f17094;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final byte[] f17095;

    public C4435(Parcel parcel) {
        super("PRIV");
        String string = parcel.readString();
        int i = AbstractC4470.f17202;
        this.f17094 = string;
        this.f17095 = parcel.createByteArray();
    }

    public C4435(byte[] bArr, String str) {
        super("PRIV");
        this.f17094 = str;
        this.f17095 = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4435.class != obj.getClass()) {
            return false;
        }
        C4435 c4435 = (C4435) obj;
        return AbstractC4470.m10194(this.f17094, c4435.f17094) && Arrays.equals(this.f17095, c4435.f17095);
    }

    public final int hashCode() {
        String str = this.f17094;
        return Arrays.hashCode(this.f17095) + ((527 + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // p380.AbstractC4424
    public final String toString() {
        return this.f17063 + ": owner=" + this.f17094;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f17094);
        parcel.writeByteArray(this.f17095);
    }
}
