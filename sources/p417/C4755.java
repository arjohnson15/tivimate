package p417;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import java.util.Arrays;

/* renamed from: ﹳᴵ.ˎˑ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4755 {

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static final Uri f18242 = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final String f18243;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final boolean f18244;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final String f18245;

    public C4755(String str, boolean z) {
        AbstractC4753.m10688(str);
        this.f18245 = str;
        AbstractC4753.m10688("com.google.android.gms");
        this.f18243 = "com.google.android.gms";
        this.f18244 = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4755)) {
            return false;
        }
        C4755 c4755 = (C4755) obj;
        return AbstractC4753.m10682(this.f18245, c4755.f18245) && AbstractC4753.m10682(this.f18243, c4755.f18243) && AbstractC4753.m10682(null, null) && this.f18244 == c4755.f18244;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f18245, this.f18243, null, 4225, Boolean.valueOf(this.f18244)});
    }

    public final String toString() {
        String str = this.f18245;
        if (str != null) {
            return str;
        }
        AbstractC4753.m10683(null);
        throw null;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final Intent m10690(Context context) {
        Bundle bundleCall;
        String str = this.f18245;
        if (str == null) {
            return new Intent().setComponent(null);
        }
        if (this.f18244) {
            Bundle bundle = new Bundle();
            bundle.putString("serviceActionBundleKey", str);
            try {
                bundleCall = context.getContentResolver().call(f18242, "serviceIntentCall", (String) null, bundle);
            } catch (IllegalArgumentException e) {
                "Dynamic intent resolution failed: ".concat(e.toString());
                bundleCall = null;
            }
            intent = bundleCall != null ? (Intent) bundleCall.getParcelable("serviceResponseIntentKey") : null;
            if (intent == null) {
                "Dynamic lookup for intent failed for action: ".concat(String.valueOf(str));
            }
        }
        return intent == null ? new Intent(str).setPackage(this.f18243) : intent;
    }
}
