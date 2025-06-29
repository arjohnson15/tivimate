package com.parse;

import com.parse.boltsinternal.Task;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
abstract class ParseEventuallyQueue {
    private boolean isConnected;

    public ParseRESTCommand commandFromJSON(JSONObject jSONObject) throws JSONException {
        if (ParseRESTCommand.isValidCommandJSONObject(jSONObject)) {
            return ParseRESTCommand.fromJSONObject(jSONObject);
        }
        if (ParseRESTCommand.isValidOldFormatCommandJSONObject(jSONObject)) {
            return null;
        }
        throw new JSONException("Failed to load command from JSON.");
    }

    public boolean isConnected() {
        return this.isConnected;
    }

    public void notifyTestHelper(int i) {
        notifyTestHelper(i, null);
    }

    public void notifyTestHelper(int i, Throwable th) {
    }

    public void setConnected(boolean z) {
        this.isConnected = z;
    }

    public Task<JSONObject> waitForOperationSetAndEventuallyPin(ParseOperationSet parseOperationSet, EventuallyPin eventuallyPin) {
        return Task.forResult(null);
    }
}
