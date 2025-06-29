package p003;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.EnumC0293;
import com.bumptech.glide.load.data.InterfaceC0270;
import com.bumptech.glide.load.data.InterfaceC0281;
import java.io.IOException;
import java.io.InputStream;
import ˆˑ.ﹳﹳ;

/* renamed from: ʻʾ.ˏᵢ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0901 implements InterfaceC0270 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final Resources f4043;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public Object f4044;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final Object f4045;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final int f4046;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final Resources.Theme f4047;

    public C0901(Resources.Theme theme, Resources resources, C0907 c0907, int i) {
        this.f4047 = theme;
        this.f4043 = resources;
        this.f4045 = c0907;
        this.f4046 = i;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC0270
    public final void cancel() {
    }

    @Override // com.bumptech.glide.load.data.InterfaceC0270
    /* renamed from: ʽᐧ */
    public final void mo1527() throws IOException {
        Object obj = this.f4044;
        if (obj != null) {
            try {
                switch (((C0907) this.f4045).f4061) {
                    case 0:
                        ((AssetFileDescriptor) obj).close();
                        break;
                    case 1:
                        break;
                    default:
                        ((InputStream) obj).close();
                        break;
                }
            } catch (IOException unused) {
            }
        }
    }

    @Override // com.bumptech.glide.load.data.InterfaceC0270
    /* renamed from: ـﹶ */
    public final Class mo1533() {
        switch (((C0907) this.f4045).f4061) {
            case 0:
                return AssetFileDescriptor.class;
            case 1:
                return Drawable.class;
            default:
                return InputStream.class;
        }
    }

    @Override // com.bumptech.glide.load.data.InterfaceC0270
    /* renamed from: ٴˎ */
    public final void mo1529(EnumC0293 enumC0293, InterfaceC0281 interfaceC0281) throws Resources.NotFoundException {
        Object objOpenRawResourceFd;
        try {
            Object obj = this.f4045;
            Resources.Theme theme = this.f4047;
            Resources resources = this.f4043;
            int i = this.f4046;
            C0907 c0907 = (C0907) obj;
            switch (c0907.f4061) {
                case 0:
                    objOpenRawResourceFd = resources.openRawResourceFd(i);
                    break;
                case 1:
                    Context context = c0907.f4060;
                    objOpenRawResourceFd = ﹳﹳ.ˋⁱ(context, context, i, theme);
                    break;
                default:
                    objOpenRawResourceFd = resources.openRawResource(i);
                    break;
            }
            this.f4044 = objOpenRawResourceFd;
            interfaceC0281.mo1540(objOpenRawResourceFd);
        } catch (Resources.NotFoundException e) {
            interfaceC0281.mo1541(e);
        }
    }

    @Override // com.bumptech.glide.load.data.InterfaceC0270
    /* renamed from: ﹳﹳ */
    public final int mo1531() {
        return 1;
    }
}
