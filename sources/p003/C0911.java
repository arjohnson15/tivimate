package p003;

import java.util.ArrayDeque;
import p329.C3733;

/* renamed from: ʻʾ.ᵎـ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0911 extends C3733 {
    @Override // p329.C3733
    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final void mo3730(Object obj, Object obj2) {
        C0898 c0898 = (C0898) obj;
        c0898.getClass();
        ArrayDeque arrayDeque = C0898.f4036;
        synchronized (arrayDeque) {
            arrayDeque.offer(c0898);
        }
    }
}
