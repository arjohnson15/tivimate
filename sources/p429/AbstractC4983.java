package p429;

import android.app.Application;
import android.os.Build;
import android.os.Process;
import android.util.Base64;
import p238.AbstractC3095;
import p317.AbstractC3625;
import ˆʽ.ᵎˏ;

/* renamed from: ﹶˎ.ﹳˎ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC4983 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static final String f18821;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final String f18822;

    static {
        String strM7613;
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            strM7613 = Process.myProcessName();
        } else if ((i < 28 || (strM7613 = Application.getProcessName()) == null) && (strM7613 = AbstractC3095.m7613()) == null) {
            strM7613 = "";
        }
        String strEncodeToString = Base64.encodeToString(strM7613.getBytes(AbstractC3625.f13869), 10);
        f18822 = ᵎˏ.ˑי("firebase_session_", strEncodeToString, "_data");
        f18821 = ᵎˏ.ˑי("firebase_session_", strEncodeToString, "_settings");
    }
}
