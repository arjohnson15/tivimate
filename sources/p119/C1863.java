package p119;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import j$.time.ZoneOffset;
import j$.time.format.DateTimeFormatter;
import j$.util.DateRetargetClass;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* renamed from: ˈˉ.ᐧʻ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1863 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final SharedPreferences f7121;

    public C1863(Context context, String str) {
        this.f7121 = context.getSharedPreferences("FirebaseHeartBeat" + str, 0);
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final synchronized void m5619() {
        try {
            SharedPreferences.Editor editorEdit = this.f7121.edit();
            int i = 0;
            for (Map.Entry<String, ?> entry : this.f7121.getAll().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    Set set = (Set) entry.getValue();
                    String strM5626 = m5626(System.currentTimeMillis());
                    String key = entry.getKey();
                    if (set.contains(strM5626)) {
                        HashSet hashSet = new HashSet();
                        hashSet.add(strM5626);
                        i++;
                        editorEdit.putStringSet(key, hashSet);
                    } else {
                        editorEdit.remove(key);
                    }
                }
            }
            if (i == 0) {
                editorEdit.remove("fire-count");
            } else {
                editorEdit.putLong("fire-count", i);
            }
            editorEdit.commit();
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final synchronized String m5620(String str) {
        for (Map.Entry<String, ?> entry : this.f7121.getAll().entrySet()) {
            if (entry.getValue() instanceof Set) {
                Iterator it = ((Set) entry.getValue()).iterator();
                while (it.hasNext()) {
                    if (str.equals((String) it.next())) {
                        return entry.getKey();
                    }
                }
            }
        }
        return null;
    }

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final synchronized void m5621(long j) {
        this.f7121.edit().putLong("fire-global", j).commit();
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final synchronized ArrayList m5622() {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            for (Map.Entry<String, ?> entry : this.f7121.getAll().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    HashSet hashSet = new HashSet((Set) entry.getValue());
                    hashSet.remove(m5626(System.currentTimeMillis()));
                    if (!hashSet.isEmpty()) {
                        arrayList.add(new C1861(entry.getKey(), new ArrayList(hashSet)));
                    }
                }
            }
            m5621(System.currentTimeMillis());
        } catch (Throwable th) {
            throw th;
        }
        return arrayList;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final synchronized void m5623() {
        try {
            long j = this.f7121.getLong("fire-count", 0L);
            String key = "";
            String str = null;
            for (Map.Entry<String, ?> entry : this.f7121.getAll().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    for (String str2 : (Set) entry.getValue()) {
                        if (str == null || str.compareTo(str2) > 0) {
                            key = entry.getKey();
                            str = str2;
                        }
                    }
                }
            }
            HashSet hashSet = new HashSet(this.f7121.getStringSet(key, new HashSet()));
            hashSet.remove(str);
            this.f7121.edit().putStringSet(key, hashSet).putLong("fire-count", j - 1).commit();
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final synchronized void m5624(String str) {
        try {
            String strM5620 = m5620(str);
            if (strM5620 == null) {
                return;
            }
            HashSet hashSet = new HashSet(this.f7121.getStringSet(strM5620, new HashSet()));
            hashSet.remove(str);
            if (hashSet.isEmpty()) {
                this.f7121.edit().remove(strM5620).commit();
            } else {
                this.f7121.edit().putStringSet(strM5620, hashSet).commit();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final synchronized void m5625(String str, long j) {
        String strM5626 = m5626(j);
        if (this.f7121.getString("last-used-date", "").equals(strM5626)) {
            String strM5620 = m5620(strM5626);
            if (strM5620 == null) {
                return;
            }
            if (strM5620.equals(str)) {
                return;
            }
            m5627(str, strM5626);
            return;
        }
        long j2 = this.f7121.getLong("fire-count", 0L);
        if (j2 + 1 == 30) {
            m5623();
            j2 = this.f7121.getLong("fire-count", 0L);
        }
        HashSet hashSet = new HashSet(this.f7121.getStringSet(str, new HashSet()));
        hashSet.add(strM5626);
        this.f7121.edit().putStringSet(str, hashSet).putLong("fire-count", j2 + 1).putString("last-used-date", strM5626).commit();
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final synchronized String m5626(long j) {
        if (Build.VERSION.SDK_INT >= 26) {
            return DateRetargetClass.toInstant(new Date(j)).atOffset(ZoneOffset.UTC).toLocalDateTime().format(DateTimeFormatter.ISO_LOCAL_DATE);
        }
        return new SimpleDateFormat("yyyy-MM-dd", Locale.UK).format(new Date(j));
    }

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final synchronized void m5627(String str, String str2) {
        m5624(str2);
        HashSet hashSet = new HashSet(this.f7121.getStringSet(str, new HashSet()));
        hashSet.add(str2);
        this.f7121.edit().putStringSet(str, hashSet).commit();
    }
}
