package com.parse;

import com.parse.boltsinternal.Task;
import java.util.Arrays;
import java.util.Map;

/* loaded from: classes.dex */
class CachedCurrentUserController implements ParseCurrentUserController {
    ParseUser currentUser;
    private final ParseObjectStore<ParseUser> store;
    private final Object mutex = new Object();
    private final TaskQueue taskQueue = new TaskQueue();
    boolean currentUserMatchesDisk = false;

    public CachedCurrentUserController(ParseObjectStore<ParseUser> parseObjectStore) {
        this.store = parseObjectStore;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ParseUser lambda$getAsync$13(boolean z, Task task) {
        ParseUser parseUser = (ParseUser) task.getResult();
        boolean z2 = !task.isFaulted();
        synchronized (this.mutex) {
            this.currentUser = parseUser;
            this.currentUserMatchesDisk = z2;
        }
        if (parseUser == null) {
            if (z) {
                return lazyLogIn();
            }
            return null;
        }
        synchronized (parseUser.mutex) {
            parseUser.setIsCurrentUser(true);
        }
        return parseUser;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Task lambda$getAsync$14(boolean z, Task task) {
        ParseUser parseUser;
        boolean z2;
        synchronized (this.mutex) {
            parseUser = this.currentUser;
            z2 = this.currentUserMatchesDisk;
        }
        if (parseUser != null) {
            return Task.forResult(parseUser);
        }
        if (!z2) {
            return this.store.getAsync().continueWith(new C0819(this, z, 2));
        }
        if (z) {
            return Task.forResult(lazyLogIn());
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Task lambda$getAsync$15(boolean z, Task task) {
        return task.continueWithTask(new C0819(this, z, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$getCurrentSessionTokenAsync$8(Task task) {
        ParseUser parseUser = (ParseUser) task.getResult();
        if (parseUser != null) {
            return parseUser.getSessionToken();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Void lambda$logOutAsync$10(Task task) {
        boolean z = !task.isFaulted();
        synchronized (this.mutex) {
            this.currentUserMatchesDisk = z;
            this.currentUser = null;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Task lambda$logOutAsync$11(Task task, Task task2) {
        return Task.whenAll(Arrays.asList(task.onSuccessTask(new C0833(2)), this.store.deleteAsync().continueWith(new C0853(this, 1))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Task lambda$logOutAsync$12(Task task) {
        Task<ParseUser> async = getAsync(false);
        return Task.whenAll(Arrays.asList(async, task)).continueWithTask(new C0855(this, 0, async));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Task lambda$logOutAsync$9(Task task) {
        ParseUser parseUser = (ParseUser) task.getResult();
        return parseUser == null ? task.cast() : parseUser.logOutAsync();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Void lambda$setAsync$0(Task task) {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Task lambda$setAsync$1(ParseUser parseUser, Task task) {
        ParseUser parseUser2;
        synchronized (this.mutex) {
            parseUser2 = this.currentUser;
        }
        return (parseUser2 == null || parseUser2 == parseUser) ? task : parseUser2.logOutAsync(false).continueWith(new C0833(0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Task lambda$setAsync$2(ParseUser parseUser, Task task) {
        parseUser.setIsCurrentUser(true);
        return parseUser.synchronizeAllAuthDataAsync();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Void lambda$setAsync$3(ParseUser parseUser, Task task) {
        synchronized (this.mutex) {
            this.currentUserMatchesDisk = !task.isFaulted();
            this.currentUser = parseUser;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Task lambda$setAsync$4(ParseUser parseUser, Task task) {
        return this.store.setAsync(parseUser).continueWith(new C0830(this, parseUser, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Task lambda$setAsync$5(ParseUser parseUser, Task task) {
        int i = 0;
        return task.continueWithTask(new C0830(this, parseUser, 3)).onSuccessTask(new C0795(parseUser, i)).onSuccessTask(new C0830(this, parseUser, i));
    }

    private ParseUser lazyLogIn() {
        return lazyLogIn("anonymous", ParseAnonymousUtils.getAuthData());
    }

    @Override // com.parse.ParseObjectCurrentController
    public void clearFromMemory() {
        synchronized (this.mutex) {
            this.currentUser = null;
            this.currentUserMatchesDisk = false;
        }
    }

    @Override // com.parse.ParseObjectCurrentController
    public Task<ParseUser> getAsync() {
        return getAsync(ParseUser.isAutomaticUserEnabled());
    }

    @Override // com.parse.ParseCurrentUserController
    public Task<ParseUser> getAsync(boolean z) {
        synchronized (this.mutex) {
            try {
                ParseUser parseUser = this.currentUser;
                if (parseUser == null) {
                    return this.taskQueue.enqueue(new C0819(this, z, 0));
                }
                return Task.forResult(parseUser);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.parse.ParseCurrentUserController
    public Task<String> getCurrentSessionTokenAsync() {
        return getAsync(false).onSuccess(new C0833(1));
    }

    public ParseUser lazyLogIn(String str, Map<String, String> map) {
        ParseUser parseUser = (ParseUser) ParseObject.create(ParseUser.class);
        synchronized (parseUser.mutex) {
            parseUser.setIsCurrentUser(true);
            parseUser.putAuthData(str, map);
        }
        synchronized (this.mutex) {
            this.currentUserMatchesDisk = false;
            this.currentUser = parseUser;
        }
        return parseUser;
    }

    @Override // com.parse.ParseCurrentUserController
    public Task<Void> logOutAsync() {
        return this.taskQueue.enqueue(new C0853(this, 0));
    }

    @Override // com.parse.ParseObjectCurrentController
    public Task<Void> setAsync(ParseUser parseUser) {
        return this.taskQueue.enqueue(new C0830(this, parseUser, 2));
    }

    @Override // com.parse.ParseCurrentUserController
    public Task<Void> setIfNeededAsync(ParseUser parseUser) {
        synchronized (this.mutex) {
            if (parseUser.isCurrentUser() && !this.currentUserMatchesDisk) {
                return setAsync(parseUser);
            }
            return Task.forResult(null);
        }
    }
}
