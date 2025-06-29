package com.bumptech.glide.load.data;

import android.os.ParcelFileDescriptor;
import java.nio.ByteBuffer;
import p046.C1304;

/* renamed from: com.bumptech.glide.load.data.ˏᵢ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0275 implements InterfaceC0278 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final /* synthetic */ int f2319;

    @Override // com.bumptech.glide.load.data.InterfaceC0278
    /* renamed from: ʽᐧ */
    public final InterfaceC0279 mo1536(Object obj) {
        switch (this.f2319) {
            case 0:
                return new C0282(obj);
            case 1:
                return new C0282((ParcelFileDescriptor) obj);
            default:
                return new C1304(0, (ByteBuffer) obj);
        }
    }

    @Override // com.bumptech.glide.load.data.InterfaceC0278
    /* renamed from: ـﹶ */
    public final Class mo1537() {
        switch (this.f2319) {
            case 0:
                throw new UnsupportedOperationException("Not implemented");
            case 1:
                return ParcelFileDescriptor.class;
            default:
                return ByteBuffer.class;
        }
    }
}
