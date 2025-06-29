package p222;

import android.content.res.Resources;
import android.widget.ThemedSpinnerAdapter;
import j$.util.Objects;

/* renamed from: ˏᴵ.ˋˉ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC2894 {
    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static void m7238(ThemedSpinnerAdapter themedSpinnerAdapter, Resources.Theme theme) {
        if (Objects.equals(themedSpinnerAdapter.getDropDownViewTheme(), theme)) {
            return;
        }
        themedSpinnerAdapter.setDropDownViewTheme(theme);
    }
}
