package p457;

import android.os.Build;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import p072.AbstractC1586;
import p072.AbstractC1636;
import ᵢ.ʿʼ;

/* renamed from: ﾞﹶ.ʽᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C5357 {

    /* renamed from: ˉי, reason: contains not printable characters */
    public final int f20786;

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public final boolean f20787;

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public final C5368 f20788;

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public final int f20789;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final ExecutorService f20792 = Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new ThreadFactoryC5373(false));

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final AbstractC1636 f20784 = AbstractC1586.f6345;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final ExecutorService f20791 = Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new ThreadFactoryC5373(true));

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final C5368 f20795 = new C5368();

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final C5368 f20785 = C5368.f20835;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final C5368 f20793 = C5368.f20833;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final ʿʼ f20794 = new ʿʼ(12);

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final int f20790 = 4;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final int f20796 = Integer.MAX_VALUE;

    public C5357() {
        this.f20789 = Build.VERSION.SDK_INT == 23 ? 10 : 20;
        this.f20786 = 8;
        this.f20787 = true;
        this.f20788 = new C5368();
    }
}
