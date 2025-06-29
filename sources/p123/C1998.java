package p123;

import android.content.Context;
import j$.util.DesugarCollections;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Set;
import p009.C0995;
import p135.C2094;
import p165.InterfaceC2393;
import p183.C2531;
import p266.C3262;
import p385.RunnableC4478;
import p437.InterfaceC5069;
import p444.C5148;
import p444.C5152;

/* renamed from: ˈـ.ˎٴ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1998 {

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public static volatile C1999 f7597;

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final InterfaceC2393 f7598;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final InterfaceC5069 f7599;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final InterfaceC2393 f7600;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final C5152 f7601;

    public C1998(InterfaceC2393 interfaceC2393, InterfaceC2393 interfaceC23932, InterfaceC5069 interfaceC5069, C5152 c5152, C5148 c5148) {
        this.f7600 = interfaceC2393;
        this.f7598 = interfaceC23932;
        this.f7599 = interfaceC5069;
        this.f7601 = c5152;
        c5148.getClass();
        c5148.f19679.execute(new RunnableC4478(2, c5148));
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static void m5647(Context context) {
        if (f7597 == null) {
            synchronized (C1998.class) {
                try {
                    if (f7597 == null) {
                        C0995 c0995 = new C0995();
                        context.getClass();
                        c0995.f4341 = context;
                        f7597 = c0995.m3954();
                    }
                } finally {
                }
            }
        }
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static C1998 m5648() {
        C1999 c1999 = f7597;
        if (c1999 != null) {
            return (C1998) c1999.f7607.get();
        }
        throw new IllegalStateException("Not initialized!");
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final C2008 m5649(C2094 c2094) {
        Set setSingleton;
        byte[] bytes;
        if (c2094 instanceof InterfaceC1996) {
            c2094.getClass();
            setSingleton = DesugarCollections.unmodifiableSet(C2094.f8276);
        } else {
            setSingleton = Collections.singleton(new C2531("proto"));
        }
        C3262 c3262M5645 = C1995.m5645();
        c2094.getClass();
        c3262M5645.f12726 = "cct";
        String str = c2094.f8278;
        String str2 = c2094.f8277;
        if (str2 == null && str == null) {
            bytes = null;
        } else {
            if (str2 == null) {
                str2 = "";
            }
            bytes = ("1$" + str + "\\" + str2).getBytes(Charset.forName("UTF-8"));
        }
        c3262M5645.f12724 = bytes;
        return new C2008(setSingleton, c3262M5645.m8038(), this);
    }
}
