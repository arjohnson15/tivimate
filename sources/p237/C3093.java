package p237;

import android.util.StateSet;
import com.hierynomus.protocol.transport.TransportException;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.locks.ReentrantLock;
import p013.AbstractC1039;
import p110.C1806;
import p266.C3262;
import p283.C3380;
import p344.AbstractC3917;
import p344.InterfaceC3918;
import p361.C4089;
import p361.C4103;
import p365.AbstractRunnableC4141;
import p430.C4991;
import p430.C5004;
import ʿﾞ.ﹳﹳ;

/* renamed from: ˑـ.ʽᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3093 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public int f11934;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public Serializable f11935;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public Object f11936;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public Object f11937;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final /* synthetic */ int f11938;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public Object f11939;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public Object f11940;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public Object f11941;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public Object f11942;

    public C3093() {
        this.f11938 = 3;
        this.f11941 = "";
        this.f11935 = "";
        this.f11934 = -1;
        ArrayList arrayList = new ArrayList();
        this.f11940 = arrayList;
        arrayList.add("");
    }

    public /* synthetic */ C3093(int i) {
        this.f11938 = i;
    }

    public C3093(C1806 c1806, int i, C3262 c3262) {
        this.f11938 = 0;
        this.f11937 = AbstractC3917.m9105(C3093.class);
        this.f11935 = new ReentrantLock();
        new C1806();
        this.f11934 = i;
        this.f11939 = c1806;
        this.f11941 = c3262;
    }

    public C3093(C4089 c4089) {
        this.f11938 = 2;
        m7604();
        m7603(StateSet.WILD_CARD, c4089);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 408
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p237.C3093.toString():java.lang.String");
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public C4103 m7598() {
        if (this.f11934 == 0) {
            return null;
        }
        return new C4103(this);
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public int m7599() {
        int i = this.f11934;
        if (i != -1) {
            return i;
        }
        String str = (String) this.f11937;
        if (str.equals("http")) {
            return 80;
        }
        return str.equals("https") ? 443 : -1;
    }

    /* renamed from: ˉי, reason: contains not printable characters */
    public void m7600(int i) throws IOException {
        ((BufferedOutputStream) this.f11936).write(0);
        ((BufferedOutputStream) this.f11936).write((byte) (i >> 16));
        ((BufferedOutputStream) this.f11936).write((byte) (i >> 8));
        ((BufferedOutputStream) this.f11936).write((byte) (i & 255));
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x015d  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 3 */
    /* renamed from: ˏᵢ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m7601(p430.C5004 r33, java.lang.String r34) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 1114
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p237.C3093.m7601(ﹶˏ.ˏᴵ, java.lang.String):void");
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public C5004 m7602() {
        ArrayList arrayList;
        String str = (String) this.f11937;
        if (str == null) {
            throw new IllegalStateException("scheme == null");
        }
        String strM11078 = C4991.m11078((String) this.f11941, 0, 0, false, 7);
        String strM110782 = C4991.m11078((String) this.f11935, 0, 0, false, 7);
        String str2 = (String) this.f11939;
        if (str2 == null) {
            throw new IllegalStateException("host == null");
        }
        int iM7599 = m7599();
        ArrayList arrayList2 = (ArrayList) this.f11940;
        ArrayList arrayList3 = new ArrayList(AbstractC1039.m4012(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(C4991.m11078((String) it.next(), 0, 0, false, 7));
        }
        ArrayList<String> arrayList4 = (ArrayList) this.f11936;
        if (arrayList4 != null) {
            arrayList = new ArrayList(AbstractC1039.m4012(arrayList4, 10));
            for (String str3 : arrayList4) {
                arrayList.add(str3 != null ? C4991.m11078(str3, 0, 0, true, 3) : null);
            }
        } else {
            arrayList = null;
        }
        String str4 = (String) this.f11942;
        return new C5004(str, strM11078, strM110782, str2, iM7599, arrayList3, arrayList, str4 != null ? C4991.m11078(str4, 0, 0, false, 7) : null, toString());
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [java.io.Serializable, java.lang.Object, ᵔᵔ.ˋⁱ[]] */
    /* renamed from: ـﹶ, reason: contains not printable characters */
    public void m7603(int[] iArr, C4089 c4089) {
        int i = this.f11934;
        if (i == 0 || iArr.length == 0) {
            this.f11937 = c4089;
        }
        int[][] iArr2 = (int[][]) this.f11941;
        if (i >= iArr2.length) {
            int i2 = i + 10;
            int[][] iArr3 = new int[i2][];
            System.arraycopy(iArr2, 0, iArr3, 0, i);
            this.f11941 = iArr3;
            ?? r1 = new C4089[i2];
            System.arraycopy((C4089[]) this.f11935, 0, r1, 0, i);
            this.f11935 = r1;
        }
        int[][] iArr4 = (int[][]) this.f11941;
        int i3 = this.f11934;
        iArr4[i3] = iArr;
        ((C4089[]) this.f11935)[i3] = c4089;
        this.f11934 = i3 + 1;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.io.Serializable, ᵔᵔ.ˋⁱ[]] */
    /* renamed from: ٴˎ, reason: contains not printable characters */
    public void m7604() {
        this.f11937 = new C4089();
        this.f11941 = new int[10][];
        this.f11935 = new C4089[10];
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public boolean m7605() {
        Socket socket = (Socket) this.f11940;
        return (socket == null || !socket.isConnected() || ((Socket) this.f11940).isClosed()) ? false : true;
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public void m7606() {
        ReentrantLock reentrantLock = (ReentrantLock) this.f11935;
        reentrantLock.lock();
        try {
            if (!m7605()) {
                reentrantLock.unlock();
                return;
            }
            C3094 c3094 = (C3094) this.f11942;
            c3094.getClass();
            AbstractRunnableC4141.f16033.mo5528("Stopping PacketReader...");
            c3094.f16035.set(true);
            c3094.f16036.interrupt();
            if (((Socket) this.f11940).getInputStream() != null) {
                ((Socket) this.f11940).getInputStream().close();
            }
            BufferedOutputStream bufferedOutputStream = (BufferedOutputStream) this.f11936;
            if (bufferedOutputStream != null) {
                bufferedOutputStream.close();
                this.f11936 = null;
            }
            Socket socket = (Socket) this.f11940;
            if (socket != null) {
                socket.close();
                this.f11940 = null;
            }
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public void m7607(ﹳﹳ r7) {
        InterfaceC3918 interfaceC3918 = (InterfaceC3918) this.f11937;
        interfaceC3918.mo5516(r7, "Acquiring write lock to send packet << {} >>");
        ReentrantLock reentrantLock = (ReentrantLock) this.f11935;
        reentrantLock.lock();
        try {
            if (!m7605()) {
                throw new TransportException(String.format("Cannot write %s as transport is disconnected", r7));
            }
            try {
                interfaceC3918.mo5517(r7, "Writing packet {}");
                Object obj = ((C3262) this.f11941).f12726;
                C3380 c3380 = new C3380();
                r7.m8174(c3380);
                m7600(c3380.m8845());
                ((BufferedOutputStream) this.f11936).write(c3380.f14615, c3380.f14614, c3380.m8845());
                ((BufferedOutputStream) this.f11936).flush();
                interfaceC3918.mo5516(r7, "Packet {} sent, lock released.");
            } catch (IOException e) {
                throw new TransportException(e);
            }
        } finally {
            reentrantLock.unlock();
        }
    }
}
