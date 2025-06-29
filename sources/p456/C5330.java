package p456;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.measurement.AbstractC0482;
import com.google.android.gms.internal.measurement.AbstractC0522;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ﾞⁱ.ᵢʿ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C5330 extends AbstractC0482 implements InterfaceC5311 {
    public C5330(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IMeasurementService", 0);
    }

    @Override // p456.InterfaceC5311
    /* renamed from: ʿˏ */
    public final List mo11663(String str, String str2, C5253 c5253) {
        Parcel parcelM2287 = m2287();
        parcelM2287.writeString(str);
        parcelM2287.writeString(str2);
        AbstractC0522.m2385(parcelM2287, c5253);
        Parcel parcelM2290 = m2290(parcelM2287, 16);
        ArrayList arrayListCreateTypedArrayList = parcelM2290.createTypedArrayList(C5345.CREATOR);
        parcelM2290.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // p456.InterfaceC5311
    /* renamed from: ˆʿ */
    public final List mo11664(String str, String str2, String str3) {
        Parcel parcelM2287 = m2287();
        parcelM2287.writeString(null);
        parcelM2287.writeString(str2);
        parcelM2287.writeString(str3);
        Parcel parcelM2290 = m2290(parcelM2287, 17);
        ArrayList arrayListCreateTypedArrayList = parcelM2290.createTypedArrayList(C5345.CREATOR);
        parcelM2290.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // p456.InterfaceC5311
    /* renamed from: ˆᵔ */
    public final C5309 mo11665(C5253 c5253) {
        Parcel parcelM2287 = m2287();
        AbstractC0522.m2385(parcelM2287, c5253);
        Parcel parcelM2290 = m2290(parcelM2287, 21);
        C5309 c5309 = (C5309) AbstractC0522.m2386(parcelM2290, C5309.CREATOR);
        parcelM2290.recycle();
        return c5309;
    }

    @Override // p456.InterfaceC5311
    /* renamed from: ˈٴ */
    public final void mo11666(long j, String str, String str2, String str3) {
        Parcel parcelM2287 = m2287();
        parcelM2287.writeLong(j);
        parcelM2287.writeString(str);
        parcelM2287.writeString(str2);
        parcelM2287.writeString(str3);
        m2291(parcelM2287, 10);
    }

    @Override // p456.InterfaceC5311
    /* renamed from: ˋˊ */
    public final void mo11668(C5253 c5253) {
        Parcel parcelM2287 = m2287();
        AbstractC0522.m2385(parcelM2287, c5253);
        m2291(parcelM2287, 25);
    }

    @Override // p456.InterfaceC5311
    /* renamed from: ˋⁱ */
    public final void mo11669(C5345 c5345, C5253 c5253) {
        Parcel parcelM2287 = m2287();
        AbstractC0522.m2385(parcelM2287, c5345);
        AbstractC0522.m2385(parcelM2287, c5253);
        m2291(parcelM2287, 12);
    }

    @Override // p456.InterfaceC5311
    /* renamed from: ˎˑ */
    public final List mo11670(String str, String str2, boolean z, C5253 c5253) {
        Parcel parcelM2287 = m2287();
        parcelM2287.writeString(str);
        parcelM2287.writeString(str2);
        ClassLoader classLoader = AbstractC0522.f2867;
        parcelM2287.writeInt(z ? 1 : 0);
        AbstractC0522.m2385(parcelM2287, c5253);
        Parcel parcelM2290 = m2290(parcelM2287, 14);
        ArrayList arrayListCreateTypedArrayList = parcelM2290.createTypedArrayList(C5290.CREATOR);
        parcelM2290.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // p456.InterfaceC5311
    /* renamed from: ˏʾ */
    public final void mo11671(C5343 c5343, C5253 c5253) {
        Parcel parcelM2287 = m2287();
        AbstractC0522.m2385(parcelM2287, c5343);
        AbstractC0522.m2385(parcelM2287, c5253);
        m2291(parcelM2287, 1);
    }

    @Override // p456.InterfaceC5311
    /* renamed from: ˏᵢ */
    public final void mo11672(C5253 c5253) {
        Parcel parcelM2287 = m2287();
        AbstractC0522.m2385(parcelM2287, c5253);
        m2291(parcelM2287, 26);
    }

    @Override // p456.InterfaceC5311
    /* renamed from: ˑי */
    public final void mo11674(C5253 c5253) {
        Parcel parcelM2287 = m2287();
        AbstractC0522.m2385(parcelM2287, c5253);
        m2291(parcelM2287, 6);
    }

    @Override // p456.InterfaceC5311
    /* renamed from: יʻ */
    public final void mo11675(C5290 c5290, C5253 c5253) {
        Parcel parcelM2287 = m2287();
        AbstractC0522.m2385(parcelM2287, c5290);
        AbstractC0522.m2385(parcelM2287, c5253);
        m2291(parcelM2287, 2);
    }

    @Override // p456.InterfaceC5311
    /* renamed from: ᐧʻ */
    public final List mo11677(Bundle bundle, C5253 c5253) {
        Parcel parcelM2287 = m2287();
        AbstractC0522.m2385(parcelM2287, c5253);
        AbstractC0522.m2385(parcelM2287, bundle);
        Parcel parcelM2290 = m2290(parcelM2287, 24);
        ArrayList arrayListCreateTypedArrayList = parcelM2290.createTypedArrayList(C5307.CREATOR);
        parcelM2290.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // p456.InterfaceC5311
    /* renamed from: ᐧʻ */
    public final void mo11678(Bundle bundle, C5253 c5253) {
        Parcel parcelM2287 = m2287();
        AbstractC0522.m2385(parcelM2287, bundle);
        AbstractC0522.m2385(parcelM2287, c5253);
        m2291(parcelM2287, 19);
    }

    @Override // p456.InterfaceC5311
    /* renamed from: ᐧˋ */
    public final void mo11679(C5253 c5253) {
        Parcel parcelM2287 = m2287();
        AbstractC0522.m2385(parcelM2287, c5253);
        m2291(parcelM2287, 18);
    }

    @Override // p456.InterfaceC5311
    /* renamed from: ᐧⁱ */
    public final void mo11680(C5253 c5253) {
        Parcel parcelM2287 = m2287();
        AbstractC0522.m2385(parcelM2287, c5253);
        m2291(parcelM2287, 20);
    }

    @Override // p456.InterfaceC5311
    /* renamed from: ᴵʿ */
    public final List mo11681(String str, String str2, String str3, boolean z) {
        Parcel parcelM2287 = m2287();
        parcelM2287.writeString(null);
        parcelM2287.writeString(str2);
        parcelM2287.writeString(str3);
        ClassLoader classLoader = AbstractC0522.f2867;
        parcelM2287.writeInt(z ? 1 : 0);
        Parcel parcelM2290 = m2290(parcelM2287, 15);
        ArrayList arrayListCreateTypedArrayList = parcelM2290.createTypedArrayList(C5290.CREATOR);
        parcelM2290.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // p456.InterfaceC5311
    /* renamed from: ᵎـ */
    public final void mo11682(C5253 c5253) {
        Parcel parcelM2287 = m2287();
        AbstractC0522.m2385(parcelM2287, c5253);
        m2291(parcelM2287, 27);
    }

    @Override // p456.InterfaceC5311
    /* renamed from: ﹳˎ */
    public final byte[] mo11684(C5343 c5343, String str) {
        Parcel parcelM2287 = m2287();
        AbstractC0522.m2385(parcelM2287, c5343);
        parcelM2287.writeString(str);
        Parcel parcelM2290 = m2290(parcelM2287, 9);
        byte[] bArrCreateByteArray = parcelM2290.createByteArray();
        parcelM2290.recycle();
        return bArrCreateByteArray;
    }

    @Override // p456.InterfaceC5311
    /* renamed from: ﹶˆ */
    public final String mo11686(C5253 c5253) {
        Parcel parcelM2287 = m2287();
        AbstractC0522.m2385(parcelM2287, c5253);
        Parcel parcelM2290 = m2290(parcelM2287, 11);
        String string = parcelM2290.readString();
        parcelM2290.recycle();
        return string;
    }

    @Override // p456.InterfaceC5311
    /* renamed from: ﾞʽ */
    public final void mo11687(C5253 c5253) {
        Parcel parcelM2287 = m2287();
        AbstractC0522.m2385(parcelM2287, c5253);
        m2291(parcelM2287, 4);
    }

    @Override // p456.InterfaceC5311
    /* renamed from: ﾞˊ */
    public final void mo11688(Bundle bundle, C5253 c5253) {
        Parcel parcelM2287 = m2287();
        AbstractC0522.m2385(parcelM2287, bundle);
        AbstractC0522.m2385(parcelM2287, c5253);
        m2291(parcelM2287, 28);
    }
}
