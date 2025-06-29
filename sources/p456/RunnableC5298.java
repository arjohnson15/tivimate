package p456;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import ʿﾞ.ﹳﹳ;

/* renamed from: ﾞⁱ.יˋ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC5298 implements Runnable {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public /* synthetic */ C5244 f20554;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final /* synthetic */ int f20555;

    public /* synthetic */ RunnableC5298(int i) {
        this.f20555 = i;
    }

    public RunnableC5298(C5244 c5244) {
        this.f20555 = 2;
        this.f20554 = c5244;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f20555) {
            case 0:
                this.f20554.m11721();
                break;
            case 1:
                C5244 c5244 = this.f20554;
                c5244.m11846();
                if (c5244.ᐧᴵ().f20484.m12010()) {
                    c5244.ˏᵢ().f20567.m4533("Deferred Deep Link already retrieved. Not fetching again.");
                    break;
                } else {
                    long jM11317 = c5244.ᐧᴵ().f20467.m11317();
                    c5244.ᐧᴵ().f20467.m11314(1 + jM11317);
                    if (jM11317 >= 5) {
                        c5244.ˏᵢ().f20568.m4533("Permanently failed to retrieve Deferred Deep Link. Reached maximum retries.");
                        c5244.ᐧᴵ().f20484.m12011(true);
                        break;
                    } else {
                        if (c5244.f20160 == null) {
                            c5244.f20160 = new C5312(c5244, (C5236) ((ﹳﹳ) c5244).ᐧⁱ, 2);
                        }
                        c5244.f20160.m11843(0L);
                        break;
                    }
                }
            case 2:
                C5325 c5325 = this.f20554.f20161;
                C5236 c5236 = c5325.f20649;
                C5247 c5247 = c5236.f20115;
                C5236.m11647(c5247);
                c5247.m11740();
                if (c5325.m12000()) {
                    boolean zM12002 = c5325.m12002();
                    C5244 c52442 = c5236.f20106;
                    C5280 c5280 = c5236.f20102;
                    if (zM12002) {
                        C5236.m11644(c5280);
                        c5280.f20477.m1604(null);
                        Bundle bundle = new Bundle();
                        bundle.putString("source", "(not set)");
                        bundle.putString("medium", "(not set)");
                        bundle.putString("_cis", "intent");
                        bundle.putLong("_cc", 1L);
                        C5236.m11646(c52442);
                        c52442.m11705("auto", "_cmpx", bundle);
                    } else {
                        C5236.m11644(c5280);
                        String strM1603 = c5280.f20477.m1603();
                        if (TextUtils.isEmpty(strM1603)) {
                            C5301 c5301 = c5236.f20110;
                            C5236.m11647(c5301);
                            c5301.f20572.m4533("Cache still valid but referrer not found");
                        } else {
                            C5236.m11644(c5280);
                            long jM113172 = ((c5280.f20464.m11317() / 3600000) - 1) * 3600000;
                            Uri uri = Uri.parse(strM1603);
                            Bundle bundle2 = new Bundle();
                            Pair pair = new Pair(uri.getPath(), bundle2);
                            for (String str : uri.getQueryParameterNames()) {
                                bundle2.putString(str, uri.getQueryParameter(str));
                            }
                            ((Bundle) pair.second).putLong("_cc", jM113172);
                            Object obj = pair.first;
                            String str2 = obj == null ? "app" : (String) obj;
                            C5236.m11646(c52442);
                            c52442.m11705(str2, "_cmp", (Bundle) pair.second);
                        }
                        C5236.m11644(c5280);
                        c5280.f20477.m1604(null);
                    }
                    C5236.m11644(c5280);
                    c5280.f20464.m11314(0L);
                    break;
                }
                break;
            default:
                this.f20554.m11721();
                break;
        }
    }
}
