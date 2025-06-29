package p003;

import android.net.Uri;
import android.text.TextUtils;
import java.net.URL;
import java.security.MessageDigest;
import p314.InterfaceC3594;
import p329.AbstractC3740;

/* renamed from: ʻʾ.ˉי, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0893 implements InterfaceC3594 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final C0909 f4024;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public String f4025;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public int f4026;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final URL f4027;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public URL f4028;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public volatile byte[] f4029;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final String f4030;

    public C0893(String str) {
        C0909 c0909 = InterfaceC0899.f4038;
        this.f4027 = null;
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Must not be null or empty");
        }
        this.f4030 = str;
        AbstractC3740.m8706(c0909, "Argument must not be null");
        this.f4024 = c0909;
    }

    public C0893(URL url) {
        C0909 c0909 = InterfaceC0899.f4038;
        AbstractC3740.m8706(url, "Argument must not be null");
        this.f4027 = url;
        this.f4030 = null;
        AbstractC3740.m8706(c0909, "Argument must not be null");
        this.f4024 = c0909;
    }

    @Override // p314.InterfaceC3594
    public final boolean equals(Object obj) {
        if (!(obj instanceof C0893)) {
            return false;
        }
        C0893 c0893 = (C0893) obj;
        return m3712().equals(c0893.m3712()) && this.f4024.equals(c0893.f4024);
    }

    @Override // p314.InterfaceC3594
    public final int hashCode() {
        if (this.f4026 == 0) {
            int iHashCode = m3712().hashCode();
            this.f4026 = iHashCode;
            this.f4026 = this.f4024.f4064.hashCode() + (iHashCode * 31);
        }
        return this.f4026;
    }

    public final String toString() {
        return m3712();
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final String m3712() {
        String str = this.f4030;
        if (str != null) {
            return str;
        }
        URL url = this.f4027;
        AbstractC3740.m8706(url, "Argument must not be null");
        return url.toString();
    }

    @Override // p314.InterfaceC3594
    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void mo3713(MessageDigest messageDigest) {
        if (this.f4029 == null) {
            this.f4029 = m3712().getBytes(InterfaceC3594.f13813);
        }
        messageDigest.update(this.f4029);
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final String m3714() {
        if (TextUtils.isEmpty(this.f4025)) {
            String string = this.f4030;
            if (TextUtils.isEmpty(string)) {
                URL url = this.f4027;
                AbstractC3740.m8706(url, "Argument must not be null");
                string = url.toString();
            }
            this.f4025 = Uri.encode(string, "@#&=*+-_.,:!?()/~'%;$");
        }
        return this.f4025;
    }
}
