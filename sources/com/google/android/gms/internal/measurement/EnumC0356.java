package com.google.android.gms.internal.measurement;

import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.measurement.ˆᵔ, reason: contains not printable characters */
/* loaded from: classes.dex */
public enum EnumC0356 {
    f2548("ADD"),
    f2560("AND"),
    f2574("APPLY"),
    f2549("ASSIGN"),
    f2588("BITWISE_AND"),
    f2595("BITWISE_LEFT_SHIFT"),
    f2557("BITWISE_NOT"),
    f2569("BITWISE_OR"),
    f2576("BITWISE_RIGHT_SHIFT"),
    f2599("BITWISE_UNSIGNED_RIGHT_SHIFT"),
    f2545("BITWISE_XOR"),
    f2566("BLOCK"),
    f2565("BREAK"),
    f2590("CASE"),
    f2561("CONST"),
    f2587("CONTINUE"),
    /* JADX INFO: Fake field, exist only in values array */
    EF11("CONTROL"),
    f2539("CREATE_ARRAY"),
    f2585("CREATE_OBJECT"),
    f2583("DEFAULT"),
    f2598("DEFINE_FUNCTION"),
    f2555("DIVIDE"),
    /* JADX INFO: Fake field, exist only in values array */
    EF11("DO"),
    f2558("EQUALS"),
    f2579("EXPRESSION_LIST"),
    f2547("FN"),
    f2553("FOR_IN"),
    f2593("FOR_IN_CONST"),
    f2559("FOR_IN_LET"),
    f2568("FOR_LET"),
    f2540("FOR_OF"),
    f2551("FOR_OF_CONST"),
    f2543("FOR_OF_LET"),
    f2571("GET"),
    /* JADX INFO: Fake field, exist only in values array */
    EF12("GET_CONTAINER_VARIABLE"),
    f2572("GET_INDEX"),
    f2570("GET_PROPERTY"),
    f2582("GREATER_THAN"),
    f2580("GREATER_THAN_EQUALS"),
    f2562("IDENTITY_EQUALS"),
    f2564("IDENTITY_NOT_EQUALS"),
    f2594("IF"),
    f2600("LESS_THAN"),
    f2538("LESS_THAN_EQUALS"),
    f2573("MODULUS"),
    f2556("MULTIPLY"),
    f2546("NEGATE"),
    f2550("NOT"),
    f2591("NOT_EQUALS"),
    f2563("NULL"),
    f2537("OR"),
    /* JADX INFO: Fake field, exist only in values array */
    EF8("PLUS_EQUALS"),
    f2544("POST_DECREMENT"),
    f2554("POST_INCREMENT"),
    f2575("QUOTE"),
    f2597("PRE_DECREMENT"),
    f2542("PRE_INCREMENT"),
    f2581("RETURN"),
    f2596("SET_PROPERTY"),
    f2584("SUBTRACT"),
    f2592("SWITCH"),
    f2589("TERNARY"),
    f2577("TYPEOF"),
    f2578("UNDEFINED"),
    f2586("VAR"),
    f2567("WHILE");


    /* renamed from: ʼʼ, reason: contains not printable characters */
    public static final HashMap f2541 = new HashMap();

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final int f2601;

    static {
        for (EnumC0356 enumC0356 : values()) {
            f2541.put(Integer.valueOf(enumC0356.f2601), enumC0356);
        }
    }

    EnumC0356(String str) {
        if (i > 100) {
            throw new AssertionError("Native functions over 100 are reserved for runtime implementations.");
        }
        this.f2601 = i;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.valueOf(this.f2601).toString();
    }
}
