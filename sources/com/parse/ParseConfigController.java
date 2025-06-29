package com.parse;

/* loaded from: classes.dex */
class ParseConfigController {
    private final ParseCurrentConfigController currentConfigController;
    private final ParseHttpClient restClient;

    public ParseConfigController(ParseHttpClient parseHttpClient, ParseCurrentConfigController parseCurrentConfigController) {
        this.restClient = parseHttpClient;
        this.currentConfigController = parseCurrentConfigController;
    }

    public ParseCurrentConfigController getCurrentConfigController() {
        return this.currentConfigController;
    }
}
