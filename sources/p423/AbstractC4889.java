package p423;

import p034.C1228;
import p072.InterfaceC1589;
import p148.AbstractC2269;
import p338.InterfaceC3870;

/* renamed from: ﹶʻ.ﹶˆ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC4889 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final C4880 f18432 = new C4880(-1, null, null, 0);

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static final int f18421 = AbstractC2269.m6279("kotlinx.coroutines.bufferedChannel.segmentSize", 32, 0, 0, 12);

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static final int f18430 = AbstractC2269.m6279("kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations", 10000, 0, 0, 12);

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static final C1228 f18438 = new C1228("BUFFERED", 1);

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public static final C1228 f18422 = new C1228("SHOULD_BUFFER", 1);

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public static final C1228 f18433 = new C1228("S_RESUMING_BY_RCV", 1);

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public static final C1228 f18434 = new C1228("RESUMING_BY_EB", 1);

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public static final C1228 f18429 = new C1228("POISONED", 1);

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public static final C1228 f18439 = new C1228("DONE_RCV", 1);

    /* renamed from: ˉי, reason: contains not printable characters */
    public static final C1228 f18423 = new C1228("INTERRUPTED_SEND", 1);

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public static final C1228 f18427 = new C1228("INTERRUPTED_RCV", 1);

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public static final C1228 f18424 = new C1228("CHANNEL_CLOSED", 1);

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public static final C1228 f18425 = new C1228("SUSPEND", 1);

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public static final C1228 f18435 = new C1228("SUSPEND_NO_WAITER", 1);

    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public static final C1228 f18428 = new C1228("FAILED", 1);

    /* renamed from: ˑי, reason: contains not printable characters */
    public static final C1228 f18431 = new C1228("NO_RECEIVE_RESULT", 1);

    /* renamed from: ᵎـ, reason: contains not printable characters */
    public static final C1228 f18437 = new C1228("CLOSE_HANDLER_CLOSED", 1);

    /* renamed from: ˎٴ, reason: contains not printable characters */
    public static final C1228 f18426 = new C1228("CLOSE_HANDLER_INVOKED", 1);

    /* renamed from: ᵎˏ, reason: contains not printable characters */
    public static final C1228 f18436 = new C1228("NO_CLOSE_CAUSE", 1);

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final boolean m11003(InterfaceC1589 interfaceC1589, Object obj, InterfaceC3870 interfaceC3870) {
        C1228 c1228Mo5180 = interfaceC1589.mo5180(obj, interfaceC3870);
        if (c1228Mo5180 == null) {
            return false;
        }
        interfaceC1589.mo5181(c1228Mo5180);
        return true;
    }
}
