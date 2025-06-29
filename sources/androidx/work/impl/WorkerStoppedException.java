package androidx.work.impl;

import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public final class WorkerStoppedException extends CancellationException {

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final int f1769;

    public WorkerStoppedException(int i) {
        this.f1769 = i;
    }
}
