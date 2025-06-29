package p210;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.C0559;
import java.util.Arrays;
import p238.AbstractC3096;
import p331.C3767;
import p417.AbstractC4753;

/* renamed from: ˏʼ.ˏᵢ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2801 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final String f10918;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final String f10919;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final String f10920;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final String f10921;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final String f10922;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final String f10923;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final String f10924;

    public C2801(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        int i = AbstractC3096.f11952;
        AbstractC4753.m10681("ApplicationId must be set.", true ^ (str == null || str.trim().isEmpty()));
        this.f10918 = str;
        this.f10921 = str2;
        this.f10920 = str3;
        this.f10924 = str4;
        this.f10919 = str5;
        this.f10922 = str6;
        this.f10923 = str7;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static C2801 m7078(Context context) {
        C3767 c3767 = new C3767(context, 18);
        String strM8806 = c3767.m8806("google_app_id");
        if (TextUtils.isEmpty(strM8806)) {
            return null;
        }
        return new C2801(strM8806, c3767.m8806("google_api_key"), c3767.m8806("firebase_database_url"), c3767.m8806("ga_trackingId"), c3767.m8806("gcm_defaultSenderId"), c3767.m8806("google_storage_bucket"), c3767.m8806("project_id"));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2801)) {
            return false;
        }
        C2801 c2801 = (C2801) obj;
        return AbstractC4753.m10682(this.f10918, c2801.f10918) && AbstractC4753.m10682(this.f10921, c2801.f10921) && AbstractC4753.m10682(this.f10920, c2801.f10920) && AbstractC4753.m10682(this.f10924, c2801.f10924) && AbstractC4753.m10682(this.f10919, c2801.f10919) && AbstractC4753.m10682(this.f10922, c2801.f10922) && AbstractC4753.m10682(this.f10923, c2801.f10923);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f10918, this.f10921, this.f10920, this.f10924, this.f10919, this.f10922, this.f10923});
    }

    public final String toString() {
        C0559 c0559 = new C0559(this);
        c0559.m2487(this.f10918, "applicationId");
        c0559.m2487(this.f10921, "apiKey");
        c0559.m2487(this.f10920, "databaseUrl");
        c0559.m2487(this.f10919, "gcmSenderId");
        c0559.m2487(this.f10922, "storageBucket");
        c0559.m2487(this.f10923, "projectId");
        return c0559.toString();
    }
}
