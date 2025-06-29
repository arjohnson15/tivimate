package p197;

import java.util.ArrayList;

/* renamed from: ˎˑ.ˑʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2723 {

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static final ThreadLocal f10671 = new ThreadLocal();

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final ArrayList f10672 = new ArrayList();

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public boolean f10673 = false;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final ChoreographerFrameCallbackC2712 f10674 = new ChoreographerFrameCallbackC2712(0, this);

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static C2723 m6926() {
        ThreadLocal threadLocal = f10671;
        if (threadLocal.get() == null) {
            threadLocal.set(new C2723());
        }
        return (C2723) threadLocal.get();
    }
}
