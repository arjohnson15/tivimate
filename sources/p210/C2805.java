package p210;

import androidx.leanback.widget.ʿˏ;
import java.util.concurrent.Executor;
import p031.C1200;
import p031.InterfaceC1197;
import p032.InterfaceC1205;
import p032.InterfaceC1206;
import p032.InterfaceC1207;
import p032.InterfaceC1208;
import p072.AbstractC1642;

/* renamed from: ˏʼ.ᐧʻ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2805 implements InterfaceC1197 {

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final /* synthetic */ int f10945;

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public static final C2805 f10941 = new C2805(0);

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public static final C2805 f10943 = new C2805(1);

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public static final C2805 f10944 = new C2805(2);

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public static final C2805 f10942 = new C2805(3);

    public /* synthetic */ C2805(int i) {
        this.f10945 = i;
    }

    @Override // p031.InterfaceC1197
    /* renamed from: ﹳﹳ */
    public final Object mo4098(ʿˏ r4) {
        switch (this.f10945) {
            case 0:
                return AbstractC1642.m5305((Executor) r4.ʿʼ(new C1200(InterfaceC1207.class, Executor.class)));
            case 1:
                return AbstractC1642.m5305((Executor) r4.ʿʼ(new C1200(InterfaceC1206.class, Executor.class)));
            case 2:
                return AbstractC1642.m5305((Executor) r4.ʿʼ(new C1200(InterfaceC1205.class, Executor.class)));
            default:
                return AbstractC1642.m5305((Executor) r4.ʿʼ(new C1200(InterfaceC1208.class, Executor.class)));
        }
    }
}
