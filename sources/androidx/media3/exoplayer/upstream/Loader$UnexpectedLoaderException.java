package androidx.media3.exoplayer.upstream;

import java.io.IOException;

/* loaded from: classes.dex */
public final class Loader$UnexpectedLoaderException extends IOException {
    public Loader$UnexpectedLoaderException(Throwable th) {
        String str;
        StringBuilder sb = new StringBuilder("Unexpected ");
        sb.append(th.getClass().getSimpleName());
        if (th.getMessage() != null) {
            str = ": " + th.getMessage();
        } else {
            str = "";
        }
        sb.append(str);
        super(sb.toString(), th);
    }
}
