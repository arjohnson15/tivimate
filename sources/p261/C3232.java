package p261;

import com.bumptech.glide.load.data.InterfaceC0279;
import com.bumptech.glide.load.engine.GlideException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p014.C1060;
import p260.C3222;
import p314.C3598;

/* renamed from: ـ.ˋˊ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3232 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final List f12589;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final String f12590;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C3222 f12591;

    public C3232(Class cls, Class cls2, Class cls3, List list, C3222 c3222) {
        this.f12591 = c3222;
        if (list.isEmpty()) {
            throw new IllegalArgumentException("Must not be empty.");
        }
        this.f12589 = list;
        this.f12590 = "Failed LoadPath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    public final String toString() {
        return "LoadPath{decodePaths=" + Arrays.toString(this.f12589.toArray()) + '}';
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final InterfaceC3251 m7979(int i, int i2, InterfaceC0279 interfaceC0279, C1060 c1060, C3598 c3598) {
        C3222 c3222 = this.f12591;
        List list = (List) c3222.m7947();
        try {
            List list2 = this.f12589;
            int size = list2.size();
            InterfaceC3251 interfaceC3251M7989 = null;
            for (int i3 = 0; i3 < size; i3++) {
                try {
                    interfaceC3251M7989 = ((C3235) list2.get(i3)).m7989(i, i2, interfaceC0279, c1060, c3598);
                } catch (GlideException e) {
                    list.add(e);
                }
                if (interfaceC3251M7989 != null) {
                    break;
                }
            }
            if (interfaceC3251M7989 != null) {
                return interfaceC3251M7989;
            }
            throw new GlideException(this.f12590, new ArrayList(list));
        } finally {
            c3222.m7946(list);
        }
    }
}
