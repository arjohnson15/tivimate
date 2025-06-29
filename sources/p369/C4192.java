package p369;

import android.util.Log;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p428.AbstractC4928;
import ˉˆ.ﹳﹳ;
import ᵎﹳ.ᐧʻ;

/* renamed from: ᵢʽ.ᐧʻ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4192 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static final Charset f16159 = Charset.forName("UTF-8");

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final ﹳﹳ f16160;

    public C4192(ﹳﹳ r1) {
        this.f16160 = r1;
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static ArrayList m9612(String str) throws JSONException {
        JSONArray jSONArray = new JSONObject(str).getJSONArray("rolloutsState");
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            String string = jSONArray.getString(i);
            try {
                arrayList.add(AbstractC4186.m9597(string));
            } catch (Exception e) {
                String str2 = "Failed de-serializing rollouts state. " + string;
            }
        }
        return arrayList;
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public static String m9613(List list) {
        HashMap map = new HashMap();
        JSONArray jSONArray = new JSONArray();
        for (int i = 0; i < list.size(); i++) {
            try {
                jSONArray.put(new JSONObject(AbstractC4186.f16142.ˎٴ(list.get(i))));
            } catch (JSONException e) {
            }
        }
        map.put("rolloutsState", jSONArray);
        return new JSONObject(map).toString();
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static HashMap m9614(String str) {
        JSONObject jSONObject = new JSONObject(str);
        HashMap map = new HashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            String strOptString = null;
            if (!jSONObject.isNull(next)) {
                strOptString = jSONObject.optString(next, null);
            }
            map.put(next, strOptString);
        }
        return map;
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public static void m9615(File file) {
        if (file.exists() && file.delete()) {
            String str = "Deleted corrupt file: " + file.getAbsolutePath();
        }
    }

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final void m9616(String str, List list) throws Throwable {
        File file = this.f16160.ﹳﹳ(str, "rollouts-state");
        if (list.isEmpty()) {
            m9615(file);
            return;
        }
        BufferedWriter bufferedWriter = null;
        try {
            try {
                String strM9613 = m9613(list);
                BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), f16159));
                try {
                    bufferedWriter2.write(strM9613);
                    bufferedWriter2.flush();
                    AbstractC4928.m11051(bufferedWriter2, "Failed to close rollouts state file.");
                } catch (Exception e) {
                    bufferedWriter = bufferedWriter2;
                    m9615(file);
                    AbstractC4928.m11051(bufferedWriter, "Failed to close rollouts state file.");
                } catch (Throwable th) {
                    th = th;
                    bufferedWriter = bufferedWriter2;
                    AbstractC4928.m11051(bufferedWriter, "Failed to close rollouts state file.");
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e2) {
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [long] */
    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final Map m9617(String str, boolean z) throws Throwable {
        FileInputStream fileInputStream;
        ﹳﹳ r1 = this.f16160;
        File file = z ? r1.ﹳﹳ(str, "internal-keys") : r1.ﹳﹳ(str, "keys");
        if (file.exists()) {
            ?? length = file.length();
            if (length != 0) {
                Closeable closeable = null;
                try {
                    try {
                        fileInputStream = new FileInputStream(file);
                    } catch (Exception e) {
                        fileInputStream = null;
                    } catch (Throwable th) {
                        th = th;
                        AbstractC4928.m11051(closeable, "Failed to close user metadata file.");
                        throw th;
                    }
                    try {
                        HashMap mapM9614 = m9614(AbstractC4928.m11049(fileInputStream));
                        AbstractC4928.m11051(fileInputStream, "Failed to close user metadata file.");
                        return mapM9614;
                    } catch (Exception e2) {
                        m9615(file);
                        AbstractC4928.m11051(fileInputStream, "Failed to close user metadata file.");
                        return Collections.emptyMap();
                    }
                } catch (Throwable th2) {
                    th = th2;
                    closeable = length;
                    AbstractC4928.m11051(closeable, "Failed to close user metadata file.");
                    throw th;
                }
            }
        }
        m9615(file);
        return Collections.emptyMap();
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final void m9618(String str, Map map, boolean z) throws Throwable {
        ﹳﹳ r1 = this.f16160;
        File file = z ? r1.ﹳﹳ(str, "internal-keys") : r1.ﹳﹳ(str, "keys");
        BufferedWriter bufferedWriter = null;
        try {
            try {
                String string = new JSONObject(map).toString();
                BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), f16159));
                try {
                    bufferedWriter2.write(string);
                    bufferedWriter2.flush();
                    AbstractC4928.m11051(bufferedWriter2, "Failed to close key/value metadata file.");
                } catch (Exception e) {
                    bufferedWriter = bufferedWriter2;
                    m9615(file);
                    AbstractC4928.m11051(bufferedWriter, "Failed to close key/value metadata file.");
                } catch (Throwable th) {
                    th = th;
                    bufferedWriter = bufferedWriter2;
                    AbstractC4928.m11051(bufferedWriter, "Failed to close key/value metadata file.");
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e2) {
        }
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final String m9619(String str) {
        FileInputStream fileInputStream;
        File file = this.f16160.ﹳﹳ(str, "user-data");
        FileInputStream fileInputStream2 = null;
        if (!file.exists() || file.length() == 0) {
            ᐧʻ.ﾞˊ("No userId set for session ", str);
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            }
            m9615(file);
            return null;
        }
        try {
            fileInputStream = new FileInputStream(file);
        } catch (Exception e) {
            fileInputStream = null;
        } catch (Throwable th) {
            th = th;
            AbstractC4928.m11051(fileInputStream2, "Failed to close user metadata file.");
            throw th;
        }
        try {
            try {
                JSONObject jSONObject = new JSONObject(AbstractC4928.m11049(fileInputStream));
                String strOptString = !jSONObject.isNull("userId") ? jSONObject.optString("userId", null) : null;
                String str2 = "Loaded userId " + strOptString + " for session " + str;
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                }
                AbstractC4928.m11051(fileInputStream, "Failed to close user metadata file.");
                return strOptString;
            } catch (Throwable th2) {
                th = th2;
                fileInputStream2 = fileInputStream;
                AbstractC4928.m11051(fileInputStream2, "Failed to close user metadata file.");
                throw th;
            }
        } catch (Exception e2) {
            m9615(file);
            AbstractC4928.m11051(fileInputStream, "Failed to close user metadata file.");
            return null;
        }
    }

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final void m9620(String str, String str2) throws Throwable {
        String string;
        BufferedWriter bufferedWriter;
        File file = this.f16160.ﹳﹳ(str, "user-data");
        BufferedWriter bufferedWriter2 = null;
        try {
            C4191 c4191 = new C4191();
            c4191.put("userId", str2);
            string = c4191.toString();
            bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), f16159));
        } catch (Exception e) {
        } catch (Throwable th) {
            th = th;
        }
        try {
            bufferedWriter.write(string);
            bufferedWriter.flush();
            AbstractC4928.m11051(bufferedWriter, "Failed to close user metadata file.");
        } catch (Exception e2) {
            bufferedWriter2 = bufferedWriter;
            AbstractC4928.m11051(bufferedWriter2, "Failed to close user metadata file.");
        } catch (Throwable th2) {
            th = th2;
            bufferedWriter2 = bufferedWriter;
            AbstractC4928.m11051(bufferedWriter2, "Failed to close user metadata file.");
            throw th;
        }
    }
}
