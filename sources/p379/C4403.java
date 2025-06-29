package p379;

import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Logger;
import p080.AbstractC1702;
import p158.AbstractC2339;
import p366.C4155;
import p366.InterfaceC4161;
import ˆʽ.ᵎˏ;
import ـˈ.ˉᵎ;

/* renamed from: ᵢᐧ.ˎٴ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4403 implements Closeable {

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public static final Logger f16961 = Logger.getLogger(AbstractC4397.class.getName());

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final C4415 f16962;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final C4396 f16963;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final InterfaceC4161 f16964;

    public C4403(InterfaceC4161 interfaceC4161) {
        this.f16964 = interfaceC4161;
        C4415 c4415 = new C4415(interfaceC4161);
        this.f16962 = c4415;
        this.f16963 = new C4396(c4415);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f16964.close();
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x011d, code lost:
    
        if (r8 == false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x011f, code lost:
    
        r18.m9993(p158.AbstractC2339.f9298, true);
     */
    /* renamed from: ʽᐧ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m10003(p379.C4399 r17, int r18, int r19, int r20) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 318
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p379.C4403.m10003(ᵢᐧ.ˉי, int, int, int):void");
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final void m10004(C4399 c4399, int i, int i2, int i3) throws IOException {
        int i4;
        int i5 = 1;
        if (i3 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
        }
        boolean z = false;
        boolean z2 = (i2 & 1) != 0;
        if ((i2 & 8) != 0) {
            byte b = this.f16964.readByte();
            byte[] bArr = AbstractC2339.f9301;
            i4 = b & 255;
        } else {
            i4 = 0;
        }
        if ((i2 & 32) != 0) {
            InterfaceC4161 interfaceC4161 = this.f16964;
            interfaceC4161.readInt();
            interfaceC4161.readByte();
            byte[] bArr2 = AbstractC2339.f9301;
            c4399.getClass();
            i -= 5;
        }
        List listM10009 = m10009(AbstractC4408.m10015(i, i2, i4), i4, i2, i3);
        c4399.f16939.getClass();
        if (i3 != 0 && (i3 & 1) == 0) {
            z = true;
        }
        if (z) {
            C4413 c4413 = c4399.f16939;
            c4413.f17013.m9479(new C4400(c4413.f17009 + '[' + i3 + "] onHeaders", c4413, i3, listM10009, z2), 0L);
            return;
        }
        C4413 c44132 = c4399.f16939;
        synchronized (c44132) {
            C4401 c4401M10016 = c44132.m10016(i3);
            if (c4401M10016 != null) {
                c4401M10016.m9993(AbstractC2339.m6446(listM10009), z2);
                return;
            }
            if (c44132.f17021) {
                return;
            }
            if (i3 <= c44132.f17014) {
                return;
            }
            if (i3 % 2 == c44132.f17005 % 2) {
                return;
            }
            C4401 c4401 = new C4401(i3, c44132, false, z2, AbstractC2339.m6446(listM10009));
            c44132.f17014 = i3;
            c44132.f17004.put(Integer.valueOf(i3), c4401);
            c44132.f17023.m9484().m9479(new C4406(c44132.f17009 + '[' + i3 + "] onStream", c44132, c4401, i5), 0L);
        }
    }

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public final void m10005(C4399 c4399, int i, int i2, int i3) throws IOException {
        int i4;
        if (i3 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
        }
        if ((i2 & 8) != 0) {
            byte b = this.f16964.readByte();
            byte[] bArr = AbstractC2339.f9301;
            i4 = b & 255;
        } else {
            i4 = 0;
        }
        int i5 = this.f16964.readInt() & Integer.MAX_VALUE;
        List listM10009 = m10009(AbstractC4408.m10015(i - 4, i2, i4), i4, i2, i3);
        C4413 c4413 = c4399.f16939;
        synchronized (c4413) {
            if (c4413.f17003.contains(Integer.valueOf(i5))) {
                c4413.m10018(i5, 2);
                return;
            }
            c4413.f17003.add(Integer.valueOf(i5));
            c4413.f17013.m9479(new C4400(c4413.f17009 + '[' + i5 + "] onRequest", c4413, i5, listM10009), 0L);
        }
    }

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final void m10006(C4399 c4399, int i, int i2, int i3) throws IOException {
        if (i != 8) {
            throw new IOException(ˉᵎ.ˉⁱ("TYPE_PING length != 8: ", i));
        }
        if (i3 != 0) {
            throw new IOException("TYPE_PING streamId != 0");
        }
        int i4 = this.f16964.readInt();
        int i5 = this.f16964.readInt();
        if ((i2 & 1) == 0) {
            c4399.f16939.f17007.m9479(new C4419(ᵎˏ.ˎٴ(new StringBuilder(), c4399.f16939.f17009, " ping"), c4399.f16939, i4, i5, 0), 0L);
            return;
        }
        C4413 c4413 = c4399.f16939;
        synchronized (c4413) {
            try {
                if (i4 == 1) {
                    c4413.f17002++;
                } else if (i4 == 2) {
                    c4413.f17011++;
                } else if (i4 == 3) {
                    c4413.notifyAll();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final void m10007(C4399 c4399, int i, int i2) throws IOException {
        int i3;
        Object[] array;
        if (i < 8) {
            throw new IOException(ˉᵎ.ˉⁱ("TYPE_GOAWAY length < 8: ", i));
        }
        if (i2 != 0) {
            throw new IOException("TYPE_GOAWAY streamId != 0");
        }
        int i4 = this.f16964.readInt();
        int i5 = this.f16964.readInt();
        int i6 = i - 8;
        int[] iArrM5408 = AbstractC1702.m5408(14);
        int length = iArrM5408.length;
        int i7 = 0;
        while (true) {
            if (i7 >= length) {
                i3 = 0;
                break;
            }
            i3 = iArrM5408[i7];
            if (AbstractC1702.m5411(i3) == i5) {
                break;
            } else {
                i7++;
            }
        }
        if (i3 == 0) {
            throw new IOException(ˉᵎ.ˉⁱ("TYPE_GOAWAY unexpected error code: ", i5));
        }
        C4155 c4155Mo9522 = C4155.f16067;
        if (i6 > 0) {
            c4155Mo9522 = this.f16964.mo9522(i6);
        }
        c4399.getClass();
        c4155Mo9522.mo9566();
        C4413 c4413 = c4399.f16939;
        synchronized (c4413) {
            array = c4413.f17004.values().toArray(new C4401[0]);
            c4413.f17021 = true;
        }
        for (C4401 c4401 : (C4401[]) array) {
            if (c4401.f16952 > i4 && c4401.m9996()) {
                c4401.m9995(8);
                c4399.f16939.m10024(c4401.f16952);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:79:0x0140, code lost:
    
        throw new java.io.IOException(ـˈ.ˉᵎ.ˉⁱ("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: ", r9));
     */
    /* renamed from: ـﹶ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m10008(boolean r17, p379.C4399 r18) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 612
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p379.C4403.m10008(boolean, ᵢᐧ.ˉי):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0064, code lost:
    
        throw new java.io.IOException(ـˈ.ˉᵎ.ˉⁱ("Header index too large ", r7));
     */
    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List m10009(int r6, int r7, int r8, int r9) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 298
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p379.C4403.m10009(int, int, int, int):java.util.List");
    }
}
