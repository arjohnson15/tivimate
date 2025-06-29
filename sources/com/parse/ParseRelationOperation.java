package com.parse;

import android.os.Parcel;
import com.parse.ParseObject;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
class ParseRelationOperation<T extends ParseObject> implements ParseFieldOperation {
    private final Set<ParseObject> relationsToAdd;
    private final Set<ParseObject> relationsToRemove;
    private final String targetClass;

    private ParseRelationOperation(String str, Set<ParseObject> set, Set<ParseObject> set2) {
        this.targetClass = str;
        this.relationsToAdd = new HashSet(set);
        this.relationsToRemove = new HashSet(set2);
    }

    public ParseRelationOperation(Set<T> set, Set<T> set2) {
        this.relationsToAdd = new HashSet();
        this.relationsToRemove = new HashSet();
        String className = null;
        if (set != null) {
            for (T t : set) {
                addParseObjectToSet(t, this.relationsToAdd);
                if (className == null) {
                    className = t.getClassName();
                } else if (!className.equals(t.getClassName())) {
                    throw new IllegalArgumentException("All objects in a relation must be of the same class.");
                }
            }
        }
        if (set2 != null) {
            for (T t2 : set2) {
                addParseObjectToSet(t2, this.relationsToRemove);
                if (className == null) {
                    className = t2.getClassName();
                } else if (!className.equals(t2.getClassName())) {
                    throw new IllegalArgumentException("All objects in a relation must be of the same class.");
                }
            }
        }
        if (className == null) {
            throw new IllegalArgumentException("Cannot create a ParseRelationOperation with no objects.");
        }
        this.targetClass = className;
    }

    private void addAllParseObjectsToSet(Collection<ParseObject> collection, Set<ParseObject> set) {
        Iterator<ParseObject> it = collection.iterator();
        while (it.hasNext()) {
            addParseObjectToSet(it.next(), set);
        }
    }

    private void addParseObjectToSet(ParseObject parseObject, Set<ParseObject> set) {
        if (Parse.getLocalDatastore() != null || parseObject.getObjectId() == null) {
            set.add(parseObject);
            return;
        }
        for (ParseObject parseObject2 : set) {
            if (parseObject.getObjectId().equals(parseObject2.getObjectId())) {
                set.remove(parseObject2);
            }
        }
        set.add(parseObject);
    }

    private void removeAllParseObjectsFromSet(Collection<ParseObject> collection, Set<ParseObject> set) {
        Iterator<ParseObject> it = collection.iterator();
        while (it.hasNext()) {
            removeParseObjectFromSet(it.next(), set);
        }
    }

    private void removeParseObjectFromSet(ParseObject parseObject, Set<ParseObject> set) {
        if (Parse.getLocalDatastore() != null || parseObject.getObjectId() == null) {
            set.remove(parseObject);
            return;
        }
        for (ParseObject parseObject2 : set) {
            if (parseObject.getObjectId().equals(parseObject2.getObjectId())) {
                set.remove(parseObject2);
            }
        }
    }

    @Override // com.parse.ParseFieldOperation
    public Object apply(Object obj, String str) {
        ParseRelation parseRelation;
        if (obj == null) {
            parseRelation = new ParseRelation(this.targetClass);
        } else {
            if (!(obj instanceof ParseRelation)) {
                throw new IllegalArgumentException("Operation is invalid after previous operation.");
            }
            parseRelation = (ParseRelation) obj;
            String str2 = this.targetClass;
            if (str2 != null && !str2.equals(parseRelation.getTargetClass())) {
                StringBuilder sb = new StringBuilder("Related object object must be of class ");
                sb.append(parseRelation.getTargetClass());
                sb.append(", but ");
                throw new IllegalArgumentException(ˆʽ.ᵎˏ.ˎٴ(sb, this.targetClass, " was passed in."));
            }
        }
        Iterator<ParseObject> it = this.relationsToAdd.iterator();
        while (it.hasNext()) {
            parseRelation.addKnownObject(it.next());
        }
        Iterator<ParseObject> it2 = this.relationsToRemove.iterator();
        while (it2.hasNext()) {
            parseRelation.removeKnownObject(it2.next());
        }
        return parseRelation;
    }

    public JSONArray convertSetToArray(Set<ParseObject> set, ParseEncoder parseEncoder) {
        JSONArray jSONArray = new JSONArray();
        Iterator<ParseObject> it = set.iterator();
        while (it.hasNext()) {
            jSONArray.put(parseEncoder.encode(it.next()));
        }
        return jSONArray;
    }

    @Override // com.parse.ParseFieldOperation
    public JSONObject encode(ParseEncoder parseEncoder) throws JSONException {
        JSONObject jSONObject;
        JSONObject jSONObject2 = null;
        if (this.relationsToAdd.size() > 0) {
            jSONObject = new JSONObject();
            jSONObject.put("__op", "AddRelation");
            jSONObject.put("objects", convertSetToArray(this.relationsToAdd, parseEncoder));
        } else {
            jSONObject = null;
        }
        if (this.relationsToRemove.size() > 0) {
            jSONObject2 = new JSONObject();
            jSONObject2.put("__op", "RemoveRelation");
            jSONObject2.put("objects", convertSetToArray(this.relationsToRemove, parseEncoder));
        }
        if (jSONObject == null || jSONObject2 == null) {
            if (jSONObject != null) {
                return jSONObject;
            }
            if (jSONObject2 != null) {
                return jSONObject2;
            }
            throw new IllegalArgumentException("A ParseRelationOperation was created without any data.");
        }
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("__op", "Batch");
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(jSONObject);
        jSONArray.put(jSONObject2);
        jSONObject3.put("ops", jSONArray);
        return jSONObject3;
    }

    @Override // com.parse.ParseFieldOperation
    public void encode(Parcel parcel, ParseParcelEncoder parseParcelEncoder) {
        if (this.relationsToAdd.isEmpty() && this.relationsToRemove.isEmpty()) {
            throw new IllegalArgumentException("A ParseRelationOperation was created without any data.");
        }
        if (this.relationsToAdd.size() > 0 && this.relationsToRemove.size() > 0) {
            parcel.writeString("Batch");
        }
        if (this.relationsToAdd.size() > 0) {
            parcel.writeString("AddRelation");
            parcel.writeInt(this.relationsToAdd.size());
            Iterator<ParseObject> it = this.relationsToAdd.iterator();
            while (it.hasNext()) {
                parseParcelEncoder.encode(it.next(), parcel);
            }
        }
        if (this.relationsToRemove.size() > 0) {
            parcel.writeString("RemoveRelation");
            parcel.writeInt(this.relationsToRemove.size());
            Iterator<ParseObject> it2 = this.relationsToRemove.iterator();
            while (it2.hasNext()) {
                parseParcelEncoder.encode(it2.next(), parcel);
            }
        }
    }

    @Override // com.parse.ParseFieldOperation
    public ParseFieldOperation mergeWithPrevious(ParseFieldOperation parseFieldOperation) {
        if (parseFieldOperation == null) {
            return this;
        }
        if (parseFieldOperation instanceof ParseDeleteOperation) {
            throw new IllegalArgumentException("You can't modify a relation after deleting it.");
        }
        if (!(parseFieldOperation instanceof ParseRelationOperation)) {
            throw new IllegalArgumentException("Operation is invalid after previous operation.");
        }
        ParseRelationOperation parseRelationOperation = (ParseRelationOperation) parseFieldOperation;
        String str = parseRelationOperation.targetClass;
        if (str != null && !str.equals(this.targetClass)) {
            StringBuilder sb = new StringBuilder("Related object object must be of class ");
            sb.append(parseRelationOperation.targetClass);
            sb.append(", but ");
            throw new IllegalArgumentException(ˆʽ.ᵎˏ.ˎٴ(sb, this.targetClass, " was passed in."));
        }
        HashSet hashSet = new HashSet(parseRelationOperation.relationsToAdd);
        HashSet hashSet2 = new HashSet(parseRelationOperation.relationsToRemove);
        Set<ParseObject> set = this.relationsToAdd;
        if (set != null) {
            addAllParseObjectsToSet(set, hashSet);
            removeAllParseObjectsFromSet(this.relationsToAdd, hashSet2);
        }
        Set<ParseObject> set2 = this.relationsToRemove;
        if (set2 != null) {
            removeAllParseObjectsFromSet(set2, hashSet);
            addAllParseObjectsToSet(this.relationsToRemove, hashSet2);
        }
        return new ParseRelationOperation(this.targetClass, hashSet, hashSet2);
    }
}
