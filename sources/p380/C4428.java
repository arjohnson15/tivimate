package p380;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import p305.C3529;
import p345.AbstractC3980;
import p345.C3932;
import p383.AbstractC4464;
import p383.AbstractC4470;
import ˆʽ.ᵎˏ;

/* renamed from: ᵢᴵ.ˏᴵ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4428 extends AbstractC4424 {
    public static final Parcelable.Creator<C4428> CREATOR = new C3529(19);

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final String f17073;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final AbstractC3980 f17074;

    public C4428(String str, String str2, C3932 c3932) {
        super(str);
        AbstractC4464.m10142(!c3932.isEmpty());
        this.f17073 = str2;
        AbstractC3980 abstractC3980M9209 = AbstractC3980.m9209(c3932);
        this.f17074 = abstractC3980M9209;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static ArrayList m10039(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            if (str.length() >= 10) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(8, 10))));
            } else if (str.length() >= 7) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
            } else if (str.length() >= 4) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
            }
            return arrayList;
        } catch (NumberFormatException unused) {
            return new ArrayList();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4428.class != obj.getClass()) {
            return false;
        }
        C4428 c4428 = (C4428) obj;
        return AbstractC4470.m10194(this.f17063, c4428.f17063) && AbstractC4470.m10194(this.f17073, c4428.f17073) && this.f17074.equals(c4428.f17074);
    }

    public final int hashCode() {
        int i = ᵎˏ.ˏʾ(527, 31, this.f17063);
        String str = this.f17073;
        return this.f17074.hashCode() + ((i + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // p380.AbstractC4424
    public final String toString() {
        return this.f17063 + ": description=" + this.f17073 + ": values=" + this.f17074;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f17063);
        parcel.writeString(this.f17073);
        parcel.writeStringArray((String[]) this.f17074.toArray(new String[0]));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0019  */
    @Override // p380.AbstractC4424, p166.InterfaceC2425
    /* renamed from: ﹳﹳ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo3979(p166.C2400 r23) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 930
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p380.C4428.mo3979(ˊﹶ.ˆʿ):void");
    }
}
