package p456;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import p009.C0995;
import p436.C5068;

/* renamed from: ﾞⁱ.ᵔ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C5325 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final C5236 f20649;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final /* synthetic */ int f20650;

    public /* synthetic */ C5325(C5236 c5236, int i) {
        this.f20650 = i;
        this.f20649 = c5236;
    }

    public C5325(C5273 c5273) {
        this.f20650 = 0;
        this.f20649 = c5273.f20418;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public boolean m11999() {
        switch (this.f20650) {
            case 0:
                C5236 c5236 = this.f20649;
                boolean z = false;
                try {
                    C0995 c0995M11225 = C5068.m11225(c5236.f20114);
                    if (c0995M11225 == null) {
                        C5301 c5301 = c5236.f20110;
                        C5236.m11647(c5301);
                        c5301.f20566.m4533("Failed to get PackageManager for Install Referrer Play Store compatibility check");
                        c5236 = c5236;
                    } else {
                        int i = c0995M11225.m3955(128, "com.android.vending").versionCode;
                        c5236 = i;
                        if (i >= 80837300) {
                            z = true;
                            c5236 = i;
                        }
                    }
                } catch (Exception e) {
                    C5301 c53012 = c5236.f20110;
                    C5236.m11647(c53012);
                    c53012.f20566.m4531(e, "Failed to retrieve Play Store version for Install Referrer");
                }
                return z;
            default:
                C5236 c52362 = this.f20649;
                if (TextUtils.isEmpty(c52362.f20097)) {
                    C5301 c53013 = c52362.f20110;
                    C5236.m11647(c53013);
                    if (c53013.m11920(3)) {
                        return true;
                    }
                }
                return false;
        }
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public boolean m12000() {
        C5280 c5280 = this.f20649.f20102;
        C5236.m11644(c5280);
        return c5280.f20464.m11317() > 0;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public void m12001(String str, Bundle bundle) {
        String string;
        C5236 c5236 = this.f20649;
        C5247 c5247 = c5236.f20115;
        C5236.m11647(c5247);
        c5247.m11740();
        if (c5236.m11662()) {
            return;
        }
        if (bundle.isEmpty()) {
            string = null;
        } else {
            if (str.isEmpty()) {
                str = "auto";
            }
            Uri.Builder builder = new Uri.Builder();
            builder.path(str);
            for (String str2 : bundle.keySet()) {
                builder.appendQueryParameter(str2, bundle.getString(str2));
            }
            string = builder.build().toString();
        }
        if (TextUtils.isEmpty(string)) {
            return;
        }
        C5280 c5280 = c5236.f20102;
        C5236.m11644(c5280);
        c5280.f20477.m1604(string);
        C5236.m11644(c5280);
        c5236.f20107.getClass();
        c5280.f20464.m11314(System.currentTimeMillis());
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public boolean m12002() {
        if (!m12000()) {
            return false;
        }
        C5236 c5236 = this.f20649;
        c5236.f20107.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        C5280 c5280 = c5236.f20102;
        C5236.m11644(c5280);
        return jCurrentTimeMillis - c5280.f20464.m11317() > c5236.f20123.m11734(null, AbstractC5248.f20218);
    }
}
