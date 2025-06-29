package p383;

import android.os.Handler;
import android.os.Message;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import p166.C2414;
import p166.C2428;
import ᴵˎ.ˎˋ;

/* renamed from: ᵢᵢ.ٴˎ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final /* synthetic */ class C4465 implements Handler.Callback {

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final /* synthetic */ ˎˋ f17182;

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        ˎˋ r7 = this.f17182;
        Iterator it = ((CopyOnWriteArraySet) r7.ٴˎ).iterator();
        while (it.hasNext()) {
            C4455 c4455 = (C4455) it.next();
            if (!c4455.f17159 && c4455.f17157) {
                C2414 c2414M6531 = c4455.f17156.m6531();
                c4455.f17156 = new C2428(0);
                c4455.f17157 = false;
                ((InterfaceC4472) r7.ʿʼ).mo4103(c4455.f17158, c2414M6531);
            }
            if (((C4469) r7.ﹳﹳ).f17191.hasMessages(1)) {
                break;
            }
        }
        return true;
    }
}
