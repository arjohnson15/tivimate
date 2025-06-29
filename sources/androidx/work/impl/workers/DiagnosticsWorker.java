package androidx.work.impl.workers;

import android.content.Context;
import android.database.Cursor;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import java.util.ArrayList;
import java.util.TreeMap;
import java.util.concurrent.TimeUnit;
import p065.AbstractC1502;
import p065.C1529;
import p085.AbstractC1721;
import p145.AbstractC2234;
import p331.C3759;
import p331.C3761;
import p331.C3768;
import p331.C3772;
import p406.C4649;
import p414.C4722;
import p457.AbstractC5359;
import p457.C5358;
import p457.C5363;
import p457.C5385;
import p457.C5391;
import ᴵﹳ.ﹶˆ;
import ﾞﹶ.ᵢʿ;

/* loaded from: classes.dex */
public final class DiagnosticsWorker extends Worker {
    public DiagnosticsWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    @Override // androidx.work.Worker
    /* renamed from: ʿʼ */
    public final C5385 mo1371() throws Throwable {
        C1529 c1529;
        int iM6231;
        int iM62312;
        int iM62313;
        int iM62314;
        int iM62315;
        int iM62316;
        int iM62317;
        int iM62318;
        int iM62319;
        int iM623110;
        int iM623111;
        int iM623112;
        int iM623113;
        int iM623114;
        ﹶˆ r6;
        C3761 c3761;
        C3759 c3759;
        int i;
        boolean z;
        String string;
        int i2;
        int i3;
        boolean z2;
        int i4;
        boolean z3;
        int i5;
        boolean z4;
        int i6;
        boolean z5;
        C4722 c4722M10635 = C4722.m10635(this.f20828);
        WorkDatabase workDatabase = c4722M10635.f18122;
        C3772 c3772Mo1374 = workDatabase.mo1374();
        C3761 c3761Mo1377 = workDatabase.mo1377();
        C3759 c3759Mo1376 = workDatabase.mo1376();
        ﹶˆ r2 = workDatabase.mo1373();
        c4722M10635.f18131.f20795.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis() - TimeUnit.DAYS.toMillis(1L);
        c3772Mo1374.getClass();
        TreeMap treeMap = C1529.f6210;
        C1529 c1529M5069 = AbstractC1502.m5069(1, "SELECT * FROM workspec WHERE last_enqueue_time >= ? AND state IN (2, 3, 5) ORDER BY last_enqueue_time DESC");
        c1529M5069.mo4419(1, jCurrentTimeMillis);
        WorkDatabase_Impl workDatabase_Impl = c3772Mo1374.f14601;
        workDatabase_Impl.m5041();
        Cursor cursorM5052 = workDatabase_Impl.m5052(c1529M5069, null);
        try {
            iM6231 = AbstractC2234.m6231(cursorM5052, "id");
            iM62312 = AbstractC2234.m6231(cursorM5052, "state");
            iM62313 = AbstractC2234.m6231(cursorM5052, "worker_class_name");
            iM62314 = AbstractC2234.m6231(cursorM5052, "input_merger_class_name");
            iM62315 = AbstractC2234.m6231(cursorM5052, "input");
            iM62316 = AbstractC2234.m6231(cursorM5052, "output");
            iM62317 = AbstractC2234.m6231(cursorM5052, "initial_delay");
            iM62318 = AbstractC2234.m6231(cursorM5052, "interval_duration");
            iM62319 = AbstractC2234.m6231(cursorM5052, "flex_duration");
            iM623110 = AbstractC2234.m6231(cursorM5052, "run_attempt_count");
            iM623111 = AbstractC2234.m6231(cursorM5052, "backoff_policy");
            iM623112 = AbstractC2234.m6231(cursorM5052, "backoff_delay_duration");
            iM623113 = AbstractC2234.m6231(cursorM5052, "last_enqueue_time");
            iM623114 = AbstractC2234.m6231(cursorM5052, "minimum_retention_duration");
            c1529 = c1529M5069;
        } catch (Throwable th) {
            th = th;
            c1529 = c1529M5069;
        }
        try {
            int iM623115 = AbstractC2234.m6231(cursorM5052, "schedule_requested_at");
            int iM623116 = AbstractC2234.m6231(cursorM5052, "run_in_foreground");
            int iM623117 = AbstractC2234.m6231(cursorM5052, "out_of_quota_policy");
            int iM623118 = AbstractC2234.m6231(cursorM5052, "period_count");
            int iM623119 = AbstractC2234.m6231(cursorM5052, "generation");
            int iM623120 = AbstractC2234.m6231(cursorM5052, "next_schedule_time_override");
            int iM623121 = AbstractC2234.m6231(cursorM5052, "next_schedule_time_override_generation");
            int iM623122 = AbstractC2234.m6231(cursorM5052, "stop_reason");
            int iM623123 = AbstractC2234.m6231(cursorM5052, "trace_tag");
            int iM623124 = AbstractC2234.m6231(cursorM5052, "required_network_type");
            int iM623125 = AbstractC2234.m6231(cursorM5052, "required_network_request");
            int iM623126 = AbstractC2234.m6231(cursorM5052, "requires_charging");
            int iM623127 = AbstractC2234.m6231(cursorM5052, "requires_device_idle");
            int iM623128 = AbstractC2234.m6231(cursorM5052, "requires_battery_not_low");
            int iM623129 = AbstractC2234.m6231(cursorM5052, "requires_storage_not_low");
            int iM623130 = AbstractC2234.m6231(cursorM5052, "trigger_content_update_delay");
            int iM623131 = AbstractC2234.m6231(cursorM5052, "trigger_max_content_delay");
            int iM623132 = AbstractC2234.m6231(cursorM5052, "content_uri_triggers");
            int i7 = iM623114;
            ArrayList arrayList = new ArrayList(cursorM5052.getCount());
            while (cursorM5052.moveToNext()) {
                String string2 = cursorM5052.getString(iM6231);
                int i8 = ᵢʿ.ᵎˏ(cursorM5052.getInt(iM62312));
                String string3 = cursorM5052.getString(iM62313);
                String string4 = cursorM5052.getString(iM62314);
                C5363 c5363M12156 = C5363.m12156(cursorM5052.getBlob(iM62315));
                C5363 c5363M121562 = C5363.m12156(cursorM5052.getBlob(iM62316));
                long j = cursorM5052.getLong(iM62317);
                long j2 = cursorM5052.getLong(iM62318);
                long j3 = cursorM5052.getLong(iM62319);
                int i9 = cursorM5052.getInt(iM623110);
                int i10 = ᵢʿ.ˑי(cursorM5052.getInt(iM623111));
                long j4 = cursorM5052.getLong(iM623112);
                long j5 = cursorM5052.getLong(iM623113);
                int i11 = i7;
                long j6 = cursorM5052.getLong(i11);
                int i12 = iM6231;
                int i13 = iM623115;
                long j7 = cursorM5052.getLong(i13);
                iM623115 = i13;
                int i14 = iM623116;
                if (cursorM5052.getInt(i14) != 0) {
                    iM623116 = i14;
                    i = iM623117;
                    z = true;
                } else {
                    iM623116 = i14;
                    i = iM623117;
                    z = false;
                }
                int i15 = ᵢʿ.ˎٴ(cursorM5052.getInt(i));
                iM623117 = i;
                int i16 = iM623118;
                int i17 = cursorM5052.getInt(i16);
                iM623118 = i16;
                int i18 = iM623119;
                int i19 = cursorM5052.getInt(i18);
                iM623119 = i18;
                int i20 = iM623120;
                long j8 = cursorM5052.getLong(i20);
                iM623120 = i20;
                int i21 = iM623121;
                int i22 = cursorM5052.getInt(i21);
                iM623121 = i21;
                int i23 = iM623122;
                int i24 = cursorM5052.getInt(i23);
                iM623122 = i23;
                int i25 = iM623123;
                if (cursorM5052.isNull(i25)) {
                    iM623123 = i25;
                    i2 = iM623124;
                    string = null;
                } else {
                    string = cursorM5052.getString(i25);
                    iM623123 = i25;
                    i2 = iM623124;
                }
                int i26 = ᵢʿ.ᵎـ(cursorM5052.getInt(i2));
                iM623124 = i2;
                int i27 = iM623125;
                C4649 c4649 = ᵢʿ.ˆʿ(cursorM5052.getBlob(i27));
                iM623125 = i27;
                int i28 = iM623126;
                if (cursorM5052.getInt(i28) != 0) {
                    iM623126 = i28;
                    i3 = iM623127;
                    z2 = true;
                } else {
                    iM623126 = i28;
                    i3 = iM623127;
                    z2 = false;
                }
                if (cursorM5052.getInt(i3) != 0) {
                    iM623127 = i3;
                    i4 = iM623128;
                    z3 = true;
                } else {
                    iM623127 = i3;
                    i4 = iM623128;
                    z3 = false;
                }
                if (cursorM5052.getInt(i4) != 0) {
                    iM623128 = i4;
                    i5 = iM623129;
                    z4 = true;
                } else {
                    iM623128 = i4;
                    i5 = iM623129;
                    z4 = false;
                }
                if (cursorM5052.getInt(i5) != 0) {
                    iM623129 = i5;
                    i6 = iM623130;
                    z5 = true;
                } else {
                    iM623129 = i5;
                    i6 = iM623130;
                    z5 = false;
                }
                long j9 = cursorM5052.getLong(i6);
                iM623130 = i6;
                int i29 = iM623131;
                long j10 = cursorM5052.getLong(i29);
                iM623131 = i29;
                int i30 = iM623132;
                iM623132 = i30;
                arrayList.add(new C3768(string2, i8, string3, string4, c5363M12156, c5363M121562, j, j2, j3, new C5358(c4649, i26, z2, z3, z4, z5, j9, j10, ᵢʿ.ʽᐧ(cursorM5052.getBlob(i30))), i9, i10, j4, j5, j6, j7, z, i15, i17, i19, j8, i22, i24, string));
                iM6231 = i12;
                i7 = i11;
            }
            cursorM5052.close();
            c1529.m5111();
            ArrayList arrayListM8832 = c3772Mo1374.m8832();
            ArrayList arrayListM8835 = c3772Mo1374.m8835();
            if (arrayList.isEmpty()) {
                r6 = r2;
                c3761 = c3761Mo1377;
                c3759 = c3759Mo1376;
            } else {
                C5391 c5391M12163 = C5391.m12163();
                String str = AbstractC1721.f6701;
                c5391M12163.m12169(str, "Recently completed work:\n\n");
                r6 = r2;
                c3761 = c3761Mo1377;
                c3759 = c3759Mo1376;
                C5391.m12163().m12169(str, AbstractC1721.m5452(c3761, c3759, r6, arrayList));
            }
            if (!arrayListM8832.isEmpty()) {
                C5391 c5391M121632 = C5391.m12163();
                String str2 = AbstractC1721.f6701;
                c5391M121632.m12169(str2, "Running work:\n\n");
                C5391.m12163().m12169(str2, AbstractC1721.m5452(c3761, c3759, r6, arrayListM8832));
            }
            if (!arrayListM8835.isEmpty()) {
                C5391 c5391M121633 = C5391.m12163();
                String str3 = AbstractC1721.f6701;
                c5391M121633.m12169(str3, "Enqueued work:\n\n");
                C5391.m12163().m12169(str3, AbstractC1721.m5452(c3761, c3759, r6, arrayListM8835));
            }
            return AbstractC5359.m12154();
        } catch (Throwable th2) {
            th = th2;
            cursorM5052.close();
            c1529.m5111();
            throw th;
        }
    }
}
