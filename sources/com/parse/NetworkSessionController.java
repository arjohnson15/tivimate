package com.parse;

import com.parse.boltsinternal.Task;

/* loaded from: classes.dex */
class NetworkSessionController implements ParseSessionController {
    private final ParseHttpClient client;
    private final ParseObjectCoder coder = ParseObjectCoder.get();

    public NetworkSessionController(ParseHttpClient parseHttpClient) {
        this.client = parseHttpClient;
    }

    @Override // com.parse.ParseSessionController
    public Task<Void> revokeAsync(String str) {
        return ParseRESTSessionCommand.revoke(str).executeAsync(this.client).makeVoid();
    }
}
