package p325;

import android.support.v4.media.session.AbstractC0001;
import java.io.File;
import java.util.zip.GZIPInputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipException;
import java.util.zip.ZipInputStream;
import kotlin.NoWhenBranchMatchedException;
import p158.AbstractC2339;
import p252.AbstractC3139;
import p288.C3406;
import p289.AbstractC3407;
import p317.AbstractC3616;
import p317.AbstractC3629;
import p332.C3778;
import p338.InterfaceC3856;
import p366.C4149;
import p430.C4994;
import ˊﹶ.ˋˉ;
import ˏʼ.ʽᐧ;
import ٴⁱ.ˋˊ;

/* renamed from: ᴵˎ.ﾞᵢ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC3720 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final C3406 f14431 = new C3406(new ˋˊ(14));

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static final C3406 f14430 = new C3406(new ˋˊ(15));

    /* JADX WARN: Removed duplicated region for block: B:110:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x03b9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:170:? A[LOOP:3: B:127:0x0368->B:170:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, ٴˑ.ˑʽ] */
    /* renamed from: ʽᐧ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.String m8684(java.lang.String r17, java.util.Collection r18) {
        /*
            Method dump skipped, instructions count: 972
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p325.AbstractC3720.m8684(java.lang.String, java.util.Collection):java.lang.String");
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static final void m8685(File file, ﹶⁱ r6, InterfaceC3856 interfaceC3856) {
        C4149 c4149 = new C4149(ʽᐧ.ˆʿ(file));
        try {
            C3778 c3778 = new C3778(2, c4149);
            int iOrdinal = r6.ordinal();
            if (iOrdinal == 0) {
                try {
                    interfaceC3856.mo4036(c3778);
                    AbstractC0001.m5(c3778, null);
                } finally {
                }
            } else if (iOrdinal == 1) {
                ZipInputStream zipInputStream = new ZipInputStream(c3778);
                try {
                    ZipEntry nextEntry = zipInputStream.getNextEntry();
                    if (nextEntry != null && !nextEntry.isDirectory()) {
                        interfaceC3856.mo4036(zipInputStream);
                    }
                    AbstractC0001.m5(zipInputStream, null);
                } finally {
                }
            } else {
                if (iOrdinal != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                try {
                    GZIPInputStream gZIPInputStream = new GZIPInputStream(c3778);
                    try {
                        interfaceC3856.mo4036(gZIPInputStream);
                        AbstractC0001.m5(gZIPInputStream, null);
                    } finally {
                    }
                } catch (ZipException unused) {
                    AbstractC3407.f13261.ᴵʼ("TvGuideRepository");
                    ˋˉ.ﾞᐧ(new Object[0]);
                    AbstractC2339.m6438(c3778);
                    m8685(file, ﹶⁱ.ᐧⁱ, interfaceC3856);
                }
            }
            AbstractC0001.m5(c4149, null);
        } finally {
        }
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final ﹶⁱ m8686(C4994 c4994) {
        String strM7775 = AbstractC3139.m7775(c4994);
        String strM7711 = strM7775.length() > 0 ? AbstractC3139.m7711(strM7775) : AbstractC3139.m7711(AbstractC3616.m8531(c4994.f18887.f19052.f18962, "?"));
        boolean zM8561 = AbstractC3629.m8561(strM7711, ".xml", false);
        ﹶⁱ r2 = ﹶⁱ.ᐧⁱ;
        return zM8561 ? r2 : AbstractC3629.m8561(strM7711, ".zip", false) ? ﹶⁱ.ˆʿ : (AbstractC3629.m8561(strM7711, ".gz", false) || AbstractC3629.m8561(strM7711, ".gzip", false)) ? ﹶⁱ.ˎˑ : r2;
    }
}
