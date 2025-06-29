package p334;

import androidx.datastore.preferences.protobuf.AbstractC0018;
import androidx.datastore.preferences.protobuf.AbstractC0083;
import androidx.datastore.preferences.protobuf.C0024;
import androidx.datastore.preferences.protobuf.C0028;
import androidx.datastore.preferences.protobuf.C0031;
import androidx.datastore.preferences.protobuf.C0042;
import androidx.datastore.preferences.protobuf.C0062;
import androidx.datastore.preferences.protobuf.C0063;
import androidx.datastore.preferences.protobuf.C0085;
import androidx.datastore.preferences.protobuf.InterfaceC0025;
import androidx.datastore.preferences.protobuf.InterfaceC0068;
import androidx.datastore.preferences.protobuf.InvalidProtocolBufferException;
import androidx.datastore.preferences.protobuf.UninitializedMessageException;
import j$.util.DesugarCollections;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Map;
import p080.AbstractC1702;

/* renamed from: ᵎʽ.ʿʼ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3782 extends AbstractC0083 {
    private static final C3782 DEFAULT_INSTANCE;
    private static volatile InterfaceC0068 PARSER = null;
    public static final int PREFERENCES_FIELD_NUMBER = 1;
    private C0085 preferences_ = C0085.f519;

    static {
        C3782 c3782 = new C3782();
        DEFAULT_INSTANCE = c3782;
        AbstractC0083.m578(C3782.class, c3782);
    }

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public static C3782 m8861(FileInputStream fileInputStream) {
        C3782 c3782 = DEFAULT_INSTANCE;
        C0042 c0042 = new C0042(fileInputStream);
        C0062 c0062M495 = C0062.m495();
        AbstractC0083 abstractC0083 = (AbstractC0083) c3782.mo581(4);
        try {
            C0028 c0028 = C0028.f387;
            c0028.getClass();
            InterfaceC0025 interfaceC0025M308 = c0028.m308(abstractC0083.getClass());
            C0024 c0024 = (C0024) c0042.f507;
            if (c0024 == null) {
                c0024 = new C0024(c0042);
            }
            interfaceC0025M308.mo306(abstractC0083, c0024, c0062M495);
            interfaceC0025M308.mo303(abstractC0083);
            if (abstractC0083.m580()) {
                return (C3782) abstractC0083;
            }
            throw new InvalidProtocolBufferException(new UninitializedMessageException().getMessage());
        } catch (IOException e) {
            if (e.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e.getCause());
            }
            throw new InvalidProtocolBufferException(e.getMessage());
        } catch (RuntimeException e2) {
            if (e2.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e2.getCause());
            }
            throw e2;
        }
    }

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public static C3784 m8862() {
        return (C3784) ((AbstractC0018) DEFAULT_INSTANCE.mo581(5));
    }

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public static C0085 m8863(C3782 c3782) {
        C0085 c0085 = c3782.preferences_;
        if (!c0085.f520) {
            c3782.preferences_ = c0085.m583();
        }
        return c3782.preferences_;
    }

    /* renamed from: ˉי, reason: contains not printable characters */
    public final Map m8864() {
        return DesugarCollections.unmodifiableMap(this.preferences_);
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
                return new C0063(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"preferences_", AbstractC3788.f14631});
            case 3:
                return new C3782();
            case 4:
                return new C3784(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case C3789.STRING_SET_FIELD_NUMBER /* 6 */:
                InterfaceC0068 c0031 = PARSER;
                if (c0031 == null) {
                    synchronized (C3782.class) {
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
