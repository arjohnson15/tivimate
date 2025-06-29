package com.parse;

import com.parse.ParseQuery;
import com.parse.boltsinternal.Task;
import java.util.List;

/* loaded from: classes.dex */
class OfflineQueryController extends AbstractQueryController {
    private final ParseQueryController networkController;
    private final OfflineStore offlineStore;

    public OfflineQueryController(OfflineStore offlineStore, ParseQueryController parseQueryController) {
        this.offlineStore = offlineStore;
        this.networkController = parseQueryController;
    }

    @Override // com.parse.ParseQueryController
    public <T extends ParseObject> Task<List<T>> findAsync(ParseQuery.State<T> state, ParseUser parseUser, Task<Void> task) {
        return state.isFromLocalDatastore() ? this.offlineStore.findFromPinAsync(state.pinName(), state, parseUser) : this.networkController.findAsync(state, parseUser, task);
    }
}
