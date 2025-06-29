package com.google.android.gms.internal.measurement;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.HashMap;
import p113.BinderC1816;
import p113.InterfaceC1818;
import p334.C3789;

/* renamed from: com.google.android.gms.internal.measurement.ʻʿ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractBinderC0299 extends AbstractBinderC0558 implements InterfaceC0516 {
    public static InterfaceC0516 asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
        return iInterfaceQueryLocalInterface instanceof InterfaceC0516 ? (InterfaceC0516) iInterfaceQueryLocalInterface : new C0578(iBinder, "com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService", 0);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractBinderC0558
    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final boolean mo1630(int i, Parcel parcel, Parcel parcel2) {
        boolean z;
        InterfaceC0511 c0391 = null;
        InterfaceC0511 c03912 = null;
        InterfaceC0511 c03913 = null;
        InterfaceC0511 c03914 = null;
        InterfaceC0404 c0339 = null;
        InterfaceC0404 c03392 = null;
        InterfaceC0404 c03393 = null;
        InterfaceC0511 c03915 = null;
        InterfaceC0511 c03916 = null;
        InterfaceC0511 c03917 = null;
        InterfaceC0511 c03918 = null;
        InterfaceC0511 c03919 = null;
        InterfaceC0511 c039110 = null;
        InterfaceC0500 c0535 = null;
        InterfaceC0511 c039111 = null;
        InterfaceC0511 c039112 = null;
        InterfaceC0511 c039113 = null;
        InterfaceC0511 c039114 = null;
        InterfaceC0511 c039115 = null;
        switch (i) {
            case 1:
                InterfaceC1818 interfaceC1818M5559 = BinderC1816.m5559(parcel.readStrongBinder());
                C0383 c0383 = (C0383) AbstractC0522.m2386(parcel, C0383.CREATOR);
                long j = parcel.readLong();
                AbstractC0522.m2387(parcel);
                initialize(interfaceC1818M5559, c0383, j);
                break;
            case 2:
                String string = parcel.readString();
                String string2 = parcel.readString();
                Bundle bundle = (Bundle) AbstractC0522.m2386(parcel, Bundle.CREATOR);
                boolean z2 = parcel.readInt() != 0;
                boolean z3 = parcel.readInt() != 0;
                long j2 = parcel.readLong();
                AbstractC0522.m2387(parcel);
                logEvent(string, string2, bundle, z2, z3, j2);
                break;
            case 3:
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                Bundle bundle2 = (Bundle) AbstractC0522.m2386(parcel, Bundle.CREATOR);
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c0391 = iInterfaceQueryLocalInterface instanceof InterfaceC0511 ? (InterfaceC0511) iInterfaceQueryLocalInterface : new C0391(strongBinder);
                }
                long j3 = parcel.readLong();
                AbstractC0522.m2387(parcel);
                logEventAndBundle(string3, string4, bundle2, c0391, j3);
                break;
            case 4:
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                InterfaceC1818 interfaceC1818M55592 = BinderC1816.m5559(parcel.readStrongBinder());
                ClassLoader classLoader = AbstractC0522.f2867;
                boolean z4 = parcel.readInt() != 0;
                long j4 = parcel.readLong();
                AbstractC0522.m2387(parcel);
                setUserProperty(string5, string6, interfaceC1818M55592, z4, j4);
                break;
            case 5:
                String string7 = parcel.readString();
                String string8 = parcel.readString();
                ClassLoader classLoader2 = AbstractC0522.f2867;
                z = parcel.readInt() != 0;
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c039115 = iInterfaceQueryLocalInterface2 instanceof InterfaceC0511 ? (InterfaceC0511) iInterfaceQueryLocalInterface2 : new C0391(strongBinder2);
                }
                AbstractC0522.m2387(parcel);
                getUserProperties(string7, string8, z, c039115);
                break;
            case C3789.STRING_SET_FIELD_NUMBER /* 6 */:
                String string9 = parcel.readString();
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c039114 = iInterfaceQueryLocalInterface3 instanceof InterfaceC0511 ? (InterfaceC0511) iInterfaceQueryLocalInterface3 : new C0391(strongBinder3);
                }
                AbstractC0522.m2387(parcel);
                getMaxUserProperties(string9, c039114);
                break;
            case C3789.DOUBLE_FIELD_NUMBER /* 7 */:
                String string10 = parcel.readString();
                long j5 = parcel.readLong();
                AbstractC0522.m2387(parcel);
                setUserId(string10, j5);
                break;
            case 8:
                Bundle bundle3 = (Bundle) AbstractC0522.m2386(parcel, Bundle.CREATOR);
                long j6 = parcel.readLong();
                AbstractC0522.m2387(parcel);
                setConditionalUserProperty(bundle3, j6);
                break;
            case 9:
                String string11 = parcel.readString();
                String string12 = parcel.readString();
                Bundle bundle4 = (Bundle) AbstractC0522.m2386(parcel, Bundle.CREATOR);
                AbstractC0522.m2387(parcel);
                clearConditionalUserProperty(string11, string12, bundle4);
                break;
            case 10:
                String string13 = parcel.readString();
                String string14 = parcel.readString();
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c039113 = iInterfaceQueryLocalInterface4 instanceof InterfaceC0511 ? (InterfaceC0511) iInterfaceQueryLocalInterface4 : new C0391(strongBinder4);
                }
                AbstractC0522.m2387(parcel);
                getConditionalUserProperties(string13, string14, c039113);
                break;
            case 11:
                ClassLoader classLoader3 = AbstractC0522.f2867;
                z = parcel.readInt() != 0;
                long j7 = parcel.readLong();
                AbstractC0522.m2387(parcel);
                setMeasurementEnabled(z, j7);
                break;
            case 12:
                long j8 = parcel.readLong();
                AbstractC0522.m2387(parcel);
                resetAnalyticsData(j8);
                break;
            case 13:
                long j9 = parcel.readLong();
                AbstractC0522.m2387(parcel);
                setMinimumSessionDuration(j9);
                break;
            case 14:
                long j10 = parcel.readLong();
                AbstractC0522.m2387(parcel);
                setSessionTimeoutDuration(j10);
                break;
            case 15:
                InterfaceC1818 interfaceC1818M55593 = BinderC1816.m5559(parcel.readStrongBinder());
                String string15 = parcel.readString();
                String string16 = parcel.readString();
                long j11 = parcel.readLong();
                AbstractC0522.m2387(parcel);
                setCurrentScreen(interfaceC1818M55593, string15, string16, j11);
                break;
            case 16:
                IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 != null) {
                    IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c039112 = iInterfaceQueryLocalInterface5 instanceof InterfaceC0511 ? (InterfaceC0511) iInterfaceQueryLocalInterface5 : new C0391(strongBinder5);
                }
                AbstractC0522.m2387(parcel);
                getCurrentScreenName(c039112);
                break;
            case 17:
                IBinder strongBinder6 = parcel.readStrongBinder();
                if (strongBinder6 != null) {
                    IInterface iInterfaceQueryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c039111 = iInterfaceQueryLocalInterface6 instanceof InterfaceC0511 ? (InterfaceC0511) iInterfaceQueryLocalInterface6 : new C0391(strongBinder6);
                }
                AbstractC0522.m2387(parcel);
                getCurrentScreenClass(c039111);
                break;
            case 18:
                IBinder strongBinder7 = parcel.readStrongBinder();
                if (strongBinder7 != null) {
                    IInterface iInterfaceQueryLocalInterface7 = strongBinder7.queryLocalInterface("com.google.android.gms.measurement.api.internal.IStringProvider");
                    c0535 = iInterfaceQueryLocalInterface7 instanceof InterfaceC0500 ? (InterfaceC0500) iInterfaceQueryLocalInterface7 : new C0535(strongBinder7, "com.google.android.gms.measurement.api.internal.IStringProvider", 0);
                }
                AbstractC0522.m2387(parcel);
                setInstanceIdProvider(c0535);
                break;
            case 19:
                IBinder strongBinder8 = parcel.readStrongBinder();
                if (strongBinder8 != null) {
                    IInterface iInterfaceQueryLocalInterface8 = strongBinder8.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c039110 = iInterfaceQueryLocalInterface8 instanceof InterfaceC0511 ? (InterfaceC0511) iInterfaceQueryLocalInterface8 : new C0391(strongBinder8);
                }
                AbstractC0522.m2387(parcel);
                getCachedAppInstanceId(c039110);
                break;
            case 20:
                IBinder strongBinder9 = parcel.readStrongBinder();
                if (strongBinder9 != null) {
                    IInterface iInterfaceQueryLocalInterface9 = strongBinder9.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c03919 = iInterfaceQueryLocalInterface9 instanceof InterfaceC0511 ? (InterfaceC0511) iInterfaceQueryLocalInterface9 : new C0391(strongBinder9);
                }
                AbstractC0522.m2387(parcel);
                getAppInstanceId(c03919);
                break;
            case 21:
                IBinder strongBinder10 = parcel.readStrongBinder();
                if (strongBinder10 != null) {
                    IInterface iInterfaceQueryLocalInterface10 = strongBinder10.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c03918 = iInterfaceQueryLocalInterface10 instanceof InterfaceC0511 ? (InterfaceC0511) iInterfaceQueryLocalInterface10 : new C0391(strongBinder10);
                }
                AbstractC0522.m2387(parcel);
                getGmpAppId(c03918);
                break;
            case 22:
                IBinder strongBinder11 = parcel.readStrongBinder();
                if (strongBinder11 != null) {
                    IInterface iInterfaceQueryLocalInterface11 = strongBinder11.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c03917 = iInterfaceQueryLocalInterface11 instanceof InterfaceC0511 ? (InterfaceC0511) iInterfaceQueryLocalInterface11 : new C0391(strongBinder11);
                }
                AbstractC0522.m2387(parcel);
                generateEventId(c03917);
                break;
            case 23:
                String string17 = parcel.readString();
                long j12 = parcel.readLong();
                AbstractC0522.m2387(parcel);
                beginAdUnitExposure(string17, j12);
                break;
            case 24:
                String string18 = parcel.readString();
                long j13 = parcel.readLong();
                AbstractC0522.m2387(parcel);
                endAdUnitExposure(string18, j13);
                break;
            case 25:
                InterfaceC1818 interfaceC1818M55594 = BinderC1816.m5559(parcel.readStrongBinder());
                long j14 = parcel.readLong();
                AbstractC0522.m2387(parcel);
                onActivityStarted(interfaceC1818M55594, j14);
                break;
            case 26:
                InterfaceC1818 interfaceC1818M55595 = BinderC1816.m5559(parcel.readStrongBinder());
                long j15 = parcel.readLong();
                AbstractC0522.m2387(parcel);
                onActivityStopped(interfaceC1818M55595, j15);
                break;
            case 27:
                InterfaceC1818 interfaceC1818M55596 = BinderC1816.m5559(parcel.readStrongBinder());
                Bundle bundle5 = (Bundle) AbstractC0522.m2386(parcel, Bundle.CREATOR);
                long j16 = parcel.readLong();
                AbstractC0522.m2387(parcel);
                onActivityCreated(interfaceC1818M55596, bundle5, j16);
                break;
            case 28:
                InterfaceC1818 interfaceC1818M55597 = BinderC1816.m5559(parcel.readStrongBinder());
                long j17 = parcel.readLong();
                AbstractC0522.m2387(parcel);
                onActivityDestroyed(interfaceC1818M55597, j17);
                break;
            case 29:
                InterfaceC1818 interfaceC1818M55598 = BinderC1816.m5559(parcel.readStrongBinder());
                long j18 = parcel.readLong();
                AbstractC0522.m2387(parcel);
                onActivityPaused(interfaceC1818M55598, j18);
                break;
            case 30:
                InterfaceC1818 interfaceC1818M55599 = BinderC1816.m5559(parcel.readStrongBinder());
                long j19 = parcel.readLong();
                AbstractC0522.m2387(parcel);
                onActivityResumed(interfaceC1818M55599, j19);
                break;
            case 31:
                InterfaceC1818 interfaceC1818M555910 = BinderC1816.m5559(parcel.readStrongBinder());
                IBinder strongBinder12 = parcel.readStrongBinder();
                if (strongBinder12 != null) {
                    IInterface iInterfaceQueryLocalInterface12 = strongBinder12.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c03916 = iInterfaceQueryLocalInterface12 instanceof InterfaceC0511 ? (InterfaceC0511) iInterfaceQueryLocalInterface12 : new C0391(strongBinder12);
                }
                long j20 = parcel.readLong();
                AbstractC0522.m2387(parcel);
                onActivitySaveInstanceState(interfaceC1818M555910, c03916, j20);
                break;
            case 32:
                Bundle bundle6 = (Bundle) AbstractC0522.m2386(parcel, Bundle.CREATOR);
                IBinder strongBinder13 = parcel.readStrongBinder();
                if (strongBinder13 != null) {
                    IInterface iInterfaceQueryLocalInterface13 = strongBinder13.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c03915 = iInterfaceQueryLocalInterface13 instanceof InterfaceC0511 ? (InterfaceC0511) iInterfaceQueryLocalInterface13 : new C0391(strongBinder13);
                }
                long j21 = parcel.readLong();
                AbstractC0522.m2387(parcel);
                performAction(bundle6, c03915, j21);
                break;
            case 33:
                int i2 = parcel.readInt();
                String string19 = parcel.readString();
                InterfaceC1818 interfaceC1818M555911 = BinderC1816.m5559(parcel.readStrongBinder());
                InterfaceC1818 interfaceC1818M555912 = BinderC1816.m5559(parcel.readStrongBinder());
                InterfaceC1818 interfaceC1818M555913 = BinderC1816.m5559(parcel.readStrongBinder());
                AbstractC0522.m2387(parcel);
                logHealthData(i2, string19, interfaceC1818M555911, interfaceC1818M555912, interfaceC1818M555913);
                break;
            case 34:
                IBinder strongBinder14 = parcel.readStrongBinder();
                if (strongBinder14 != null) {
                    IInterface iInterfaceQueryLocalInterface14 = strongBinder14.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    c03393 = iInterfaceQueryLocalInterface14 instanceof InterfaceC0404 ? (InterfaceC0404) iInterfaceQueryLocalInterface14 : new C0339(strongBinder14);
                }
                AbstractC0522.m2387(parcel);
                setEventInterceptor(c03393);
                break;
            case 35:
                IBinder strongBinder15 = parcel.readStrongBinder();
                if (strongBinder15 != null) {
                    IInterface iInterfaceQueryLocalInterface15 = strongBinder15.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    c03392 = iInterfaceQueryLocalInterface15 instanceof InterfaceC0404 ? (InterfaceC0404) iInterfaceQueryLocalInterface15 : new C0339(strongBinder15);
                }
                AbstractC0522.m2387(parcel);
                registerOnMeasurementEventListener(c03392);
                break;
            case 36:
                IBinder strongBinder16 = parcel.readStrongBinder();
                if (strongBinder16 != null) {
                    IInterface iInterfaceQueryLocalInterface16 = strongBinder16.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    c0339 = iInterfaceQueryLocalInterface16 instanceof InterfaceC0404 ? (InterfaceC0404) iInterfaceQueryLocalInterface16 : new C0339(strongBinder16);
                }
                AbstractC0522.m2387(parcel);
                unregisterOnMeasurementEventListener(c0339);
                break;
            case 37:
                HashMap hashMap = parcel.readHashMap(AbstractC0522.f2867);
                AbstractC0522.m2387(parcel);
                initForTests(hashMap);
                break;
            case 38:
                IBinder strongBinder17 = parcel.readStrongBinder();
                if (strongBinder17 != null) {
                    IInterface iInterfaceQueryLocalInterface17 = strongBinder17.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c03914 = iInterfaceQueryLocalInterface17 instanceof InterfaceC0511 ? (InterfaceC0511) iInterfaceQueryLocalInterface17 : new C0391(strongBinder17);
                }
                int i3 = parcel.readInt();
                AbstractC0522.m2387(parcel);
                getTestFlag(c03914, i3);
                break;
            case 39:
                ClassLoader classLoader4 = AbstractC0522.f2867;
                z = parcel.readInt() != 0;
                AbstractC0522.m2387(parcel);
                setDataCollectionEnabled(z);
                break;
            case 40:
                IBinder strongBinder18 = parcel.readStrongBinder();
                if (strongBinder18 != null) {
                    IInterface iInterfaceQueryLocalInterface18 = strongBinder18.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c03913 = iInterfaceQueryLocalInterface18 instanceof InterfaceC0511 ? (InterfaceC0511) iInterfaceQueryLocalInterface18 : new C0391(strongBinder18);
                }
                AbstractC0522.m2387(parcel);
                isDataCollectionEnabled(c03913);
                break;
            case 41:
            case 47:
            default:
                return false;
            case 42:
                Bundle bundle7 = (Bundle) AbstractC0522.m2386(parcel, Bundle.CREATOR);
                AbstractC0522.m2387(parcel);
                setDefaultEventParameters(bundle7);
                break;
            case 43:
                long j22 = parcel.readLong();
                AbstractC0522.m2387(parcel);
                clearMeasurementEnabled(j22);
                break;
            case 44:
                Bundle bundle8 = (Bundle) AbstractC0522.m2386(parcel, Bundle.CREATOR);
                long j23 = parcel.readLong();
                AbstractC0522.m2387(parcel);
                setConsent(bundle8, j23);
                break;
            case 45:
                Bundle bundle9 = (Bundle) AbstractC0522.m2386(parcel, Bundle.CREATOR);
                long j24 = parcel.readLong();
                AbstractC0522.m2387(parcel);
                setConsentThirdParty(bundle9, j24);
                break;
            case 46:
                IBinder strongBinder19 = parcel.readStrongBinder();
                if (strongBinder19 != null) {
                    IInterface iInterfaceQueryLocalInterface19 = strongBinder19.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c03912 = iInterfaceQueryLocalInterface19 instanceof InterfaceC0511 ? (InterfaceC0511) iInterfaceQueryLocalInterface19 : new C0391(strongBinder19);
                }
                AbstractC0522.m2387(parcel);
                getSessionId(c03912);
                break;
            case 48:
                Intent intent = (Intent) AbstractC0522.m2386(parcel, Intent.CREATOR);
                AbstractC0522.m2387(parcel);
                setSgtmDebugInfo(intent);
                break;
            case 49:
                Bundle bundle10 = (Bundle) AbstractC0522.m2386(parcel, Bundle.CREATOR);
                AbstractC0522.m2387(parcel);
                setDefaultEventParametersWithBackfill(bundle10);
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
