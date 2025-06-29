package p208;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.AbstractC0001;
import java.util.Arrays;
import p166.C2400;
import p166.C2431;
import p166.InterfaceC2425;
import p383.AbstractC4470;
import ˆʽ.ᵎˏ;
import ˆٴ.ˉˏ;
import ﾞﹶ.ᵢʿ;

/* renamed from: ˏ.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2794 implements InterfaceC2425 {
    public static final Parcelable.Creator<C2794> CREATOR = new ˉˏ(28);

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final byte[] f10878;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final int f10879;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final int f10880;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final String f10881;

    public C2794(Parcel parcel) {
        String string = parcel.readString();
        int i = AbstractC4470.f17202;
        this.f10881 = string;
        this.f10878 = parcel.createByteArray();
        this.f10879 = parcel.readInt();
        this.f10880 = parcel.readInt();
    }

    public C2794(String str, byte[] bArr, int i, int i2) {
        this.f10881 = str;
        this.f10878 = bArr;
        this.f10879 = i;
        this.f10880 = i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2794.class != obj.getClass()) {
            return false;
        }
        C2794 c2794 = (C2794) obj;
        return this.f10881.equals(c2794.f10881) && Arrays.equals(this.f10878, c2794.f10878) && this.f10879 == c2794.f10879 && this.f10880 == c2794.f10880;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.f10878) + ᵎˏ.ˏʾ(527, 31, this.f10881)) * 31) + this.f10879) * 31) + this.f10880;
    }

    public final String toString() {
        String strM10188;
        byte[] bArr = this.f10878;
        int i = this.f10880;
        if (i == 1) {
            strM10188 = AbstractC4470.m10188(bArr);
        } else if (i == 23) {
            boolean z = bArr.length >= 4;
            int length = bArr.length;
            if (!z) {
                throw new IllegalArgumentException(ᵢʿ.ʿˏ("array too small: %s < %s", new Object[]{Integer.valueOf(length), 4}));
            }
            strM10188 = String.valueOf(Float.intBitsToFloat(AbstractC0001.m22(bArr[0], bArr[1], bArr[2], bArr[3])));
        } else if (i != 67) {
            strM10188 = AbstractC4470.m10162(bArr);
        } else {
            boolean z2 = bArr.length >= 4;
            int length2 = bArr.length;
            if (!z2) {
                throw new IllegalArgumentException(ᵢʿ.ʿˏ("array too small: %s < %s", new Object[]{Integer.valueOf(length2), 4}));
            }
            strM10188 = String.valueOf(AbstractC0001.m22(bArr[0], bArr[1], bArr[2], bArr[3]));
        }
        return "mdta: key=" + this.f10881 + ", value=" + strM10188;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f10881);
        parcel.writeByteArray(this.f10878);
        parcel.writeInt(this.f10879);
        parcel.writeInt(this.f10880);
    }

    @Override // p166.InterfaceC2425
    /* renamed from: ٴˎ */
    public final /* synthetic */ C2431 mo3977() {
        return null;
    }

    @Override // p166.InterfaceC2425
    /* renamed from: ᐧʻ */
    public final /* synthetic */ byte[] mo3978() {
        return null;
    }

    @Override // p166.InterfaceC2425
    /* renamed from: ﹳﹳ */
    public final /* synthetic */ void mo3979(C2400 c2400) {
    }
}
