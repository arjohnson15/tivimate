package com.parse;

import java.io.File;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
class ParseCorePlugins {
    private static final ParseCorePlugins INSTANCE = new ParseCorePlugins();
    private final AtomicReference<ParseObjectController> objectController = new AtomicReference<>();
    private final AtomicReference<ParseUserController> userController = new AtomicReference<>();
    private final AtomicReference<ParseSessionController> sessionController = new AtomicReference<>();
    private final AtomicReference<ParseCurrentUserController> currentUserController = new AtomicReference<>();
    private final AtomicReference<ParseCurrentInstallationController> currentInstallationController = new AtomicReference<>();
    private final AtomicReference<ParseAuthenticationManager> authenticationController = new AtomicReference<>();
    private final AtomicReference<ParseQueryController> queryController = new AtomicReference<>();
    private final AtomicReference<ParseFileController> fileController = new AtomicReference<>();
    private final AtomicReference<Object> analyticsController = new AtomicReference<>();
    private final AtomicReference<ParseCloudCodeController> cloudCodeController = new AtomicReference<>();
    private final AtomicReference<ParseConfigController> configController = new AtomicReference<>();
    private final AtomicReference<Object> pushController = new AtomicReference<>();
    private final AtomicReference<Object> pushChannelsController = new AtomicReference<>();
    private final AtomicReference<ParseDefaultACLController> defaultACLController = new AtomicReference<>();
    private final AtomicReference<LocalIdManager> localIdManager = new AtomicReference<>();
    private final AtomicReference<ParseObjectSubclassingController> subclassingController = new AtomicReference<>();

    private ParseCorePlugins() {
    }

    public static ParseCorePlugins getInstance() {
        return INSTANCE;
    }

    public ParseAuthenticationManager getAuthenticationManager() {
        if (this.authenticationController.get() == null) {
            ParseAuthenticationManager parseAuthenticationManager = new ParseAuthenticationManager(getCurrentUserController());
            AtomicReference<ParseAuthenticationManager> atomicReference = this.authenticationController;
            while (!atomicReference.compareAndSet(null, parseAuthenticationManager) && atomicReference.get() == null) {
            }
        }
        return this.authenticationController.get();
    }

    public ParseCloudCodeController getCloudCodeController() {
        if (this.cloudCodeController.get() == null) {
            AtomicReference<ParseCloudCodeController> atomicReference = this.cloudCodeController;
            ParseCloudCodeController parseCloudCodeController = new ParseCloudCodeController(ParsePlugins.get().restClient());
            while (!atomicReference.compareAndSet(null, parseCloudCodeController) && atomicReference.get() == null) {
            }
        }
        return this.cloudCodeController.get();
    }

    public ParseConfigController getConfigController() {
        if (this.configController.get() == null) {
            ParseCurrentConfigController parseCurrentConfigController = new ParseCurrentConfigController(new File(ParsePlugins.get().getFilesDir(), "currentConfig"));
            AtomicReference<ParseConfigController> atomicReference = this.configController;
            ParseConfigController parseConfigController = new ParseConfigController(ParsePlugins.get().restClient(), parseCurrentConfigController);
            while (!atomicReference.compareAndSet(null, parseConfigController) && atomicReference.get() == null) {
            }
        }
        return this.configController.get();
    }

    public ParseCurrentInstallationController getCurrentInstallationController() {
        if (this.currentInstallationController.get() == null) {
            ParseObjectStore fileObjectStore = new FileObjectStore(ParseInstallation.class, new File(ParsePlugins.get().getFilesDir(), "currentInstallation"), ParseObjectCurrentCoder.get());
            if (Parse.isLocalDatastoreEnabled()) {
                fileObjectStore = new OfflineObjectStore(ParseInstallation.class, "_currentInstallation", fileObjectStore);
            }
            CachedCurrentInstallationController cachedCurrentInstallationController = new CachedCurrentInstallationController(fileObjectStore, ParsePlugins.get().installationId());
            AtomicReference<ParseCurrentInstallationController> atomicReference = this.currentInstallationController;
            while (!atomicReference.compareAndSet(null, cachedCurrentInstallationController) && atomicReference.get() == null) {
            }
        }
        return this.currentInstallationController.get();
    }

    public ParseCurrentUserController getCurrentUserController() {
        if (this.currentUserController.get() == null) {
            ParseObjectStore fileObjectStore = new FileObjectStore(ParseUser.class, new File(Parse.getParseFilesDir(), "currentUser"), ParseUserCurrentCoder.get());
            if (Parse.isLocalDatastoreEnabled()) {
                fileObjectStore = new OfflineObjectStore(ParseUser.class, "_currentUser", fileObjectStore);
            }
            CachedCurrentUserController cachedCurrentUserController = new CachedCurrentUserController(fileObjectStore);
            AtomicReference<ParseCurrentUserController> atomicReference = this.currentUserController;
            while (!atomicReference.compareAndSet(null, cachedCurrentUserController) && atomicReference.get() == null) {
            }
        }
        return this.currentUserController.get();
    }

    public ParseDefaultACLController getDefaultACLController() {
        if (this.defaultACLController.get() == null) {
            ParseDefaultACLController parseDefaultACLController = new ParseDefaultACLController();
            AtomicReference<ParseDefaultACLController> atomicReference = this.defaultACLController;
            while (!atomicReference.compareAndSet(null, parseDefaultACLController) && atomicReference.get() == null) {
            }
        }
        return this.defaultACLController.get();
    }

    public ParseFileController getFileController() {
        if (this.fileController.get() == null) {
            AtomicReference<ParseFileController> atomicReference = this.fileController;
            ParseFileController parseFileController = new ParseFileController(ParsePlugins.get().restClient(), Parse.getParseCacheDir("files"));
            while (!atomicReference.compareAndSet(null, parseFileController) && atomicReference.get() == null) {
            }
        }
        return this.fileController.get();
    }

    public LocalIdManager getLocalIdManager() {
        if (this.localIdManager.get() == null) {
            LocalIdManager localIdManager = new LocalIdManager(Parse.getParseFilesDir());
            AtomicReference<LocalIdManager> atomicReference = this.localIdManager;
            while (!atomicReference.compareAndSet(null, localIdManager) && atomicReference.get() == null) {
            }
        }
        return this.localIdManager.get();
    }

    public ParseObjectController getObjectController() {
        if (this.objectController.get() == null) {
            AtomicReference<ParseObjectController> atomicReference = this.objectController;
            NetworkObjectController networkObjectController = new NetworkObjectController(ParsePlugins.get().restClient());
            while (!atomicReference.compareAndSet(null, networkObjectController) && atomicReference.get() == null) {
            }
        }
        return this.objectController.get();
    }

    public ParseQueryController getQueryController() {
        if (this.queryController.get() == null) {
            NetworkQueryController networkQueryController = new NetworkQueryController(ParsePlugins.get().restClient());
            ParseQueryController offlineQueryController = Parse.isLocalDatastoreEnabled() ? new OfflineQueryController(Parse.getLocalDatastore(), networkQueryController) : new CacheQueryController(networkQueryController);
            AtomicReference<ParseQueryController> atomicReference = this.queryController;
            while (!atomicReference.compareAndSet(null, offlineQueryController) && atomicReference.get() == null) {
            }
        }
        return this.queryController.get();
    }

    public ParseSessionController getSessionController() {
        if (this.sessionController.get() == null) {
            AtomicReference<ParseSessionController> atomicReference = this.sessionController;
            NetworkSessionController networkSessionController = new NetworkSessionController(ParsePlugins.get().restClient());
            while (!atomicReference.compareAndSet(null, networkSessionController) && atomicReference.get() == null) {
            }
        }
        return this.sessionController.get();
    }

    public ParseObjectSubclassingController getSubclassingController() {
        if (this.subclassingController.get() == null) {
            ParseObjectSubclassingController parseObjectSubclassingController = new ParseObjectSubclassingController();
            AtomicReference<ParseObjectSubclassingController> atomicReference = this.subclassingController;
            while (!atomicReference.compareAndSet(null, parseObjectSubclassingController) && atomicReference.get() == null) {
            }
        }
        return this.subclassingController.get();
    }

    public ParseUserController getUserController() {
        if (this.userController.get() == null) {
            AtomicReference<ParseUserController> atomicReference = this.userController;
            NetworkUserController networkUserController = new NetworkUserController(ParsePlugins.get().restClient());
            while (!atomicReference.compareAndSet(null, networkUserController) && atomicReference.get() == null) {
            }
        }
        return this.userController.get();
    }
}
