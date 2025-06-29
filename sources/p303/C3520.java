package p303;

import android.support.v4.media.session.AbstractC0001;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import net.lingala.zip4j.exception.ZipException;
import p007.C0945;
import p023.C1147;
import p028.AbstractC1173;
import p028.C1172;
import p223.AbstractC2978;
import p298.C3493;
import p298.C3496;
import p298.C3501;
import ʿﾞ.ﹳﹳ;
import ˆʽ.ᵎˏ;
import ˊﹶ.ˋˉ;
import ٴᐧ.ᐧⁱ;

/* renamed from: ᐧʾ.ﹳﹳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3520 extends ﹳﹳ {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final C3496 f13632;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public AbstractC1173 f13633;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final /* synthetic */ int f13634;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public char[] f13635;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3520(C3496 c3496, ᐧⁱ r3, ˋˉ r4) {
        this(c3496, r3, r4, (byte) 0);
        this.f13634 = 1;
    }

    public C3520(C3496 c3496, ᐧⁱ r2, ˋˉ r3, byte b) {
        super(r3);
        this.f13632 = c3496;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C3520(C3496 c3496, char[] cArr, ᐧⁱ r4, ˋˉ r5) {
        this(c3496, r4, r5, (byte) 0);
        this.f13634 = 0;
        this.f13635 = cArr;
    }

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final void m8403(ﹳﹳ r11, C0945 c0945) throws IOException {
        List<C3493> listSingletonList;
        AbstractC1173 abstractC1173;
        switch (this.f13634) {
            case 0:
                C3516 c3516 = (C3516) r11;
                try {
                    C1172 c1172M8405 = m8405((C3501) ((ﹳﹳ) c3516).ᐧⁱ);
                    try {
                        Iterator it = this.f13632.f13532.f4789.iterator();
                        while (it.hasNext()) {
                            C3493 c3493 = (C3493) it.next();
                            if (c3493.f13492.startsWith("__MACOSX")) {
                                c0945.m3811(c3493.f13499);
                            } else {
                                this.f13633.mo4226(c3493);
                                m8404(c1172M8405, c3493, c3516.f13626, null, c0945, new byte[((C3501) ((ﹳﹳ) c3516).ᐧⁱ).f13558]);
                                ˊˆ();
                            }
                        }
                        c1172M8405.close();
                        AbstractC1173 abstractC11732 = this.f13633;
                        if (abstractC11732 != null) {
                            abstractC11732.close();
                            return;
                        }
                        return;
                    } finally {
                    }
                } finally {
                    AbstractC1173 abstractC11733 = this.f13633;
                    if (abstractC11733 != null) {
                        abstractC11733.close();
                    }
                }
            default:
                C3515 c3515 = (C3515) r11;
                String str = c3515.f13624;
                C3501 c3501 = (C3501) ((ﹳﹳ) c3515).ᐧⁱ;
                boolean zM7369 = AbstractC2978.m7369(str);
                C3496 c3496 = this.f13632;
                if (zM7369) {
                    ArrayList arrayList = c3496.f13532.f4789;
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        C3493 c34932 = (C3493) it2.next();
                        if (c34932.f13492.startsWith(str)) {
                            arrayList2.add(c34932);
                        }
                    }
                    listSingletonList = arrayList2;
                } else {
                    C3493 c3493M10 = AbstractC0001.m10(c3496, str);
                    if (c3493M10 == null) {
                        throw new ZipException(ᵎˏ.ˑי("No file found with name ", str, " in zip file"));
                    }
                    listSingletonList = Collections.singletonList(c3493M10);
                }
                try {
                    this.f13633 = AbstractC2978.m7362(this.f13632);
                    C1172 c1172 = new C1172(this.f13633, this.f13635, c3501);
                    try {
                        byte[] bArr = new byte[c3501.f13558];
                        for (C3493 c34933 : listSingletonList) {
                            this.f13633.mo4226(c34933);
                            String strReplaceFirst = c3515.f13625;
                            String str2 = c3515.f13624;
                            if (AbstractC2978.m7367(strReplaceFirst) && AbstractC2978.m7369(str2)) {
                                strReplaceFirst = c34933.f13492.replaceFirst(str2, strReplaceFirst.concat(strReplaceFirst.endsWith("/") ? "" : "/"));
                            }
                            m8404(c1172, c34933, c3515.f13623, strReplaceFirst, c0945, bArr);
                        }
                        c1172.close();
                        if (abstractC1173 != null) {
                            return;
                        } else {
                            return;
                        }
                    } finally {
                    }
                } finally {
                    abstractC1173 = this.f13633;
                    if (abstractC1173 != null) {
                        abstractC1173.close();
                    }
                }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0261  */
    /* renamed from: ᵎˆ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m8404(p028.C1172 r29, p298.C3493 r30, java.lang.String r31, java.lang.String r32, p007.C0945 r33, byte[] r34) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 1254
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p303.C3520.m8404(ʼˋ.ˏʾ, ٴﾞ.ʿʼ, java.lang.String, java.lang.String, ʻˉ.ˋˊ, byte[]):void");
    }

    /* renamed from: ﹶʾ, reason: contains not printable characters */
    public C1172 m8405(C3501 c3501) {
        ArrayList arrayList;
        C3496 c3496 = this.f13632;
        this.f13633 = AbstractC2978.m7362(c3496);
        C1147 c1147 = c3496.f13532;
        C3493 c3493 = (c1147 == null || (arrayList = c1147.f4789) == null || arrayList.size() == 0) ? null : (C3493) c3496.f13532.f4789.get(0);
        if (c3493 != null) {
            this.f13633.mo4226(c3493);
        }
        return new C1172(this.f13633, this.f13635, c3501);
    }
}
