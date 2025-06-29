package p365;

import com.hierynomus.protocol.transport.TransportException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import p296.C3486;
import p296.C3487;
import p331.C3762;
import p344.AbstractC3917;
import p344.InterfaceC3918;
import p433.C5029;
import ـˊ.ʿʼ;

/* renamed from: ᵔﹶ.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractRunnableC4141 implements Runnable {

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public static final InterfaceC3918 f16033 = AbstractC3917.m9105(AbstractRunnableC4141.class);

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public C3486 f16034;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public AtomicBoolean f16035;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public Thread f16036;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public InputStream f16037;

    @Override // java.lang.Runnable
    public final void run() {
        AtomicBoolean atomicBoolean;
        InterfaceC3918 interfaceC3918;
        while (true) {
            boolean zIsInterrupted = Thread.currentThread().isInterrupted();
            atomicBoolean = this.f16035;
            interfaceC3918 = f16033;
            if (zIsInterrupted || atomicBoolean.get()) {
                break;
            }
            try {
                m9491();
            } catch (TransportException e) {
                if (!atomicBoolean.get()) {
                    interfaceC3918.mo5519(e);
                    C3486 c3486 = this.f16034;
                    C3762 c3762 = c3486.f13463;
                    ReentrantReadWriteLock reentrantReadWriteLock = (ReentrantReadWriteLock) c3762.f14530;
                    reentrantReadWriteLock.writeLock().lock();
                    try {
                        HashMap map = (HashMap) c3762.f14531;
                        Iterator it = new HashSet(map.keySet()).iterator();
                        while (it.hasNext()) {
                            C3487 c3487 = (C3487) map.remove((Long) it.next());
                            ((HashMap) c3762.f14532).remove(c3487.f13479);
                            C5029 c5029 = c3487.f13477;
                            ReentrantLock reentrantLock = (ReentrantLock) c5029.f19094;
                            reentrantLock.lock();
                            try {
                                c5029.f19095 = ((ʿʼ) c5029.f19100).ˏᵢ(e);
                                ((Condition) c5029.f19098).signalAll();
                                reentrantLock.unlock();
                            } catch (Throwable th) {
                                reentrantLock.unlock();
                                throw th;
                            }
                        }
                        try {
                            c3486.close();
                            return;
                        } catch (Exception e2) {
                            C3486.f13460.mo5509(e2.getClass().getSimpleName(), e2.getMessage(), "{} while closing connection on error, ignoring: {}");
                            return;
                        }
                    } finally {
                        reentrantReadWriteLock.writeLock().unlock();
                    }
                }
            }
        }
        if (atomicBoolean.get()) {
            interfaceC3918.mo5513(this.f16036, "{} stopped.");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0167, code lost:
    
        r4 = p143.C2226.f8853;
        r4.mo5525(r0, java.util.Arrays.toString(r3), java.util.Arrays.toString(r2));
        r4.mo5526(r0, r0.ᵢʿ(), "Packet {} has header: {}");
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0189, code lost:
    
        r9.mo5512(r0, "Invalid packet signature for packet {}");
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0190, code lost:
    
        if (r5.f8862 != false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x01ab, code lost:
    
        throw new com.hierynomus.protocol.transport.TransportException("Packet signature for packet " + r0 + " was not correct");
     */
    /* renamed from: ـﹶ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m9491() throws com.hierynomus.protocol.transport.TransportException {
        /*
            Method dump skipped, instructions count: 651
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p365.AbstractRunnableC4141.m9491():void");
    }
}
