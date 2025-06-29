package com.parse;

import android.os.Parcel;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
class ParseIncrementOperation implements ParseFieldOperation {
    private final Number amount;

    public ParseIncrementOperation(Number number) {
        this.amount = number;
    }

    @Override // com.parse.ParseFieldOperation
    public Object apply(Object obj, String str) {
        if (obj == null) {
            return this.amount;
        }
        if (obj instanceof Number) {
            return Numbers.add((Number) obj, this.amount);
        }
        throw new IllegalArgumentException("You cannot increment a non-number.");
    }

    @Override // com.parse.ParseFieldOperation
    public JSONObject encode(ParseEncoder parseEncoder) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("__op", "Increment");
        jSONObject.put("amount", this.amount);
        return jSONObject;
    }

    @Override // com.parse.ParseFieldOperation
    public void encode(Parcel parcel, ParseParcelEncoder parseParcelEncoder) {
        parcel.writeString("Increment");
        parseParcelEncoder.encode(this.amount, parcel);
    }

    @Override // com.parse.ParseFieldOperation
    public ParseFieldOperation mergeWithPrevious(ParseFieldOperation parseFieldOperation) {
        if (parseFieldOperation == null) {
            return this;
        }
        if (parseFieldOperation instanceof ParseDeleteOperation) {
            return new ParseSetOperation(this.amount);
        }
        if (!(parseFieldOperation instanceof ParseSetOperation)) {
            if (parseFieldOperation instanceof ParseIncrementOperation) {
                return new ParseIncrementOperation(Numbers.add(((ParseIncrementOperation) parseFieldOperation).amount, this.amount));
            }
            throw new IllegalArgumentException("Operation is invalid after previous operation.");
        }
        Object value = ((ParseSetOperation) parseFieldOperation).getValue();
        if (value instanceof Number) {
            return new ParseSetOperation(Numbers.add((Number) value, this.amount));
        }
        throw new IllegalArgumentException("You cannot increment a non-number.");
    }
}
