package p188;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import java.util.concurrent.locks.Lock;
import p137.InterfaceC2105;

/* renamed from: ˎʾ.ˑי, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC2625 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final C2622 f10413 = new C2622(17);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [ˉˈ.ـﹶ] */
    /* JADX WARN: Type inference failed for: r7v2, types: [ˉˈ.ـﹶ] */
    /* JADX WARN: Type inference failed for: r7v4, types: [ˎʾ.ˏᴵ] */
    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static C2624 m6806(InterfaceC2105 interfaceC2105, Drawable drawable, int i, int i2) {
        Bitmap bitmap;
        Drawable current = drawable.getCurrent();
        boolean z = false;
        if (current instanceof BitmapDrawable) {
            bitmap = ((BitmapDrawable) current).getBitmap();
        } else if (current instanceof Animatable) {
            bitmap = null;
        } else {
            if (i != Integer.MIN_VALUE || current.getIntrinsicWidth() > 0) {
                if (i2 != Integer.MIN_VALUE || current.getIntrinsicHeight() > 0) {
                    if (current.getIntrinsicWidth() > 0) {
                        i = current.getIntrinsicWidth();
                    }
                    if (current.getIntrinsicHeight() > 0) {
                        i2 = current.getIntrinsicHeight();
                    }
                    Lock lock = AbstractC2626.f10414;
                    lock.lock();
                    Bitmap bitmapMo5960 = interfaceC2105.mo5960(i, i2, Bitmap.Config.ARGB_8888);
                    try {
                        Canvas canvas = new Canvas(bitmapMo5960);
                        current.setBounds(0, 0, i, i2);
                        current.draw(canvas);
                        canvas.setBitmap(null);
                        lock.unlock();
                        bitmap = bitmapMo5960;
                        z = true;
                    } catch (Throwable th) {
                        lock.unlock();
                        throw th;
                    }
                } else if (Log.isLoggable("DrawableToBitmap", 5)) {
                    String str = "Unable to draw " + current + " to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic height";
                }
            } else if (Log.isLoggable("DrawableToBitmap", 5)) {
                String str2 = "Unable to draw " + current + " to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic width";
            }
            bitmap = null;
            z = true;
        }
        if (!z) {
            interfaceC2105 = f10413;
        }
        return C2624.m6805(bitmap, interfaceC2105);
    }
}
