package androidx.media3.datasource;

import java.util.Map;
import ـˈ.ˉᵎ;

/* loaded from: classes.dex */
public final class HttpDataSource$InvalidResponseCodeException extends HttpDataSource$HttpDataSourceException {

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final Map f1341;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final int f1342;

    public HttpDataSource$InvalidResponseCodeException(int i, DataSourceException dataSourceException, Map map) {
        super(2004, dataSourceException, ˉᵎ.ˉⁱ("Response code: ", i));
        this.f1342 = i;
        this.f1341 = map;
    }
}
