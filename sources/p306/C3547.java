package p306;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.Arrays;
import java.util.List;
import ᵎﹳ.ᐧʻ;

/* renamed from: ᐧˈ.ˏʾ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3547 extends SQLiteOpenHelper {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public boolean f13707;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final int f13708;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public static final String f13705 = "INSERT INTO global_log_event_state VALUES (" + System.currentTimeMillis() + ")";

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public static final int f13706 = 7;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public static final List f13704 = Arrays.asList(new C3546(0), new C3546(1), new C3546(2), new C3546(3), new C3546(4), new C3546(5), new C3546(6));

    public C3547(int i, Context context, String str) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, i);
        this.f13707 = false;
        this.f13708 = i;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static void m8431(SQLiteDatabase sQLiteDatabase, int i, int i2) throws SQLException {
        List list = f13704;
        if (i2 > list.size()) {
            StringBuilder sb = ᐧʻ.ᵎـ("Migration from ", i, " to ", i2, " was requested, but cannot be performed. Only ");
            sb.append(list.size());
            sb.append(" migrations are provided");
            throw new IllegalArgumentException(sb.toString());
        }
        while (i < i2) {
            switch (((C3546) list.get(i)).f13703) {
                case 0:
                    sQLiteDatabase.execSQL("CREATE TABLE events (_id INTEGER PRIMARY KEY, context_id INTEGER NOT NULL, transport_name TEXT NOT NULL, timestamp_ms INTEGER NOT NULL, uptime_ms INTEGER NOT NULL, payload BLOB NOT NULL, code INTEGER, num_attempts INTEGER NOT NULL,FOREIGN KEY (context_id) REFERENCES transport_contexts(_id) ON DELETE CASCADE)");
                    sQLiteDatabase.execSQL("CREATE TABLE event_metadata (_id INTEGER PRIMARY KEY, event_id INTEGER NOT NULL, name TEXT NOT NULL, value TEXT NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE)");
                    sQLiteDatabase.execSQL("CREATE TABLE transport_contexts (_id INTEGER PRIMARY KEY, backend_name TEXT NOT NULL, priority INTEGER NOT NULL, next_request_ms INTEGER NOT NULL)");
                    sQLiteDatabase.execSQL("CREATE INDEX events_backend_id on events(context_id)");
                    sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority on transport_contexts(backend_name, priority)");
                    break;
                case 1:
                    sQLiteDatabase.execSQL("ALTER TABLE transport_contexts ADD COLUMN extras BLOB");
                    sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority_extras on transport_contexts(backend_name, priority, extras)");
                    sQLiteDatabase.execSQL("DROP INDEX contexts_backend_priority");
                    break;
                case 2:
                    sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN payload_encoding TEXT");
                    break;
                case 3:
                    sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN inline BOOLEAN NOT NULL DEFAULT 1");
                    sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
                    sQLiteDatabase.execSQL("CREATE TABLE event_payloads (sequence_num INTEGER NOT NULL, event_id INTEGER NOT NULL, bytes BLOB NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE,PRIMARY KEY (sequence_num, event_id))");
                    break;
                case 4:
                    sQLiteDatabase.execSQL("DROP TABLE IF EXISTS log_event_dropped");
                    sQLiteDatabase.execSQL("DROP TABLE IF EXISTS global_log_event_state");
                    sQLiteDatabase.execSQL("CREATE TABLE log_event_dropped (log_source VARCHAR(45) NOT NULL,reason INTEGER NOT NULL,events_dropped_count BIGINT NOT NULL,PRIMARY KEY(log_source, reason))");
                    sQLiteDatabase.execSQL("CREATE TABLE global_log_event_state (last_metrics_upload_ms BIGINT PRIMARY KEY)");
                    sQLiteDatabase.execSQL(f13705);
                    break;
                case 5:
                    sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN product_id INTEGER");
                    break;
                default:
                    sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN pseudonymous_id TEXT");
                    sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN experiment_ids_clear_blob BLOB");
                    sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN experiment_ids_encrypted_blob BLOB");
                    break;
            }
            i++;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        this.f13707 = true;
        sQLiteDatabase.rawQuery("PRAGMA busy_timeout=0;", new String[0]).close();
        sQLiteDatabase.setForeignKeyConstraintsEnabled(true);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) throws SQLException {
        if (!this.f13707) {
            onConfigure(sQLiteDatabase);
        }
        m8431(sQLiteDatabase, 0, this.f13708);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) throws SQLException {
        sQLiteDatabase.execSQL("DROP TABLE events");
        sQLiteDatabase.execSQL("DROP TABLE event_metadata");
        sQLiteDatabase.execSQL("DROP TABLE transport_contexts");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS log_event_dropped");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS global_log_event_state");
        if (!this.f13707) {
            onConfigure(sQLiteDatabase);
        }
        m8431(sQLiteDatabase, 0, i2);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        if (this.f13707) {
            return;
        }
        onConfigure(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) throws SQLException {
        if (!this.f13707) {
            onConfigure(sQLiteDatabase);
        }
        m8431(sQLiteDatabase, i, i2);
    }
}
