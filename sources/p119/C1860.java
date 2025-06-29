package p119;

import android.content.Context;
import java.util.Set;
import java.util.concurrent.Executor;
import p031.C1193;
import p251.C3130;
import p450.InterfaceC5190;
import ˎˊ.ˆʿ;
import ˎˊ.ˏʾ;

/* renamed from: ˈˉ.ˑʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1860 implements InterfaceC1859, InterfaceC1862 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final Context f7114;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final Executor f7115;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final InterfaceC5190 f7116;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C1193 f7117;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final Set f7118;

    public C1860(Context context, String str, Set set, InterfaceC5190 interfaceC5190, Executor executor) {
        this.f7117 = new C1193(context, 1, str);
        this.f7118 = set;
        this.f7115 = executor;
        this.f7116 = interfaceC5190;
        this.f7114 = context;
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final void m5617() {
        if (this.f7118.size() <= 0) {
            ˏʾ.ˏᴵ((Object) null);
        } else if (ˆʿ.ˋⁱ(this.f7114)) {
            ˏʾ.ˏᵢ(new CallableC1858(this, 1), this.f7115);
        } else {
            ˏʾ.ˏᴵ((Object) null);
        }
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C3130 m5618() {
        return !ˆʿ.ˋⁱ(this.f7114) ? ˏʾ.ˏᴵ("") : ˏʾ.ˏᵢ(new CallableC1858(this, 0), this.f7115);
    }
}
