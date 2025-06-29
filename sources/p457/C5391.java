package p457;

/* renamed from: ﾞﹶ.ﾞˊ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C5391 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static final Object f20865 = new Object();

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static volatile C5391 f20866;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final int f20867;

    public C5391(int i) {
        this.f20867 = i;
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public static C5391 m12163() {
        C5391 c5391;
        synchronized (f20865) {
            try {
                if (f20866 == null) {
                    f20866 = new C5391(3);
                }
                c5391 = f20866;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c5391;
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public static String m12164(String str) {
        int length = str.length();
        StringBuilder sb = new StringBuilder(23);
        sb.append("WM-");
        if (length >= 20) {
            sb.append(str.substring(0, 20));
        } else {
            sb.append(str);
        }
        return sb.toString();
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final void m12165(String str, String str2, Throwable th) {
        if (this.f20867 <= 3) {
        }
    }

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final void m12166(String str, String str2) {
        if (this.f20867 <= 5) {
        }
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final void m12167(String str, String str2) {
        if (this.f20867 <= 6) {
        }
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void m12168(String str, String str2) {
        if (this.f20867 <= 3) {
        }
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final void m12169(String str, String str2) {
        if (this.f20867 <= 4) {
        }
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final void m12170(String str, String str2, Throwable th) {
        if (this.f20867 <= 6) {
        }
    }
}
