package p197;

import java.util.Comparator;

/* renamed from: ˎˑ.ﹶˆ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2733 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        C2715 c2715 = (C2715) obj;
        C2715 c27152 = (C2715) obj2;
        long jM6881 = c2715.m6881();
        long jM68812 = c27152.m6881();
        if (jM6881 != jM68812) {
            return (jM68812 != -1 && (jM6881 == -1 || jM6881 - jM68812 > 0)) ? 1 : -1;
        }
        int i = c27152.f10628;
        int i2 = c2715.f10628;
        return i + i2 == 1 ? i2 - i : i - i2;
    }
}
