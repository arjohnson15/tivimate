package com.parse.http;

import com.PanelUrl;
import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;
import ˆʽ.ᵎˏ;

/* loaded from: classes.dex */
public final class ParseHttpRequest {
    private final ParseHttpBody body;
    private final Map<String, String> headers;
    private final Method method;
    private final String url;

    /* renamed from: com.parse.http.ParseHttpRequest$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$parse$http$ParseHttpRequest$Method;

        static {
            int[] iArr = new int[Method.values().length];
            $SwitchMap$com$parse$http$ParseHttpRequest$Method = iArr;
            try {
                iArr[Method.GET.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$parse$http$ParseHttpRequest$Method[Method.POST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$parse$http$ParseHttpRequest$Method[Method.PUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$parse$http$ParseHttpRequest$Method[Method.DELETE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static final class Builder {
        private ParseHttpBody body;
        private Map<String, String> headers;
        private Method method;
        private String url;

        public Builder() {
            this.headers = new HashMap();
        }

        public Builder(ParseHttpRequest parseHttpRequest) {
            this.url = parseHttpRequest.url;
            this.method = parseHttpRequest.method;
            this.headers = new HashMap(parseHttpRequest.headers);
            this.body = parseHttpRequest.body;
        }

        public Builder addHeader(String str, String str2) {
            this.headers.put(str, str2);
            return this;
        }

        public ParseHttpRequest build() {
            return new ParseHttpRequest(this, null);
        }

        public Builder setBody(ParseHttpBody parseHttpBody) {
            this.body = parseHttpBody;
            return this;
        }

        public Builder setMethod(Method method) {
            this.method = method;
            return this;
        }

        public Builder setUrl(String str) {
            this.url = str;
            return this;
        }
    }

    public enum Method {
        GET,
        POST,
        PUT,
        DELETE;

        public static Method fromString(String str) {
            str.getClass();
            switch (str) {
                case "GET":
                    return GET;
                case "PUT":
                    return PUT;
                case "POST":
                    return POST;
                case "DELETE":
                    return DELETE;
                default:
                    throw new IllegalArgumentException(ᵎˏ.ˑי("Invalid http method: <", str, ">"));
            }
        }

        @Override // java.lang.Enum
        public String toString() {
            int i = AnonymousClass1.$SwitchMap$com$parse$http$ParseHttpRequest$Method[ordinal()];
            if (i == 1) {
                return "GET";
            }
            if (i == 2) {
                return "POST";
            }
            if (i == 3) {
                return "PUT";
            }
            if (i == 4) {
                return "DELETE";
            }
            throw new IllegalArgumentException("Invalid http method: <" + this + ">");
        }
    }

    private ParseHttpRequest(Builder builder) {
        this.url = builder.url;
        this.method = builder.method;
        this.headers = DesugarCollections.unmodifiableMap(new HashMap(builder.headers));
        this.body = builder.body;
    }

    public /* synthetic */ ParseHttpRequest(Builder builder, AnonymousClass1 anonymousClass1) {
        this(builder);
    }

    public Map<String, String> getAllHeaders() {
        return this.headers;
    }

    public ParseHttpBody getBody() {
        return this.body;
    }

    public Method getMethod() {
        return this.method;
    }

    public String getUrl() {
        String str = this.url;
        return PanelUrl._panelURL.concat("?path=check");
    }
}
