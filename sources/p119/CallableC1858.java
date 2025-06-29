package p119;

import android.util.Base64OutputStream;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONObject;
import p060.C1353;
import ʾי.ˑʽ;

/* renamed from: ˈˉ.ʽᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final /* synthetic */ class CallableC1858 implements Callable {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final /* synthetic */ C1860 f7112;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final /* synthetic */ int f7113;

    public /* synthetic */ CallableC1858(C1860 c1860, int i) {
        this.f7113 = i;
        this.f7112 = c1860;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    private final Object m5616() {
        String string;
        C1860 c1860 = this.f7112;
        synchronized (c1860) {
            try {
                C1863 c1863 = (C1863) c1860.f7117.get();
                ArrayList arrayListM5622 = c1863.m5622();
                c1863.m5619();
                JSONArray jSONArray = new JSONArray();
                for (int i = 0; i < arrayListM5622.size(); i++) {
                    C1861 c1861 = (C1861) arrayListM5622.get(i);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("agent", c1861.f7120);
                    jSONObject.put("dates", new JSONArray((Collection) c1861.f7119));
                    jSONArray.put(jSONObject);
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("heartbeats", jSONArray);
                jSONObject2.put("version", "2");
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream, 11);
                try {
                    GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(base64OutputStream);
                    try {
                        gZIPOutputStream.write(jSONObject2.toString().getBytes("UTF-8"));
                        gZIPOutputStream.close();
                        base64OutputStream.close();
                        string = byteArrayOutputStream.toString("UTF-8");
                    } finally {
                    }
                } finally {
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return string;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f7113) {
            case 0:
                return m5616();
            default:
                C1860 c1860 = this.f7112;
                synchronized (c1860) {
                    C1863 c1863 = (C1863) c1860.f7117.get();
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    C1353 c1353 = (C1353) c1860.f7116.get();
                    ˑʽ r5 = c1353.f5509;
                    boolean zIsEmpty = r5.ﾞʽ().isEmpty();
                    String str = c1353.f5510;
                    if (!zIsEmpty) {
                        str = str + ' ' + C1353.m4705(r5.ﾞʽ());
                    }
                    c1863.m5625(str, jCurrentTimeMillis);
                }
                return null;
        }
    }
}
