package com.parse;

import java.util.List;

@ParseClassName("_Pin")
/* loaded from: classes.dex */
class ParsePin extends ParseObject {
    public List<ParseObject> getObjects() {
        return getList("_objects");
    }

    @Override // com.parse.ParseObject
    public boolean needsDefaultACL() {
        return false;
    }

    public void setName(String str) {
        put("_name", str);
    }

    public void setObjects(List<ParseObject> list) {
        put("_objects", list);
    }
}
