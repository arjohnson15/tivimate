package p038;

import j$.util.concurrent.ConcurrentHashMap;
import java.io.Closeable;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;
import p055.InterfaceC1332;
import p180.AbstractC2501;
import p296.C3486;
import p344.AbstractC3917;
import p344.InterfaceC3918;
import p390.C4514;
import ʿﾞ.ﹳﹳ;

/* renamed from: ʽʼ.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1269 implements Closeable {

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public static final InterfaceC3918 f5203 = AbstractC3917.m9105(C1269.class);

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public C1268 f5204;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public C4514 f5205;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public InterfaceC1332 f5206;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public ConcurrentHashMap f5207;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        InterfaceC3918 interfaceC3918 = f5203;
        interfaceC3918.mo5514();
        for (C3486 c3486 : this.f5207.values()) {
            try {
                c3486.close();
            } catch (Exception e) {
                interfaceC3918.mo5517(c3486.f13464, "Error closing connection to host {}");
                interfaceC3918.mo5515(e);
            }
        }
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C3486 m4527(String str) {
        C3486 c3486;
        synchronized (this) {
            try {
                String str2 = str + ":445";
                c3486 = (C3486) this.f5207.get(str2);
                if (c3486 != null && ((AtomicInteger) ((ﹳﹳ) c3486).ᐧⁱ).getAndIncrement() <= 0) {
                    c3486 = null;
                }
                if (c3486 == null || !c3486.f13473.m7605()) {
                    c3486 = new C3486(this.f5204, this, this.f5205);
                    try {
                        c3486.m8377(str);
                        this.f5207.put(str2, c3486);
                    } catch (IOException e) {
                        AutoCloseable[] autoCloseableArr = {c3486};
                        int i = AbstractC2501.f9933;
                        AutoCloseable autoCloseable = autoCloseableArr[0];
                        if (autoCloseable != null) {
                            try {
                                autoCloseable.close();
                            } catch (Exception unused) {
                            }
                        }
                        throw e;
                    }
                }
            } finally {
            }
        }
        return c3486;
    }
}
