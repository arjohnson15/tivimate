package p026;

import android.os.Parcel;
import com.google.android.gms.internal.measurement.AbstractC0482;
import p113.BinderC1816;
import p113.InterfaceC1818;
import p195.AbstractC2710;

/* renamed from: ʼˉ.ˏʾ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1159 extends AbstractC0482 {
    /* renamed from: ˋˉ, reason: contains not printable characters */
    public final InterfaceC1818 m4206(BinderC1816 binderC1816, String str, int i, BinderC1816 binderC18162) {
        Parcel parcelM2289 = m2289();
        AbstractC2710.m6873(parcelM2289, binderC1816);
        parcelM2289.writeString(str);
        parcelM2289.writeInt(i);
        AbstractC2710.m6873(parcelM2289, binderC18162);
        Parcel parcelM2288 = m2288(parcelM2289, 2);
        InterfaceC1818 interfaceC1818M5559 = BinderC1816.m5559(parcelM2288.readStrongBinder());
        parcelM2288.recycle();
        return interfaceC1818M5559;
    }

    /* renamed from: ـˆ, reason: contains not printable characters */
    public final InterfaceC1818 m4207(BinderC1816 binderC1816, String str, int i, BinderC1816 binderC18162) {
        Parcel parcelM2289 = m2289();
        AbstractC2710.m6873(parcelM2289, binderC1816);
        parcelM2289.writeString(str);
        parcelM2289.writeInt(i);
        AbstractC2710.m6873(parcelM2289, binderC18162);
        Parcel parcelM2288 = m2288(parcelM2289, 3);
        InterfaceC1818 interfaceC1818M5559 = BinderC1816.m5559(parcelM2288.readStrongBinder());
        parcelM2288.recycle();
        return interfaceC1818M5559;
    }
}
