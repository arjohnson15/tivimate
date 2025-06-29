package p166;

import android.os.Parcel;
import android.os.Parcelable;
import com.bumptech.glide.ˑʽ;
import java.util.Arrays;
import java.util.List;
import p383.AbstractC4470;
import ˆٴ.ˉˏ;

/* renamed from: ˊﹶ.ˆᵔ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2401 implements Parcelable {
    public static final Parcelable.Creator<C2401> CREATOR = new ˉˏ(21);

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final long f9490;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final InterfaceC2425[] f9491;

    public C2401(long j, InterfaceC2425... interfaceC2425Arr) {
        this.f9490 = j;
        this.f9491 = interfaceC2425Arr;
    }

    public C2401(Parcel parcel) {
        this.f9491 = new InterfaceC2425[parcel.readInt()];
        int i = 0;
        while (true) {
            InterfaceC2425[] interfaceC2425Arr = this.f9491;
            if (i >= interfaceC2425Arr.length) {
                this.f9490 = parcel.readLong();
                return;
            } else {
                interfaceC2425Arr[i] = (InterfaceC2425) parcel.readParcelable(InterfaceC2425.class.getClassLoader());
                i++;
            }
        }
    }

    public C2401(List list) {
        this((InterfaceC2425[]) list.toArray(new InterfaceC2425[0]));
    }

    public C2401(InterfaceC2425... interfaceC2425Arr) {
        this(-9223372036854775807L, interfaceC2425Arr);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2401.class != obj.getClass()) {
            return false;
        }
        C2401 c2401 = (C2401) obj;
        return Arrays.equals(this.f9491, c2401.f9491) && this.f9490 == c2401.f9490;
    }

    public final int hashCode() {
        return ˑʽ.ˏᴵ(this.f9490) + (Arrays.hashCode(this.f9491) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("entries=");
        sb.append(Arrays.toString(this.f9491));
        long j = this.f9490;
        if (j == -9223372036854775807L) {
            str = "";
        } else {
            str = ", presentationTimeUs=" + j;
        }
        sb.append(str);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        InterfaceC2425[] interfaceC2425Arr = this.f9491;
        parcel.writeInt(interfaceC2425Arr.length);
        for (InterfaceC2425 interfaceC2425 : interfaceC2425Arr) {
            parcel.writeParcelable(interfaceC2425, 0);
        }
        parcel.writeLong(this.f9490);
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final C2401 m6492(C2401 c2401) {
        return c2401 == null ? this : m6493(c2401.f9491);
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C2401 m6493(InterfaceC2425... interfaceC2425Arr) {
        if (interfaceC2425Arr.length == 0) {
            return this;
        }
        int i = AbstractC4470.f17202;
        InterfaceC2425[] interfaceC2425Arr2 = this.f9491;
        Object[] objArrCopyOf = Arrays.copyOf(interfaceC2425Arr2, interfaceC2425Arr2.length + interfaceC2425Arr.length);
        System.arraycopy(interfaceC2425Arr, 0, objArrCopyOf, interfaceC2425Arr2.length, interfaceC2425Arr.length);
        return new C2401(this.f9490, (InterfaceC2425[]) objArrCopyOf);
    }
}
