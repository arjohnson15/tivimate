package com.bumptech.glide.load;

import p314.AbstractC3599;

/* loaded from: classes.dex */
public enum ImageHeaderParser$ImageType {
    GIF(0),
    JPEG(1),
    RAW(2),
    PNG_A(3),
    PNG(4),
    WEBP_A(5),
    WEBP(6),
    ANIMATED_WEBP(7),
    AVIF(8),
    ANIMATED_AVIF(9),
    UNKNOWN(10);


    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final boolean f2302;

    ImageHeaderParser$ImageType(int i) {
        this.f2302 = z;
    }

    public boolean hasAlpha() {
        return this.f2302;
    }

    public boolean isWebp() {
        int i = AbstractC3599.f13815[ordinal()];
        return i == 1 || i == 2 || i == 3;
    }
}
