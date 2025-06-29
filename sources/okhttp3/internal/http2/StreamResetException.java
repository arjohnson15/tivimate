package okhttp3.internal.http2;

import java.io.IOException;
import p334.C3789;

/* loaded from: classes2.dex */
public final class StreamResetException extends IOException {

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final int f3911;

    /* JADX WARN: Illegal instructions before constructor call */
    public StreamResetException(int i) {
        String str;
        switch (i) {
            case 1:
                str = "NO_ERROR";
                break;
            case 2:
                str = "PROTOCOL_ERROR";
                break;
            case 3:
                str = "INTERNAL_ERROR";
                break;
            case 4:
                str = "FLOW_CONTROL_ERROR";
                break;
            case 5:
                str = "SETTINGS_TIMEOUT";
                break;
            case C3789.STRING_SET_FIELD_NUMBER /* 6 */:
                str = "STREAM_CLOSED";
                break;
            case C3789.DOUBLE_FIELD_NUMBER /* 7 */:
                str = "FRAME_SIZE_ERROR";
                break;
            case 8:
                str = "REFUSED_STREAM";
                break;
            case 9:
                str = "CANCEL";
                break;
            case 10:
                str = "COMPRESSION_ERROR";
                break;
            case 11:
                str = "CONNECT_ERROR";
                break;
            case 12:
                str = "ENHANCE_YOUR_CALM";
                break;
            case 13:
                str = "INADEQUATE_SECURITY";
                break;
            case 14:
                str = "HTTP_1_1_REQUIRED";
                break;
            default:
                str = "null";
                break;
        }
        super("stream was reset: ".concat(str));
        this.f3911 = i;
    }
}
