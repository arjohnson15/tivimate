package p291;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import p139.C2148;

/* renamed from: ٴᐧ.ˑﾞ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC3436 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static final AbstractC3448 f13330;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final C3449 f13331 = new C3449();

    static {
        AbstractC3448 abstractC3448 = null;
        try {
            abstractC3448 = (AbstractC3448) C2148.class.getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f13330 = abstractC3448;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final void m8293(int i, ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((View) it.next()).setVisibility(i);
        }
    }
}
