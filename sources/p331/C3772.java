package p331;

import android.database.Cursor;
import androidx.work.impl.WorkDatabase_Impl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;
import p065.AbstractC1502;
import p065.C1529;
import p080.AbstractC1702;
import p090.C1743;
import p145.AbstractC2234;
import p406.C4649;
import p457.C5358;
import p457.C5363;
import ˏʼ.ʽᐧ;
import ﾞﹶ.ᵢʿ;

/* renamed from: ᴵﹳ.ᵎˏ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3772 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final C3757 f14593;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final C3766 f14594;

    /* renamed from: ˉי, reason: contains not printable characters */
    public final C3766 f14595;

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public final C3766 f14596;

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public final C3766 f14597;

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public final C3766 f14598;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final C3766 f14599;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final C3766 f14600;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final WorkDatabase_Impl f14601;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final C3766 f14602;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final C3766 f14603;

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public final C3766 f14604;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final C3766 f14605;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final C3766 f14606;

    public C3772(WorkDatabase_Impl workDatabase_Impl) {
        this.f14601 = workDatabase_Impl;
        this.f14593 = new C3757(workDatabase_Impl, 5);
        new C3766(workDatabase_Impl, 12);
        this.f14600 = new C3766(workDatabase_Impl, 13);
        this.f14605 = new C3766(workDatabase_Impl, 14);
        this.f14594 = new C3766(workDatabase_Impl, 15);
        this.f14602 = new C3766(workDatabase_Impl, 16);
        this.f14603 = new C3766(workDatabase_Impl, 17);
        this.f14599 = new C3766(workDatabase_Impl, 18);
        this.f14606 = new C3766(workDatabase_Impl, 19);
        this.f14595 = new C3766(workDatabase_Impl, 4);
        new C3766(workDatabase_Impl, 5);
        this.f14598 = new C3766(workDatabase_Impl, 6);
        this.f14596 = new C3766(workDatabase_Impl, 7);
        this.f14597 = new C3766(workDatabase_Impl, 8);
        new C3766(workDatabase_Impl, 9);
        new C3766(workDatabase_Impl, 10);
        this.f14604 = new C3766(workDatabase_Impl, 11);
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final void m8820(HashMap map) {
        Set setKeySet = map.keySet();
        if (setKeySet.isEmpty()) {
            return;
        }
        if (map.size() > 999) {
            AbstractC2234.m6235(map, new C3773(this, 0));
            return;
        }
        StringBuilder sbM5407 = AbstractC1702.m5407("SELECT `tag`,`work_spec_id` FROM `WorkTag` WHERE `work_spec_id` IN (");
        int size = setKeySet.size();
        AbstractC2234.m6229(size, sbM5407);
        sbM5407.append(")");
        String string = sbM5407.toString();
        TreeMap treeMap = C1529.f6210;
        C1529 c1529M5069 = AbstractC1502.m5069(size, string);
        Iterator it = setKeySet.iterator();
        int i = 1;
        while (it.hasNext()) {
            c1529M5069.mo4420(i, (String) it.next());
            i++;
        }
        Cursor cursorM5052 = this.f14601.m5052(c1529M5069, null);
        try {
            int iM6230 = AbstractC2234.m6230(cursorM5052, "work_spec_id");
            if (iM6230 == -1) {
                return;
            }
            while (cursorM5052.moveToNext()) {
                ArrayList arrayList = (ArrayList) map.get(cursorM5052.getString(iM6230));
                if (arrayList != null) {
                    arrayList.add(cursorM5052.getString(0));
                }
            }
        } finally {
            cursorM5052.close();
        }
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final ArrayList m8821(int i) throws Throwable {
        C1529 c1529;
        int i2;
        boolean z;
        String string;
        int i3;
        int i4;
        boolean z2;
        int i5;
        boolean z3;
        int i6;
        boolean z4;
        int i7;
        boolean z5;
        TreeMap treeMap = C1529.f6210;
        C1529 c1529M5069 = AbstractC1502.m5069(1, "SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY last_enqueue_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND LENGTH(content_uri_triggers)=0 AND state NOT IN (2, 3, 5))");
        c1529M5069.mo4419(1, i);
        WorkDatabase_Impl workDatabase_Impl = this.f14601;
        workDatabase_Impl.m5041();
        Cursor cursorM5052 = workDatabase_Impl.m5052(c1529M5069, null);
        try {
            int iM6231 = AbstractC2234.m6231(cursorM5052, "id");
            int iM62312 = AbstractC2234.m6231(cursorM5052, "state");
            int iM62313 = AbstractC2234.m6231(cursorM5052, "worker_class_name");
            int iM62314 = AbstractC2234.m6231(cursorM5052, "input_merger_class_name");
            int iM62315 = AbstractC2234.m6231(cursorM5052, "input");
            int iM62316 = AbstractC2234.m6231(cursorM5052, "output");
            int iM62317 = AbstractC2234.m6231(cursorM5052, "initial_delay");
            int iM62318 = AbstractC2234.m6231(cursorM5052, "interval_duration");
            int iM62319 = AbstractC2234.m6231(cursorM5052, "flex_duration");
            int iM623110 = AbstractC2234.m6231(cursorM5052, "run_attempt_count");
            int iM623111 = AbstractC2234.m6231(cursorM5052, "backoff_policy");
            int iM623112 = AbstractC2234.m6231(cursorM5052, "backoff_delay_duration");
            int iM623113 = AbstractC2234.m6231(cursorM5052, "last_enqueue_time");
            int iM623114 = AbstractC2234.m6231(cursorM5052, "minimum_retention_duration");
            c1529 = c1529M5069;
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
                int i8 = iM623114;
                ArrayList arrayList = new ArrayList(cursorM5052.getCount());
                while (cursorM5052.moveToNext()) {
                    String string2 = cursorM5052.getString(iM6231);
                    int i9 = ᵢʿ.ᵎˏ(cursorM5052.getInt(iM62312));
                    String string3 = cursorM5052.getString(iM62313);
                    String string4 = cursorM5052.getString(iM62314);
                    C5363 c5363M12156 = C5363.m12156(cursorM5052.getBlob(iM62315));
                    C5363 c5363M121562 = C5363.m12156(cursorM5052.getBlob(iM62316));
                    long j = cursorM5052.getLong(iM62317);
                    long j2 = cursorM5052.getLong(iM62318);
                    long j3 = cursorM5052.getLong(iM62319);
                    int i10 = cursorM5052.getInt(iM623110);
                    int i11 = ᵢʿ.ˑי(cursorM5052.getInt(iM623111));
                    long j4 = cursorM5052.getLong(iM623112);
                    long j5 = cursorM5052.getLong(iM623113);
                    int i12 = i8;
                    long j6 = cursorM5052.getLong(i12);
                    int i13 = iM6231;
                    int i14 = iM623115;
                    long j7 = cursorM5052.getLong(i14);
                    iM623115 = i14;
                    int i15 = iM623116;
                    if (cursorM5052.getInt(i15) != 0) {
                        iM623116 = i15;
                        i2 = iM623117;
                        z = true;
                    } else {
                        iM623116 = i15;
                        i2 = iM623117;
                        z = false;
                    }
                    int i16 = ᵢʿ.ˎٴ(cursorM5052.getInt(i2));
                    iM623117 = i2;
                    int i17 = iM623118;
                    int i18 = cursorM5052.getInt(i17);
                    iM623118 = i17;
                    int i19 = iM623119;
                    int i20 = cursorM5052.getInt(i19);
                    iM623119 = i19;
                    int i21 = iM623120;
                    long j8 = cursorM5052.getLong(i21);
                    iM623120 = i21;
                    int i22 = iM623121;
                    int i23 = cursorM5052.getInt(i22);
                    iM623121 = i22;
                    int i24 = iM623122;
                    int i25 = cursorM5052.getInt(i24);
                    iM623122 = i24;
                    int i26 = iM623123;
                    if (cursorM5052.isNull(i26)) {
                        iM623123 = i26;
                        i3 = iM623124;
                        string = null;
                    } else {
                        string = cursorM5052.getString(i26);
                        iM623123 = i26;
                        i3 = iM623124;
                    }
                    int i27 = ᵢʿ.ᵎـ(cursorM5052.getInt(i3));
                    iM623124 = i3;
                    int i28 = iM623125;
                    C4649 c4649 = ᵢʿ.ˆʿ(cursorM5052.getBlob(i28));
                    iM623125 = i28;
                    int i29 = iM623126;
                    if (cursorM5052.getInt(i29) != 0) {
                        iM623126 = i29;
                        i4 = iM623127;
                        z2 = true;
                    } else {
                        iM623126 = i29;
                        i4 = iM623127;
                        z2 = false;
                    }
                    if (cursorM5052.getInt(i4) != 0) {
                        iM623127 = i4;
                        i5 = iM623128;
                        z3 = true;
                    } else {
                        iM623127 = i4;
                        i5 = iM623128;
                        z3 = false;
                    }
                    if (cursorM5052.getInt(i5) != 0) {
                        iM623128 = i5;
                        i6 = iM623129;
                        z4 = true;
                    } else {
                        iM623128 = i5;
                        i6 = iM623129;
                        z4 = false;
                    }
                    if (cursorM5052.getInt(i6) != 0) {
                        iM623129 = i6;
                        i7 = iM623130;
                        z5 = true;
                    } else {
                        iM623129 = i6;
                        i7 = iM623130;
                        z5 = false;
                    }
                    long j9 = cursorM5052.getLong(i7);
                    iM623130 = i7;
                    int i30 = iM623131;
                    long j10 = cursorM5052.getLong(i30);
                    iM623131 = i30;
                    int i31 = iM623132;
                    iM623132 = i31;
                    arrayList.add(new C3768(string2, i9, string3, string4, c5363M12156, c5363M121562, j, j2, j3, new C5358(c4649, i27, z2, z3, z4, z5, j9, j10, ᵢʿ.ʽᐧ(cursorM5052.getBlob(i31))), i10, i11, j4, j5, j6, j7, z, i16, i18, i20, j8, i23, i25, string));
                    iM6231 = i13;
                    i8 = i12;
                }
                cursorM5052.close();
                c1529.m5111();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                cursorM5052.close();
                c1529.m5111();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            c1529 = c1529M5069;
        }
    }

    /* renamed from: ˉי, reason: contains not printable characters */
    public final C3768 m8822(String str) {
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
        C3768 c3768;
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
        TreeMap treeMap = C1529.f6210;
        C1529 c1529M5069 = AbstractC1502.m5069(1, "SELECT * FROM workspec WHERE id=?");
        c1529M5069.mo4420(1, str);
        WorkDatabase_Impl workDatabase_Impl = this.f14601;
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
            if (cursorM5052.moveToFirst()) {
                String string2 = cursorM5052.getString(iM6231);
                int i7 = ᵢʿ.ᵎˏ(cursorM5052.getInt(iM62312));
                String string3 = cursorM5052.getString(iM62313);
                String string4 = cursorM5052.getString(iM62314);
                C5363 c5363M12156 = C5363.m12156(cursorM5052.getBlob(iM62315));
                C5363 c5363M121562 = C5363.m12156(cursorM5052.getBlob(iM62316));
                long j = cursorM5052.getLong(iM62317);
                long j2 = cursorM5052.getLong(iM62318);
                long j3 = cursorM5052.getLong(iM62319);
                int i8 = cursorM5052.getInt(iM623110);
                int i9 = ᵢʿ.ˑי(cursorM5052.getInt(iM623111));
                long j4 = cursorM5052.getLong(iM623112);
                long j5 = cursorM5052.getLong(iM623113);
                long j6 = cursorM5052.getLong(iM623114);
                long j7 = cursorM5052.getLong(iM623115);
                if (cursorM5052.getInt(iM623116) != 0) {
                    i = iM623117;
                    z = true;
                } else {
                    i = iM623117;
                    z = false;
                }
                int i10 = ᵢʿ.ˎٴ(cursorM5052.getInt(i));
                int i11 = cursorM5052.getInt(iM623118);
                int i12 = cursorM5052.getInt(iM623119);
                long j8 = cursorM5052.getLong(iM623120);
                int i13 = cursorM5052.getInt(iM623121);
                int i14 = cursorM5052.getInt(iM623122);
                if (cursorM5052.isNull(iM623123)) {
                    i2 = iM623124;
                    string = null;
                } else {
                    string = cursorM5052.getString(iM623123);
                    i2 = iM623124;
                }
                int i15 = ᵢʿ.ᵎـ(cursorM5052.getInt(i2));
                C4649 c4649 = ᵢʿ.ˆʿ(cursorM5052.getBlob(iM623125));
                if (cursorM5052.getInt(iM623126) != 0) {
                    i3 = iM623127;
                    z2 = true;
                } else {
                    i3 = iM623127;
                    z2 = false;
                }
                if (cursorM5052.getInt(i3) != 0) {
                    i4 = iM623128;
                    z3 = true;
                } else {
                    i4 = iM623128;
                    z3 = false;
                }
                if (cursorM5052.getInt(i4) != 0) {
                    i5 = iM623129;
                    z4 = true;
                } else {
                    i5 = iM623129;
                    z4 = false;
                }
                if (cursorM5052.getInt(i5) != 0) {
                    i6 = iM623130;
                    z5 = true;
                } else {
                    i6 = iM623130;
                    z5 = false;
                }
                c3768 = new C3768(string2, i7, string3, string4, c5363M12156, c5363M121562, j, j2, j3, new C5358(c4649, i15, z2, z3, z4, z5, cursorM5052.getLong(i6), cursorM5052.getLong(iM623131), ᵢʿ.ʽᐧ(cursorM5052.getBlob(iM623132))), i8, i9, j4, j5, j6, j7, z, i10, i11, i12, j8, i13, i14, string);
            } else {
                c3768 = null;
            }
            cursorM5052.close();
            c1529.m5111();
            return c3768;
        } catch (Throwable th2) {
            th = th2;
            cursorM5052.close();
            c1529.m5111();
            throw th;
        }
    }

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public final void m8823(String str, long j) {
        WorkDatabase_Impl workDatabase_Impl = this.f14601;
        workDatabase_Impl.m5041();
        C3766 c3766 = this.f14596;
        C1743 c1743M5108 = c3766.m5108();
        c1743M5108.mo4419(1, j);
        c1743M5108.mo4420(2, str);
        try {
            workDatabase_Impl.m5048();
            try {
                c1743M5108.m5462();
                workDatabase_Impl.m5055();
            } finally {
                workDatabase_Impl.m5046();
            }
        } finally {
            c3766.m5105(c1743M5108);
        }
    }

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public final void m8824(int i, String str) {
        WorkDatabase_Impl workDatabase_Impl = this.f14601;
        workDatabase_Impl.m5041();
        C3766 c3766 = this.f14598;
        C1743 c1743M5108 = c3766.m5108();
        c1743M5108.mo4420(1, str);
        c1743M5108.mo4419(2, i);
        try {
            workDatabase_Impl.m5048();
            try {
                c1743M5108.m5462();
                workDatabase_Impl.m5055();
            } finally {
                workDatabase_Impl.m5046();
            }
        } finally {
            c3766.m5105(c1743M5108);
        }
    }

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public final ArrayList m8825(String str) {
        TreeMap treeMap = C1529.f6210;
        C1529 c1529M5069 = AbstractC1502.m5069(1, "SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)");
        c1529M5069.mo4420(1, str);
        WorkDatabase_Impl workDatabase_Impl = this.f14601;
        workDatabase_Impl.m5041();
        Cursor cursorM5052 = workDatabase_Impl.m5052(c1529M5069, null);
        try {
            ArrayList arrayList = new ArrayList(cursorM5052.getCount());
            while (cursorM5052.moveToNext()) {
                String string = cursorM5052.getString(0);
                int i = ᵢʿ.ᵎˏ(cursorM5052.getInt(1));
                C3771 c3771 = new C3771();
                c3771.f14592 = string;
                c3771.f14591 = i;
                arrayList.add(c3771);
            }
            return arrayList;
        } finally {
            cursorM5052.close();
            c1529M5069.m5111();
        }
    }

    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public final void m8826(String str, C5363 c5363) {
        WorkDatabase_Impl workDatabase_Impl = this.f14601;
        workDatabase_Impl.m5041();
        C3766 c3766 = this.f14603;
        C1743 c1743M5108 = c3766.m5108();
        C5363 c53632 = C5363.f20820;
        c1743M5108.mo4423(1, ʽᐧ.ˆᵔ(c5363));
        c1743M5108.mo4420(2, str);
        try {
            workDatabase_Impl.m5048();
            try {
                c1743M5108.m5462();
                workDatabase_Impl.m5055();
            } finally {
                workDatabase_Impl.m5046();
            }
        } finally {
            c3766.m5105(c1743M5108);
        }
    }

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final ArrayList m8827() {
        C1529 c1529;
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
        TreeMap treeMap = C1529.f6210;
        C1529 c1529M5069 = AbstractC1502.m5069(0, "SELECT * FROM workspec WHERE state=0 AND schedule_requested_at<>-1");
        WorkDatabase_Impl workDatabase_Impl = this.f14601;
        workDatabase_Impl.m5041();
        Cursor cursorM5052 = workDatabase_Impl.m5052(c1529M5069, null);
        try {
            int iM6231 = AbstractC2234.m6231(cursorM5052, "id");
            int iM62312 = AbstractC2234.m6231(cursorM5052, "state");
            int iM62313 = AbstractC2234.m6231(cursorM5052, "worker_class_name");
            int iM62314 = AbstractC2234.m6231(cursorM5052, "input_merger_class_name");
            int iM62315 = AbstractC2234.m6231(cursorM5052, "input");
            int iM62316 = AbstractC2234.m6231(cursorM5052, "output");
            int iM62317 = AbstractC2234.m6231(cursorM5052, "initial_delay");
            int iM62318 = AbstractC2234.m6231(cursorM5052, "interval_duration");
            int iM62319 = AbstractC2234.m6231(cursorM5052, "flex_duration");
            int iM623110 = AbstractC2234.m6231(cursorM5052, "run_attempt_count");
            int iM623111 = AbstractC2234.m6231(cursorM5052, "backoff_policy");
            int iM623112 = AbstractC2234.m6231(cursorM5052, "backoff_delay_duration");
            int iM623113 = AbstractC2234.m6231(cursorM5052, "last_enqueue_time");
            int iM623114 = AbstractC2234.m6231(cursorM5052, "minimum_retention_duration");
            c1529 = c1529M5069;
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
                return arrayList;
            } catch (Throwable th) {
                th = th;
                cursorM5052.close();
                c1529.m5111();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            c1529 = c1529M5069;
        }
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final void m8828(String str) {
        WorkDatabase_Impl workDatabase_Impl = this.f14601;
        workDatabase_Impl.m5041();
        C3766 c3766 = this.f14600;
        C1743 c1743M5108 = c3766.m5108();
        c1743M5108.mo4420(1, str);
        try {
            workDatabase_Impl.m5048();
            try {
                c1743M5108.m5462();
                workDatabase_Impl.m5055();
            } finally {
                workDatabase_Impl.m5046();
            }
        } finally {
            c3766.m5105(c1743M5108);
        }
    }

    /* renamed from: ˑי, reason: contains not printable characters */
    public final void m8829(int i, String str) {
        WorkDatabase_Impl workDatabase_Impl = this.f14601;
        workDatabase_Impl.m5041();
        C3766 c3766 = this.f14605;
        C1743 c1743M5108 = c3766.m5108();
        c1743M5108.mo4419(1, ᵢʿ.ﹳˑ(i));
        c1743M5108.mo4420(2, str);
        try {
            workDatabase_Impl.m5048();
            try {
                c1743M5108.m5462();
                workDatabase_Impl.m5055();
            } finally {
                workDatabase_Impl.m5046();
            }
        } finally {
            c3766.m5105(c1743M5108);
        }
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void m8830(HashMap map) {
        Set setKeySet = map.keySet();
        if (setKeySet.isEmpty()) {
            return;
        }
        if (map.size() > 999) {
            AbstractC2234.m6235(map, new C3773(this, 1));
            return;
        }
        StringBuilder sbM5407 = AbstractC1702.m5407("SELECT `progress`,`work_spec_id` FROM `WorkProgress` WHERE `work_spec_id` IN (");
        int size = setKeySet.size();
        AbstractC2234.m6229(size, sbM5407);
        sbM5407.append(")");
        String string = sbM5407.toString();
        TreeMap treeMap = C1529.f6210;
        C1529 c1529M5069 = AbstractC1502.m5069(size, string);
        Iterator it = setKeySet.iterator();
        int i = 1;
        while (it.hasNext()) {
            c1529M5069.mo4420(i, (String) it.next());
            i++;
        }
        Cursor cursorM5052 = this.f14601.m5052(c1529M5069, null);
        try {
            int iM6230 = AbstractC2234.m6230(cursorM5052, "work_spec_id");
            if (iM6230 == -1) {
                return;
            }
            while (cursorM5052.moveToNext()) {
                ArrayList arrayList = (ArrayList) map.get(cursorM5052.getString(iM6230));
                if (arrayList != null) {
                    arrayList.add(C5363.m12156(cursorM5052.getBlob(0)));
                }
            }
        } finally {
            cursorM5052.close();
        }
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final ArrayList m8831() throws Throwable {
        C1529 c1529;
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
        TreeMap treeMap = C1529.f6210;
        C1529 c1529M5069 = AbstractC1502.m5069(0, "SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 AND LENGTH(content_uri_triggers)<>0 ORDER BY last_enqueue_time");
        WorkDatabase_Impl workDatabase_Impl = this.f14601;
        workDatabase_Impl.m5041();
        Cursor cursorM5052 = workDatabase_Impl.m5052(c1529M5069, null);
        try {
            int iM6231 = AbstractC2234.m6231(cursorM5052, "id");
            int iM62312 = AbstractC2234.m6231(cursorM5052, "state");
            int iM62313 = AbstractC2234.m6231(cursorM5052, "worker_class_name");
            int iM62314 = AbstractC2234.m6231(cursorM5052, "input_merger_class_name");
            int iM62315 = AbstractC2234.m6231(cursorM5052, "input");
            int iM62316 = AbstractC2234.m6231(cursorM5052, "output");
            int iM62317 = AbstractC2234.m6231(cursorM5052, "initial_delay");
            int iM62318 = AbstractC2234.m6231(cursorM5052, "interval_duration");
            int iM62319 = AbstractC2234.m6231(cursorM5052, "flex_duration");
            int iM623110 = AbstractC2234.m6231(cursorM5052, "run_attempt_count");
            int iM623111 = AbstractC2234.m6231(cursorM5052, "backoff_policy");
            int iM623112 = AbstractC2234.m6231(cursorM5052, "backoff_delay_duration");
            int iM623113 = AbstractC2234.m6231(cursorM5052, "last_enqueue_time");
            int iM623114 = AbstractC2234.m6231(cursorM5052, "minimum_retention_duration");
            c1529 = c1529M5069;
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
                return arrayList;
            } catch (Throwable th) {
                th = th;
                cursorM5052.close();
                c1529.m5111();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            c1529 = c1529M5069;
        }
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final ArrayList m8832() throws Throwable {
        C1529 c1529;
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
        TreeMap treeMap = C1529.f6210;
        C1529 c1529M5069 = AbstractC1502.m5069(0, "SELECT * FROM workspec WHERE state=1");
        WorkDatabase_Impl workDatabase_Impl = this.f14601;
        workDatabase_Impl.m5041();
        Cursor cursorM5052 = workDatabase_Impl.m5052(c1529M5069, null);
        try {
            int iM6231 = AbstractC2234.m6231(cursorM5052, "id");
            int iM62312 = AbstractC2234.m6231(cursorM5052, "state");
            int iM62313 = AbstractC2234.m6231(cursorM5052, "worker_class_name");
            int iM62314 = AbstractC2234.m6231(cursorM5052, "input_merger_class_name");
            int iM62315 = AbstractC2234.m6231(cursorM5052, "input");
            int iM62316 = AbstractC2234.m6231(cursorM5052, "output");
            int iM62317 = AbstractC2234.m6231(cursorM5052, "initial_delay");
            int iM62318 = AbstractC2234.m6231(cursorM5052, "interval_duration");
            int iM62319 = AbstractC2234.m6231(cursorM5052, "flex_duration");
            int iM623110 = AbstractC2234.m6231(cursorM5052, "run_attempt_count");
            int iM623111 = AbstractC2234.m6231(cursorM5052, "backoff_policy");
            int iM623112 = AbstractC2234.m6231(cursorM5052, "backoff_delay_duration");
            int iM623113 = AbstractC2234.m6231(cursorM5052, "last_enqueue_time");
            int iM623114 = AbstractC2234.m6231(cursorM5052, "minimum_retention_duration");
            c1529 = c1529M5069;
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
                return arrayList;
            } catch (Throwable th) {
                th = th;
                cursorM5052.close();
                c1529.m5111();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            c1529 = c1529M5069;
        }
    }

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public final void m8833(String str, long j) {
        WorkDatabase_Impl workDatabase_Impl = this.f14601;
        workDatabase_Impl.m5041();
        C3766 c3766 = this.f14599;
        C1743 c1743M5108 = c3766.m5108();
        c1743M5108.mo4419(1, j);
        c1743M5108.mo4420(2, str);
        try {
            workDatabase_Impl.m5048();
            try {
                c1743M5108.m5462();
                workDatabase_Impl.m5055();
            } finally {
                workDatabase_Impl.m5046();
            }
        } finally {
            c3766.m5105(c1743M5108);
        }
    }

    /* renamed from: ᵎـ, reason: contains not printable characters */
    public final void m8834(int i, String str) {
        WorkDatabase_Impl workDatabase_Impl = this.f14601;
        workDatabase_Impl.m5041();
        C3766 c3766 = this.f14604;
        C1743 c1743M5108 = c3766.m5108();
        c1743M5108.mo4419(1, i);
        c1743M5108.mo4420(2, str);
        try {
            workDatabase_Impl.m5048();
            try {
                c1743M5108.m5462();
                workDatabase_Impl.m5055();
            } finally {
                workDatabase_Impl.m5046();
            }
        } finally {
            c3766.m5105(c1743M5108);
        }
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final ArrayList m8835() throws Throwable {
        C1529 c1529;
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
        TreeMap treeMap = C1529.f6210;
        C1529 c1529M5069 = AbstractC1502.m5069(1, "SELECT * FROM workspec WHERE state=0 ORDER BY last_enqueue_time LIMIT ?");
        c1529M5069.mo4419(1, 200);
        WorkDatabase_Impl workDatabase_Impl = this.f14601;
        workDatabase_Impl.m5041();
        Cursor cursorM5052 = workDatabase_Impl.m5052(c1529M5069, null);
        try {
            int iM6231 = AbstractC2234.m6231(cursorM5052, "id");
            int iM62312 = AbstractC2234.m6231(cursorM5052, "state");
            int iM62313 = AbstractC2234.m6231(cursorM5052, "worker_class_name");
            int iM62314 = AbstractC2234.m6231(cursorM5052, "input_merger_class_name");
            int iM62315 = AbstractC2234.m6231(cursorM5052, "input");
            int iM62316 = AbstractC2234.m6231(cursorM5052, "output");
            int iM62317 = AbstractC2234.m6231(cursorM5052, "initial_delay");
            int iM62318 = AbstractC2234.m6231(cursorM5052, "interval_duration");
            int iM62319 = AbstractC2234.m6231(cursorM5052, "flex_duration");
            int iM623110 = AbstractC2234.m6231(cursorM5052, "run_attempt_count");
            int iM623111 = AbstractC2234.m6231(cursorM5052, "backoff_policy");
            int iM623112 = AbstractC2234.m6231(cursorM5052, "backoff_delay_duration");
            int iM623113 = AbstractC2234.m6231(cursorM5052, "last_enqueue_time");
            int iM623114 = AbstractC2234.m6231(cursorM5052, "minimum_retention_duration");
            c1529 = c1529M5069;
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
                return arrayList;
            } catch (Throwable th) {
                th = th;
                cursorM5052.close();
                c1529.m5111();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            c1529 = c1529M5069;
        }
    }

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final int m8836(String str) {
        TreeMap treeMap = C1529.f6210;
        C1529 c1529M5069 = AbstractC1502.m5069(1, "SELECT state FROM workspec WHERE id=?");
        c1529M5069.mo4420(1, str);
        WorkDatabase_Impl workDatabase_Impl = this.f14601;
        workDatabase_Impl.m5041();
        Integer numValueOf = null;
        Cursor cursorM5052 = workDatabase_Impl.m5052(c1529M5069, null);
        try {
            int i = 0;
            if (cursorM5052.moveToFirst()) {
                if (!cursorM5052.isNull(0)) {
                    numValueOf = Integer.valueOf(cursorM5052.getInt(0));
                }
                if (numValueOf != null) {
                    i = ᵢʿ.ᵎˏ(numValueOf.intValue());
                }
            }
            return i;
        } finally {
            cursorM5052.close();
            c1529M5069.m5111();
        }
    }
}
