package p275;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
import ـˏ.ٴˎ;

/* renamed from: ـᵢ.ﹶˆ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3354 extends AbstractC3345 {
    public static final Parcelable.Creator<C3354> CREATOR = new ٴˎ(17);

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final List f13143;

    public C3354(Parcel parcel) {
        int i = parcel.readInt();
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(new C3348(parcel));
        }
        this.f13143 = DesugarCollections.unmodifiableList(arrayList);
    }

    public C3354(ArrayList arrayList) {
        this.f13143 = DesugarCollections.unmodifiableList(arrayList);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List list = this.f13143;
        int size = list.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            C3348 c3348 = (C3348) list.get(i2);
            parcel.writeLong(c3348.f13127);
            parcel.writeByte(c3348.f13121 ? (byte) 1 : (byte) 0);
            parcel.writeByte(c3348.f13126 ? (byte) 1 : (byte) 0);
            parcel.writeByte(c3348.f13130 ? (byte) 1 : (byte) 0);
            List list2 = c3348.f13128;
            int size2 = list2.size();
            parcel.writeInt(size2);
            for (int i3 = 0; i3 < size2; i3++) {
                C3352 c3352 = (C3352) list2.get(i3);
                parcel.writeInt(c3352.f13139);
                parcel.writeLong(c3352.f13138);
            }
            parcel.writeLong(c3348.f13122);
            parcel.writeByte(c3348.f13129 ? (byte) 1 : (byte) 0);
            parcel.writeLong(c3348.f13125);
            parcel.writeInt(c3348.f13131);
            parcel.writeInt(c3348.f13123);
            parcel.writeInt(c3348.f13124);
        }
    }
}
