package p275;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.AbstractC0002;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
import ـˏ.ٴˎ;

/* renamed from: ـᵢ.ʿʼ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3346 extends AbstractC3345 {
    public static final Parcelable.Creator<C3346> CREATOR = new ٴˎ(15);

    /* renamed from: ʾʼ, reason: contains not printable characters */
    public final int f13106;

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final boolean f13107;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final boolean f13108;

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public final List f13109;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final boolean f13110;

    /* renamed from: ˑﾞ, reason: contains not printable characters */
    public final int f13111;

    /* renamed from: ـˆ, reason: contains not printable characters */
    public final boolean f13112;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final boolean f13113;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final long f13114;

    /* renamed from: ᴵʼ, reason: contains not printable characters */
    public final long f13115;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final long f13116;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public final long f13117;

    /* renamed from: ﾞᐧ, reason: contains not printable characters */
    public final int f13118;

    public C3346(long j, boolean z, boolean z2, boolean z3, boolean z4, long j2, long j3, List list, boolean z5, long j4, int i, int i2, int i3) {
        this.f13114 = j;
        this.f13107 = z;
        this.f13110 = z2;
        this.f13113 = z3;
        this.f13108 = z4;
        this.f13116 = j2;
        this.f13117 = j3;
        this.f13109 = DesugarCollections.unmodifiableList(list);
        this.f13112 = z5;
        this.f13115 = j4;
        this.f13118 = i;
        this.f13106 = i2;
        this.f13111 = i3;
    }

    public C3346(Parcel parcel) {
        this.f13114 = parcel.readLong();
        this.f13107 = parcel.readByte() == 1;
        this.f13110 = parcel.readByte() == 1;
        this.f13113 = parcel.readByte() == 1;
        this.f13108 = parcel.readByte() == 1;
        this.f13116 = parcel.readLong();
        this.f13117 = parcel.readLong();
        int i = parcel.readInt();
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(new C3353(parcel.readInt(), parcel.readLong(), parcel.readLong()));
        }
        this.f13109 = DesugarCollections.unmodifiableList(arrayList);
        this.f13112 = parcel.readByte() == 1;
        this.f13115 = parcel.readLong();
        this.f13118 = parcel.readInt();
        this.f13106 = parcel.readInt();
        this.f13111 = parcel.readInt();
    }

    @Override // p275.AbstractC3345
    public final String toString() {
        StringBuilder sb = new StringBuilder("SCTE-35 SpliceInsertCommand { programSplicePts=");
        sb.append(this.f13116);
        sb.append(", programSplicePlaybackPositionUs= ");
        return AbstractC0002.m42(sb, this.f13117, " }");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f13114);
        parcel.writeByte(this.f13107 ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f13110 ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f13113 ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f13108 ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f13116);
        parcel.writeLong(this.f13117);
        List list = this.f13109;
        int size = list.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            C3353 c3353 = (C3353) list.get(i2);
            parcel.writeInt(c3353.f13142);
            parcel.writeLong(c3353.f13140);
            parcel.writeLong(c3353.f13141);
        }
        parcel.writeByte(this.f13112 ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f13115);
        parcel.writeInt(this.f13118);
        parcel.writeInt(this.f13106);
        parcel.writeInt(this.f13111);
    }
}
