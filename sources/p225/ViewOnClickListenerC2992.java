package p225;

import android.content.Context;
import android.content.ContextWrapper;
import android.support.v4.media.session.AbstractC0002;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: ˏᵢ.ˋˉ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class ViewOnClickListenerC2992 implements View.OnClickListener {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final String f11510;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public Method f11511;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public Context f11512;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final View f11513;

    public ViewOnClickListenerC2992(View view, String str) {
        this.f11513 = view;
        this.f11510 = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        String str;
        Method method;
        if (this.f11511 == null) {
            View view2 = this.f11513;
            Context context = view2.getContext();
            while (true) {
                String str2 = this.f11510;
                if (context == null) {
                    int id = view2.getId();
                    if (id == -1) {
                        str = "";
                    } else {
                        str = " with id '" + view2.getContext().getResources().getResourceEntryName(id) + "'";
                    }
                    StringBuilder sbM50 = AbstractC0002.m50("Could not find method ", str2, "(View) in a parent or ancestor Context for android:onClick attribute defined on view ");
                    sbM50.append(view2.getClass());
                    sbM50.append(str);
                    throw new IllegalStateException(sbM50.toString());
                }
                try {
                    if (!context.isRestricted() && (method = context.getClass().getMethod(str2, View.class)) != null) {
                        this.f11511 = method;
                        this.f11512 = context;
                    }
                } catch (NoSuchMethodException unused) {
                }
                context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
            }
        }
        try {
            this.f11511.invoke(this.f11512, view);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException("Could not execute non-public method for android:onClick", e);
        } catch (InvocationTargetException e2) {
            throw new IllegalStateException("Could not execute method for android:onClick", e2);
        }
    }
}
