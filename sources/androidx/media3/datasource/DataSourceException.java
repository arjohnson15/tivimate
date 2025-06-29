package androidx.media3.datasource;

import java.io.IOException;

/* loaded from: classes.dex */
public class DataSourceException extends IOException {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public static final /* synthetic */ int f1338 = 0;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final int f1339;

    public DataSourceException(int i) {
        this.f1339 = i;
    }

    public DataSourceException(Exception exc, int i) {
        super(exc);
        this.f1339 = i;
    }

    public DataSourceException(String str, int i) {
        super(str);
        this.f1339 = i;
    }

    public DataSourceException(String str, Exception exc, int i) {
        super(str, exc);
        this.f1339 = i;
    }
}
