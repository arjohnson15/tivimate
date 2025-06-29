package p000;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import p151.C2316;
import p383.AbstractC4464;
import p383.AbstractC4470;

/* renamed from: ʻ.ˉי, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0866 implements InterfaceC0875 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final ArrayList f3934;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public C0874 f3935;

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public C0865 f3936;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final InterfaceC0875 f3937;

    /* renamed from: ـˆ, reason: contains not printable characters */
    public C0881 f3938;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public C0873 f3939;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final Context f3940;

    /* renamed from: ᴵʼ, reason: contains not printable characters */
    public C0869 f3941;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public C0872 f3942;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public InterfaceC0875 f3943;

    /* renamed from: ﾞᐧ, reason: contains not printable characters */
    public InterfaceC0875 f3944;

    public C0866(Context context, InterfaceC0875 interfaceC0875) {
        this.f3940 = context.getApplicationContext();
        interfaceC0875.getClass();
        this.f3937 = interfaceC0875;
        this.f3934 = new ArrayList();
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static void m3682(InterfaceC0875 interfaceC0875, InterfaceC0880 interfaceC0880) {
        if (interfaceC0875 != null) {
            interfaceC0875.mo3678(interfaceC0880);
        }
    }

    @Override // p000.InterfaceC0875
    public final void close() {
        InterfaceC0875 interfaceC0875 = this.f3944;
        if (interfaceC0875 != null) {
            try {
                interfaceC0875.close();
            } finally {
                this.f3944 = null;
            }
        }
    }

    @Override // p166.InterfaceC2442
    /* renamed from: ˆʿ */
    public final int mo3679(byte[] bArr, int i, int i2) {
        InterfaceC0875 interfaceC0875 = this.f3944;
        interfaceC0875.getClass();
        return interfaceC0875.mo3679(bArr, i, i2);
    }

    @Override // p000.InterfaceC0875
    /* renamed from: ˉי */
    public final Map mo3674() {
        InterfaceC0875 interfaceC0875 = this.f3944;
        return interfaceC0875 == null ? Collections.emptyMap() : interfaceC0875.mo3674();
    }

    @Override // p000.InterfaceC0875
    /* renamed from: ˏᴵ */
    public final long mo3680(C0882 c0882) {
        AbstractC4464.m10132(this.f3944 == null);
        String scheme = c0882.f4004.getScheme();
        int i = AbstractC4470.f17202;
        Uri uri = c0882.f4004;
        String scheme2 = uri.getScheme();
        boolean zIsEmpty = TextUtils.isEmpty(scheme2);
        Context context = this.f3940;
        if (zIsEmpty || "file".equals(scheme2)) {
            String path = uri.getPath();
            if (path == null || !path.startsWith("/android_asset/")) {
                if (this.f3939 == null) {
                    C0873 c0873 = new C0873(false);
                    this.f3939 = c0873;
                    m3683(c0873);
                }
                this.f3944 = this.f3939;
            } else {
                if (this.f3935 == null) {
                    C0874 c0874 = new C0874(context);
                    this.f3935 = c0874;
                    m3683(c0874);
                }
                this.f3944 = this.f3935;
            }
        } else if ("asset".equals(scheme)) {
            if (this.f3935 == null) {
                C0874 c08742 = new C0874(context);
                this.f3935 = c08742;
                m3683(c08742);
            }
            this.f3944 = this.f3935;
        } else if ("content".equals(scheme)) {
            if (this.f3942 == null) {
                C0872 c0872 = new C0872(context);
                this.f3942 = c0872;
                m3683(c0872);
            }
            this.f3944 = this.f3942;
        } else {
            boolean zEquals = "rtmp".equals(scheme);
            InterfaceC0875 interfaceC0875 = this.f3937;
            if (zEquals) {
                if (this.f3943 == null) {
                    try {
                        int i2 = C2316.f9137;
                        InterfaceC0875 interfaceC08752 = (InterfaceC0875) C2316.class.getConstructor(null).newInstance(null);
                        this.f3943 = interfaceC08752;
                        m3683(interfaceC08752);
                    } catch (ClassNotFoundException unused) {
                        AbstractC4464.m10144("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
                    } catch (Exception e) {
                        throw new RuntimeException("Error instantiating RTMP extension", e);
                    }
                    if (this.f3943 == null) {
                        this.f3943 = interfaceC0875;
                    }
                }
                this.f3944 = this.f3943;
            } else if ("udp".equals(scheme)) {
                if (this.f3936 == null) {
                    C0865 c0865 = new C0865();
                    this.f3936 = c0865;
                    m3683(c0865);
                }
                this.f3944 = this.f3936;
            } else if ("data".equals(scheme)) {
                if (this.f3938 == null) {
                    C0881 c0881 = new C0881(false);
                    this.f3938 = c0881;
                    m3683(c0881);
                }
                this.f3944 = this.f3938;
            } else if ("rawresource".equals(scheme) || "android.resource".equals(scheme)) {
                if (this.f3941 == null) {
                    C0869 c0869 = new C0869(context);
                    this.f3941 = c0869;
                    m3683(c0869);
                }
                this.f3944 = this.f3941;
            } else {
                this.f3944 = interfaceC0875;
            }
        }
        return this.f3944.mo3680(c0882);
    }

    @Override // p000.InterfaceC0875
    /* renamed from: ˑי */
    public final Uri mo3681() {
        InterfaceC0875 interfaceC0875 = this.f3944;
        if (interfaceC0875 == null) {
            return null;
        }
        return interfaceC0875.mo3681();
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void m3683(InterfaceC0875 interfaceC0875) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f3934;
            if (i >= arrayList.size()) {
                return;
            }
            interfaceC0875.mo3678((InterfaceC0880) arrayList.get(i));
            i++;
        }
    }

    @Override // p000.InterfaceC0875
    /* renamed from: ﹶˆ */
    public final void mo3678(InterfaceC0880 interfaceC0880) {
        interfaceC0880.getClass();
        this.f3937.mo3678(interfaceC0880);
        this.f3934.add(interfaceC0880);
        m3682(this.f3939, interfaceC0880);
        m3682(this.f3935, interfaceC0880);
        m3682(this.f3942, interfaceC0880);
        m3682(this.f3943, interfaceC0880);
        m3682(this.f3936, interfaceC0880);
        m3682(this.f3938, interfaceC0880);
        m3682(this.f3941, interfaceC0880);
    }
}
