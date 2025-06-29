package p089;

import java.io.IOException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.util.Collections;
import java.util.List;

/* renamed from: ʿⁱ.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1740 extends ProxySelector {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final C1740 f6749 = new C1740();

    @Override // java.net.ProxySelector
    public final void connectFailed(URI uri, SocketAddress socketAddress, IOException iOException) {
    }

    @Override // java.net.ProxySelector
    public final List select(URI uri) {
        if (uri != null) {
            return Collections.singletonList(Proxy.NO_PROXY);
        }
        throw new IllegalArgumentException("uri must not be null");
    }
}
