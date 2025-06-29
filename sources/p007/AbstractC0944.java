package p007;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Display;

/* renamed from: ʻˉ.ˉⁱ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC0944 {
    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static boolean m3810(Context context) {
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        Display display = displayManager != null ? displayManager.getDisplay(0) : null;
        if (display == null || !display.isHdr()) {
            return false;
        }
        for (int i : display.getHdrCapabilities().getSupportedHdrTypes()) {
            if (i == 1) {
                return true;
            }
        }
        return false;
    }
}
