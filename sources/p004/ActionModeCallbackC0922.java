package p004;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.text.Editable;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* renamed from: ʻʿ.ˉⁱ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class ActionModeCallbackC0922 implements ActionMode.Callback {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final TextView f4107;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public boolean f4108;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public Class f4109;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final ActionMode.Callback f4110;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public boolean f4111 = false;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public Method f4112;

    public ActionModeCallbackC0922(ActionMode.Callback callback, TextView textView) {
        this.f4110 = callback;
        this.f4107 = textView;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        return this.f4110.onActionItemClicked(actionMode, menuItem);
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        return this.f4110.onCreateActionMode(actionMode, menu);
    }

    @Override // android.view.ActionMode.Callback
    public final void onDestroyActionMode(ActionMode actionMode) {
        this.f4110.onDestroyActionMode(actionMode);
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) throws IllegalAccessException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
        String str;
        TextView textView = this.f4107;
        Context context = textView.getContext();
        PackageManager packageManager = context.getPackageManager();
        if (!this.f4111) {
            this.f4111 = true;
            try {
                Class<?> cls = Class.forName("com.android.internal.view.menu.MenuBuilder");
                this.f4109 = cls;
                this.f4112 = cls.getDeclaredMethod("removeItemAt", Integer.TYPE);
                this.f4108 = true;
            } catch (ClassNotFoundException | NoSuchMethodException unused) {
                this.f4109 = null;
                this.f4112 = null;
                this.f4108 = false;
            }
        }
        try {
            Method declaredMethod = (this.f4108 && this.f4109.isInstance(menu)) ? this.f4112 : menu.getClass().getDeclaredMethod("removeItemAt", Integer.TYPE);
            for (int size = menu.size() - 1; size >= 0; size--) {
                MenuItem item = menu.getItem(size);
                if (item.getIntent() != null && "android.intent.action.PROCESS_TEXT".equals(item.getIntent().getAction())) {
                    declaredMethod.invoke(menu, Integer.valueOf(size));
                }
            }
            ArrayList arrayList = new ArrayList();
            if (context instanceof Activity) {
                for (ResolveInfo resolveInfo : packageManager.queryIntentActivities(new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain"), 0)) {
                    if (!context.getPackageName().equals(resolveInfo.activityInfo.packageName)) {
                        ActivityInfo activityInfo = resolveInfo.activityInfo;
                        if (activityInfo.exported && ((str = activityInfo.permission) == null || context.checkSelfPermission(str) == 0)) {
                        }
                    }
                    arrayList.add(resolveInfo);
                }
            }
            for (int i = 0; i < arrayList.size(); i++) {
                ResolveInfo resolveInfo2 = (ResolveInfo) arrayList.get(i);
                MenuItem menuItemAdd = menu.add(0, 0, i + 100, resolveInfo2.loadLabel(packageManager));
                Intent intentPutExtra = new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain").putExtra("android.intent.extra.PROCESS_TEXT_READONLY", !((textView instanceof Editable) && textView.onCheckIsTextEditor() && textView.isEnabled()));
                ActivityInfo activityInfo2 = resolveInfo2.activityInfo;
                menuItemAdd.setIntent(intentPutExtra.setClassName(activityInfo2.packageName, activityInfo2.name)).setShowAsAction(1);
            }
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
        }
        return this.f4110.onPrepareActionMode(actionMode, menu);
    }
}
