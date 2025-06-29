package com.parse;

import com.parse.boltsinternal.Task;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

@ParseClassName("_EventuallyPin")
/* loaded from: classes.dex */
class EventuallyPin extends ParseObject {
    public EventuallyPin() {
        super("_EventuallyPin");
    }

    public static Task<List<EventuallyPin>> findAllPinned(Collection<String> collection) {
        ParseQuery parseQueryOrderByAscending = new ParseQuery(EventuallyPin.class).fromPin("_eventuallyPin").ignoreACLs().orderByAscending("time");
        if (collection != null) {
            parseQueryOrderByAscending.whereNotContainedIn("uuid", collection);
        }
        return parseQueryOrderByAscending.findInBackground().onSuccessTask(new C0833(3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Task lambda$findAllPinned$1(List list, Task task) {
        return Task.forResult(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Task lambda$findAllPinned$2(Task task) {
        List list = (List) task.getResult();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ParseObject object = ((EventuallyPin) it.next()).getObject();
            if (object != null) {
                arrayList.add(object.fetchFromLocalDatastoreAsync().makeVoid());
            }
        }
        return Task.whenAll(arrayList).continueWithTask(new C0803(list, 0));
    }

    public ParseRESTCommand getCommand() throws JSONException {
        JSONObject jSONObject = getJSONObject("command");
        if (ParseRESTCommand.isValidCommandJSONObject(jSONObject)) {
            return ParseRESTCommand.fromJSONObject(jSONObject);
        }
        if (ParseRESTCommand.isValidOldFormatCommandJSONObject(jSONObject)) {
            return null;
        }
        throw new JSONException("Failed to load command from JSON.");
    }

    public ParseObject getObject() {
        return getParseObject("object");
    }

    public String getOperationSetUUID() {
        return getString("operationSetUUID");
    }

    public String getSessionToken() {
        return getString("sessionToken");
    }

    public int getType() {
        return getInt("type");
    }

    public String getUUID() {
        return getString("uuid");
    }

    @Override // com.parse.ParseObject
    public boolean needsDefaultACL() {
        return false;
    }
}
