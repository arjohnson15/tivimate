package ar.tvplayer.tv;

import android.util.Base64;

/* loaded from: classes.dex */
public class MessageGuardException extends RuntimeException {
    static String fingerprint;
    private final String guard;
    protected final String id;

    public MessageGuardException(Throwable th) {
        this(th, null);
    }

    public MessageGuardException(Throwable th, String str) {
        super(th.getLocalizedMessage(), th);
        String message = th.getMessage();
        message = message == null ? "NO_MSG" : message;
        StringBuilder sb = new StringBuilder();
        sb.append(message);
        sb.append(" ");
        sb.append(fingerprint);
        if (str != null) {
            sb.append(" ");
            sb.append(str);
        }
        this.guard = sb.toString();
        this.id = str;
    }

    @Override // java.lang.Throwable
    public String toString() {
        String str = getClass().getName() + "_" + Base64.encodeToString(this.guard.getBytes("UTF-8"), 11).replace('-', '$');
        String localizedMessage = getLocalizedMessage();
        if (localizedMessage == null) {
            return str;
        }
        return str + ": " + localizedMessage;
    }
}
