package p366;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;
import p317.AbstractC3616;

/* renamed from: ᵔﾞ.ˈٴ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4146 extends C4169 {

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public final Socket f16046;

    public C4146(Socket socket) {
        this.f16046 = socket;
    }

    @Override // p366.C4169
    /* renamed from: ˉי */
    public final void mo4579() throws IOException {
        Socket socket = this.f16046;
        try {
            socket.close();
        } catch (AssertionError e) {
            Logger logger = AbstractC4152.f16061;
            boolean z = false;
            if (e.getCause() != null) {
                String message = e.getMessage();
                if (message != null ? AbstractC3616.m8533(message, "getsockname failed", false) : false) {
                    z = true;
                }
            }
            if (!z) {
                throw e;
            }
            AbstractC4152.f16061.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e);
        } catch (Exception e2) {
            AbstractC4152.f16061.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e2);
        }
    }

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public final IOException m9541(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }
}
