package p396;

import android.app.ActivityManager;
import android.database.SQLException;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import j$.util.DesugarCollections;
import j$.util.Optional;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.CookieManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import org.json.JSONObject;
import p013.C1034;
import p013.C1053;
import p034.InterfaceC1229;
import p049.C1310;
import p070.AbstractC1549;
import p090.C1749;
import p127.C2034;
import p145.C2235;
import p145.C2236;
import p145.C2237;
import p145.C2243;
import p158.AbstractC2339;
import p237.C3093;
import p251.C3130;
import p251.InterfaceC3134;
import p262.InterfaceC3253;
import p262.InterfaceC3255;
import p266.C3264;
import p317.AbstractC3616;
import p317.AbstractC3629;
import p349.InterfaceC3999;
import p415.C4742;
import p417.InterfaceC4746;
import p427.C4914;
import p430.AbstractC5001;
import p430.C4997;
import p430.C5004;
import p430.InterfaceC5003;
import p456.C5236;
import p456.C5244;
import p456.C5255;
import p456.C5273;
import p456.C5280;
import p456.C5301;
import p456.C5356;
import p456.EnumC5288;
import p456.InterfaceC5269;
import p456.InterfaceC5293;
import ʿﾞ.ﹳﹳ;
import ـˊ.ʿʼ;
import ٴᐧ.ᐧⁱ;
import ᵎﹳ.ᐧʻ;
import ﹶⁱ.ـﹶ;

/* renamed from: ⁱᴵ.ˈٴ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4554 implements InterfaceC4560, InterfaceC4746, InterfaceC3253, InterfaceC3134, InterfaceC5003, InterfaceC5269, InterfaceC5293 {

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public Object f17462;

    public /* synthetic */ C4554(Object obj) {
        this.f17462 = obj;
    }

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public static C4554 m10423(String str) {
        return new C4554((TextUtils.isEmpty(str) || str.length() > 1) ? EnumC5288.f20519 : C5356.m12138(str.charAt(0)));
    }

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public static void m10424(C1749 c1749) throws SQLException {
        c1749.mo4392("CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        c1749.mo4392("CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
        c1749.mo4392("CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
        c1749.mo4392("CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT NOT NULL, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `last_enqueue_time` INTEGER NOT NULL DEFAULT -1, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `period_count` INTEGER NOT NULL DEFAULT 0, `generation` INTEGER NOT NULL DEFAULT 0, `next_schedule_time_override` INTEGER NOT NULL DEFAULT 9223372036854775807, `next_schedule_time_override_generation` INTEGER NOT NULL DEFAULT 0, `stop_reason` INTEGER NOT NULL DEFAULT -256, `trace_tag` TEXT, `required_network_type` INTEGER NOT NULL, `required_network_request` BLOB NOT NULL DEFAULT x'', `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))");
        c1749.mo4392("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
        c1749.mo4392("CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON `WorkSpec` (`last_enqueue_time`)");
        c1749.mo4392("CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        c1749.mo4392("CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
        c1749.mo4392("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `generation` INTEGER NOT NULL DEFAULT 0, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`, `generation`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        c1749.mo4392("CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        c1749.mo4392("CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
        c1749.mo4392("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        c1749.mo4392("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
        c1749.mo4392("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        c1749.mo4392("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '86254750241babac4b8d52996a675549')");
    }

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public static C1310 m10425(C1749 c1749) {
        HashMap map = new HashMap(2);
        map.put("work_spec_id", new C2237(1, 1, "work_spec_id", "TEXT", null, true));
        map.put("prerequisite_id", new C2237(2, 1, "prerequisite_id", "TEXT", null, true));
        HashSet hashSet = new HashSet(2);
        hashSet.add(new C2235("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        hashSet.add(new C2235("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("prerequisite_id"), Arrays.asList("id")));
        HashSet hashSet2 = new HashSet(2);
        hashSet2.add(new C2236("index_Dependency_work_spec_id", false, Arrays.asList("work_spec_id"), Arrays.asList("ASC")));
        hashSet2.add(new C2236("index_Dependency_prerequisite_id", false, Arrays.asList("prerequisite_id"), Arrays.asList("ASC")));
        C2243 c2243 = new C2243("Dependency", map, hashSet, hashSet2);
        C2243 c2243M6238 = C2243.m6238(c1749, "Dependency");
        if (!c2243.equals(c2243M6238)) {
            return new C1310(false, ᐧʻ.ˏᴵ("Dependency(androidx.work.impl.model.Dependency).\n Expected:\n", c2243, "\n Found:\n", c2243M6238), 2);
        }
        HashMap map2 = new HashMap(32);
        map2.put("id", new C2237(1, 1, "id", "TEXT", null, true));
        map2.put("state", new C2237(0, 1, "state", "INTEGER", null, true));
        map2.put("worker_class_name", new C2237(0, 1, "worker_class_name", "TEXT", null, true));
        map2.put("input_merger_class_name", new C2237(0, 1, "input_merger_class_name", "TEXT", null, true));
        map2.put("input", new C2237(0, 1, "input", "BLOB", null, true));
        map2.put("output", new C2237(0, 1, "output", "BLOB", null, true));
        map2.put("initial_delay", new C2237(0, 1, "initial_delay", "INTEGER", null, true));
        map2.put("interval_duration", new C2237(0, 1, "interval_duration", "INTEGER", null, true));
        map2.put("flex_duration", new C2237(0, 1, "flex_duration", "INTEGER", null, true));
        map2.put("run_attempt_count", new C2237(0, 1, "run_attempt_count", "INTEGER", null, true));
        map2.put("backoff_policy", new C2237(0, 1, "backoff_policy", "INTEGER", null, true));
        map2.put("backoff_delay_duration", new C2237(0, 1, "backoff_delay_duration", "INTEGER", null, true));
        map2.put("last_enqueue_time", new C2237(0, 1, "last_enqueue_time", "INTEGER", "-1", true));
        map2.put("minimum_retention_duration", new C2237(0, 1, "minimum_retention_duration", "INTEGER", null, true));
        map2.put("schedule_requested_at", new C2237(0, 1, "schedule_requested_at", "INTEGER", null, true));
        map2.put("run_in_foreground", new C2237(0, 1, "run_in_foreground", "INTEGER", null, true));
        map2.put("out_of_quota_policy", new C2237(0, 1, "out_of_quota_policy", "INTEGER", null, true));
        map2.put("period_count", new C2237(0, 1, "period_count", "INTEGER", "0", true));
        map2.put("generation", new C2237(0, 1, "generation", "INTEGER", "0", true));
        map2.put("next_schedule_time_override", new C2237(0, 1, "next_schedule_time_override", "INTEGER", "9223372036854775807", true));
        map2.put("next_schedule_time_override_generation", new C2237(0, 1, "next_schedule_time_override_generation", "INTEGER", "0", true));
        map2.put("stop_reason", new C2237(0, 1, "stop_reason", "INTEGER", "-256", true));
        map2.put("trace_tag", new C2237(0, 1, "trace_tag", "TEXT", null, false));
        map2.put("required_network_type", new C2237(0, 1, "required_network_type", "INTEGER", null, true));
        map2.put("required_network_request", new C2237(0, 1, "required_network_request", "BLOB", "x''", true));
        map2.put("requires_charging", new C2237(0, 1, "requires_charging", "INTEGER", null, true));
        map2.put("requires_device_idle", new C2237(0, 1, "requires_device_idle", "INTEGER", null, true));
        map2.put("requires_battery_not_low", new C2237(0, 1, "requires_battery_not_low", "INTEGER", null, true));
        map2.put("requires_storage_not_low", new C2237(0, 1, "requires_storage_not_low", "INTEGER", null, true));
        map2.put("trigger_content_update_delay", new C2237(0, 1, "trigger_content_update_delay", "INTEGER", null, true));
        map2.put("trigger_max_content_delay", new C2237(0, 1, "trigger_max_content_delay", "INTEGER", null, true));
        map2.put("content_uri_triggers", new C2237(0, 1, "content_uri_triggers", "BLOB", null, true));
        HashSet hashSet3 = new HashSet(0);
        HashSet hashSet4 = new HashSet(2);
        hashSet4.add(new C2236("index_WorkSpec_schedule_requested_at", false, Arrays.asList("schedule_requested_at"), Arrays.asList("ASC")));
        hashSet4.add(new C2236("index_WorkSpec_last_enqueue_time", false, Arrays.asList("last_enqueue_time"), Arrays.asList("ASC")));
        C2243 c22432 = new C2243("WorkSpec", map2, hashSet3, hashSet4);
        C2243 c2243M62382 = C2243.m6238(c1749, "WorkSpec");
        if (!c22432.equals(c2243M62382)) {
            return new C1310(false, ᐧʻ.ˏᴵ("WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n", c22432, "\n Found:\n", c2243M62382), 2);
        }
        HashMap map3 = new HashMap(2);
        map3.put("tag", new C2237(1, 1, "tag", "TEXT", null, true));
        map3.put("work_spec_id", new C2237(2, 1, "work_spec_id", "TEXT", null, true));
        HashSet hashSet5 = new HashSet(1);
        hashSet5.add(new C2235("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        HashSet hashSet6 = new HashSet(1);
        hashSet6.add(new C2236("index_WorkTag_work_spec_id", false, Arrays.asList("work_spec_id"), Arrays.asList("ASC")));
        C2243 c22433 = new C2243("WorkTag", map3, hashSet5, hashSet6);
        C2243 c2243M62383 = C2243.m6238(c1749, "WorkTag");
        if (!c22433.equals(c2243M62383)) {
            return new C1310(false, ᐧʻ.ˏᴵ("WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n", c22433, "\n Found:\n", c2243M62383), 2);
        }
        HashMap map4 = new HashMap(3);
        map4.put("work_spec_id", new C2237(1, 1, "work_spec_id", "TEXT", null, true));
        map4.put("generation", new C2237(2, 1, "generation", "INTEGER", "0", true));
        map4.put("system_id", new C2237(0, 1, "system_id", "INTEGER", null, true));
        HashSet hashSet7 = new HashSet(1);
        hashSet7.add(new C2235("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        C2243 c22434 = new C2243("SystemIdInfo", map4, hashSet7, new HashSet(0));
        C2243 c2243M62384 = C2243.m6238(c1749, "SystemIdInfo");
        if (!c22434.equals(c2243M62384)) {
            return new C1310(false, ᐧʻ.ˏᴵ("SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n", c22434, "\n Found:\n", c2243M62384), 2);
        }
        HashMap map5 = new HashMap(2);
        map5.put("name", new C2237(1, 1, "name", "TEXT", null, true));
        map5.put("work_spec_id", new C2237(2, 1, "work_spec_id", "TEXT", null, true));
        HashSet hashSet8 = new HashSet(1);
        hashSet8.add(new C2235("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        HashSet hashSet9 = new HashSet(1);
        hashSet9.add(new C2236("index_WorkName_work_spec_id", false, Arrays.asList("work_spec_id"), Arrays.asList("ASC")));
        C2243 c22435 = new C2243("WorkName", map5, hashSet8, hashSet9);
        C2243 c2243M62385 = C2243.m6238(c1749, "WorkName");
        if (!c22435.equals(c2243M62385)) {
            return new C1310(false, ᐧʻ.ˏᴵ("WorkName(androidx.work.impl.model.WorkName).\n Expected:\n", c22435, "\n Found:\n", c2243M62385), 2);
        }
        HashMap map6 = new HashMap(2);
        map6.put("work_spec_id", new C2237(1, 1, "work_spec_id", "TEXT", null, true));
        map6.put("progress", new C2237(0, 1, "progress", "BLOB", null, true));
        HashSet hashSet10 = new HashSet(1);
        hashSet10.add(new C2235("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        C2243 c22436 = new C2243("WorkProgress", map6, hashSet10, new HashSet(0));
        C2243 c2243M62386 = C2243.m6238(c1749, "WorkProgress");
        if (!c22436.equals(c2243M62386)) {
            return new C1310(false, ᐧʻ.ˏᴵ("WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n", c22436, "\n Found:\n", c2243M62386), 2);
        }
        HashMap map7 = new HashMap(2);
        map7.put("key", new C2237(1, 1, "key", "TEXT", null, true));
        map7.put("long_value", new C2237(0, 1, "long_value", "INTEGER", null, false));
        C2243 c22437 = new C2243("Preference", map7, new HashSet(0), new HashSet(0));
        C2243 c2243M62387 = C2243.m6238(c1749, "Preference");
        return !c22437.equals(c2243M62387) ? new C1310(false, ᐧʻ.ˏᴵ("Preference(androidx.work.impl.model.Preference).\n Expected:\n", c22437, "\n Found:\n", c2243M62387), 2) : new C1310(true, (String) null, 2);
    }

    @Override // p417.InterfaceC4746
    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public void mo10426(int i) {
        ((InterfaceC3999) this.f17462).mo8314(i);
    }

    @Override // p396.InterfaceC4560
    /* renamed from: ʿʼ */
    public Object mo8506(Object obj) {
        return Optional.ofNullable(((InterfaceC4560) this.f17462).mo8506((AbstractC5001) obj));
    }

    /* renamed from: ˉי, reason: contains not printable characters */
    public C4742 m10427(JSONObject jSONObject) {
        C3264 c3264;
        int i = jSONObject.getInt("settings_version");
        if (i != 3) {
            String str = "Could not determine SettingsJsonTransform for settings version " + i + ". Using default settings values.";
            c3264 = new C3264(11);
        } else {
            c3264 = new ʿʼ(11);
        }
        return c3264.mo8057((ᐧⁱ) this.f17462, jSONObject);
    }

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public void m10428() {
        C5255 c5255 = (C5255) this.f17462;
        c5255.m11846();
        C5280 c5280 = c5255.ᐧᴵ();
        C5236 c5236 = (C5236) ((ﹳﹳ) c5255).ᐧⁱ;
        c5236.f20107.getClass();
        if (c5280.m11857(System.currentTimeMillis())) {
            c5255.ᐧᴵ().f20473.m12011(true);
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (runningAppProcessInfo.importance == 100) {
                c5255.ˏᵢ().f20566.m4533("Detected application was in foreground");
                c5236.f20107.getClass();
                m10429(System.currentTimeMillis());
            }
        }
    }

    @Override // p251.InterfaceC3134
    /* renamed from: ˏʾ */
    public Object mo7700(C3130 c3130) {
        return ((Callable) this.f17462).call();
    }

    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public void m10429(long j) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        C5255 c5255 = (C5255) this.f17462;
        c5255.m11846();
        C5236 c5236 = (C5236) ((ﹳﹳ) c5255).ᐧⁱ;
        if (c5236.m11662()) {
            c5255.ᐧᴵ().f20480.m11314(j);
            c5236.f20107.getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            C5301 c5301 = c5255.ˏᵢ();
            c5301.f20566.m4531(Long.valueOf(jElapsedRealtime), "Session started, time");
            long j2 = j / 1000;
            c5255.m11847().m11717(j, Long.valueOf(j2), "auto", "_sid");
            c5255.ᐧᴵ().f20462.m11314(j2);
            c5255.ᐧᴵ().f20473.m12011(false);
            Bundle bundle = new Bundle();
            bundle.putLong("_sid", j2);
            c5255.m11847().m11716(j, bundle, "auto", "_s");
            String strM1603 = c5255.ᐧᴵ().f20469.m1603();
            if (TextUtils.isEmpty(strM1603)) {
                return;
            }
            Bundle bundle2 = new Bundle();
            bundle2.putString("_ffr", strM1603);
            c5255.m11847().m11716(j, bundle2, "auto", "_ssr");
        }
    }

    @Override // p417.InterfaceC4746
    /* renamed from: ˑʽ, reason: contains not printable characters */
    public void mo10430() {
        ((InterfaceC3999) this.f17462).mo8322();
    }

    @Override // p262.InterfaceC3253
    /* renamed from: ـﹶ */
    public InterfaceC3255 mo8011(String str) {
        return new C4914(((InterfaceC1229) this.f17462).mo4418());
    }

    @Override // p430.InterfaceC5003
    /* renamed from: ٴˎ, reason: contains not printable characters */
    public void mo10431(C5004 c5004, List list) throws IOException {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((C4997) it.next()).m11086(true));
        }
        try {
            ((CookieManager) this.f17462).put(c5004.m11098(), Collections.singletonMap("Set-Cookie", arrayList));
        } catch (IOException e) {
            C2034 c2034 = C2034.f7700;
            C2034 c20342 = C2034.f7700;
            StringBuilder sb = new StringBuilder("Saving cookies failed for ");
            C3093 c3093M11095 = c5004.m11095("/...");
            sb.append(c3093M11095 != null ? c3093M11095.m7602() : null);
            String string = sb.toString();
            c20342.getClass();
            C2034.m5684(5, string, e);
        }
    }

    @Override // p430.InterfaceC5003
    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public List mo10432(C5004 c5004) {
        C1053 c1053 = C1053.f4449;
        ArrayList arrayList = null;
        try {
            for (Map.Entry<String, List<String>> entry : ((CookieManager) this.f17462).get(c5004.m11098(), C1034.f4436).entrySet()) {
                String key = entry.getKey();
                List<String> value = entry.getValue();
                if ("Cookie".equalsIgnoreCase(key) || "Cookie2".equalsIgnoreCase(key)) {
                    if (value.isEmpty()) {
                        continue;
                    } else {
                        for (String str : value) {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            ArrayList arrayList2 = new ArrayList();
                            int length = str.length();
                            int i = 0;
                            while (i < length) {
                                int iM6428 = AbstractC2339.m6428(i, length, str, ";,");
                                int iM6441 = AbstractC2339.m6441(str, '=', i, iM6428);
                                String strM6449 = AbstractC2339.m6449(i, iM6441, str);
                                if (!AbstractC3629.m8560(strM6449, "$", false)) {
                                    String strM64492 = iM6441 < iM6428 ? AbstractC2339.m6449(iM6441 + 1, iM6428, str) : "";
                                    if (AbstractC3629.m8560(strM64492, "\"", false) && AbstractC3629.m8561(strM64492, "\"", false)) {
                                        strM64492 = strM64492.substring(1, strM64492.length() - 1);
                                    }
                                    if (!AbstractC1549.m5138(AbstractC3616.m8539(strM6449).toString(), strM6449)) {
                                        throw new IllegalArgumentException("name is not trimmed");
                                    }
                                    if (!AbstractC1549.m5138(AbstractC3616.m8539(strM64492).toString(), strM64492)) {
                                        throw new IllegalArgumentException("value is not trimmed");
                                    }
                                    String str2 = c5004.f18961;
                                    String str3 = ـﹶ.ʾʼ(str2);
                                    if (str3 == null) {
                                        throw new IllegalArgumentException("unexpected domain: ".concat(str2));
                                    }
                                    arrayList2.add(new C4997(strM6449, strM64492, 253402300799999L, str3, "/", false, false, false, false));
                                }
                                i = iM6428 + 1;
                            }
                            arrayList.addAll(arrayList2);
                        }
                    }
                }
            }
            return arrayList != null ? DesugarCollections.unmodifiableList(arrayList) : c1053;
        } catch (IOException e) {
            C2034 c2034 = C2034.f7700;
            C2034 c20342 = C2034.f7700;
            StringBuilder sb = new StringBuilder("Loading cookies failed for ");
            C3093 c3093M11095 = c5004.m11095("/...");
            sb.append(c3093M11095 != null ? c3093M11095.m7602() : null);
            String string = sb.toString();
            c20342.getClass();
            C2034.m5684(5, string, e);
            return c1053;
        }
    }

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public void m10433(boolean z, long j) {
        C5255 c5255 = (C5255) this.f17462;
        c5255.m11846();
        c5255.m11755();
        if (c5255.ᐧᴵ().m11857(j)) {
            c5255.ᐧᴵ().f20473.m12011(true);
            ((C5236) ((ﹳﹳ) c5255).ᐧⁱ).m11654().m11752();
        }
        c5255.ᐧᴵ().f20480.m11314(j);
        if (c5255.ᐧᴵ().f20473.m12010()) {
            m10429(j);
        }
    }

    @Override // p456.InterfaceC5293
    /* renamed from: ﹳˎ */
    public void mo7954(String str, int i, IOException iOException, byte[] bArr, Map map) {
        ((C5273) this.f17462).m11806(str, i, iOException, bArr, map);
    }

    @Override // p456.InterfaceC5269
    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public void mo10434(String str, String str2, Bundle bundle) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        C5244 c5244 = (C5244) this.f17462;
        if (!zIsEmpty) {
            ((C5236) ((ﹳﹳ) c5244).ᐧⁱ).getClass();
            throw new IllegalStateException("Unexpected call on client side");
        }
        ((C5236) ((ﹳﹳ) c5244).ᐧⁱ).f20107.getClass();
        c5244.m11710("auto", "_err", bundle, true, true, System.currentTimeMillis());
    }
}
