package com.parse;

import android.content.Context;
import android.os.Build;
import com.parse.Parse;
import java.io.File;
import p035.C1232;
import p126.C2021;
import p186.C2587;
import p430.C4993;
import p430.C4994;
import p430.C5021;
import p430.InterfaceC5007;
import p430.InterfaceC5016;

/* loaded from: classes.dex */
public class ParsePlugins {
    private static final Object LOCK = new Object();
    private static ParsePlugins instance;
    private Context applicationContext;
    File cacheDir;
    private final Parse.Configuration configuration;
    File filesDir;
    private InstallationId installationId;
    final Object lock = new Object();
    ParseHttpClient restClient;

    private ParsePlugins(Context context, Parse.Configuration configuration) {
        if (context != null) {
            this.applicationContext = context.getApplicationContext();
        }
        this.configuration = configuration;
    }

    private static File createFileDir(File file) {
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public static ParsePlugins get() {
        ParsePlugins parsePlugins;
        synchronized (LOCK) {
            parsePlugins = instance;
        }
        return parsePlugins;
    }

    public static void initialize(Context context, Parse.Configuration configuration) {
        set(new ParsePlugins(context, configuration));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public C4994 lambda$restClient$0(InterfaceC5007 interfaceC5007) {
        C2021 c2021 = (C2021) interfaceC5007;
        C5021 c5021 = c2021.f7667;
        C1232 c1232M11106 = c5021.f19051.m11106();
        c1232M11106.m4428("X-Parse-Application-Id", this.configuration.applicationId);
        c1232M11106.m4428("X-Parse-App-Build-Version", String.valueOf(ManifestInfo.getVersionCode()));
        c1232M11106.m4428("X-Parse-App-Display-Version", ManifestInfo.getVersionName());
        c1232M11106.m4428("X-Parse-App-Package-Name", this.configuration.context.getPackageName());
        c1232M11106.m4428("X-Parse-App-Data", Integer.toHexString(C2587.m6721(ParseCloud.f3665, true)));
        c1232M11106.m4428("X-Parse-OS-Version", Build.VERSION.RELEASE);
        c1232M11106.m4428("User-Agent", userAgent());
        if (c5021.f19051.m11104("X-Parse-Installation-Id") == null) {
            c1232M11106.m4428("X-Parse-Installation-Id", installationId().get());
        }
        String str = this.configuration.clientKey;
        if (str != null) {
            c1232M11106.m4428("X-Parse-Client-Key", str);
        }
        androidx.leanback.widget.ʿˏ r0 = c5021.m11111();
        r0.ˎˑ = c1232M11106.m4429().m11106();
        return c2021.m5665(r0.ˏᵢ());
    }

    public static void set(ParsePlugins parsePlugins) {
        synchronized (LOCK) {
            try {
                if (instance != null) {
                    throw new IllegalStateException("ParsePlugins is already initialized");
                }
                instance = parsePlugins;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public Context applicationContext() {
        return this.applicationContext;
    }

    public String applicationId() {
        return this.configuration.applicationId;
    }

    public Parse.Configuration configuration() {
        return this.configuration;
    }

    public File getCacheDir() {
        File fileCreateFileDir;
        synchronized (this.lock) {
            try {
                if (this.cacheDir == null) {
                    this.cacheDir = new File(this.applicationContext.getCacheDir(), "com.parse");
                }
                fileCreateFileDir = createFileDir(this.cacheDir);
            } catch (Throwable th) {
                throw th;
            }
        }
        return fileCreateFileDir;
    }

    public File getFilesDir() {
        File fileCreateFileDir;
        synchronized (this.lock) {
            try {
                if (this.filesDir == null) {
                    this.filesDir = new File(this.applicationContext.getFilesDir(), "com.parse");
                }
                fileCreateFileDir = createFileDir(this.filesDir);
            } catch (Throwable th) {
                throw th;
            }
        }
        return fileCreateFileDir;
    }

    public InstallationId installationId() {
        InstallationId installationId;
        synchronized (this.lock) {
            try {
                if (this.installationId == null) {
                    this.installationId = new InstallationId(new File(getFilesDir(), "installationId"));
                }
                installationId = this.installationId;
            } catch (Throwable th) {
                throw th;
            }
        }
        return installationId;
    }

    public ParseHttpClient restClient() {
        ParseHttpClient parseHttpClient;
        synchronized (this.lock) {
            try {
                if (this.restClient == null) {
                    C4993 c4993 = this.configuration.clientBuilder;
                    if (c4993 == null) {
                        c4993 = new C4993();
                    }
                    c4993.f18867.add(0, new InterfaceC5016() { // from class: com.parse.ـᵎ
                        @Override // p430.InterfaceC5016
                        /* renamed from: ـﹶ, reason: contains not printable characters */
                        public final C4994 mo3528(C2021 c2021) {
                            return this.f3781.lambda$restClient$0(c2021);
                        }
                    });
                    this.restClient = ParseHttpClient.createClient(c4993);
                }
                parseHttpClient = this.restClient;
            } catch (Throwable th) {
                throw th;
            }
        }
        return parseHttpClient;
    }

    public String userAgent() {
        return "Parse Android SDK API Level " + Build.VERSION.SDK_INT;
    }
}
