package p220;

import android.media.AudioDeviceInfo;
import android.media.PlaybackParams;
import android.os.Parcelable;
import android.security.keystore.KeyGenParameterSpec;
import android.view.Display;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;

/* renamed from: ˏٴ.ٴˎ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC2850 {
    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public static /* synthetic */ KeyGenParameterSpec.Builder m7145(String str) {
        return new KeyGenParameterSpec.Builder(str, 3);
    }

    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public static /* bridge */ /* synthetic */ Display.Mode m7149(Parcelable parcelable) {
        return (Display.Mode) parcelable;
    }

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public static /* bridge */ /* synthetic */ AudioDeviceInfo m7150(Object obj) {
        return (AudioDeviceInfo) obj;
    }

    /* renamed from: ˑי, reason: contains not printable characters */
    public static /* bridge */ /* synthetic */ ThemedSpinnerAdapter m7152(SpinnerAdapter spinnerAdapter) {
        return (ThemedSpinnerAdapter) spinnerAdapter;
    }

    /* renamed from: יʻ, reason: contains not printable characters */
    public static /* bridge */ /* synthetic */ boolean m7153(SpinnerAdapter spinnerAdapter) {
        return spinnerAdapter instanceof ThemedSpinnerAdapter;
    }

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public static /* synthetic */ PlaybackParams m7164() {
        return new PlaybackParams();
    }
}
