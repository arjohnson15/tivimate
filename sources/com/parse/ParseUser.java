package com.parse;

import android.os.Bundle;
import android.os.Parcel;
import com.parse.ParseObject;
import com.parse.boltsinternal.Task;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

@ParseClassName("_User")
/* loaded from: classes.dex */
public class ParseUser extends ParseObject {
    private static boolean autoUserEnabled;
    private boolean isCurrentUser = false;
    private static final List<String> READ_ONLY_KEYS = DesugarCollections.unmodifiableList(Arrays.asList("sessionToken", "authData"));
    private static final Object isAutoUserEnabledMutex = new Object();

    public static class State extends ParseObject.State {
        private final boolean isNew;

        public static class Builder extends ParseObject.State.Init<Builder> {
            private boolean isNew;

            public Builder() {
                super("_User");
            }

            public Builder(State state) {
                super(state);
                this.isNew = state.isNew();
            }

            @Override // com.parse.ParseObject.State.Init
            public Builder apply(ParseObject.State state) {
                isNew(((State) state).isNew());
                return (Builder) super.apply(state);
            }

            public Builder authData(Map<String, Map<String, String>> map) {
                return put("authData", map);
            }

            @Override // com.parse.ParseObject.State.Init
            public State build() {
                return new State(this);
            }

            public Builder isNew(boolean z) {
                this.isNew = z;
                return this;
            }

            public Builder putAuthData(String str, Map<String, String> map) {
                Map map2 = (Map) this.serverData.get("authData");
                if (map2 == null) {
                    map2 = new HashMap();
                }
                map2.put(str, map);
                this.serverData.put("authData", map2);
                return this;
            }

            @Override // com.parse.ParseObject.State.Init
            public Builder self() {
                return this;
            }

            public Builder sessionToken(String str) {
                return put("sessionToken", str);
            }
        }

        public State(Parcel parcel, String str, ParseParcelDecoder parseParcelDecoder) {
            super(parcel, str, parseParcelDecoder);
            this.isNew = parcel.readByte() == 1;
        }

        private State(Builder builder) {
            super(builder);
            this.isNew = builder.isNew;
        }

        public Map<String, Map<String, String>> authData() {
            Map<String, Map<String, String>> map = (Map) get("authData");
            return map == null ? new HashMap() : map;
        }

        public boolean isNew() {
            return this.isNew;
        }

        @Override // com.parse.ParseObject.State
        public Builder newBuilder() {
            return new Builder(this);
        }

        public String sessionToken() {
            return (String) get("sessionToken");
        }

        @Override // com.parse.ParseObject.State
        public void writeToParcel(Parcel parcel, ParseParcelEncoder parseParcelEncoder) {
            super.writeToParcel(parcel, parseParcelEncoder);
            parcel.writeByte(this.isNew ? (byte) 1 : (byte) 0);
        }
    }

    private Map<String, String> getAuthData(String str) {
        return getAuthData().get(str);
    }

    public static ParseAuthenticationManager getAuthenticationManager() {
        return ParseCorePlugins.getInstance().getAuthenticationManager();
    }

    public static Task<String> getCurrentSessionTokenAsync() {
        return getCurrentUserController().getCurrentSessionTokenAsync();
    }

    public static ParseUser getCurrentUser() {
        return getCurrentUser(isAutomaticUserEnabled());
    }

    private static ParseUser getCurrentUser(boolean z) {
        try {
            return (ParseUser) ParseTaskUtils.wait(getCurrentUserController().getAsync(z));
        } catch (ParseException unused) {
            return null;
        }
    }

    public static Task<ParseUser> getCurrentUserAsync() {
        return getCurrentUserController().getAsync();
    }

    public static ParseCurrentUserController getCurrentUserController() {
        return ParseCorePlugins.getInstance().getCurrentUserController();
    }

    public static ParseUserController getUserController() {
        return ParseCorePlugins.getInstance().getUserController();
    }

    public static boolean isAutomaticUserEnabled() {
        boolean z;
        synchronized (isAutoUserEnabledMutex) {
            z = autoUserEnabled;
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ParseUser lambda$logInInBackground$0(ParseUser parseUser, Task task) {
        return parseUser;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Task lambda$logInInBackground$1(Task task) {
        ParseUser parseUser = (ParseUser) ParseObject.from((State) task.getResult());
        return saveCurrentUserAsync(parseUser).onSuccess(new C0795(parseUser, 3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ State lambda$resolveLazinessAsync$26(State state, Task task) {
        return state;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Task lambda$resolveLazinessAsync$27(Task task) {
        State state = (State) task.getResult();
        return !state.isNew() ? saveCurrentUserAsync((ParseUser) ParseObject.from(state)) : task.makeVoid();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Task lambda$resolveLazinessAsync$28(ParseOperationSet parseOperationSet, Task task) {
        State state = (State) task.getResult();
        return ((!Parse.isLocalDatastoreEnabled() || state.isNew()) ? handleSaveResultAsync(state, parseOperationSet).onSuccess(new C0798(5, state)) : Task.forResult(state)).onSuccessTask(new C0833(21));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Task lambda$resolveLazinessAsync$29(ParseOperationSet parseOperationSet, Task task) {
        return getUserController().logInAsync(getState(), parseOperationSet).onSuccessTask(new C0794(this, parseOperationSet, 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Task lambda$saveAsync$13(Task task) {
        return cleanUpAuthDataAsync();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Task lambda$saveAsync$14(Task task) {
        return saveCurrentUserAsync(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Task lambda$signUpAsync$19(ParseUser parseUser, String str, String str2, Map map, Task task) {
        if (!task.isCancelled() && !task.isFaulted()) {
            parseUser.revert("password");
            revert("password");
            mergeFromObject(parseUser);
            return saveCurrentUserAsync(this);
        }
        synchronized (parseUser.mutex) {
            try {
                if (str != null) {
                    parseUser.setUsername(str);
                } else {
                    parseUser.revert("username");
                }
                if (str2 != null) {
                    parseUser.setPassword(str2);
                } else {
                    parseUser.revert("password");
                }
                parseUser.restoreAnonymity(map);
            } catch (Throwable th) {
                throw th;
            }
        }
        return task;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Task lambda$signUpAsync$20(Task task, Task task2) {
        return (task.isCancelled() || task.isFaulted()) ? task.makeVoid() : saveCurrentUserAsync(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Task lambda$signUpAsync$21(ParseOperationSet parseOperationSet, Task task) {
        return handleSaveResultAsync((State) task.getResult(), parseOperationSet).continueWithTask(new C0855(this, 23, task));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Task lambda$signUpAsync$22(ParseOperationSet parseOperationSet, String str, String str2, Task task) {
        return getUserController().signUpAsync(getState(), parseOperationSet, str, str2).continueWithTask(new C0794(this, parseOperationSet, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Task lambda$synchronizeAuthDataAsync$23(String str, Task task) {
        return (task.isFaulted() || !((Boolean) task.getResult()).booleanValue()) ? unlinkFromInBackground(str) : task.makeVoid();
    }

    public static Task<ParseUser> logInInBackground(String str, String str2, String str3) {
        if (str == null) {
            throw new IllegalArgumentException("Must specify a username for the user to log in with");
        }
        if (str2 != null) {
            return getUserController().logInAsync(str, str2, str3).onSuccessTask(new C0833(22));
        }
        throw new IllegalArgumentException("Must specify a password for the user to log in with");
    }

    public static void logInInBackground(String str, String str2, String str3, LogInCallback logInCallback) {
        ParseTaskUtils.callbackOnMainThreadAsync(logInInBackground(str, str2, str3), logInCallback);
    }

    public static void logOut() {
        try {
            ParseTaskUtils.wait(logOutInBackground());
        } catch (ParseException unused) {
        }
    }

    public static Task<Void> logOutInBackground() {
        return getCurrentUserController().logOutAsync();
    }

    public static void logOutInBackground(LogOutCallback logOutCallback) {
        ParseTaskUtils.callbackOnMainThreadAsync(logOutInBackground(), logOutCallback);
    }

    public static Task<Void> pinCurrentUserIfNeededAsync(ParseUser parseUser) {
        if (Parse.isLocalDatastoreEnabled()) {
            return getCurrentUserController().setIfNeededAsync(parseUser);
        }
        throw new IllegalStateException("Method requires Local Datastore. Please refer to `Parse#enableLocalDatastore(Context)`.");
    }

    private void removeAuthData(String str) {
        synchronized (this.mutex) {
            HashMap map = new HashMap(getAuthData());
            map.remove(str);
            performPut("authData", map);
        }
    }

    public static Task<Void> requestPasswordResetInBackground(String str) {
        return getUserController().requestPasswordResetAsync(str);
    }

    public static void requestPasswordResetInBackground(String str, RequestPasswordResetCallback requestPasswordResetCallback) {
        ParseTaskUtils.callbackOnMainThreadAsync(requestPasswordResetInBackground(str), requestPasswordResetCallback);
    }

    private void restoreAnonymity(Map<String, String> map) {
        synchronized (this.mutex) {
            if (map != null) {
                try {
                    putAuthData("anonymous", map);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    private static Task<Void> saveCurrentUserAsync(ParseUser parseUser) {
        return getCurrentUserController().setAsync(parseUser);
    }

    private void stripAnonymity() {
        synchronized (this.mutex) {
            try {
                if (ParseAnonymousUtils.isLinked(this)) {
                    if (getObjectId() != null) {
                        putAuthData("anonymous", null);
                    } else {
                        removeAuthData("anonymous");
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private Task<Void> synchronizeAuthDataAsync(ParseAuthenticationManager parseAuthenticationManager, String str, Map<String, String> map) {
        return parseAuthenticationManager.restoreAuthenticationAsync(str, map).continueWithTask(new C0807(this, str, 1));
    }

    public Task<Void> cleanUpAuthDataAsync() {
        ParseAuthenticationManager authenticationManager = getAuthenticationManager();
        synchronized (this.mutex) {
            try {
                Map<String, Map<String, String>> mapAuthData = getState().authData();
                if (mapAuthData.size() == 0) {
                    return Task.forResult(null);
                }
                ArrayList arrayList = new ArrayList();
                Iterator<Map.Entry<String, Map<String, String>>> it = mapAuthData.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry<String, Map<String, String>> next = it.next();
                    if (next.getValue() == null) {
                        it.remove();
                        arrayList.add(authenticationManager.restoreAuthenticationAsync(next.getKey(), null).makeVoid());
                    }
                }
                setState(getState().newBuilder().authData(mapAuthData).build());
                return Task.whenAll(arrayList);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.parse.ParseObject
    public <T extends ParseObject> Task<T> fetchFromLocalDatastoreAsync() {
        return isLazy() ? Task.forResult(this) : super.fetchFromLocalDatastoreAsync();
    }

    public Map<String, Map<String, String>> getAuthData() {
        Map<String, Map<String, String>> map;
        synchronized (this.mutex) {
            try {
                map = getMap("authData");
                if (map == null) {
                    map = new HashMap<>();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return map;
    }

    public String getEmail() {
        return getString("email");
    }

    public String getPassword() {
        return getString("password");
    }

    public String getSessionToken() {
        return getState().sessionToken();
    }

    @Override // com.parse.ParseObject
    public State getState() {
        return (State) super.getState();
    }

    public String getUsername() {
        return getString("username");
    }

    @Override // com.parse.ParseObject
    public Task<Void> handleSaveResultAsync(ParseObject.State state, ParseOperationSet parseOperationSet) {
        if (state != null) {
            parseOperationSet.remove("password");
        }
        return super.handleSaveResultAsync(state, parseOperationSet);
    }

    public boolean isAuthenticated() {
        boolean z;
        synchronized (this.mutex) {
            try {
                ParseUser currentUser = getCurrentUser();
                z = isLazy() || !(getState().sessionToken() == null || currentUser == null || !getObjectId().equals(currentUser.getObjectId()));
            } finally {
            }
        }
        return z;
    }

    public boolean isCurrentUser() {
        boolean z;
        synchronized (this.mutex) {
            z = this.isCurrentUser;
        }
        return z;
    }

    @Override // com.parse.ParseObject
    public boolean isKeyMutable(String str) {
        return !READ_ONLY_KEYS.contains(str);
    }

    public boolean isLazy() {
        boolean z;
        synchronized (this.mutex) {
            try {
                z = getObjectId() == null && ParseAnonymousUtils.isLinked(this);
            } finally {
            }
        }
        return z;
    }

    public boolean isLinked(String str) {
        Map<String, Map<String, String>> authData = getAuthData();
        return authData.containsKey(str) && authData.get(str) != null;
    }

    public Task<Void> logOutAsync() {
        return logOutAsync(true);
    }

    public Task<Void> logOutAsync(boolean z) {
        String strSessionToken;
        ParseAuthenticationManager authenticationManager = getAuthenticationManager();
        ArrayList arrayList = new ArrayList();
        synchronized (this.mutex) {
            try {
                strSessionToken = getState().sessionToken();
                Iterator<Map.Entry<String, Map<String, String>>> it = getAuthData().entrySet().iterator();
                while (it.hasNext()) {
                    arrayList.add(authenticationManager.deauthenticateAsync(it.next().getKey()));
                }
                State stateBuild = getState().newBuilder().sessionToken(null).isNew(false).build();
                this.isCurrentUser = false;
                setState(stateBuild);
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            arrayList.add(ParseSession.revokeAsync(strSessionToken));
        }
        return Task.whenAll(arrayList);
    }

    @Override // com.parse.ParseObject
    public boolean needsDefaultACL() {
        return false;
    }

    @Override // com.parse.ParseObject
    public State.Builder newStateBuilder(String str) {
        return new State.Builder();
    }

    @Override // com.parse.ParseObject
    public void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        setIsCurrentUser(bundle.getBoolean("_isCurrentUser", false));
    }

    @Override // com.parse.ParseObject
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        synchronized (this.mutex) {
            bundle.putBoolean("_isCurrentUser", this.isCurrentUser);
        }
    }

    @Override // com.parse.ParseObject
    public void put(String str, Object obj) {
        synchronized (this.mutex) {
            try {
                if ("username".equals(str)) {
                    stripAnonymity();
                }
                super.put(str, obj);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void putAuthData(String str, Map<String, String> map) {
        synchronized (this.mutex) {
            HashMap map2 = new HashMap(getAuthData());
            map2.put(str, map);
            performPut("authData", map2);
        }
    }

    public Task<Void> resolveLazinessAsync(Task<Void> task) {
        synchronized (this.mutex) {
            try {
                if (getAuthData().size() == 0) {
                    return lambda$signUpInBackground$18(task, "");
                }
                return task.onSuccessTask(new C0794(this, startSave(), 0));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.parse.ParseObject
    /* renamed from: saveAsync */
    public Task<Void> lambda$saveAsync$33(String str, Task<Void> task) {
        return saveAsync(str, isLazy(), task);
    }

    public Task<Void> saveAsync(String str, boolean z, Task<Void> task) {
        Task<Void> taskResolveLazinessAsync = z ? resolveLazinessAsync(task) : super.lambda$saveAsync$33(str, task);
        return isCurrentUser() ? taskResolveLazinessAsync.onSuccessTask(new C0795(this, 1)).onSuccessTask(new C0795(this, 2)) : taskResolveLazinessAsync;
    }

    public void setEmail(String str) {
        put("email", str);
    }

    public void setIsCurrentUser(boolean z) {
        synchronized (this.mutex) {
            this.isCurrentUser = z;
        }
    }

    public void setPassword(String str) {
        put("password", str);
    }

    @Override // com.parse.ParseObject
    public void setState(ParseObject.State state) {
        if (isCurrentUser()) {
            State.Builder builder = (State.Builder) state.newBuilder();
            if (getSessionToken() != null && state.get("sessionToken") == null) {
                builder.put("sessionToken", getSessionToken());
            }
            if (getAuthData().size() > 0 && state.get("authData") == null) {
                builder.put("authData", getAuthData());
            }
            state = builder.build();
        }
        super.setState(state);
    }

    public void setUsername(String str) {
        put("username", str);
    }

    /* renamed from: signUpAsync, reason: merged with bridge method [inline-methods] */
    public Task<Void> lambda$signUpInBackground$18(Task<Void> task, String str) {
        String sessionToken;
        ParseUser currentUser = getCurrentUser();
        synchronized (this.mutex) {
            if (currentUser != null) {
                try {
                    sessionToken = currentUser.getSessionToken();
                } catch (Throwable th) {
                    throw th;
                }
            } else {
                sessionToken = null;
            }
            String str2 = sessionToken;
            if (ParseTextUtils.isEmpty(getUsername())) {
                return Task.forError(new IllegalArgumentException("Username cannot be missing or blank"));
            }
            if (ParseTextUtils.isEmpty(getPassword())) {
                return Task.forError(new IllegalArgumentException("Password cannot be missing or blank"));
            }
            if (getObjectId() != null) {
                Map<String, Map<String, String>> authData = getAuthData();
                if (authData.containsKey("anonymous") && authData.get("anonymous") == null) {
                    return lambda$saveAsync$33(str2, task);
                }
                return Task.forError(new IllegalArgumentException("Cannot sign up a user that has already signed up."));
            }
            if (this.operationSetQueue.size() > 1) {
                return Task.forError(new IllegalArgumentException("Cannot sign up a user that is already signing up."));
            }
            if (currentUser == null || !ParseAnonymousUtils.isLinked(currentUser)) {
                return task.onSuccessTask(new C0837(this, startSave(), str2, str, 6));
            }
            if (this == currentUser) {
                return Task.forError(new IllegalArgumentException("Attempt to merge currentUser with itself."));
            }
            boolean zIsLazy = currentUser.isLazy();
            String username = currentUser.getUsername();
            String password = currentUser.getPassword();
            Map<String, String> authData2 = currentUser.getAuthData("anonymous");
            currentUser.copyChangesFrom(this);
            currentUser.setUsername(getUsername());
            currentUser.setPassword(getPassword());
            revert();
            return currentUser.saveAsync(str2, zIsLazy, task).continueWithTask(new C0850(this, currentUser, username, password, authData2));
        }
    }

    public Task<Void> signUpInBackground(String str) {
        return this.taskQueue.enqueue(new C0807(this, str, 0));
    }

    public void signUpInBackground(String str, SignUpCallback signUpCallback) {
        ParseTaskUtils.callbackOnMainThreadAsync(signUpInBackground(str), signUpCallback);
    }

    public Task<Void> synchronizeAllAuthDataAsync() {
        synchronized (this.mutex) {
            try {
                if (!isCurrentUser()) {
                    return Task.forResult(null);
                }
                Map<String, Map<String, String>> authData = getAuthData();
                ArrayList arrayList = new ArrayList(authData.size());
                Iterator<String> it = authData.keySet().iterator();
                while (it.hasNext()) {
                    arrayList.add(synchronizeAuthDataAsync(it.next()));
                }
                return Task.whenAll(arrayList);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public Task<Void> synchronizeAuthDataAsync(String str) {
        synchronized (this.mutex) {
            try {
                if (isCurrentUser()) {
                    return synchronizeAuthDataAsync(getAuthenticationManager(), str, getAuthData(str));
                }
                return Task.forResult(null);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.parse.ParseObject
    public JSONObject toRest(ParseObject.State state, List<ParseOperationSet> list, ParseEncoder parseEncoder) {
        List<ParseOperationSet> linkedList = list;
        for (int i = 0; i < list.size(); i++) {
            ParseOperationSet parseOperationSet = list.get(i);
            if (parseOperationSet.containsKey("password")) {
                if (linkedList == list) {
                    linkedList = new LinkedList<>(list);
                }
                ParseOperationSet parseOperationSet2 = new ParseOperationSet(parseOperationSet);
                parseOperationSet2.remove("password");
                linkedList.set(i, parseOperationSet2);
            }
        }
        return super.toRest(state, linkedList, parseEncoder);
    }

    public Task<Void> unlinkFromInBackground(String str) {
        if (str == null) {
            return Task.forResult(null);
        }
        synchronized (this.mutex) {
            try {
                if (getAuthData().containsKey(str)) {
                    putAuthData(str, null);
                    return saveInBackground();
                }
                return Task.forResult(null);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.parse.ParseObject
    public void validateSave() {
        ParseUser currentUser;
        synchronized (this.mutex) {
            if (getObjectId() == null) {
                throw new IllegalArgumentException("Cannot save a ParseUser until it has been signed up. Call signUp first.");
            }
            if (!isAuthenticated() && isDirty() && !isCurrentUser()) {
                if (Parse.isLocalDatastoreEnabled() || (currentUser = getCurrentUser()) == null || !getObjectId().equals(currentUser.getObjectId())) {
                    throw new IllegalArgumentException("Cannot save a ParseUser that is not authenticated.");
                }
            }
        }
    }
}
