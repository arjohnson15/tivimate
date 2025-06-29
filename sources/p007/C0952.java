package p007;

import android.util.Base64;
import java.lang.reflect.InvocationTargetException;
import p033.C1223;
import p076.C1653;
import p166.InterfaceC2404;
import p353.InterfaceC4012;
import p438.C5117;

/* renamed from: ʻˉ.ˑʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final /* synthetic */ class C0952 implements InterfaceC4012 {

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final /* synthetic */ int f4220;

    @Override // p353.InterfaceC4012
    public final Object get() throws IllegalAccessException, InstantiationException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
        switch (this.f4220) {
            case 0:
                try {
                    Class<?> cls = Class.forName("androidx.media3.effect.DefaultVideoFrameProcessor$Factory$Builder");
                    Object objInvoke = cls.getMethod("build", null).invoke(cls.getConstructor(null).newInstance(null), null);
                    objInvoke.getClass();
                    return (InterfaceC2404) objInvoke;
                } catch (Exception e) {
                    throw new IllegalStateException(e);
                }
            case 1:
                byte[] bArr = new byte[12];
                C1223.f5025.nextBytes(bArr);
                return Base64.encodeToString(bArr, 10);
            case 2:
                throw new IllegalStateException();
            default:
                return new C5117(new C1653(), 50000, 50000, 2500, 5000);
        }
    }
}
