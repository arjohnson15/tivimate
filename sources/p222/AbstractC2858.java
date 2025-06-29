package p222;

import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import java.lang.reflect.Method;

/* renamed from: ˏᴵ.ʻʻ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC2858 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static final Method f11110;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static final Method f11111;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final Method f11112;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static final boolean f11113;

    static {
        try {
            Class cls = Integer.TYPE;
            Class cls2 = Float.TYPE;
            Method declaredMethod = AbsListView.class.getDeclaredMethod("positionSelector", cls, View.class, Boolean.TYPE, cls2, cls2);
            f11112 = declaredMethod;
            declaredMethod.setAccessible(true);
            Method declaredMethod2 = AdapterView.class.getDeclaredMethod("setSelectedPositionInt", cls);
            f11110 = declaredMethod2;
            declaredMethod2.setAccessible(true);
            Method declaredMethod3 = AdapterView.class.getDeclaredMethod("setNextSelectedPositionInt", cls);
            f11111 = declaredMethod3;
            declaredMethod3.setAccessible(true);
            f11113 = true;
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}
