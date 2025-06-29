package p070;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: ʿ.ﹶˆ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC1565 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final Object[] f6305 = new Object[0];

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static final Object[] m5155(Collection collection, Object[] objArr) {
        objArr.getClass();
        int size = collection.size();
        int i = 0;
        if (size == 0) {
            if (objArr.length <= 0) {
                return objArr;
            }
            objArr[0] = null;
            return objArr;
        }
        Iterator it = collection.iterator();
        if (!it.hasNext()) {
            if (objArr.length <= 0) {
                return objArr;
            }
            objArr[0] = null;
            return objArr;
        }
        Object[] objArrCopyOf = size <= objArr.length ? objArr : (Object[]) Array.newInstance(objArr.getClass().getComponentType(), size);
        while (true) {
            int i2 = i + 1;
            objArrCopyOf[i] = it.next();
            if (i2 >= objArrCopyOf.length) {
                if (!it.hasNext()) {
                    return objArrCopyOf;
                }
                int i3 = ((i2 * 3) + 1) >>> 1;
                if (i3 <= i2) {
                    i3 = 2147483645;
                    if (i2 >= 2147483645) {
                        throw new OutOfMemoryError();
                    }
                }
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, i3);
            } else if (!it.hasNext()) {
                if (objArrCopyOf != objArr) {
                    return Arrays.copyOf(objArrCopyOf, i2);
                }
                objArr[i2] = null;
                return objArr;
            }
            i = i2;
        }
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final Object[] m5156(Collection collection) {
        int size = collection.size();
        Object[] objArr = f6305;
        if (size == 0) {
            return objArr;
        }
        Iterator it = collection.iterator();
        if (!it.hasNext()) {
            return objArr;
        }
        Object[] objArrCopyOf = new Object[size];
        int i = 0;
        while (true) {
            int i2 = i + 1;
            objArrCopyOf[i] = it.next();
            if (i2 >= objArrCopyOf.length) {
                if (!it.hasNext()) {
                    return objArrCopyOf;
                }
                int i3 = ((i2 * 3) + 1) >>> 1;
                if (i3 <= i2) {
                    i3 = 2147483645;
                    if (i2 >= 2147483645) {
                        throw new OutOfMemoryError();
                    }
                }
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, i3);
            } else if (!it.hasNext()) {
                return Arrays.copyOf(objArrCopyOf, i2);
            }
            i = i2;
        }
    }
}
