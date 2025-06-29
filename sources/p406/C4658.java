package p406;

import java.util.HashMap;
import p331.C3760;
import p457.C5391;
import ᵢ.ʿʼ;

/* renamed from: ﹳʿ.יʻ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4658 {

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public static final String f17781 = C5391.m12164("WorkTimer");

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final ʿʼ f17784;

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final HashMap f17782 = new HashMap();

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final HashMap f17783 = new HashMap();

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final Object f17785 = new Object();

    public C4658(ʿʼ r2) {
        this.f17784 = r2;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void m10562(C3760 c3760) {
        synchronized (this.f17785) {
            try {
                if (((RunnableC4668) this.f17782.remove(c3760)) != null) {
                    C5391.m12163().m12168(f17781, "Stopping timer for " + c3760);
                    this.f17783.remove(c3760);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
