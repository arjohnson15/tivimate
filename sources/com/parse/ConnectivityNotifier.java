package com.parse;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.ReceiverCallNotAllowedException;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
class ConnectivityNotifier extends BroadcastReceiver {
    private static final ConnectivityNotifier singleton = new ConnectivityNotifier();
    private final Object lock = new Object();
    private final Set<ConnectivityListener> listeners = new HashSet();
    private boolean hasRegisteredReceiver = false;

    public interface ConnectivityListener {
        void networkConnectivityStatusChanged(Context context, Intent intent);
    }

    public static ConnectivityNotifier getNotifier(Context context) {
        ConnectivityNotifier connectivityNotifier = singleton;
        connectivityNotifier.tryToRegisterForNetworkStatusNotifications(context);
        return connectivityNotifier;
    }

    public static boolean isConnected(Context context) {
        NetworkInfo activeNetworkInfo;
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        return (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null || !activeNetworkInfo.isConnected()) ? false : true;
    }

    private boolean tryToRegisterForNetworkStatusNotifications(Context context) {
        synchronized (this.lock) {
            try {
                if (this.hasRegisteredReceiver) {
                    return true;
                }
                if (context == null) {
                    return false;
                }
                try {
                    context.getApplicationContext().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                    this.hasRegisteredReceiver = true;
                    return true;
                } catch (ReceiverCallNotAllowedException unused) {
                    PLog.v("com.parse.ConnectivityNotifier", "Cannot register a broadcast receiver because the executing thread is currently in a broadcast receiver. Will try again later.");
                    return false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void addListener(ConnectivityListener connectivityListener) {
        synchronized (this.lock) {
            this.listeners.add(connectivityListener);
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        ArrayList arrayList;
        synchronized (this.lock) {
            arrayList = new ArrayList(this.listeners);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((ConnectivityListener) it.next()).networkConnectivityStatusChanged(context, intent);
        }
    }
}
