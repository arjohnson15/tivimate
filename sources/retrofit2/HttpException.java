package retrofit2;

import p396.C4586;
import p430.C4994;

/* loaded from: classes.dex */
public class HttpException extends RuntimeException {
    public HttpException(C4586 c4586) {
        StringBuilder sb = new StringBuilder("HTTP ");
        C4994 c4994 = c4586.f17538;
        sb.append(c4994.f18886);
        sb.append(" ");
        sb.append(c4994.f18883);
        super(sb.toString());
    }
}
