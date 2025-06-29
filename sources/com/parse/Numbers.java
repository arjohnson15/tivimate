package com.parse;

/* loaded from: classes.dex */
abstract class Numbers {
    public static Number add(Number number, Number number2) {
        if ((number instanceof Double) || (number2 instanceof Double)) {
            return Double.valueOf(number2.doubleValue() + number.doubleValue());
        }
        if ((number instanceof Float) || (number2 instanceof Float)) {
            return Float.valueOf(number2.floatValue() + number.floatValue());
        }
        if ((number instanceof Long) || (number2 instanceof Long)) {
            return Long.valueOf(number2.longValue() + number.longValue());
        }
        if ((number instanceof Integer) || (number2 instanceof Integer)) {
            return Integer.valueOf(number2.intValue() + number.intValue());
        }
        if ((number instanceof Short) || (number2 instanceof Short)) {
            return Integer.valueOf(number2.shortValue() + number.shortValue());
        }
        if (!(number instanceof Byte) && !(number2 instanceof Byte)) {
            throw new RuntimeException("Unknown number type.");
        }
        return Integer.valueOf(number2.byteValue() + number.byteValue());
    }

    public static int compare(Number number, Number number2) {
        if ((number instanceof Double) || (number2 instanceof Double)) {
            return (int) Math.signum(number.doubleValue() - number2.doubleValue());
        }
        if ((number instanceof Float) || (number2 instanceof Float)) {
            return (int) Math.signum(number.floatValue() - number2.floatValue());
        }
        if ((number instanceof Long) || (number2 instanceof Long)) {
            long jLongValue = number.longValue() - number2.longValue();
            if (jLongValue < 0) {
                return -1;
            }
            return jLongValue > 0 ? 1 : 0;
        }
        if ((number instanceof Integer) || (number2 instanceof Integer)) {
            return number.intValue() - number2.intValue();
        }
        if ((number instanceof Short) || (number2 instanceof Short)) {
            return number.shortValue() - number2.shortValue();
        }
        if ((number instanceof Byte) || (number2 instanceof Byte)) {
            return number.byteValue() - number2.byteValue();
        }
        throw new RuntimeException("Unknown number type.");
    }
}
