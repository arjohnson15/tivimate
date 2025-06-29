package p396;

import android.support.v4.media.session.AbstractC0001;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Map;
import p430.AbstractC4996;
import p430.C5014;
import ˆʽ.ᵎˏ;

/* renamed from: ⁱᴵ.ᵢʿ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4587 extends AbstractC4581 {

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final Method f17539;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final Object f17540;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final int f17541;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final InterfaceC4560 f17542;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final /* synthetic */ int f17543 = 1;

    public C4587(Method method, int i, InterfaceC4560 interfaceC4560, String str) {
        this.f17539 = method;
        this.f17541 = i;
        this.f17542 = interfaceC4560;
        this.f17540 = str;
    }

    public C4587(Method method, int i, C5014 c5014, InterfaceC4560 interfaceC4560) {
        this.f17539 = method;
        this.f17541 = i;
        this.f17540 = c5014;
        this.f17542 = interfaceC4560;
    }

    @Override // p396.AbstractC4581
    /* renamed from: ـﹶ */
    public final void mo10422(C4570 c4570, Object obj) {
        InterfaceC4560 interfaceC4560 = this.f17542;
        Object obj2 = this.f17540;
        Method method = this.f17539;
        int i = this.f17541;
        switch (this.f17543) {
            case 0:
                if (obj == null) {
                    return;
                }
                try {
                    c4570.m10457((C5014) obj2, (AbstractC4996) interfaceC4560.mo8506(obj));
                    return;
                } catch (IOException e) {
                    throw AbstractC4581.m10472(method, i, "Unable to convert " + obj + " to RequestBody", e);
                }
            default:
                Map map = (Map) obj;
                if (map == null) {
                    throw AbstractC4581.m10472(method, i, "Part map was null.", new Object[0]);
                }
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str == null) {
                        throw AbstractC4581.m10472(method, i, "Part map contained null key.", new Object[0]);
                    }
                    Object value = entry.getValue();
                    if (value == null) {
                        throw AbstractC4581.m10472(method, i, ᵎˏ.ˑי("Part map contained null value for key '", str, "'."), new Object[0]);
                    }
                    c4570.m10457(AbstractC0001.m24("Content-Disposition", ᵎˏ.ˑי("form-data; name=\"", str, "\""), "Content-Transfer-Encoding", (String) obj2), (AbstractC4996) interfaceC4560.mo8506(value));
                }
                return;
        }
    }
}
