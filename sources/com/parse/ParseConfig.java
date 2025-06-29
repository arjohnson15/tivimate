package com.parse;

import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class ParseConfig {
    static final TaskQueue taskQueue = new TaskQueue();
    final Map<String, Object> params;

    public ParseConfig() {
        this.params = DesugarCollections.unmodifiableMap(new HashMap());
    }

    public ParseConfig(Map<String, Object> map) {
        this.params = DesugarCollections.unmodifiableMap(map);
    }

    public static ParseConfig decode(JSONObject jSONObject, ParseDecoder parseDecoder) {
        Map map = (Map) ((Map) parseDecoder.decode(jSONObject)).get("params");
        if (map != null) {
            return new ParseConfig(map);
        }
        throw new RuntimeException("Object did not contain the 'params' key.");
    }

    public static ParseConfigController getConfigController() {
        return ParseCorePlugins.getInstance().getConfigController();
    }

    public static ParseConfig getCurrentConfig() {
        try {
            return (ParseConfig) ParseTaskUtils.wait(getConfigController().getCurrentConfigController().getCurrentConfigAsync());
        } catch (ParseException unused) {
            return new ParseConfig();
        }
    }

    public String toString() {
        return "ParseConfig[" + this.params.toString() + "]";
    }
}
