package com.google.android.gms.measurement;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import com.google.android.gms.internal.measurement.C0383;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p021.AbstractC1132;
import p021.C1130;
import p021.C1131;
import p417.AbstractC4753;
import p456.AbstractC5310;
import p456.C5236;
import p456.InterfaceC5317;

@Deprecated
/* loaded from: classes.dex */
public class AppMeasurement {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static volatile AppMeasurement f3105;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final AbstractC1132 f3106;

    public static class ConditionalUserProperty {

        @Keep
        public boolean mActive;

        @Keep
        public String mAppId;

        @Keep
        public long mCreationTimestamp;

        @Keep
        public String mExpiredEventName;

        @Keep
        public Bundle mExpiredEventParams;

        @Keep
        public String mName;

        @Keep
        public String mOrigin;

        @Keep
        public long mTimeToLive;

        @Keep
        public String mTimedOutEventName;

        @Keep
        public Bundle mTimedOutEventParams;

        @Keep
        public String mTriggerEventName;

        @Keep
        public long mTriggerTimeout;

        @Keep
        public String mTriggeredEventName;

        @Keep
        public Bundle mTriggeredEventParams;

        @Keep
        public long mTriggeredTimestamp;

        @Keep
        public Object mValue;
    }

    public AppMeasurement(C5236 c5236) {
        this.f3106 = new C1130(c5236);
    }

    public AppMeasurement(InterfaceC5317 interfaceC5317) {
        this.f3106 = new C1131(interfaceC5317);
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Keep
    @Deprecated
    public static AppMeasurement getInstance(Context context) {
        if (f3105 == null) {
            synchronized (AppMeasurement.class) {
                try {
                    if (f3105 == null) {
                        InterfaceC5317 interfaceC5317 = (InterfaceC5317) FirebaseAnalytics.class.getDeclaredMethod("getScionFrontendApiImplementation", Context.class, Bundle.class).invoke(null, context, null);
                        if (interfaceC5317 != null) {
                            f3105 = new AppMeasurement(interfaceC5317);
                        } else {
                            f3105 = new AppMeasurement(C5236.m11645(context, new C0383(0L, 0L, true, null, null, null, null, null), null));
                        }
                    }
                } finally {
                }
            }
        }
        return f3105;
    }

    @Keep
    public void beginAdUnitExposure(String str) {
        this.f3106.mo4146(str);
    }

    @Keep
    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        this.f3106.mo4156(str, str2, bundle);
    }

    @Keep
    public void endAdUnitExposure(String str) {
        this.f3106.mo4154(str);
    }

    @Keep
    public long generateEventId() {
        return this.f3106.mo4152();
    }

    @Keep
    public String getAppInstanceId() {
        return this.f3106.mo4157();
    }

    @Keep
    public List<ConditionalUserProperty> getConditionalUserProperties(String str, String str2) {
        List<Bundle> listMo4150 = this.f3106.mo4150(str, str2);
        ArrayList arrayList = new ArrayList(listMo4150 == null ? 0 : listMo4150.size());
        for (Bundle bundle : listMo4150) {
            ConditionalUserProperty conditionalUserProperty = new ConditionalUserProperty();
            AbstractC4753.m10683(bundle);
            conditionalUserProperty.mAppId = (String) AbstractC5310.m11924(bundle, "app_id", String.class, null);
            conditionalUserProperty.mOrigin = (String) AbstractC5310.m11924(bundle, "origin", String.class, null);
            conditionalUserProperty.mName = (String) AbstractC5310.m11924(bundle, "name", String.class, null);
            conditionalUserProperty.mValue = AbstractC5310.m11924(bundle, "value", Object.class, null);
            conditionalUserProperty.mTriggerEventName = (String) AbstractC5310.m11924(bundle, "trigger_event_name", String.class, null);
            conditionalUserProperty.mTriggerTimeout = ((Long) AbstractC5310.m11924(bundle, "trigger_timeout", Long.class, 0L)).longValue();
            conditionalUserProperty.mTimedOutEventName = (String) AbstractC5310.m11924(bundle, "timed_out_event_name", String.class, null);
            conditionalUserProperty.mTimedOutEventParams = (Bundle) AbstractC5310.m11924(bundle, "timed_out_event_params", Bundle.class, null);
            conditionalUserProperty.mTriggeredEventName = (String) AbstractC5310.m11924(bundle, "triggered_event_name", String.class, null);
            conditionalUserProperty.mTriggeredEventParams = (Bundle) AbstractC5310.m11924(bundle, "triggered_event_params", Bundle.class, null);
            conditionalUserProperty.mTimeToLive = ((Long) AbstractC5310.m11924(bundle, "time_to_live", Long.class, 0L)).longValue();
            conditionalUserProperty.mExpiredEventName = (String) AbstractC5310.m11924(bundle, "expired_event_name", String.class, null);
            conditionalUserProperty.mExpiredEventParams = (Bundle) AbstractC5310.m11924(bundle, "expired_event_params", Bundle.class, null);
            conditionalUserProperty.mActive = ((Boolean) AbstractC5310.m11924(bundle, "active", Boolean.class, Boolean.FALSE)).booleanValue();
            conditionalUserProperty.mCreationTimestamp = ((Long) AbstractC5310.m11924(bundle, "creation_timestamp", Long.class, 0L)).longValue();
            conditionalUserProperty.mTriggeredTimestamp = ((Long) AbstractC5310.m11924(bundle, "triggered_timestamp", Long.class, 0L)).longValue();
            arrayList.add(conditionalUserProperty);
        }
        return arrayList;
    }

    @Keep
    public String getCurrentScreenClass() {
        return this.f3106.mo4155();
    }

    @Keep
    public String getCurrentScreenName() {
        return this.f3106.mo4151();
    }

    @Keep
    public String getGmpAppId() {
        return this.f3106.mo4147();
    }

    @Keep
    public int getMaxUserProperties(String str) {
        return this.f3106.mo4153(str);
    }

    @Keep
    public Map<String, Object> getUserProperties(String str, String str2, boolean z) {
        return this.f3106.mo4149(str, str2, z);
    }

    @Keep
    public void logEventInternal(String str, String str2, Bundle bundle) {
        this.f3106.mo4148(str, str2, bundle);
    }

    @Keep
    public void setConditionalUserProperty(ConditionalUserProperty conditionalUserProperty) {
        AbstractC4753.m10683(conditionalUserProperty);
        Bundle bundle = new Bundle();
        String str = conditionalUserProperty.mAppId;
        if (str != null) {
            bundle.putString("app_id", str);
        }
        String str2 = conditionalUserProperty.mOrigin;
        if (str2 != null) {
            bundle.putString("origin", str2);
        }
        String str3 = conditionalUserProperty.mName;
        if (str3 != null) {
            bundle.putString("name", str3);
        }
        Object obj = conditionalUserProperty.mValue;
        if (obj != null) {
            AbstractC5310.m11922(bundle, obj);
        }
        String str4 = conditionalUserProperty.mTriggerEventName;
        if (str4 != null) {
            bundle.putString("trigger_event_name", str4);
        }
        bundle.putLong("trigger_timeout", conditionalUserProperty.mTriggerTimeout);
        String str5 = conditionalUserProperty.mTimedOutEventName;
        if (str5 != null) {
            bundle.putString("timed_out_event_name", str5);
        }
        Bundle bundle2 = conditionalUserProperty.mTimedOutEventParams;
        if (bundle2 != null) {
            bundle.putBundle("timed_out_event_params", bundle2);
        }
        String str6 = conditionalUserProperty.mTriggeredEventName;
        if (str6 != null) {
            bundle.putString("triggered_event_name", str6);
        }
        Bundle bundle3 = conditionalUserProperty.mTriggeredEventParams;
        if (bundle3 != null) {
            bundle.putBundle("triggered_event_params", bundle3);
        }
        bundle.putLong("time_to_live", conditionalUserProperty.mTimeToLive);
        String str7 = conditionalUserProperty.mExpiredEventName;
        if (str7 != null) {
            bundle.putString("expired_event_name", str7);
        }
        Bundle bundle4 = conditionalUserProperty.mExpiredEventParams;
        if (bundle4 != null) {
            bundle.putBundle("expired_event_params", bundle4);
        }
        bundle.putLong("creation_timestamp", conditionalUserProperty.mCreationTimestamp);
        bundle.putBoolean("active", conditionalUserProperty.mActive);
        bundle.putLong("triggered_timestamp", conditionalUserProperty.mTriggeredTimestamp);
        this.f3106.mo4145(bundle);
    }
}
