package p369;

import org.json.JSONException;
import org.json.JSONObject;
import p043.C1294;
import ʾי.ˑʽ;

/* renamed from: ᵢʽ.ˋⁱ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC4186 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final ˑʽ f16142;

    static {
        C1294 c1294 = new C1294();
        C4190 c4190 = C4190.f16156;
        c1294.m4593(AbstractC4186.class, c4190);
        c1294.m4593(C4182.class, c4190);
        f16142 = new ˑʽ(13, c1294);
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static C4182 m9597(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        String string = jSONObject.getString("rolloutId");
        String string2 = jSONObject.getString("parameterKey");
        String string3 = jSONObject.getString("parameterValue");
        String string4 = jSONObject.getString("variantId");
        long j = jSONObject.getLong("templateVersion");
        if (string3.length() > 256) {
            string3 = string3.substring(0, 256);
        }
        return new C4182(j, string, string2, string3, string4);
    }
}
