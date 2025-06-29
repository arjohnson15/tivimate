package p322;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import org.json.JSONObject;
import p072.InterfaceC1594;
import p155.EnumC2332;
import p185.AbstractC2567;
import p266.C3262;
import p288.C3397;
import p330.InterfaceC3746;
import p338.InterfaceC3864;
import ˈⁱ.ˉⁱ;

/* renamed from: ᴵˉ.ʿʼ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3668 extends AbstractC2567 implements InterfaceC3864 {

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public int f14065;

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public final /* synthetic */ C3667 f14066;

    /* renamed from: ـˆ, reason: contains not printable characters */
    public final /* synthetic */ C3674 f14067;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final /* synthetic */ C3262 f14068;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public final /* synthetic */ Object f14069;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3668(C3262 c3262, Map map, C3667 c3667, C3674 c3674, InterfaceC3746 interfaceC3746) {
        super(2, interfaceC3746);
        this.f14068 = c3262;
        this.f14069 = map;
        this.f14066 = c3667;
        this.f14067 = c3674;
    }

    @Override // p338.InterfaceC3864
    /* renamed from: ʿʼ */
    public final Object mo1054(Object obj, Object obj2) {
        return ((C3668) mo1056((InterfaceC1594) obj, (InterfaceC3746) obj2)).mo1055(C3397.f13249);
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, java.util.Map] */
    @Override // p185.AbstractC2563
    /* renamed from: ˑי */
    public final Object mo1055(Object obj) throws IOException {
        EnumC2332 enumC2332 = EnumC2332.f9250;
        int i = this.f14065;
        C3674 c3674 = this.f14067;
        C3397 c3397 = C3397.f13249;
        try {
            if (i == 0) {
                ˉⁱ.ˆʿ(obj);
                HttpsURLConnection httpsURLConnection = (HttpsURLConnection) C3262.m8025(this.f14068).openConnection();
                httpsURLConnection.setRequestMethod("GET");
                httpsURLConnection.setRequestProperty("Accept", "application/json");
                for (Map.Entry entry : this.f14069.entrySet()) {
                    httpsURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
                int responseCode = httpsURLConnection.getResponseCode();
                if (responseCode == 200) {
                    InputStream inputStream = httpsURLConnection.getInputStream();
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
                    StringBuilder sb = new StringBuilder();
                    while (true) {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            break;
                        }
                        sb.append(line);
                    }
                    bufferedReader.close();
                    inputStream.close();
                    JSONObject jSONObject = new JSONObject(sb.toString());
                    C3667 c3667 = this.f14066;
                    this.f14065 = 1;
                    if (c3667.mo1054(jSONObject, this) == enumC2332) {
                        return enumC2332;
                    }
                } else {
                    this.f14065 = 2;
                    c3674.mo1054("Bad response code: " + responseCode, this);
                    if (c3397 == enumC2332) {
                        return enumC2332;
                    }
                }
            } else {
                if (i != 1 && i != 2 && i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ˉⁱ.ˆʿ(obj);
            }
        } catch (Exception e) {
            String message = e.getMessage();
            if (message == null) {
                message = e.toString();
            }
            this.f14065 = 3;
            c3674.mo1054(message, this);
            if (c3397 == enumC2332) {
                return enumC2332;
            }
        }
        return c3397;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.Map] */
    @Override // p185.AbstractC2563
    /* renamed from: ᴵʿ */
    public final InterfaceC3746 mo1056(Object obj, InterfaceC3746 interfaceC3746) {
        return new C3668(this.f14068, this.f14069, this.f14066, this.f14067, interfaceC3746);
    }
}
