package com.parse;

import com.parse.ParseObject;
import com.parse.ParseUser;
import com.parse.boltsinternal.Task;
import org.json.JSONObject;

/* loaded from: classes.dex */
class NetworkUserController implements ParseUserController {
    private final ParseHttpClient client;
    private final ParseObjectCoder coder;
    private final boolean revocableSession;

    public NetworkUserController(ParseHttpClient parseHttpClient) {
        this(parseHttpClient, false);
    }

    public NetworkUserController(ParseHttpClient parseHttpClient, boolean z) {
        this.client = parseHttpClient;
        this.coder = ParseObjectCoder.get();
        this.revocableSession = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ParseUser.State lambda$logInAsync$1(Task task) {
        return ((ParseUser.State.Builder) this.coder.decode(new ParseUser.State.Builder(), (JSONObject) task.getResult(), ParseDecoder.get())).isComplete(true).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ParseUser.State lambda$logInAsync$2(ParseRESTUserCommand parseRESTUserCommand, Task task) {
        JSONObject jSONObject = (JSONObject) task.getResult();
        boolean z = parseRESTUserCommand.getStatusCode() == 201;
        return ((ParseUser.State.Builder) this.coder.decode(new ParseUser.State.Builder(), jSONObject, ParseDecoder.get())).isComplete(!z).isNew(z).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ParseUser.State lambda$signUpAsync$0(Task task) {
        return ((ParseUser.State.Builder) this.coder.decode(new ParseUser.State.Builder(), (JSONObject) task.getResult(), ParseDecoder.get())).isComplete(false).isNew(true).build();
    }

    @Override // com.parse.ParseUserController
    public Task<ParseUser.State> logInAsync(ParseUser.State state, ParseOperationSet parseOperationSet) {
        ParseRESTUserCommand parseRESTUserCommandServiceLogInUserCommand = ParseRESTUserCommand.serviceLogInUserCommand(this.coder.encode(state, parseOperationSet, PointerEncoder.get()), state.sessionToken(), this.revocableSession);
        return parseRESTUserCommandServiceLogInUserCommand.executeAsync(this.client).onSuccess(new C0855(this, 1, parseRESTUserCommandServiceLogInUserCommand));
    }

    @Override // com.parse.ParseUserController
    public Task<ParseUser.State> logInAsync(String str, String str2, String str3) {
        return ParseRESTUserCommand.logInUserCommand(str, str2, str3, this.revocableSession).executeAsync(this.client).onSuccess(new C0842(this, 0));
    }

    @Override // com.parse.ParseUserController
    public Task<Void> requestPasswordResetAsync(String str) {
        return ParseRESTUserCommand.resetPasswordResetCommand(str).executeAsync(this.client).makeVoid();
    }

    @Override // com.parse.ParseUserController
    public Task<ParseUser.State> signUpAsync(ParseObject.State state, ParseOperationSet parseOperationSet, String str, String str2) {
        return ParseRESTUserCommand.signUpUserCommand(this.coder.encode(state, parseOperationSet, PointerEncoder.get()), str, this.revocableSession, str2).executeAsync(this.client).onSuccess(new C0842(this, 1));
    }
}
