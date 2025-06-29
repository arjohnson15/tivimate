package p287;

import android.os.Parcel;
import android.util.SparseIntArray;
import p200.C2741;
import ˆʽ.ᵎˏ;

/* renamed from: ٴˏ.ʽᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3391 extends AbstractC3393 {

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final Parcel f13231;

    /* renamed from: ˉי, reason: contains not printable characters */
    public int f13232;

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public int f13233;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final String f13234;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final int f13235;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final int f13236;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final SparseIntArray f13237;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public int f13238;

    public C3391(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new C2741(0), new C2741(0), new C2741(0));
    }

    public C3391(Parcel parcel, int i, int i2, String str, C2741 c2741, C2741 c27412, C2741 c27413) {
        super(c2741, c27412, c27413);
        this.f13237 = new SparseIntArray();
        this.f13238 = -1;
        this.f13233 = -1;
        this.f13231 = parcel;
        this.f13235 = i;
        this.f13236 = i2;
        this.f13232 = i;
        this.f13234 = str;
    }

    @Override // p287.AbstractC3393
    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final boolean mo8251(int i) {
        while (this.f13232 < this.f13236) {
            int i2 = this.f13233;
            if (i2 == i) {
                return true;
            }
            if (String.valueOf(i2).compareTo(String.valueOf(i)) > 0) {
                return false;
            }
            int i3 = this.f13232;
            Parcel parcel = this.f13231;
            parcel.setDataPosition(i3);
            int i4 = parcel.readInt();
            this.f13233 = parcel.readInt();
            this.f13232 += i4;
        }
        return this.f13233 == i;
    }

    @Override // p287.AbstractC3393
    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C3391 mo8252() {
        Parcel parcel = this.f13231;
        int iDataPosition = parcel.dataPosition();
        int i = this.f13232;
        if (i == this.f13235) {
            i = this.f13236;
        }
        return new C3391(parcel, iDataPosition, i, ᵎˏ.ˎٴ(new StringBuilder(), this.f13234, "  "), this.f13241, this.f13239, this.f13240);
    }

    @Override // p287.AbstractC3393
    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final void mo8253(int i) {
        int i2 = this.f13238;
        SparseIntArray sparseIntArray = this.f13237;
        Parcel parcel = this.f13231;
        if (i2 >= 0) {
            int i3 = sparseIntArray.get(i2);
            int iDataPosition = parcel.dataPosition();
            parcel.setDataPosition(i3);
            parcel.writeInt(iDataPosition - i3);
            parcel.setDataPosition(iDataPosition);
        }
        this.f13238 = i;
        sparseIntArray.put(i, parcel.dataPosition());
        parcel.writeInt(0);
        parcel.writeInt(i);
    }
}
