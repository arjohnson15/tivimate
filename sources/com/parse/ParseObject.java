package com.parse;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.AbstractC0002;
import com.parse.ParseUser;
import com.parse.boltsinternal.Capture;
import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;
import com.parse.boltsinternal.TaskCompletionSource;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class ParseObject implements Parcelable {
    private final Map<String, Object> estimatedData;
    boolean isDeleted;
    boolean isDeleting;
    int isDeletingEventually;
    private boolean ldsEnabledWhenParceling;
    String localId;
    final Object mutex;
    final LinkedList<ParseOperationSet> operationSetQueue;
    private final ParseMulticastDelegate<ParseObject> saveEvent;
    private State state;
    final TaskQueue taskQueue;
    private static final ThreadLocal<String> isCreatingPointerForObjectId = new ThreadLocal<String>() { // from class: com.parse.ParseObject.1
        @Override // java.lang.ThreadLocal
        public String initialValue() {
            return null;
        }
    };
    public static final Parcelable.Creator<ParseObject> CREATOR = new Parcelable.Creator<ParseObject>() { // from class: com.parse.ParseObject.2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ParseObject createFromParcel(Parcel parcel) {
            return ParseObject.createFromParcel(parcel, new ParseObjectParcelDecoder());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ParseObject[] newArray(int i) {
            return new ParseObject[i];
        }
    };

    public static class State {
        private final Set<String> availableKeys;
        private final String className;
        private final long createdAt;
        private final boolean isComplete;
        private final String objectId;
        private final Map<String, Object> serverData;
        private final long updatedAt;

        public static class Builder extends Init<Builder> {
            public Builder(State state) {
                super(state);
            }

            public Builder(String str) {
                super(str);
            }

            @Override // com.parse.ParseObject.State.Init
            public State build() {
                return new State(this);
            }

            @Override // com.parse.ParseObject.State.Init
            public Builder self() {
                return this;
            }
        }

        public static abstract class Init<T extends Init> {
            private Set<String> availableKeys;
            private final String className;
            private long createdAt;
            private boolean isComplete;
            private String objectId;
            final Map<String, Object> serverData;
            private long updatedAt;

            public Init(State state) {
                this.serverData = new HashMap();
                this.createdAt = -1L;
                this.updatedAt = -1L;
                this.availableKeys = new HashSet();
                this.className = state.className();
                this.objectId = state.objectId();
                this.createdAt = state.createdAt();
                this.updatedAt = state.updatedAt();
                this.availableKeys = DesugarCollections.synchronizedSet(new HashSet(state.availableKeys()));
                for (String str : state.keySet()) {
                    this.serverData.put(str, state.get(str));
                    this.availableKeys.add(str);
                }
                this.isComplete = state.isComplete();
            }

            public Init(String str) {
                this.serverData = new HashMap();
                this.createdAt = -1L;
                this.updatedAt = -1L;
                this.availableKeys = new HashSet();
                this.className = str;
            }

            public T apply(State state) {
                if (state.objectId() != null) {
                    objectId(state.objectId());
                }
                if (state.createdAt() > 0) {
                    createdAt(state.createdAt());
                }
                if (state.updatedAt() > 0) {
                    updatedAt(state.updatedAt());
                }
                isComplete(this.isComplete || state.isComplete());
                for (String str : state.keySet()) {
                    put(str, state.get(str));
                }
                availableKeys(state.availableKeys());
                return (T) self();
            }

            public T apply(ParseOperationSet parseOperationSet) {
                for (String str : parseOperationSet.keySet()) {
                    Object objApply = ((ParseFieldOperation) parseOperationSet.get(str)).apply(this.serverData.get(str), str);
                    if (objApply != null) {
                        put(str, objApply);
                    } else {
                        remove(str);
                    }
                }
                return (T) self();
            }

            public T availableKeys(Collection<String> collection) {
                this.availableKeys.addAll(collection);
                return (T) self();
            }

            public abstract <S extends State> S build();

            public T clear() {
                this.objectId = null;
                this.createdAt = -1L;
                this.updatedAt = -1L;
                this.isComplete = false;
                this.serverData.clear();
                this.availableKeys.clear();
                return (T) self();
            }

            public T createdAt(long j) {
                this.createdAt = j;
                return (T) self();
            }

            public T createdAt(Date date) {
                this.createdAt = date.getTime();
                return (T) self();
            }

            public T isComplete(boolean z) {
                this.isComplete = z;
                return (T) self();
            }

            public T objectId(String str) {
                this.objectId = str;
                return (T) self();
            }

            public T put(String str, Object obj) {
                this.serverData.put(str, obj);
                this.availableKeys.add(str);
                return (T) self();
            }

            public T remove(String str) {
                this.serverData.remove(str);
                return (T) self();
            }

            public abstract T self();

            public T updatedAt(long j) {
                this.updatedAt = j;
                return (T) self();
            }

            public T updatedAt(Date date) {
                this.updatedAt = date.getTime();
                return (T) self();
            }
        }

        public State(Parcel parcel, String str, ParseParcelDecoder parseParcelDecoder) {
            this.className = str;
            this.objectId = parcel.readByte() == 1 ? parcel.readString() : null;
            long j = parcel.readLong();
            this.createdAt = j;
            long j2 = parcel.readLong();
            this.updatedAt = j2 > 0 ? j2 : j;
            int i = parcel.readInt();
            HashMap map = new HashMap();
            for (int i2 = 0; i2 < i; i2++) {
                map.put(parcel.readString(), parseParcelDecoder.decode(parcel));
            }
            this.serverData = DesugarCollections.unmodifiableMap(map);
            this.isComplete = parcel.readByte() == 1;
            ArrayList arrayList = new ArrayList();
            parcel.readStringList(arrayList);
            this.availableKeys = new HashSet(arrayList);
        }

        public State(Init<?> init) {
            this.className = ((Init) init).className;
            this.objectId = ((Init) init).objectId;
            long j = ((Init) init).createdAt;
            this.createdAt = j;
            this.updatedAt = ((Init) init).updatedAt > 0 ? ((Init) init).updatedAt : j;
            this.serverData = DesugarCollections.unmodifiableMap(new HashMap(init.serverData));
            this.isComplete = ((Init) init).isComplete;
            this.availableKeys = DesugarCollections.synchronizedSet(((Init) init).availableKeys);
        }

        public static State createFromParcel(Parcel parcel, ParseParcelDecoder parseParcelDecoder) {
            String string = parcel.readString();
            return "_User".equals(string) ? new ParseUser.State(parcel, string, parseParcelDecoder) : new State(parcel, string, parseParcelDecoder);
        }

        public static Init<?> newBuilder(String str) {
            return "_User".equals(str) ? new ParseUser.State.Builder() : new Builder(str);
        }

        public Set<String> availableKeys() {
            return this.availableKeys;
        }

        public String className() {
            return this.className;
        }

        public long createdAt() {
            return this.createdAt;
        }

        public Object get(String str) {
            return this.serverData.get(str);
        }

        public boolean isComplete() {
            return this.isComplete;
        }

        public Set<String> keySet() {
            return this.serverData.keySet();
        }

        public <T extends Init<?>> T newBuilder() {
            return new Builder(this);
        }

        public String objectId() {
            return this.objectId;
        }

        public String toString() {
            return String.format(Locale.US, "%s@%s[className=%s, objectId=%s, createdAt=%d, updatedAt=%d, isComplete=%s, serverData=%s, availableKeys=%s]", getClass().getName(), Integer.toHexString(hashCode()), this.className, this.objectId, Long.valueOf(this.createdAt), Long.valueOf(this.updatedAt), Boolean.valueOf(this.isComplete), this.serverData, this.availableKeys);
        }

        public long updatedAt() {
            return this.updatedAt;
        }

        public void writeToParcel(Parcel parcel, ParseParcelEncoder parseParcelEncoder) {
            parcel.writeString(this.className);
            parcel.writeByte(this.objectId != null ? (byte) 1 : (byte) 0);
            String str = this.objectId;
            if (str != null) {
                parcel.writeString(str);
            }
            parcel.writeLong(this.createdAt);
            parcel.writeLong(this.updatedAt);
            parcel.writeInt(this.serverData.size());
            for (String str2 : this.serverData.keySet()) {
                parcel.writeString(str2);
                parseParcelEncoder.encode(this.serverData.get(str2), parcel);
            }
            parcel.writeByte(this.isComplete ? (byte) 1 : (byte) 0);
            parcel.writeStringList(new ArrayList(this.availableKeys));
        }
    }

    public ParseObject() {
        this("_Automatic");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ParseObject(String str) {
        this.mutex = new Object();
        this.taskQueue = new TaskQueue();
        this.saveEvent = new ParseMulticastDelegate<>();
        String str2 = isCreatingPointerForObjectId.get();
        if (str == null) {
            throw new IllegalArgumentException("You must specify a Parse class name when creating a new ParseObject.");
        }
        str = "_Automatic".equals(str) ? getSubclassingController().getClassName(getClass()) : str;
        if (!getSubclassingController().isSubclassValid(str, getClass())) {
            throw new IllegalArgumentException("You must create this type of ParseObject using ParseObject.create() or the proper subclass.");
        }
        LinkedList<ParseOperationSet> linkedList = new LinkedList<>();
        this.operationSetQueue = linkedList;
        linkedList.add(new ParseOperationSet());
        this.estimatedData = new HashMap();
        State.Init<?> initNewStateBuilder = newStateBuilder(str);
        if (str2 == null) {
            setDefaultValues();
            initNewStateBuilder.isComplete(true);
        } else {
            if (!str2.equals("*** Offline Object ***")) {
                initNewStateBuilder.objectId(str2);
            }
            initNewStateBuilder.isComplete(false);
        }
        this.state = initNewStateBuilder.build();
        OfflineStore localDatastore = Parse.getLocalDatastore();
        if (localDatastore != null) {
            localDatastore.registerNewObject(this);
        }
    }

    private void applyOperations(ParseOperationSet parseOperationSet, Map<String, Object> map) {
        for (String str : parseOperationSet.keySet()) {
            Object objApply = parseOperationSet.get(str).apply(map.get(str), str);
            if (objApply != null) {
                map.put(str, objApply);
            } else {
                map.remove(str);
            }
        }
    }

    private boolean canBeSerialized() {
        boolean zBooleanValue;
        synchronized (this.mutex) {
            final Capture capture = new Capture(Boolean.TRUE);
            new ParseTraverser() { // from class: com.parse.ParseObject.5
                @Override // com.parse.ParseTraverser
                public boolean visit(Object obj) {
                    if ((obj instanceof ParseFile) && ((ParseFile) obj).isDirty()) {
                        capture.set(Boolean.FALSE);
                    }
                    if ((obj instanceof ParseObject) && ((ParseObject) obj).getObjectId() == null) {
                        capture.set(Boolean.FALSE);
                    }
                    return ((Boolean) capture.get()).booleanValue();
                }
            }.setYieldRoot(false).setTraverseParseObjects(true).traverse(this);
            zBooleanValue = ((Boolean) capture.get()).booleanValue();
        }
        return zBooleanValue;
    }

    private void checkGetAccess(String str) {
        if (!isDataAvailable(str)) {
            throw new IllegalStateException(ˆʽ.ᵎˏ.ˑי("ParseObject has no data for '", str, "'. Call fetchIfNeeded() to get the data."));
        }
    }

    private void checkKeyIsMutable(String str) {
        if (isKeyMutable(str)) {
            return;
        }
        StringBuilder sbM50 = AbstractC0002.m50("Cannot modify `", str, "` property of an ");
        sbM50.append(getClassName());
        sbM50.append(" object.");
        throw new IllegalArgumentException(sbM50.toString());
    }

    private static void collectDirtyChildren(Object obj, Collection<ParseObject> collection, Collection<ParseFile> collection2) {
        collectDirtyChildren(obj, collection, collection2, new HashSet(), new HashSet());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void collectDirtyChildren(Object obj, final Collection<ParseObject> collection, final Collection<ParseFile> collection2, final Set<ParseObject> set, final Set<ParseObject> set2) {
        new ParseTraverser() { // from class: com.parse.ParseObject.3
            @Override // com.parse.ParseTraverser
            public boolean visit(Object obj2) {
                if (obj2 instanceof ParseFile) {
                    if (collection2 == null) {
                        return true;
                    }
                    ParseFile parseFile = (ParseFile) obj2;
                    if (parseFile.getUrl() == null) {
                        collection2.add(parseFile);
                    }
                    return true;
                }
                if (!(obj2 instanceof ParseObject) || collection == null) {
                    return true;
                }
                ParseObject parseObject = (ParseObject) obj2;
                Set set3 = set;
                Set hashSet = set2;
                if (parseObject.getObjectId() != null) {
                    if (!hashSet.isEmpty()) {
                        hashSet = new HashSet();
                    }
                } else {
                    if (hashSet.contains(parseObject)) {
                        throw new RuntimeException("Found a circular dependency while saving.");
                    }
                    HashSet hashSet2 = new HashSet(hashSet);
                    hashSet2.add(parseObject);
                    hashSet = hashSet2;
                }
                if (set3.contains(parseObject)) {
                    return true;
                }
                set3.add(parseObject);
                ParseObject.collectDirtyChildren(parseObject.estimatedData, collection, collection2, set3, hashSet);
                if (parseObject.isDirty(false)) {
                    collection.add(parseObject);
                }
                return true;
            }
        }.setYieldRoot(true).traverse(obj);
    }

    private Map<String, ParseObject> collectFetchedObjects() {
        final HashMap map = new HashMap();
        new ParseTraverser() { // from class: com.parse.ParseObject.4
            @Override // com.parse.ParseTraverser
            public boolean visit(Object obj) {
                if (!(obj instanceof ParseObject)) {
                    return true;
                }
                ParseObject parseObject = (ParseObject) obj;
                State state = parseObject.getState();
                if (state.objectId() == null || !state.isComplete()) {
                    return true;
                }
                map.put(state.objectId(), parseObject);
                return true;
            }
        }.traverse(this.estimatedData);
        return map;
    }

    public static <T extends ParseObject> T create(Class<T> cls) {
        return (T) create(getSubclassingController().getClassName(cls));
    }

    public static ParseObject create(String str) {
        return getSubclassingController().newInstance(str);
    }

    public static ParseObject createFromParcel(Parcel parcel, ParseParcelDecoder parseParcelDecoder) {
        ParseObject parseObjectCreateWithoutData = createWithoutData(parcel.readString(), parcel.readByte() == 1 ? parcel.readString() : null);
        if (parseParcelDecoder instanceof ParseObjectParcelDecoder) {
            ((ParseObjectParcelDecoder) parseParcelDecoder).addKnownObject(parseObjectCreateWithoutData);
        }
        parseObjectCreateWithoutData.setState(State.createFromParcel(parcel, parseParcelDecoder));
        if (parcel.readByte() == 1) {
            parseObjectCreateWithoutData.localId = parcel.readString();
        }
        if (parcel.readByte() == 1) {
            parseObjectCreateWithoutData.isDeleted = true;
        }
        boolean z = parseObjectCreateWithoutData.ldsEnabledWhenParceling;
        ParseOperationSet parseOperationSetFromParcel = ParseOperationSet.fromParcel(parcel, parseParcelDecoder);
        if (!z) {
            for (String str : parseOperationSetFromParcel.keySet()) {
                parseObjectCreateWithoutData.performOperation(str, parseOperationSetFromParcel.get(str));
            }
        }
        parseObjectCreateWithoutData.onRestoreInstanceState(parcel.readBundle(ParseObject.class.getClassLoader()));
        return parseObjectCreateWithoutData;
    }

    public static ParseObject createWithoutData(String str, String str2) {
        OfflineStore localDatastore = Parse.getLocalDatastore();
        try {
            try {
                if (str2 == null) {
                    isCreatingPointerForObjectId.set("*** Offline Object ***");
                } else {
                    isCreatingPointerForObjectId.set(str2);
                }
                ParseObject object = (localDatastore == null || str2 == null) ? null : localDatastore.getObject(str, str2);
                if (object == null) {
                    object = create(str);
                    if (object.hasChanges()) {
                        throw new IllegalStateException("A ParseObject subclass default constructor must not make changes to the object that cause it to be dirty.");
                    }
                }
                return object;
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception e2) {
                throw new RuntimeException("Failed to create instance of subclass.", e2);
            }
        } finally {
            isCreatingPointerForObjectId.set(null);
        }
    }

    private ParseOperationSet currentOperations() {
        ParseOperationSet last;
        synchronized (this.mutex) {
            last = this.operationSetQueue.getLast();
        }
        return last;
    }

    private ParseRESTObjectCommand currentSaveEventuallyCommand(ParseOperationSet parseOperationSet, ParseEncoder parseEncoder, String str) {
        State state = getState();
        return ParseRESTObjectCommand.saveObjectCommand(state, toJSONObjectForSaving(state, parseOperationSet, parseEncoder), str);
    }

    private static Task<Void> deepSaveAsync(Object obj, String str) {
        int i = 2;
        final int i2 = 1;
        final int i3 = 0;
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        collectDirtyChildren(obj, hashSet, hashSet2);
        HashSet hashSet3 = new HashSet();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ParseObject parseObject = (ParseObject) it.next();
            if (parseObject instanceof ParseUser) {
                ParseUser parseUser = (ParseUser) parseObject;
                if (parseUser.isLazy()) {
                    hashSet3.add(parseUser);
                }
            }
        }
        hashSet.removeAll(hashSet3);
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        ArrayList arrayList = new ArrayList();
        Iterator it2 = hashSet2.iterator();
        while (it2.hasNext()) {
            arrayList.add(((ParseFile) it2.next()).saveAsync(str, null, null));
        }
        Task taskContinueWith = Task.whenAll(arrayList).continueWith(new Continuation() { // from class: com.parse.יˋ
            @Override // com.parse.boltsinternal.Continuation
            public final Object then(Task task) {
                switch (i3) {
                    case 0:
                        return ParseObject.lambda$deepSaveAsync$7(atomicBoolean, task);
                    default:
                        return ParseObject.lambda$deepSaveAsync$8(atomicBoolean, task);
                }
            }
        });
        final AtomicBoolean atomicBoolean2 = new AtomicBoolean(false);
        ArrayList arrayList2 = new ArrayList();
        Iterator it3 = hashSet3.iterator();
        while (it3.hasNext()) {
            arrayList2.add(((ParseUser) it3.next()).saveAsync(str));
        }
        Task taskContinueWith2 = Task.whenAll(arrayList2).continueWith(new Continuation() { // from class: com.parse.יˋ
            @Override // com.parse.boltsinternal.Continuation
            public final Object then(Task task) {
                switch (i2) {
                    case 0:
                        return ParseObject.lambda$deepSaveAsync$7(atomicBoolean2, task);
                    default:
                        return ParseObject.lambda$deepSaveAsync$8(atomicBoolean2, task);
                }
            }
        });
        Capture capture = new Capture(hashSet);
        return Task.whenAll(Arrays.asList(taskContinueWith, taskContinueWith2, Task.forResult(null).continueWhile(new CallableC0806(i, capture), new C0837(capture, atomicBoolean, atomicBoolean2, str, 7))));
    }

    public static <T> Task<T> enqueueForAll(List<? extends ParseObject> list, Continuation<Void, Task<T>> continuation) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<? extends ParseObject> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().taskQueue.getLock());
        }
        LockSet lockSet = new LockSet(arrayList);
        lockSet.lock();
        try {
            try {
                Task<T> taskThen = continuation.then(taskCompletionSource.getTask());
                ArrayList arrayList2 = new ArrayList();
                Iterator<? extends ParseObject> it2 = list.iterator();
                while (it2.hasNext()) {
                    it2.next().taskQueue.enqueue(new C0855(arrayList2, 19, taskThen));
                }
                Task.whenAll(arrayList2).continueWith(new C0821(taskCompletionSource, 1));
                lockSet.unlock();
                return taskThen;
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception e2) {
                throw new RuntimeException(e2);
            }
        } catch (Throwable th) {
            lockSet.unlock();
            throw th;
        }
    }

    private void enqueueSaveEventuallyOperationAsync(ParseOperationSet parseOperationSet) {
        if (!parseOperationSet.isSaveEventually()) {
            throw new IllegalStateException("This should only be used to enqueue saveEventually operation sets");
        }
        this.taskQueue.enqueue(new C0849(parseOperationSet, 0));
    }

    public static <T extends ParseObject> T from(State state) {
        T t = (T) createWithoutData(state.className(), state.objectId());
        synchronized (t.mutex) {
            if (!state.isComplete()) {
                state = t.getState().newBuilder().apply(state).build();
            }
            t.setState(state);
        }
        return t;
    }

    public static <T extends ParseObject> T fromJSON(JSONObject jSONObject, String str, ParseDecoder parseDecoder) {
        String strOptString = jSONObject.optString("className", str);
        if (strOptString == null) {
            return null;
        }
        String strOptString2 = jSONObject.optString("objectId", null);
        boolean z = !jSONObject.has("__selectedKeys");
        T t = (T) createWithoutData(strOptString, strOptString2);
        t.setState(t.mergeFromServer(t.getState(), jSONObject, parseDecoder, z));
        return t;
    }

    public static <T extends ParseObject> T fromJSON(JSONObject jSONObject, String str, ParseDecoder parseDecoder, Set<String> set) throws JSONException {
        if (set != null && !set.isEmpty()) {
            try {
                jSONObject.put("__selectedKeys", new JSONArray((Collection) set));
            } catch (JSONException e) {
                throw new RuntimeException(e);
            }
        }
        return (T) fromJSON(jSONObject, str, parseDecoder);
    }

    private ParseACL getACL(boolean z) {
        synchronized (this.mutex) {
            try {
                checkGetAccess("ACL");
                Object obj = this.estimatedData.get("ACL");
                if (obj == null) {
                    return null;
                }
                if (!(obj instanceof ParseACL)) {
                    throw new RuntimeException("only ACLs can be stored in the ACL key");
                }
                if (!z || !((ParseACL) obj).isShared()) {
                    return (ParseACL) obj;
                }
                ParseACL parseACL = new ParseACL((ParseACL) obj);
                this.estimatedData.put("ACL", parseACL);
                return parseACL;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static LocalIdManager getLocalIdManager() {
        return ParseCorePlugins.getInstance().getLocalIdManager();
    }

    private static ParseObjectController getObjectController() {
        return ParseCorePlugins.getInstance().getObjectController();
    }

    private static ParseObjectSubclassingController getSubclassingController() {
        return ParseCorePlugins.getInstance().getSubclassingController();
    }

    private boolean hasDirtyChildren() {
        boolean z;
        synchronized (this.mutex) {
            ArrayList arrayList = new ArrayList();
            collectDirtyChildren(this.estimatedData, arrayList, null);
            z = arrayList.size() > 0;
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Task lambda$deepSaveAsync$11(Capture capture, AtomicBoolean atomicBoolean, AtomicBoolean atomicBoolean2, String str, Task task) {
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        for (ParseObject parseObject : (Set) capture.get()) {
            if (parseObject.canBeSerialized()) {
                arrayList.add(parseObject);
            } else {
                hashSet.add(parseObject);
            }
        }
        capture.set(hashSet);
        if (arrayList.size() == 0 && atomicBoolean.get() && atomicBoolean2.get()) {
            throw new RuntimeException("Unable to save a ParseObject with a relation to a cycle.");
        }
        return arrayList.size() == 0 ? Task.forResult(null) : enqueueForAll(arrayList, new C0855(arrayList, 18, str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Void lambda$deepSaveAsync$7(AtomicBoolean atomicBoolean, Task task) {
        atomicBoolean.set(true);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Void lambda$deepSaveAsync$8(AtomicBoolean atomicBoolean, Task task) {
        atomicBoolean.set(true);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Boolean lambda$deepSaveAsync$9(Capture capture) {
        return Boolean.valueOf(((Set) capture.get()).size() > 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Task lambda$enqueueForAll$0(List list, Task task, Task task2) {
        list.add(task2);
        return task;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Void lambda$enqueueForAll$1(TaskCompletionSource taskCompletionSource, Task task) {
        taskCompletionSource.setResult(null);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Task lambda$enqueueSaveEventuallyOperationAsync$38(ParseOperationSet parseOperationSet, Task task) {
        return Parse.getEventuallyQueue().waitForOperationSetAndEventuallyPin(parseOperationSet, null).makeVoid();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Task lambda$enqueueSaveEventuallyOperationAsync$39(ParseOperationSet parseOperationSet, Task task) {
        return task.continueWithTask(new C0849(parseOperationSet, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Task lambda$handleDeleteEventuallyResultAsync$42(Task task) {
        Parse.getEventuallyQueue().notifyTestHelper(6);
        return task;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Task lambda$handleDeleteResultAsync$58(OfflineStore offlineStore, Task task) {
        synchronized (this.mutex) {
            try {
                if (!this.isDeleted) {
                    return offlineStore.updateDataForObjectAsync(this);
                }
                offlineStore.unregisterObject(this);
                return offlineStore.deleteDataForObjectAsync(this);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Task lambda$handleSaveEventuallyResultAsync$40(boolean z, Task task) {
        if (z) {
            Parse.getEventuallyQueue().notifyTestHelper(5);
        }
        return task;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Task lambda$handleSaveResultAsync$25(OfflineStore offlineStore, Task task) {
        return offlineStore.fetchLocallyAsync(this).makeVoid();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Task lambda$handleSaveResultAsync$26(OfflineStore offlineStore, Task task) {
        return task.isFaulted() ? Task.forResult(null) : offlineStore.updateDataForObjectAsync(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Void lambda$handleSaveResultAsync$27(State state, ParseOperationSet parseOperationSet, Task task) {
        synchronized (this.mutex) {
            if (!state.isComplete()) {
                state = getState().newBuilder().apply(parseOperationSet).apply(state).build();
            }
            setState(state);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Task lambda$handleSaveResultAsync$28(OfflineStore offlineStore, Task task) {
        return offlineStore.updateDataForObjectAsync(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Void lambda$handleSaveResultAsync$29(Task task) {
        this.saveEvent.invoke(this, null);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Task lambda$pinAllInBackground$22(ParseObject parseObject, Task task) {
        ParseACL acl;
        if (parseObject.isDataAvailable("ACL") && (acl = parseObject.getACL(false)) != null) {
            ParseUser unresolvedUser = acl.getUnresolvedUser();
            return (unresolvedUser == null || !unresolvedUser.isCurrentUser()) ? Task.forResult(null) : ParseUser.pinCurrentUserIfNeededAsync(unresolvedUser);
        }
        return Task.forResult(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Task lambda$pinAllInBackground$23(String str, List list, boolean z, Task task) {
        OfflineStore localDatastore = Parse.getLocalDatastore();
        if (str == null) {
            str = "_default";
        }
        return localDatastore.pinAllObjectsAsync(str, list, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Task lambda$pinAllInBackground$24(String str, List list, Task task) {
        if ("_currentUser".equals(str)) {
            return task;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ParseObject parseObject = (ParseObject) it.next();
            if (parseObject instanceof ParseUser) {
                ParseUser parseUser = (ParseUser) parseObject;
                if (parseUser.isCurrentUser()) {
                    return ParseUser.pinCurrentUserIfNeededAsync(parseUser);
                }
            }
        }
        return task;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Task lambda$saveAllAsync$12(Task task, Task task2) {
        return (task2.isFaulted() || task2.isCancelled()) ? task2 : task.makeVoid();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Task lambda$saveAllAsync$13(ParseObject parseObject, ParseOperationSet parseOperationSet, Task task) {
        return parseObject.handleSaveResultAsync((State) task.getResult(), parseOperationSet).continueWithTask(new C0814(task, 5));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Task lambda$saveAllAsync$14(List list, String str, Task task) {
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        ArrayList arrayList2 = new ArrayList(size);
        ArrayList arrayList3 = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            ParseObject parseObject = (ParseObject) list.get(i);
            parseObject.updateBeforeSave();
            parseObject.validateSave();
            arrayList.add(parseObject.getState());
            arrayList2.add(parseObject.startSave());
            arrayList3.add(new KnownParseObjectDecoder(parseObject.collectFetchedObjects()));
        }
        List<Task<State>> listSaveAllAsync = getObjectController().saveAllAsync(arrayList, arrayList2, str, arrayList3);
        ArrayList arrayList4 = new ArrayList(size);
        for (int i2 = 0; i2 < size; i2++) {
            arrayList4.add(listSaveAllAsync.get(i2).continueWithTask(new C0812((ParseObject) list.get(i2), (ParseOperationSet) arrayList2.get(i2), 1)));
        }
        return Task.whenAll(arrayList4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Task lambda$saveAsync$34(ParseOperationSet parseOperationSet, String str, Task task) {
        return getObjectController().saveAsync(getState(), parseOperationSet, str, new KnownParseObjectDecoder(collectFetchedObjects()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Task lambda$saveAsync$35(Task task, Task task2) {
        return (task2.isFaulted() || task2.isCancelled()) ? task2 : task.makeVoid();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Task lambda$saveAsync$36(ParseOperationSet parseOperationSet, Task task) {
        return handleSaveResultAsync((State) task.getResult(), parseOperationSet).continueWithTask(new C0814(task, 4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$saveInBackground$30(ParseACL parseACL, ParseUser parseUser, Task task) {
        if (parseACL.hasUnresolvedUser()) {
            throw new IllegalStateException("ACL has an unresolved ParseUser. Save or sign up before attempting to serialize the ACL.");
        }
        return parseUser.getSessionToken();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Task lambda$saveInBackground$31(Task task) {
        ParseACL acl;
        ParseUser parseUser = (ParseUser) task.getResult();
        if (parseUser == null) {
            return Task.forResult(null);
        }
        if (!parseUser.isLazy()) {
            return Task.forResult(parseUser.getSessionToken());
        }
        if (isDataAvailable("ACL") && (acl = getACL(false)) != null) {
            ParseUser unresolvedUser = acl.getUnresolvedUser();
            return (unresolvedUser == null || !unresolvedUser.isCurrentUser()) ? Task.forResult(null) : unresolvedUser.saveAsync(null).onSuccess(new C0855(acl, 20, unresolvedUser));
        }
        return Task.forResult(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Task lambda$saveInBackground$32(Task task) {
        return saveAsync((String) task.getResult());
    }

    private void notifyObjectIdChanged(String str, String str2) {
        synchronized (this.mutex) {
            try {
                OfflineStore localDatastore = Parse.getLocalDatastore();
                if (localDatastore != null) {
                    localDatastore.updateObjectId(this, str, str2);
                }
                if (this.localId != null) {
                    getLocalIdManager().setObjectId(this.localId, str2);
                    this.localId = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static <T extends ParseObject> Task<Void> pinAllInBackground(String str, List<T> list, boolean z) {
        if (!Parse.isLocalDatastoreEnabled()) {
            throw new IllegalStateException("Method requires Local Datastore. Please refer to `Parse#enableLocalDatastore(Context)`.");
        }
        Task taskForResult = Task.forResult(null);
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            taskForResult = taskForResult.onSuccessTask(new C0851(it.next(), 3));
        }
        return taskForResult.onSuccessTask(new C0860(str, list, z)).onSuccessTask(new C0790(str, list));
    }

    private void rebuildEstimatedData() {
        synchronized (this.mutex) {
            try {
                this.estimatedData.clear();
                for (String str : this.state.keySet()) {
                    this.estimatedData.put(str, this.state.get(str));
                }
                Iterator<ParseOperationSet> it = this.operationSetQueue.iterator();
                while (it.hasNext()) {
                    applyOperations(it.next(), this.estimatedData);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void registerParseSubclasses() {
        registerSubclass(ParseUser.class);
        registerSubclass(ParseRole.class);
        registerSubclass(ParseInstallation.class);
        registerSubclass(ParseSession.class);
        registerSubclass(ParsePin.class);
        registerSubclass(EventuallyPin.class);
    }

    public static void registerSubclass(Class<? extends ParseObject> cls) {
        getSubclassingController().registerSubclass(cls);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T extends ParseObject> Task<Void> saveAllAsync(List<T> list, String str, Task<Void> task) {
        return task.continueWithTask(new C0790(list, str));
    }

    private void setState(State state, boolean z) {
        synchronized (this.mutex) {
            try {
                String strObjectId = this.state.objectId();
                String strObjectId2 = state.objectId();
                this.state = state;
                if (z && !ParseTextUtils.equals(strObjectId, strObjectId2)) {
                    notifyObjectIdChanged(strObjectId, strObjectId2);
                }
                rebuildEstimatedData();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static Task<Void> unpinAllInBackground(String str) {
        if (!Parse.isLocalDatastoreEnabled()) {
            throw new IllegalStateException("Method requires Local Datastore. Please refer to `Parse#enableLocalDatastore(Context)`.");
        }
        if (str == null) {
            str = "_default";
        }
        return Parse.getLocalDatastore().unpinAllObjectsAsync(str);
    }

    public static <T extends ParseObject> Task<Void> unpinAllInBackground(String str, List<T> list) {
        if (!Parse.isLocalDatastoreEnabled()) {
            throw new IllegalStateException("Method requires Local Datastore. Please refer to `Parse#enableLocalDatastore(Context)`.");
        }
        if (str == null) {
            str = "_default";
        }
        return Parse.getLocalDatastore().unpinAllObjectsAsync(str, list);
    }

    public boolean containsKey(String str) {
        boolean zContainsKey;
        synchronized (this.mutex) {
            zContainsKey = this.estimatedData.containsKey(str);
        }
        return zContainsKey;
    }

    public void copyChangesFrom(ParseObject parseObject) {
        synchronized (this.mutex) {
            try {
                ParseOperationSet first = parseObject.operationSetQueue.getFirst();
                for (String str : first.keySet()) {
                    performOperation(str, first.get(str));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public Task<Void> deleteAsync(String str) {
        return getObjectController().deleteAsync(getState(), str);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public <T extends ParseObject> Task<T> fetchFromLocalDatastoreAsync() {
        if (Parse.isLocalDatastoreEnabled()) {
            return Parse.getLocalDatastore().fetchLocallyAsync(this);
        }
        throw new IllegalStateException("Method requires Local Datastore. Please refer to `Parse#enableLocalDatastore(Context)`.");
    }

    public Object get(String str) {
        synchronized (this.mutex) {
            try {
                if (str.equals("ACL")) {
                    return getACL();
                }
                checkGetAccess(str);
                Object obj = this.estimatedData.get(str);
                if (obj instanceof ParseRelation) {
                    ((ParseRelation) obj).ensureParentAndKey(this, str);
                }
                return obj;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public ParseACL getACL() {
        return getACL(true);
    }

    public String getClassName() {
        String strClassName;
        synchronized (this.mutex) {
            strClassName = this.state.className();
        }
        return strClassName;
    }

    public Date getCreatedAt() {
        long jCreatedAt = getState().createdAt();
        if (jCreatedAt > 0) {
            return new Date(jCreatedAt);
        }
        return null;
    }

    public int getInt(String str) {
        Number number = getNumber(str);
        if (number == null) {
            return 0;
        }
        return number.intValue();
    }

    public JSONObject getJSONObject(String str) {
        synchronized (this.mutex) {
            try {
                checkGetAccess(str);
                Object objEncode = this.estimatedData.get(str);
                if (objEncode instanceof Map) {
                    objEncode = PointerOrLocalIdEncoder.get().encode(objEncode);
                }
                if (!(objEncode instanceof JSONObject)) {
                    return null;
                }
                return (JSONObject) objEncode;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public <T> List<T> getList(String str) {
        synchronized (this.mutex) {
            try {
                Object obj = this.estimatedData.get(str);
                if (!(obj instanceof List)) {
                    return null;
                }
                return (List) obj;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public <V> Map<String, V> getMap(String str) {
        synchronized (this.mutex) {
            try {
                Object obj = this.estimatedData.get(str);
                if (!(obj instanceof Map)) {
                    return null;
                }
                return (Map) obj;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public Number getNumber(String str) {
        synchronized (this.mutex) {
            try {
                checkGetAccess(str);
                Object obj = this.estimatedData.get(str);
                if (!(obj instanceof Number)) {
                    return null;
                }
                return (Number) obj;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public String getObjectId() {
        String strObjectId;
        synchronized (this.mutex) {
            strObjectId = this.state.objectId();
        }
        return strObjectId;
    }

    public String getOrCreateLocalId() {
        String str;
        synchronized (this.mutex) {
            try {
                if (this.localId == null) {
                    if (this.state.objectId() != null) {
                        throw new IllegalStateException("Attempted to get a localId for an object with an objectId.");
                    }
                    this.localId = getLocalIdManager().createLocalId();
                }
                str = this.localId;
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }

    public ParseObject getParseObject(String str) {
        Object obj = get(str);
        if (obj instanceof ParseObject) {
            return (ParseObject) obj;
        }
        return null;
    }

    public State getState() {
        State state;
        synchronized (this.mutex) {
            state = this.state;
        }
        return state;
    }

    public String getString(String str) {
        synchronized (this.mutex) {
            try {
                checkGetAccess(str);
                Object obj = this.estimatedData.get(str);
                if (!(obj instanceof String)) {
                    return null;
                }
                return (String) obj;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public Date getUpdatedAt() {
        long jUpdatedAt = getState().updatedAt();
        if (jUpdatedAt > 0) {
            return new Date(jUpdatedAt);
        }
        return null;
    }

    public Task<Void> handleDeleteEventuallyResultAsync() {
        synchronized (this.mutex) {
            this.isDeletingEventually--;
        }
        return handleDeleteResultAsync().onSuccessTask(new C0833(20));
    }

    public Task<Void> handleDeleteResultAsync() {
        Task<Void> taskForResult = Task.forResult(null);
        synchronized (this.mutex) {
            this.isDeleted = true;
        }
        OfflineStore localDatastore = Parse.getLocalDatastore();
        return localDatastore != null ? taskForResult.continueWithTask(new C0827(this, localDatastore, 9)) : taskForResult;
    }

    public Task<Void> handleSaveEventuallyResultAsync(JSONObject jSONObject, ParseOperationSet parseOperationSet) {
        final boolean z = jSONObject != null;
        return handleSaveResultAsync(jSONObject, parseOperationSet).onSuccessTask(new Continuation() { // from class: com.parse.ˈﹳ
            @Override // com.parse.boltsinternal.Continuation
            public final Object then(Task task) {
                return ParseObject.lambda$handleSaveEventuallyResultAsync$40(z, task);
            }
        });
    }

    public Task<Void> handleSaveResultAsync(State state, ParseOperationSet parseOperationSet) {
        Task<Void> taskForResult = Task.forResult(null);
        OfflineStore localDatastore = Parse.getLocalDatastore();
        if (localDatastore != null) {
            taskForResult = taskForResult.onSuccessTask(new C0827(this, localDatastore, 6));
        }
        boolean z = state != null;
        synchronized (this.mutex) {
            try {
                LinkedList<ParseOperationSet> linkedList = this.operationSetQueue;
                ListIterator<ParseOperationSet> listIterator = linkedList.listIterator(linkedList.indexOf(parseOperationSet));
                listIterator.next();
                listIterator.remove();
                if (z) {
                    Task taskContinueWith = taskForResult.continueWith(new C0813(this, state, parseOperationSet, 9));
                    if (localDatastore != null) {
                        taskContinueWith = taskContinueWith.onSuccessTask(new C0827(this, localDatastore, 8));
                    }
                    return taskContinueWith.onSuccess(new C0851(this, 2));
                }
                listIterator.next().mergeFrom(parseOperationSet);
                if (localDatastore != null) {
                    taskForResult = taskForResult.continueWithTask(new C0827(this, localDatastore, 7));
                }
                return taskForResult;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public Task<Void> handleSaveResultAsync(JSONObject jSONObject, ParseOperationSet parseOperationSet) {
        State stateBuild;
        if (jSONObject != null) {
            synchronized (this.mutex) {
                stateBuild = ParseObjectCoder.get().decode(getState().newBuilder().clear(), jSONObject, new KnownParseObjectDecoder(collectFetchedObjects())).isComplete(false).build();
            }
        } else {
            stateBuild = null;
        }
        return handleSaveResultAsync(stateBuild, parseOperationSet);
    }

    public boolean has(String str) {
        return containsKey(str);
    }

    public boolean hasChanges() {
        boolean z;
        synchronized (this.mutex) {
            z = currentOperations().size() > 0;
        }
        return z;
    }

    public boolean hasOutstandingOperations() {
        boolean z;
        synchronized (this.mutex) {
            z = true;
            if (this.operationSetQueue.size() <= 1) {
                z = false;
            }
        }
        return z;
    }

    public boolean isDataAvailable() {
        boolean zIsComplete;
        synchronized (this.mutex) {
            zIsComplete = this.state.isComplete();
        }
        return zIsComplete;
    }

    public boolean isDataAvailable(String str) {
        boolean z;
        synchronized (this.mutex) {
            try {
                z = isDataAvailable() || this.state.availableKeys().contains(str) || this.estimatedData.containsKey(str);
            } finally {
            }
        }
        return z;
    }

    public boolean isDirty() {
        return isDirty(true);
    }

    public boolean isDirty(String str) {
        boolean zContainsKey;
        synchronized (this.mutex) {
            zContainsKey = currentOperations().containsKey(str);
        }
        return zContainsKey;
    }

    public boolean isDirty(boolean z) {
        boolean z2;
        synchronized (this.mutex) {
            try {
                z2 = this.isDeleted || getObjectId() == null || hasChanges() || (z && hasDirtyChildren());
            } finally {
            }
        }
        return z2;
    }

    public boolean isKeyMutable(String str) {
        return true;
    }

    public Set<String> keySet() {
        Set<String> setUnmodifiableSet;
        synchronized (this.mutex) {
            setUnmodifiableSet = DesugarCollections.unmodifiableSet(this.estimatedData.keySet());
        }
        return setUnmodifiableSet;
    }

    public void markAllFieldsDirty() {
        synchronized (this.mutex) {
            try {
                for (String str : this.state.keySet()) {
                    performPut(str, this.state.get(str));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void mergeFromObject(ParseObject parseObject) {
        synchronized (this.mutex) {
            try {
                if (this == parseObject) {
                    return;
                }
                setState(parseObject.getState().newBuilder().build(), false);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public State mergeFromServer(State state, JSONObject jSONObject, ParseDecoder parseDecoder, boolean z) throws JSONException {
        try {
            State.Init initNewBuilder = state.newBuilder();
            if (z) {
                initNewBuilder.clear();
            }
            initNewBuilder.isComplete(state.isComplete() || z);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                if (!next.equals("__type") && !next.equals("className")) {
                    if (next.equals("objectId")) {
                        initNewBuilder.objectId(jSONObject.getString(next));
                    } else if (next.equals("createdAt")) {
                        initNewBuilder.createdAt(ParseDateFormat.getInstance().parse(jSONObject.getString(next)));
                    } else if (next.equals("updatedAt")) {
                        initNewBuilder.updatedAt(ParseDateFormat.getInstance().parse(jSONObject.getString(next)));
                    } else if (next.equals("ACL")) {
                        initNewBuilder.put("ACL", ParseACL.createACLFromJSONObject(jSONObject.getJSONObject(next), parseDecoder));
                    } else if (next.equals("__selectedKeys")) {
                        JSONArray jSONArray = jSONObject.getJSONArray(next);
                        if (jSONArray.length() > 0) {
                            HashSet hashSet = new HashSet();
                            for (int i = 0; i < jSONArray.length(); i++) {
                                String string = jSONArray.getString(i);
                                if (string.contains(".")) {
                                    string = string.split("\\.")[0];
                                }
                                hashSet.add(string);
                            }
                            initNewBuilder.availableKeys(hashSet);
                        }
                    } else {
                        Object obj = jSONObject.get(next);
                        if ((obj instanceof JSONObject) && jSONObject.has("__selectedKeys")) {
                            JSONArray jSONArray2 = jSONObject.getJSONArray("__selectedKeys");
                            JSONArray jSONArray3 = new JSONArray();
                            for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                                String string2 = jSONArray2.getString(i2);
                                if (string2.startsWith(next + ".")) {
                                    jSONArray3.put(string2.substring(next.length() + 1));
                                }
                            }
                            if (jSONArray3.length() > 0) {
                                ((JSONObject) obj).put("__selectedKeys", jSONArray3);
                            }
                        }
                        initNewBuilder.put(next, parseDecoder.decode(obj));
                    }
                }
            }
            return initNewBuilder.build();
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    public void mergeREST(State state, JSONObject jSONObject, ParseDecoder parseDecoder) {
        ArrayList arrayList = new ArrayList();
        synchronized (this.mutex) {
            try {
                try {
                    boolean z = jSONObject.getBoolean("__complete");
                    this.isDeletingEventually = ParseJSONUtils.getInt(jSONObject, Arrays.asList("__isDeletingEventually", "isDeletingEventually"));
                    JSONArray jSONArray = jSONObject.getJSONArray("__operations");
                    ParseOperationSet parseOperationSetCurrentOperations = currentOperations();
                    this.operationSetQueue.clear();
                    ParseOperationSet parseOperationSet = null;
                    for (int i = 0; i < jSONArray.length(); i++) {
                        ParseOperationSet parseOperationSetFromRest = ParseOperationSet.fromRest(jSONArray.getJSONObject(i), parseDecoder);
                        if (parseOperationSetFromRest.isSaveEventually()) {
                            if (parseOperationSet != null) {
                                this.operationSetQueue.add(parseOperationSet);
                                parseOperationSet = null;
                            }
                            arrayList.add(parseOperationSetFromRest);
                            this.operationSetQueue.add(parseOperationSetFromRest);
                        } else {
                            if (parseOperationSet != null) {
                                parseOperationSetFromRest.mergeFrom(parseOperationSet);
                            }
                            parseOperationSet = parseOperationSetFromRest;
                        }
                    }
                    if (parseOperationSet != null) {
                        this.operationSetQueue.add(parseOperationSet);
                    }
                    currentOperations().mergeFrom(parseOperationSetCurrentOperations);
                    if (state.updatedAt() >= 0) {
                        if (jSONObject.has("updatedAt")) {
                            if (new Date(state.updatedAt()).compareTo(ParseDateFormat.getInstance().parse(jSONObject.getString("updatedAt"))) < 0) {
                            }
                        }
                    }
                    setState(mergeFromServer(state, ParseJSONUtils.create(jSONObject, Arrays.asList("__complete", "__isDeletingEventually", "isDeletingEventually", "__operations")), parseDecoder, z));
                } catch (JSONException e) {
                    throw new RuntimeException(e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            enqueueSaveEventuallyOperationAsync((ParseOperationSet) it.next());
        }
    }

    public boolean needsDefaultACL() {
        return true;
    }

    public State.Init<?> newStateBuilder(String str) {
        return new State.Builder(str);
    }

    public void onRestoreInstanceState(Bundle bundle) {
    }

    public void onSaveInstanceState(Bundle bundle) {
    }

    public void performOperation(String str, ParseFieldOperation parseFieldOperation) {
        synchronized (this.mutex) {
            try {
                Object objApply = parseFieldOperation.apply(this.estimatedData.get(str), str);
                if (objApply != null) {
                    this.estimatedData.put(str, objApply);
                } else {
                    this.estimatedData.remove(str);
                }
                currentOperations().put(str, parseFieldOperation.mergeWithPrevious(currentOperations().get(str)));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void performPut(String str, Object obj) {
        if (str == null) {
            throw new IllegalArgumentException("key may not be null.");
        }
        if (obj == null) {
            throw new IllegalArgumentException("value may not be null.");
        }
        if (obj instanceof JSONObject) {
            obj = ParseDecoder.get().convertJSONObjectToMap((JSONObject) obj);
        } else if (obj instanceof JSONArray) {
            obj = ParseDecoder.get().convertJSONArrayToList((JSONArray) obj);
        }
        if (ParseEncoder.isValidType(obj)) {
            performOperation(str, new ParseSetOperation(obj));
        } else {
            throw new IllegalArgumentException("invalid type for value: " + obj.getClass().toString());
        }
    }

    public Task<Void> pinInBackground(String str, boolean z) {
        return pinAllInBackground(str, Collections.singletonList(this), z);
    }

    public void put(String str, Object obj) {
        checkKeyIsMutable(str);
        performPut(str, obj);
    }

    public void registerSaveListener(GetCallback<ParseObject> getCallback) {
        synchronized (this.mutex) {
            this.saveEvent.subscribe(getCallback);
        }
    }

    public void revert() {
        synchronized (this.mutex) {
            try {
                if (isDirty()) {
                    currentOperations().clear();
                    rebuildEstimatedData();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void revert(String str) {
        synchronized (this.mutex) {
            try {
                if (isDirty(str)) {
                    currentOperations().remove(str);
                    rebuildEstimatedData();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void save() {
        ParseTaskUtils.wait(saveInBackground());
    }

    public Task<JSONObject> saveAsync(ParseHttpClient parseHttpClient, ParseOperationSet parseOperationSet, String str) {
        return currentSaveEventuallyCommand(parseOperationSet, PointerEncoder.get(), str).executeAsync(parseHttpClient);
    }

    public Task<Void> saveAsync(String str) {
        return this.taskQueue.enqueue(new C0855(this, 21, str));
    }

    /* renamed from: saveAsync, reason: merged with bridge method [inline-methods] */
    public Task<Void> lambda$saveAsync$33(String str, Task<Void> task) {
        ParseOperationSet parseOperationSetStartSave;
        Task<Void> taskDeepSaveAsync;
        if (!isDirty()) {
            return Task.forResult(null);
        }
        if (Parse.isAllowCustomObjectId() && getObjectId() == null) {
            return Task.forError(new ParseException(104, "ObjectId must not be null"));
        }
        synchronized (this.mutex) {
            updateBeforeSave();
            validateSave();
            parseOperationSetStartSave = startSave();
        }
        synchronized (this.mutex) {
            taskDeepSaveAsync = deepSaveAsync(this.estimatedData, str);
        }
        return taskDeepSaveAsync.onSuccessTask(TaskQueue.waitFor(task)).onSuccessTask(new C0813(this, parseOperationSetStartSave, str, 10)).continueWithTask(new C0812(this, parseOperationSetStartSave, 0));
    }

    public final Task<Void> saveInBackground() {
        return ParseUser.getCurrentUserAsync().onSuccessTask(new C0851(this, 4)).onSuccessTask(new C0851(this, 5));
    }

    public void setACL(ParseACL parseACL) {
        put("ACL", parseACL);
    }

    public void setDefaultValues() {
        if (!needsDefaultACL() || ParseACL.getDefaultACL() == null) {
            return;
        }
        setACL(ParseACL.getDefaultACL());
    }

    public void setState(State state) {
        synchronized (this.mutex) {
            setState(state, true);
        }
    }

    public ParseOperationSet startSave() {
        ParseOperationSet parseOperationSetCurrentOperations;
        synchronized (this.mutex) {
            parseOperationSetCurrentOperations = currentOperations();
            this.operationSetQueue.addLast(new ParseOperationSet());
        }
        return parseOperationSetCurrentOperations;
    }

    public <T extends State> JSONObject toJSONObjectForSaving(T t, ParseOperationSet parseOperationSet, ParseEncoder parseEncoder) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            for (String str : parseOperationSet.keySet()) {
                jSONObject.put(str, parseEncoder.encode((ParseFieldOperation) parseOperationSet.get(str)));
            }
            if (t.objectId() != null) {
                jSONObject.put("objectId", t.objectId());
            }
            return jSONObject;
        } catch (JSONException unused) {
            throw new RuntimeException("could not serialize object to JSON");
        }
    }

    public JSONObject toRest(ParseEncoder parseEncoder) {
        State state;
        ArrayList arrayList;
        synchronized (this.mutex) {
            try {
                state = getState();
                int size = this.operationSetQueue.size();
                arrayList = new ArrayList(size);
                for (int i = 0; i < size; i++) {
                    arrayList.add(new ParseOperationSet(this.operationSetQueue.get(i)));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return toRest(state, arrayList, parseEncoder);
    }

    public JSONObject toRest(State state, List<ParseOperationSet> list, ParseEncoder parseEncoder) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("className", state.className());
            if (state.objectId() != null) {
                jSONObject.put("objectId", state.objectId());
            }
            if (state.createdAt() > 0) {
                jSONObject.put("createdAt", ParseDateFormat.getInstance().format(new Date(state.createdAt())));
            }
            if (state.updatedAt() > 0) {
                jSONObject.put("updatedAt", ParseDateFormat.getInstance().format(new Date(state.updatedAt())));
            }
            for (String str : state.keySet()) {
                jSONObject.put(str, parseEncoder.encode(state.get(str)));
            }
            jSONObject.put("__complete", state.isComplete());
            jSONObject.put("__isDeletingEventually", this.isDeletingEventually);
            jSONObject.put("__selectedKeys", new JSONArray((Collection) state.availableKeys()));
            JSONArray jSONArray = new JSONArray();
            Iterator<ParseOperationSet> it = list.iterator();
            while (it.hasNext()) {
                jSONArray.put(it.next().toRest(parseEncoder));
            }
            jSONObject.put("__operations", jSONArray);
            return jSONObject;
        } catch (JSONException unused) {
            throw new RuntimeException("could not serialize object to JSON");
        }
    }

    public Task<Void> unpinInBackground(String str) {
        return unpinAllInBackground(str, Collections.singletonList(this));
    }

    public void unregisterSaveListener(GetCallback<ParseObject> getCallback) {
        synchronized (this.mutex) {
            this.saveEvent.unsubscribe(getCallback);
        }
    }

    public void updateBeforeSave() {
    }

    public void validateSave() {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        writeToParcel(parcel, new ParseObjectParcelEncoder(this));
    }

    public void writeToParcel(Parcel parcel, ParseParcelEncoder parseParcelEncoder) {
        ParseOperationSet last;
        synchronized (this.mutex) {
            try {
                this.ldsEnabledWhenParceling = Parse.isLocalDatastoreEnabled();
                boolean zHasOutstandingOperations = hasOutstandingOperations();
                byte b = 1;
                boolean z = this.isDeleting || this.isDeletingEventually > 0;
                if (zHasOutstandingOperations) {
                    PLog.w("ParseObject", "About to parcel a ParseObject while a save / saveEventually operation is going on. If recovered from LDS, the unparceled object will be internally updated when these tasks end. If not, it will act as if these tasks have failed. This means that the subsequent call to save() will update again the same keys, and this is dangerous for certain operations, like increment(). To avoid inconsistencies, wait for operations to end before parceling.");
                }
                if (z) {
                    PLog.w("ParseObject", "About to parcel a ParseObject while a delete / deleteEventually operation is going on. If recovered from LDS, the unparceled object will be internally updated when these tasks end. If not, it will assume it's not deleted, and might incorrectly return false for isDirty(). To avoid inconsistencies, wait for operations to end before parceling.");
                }
                parcel.writeString(getClassName());
                String objectId = getObjectId();
                parcel.writeByte(objectId != null ? (byte) 1 : (byte) 0);
                if (objectId != null) {
                    parcel.writeString(objectId);
                }
                this.state.writeToParcel(parcel, parseParcelEncoder);
                if (this.localId == null) {
                    b = 0;
                }
                parcel.writeByte(b);
                String str = this.localId;
                if (str != null) {
                    parcel.writeString(str);
                }
                parcel.writeByte(this.isDeleted ? (byte) 1 : (byte) 0);
                if (hasOutstandingOperations()) {
                    last = new ParseOperationSet();
                    Iterator<ParseOperationSet> it = this.operationSetQueue.iterator();
                    while (it.hasNext()) {
                        ParseOperationSet parseOperationSet = new ParseOperationSet(it.next());
                        parseOperationSet.mergeFrom(last);
                        last = parseOperationSet;
                    }
                } else {
                    last = this.operationSetQueue.getLast();
                }
                last.setIsSaveEventually(false);
                last.toParcel(parcel, parseParcelEncoder);
                Bundle bundle = new Bundle();
                onSaveInstanceState(bundle);
                parcel.writeBundle(bundle);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
