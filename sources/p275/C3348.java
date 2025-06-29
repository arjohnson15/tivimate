package p275;

import android.os.Parcel;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ـᵢ.ˏᵢ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3348 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final boolean f13121;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final long f13122;

    /* renamed from: ˉי, reason: contains not printable characters */
    public final int f13123;

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public final int f13124;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final long f13125;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final boolean f13126;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final long f13127;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final List f13128;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final boolean f13129;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final boolean f13130;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final int f13131;

    public C3348(long j, boolean z, boolean z2, boolean z3, ArrayList arrayList, long j2, boolean z4, long j3, int i, int i2, int i3) {
        this.f13127 = j;
        this.f13121 = z;
        this.f13126 = z2;
        this.f13130 = z3;
        this.f13128 = DesugarCollections.unmodifiableList(arrayList);
        this.f13122 = j2;
        this.f13129 = z4;
        this.f13125 = j3;
        this.f13131 = i;
        this.f13123 = i2;
        this.f13124 = i3;
    }

    public C3348(Parcel parcel) {
        this.f13127 = parcel.readLong();
        this.f13121 = parcel.readByte() == 1;
        this.f13126 = parcel.readByte() == 1;
        this.f13130 = parcel.readByte() == 1;
        int i = parcel.readInt();
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(new C3352(parcel.readInt(), parcel.readLong()));
        }
        this.f13128 = DesugarCollections.unmodifiableList(arrayList);
        this.f13122 = parcel.readLong();
        this.f13129 = parcel.readByte() == 1;
        this.f13125 = parcel.readLong();
        this.f13131 = parcel.readInt();
        this.f13123 = parcel.readInt();
        this.f13124 = parcel.readInt();
    }
}
