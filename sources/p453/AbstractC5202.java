package p453;

import android.os.Build;
import android.os.Trace;

/* renamed from: ﾞᐧ.ﹶˆ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC5202 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final /* synthetic */ int f20025 = 0;

    static {
        if (Build.VERSION.SDK_INT < 29) {
            try {
                Trace.class.getField("TRACE_TAG_APP").getLong(null);
                Class cls = Long.TYPE;
                Trace.class.getMethod("isTagEnabled", cls);
                Class cls2 = Integer.TYPE;
                Trace.class.getMethod("asyncTraceBegin", cls, String.class, cls2);
                Trace.class.getMethod("asyncTraceEnd", cls, String.class, cls2);
                Trace.class.getMethod("traceCounter", cls, String.class, cls2);
            } catch (Exception e) {
            }
        }
    }
}
