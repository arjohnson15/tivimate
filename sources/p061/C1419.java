package p061;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.ـﹶ;
import java.util.Arrays;

/* renamed from: ʾـ.ᵔˋ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1419 implements Parcelable {
    public static final Parcelable.Creator<C1419> CREATOR = new ـﹶ(19);

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public int f5781;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public int[] f5782;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public boolean f5783;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public int f5784;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "FullSpanItem{mPosition=" + this.f5784 + ", mGapDir=" + this.f5781 + ", mHasUnwantedGapAfter=" + this.f5783 + ", mGapPerSpan=" + Arrays.toString(this.f5782) + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f5784);
        parcel.writeInt(this.f5781);
        parcel.writeInt(this.f5783 ? 1 : 0);
        int[] iArr = this.f5782;
        if (iArr == null || iArr.length <= 0) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(iArr.length);
            parcel.writeIntArray(this.f5782);
        }
    }
}
