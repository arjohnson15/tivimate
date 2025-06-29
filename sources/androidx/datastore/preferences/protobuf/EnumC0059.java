package androidx.datastore.preferences.protobuf;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF12' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* renamed from: androidx.datastore.preferences.protobuf.ᐧᴵ, reason: contains not printable characters */
/* loaded from: classes.dex */
public class EnumC0059 {

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public static final C0013 f472;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public static final C0039 f473;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public static final C0007 f474;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC0059[] f475;

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final int f476;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final EnumC0081 f477;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC0059 EF10;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC0059 EF11;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC0059 EF12;

    static {
        EnumC0059 enumC0059 = new EnumC0059("DOUBLE", 0, EnumC0081.DOUBLE, 1);
        EnumC0059 enumC00592 = new EnumC0059("FLOAT", 1, EnumC0081.FLOAT, 5);
        EnumC0081 enumC0081 = EnumC0081.LONG;
        EnumC0059 enumC00593 = new EnumC0059("INT64", 2, enumC0081, 0);
        EnumC0059 enumC00594 = new EnumC0059("UINT64", 3, enumC0081, 0);
        EnumC0081 enumC00812 = EnumC0081.INT;
        EnumC0059 enumC00595 = new EnumC0059("INT32", 4, enumC00812, 0);
        EnumC0059 enumC00596 = new EnumC0059("FIXED64", 5, enumC0081, 1);
        EnumC0059 enumC00597 = new EnumC0059("FIXED32", 6, enumC00812, 5);
        EnumC0059 enumC00598 = new EnumC0059("BOOL", 7, EnumC0081.BOOLEAN, 0);
        C0039 c0039 = new C0039("STRING", 8, EnumC0081.STRING, 2);
        f473 = c0039;
        EnumC0081 enumC00813 = EnumC0081.MESSAGE;
        C0007 c0007 = new C0007("GROUP", 9, enumC00813, 3);
        f474 = c0007;
        C0013 c0013 = new C0013("MESSAGE", 10, enumC00813, 2);
        f472 = c0013;
        f475 = new EnumC0059[]{enumC0059, enumC00592, enumC00593, enumC00594, enumC00595, enumC00596, enumC00597, enumC00598, c0039, c0007, c0013, new C0027("BYTES", 11, EnumC0081.BYTE_STRING, 2), new EnumC0059("UINT32", 12, enumC00812, 0), new EnumC0059("ENUM", 13, EnumC0081.ENUM, 0), new EnumC0059("SFIXED32", 14, enumC00812, 5), new EnumC0059("SFIXED64", 15, enumC0081, 1), new EnumC0059("SINT32", 16, enumC00812, 0), new EnumC0059("SINT64", 17, enumC0081, 0)};
    }

    public EnumC0059(String str, int i, EnumC0081 enumC0081, int i2) {
        this.f477 = enumC0081;
        this.f476 = i2;
    }

    public static EnumC0059 valueOf(String str) {
        return (EnumC0059) Enum.valueOf(EnumC0059.class, str);
    }

    public static EnumC0059[] values() {
        return (EnumC0059[]) f475.clone();
    }
}
