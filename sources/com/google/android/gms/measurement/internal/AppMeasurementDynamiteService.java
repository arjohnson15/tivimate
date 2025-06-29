package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.internal.measurement.AbstractBinderC0299;
import com.google.android.gms.internal.measurement.C0383;
import com.google.android.gms.internal.measurement.C0472;
import com.google.android.gms.internal.measurement.InterfaceC0404;
import com.google.android.gms.internal.measurement.InterfaceC0500;
import com.google.android.gms.internal.measurement.InterfaceC0511;
import j$.util.Objects;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import p009.RunnableC0997;
import p113.BinderC1816;
import p113.InterfaceC1818;
import p200.C2741;
import p331.C3758;
import p417.AbstractC4753;
import p456.AbstractC5248;
import p456.AbstractC5310;
import p456.C5236;
import p456.C5244;
import p456.C5245;
import p456.C5247;
import p456.C5279;
import p456.C5297;
import p456.C5301;
import p456.C5304;
import p456.C5316;
import p456.C5328;
import p456.C5337;
import p456.C5343;
import p456.InterfaceC5268;
import p456.InterfaceC5281;
import p456.RunnableC5229;
import p456.RunnableC5238;
import p456.RunnableC5242;
import p456.RunnableC5282;
import p456.RunnableC5320;
import p456.RunnableC5335;
import p456.RunnableC5347;
import ʿﾞ.ﹳﹳ;
import ˆʽ.ˑˉ;

@DynamiteApi
/* loaded from: classes.dex */
public class AppMeasurementDynamiteService extends AbstractBinderC0299 {

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final C2741 f3110;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public C5236 f3111;

    public AppMeasurementDynamiteService() {
        super("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
        this.f3111 = null;
        this.f3110 = new C2741(0);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0516
    public void beginAdUnitExposure(String str, long j) {
        m2789();
        this.f3111.m11651().m11690(str, j);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0516
    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        m2789();
        C5244 c5244 = this.f3111.f20106;
        C5236.m11646(c5244);
        c5244.m11708(str, str2, bundle);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [ʿﾞ.ﹳﹳ, ﾞⁱ.ʾˈ, ﾞⁱ.ˈٴ, ﾞⁱ.ˎᵢ] */
    @Override // com.google.android.gms.internal.measurement.InterfaceC0516
    public void clearMeasurementEnabled(long j) {
        m2789();
        ?? r4 = this.f3111.f20106;
        C5236.m11646(r4);
        r4.m11757();
        r4.ʽᐧ().m11743(new RunnableC5242(3, (Object) null, (InterfaceC5281) r4));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0516
    public void endAdUnitExposure(String str, long j) {
        m2789();
        this.f3111.m11651().m11689(str, j);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0516
    public void generateEventId(InterfaceC0511 interfaceC0511) {
        m2789();
        C5316 c5316 = this.f3111.f20095;
        C5236.m11644(c5316);
        long jM11962 = c5316.m11962();
        m2789();
        C5316 c53162 = this.f3111.f20095;
        C5236.m11644(c53162);
        c53162.m11950(interfaceC0511, jM11962);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0516
    public void getAppInstanceId(InterfaceC0511 interfaceC0511) {
        m2789();
        C5247 c5247 = this.f3111.f20115;
        C5236.m11647(c5247);
        c5247.m11743(new RunnableC5320(this, interfaceC0511, 0));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0516
    public void getCachedAppInstanceId(InterfaceC0511 interfaceC0511) {
        m2789();
        C5244 c5244 = this.f3111.f20106;
        C5236.m11646(c5244);
        m2790((String) c5244.f20164.get(), interfaceC0511);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0516
    public void getConditionalUserProperties(String str, String str2, InterfaceC0511 interfaceC0511) {
        m2789();
        C5247 c5247 = this.f3111.f20115;
        C5236.m11647(c5247);
        c5247.m11743(new ˑˉ(this, interfaceC0511, str, str2, 7));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0516
    public void getCurrentScreenClass(InterfaceC0511 interfaceC0511) {
        m2789();
        C5244 c5244 = this.f3111.f20106;
        C5236.m11646(c5244);
        C5328 c5328 = ((C5236) ((ﹳﹳ) c5244).ᐧⁱ).f20121;
        C5236.m11646(c5328);
        C5297 c5297 = c5328.f20662;
        m2790(c5297 != null ? c5297.f20548 : null, interfaceC0511);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0516
    public void getCurrentScreenName(InterfaceC0511 interfaceC0511) {
        m2789();
        C5244 c5244 = this.f3111.f20106;
        C5236.m11646(c5244);
        C5328 c5328 = ((C5236) ((ﹳﹳ) c5244).ᐧⁱ).f20121;
        C5236.m11646(c5328);
        C5297 c5297 = c5328.f20662;
        m2790(c5297 != null ? c5297.f20551 : null, interfaceC0511);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0516
    public void getGmpAppId(InterfaceC0511 interfaceC0511) throws Resources.NotFoundException {
        m2789();
        C5244 c5244 = this.f3111.f20106;
        C5236.m11646(c5244);
        C5236 c5236 = (C5236) ((ﹳﹳ) c5244).ᐧⁱ;
        String string = c5236.f20097;
        if (string == null) {
            string = null;
            try {
                Context context = c5236.f20114;
                String strM11921 = c5236.f20118;
                AbstractC4753.m10683(context);
                Resources resources = context.getResources();
                if (TextUtils.isEmpty(strM11921)) {
                    strM11921 = AbstractC5310.m11921(context);
                }
                int identifier = resources.getIdentifier("google_app_id", "string", strM11921);
                if (identifier != 0) {
                    try {
                        string = resources.getString(identifier);
                    } catch (Resources.NotFoundException unused) {
                    }
                }
            } catch (IllegalStateException e) {
                C5301 c5301 = c5236.f20110;
                C5236.m11647(c5301);
                c5301.f20571.m4531(e, "getGoogleAppId failed with exception");
            }
        }
        m2790(string, interfaceC0511);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0516
    public void getMaxUserProperties(String str, InterfaceC0511 interfaceC0511) {
        m2789();
        C5236.m11646(this.f3111.f20106);
        AbstractC4753.m10688(str);
        m2789();
        C5316 c5316 = this.f3111.f20095;
        C5236.m11644(c5316);
        c5316.m11967(interfaceC0511, 25);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [ʿﾞ.ﹳﹳ, ﾞⁱ.ʾˈ, ﾞⁱ.ˈٴ, ﾞⁱ.ˎᵢ] */
    @Override // com.google.android.gms.internal.measurement.InterfaceC0516
    public void getSessionId(InterfaceC0511 interfaceC0511) {
        m2789();
        ?? r0 = this.f3111.f20106;
        C5236.m11646(r0);
        r0.ʽᐧ().m11743(new RunnableC5242(2, interfaceC0511, (InterfaceC5281) r0));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0516
    public void getTestFlag(InterfaceC0511 interfaceC0511, int i) {
        m2789();
        if (i == 0) {
            C5316 c5316 = this.f3111.f20095;
            C5236.m11644(c5316);
            C5244 c5244 = this.f3111.f20106;
            C5236.m11646(c5244);
            AtomicReference atomicReference = new AtomicReference();
            c5316.m11961((String) c5244.ʽᐧ().m11749(atomicReference, 15000L, "String test flag value", new RunnableC5335(c5244, atomicReference, 2)), interfaceC0511);
            return;
        }
        if (i == 1) {
            C5316 c53162 = this.f3111.f20095;
            C5236.m11644(c53162);
            C5244 c52442 = this.f3111.f20106;
            C5236.m11646(c52442);
            AtomicReference atomicReference2 = new AtomicReference();
            c53162.m11950(interfaceC0511, ((Long) c52442.ʽᐧ().m11749(atomicReference2, 15000L, "long test flag value", new RunnableC5335(c52442, atomicReference2, 4))).longValue());
            return;
        }
        if (i == 2) {
            C5316 c53163 = this.f3111.f20095;
            C5236.m11644(c53163);
            C5244 c52443 = this.f3111.f20106;
            C5236.m11646(c52443);
            AtomicReference atomicReference3 = new AtomicReference();
            double dDoubleValue = ((Double) c52443.ʽᐧ().m11749(atomicReference3, 15000L, "double test flag value", new RunnableC5335(c52443, atomicReference3, 5))).doubleValue();
            Bundle bundle = new Bundle();
            bundle.putDouble("r", dDoubleValue);
            try {
                interfaceC0511.mo2130(bundle);
                return;
            } catch (RemoteException e) {
                C5301 c5301 = ((C5236) ((ﹳﹳ) c53163).ᐧⁱ).f20110;
                C5236.m11647(c5301);
                c5301.f20568.m4531(e, "Error returning double value to wrapper");
                return;
            }
        }
        if (i == 3) {
            C5316 c53164 = this.f3111.f20095;
            C5236.m11644(c53164);
            C5244 c52444 = this.f3111.f20106;
            C5236.m11646(c52444);
            AtomicReference atomicReference4 = new AtomicReference();
            c53164.m11967(interfaceC0511, ((Integer) c52444.ʽᐧ().m11749(atomicReference4, 15000L, "int test flag value", new RunnableC5335(c52444, atomicReference4, 3))).intValue());
            return;
        }
        if (i != 4) {
            return;
        }
        C5316 c53165 = this.f3111.f20095;
        C5236.m11644(c53165);
        C5244 c52445 = this.f3111.f20106;
        C5236.m11646(c52445);
        AtomicReference atomicReference5 = new AtomicReference();
        c53165.m11960(interfaceC0511, ((Boolean) c52445.ʽᐧ().m11749(atomicReference5, 15000L, "boolean test flag value", new RunnableC5335(c52445, atomicReference5, 1))).booleanValue());
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0516
    public void getUserProperties(String str, String str2, boolean z, InterfaceC0511 interfaceC0511) {
        m2789();
        C5247 c5247 = this.f3111.f20115;
        C5236.m11647(c5247);
        c5247.m11743(new RunnableC5347(this, interfaceC0511, str, str2, z, 2));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0516
    public void initForTests(Map map) {
        m2789();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0516
    public void initialize(InterfaceC1818 interfaceC1818, C0383 c0383, long j) {
        C5236 c5236 = this.f3111;
        if (c5236 == null) {
            Context context = (Context) BinderC1816.m5558(interfaceC1818);
            AbstractC4753.m10683(context);
            this.f3111 = C5236.m11645(context, c0383, Long.valueOf(j));
        } else {
            C5301 c5301 = c5236.f20110;
            C5236.m11647(c5301);
            c5301.f20568.m4533("Attempting to initialize multiple times");
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0516
    public void isDataCollectionEnabled(InterfaceC0511 interfaceC0511) {
        m2789();
        C5247 c5247 = this.f3111.f20115;
        C5236.m11647(c5247);
        c5247.m11743(new RunnableC5320(this, interfaceC0511, 1));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0516
    public void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) {
        m2789();
        C5244 c5244 = this.f3111.f20106;
        C5236.m11646(c5244);
        c5244.m11710(str, str2, bundle, z, z2, j);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0516
    public void logEventAndBundle(String str, String str2, Bundle bundle, InterfaceC0511 interfaceC0511, long j) {
        m2789();
        AbstractC4753.m10688(str2);
        (bundle != null ? new Bundle(bundle) : new Bundle()).putString("_o", "app");
        C5343 c5343 = new C5343(str2, new C5279(bundle), "app", j);
        C5247 c5247 = this.f3111.f20115;
        C5236.m11647(c5247);
        c5247.m11743(new ˑˉ(this, interfaceC0511, c5343, str, 3));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0516
    public void logHealthData(int i, String str, InterfaceC1818 interfaceC1818, InterfaceC1818 interfaceC18182, InterfaceC1818 interfaceC18183) {
        m2789();
        Object objM5558 = interfaceC1818 == null ? null : BinderC1816.m5558(interfaceC1818);
        Object objM55582 = interfaceC18182 == null ? null : BinderC1816.m5558(interfaceC18182);
        Object objM55583 = interfaceC18183 != null ? BinderC1816.m5558(interfaceC18183) : null;
        C5301 c5301 = this.f3111.f20110;
        C5236.m11647(c5301);
        c5301.m11919(i, true, false, str, objM5558, objM55582, objM55583);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0516
    public void onActivityCreated(InterfaceC1818 interfaceC1818, Bundle bundle, long j) {
        m2789();
        C5244 c5244 = this.f3111.f20106;
        C5236.m11646(c5244);
        C5337 c5337 = c5244.f20152;
        if (c5337 != null) {
            C5244 c52442 = this.f3111.f20106;
            C5236.m11646(c52442);
            c52442.m11703();
            c5337.onActivityCreated((Activity) BinderC1816.m5558(interfaceC1818), bundle);
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0516
    public void onActivityDestroyed(InterfaceC1818 interfaceC1818, long j) {
        m2789();
        C5244 c5244 = this.f3111.f20106;
        C5236.m11646(c5244);
        C5337 c5337 = c5244.f20152;
        if (c5337 != null) {
            C5244 c52442 = this.f3111.f20106;
            C5236.m11646(c52442);
            c52442.m11703();
            c5337.onActivityDestroyed((Activity) BinderC1816.m5558(interfaceC1818));
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0516
    public void onActivityPaused(InterfaceC1818 interfaceC1818, long j) {
        m2789();
        C5244 c5244 = this.f3111.f20106;
        C5236.m11646(c5244);
        C5337 c5337 = c5244.f20152;
        if (c5337 != null) {
            C5244 c52442 = this.f3111.f20106;
            C5236.m11646(c52442);
            c52442.m11703();
            c5337.onActivityPaused((Activity) BinderC1816.m5558(interfaceC1818));
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0516
    public void onActivityResumed(InterfaceC1818 interfaceC1818, long j) {
        m2789();
        C5244 c5244 = this.f3111.f20106;
        C5236.m11646(c5244);
        C5337 c5337 = c5244.f20152;
        if (c5337 != null) {
            C5244 c52442 = this.f3111.f20106;
            C5236.m11646(c52442);
            c52442.m11703();
            c5337.onActivityResumed((Activity) BinderC1816.m5558(interfaceC1818));
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0516
    public void onActivitySaveInstanceState(InterfaceC1818 interfaceC1818, InterfaceC0511 interfaceC0511, long j) {
        m2789();
        C5244 c5244 = this.f3111.f20106;
        C5236.m11646(c5244);
        C5337 c5337 = c5244.f20152;
        Bundle bundle = new Bundle();
        if (c5337 != null) {
            C5244 c52442 = this.f3111.f20106;
            C5236.m11646(c52442);
            c52442.m11703();
            c5337.onActivitySaveInstanceState((Activity) BinderC1816.m5558(interfaceC1818), bundle);
        }
        try {
            interfaceC0511.mo2130(bundle);
        } catch (RemoteException e) {
            C5301 c5301 = this.f3111.f20110;
            C5236.m11647(c5301);
            c5301.f20568.m4531(e, "Error returning bundle value to wrapper");
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0516
    public void onActivityStarted(InterfaceC1818 interfaceC1818, long j) {
        m2789();
        C5244 c5244 = this.f3111.f20106;
        C5236.m11646(c5244);
        if (c5244.f20152 != null) {
            C5244 c52442 = this.f3111.f20106;
            C5236.m11646(c52442);
            c52442.m11703();
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0516
    public void onActivityStopped(InterfaceC1818 interfaceC1818, long j) {
        m2789();
        C5244 c5244 = this.f3111.f20106;
        C5236.m11646(c5244);
        if (c5244.f20152 != null) {
            C5244 c52442 = this.f3111.f20106;
            C5236.m11646(c52442);
            c52442.m11703();
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0516
    public void performAction(Bundle bundle, InterfaceC0511 interfaceC0511, long j) {
        m2789();
        interfaceC0511.mo2130(null);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0516
    public void registerOnMeasurementEventListener(InterfaceC0404 interfaceC0404) {
        Object c5304;
        m2789();
        synchronized (this.f3110) {
            try {
                c5304 = (InterfaceC5268) this.f3110.get(Integer.valueOf(interfaceC0404.mo1812()));
                if (c5304 == null) {
                    c5304 = new C5304(this, interfaceC0404);
                    this.f3110.put(Integer.valueOf(interfaceC0404.mo1812()), c5304);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        C5244 c5244 = this.f3111.f20106;
        C5236.m11646(c5244);
        c5244.m11757();
        if (c5244.f20149.add(c5304)) {
            return;
        }
        c5244.ˏᵢ().f20568.m4533("OnEventListener already registered");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0516
    public void resetAnalyticsData(long j) {
        m2789();
        C5244 c5244 = this.f3111.f20106;
        C5236.m11646(c5244);
        c5244.m11714(null);
        c5244.ʽᐧ().m11743(new RunnableC5238(c5244, j, 1));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0516
    public void setConditionalUserProperty(Bundle bundle, long j) {
        m2789();
        if (bundle == null) {
            C5301 c5301 = this.f3111.f20110;
            C5236.m11647(c5301);
            c5301.f20571.m4533("Conditional user property must not be null");
        } else {
            C5244 c5244 = this.f3111.f20106;
            C5236.m11646(c5244);
            c5244.m11719(bundle, j);
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0516
    public void setConsent(Bundle bundle, long j) {
        m2789();
        C5244 c5244 = this.f3111.f20106;
        C5236.m11646(c5244);
        C5247 c5247 = c5244.ʽᐧ();
        RunnableC5282 runnableC5282 = new RunnableC5282();
        runnableC5282.f20487 = c5244;
        runnableC5282.f20488 = bundle;
        runnableC5282.f20486 = j;
        c5247.m11739(runnableC5282);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0516
    public void setConsentThirdParty(Bundle bundle, long j) {
        m2789();
        C5244 c5244 = this.f3111.f20106;
        C5236.m11646(c5244);
        c5244.m11711(bundle, -20, j);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0516
    public void setCurrentScreen(InterfaceC1818 interfaceC1818, String str, String str2, long j) {
        m2789();
        C5328 c5328 = this.f3111.f20121;
        C5236.m11646(c5328);
        Activity activity = (Activity) BinderC1816.m5558(interfaceC1818);
        if (!((C5236) ((ﹳﹳ) c5328).ᐧⁱ).f20123.m11729()) {
            c5328.ˏᵢ().f20573.m4533("setCurrentScreen cannot be called while screen reporting is disabled.");
            return;
        }
        C5297 c5297 = c5328.f20662;
        if (c5297 == null) {
            c5328.ˏᵢ().f20573.m4533("setCurrentScreen cannot be called while no activity active");
            return;
        }
        if (c5328.f20666.get(activity) == null) {
            c5328.ˏᵢ().f20573.m4533("setCurrentScreen must be called with an activity in the activity lifecycle");
            return;
        }
        if (str2 == null) {
            str2 = c5328.m12008(activity.getClass());
        }
        boolean zEquals = Objects.equals(c5297.f20548, str2);
        boolean zEquals2 = Objects.equals(c5297.f20551, str);
        if (zEquals && zEquals2) {
            c5328.ˏᵢ().f20573.m4533("setCurrentScreen cannot be called with the same class and name");
            return;
        }
        if (str != null && (str.length() <= 0 || str.length() > ((C5236) ((ﹳﹳ) c5328).ᐧⁱ).f20123.m11737(null, false))) {
            c5328.ˏᵢ().f20573.m4531(Integer.valueOf(str.length()), "Invalid screen name length in setCurrentScreen. Length");
            return;
        }
        if (str2 != null && (str2.length() <= 0 || str2.length() > ((C5236) ((ﹳﹳ) c5328).ᐧⁱ).f20123.m11737(null, false))) {
            c5328.ˏᵢ().f20573.m4531(Integer.valueOf(str2.length()), "Invalid class name length in setCurrentScreen. Length");
            return;
        }
        c5328.ˏᵢ().f20566.m4529(str == null ? "null" : str, str2, "Setting current screen to name, class");
        C5297 c52972 = new C5297(c5328.ﹶﾞ().m11962(), str, str2);
        c5328.f20666.put(activity, c52972);
        c5328.m12003(activity, c52972, true);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0516
    public void setDataCollectionEnabled(boolean z) {
        m2789();
        C5244 c5244 = this.f3111.f20106;
        C5236.m11646(c5244);
        c5244.m11757();
        c5244.ʽᐧ().m11743(new RunnableC0997(4, c5244, z));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0516
    public void setDefaultEventParameters(Bundle bundle) {
        m2789();
        C5244 c5244 = this.f3111.f20106;
        C5236.m11646(c5244);
        Bundle bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
        C5247 c5247 = c5244.ʽᐧ();
        RunnableC5229 runnableC5229 = new RunnableC5229(0);
        runnableC5229.f20029 = c5244;
        runnableC5229.f20030 = bundle2;
        c5247.m11743(runnableC5229);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0516
    public void setDefaultEventParametersWithBackfill(Bundle bundle) {
        m2789();
        C5244 c5244 = this.f3111.f20106;
        C5236.m11646(c5244);
        if (((C5236) ((ﹳﹳ) c5244).ᐧⁱ).f20123.m11727(null, AbstractC5248.f20232)) {
            Bundle bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
            C5247 c5247 = c5244.ʽᐧ();
            RunnableC5229 runnableC5229 = new RunnableC5229(1);
            runnableC5229.f20029 = c5244;
            runnableC5229.f20030 = bundle2;
            c5247.m11743(runnableC5229);
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0516
    public void setEventInterceptor(InterfaceC0404 interfaceC0404) {
        m2789();
        C3758 c3758 = new C3758(20, this, interfaceC0404, false);
        C5247 c5247 = this.f3111.f20115;
        C5236.m11647(c5247);
        if (!c5247.m11741()) {
            C5247 c52472 = this.f3111.f20115;
            C5236.m11647(c52472);
            c52472.m11743(new RunnableC5242(this, 1, c3758));
            return;
        }
        C5244 c5244 = this.f3111.f20106;
        C5236.m11646(c5244);
        c5244.m11846();
        c5244.m11757();
        C3758 c37582 = c5244.f20157;
        if (c3758 != c37582) {
            AbstractC4753.m10681("EventInterceptor already set.", c37582 == null);
        }
        c5244.f20157 = c3758;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0516
    public void setInstanceIdProvider(InterfaceC0500 interfaceC0500) {
        m2789();
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [ʿﾞ.ﹳﹳ, ﾞⁱ.ʾˈ, ﾞⁱ.ˈٴ, ﾞⁱ.ˎᵢ] */
    @Override // com.google.android.gms.internal.measurement.InterfaceC0516
    public void setMeasurementEnabled(boolean z, long j) {
        m2789();
        ?? r4 = this.f3111.f20106;
        C5236.m11646(r4);
        Boolean boolValueOf = Boolean.valueOf(z);
        r4.m11757();
        r4.ʽᐧ().m11743(new RunnableC5242(3, boolValueOf, (InterfaceC5281) r4));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0516
    public void setMinimumSessionDuration(long j) {
        m2789();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0516
    public void setSessionTimeoutDuration(long j) {
        m2789();
        C5244 c5244 = this.f3111.f20106;
        C5236.m11646(c5244);
        c5244.ʽᐧ().m11743(new RunnableC5238(c5244, j, 0));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0516
    public void setSgtmDebugInfo(Intent intent) {
        m2789();
        C5244 c5244 = this.f3111.f20106;
        C5236.m11646(c5244);
        C0472.m2260();
        C5236 c5236 = (C5236) ((ﹳﹳ) c5244).ᐧⁱ;
        if (c5236.f20123.m11727(null, AbstractC5248.f20183)) {
            Uri data = intent.getData();
            if (data == null) {
                c5244.ˏᵢ().f20562.m4533("Activity intent has no data. Preview Mode was not enabled.");
                return;
            }
            String queryParameter = data.getQueryParameter("sgtm_debug_enable");
            C5245 c5245 = c5236.f20123;
            if (queryParameter == null || !queryParameter.equals("1")) {
                c5244.ˏᵢ().f20562.m4533("Preview Mode was not enabled.");
                c5245.f20169 = null;
                return;
            }
            String queryParameter2 = data.getQueryParameter("sgtm_preview_key");
            if (TextUtils.isEmpty(queryParameter2)) {
                return;
            }
            c5244.ˏᵢ().f20562.m4531(queryParameter2, "Preview Mode was enabled. Using the sgtmPreviewKey: ");
            c5245.f20169 = queryParameter2;
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0516
    public void setUserId(String str, long j) {
        m2789();
        C5244 c5244 = this.f3111.f20106;
        C5236.m11646(c5244);
        if (str != null && TextUtils.isEmpty(str)) {
            C5301 c5301 = ((C5236) ((ﹳﹳ) c5244).ᐧⁱ).f20110;
            C5236.m11647(c5301);
            c5301.f20568.m4533("User ID must be non-empty or null");
        } else {
            C5247 c5247 = c5244.ʽᐧ();
            RunnableC5242 runnableC5242 = new RunnableC5242();
            runnableC5242.f20143 = c5244;
            runnableC5242.f20144 = str;
            c5247.m11743(runnableC5242);
            c5244.m11718(null, "_id", str, true, j);
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0516
    public void setUserProperty(String str, String str2, InterfaceC1818 interfaceC1818, boolean z, long j) throws SecurityException {
        m2789();
        Object objM5558 = BinderC1816.m5558(interfaceC1818);
        C5244 c5244 = this.f3111.f20106;
        C5236.m11646(c5244);
        c5244.m11718(str, str2, objM5558, z, j);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0516
    public void unregisterOnMeasurementEventListener(InterfaceC0404 interfaceC0404) {
        Object c5304;
        m2789();
        synchronized (this.f3110) {
            c5304 = (InterfaceC5268) this.f3110.remove(Integer.valueOf(interfaceC0404.mo1812()));
        }
        if (c5304 == null) {
            c5304 = new C5304(this, interfaceC0404);
        }
        C5244 c5244 = this.f3111.f20106;
        C5236.m11646(c5244);
        c5244.m11757();
        if (c5244.f20149.remove(c5304)) {
            return;
        }
        c5244.ˏᵢ().f20568.m4533("OnEventListener had not been registered");
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final void m2789() {
        if (this.f3111 == null) {
            throw new IllegalStateException("Attempting to perform action before initialize.");
        }
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final void m2790(String str, InterfaceC0511 interfaceC0511) {
        m2789();
        C5316 c5316 = this.f3111.f20095;
        C5236.m11644(c5316);
        c5316.m11961(str, interfaceC0511);
    }
}
