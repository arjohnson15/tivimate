package p380;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p305.C3529;
import p383.AbstractC4470;
import ˆʽ.ᵎˏ;

/* renamed from: ᵢᴵ.ʽᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4422 extends AbstractC4424 {
    public static final Parcelable.Creator<C4422> CREATOR = new C3529(11);

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final byte[] f17059;

    /* JADX WARN: Illegal instructions before constructor call */
    public C4422(Parcel parcel) {
        String string = parcel.readString();
        int i = AbstractC4470.f17202;
        super(string);
        this.f17059 = parcel.createByteArray();
    }

    public C4422(byte[] bArr, String str) {
        super(str);
        this.f17059 = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4422.class != obj.getClass()) {
            return false;
        }
        C4422 c4422 = (C4422) obj;
        return this.f17063.equals(c4422.f17063) && Arrays.equals(this.f17059, c4422.f17059);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f17059) + ᵎˏ.ˏʾ(527, 31, this.f17063);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f17063);
        parcel.writeByteArray(this.f17059);
    }
}
