package p112;

import android.os.Bundle;
import android.text.Spanned;
import p383.AbstractC4470;

/* renamed from: ˆﾞ.ﹳﹳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC1815 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static final String f7031;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public static final String f7032;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static final String f7033;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final String f7034;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static final String f7035;

    static {
        int i = AbstractC4470.f17202;
        f7034 = Integer.toString(0, 36);
        f7031 = Integer.toString(1, 36);
        f7033 = Integer.toString(2, 36);
        f7035 = Integer.toString(3, 36);
        f7032 = Integer.toString(4, 36);
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static Bundle m5557(Spanned spanned, InterfaceC1813 interfaceC1813, int i, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putInt(f7034, spanned.getSpanStart(interfaceC1813));
        bundle2.putInt(f7031, spanned.getSpanEnd(interfaceC1813));
        bundle2.putInt(f7033, spanned.getSpanFlags(interfaceC1813));
        bundle2.putInt(f7035, i);
        if (bundle != null) {
            bundle2.putBundle(f7032, bundle);
        }
        return bundle2;
    }
}
