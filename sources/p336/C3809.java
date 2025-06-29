package p336;

import android.util.Log;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import p317.AbstractC3616;

/* renamed from: ᵎʿ.ﹳﹳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3809 extends Handler {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final C3809 f14664 = new C3809();

    @Override // java.util.logging.Handler
    public final void close() {
    }

    @Override // java.util.logging.Handler
    public final void flush() {
    }

    @Override // java.util.logging.Handler
    public final void publish(LogRecord logRecord) {
        int iMin;
        CopyOnWriteArraySet copyOnWriteArraySet = AbstractC3804.f14657;
        String loggerName = logRecord.getLoggerName();
        int iIntValue = logRecord.getLevel().intValue();
        Level level = Level.INFO;
        int i = iIntValue > level.intValue() ? 5 : logRecord.getLevel().intValue() == level.intValue() ? 4 : 3;
        String message = logRecord.getMessage();
        Throwable thrown = logRecord.getThrown();
        String strM8524 = (String) AbstractC3804.f14656.get(loggerName);
        if (strM8524 == null) {
            strM8524 = AbstractC3616.m8524(23, loggerName);
        }
        if (Log.isLoggable(strM8524, i)) {
            if (thrown != null) {
                message = message + '\n' + Log.getStackTraceString(thrown);
            }
            int length = message.length();
            int i2 = 0;
            while (i2 < length) {
                int iM8527 = AbstractC3616.m8527(message, '\n', i2, false, 4);
                if (iM8527 == -1) {
                    iM8527 = length;
                }
                while (true) {
                    iMin = Math.min(iM8527, i2 + 4000);
                    message.substring(i2, iMin);
                    if (iMin >= iM8527) {
                        break;
                    } else {
                        i2 = iMin;
                    }
                }
                i2 = iMin + 1;
            }
        }
    }
}
