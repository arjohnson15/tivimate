package p225;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import java.lang.reflect.Constructor;
import p200.C2755;
import p222.C2900;
import p222.C2909;
import p222.C2914;
import p222.C2936;
import p222.C2945;

/* renamed from: ˏᵢ.ـˆ, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C3006 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final Object[] f11541 = new Object[2];

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static final Class[] f11534 = {Context.class, AttributeSet.class};

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static final int[] f11537 = {R.attr.onClick};

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static final int[] f11540 = {R.attr.accessibilityHeading};

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public static final int[] f11535 = {R.attr.accessibilityPaneTitle};

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public static final int[] f11538 = {R.attr.screenReaderFocusable};

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public static final String[] f11539 = {"android.widget.", "android.view.", "android.webkit."};

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public static final C2755 f11536 = new C2755(0);

    /* renamed from: ʽᐧ */
    public C2914 mo2907(Context context, AttributeSet attributeSet) {
        return new C2914(context, attributeSet, org.lsposed.hiddenapibypass.library.R.attr._2_res_0x7f0400b8);
    }

    /* renamed from: ʿʼ */
    public C2900 mo2908(Context context, AttributeSet attributeSet) {
        return new C2900(context, attributeSet);
    }

    /* renamed from: ˑʽ */
    public C2945 mo2909(Context context, AttributeSet attributeSet) {
        return new C2945(context, attributeSet, org.lsposed.hiddenapibypass.library.R.attr._2_res_0x7f0400e3);
    }

    /* renamed from: ـﹶ */
    public C2909 mo2910(Context context, AttributeSet attributeSet) {
        return new C2909(context, attributeSet);
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final View m7435(Context context, String str, String str2) throws NoSuchMethodException, SecurityException {
        String strConcat;
        C2755 c2755 = f11536;
        Constructor constructor = (Constructor) c2755.get(str);
        if (constructor == null) {
            if (str2 != null) {
                try {
                    strConcat = str2.concat(str);
                } catch (Exception unused) {
                    return null;
                }
            } else {
                strConcat = str;
            }
            constructor = Class.forName(strConcat, false, context.getClassLoader()).asSubclass(View.class).getConstructor(f11534);
            c2755.put(str, constructor);
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.f11541);
    }

    /* renamed from: ﹳﹳ */
    public C2936 mo2911(Context context, AttributeSet attributeSet) {
        return new C2936(context, attributeSet);
    }
}
