package com.google.common.util.concurrent;

import j$.util.Objects;
import p345.AbstractC3985;
import p395.AbstractC4535;
import ⁱـ.ˑי;

/* loaded from: classes.dex */
public final class CycleDetectingLockFactory$PotentialDeadlockException extends IllegalStateException {
    static {
        AbstractC3985.m9215(3, ˑי.class.getName(), "com.google.common.util.concurrent.CycleDetectingLockFactory$PotentialDeadlockException", AbstractC4535.class.getName());
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        String message = super.getMessage();
        Objects.requireNonNull(message);
        StringBuilder sb = new StringBuilder(message);
        for (Throwable cause = null; cause != null; cause = cause.getCause()) {
            sb.append(", ");
            sb.append(cause.getMessage());
        }
        return sb.toString();
    }
}
