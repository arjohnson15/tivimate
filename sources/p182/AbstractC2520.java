package p182;

import android.view.ActionMode;
import android.view.SearchEvent;
import android.view.Window;

/* renamed from: ˋⁱ.ˉⁱ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC2520 {
    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static ActionMode m6659(Window.Callback callback, ActionMode.Callback callback2, int i) {
        return callback.onWindowStartingActionMode(callback2, i);
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static boolean m6660(Window.Callback callback, SearchEvent searchEvent) {
        return callback.onSearchRequested(searchEvent);
    }
}
