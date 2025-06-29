package p104;

import androidx.leanback.widget.ʿˏ;
import java.util.concurrent.Executor;
import p031.C1200;
import p031.InterfaceC1197;
import p032.InterfaceC1205;
import p032.InterfaceC1206;
import p032.InterfaceC1207;
import p032.InterfaceC1208;
import p072.AbstractC1642;

/* renamed from: ˆـ.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1793 implements InterfaceC1197 {

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final /* synthetic */ int f6936;

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public static final C1793 f6932 = new C1793(0);

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public static final C1793 f6934 = new C1793(1);

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public static final C1793 f6935 = new C1793(2);

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public static final C1793 f6933 = new C1793(3);

    public /* synthetic */ C1793(int i) {
        this.f6936 = i;
    }

    @Override // p031.InterfaceC1197
    /* renamed from: ﹳﹳ */
    public final Object mo4098(ʿˏ r4) {
        switch (this.f6936) {
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
