package p327;

import com.bumptech.glide.load.data.C0272;
import java.util.ArrayDeque;
import p003.C0893;
import p003.C0898;
import p003.C0910;
import p003.C0911;
import p003.InterfaceC0913;
import p314.C3598;
import p314.C3602;
import ʾי.ˑʽ;

/* renamed from: ᴵᐧ.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3724 implements InterfaceC0913 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static final C3602 f14451 = C3602.m8503(2500, "com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout");

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final ˑʽ f14452;

    public C3724(ˑʽ r1) {
        this.f14452 = r1;
    }

    @Override // p003.InterfaceC0913
    /* renamed from: ʽᐧ */
    public final C0910 mo3705(Object obj, int i, int i2, C3598 c3598) {
        C0893 c0893 = (C0893) obj;
        ˑʽ r4 = this.f14452;
        if (r4 != null) {
            C0898 c0898M3715 = C0898.m3715(c0893);
            C0911 c0911 = (C0911) r4.ˆʿ;
            Object objM8700 = c0911.m8700(c0898M3715);
            ArrayDeque arrayDeque = C0898.f4036;
            synchronized (arrayDeque) {
                arrayDeque.offer(c0898M3715);
            }
            C0893 c08932 = (C0893) objM8700;
            if (c08932 == null) {
                c0911.m8701(C0898.m3715(c0893), c0893);
            } else {
                c0893 = c08932;
            }
        }
        return new C0910(c0893, new C0272(c0893, ((Integer) c3598.m8502(f14451)).intValue()));
    }

    @Override // p003.InterfaceC0913
    /* renamed from: ـﹶ */
    public final /* bridge */ /* synthetic */ boolean mo3706(Object obj) {
        return true;
    }
}
