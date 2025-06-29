package com.google.android.gms.internal.measurement;

import android.content.Intent;
import android.os.Bundle;
import android.os.IInterface;
import java.util.Map;
import p113.InterfaceC1818;

/* renamed from: com.google.android.gms.internal.measurement.ᵔٴ, reason: contains not printable characters */
/* loaded from: classes.dex */
public interface InterfaceC0516 extends IInterface {
    void beginAdUnitExposure(String str, long j);

    void clearConditionalUserProperty(String str, String str2, Bundle bundle);

    void clearMeasurementEnabled(long j);

    void endAdUnitExposure(String str, long j);

    void generateEventId(InterfaceC0511 interfaceC0511);

    void getAppInstanceId(InterfaceC0511 interfaceC0511);

    void getCachedAppInstanceId(InterfaceC0511 interfaceC0511);

    void getConditionalUserProperties(String str, String str2, InterfaceC0511 interfaceC0511);

    void getCurrentScreenClass(InterfaceC0511 interfaceC0511);

    void getCurrentScreenName(InterfaceC0511 interfaceC0511);

    void getGmpAppId(InterfaceC0511 interfaceC0511);

    void getMaxUserProperties(String str, InterfaceC0511 interfaceC0511);

    void getSessionId(InterfaceC0511 interfaceC0511);

    void getTestFlag(InterfaceC0511 interfaceC0511, int i);

    void getUserProperties(String str, String str2, boolean z, InterfaceC0511 interfaceC0511);

    void initForTests(Map map);

    void initialize(InterfaceC1818 interfaceC1818, C0383 c0383, long j);

    void isDataCollectionEnabled(InterfaceC0511 interfaceC0511);

    void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j);

    void logEventAndBundle(String str, String str2, Bundle bundle, InterfaceC0511 interfaceC0511, long j);

    void logHealthData(int i, String str, InterfaceC1818 interfaceC1818, InterfaceC1818 interfaceC18182, InterfaceC1818 interfaceC18183);

    void onActivityCreated(InterfaceC1818 interfaceC1818, Bundle bundle, long j);

    void onActivityDestroyed(InterfaceC1818 interfaceC1818, long j);

    void onActivityPaused(InterfaceC1818 interfaceC1818, long j);

    void onActivityResumed(InterfaceC1818 interfaceC1818, long j);

    void onActivitySaveInstanceState(InterfaceC1818 interfaceC1818, InterfaceC0511 interfaceC0511, long j);

    void onActivityStarted(InterfaceC1818 interfaceC1818, long j);

    void onActivityStopped(InterfaceC1818 interfaceC1818, long j);

    void performAction(Bundle bundle, InterfaceC0511 interfaceC0511, long j);

    void registerOnMeasurementEventListener(InterfaceC0404 interfaceC0404);

    void resetAnalyticsData(long j);

    void setConditionalUserProperty(Bundle bundle, long j);

    void setConsent(Bundle bundle, long j);

    void setConsentThirdParty(Bundle bundle, long j);

    void setCurrentScreen(InterfaceC1818 interfaceC1818, String str, String str2, long j);

    void setDataCollectionEnabled(boolean z);

    void setDefaultEventParameters(Bundle bundle);

    void setDefaultEventParametersWithBackfill(Bundle bundle);

    void setEventInterceptor(InterfaceC0404 interfaceC0404);

    void setInstanceIdProvider(InterfaceC0500 interfaceC0500);

    void setMeasurementEnabled(boolean z, long j);

    void setMinimumSessionDuration(long j);

    void setSessionTimeoutDuration(long j);

    void setSgtmDebugInfo(Intent intent);

    void setUserId(String str, long j);

    void setUserProperty(String str, String str2, InterfaceC1818 interfaceC1818, boolean z, long j);

    void unregisterOnMeasurementEventListener(InterfaceC0404 interfaceC0404);
}
