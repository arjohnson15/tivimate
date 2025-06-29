package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import p291.C3414;

/* renamed from: androidx.fragment.app.ʽᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0087 implements Parcelable {
    public static final Parcelable.Creator<C0087> CREATOR = new ـˏ.ٴˎ(22);

    /* renamed from: ʾʼ, reason: contains not printable characters */
    public final ArrayList f527;

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final ArrayList f528;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final int f529;

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public final int f530;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final int[] f531;

    /* renamed from: ˑⁱ, reason: contains not printable characters */
    public final boolean f532;

    /* renamed from: ˑﾞ, reason: contains not printable characters */
    public final ArrayList f533;

    /* renamed from: ـˆ, reason: contains not printable characters */
    public final CharSequence f534;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final int[] f535;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final int[] f536;

    /* renamed from: ᴵʼ, reason: contains not printable characters */
    public final int f537;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final String f538;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public final int f539;

    /* renamed from: ﾞᐧ, reason: contains not printable characters */
    public final CharSequence f540;

    public C0087(Parcel parcel) {
        this.f536 = parcel.createIntArray();
        this.f528 = parcel.createStringArrayList();
        this.f531 = parcel.createIntArray();
        this.f535 = parcel.createIntArray();
        this.f529 = parcel.readInt();
        this.f538 = parcel.readString();
        this.f539 = parcel.readInt();
        this.f530 = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.f534 = (CharSequence) creator.createFromParcel(parcel);
        this.f537 = parcel.readInt();
        this.f540 = (CharSequence) creator.createFromParcel(parcel);
        this.f527 = parcel.createStringArrayList();
        this.f533 = parcel.createStringArrayList();
        this.f532 = parcel.readInt() != 0;
    }

    public C0087(C0105 c0105) {
        int size = c0105.f648.size();
        this.f536 = new int[size * 6];
        if (!c0105.f650) {
            throw new IllegalStateException("Not on back stack");
        }
        this.f528 = new ArrayList(size);
        this.f531 = new int[size];
        this.f535 = new int[size];
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            C3414 c3414 = (C3414) c0105.f648.get(i2);
            int i3 = i + 1;
            this.f536[i] = c3414.f13282;
            ArrayList arrayList = this.f528;
            AbstractComponentCallbacksC0100 abstractComponentCallbacksC0100 = c3414.f13278;
            arrayList.add(abstractComponentCallbacksC0100 != null ? abstractComponentCallbacksC0100.mWho : null);
            int[] iArr = this.f536;
            iArr[i3] = c3414.f13281 ? 1 : 0;
            iArr[i + 2] = c3414.f13285;
            iArr[i + 3] = c3414.f13279;
            int i4 = i + 5;
            iArr[i + 4] = c3414.f13283;
            i += 6;
            iArr[i4] = c3414.f13284;
            this.f531[i2] = c3414.f13280.ordinal();
            this.f535[i2] = c3414.f13286.ordinal();
        }
        this.f529 = c0105.f649;
        this.f538 = c0105.f656;
        this.f539 = c0105.f654;
        this.f530 = c0105.f639;
        this.f534 = c0105.f643;
        this.f537 = c0105.f640;
        this.f540 = c0105.f641;
        this.f527 = c0105.f651;
        this.f533 = c0105.f644;
        this.f532 = c0105.f647;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.f536);
        parcel.writeStringList(this.f528);
        parcel.writeIntArray(this.f531);
        parcel.writeIntArray(this.f535);
        parcel.writeInt(this.f529);
        parcel.writeString(this.f538);
        parcel.writeInt(this.f539);
        parcel.writeInt(this.f530);
        TextUtils.writeToParcel(this.f534, parcel, 0);
        parcel.writeInt(this.f537);
        TextUtils.writeToParcel(this.f540, parcel, 0);
        parcel.writeStringList(this.f527);
        parcel.writeStringList(this.f533);
        parcel.writeInt(this.f532 ? 1 : 0);
    }
}
