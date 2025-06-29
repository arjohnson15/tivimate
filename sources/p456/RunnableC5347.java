package p456;

import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.C0298;
import com.google.android.gms.internal.measurement.InterfaceC0511;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicReference;
import p447.AbstractC5179;
import ʿﾞ.ﹳﹳ;

/* renamed from: ﾞⁱ.ﹶʾ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class RunnableC5347 implements Runnable {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final /* synthetic */ boolean f20738;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final /* synthetic */ Object f20739;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final /* synthetic */ String f20740;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final /* synthetic */ String f20741;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final /* synthetic */ int f20742;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final /* synthetic */ Object f20743;

    public /* synthetic */ RunnableC5347(Object obj, Object obj2, String str, String str2, boolean z, int i) {
        this.f20742 = i;
        this.f20739 = obj2;
        this.f20740 = str;
        this.f20741 = str2;
        this.f20738 = z;
        this.f20743 = obj;
    }

    public RunnableC5347(C5337 c5337, boolean z, Uri uri, String str, String str2) {
        this.f20742 = 1;
        this.f20738 = z;
        this.f20739 = uri;
        this.f20740 = str;
        this.f20741 = str2;
        this.f20743 = c5337;
    }

    @Override // java.lang.Runnable
    public final void run() throws IllegalAccessException, PackageManager.NameNotFoundException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
        Bundle bundleM11972;
        String str;
        switch (this.f20742) {
            case 0:
                C5272 c5272M11549 = AbstractC5179.m11549((C5236) ((ﹳﹳ) ((C5244) this.f20743)).ᐧⁱ);
                c5272M11549.m11785(new RunnableC5260(c5272M11549, (AtomicReference) this.f20739, this.f20740, this.f20741, c5272M11549.m11777(false), this.f20738));
                break;
            case 1:
                Uri uri = (Uri) this.f20739;
                String str2 = this.f20741;
                C5244 c5244 = ((C5337) this.f20743).f20698;
                c5244.m11846();
                try {
                    C5316 c5316 = c5244.ﹶﾞ();
                    C5236 c5236 = (C5236) ((ﹳﹳ) c5244).ᐧⁱ;
                    C0298.m1629();
                    C5245 c5245 = c5236.f20123;
                    C5250 c5250 = AbstractC5248.f20248;
                    boolean zM11727 = c5245.m11727(null, c5250);
                    if (TextUtils.isEmpty(str2)) {
                        bundleM11972 = null;
                    } else {
                        if (!str2.contains("gclid") && (!zM11727 || !str2.contains("gbraid"))) {
                            if (!str2.contains("utm_campaign") && !str2.contains("utm_source") && !str2.contains("utm_medium") && !str2.contains("utm_id") && !str2.contains("dclid") && !str2.contains("srsltid") && !str2.contains("sfmc_id")) {
                                c5316.ˏᵢ().f20567.m4533("Activity created with data 'referrer' without required params");
                                bundleM11972 = null;
                            }
                        }
                        bundleM11972 = c5316.m11972(Uri.parse("https://google.com/search?".concat(str2)), zM11727);
                        if (bundleM11972 != null) {
                            bundleM11972.putString("_cis", "referrer");
                        }
                    }
                    String str3 = this.f20740;
                    C5245 c52452 = c5236.f20123;
                    boolean z = this.f20738;
                    C5325 c5325 = c5244.f20161;
                    if (z) {
                        C5316 c53162 = c5244.ﹶﾞ();
                        C0298.m1629();
                        str = "Activity created with data 'referrer' without required params";
                        Bundle bundleM119722 = c53162.m11972(uri, c52452.m11727(null, c5250));
                        if (bundleM119722 != null) {
                            bundleM119722.putString("_cis", "intent");
                            if (!bundleM119722.containsKey("gclid") && bundleM11972 != null && bundleM11972.containsKey("gclid")) {
                                bundleM119722.putString("_cer", "gclid=" + bundleM11972.getString("gclid"));
                            }
                            c5244.m11705(str3, "_cmp", bundleM119722);
                            c5325.m12001(str3, bundleM119722);
                        }
                    } else {
                        str = "Activity created with data 'referrer' without required params";
                    }
                    if (!TextUtils.isEmpty(str2)) {
                        c5244.ˏᵢ().f20567.m4531(str2, "Activity created with referrer");
                        if (!c52452.m11727(null, AbstractC5248.f20300)) {
                            if (!str2.contains("gclid") || (!str2.contains("utm_campaign") && !str2.contains("utm_source") && !str2.contains("utm_medium") && !str2.contains("utm_term") && !str2.contains("utm_content"))) {
                                c5244.ˏᵢ().f20567.m4533(str);
                                break;
                            } else if (!TextUtils.isEmpty(str2)) {
                                c5244.m11706("auto", "_ldl", str2, true);
                                break;
                            }
                        } else {
                            if (bundleM11972 != null) {
                                c5244.m11705(str3, "_cmp", bundleM11972);
                                c5325.m12001(str3, bundleM11972);
                            } else {
                                c5244.ˏᵢ().f20567.m4531(str2, "Referrer does not contain valid parameters");
                            }
                            c5244.m11706("auto", "_ldl", null, true);
                            break;
                        }
                    } else {
                        break;
                    }
                } catch (RuntimeException e) {
                    c5244.ˏᵢ().f20571.m4531(e, "Throwable caught in handleReferrerForOnActivityCreated");
                    return;
                }
                break;
            default:
                C5272 c5272M115492 = AbstractC5179.m11549(((AppMeasurementDynamiteService) this.f20743).f3111);
                c5272M115492.m11785(new RunnableC5260(c5272M115492, this.f20740, this.f20741, c5272M115492.m11777(false), this.f20738, (InterfaceC0511) this.f20739));
                break;
        }
    }
}
