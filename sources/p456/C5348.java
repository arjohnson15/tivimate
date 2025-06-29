package p456;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.v4.media.session.AbstractC0002;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.internal.measurement.C0302;
import com.google.android.gms.internal.measurement.C0304;
import com.google.android.gms.internal.measurement.C0416;
import com.google.android.gms.internal.measurement.C0438;
import com.google.android.gms.internal.measurement.C0472;
import com.google.android.gms.internal.measurement.C0492;
import com.google.android.gms.internal.measurement.C0530;
import com.google.android.gms.internal.measurement.C0569;
import com.google.android.gms.internal.measurement.C0579;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p041.C1278;
import p061.C1403;
import p080.AbstractC1702;
import p238.C3097;
import p417.AbstractC4753;
import p424.C4894;
import ʿﾞ.ﹳﹳ;
import ˆʽ.ᵎˏ;
import ᵎﹳ.ᐧʻ;

/* renamed from: ﾞⁱ.ﹶˆ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C5348 extends AbstractC5295 {

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final C1403 f20754;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final C5264 f20755;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public static final String[] f20750 = {"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;", "current_session_count", "ALTER TABLE events ADD COLUMN current_session_count INTEGER;"};

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public static final String[] f20752 = {"origin", "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public static final String[] f20745 = {"app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", "day", "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;", "linked_admob_app_id", "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;", "dynamite_version", "ALTER TABLE apps ADD COLUMN dynamite_version INTEGER;", "safelisted_events", "ALTER TABLE apps ADD COLUMN safelisted_events TEXT;", "ga_app_id", "ALTER TABLE apps ADD COLUMN ga_app_id TEXT;", "config_last_modified_time", "ALTER TABLE apps ADD COLUMN config_last_modified_time TEXT;", "e_tag", "ALTER TABLE apps ADD COLUMN e_tag TEXT;", "session_stitching_token", "ALTER TABLE apps ADD COLUMN session_stitching_token TEXT;", "sgtm_upload_enabled", "ALTER TABLE apps ADD COLUMN sgtm_upload_enabled INTEGER;", "target_os_version", "ALTER TABLE apps ADD COLUMN target_os_version INTEGER;", "session_stitching_token_hash", "ALTER TABLE apps ADD COLUMN session_stitching_token_hash INTEGER;", "ad_services_version", "ALTER TABLE apps ADD COLUMN ad_services_version INTEGER;", "unmatched_first_open_without_ad_id", "ALTER TABLE apps ADD COLUMN unmatched_first_open_without_ad_id INTEGER;", "npa_metadata_value", "ALTER TABLE apps ADD COLUMN npa_metadata_value INTEGER;", "attribution_eligibility_status", "ALTER TABLE apps ADD COLUMN attribution_eligibility_status INTEGER;", "sgtm_preview_key", "ALTER TABLE apps ADD COLUMN sgtm_preview_key TEXT;", "dma_consent_state", "ALTER TABLE apps ADD COLUMN dma_consent_state INTEGER;", "daily_realtime_dcu_count", "ALTER TABLE apps ADD COLUMN daily_realtime_dcu_count INTEGER;", "bundle_delivery_index", "ALTER TABLE apps ADD COLUMN bundle_delivery_index INTEGER;", "serialized_npa_metadata", "ALTER TABLE apps ADD COLUMN serialized_npa_metadata TEXT;", "unmatched_pfo", "ALTER TABLE apps ADD COLUMN unmatched_pfo INTEGER;", "unmatched_uwa", "ALTER TABLE apps ADD COLUMN unmatched_uwa INTEGER;", "ad_campaign_info", "ALTER TABLE apps ADD COLUMN ad_campaign_info BLOB;"};

    /* renamed from: ـˆ, reason: contains not printable characters */
    public static final String[] f20748 = {"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;"};

    /* renamed from: ᴵʼ, reason: contains not printable characters */
    public static final String[] f20749 = {"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"};

    /* renamed from: ﾞᐧ, reason: contains not printable characters */
    public static final String[] f20753 = {"session_scoped", "ALTER TABLE event_filters ADD COLUMN session_scoped BOOLEAN;"};

    /* renamed from: ʾʼ, reason: contains not printable characters */
    public static final String[] f20744 = {"session_scoped", "ALTER TABLE property_filters ADD COLUMN session_scoped BOOLEAN;"};

    /* renamed from: ˑﾞ, reason: contains not printable characters */
    public static final String[] f20747 = {"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};

    /* renamed from: ˑⁱ, reason: contains not printable characters */
    public static final String[] f20746 = {"consent_source", "ALTER TABLE consent_settings ADD COLUMN consent_source INTEGER;", "dma_consent_settings", "ALTER TABLE consent_settings ADD COLUMN dma_consent_settings TEXT;", "storage_consent_at_bundling", "ALTER TABLE consent_settings ADD COLUMN storage_consent_at_bundling TEXT;"};

    /* renamed from: ᵢٴ, reason: contains not printable characters */
    public static final String[] f20751 = {"idempotent", "CREATE INDEX IF NOT EXISTS trigger_uris_index ON trigger_uris (app_id);"};

    public C5348(C5273 c5273) {
        super(c5273);
        this.f20754 = new C1403(((C5236) ((ﹳﹳ) this).ᐧⁱ).f20107);
        this.f20755 = new C5264(this, ((C5236) ((ﹳﹳ) this).ᐧⁱ).f20114);
    }

    /* renamed from: ˎי, reason: contains not printable characters */
    public static void m12035(ContentValues contentValues, Object obj) {
        AbstractC4753.m10688("value");
        AbstractC4753.m10683(obj);
        if (obj instanceof String) {
            contentValues.put("value", (String) obj);
        } else if (obj instanceof Long) {
            contentValues.put("value", (Long) obj);
        } else {
            if (!(obj instanceof Double)) {
                throw new IllegalArgumentException("Invalid value type");
            }
            contentValues.put("value", (Double) obj);
        }
    }

    /* renamed from: ʻˉ, reason: contains not printable characters */
    public final void m12036(C0302 c0302, boolean z) {
        ʼᵎ();
        m11909();
        AbstractC4753.m10688(c0302.m1740());
        if (!c0302.m1768()) {
            throw new IllegalStateException();
        }
        m12058();
        ((C5236) ((ﹳﹳ) this).ᐧⁱ).f20107.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (c0302.m1777() < jCurrentTimeMillis - C5245.m11722() || c0302.m1777() > C5245.m11722() + jCurrentTimeMillis) {
            C5301 c5301 = ˏᵢ();
            c5301.f20568.m4530("Storing bundle outside of the max uploading time span. appId, now, timestamp", C5301.m11911(c0302.m1740()), Long.valueOf(jCurrentTimeMillis), Long.valueOf(c0302.m1777()));
        }
        try {
            byte[] bArrM11902 = m12021().m11902(c0302.m2512());
            C5301 c53012 = ˏᵢ();
            c53012.f20566.m4531(Integer.valueOf(bArrM11902.length), "Saving bundle, size");
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", c0302.m1740());
            contentValues.put("bundle_end_timestamp", Long.valueOf(c0302.m1777()));
            contentValues.put("data", bArrM11902);
            contentValues.put("has_realtime", Integer.valueOf(z ? 1 : 0));
            if (c0302.m1710()) {
                contentValues.put("retry_count", Integer.valueOf(c0302.m1742()));
            }
            try {
                if (m12074().insert("queue", null, contentValues) == -1) {
                    ˏᵢ().f20571.m4531(C5301.m11911(c0302.m1740()), "Failed to insert bundle (got -1). appId");
                }
            } catch (SQLiteException e) {
                C5301 c53013 = ˏᵢ();
                c53013.f20571.m4529(C5301.m11911(c0302.m1740()), e, "Error storing bundle. appId");
            }
        } catch (IOException e2) {
            C5301 c53014 = ˏᵢ();
            c53014.f20571.m4529(C5301.m11911(c0302.m1740()), e2, "Data loss. Failed to serialize bundle. appId");
        }
    }

    /* renamed from: ʻˏ, reason: contains not printable characters */
    public final boolean m12037(C5234 c5234) {
        ʼᵎ();
        m11909();
        String str = c5234.f20087;
        String str2 = c5234.f20086;
        C5234 c5234M12085 = m12085(str, str2);
        String str3 = c5234.f20084;
        if (c5234M12085 == null) {
            if (C5316.m11948(str2)) {
                if (m12061("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[]{str}) >= Math.max(Math.min(((C5236) ((ﹳﹳ) this).ᐧⁱ).f20123.m11731(str, AbstractC5248.f20249), 100), 25)) {
                    return false;
                }
            } else if (!"_npa".equals(str2) && m12061("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[]{str, str3}) >= 25) {
                return false;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("origin", str3);
        contentValues.put("name", str2);
        contentValues.put("set_timestamp", Long.valueOf(c5234.f20088));
        m12035(contentValues, c5234.f20085);
        try {
            if (m12074().insertWithOnConflict("user_attributes", null, contentValues, 5) != -1) {
                return true;
            }
            ˏᵢ().f20571.m4531(C5301.m11911(str), "Failed to insert/update user property (got -1). appId");
            return true;
        } catch (SQLiteException e) {
            ˏᵢ().f20571.m4529(C5301.m11911(str), e, "Error storing user property. appId");
            return true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a1, code lost:
    
        ˏᵢ().f20571.m4531(1000, "Read more than the max allowed user properties, ignoring excess");
     */
    /* JADX WARN: Removed duplicated region for block: B:48:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0120  */
    /* renamed from: ʻـ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List m12038(java.lang.String r23, java.lang.String r24, java.lang.String r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 292
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p456.C5348.m12038(java.lang.String, java.lang.String, java.lang.String):java.util.List");
    }

    /* renamed from: ʻٴ, reason: contains not printable characters */
    public final void m12039(String str, C5356 c5356) {
        AbstractC4753.m10683(str);
        ʼᵎ();
        m11909();
        m12073(str, m12050(str));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("storage_consent_at_bundling", c5356.m12146());
        m12042(contentValues);
    }

    /* renamed from: ʼʼ, reason: contains not printable characters */
    public final long m12040(String str) {
        AbstractC4753.m10688(str);
        ʼᵎ();
        m11909();
        try {
            return m12074().delete("raw_events", "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)", new String[]{str, String.valueOf(Math.max(0, Math.min(1000000, ((C5236) ((ﹳﹳ) this).ᐧⁱ).f20123.m11731(str, AbstractC5248.f20269))))});
        } catch (SQLiteException e) {
            ˏᵢ().f20571.m4529(C5301.m11911(str), e, "Error deleting over the limit events. appId");
            return 0L;
        }
    }

    /* renamed from: ʼﹶ, reason: contains not printable characters */
    public final C5284 m12041(long j, String str, long j2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        AbstractC4753.m10688(str);
        ʼᵎ();
        m11909();
        String[] strArr = {str};
        C5284 c5284 = new C5284();
        Cursor cursor = null;
        try {
            try {
                SQLiteDatabase sQLiteDatabaseM12074 = m12074();
                Cursor cursorQuery = sQLiteDatabaseM12074.query("apps", new String[]{"day", "daily_events_count", "daily_public_events_count", "daily_conversions_count", "daily_error_events_count", "daily_realtime_events_count", "daily_realtime_dcu_count"}, "app_id=?", new String[]{str}, null, null, null);
                if (!cursorQuery.moveToFirst()) {
                    ˏᵢ().f20568.m4531(C5301.m11911(str), "Not updating daily counts, app is not known. appId");
                    cursorQuery.close();
                    return c5284;
                }
                if (cursorQuery.getLong(0) == j) {
                    c5284.f20493 = cursorQuery.getLong(1);
                    c5284.f20496 = cursorQuery.getLong(2);
                    c5284.f20495 = cursorQuery.getLong(3);
                    c5284.f20498 = cursorQuery.getLong(4);
                    c5284.f20494 = cursorQuery.getLong(5);
                    c5284.f20497 = cursorQuery.getLong(6);
                }
                if (z) {
                    c5284.f20493 += j2;
                }
                if (z2) {
                    c5284.f20496 += j2;
                }
                if (z3) {
                    c5284.f20495 += j2;
                }
                if (z4) {
                    c5284.f20498 += j2;
                }
                if (z5) {
                    c5284.f20494 += j2;
                }
                if (z6) {
                    c5284.f20497 += j2;
                }
                ContentValues contentValues = new ContentValues();
                contentValues.put("day", Long.valueOf(j));
                contentValues.put("daily_public_events_count", Long.valueOf(c5284.f20496));
                contentValues.put("daily_events_count", Long.valueOf(c5284.f20493));
                contentValues.put("daily_conversions_count", Long.valueOf(c5284.f20495));
                contentValues.put("daily_error_events_count", Long.valueOf(c5284.f20498));
                contentValues.put("daily_realtime_events_count", Long.valueOf(c5284.f20494));
                contentValues.put("daily_realtime_dcu_count", Long.valueOf(c5284.f20497));
                sQLiteDatabaseM12074.update("apps", contentValues, "app_id=?", strArr);
                cursorQuery.close();
                return c5284;
            } catch (SQLiteException e) {
                ˏᵢ().f20571.m4529(C5301.m11911(str), e, "Error updating daily counts. appId");
                if (0 != 0) {
                    cursor.close();
                }
                return c5284;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    /* renamed from: ʿˉ, reason: contains not printable characters */
    public final void m12042(ContentValues contentValues) {
        try {
            SQLiteDatabase sQLiteDatabaseM12074 = m12074();
            if (contentValues.getAsString("app_id") == null) {
                ˏᵢ().f20564.m4531(C5301.m11911("app_id"), "Value of the primary key is not set.");
            } else if (sQLiteDatabaseM12074.update("consent_settings", contentValues, "app_id = ?", new String[]{r3}) == 0 && sQLiteDatabaseM12074.insertWithOnConflict("consent_settings", null, contentValues, 5) == -1) {
                ˏᵢ().f20571.m4529(C5301.m11911("consent_settings"), C5301.m11911("app_id"), "Failed to insert/update table (got -1). key");
            }
        } catch (SQLiteException e) {
            ˏᵢ().f20571.m4530("Error storing into table. key", C5301.m11911("consent_settings"), C5301.m11911("app_id"), e);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0050, code lost:
    
        ˏᵢ().f20571.m4531(1000, "Read more than the max allowed conditional properties, ignoring extra");
     */
    /* renamed from: ˆʼ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List m12043(java.lang.String r27, java.lang.String[] r28) {
        /*
            Method dump skipped, instructions count: 289
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p456.C5348.m12043(java.lang.String, java.lang.String[]):java.util.List");
    }

    /* renamed from: ˆˋ, reason: contains not printable characters */
    public final void m12044(String str, C5322 c5322) {
        AbstractC4753.m10683(c5322);
        ʼᵎ();
        m11909();
        ContentValues contentValues = new ContentValues();
        String str2 = c5322.f20638;
        contentValues.put("app_id", str2);
        contentValues.put("name", c5322.f20632);
        contentValues.put("lifetime_count", Long.valueOf(c5322.f20637));
        contentValues.put("current_bundle_count", Long.valueOf(c5322.f20641));
        contentValues.put("last_fire_timestamp", Long.valueOf(c5322.f20639));
        contentValues.put("last_bundled_timestamp", Long.valueOf(c5322.f20640));
        contentValues.put("last_bundled_day", c5322.f20636);
        contentValues.put("last_sampled_complex_event_id", c5322.f20642);
        contentValues.put("last_sampling_rate", c5322.f20634);
        contentValues.put("current_session_count", Long.valueOf(c5322.f20633));
        Boolean bool = c5322.f20635;
        contentValues.put("last_exempt_from_sampling", (bool == null || !bool.booleanValue()) ? null : 1L);
        try {
            if (m12074().insertWithOnConflict(str, null, contentValues, 5) == -1) {
                ˏᵢ().f20571.m4531(C5301.m11911(str2), "Failed to insert/update event aggregates (got -1). appId");
            }
        } catch (SQLiteException e) {
            ˏᵢ().f20571.m4529(C5301.m11911(str2), e, "Error storing event aggregates. appId");
        }
    }

    /* renamed from: ˆˎ, reason: contains not printable characters */
    public final void m12045(String str, C0438 c0438, String str2, Map map, int i) {
        ʼᵎ();
        m11909();
        AbstractC4753.m10683(c0438);
        AbstractC4753.m10688(str);
        C0472.m2260();
        C5236 c5236 = (C5236) ((ﹳﹳ) this).ᐧⁱ;
        if (c5236.f20123.m11727(null, AbstractC5248.f20217)) {
            ʼᵎ();
            m11909();
            boolean zM12079 = m12079();
            C3097 c3097 = c5236.f20107;
            if (zM12079) {
                C5273 c5273 = this.f20703;
                long jM11317 = c5273.f20433.f20530.m11317();
                c3097.getClass();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                if (Math.abs(jElapsedRealtime - jM11317) > ((Long) AbstractC5248.f20209.m11751(null)).longValue()) {
                    c5273.f20433.f20530.m11314(jElapsedRealtime);
                    ʼᵎ();
                    m11909();
                    if (m12079()) {
                        SQLiteDatabase sQLiteDatabaseM12074 = m12074();
                        c3097.getClass();
                        System.currentTimeMillis();
                        ((Long) AbstractC5248.f20276.m11751(null)).longValue();
                        C5245.m11722();
                        int iDelete = sQLiteDatabaseM12074.delete("upload_queue", "ABS(creation_timestamp - ?) > CAST(? as integer)", new String[0]);
                        if (iDelete > 0) {
                            ˏᵢ().f20566.m4531(Integer.valueOf(iDelete), "Deleted stale MeasurementBatch rows from upload_queue. rowsDeleted");
                        }
                    }
                }
            }
            ArrayList arrayList = new ArrayList();
            for (Map.Entry entry : map.entrySet()) {
                arrayList.add(((String) entry.getKey()) + "=" + ((String) entry.getValue()));
            }
            byte[] bArrM2512 = c0438.m2512();
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", str);
            contentValues.put("measurement_batch", bArrM2512);
            contentValues.put("upload_uri", str2);
            StringBuilder sb = new StringBuilder();
            int size = arrayList.size();
            if (size > 0) {
                sb.append((CharSequence) arrayList.get(0));
                int i2 = 1;
                while (i2 < size) {
                    sb.append((CharSequence) "\r\n");
                    Object obj = arrayList.get(i2);
                    i2++;
                    sb.append((CharSequence) obj);
                }
            }
            contentValues.put("upload_headers", sb.toString());
            contentValues.put("upload_type", Integer.valueOf(AbstractC1702.m5411(i)));
            c3097.getClass();
            contentValues.put("creation_timestamp", Long.valueOf(System.currentTimeMillis()));
            contentValues.put("retry_count", (Integer) 0);
            try {
                if (m12074().insert("upload_queue", null, contentValues) == -1) {
                    ˏᵢ().f20571.m4531(str, "Failed to insert MeasurementBatch (got -1) to upload_queue. appId");
                }
            } catch (SQLiteException e) {
                ˏᵢ().f20571.m4529(str, e, "Error storing MeasurementBatch to upload_queue. appId");
            }
        }
    }

    /* renamed from: ˆˏ, reason: contains not printable characters */
    public final long m12046(String str) {
        AbstractC4753.m10688(str);
        ʼᵎ();
        m11909();
        return m12052("select first_open_count from app2 where app_id=?", new String[]{str}, -1L);
    }

    /* renamed from: ˆﹶ, reason: contains not printable characters */
    public final void m12047(String str, String str2) {
        AbstractC4753.m10688(str);
        AbstractC4753.m10688(str2);
        ʼᵎ();
        m11909();
        try {
            m12074().delete("conditional_properties", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e) {
            C5301 c5301 = ˏᵢ();
            c5301.f20571.m4530("Error deleting conditional property", C5301.m11911(str), ((C5236) ((ﹳﹳ) this).ᐧⁱ).f20108.m11773(str2), e);
        }
    }

    /* renamed from: ˈʾ, reason: contains not printable characters */
    public final void m12048() {
        m11909();
        m12074().setTransactionSuccessful();
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0045  */
    /* renamed from: ˉ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m12049(p456.C5231 r17, boolean r18) {
        /*
            Method dump skipped, instructions count: 974
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p456.C5348.m12049(ﾞⁱ.ʻʿ, boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0060  */
    /* renamed from: ˉʽ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final p456.C5356 m12050(java.lang.String r5) {
        /*
            r4 = this;
            p417.AbstractC4753.m10683(r5)
            r4.ʼᵎ()
            r4.m11909()
            java.lang.String r0 = "select consent_state, consent_source from consent_settings where app_id=? limit 1;"
            java.lang.String[] r5 = new java.lang.String[]{r5}
            r1 = 0
            android.database.sqlite.SQLiteDatabase r2 = r4.m12074()     // Catch: java.lang.Throwable -> L44 android.database.sqlite.SQLiteException -> L46
            android.database.Cursor r5 = r2.rawQuery(r0, r5)     // Catch: java.lang.Throwable -> L44 android.database.sqlite.SQLiteException -> L46
            boolean r0 = r5.moveToFirst()     // Catch: java.lang.Throwable -> L2d android.database.sqlite.SQLiteException -> L30
            if (r0 != 0) goto L32
            ﾞⁱ.ـˆ r0 = r4.ˏᵢ()     // Catch: java.lang.Throwable -> L2d android.database.sqlite.SQLiteException -> L30
            ʽˉ.ʽᐧ r0 = r0.f20566     // Catch: java.lang.Throwable -> L2d android.database.sqlite.SQLiteException -> L30
            java.lang.String r2 = "No data found"
            r0.m4533(r2)     // Catch: java.lang.Throwable -> L2d android.database.sqlite.SQLiteException -> L30
            r5.close()
            goto L58
        L2d:
            r0 = move-exception
            r1 = r5
            goto L5e
        L30:
            r0 = move-exception
            goto L48
        L32:
            r0 = 0
            java.lang.String r0 = r5.getString(r0)     // Catch: java.lang.Throwable -> L2d android.database.sqlite.SQLiteException -> L30
            r2 = 1
            int r2 = r5.getInt(r2)     // Catch: java.lang.Throwable -> L2d android.database.sqlite.SQLiteException -> L30
            ﾞⁱ.ﾞﾞ r1 = p456.C5356.m12140(r2, r0)     // Catch: java.lang.Throwable -> L2d android.database.sqlite.SQLiteException -> L30
            r5.close()
            goto L58
        L44:
            r0 = move-exception
            goto L5e
        L46:
            r0 = move-exception
            r5 = r1
        L48:
            ﾞⁱ.ـˆ r2 = r4.ˏᵢ()     // Catch: java.lang.Throwable -> L2d
            ʽˉ.ʽᐧ r2 = r2.f20571     // Catch: java.lang.Throwable -> L2d
            java.lang.String r3 = "Error querying database."
            r2.m4531(r0, r3)     // Catch: java.lang.Throwable -> L2d
            if (r5 == 0) goto L58
            r5.close()
        L58:
            if (r1 != 0) goto L5d
            ﾞⁱ.ﾞﾞ r5 = p456.C5356.f20781
            return r5
        L5d:
            return r1
        L5e:
            if (r1 == 0) goto L63
            r1.close()
        L63:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p456.C5348.m12050(java.lang.String):ﾞⁱ.ﾞﾞ");
    }

    /* renamed from: ˉʾ, reason: contains not printable characters */
    public final String m12051(String str, String[] strArr) {
        Cursor cursorRawQuery = null;
        try {
            try {
                cursorRawQuery = m12074().rawQuery(str, strArr);
                if (!cursorRawQuery.moveToFirst()) {
                    cursorRawQuery.close();
                    return "";
                }
                String string = cursorRawQuery.getString(0);
                cursorRawQuery.close();
                return string;
            } catch (SQLiteException e) {
                ˏᵢ().f20571.m4529(str, e, "Database error");
                throw e;
            }
        } catch (Throwable th) {
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            throw th;
        }
    }

    /* renamed from: ˉˑ, reason: contains not printable characters */
    public final long m12052(String str, String[] strArr, long j) {
        Cursor cursorRawQuery = null;
        try {
            try {
                cursorRawQuery = m12074().rawQuery(str, strArr);
                if (!cursorRawQuery.moveToFirst()) {
                    cursorRawQuery.close();
                    return j;
                }
                long j2 = cursorRawQuery.getLong(0);
                cursorRawQuery.close();
                return j2;
            } catch (SQLiteException e) {
                ˏᵢ().f20571.m4529(str, e, "Database error");
                throw e;
            }
        } catch (Throwable th) {
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0108 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x010f  */
    /* renamed from: ˊʾ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m12053(java.lang.String r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 282
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p456.C5348.m12053(java.lang.String):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0135  */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* renamed from: ˊˉ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final p456.C5322 m12054(java.lang.String r29, java.lang.String r30, java.lang.String r31) {
        /*
            Method dump skipped, instructions count: 313
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p456.C5348.m12054(java.lang.String, java.lang.String, java.lang.String):ﾞⁱ.ᵎˏ");
    }

    /* renamed from: ˋʽ, reason: contains not printable characters */
    public final void m12055(String str, ArrayList arrayList) {
        AbstractC4753.m10688(str);
        m11909();
        ʼᵎ();
        SQLiteDatabase sQLiteDatabaseM12074 = m12074();
        try {
            long jM12061 = m12061("select count(1) from audience_filter_values where app_id=?", new String[]{str});
            int iMax = Math.max(0, Math.min(2000, ((C5236) ((ﹳﹳ) this).ᐧⁱ).f20123.m11731(str, AbstractC5248.f20220)));
            if (jM12061 <= iMax) {
                return;
            }
            ArrayList arrayList2 = new ArrayList();
            for (int i = 0; i < arrayList.size(); i++) {
                Integer num = (Integer) arrayList.get(i);
                if (num == null) {
                    return;
                }
                arrayList2.add(Integer.toString(num.intValue()));
            }
            sQLiteDatabaseM12074.delete("audience_filter_values", ᵎˏ.ˑי("audience_id in (select audience_id from audience_filter_values where app_id=? and audience_id not in ", ᵎˏ.ˑי("(", TextUtils.join(",", arrayList2), ")"), " order by rowid desc limit -1 offset ?)"), new String[]{str, Integer.toString(iMax)});
        } catch (SQLiteException e) {
            ˏᵢ().f20571.m4529(C5301.m11911(str), e, "Database error querying filters. appId");
        }
    }

    /* renamed from: ˋˏ, reason: contains not printable characters */
    public final Object m12056(Cursor cursor, int i) {
        int type = cursor.getType(i);
        if (type == 0) {
            ˏᵢ().f20571.m4533("Loaded invalid null value from database");
            return null;
        }
        if (type == 1) {
            return Long.valueOf(cursor.getLong(i));
        }
        if (type == 2) {
            return Double.valueOf(cursor.getDouble(i));
        }
        if (type == 3) {
            return cursor.getString(i);
        }
        if (type == 4) {
            ˏᵢ().f20571.m4533("Loaded invalid blob type value, ignoring it");
            return null;
        }
        C5301 c5301 = ˏᵢ();
        c5301.f20571.m4531(Integer.valueOf(type), "Loaded invalid unknown value type, ignoring it");
        return null;
    }

    /* renamed from: ˋᴵ, reason: contains not printable characters */
    public final String m12057() {
        ((C5236) ((ﹳﹳ) this).ᐧⁱ).f20107.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        return "app_id=? AND (" + AbstractC0002.m42(ᐧʻ.ˑי(jCurrentTimeMillis, "(upload_type = 1 AND (ABS(creation_timestamp - ", ") <= CAST("), ((Long) AbstractC5248.f20276.m11751(null)).longValue(), " AS INTEGER)))") + " OR" + AbstractC0002.m42(ᐧʻ.ˑי(jCurrentTimeMillis, "(upload_type != 1 AND (ABS(creation_timestamp - ", ") <= CAST("), C5245.m11722(), " AS INTEGER)))") + ")";
    }

    /* renamed from: ˎـ, reason: contains not printable characters */
    public final void m12058() {
        ʼᵎ();
        m11909();
        if (m12079()) {
            C5273 c5273 = this.f20703;
            long jM11317 = c5273.f20433.f20525.m11317();
            C5236 c5236 = (C5236) ((ﹳﹳ) this).ᐧⁱ;
            c5236.f20107.getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (Math.abs(jElapsedRealtime - jM11317) > ((Long) AbstractC5248.f20209.m11751(null)).longValue()) {
                c5273.f20433.f20525.m11314(jElapsedRealtime);
                ʼᵎ();
                m11909();
                if (m12079()) {
                    SQLiteDatabase sQLiteDatabaseM12074 = m12074();
                    c5236.f20107.getClass();
                    int iDelete = sQLiteDatabaseM12074.delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[]{String.valueOf(System.currentTimeMillis()), String.valueOf(C5245.m11722())});
                    if (iDelete > 0) {
                        C5301 c5301 = ˏᵢ();
                        c5301.f20566.m4531(Integer.valueOf(iDelete), "Deleted stale rows. rowsDeleted");
                    }
                }
            }
        }
    }

    /* renamed from: ˏʻ, reason: contains not printable characters */
    public final boolean m12059(C5345 c5345) {
        ʼᵎ();
        m11909();
        String str = c5345.f20731;
        AbstractC4753.m10683(str);
        if (m12085(str, c5345.f20728.f20532) == null && m12061("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[]{str}) >= 1000) {
            return false;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("origin", c5345.f20725);
        contentValues.put("name", c5345.f20728.f20532);
        Object objM11869 = c5345.f20728.m11869();
        AbstractC4753.m10683(objM11869);
        m12035(contentValues, objM11869);
        contentValues.put("active", Boolean.valueOf(c5345.f20726));
        contentValues.put("trigger_event_name", c5345.f20733);
        contentValues.put("trigger_timeout", Long.valueOf(c5345.f20727));
        ﹶﾞ();
        contentValues.put("timed_out_event", C5316.m11933(c5345.f20734));
        contentValues.put("creation_timestamp", Long.valueOf(c5345.f20730));
        ﹶﾞ();
        contentValues.put("triggered_event", C5316.m11933(c5345.f20729));
        contentValues.put("triggered_timestamp", Long.valueOf(c5345.f20728.f20534));
        contentValues.put("time_to_live", Long.valueOf(c5345.f20732));
        ﹶﾞ();
        contentValues.put("expired_event", C5316.m11933(c5345.f20735));
        try {
            if (m12074().insertWithOnConflict("conditional_properties", null, contentValues, 5) != -1) {
                return true;
            }
            ˏᵢ().f20571.m4531(C5301.m11911(str), "Failed to insert/update conditional user property (got -1)");
            return true;
        } catch (SQLiteException e) {
            C5301 c5301 = ˏᵢ();
            c5301.f20571.m4529(C5301.m11911(str), e, "Error storing conditional user property");
            return true;
        }
    }

    /* renamed from: ˑˈ, reason: contains not printable characters */
    public final void m12060(Long l) throws SQLException {
        ʼᵎ();
        m11909();
        C0472.m2260();
        if (((C5236) ((ﹳﹳ) this).ᐧⁱ).f20123.m11727(null, AbstractC5248.f20217) && m12079()) {
            if (m12061("SELECT COUNT(1) FROM upload_queue WHERE rowid = " + l + " AND retry_count =  2147483647 LIMIT 1", null) > 0) {
                ˏᵢ().f20568.m4533("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                m12074().execSQL("UPDATE upload_queue SET retry_count = retry_count + 1 WHERE rowid = " + l + " AND retry_count < 2147483647");
            } catch (SQLiteException e) {
                ˏᵢ().f20571.m4531(e, "Error incrementing retry count. error");
            }
        }
    }

    /* renamed from: ˑˉ, reason: contains not printable characters */
    public final long m12061(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            try {
                Cursor cursorRawQuery = m12074().rawQuery(str, strArr);
                if (!cursorRawQuery.moveToFirst()) {
                    throw new SQLiteException("Database returned empty set");
                }
                long j = cursorRawQuery.getLong(0);
                cursorRawQuery.close();
                return j;
            } catch (SQLiteException e) {
                ˏᵢ().f20571.m4529(str, e, "Database error");
                throw e;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [boolean] */
    /* renamed from: ˑˏ, reason: contains not printable characters */
    public final C1278 m12062(String str) throws Throwable {
        Cursor cursorQuery;
        AbstractC4753.m10688(str);
        ʼᵎ();
        m11909();
        C0472.m2260();
        Cursor cursor = null;
        ?? M11727 = ((C5236) ((ﹳﹳ) this).ᐧⁱ).f20123.m11727(null, AbstractC5248.f20217);
        try {
            if (M11727 == 0) {
                return null;
            }
            try {
                cursorQuery = m12074().query("upload_queue", new String[]{"rowId", "app_id", "measurement_batch", "upload_uri", "upload_headers", "upload_type", "retry_count"}, m12057(), new String[]{str}, null, null, "creation_timestamp ASC", "1");
            } catch (SQLiteException e) {
                e = e;
                cursorQuery = null;
            } catch (Throwable th) {
                th = th;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
            try {
                if (!cursorQuery.moveToFirst()) {
                    cursorQuery.close();
                    return null;
                }
                String string = cursorQuery.getString(3);
                if (TextUtils.isEmpty(string)) {
                    ˏᵢ().f20567.m4533("Upload uri is null or empty. Destination is unknown. Dropping batch. ");
                    cursorQuery.close();
                    return null;
                }
                try {
                    C0579 c0579 = (C0579) C5292.m11876(C0438.m2214(), cursorQuery.getBlob(2));
                    int i = AbstractC1702.m5408(3)[cursorQuery.getInt(5)];
                    if ((i == 3 || i == 1) && cursorQuery.getInt(6) > 0) {
                        ArrayList arrayList = new ArrayList();
                        Iterator it = DesugarCollections.unmodifiableList(((C0438) c0579.f2428).m2218()).iterator();
                        while (it.hasNext()) {
                            C0416 c0416 = (C0416) ((C0302) it.next()).m2541();
                            int i2 = cursorQuery.getInt(6);
                            c0416.m1820();
                            C0302.m1640((C0302) c0416.f2428, i2);
                            arrayList.add((C0302) c0416.m1821());
                        }
                        c0579.m1820();
                        C0438.m2213((C0438) c0579.f2428);
                        c0579.m1820();
                        C0438.m2209((C0438) c0579.f2428, arrayList);
                    }
                    HashMap map = new HashMap();
                    String string2 = cursorQuery.getString(4);
                    if (string2 != null) {
                        String[] strArrSplit = string2.split("\r\n");
                        int length = strArrSplit.length;
                        int i3 = 0;
                        while (true) {
                            if (i3 >= length) {
                                break;
                            }
                            String str2 = strArrSplit[i3];
                            if (str2.isEmpty()) {
                                break;
                            }
                            String[] strArrSplit2 = str2.split("=", 2);
                            if (strArrSplit2.length != 2) {
                                ˏᵢ().f20571.m4531(str2, "Invalid upload header: ");
                                break;
                            }
                            map.put(strArrSplit2[0], strArrSplit2[1]);
                            i3++;
                        }
                    }
                    long j = cursorQuery.getLong(0);
                    C0438 c0438 = (C0438) c0579.m1821();
                    C1278 c1278 = new C1278();
                    c1278.f5257 = j;
                    c1278.f5259 = c0438;
                    c1278.f5261 = string;
                    c1278.f5258 = map;
                    cursorQuery.close();
                    return c1278;
                } catch (IOException e2) {
                    ˏᵢ().f20571.m4529(str, e2, "Failed to queued MeasurementBatch from upload_queue. appId");
                    cursorQuery.close();
                    return null;
                }
            } catch (SQLiteException e3) {
                e = e3;
                ˏᵢ().f20571.m4529(str, e, "Error to querying MeasurementBatch from upload_queue. appId");
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                return null;
            }
        } catch (Throwable th2) {
            th = th2;
            cursor = M11727;
        }
    }

    /* renamed from: יʾ, reason: contains not printable characters */
    public final boolean m12063(C4894 c4894, long j, boolean z) {
        ʼᵎ();
        m11909();
        String str = (String) c4894.f18482;
        AbstractC4753.m10688(str);
        byte[] bArrM2512 = m12021().m11900(c4894).m2512();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("name", (String) c4894.f18477);
        contentValues.put("timestamp", Long.valueOf(c4894.f18476));
        contentValues.put("metadata_fingerprint", Long.valueOf(j));
        contentValues.put("data", bArrM2512);
        contentValues.put("realtime", Integer.valueOf(z ? 1 : 0));
        try {
            if (m12074().insert("raw_events", null, contentValues) != -1) {
                return true;
            }
            ˏᵢ().f20571.m4531(C5301.m11911(str), "Failed to insert raw event (got -1). appId");
            return false;
        } catch (SQLiteException e) {
            C5301 c5301 = ˏᵢ();
            c5301.f20571.m4529(C5301.m11911(str), e, "Error storing raw event. appId");
            return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0053  */
    /* renamed from: יˆ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String m12064(long r4) throws java.lang.Throwable {
        /*
            r3 = this;
            r3.ʼᵎ()
            r3.m11909()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r3.m12074()     // Catch: java.lang.Throwable -> L3c android.database.sqlite.SQLiteException -> L3e
            java.lang.String r2 = "select app_id from apps where app_id in (select distinct app_id from raw_events) and config_fetched_time < ? order by failed_config_fetch_time limit 1;"
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch: java.lang.Throwable -> L3c android.database.sqlite.SQLiteException -> L3e
            java.lang.String[] r4 = new java.lang.String[]{r4}     // Catch: java.lang.Throwable -> L3c android.database.sqlite.SQLiteException -> L3e
            android.database.Cursor r4 = r1.rawQuery(r2, r4)     // Catch: java.lang.Throwable -> L3c android.database.sqlite.SQLiteException -> L3e
            boolean r5 = r4.moveToFirst()     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L31
            if (r5 != 0) goto L33
            ﾞⁱ.ـˆ r5 = r3.ˏᵢ()     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L31
            ʽˉ.ʽᐧ r5 = r5.f20566     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L31
            java.lang.String r1 = "No expired configs for apps with pending events"
            r5.m4533(r1)     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L31
            r4.close()
            return r0
        L2e:
            r5 = move-exception
            r0 = r4
            goto L51
        L31:
            r5 = move-exception
            goto L40
        L33:
            r5 = 0
            java.lang.String r5 = r4.getString(r5)     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L31
            r4.close()
            return r5
        L3c:
            r5 = move-exception
            goto L51
        L3e:
            r5 = move-exception
            r4 = r0
        L40:
            ﾞⁱ.ـˆ r1 = r3.ˏᵢ()     // Catch: java.lang.Throwable -> L2e
            ʽˉ.ʽᐧ r1 = r1.f20571     // Catch: java.lang.Throwable -> L2e
            java.lang.String r2 = "Error selecting expired configs"
            r1.m4531(r5, r2)     // Catch: java.lang.Throwable -> L2e
            if (r4 == 0) goto L50
            r4.close()
        L50:
            return r0
        L51:
            if (r0 == 0) goto L56
            r0.close()
        L56:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p456.C5348.m12064(long):java.lang.String");
    }

    /* renamed from: יˊ, reason: contains not printable characters */
    public final long m12065(C0302 c0302) {
        ʼᵎ();
        m11909();
        AbstractC4753.m10688(c0302.m1740());
        byte[] bArrM2512 = c0302.m2512();
        long jM11905 = m12021().m11905(bArrM2512);
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", c0302.m1740());
        contentValues.put("metadata_fingerprint", Long.valueOf(jM11905));
        contentValues.put("metadata", bArrM2512);
        try {
            m12074().insertWithOnConflict("raw_events_metadata", null, contentValues, 4);
            return jM11905;
        } catch (SQLiteException e) {
            C5301 c5301 = ˏᵢ();
            c5301.f20571.m4529(C5301.m11911(c0302.m1740()), e, "Error storing raw event metadata. appId");
            throw e;
        }
    }

    /* renamed from: יי, reason: contains not printable characters */
    public final void m12066(String str, Bundle bundle) {
        ʼᵎ();
        m11909();
        byte[] bArrM2512 = m12021().m11900(new C4894((C5236) ((ﹳﹳ) this).ᐧⁱ, "", str, "dep", 0L, 0L, bundle)).m2512();
        C5301 c5301 = ˏᵢ();
        c5301.f20566.m4529(((C5236) ((ﹳﹳ) this).ᐧⁱ).f20108.m11769(str), Integer.valueOf(bArrM2512.length), "Saving default event parameters, appId, data size");
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("parameters", bArrM2512);
        try {
            if (m12074().insertWithOnConflict("default_event_params", null, contentValues, 5) == -1) {
                ˏᵢ().f20571.m4531(C5301.m11911(str), "Failed to insert default event parameters (got -1). appId");
            }
        } catch (SQLiteException e) {
            C5301 c53012 = ˏᵢ();
            c53012.f20571.m4529(C5301.m11911(str), e, "Error storing default event parameters. appId");
        }
    }

    /* renamed from: יᴵ, reason: contains not printable characters */
    public final List m12067(String str, String str2, String str3) {
        AbstractC4753.m10688(str);
        ʼᵎ();
        m11909();
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(str);
        StringBuilder sb = new StringBuilder("app_id=?");
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(str2);
            sb.append(" and origin=?");
        }
        if (!TextUtils.isEmpty(str3)) {
            arrayList.add(str3 + "*");
            sb.append(" and name glob ?");
        }
        return m12043(sb.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    /* renamed from: יᵎ, reason: contains not printable characters */
    public final void m12068(String str, String str2) {
        AbstractC4753.m10688(str2);
        ʼᵎ();
        m11909();
        try {
            m12074().delete(str, "app_id=?", new String[]{str2});
        } catch (SQLiteException e) {
            C5301 c5301 = ˏᵢ();
            c5301.f20571.m4529(C5301.m11911(str2), e, "Error deleting snapshot. appId");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x02ee A[Catch: all -> 0x00b1, SQLiteException -> 0x00b6, TryCatch #5 {SQLiteException -> 0x00b6, blocks: (B:4:0x0083, B:8:0x008d, B:9:0x0091, B:10:0x0096, B:13:0x00a6, B:21:0x00c1, B:23:0x00d4, B:26:0x00e8, B:28:0x012a, B:33:0x0134, B:37:0x017e, B:39:0x01ad, B:44:0x01b7, B:48:0x01c8, B:50:0x01cf, B:54:0x01e5, B:56:0x01f0, B:57:0x0202, B:59:0x020d, B:63:0x0233, B:65:0x0240, B:67:0x0249, B:69:0x0251, B:73:0x025a, B:77:0x026b, B:79:0x0272, B:81:0x0283, B:82:0x0289, B:86:0x029a, B:93:0x02a8, B:95:0x02c5, B:96:0x02cb, B:100:0x02dc, B:102:0x02e3, B:105:0x02ee, B:107:0x02fb, B:109:0x0303, B:113:0x030c, B:117:0x031d, B:122:0x0328, B:130:0x033d, B:132:0x0355, B:134:0x0372, B:137:0x037c, B:141:0x038d, B:145:0x0396, B:147:0x03a0, B:149:0x03a8, B:150:0x03b0, B:155:0x03cc, B:157:0x03d2, B:158:0x03da, B:162:0x03f4, B:164:0x0401, B:165:0x0407, B:169:0x0417, B:173:0x0420, B:174:0x042a, B:176:0x0430, B:125:0x0330, B:129:0x0339, B:61:0x0217, B:62:0x021d, B:53:0x01e1, B:36:0x0179, B:25:0x00e0, B:20:0x00ba), top: B:210:0x0083 }] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02fb A[Catch: all -> 0x00b1, SQLiteException -> 0x00b6, TryCatch #5 {SQLiteException -> 0x00b6, blocks: (B:4:0x0083, B:8:0x008d, B:9:0x0091, B:10:0x0096, B:13:0x00a6, B:21:0x00c1, B:23:0x00d4, B:26:0x00e8, B:28:0x012a, B:33:0x0134, B:37:0x017e, B:39:0x01ad, B:44:0x01b7, B:48:0x01c8, B:50:0x01cf, B:54:0x01e5, B:56:0x01f0, B:57:0x0202, B:59:0x020d, B:63:0x0233, B:65:0x0240, B:67:0x0249, B:69:0x0251, B:73:0x025a, B:77:0x026b, B:79:0x0272, B:81:0x0283, B:82:0x0289, B:86:0x029a, B:93:0x02a8, B:95:0x02c5, B:96:0x02cb, B:100:0x02dc, B:102:0x02e3, B:105:0x02ee, B:107:0x02fb, B:109:0x0303, B:113:0x030c, B:117:0x031d, B:122:0x0328, B:130:0x033d, B:132:0x0355, B:134:0x0372, B:137:0x037c, B:141:0x038d, B:145:0x0396, B:147:0x03a0, B:149:0x03a8, B:150:0x03b0, B:155:0x03cc, B:157:0x03d2, B:158:0x03da, B:162:0x03f4, B:164:0x0401, B:165:0x0407, B:169:0x0417, B:173:0x0420, B:174:0x042a, B:176:0x0430, B:125:0x0330, B:129:0x0339, B:61:0x0217, B:62:0x021d, B:53:0x01e1, B:36:0x0179, B:25:0x00e0, B:20:0x00ba), top: B:210:0x0083 }] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0330 A[Catch: all -> 0x00b1, SQLiteException -> 0x00b6, TryCatch #5 {SQLiteException -> 0x00b6, blocks: (B:4:0x0083, B:8:0x008d, B:9:0x0091, B:10:0x0096, B:13:0x00a6, B:21:0x00c1, B:23:0x00d4, B:26:0x00e8, B:28:0x012a, B:33:0x0134, B:37:0x017e, B:39:0x01ad, B:44:0x01b7, B:48:0x01c8, B:50:0x01cf, B:54:0x01e5, B:56:0x01f0, B:57:0x0202, B:59:0x020d, B:63:0x0233, B:65:0x0240, B:67:0x0249, B:69:0x0251, B:73:0x025a, B:77:0x026b, B:79:0x0272, B:81:0x0283, B:82:0x0289, B:86:0x029a, B:93:0x02a8, B:95:0x02c5, B:96:0x02cb, B:100:0x02dc, B:102:0x02e3, B:105:0x02ee, B:107:0x02fb, B:109:0x0303, B:113:0x030c, B:117:0x031d, B:122:0x0328, B:130:0x033d, B:132:0x0355, B:134:0x0372, B:137:0x037c, B:141:0x038d, B:145:0x0396, B:147:0x03a0, B:149:0x03a8, B:150:0x03b0, B:155:0x03cc, B:157:0x03d2, B:158:0x03da, B:162:0x03f4, B:164:0x0401, B:165:0x0407, B:169:0x0417, B:173:0x0420, B:174:0x042a, B:176:0x0430, B:125:0x0330, B:129:0x0339, B:61:0x0217, B:62:0x021d, B:53:0x01e1, B:36:0x0179, B:25:0x00e0, B:20:0x00ba), top: B:210:0x0083 }] */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0372 A[Catch: all -> 0x00b1, SQLiteException -> 0x00b6, TryCatch #5 {SQLiteException -> 0x00b6, blocks: (B:4:0x0083, B:8:0x008d, B:9:0x0091, B:10:0x0096, B:13:0x00a6, B:21:0x00c1, B:23:0x00d4, B:26:0x00e8, B:28:0x012a, B:33:0x0134, B:37:0x017e, B:39:0x01ad, B:44:0x01b7, B:48:0x01c8, B:50:0x01cf, B:54:0x01e5, B:56:0x01f0, B:57:0x0202, B:59:0x020d, B:63:0x0233, B:65:0x0240, B:67:0x0249, B:69:0x0251, B:73:0x025a, B:77:0x026b, B:79:0x0272, B:81:0x0283, B:82:0x0289, B:86:0x029a, B:93:0x02a8, B:95:0x02c5, B:96:0x02cb, B:100:0x02dc, B:102:0x02e3, B:105:0x02ee, B:107:0x02fb, B:109:0x0303, B:113:0x030c, B:117:0x031d, B:122:0x0328, B:130:0x033d, B:132:0x0355, B:134:0x0372, B:137:0x037c, B:141:0x038d, B:145:0x0396, B:147:0x03a0, B:149:0x03a8, B:150:0x03b0, B:155:0x03cc, B:157:0x03d2, B:158:0x03da, B:162:0x03f4, B:164:0x0401, B:165:0x0407, B:169:0x0417, B:173:0x0420, B:174:0x042a, B:176:0x0430, B:125:0x0330, B:129:0x0339, B:61:0x0217, B:62:0x021d, B:53:0x01e1, B:36:0x0179, B:25:0x00e0, B:20:0x00ba), top: B:210:0x0083 }] */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0396 A[Catch: all -> 0x00b1, SQLiteException -> 0x00b6, TRY_ENTER, TryCatch #5 {SQLiteException -> 0x00b6, blocks: (B:4:0x0083, B:8:0x008d, B:9:0x0091, B:10:0x0096, B:13:0x00a6, B:21:0x00c1, B:23:0x00d4, B:26:0x00e8, B:28:0x012a, B:33:0x0134, B:37:0x017e, B:39:0x01ad, B:44:0x01b7, B:48:0x01c8, B:50:0x01cf, B:54:0x01e5, B:56:0x01f0, B:57:0x0202, B:59:0x020d, B:63:0x0233, B:65:0x0240, B:67:0x0249, B:69:0x0251, B:73:0x025a, B:77:0x026b, B:79:0x0272, B:81:0x0283, B:82:0x0289, B:86:0x029a, B:93:0x02a8, B:95:0x02c5, B:96:0x02cb, B:100:0x02dc, B:102:0x02e3, B:105:0x02ee, B:107:0x02fb, B:109:0x0303, B:113:0x030c, B:117:0x031d, B:122:0x0328, B:130:0x033d, B:132:0x0355, B:134:0x0372, B:137:0x037c, B:141:0x038d, B:145:0x0396, B:147:0x03a0, B:149:0x03a8, B:150:0x03b0, B:155:0x03cc, B:157:0x03d2, B:158:0x03da, B:162:0x03f4, B:164:0x0401, B:165:0x0407, B:169:0x0417, B:173:0x0420, B:174:0x042a, B:176:0x0430, B:125:0x0330, B:129:0x0339, B:61:0x0217, B:62:0x021d, B:53:0x01e1, B:36:0x0179, B:25:0x00e0, B:20:0x00ba), top: B:210:0x0083 }] */
    /* JADX WARN: Removed duplicated region for block: B:147:0x03a0 A[Catch: all -> 0x00b1, SQLiteException -> 0x00b6, TryCatch #5 {SQLiteException -> 0x00b6, blocks: (B:4:0x0083, B:8:0x008d, B:9:0x0091, B:10:0x0096, B:13:0x00a6, B:21:0x00c1, B:23:0x00d4, B:26:0x00e8, B:28:0x012a, B:33:0x0134, B:37:0x017e, B:39:0x01ad, B:44:0x01b7, B:48:0x01c8, B:50:0x01cf, B:54:0x01e5, B:56:0x01f0, B:57:0x0202, B:59:0x020d, B:63:0x0233, B:65:0x0240, B:67:0x0249, B:69:0x0251, B:73:0x025a, B:77:0x026b, B:79:0x0272, B:81:0x0283, B:82:0x0289, B:86:0x029a, B:93:0x02a8, B:95:0x02c5, B:96:0x02cb, B:100:0x02dc, B:102:0x02e3, B:105:0x02ee, B:107:0x02fb, B:109:0x0303, B:113:0x030c, B:117:0x031d, B:122:0x0328, B:130:0x033d, B:132:0x0355, B:134:0x0372, B:137:0x037c, B:141:0x038d, B:145:0x0396, B:147:0x03a0, B:149:0x03a8, B:150:0x03b0, B:155:0x03cc, B:157:0x03d2, B:158:0x03da, B:162:0x03f4, B:164:0x0401, B:165:0x0407, B:169:0x0417, B:173:0x0420, B:174:0x042a, B:176:0x0430, B:125:0x0330, B:129:0x0339, B:61:0x0217, B:62:0x021d, B:53:0x01e1, B:36:0x0179, B:25:0x00e0, B:20:0x00ba), top: B:210:0x0083 }] */
    /* JADX WARN: Removed duplicated region for block: B:157:0x03d2 A[Catch: all -> 0x00b1, SQLiteException -> 0x00b6, TRY_LEAVE, TryCatch #5 {SQLiteException -> 0x00b6, blocks: (B:4:0x0083, B:8:0x008d, B:9:0x0091, B:10:0x0096, B:13:0x00a6, B:21:0x00c1, B:23:0x00d4, B:26:0x00e8, B:28:0x012a, B:33:0x0134, B:37:0x017e, B:39:0x01ad, B:44:0x01b7, B:48:0x01c8, B:50:0x01cf, B:54:0x01e5, B:56:0x01f0, B:57:0x0202, B:59:0x020d, B:63:0x0233, B:65:0x0240, B:67:0x0249, B:69:0x0251, B:73:0x025a, B:77:0x026b, B:79:0x0272, B:81:0x0283, B:82:0x0289, B:86:0x029a, B:93:0x02a8, B:95:0x02c5, B:96:0x02cb, B:100:0x02dc, B:102:0x02e3, B:105:0x02ee, B:107:0x02fb, B:109:0x0303, B:113:0x030c, B:117:0x031d, B:122:0x0328, B:130:0x033d, B:132:0x0355, B:134:0x0372, B:137:0x037c, B:141:0x038d, B:145:0x0396, B:147:0x03a0, B:149:0x03a8, B:150:0x03b0, B:155:0x03cc, B:157:0x03d2, B:158:0x03da, B:162:0x03f4, B:164:0x0401, B:165:0x0407, B:169:0x0417, B:173:0x0420, B:174:0x042a, B:176:0x0430, B:125:0x0330, B:129:0x0339, B:61:0x0217, B:62:0x021d, B:53:0x01e1, B:36:0x0179, B:25:0x00e0, B:20:0x00ba), top: B:210:0x0083 }] */
    /* JADX WARN: Removed duplicated region for block: B:162:0x03f4 A[Catch: all -> 0x00b1, SQLiteException -> 0x00b6, TRY_ENTER, TryCatch #5 {SQLiteException -> 0x00b6, blocks: (B:4:0x0083, B:8:0x008d, B:9:0x0091, B:10:0x0096, B:13:0x00a6, B:21:0x00c1, B:23:0x00d4, B:26:0x00e8, B:28:0x012a, B:33:0x0134, B:37:0x017e, B:39:0x01ad, B:44:0x01b7, B:48:0x01c8, B:50:0x01cf, B:54:0x01e5, B:56:0x01f0, B:57:0x0202, B:59:0x020d, B:63:0x0233, B:65:0x0240, B:67:0x0249, B:69:0x0251, B:73:0x025a, B:77:0x026b, B:79:0x0272, B:81:0x0283, B:82:0x0289, B:86:0x029a, B:93:0x02a8, B:95:0x02c5, B:96:0x02cb, B:100:0x02dc, B:102:0x02e3, B:105:0x02ee, B:107:0x02fb, B:109:0x0303, B:113:0x030c, B:117:0x031d, B:122:0x0328, B:130:0x033d, B:132:0x0355, B:134:0x0372, B:137:0x037c, B:141:0x038d, B:145:0x0396, B:147:0x03a0, B:149:0x03a8, B:150:0x03b0, B:155:0x03cc, B:157:0x03d2, B:158:0x03da, B:162:0x03f4, B:164:0x0401, B:165:0x0407, B:169:0x0417, B:173:0x0420, B:174:0x042a, B:176:0x0430, B:125:0x0330, B:129:0x0339, B:61:0x0217, B:62:0x021d, B:53:0x01e1, B:36:0x0179, B:25:0x00e0, B:20:0x00ba), top: B:210:0x0083 }] */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0401 A[Catch: all -> 0x00b1, SQLiteException -> 0x00b6, TRY_LEAVE, TryCatch #5 {SQLiteException -> 0x00b6, blocks: (B:4:0x0083, B:8:0x008d, B:9:0x0091, B:10:0x0096, B:13:0x00a6, B:21:0x00c1, B:23:0x00d4, B:26:0x00e8, B:28:0x012a, B:33:0x0134, B:37:0x017e, B:39:0x01ad, B:44:0x01b7, B:48:0x01c8, B:50:0x01cf, B:54:0x01e5, B:56:0x01f0, B:57:0x0202, B:59:0x020d, B:63:0x0233, B:65:0x0240, B:67:0x0249, B:69:0x0251, B:73:0x025a, B:77:0x026b, B:79:0x0272, B:81:0x0283, B:82:0x0289, B:86:0x029a, B:93:0x02a8, B:95:0x02c5, B:96:0x02cb, B:100:0x02dc, B:102:0x02e3, B:105:0x02ee, B:107:0x02fb, B:109:0x0303, B:113:0x030c, B:117:0x031d, B:122:0x0328, B:130:0x033d, B:132:0x0355, B:134:0x0372, B:137:0x037c, B:141:0x038d, B:145:0x0396, B:147:0x03a0, B:149:0x03a8, B:150:0x03b0, B:155:0x03cc, B:157:0x03d2, B:158:0x03da, B:162:0x03f4, B:164:0x0401, B:165:0x0407, B:169:0x0417, B:173:0x0420, B:174:0x042a, B:176:0x0430, B:125:0x0330, B:129:0x0339, B:61:0x0217, B:62:0x021d, B:53:0x01e1, B:36:0x0179, B:25:0x00e0, B:20:0x00ba), top: B:210:0x0083 }] */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0430 A[Catch: all -> 0x00b1, SQLiteException -> 0x00b6, TRY_LEAVE, TryCatch #5 {SQLiteException -> 0x00b6, blocks: (B:4:0x0083, B:8:0x008d, B:9:0x0091, B:10:0x0096, B:13:0x00a6, B:21:0x00c1, B:23:0x00d4, B:26:0x00e8, B:28:0x012a, B:33:0x0134, B:37:0x017e, B:39:0x01ad, B:44:0x01b7, B:48:0x01c8, B:50:0x01cf, B:54:0x01e5, B:56:0x01f0, B:57:0x0202, B:59:0x020d, B:63:0x0233, B:65:0x0240, B:67:0x0249, B:69:0x0251, B:73:0x025a, B:77:0x026b, B:79:0x0272, B:81:0x0283, B:82:0x0289, B:86:0x029a, B:93:0x02a8, B:95:0x02c5, B:96:0x02cb, B:100:0x02dc, B:102:0x02e3, B:105:0x02ee, B:107:0x02fb, B:109:0x0303, B:113:0x030c, B:117:0x031d, B:122:0x0328, B:130:0x033d, B:132:0x0355, B:134:0x0372, B:137:0x037c, B:141:0x038d, B:145:0x0396, B:147:0x03a0, B:149:0x03a8, B:150:0x03b0, B:155:0x03cc, B:157:0x03d2, B:158:0x03da, B:162:0x03f4, B:164:0x0401, B:165:0x0407, B:169:0x0417, B:173:0x0420, B:174:0x042a, B:176:0x0430, B:125:0x0330, B:129:0x0339, B:61:0x0217, B:62:0x021d, B:53:0x01e1, B:36:0x0179, B:25:0x00e0, B:20:0x00ba), top: B:210:0x0083 }] */
    /* JADX WARN: Removed duplicated region for block: B:198:0x046f  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0420 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:231:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0240 A[Catch: all -> 0x00b1, SQLiteException -> 0x00b6, TryCatch #5 {SQLiteException -> 0x00b6, blocks: (B:4:0x0083, B:8:0x008d, B:9:0x0091, B:10:0x0096, B:13:0x00a6, B:21:0x00c1, B:23:0x00d4, B:26:0x00e8, B:28:0x012a, B:33:0x0134, B:37:0x017e, B:39:0x01ad, B:44:0x01b7, B:48:0x01c8, B:50:0x01cf, B:54:0x01e5, B:56:0x01f0, B:57:0x0202, B:59:0x020d, B:63:0x0233, B:65:0x0240, B:67:0x0249, B:69:0x0251, B:73:0x025a, B:77:0x026b, B:79:0x0272, B:81:0x0283, B:82:0x0289, B:86:0x029a, B:93:0x02a8, B:95:0x02c5, B:96:0x02cb, B:100:0x02dc, B:102:0x02e3, B:105:0x02ee, B:107:0x02fb, B:109:0x0303, B:113:0x030c, B:117:0x031d, B:122:0x0328, B:130:0x033d, B:132:0x0355, B:134:0x0372, B:137:0x037c, B:141:0x038d, B:145:0x0396, B:147:0x03a0, B:149:0x03a8, B:150:0x03b0, B:155:0x03cc, B:157:0x03d2, B:158:0x03da, B:162:0x03f4, B:164:0x0401, B:165:0x0407, B:169:0x0417, B:173:0x0420, B:174:0x042a, B:176:0x0430, B:125:0x0330, B:129:0x0339, B:61:0x0217, B:62:0x021d, B:53:0x01e1, B:36:0x0179, B:25:0x00e0, B:20:0x00ba), top: B:210:0x0083 }] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02c5 A[Catch: all -> 0x00b1, SQLiteException -> 0x00b6, TRY_LEAVE, TryCatch #5 {SQLiteException -> 0x00b6, blocks: (B:4:0x0083, B:8:0x008d, B:9:0x0091, B:10:0x0096, B:13:0x00a6, B:21:0x00c1, B:23:0x00d4, B:26:0x00e8, B:28:0x012a, B:33:0x0134, B:37:0x017e, B:39:0x01ad, B:44:0x01b7, B:48:0x01c8, B:50:0x01cf, B:54:0x01e5, B:56:0x01f0, B:57:0x0202, B:59:0x020d, B:63:0x0233, B:65:0x0240, B:67:0x0249, B:69:0x0251, B:73:0x025a, B:77:0x026b, B:79:0x0272, B:81:0x0283, B:82:0x0289, B:86:0x029a, B:93:0x02a8, B:95:0x02c5, B:96:0x02cb, B:100:0x02dc, B:102:0x02e3, B:105:0x02ee, B:107:0x02fb, B:109:0x0303, B:113:0x030c, B:117:0x031d, B:122:0x0328, B:130:0x033d, B:132:0x0355, B:134:0x0372, B:137:0x037c, B:141:0x038d, B:145:0x0396, B:147:0x03a0, B:149:0x03a8, B:150:0x03b0, B:155:0x03cc, B:157:0x03d2, B:158:0x03da, B:162:0x03f4, B:164:0x0401, B:165:0x0407, B:169:0x0417, B:173:0x0420, B:174:0x042a, B:176:0x0430, B:125:0x0330, B:129:0x0339, B:61:0x0217, B:62:0x021d, B:53:0x01e1, B:36:0x0179, B:25:0x00e0, B:20:0x00ba), top: B:210:0x0083 }] */
    /* renamed from: יᵔ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final p456.C5231 m12069(java.lang.String r53) {
        /*
            Method dump skipped, instructions count: 1139
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p456.C5348.m12069(java.lang.String):ﾞⁱ.ʻʿ");
    }

    /* renamed from: ـᐧ, reason: contains not printable characters */
    public final void m12070(String str) {
        C5322 c5322M12054;
        m12068("events_snapshot", str);
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = m12074().query("events", (String[]) Collections.singletonList("name").toArray(new String[0]), "app_id=?", new String[]{str}, null, null, null);
                if (!cursorQuery.moveToFirst()) {
                    cursorQuery.close();
                    return;
                }
                do {
                    String string = cursorQuery.getString(0);
                    if (string != null && (c5322M12054 = m12054("events", str, string)) != null) {
                        m12044("events_snapshot", c5322M12054);
                    }
                } while (cursorQuery.moveToNext());
                cursorQuery.close();
            } catch (SQLiteException e) {
                ˏᵢ().f20571.m4529(C5301.m11911(str), e, "Error creating snapshot. appId");
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
            }
        } catch (Throwable th) {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            throw th;
        }
    }

    /* renamed from: ـᵢ, reason: contains not printable characters */
    public final long m12071(String str) throws Throwable {
        AbstractC4753.m10688(str);
        AbstractC4753.m10688("first_open_count");
        ʼᵎ();
        m11909();
        SQLiteDatabase sQLiteDatabaseM12074 = m12074();
        sQLiteDatabaseM12074.beginTransaction();
        long j = 0;
        try {
            try {
                try {
                    long jM12052 = m12052("select first_open_count from app2 where app_id=?", new String[]{str}, -1L);
                    if (jM12052 == -1) {
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("app_id", str);
                        contentValues.put("first_open_count", (Integer) 0);
                        contentValues.put("previous_install_count", (Integer) 0);
                        if (sQLiteDatabaseM12074.insertWithOnConflict("app2", null, contentValues, 5) == -1) {
                            ˏᵢ().f20571.m4529(C5301.m11911(str), "first_open_count", "Failed to insert column (got -1). appId");
                            sQLiteDatabaseM12074.endTransaction();
                            return -1L;
                        }
                        jM12052 = 0;
                    }
                    try {
                        ContentValues contentValues2 = new ContentValues();
                        contentValues2.put("app_id", str);
                        contentValues2.put("first_open_count", Long.valueOf(1 + jM12052));
                        if (sQLiteDatabaseM12074.update("app2", contentValues2, "app_id = ?", new String[]{str}) == 0) {
                            ˏᵢ().f20571.m4529(C5301.m11911(str), "first_open_count", "Failed to update column (got 0). appId");
                            sQLiteDatabaseM12074.endTransaction();
                            return -1L;
                        }
                        sQLiteDatabaseM12074.setTransactionSuccessful();
                        sQLiteDatabaseM12074.endTransaction();
                        return jM12052;
                    } catch (SQLiteException e) {
                        e = e;
                        j = jM12052;
                        ˏᵢ().f20571.m4530("Error inserting column. appId", C5301.m11911(str), "first_open_count", e);
                        sQLiteDatabaseM12074.endTransaction();
                        return j;
                    }
                } catch (SQLiteException e2) {
                    e = e2;
                }
            } catch (SQLiteException e3) {
                e = e3;
            } catch (Throwable th) {
                th = th;
                sQLiteDatabaseM12074.endTransaction();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            sQLiteDatabaseM12074.endTransaction();
            throw th;
        }
    }

    /* renamed from: ٴᵔ, reason: contains not printable characters */
    public final void m12072(List list) throws SQLException {
        ʼᵎ();
        m11909();
        AbstractC4753.m10683(list);
        if (((ArrayList) list).size() == 0) {
            throw new IllegalArgumentException("Given Integer is zero");
        }
        if (m12079()) {
            String str = ᵎˏ.ˑי("(", TextUtils.join(",", list), ")");
            if (m12061("SELECT COUNT(1) FROM queue WHERE rowid IN " + str + " AND retry_count =  2147483647 LIMIT 1", null) > 0) {
                ˏᵢ().f20568.m4533("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                m12074().execSQL("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN " + str + " AND (retry_count IS NULL OR retry_count < 2147483647)");
            } catch (SQLiteException e) {
                ˏᵢ().f20571.m4531(e, "Error incrementing retry count. error");
            }
        }
    }

    /* renamed from: ᴵˊ, reason: contains not printable characters */
    public final void m12073(String str, C5356 c5356) {
        AbstractC4753.m10683(str);
        AbstractC4753.m10683(c5356);
        ʼᵎ();
        m11909();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("consent_state", c5356.m12146());
        contentValues.put("consent_source", Integer.valueOf(c5356.f20782));
        m12042(contentValues);
    }

    @Override // p456.AbstractC5295
    /* renamed from: ᴵˋ */
    public final boolean mo11760() {
        return false;
    }

    /* renamed from: ᴵᴵ, reason: contains not printable characters */
    public final SQLiteDatabase m12074() {
        ʼᵎ();
        try {
            return this.f20755.getWritableDatabase();
        } catch (SQLiteException e) {
            ˏᵢ().f20568.m4531(e, "Error opening database");
            throw e;
        }
    }

    /* renamed from: ᵎˑ, reason: contains not printable characters */
    public final List m12075(String str) {
        AbstractC4753.m10688(str);
        ʼᵎ();
        m11909();
        ArrayList arrayList = new ArrayList();
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = m12074().query("user_attributes", new String[]{"name", "origin", "set_timestamp", "value"}, "app_id=?", new String[]{str}, null, null, "rowid", "1000");
                if (!cursorQuery.moveToFirst()) {
                    cursorQuery.close();
                    return arrayList;
                }
                do {
                    String string = cursorQuery.getString(0);
                    String string2 = cursorQuery.getString(1);
                    if (string2 == null) {
                        string2 = "";
                    }
                    String str2 = string2;
                    long j = cursorQuery.getLong(2);
                    Object objM12056 = m12056(cursorQuery, 3);
                    if (objM12056 == null) {
                        ˏᵢ().f20571.m4531(C5301.m11911(str), "Read invalid user property value, ignoring it. appId");
                    } else {
                        arrayList.add(new C5234(str, str2, string, j, objM12056));
                    }
                } while (cursorQuery.moveToNext());
                cursorQuery.close();
                return arrayList;
            } catch (SQLiteException e) {
                ˏᵢ().f20571.m4529(C5301.m11911(str), e, "Error querying user properties. appId");
                List listEmptyList = Collections.emptyList();
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                return listEmptyList;
            }
        } catch (Throwable th) {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            throw th;
        }
    }

    /* renamed from: ᵔˊ, reason: contains not printable characters */
    public final void m12076() {
        m11909();
        m12074().beginTransaction();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003c  */
    /* JADX WARN: Type inference failed for: r0v0, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v4, types: [android.database.Cursor] */
    /* renamed from: ᵔᵢ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String m12077() throws java.lang.Throwable {
        /*
            r6 = this;
            android.database.sqlite.SQLiteDatabase r0 = r6.m12074()
            r1 = 0
            java.lang.String r2 = "select app_id from queue order by has_realtime desc, rowid asc limit 1;"
            android.database.Cursor r0 = r0.rawQuery(r2, r1)     // Catch: java.lang.Throwable -> L22 android.database.sqlite.SQLiteException -> L27
            boolean r2 = r0.moveToFirst()     // Catch: java.lang.Throwable -> L1a android.database.sqlite.SQLiteException -> L1c
            if (r2 == 0) goto L1e
            r2 = 0
            java.lang.String r1 = r0.getString(r2)     // Catch: java.lang.Throwable -> L1a android.database.sqlite.SQLiteException -> L1c
            r0.close()
            return r1
        L1a:
            r1 = move-exception
            goto L3a
        L1c:
            r2 = move-exception
            goto L29
        L1e:
            r0.close()
            return r1
        L22:
            r0 = move-exception
            r5 = r1
            r1 = r0
            r0 = r5
            goto L3a
        L27:
            r2 = move-exception
            r0 = r1
        L29:
            ﾞⁱ.ـˆ r3 = r6.ˏᵢ()     // Catch: java.lang.Throwable -> L1a
            ʽˉ.ʽᐧ r3 = r3.f20571     // Catch: java.lang.Throwable -> L1a
            java.lang.String r4 = "Database error getting next bundle app id"
            r3.m4531(r2, r4)     // Catch: java.lang.Throwable -> L1a
            if (r0 == 0) goto L39
            r0.close()
        L39:
            return r1
        L3a:
            if (r0 == 0) goto L3f
            r0.close()
        L3f:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p456.C5348.m12077():java.lang.String");
    }

    /* renamed from: ᵢˎ, reason: contains not printable characters */
    public final List m12078(int i, int i2, String str) {
        byte[] bArrM11899;
        long jM2324;
        long jM23242;
        ʼᵎ();
        m11909();
        int i3 = 1;
        AbstractC4753.m10685(i > 0);
        AbstractC4753.m10685(i2 > 0);
        AbstractC4753.m10688(str);
        Cursor cursor = null;
        try {
            try {
                Cursor cursorQuery = m12074().query("queue", new String[]{"rowid", "data", "retry_count"}, "app_id=?", new String[]{str}, null, null, "rowid", String.valueOf(i));
                if (!cursorQuery.moveToFirst()) {
                    List listEmptyList = Collections.emptyList();
                    cursorQuery.close();
                    return listEmptyList;
                }
                ArrayList arrayList = new ArrayList();
                int length = 0;
                while (true) {
                    long j = cursorQuery.getLong(0);
                    try {
                        bArrM11899 = m12021().m11899(cursorQuery.getBlob(i3));
                    } catch (IOException e) {
                        ˏᵢ().f20571.m4529(C5301.m11911(str), e, "Failed to unzip queued bundle. appId");
                    }
                    if (!arrayList.isEmpty() && bArrM11899.length + length > i2) {
                        break;
                    }
                    try {
                        C0416 c0416 = (C0416) C5292.m11876(C0302.m1685(), bArrM11899);
                        if (!arrayList.isEmpty()) {
                            C0302 c0302 = (C0302) ((Pair) arrayList.get(0)).first;
                            C0302 c03022 = (C0302) c0416.m1821();
                            if (!c0302.m1731().equals(c03022.m1731()) || !c0302.m1776().equals(c03022.m1776()) || c0302.m1756() != c03022.m1756() || !c0302.m1747().equals(c03022.m1747())) {
                                break;
                            }
                            Iterator it = c0302.m1728().iterator();
                            while (true) {
                                jM2324 = -1;
                                if (!it.hasNext()) {
                                    jM23242 = -1;
                                    break;
                                }
                                C0492 c0492 = (C0492) it.next();
                                if ("_npa".equals(c0492.m2318())) {
                                    jM23242 = c0492.m2324();
                                    break;
                                }
                            }
                            Iterator it2 = c03022.m1728().iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    break;
                                }
                                C0492 c04922 = (C0492) it2.next();
                                if ("_npa".equals(c04922.m2318())) {
                                    jM2324 = c04922.m2324();
                                    break;
                                }
                            }
                            if (jM23242 != jM2324) {
                                break;
                            }
                        }
                        if (!cursorQuery.isNull(2)) {
                            int i4 = cursorQuery.getInt(2);
                            c0416.m1820();
                            C0302.m1640((C0302) c0416.f2428, i4);
                        }
                        length += bArrM11899.length;
                        arrayList.add(Pair.create((C0302) c0416.m1821(), Long.valueOf(j)));
                    } catch (IOException e2) {
                        ˏᵢ().f20571.m4529(C5301.m11911(str), e2, "Failed to merge queued bundle. appId");
                    }
                    if (!cursorQuery.moveToNext() || length > i2) {
                        break;
                    }
                    i3 = 1;
                }
                cursorQuery.close();
                return arrayList;
            } catch (SQLiteException e3) {
                ˏᵢ().f20571.m4529(C5301.m11911(str), e3, "Error querying bundles. appId");
                List listEmptyList2 = Collections.emptyList();
                if (0 != 0) {
                    cursor.close();
                }
                return listEmptyList2;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    /* renamed from: ᵢᴵ, reason: contains not printable characters */
    public final boolean m12079() {
        return ((C5236) ((ﹳﹳ) this).ᐧⁱ).f20114.getDatabasePath("google_app_measurement.db").exists();
    }

    /* renamed from: ᵢⁱ, reason: contains not printable characters */
    public final void m12080(String str, C5307 c5307) {
        ʼᵎ();
        m11909();
        AbstractC4753.m10688(str);
        ((C5236) ((ﹳﹳ) this).ᐧⁱ).f20107.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jM11722 = jCurrentTimeMillis - C5245.m11722();
        long j = c5307.f20586;
        if (j < jM11722 || j > C5245.m11722() + jCurrentTimeMillis) {
            C5301 c5301 = ˏᵢ();
            c5301.f20568.m4530("Storing trigger URI outside of the max retention time span. appId, now, timestamp", C5301.m11911(str), Long.valueOf(jCurrentTimeMillis), Long.valueOf(j));
        }
        ˏᵢ().f20566.m4533("Saving trigger URI");
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("trigger_uri", c5307.f20588);
        contentValues.put("source", Integer.valueOf(c5307.f20587));
        contentValues.put("timestamp_millis", Long.valueOf(j));
        try {
            if (m12074().insert("trigger_uris", null, contentValues) == -1) {
                ˏᵢ().f20571.m4531(C5301.m11911(str), "Failed to insert trigger URI (got -1). appId");
            }
        } catch (SQLiteException e) {
            C5301 c53012 = ˏᵢ();
            c53012.f20571.m4529(C5301.m11911(str), e, "Error storing trigger URI. appId");
        }
    }

    /* renamed from: ⁱˏ, reason: contains not printable characters */
    public final boolean m12081(String str, int i, C0530 c0530) {
        m11909();
        ʼᵎ();
        AbstractC4753.m10688(str);
        AbstractC4753.m10683(c0530);
        if (c0530.m2429().isEmpty()) {
            ˏᵢ().f20568.m4530("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", C5301.m11911(str), Integer.valueOf(i), String.valueOf(c0530.m2422() ? Integer.valueOf(c0530.m2419()) : null));
            return false;
        }
        byte[] bArrM2512 = c0530.m2512();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("audience_id", Integer.valueOf(i));
        contentValues.put("filter_id", c0530.m2422() ? Integer.valueOf(c0530.m2419()) : null);
        contentValues.put("event_name", c0530.m2429());
        contentValues.put("session_scoped", c0530.m2425() ? Boolean.valueOf(c0530.m2426()) : null);
        contentValues.put("data", bArrM2512);
        try {
            if (m12074().insertWithOnConflict("event_filters", null, contentValues, 5) != -1) {
                return true;
            }
            ˏᵢ().f20571.m4531(C5301.m11911(str), "Failed to insert event filter (got -1). appId");
            return true;
        } catch (SQLiteException e) {
            ˏᵢ().f20571.m4529(C5301.m11911(str), e, "Error storing event filter. appId");
            return false;
        }
    }

    /* renamed from: ⁱי, reason: contains not printable characters */
    public final boolean m12082(String str) {
        C0472.m2260();
        return ((C5236) ((ﹳﹳ) this).ᐧⁱ).f20123.m11727(null, AbstractC5248.f20217) && m12061(ᐧʻ.ﾞˊ("SELECT COUNT(1) > 0 FROM upload_queue WHERE ", m12057()), new String[]{str}) != 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0116  */
    /* renamed from: ⁱᵎ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final p456.C5345 m12083(java.lang.String r28, java.lang.String r29) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 282
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p456.C5348.m12083(java.lang.String, java.lang.String):ﾞⁱ.ﹳﹳ");
    }

    /* renamed from: ⁱﹳ, reason: contains not printable characters */
    public final C5356 m12084(String str) {
        AbstractC4753.m10683(str);
        ʼᵎ();
        m11909();
        return C5356.m12140(100, m12051("select storage_consent_at_bundling from consent_settings where app_id=? limit 1;", new String[]{str}));
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0095  */
    /* renamed from: ⁱﾞ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final p456.C5234 m12085(java.lang.String r11, java.lang.String r12) {
        /*
            r10 = this;
            p417.AbstractC4753.m10688(r11)
            p417.AbstractC4753.m10688(r12)
            r10.ʼᵎ()
            r10.m11909()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r10.m12074()     // Catch: java.lang.Throwable -> L70 android.database.sqlite.SQLiteException -> L72
            java.lang.String r2 = "user_attributes"
            java.lang.String r3 = "set_timestamp"
            java.lang.String r4 = "value"
            java.lang.String r5 = "origin"
            java.lang.String[] r3 = new java.lang.String[]{r3, r4, r5}     // Catch: java.lang.Throwable -> L70 android.database.sqlite.SQLiteException -> L72
            java.lang.String r4 = "app_id=? and name=?"
            java.lang.String[] r5 = new java.lang.String[]{r11, r12}     // Catch: java.lang.Throwable -> L70 android.database.sqlite.SQLiteException -> L72
            r8 = 0
            r6 = 0
            r7 = 0
            android.database.Cursor r1 = r1.query(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L70 android.database.sqlite.SQLiteException -> L72
            boolean r2 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteException -> L6a
            if (r2 != 0) goto L34
            r1.close()
            return r0
        L34:
            r2 = 0
            long r7 = r1.getLong(r2)     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteException -> L6a
            r2 = 1
            java.lang.Object r9 = r10.m12056(r1, r2)     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteException -> L6a
            if (r9 != 0) goto L44
            r1.close()
            return r0
        L44:
            r2 = 2
            java.lang.String r5 = r1.getString(r2)     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteException -> L6a
            ﾞⁱ.ʻـ r2 = new ﾞⁱ.ʻـ     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteException -> L6a
            r3 = r2
            r4 = r11
            r6 = r12
            r3.<init>(r4, r5, r6, r7, r9)     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteException -> L6a
            boolean r3 = r1.moveToNext()     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteException -> L6a
            if (r3 == 0) goto L6c
            ﾞⁱ.ـˆ r3 = r10.ˏᵢ()     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteException -> L6a
            ʽˉ.ʽᐧ r3 = r3.f20571     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteException -> L6a
            java.lang.String r4 = "Got multiple records for user property, expected one. appId"
            ﾞⁱ.ʾʼ r5 = p456.C5301.m11911(r11)     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteException -> L6a
            r3.m4531(r5, r4)     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteException -> L6a
            goto L6c
        L67:
            r11 = move-exception
            r0 = r1
            goto L93
        L6a:
            r2 = move-exception
            goto L74
        L6c:
            r1.close()
            return r2
        L70:
            r11 = move-exception
            goto L93
        L72:
            r2 = move-exception
            r1 = r0
        L74:
            ﾞⁱ.ـˆ r3 = r10.ˏᵢ()     // Catch: java.lang.Throwable -> L67
            ʽˉ.ʽᐧ r3 = r3.f20571     // Catch: java.lang.Throwable -> L67
            java.lang.String r4 = "Error querying user property. appId"
            ﾞⁱ.ʾʼ r11 = p456.C5301.m11911(r11)     // Catch: java.lang.Throwable -> L67
            java.lang.Object r5 = r10.ᐧⁱ     // Catch: java.lang.Throwable -> L67
            ﾞⁱ.ʻﹳ r5 = (p456.C5236) r5     // Catch: java.lang.Throwable -> L67
            ﾞⁱ.ˋˉ r5 = r5.f20108     // Catch: java.lang.Throwable -> L67
            java.lang.String r12 = r5.m11773(r12)     // Catch: java.lang.Throwable -> L67
            r3.m4530(r4, r11, r12, r2)     // Catch: java.lang.Throwable -> L67
            if (r1 == 0) goto L92
            r1.close()
        L92:
            return r0
        L93:
            if (r0 == 0) goto L98
            r0.close()
        L98:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p456.C5348.m12085(java.lang.String, java.lang.String):ﾞⁱ.ʻـ");
    }

    /* renamed from: ﹳ, reason: contains not printable characters */
    public final void m12086(String str, Long l, long j, C0304 c0304) {
        ʼᵎ();
        m11909();
        AbstractC4753.m10683(c0304);
        AbstractC4753.m10688(str);
        byte[] bArrM2512 = c0304.m2512();
        C5301 c5301 = ˏᵢ();
        c5301.f20566.m4529(((C5236) ((ﹳﹳ) this).ᐧⁱ).f20108.m11769(str), Integer.valueOf(bArrM2512.length), "Saving complex main event, appId, data size");
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("event_id", l);
        contentValues.put("children_to_process", Long.valueOf(j));
        contentValues.put("main_event", bArrM2512);
        try {
            if (m12074().insertWithOnConflict("main_event_params", null, contentValues, 5) == -1) {
                ˏᵢ().f20571.m4531(C5301.m11911(str), "Failed to insert complex main event (got -1). appId");
            }
        } catch (SQLiteException e) {
            C5301 c53012 = ˏᵢ();
            c53012.f20571.m4529(C5301.m11911(str), e, "Error storing complex main event. appId");
        }
    }

    /* renamed from: ﹳˋ, reason: contains not printable characters */
    public final void m12087(String str) throws SQLException {
        ʼᵎ();
        m11909();
        try {
            m12074().execSQL("delete from default_event_params where app_id=?", new String[]{str});
        } catch (SQLiteException e) {
            ˏᵢ().f20571.m4531(e, "Error clearing default event params");
        }
    }

    /* renamed from: ﹳﾞ, reason: contains not printable characters */
    public final void m12088() {
        m11909();
        m12074().endTransaction();
    }

    /* renamed from: ﾞʾ, reason: contains not printable characters */
    public final void m12089(String str, String str2) {
        AbstractC4753.m10688(str);
        AbstractC4753.m10688(str2);
        ʼᵎ();
        m11909();
        try {
            m12074().delete("user_attributes", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e) {
            C5301 c5301 = ˏᵢ();
            c5301.f20571.m4530("Error deleting user property. appId", C5301.m11911(str), ((C5236) ((ﹳﹳ) this).ᐧⁱ).f20108.m11773(str2), e);
        }
    }

    /* renamed from: ﾞי, reason: contains not printable characters */
    public final boolean m12090(String str, int i, C0569 c0569) {
        m11909();
        ʼᵎ();
        AbstractC4753.m10688(str);
        AbstractC4753.m10683(c0569);
        if (c0569.m2516().isEmpty()) {
            ˏᵢ().f20568.m4530("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", C5301.m11911(str), Integer.valueOf(i), String.valueOf(c0569.m2518() ? Integer.valueOf(c0569.m2520()) : null));
            return false;
        }
        byte[] bArrM2512 = c0569.m2512();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("audience_id", Integer.valueOf(i));
        contentValues.put("filter_id", c0569.m2518() ? Integer.valueOf(c0569.m2520()) : null);
        contentValues.put("property_name", c0569.m2516());
        contentValues.put("session_scoped", c0569.m2521() ? Boolean.valueOf(c0569.m2522()) : null);
        contentValues.put("data", bArrM2512);
        try {
            if (m12074().insertWithOnConflict("property_filters", null, contentValues, 5) != -1) {
                return true;
            }
            ˏᵢ().f20571.m4531(C5301.m11911(str), "Failed to insert property filter (got -1). appId");
            return false;
        } catch (SQLiteException e) {
            ˏᵢ().f20571.m4529(C5301.m11911(str), e, "Error storing property filter. appId");
            return false;
        }
    }

    /* renamed from: ﾞﹳ, reason: contains not printable characters */
    public final long m12091(String str) {
        AbstractC4753.m10688(str);
        return m12052("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[]{str}, 0L);
    }
}
