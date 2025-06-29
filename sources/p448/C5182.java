package p448;

import android.graphics.Rect;
import java.util.Comparator;
import p204.C2784;
import ـˊ.ʿʼ;

/* renamed from: ﾞˎ.ˑʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C5182 implements Comparator {

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final boolean f19952;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final ʿʼ f19953;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final Rect f19954 = new Rect();

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final Rect f19951 = new Rect();

    public C5182(boolean z, ʿʼ r3) {
        this.f19952 = z;
        this.f19953 = r3;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        this.f19953.getClass();
        Rect rect = this.f19954;
        ((C2784) obj).m7060(rect);
        Rect rect2 = this.f19951;
        ((C2784) obj2).m7060(rect2);
        int i = rect.top;
        int i2 = rect2.top;
        if (i < i2) {
            return -1;
        }
        if (i > i2) {
            return 1;
        }
        int i3 = rect.left;
        int i4 = rect2.left;
        boolean z = this.f19952;
        if (i3 < i4) {
            return z ? 1 : -1;
        }
        if (i3 > i4) {
            return z ? -1 : 1;
        }
        int i5 = rect.bottom;
        int i6 = rect2.bottom;
        if (i5 < i6) {
            return -1;
        }
        if (i5 > i6) {
            return 1;
        }
        int i7 = rect.right;
        int i8 = rect2.right;
        if (i7 < i8) {
            return z ? 1 : -1;
        }
        if (i7 > i8) {
            return z ? -1 : 1;
        }
        return 0;
    }
}
