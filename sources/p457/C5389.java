package p457;

import java.util.Arrays;
import java.util.Map;
import p070.AbstractC1547;
import p080.AbstractC1702;
import p338.InterfaceC3856;

/* renamed from: ﾞﹶ.ﹶˆ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C5389 extends AbstractC1547 implements InterfaceC3856 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public static final C5389 f20864 = new C5389(1);

    @Override // p338.InterfaceC3856
    /* renamed from: ʽᐧ */
    public final Object mo4036(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        String str = (String) entry.getKey();
        Object value = entry.getValue();
        StringBuilder sbM5409 = AbstractC1702.m5409(str, " : ");
        if (value instanceof Object[]) {
            value = Arrays.toString((Object[]) value);
        }
        sbM5409.append(value);
        return sbM5409.toString();
    }
}
