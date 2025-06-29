package p266;

import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import p144.C2230;
import p160.InterfaceC2347;
import ʽᵔ.ʽⁱ;
import ʿﾞ.ﹳﹳ;

/* renamed from: ـˊ.ʽᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3261 {

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public static final ʽⁱ f12717 = new ʽⁱ(14);

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final C2230 f12718;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final ﹳﹳ f12720;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final C3262 f12722;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final UUID f12721 = UUID.randomUUID();

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final CopyOnWriteArrayList f12719 = new CopyOnWriteArrayList();

    public C3261(C3262 c3262, InterfaceC2347 interfaceC2347, C2230 c2230) {
        this.f12722 = c3262;
        this.f12720 = (ﹳﹳ) interfaceC2347;
        this.f12718 = c2230;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void m8019(AutoCloseable autoCloseable) {
        this.f12718.add(autoCloseable);
        for (Runnable runnable : (Runnable[]) this.f12719.toArray(new Runnable[0])) {
            runnable.run();
        }
    }
}
