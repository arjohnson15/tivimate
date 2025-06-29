package p429;

import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.UUID;
import p072.AbstractC1642;
import p210.C2804;
import p317.AbstractC3629;

/* renamed from: ﹶˎ.ˎᵔ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class HandlerC4959 extends Handler {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public long f18750;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final ArrayList f18751;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public boolean f18752;

    public HandlerC4959(Looper looper) {
        super(looper);
        this.f18751 = new ArrayList();
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0141  */
    @Override // android.os.Handler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void handleMessage(android.os.Message r12) throws android.os.RemoteException {
        /*
            Method dump skipped, instructions count: 367
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p429.HandlerC4959.handleMessage(android.os.Message):void");
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final void m11071() throws RemoteException {
        C4990 c4990 = (C4990) C2804.m7079().m7082(C4990.class);
        int i = c4990.f18853 + 1;
        c4990.f18853 = i;
        String lowerCase = i == 0 ? c4990.f18851 : AbstractC3629.m8559(((UUID) c4990.f18849.mo1053()).toString(), "-", "", false).toLowerCase(Locale.ROOT);
        int i2 = c4990.f18853;
        c4990.f18852.getClass();
        c4990.f18850 = new C4957(lowerCase, c4990.f18851, i2, 1000 * System.currentTimeMillis());
        StringBuilder sb = new StringBuilder("Generated new session ");
        C4957 c4957 = ((C4990) C2804.m7079().m7082(C4990.class)).f18850;
        if (c4957 == null) {
            c4957 = null;
        }
        sb.append(c4957.f18745);
        sb.toString();
        StringBuilder sb2 = new StringBuilder("Broadcasting new session: ");
        C4957 c49572 = ((C4990) C2804.m7079().m7082(C4990.class)).f18850;
        if (c49572 == null) {
            c49572 = null;
        }
        sb2.append(c49572);
        sb2.toString();
        InterfaceC4981 interfaceC4981 = (InterfaceC4981) C2804.m7079().m7082(InterfaceC4981.class);
        C4957 c49573 = ((C4990) C2804.m7079().m7082(C4990.class)).f18850;
        if (c49573 == null) {
            c49573 = null;
        }
        C4968 c4968 = (C4968) interfaceC4981;
        AbstractC1642.m5294(AbstractC1642.m5296(c4968.f18781), null, 0, new C4986(c4968, c49573, null), 3);
        Iterator it = new ArrayList(this.f18751).iterator();
        while (it.hasNext()) {
            m11073((Messenger) it.next());
        }
        InterfaceC4948 interfaceC4948 = (InterfaceC4948) C2804.m7079().m7082(InterfaceC4948.class);
        C4957 c49574 = ((C4990) C2804.m7079().m7082(C4990.class)).f18850;
        if (c49574 == null) {
            c49574 = null;
        }
        C4949 c4949 = (C4949) interfaceC4948;
        AbstractC1642.m5294(AbstractC1642.m5296(c4949.f18720), null, 0, new C4973(c4949, c49574.f18745, null), 3);
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final void m11072(Messenger messenger, String str) throws RemoteException {
        try {
            Bundle bundle = new Bundle();
            bundle.putString("SessionUpdateExtra", str);
            Message messageObtain = Message.obtain(null, 3, 0, 0);
            messageObtain.setData(bundle);
            messenger.send(messageObtain);
        } catch (DeadObjectException unused) {
            String str2 = "Removing dead client from list: " + messenger;
            this.f18751.remove(messenger);
        } catch (Exception e) {
            String str3 = "Unable to push new session to " + messenger + '.';
        }
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void m11073(Messenger messenger) throws RemoteException {
        if (this.f18752) {
            C4957 c4957 = ((C4990) C2804.m7079().m7082(C4990.class)).f18850;
            m11072(messenger, (c4957 != null ? c4957 : null).f18745);
            return;
        }
        C4975 c4975 = (C4975) ((C4949) ((InterfaceC4948) C2804.m7079().m7082(InterfaceC4948.class))).f18721.get();
        String str = c4975 != null ? c4975.f18806 : null;
        String str2 = "App has not yet foregrounded. Using previously stored session: " + str;
        if (str != null) {
            m11072(messenger, str);
        }
    }
}
