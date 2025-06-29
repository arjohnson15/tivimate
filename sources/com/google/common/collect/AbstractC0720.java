package com.google.common.collect;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.common.collect.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC0720 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public transient Collection f3517;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public transient Map f3518;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public transient Set f3519;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC0720) {
            return mo2920().equals(((AbstractC0720) obj).mo2920());
        }
        return false;
    }

    public final int hashCode() {
        return mo2920().hashCode();
    }

    public final String toString() {
        return mo2920().toString();
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public boolean mo2919(Object obj) {
        Iterator it = mo2920().values().iterator();
        while (it.hasNext()) {
            if (((Collection) it.next()).contains(obj)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public abstract Map mo2920();
}
