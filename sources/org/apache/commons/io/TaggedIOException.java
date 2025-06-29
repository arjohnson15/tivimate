package org.apache.commons.io;

import java.io.IOException;

/* loaded from: classes.dex */
public class TaggedIOException extends IOExceptionWithCause {
    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return (IOException) super.getCause();
    }
}
