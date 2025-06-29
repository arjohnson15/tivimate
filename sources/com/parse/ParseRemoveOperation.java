package com.parse;

import android.os.Parcel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
class ParseRemoveOperation implements ParseFieldOperation {
    protected final HashSet<Object> objects;

    public ParseRemoveOperation(Collection<?> collection) {
        HashSet<Object> hashSet = new HashSet<>();
        this.objects = hashSet;
        hashSet.addAll(collection);
    }

    @Override // com.parse.ParseFieldOperation
    public Object apply(Object obj, String str) {
        if (obj == null) {
            return new ArrayList();
        }
        if (obj instanceof JSONArray) {
            return new JSONArray((Collection) apply(ParseFieldOperations.jsonArrayAsArrayList((JSONArray) obj), str));
        }
        if (!(obj instanceof List)) {
            throw new IllegalArgumentException("Operation is invalid after previous operation.");
        }
        ArrayList arrayList = new ArrayList((List) obj);
        arrayList.removeAll(this.objects);
        ArrayList arrayList2 = new ArrayList(this.objects);
        arrayList2.removeAll(arrayList);
        HashSet hashSet = new HashSet();
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (next instanceof ParseObject) {
                hashSet.add(((ParseObject) next).getObjectId());
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Object next2 = it2.next();
            if ((next2 instanceof ParseObject) && hashSet.contains(((ParseObject) next2).getObjectId())) {
                it2.remove();
            }
        }
        return arrayList;
    }

    @Override // com.parse.ParseFieldOperation
    public JSONObject encode(ParseEncoder parseEncoder) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("__op", "Remove");
        jSONObject.put("objects", parseEncoder.encode(new ArrayList(this.objects)));
        return jSONObject;
    }

    @Override // com.parse.ParseFieldOperation
    public void encode(Parcel parcel, ParseParcelEncoder parseParcelEncoder) {
        parcel.writeString("Remove");
        parcel.writeInt(this.objects.size());
        Iterator<Object> it = this.objects.iterator();
        while (it.hasNext()) {
            parseParcelEncoder.encode(it.next(), parcel);
        }
    }

    @Override // com.parse.ParseFieldOperation
    public ParseFieldOperation mergeWithPrevious(ParseFieldOperation parseFieldOperation) {
        if (parseFieldOperation == null) {
            return this;
        }
        if (parseFieldOperation instanceof ParseDeleteOperation) {
            return new ParseSetOperation(this.objects);
        }
        if (parseFieldOperation instanceof ParseSetOperation) {
            Object value = ((ParseSetOperation) parseFieldOperation).getValue();
            if ((value instanceof JSONArray) || (value instanceof List)) {
                return new ParseSetOperation(apply(value, null));
            }
            throw new IllegalArgumentException("You can only add an item to a List or JSONArray.");
        }
        if (!(parseFieldOperation instanceof ParseRemoveOperation)) {
            throw new IllegalArgumentException("Operation is invalid after previous operation.");
        }
        HashSet hashSet = new HashSet(((ParseRemoveOperation) parseFieldOperation).objects);
        hashSet.addAll(this.objects);
        return new ParseRemoveOperation(hashSet);
    }
}
