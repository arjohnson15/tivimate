package com.bumptech.glide.load.data;

import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import java.io.IOException;

/* loaded from: classes.dex */
final class ParcelFileDescriptorRewinder$InternalRewinder {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final ParcelFileDescriptor f2303;

    public ParcelFileDescriptorRewinder$InternalRewinder(ParcelFileDescriptor parcelFileDescriptor) {
        this.f2303 = parcelFileDescriptor;
    }

    public ParcelFileDescriptor rewind() throws IOException, ErrnoException {
        ParcelFileDescriptor parcelFileDescriptor = this.f2303;
        try {
            Os.lseek(parcelFileDescriptor.getFileDescriptor(), 0L, OsConstants.SEEK_SET);
            return parcelFileDescriptor;
        } catch (ErrnoException e) {
            throw new IOException(e);
        }
    }
}
