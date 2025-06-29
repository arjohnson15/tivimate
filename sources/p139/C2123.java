package p139;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import p080.AbstractC1702;
import ᵎﹳ.ᐧʻ;

/* renamed from: ˉˋ.ˆᵔ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2123 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final View f8361;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final HashMap f8363 = new HashMap();

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final ArrayList f8362 = new ArrayList();

    public C2123(View view) {
        this.f8361 = view;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2123)) {
            return false;
        }
        C2123 c2123 = (C2123) obj;
        return this.f8361 == c2123.f8361 && this.f8363.equals(c2123.f8363);
    }

    public final int hashCode() {
        return this.f8363.hashCode() + (this.f8361.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sbM5409 = AbstractC1702.m5409("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n", "    view = ");
        sbM5409.append(this.f8361);
        sbM5409.append("\n");
        String str = ᐧʻ.ˉⁱ(sbM5409.toString(), "    values:");
        HashMap map = this.f8363;
        for (String str2 : map.keySet()) {
            str = str + "    " + str2 + ": " + map.get(str2) + "\n";
        }
        return str;
    }
}
