package p182;

import android.view.MenuItem;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: ˋⁱ.ᐧʻ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class MenuItemOnMenuItemClickListenerC2527 implements MenuItem.OnMenuItemClickListener {

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public static final Class[] f10054 = {MenuItem.class};

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public Method f10055;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public Object f10056;

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Method method = this.f10055;
        try {
            Class<?> returnType = method.getReturnType();
            Class<?> cls = Boolean.TYPE;
            Object obj = this.f10056;
            if (returnType == cls) {
                return ((Boolean) method.invoke(obj, menuItem)).booleanValue();
            }
            method.invoke(obj, menuItem);
            return true;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
