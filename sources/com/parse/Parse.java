package com.parse;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.ResolveInfo;
import com.parse.boltsinternal.Task;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import p430.C4993;

/* loaded from: classes.dex */
public abstract class Parse {
    private static boolean allowCustomObjectId;

    @SuppressLint({"StaticFieldLeak"})
    static Context context;
    static ParseEventuallyQueue eventuallyQueue;
    private static boolean isLocalDatastoreEnabled;
    private static OfflineStore offlineStore;
    private static final Object MUTEX = new Object();
    private static final Object MUTEX_CALLBACKS = new Object();
    private static Set<ParseCallbacks> callbacks = new HashSet();
    static UserTokenCalculator userTokenCalculator = null;

    public static final class Configuration {
        final boolean allowCustomObjectId;
        final String applicationId;
        final C4993 clientBuilder;
        final String clientKey;
        final Context context;
        final boolean localDataStoreEnabled;
        final int maxRetries;
        final String server;
        final UserTokenCalculator userTokenCalculator;

        public static final class Builder {
            private boolean allowCustomObjectId;
            private String applicationId;
            private C4993 clientBuilder;
            private String clientKey;
            private final Context context;
            private boolean localDataStoreEnabled;
            private String server;
            private int maxRetries = 4;
            private UserTokenCalculator userTokenCalculator = null;

            public Builder(Context context) {
                this.context = context;
            }

            public Builder applicationId(String str) {
                this.applicationId = str;
                return this;
            }

            public Configuration build() {
                return new Configuration(this);
            }

            public Builder clientKey(String str) {
                this.clientKey = str;
                return this;
            }

            public Builder server(String str) {
                this.server = Parse.validateServerUrl(str);
                return this;
            }

            public Builder setUserTokenCalculator(UserTokenCalculator userTokenCalculator) {
                this.userTokenCalculator = userTokenCalculator;
                return this;
            }
        }

        private Configuration(Builder builder) {
            this.context = builder.context;
            this.applicationId = builder.applicationId;
            this.clientKey = builder.clientKey;
            this.server = builder.server;
            this.localDataStoreEnabled = builder.localDataStoreEnabled;
            this.allowCustomObjectId = builder.allowCustomObjectId;
            this.clientBuilder = builder.clientBuilder;
            this.maxRetries = builder.maxRetries;
            this.userTokenCalculator = builder.userTokenCalculator;
        }
    }

    public interface ParseCallbacks {
    }

    public interface UserTokenCalculator {
    }

    private static boolean allParsePushIntentReceiversInternal() {
        Iterator<ResolveInfo> it = ManifestInfo.getIntentReceivers("com.parse.push.intent.RECEIVE", "com.parse.push.intent.DELETE", "com.parse.push.intent.OPEN").iterator();
        while (it.hasNext()) {
            if (it.next().activityInfo.exported) {
                return false;
            }
        }
        return true;
    }

    public static void checkCacheApplicationId() {
        synchronized (MUTEX) {
            String strApplicationId = ParsePlugins.get().applicationId();
            if (strApplicationId != null) {
                File parseCacheDir = getParseCacheDir();
                File file = new File(parseCacheDir, "applicationId");
                boolean zEquals = false;
                if (file.exists()) {
                    try {
                        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
                        byte[] bArr = new byte[(int) randomAccessFile.length()];
                        randomAccessFile.readFully(bArr);
                        randomAccessFile.close();
                        zEquals = new String(bArr, "UTF-8").equals(strApplicationId);
                    } catch (IOException unused) {
                    }
                    if (!zEquals) {
                        try {
                            ParseFileUtils.deleteDirectory(parseCacheDir);
                        } catch (IOException unused2) {
                        }
                    }
                }
                if (!zEquals) {
                    try {
                        FileOutputStream fileOutputStream = new FileOutputStream(file);
                        fileOutputStream.write(strApplicationId.getBytes("UTF-8"));
                        fileOutputStream.close();
                    } catch (IOException unused3) {
                    }
                }
            }
        }
    }

    public static void checkContext() {
        if (ParsePlugins.get().applicationContext() == null) {
            throw new RuntimeException("applicationContext is null. You must call Parse.initialize(Context) before using the Parse library.");
        }
    }

    private static ParseCallbacks[] collectParseCallbacks() {
        synchronized (MUTEX_CALLBACKS) {
            try {
                Set<ParseCallbacks> set = callbacks;
                if (set == null) {
                    return null;
                }
                ParseCallbacks[] parseCallbacksArr = new ParseCallbacks[set.size()];
                if (callbacks.size() > 0) {
                    parseCallbacksArr = (ParseCallbacks[]) callbacks.toArray(parseCallbacksArr);
                }
                return parseCallbacksArr;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static void dispatchOnParseInitialized() {
        ParseCallbacks[] parseCallbacksArrCollectParseCallbacks = collectParseCallbacks();
        if (parseCallbacksArrCollectParseCallbacks == null || parseCallbacksArrCollectParseCallbacks.length <= 0) {
            return;
        }
        ParseCallbacks parseCallbacks = parseCallbacksArrCollectParseCallbacks[0];
        throw null;
    }

    public static Context getApplicationContext() {
        checkContext();
        return ParsePlugins.get().applicationContext();
    }

    public static ParseEventuallyQueue getEventuallyQueue() {
        return getEventuallyQueue(ParsePlugins.get().applicationContext());
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x001a A[Catch: all -> 0x0012, TryCatch #0 {all -> 0x0012, blocks: (B:4:0x0003, B:7:0x000d, B:13:0x0016, B:24:0x0041, B:25:0x0043, B:15:0x001a, B:17:0x0027, B:19:0x0032, B:21:0x0036, B:23:0x003c, B:18:0x002d), top: B:29:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static com.parse.ParseEventuallyQueue getEventuallyQueue(android.content.Context r4) {
        /*
            java.lang.Object r0 = com.parse.Parse.MUTEX
            monitor-enter(r0)
            boolean r1 = isLocalDatastoreEnabled()     // Catch: java.lang.Throwable -> L12
            com.parse.ParseEventuallyQueue r2 = com.parse.Parse.eventuallyQueue     // Catch: java.lang.Throwable -> L12
            if (r2 == 0) goto L1a
            if (r1 == 0) goto L14
            boolean r3 = r2 instanceof com.parse.ParseCommandCache     // Catch: java.lang.Throwable -> L12
            if (r3 != 0) goto L1a
            goto L14
        L12:
            r4 = move-exception
            goto L45
        L14:
            if (r1 != 0) goto L41
            boolean r2 = r2 instanceof com.parse.ParsePinningEventuallyQueue     // Catch: java.lang.Throwable -> L12
            if (r2 == 0) goto L41
        L1a:
            checkContext()     // Catch: java.lang.Throwable -> L12
            com.parse.ParsePlugins r2 = com.parse.ParsePlugins.get()     // Catch: java.lang.Throwable -> L12
            com.parse.ParseHttpClient r2 = r2.restClient()     // Catch: java.lang.Throwable -> L12
            if (r1 == 0) goto L2d
            com.parse.ParsePinningEventuallyQueue r3 = new com.parse.ParsePinningEventuallyQueue     // Catch: java.lang.Throwable -> L12
            r3.<init>(r4, r2)     // Catch: java.lang.Throwable -> L12
            goto L32
        L2d:
            com.parse.ParseCommandCache r3 = new com.parse.ParseCommandCache     // Catch: java.lang.Throwable -> L12
            r3.<init>(r4, r2)     // Catch: java.lang.Throwable -> L12
        L32:
            com.parse.Parse.eventuallyQueue = r3     // Catch: java.lang.Throwable -> L12
            if (r1 == 0) goto L41
            int r1 = com.parse.ParseCommandCache.getPendingCount()     // Catch: java.lang.Throwable -> L12
            if (r1 <= 0) goto L41
            com.parse.ParseCommandCache r1 = new com.parse.ParseCommandCache     // Catch: java.lang.Throwable -> L12
            r1.<init>(r4, r2)     // Catch: java.lang.Throwable -> L12
        L41:
            com.parse.ParseEventuallyQueue r4 = com.parse.Parse.eventuallyQueue     // Catch: java.lang.Throwable -> L12
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            return r4
        L45:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.parse.Parse.getEventuallyQueue(android.content.Context):com.parse.ParseEventuallyQueue");
    }

    public static OfflineStore getLocalDatastore() {
        return offlineStore;
    }

    public static int getLogLevel() {
        return PLog.getLogLevel();
    }

    public static File getParseCacheDir() {
        return ParsePlugins.get().getCacheDir();
    }

    public static File getParseCacheDir(String str) {
        File file;
        synchronized (MUTEX) {
            try {
                file = new File(getParseCacheDir(), str);
                if (!file.exists()) {
                    file.mkdirs();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return file;
    }

    public static File getParseFilesDir() {
        return ParsePlugins.get().getFilesDir();
    }

    public static boolean hasPermission(String str) {
        return getApplicationContext().checkCallingOrSelfPermission(str) == 0;
    }

    public static void initialize(Configuration configuration) {
        initialize(configuration, null);
    }

    public static void initialize(Configuration configuration, ParsePlugins parsePlugins) {
        if (isInitialized()) {
            PLog.w("com.parse.Parse", "Parse is already initialized");
            return;
        }
        context = configuration.context.getApplicationContext();
        userTokenCalculator = configuration.userTokenCalculator;
        new ParseCacheDirMigrationUtils(configuration.context).runMigrations();
        isLocalDatastoreEnabled = configuration.localDataStoreEnabled;
        allowCustomObjectId = configuration.allowCustomObjectId;
        if (parsePlugins == null) {
            ParsePlugins.initialize(configuration.context, configuration);
        } else {
            ParsePlugins.set(parsePlugins);
        }
        try {
            ParseRESTCommand.server = new URL(configuration.server);
            ParseObject.registerParseSubclasses();
            if (configuration.localDataStoreEnabled) {
                offlineStore = new OfflineStore(configuration.context);
            } else {
                ParseKeyValueCache.initialize(configuration.context);
            }
            checkCacheApplicationId();
            Task.callInBackground(new CallableC0806(1, configuration.context));
            ParseFieldOperations.registerDefaultDecoders();
            if (!allParsePushIntentReceiversInternal()) {
                throw new SecurityException("To prevent external tampering to your app's notifications, all receivers registered to handle the following actions must have their exported attributes set to false: com.parse.push.intent.RECEIVE, com.parse.push.intent.OPEN, com.parse.push.intent.DELETE");
            }
            ParseUser.getCurrentUserAsync().makeVoid().continueWith(new C0833(19), Task.BACKGROUND_EXECUTOR);
            dispatchOnParseInitialized();
            synchronized (MUTEX_CALLBACKS) {
                callbacks = null;
            }
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

    public static boolean isAllowCustomObjectId() {
        return allowCustomObjectId;
    }

    public static boolean isInitialized() {
        return ParsePlugins.get() != null;
    }

    public static boolean isLocalDatastoreEnabled() {
        return isLocalDatastoreEnabled;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Void lambda$initialize$0(Context context2) {
        getEventuallyQueue(context2);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Void lambda$initialize$1(Task task) {
        ParseConfig.getCurrentConfig();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String validateServerUrl(String str) {
        return (str == null || str.endsWith("/")) ? str : str.concat("/");
    }
}
