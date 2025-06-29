package com.parse;

import org.json.JSONObject;

/* loaded from: classes.dex */
class NoObjectsEncoder extends ParseEncoder {
    private static final NoObjectsEncoder INSTANCE = new NoObjectsEncoder();

    public static NoObjectsEncoder get() {
        return INSTANCE;
    }

    @Override // com.parse.ParseEncoder
    public JSONObject encodeRelatedObject(ParseObject parseObject) {
        throw new IllegalArgumentException("ParseObjects not allowed here");
    }
}
