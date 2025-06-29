package com.google.firebase.sessions;

import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import p429.HandlerC4959;

/* loaded from: classes.dex */
public final class SessionLifecycleService extends Service {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public HandlerC4959 f3658;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public Messenger f3659;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final HandlerThread f3660 = new HandlerThread("FirebaseSessions_HandlerThread");

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        if (intent == null) {
            return null;
        }
        String str = "Service bound to new client on process " + intent.getAction();
        Messenger messenger = Build.VERSION.SDK_INT >= 33 ? (Messenger) intent.getParcelableExtra("ClientCallbackMessenger", Messenger.class) : (Messenger) intent.getParcelableExtra("ClientCallbackMessenger");
        if (messenger != null) {
            Message messageObtain = Message.obtain(null, 4, 0, 0);
            messageObtain.replyTo = messenger;
            HandlerC4959 handlerC4959 = this.f3658;
            if (handlerC4959 != null) {
                handlerC4959.sendMessage(messageObtain);
            }
        }
        Messenger messenger2 = this.f3659;
        if (messenger2 != null) {
            return messenger2.getBinder();
        }
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        HandlerThread handlerThread = this.f3660;
        handlerThread.start();
        this.f3658 = new HandlerC4959(handlerThread.getLooper());
        this.f3659 = new Messenger(this.f3658);
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.f3660.quit();
    }
}
