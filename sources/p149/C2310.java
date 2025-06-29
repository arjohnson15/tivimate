package p149;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import java.util.Collections;
import java.util.HashSet;
import ˆٴ.ˉˏ;

/* renamed from: ˊʾ.ﹶˆ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2310 extends C2287 {
    public static final Parcelable.Creator<C2310> CREATOR = new ˉˏ(14);

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public HashSet f9123;

    public C2310(Parcel parcel) {
        super(parcel);
        int i = parcel.readInt();
        this.f9123 = new HashSet();
        String[] strArr = new String[i];
        parcel.readStringArray(strArr);
        Collections.addAll(this.f9123, strArr);
    }

    public C2310(AbsSavedState absSavedState) {
        super(absSavedState);
    }

    @Override // android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f9123.size());
        HashSet hashSet = this.f9123;
        parcel.writeStringArray((String[]) hashSet.toArray(new String[hashSet.size()]));
    }
}
