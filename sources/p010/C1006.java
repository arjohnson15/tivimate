package p010;

import kotlinx.coroutines.flow.internal.ChildCancelledException;
import p148.C2274;

/* renamed from: ʻˎ.ˉⁱ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1006 extends C2274 {
    @Override // p072.C1634
    /* renamed from: ˈٴ, reason: contains not printable characters */
    public final boolean mo3958(Throwable th) {
        if (th instanceof ChildCancelledException) {
            return true;
        }
        return m5254(th);
    }
}
