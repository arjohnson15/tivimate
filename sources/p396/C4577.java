package p396;

import java.lang.reflect.Method;
import java.util.Map;
import ˆʽ.ᵎˏ;

/* renamed from: ⁱᴵ.ᐧˋ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4577 extends AbstractC4581 {

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final Method f17519;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final int f17520;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final boolean f17521;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final /* synthetic */ int f17522;

    public /* synthetic */ C4577(Method method, int i, boolean z, int i2) {
        this.f17522 = i2;
        this.f17519 = method;
        this.f17520 = i;
        this.f17521 = z;
    }

    @Override // p396.AbstractC4581
    /* renamed from: ـﹶ */
    public final void mo10422(C4570 c4570, Object obj) {
        switch (this.f17522) {
            case 0:
                Map map = (Map) obj;
                int i = this.f17520;
                Method method = this.f17519;
                if (map == null) {
                    throw AbstractC4581.m10472(method, i, "Field map was null.", new Object[0]);
                }
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str == null) {
                        throw AbstractC4581.m10472(method, i, "Field map contained null key.", new Object[0]);
                    }
                    Object value = entry.getValue();
                    if (value == null) {
                        throw AbstractC4581.m10472(method, i, ᵎˏ.ˑי("Field map contained null value for key '", str, "'."), new Object[0]);
                    }
                    String string = value.toString();
                    if (string == null) {
                        throw AbstractC4581.m10472(method, i, "Field map value '" + value + "' converted to null by " + C4574.class.getName() + " for key '" + str + "'.", new Object[0]);
                    }
                    c4570.m10458(str, string, this.f17521);
                }
                return;
            case 1:
                Map map2 = (Map) obj;
                int i2 = this.f17520;
                Method method2 = this.f17519;
                if (map2 == null) {
                    throw AbstractC4581.m10472(method2, i2, "Header map was null.", new Object[0]);
                }
                for (Map.Entry entry2 : map2.entrySet()) {
                    String str2 = (String) entry2.getKey();
                    if (str2 == null) {
                        throw AbstractC4581.m10472(method2, i2, "Header map contained null key.", new Object[0]);
                    }
                    Object value2 = entry2.getValue();
                    if (value2 == null) {
                        throw AbstractC4581.m10472(method2, i2, ᵎˏ.ˑי("Header map contained null value for key '", str2, "'."), new Object[0]);
                    }
                    c4570.m10456(str2, value2.toString(), this.f17521);
                }
                return;
            default:
                Map map3 = (Map) obj;
                int i3 = this.f17520;
                Method method3 = this.f17519;
                if (map3 == null) {
                    throw AbstractC4581.m10472(method3, i3, "Query map was null", new Object[0]);
                }
                for (Map.Entry entry3 : map3.entrySet()) {
                    String str3 = (String) entry3.getKey();
                    if (str3 == null) {
                        throw AbstractC4581.m10472(method3, i3, "Query map contained null key.", new Object[0]);
                    }
                    Object value3 = entry3.getValue();
                    if (value3 == null) {
                        throw AbstractC4581.m10472(method3, i3, ᵎˏ.ˑי("Query map contained null value for key '", str3, "'."), new Object[0]);
                    }
                    String string2 = value3.toString();
                    if (string2 == null) {
                        throw AbstractC4581.m10472(method3, i3, "Query map value '" + value3 + "' converted to null by " + C4574.class.getName() + " for key '" + str3 + "'.", new Object[0]);
                    }
                    c4570.m10459(str3, string2, this.f17521);
                }
                return;
        }
    }
}
