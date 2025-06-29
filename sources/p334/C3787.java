package p334;

import androidx.datastore.preferences.protobuf.AbstractC0012;
import androidx.datastore.preferences.protobuf.AbstractC0018;
import androidx.datastore.preferences.protobuf.AbstractC0077;
import androidx.datastore.preferences.protobuf.AbstractC0083;
import androidx.datastore.preferences.protobuf.C0031;
import androidx.datastore.preferences.protobuf.C0033;
import androidx.datastore.preferences.protobuf.C0056;
import androidx.datastore.preferences.protobuf.C0063;
import androidx.datastore.preferences.protobuf.InterfaceC0019;
import androidx.datastore.preferences.protobuf.InterfaceC0048;
import androidx.datastore.preferences.protobuf.InterfaceC0068;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import p080.AbstractC1702;

/* renamed from: ᵎʽ.ᐧʻ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3787 extends AbstractC0083 {
    private static final C3787 DEFAULT_INSTANCE;
    private static volatile InterfaceC0068 PARSER = null;
    public static final int STRINGS_FIELD_NUMBER = 1;
    private InterfaceC0048 strings_ = C0033.f400;

    static {
        C3787 c3787 = new C3787();
        DEFAULT_INSTANCE = c3787;
        AbstractC0083.m578(C3787.class, c3787);
    }

    /* renamed from: ˉי, reason: contains not printable characters */
    public static C3787 m8865() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public static C3786 m8866() {
        return (C3786) ((AbstractC0018) DEFAULT_INSTANCE.mo581(5));
    }

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public static void m8867(C3787 c3787, Set set) {
        InterfaceC0048 interfaceC0048 = c3787.strings_;
        if (!((AbstractC0012) interfaceC0048).f358) {
            int size = interfaceC0048.size();
            c3787.strings_ = interfaceC0048.mo344(size == 0 ? 10 : size * 2);
        }
        List list = c3787.strings_;
        Charset charset = AbstractC0077.f505;
        set.getClass();
        if (!(set instanceof InterfaceC0019)) {
            if (list instanceof ArrayList) {
                ((ArrayList) list).ensureCapacity(set.size() + list.size());
            }
            int size2 = list.size();
            for (Object obj : set) {
                if (obj == null) {
                    String str = "Element at index " + (list.size() - size2) + " is null.";
                    for (int size3 = list.size() - 1; size3 >= size2; size3--) {
                        list.remove(size3);
                    }
                    throw new NullPointerException(str);
                }
                list.add(obj);
            }
            return;
        }
        List listMo286 = ((InterfaceC0019) set).mo286();
        InterfaceC0019 interfaceC0019 = (InterfaceC0019) list;
        int size4 = list.size();
        for (Object obj2 : listMo286) {
            if (obj2 == null) {
                String str2 = "Element at index " + (interfaceC0019.size() - size4) + " is null.";
                for (int size5 = interfaceC0019.size() - 1; size5 >= size4; size5--) {
                    interfaceC0019.remove(size5);
                }
                throw new NullPointerException(str2);
            }
            if (obj2 instanceof C0056) {
                interfaceC0019.mo284((C0056) obj2);
            } else {
                interfaceC0019.add((String) obj2);
            }
        }
    }

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public final InterfaceC0048 m8868() {
        return this.strings_;
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
                return new C0063(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"strings_"});
            case 3:
                return new C3787();
            case 4:
                return new C3786(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case C3789.STRING_SET_FIELD_NUMBER /* 6 */:
                InterfaceC0068 c0031 = PARSER;
                if (c0031 == null) {
                    synchronized (C3787.class) {
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
}
