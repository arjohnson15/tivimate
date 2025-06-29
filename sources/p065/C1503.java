package p065;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import p013.AbstractC1035;
import p013.C1038;
import p072.InterfaceC1594;
import p185.AbstractC2567;
import p288.C3397;
import p330.InterfaceC3746;
import p338.InterfaceC3864;
import ˈⁱ.ˉⁱ;

/* renamed from: ʾᵔ.ˑי, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1503 extends AbstractC2567 implements InterfaceC3864 {

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final /* synthetic */ C1526 f6104;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final /* synthetic */ String[] f6105;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1503(C1526 c1526, String[] strArr, InterfaceC3746 interfaceC3746) {
        super(2, interfaceC3746);
        this.f6104 = c1526;
        this.f6105 = strArr;
    }

    @Override // p338.InterfaceC3864
    /* renamed from: ʿʼ */
    public final Object mo1054(Object obj, Object obj2) {
        C1503 c1503 = (C1503) mo1056((InterfaceC1594) obj, (InterfaceC3746) obj2);
        C3397 c3397 = C3397.f13249;
        c1503.mo1055(c3397);
        return c3397;
    }

    @Override // p185.AbstractC2563
    /* renamed from: ˑי */
    public final Object mo1055(Object obj) {
        Set setSingleton;
        ˉⁱ.ˆʿ(obj);
        C1500 c1500 = this.f6104.f6199;
        String[] strArr = this.f6105;
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        c1500.getClass();
        Object[] objArrCopyOf = Arrays.copyOf(strArr2, strArr2.length);
        int length = objArrCopyOf.length;
        if (length != 0) {
            if (length != 1) {
                setSingleton = new LinkedHashSet(AbstractC1035.m3985(objArrCopyOf.length));
                for (Object obj2 : objArrCopyOf) {
                    setSingleton.add(obj2);
                }
            } else {
                setSingleton = Collections.singleton(objArrCopyOf[0]);
            }
        } else {
            setSingleton = C1038.f4437;
        }
        C1512 c1512 = (C1512) c1500.f6096;
        ReentrantLock reentrantLock = c1512.f6160;
        reentrantLock.lock();
        try {
            for (C1531 c1531 : c1512.f6159.values()) {
                if (!(c1531.f6224 instanceof C1497)) {
                    c1531.m5112(setSingleton);
                }
            }
            reentrantLock.unlock();
            return C3397.f13249;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // p185.AbstractC2563
    /* renamed from: ᴵʿ */
    public final InterfaceC3746 mo1056(Object obj, InterfaceC3746 interfaceC3746) {
        return new C1503(this.f6104, this.f6105, interfaceC3746);
    }
}
