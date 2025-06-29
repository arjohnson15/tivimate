package p396;

import java.io.IOException;
import java.lang.reflect.Method;
import p430.AbstractC4996;

/* renamed from: ⁱᴵ.ˆʿ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4552 extends AbstractC4581 {

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final int f17456;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final InterfaceC4560 f17457;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final Method f17458;

    public C4552(Method method, int i, InterfaceC4560 interfaceC4560) {
        this.f17458 = method;
        this.f17456 = i;
        this.f17457 = interfaceC4560;
    }

    @Override // p396.AbstractC4581
    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void mo10422(C4570 c4570, Object obj) {
        int i = this.f17456;
        Method method = this.f17458;
        if (obj == null) {
            throw AbstractC4581.m10472(method, i, "Body parameter value must not be null.", new Object[0]);
        }
        try {
            c4570.f17498 = (AbstractC4996) this.f17457.mo8506(obj);
        } catch (IOException e) {
            throw AbstractC4581.m10475(method, e, i, "Unable to convert " + obj + " to RequestBody", new Object[0]);
        }
    }
}
