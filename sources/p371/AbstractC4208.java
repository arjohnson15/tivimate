package p371;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.util.SparseArray;
import java.util.WeakHashMap;

/* renamed from: ᵢʿ.ˉⁱ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC4208 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final ThreadLocal f16226 = new ThreadLocal();

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static final WeakHashMap f16224 = new WeakHashMap(0);

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static final Object f16225 = new Object();

    /* JADX WARN: Removed duplicated region for block: B:38:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d9 A[ADDED_TO_REGION] */
    /* renamed from: ʽᐧ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.graphics.Typeface m9655(android.content.Context r16, int r17, android.util.TypedValue r18, int r19, p371.AbstractC4205 r20, boolean r21, boolean r22) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 296
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p371.AbstractC4208.m9655(android.content.Context, int, android.util.TypedValue, int, ᵢʿ.ʽᐧ, boolean, boolean):android.graphics.Typeface");
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static void m9656(C4207 c4207, int i, ColorStateList colorStateList, Resources.Theme theme) {
        synchronized (f16225) {
            try {
                WeakHashMap weakHashMap = f16224;
                SparseArray sparseArray = (SparseArray) weakHashMap.get(c4207);
                if (sparseArray == null) {
                    sparseArray = new SparseArray();
                    weakHashMap.put(c4207, sparseArray);
                }
                sparseArray.append(i, new C4217(colorStateList, c4207.f16223.getConfiguration(), theme));
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
