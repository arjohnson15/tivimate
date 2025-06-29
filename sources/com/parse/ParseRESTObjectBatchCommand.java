package com.parse;

import android.support.v4.media.session.AbstractC0002;
import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;
import com.parse.boltsinternal.TaskCompletionSource;
import com.parse.http.ParseHttpRequest;
import com.parse.http.ParseHttpResponse;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
class ParseRESTObjectBatchCommand extends ParseRESTCommand {
    private ParseRESTObjectBatchCommand(String str, ParseHttpRequest.Method method, JSONObject jSONObject, String str2) {
        super(str, method, jSONObject, str2);
    }

    public static List<Task<JSONObject>> executeBatch(ParseHttpClient parseHttpClient, List<ParseRESTObjectCommand> list, String str) {
        final int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        int i = 0;
        if (size == 1) {
            arrayList.add(list.get(0).executeAsync(parseHttpClient));
            return arrayList;
        }
        if (size > 50) {
            List listPartition = Lists.partition(list, 50);
            int size2 = listPartition.size();
            while (i < size2) {
                arrayList.addAll(executeBatch(parseHttpClient, (List) listPartition.get(i), str));
                i++;
            }
            return arrayList;
        }
        final ArrayList arrayList2 = new ArrayList(size);
        while (i < size) {
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            arrayList2.add(taskCompletionSource);
            arrayList.add(taskCompletionSource.getTask());
            i++;
        }
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        try {
            for (ParseRESTObjectCommand parseRESTObjectCommand : list) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("method", parseRESTObjectCommand.method.toString());
                jSONObject2.put("path", new URL(ParseRESTCommand.server, parseRESTObjectCommand.httpPath).getPath());
                JSONObject jSONObject3 = parseRESTObjectCommand.jsonParameters;
                if (jSONObject3 != null) {
                    jSONObject2.put("body", jSONObject3);
                }
                jSONArray.put(jSONObject2);
            }
            jSONObject.put("requests", jSONArray);
            new ParseRESTObjectBatchCommand("batch", ParseHttpRequest.Method.POST, jSONObject, str).executeAsync(parseHttpClient).continueWith(new Continuation() { // from class: com.parse.ᵎᵢ
                @Override // com.parse.boltsinternal.Continuation
                public final Object then(Task task) {
                    return ParseRESTObjectBatchCommand.lambda$executeBatch$0(size, arrayList2, task);
                }
            });
            return arrayList;
        } catch (MalformedURLException e) {
            e = e;
            throw new RuntimeException(e);
        } catch (JSONException e2) {
            e = e2;
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Void lambda$executeBatch$0(int i, List list, Task task) throws JSONException {
        if (task.isFaulted() || task.isCancelled()) {
            for (int i2 = 0; i2 < i; i2++) {
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) list.get(i2);
                if (task.isFaulted()) {
                    taskCompletionSource.setError(task.getError());
                } else {
                    taskCompletionSource.setCancelled();
                }
            }
        }
        JSONArray jSONArray = ((JSONObject) task.getResult()).getJSONArray("results");
        int length = jSONArray.length();
        if (length != i) {
            for (int i3 = 0; i3 < i; i3++) {
                ((TaskCompletionSource) list.get(i3)).setError(new IllegalStateException(AbstractC0002.m55(i, length, "Batch command result count expected: ", " but was: ")));
            }
        }
        for (int i4 = 0; i4 < i; i4++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i4);
            TaskCompletionSource taskCompletionSource2 = (TaskCompletionSource) list.get(i4);
            if (jSONObject.has("success")) {
                taskCompletionSource2.setResult(jSONObject.getJSONObject("success"));
            } else if (jSONObject.has("error")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("error");
                taskCompletionSource2.setError(new ParseException(jSONObject2.getInt("code"), jSONObject2.getString("error")));
            }
        }
        return null;
    }

    @Override // com.parse.ParseRESTCommand, com.parse.ParseRequest
    public Task<JSONObject> onResponseAsync(ParseHttpResponse parseHttpResponse, ProgressCallback progressCallback) throws JSONException, IOException {
        InputStream content = null;
        try {
            content = parseHttpResponse.getContent();
            try {
                JSONArray jSONArray = new JSONArray(new String(ParseIOUtils.toByteArray(content)));
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("results", jSONArray);
                return Task.forResult(jSONObject);
            } catch (JSONException e) {
                return Task.forError(newTemporaryException("bad json response", e));
            }
        } catch (IOException e2) {
            return Task.forError(e2);
        } finally {
            ParseIOUtils.closeQuietly(content);
        }
    }
}
