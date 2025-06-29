package p019;

import android.text.Editable;
import p192.C2673;

/* renamed from: ʻﹳ.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1124 extends Editable.Factory {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static volatile C1124 f4747;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static Class f4748;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final Object f4749 = new Object();

    @Override // android.text.Editable.Factory
    public final Editable newEditable(CharSequence charSequence) {
        Class cls = f4748;
        return cls != null ? new C2673(cls, charSequence) : super.newEditable(charSequence);
    }
}
