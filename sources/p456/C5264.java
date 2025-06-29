package p456;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.SystemClock;
import com.google.android.gms.internal.measurement.C0327;
import com.google.android.gms.internal.measurement.C0407;
import p061.C1403;
import p238.C3097;
import ʿﾞ.ﹳﹳ;

/* renamed from: ﾞⁱ.ˉⁱ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C5264 extends SQLiteOpenHelper {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final /* synthetic */ ﹳﹳ f20388;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final /* synthetic */ int f20389;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5264(Context context, String str) {
        super(context, str.equals("") ? null : str, (SQLiteDatabase.CursorFactory) null, 1);
        int i = C0327.f2446;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C5264(C5346 c5346, Context context) {
        this(context, "google_app_measurement_local.db");
        this.f20389 = 1;
        this.f20388 = c5346;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C5264(C5348 c5348, Context context) {
        this(context, "google_app_measurement.db");
        this.f20389 = 0;
        this.f20388 = c5348;
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    private final void m11763(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    private final void m11764(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    private final void m11765(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    private final void m11766(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final SQLiteDatabase getWritableDatabase() {
        switch (this.f20389) {
            case 0:
                C5348 c5348 = (C5348) this.f20388;
                C1403 c1403 = c5348.f20754;
                if (c1403.f5732 != 0) {
                    ((C3097) c1403.f5733).getClass();
                    if (SystemClock.elapsedRealtime() - c1403.f5732 < 3600000) {
                        throw new SQLiteException("Database open failed");
                    }
                }
                try {
                    return super.getWritableDatabase();
                } catch (SQLiteException unused) {
                    C1403 c14032 = c5348.f20754;
                    ((C3097) c14032.f5733).getClass();
                    c14032.f5732 = SystemClock.elapsedRealtime();
                    c5348.ˏᵢ().f20571.m4533("Opening the database failed, dropping and recreating it");
                    if (!((C5236) ((ﹳﹳ) c5348).ᐧⁱ).f20114.getDatabasePath("google_app_measurement.db").delete()) {
                        c5348.ˏᵢ().f20571.m4531("google_app_measurement.db", "Failed to delete corrupted db file");
                    }
                    try {
                        SQLiteDatabase writableDatabase = super.getWritableDatabase();
                        c14032.f5732 = 0L;
                        return writableDatabase;
                    } catch (SQLiteException e) {
                        c5348.ˏᵢ().f20571.m4531(e, "Failed to open freshly created database");
                        throw e;
                    }
                }
            default:
                try {
                    return super.getWritableDatabase();
                } catch (SQLiteDatabaseLockedException e2) {
                    throw e2;
                } catch (SQLiteException unused2) {
                    C5346 c5346 = (C5346) this.f20388;
                    c5346.ˏᵢ().f20571.m4533("Opening the local database failed, dropping and recreating it");
                    if (!((C5236) ((ﹳﹳ) c5346).ᐧⁱ).f20114.getDatabasePath("google_app_measurement_local.db").delete()) {
                        c5346.ˏᵢ().f20571.m4531("google_app_measurement_local.db", "Failed to delete corrupted local db file");
                    }
                    try {
                        return super.getWritableDatabase();
                    } catch (SQLiteException e3) {
                        c5346.ˏᵢ().f20571.m4531(e3, "Failed to open local database. Events will bypass local storage");
                        return null;
                    }
                }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        switch (this.f20389) {
            case 0:
                AbstractC5310.m11925(((C5348) this.f20388).ˏᵢ(), sQLiteDatabase);
                break;
            default:
                AbstractC5310.m11925(((C5346) this.f20388).ˏᵢ(), sQLiteDatabase);
                break;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        int i3 = this.f20389;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) throws SQLException {
        switch (this.f20389) {
            case 0:
                C5348 c5348 = (C5348) this.f20388;
                AbstractC5310.m11926(c5348.ˏᵢ(), sQLiteDatabase, "events", "CREATE TABLE IF NOT EXISTS events ( app_id TEXT NOT NULL, name TEXT NOT NULL, lifetime_count INTEGER NOT NULL, current_bundle_count INTEGER NOT NULL, last_fire_timestamp INTEGER NOT NULL, PRIMARY KEY (app_id, name)) ;", "app_id,name,lifetime_count,current_bundle_count,last_fire_timestamp", C5348.f20750);
                AbstractC5310.m11926(c5348.ˏᵢ(), sQLiteDatabase, "events_snapshot", "CREATE TABLE IF NOT EXISTS events_snapshot ( app_id TEXT NOT NULL, name TEXT NOT NULL, lifetime_count INTEGER NOT NULL, current_bundle_count INTEGER NOT NULL, last_fire_timestamp INTEGER NOT NULL, last_bundled_timestamp INTEGER, last_bundled_day INTEGER, last_sampled_complex_event_id INTEGER, last_sampling_rate INTEGER, last_exempt_from_sampling INTEGER, current_session_count INTEGER, PRIMARY KEY (app_id, name)) ;", "app_id,name,lifetime_count,current_bundle_count,last_fire_timestamp,last_bundled_timestamp,last_bundled_day,last_sampled_complex_event_id,last_sampling_rate,last_exempt_from_sampling,current_session_count", null);
                AbstractC5310.m11926(c5348.ˏᵢ(), sQLiteDatabase, "conditional_properties", "CREATE TABLE IF NOT EXISTS conditional_properties ( app_id TEXT NOT NULL, origin TEXT NOT NULL, name TEXT NOT NULL, value BLOB NOT NULL, creation_timestamp INTEGER NOT NULL, active INTEGER NOT NULL, trigger_event_name TEXT, trigger_timeout INTEGER NOT NULL, timed_out_event BLOB,triggered_event BLOB, triggered_timestamp INTEGER NOT NULL, time_to_live INTEGER NOT NULL, expired_event BLOB, PRIMARY KEY (app_id, name)) ;", "app_id,origin,name,value,active,trigger_event_name,trigger_timeout,creation_timestamp,timed_out_event,triggered_event,triggered_timestamp,time_to_live,expired_event", null);
                AbstractC5310.m11926(c5348.ˏᵢ(), sQLiteDatabase, "user_attributes", "CREATE TABLE IF NOT EXISTS user_attributes ( app_id TEXT NOT NULL, name TEXT NOT NULL, set_timestamp INTEGER NOT NULL, value BLOB NOT NULL, PRIMARY KEY (app_id, name)) ;", "app_id,name,set_timestamp,value", C5348.f20752);
                AbstractC5310.m11926(c5348.ˏᵢ(), sQLiteDatabase, "apps", "CREATE TABLE IF NOT EXISTS apps ( app_id TEXT NOT NULL, app_instance_id TEXT, gmp_app_id TEXT, resettable_device_id_hash TEXT, last_bundle_index INTEGER NOT NULL, last_bundle_end_timestamp INTEGER NOT NULL, PRIMARY KEY (app_id)) ;", "app_id,app_instance_id,gmp_app_id,resettable_device_id_hash,last_bundle_index,last_bundle_end_timestamp", C5348.f20745);
                AbstractC5310.m11926(c5348.ˏᵢ(), sQLiteDatabase, "queue", "CREATE TABLE IF NOT EXISTS queue ( app_id TEXT NOT NULL, bundle_end_timestamp INTEGER NOT NULL, data BLOB NOT NULL);", "app_id,bundle_end_timestamp,data", C5348.f20749);
                AbstractC5310.m11926(c5348.ˏᵢ(), sQLiteDatabase, "raw_events_metadata", "CREATE TABLE IF NOT EXISTS raw_events_metadata ( app_id TEXT NOT NULL, metadata_fingerprint INTEGER NOT NULL, metadata BLOB NOT NULL, PRIMARY KEY (app_id, metadata_fingerprint));", "app_id,metadata_fingerprint,metadata", null);
                AbstractC5310.m11926(c5348.ˏᵢ(), sQLiteDatabase, "raw_events", "CREATE TABLE IF NOT EXISTS raw_events ( app_id TEXT NOT NULL, name TEXT NOT NULL, timestamp INTEGER NOT NULL, metadata_fingerprint INTEGER NOT NULL, data BLOB NOT NULL);", "app_id,name,timestamp,metadata_fingerprint,data", C5348.f20748);
                AbstractC5310.m11926(c5348.ˏᵢ(), sQLiteDatabase, "event_filters", "CREATE TABLE IF NOT EXISTS event_filters ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, filter_id INTEGER NOT NULL, event_name TEXT NOT NULL, data BLOB NOT NULL, PRIMARY KEY (app_id, event_name, audience_id, filter_id));", "app_id,audience_id,filter_id,event_name,data", C5348.f20753);
                AbstractC5310.m11926(c5348.ˏᵢ(), sQLiteDatabase, "property_filters", "CREATE TABLE IF NOT EXISTS property_filters ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, filter_id INTEGER NOT NULL, property_name TEXT NOT NULL, data BLOB NOT NULL, PRIMARY KEY (app_id, property_name, audience_id, filter_id));", "app_id,audience_id,filter_id,property_name,data", C5348.f20744);
                AbstractC5310.m11926(c5348.ˏᵢ(), sQLiteDatabase, "audience_filter_values", "CREATE TABLE IF NOT EXISTS audience_filter_values ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, current_results BLOB, PRIMARY KEY (app_id, audience_id));", "app_id,audience_id,current_results", null);
                AbstractC5310.m11926(c5348.ˏᵢ(), sQLiteDatabase, "app2", "CREATE TABLE IF NOT EXISTS app2 ( app_id TEXT NOT NULL, first_open_count INTEGER NOT NULL, PRIMARY KEY (app_id));", "app_id,first_open_count", C5348.f20747);
                AbstractC5310.m11926(c5348.ˏᵢ(), sQLiteDatabase, "main_event_params", "CREATE TABLE IF NOT EXISTS main_event_params ( app_id TEXT NOT NULL, event_id TEXT NOT NULL, children_to_process INTEGER NOT NULL, main_event BLOB NOT NULL, PRIMARY KEY (app_id));", "app_id,event_id,children_to_process,main_event", null);
                AbstractC5310.m11926(c5348.ˏᵢ(), sQLiteDatabase, "default_event_params", "CREATE TABLE IF NOT EXISTS default_event_params ( app_id TEXT NOT NULL, parameters BLOB NOT NULL, PRIMARY KEY (app_id));", "app_id,parameters", null);
                AbstractC5310.m11926(c5348.ˏᵢ(), sQLiteDatabase, "consent_settings", "CREATE TABLE IF NOT EXISTS consent_settings ( app_id TEXT NOT NULL, consent_state TEXT NOT NULL, PRIMARY KEY (app_id));", "app_id,consent_state", C5348.f20746);
                C0407.m2142();
                AbstractC5310.m11926(c5348.ˏᵢ(), sQLiteDatabase, "trigger_uris", "CREATE TABLE IF NOT EXISTS trigger_uris ( app_id TEXT NOT NULL, trigger_uri TEXT NOT NULL, timestamp_millis INTEGER NOT NULL, source INTEGER NOT NULL);", "app_id,trigger_uri,source,timestamp_millis", C5348.f20751);
                AbstractC5310.m11926(c5348.ˏᵢ(), sQLiteDatabase, "upload_queue", "CREATE TABLE IF NOT EXISTS upload_queue ( app_id TEXT NOT NULL, upload_uri TEXT NOT NULL, upload_headers TEXT NOT NULL, upload_type INTEGER NOT NULL, measurement_batch BLOB NOT NULL, retry_count INTEGER NOT NULL, creation_timestamp INTEGER NOT NULL );", "app_id,upload_uri,upload_headers,upload_type,measurement_batch,retry_count,creation_timestamp", null);
                break;
            default:
                AbstractC5310.m11926(((C5346) this.f20388).ˏᵢ(), sQLiteDatabase, "messages", "create table if not exists messages ( type INTEGER NOT NULL, entry BLOB NOT NULL)", "type,entry", null);
                break;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        int i3 = this.f20389;
    }
}
