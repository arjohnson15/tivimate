package com.parse;

import j$.util.Objects;

/* loaded from: classes.dex */
abstract class ParseTextUtils {
    public static boolean equals(CharSequence charSequence, CharSequence charSequence2) {
        return Objects.equals(charSequence, charSequence2);
    }

    public static boolean isEmpty(CharSequence charSequence) {
        return charSequence == null || charSequence.length() == 0;
    }

    public static String join(CharSequence charSequence, Iterable iterable) {
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (Object obj : iterable) {
            if (z) {
                z = false;
            } else {
                sb.append(charSequence);
            }
            sb.append(obj);
        }
        return sb.toString();
    }
}
