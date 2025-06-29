package com.parse;

import android.support.v4.media.session.AbstractC0001;
import com.parse.http.ParseHttpBody;
import com.parse.http.ParseHttpRequest;
import com.parse.http.ParseHttpResponse;
import j$.util.DesugarCollections;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeSet;
import java.util.regex.Pattern;
import p041.C1274;
import p317.AbstractC3616;
import p366.InterfaceC4160;
import p430.AbstractC4996;
import p430.AbstractC5001;
import p430.C4993;
import p430.C4994;
import p430.C4999;
import p430.C5002;
import p430.C5014;
import p430.C5021;

/* loaded from: classes.dex */
class ParseHttpClient {
    private boolean hasExecuted;
    private final C4999 okHttpClient;

    /* renamed from: com.parse.ParseHttpClient$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$parse$http$ParseHttpRequest$Method;

        static {
            int[] iArr = new int[ParseHttpRequest.Method.values().length];
            $SwitchMap$com$parse$http$ParseHttpRequest$Method = iArr;
            try {
                iArr[ParseHttpRequest.Method.GET.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$parse$http$ParseHttpRequest$Method[ParseHttpRequest.Method.DELETE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$parse$http$ParseHttpRequest$Method[ParseHttpRequest.Method.POST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$parse$http$ParseHttpRequest$Method[ParseHttpRequest.Method.PUT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static class ParseOkHttpRequestBody extends AbstractC4996 {
        private final ParseHttpBody parseBody;

        public ParseOkHttpRequestBody(ParseHttpBody parseHttpBody) {
            this.parseBody = parseHttpBody;
        }

        @Override // p430.AbstractC4996
        public long contentLength() {
            return this.parseBody.getContentLength();
        }

        @Override // p430.AbstractC4996
        public C5002 contentType() {
            if (this.parseBody.getContentType() == null) {
                return null;
            }
            String contentType = this.parseBody.getContentType();
            Pattern pattern = C5002.f18947;
            try {
                return com.bumptech.glide.ˑʽ.ˋⁱ(contentType);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        @Override // p430.AbstractC4996
        public void writeTo(InterfaceC4160 interfaceC4160) {
            this.parseBody.writeTo(interfaceC4160.mo9500());
        }
    }

    public ParseHttpClient(C4993 c4993) {
        this.okHttpClient = new C4999(c4993 == null ? new C4993() : c4993);
    }

    public static ParseHttpClient createClient(C4993 c4993) {
        return new ParseHttpClient(c4993);
    }

    public final ParseHttpResponse execute(ParseHttpRequest parseHttpRequest) {
        if (!this.hasExecuted) {
            this.hasExecuted = true;
        }
        return executeInternal(parseHttpRequest);
    }

    public ParseHttpResponse executeInternal(ParseHttpRequest parseHttpRequest) {
        C5021 request = getRequest(parseHttpRequest);
        C4999 c4999 = this.okHttpClient;
        c4999.getClass();
        return getResponse(new C1274(c4999, request).m4546());
    }

    public C5021 getRequest(ParseHttpRequest parseHttpRequest) {
        androidx.leanback.widget.ʿˏ r0 = new androidx.leanback.widget.ʿˏ();
        ParseHttpRequest.Method method = parseHttpRequest.getMethod();
        int i = AnonymousClass1.$SwitchMap$com$parse$http$ParseHttpRequest$Method[method.ordinal()];
        if (i == 1) {
            r0.ˋⁱ("GET", (AbstractC4996) null);
        } else if (i != 2 && i != 3 && i != 4) {
            throw new IllegalStateException("Unsupported http method " + method.toString());
        }
        r0.ﾞˊ(parseHttpRequest.getUrl());
        ArrayList arrayList = new ArrayList(20);
        for (Map.Entry<String, String> entry : parseHttpRequest.getAllHeaders().entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            AbstractC0001.m2(key);
            AbstractC0001.m18(value, key);
            arrayList.add(key);
            arrayList.add(AbstractC3616.m8539(value).toString());
        }
        r0.ˎˑ = new C5014((String[]) arrayList.toArray(new String[0])).m11106();
        ParseHttpBody body = parseHttpRequest.getBody();
        ParseOkHttpRequestBody parseOkHttpRequestBody = body != null ? new ParseOkHttpRequestBody(body) : null;
        int i2 = AnonymousClass1.$SwitchMap$com$parse$http$ParseHttpRequest$Method[method.ordinal()];
        if (i2 == 2) {
            r0.ˋⁱ("DELETE", parseOkHttpRequestBody);
        } else if (i2 == 3) {
            r0.ˋⁱ("POST", parseOkHttpRequestBody);
        } else if (i2 == 4) {
            r0.ˋⁱ("PUT", parseOkHttpRequestBody);
        }
        return r0.ˏᵢ();
    }

    public ParseHttpResponse getResponse(C4994 c4994) {
        int i = c4994.f18886;
        AbstractC5001 abstractC5001 = c4994.f18890;
        InputStream inputStreamMo9494 = abstractC5001.mo5667().mo9494();
        int iMo5668 = (int) abstractC5001.mo5668();
        HashMap map = new HashMap();
        C5014 c5014 = c4994.f18889;
        TreeSet treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
        int size = c5014.size();
        for (int i2 = 0; i2 < size; i2++) {
            treeSet.add(c5014.m11105(i2));
        }
        Iterator it = DesugarCollections.unmodifiableSet(treeSet).iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            String str = (String) it.next();
            String strM11104 = c5014.m11104(str);
            if (strM11104 != null) {
                str = strM11104;
            }
            map.put(str, str);
        }
        return new ParseHttpResponse.Builder().setStatusCode(i).setContent(inputStreamMo9494).setTotalSize(iMo5668).setReasonPhrase(c4994.f18883).setHeaders(map).setContentType(abstractC5001.mo5666() != null ? abstractC5001.mo5666().f18950 : null).build();
    }
}
