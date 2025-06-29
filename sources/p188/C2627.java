package p188;

import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.bumptech.glide.load.data.C0282;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.ArrayList;
import p063.C1447;
import p137.C2106;
import p137.InterfaceC2105;
import p216.C2822;
import p261.InterfaceC3251;
import p266.C3262;
import p314.C3598;
import p314.InterfaceC3595;
import p329.AbstractC3740;
import p329.C3732;
import p329.C3736;
import p331.C3759;

/* renamed from: ˎʾ.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2627 implements InterfaceC3595 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final Object f10416;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final Object f10417;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final /* synthetic */ int f10418;

    public C2627(Resources resources, InterfaceC3595 interfaceC3595) {
        this.f10418 = 0;
        this.f10417 = resources;
        this.f10416 = interfaceC3595;
    }

    public /* synthetic */ C2627(Object obj, int i, Object obj2) {
        this.f10418 = i;
        this.f10416 = obj;
        this.f10417 = obj2;
    }

    @Override // p314.InterfaceC3595
    /* renamed from: ʽᐧ */
    public final boolean mo4999(Object obj, C3598 c3598) {
        switch (this.f10418) {
            case 0:
                return ((InterfaceC3595) this.f10416).mo4999(obj, c3598);
            case 1:
                return "android.resource".equals(((Uri) obj).getScheme());
            default:
                ((C2631) this.f10416).getClass();
                return true;
        }
    }

    @Override // p314.InterfaceC3595
    /* renamed from: ـﹶ */
    public final InterfaceC3251 mo5001(Object obj, int i, int i2, C3598 c3598) throws PackageManager.NameNotFoundException, NumberFormatException {
        C2639 c2639;
        boolean z;
        C3732 c3732;
        switch (this.f10418) {
            case 0:
                InterfaceC3251 interfaceC3251Mo5001 = ((InterfaceC3595) this.f10416).mo5001(obj, i, i2, c3598);
                if (interfaceC3251Mo5001 == null) {
                    return null;
                }
                return new C2624((Resources) this.f10417, interfaceC3251Mo5001);
            case 1:
                InterfaceC3251 interfaceC3251M7099 = ((C2822) this.f10416).m7099((Uri) obj, c3598);
                if (interfaceC3251M7099 == null) {
                    return null;
                }
                return AbstractC2625.m6806((InterfaceC2105) this.f10417, (Drawable) ((C1447) interfaceC3251M7099).get(), i, i2);
            default:
                InputStream inputStream = (InputStream) obj;
                if (inputStream instanceof C2639) {
                    c2639 = (C2639) inputStream;
                    z = false;
                } else {
                    c2639 = new C2639(inputStream, (C2106) this.f10417);
                    z = true;
                }
                ArrayDeque arrayDeque = C3732.f14483;
                synchronized (arrayDeque) {
                    c3732 = (C3732) arrayDeque.poll();
                }
                if (c3732 == null) {
                    c3732 = new C3732();
                }
                c3732.f14485 = c2639;
                C3736 c3736 = new C3736(c3732);
                C3759 c3759 = new C3759(c2639, 9, c3732);
                try {
                    C2631 c2631 = (C2631) this.f10416;
                    ArrayList arrayList = c2631.f10433;
                    C2106 c2106 = c2631.f10431;
                    C3262 c3262 = new C3262();
                    AbstractC3740.m8706(c2106, "Argument must not be null");
                    c3262.f12724 = c2106;
                    AbstractC3740.m8706(arrayList, "Argument must not be null");
                    c3262.f12725 = arrayList;
                    c3262.f12726 = new C0282(c3736, c2106);
                    return c2631.m6816(c3262, i, i2, c3598, c3759);
                } finally {
                    c3732.m8697();
                    if (z) {
                        c2639.m6822();
                    }
                }
        }
    }
}
