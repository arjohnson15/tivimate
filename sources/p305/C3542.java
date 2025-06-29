package p305;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.measurement.C0559;
import java.util.Arrays;
import p177.AbstractC2491;
import ˈⁱ.ˉⁱ;
import ـˏ.ٴˎ;

/* renamed from: ᐧˆ.ﹳﹳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3542 extends AbstractC2491 {
    public static final Parcelable.Creator<C3542> CREATOR = new ٴˎ(29);

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final int f13692;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final long f13693;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final String f13694;

    public C3542() {
        this.f13694 = "CLIENT_TELEMETRY";
        this.f13693 = 1L;
        this.f13692 = -1;
    }

    public C3542(int i, long j, String str) {
        this.f13694 = str;
        this.f13692 = i;
        this.f13693 = j;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C3542) {
            C3542 c3542 = (C3542) obj;
            String str = this.f13694;
            if (((str != null && str.equals(c3542.f13694)) || (str == null && c3542.f13694 == null)) && m8430() == c3542.m8430()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f13694, Long.valueOf(m8430())});
    }

    public final String toString() {
        C0559 c0559 = new C0559(this);
        c0559.m2487(this.f13694, "name");
        c0559.m2487(Long.valueOf(m8430()), "version");
        return c0559.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = ˉⁱ.ˑﾞ(parcel, 20293);
        ˉⁱ.ᴵʼ(parcel, 1, this.f13694);
        ˉⁱ.ᵢٴ(parcel, 2, 4);
        parcel.writeInt(this.f13692);
        long jM8430 = m8430();
        ˉⁱ.ᵢٴ(parcel, 3, 8);
        parcel.writeLong(jM8430);
        ˉⁱ.ˑⁱ(parcel, i2);
    }

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final long m8430() {
        long j = this.f13693;
        return j == -1 ? this.f13692 : j;
    }
}
