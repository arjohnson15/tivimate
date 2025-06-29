package p334;

import android.content.Context;
import androidx.lifecycle.C0248;
import java.util.Collections;
import java.util.List;
import p023.C1149;
import p072.InterfaceC1594;
import p077.C1679;
import p164.C2363;
import p164.C2374;
import p176.InterfaceC2490;
import p338.InterfaceC3856;
import ˊﹶ.ˋˉ;
import ﹳᴵ.ˉי;

/* renamed from: ᵎʽ.ʽᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3781 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final ˋˉ f14624;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final Object f14625 = new Object();

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final InterfaceC3856 f14626;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final String f14627;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public volatile C1679 f14628;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final InterfaceC1594 f14629;

    public C3781(String str, ˋˉ r2, InterfaceC3856 interfaceC3856, InterfaceC1594 interfaceC1594) {
        this.f14627 = str;
        this.f14624 = r2;
        this.f14626 = interfaceC3856;
        this.f14629 = interfaceC1594;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final Object m8860(Object obj, InterfaceC2490 interfaceC2490) {
        C1679 c1679;
        Context context = (Context) obj;
        C1679 c16792 = this.f14628;
        if (c16792 != null) {
            return c16792;
        }
        synchronized (this.f14625) {
            try {
                if (this.f14628 == null) {
                    Context applicationContext = context.getApplicationContext();
                    ˉי r0 = this.f14624;
                    List list = (List) this.f14626.mo4036(applicationContext);
                    InterfaceC1594 interfaceC1594 = this.f14629;
                    C0248 c0248 = new C0248(4, new C1149(applicationContext, 3, this));
                    if (r0 == null) {
                        r0 = new ˉי(23);
                    }
                    this.f14628 = new C1679(new C2363(c0248, Collections.singletonList(new C2374(list, null)), r0, interfaceC1594));
                }
                c1679 = this.f14628;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1679;
    }
}
