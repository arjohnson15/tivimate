package p414;

import android.os.Build;
import android.os.Trace;
import androidx.work.impl.WorkerStoppedException;
import java.lang.reflect.InvocationTargetException;
import p070.AbstractC1547;
import p242.AbstractC3106;
import p288.C3397;
import p338.InterfaceC3856;
import p457.AbstractC5366;
import p457.C5357;
import ˈⁱ.ˉⁱ;

/* renamed from: ﹳـ.יʻ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4726 extends AbstractC1547 implements InterfaceC3856 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC5366 f18146;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final /* synthetic */ String f18147;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final /* synthetic */ C4715 f18148;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4726(AbstractC5366 abstractC5366, String str, C4715 c4715) {
        super(1);
        this.f18146 = abstractC5366;
        this.f18147 = str;
        this.f18148 = c4715;
    }

    @Override // p338.InterfaceC3856
    /* renamed from: ʽᐧ */
    public final Object mo4036(Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Throwable th = (Throwable) obj;
        if (th instanceof WorkerStoppedException) {
            this.f18146.f20827.compareAndSet(-256, ((WorkerStoppedException) th).f1769);
        }
        String str = this.f18147;
        if (str != null) {
            C4715 c4715 = this.f18148;
            C5357 c5357 = c4715.f18090;
            int iHashCode = c4715.f18097.hashCode();
            c5357.f20788.getClass();
            if (Build.VERSION.SDK_INT >= 29) {
                AbstractC3106.m7619(iHashCode, ˉⁱ.ˎˑ(str));
            } else {
                String str2 = ˉⁱ.ˎˑ(str);
                try {
                    if (ˉⁱ.ﹳﹳ == null) {
                        ˉⁱ.ﹳﹳ = Trace.class.getMethod("asyncTraceEnd", Long.TYPE, String.class, Integer.TYPE);
                    }
                    ˉⁱ.ﹳﹳ.invoke(null, Long.valueOf(ˉⁱ.ـﹶ), str2, Integer.valueOf(iHashCode));
                } catch (Exception e) {
                    ˉⁱ.ˏᴵ("asyncTraceEnd", e);
                }
            }
        }
        return C3397.f13249;
    }
}
