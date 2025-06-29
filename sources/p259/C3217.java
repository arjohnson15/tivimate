package p259;

import android.content.Context;
import android.graphics.Point;
import android.util.Log;
import android.view.Display;
import android.view.WindowManager;
import android.widget.ImageView;
import java.util.ArrayList;
import p329.AbstractC3740;

/* renamed from: יᵢ.ٴˎ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3217 {

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static Integer f12528;

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final ArrayList f12529 = new ArrayList();

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public ViewTreeObserverOnPreDrawListenerC3213 f12530;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final ImageView f12531;

    public C3217(ImageView imageView) {
        this.f12531 = imageView;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final int m7917(int i, int i2, int i3) {
        int i4 = i2 - i3;
        if (i4 > 0) {
            return i4;
        }
        int i5 = i - i3;
        if (i5 > 0) {
            return i5;
        }
        ImageView imageView = this.f12531;
        if (imageView.isLayoutRequested() || i2 != -2) {
            return 0;
        }
        if (Log.isLoggable("ViewTarget", 4)) {
        }
        Context context = imageView.getContext();
        if (f12528 == null) {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            AbstractC3740.m8706(windowManager, "Argument must not be null");
            Display defaultDisplay = windowManager.getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getSize(point);
            f12528 = Integer.valueOf(Math.max(point.x, point.y));
        }
        return f12528.intValue();
    }
}
