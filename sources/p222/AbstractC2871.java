package p222;

import android.widget.AbsListView;
import java.lang.reflect.Field;

/* renamed from: ˏᴵ.ʾˈ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC2871 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final Field f11131;

    static {
        Field declaredField = null;
        try {
            declaredField = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
        f11131 = declaredField;
    }
}
