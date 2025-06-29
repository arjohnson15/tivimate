package p188;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import java.io.File;
import p046.C1303;
import p063.C1447;
import p261.InterfaceC3251;
import p314.C3598;
import p314.InterfaceC3595;

/* renamed from: ˎʾ.ﹳˑ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2635 implements InterfaceC3595 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final /* synthetic */ int f10445;

    @Override // p314.InterfaceC3595
    /* renamed from: ʽᐧ */
    public final /* bridge */ /* synthetic */ boolean mo4999(Object obj, C3598 c3598) {
        switch (this.f10445) {
            case 0:
                break;
            case 1:
                break;
            default:
                break;
        }
        return true;
    }

    @Override // p314.InterfaceC3595
    /* renamed from: ـﹶ */
    public final InterfaceC3251 mo5001(Object obj, int i, int i2, C3598 c3598) {
        switch (this.f10445) {
            case 0:
                return new C1303(1, (Bitmap) obj);
            case 1:
                Drawable drawable = (Drawable) obj;
                if (drawable != null) {
                    return new C1447(drawable, 1);
                }
                return null;
            default:
                return new C1303((File) obj);
        }
    }
}
