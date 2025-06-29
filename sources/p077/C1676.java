package p077;

import java.util.Map;
import p070.AbstractC1547;
import p338.InterfaceC3856;

/* renamed from: ʿˊ.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1676 extends AbstractC1547 implements InterfaceC3856 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public static final C1676 f6529 = new C1676(1);

    @Override // p338.InterfaceC3856
    /* renamed from: ʽᐧ */
    public final Object mo4036(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        return "  " + ((C1673) entry.getKey()).f6524 + " = " + entry.getValue();
    }
}
