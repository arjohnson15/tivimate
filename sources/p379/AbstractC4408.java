package p379;

import android.support.v4.media.session.AbstractC0002;
import java.io.IOException;

/* renamed from: ᵢᐧ.ˑי, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC4408 {
    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static int m10015(int i, int i2, int i3) throws IOException {
        if ((i2 & 8) != 0) {
            i--;
        }
        if (i3 <= i) {
            return i - i3;
        }
        throw new IOException(AbstractC0002.m55(i3, i, "PROTOCOL_ERROR padding ", " > remaining length "));
    }
}
