package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* loaded from: classes.dex */
public final class zzkl$zzb extends IOException {
    public zzkl$zzb() {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.");
    }

    public zzkl$zzb(IndexOutOfBoundsException indexOutOfBoundsException) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", indexOutOfBoundsException);
    }

    public zzkl$zzb(String str, IndexOutOfBoundsException indexOutOfBoundsException) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(str), indexOutOfBoundsException);
    }
}
