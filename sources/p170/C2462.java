package p170;

import java.util.LinkedHashMap;
import java.util.concurrent.locks.ReentrantLock;
import p456.C5349;
import ﹳᴵ.ˉי;

/* renamed from: ˋˆ.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2462 {

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static final ˉי f9795 = new ˉי(22);

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static final LinkedHashMap f9796 = new LinkedHashMap();

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final C5349 f9797;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final ReentrantLock f9798;

    public C2462(String str, boolean z) {
        ReentrantLock reentrantLock;
        synchronized (f9795) {
            try {
                LinkedHashMap linkedHashMap = f9796;
                Object reentrantLock2 = linkedHashMap.get(str);
                if (reentrantLock2 == null) {
                    reentrantLock2 = new ReentrantLock();
                    linkedHashMap.put(str, reentrantLock2);
                }
                reentrantLock = (ReentrantLock) reentrantLock2;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f9798 = reentrantLock;
        this.f9797 = z ? new C5349(str) : null;
    }
}
