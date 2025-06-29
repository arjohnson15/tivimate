package p357;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import p061.C1404;
import p350.AbstractC4002;

/* renamed from: ᵔˎ.ﾞʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4071 extends AbstractC4002 {
    public static final Parcelable.Creator<C4071> CREATOR = new C1404(8);

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public CharSequence f15704;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public boolean f15705;

    public C4071(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f15704 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f15705 = parcel.readInt() == 1;
    }

    public final String toString() {
        return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + ((Object) this.f15704) + "}";
    }

    @Override // p350.AbstractC4002, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        TextUtils.writeToParcel(this.f15704, parcel, i);
        parcel.writeInt(this.f15705 ? 1 : 0);
    }
}
