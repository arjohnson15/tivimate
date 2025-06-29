package p396;

import java.lang.reflect.Method;
import p035.C1232;
import p430.C5014;

/* renamed from: ⁱᴵ.ˆᵔ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4553 extends AbstractC4581 {

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final Method f17459;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final int f17460;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final /* synthetic */ int f17461;

    public /* synthetic */ C4553(Method method, int i, int i2) {
        this.f17461 = i2;
        this.f17459 = method;
        this.f17460 = i;
    }

    @Override // p396.AbstractC4581
    /* renamed from: ـﹶ */
    public final void mo10422(C4570 c4570, Object obj) {
        switch (this.f17461) {
            case 0:
                C5014 c5014 = (C5014) obj;
                if (c5014 == null) {
                    int i = this.f17460;
                    throw AbstractC4581.m10472(this.f17459, i, "Headers parameter must not be null.", new Object[0]);
                }
                C1232 c1232 = c4570.f17502;
                c1232.getClass();
                int size = c5014.size();
                for (int i2 = 0; i2 < size; i2++) {
                    c1232.m4424(c5014.m11105(i2), c5014.m11103(i2));
                }
                return;
            default:
                if (obj != null) {
                    c4570.f17500 = obj.toString();
                    return;
                } else {
                    int i3 = this.f17460;
                    throw AbstractC4581.m10472(this.f17459, i3, "@Url parameter is null.", new Object[0]);
                }
        }
    }
}
