package p304;

import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.os.Build;
import android.util.Log;
import android.util.Size;
import p188.C2616;
import p188.C2631;
import p188.C2634;
import p314.C3598;
import p314.C3602;
import p314.EnumC3600;
import p314.EnumC3604;

/* renamed from: ᐧʿ.ʽᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3521 implements ImageDecoder.OnHeaderDecodedListener {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final int f13636;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final C2616 f13637;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final int f13638;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C2634 f13639 = C2634.m6817();

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final boolean f13640;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final EnumC3604 f13641;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final EnumC3600 f13642;

    public C3521(int i, int i2, C3598 c3598) {
        this.f13636 = i;
        this.f13638 = i2;
        this.f13642 = (EnumC3600) c3598.m8502(C2631.f10426);
        this.f13637 = (C2616) c3598.m8502(C2616.f10397);
        C3602 c3602 = C2631.f10428;
        this.f13640 = c3598.m8502(c3602) != null && ((Boolean) c3598.m8502(c3602)).booleanValue();
        this.f13641 = (EnumC3604) c3598.m8502(C2631.f10427);
    }

    @Override // android.graphics.ImageDecoder.OnHeaderDecodedListener
    public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        if (this.f13639.m6819(this.f13636, this.f13638, this.f13640, false)) {
            imageDecoder.setAllocator(3);
        } else {
            imageDecoder.setAllocator(1);
        }
        if (this.f13642 == EnumC3600.f13816) {
            imageDecoder.setMemorySizePolicy(0);
        }
        imageDecoder.setOnPartialImageListener(new C3523());
        Size size = imageInfo.getSize();
        int width = this.f13636;
        if (width == Integer.MIN_VALUE) {
            width = size.getWidth();
        }
        int height = this.f13638;
        if (height == Integer.MIN_VALUE) {
            height = size.getHeight();
        }
        float fM6790 = this.f13637.m6790(size.getWidth(), size.getHeight(), width, height);
        int iRound = Math.round(size.getWidth() * fM6790);
        int iRound2 = Math.round(size.getHeight() * fM6790);
        if (Log.isLoggable("ImageDecoder", 2)) {
            String str = "Resizing from [" + size.getWidth() + "x" + size.getHeight() + "] to [" + iRound + "x" + iRound2 + "] scaleFactor: " + fM6790;
        }
        imageDecoder.setTargetSize(iRound, iRound2);
        EnumC3604 enumC3604 = this.f13641;
        if (enumC3604 != null) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 28) {
                imageDecoder.setTargetColorSpace(ColorSpace.get((enumC3604 == EnumC3604.f13826 && imageInfo.getColorSpace() != null && imageInfo.getColorSpace().isWideGamut()) ? ColorSpace.Named.DISPLAY_P3 : ColorSpace.Named.SRGB));
            } else if (i >= 26) {
                imageDecoder.setTargetColorSpace(ColorSpace.get(ColorSpace.Named.SRGB));
            }
        }
    }
}
