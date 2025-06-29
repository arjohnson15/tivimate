package com.parse;

import com.parse.boltsinternal.Task;
import com.parse.http.ParseHttpBody;
import com.parse.http.ParseHttpRequest;
import com.parse.http.ParseHttpResponse;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONStringer;
import p080.AbstractC1702;

/* loaded from: classes.dex */
class ParseRESTCommand extends ParseRequest<JSONObject> {
    static URL server;
    String httpPath;
    private String installationId;
    final JSONObject jsonParameters;
    private String localId;
    public String masterKey;
    private String operationSetUUID;
    private final String sessionToken;

    public static abstract class Init<T extends Init<T>> {
        private String httpPath;
        private String installationId;
        private JSONObject jsonParameters;
        private String localId;
        public String masterKey;
        private ParseHttpRequest.Method method = ParseHttpRequest.Method.GET;
        private String operationSetUUID;
        private String sessionToken;

        public T httpPath(String str) {
            this.httpPath = str;
            return (T) self();
        }

        public T method(ParseHttpRequest.Method method) {
            this.method = method;
            return (T) self();
        }

        public abstract T self();

        public T sessionToken(String str) {
            this.sessionToken = str;
            return (T) self();
        }
    }

    public ParseRESTCommand(Init<?> init) {
        super(((Init) init).method, createUrl(((Init) init).httpPath));
        this.sessionToken = ((Init) init).sessionToken;
        this.installationId = ((Init) init).installationId;
        this.masterKey = init.masterKey;
        this.httpPath = ((Init) init).httpPath;
        this.jsonParameters = ((Init) init).jsonParameters;
        this.operationSetUUID = ((Init) init).operationSetUUID;
        this.localId = ((Init) init).localId;
    }

    public ParseRESTCommand(String str, ParseHttpRequest.Method method, Map<String, ?> map, String str2) {
        this(str, method, map != null ? (JSONObject) NoObjectsEncoder.get().encode(map) : null, str2);
    }

    public ParseRESTCommand(String str, ParseHttpRequest.Method method, JSONObject jSONObject, String str2) {
        this(str, method, jSONObject, null, str2);
    }

    private ParseRESTCommand(String str, ParseHttpRequest.Method method, JSONObject jSONObject, String str2, String str3) {
        super(method, createUrl(str));
        this.httpPath = str;
        this.jsonParameters = jSONObject;
        this.localId = str2;
        this.sessionToken = str3;
    }

    private static void addToStringer(JSONStringer jSONStringer, Object obj) throws JSONException {
        if (!(obj instanceof JSONObject)) {
            if (!(obj instanceof JSONArray)) {
                jSONStringer.value(obj);
                return;
            }
            JSONArray jSONArray = (JSONArray) obj;
            jSONStringer.array();
            for (int i = 0; i < jSONArray.length(); i++) {
                addToStringer(jSONStringer, jSONArray.get(i));
            }
            jSONStringer.endArray();
            return;
        }
        jSONStringer.object();
        JSONObject jSONObject = (JSONObject) obj;
        Iterator<String> itKeys = jSONObject.keys();
        ArrayList arrayList = new ArrayList();
        while (itKeys.hasNext()) {
            arrayList.add(itKeys.next());
        }
        Collections.sort(arrayList);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            jSONStringer.key(str);
            addToStringer(jSONStringer, jSONObject.opt(str));
        }
        jSONStringer.endObject();
    }

    private static String createUrl(String str) {
        if (str == null) {
            return server.toString();
        }
        try {
            return new URL(server, str).toString();
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

    public static ParseRESTCommand fromJSONObject(JSONObject jSONObject) {
        String strOptString = jSONObject.optString("httpPath");
        ParseHttpRequest.Method methodFromString = ParseHttpRequest.Method.fromString(jSONObject.optString("httpMethod"));
        String strOptString2 = jSONObject.optString("sessionToken", null);
        return new ParseRESTCommand(strOptString, methodFromString, jSONObject.optJSONObject("parameters"), jSONObject.optString("localId", null), strOptString2);
    }

    private static LocalIdManager getLocalIdManager() {
        return ParseCorePlugins.getInstance().getLocalIdManager();
    }

    public static void getLocalPointersIn(Object obj, ArrayList<JSONObject> arrayList) {
        if (obj instanceof JSONObject) {
            JSONObject jSONObject = (JSONObject) obj;
            if ("Pointer".equals(jSONObject.opt("__type")) && jSONObject.has("localId")) {
                arrayList.add(jSONObject);
                return;
            } else {
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    getLocalPointersIn(jSONObject.get(itKeys.next()), arrayList);
                }
            }
        }
        if (obj instanceof JSONArray) {
            JSONArray jSONArray = (JSONArray) obj;
            for (int i = 0; i < jSONArray.length(); i++) {
                getLocalPointersIn(jSONArray.get(i), arrayList);
            }
        }
    }

    public static boolean isValidCommandJSONObject(JSONObject jSONObject) {
        return jSONObject.has("httpPath");
    }

    public static boolean isValidOldFormatCommandJSONObject(JSONObject jSONObject) {
        return jSONObject.has("op");
    }

    private void maybeChangeServerOperation() {
        String objectId;
        if (this.localId == null || (objectId = getLocalIdManager().getObjectId(this.localId)) == null) {
            return;
        }
        this.localId = null;
        String str = this.httpPath + "/".concat(objectId);
        this.httpPath = str;
        this.url = createUrl(str);
        if (this.httpPath.startsWith("classes") && this.method == ParseHttpRequest.Method.POST) {
            this.method = ParseHttpRequest.Method.PUT;
        }
    }

    public static String toDeterministicString(Object obj) throws JSONException {
        JSONStringer jSONStringer = new JSONStringer();
        addToStringer(jSONStringer, obj);
        return jSONStringer.toString();
    }

    public void addAdditionalHeaders(ParseHttpRequest.Builder builder) {
        String str = this.installationId;
        if (str != null) {
            builder.addHeader("X-Parse-Installation-Id", str);
        }
        String str2 = this.sessionToken;
        if (str2 != null) {
            builder.addHeader("X-Parse-Session-Token", str2);
        }
        String str3 = this.masterKey;
        if (str3 != null) {
            builder.addHeader("X-Parse-Master-Key", str3);
        }
    }

    @Override // com.parse.ParseRequest
    public Task<JSONObject> executeAsync(ParseHttpClient parseHttpClient, ProgressCallback progressCallback, ProgressCallback progressCallback2, Task<Void> task) throws JSONException {
        resolveLocalIds();
        return super.executeAsync(parseHttpClient, progressCallback, progressCallback2, task);
    }

    public String getCacheKey() throws NoSuchAlgorithmException {
        String deterministicString;
        JSONObject jSONObject = this.jsonParameters;
        if (jSONObject != null) {
            try {
                deterministicString = toDeterministicString(jSONObject);
            } catch (JSONException e) {
                throw new RuntimeException(e.getMessage());
            }
        } else {
            deterministicString = "";
        }
        if (this.sessionToken != null) {
            StringBuilder sbM5407 = AbstractC1702.m5407(deterministicString);
            sbM5407.append(this.sessionToken);
            deterministicString = sbM5407.toString();
        }
        return "ParseRESTCommand." + this.method.toString() + "." + ParseDigestUtils.md5(this.httpPath) + "." + ParseDigestUtils.md5(deterministicString);
    }

    public String getLocalId() {
        return this.localId;
    }

    @Override // com.parse.ParseRequest
    public ParseHttpBody newBody(ProgressCallback progressCallback) throws JSONException {
        JSONObject jSONObject = this.jsonParameters;
        if (jSONObject == null) {
            throw new IllegalArgumentException(ˆʽ.ᵎˏ.ˑי("Trying to execute a ", this.method.toString(), " command without body parameters."));
        }
        try {
            ParseHttpRequest.Method method = this.method;
            if (method == ParseHttpRequest.Method.GET || method == ParseHttpRequest.Method.DELETE) {
                jSONObject = new JSONObject(this.jsonParameters.toString());
                jSONObject.put("_method", this.method.toString());
            }
            return new ParseByteArrayHttpBody(jSONObject.toString(), "application/json");
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    @Override // com.parse.ParseRequest
    public ParseHttpRequest newRequest(ParseHttpRequest.Method method, String str, ProgressCallback progressCallback) {
        ParseHttpRequest.Method method2;
        ParseHttpRequest.Builder builder = new ParseHttpRequest.Builder((this.jsonParameters == null || method == (method2 = ParseHttpRequest.Method.POST) || method == ParseHttpRequest.Method.PUT) ? super.newRequest(method, str, progressCallback) : super.newRequest(method2, str, progressCallback));
        addAdditionalHeaders(builder);
        return builder.build();
    }

    @Override // com.parse.ParseRequest
    public Task<JSONObject> onResponseAsync(ParseHttpResponse parseHttpResponse, ProgressCallback progressCallback) throws IOException {
        new Exception().printStackTrace();
        InputStream content = null;
        try {
            try {
                content = parseHttpResponse.getContent();
                String str = new String(ParseIOUtils.toByteArray(content));
                ParseIOUtils.closeQuietly(content);
                int statusCode = parseHttpResponse.getStatusCode();
                if (statusCode < 200 || statusCode >= 600) {
                    return Task.forError(newPermanentException(-1, str));
                }
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    return (statusCode < 400 || statusCode >= 500) ? statusCode >= 500 ? Task.forError(newTemporaryException(jSONObject.optInt("code"), jSONObject.optString("error"))) : Task.forResult(jSONObject) : Task.forError(newPermanentException(jSONObject.optInt("code"), jSONObject.optString("error")));
                } catch (JSONException e) {
                    return Task.forError(newTemporaryException("bad json response", e));
                }
            } catch (Throwable th) {
                ParseIOUtils.closeQuietly(content);
                throw th;
            }
        } catch (IOException e2) {
            Task<JSONObject> taskForError = Task.forError(e2);
            ParseIOUtils.closeQuietly(content);
            return taskForError;
        }
    }

    public void releaseLocalIds() {
        if (this.localId != null) {
            getLocalIdManager().releaseLocalIdOnDisk(this.localId);
        }
        try {
            ArrayList arrayList = new ArrayList();
            getLocalPointersIn(this.jsonParameters, arrayList);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                getLocalIdManager().releaseLocalIdOnDisk((String) ((JSONObject) it.next()).get("localId"));
            }
        } catch (JSONException unused) {
        }
    }

    public void resolveLocalIds() throws JSONException {
        try {
            ArrayList arrayList = new ArrayList();
            getLocalPointersIn(this.jsonParameters, arrayList);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                JSONObject jSONObject = (JSONObject) it.next();
                String objectId = getLocalIdManager().getObjectId((String) jSONObject.get("localId"));
                if (objectId == null) {
                    throw new IllegalStateException("Tried to serialize a command referencing a new, unsaved object.");
                }
                jSONObject.put("objectId", objectId);
                jSONObject.remove("localId");
            }
            maybeChangeServerOperation();
        } catch (JSONException unused) {
        }
    }
}
