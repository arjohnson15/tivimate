package p417;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import p177.AbstractC2491;
import p305.C3529;
import ˈⁱ.ˉⁱ;

/* renamed from: ﹳᴵ.ˉⁱ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4752 extends AbstractC2491 {
    public static final Parcelable.Creator<C4752> CREATOR = new C3529(26);

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public List f18236;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final int f18237;

    public C4752(int i, List list) {
        this.f18237 = i;
        this.f18236 = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = ˉⁱ.ˑﾞ(parcel, 20293);
        ˉⁱ.ᵢٴ(parcel, 1, 4);
        parcel.writeInt(this.f18237);
        List list = this.f18236;
        if (list != null) {
            int i3 = ˉⁱ.ˑﾞ(parcel, 2);
            int size = list.size();
            parcel.writeInt(size);
            for (int i4 = 0; i4 < size; i4++) {
                Parcelable parcelable = (Parcelable) list.get(i4);
                if (parcelable == null) {
                    parcel.writeInt(0);
                } else {
                    int iDataPosition = parcel.dataPosition();
                    parcel.writeInt(1);
                    int iDataPosition2 = parcel.dataPosition();
                    parcelable.writeToParcel(parcel, 0);
                    int iDataPosition3 = parcel.dataPosition();
                    parcel.setDataPosition(iDataPosition);
                    parcel.writeInt(iDataPosition3 - iDataPosition2);
                    parcel.setDataPosition(iDataPosition3);
                }
            }
            ˉⁱ.ˑⁱ(parcel, i3);
        }
        ˉⁱ.ˑⁱ(parcel, i2);
    }
}
