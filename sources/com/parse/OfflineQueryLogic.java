package com.parse;

import com.parse.ParseQuery;
import com.parse.boltsinternal.Task;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
class OfflineQueryLogic {
    private final OfflineStore store;

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: com.parse.OfflineQueryLogic$2, reason: invalid class name */
    public class AnonymousClass2<T> extends ConstraintMatcher<T> {
        final /* synthetic */ ConstraintMatcher val$inQueryMatcher;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(ParseUser parseUser, ConstraintMatcher constraintMatcher) {
            super(parseUser);
            this.val$inQueryMatcher = constraintMatcher;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ Boolean lambda$matchesAsync$0(Task task) {
            return Boolean.valueOf(!((Boolean) task.getResult()).booleanValue());
        }

        /* JADX WARN: Incorrect types in method signature: (TT;Lcom/parse/ParseSQLiteDatabase;)Lcom/parse/boltsinternal/Task<Ljava/lang/Boolean;>; */
        @Override // com.parse.OfflineQueryLogic.ConstraintMatcher
        public Task matchesAsync(ParseObject parseObject, ParseSQLiteDatabase parseSQLiteDatabase) {
            return this.val$inQueryMatcher.matchesAsync(parseObject, parseSQLiteDatabase).onSuccess(new C0833(4));
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: com.parse.OfflineQueryLogic$4, reason: invalid class name */
    public class AnonymousClass4<T> extends ConstraintMatcher<T> {
        final /* synthetic */ ConstraintMatcher val$selectMatcher;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(ParseUser parseUser, ConstraintMatcher constraintMatcher) {
            super(parseUser);
            this.val$selectMatcher = constraintMatcher;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ Boolean lambda$matchesAsync$0(Task task) {
            return Boolean.valueOf(!((Boolean) task.getResult()).booleanValue());
        }

        /* JADX WARN: Incorrect types in method signature: (TT;Lcom/parse/ParseSQLiteDatabase;)Lcom/parse/boltsinternal/Task<Ljava/lang/Boolean;>; */
        @Override // com.parse.OfflineQueryLogic.ConstraintMatcher
        public Task matchesAsync(ParseObject parseObject, ParseSQLiteDatabase parseSQLiteDatabase) {
            return this.val$selectMatcher.matchesAsync(parseObject, parseSQLiteDatabase).onSuccess(new C0833(5));
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: com.parse.OfflineQueryLogic$6, reason: invalid class name */
    public class AnonymousClass6<T> extends ConstraintMatcher<T> {
        final /* synthetic */ ArrayList val$matchers;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass6(ParseUser parseUser, ArrayList arrayList) {
            super(parseUser);
            this.val$matchers = arrayList;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ Task lambda$matchesAsync$0(ConstraintMatcher constraintMatcher, ParseObject parseObject, ParseSQLiteDatabase parseSQLiteDatabase, Task task) {
            return ((Boolean) task.getResult()).booleanValue() ? task : constraintMatcher.matchesAsync(parseObject, parseSQLiteDatabase);
        }

        /* JADX WARN: Incorrect types in method signature: (TT;Lcom/parse/ParseSQLiteDatabase;)Lcom/parse/boltsinternal/Task<Ljava/lang/Boolean;>; */
        @Override // com.parse.OfflineQueryLogic.ConstraintMatcher
        public Task matchesAsync(ParseObject parseObject, ParseSQLiteDatabase parseSQLiteDatabase) {
            Task taskForResult = Task.forResult(Boolean.FALSE);
            Iterator it = this.val$matchers.iterator();
            while (it.hasNext()) {
                taskForResult = taskForResult.onSuccessTask(new C0801((ConstraintMatcher) it.next(), parseObject, parseSQLiteDatabase, 0));
            }
            return taskForResult;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: com.parse.OfflineQueryLogic$9, reason: invalid class name */
    public class AnonymousClass9<T> extends ConstraintMatcher<T> {
        final /* synthetic */ ArrayList val$matchers;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass9(ParseUser parseUser, ArrayList arrayList) {
            super(parseUser);
            this.val$matchers = arrayList;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ Task lambda$matchesAsync$0(ConstraintMatcher constraintMatcher, ParseObject parseObject, ParseSQLiteDatabase parseSQLiteDatabase, Task task) {
            return !((Boolean) task.getResult()).booleanValue() ? task : constraintMatcher.matchesAsync(parseObject, parseSQLiteDatabase);
        }

        /* JADX WARN: Incorrect types in method signature: (TT;Lcom/parse/ParseSQLiteDatabase;)Lcom/parse/boltsinternal/Task<Ljava/lang/Boolean;>; */
        @Override // com.parse.OfflineQueryLogic.ConstraintMatcher
        public Task matchesAsync(ParseObject parseObject, ParseSQLiteDatabase parseSQLiteDatabase) {
            Task taskForResult = Task.forResult(Boolean.TRUE);
            Iterator it = this.val$matchers.iterator();
            while (it.hasNext()) {
                taskForResult = taskForResult.onSuccessTask(new C0801((ConstraintMatcher) it.next(), parseObject, parseSQLiteDatabase, 1));
            }
            return taskForResult;
        }
    }

    public static abstract class ConstraintMatcher<T extends ParseObject> {
        final ParseUser user;

        public ConstraintMatcher(ParseUser parseUser) {
            this.user = parseUser;
        }

        public abstract Task<Boolean> matchesAsync(T t, ParseSQLiteDatabase parseSQLiteDatabase);
    }

    public interface Decider {
        boolean decide(Object obj, Object obj2);
    }

    public abstract class SubQueryMatcher<T extends ParseObject> extends ConstraintMatcher<T> {
        private final ParseQuery.State<T> subQuery;
        private Task<List<T>> subQueryResults;

        public SubQueryMatcher(ParseUser parseUser, ParseQuery.State<T> state) {
            super(parseUser);
            this.subQueryResults = null;
            this.subQuery = state;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Boolean lambda$matchesAsync$0(ParseObject parseObject, Task task) {
            return Boolean.valueOf(matches(parseObject, (List) task.getResult()));
        }

        public abstract boolean matches(T t, List<T> list);

        @Override // com.parse.OfflineQueryLogic.ConstraintMatcher
        public Task<Boolean> matchesAsync(T t, ParseSQLiteDatabase parseSQLiteDatabase) {
            if (this.subQueryResults == null) {
                this.subQueryResults = OfflineQueryLogic.this.store.findAsync(this.subQuery, this.user, null, parseSQLiteDatabase);
            }
            return this.subQueryResults.onSuccess(new C0855(this, 5, t));
        }
    }

    public OfflineQueryLogic(OfflineStore offlineStore) {
        this.store = offlineStore;
    }

    private static ParseQuery.KeyConstraints cleanRegexStartsWith(ParseQuery.KeyConstraints keyConstraints) {
        if (!isStartsWithRegex(keyConstraints)) {
            return null;
        }
        keyConstraints.put("$regex", ((String) keyConstraints.get("$regex")).replaceAll("([^\\\\])(\\\\E)", "$1").replaceAll("([^\\\\])(\\\\Q)", "$1").replaceAll("^\\\\E", "").replaceAll("^\\\\Q", "").replaceAll("([^'])'", "$1''").replaceAll("^'([^'])", "''$1") + ".*");
        return keyConstraints;
    }

    private static Collection<?> cleanRegexStartsWith(Collection<?> collection) {
        ParseQuery.KeyConstraints keyConstraintsCleanRegexStartsWith;
        ArrayList arrayList = new ArrayList();
        for (Object obj : collection) {
            if (!(obj instanceof ParseQuery.KeyConstraints) || (keyConstraintsCleanRegexStartsWith = cleanRegexStartsWith((ParseQuery.KeyConstraints) obj)) == null) {
                return null;
            }
            arrayList.add(keyConstraintsCleanRegexStartsWith);
        }
        return arrayList;
    }

    private static boolean compare(Object obj, Object obj2, Decider decider) {
        return obj2 instanceof List ? compareList(obj, (List) obj2, decider) : obj2 instanceof JSONArray ? compareArray(obj, (JSONArray) obj2, decider) : decider.decide(obj, obj2);
    }

    private static boolean compareArray(Object obj, JSONArray jSONArray, Decider decider) {
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                if (decider.decide(obj, jSONArray.get(i))) {
                    return true;
                }
            } catch (JSONException e) {
                throw new RuntimeException(e);
            }
        }
        return false;
    }

    private static boolean compareList(Object obj, List<?> list, Decider decider) {
        Iterator<?> it = list.iterator();
        while (it.hasNext()) {
            if (decider.decide(obj, it.next())) {
                return true;
            }
        }
        return false;
    }

    private static int compareTo(Object obj, Object obj2) {
        Object obj3 = JSONObject.NULL;
        boolean z = obj == obj3 || obj == null;
        boolean z2 = obj2 == obj3 || obj2 == null;
        if (z || z2) {
            if (z) {
                return !z2 ? -1 : 0;
            }
            return 1;
        }
        if ((obj instanceof Date) && (obj2 instanceof Date)) {
            return ((Date) obj).compareTo((Date) obj2);
        }
        if ((obj instanceof String) && (obj2 instanceof String)) {
            return ((String) obj).compareTo((String) obj2);
        }
        if ((obj instanceof Number) && (obj2 instanceof Number)) {
            return Numbers.compare((Number) obj, (Number) obj2);
        }
        throw new IllegalArgumentException(String.format("Cannot compare %s against %s", obj, obj2));
    }

    private <T extends ParseObject> ConstraintMatcher<T> createDontSelectMatcher(ParseUser parseUser, Object obj, String str) {
        return new AnonymousClass4(parseUser, createSelectMatcher(parseUser, obj, str));
    }

    private <T extends ParseObject> ConstraintMatcher<T> createInQueryMatcher(ParseUser parseUser, Object obj, final String str) {
        return new SubQueryMatcher<T>(parseUser, ((ParseQuery.State.Builder) obj).build()) { // from class: com.parse.OfflineQueryLogic.1
            /* JADX WARN: Incorrect types in method signature: (TT;Ljava/util/List<TT;>;)Z */
            @Override // com.parse.OfflineQueryLogic.SubQueryMatcher
            public boolean matches(ParseObject parseObject, List list) {
                return OfflineQueryLogic.matchesInConstraint(list, OfflineQueryLogic.getValue(parseObject, str));
            }
        };
    }

    private <T extends ParseObject> ConstraintMatcher<T> createMatcher(ParseUser parseUser, ParseQuery.QueryConstraints queryConstraints) {
        ArrayList arrayList = new ArrayList();
        for (final String str : queryConstraints.keySet()) {
            final Object obj = queryConstraints.get(str);
            if (str.equals("$or")) {
                arrayList.add(createOrMatcher(parseUser, (ArrayList) obj));
            } else if (obj instanceof ParseQuery.KeyConstraints) {
                ParseQuery.KeyConstraints keyConstraints = (ParseQuery.KeyConstraints) obj;
                for (String str2 : keyConstraints.keySet()) {
                    arrayList.add(createMatcher(parseUser, str2, keyConstraints.get(str2), str, keyConstraints));
                }
            } else {
                arrayList.add(new ConstraintMatcher<T>(parseUser) { // from class: com.parse.OfflineQueryLogic.8
                    /* JADX WARN: Incorrect types in method signature: (TT;Lcom/parse/ParseSQLiteDatabase;)Lcom/parse/boltsinternal/Task<Ljava/lang/Boolean;>; */
                    @Override // com.parse.OfflineQueryLogic.ConstraintMatcher
                    public Task matchesAsync(ParseObject parseObject, ParseSQLiteDatabase parseSQLiteDatabase) {
                        try {
                            return Task.forResult(Boolean.valueOf(OfflineQueryLogic.matchesEqualConstraint(obj, OfflineQueryLogic.getValue(parseObject, str))));
                        } catch (ParseException e) {
                            return Task.forError(e);
                        }
                    }
                });
            }
        }
        return new AnonymousClass9(parseUser, arrayList);
    }

    private <T extends ParseObject> ConstraintMatcher<T> createMatcher(ParseUser parseUser, final String str, final Object obj, final String str2, final ParseQuery.KeyConstraints keyConstraints) {
        str.getClass();
        switch (str) {
            case "$dontSelect":
                return createDontSelectMatcher(parseUser, obj, str2);
            case "$inQuery":
                return createInQueryMatcher(parseUser, obj, str2);
            case "$notInQuery":
                return createNotInQueryMatcher(parseUser, obj, str2);
            case "$select":
                return createSelectMatcher(parseUser, obj, str2);
            default:
                return (ConstraintMatcher<T>) new ConstraintMatcher<T>(parseUser) { // from class: com.parse.OfflineQueryLogic.5
                    /* JADX WARN: Incorrect types in method signature: (TT;Lcom/parse/ParseSQLiteDatabase;)Lcom/parse/boltsinternal/Task<Ljava/lang/Boolean;>; */
                    @Override // com.parse.OfflineQueryLogic.ConstraintMatcher
                    public Task matchesAsync(ParseObject parseObject, ParseSQLiteDatabase parseSQLiteDatabase) {
                        try {
                            return Task.forResult(Boolean.valueOf(OfflineQueryLogic.matchesStatelessConstraint(str, obj, OfflineQueryLogic.getValue(parseObject, str2), keyConstraints)));
                        } catch (ParseException e) {
                            return Task.forError(e);
                        }
                    }
                };
        }
    }

    private <T extends ParseObject> ConstraintMatcher<T> createNotInQueryMatcher(ParseUser parseUser, Object obj, String str) {
        return new AnonymousClass2(parseUser, createInQueryMatcher(parseUser, obj, str));
    }

    private <T extends ParseObject> ConstraintMatcher<T> createOrMatcher(ParseUser parseUser, ArrayList<ParseQuery.QueryConstraints> arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator<ParseQuery.QueryConstraints> it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(createMatcher(parseUser, it.next()));
        }
        return new AnonymousClass6(parseUser, arrayList2);
    }

    private <T extends ParseObject> ConstraintMatcher<T> createSelectMatcher(ParseUser parseUser, Object obj, final String str) {
        Map map = (Map) obj;
        ParseQuery.State<T> stateBuild = ((ParseQuery.State.Builder) map.get("query")).build();
        final String str2 = (String) map.get("key");
        return new SubQueryMatcher<T>(parseUser, stateBuild) { // from class: com.parse.OfflineQueryLogic.3
            /* JADX WARN: Incorrect types in method signature: (TT;Ljava/util/List<TT;>;)Z */
            @Override // com.parse.OfflineQueryLogic.SubQueryMatcher
            public boolean matches(ParseObject parseObject, List list) {
                Object value = OfflineQueryLogic.getValue(parseObject, str);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (OfflineQueryLogic.matchesEqualConstraint(value, OfflineQueryLogic.getValue((ParseObject) it.next(), str2))) {
                        return true;
                    }
                }
                return false;
            }
        };
    }

    private static Task<Void> fetchIncludeAsync(OfflineStore offlineStore, Object obj, String str, ParseSQLiteDatabase parseSQLiteDatabase) {
        if (obj == null) {
            return Task.forResult(null);
        }
        if (obj instanceof Collection) {
            Task<Void> taskForResult = Task.forResult(null);
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                taskForResult = taskForResult.onSuccessTask(new C0809(offlineStore, it.next(), str, parseSQLiteDatabase));
            }
            return taskForResult;
        }
        if (!(obj instanceof JSONArray)) {
            if (str == null) {
                return JSONObject.NULL.equals(obj) ? Task.forResult(null) : obj instanceof ParseObject ? offlineStore.lambda$fetchLocallyAsync$18((ParseObject) obj, parseSQLiteDatabase).makeVoid() : Task.forError(new ParseException(121, "include is invalid for non-ParseObjects"));
            }
            String[] strArrSplit = str.split("\\.", 2);
            return Task.forResult(null).continueWithTask(new C0809(obj, offlineStore, parseSQLiteDatabase, strArrSplit[0])).onSuccessTask(new C0857(offlineStore, strArrSplit.length > 1 ? strArrSplit[1] : null, parseSQLiteDatabase, 0));
        }
        JSONArray jSONArray = (JSONArray) obj;
        Task<Void> taskForResult2 = Task.forResult(null);
        for (int i = 0; i < jSONArray.length(); i++) {
            taskForResult2 = taskForResult2.onSuccessTask(new C0852(offlineStore, jSONArray, i, str, parseSQLiteDatabase));
        }
        return taskForResult2;
    }

    public static <T extends ParseObject> Task<Void> fetchIncludesAsync(OfflineStore offlineStore, T t, ParseQuery.State<T> state, ParseSQLiteDatabase parseSQLiteDatabase) {
        Set<String> setIncludes = state.includes();
        Task<Void> taskForResult = Task.forResult(null);
        Iterator<String> it = setIncludes.iterator();
        while (it.hasNext()) {
            taskForResult = taskForResult.onSuccessTask(new C0825(offlineStore, t, it.next(), parseSQLiteDatabase, 0));
        }
        return taskForResult;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Object getValue(Object obj, String str) {
        return getValue(obj, str, 0);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.Object getValue(java.lang.Object r6, java.lang.String r7, int r8) throws com.parse.ParseException {
        /*
            Method dump skipped, instructions count: 274
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.parse.OfflineQueryLogic.getValue(java.lang.Object, java.lang.String, int):java.lang.Object");
    }

    public static <T extends ParseObject> boolean hasReadAccess(ParseUser parseUser, T t) {
        ParseACL acl;
        if (parseUser == t || (acl = t.getACL()) == null || acl.getPublicReadAccess()) {
            return true;
        }
        return parseUser != null && acl.getReadAccess(parseUser);
    }

    private static boolean isAnyValueRegexStartsWith(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (isStartsWithRegex(it.next())) {
                return true;
            }
        }
        return false;
    }

    private static boolean isStartsWithRegex(Object obj) {
        if (obj == null || !(obj instanceof ParseQuery.KeyConstraints)) {
            return false;
        }
        ParseQuery.KeyConstraints keyConstraints = (ParseQuery.KeyConstraints) obj;
        return keyConstraints.size() == 1 && keyConstraints.containsKey("$regex") && ((String) keyConstraints.get("$regex")).startsWith("^");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Task lambda$fetchIncludeAsync$10(OfflineStore offlineStore, String str, ParseSQLiteDatabase parseSQLiteDatabase, Task task) {
        return fetchIncludeAsync(offlineStore, task.getResult(), str, parseSQLiteDatabase);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Task lambda$fetchIncludeAsync$6(OfflineStore offlineStore, Object obj, String str, ParseSQLiteDatabase parseSQLiteDatabase, Task task) {
        return fetchIncludeAsync(offlineStore, obj, str, parseSQLiteDatabase);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Task lambda$fetchIncludeAsync$7(OfflineStore offlineStore, JSONArray jSONArray, int i, String str, ParseSQLiteDatabase parseSQLiteDatabase, Task task) {
        return fetchIncludeAsync(offlineStore, jSONArray.get(i), str, parseSQLiteDatabase);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$fetchIncludeAsync$8(Object obj, String str, Task task) {
        return ((ParseObject) obj).get(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Task lambda$fetchIncludeAsync$9(Object obj, OfflineStore offlineStore, ParseSQLiteDatabase parseSQLiteDatabase, String str, Task task) {
        if (obj instanceof ParseObject) {
            return fetchIncludeAsync(offlineStore, obj, null, parseSQLiteDatabase).onSuccess(new C0855(obj, 4, str));
        }
        if (obj instanceof Map) {
            return Task.forResult(((Map) obj).get(str));
        }
        if (obj instanceof JSONObject) {
            return Task.forResult(((JSONObject) obj).opt(str));
        }
        if (JSONObject.NULL.equals(obj)) {
            return null;
        }
        return Task.forError(new IllegalStateException("include is invalid"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Task lambda$fetchIncludesAsync$11(OfflineStore offlineStore, ParseObject parseObject, String str, ParseSQLiteDatabase parseSQLiteDatabase, Task task) {
        return fetchIncludeAsync(offlineStore, parseObject, str, parseSQLiteDatabase);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$matchesEqualConstraint$0(Object obj, Object obj2) {
        return ((String) obj2).matches(((ParseQuery.KeyConstraints) obj).get("$regex").toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$matchesGreaterThanConstraint$3(Object obj, Object obj2) {
        return (obj2 == null || obj2 == JSONObject.NULL || compareTo(obj, obj2) >= 0) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$matchesGreaterThanOrEqualToConstraint$4(Object obj, Object obj2) {
        return (obj2 == null || obj2 == JSONObject.NULL || compareTo(obj, obj2) > 0) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$matchesLessThanConstraint$1(Object obj, Object obj2) {
        return (obj2 == null || obj2 == JSONObject.NULL || compareTo(obj, obj2) <= 0) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$matchesLessThanOrEqualToConstraint$2(Object obj, Object obj2) {
        return (obj2 == null || obj2 == JSONObject.NULL || compareTo(obj, obj2) < 0) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$sort$5(String str, ParseGeoPoint parseGeoPoint, List list, ParseObject parseObject, ParseObject parseObject2) {
        boolean z;
        int iCompareTo;
        if (str != null) {
            try {
                ParseGeoPoint parseGeoPoint2 = (ParseGeoPoint) getValue(parseObject, str);
                ParseGeoPoint parseGeoPoint3 = (ParseGeoPoint) getValue(parseObject2, str);
                double dDistanceInRadiansTo = parseGeoPoint2.distanceInRadiansTo(parseGeoPoint);
                double dDistanceInRadiansTo2 = parseGeoPoint3.distanceInRadiansTo(parseGeoPoint);
                if (dDistanceInRadiansTo != dDistanceInRadiansTo2) {
                    return dDistanceInRadiansTo - dDistanceInRadiansTo2 > 0.0d ? 1 : -1;
                }
            } catch (ParseException e) {
                throw new RuntimeException(e);
            }
        }
        Iterator it = list.iterator();
        do {
            z = false;
            if (!it.hasNext()) {
                return 0;
            }
            String strSubstring = (String) it.next();
            if (strSubstring.startsWith("-")) {
                strSubstring = strSubstring.substring(1);
                z = true;
            }
            try {
                try {
                    iCompareTo = compareTo(getValue(parseObject, strSubstring), getValue(parseObject2, strSubstring));
                } catch (IllegalArgumentException e2) {
                    throw new IllegalArgumentException(ˆʽ.ᵎˏ.ˑי("Unable to sort by key ", strSubstring, "."), e2);
                }
            } catch (ParseException e3) {
                throw new RuntimeException(e3);
            }
        } while (iCompareTo == 0);
        return z ? -iCompareTo : iCompareTo;
    }

    private static boolean matchesAllConstraint(Object obj, Object obj2) {
        if (obj2 == null || obj2 == JSONObject.NULL) {
            return false;
        }
        if (!(obj2 instanceof Collection)) {
            throw new IllegalArgumentException("Value type not supported for $all queries.");
        }
        if (!(obj instanceof Collection)) {
            throw new IllegalArgumentException("Constraint type not supported for $all queries.");
        }
        Collection collection = (Collection) obj;
        if (isAnyValueRegexStartsWith(collection) && (obj = cleanRegexStartsWith((Collection<?>) collection)) == null) {
            throw new IllegalArgumentException("All values in $all queries must be of starting with regex or non regex.");
        }
        Iterator it = ((Collection) obj).iterator();
        while (it.hasNext()) {
            if (!matchesEqualConstraint(it.next(), obj2)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean matchesEqualConstraint(Object obj, Object obj2) {
        if (obj == null || obj2 == null) {
            return obj == obj2;
        }
        if ((obj instanceof Number) && (obj2 instanceof Number)) {
            return compareTo(obj, obj2) == 0;
        }
        if ((obj instanceof ParseGeoPoint) && (obj2 instanceof ParseGeoPoint)) {
            ParseGeoPoint parseGeoPoint = (ParseGeoPoint) obj;
            ParseGeoPoint parseGeoPoint2 = (ParseGeoPoint) obj2;
            return parseGeoPoint.getLatitude() == parseGeoPoint2.getLatitude() && parseGeoPoint.getLongitude() == parseGeoPoint2.getLongitude();
        }
        if ((obj instanceof ParsePolygon) && (obj2 instanceof ParsePolygon)) {
            return ((ParsePolygon) obj).equals((ParsePolygon) obj2);
        }
        return compare(obj, obj2, isStartsWithRegex(obj) ? new C0797(0) : new C0797(1));
    }

    private static boolean matchesExistsConstraint(Object obj, Object obj2) {
        return (obj == null || !((Boolean) obj).booleanValue()) ? obj2 == null || obj2 == JSONObject.NULL : (obj2 == null || obj2 == JSONObject.NULL) ? false : true;
    }

    private static boolean matchesGeoIntersectsConstraint(Object obj, Object obj2) {
        if (obj2 == null || obj2 == JSONObject.NULL) {
            return false;
        }
        return ((ParsePolygon) obj2).containsPoint((ParseGeoPoint) ((HashMap) obj).get("$point"));
    }

    private static boolean matchesGeoWithinConstraint(Object obj, Object obj2) {
        if (obj2 == null || obj2 == JSONObject.NULL) {
            return false;
        }
        return new ParsePolygon((List) ((HashMap) obj).get("$polygon")).containsPoint((ParseGeoPoint) obj2);
    }

    private static boolean matchesGreaterThanConstraint(Object obj, Object obj2) {
        return compare(obj, obj2, new C0797(4));
    }

    private static boolean matchesGreaterThanOrEqualToConstraint(Object obj, Object obj2) {
        return compare(obj, obj2, new C0797(3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean matchesInConstraint(Object obj, Object obj2) {
        if (!(obj instanceof Collection)) {
            throw new IllegalArgumentException("Constraint type not supported for $in queries.");
        }
        Iterator it = ((Collection) obj).iterator();
        while (it.hasNext()) {
            if (matchesEqualConstraint(it.next(), obj2)) {
                return true;
            }
        }
        return false;
    }

    private static boolean matchesLessThanConstraint(Object obj, Object obj2) {
        return compare(obj, obj2, new C0797(5));
    }

    private static boolean matchesLessThanOrEqualToConstraint(Object obj, Object obj2) {
        return compare(obj, obj2, new C0797(2));
    }

    private static boolean matchesNearSphereConstraint(Object obj, Object obj2, Double d) {
        if (obj2 == null || obj2 == JSONObject.NULL) {
            return false;
        }
        return d == null || ((ParseGeoPoint) obj).distanceInRadiansTo((ParseGeoPoint) obj2) <= d.doubleValue();
    }

    private static boolean matchesNotEqualConstraint(Object obj, Object obj2) {
        return !matchesEqualConstraint(obj, obj2);
    }

    private static boolean matchesNotInConstraint(Object obj, Object obj2) {
        return !matchesInConstraint(obj, obj2);
    }

    private static boolean matchesRegexConstraint(Object obj, Object obj2, String str) throws ParseException {
        if (obj2 == null || obj2 == JSONObject.NULL) {
            return false;
        }
        if (str == null) {
            str = "";
        }
        if (!str.matches("^[imxs]*$")) {
            throw new ParseException(102, "Invalid regex options: ".concat(str));
        }
        int i = str.contains("i") ? 2 : 0;
        if (str.contains("m")) {
            i |= 8;
        }
        if (str.contains("x")) {
            i |= 4;
        }
        if (str.contains("s")) {
            i |= 32;
        }
        return Pattern.compile((String) obj, i).matcher((String) obj2).find();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean matchesStatelessConstraint(String str, Object obj, Object obj2, ParseQuery.KeyConstraints keyConstraints) {
        str.getClass();
        switch (str) {
            case "$geoWithin":
                return matchesGeoWithinConstraint(obj, obj2);
            case "$maxDistance":
                return true;
            case "$nearSphere":
                return matchesNearSphereConstraint(obj, obj2, (Double) keyConstraints.get("$maxDistance"));
            case "$gt":
                return matchesGreaterThanConstraint(obj, obj2);
            case "$in":
                return matchesInConstraint(obj, obj2);
            case "$lt":
                return matchesLessThanConstraint(obj, obj2);
            case "$ne":
                return matchesNotEqualConstraint(obj, obj2);
            case "$all":
                return matchesAllConstraint(obj, obj2);
            case "$gte":
                return matchesGreaterThanOrEqualToConstraint(obj, obj2);
            case "$lte":
                return matchesLessThanOrEqualToConstraint(obj, obj2);
            case "$nin":
                return matchesNotInConstraint(obj, obj2);
            case "$exists":
                return matchesExistsConstraint(obj, obj2);
            case "$within":
                return matchesWithinConstraint(obj, obj2);
            case "$regex":
                return matchesRegexConstraint(obj, obj2, (String) keyConstraints.get("$options"));
            case "$options":
                return true;
            case "$geoIntersects":
                return matchesGeoIntersectsConstraint(obj, obj2);
            default:
                throw new UnsupportedOperationException(ˆʽ.ᵎˏ.ˑי("The offline store does not yet support the ", str, " operator."));
        }
    }

    private static boolean matchesWithinConstraint(Object obj, Object obj2) throws ParseException {
        if (obj2 == null || obj2 == JSONObject.NULL) {
            return false;
        }
        ArrayList arrayList = (ArrayList) ((HashMap) obj).get("$box");
        ParseGeoPoint parseGeoPoint = (ParseGeoPoint) arrayList.get(0);
        ParseGeoPoint parseGeoPoint2 = (ParseGeoPoint) arrayList.get(1);
        ParseGeoPoint parseGeoPoint3 = (ParseGeoPoint) obj2;
        if (parseGeoPoint2.getLongitude() < parseGeoPoint.getLongitude()) {
            throw new ParseException(102, "whereWithinGeoBox queries cannot cross the International Date Line.");
        }
        if (parseGeoPoint2.getLatitude() < parseGeoPoint.getLatitude()) {
            throw new ParseException(102, "The southwest corner of a geo box must be south of the northeast corner.");
        }
        if (parseGeoPoint2.getLongitude() - parseGeoPoint.getLongitude() <= 180.0d) {
            return parseGeoPoint3.getLatitude() >= parseGeoPoint.getLatitude() && parseGeoPoint3.getLatitude() <= parseGeoPoint2.getLatitude() && parseGeoPoint3.getLongitude() >= parseGeoPoint.getLongitude() && parseGeoPoint3.getLongitude() <= parseGeoPoint2.getLongitude();
        }
        throw new ParseException(102, "Geo box queries larger than 180 degrees in longitude are not supported. Please check point order.");
    }

    public static <T extends ParseObject> void sort(List<T> list, ParseQuery.State<T> state) throws ParseException {
        final List<String> listOrder = state.order();
        for (String str : state.order()) {
            if (!str.matches("^-?[A-Za-z][A-Za-z0-9_]*$") && !"_created_at".equals(str) && !"_updated_at".equals(str)) {
                throw new ParseException(105, ˆʽ.ᵎˏ.ˑי("Invalid key name: \"", str, "\"."));
            }
        }
        final String str2 = null;
        final ParseGeoPoint parseGeoPoint = null;
        for (String str3 : state.constraints().keySet()) {
            Object obj = state.constraints().get(str3);
            if (obj instanceof ParseQuery.KeyConstraints) {
                ParseQuery.KeyConstraints keyConstraints = (ParseQuery.KeyConstraints) obj;
                if (keyConstraints.containsKey("$nearSphere")) {
                    parseGeoPoint = (ParseGeoPoint) keyConstraints.get("$nearSphere");
                    str2 = str3;
                }
            }
        }
        if (listOrder.size() == 0 && str2 == null) {
            return;
        }
        Collections.sort(list, new Comparator() { // from class: com.parse.ﾞʽ
            @Override // java.util.Comparator
            public final int compare(Object obj2, Object obj3) {
                List list2 = listOrder;
                return OfflineQueryLogic.lambda$sort$5(str2, parseGeoPoint, list2, (ParseObject) obj2, (ParseObject) obj3);
            }
        });
    }

    public <T extends ParseObject> ConstraintMatcher<T> createMatcher(ParseQuery.State<T> state, ParseUser parseUser) {
        final boolean zIgnoreACLs = state.ignoreACLs();
        final ConstraintMatcher<T> constraintMatcherCreateMatcher = createMatcher(parseUser, state.constraints());
        return (ConstraintMatcher<T>) new ConstraintMatcher<T>(parseUser) { // from class: com.parse.OfflineQueryLogic.10
            /* JADX WARN: Incorrect types in method signature: (TT;Lcom/parse/ParseSQLiteDatabase;)Lcom/parse/boltsinternal/Task<Ljava/lang/Boolean;>; */
            @Override // com.parse.OfflineQueryLogic.ConstraintMatcher
            public Task matchesAsync(ParseObject parseObject, ParseSQLiteDatabase parseSQLiteDatabase) {
                return (zIgnoreACLs || OfflineQueryLogic.hasReadAccess(this.user, parseObject)) ? constraintMatcherCreateMatcher.matchesAsync(parseObject, parseSQLiteDatabase) : Task.forResult(Boolean.FALSE);
            }
        };
    }
}
