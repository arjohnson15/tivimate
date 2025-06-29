package com.parse;

import com.parse.ParseObject;
import com.parse.boltsinternal.Task;
import com.parse.boltsinternal.TaskCompletionSource;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class ParseQuery<T extends ParseObject> {
    private final State.Builder<T> builder;
    private final Set<TaskCompletionSource<?>> currentTasks;
    private ParseUser user;

    public enum CachePolicy {
        IGNORE_CACHE,
        CACHE_ONLY,
        NETWORK_ONLY,
        CACHE_ELSE_NETWORK,
        NETWORK_ELSE_CACHE,
        CACHE_THEN_NETWORK
    }

    public static class KeyConstraints extends HashMap<String, Object> {
    }

    public static class QueryConstraints extends HashMap<String, Object> {
        public QueryConstraints() {
        }

        public QueryConstraints(Map<? extends String, ?> map) {
            super(map);
        }
    }

    public static class State<T extends ParseObject> {
        private final CachePolicy cachePolicy;
        private final String className;
        private final Map<String, Object> extraOptions;
        private final boolean ignoreACLs;
        private final Set<String> include;
        private final boolean isFromLocalDatastore;
        private final int limit;
        private final long maxCacheAge;
        private final List<String> order;
        private final String pinName;
        private final Set<String> selectedKeys;
        private final int skip;
        private final boolean trace;
        private final QueryConstraints where;

        public static class Builder<T extends ParseObject> {
            private CachePolicy cachePolicy;
            private final String className;
            private final Map<String, Object> extraOptions;
            private boolean ignoreACLs;
            private final Set<String> includes;
            private boolean isFromLocalDatastore;
            private int limit;
            private long maxCacheAge;
            private final List<String> order;
            private String pinName;
            private Set<String> selectedKeys;
            private int skip;
            private boolean trace;
            private final QueryConstraints where;

            public Builder(Class<T> cls) {
                this(ParseQuery.getSubclassingController().getClassName(cls));
            }

            public Builder(String str) {
                this.where = new QueryConstraints();
                this.includes = new HashSet();
                this.extraOptions = new HashMap();
                this.order = new ArrayList();
                this.limit = -1;
                this.skip = 0;
                this.cachePolicy = CachePolicy.IGNORE_CACHE;
                this.maxCacheAge = Long.MAX_VALUE;
                this.isFromLocalDatastore = false;
                this.className = str;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            private com.parse.ParseQuery.State.Builder<T> addConditionInternal(java.lang.String r3, java.lang.String r4, java.lang.Object r5) {
                /*
                    r2 = this;
                    com.parse.ParseQuery$QueryConstraints r0 = r2.where
                    boolean r0 = r0.containsKey(r3)
                    if (r0 == 0) goto L15
                    com.parse.ParseQuery$QueryConstraints r0 = r2.where
                    java.lang.Object r0 = r0.get(r3)
                    boolean r1 = r0 instanceof com.parse.ParseQuery.KeyConstraints
                    if (r1 == 0) goto L15
                    com.parse.ParseQuery$KeyConstraints r0 = (com.parse.ParseQuery.KeyConstraints) r0
                    goto L16
                L15:
                    r0 = 0
                L16:
                    if (r0 != 0) goto L1d
                    com.parse.ParseQuery$KeyConstraints r0 = new com.parse.ParseQuery$KeyConstraints
                    r0.<init>()
                L1d:
                    r0.put(r4, r5)
                    com.parse.ParseQuery$QueryConstraints r4 = r2.where
                    r4.put(r3, r0)
                    return r2
                */
                throw new UnsupportedOperationException("Method not decompiled: com.parse.ParseQuery.State.Builder.addConditionInternal(java.lang.String, java.lang.String, java.lang.Object):com.parse.ParseQuery$State$Builder");
            }

            private Builder<T> setOrder(String str) {
                this.order.clear();
                this.order.add(str);
                return this;
            }

            public Builder<T> addCondition(String str, String str2, Collection<?> collection) {
                return addConditionInternal(str, str2, DesugarCollections.unmodifiableCollection(collection));
            }

            public State<T> build() {
                if (this.isFromLocalDatastore || !this.ignoreACLs) {
                    return new State<>(this);
                }
                throw new IllegalStateException("`ignoreACLs` cannot be combined with network queries");
            }

            public Builder<T> fromPin(String str) {
                ParseQuery.throwIfLDSDisabled();
                this.isFromLocalDatastore = true;
                this.pinName = str;
                return this;
            }

            public Builder<T> ignoreACLs() {
                ParseQuery.throwIfLDSDisabled();
                this.ignoreACLs = true;
                return this;
            }

            public Builder<T> orderByAscending(String str) {
                return setOrder(str);
            }

            public Builder<T> whereEqualTo(String str, Object obj) {
                this.where.put(str, obj);
                return this;
            }
        }

        private State(Builder<T> builder) {
            this.className = ((Builder) builder).className;
            this.where = new QueryConstraints(((Builder) builder).where);
            this.include = DesugarCollections.unmodifiableSet(new HashSet(((Builder) builder).includes));
            this.selectedKeys = ((Builder) builder).selectedKeys != null ? DesugarCollections.unmodifiableSet(new HashSet(((Builder) builder).selectedKeys)) : null;
            this.limit = ((Builder) builder).limit;
            this.skip = ((Builder) builder).skip;
            this.order = DesugarCollections.unmodifiableList(new ArrayList(((Builder) builder).order));
            this.extraOptions = DesugarCollections.unmodifiableMap(new HashMap(((Builder) builder).extraOptions));
            this.trace = ((Builder) builder).trace;
            this.cachePolicy = ((Builder) builder).cachePolicy;
            this.maxCacheAge = ((Builder) builder).maxCacheAge;
            this.isFromLocalDatastore = ((Builder) builder).isFromLocalDatastore;
            this.pinName = ((Builder) builder).pinName;
            this.ignoreACLs = ((Builder) builder).ignoreACLs;
        }

        public CachePolicy cachePolicy() {
            return this.cachePolicy;
        }

        public String className() {
            return this.className;
        }

        public QueryConstraints constraints() {
            return this.where;
        }

        public Map<String, Object> extraOptions() {
            return this.extraOptions;
        }

        public boolean ignoreACLs() {
            return this.ignoreACLs;
        }

        public Set<String> includes() {
            return this.include;
        }

        public boolean isFromLocalDatastore() {
            return this.isFromLocalDatastore;
        }

        public boolean isTracingEnabled() {
            return this.trace;
        }

        public int limit() {
            return this.limit;
        }

        public long maxCacheAge() {
            return this.maxCacheAge;
        }

        public List<String> order() {
            return this.order;
        }

        public String pinName() {
            return this.pinName;
        }

        public Set<String> selectedKeys() {
            return this.selectedKeys;
        }

        public int skip() {
            return this.skip;
        }

        public JSONObject toJSON(ParseEncoder parseEncoder) throws JSONException {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("className", this.className);
                jSONObject.put("where", parseEncoder.encode(this.where));
                int i = this.limit;
                if (i >= 0) {
                    jSONObject.put("limit", i);
                }
                int i2 = this.skip;
                if (i2 > 0) {
                    jSONObject.put("skip", i2);
                }
                if (!this.order.isEmpty()) {
                    jSONObject.put("order", ParseTextUtils.join(",", this.order));
                }
                if (!this.include.isEmpty()) {
                    jSONObject.put("include", ParseTextUtils.join(",", this.include));
                }
                Set<String> set = this.selectedKeys;
                if (set != null) {
                    jSONObject.put("fields", ParseTextUtils.join(",", set));
                }
                if (this.trace) {
                    jSONObject.put("trace", 1);
                }
                for (String str : this.extraOptions.keySet()) {
                    jSONObject.put(str, parseEncoder.encode(this.extraOptions.get(str)));
                }
                return jSONObject;
            } catch (JSONException e) {
                throw new RuntimeException(e);
            }
        }

        public String toString() {
            return String.format(Locale.US, "%s[className=%s, where=%s, include=%s, selectedKeys=%s, limit=%s, skip=%s, order=%s, extraOptions=%s, cachePolicy=%s, maxCacheAge=%s, trace=%s]", getClass().getName(), this.className, this.where, this.include, this.selectedKeys, Integer.valueOf(this.limit), Integer.valueOf(this.skip), this.order, this.extraOptions, this.cachePolicy, Long.valueOf(this.maxCacheAge), Boolean.valueOf(this.trace));
        }
    }

    public ParseQuery(State.Builder<T> builder) {
        this.currentTasks = DesugarCollections.synchronizedSet(new HashSet());
        this.builder = builder;
    }

    public ParseQuery(Class<T> cls) {
        this(getSubclassingController().getClassName(cls));
    }

    public ParseQuery(String str) {
        this(new State.Builder(str));
    }

    private Task<List<T>> findAsync(State<T> state) {
        TaskCompletionSource<?> taskCompletionSource = new TaskCompletionSource<>();
        return (Task<List<T>>) perform(new CallableC0829(this, state, taskCompletionSource), taskCompletionSource);
    }

    public static <T extends ParseObject> ParseQuery<T> getQuery(String str) {
        return new ParseQuery<>(str);
    }

    private static ParseQueryController getQueryController() {
        return ParseCorePlugins.getInstance().getQueryController();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ParseObjectSubclassingController getSubclassingController() {
        return ParseCorePlugins.getInstance().getSubclassingController();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Task lambda$findAsync$1(State state, TaskCompletionSource taskCompletionSource, Task task) {
        return findAsync(state, (ParseUser) task.getResult(), taskCompletionSource.getTask());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Task lambda$findAsync$2(State state, TaskCompletionSource taskCompletionSource) {
        return getUserAsync(state).onSuccessTask(new C0813(this, state, taskCompletionSource, 18));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Task lambda$perform$0(TaskCompletionSource taskCompletionSource, Task task) {
        taskCompletionSource.trySetResult(null);
        this.currentTasks.remove(taskCompletionSource);
        return task;
    }

    private <TResult> Task<TResult> perform(Callable<Task<TResult>> callable, TaskCompletionSource<?> taskCompletionSource) throws Exception {
        Task<TResult> taskForError;
        this.currentTasks.add(taskCompletionSource);
        try {
            taskForError = callable.call();
        } catch (Exception e) {
            taskForError = Task.forError(e);
        }
        return (Task<TResult>) taskForError.continueWithTask(new C0855(this, 22, taskCompletionSource));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void throwIfLDSDisabled() {
        throwIfLDSEnabled(true);
    }

    private static void throwIfLDSEnabled(boolean z) {
        boolean zIsLocalDatastoreEnabled = Parse.isLocalDatastoreEnabled();
        if (z && !zIsLocalDatastoreEnabled) {
            throw new IllegalStateException("Method requires Local Datastore. Please refer to `Parse#enableLocalDatastore(Context)`.");
        }
        if (!z && zIsLocalDatastoreEnabled) {
            throw new IllegalStateException("Unsupported method when Local Datastore is enabled.");
        }
    }

    public Task<List<T>> findAsync(State<T> state, ParseUser parseUser, Task<Void> task) {
        return getQueryController().findAsync(state, parseUser, task);
    }

    public Task<List<T>> findInBackground() {
        return findAsync(this.builder.build());
    }

    public ParseQuery<T> fromPin(String str) {
        this.builder.fromPin(str);
        return this;
    }

    public Task<ParseUser> getUserAsync(State<T> state) {
        if (state.ignoreACLs()) {
            return Task.forResult(null);
        }
        ParseUser parseUser = this.user;
        return parseUser != null ? Task.forResult(parseUser) : ParseUser.getCurrentUserAsync();
    }

    public ParseQuery<T> ignoreACLs() {
        this.builder.ignoreACLs();
        return this;
    }

    public ParseQuery<T> orderByAscending(String str) {
        this.builder.orderByAscending(str);
        return this;
    }

    public ParseQuery<T> whereNotContainedIn(String str, Collection<?> collection) {
        this.builder.addCondition(str, "$nin", collection);
        return this;
    }
}
