package p026;

import android.os.Parcel;
import com.google.android.gms.internal.measurement.AbstractC0482;
import p113.BinderC1816;
import p113.InterfaceC1818;
import p195.AbstractC2710;

/* renamed from: ʼˉ.ˉי, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1158 extends AbstractC0482 {
    /* renamed from: ˋˉ, reason: contains not printable characters */
    public final InterfaceC1818 m4202(BinderC1816 binderC1816, String str, int i) {
        Parcel parcelM2289 = m2289();
        AbstractC2710.m6873(parcelM2289, binderC1816);
        parcelM2289.writeString(str);
        parcelM2289.writeInt(i);
        Parcel parcelM2288 = m2288(parcelM2289, 2);
        InterfaceC1818 interfaceC1818M5559 = BinderC1816.m5559(parcelM2288.readStrongBinder());
        parcelM2288.recycle();
        return interfaceC1818M5559;
    }

    /* renamed from: ـˆ, reason: contains not printable characters */
    public final InterfaceC1818 m4203(BinderC1816 binderC1816, String str, int i, BinderC1816 binderC18162) {
        Parcel parcelM2289 = m2289();
        AbstractC2710.m6873(parcelM2289, binderC1816);
        parcelM2289.writeString(str);
        parcelM2289.writeInt(i);
        AbstractC2710.m6873(parcelM2289, binderC18162);
        Parcel parcelM2288 = m2288(parcelM2289, 8);
        InterfaceC1818 interfaceC1818M5559 = BinderC1816.m5559(parcelM2288.readStrongBinder());
        parcelM2288.recycle();
        return interfaceC1818M5559;
    }

    /* renamed from: ᴵʼ, reason: contains not printable characters */
    public final InterfaceC1818 m4204(BinderC1816 binderC1816, String str, int i) {
        Parcel parcelM2289 = m2289();
        AbstractC2710.m6873(parcelM2289, binderC1816);
        parcelM2289.writeString(str);
        parcelM2289.writeInt(i);
        Parcel parcelM2288 = m2288(parcelM2289, 4);
        InterfaceC1818 interfaceC1818M5559 = BinderC1816.m5559(parcelM2288.readStrongBinder());
        parcelM2288.recycle();
        return interfaceC1818M5559;
    }

    /* renamed from: ﾞᐧ, reason: contains not printable characters */
    public final InterfaceC1818 m4205(BinderC1816 binderC1816, String str, boolean z, long j) {
        Parcel parcelM2289 = m2289();
        AbstractC2710.m6873(parcelM2289, binderC1816);
        parcelM2289.writeString(str);
        parcelM2289.writeInt(z ? 1 : 0);
        parcelM2289.writeLong(j);
        Parcel parcelM2288 = m2288(parcelM2289, 7);
        InterfaceC1818 interfaceC1818M5559 = BinderC1816.m5559(parcelM2288.readStrongBinder());
        parcelM2288.recycle();
        return interfaceC1818M5559;
    }
}
