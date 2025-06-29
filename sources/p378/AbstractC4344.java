package p378;

import android.view.View;
import java.lang.reflect.Field;

/* renamed from: ᵢٴ.ˊᵔ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC4344 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static final Field f16831;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static final Field f16832;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final Field f16833;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static final boolean f16834;

    static {
        try {
            Field declaredField = View.class.getDeclaredField("mAttachInfo");
            f16833 = declaredField;
            declaredField.setAccessible(true);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            Field declaredField2 = cls.getDeclaredField("mStableInsets");
            f16831 = declaredField2;
            declaredField2.setAccessible(true);
            Field declaredField3 = cls.getDeclaredField("mContentInsets");
            f16832 = declaredField3;
            declaredField3.setAccessible(true);
            f16834 = true;
        } catch (ReflectiveOperationException e) {
            String str = "Failed to get visible insets from AttachInfo " + e.getMessage();
        }
    }
}
