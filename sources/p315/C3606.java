package p315;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import p061.C1404;
import p350.AbstractC4002;

/* renamed from: ᐧⁱ.ʿʼ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3606 extends AbstractC4002 {
    public static final Parcelable.Creator<C3606> CREATOR = new C1404(6);

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public SparseArray f13827;

    public C3606(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int i = parcel.readInt();
        int[] iArr = new int[i];
        parcel.readIntArray(iArr);
        Parcelable[] parcelableArray = parcel.readParcelableArray(classLoader);
        this.f13827 = new SparseArray(i);
        for (int i2 = 0; i2 < i; i2++) {
            this.f13827.append(iArr[i2], parcelableArray[i2]);
        }
    }

    @Override // p350.AbstractC4002, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        SparseArray sparseArray = this.f13827;
        int size = sparseArray != null ? sparseArray.size() : 0;
        parcel.writeInt(size);
        int[] iArr = new int[size];
        Parcelable[] parcelableArr = new Parcelable[size];
        for (int i2 = 0; i2 < size; i2++) {
            iArr[i2] = this.f13827.keyAt(i2);
            parcelableArr[i2] = (Parcelable) this.f13827.valueAt(i2);
        }
        parcel.writeIntArray(iArr);
        parcel.writeParcelableArray(parcelableArr, i);
    }
}
