package com.parse;

import android.os.Parcel;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
class ParseObjectParcelEncoder extends ParseParcelEncoder {
    private final Set<String> ids;

    public ParseObjectParcelEncoder() {
        this.ids = new HashSet();
    }

    public ParseObjectParcelEncoder(ParseObject parseObject) {
        HashSet hashSet = new HashSet();
        this.ids = hashSet;
        hashSet.add(getObjectOrLocalId(parseObject));
    }

    private String getObjectOrLocalId(ParseObject parseObject) {
        return parseObject.getObjectId() != null ? parseObject.getObjectId() : parseObject.getOrCreateLocalId();
    }

    @Override // com.parse.ParseParcelEncoder
    public void encodeParseObject(ParseObject parseObject, Parcel parcel) {
        String objectOrLocalId = getObjectOrLocalId(parseObject);
        if (this.ids.contains(objectOrLocalId)) {
            encodePointer(parseObject.getClassName(), objectOrLocalId, parcel);
        } else {
            this.ids.add(objectOrLocalId);
            super.encodeParseObject(parseObject, parcel);
        }
    }
}
