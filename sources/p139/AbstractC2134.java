package p139;

import android.animation.ObjectAnimator;
import android.animation.TypeConverter;
import android.graphics.Path;
import android.util.Property;

/* renamed from: ˉˋ.ˏᴵ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC2134 {
    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static <T, V> ObjectAnimator m6032(T t, Property<T, V> property, Path path) {
        return ObjectAnimator.ofObject(t, property, (TypeConverter) null, path);
    }
}
