package p063;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import p096.C1763;
import p417.AbstractC4753;
import p417.C4750;
import p417.C4755;
import p417.ServiceConnectionC4766;
import ᵎﹳ.ᐧʻ;

/* renamed from: ʾᐧ.ﹶˆ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1458 implements Handler.Callback {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final /* synthetic */ Object f5969;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final /* synthetic */ int f5970;

    public /* synthetic */ C1458(int i, Object obj) {
        this.f5970 = i;
        this.f5969 = obj;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    private final boolean m5013(Message message) {
        if (message.what != 0) {
            return false;
        }
        C1763 c1763 = (C1763) this.f5969;
        ᐧʻ.ᵎˏ(message.obj);
        synchronized (c1763.f6822) {
            throw null;
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        switch (this.f5970) {
            case 0:
                int i = message.what;
                C1448 c1448 = (C1448) this.f5969;
                if (i == 1) {
                    c1448.m5004((C1456) message.obj);
                    return true;
                }
                if (i == 2) {
                    c1448.f5939.m1595((C1456) message.obj);
                }
                return false;
            case 1:
                return m5013(message);
            default:
                int i2 = message.what;
                if (i2 == 0) {
                    synchronized (((C4750) this.f5969).f18232) {
                        try {
                            C4755 c4755 = (C4755) message.obj;
                            ServiceConnectionC4766 serviceConnectionC4766 = (ServiceConnectionC4766) ((C4750) this.f5969).f18232.get(c4755);
                            if (serviceConnectionC4766 != null && serviceConnectionC4766.f18290.isEmpty()) {
                                if (serviceConnectionC4766.f18288) {
                                    serviceConnectionC4766.f18292.f18231.removeMessages(1, serviceConnectionC4766.f18287);
                                    C4750 c4750 = serviceConnectionC4766.f18292;
                                    c4750.f18234.m11593(c4750.f18229, serviceConnectionC4766);
                                    serviceConnectionC4766.f18288 = false;
                                    serviceConnectionC4766.f18286 = 2;
                                }
                                ((C4750) this.f5969).f18232.remove(c4755);
                            }
                        } finally {
                        }
                    }
                } else {
                    if (i2 != 1) {
                        return false;
                    }
                    synchronized (((C4750) this.f5969).f18232) {
                        try {
                            C4755 c47552 = (C4755) message.obj;
                            ServiceConnectionC4766 serviceConnectionC47662 = (ServiceConnectionC4766) ((C4750) this.f5969).f18232.get(c47552);
                            if (serviceConnectionC47662 != null && serviceConnectionC47662.f18286 == 3) {
                                "Timeout waiting for ServiceConnection callback ".concat(String.valueOf(c47552));
                                new Exception();
                                ComponentName componentName = serviceConnectionC47662.f18291;
                                if (componentName == null) {
                                    c47552.getClass();
                                    componentName = null;
                                }
                                if (componentName == null) {
                                    String str = c47552.f18243;
                                    AbstractC4753.m10683(str);
                                    componentName = new ComponentName(str, "unknown");
                                }
                                serviceConnectionC47662.onServiceDisconnected(componentName);
                            }
                        } finally {
                        }
                    }
                }
                return true;
        }
    }
}
