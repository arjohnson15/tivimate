package com.parse;

import android.os.Parcel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
class ParseAddOperation implements ParseFieldOperation {
    protected final ArrayList<Object> objects;

    public ParseAddOperation(Collection<?> collection) {
        ArrayList<Object> arrayList = new ArrayList<>();
        this.objects = arrayList;
        arrayList.addAll(collection);
    }

    @Override // com.parse.ParseFieldOperation
    public Object apply(Object obj, String str) {
        if (obj == null) {
            return this.objects;
        }
        if (obj instanceof JSONArray) {
            return new JSONArray((Collection) apply(ParseFieldOperations.jsonArrayAsArrayList((JSONArray) obj), str));
        }
        if (!(obj instanceof List)) {
            throw new IllegalArgumentException("Operation is invalid after previous operation.");
        }
        ArrayList arrayList = new ArrayList((List) obj);
        arrayList.addAll(this.objects);
        return arrayList;
    }

    @Override // com.parse.ParseFieldOperation
    public JSONObject encode(ParseEncoder parseEncoder) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("__op", "Add");
        jSONObject.put("objects", parseEncoder.encode(this.objects));
        return jSONObject;
    }

    @Override // com.parse.ParseFieldOperation
    public void encode(Parcel parcel, ParseParcelEncoder parseParcelEncoder) {
        parcel.writeString("Add");
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
        if (!(parseFieldOperation instanceof ParseSetOperation)) {
            if (!(parseFieldOperation instanceof ParseAddOperation)) {
                throw new IllegalArgumentException("Operation is invalid after previous operation.");
            }
            ArrayList arrayList = new ArrayList(((ParseAddOperation) parseFieldOperation).objects);
            arrayList.addAll(this.objects);
            return new ParseAddOperation(arrayList);
        }
        Object value = ((ParseSetOperation) parseFieldOperation).getValue();
        if (value instanceof JSONArray) {
            ArrayList<Object> arrayListJsonArrayAsArrayList = ParseFieldOperations.jsonArrayAsArrayList((JSONArray) value);
            arrayListJsonArrayAsArrayList.addAll(this.objects);
            return new ParseSetOperation(new JSONArray((Collection) arrayListJsonArrayAsArrayList));
        }
        if (!(value instanceof List)) {
            throw new IllegalArgumentException("You can only add an item to a List or JSONArray.");
        }
        ArrayList arrayList2 = new ArrayList((List) value);
        arrayList2.addAll(this.objects);
        return new ParseSetOperation(arrayList2);
    }
}
