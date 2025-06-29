package p406;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;

/* renamed from: ﹳʿ.ᐧʻ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC4661 {
    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static final boolean m10564(NetworkCapabilities networkCapabilities, int i) {
        return networkCapabilities.hasCapability(i);
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static final void m10565(ConnectivityManager connectivityManager, ConnectivityManager.NetworkCallback networkCallback) {
        connectivityManager.unregisterNetworkCallback(networkCallback);
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final NetworkCapabilities m10566(ConnectivityManager connectivityManager, Network network) {
        return connectivityManager.getNetworkCapabilities(network);
    }
}
