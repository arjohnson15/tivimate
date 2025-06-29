package com.parse;

import java.util.regex.Pattern;

@ParseClassName("_Role")
/* loaded from: classes.dex */
public class ParseRole extends ParseObject {
    private static final Pattern NAME_PATTERN = Pattern.compile("^[0-9a-zA-Z_\\- ]+$");

    public ParseRole() {
    }

    public ParseRole(String str) {
        this();
        setName(str);
    }

    public ParseRole(String str, ParseACL parseACL) {
        this(str);
        setACL(parseACL);
    }

    public String getName() {
        return getString("name");
    }

    @Override // com.parse.ParseObject
    public void put(String str, Object obj) {
        if ("name".equals(str)) {
            if (getObjectId() != null) {
                throw new IllegalArgumentException("A role's name can only be set before it has been saved.");
            }
            if (!(obj instanceof String)) {
                throw new IllegalArgumentException("A role's name must be a String.");
            }
            if (!NAME_PATTERN.matcher((String) obj).matches()) {
                throw new IllegalArgumentException("A role's name can only contain alphanumeric characters, _, -, and spaces.");
            }
        }
        super.put(str, obj);
    }

    public void setName(String str) {
        put("name", str);
    }

    @Override // com.parse.ParseObject
    public void validateSave() {
        synchronized (this.mutex) {
            try {
                if (getObjectId() == null && getName() == null) {
                    throw new IllegalStateException("New roles must specify a name.");
                }
                super.validateSave();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
