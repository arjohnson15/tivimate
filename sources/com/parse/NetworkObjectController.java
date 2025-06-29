package com.parse;

import com.parse.ParseObject;
import com.parse.boltsinternal.Task;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes.dex */
class NetworkObjectController implements ParseObjectController {
    private final ParseHttpClient client;
    private final ParseObjectCoder coder = ParseObjectCoder.get();

    public NetworkObjectController(ParseHttpClient parseHttpClient) {
        this.client = parseHttpClient;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ParseObject.State lambda$saveAllAsync$2(ParseObject.State state, ParseDecoder parseDecoder, Task task) {
        JSONObject jSONObject = (JSONObject) task.getResult();
        return this.coder.decode(state.newBuilder().clear(), jSONObject, parseDecoder).isComplete(false).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ParseObject.State lambda$saveAsync$1(ParseObject.State state, ParseDecoder parseDecoder, Task task) {
        JSONObject jSONObject = (JSONObject) task.getResult();
        return this.coder.decode(state.newBuilder().clear(), jSONObject, parseDecoder).isComplete(false).build();
    }

    @Override // com.parse.ParseObjectController
    public Task<Void> deleteAsync(ParseObject.State state, String str) {
        return ParseRESTObjectCommand.deleteObjectCommand(state, str).executeAsync(this.client).makeVoid();
    }

    @Override // com.parse.ParseObjectController
    public List<Task<ParseObject.State>> saveAllAsync(List<ParseObject.State> list, List<ParseOperationSet> list2, String str, List<ParseDecoder> list3) {
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        PointerEncoder pointerEncoder = PointerEncoder.get();
        for (int i = 0; i < size; i++) {
            ParseObject.State state = list.get(i);
            arrayList.add(ParseRESTObjectCommand.saveObjectCommand(state, this.coder.encode(state, list2.get(i), pointerEncoder), str));
        }
        List<Task<JSONObject>> listExecuteBatch = ParseRESTObjectBatchCommand.executeBatch(this.client, arrayList, str);
        ArrayList arrayList2 = new ArrayList(size);
        for (int i2 = 0; i2 < size; i2++) {
            arrayList2.add(listExecuteBatch.get(i2).onSuccess(new C0818(this, list.get(i2), list3.get(i2), 1)));
        }
        return arrayList2;
    }

    @Override // com.parse.ParseObjectController
    public Task<ParseObject.State> saveAsync(ParseObject.State state, ParseOperationSet parseOperationSet, String str, ParseDecoder parseDecoder) {
        return ParseRESTObjectCommand.saveObjectCommand(state, this.coder.encode(state, parseOperationSet, PointerEncoder.get()), str).executeAsync(this.client).onSuccess(new C0818(this, state, parseDecoder, 0));
    }
}
