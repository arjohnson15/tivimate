package com.parse;

import android.os.Parcel;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
class ParseDeleteOperation implements ParseFieldOperation {
    private static final ParseDeleteOperation defaultInstance = new ParseDeleteOperation();

    private ParseDeleteOperation() {
    }

    public static ParseDeleteOperation getInstance() {
        return defaultInstance;
    }

    @Override // com.parse.ParseFieldOperation
    public Object apply(Object obj, String str) {
        return null;
    }

    @Override // com.parse.ParseFieldOperation
    public JSONObject encode(ParseEncoder parseEncoder) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("__op", "Delete");
        return jSONObject;
    }

    @Override // com.parse.ParseFieldOperation
    public void encode(Parcel parcel, ParseParcelEncoder parseParcelEncoder) {
        parcel.writeString("Delete");
    }

    @Override // com.parse.ParseFieldOperation
    public ParseFieldOperation mergeWithPrevious(ParseFieldOperation parseFieldOperation) {
        return this;
    }
}
