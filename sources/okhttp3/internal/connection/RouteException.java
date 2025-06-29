package okhttp3.internal.connection;

import java.io.IOException;

/* loaded from: classes2.dex */
public final class RouteException extends RuntimeException {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public IOException f3909;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final IOException f3910;

    public RouteException(IOException iOException) {
        super(iOException);
        this.f3910 = iOException;
        this.f3909 = iOException;
    }
}
