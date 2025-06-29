package p259;

import android.content.Context;
import android.graphics.Point;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import java.util.ArrayList;
import p329.AbstractC3740;

/* renamed from: יᵢ.ˑʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3215 {

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static Integer f12520;

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final ArrayList f12521 = new ArrayList();

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public ViewTreeObserverOnPreDrawListenerC3213 f12522;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final View f12523;

    public C3215(View view) {
        this.f12523 = view;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final int m7915(int i, int i2, int i3) {
        int i4 = i2 - i3;
        if (i4 > 0) {
            return i4;
        }
        int i5 = i - i3;
        if (i5 > 0) {
            return i5;
        }
        View view = this.f12523;
        if (view.isLayoutRequested() || i2 != -2) {
            return 0;
        }
        if (Log.isLoggable("CustomViewTarget", 4)) {
        }
        Context context = view.getContext();
        if (f12520 == null) {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            AbstractC3740.m8706(windowManager, "Argument must not be null");
            Display defaultDisplay = windowManager.getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getSize(point);
            f12520 = Integer.valueOf(Math.max(point.x, point.y));
        }
        return f12520.intValue();
    }
}
