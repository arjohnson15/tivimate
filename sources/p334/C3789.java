package p334;

import androidx.datastore.preferences.protobuf.AbstractC0018;
import androidx.datastore.preferences.protobuf.AbstractC0083;
import androidx.datastore.preferences.protobuf.C0031;
import androidx.datastore.preferences.protobuf.C0063;
import androidx.datastore.preferences.protobuf.InterfaceC0068;
import p080.AbstractC1702;

/* renamed from: ᵎʽ.ﹶˆ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3789 extends AbstractC0083 {
    public static final int BOOLEAN_FIELD_NUMBER = 1;
    private static final C3789 DEFAULT_INSTANCE;
    public static final int DOUBLE_FIELD_NUMBER = 7;
    public static final int FLOAT_FIELD_NUMBER = 2;
    public static final int INTEGER_FIELD_NUMBER = 3;
    public static final int LONG_FIELD_NUMBER = 4;
    private static volatile InterfaceC0068 PARSER = null;
    public static final int STRING_FIELD_NUMBER = 5;
    public static final int STRING_SET_FIELD_NUMBER = 6;
    private int bitField0_;
    private int valueCase_ = 0;
    private Object value_;

    static {
        C3789 c3789 = new C3789();
        DEFAULT_INSTANCE = c3789;
        AbstractC0083.m578(C3789.class, c3789);
    }

    /* renamed from: ˉי, reason: contains not printable characters */
    public static void m8869(C3789 c3789, String str) {
        c3789.getClass();
        str.getClass();
        c3789.valueCase_ = 5;
        c3789.value_ = str;
    }

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public static void m8870(C3789 c3789, double d) {
        c3789.valueCase_ = 7;
        c3789.value_ = Double.valueOf(d);
    }

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public static void m8871(C3789 c3789, boolean z) {
        c3789.valueCase_ = 1;
        c3789.value_ = Boolean.valueOf(z);
    }

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public static void m8872(C3789 c3789, C3786 c3786) {
        c3789.getClass();
        c3789.value_ = c3786.m280();
        c3789.valueCase_ = 6;
    }

    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public static void m8873(C3789 c3789, int i) {
        c3789.valueCase_ = 3;
        c3789.value_ = Integer.valueOf(i);
    }

    /* renamed from: יʻ, reason: contains not printable characters */
    public static C3783 m8874() {
        return (C3783) ((AbstractC0018) DEFAULT_INSTANCE.mo581(5));
    }

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public static void m8875(C3789 c3789, float f) {
        c3789.valueCase_ = 2;
        c3789.value_ = Float.valueOf(f);
    }

    /* renamed from: ᵎـ, reason: contains not printable characters */
    public static C3789 m8876() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public static void m8877(C3789 c3789, long j) {
        c3789.valueCase_ = 4;
        c3789.value_ = Long.valueOf(j);
    }

    /* renamed from: ʿˏ, reason: contains not printable characters */
    public final long m8878() {
        if (this.valueCase_ == 4) {
            return ((Long) this.value_).longValue();
        }
        return 0L;
    }

    /* renamed from: ˋˊ, reason: contains not printable characters */
    public final String m8879() {
        return this.valueCase_ == 5 ? (String) this.value_ : "";
    }

    /* renamed from: ˎٴ, reason: contains not printable characters */
    public final double m8880() {
        if (this.valueCase_ == 7) {
            return ((Double) this.value_).doubleValue();
        }
        return 0.0d;
    }

    /* renamed from: ˑי, reason: contains not printable characters */
    public final boolean m8881() {
        if (this.valueCase_ == 1) {
            return ((Boolean) this.value_).booleanValue();
        }
        return false;
    }

    /* renamed from: ᵎˏ, reason: contains not printable characters */
    public final float m8882() {
        if (this.valueCase_ == 2) {
            return ((Float) this.value_).floatValue();
        }
        return 0.0f;
    }

    /* renamed from: ﹳˎ, reason: contains not printable characters */
    public final int m8883() {
        if (this.valueCase_ == 3) {
            return ((Integer) this.value_).intValue();
        }
        return 0;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0083
    /* renamed from: ﹳﹳ */
    public final Object mo581(int i) {
        switch (AbstractC1702.m5411(i)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new C0063(DEFAULT_INSTANCE, "\u0001\u0007\u0001\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001:\u0000\u00024\u0000\u00037\u0000\u00045\u0000\u0005;\u0000\u0006<\u0000\u00073\u0000", new Object[]{"value_", "valueCase_", "bitField0_", C3787.class});
            case 3:
                return new C3789();
            case 4:
                return new C3783(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case STRING_SET_FIELD_NUMBER /* 6 */:
                InterfaceC0068 c0031 = PARSER;
                if (c0031 == null) {
                    synchronized (C3789.class) {
                        try {
                            c0031 = PARSER;
                            if (c0031 == null) {
                                c0031 = new C0031();
                                PARSER = c0031;
                            }
                        } finally {
                        }
                    }
                }
                return c0031;
            default:
                throw new UnsupportedOperationException();
        }
    }

    /* renamed from: ﾞʽ, reason: contains not printable characters */
    public final int m8884() {
        switch (this.valueCase_) {
            case 0:
                return 8;
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            case 5:
                return 5;
            case STRING_SET_FIELD_NUMBER /* 6 */:
                return 6;
            case DOUBLE_FIELD_NUMBER /* 7 */:
                return 7;
            default:
                return 0;
        }
    }

    /* renamed from: ﾞˊ, reason: contains not printable characters */
    public final C3787 m8885() {
        return this.valueCase_ == 6 ? (C3787) this.value_ : C3787.m8865();
    }
}
