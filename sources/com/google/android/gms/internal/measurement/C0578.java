package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import p113.InterfaceC1818;

/* renamed from: com.google.android.gms.internal.measurement.ﾞˎ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0578 extends AbstractC0482 implements InterfaceC0516 {
    @Override // com.google.android.gms.internal.measurement.InterfaceC0516
    public final void beginAdUnitExposure(String str, long j) {
        Parcel parcelM2287 = m2287();
        parcelM2287.writeString(str);
        parcelM2287.writeLong(j);
        m2291(parcelM2287, 23);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0516
    public final void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        Parcel parcelM2287 = m2287();
        parcelM2287.writeString(str);
        parcelM2287.writeString(str2);
        AbstractC0522.m2385(parcelM2287, bundle);
        m2291(parcelM2287, 9);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0516
    public final void clearMeasurementEnabled(long j) {
        Parcel parcelM2287 = m2287();
        parcelM2287.writeLong(j);
        m2291(parcelM2287, 43);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0516
    public final void endAdUnitExposure(String str, long j) {
        Parcel parcelM2287 = m2287();
        parcelM2287.writeString(str);
        parcelM2287.writeLong(j);
        m2291(parcelM2287, 24);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0516
    public final void generateEventId(InterfaceC0511 interfaceC0511) {
        Parcel parcelM2287 = m2287();
        AbstractC0522.m2384(parcelM2287, interfaceC0511);
        m2291(parcelM2287, 22);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0516
    public final void getCachedAppInstanceId(InterfaceC0511 interfaceC0511) {
        Parcel parcelM2287 = m2287();
        AbstractC0522.m2384(parcelM2287, interfaceC0511);
        m2291(parcelM2287, 19);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0516
    public final void getConditionalUserProperties(String str, String str2, InterfaceC0511 interfaceC0511) {
        Parcel parcelM2287 = m2287();
        parcelM2287.writeString(str);
        parcelM2287.writeString(str2);
        AbstractC0522.m2384(parcelM2287, interfaceC0511);
        m2291(parcelM2287, 10);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0516
    public final void getCurrentScreenClass(InterfaceC0511 interfaceC0511) {
        Parcel parcelM2287 = m2287();
        AbstractC0522.m2384(parcelM2287, interfaceC0511);
        m2291(parcelM2287, 17);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0516
    public final void getCurrentScreenName(InterfaceC0511 interfaceC0511) {
        Parcel parcelM2287 = m2287();
        AbstractC0522.m2384(parcelM2287, interfaceC0511);
        m2291(parcelM2287, 16);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0516
    public final void getGmpAppId(InterfaceC0511 interfaceC0511) {
        Parcel parcelM2287 = m2287();
        AbstractC0522.m2384(parcelM2287, interfaceC0511);
        m2291(parcelM2287, 21);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0516
    public final void getMaxUserProperties(String str, InterfaceC0511 interfaceC0511) {
        Parcel parcelM2287 = m2287();
        parcelM2287.writeString(str);
        AbstractC0522.m2384(parcelM2287, interfaceC0511);
        m2291(parcelM2287, 6);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0516
    public final void getUserProperties(String str, String str2, boolean z, InterfaceC0511 interfaceC0511) {
        Parcel parcelM2287 = m2287();
        parcelM2287.writeString(str);
        parcelM2287.writeString(str2);
        ClassLoader classLoader = AbstractC0522.f2867;
        parcelM2287.writeInt(z ? 1 : 0);
        AbstractC0522.m2384(parcelM2287, interfaceC0511);
        m2291(parcelM2287, 5);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0516
    public final void initialize(InterfaceC1818 interfaceC1818, C0383 c0383, long j) {
        Parcel parcelM2287 = m2287();
        AbstractC0522.m2384(parcelM2287, interfaceC1818);
        AbstractC0522.m2385(parcelM2287, c0383);
        parcelM2287.writeLong(j);
        m2291(parcelM2287, 1);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0516
    public final void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) {
        Parcel parcelM2287 = m2287();
        parcelM2287.writeString(str);
        parcelM2287.writeString(str2);
        AbstractC0522.m2385(parcelM2287, bundle);
        parcelM2287.writeInt(1);
        parcelM2287.writeInt(1);
        parcelM2287.writeLong(j);
        m2291(parcelM2287, 2);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0516
    public final void logHealthData(int i, String str, InterfaceC1818 interfaceC1818, InterfaceC1818 interfaceC18182, InterfaceC1818 interfaceC18183) {
        Parcel parcelM2287 = m2287();
        parcelM2287.writeInt(5);
        parcelM2287.writeString("Error with data collection. Data lost.");
        AbstractC0522.m2384(parcelM2287, interfaceC1818);
        AbstractC0522.m2384(parcelM2287, interfaceC18182);
        AbstractC0522.m2384(parcelM2287, interfaceC18183);
        m2291(parcelM2287, 33);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0516
    public final void onActivityCreated(InterfaceC1818 interfaceC1818, Bundle bundle, long j) {
        Parcel parcelM2287 = m2287();
        AbstractC0522.m2384(parcelM2287, interfaceC1818);
        AbstractC0522.m2385(parcelM2287, bundle);
        parcelM2287.writeLong(j);
        m2291(parcelM2287, 27);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0516
    public final void onActivityDestroyed(InterfaceC1818 interfaceC1818, long j) {
        Parcel parcelM2287 = m2287();
        AbstractC0522.m2384(parcelM2287, interfaceC1818);
        parcelM2287.writeLong(j);
        m2291(parcelM2287, 28);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0516
    public final void onActivityPaused(InterfaceC1818 interfaceC1818, long j) {
        Parcel parcelM2287 = m2287();
        AbstractC0522.m2384(parcelM2287, interfaceC1818);
        parcelM2287.writeLong(j);
        m2291(parcelM2287, 29);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0516
    public final void onActivityResumed(InterfaceC1818 interfaceC1818, long j) {
        Parcel parcelM2287 = m2287();
        AbstractC0522.m2384(parcelM2287, interfaceC1818);
        parcelM2287.writeLong(j);
        m2291(parcelM2287, 30);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0516
    public final void onActivitySaveInstanceState(InterfaceC1818 interfaceC1818, InterfaceC0511 interfaceC0511, long j) {
        Parcel parcelM2287 = m2287();
        AbstractC0522.m2384(parcelM2287, interfaceC1818);
        AbstractC0522.m2384(parcelM2287, interfaceC0511);
        parcelM2287.writeLong(j);
        m2291(parcelM2287, 31);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0516
    public final void onActivityStarted(InterfaceC1818 interfaceC1818, long j) {
        Parcel parcelM2287 = m2287();
        AbstractC0522.m2384(parcelM2287, interfaceC1818);
        parcelM2287.writeLong(j);
        m2291(parcelM2287, 25);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0516
    public final void onActivityStopped(InterfaceC1818 interfaceC1818, long j) {
        Parcel parcelM2287 = m2287();
        AbstractC0522.m2384(parcelM2287, interfaceC1818);
        parcelM2287.writeLong(j);
        m2291(parcelM2287, 26);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0516
    public final void registerOnMeasurementEventListener(InterfaceC0404 interfaceC0404) {
        Parcel parcelM2287 = m2287();
        AbstractC0522.m2384(parcelM2287, interfaceC0404);
        m2291(parcelM2287, 35);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0516
    public final void setConditionalUserProperty(Bundle bundle, long j) {
        Parcel parcelM2287 = m2287();
        AbstractC0522.m2385(parcelM2287, bundle);
        parcelM2287.writeLong(j);
        m2291(parcelM2287, 8);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0516
    public final void setCurrentScreen(InterfaceC1818 interfaceC1818, String str, String str2, long j) {
        Parcel parcelM2287 = m2287();
        AbstractC0522.m2384(parcelM2287, interfaceC1818);
        parcelM2287.writeString(str);
        parcelM2287.writeString(str2);
        parcelM2287.writeLong(j);
        m2291(parcelM2287, 15);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0516
    public final void setDataCollectionEnabled(boolean z) {
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0516
    public final void setMeasurementEnabled(boolean z, long j) {
        Parcel parcelM2287 = m2287();
        ClassLoader classLoader = AbstractC0522.f2867;
        parcelM2287.writeInt(z ? 1 : 0);
        parcelM2287.writeLong(j);
        m2291(parcelM2287, 11);
    }
}
