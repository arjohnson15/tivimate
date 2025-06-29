package p090;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteTransactionListener;
import android.os.CancellationSignal;
import java.lang.reflect.Method;
import p070.AbstractC1547;
import p338.InterfaceC3865;

/* renamed from: ʿﹶ.ʽᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1741 extends AbstractC1547 implements InterfaceC3865 {

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public static final C1741 f6750 = new C1741(0, 0);

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public static final C1741 f6751 = new C1741(0, 1);

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final /* synthetic */ int f6752;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1741(int i, int i2) {
        super(i);
        this.f6752 = i2;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, ٴˑ.ˑʽ] */
    @Override // p338.InterfaceC3865
    /* renamed from: ـﹶ */
    public final Object mo1053() {
        Class<?> returnType;
        switch (this.f6752) {
            case 0:
                try {
                    Method method = (Method) C1749.f6779.getValue();
                    if (method == null || (returnType = method.getReturnType()) == null) {
                        return null;
                    }
                    Class<?> cls = Integer.TYPE;
                    return returnType.getDeclaredMethod("beginTransaction", cls, SQLiteTransactionListener.class, cls, CancellationSignal.class);
                } catch (Throwable unused) {
                    return null;
                }
            default:
                try {
                    Method declaredMethod = SQLiteDatabase.class.getDeclaredMethod("getThreadSession", null);
                    declaredMethod.setAccessible(true);
                    return declaredMethod;
                } catch (Throwable unused2) {
                    return null;
                }
        }
    }
}
