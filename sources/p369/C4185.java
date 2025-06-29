package p369;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Locale;
import p428.AbstractC4928;

/* renamed from: ᵢʽ.ˉⁱ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4185 implements InterfaceC4189 {

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public static final Charset f16139 = Charset.forName("UTF-8");

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public C4187 f16140;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final File f16141;

    public C4185(File file) {
        this.f16141 = file;
    }

    @Override // p369.InterfaceC4189
    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public final void mo9593(String str, long j) {
        m9595();
        if (this.f16140 == null) {
            return;
        }
        if (str == null) {
            str = "null";
        }
        try {
            if (str.length() > 16384) {
                str = "..." + str.substring(str.length() - 16384);
            }
            this.f16140.m9606(String.format(Locale.US, "%d %s%n", Long.valueOf(j), str.replaceAll("\r", " ").replaceAll("\n", " ")).getBytes(f16139));
            while (!this.f16140.m9601() && this.f16140.m9611() > 65536) {
                this.f16140.m9602();
            }
        } catch (IOException e) {
        }
    }

    @Override // p369.InterfaceC4189
    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final void mo9594() {
        AbstractC4928.m11051(this.f16140, "There was a problem closing the Crashlytics log file.");
        this.f16140 = null;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void m9595() {
        File file = this.f16141;
        if (this.f16140 == null) {
            try {
                this.f16140 = new C4187(file);
            } catch (IOException e) {
                String str = "Could not open log file: " + file;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x000a  */
    @Override // p369.InterfaceC4189
    /* renamed from: ٴˎ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String mo9596() {
        /*
            r7 = this;
            java.io.File r0 = r7.f16141
            boolean r0 = r0.exists()
            r1 = 0
            r2 = 0
            if (r0 != 0) goto Lc
        La:
            r4 = r1
            goto L36
        Lc:
            r7.m9595()
            ᵢʽ.ˏʾ r0 = r7.f16140
            if (r0 != 0) goto L14
            goto La
        L14:
            int[] r3 = new int[]{r2}
            int r0 = r0.m9611()
            byte[] r0 = new byte[r0]
            ᵢʽ.ˏʾ r4 = r7.f16140     // Catch: java.io.IOException -> L29
            ᵢʽ.ʿʼ r5 = new ᵢʽ.ʿʼ     // Catch: java.io.IOException -> L29
            r5.<init>(r0, r3)     // Catch: java.io.IOException -> L29
            r4.m9610(r5)     // Catch: java.io.IOException -> L29
            goto L2f
        L29:
            r4 = move-exception
            java.lang.String r5 = "FirebaseCrashlytics"
            java.lang.String r6 = "A problem occurred while reading the Crashlytics log file."
        L2f:
            ʻـ.ʿʼ r4 = new ʻـ.ʿʼ
            r3 = r3[r2]
            r4.<init>(r3, r0)
        L36:
            if (r4 != 0) goto L3a
            r3 = r1
            goto L45
        L3a:
            int r0 = r4.f4469
            byte[] r3 = new byte[r0]
            java.lang.Object r4 = r4.f4468
            byte[] r4 = (byte[]) r4
            java.lang.System.arraycopy(r4, r2, r3, r2, r0)
        L45:
            if (r3 == 0) goto L4e
            java.lang.String r1 = new java.lang.String
            java.nio.charset.Charset r0 = p369.C4185.f16139
            r1.<init>(r3, r0)
        L4e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p369.C4185.mo9596():java.lang.String");
    }
}
