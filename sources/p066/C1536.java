package p066;

import android.content.Context;
import android.text.TextUtils;
import android.util.JsonReader;
import com.google.firebase.installations.FirebaseInstallationsException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import org.json.JSONException;
import org.json.JSONObject;
import p450.InterfaceC5190;
import ᵎﹳ.ᐧʻ;

/* renamed from: ʾᵢ.ˑʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1536 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final InterfaceC5190 f6244;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final C1538 f6245 = new C1538();

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final Context f6246;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static final Pattern f6243 = Pattern.compile("[0-9]+s");

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public static final Charset f6242 = Charset.forName("UTF-8");

    public C1536(Context context, InterfaceC5190 interfaceC5190) {
        this.f6246 = context;
        this.f6244 = interfaceC5190;
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static void m5115(HttpURLConnection httpURLConnection, String str, String str2, String str3) throws IOException {
        InputStream errorStream = httpURLConnection.getErrorStream();
        String str4 = null;
        if (errorStream != null) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(errorStream, f6242));
            try {
                StringBuilder sb = new StringBuilder();
                while (true) {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        break;
                    }
                    sb.append(line);
                    sb.append('\n');
                }
                str4 = String.format("Error when communicating with the Firebase Installations server API. HTTP response: [%d %s: %s]", Integer.valueOf(httpURLConnection.getResponseCode()), httpURLConnection.getResponseMessage(), sb);
            } catch (IOException unused) {
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                } catch (IOException unused2) {
                }
                throw th;
            }
            try {
                bufferedReader.close();
            } catch (IOException unused3) {
            }
        }
        if (TextUtils.isEmpty(str4)) {
            return;
        }
        String str5 = "Firebase options used while communicating with Firebase server APIs: " + str2 + ", " + str3 + (TextUtils.isEmpty(str) ? "" : ᐧʻ.ﾞˊ(", ", str));
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public static C1537 m5116(HttpURLConnection httpURLConnection) throws IOException {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, f6242));
        com.google.android.gms.internal.play_billing.ᐧʻ r1 = C1535.m5114();
        jsonReader.beginObject();
        String strNextString = null;
        String strNextString2 = null;
        String strNextString3 = null;
        C1535 c1535 = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if (strNextName.equals("name")) {
                strNextString = jsonReader.nextString();
            } else if (strNextName.equals("fid")) {
                strNextString2 = jsonReader.nextString();
            } else if (strNextName.equals("refreshToken")) {
                strNextString3 = jsonReader.nextString();
            } else if (strNextName.equals("authToken")) {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String strNextName2 = jsonReader.nextName();
                    if (strNextName2.equals("token")) {
                        r1.ˎˑ = jsonReader.nextString();
                    } else if (strNextName2.equals("expiresIn")) {
                        r1.ᐧˋ = Long.valueOf(m5121(jsonReader.nextString()));
                    } else {
                        jsonReader.skipValue();
                    }
                }
                C1535 c15352 = r1.ˑʽ();
                jsonReader.endObject();
                c1535 = c15352;
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        return new C1537(strNextString, strNextString2, strNextString3, c1535, 1);
    }

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public static void m5117(HttpURLConnection httpURLConnection) throws JSONException, IOException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("sdkVersion", "a:18.0.0");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("installation", jSONObject);
            m5122(httpURLConnection, jSONObject2.toString().getBytes("UTF-8"));
        } catch (JSONException e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static URL m5118(String str) {
        try {
            return new URL("https://firebaseinstallations.googleapis.com/v1/" + str);
        } catch (MalformedURLException e) {
            throw new FirebaseInstallationsException(e.getMessage());
        }
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public static C1535 m5119(HttpURLConnection httpURLConnection) throws IOException {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, f6242));
        com.google.android.gms.internal.play_billing.ᐧʻ r1 = C1535.m5114();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if (strNextName.equals("token")) {
                r1.ˎˑ = jsonReader.nextString();
            } else if (strNextName.equals("expiresIn")) {
                r1.ᐧˋ = Long.valueOf(m5121(jsonReader.nextString()));
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        r1.ˆʿ = 1;
        return r1.ˑʽ();
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public static void m5120(HttpURLConnection httpURLConnection, String str, String str2) throws JSONException, IOException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("fid", str);
            jSONObject.put("appId", str2);
            jSONObject.put("authVersion", "FIS_v2");
            jSONObject.put("sdkVersion", "a:18.0.0");
            m5122(httpURLConnection, jSONObject.toString().getBytes("UTF-8"));
        } catch (JSONException e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static long m5121(String str) {
        if (!f6243.matcher(str).matches()) {
            throw new IllegalArgumentException("Invalid Expiration Timestamp.");
        }
        if (str == null || str.length() == 0) {
            return 0L;
        }
        return Long.parseLong(str.substring(0, str.length() - 1));
    }

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public static void m5122(HttpURLConnection httpURLConnection, byte[] bArr) throws IOException {
        OutputStream outputStream = httpURLConnection.getOutputStream();
        if (outputStream == null) {
            throw new IOException("Cannot send request to FIS servers. No OutputStream available.");
        }
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
        try {
            gZIPOutputStream.write(bArr);
        } finally {
            try {
                gZIPOutputStream.close();
                outputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a8 A[Catch: NameNotFoundException -> 0x00ba, TryCatch #1 {NameNotFoundException -> 0x00ba, blocks: (B:15:0x006f, B:17:0x0081, B:23:0x008b, B:29:0x0098, B:32:0x00a8, B:35:0x00bc, B:37:0x00c6, B:38:0x00df), top: B:48:0x006f }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00bc A[Catch: NameNotFoundException -> 0x00ba, TryCatch #1 {NameNotFoundException -> 0x00ba, blocks: (B:15:0x006f, B:17:0x0081, B:23:0x008b, B:29:0x0098, B:32:0x00a8, B:35:0x00bc, B:37:0x00c6, B:38:0x00df), top: B:48:0x006f }] */
    /* renamed from: ˑʽ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.net.HttpURLConnection m5123(java.net.URL r10, java.lang.String r11) {
        /*
            Method dump skipped, instructions count: 266
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p066.C1536.m5123(java.net.URL, java.lang.String):java.net.HttpURLConnection");
    }
}
