package p182;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.LayoutInflater;
import org.lsposed.hiddenapibypass.library.R;

/* renamed from: ˋⁱ.ﹳﹳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2529 extends ContextWrapper {

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public static Configuration f10057;

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public Resources.Theme f10058;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public Resources f10059;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public LayoutInflater f10060;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public int f10061;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public Configuration f10062;

    public C2529(Context context, int i) {
        super(context);
        this.f10061 = i;
    }

    @Override // android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final AssetManager getAssets() {
        return getResources().getAssets();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    @Override // android.content.ContextWrapper, android.content.Context
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.content.res.Resources getResources() {
        /*
            r3 = this;
            android.content.res.Resources r0 = r3.f10059
            if (r0 != 0) goto L38
            android.content.res.Configuration r0 = r3.f10062
            if (r0 == 0) goto L32
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 26
            if (r1 < r2) goto L25
            android.content.res.Configuration r1 = p182.C2529.f10057
            if (r1 != 0) goto L1c
            android.content.res.Configuration r1 = new android.content.res.Configuration
            r1.<init>()
            r2 = 0
            r1.fontScale = r2
            p182.C2529.f10057 = r1
        L1c:
            android.content.res.Configuration r1 = p182.C2529.f10057
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L25
            goto L32
        L25:
            android.content.res.Configuration r0 = r3.f10062
            android.content.Context r0 = r3.createConfigurationContext(r0)
            android.content.res.Resources r0 = r0.getResources()
            r3.f10059 = r0
            goto L38
        L32:
            android.content.res.Resources r0 = super.getResources()
            r3.f10059 = r0
        L38:
            android.content.res.Resources r0 = r3.f10059
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p182.C2529.getResources():android.content.res.Resources");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f10060 == null) {
            this.f10060 = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f10060;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources.Theme getTheme() {
        Resources.Theme theme = this.f10058;
        if (theme != null) {
            return theme;
        }
        if (this.f10061 == 0) {
            this.f10061 = R.style._2_res_0x7f1402a8;
        }
        m6667();
        return this.f10058;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        if (this.f10061 != i) {
            this.f10061 = i;
            m6667();
        }
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final void m6667() {
        if (this.f10058 == null) {
            this.f10058 = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f10058.setTo(theme);
            }
        }
        this.f10058.applyStyle(this.f10061, true);
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void m6668(Configuration configuration) {
        if (this.f10059 != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        }
        if (this.f10062 != null) {
            throw new IllegalStateException("Override configuration has already been set");
        }
        this.f10062 = new Configuration(configuration);
    }
}
