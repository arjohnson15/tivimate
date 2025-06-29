package p003;

import android.net.Uri;
import com.bumptech.glide.load.data.C0277;
import com.bumptech.glide.load.data.C0280;
import com.bumptech.glide.load.data.InterfaceC0270;
import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import p314.C3598;
import p354.C4024;

/* renamed from: ʻʾ.ˆᵔ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0891 implements InterfaceC0913 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static final Set f4020 = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList("file", "content", "android.resource")));

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final Object f4021;

    public C0891(C0908 c0908) {
        this.f4021 = c0908;
    }

    @Override // p003.InterfaceC0913
    /* renamed from: ʽᐧ */
    public final C0910 mo3705(Object obj, int i, int i2, C3598 c3598) {
        InterfaceC0270 c0277;
        Uri uri = (Uri) obj;
        C4024 c4024 = new C4024(uri);
        C0908 c0908 = (C0908) this.f4021;
        switch (c0908.f4063) {
            case 0:
                c0277 = new C0277(c0908.f4062, uri, 0);
                break;
            case 1:
                c0277 = new C0277(c0908.f4062, uri, 1);
                break;
            default:
                c0277 = new C0280(1, uri, c0908.f4062);
                break;
        }
        return new C0910(c4024, c0277);
    }

    @Override // p003.InterfaceC0913
    /* renamed from: ـﹶ */
    public final boolean mo3706(Object obj) {
        return f4020.contains(((Uri) obj).getScheme());
    }
}
