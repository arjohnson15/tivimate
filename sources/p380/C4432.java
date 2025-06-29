package p380;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p166.C2400;
import p305.C3529;
import p383.AbstractC4470;

/* renamed from: ᵢᴵ.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4432 extends AbstractC4424 {
    public static final Parcelable.Creator<C4432> CREATOR = new C3529(10);

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final String f17086;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final byte[] f17087;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final String f17088;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final int f17089;

    public C4432(Parcel parcel) {
        super("APIC");
        String string = parcel.readString();
        int i = AbstractC4470.f17202;
        this.f17086 = string;
        this.f17088 = parcel.readString();
        this.f17089 = parcel.readInt();
        this.f17087 = parcel.createByteArray();
    }

    public C4432(String str, String str2, int i, byte[] bArr) {
        super("APIC");
        this.f17086 = str;
        this.f17088 = str2;
        this.f17089 = i;
        this.f17087 = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4432.class != obj.getClass()) {
            return false;
        }
        C4432 c4432 = (C4432) obj;
        return this.f17089 == c4432.f17089 && AbstractC4470.m10194(this.f17086, c4432.f17086) && AbstractC4470.m10194(this.f17088, c4432.f17088) && Arrays.equals(this.f17087, c4432.f17087);
    }

    public final int hashCode() {
        int i = (527 + this.f17089) * 31;
        String str = this.f17086;
        int iHashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f17088;
        return Arrays.hashCode(this.f17087) + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @Override // p380.AbstractC4424
    public final String toString() {
        return this.f17063 + ": mimeType=" + this.f17086 + ", description=" + this.f17088;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f17086);
        parcel.writeString(this.f17088);
        parcel.writeInt(this.f17089);
        parcel.writeByteArray(this.f17087);
    }

    @Override // p380.AbstractC4424, p166.InterfaceC2425
    /* renamed from: ﹳﹳ */
    public final void mo3979(C2400 c2400) {
        c2400.m6490(this.f17089, this.f17087);
    }
}
