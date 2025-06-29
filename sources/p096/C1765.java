package p096;

import android.os.Handler;
import android.os.Message;
import p261.InterfaceC3251;
import ᵎﹳ.ᐧʻ;

/* renamed from: ˆˆ.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1765 implements Handler.Callback {

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final /* synthetic */ int f6832;

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        switch (this.f6832) {
            case 0:
                int i = message.what;
                if (i == 0) {
                    ᐧʻ.ᵎˏ(message.obj);
                    throw null;
                }
                if (i != 1) {
                    return false;
                }
                ᐧʻ.ᵎˏ(message.obj);
                throw null;
            default:
                if (message.what != 1) {
                    return false;
                }
                ((InterfaceC3251) message.obj).mo4602();
                return true;
        }
    }
}
