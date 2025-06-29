package p396;

import java.lang.reflect.Method;
import java.util.Collections;
import java.util.List;
import p052.ExecutorC1321;
import p126.C2022;
import p288.C3397;
import p366.C4143;
import p430.AbstractC4996;
import p430.AbstractC5001;

/* renamed from: ⁱᴵ.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C4574 implements InterfaceC4560 {

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final /* synthetic */ int f17518;

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public static final C4574 f17512 = new C4574(0);

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public static final C4574 f17514 = new C4574(1);

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public static final C4574 f17515 = new C4574(2);

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public static final C4574 f17513 = new C4574(3);

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public static final C4574 f17516 = new C4574(4);

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public static final C4574 f17517 = new C4574(5);

    public /* synthetic */ C4574(int i) {
        this.f17518 = i;
    }

    /* renamed from: ʽᐧ */
    public List mo10436() {
        return Collections.emptyList();
    }

    /* JADX WARN: Finally extract failed */
    @Override // p396.InterfaceC4560
    /* renamed from: ʿʼ */
    public Object mo8506(Object obj) {
        switch (this.f17518) {
            case 0:
                return obj.toString();
            case 1:
                AbstractC5001 abstractC5001 = (AbstractC5001) obj;
                try {
                    C4143 c4143 = new C4143();
                    abstractC5001.mo5667().mo9529(c4143);
                    C2022 c2022 = new C2022(abstractC5001.mo5666(), abstractC5001.mo5668(), c4143, 1);
                    abstractC5001.close();
                    return c2022;
                } catch (Throwable th) {
                    abstractC5001.close();
                    throw th;
                }
            case 2:
                return (AbstractC4996) obj;
            case 3:
                return (AbstractC5001) obj;
            case 4:
                ((AbstractC5001) obj).close();
                return C3397.f13249;
            default:
                ((AbstractC5001) obj).close();
                return null;
        }
    }

    /* renamed from: ˑʽ */
    public String mo10418(Method method, int i) {
        return "parameter #" + (i + 1);
    }

    /* renamed from: ـﹶ */
    public List mo10437(ExecutorC1321 executorC1321) {
        return Collections.singletonList(new C4566(executorC1321));
    }

    /* renamed from: ٴˎ */
    public boolean mo10419(Method method) {
        return false;
    }

    /* renamed from: ﹳﹳ */
    public Object mo10420(Method method, Class cls, Object obj, Object[] objArr) {
        throw new AssertionError();
    }
}
