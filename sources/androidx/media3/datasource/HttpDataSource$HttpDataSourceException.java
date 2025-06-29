package androidx.media3.datasource;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import p395.AbstractC4535;

/* loaded from: classes.dex */
public class HttpDataSource$HttpDataSourceException extends DataSourceException {

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final int f1340;

    public HttpDataSource$HttpDataSourceException(int i) {
        super(m1099(i, 1));
        this.f1340 = 1;
    }

    public HttpDataSource$HttpDataSourceException(int i, int i2, IOException iOException) {
        super(iOException, m1099(i, i2));
        this.f1340 = i2;
    }

    public HttpDataSource$HttpDataSourceException(int i, IOException iOException, String str) {
        super(str, iOException, m1099(i, 1));
        this.f1340 = 1;
    }

    public HttpDataSource$HttpDataSourceException(String str, int i) {
        super(str, m1099(i, 1));
        this.f1340 = 1;
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static HttpDataSource$HttpDataSourceException m1098(int i, IOException iOException) {
        String message = iOException.getMessage();
        int i2 = iOException instanceof SocketTimeoutException ? 2002 : iOException instanceof InterruptedIOException ? 1004 : (message == null || !AbstractC4535.m10327(message).matches("cleartext.*not permitted.*")) ? 2001 : 2007;
        return i2 == 2007 ? new HttpDataSource$CleartextNotPermittedException(2007, iOException, "Cleartext HTTP traffic not permitted. See https://developer.android.com/guide/topics/media/issues/cleartext-not-permitted") : new HttpDataSource$HttpDataSourceException(i2, i, iOException);
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static int m1099(int i, int i2) {
        if (i == 2000 && i2 == 1) {
            return 2001;
        }
        return i;
    }
}
