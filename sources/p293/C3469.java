package p293;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.Looper;
import android.os.Message;
import android.util.SparseIntArray;
import androidx.leanback.widget.RunnableC0134;
import androidx.leanback.widget.RunnableC0183;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.UnsupportedApiCallException;
import com.google.android.gms.internal.measurement.HandlerC0413;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import p007.C0937;
import p200.C2741;
import p200.C2752;
import p251.C3136;
import p266.C3262;
import p305.C3524;
import p305.C3525;
import p305.C3542;
import p319.C3635;
import p319.C3636;
import p319.C3638;
import p331.C3758;
import p331.C3759;
import p331.C3762;
import p349.InterfaceC3999;
import p349.InterfaceC4000;
import p349.InterfaceC4001;
import p417.AbstractC4753;
import p417.C4754;
import ˏᵢ.ᵢٴ;

/* renamed from: ٴᵎ.ˏʾ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3469 implements InterfaceC3999, InterfaceC4001 {

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final InterfaceC4000 f13418;

    /* renamed from: ˉי, reason: contains not printable characters */
    public final int f13419;

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public boolean f13422;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final C3463 f13424;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final C3759 f13425;

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public final /* synthetic */ C3464 f13426;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final LinkedList f13427 = new LinkedList();

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final HashSet f13423 = new HashSet();

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final HashMap f13428 = new HashMap();

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public final ArrayList f13420 = new ArrayList();

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public C3524 f13421 = null;

    public C3469(C3464 c3464, C3636 c3636) {
        this.f13426 = c3464;
        Looper looper = c3464.f13406.getLooper();
        c3636.getClass();
        C3262 c3262 = new C3262();
        Set setEmptySet = Collections.emptySet();
        if (((C2752) c3262.f12726) == null) {
            c3262.f12726 = new C2752(0);
        }
        ((C2752) c3262.f12726).addAll(setEmptySet);
        Context context = c3636.f13888;
        c3262.f12725 = context.getClass().getName();
        c3262.f12724 = context.getPackageName();
        C3762 c3762 = new C3762((C2752) c3262.f12726, (String) c3262.f12724, (String) c3262.f12725);
        C3635 c3635 = (C3635) c3636.f13887.f2912;
        AbstractC4753.m10683(c3635);
        C4754 c4754 = c3636.f13891;
        Context context2 = c3636.f13888;
        c3635.getClass();
        C3638 c3638 = new C3638(context2, looper, c3762, c4754, this, this);
        String str = c3636.f13884;
        if (str != null) {
            c3638.f18219 = str;
        }
        this.f13418 = c3638;
        this.f13424 = c3636.f13885;
        this.f13425 = new C3759((byte) 0, 12);
        this.f13419 = c3636.f13889;
    }

    @Override // p349.InterfaceC3999
    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final void mo8314(int i) {
        Looper looperMyLooper = Looper.myLooper();
        C3464 c3464 = this.f13426;
        if (looperMyLooper == c3464.f13406.getLooper()) {
            m8329(i);
        } else {
            c3464.f13406.post(new RunnableC0134(i, 4, this));
        }
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final void m8315(Status status, RuntimeException runtimeException, boolean z) {
        AbstractC4753.m10679(this.f13426.f13406);
        if ((status == null) == (runtimeException == null)) {
            throw new IllegalArgumentException("Status XOR exception should be null");
        }
        Iterator it = this.f13427.iterator();
        while (it.hasNext()) {
            AbstractC3470 abstractC3470 = (AbstractC3470) it.next();
            if (!z || abstractC3470.f13429 == 2) {
                if (status != null) {
                    abstractC3470.mo8333(status);
                } else {
                    abstractC3470.mo8336(runtimeException);
                }
                it.remove();
            }
        }
    }

    /* renamed from: ˉי, reason: contains not printable characters */
    public final void m8316() {
        C3464 c3464 = this.f13426;
        HandlerC0413 handlerC0413 = c3464.f13406;
        C3463 c3463 = this.f13424;
        handlerC0413.removeMessages(12, c3463);
        HandlerC0413 handlerC04132 = c3464.f13406;
        handlerC04132.sendMessageDelayed(handlerC04132.obtainMessage(12, c3463), c3464.f13409);
    }

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public final boolean m8317(C3524 c3524) {
        synchronized (C3464.f13398) {
            this.f13426.getClass();
        }
        return false;
    }

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public final void m8318() {
        C3464 c3464 = this.f13426;
        AbstractC4753.m10679(c3464.f13406);
        InterfaceC4000 interfaceC4000 = this.f13418;
        if (interfaceC4000.m9263() || interfaceC4000.m9264()) {
            return;
        }
        try {
            C3758 c3758 = c3464.f13412;
            Context context = c3464.f13402;
            c3758.getClass();
            AbstractC4753.m10683(context);
            int iMo8569 = interfaceC4000.mo8569();
            SparseIntArray sparseIntArray = (SparseIntArray) c3758.f14519;
            int iM8426 = sparseIntArray.get(iMo8569, -1);
            if (iM8426 == -1) {
                iM8426 = 0;
                int i = 0;
                while (true) {
                    if (i >= sparseIntArray.size()) {
                        iM8426 = -1;
                        break;
                    }
                    int iKeyAt = sparseIntArray.keyAt(i);
                    if (iKeyAt > iMo8569 && sparseIntArray.get(iKeyAt) == 0) {
                        break;
                    } else {
                        i++;
                    }
                }
                if (iM8426 == -1) {
                    iM8426 = ((C3525) c3758.f14520).m8426(context, iMo8569);
                }
                sparseIntArray.put(iMo8569, iM8426);
            }
            if (iM8426 == 0) {
                C0937 c0937 = new C0937(c3464, interfaceC4000, this.f13424);
                if (interfaceC4000.m9260()) {
                    AbstractC4753.m10683(null);
                    throw null;
                }
                try {
                    interfaceC4000.m9258(c0937);
                    return;
                } catch (SecurityException e) {
                    m8320(new C3524(10), e);
                    return;
                }
            }
            C3524 c3524 = new C3524(iM8426, null);
            String str = "The service for " + interfaceC4000.getClass().getName() + " is not available: " + c3524.toString();
            m8320(c3524, null);
        } catch (IllegalStateException e2) {
            m8320(new C3524(10), e2);
        }
    }

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public final boolean m8319(AbstractC3470 abstractC3470) {
        C3542 c3542;
        if (!(abstractC3470 instanceof AbstractC3470)) {
            InterfaceC4000 interfaceC4000 = this.f13418;
            abstractC3470.mo8335(this.f13425, interfaceC4000.m9260());
            try {
                abstractC3470.mo8332(this);
            } catch (DeadObjectException unused) {
                mo8314(1);
                interfaceC4000.m9265("DeadObjectException thrown while running ApiCallRunner.");
            }
            return true;
        }
        C3542[] c3542ArrMo8331 = abstractC3470.mo8331(this);
        if (c3542ArrMo8331 == null || c3542ArrMo8331.length == 0) {
            c3542 = null;
        } else {
            C3542[] c3542ArrM9262 = this.f13418.m9262();
            if (c3542ArrM9262 == null) {
                c3542ArrM9262 = new C3542[0];
            }
            C2741 c2741 = new C2741(c3542ArrM9262.length);
            for (C3542 c35422 : c3542ArrM9262) {
                c2741.put(c35422.f13694, Long.valueOf(c35422.m8430()));
            }
            int length = c3542ArrMo8331.length;
            for (int i = 0; i < length; i++) {
                c3542 = c3542ArrMo8331[i];
                Long l = (Long) c2741.get(c3542.f13694);
                if (l == null || l.longValue() < c3542.m8430()) {
                    break;
                }
            }
            c3542 = null;
        }
        if (c3542 == null) {
            InterfaceC4000 interfaceC40002 = this.f13418;
            abstractC3470.mo8335(this.f13425, interfaceC40002.m9260());
            try {
                abstractC3470.mo8332(this);
            } catch (DeadObjectException unused2) {
                mo8314(1);
                interfaceC40002.m9265("DeadObjectException thrown while running ApiCallRunner.");
            }
            return true;
        }
        String str = this.f13418.getClass().getName() + " could not execute call because it requires feature (" + c3542.f13694 + ", " + c3542.m8430() + ").";
        if (!this.f13426.f13405 || !abstractC3470.mo8334(this)) {
            abstractC3470.mo8336(new UnsupportedApiCallException(c3542));
            return true;
        }
        C3466 c3466 = new C3466(this.f13424, c3542);
        int iIndexOf = this.f13420.indexOf(c3466);
        if (iIndexOf >= 0) {
            C3466 c34662 = (C3466) this.f13420.get(iIndexOf);
            this.f13426.f13406.removeMessages(15, c34662);
            HandlerC0413 handlerC0413 = this.f13426.f13406;
            handlerC0413.sendMessageDelayed(Message.obtain(handlerC0413, 15, c34662), 5000L);
        } else {
            this.f13420.add(c3466);
            HandlerC0413 handlerC04132 = this.f13426.f13406;
            handlerC04132.sendMessageDelayed(Message.obtain(handlerC04132, 15, c3466), 5000L);
            HandlerC0413 handlerC04133 = this.f13426.f13406;
            handlerC04133.sendMessageDelayed(Message.obtain(handlerC04133, 16, c3466), 120000L);
            C3524 c3524 = new C3524(2, null);
            if (!m8317(c3524)) {
                this.f13426.m8311(c3524, this.f13419);
            }
        }
        return false;
    }

    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public final void m8320(C3524 c3524, RuntimeException runtimeException) {
        AbstractC4753.m10679(this.f13426.f13406);
        AbstractC4753.m10679(this.f13426.f13406);
        this.f13421 = null;
        ((SparseIntArray) this.f13426.f13412.f14519).clear();
        m8324(c3524);
        if ((this.f13418 instanceof C3638) && c3524.f13645 != 24) {
            C3464 c3464 = this.f13426;
            c3464.f13401 = true;
            HandlerC0413 handlerC0413 = c3464.f13406;
            handlerC0413.sendMessageDelayed(handlerC0413.obtainMessage(19), 300000L);
        }
        if (c3524.f13645 == 4) {
            m8328(C3464.f13397);
            return;
        }
        if (this.f13427.isEmpty()) {
            this.f13421 = c3524;
            return;
        }
        if (runtimeException != null) {
            AbstractC4753.m10679(this.f13426.f13406);
            m8315(null, runtimeException, false);
            return;
        }
        if (!this.f13426.f13405) {
            m8328(C3464.m8308(this.f13424, c3524));
            return;
        }
        m8315(C3464.m8308(this.f13424, c3524), null, true);
        if (this.f13427.isEmpty() || m8317(c3524) || this.f13426.m8311(c3524, this.f13419)) {
            return;
        }
        if (c3524.f13645 == 18) {
            this.f13422 = true;
        }
        if (!this.f13422) {
            m8328(C3464.m8308(this.f13424, c3524));
            return;
        }
        C3464 c34642 = this.f13426;
        C3463 c3463 = this.f13424;
        HandlerC0413 handlerC04132 = c34642.f13406;
        handlerC04132.sendMessageDelayed(Message.obtain(handlerC04132, 9, c3463), 5000L);
    }

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final void m8321() {
        C3464 c3464 = this.f13426;
        AbstractC4753.m10679(c3464.f13406);
        this.f13421 = null;
        m8324(C3524.f13644);
        if (this.f13422) {
            HandlerC0413 handlerC0413 = c3464.f13406;
            C3463 c3463 = this.f13424;
            handlerC0413.removeMessages(11, c3463);
            c3464.f13406.removeMessages(9, c3463);
            this.f13422 = false;
        }
        Iterator it = this.f13428.values().iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
        m8326();
        m8316();
    }

    @Override // p349.InterfaceC3999
    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final void mo8322() {
        Looper looperMyLooper = Looper.myLooper();
        C3464 c3464 = this.f13426;
        if (looperMyLooper == c3464.f13406.getLooper()) {
            m8321();
        } else {
            c3464.f13406.post(new RunnableC0183(25, this));
        }
    }

    /* renamed from: ˑי, reason: contains not printable characters */
    public final void m8323() {
        AbstractC4753.m10679(this.f13426.f13406);
        Status status = C3464.f13399;
        m8328(status);
        this.f13425.m8755(false, status);
        for (AbstractC3471 abstractC3471 : (AbstractC3471[]) this.f13428.keySet().toArray(new AbstractC3471[0])) {
            m8327(new C3480(new C3136()));
        }
        m8324(new C3524(4));
        InterfaceC4000 interfaceC4000 = this.f13418;
        if (interfaceC4000.m9263()) {
            interfaceC4000.m9257(new ᵢٴ(8, this));
        }
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void m8324(C3524 c3524) {
        HashSet hashSet = this.f13423;
        Iterator it = hashSet.iterator();
        if (!it.hasNext()) {
            hashSet.clear();
        } else {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (AbstractC4753.m10682(c3524, C3524.f13644)) {
                this.f13418.m9266();
            }
            throw null;
        }
    }

    @Override // p349.InterfaceC4001
    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final void mo8325(C3524 c3524) {
        m8320(c3524, null);
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final void m8326() {
        LinkedList linkedList = this.f13427;
        ArrayList arrayList = new ArrayList(linkedList);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            AbstractC3470 abstractC3470 = (AbstractC3470) arrayList.get(i);
            if (!this.f13418.m9263()) {
                return;
            }
            if (m8319(abstractC3470)) {
                linkedList.remove(abstractC3470);
            }
        }
    }

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public final void m8327(AbstractC3470 abstractC3470) {
        AbstractC4753.m10679(this.f13426.f13406);
        boolean zM9263 = this.f13418.m9263();
        LinkedList linkedList = this.f13427;
        if (zM9263) {
            if (m8319(abstractC3470)) {
                m8316();
                return;
            } else {
                linkedList.add(abstractC3470);
                return;
            }
        }
        linkedList.add(abstractC3470);
        C3524 c3524 = this.f13421;
        if (c3524 == null || c3524.f13645 == 0 || c3524.f13646 == null) {
            m8318();
        } else {
            m8320(c3524, null);
        }
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final void m8328(Status status) {
        AbstractC4753.m10679(this.f13426.f13406);
        m8315(status, null, false);
    }

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final void m8329(int i) {
        C3464 c3464 = this.f13426;
        AbstractC4753.m10679(c3464.f13406);
        this.f13421 = null;
        this.f13422 = true;
        String strM9261 = this.f13418.m9261();
        C3759 c3759 = this.f13425;
        c3759.getClass();
        StringBuilder sb = new StringBuilder("The connection to Google Play services was lost");
        if (i == 1) {
            sb.append(" due to service disconnection.");
        } else if (i == 3) {
            sb.append(" due to dead object exception.");
        }
        if (strM9261 != null) {
            sb.append(" Last reason for disconnect: ");
            sb.append(strM9261);
        }
        c3759.m8755(true, new Status(20, sb.toString(), null, null));
        HandlerC0413 handlerC0413 = c3464.f13406;
        C3463 c3463 = this.f13424;
        handlerC0413.sendMessageDelayed(Message.obtain(handlerC0413, 9, c3463), 5000L);
        HandlerC0413 handlerC04132 = c3464.f13406;
        handlerC04132.sendMessageDelayed(Message.obtain(handlerC04132, 11, c3463), 120000L);
        ((SparseIntArray) c3464.f13412.f14519).clear();
        Iterator it = this.f13428.values().iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
    }
}
