package p336;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import p013.AbstractC1035;
import p363.C4132;
import p379.AbstractC4397;
import p430.C4999;

/* renamed from: ᵎʿ.ˑʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC3804 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static final Map f14656;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final CopyOnWriteArraySet f14657 = new CopyOnWriteArraySet();

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Package r2 = C4999.class.getPackage();
        String name = r2 != null ? r2.getName() : null;
        if (name != null) {
            linkedHashMap.put(name, "OkHttp");
        }
        linkedHashMap.put(C4999.class.getName(), "okhttp.OkHttpClient");
        linkedHashMap.put(AbstractC4397.class.getName(), "okhttp.Http2");
        linkedHashMap.put(C4132.class.getName(), "okhttp.TaskRunner");
        linkedHashMap.put("okhttp3.mockwebserver.MockWebServer", "okhttp.MockWebServer");
        f14656 = AbstractC1035.m3986(linkedHashMap);
    }
}
