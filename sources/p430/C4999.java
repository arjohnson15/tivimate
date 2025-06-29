package p430;

import androidx.leanback.widget.ﾞᐧ;
import com.bumptech.glide.ˑʽ;
import java.net.ProxySelector;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import p070.AbstractC1549;
import p089.C1740;
import p127.C2034;
import p158.AbstractC2339;
import p310.C3581;
import p396.C4554;
import ᴵﹳ.ﹶˆ;

/* renamed from: ﹶˏ.ˋˊ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4999 implements Cloneable, InterfaceC5019 {

    /* renamed from: ˉᵎ, reason: contains not printable characters */
    public static final List f18915 = AbstractC2339.m6430(EnumC5022.f19056, EnumC5022.f19058);

    /* renamed from: ⁱʿ, reason: contains not printable characters */
    public static final List f18916 = AbstractC2339.m6430(C5020.f19042, C5020.f19044);

    /* renamed from: ʻʿ, reason: contains not printable characters */
    public final List f18917;

    /* renamed from: ʾʼ, reason: contains not printable characters */
    public final ProxySelector f18918;

    /* renamed from: ʿˊ, reason: contains not printable characters */
    public final ﾞᐧ f18919;

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final C4554 f18920;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final C3581 f18921;

    /* renamed from: ˊᵔ, reason: contains not printable characters */
    public final int f18922;

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public final boolean f18923;

    /* renamed from: ˋﾞ, reason: contains not printable characters */
    public final int f18924;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final List f18925;

    /* renamed from: ˎᵔ, reason: contains not printable characters */
    public final X509TrustManager f18926;

    /* renamed from: ˑⁱ, reason: contains not printable characters */
    public final SocketFactory f18927;

    /* renamed from: ˑﾞ, reason: contains not printable characters */
    public final C4991 f18928;

    /* renamed from: ـˆ, reason: contains not printable characters */
    public final boolean f18929;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final List f18930;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final ﹶˆ f18931;

    /* renamed from: ᴵʼ, reason: contains not printable characters */
    public final InterfaceC5003 f18932;

    /* renamed from: ᵎʽ, reason: contains not printable characters */
    public final int f18933;

    /* renamed from: ᵔ, reason: contains not printable characters */
    public final C5010 f18934;

    /* renamed from: ᵔٴ, reason: contains not printable characters */
    public final HostnameVerifier f18935;

    /* renamed from: ᵔﹳ, reason: contains not printable characters */
    public final List f18936;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final boolean f18937;

    /* renamed from: ᵢٴ, reason: contains not printable characters */
    public final SSLSocketFactory f18938;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public final C4991 f18939;

    /* renamed from: ﾞˎ, reason: contains not printable characters */
    public final ˑʽ f18940;

    /* renamed from: ﾞᐧ, reason: contains not printable characters */
    public final C4991 f18941;

    public C4999() {
        this(new C4993());
    }

    public C4999(C4993 c4993) throws NoSuchAlgorithmException, KeyStoreException {
        this.f18931 = c4993.f18869;
        this.f18920 = c4993.f18856;
        this.f18925 = AbstractC2339.m6432(c4993.f18867);
        this.f18930 = AbstractC2339.m6432(c4993.f18876);
        this.f18921 = c4993.f18857;
        this.f18937 = c4993.f18870;
        this.f18939 = c4993.f18871;
        this.f18923 = c4993.f18866;
        this.f18929 = c4993.f18877;
        this.f18932 = c4993.f18859;
        this.f18941 = c4993.f18864;
        ProxySelector proxySelector = ProxySelector.getDefault();
        this.f18918 = proxySelector == null ? C1740.f6749 : proxySelector;
        this.f18928 = c4993.f18860;
        this.f18927 = c4993.f18862;
        List list = c4993.f18868;
        this.f18936 = list;
        this.f18917 = c4993.f18874;
        this.f18935 = c4993.f18863;
        this.f18922 = c4993.f18858;
        this.f18924 = c4993.f18861;
        this.f18933 = c4993.f18878;
        this.f18919 = new ﾞᐧ(7);
        List list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            this.f18938 = null;
            this.f18940 = null;
            this.f18926 = null;
            this.f18934 = C5010.f19011;
        } else {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                if (((C5020) it.next()).f19047) {
                    SSLSocketFactory sSLSocketFactory = c4993.f18872;
                    if (sSLSocketFactory != null) {
                        this.f18938 = sSLSocketFactory;
                        ˑʽ r0 = c4993.f18875;
                        this.f18940 = r0;
                        this.f18926 = c4993.f18865;
                        C5010 c5010 = c4993.f18873;
                        this.f18934 = AbstractC1549.m5138(c5010.f19012, r0) ? c5010 : new C5010(c5010.f19013, r0);
                    } else {
                        C2034 c2034 = C2034.f7700;
                        X509TrustManager x509TrustManagerMo5670 = C2034.f7700.mo5670();
                        this.f18926 = x509TrustManagerMo5670;
                        this.f18938 = C2034.f7700.mo5675(x509TrustManagerMo5670);
                        ˑʽ r02 = C2034.f7700.mo5676(x509TrustManagerMo5670);
                        this.f18940 = r02;
                        C5010 c50102 = c4993.f18873;
                        this.f18934 = AbstractC1549.m5138(c50102.f19012, r02) ? c50102 : new C5010(c50102.f19013, r02);
                    }
                }
            }
            this.f18938 = null;
            this.f18940 = null;
            this.f18926 = null;
            this.f18934 = C5010.f19011;
        }
        List list3 = this.f18925;
        if (list3.contains(null)) {
            throw new IllegalStateException(("Null interceptor: " + list3).toString());
        }
        List list4 = this.f18930;
        if (list4.contains(null)) {
            throw new IllegalStateException(("Null network interceptor: " + list4).toString());
        }
        List list5 = this.f18936;
        boolean z = list5 instanceof Collection;
        X509TrustManager x509TrustManager = this.f18926;
        ˑʽ r2 = this.f18940;
        SSLSocketFactory sSLSocketFactory2 = this.f18938;
        if (!z || !list5.isEmpty()) {
            Iterator it2 = list5.iterator();
            while (it2.hasNext()) {
                if (((C5020) it2.next()).f19047) {
                    if (sSLSocketFactory2 == null) {
                        throw new IllegalStateException("sslSocketFactory == null");
                    }
                    if (r2 == null) {
                        throw new IllegalStateException("certificateChainCleaner == null");
                    }
                    if (x509TrustManager == null) {
                        throw new IllegalStateException("x509TrustManager == null");
                    }
                    return;
                }
            }
        }
        if (sSLSocketFactory2 != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (r2 != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (x509TrustManager != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (!AbstractC1549.m5138(this.f18934, C5010.f19011)) {
            throw new IllegalStateException("Check failed.");
        }
    }

    public final Object clone() {
        return super.clone();
    }
}
