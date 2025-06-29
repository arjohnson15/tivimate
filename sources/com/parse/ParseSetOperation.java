package com.parse;

import android.os.Parcel;

/* loaded from: classes.dex */
class ParseSetOperation implements ParseFieldOperation {
    private final Object value;

    public ParseSetOperation(Object obj) {
        this.value = obj;
    }

    @Override // com.parse.ParseFieldOperation
    public Object apply(Object obj, String str) {
        return this.value;
    }

    @Override // com.parse.ParseFieldOperation
    public Object encode(ParseEncoder parseEncoder) {
        return parseEncoder.encode(this.value);
    }

    @Override // com.parse.ParseFieldOperation
    public void encode(Parcel parcel, ParseParcelEncoder parseParcelEncoder) {
        parcel.writeString("Set");
        parseParcelEncoder.encode(this.value, parcel);
    }

    public Object getValue() {
        return this.value;
    }

    @Override // com.parse.ParseFieldOperation
    public ParseFieldOperation mergeWithPrevious(ParseFieldOperation parseFieldOperation) {
        return this;
    }
}
