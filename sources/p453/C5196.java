package p453;

import android.os.LocaleList;
import java.util.Locale;
import ـˈ.ˎـ;

/* renamed from: ﾞᐧ.ˏᵢ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C5196 implements InterfaceC5199 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final LocaleList f20021;

    public C5196(Object obj) {
        this.f20021 = AbstractC5200.m11586(obj);
    }

    public final boolean equals(Object obj) {
        return this.f20021.equals(((InterfaceC5199) obj).mo11583());
    }

    @Override // p453.InterfaceC5199
    public final Locale get(int i) {
        return this.f20021.get(i);
    }

    public final int hashCode() {
        return this.f20021.hashCode();
    }

    @Override // p453.InterfaceC5199
    public final boolean isEmpty() {
        return ˎـ.יʻ(this.f20021);
    }

    @Override // p453.InterfaceC5199
    public final int size() {
        return ˎـ.ـﹶ(this.f20021);
    }

    public final String toString() {
        return ˎـ.ﹶˆ(this.f20021);
    }

    @Override // p453.InterfaceC5199
    /* renamed from: ʽᐧ */
    public final Object mo11583() {
        return this.f20021;
    }

    @Override // p453.InterfaceC5199
    /* renamed from: ـﹶ */
    public final String mo11584() {
        return this.f20021.toLanguageTags();
    }
}
