package p061;

import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.C0298;
import java.io.IOException;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import p029.RunnableC1181;
import p395.RunnableC4533;
import p396.C4554;
import p456.AbstractC5248;
import p456.C5236;
import p456.C5245;
import p456.C5250;
import p456.C5280;
import p456.C5301;
import p456.C5316;
import p456.InterfaceC5252;
import ʿﾞ.ﹳﹳ;
import ᵢ.ʿʼ;

/* renamed from: ʾـ.ﹳﹳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class RunnableC1432 implements Runnable {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public /* synthetic */ Object f5862;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public /* synthetic */ Object f5863;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public /* synthetic */ Object f5864;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public /* synthetic */ int f5865;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final /* synthetic */ int f5866;

    public /* synthetic */ RunnableC1432(int i) {
        this.f5866 = i;
    }

    public /* synthetic */ RunnableC1432(Object obj, List list, List list2, int i, int i2) {
        this.f5866 = i2;
        this.f5863 = obj;
        this.f5862 = list;
        this.f5864 = list2;
        this.f5865 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5866) {
            case 0:
                ((C1365) this.f5863).f5541.execute(new RunnableC4533(7, this, AbstractC1361.m4729(new C1390(this, 0)), false));
                break;
            case 1:
                ((C1435) this.f5863).f5876.execute(new RunnableC4533(8, this, AbstractC1361.m4729(new C1390(this, 1)), false));
                break;
            case 2:
                C5236 c5236 = (C5236) ((C4554) ((RunnableC1181) this.f5862).f4883).f17462;
                C5245 c5245 = c5236.f20123;
                int i = this.f5865;
                IOException iOException = (IOException) this.f5864;
                C5301 c5301 = c5236.f20110;
                if ((i != 200 && i != 204 && i != 304) || iOException != null) {
                    C5236.m11647(c5301);
                    c5301.f20568.m4529(Integer.valueOf(i), iOException, "Network Request for Deferred Deep Link failed. response, exception");
                    break;
                } else {
                    C5280 c5280 = c5236.f20102;
                    C5236.m11644(c5280);
                    c5280.f20484.m12011(true);
                    byte[] bArr = (byte[]) this.f5863;
                    if (bArr == null || bArr.length == 0) {
                        C5236.m11647(c5301);
                        c5301.f20567.m4533("Deferred Deep Link response empty.");
                        break;
                    } else {
                        try {
                            JSONObject jSONObject = new JSONObject(new String(bArr));
                            String strOptString = jSONObject.optString("deeplink", "");
                            if (!TextUtils.isEmpty(strOptString)) {
                                String strOptString2 = jSONObject.optString("gclid", "");
                                String strOptString3 = jSONObject.optString("gbraid", "");
                                String strOptString4 = jSONObject.optString("gad_source", "");
                                double dOptDouble = jSONObject.optDouble("timestamp", 0.0d);
                                Bundle bundle = new Bundle();
                                C0298.m1629();
                                C5250 c5250 = AbstractC5248.f20248;
                                boolean zM11727 = c5245.m11727(null, c5250);
                                C5316 c5316 = c5236.f20095;
                                if (!zM11727) {
                                    C5236.m11644(c5316);
                                    if (!c5316.m11989(strOptString)) {
                                        C5236.m11647(c5301);
                                        c5301.f20568.m4529(strOptString2, strOptString, "Deferred Deep Link validation failed. gclid, deep link");
                                        break;
                                    }
                                } else {
                                    C5236.m11644(c5316);
                                    if (!c5316.m11989(strOptString)) {
                                        C5236.m11647(c5301);
                                        c5301.f20568.m4530("Deferred Deep Link validation failed. gclid, gbraid, deep link", strOptString2, strOptString3, strOptString);
                                        break;
                                    } else {
                                        if (!TextUtils.isEmpty(strOptString3)) {
                                            bundle.putString("gbraid", strOptString3);
                                        }
                                        if (!TextUtils.isEmpty(strOptString4)) {
                                            bundle.putString("gad_source", strOptString4);
                                        }
                                    }
                                }
                                C0298.m1629();
                                c5245.m11727(null, c5250);
                                bundle.putString("gclid", strOptString2);
                                bundle.putString("_cis", "ddp");
                                c5236.f20106.m11705("auto", "_cmp", bundle);
                                C5236.m11644(c5316);
                                if (!TextUtils.isEmpty(strOptString) && c5316.m11951(strOptString, dOptDouble)) {
                                    ((C5236) ((ﹳﹳ) c5316).ᐧⁱ).f20114.sendBroadcast(new Intent("android.google.analytics.action.DEEPLINK_ACTION"));
                                    break;
                                }
                            } else {
                                C5236.m11647(c5301);
                                c5301.f20567.m4533("Deferred Deep Link is empty.");
                                break;
                            }
                        } catch (JSONException e) {
                            C5236.m11647(c5301);
                            c5301.f20571.m4531(e, "Failed to parse the Deferred Deep Link response. exception");
                            return;
                        }
                    }
                }
                break;
            default:
                ʿʼ r0 = (ʿʼ) this.f5862;
                InterfaceC5252 interfaceC5252 = (InterfaceC5252) ((Service) r0.ˆʿ);
                int i2 = this.f5865;
                if (interfaceC5252.mo2784(i2)) {
                    ((C5301) this.f5864).f20566.m4531(Integer.valueOf(i2), "Local AppMeasurementService processed last upload request. StartId");
                    r0.ﾞˊ().f20566.m4533("Completed wakeful intent.");
                    interfaceC5252.mo2786((Intent) this.f5863);
                    break;
                }
                break;
        }
    }
}
