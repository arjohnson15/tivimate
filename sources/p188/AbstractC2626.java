package p188;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.os.Build;
import android.util.Log;
import java.util.Arrays;
import java.util.HashSet;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import p137.InterfaceC2105;

/* renamed from: ˎʾ.יʻ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC2626 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static final Lock f10414;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final Paint f10415 = new Paint(6);

    static {
        new Paint(7);
        f10414 = new HashSet(Arrays.asList("XT1085", "XT1092", "XT1093", "XT1094", "XT1095", "XT1096", "XT1097", "XT1098", "XT1031", "XT1028", "XT937C", "XT1032", "XT1008", "XT1033", "XT1035", "XT1034", "XT939G", "XT1039", "XT1040", "XT1042", "XT1045", "XT1063", "XT1064", "XT1068", "XT1069", "XT1072", "XT1077", "XT1078", "XT1079")).contains(Build.MODEL) ? new ReentrantLock() : new LockC2638();
        new Paint(7).setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static Bitmap m6807(InterfaceC2105 interfaceC2105, Bitmap bitmap, int i, int i2) {
        if (bitmap.getWidth() == i && bitmap.getHeight() == i2) {
            if (Log.isLoggable("TransformationUtils", 2)) {
            }
            return bitmap;
        }
        float fMin = Math.min(i / bitmap.getWidth(), i2 / bitmap.getHeight());
        int iRound = Math.round(bitmap.getWidth() * fMin);
        int iRound2 = Math.round(bitmap.getHeight() * fMin);
        if (bitmap.getWidth() == iRound && bitmap.getHeight() == iRound2) {
            if (Log.isLoggable("TransformationUtils", 2)) {
            }
            return bitmap;
        }
        Bitmap bitmapMo5960 = interfaceC2105.mo5960((int) (bitmap.getWidth() * fMin), (int) (bitmap.getHeight() * fMin), bitmap.getConfig() != null ? bitmap.getConfig() : Bitmap.Config.ARGB_8888);
        bitmapMo5960.setHasAlpha(bitmap.hasAlpha());
        if (Log.isLoggable("TransformationUtils", 2)) {
            String str = "request: " + i + "x" + i2;
            String str2 = "toFit:   " + bitmap.getWidth() + "x" + bitmap.getHeight();
            String str3 = "toReuse: " + bitmapMo5960.getWidth() + "x" + bitmapMo5960.getHeight();
            String str4 = "minPct:   " + fMin;
        }
        Matrix matrix = new Matrix();
        matrix.setScale(fMin, fMin);
        m6808(bitmap, bitmapMo5960, matrix);
        return bitmapMo5960;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static void m6808(Bitmap bitmap, Bitmap bitmap2, Matrix matrix) {
        Lock lock = f10414;
        lock.lock();
        try {
            Canvas canvas = new Canvas(bitmap2);
            canvas.drawBitmap(bitmap, matrix, f10415);
            canvas.setBitmap(null);
        } finally {
            lock.unlock();
        }
    }
}
