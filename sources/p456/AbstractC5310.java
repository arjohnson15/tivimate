package p456;

import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.C0327;
import java.io.File;
import java.util.Collections;
import java.util.HashSet;
import org.lsposed.hiddenapibypass.library.R;
import p041.C1272;
import p293.C3474;
import ˆʽ.ᵎˏ;

/* renamed from: ﾞⁱ.ᐧʼ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC5310 {

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public static C3474 f20599;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final String[] f20602 = {"ga_conversion", "engagement_time_msec", "exposure_time", "ad_event_id", "ad_unit_id", "ga_error", "ga_error_value", "ga_error_length", "ga_event_origin", "ga_screen", "ga_screen_class", "ga_screen_id", "ga_previous_screen", "ga_previous_class", "ga_previous_id", "manual_tracking", "message_device_time", "message_id", "message_name", "message_time", "message_tracking_id", "message_type", "previous_app_version", "previous_os_version", "topic", "update_with_analytics", "previous_first_open_count", "system_app", "system_app_update", "previous_install_count", "ga_event_id", "ga_extra_params_ct", "ga_group_name", "ga_list_length", "ga_index", "ga_event_name", "campaign_info_source", "cached_campaign", "deferred_analytics_collection", "ga_session_number", "ga_session_id", "campaign_extra_referrer", "app_in_background", "firebase_feature_rollouts", "firebase_conversion", "firebase_error", "firebase_error_value", "firebase_error_length", "firebase_event_origin", "firebase_screen", "firebase_screen_class", "firebase_screen_id", "firebase_previous_screen", "firebase_previous_class", "firebase_previous_id", "session_number", "session_id"};

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static final String[] f20596 = {"_c", "_et", "_xt", "_aeid", "_ai", "_err", "_ev", "_el", "_o", "_sn", "_sc", "_si", "_pn", "_pc", "_pi", "_mst", "_ndt", "_nmid", "_nmn", "_nmt", "_nmtid", "_nmc", "_pv", "_po", "_nt", "_uwa", "_pfo", "_sys", "_sysu", "_pin", "_eid", "_epc", "_gn", "_ll", "_i", "_en", "_cis", "_cc", "_dac", "_sno", "_sid", "_cer", "_aib", "_ffr", "_c", "_err", "_ev", "_el", "_o", "_sn", "_sc", "_si", "_pn", "_pc", "_pi", "_sno", "_sid"};

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static final String[] f20601 = {"items"};

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static final String[] f20605 = {"affiliation", "coupon", "creative_name", "creative_slot", "currency", "discount", "index", "item_id", "item_brand", "item_category", "item_category2", "item_category3", "item_category4", "item_category5", "item_list_name", "item_list_id", "item_name", "item_variant", "location_id", "payment_type", "price", "promotion_id", "promotion_name", "quantity", "shipping", "shipping_tier", "tax", "transaction_id", "value", "item_list", "checkout_step", "checkout_option", "item_location_id"};

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public static final String[] f20597 = {"ad_activeview", "ad_click", "ad_exposure", "ad_query", "ad_reward", "adunit_exposure", "app_clear_data", "app_exception", "app_remove", "app_store_refund", "app_store_subscription_cancel", "app_store_subscription_convert", "app_store_subscription_renew", "app_upgrade", "app_update", "ga_campaign", "error", "first_open", "first_visit", "in_app_purchase", "notification_dismiss", "notification_foreground", "notification_open", "notification_receive", "os_update", "session_start", "session_start_with_rollout", "user_engagement", "ad_impression", "screen_view", "ga_extra_parameter", "app_background", "firebase_campaign"};

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public static final String[] f20603 = {"ad_impression"};

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public static final String[] f20604 = {"_aa", "_ac", "_xa", "_aq", "_ar", "_xu", "_cd", "_ae", "_ui", "app_store_refund", "app_store_subscription_cancel", "app_store_subscription_convert", "app_store_subscription_renew", "_ug", "_au", "_cmp", "_err", "_f", "_v", "_iap", "_nd", "_nf", "_no", "_nr", "_ou", "_s", "_ssr", "_e", "_ai", "_vs", "_ep", "_ab", "_cmp"};

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public static final String[] f20600 = {"purchase", "refund", "add_payment_info", "add_shipping_info", "add_to_cart", "add_to_wishlist", "begin_checkout", "remove_from_cart", "select_item", "select_promotion", "view_cart", "view_item", "view_item_list", "view_promotion", "ecommerce_purchase", "purchase_refund", "set_checkout_option", "checkout_progress", "select_content", "view_search_results"};

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public static final String[] f20606 = {"firebase_last_notification", "first_open_time", "first_visit_time", "last_deep_link_referrer", "user_id", "last_advertising_id_reset", "first_open_after_install", "lifetime_user_engagement", "session_user_engagement", "non_personalized_ads", "ga_session_number", "ga_session_id", "last_gclid", "session_number", "session_id"};

    /* renamed from: ˉי, reason: contains not printable characters */
    public static final String[] f20598 = {"_ln", "_fot", "_fvt", "_ldl", "_id", "_lair", "_fi", "_lte", "_se", "_npa", "_sno", "_sid", "_lgclid", "_sno", "_sid"};

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static String m11921(Context context) {
        try {
            return context.getResources().getResourcePackageName(R.string._2_res_0x7f130077);
        } catch (Resources.NotFoundException unused) {
            return context.getPackageName();
        }
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public static void m11922(Bundle bundle, Object obj) {
        if (obj instanceof Double) {
            bundle.putDouble("value", ((Double) obj).doubleValue());
        } else if (obj instanceof Long) {
            bundle.putLong("value", ((Long) obj).longValue());
        } else {
            bundle.putString("value", obj.toString());
        }
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static String m11923(String str, String[] strArr, String[] strArr2) {
        int iMin = Math.min(strArr.length, strArr2.length);
        for (int i = 0; i < iMin; i++) {
            String str2 = strArr[i];
            if ((str == null && str2 == null) ? true : str == null ? false : str.equals(str2)) {
                return strArr2[i];
            }
        }
        return null;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static Object m11924(Bundle bundle, String str, Class cls, Object obj) {
        Object obj2 = bundle.get(str);
        if (obj2 == null) {
            return obj;
        }
        if (cls.isAssignableFrom(obj2.getClass())) {
            return obj2;
        }
        String canonicalName = cls.getCanonicalName();
        String canonicalName2 = obj2.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder("Invalid conditional user property field type. '");
        sb.append(str);
        sb.append("' expected [");
        sb.append(canonicalName);
        sb.append("] but was [");
        throw new IllegalStateException(ᵎˏ.ˎٴ(sb, canonicalName2, "]"));
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public static void m11925(C5301 c5301, SQLiteDatabase sQLiteDatabase) {
        String path = sQLiteDatabase.getPath();
        int i = C0327.f2446;
        File file = new File(path);
        boolean readable = file.setReadable(false, false);
        C1272 c1272 = c5301.f20568;
        if (!readable) {
            c1272.m4533("Failed to turn off database read permission");
        }
        if (!file.setWritable(false, false)) {
            c1272.m4533("Failed to turn off database write permission");
        }
        if (!file.setReadable(true, true)) {
            c1272.m4533("Failed to turn on database read permission for owner");
        }
        if (file.setWritable(true, true)) {
            return;
        }
        c1272.m4533("Failed to turn on database write permission for owner");
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public static void m11926(C5301 c5301, SQLiteDatabase sQLiteDatabase, String str, String str2, String str3, String[] strArr) throws SQLException {
        boolean zMoveToFirst;
        C1272 c1272 = c5301.f20568;
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = sQLiteDatabase.query("SQLITE_MASTER", new String[]{"name"}, "name=?", new String[]{str}, null, null, null);
                zMoveToFirst = cursorQuery.moveToFirst();
                cursorQuery.close();
            } catch (SQLiteException e) {
                c1272.m4529(str, e, "Error querying for table");
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                zMoveToFirst = false;
            }
            if (!zMoveToFirst) {
                sQLiteDatabase.execSQL(str2);
            }
            try {
                HashSet hashSetM11927 = m11927(sQLiteDatabase, str);
                for (String str4 : str3.split(",")) {
                    if (!hashSetM11927.remove(str4)) {
                        throw new SQLiteException("Table " + str + " is missing required column: " + str4);
                    }
                }
                if (strArr != null) {
                    for (int i = 0; i < strArr.length; i += 2) {
                        if (!hashSetM11927.remove(strArr[i])) {
                            sQLiteDatabase.execSQL(strArr[i + 1]);
                        }
                    }
                }
                if (hashSetM11927.isEmpty()) {
                    return;
                }
                c1272.m4529(str, TextUtils.join(", ", hashSetM11927), "Table has extra columns. table, columns");
            } catch (SQLiteException e2) {
                c5301.f20571.m4531(str, "Failed to verify columns on table that was just created");
                throw e2;
            }
        } catch (Throwable th) {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            throw th;
        }
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static HashSet m11927(SQLiteDatabase sQLiteDatabase, String str) {
        HashSet hashSet = new HashSet();
        Cursor cursorRawQuery = sQLiteDatabase.rawQuery("SELECT * FROM " + str + " LIMIT 0", null);
        try {
            Collections.addAll(hashSet, cursorRawQuery.getColumnNames());
            return hashSet;
        } finally {
            cursorRawQuery.close();
        }
    }
}
