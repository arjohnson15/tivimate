package p246;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import p153.C2324;
import p166.C2401;
import p353.AbstractC4010;
import p383.C4457;
import p392.C4520;
import p451.C5192;
import ˈⁱ.ˉⁱ;

/* renamed from: יʾ.ʽᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3116 extends ˉⁱ {

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final /* synthetic */ int f12012;

    /* renamed from: ˎᵔ, reason: contains not printable characters */
    public static C3117 m7646(C4457 c4457) {
        String strM10103 = c4457.m10103();
        strM10103.getClass();
        String strM101032 = c4457.m10103();
        strM101032.getClass();
        return new C3117(strM10103, strM101032, c4457.m10094(), c4457.m10094(), Arrays.copyOfRange(c4457.f17171, c4457.f17169, c4457.f17170));
    }

    /* renamed from: ˉי, reason: contains not printable characters */
    public final C2401 m7647(C4520 c4520, ByteBuffer byteBuffer) {
        switch (this.f12012) {
            case 0:
                return new C2401(m7646(new C4457(byteBuffer.limit(), byteBuffer.array())));
            default:
                if (byteBuffer.get() == 116) {
                    C2324 c2324 = new C2324(byteBuffer.limit(), byteBuffer.array());
                    int i = 12;
                    c2324.m6408(12);
                    int i2 = 4;
                    int iM6403 = (c2324.m6403() + c2324.m6410(12)) - 4;
                    c2324.m6408(44);
                    c2324.m6391(c2324.m6410(12));
                    c2324.m6408(16);
                    ArrayList arrayList = new ArrayList();
                    while (c2324.m6403() < iM6403) {
                        c2324.m6408(48);
                        int iM6410 = c2324.m6410(8);
                        c2324.m6408(i2);
                        int iM64032 = c2324.m6403() + c2324.m6410(i);
                        String str = null;
                        String str2 = null;
                        while (c2324.m6403() < iM64032) {
                            int iM64102 = c2324.m6410(8);
                            int iM64103 = c2324.m6410(8);
                            int iM64033 = c2324.m6403() + iM64103;
                            if (iM64102 == 2) {
                                int iM64104 = c2324.m6410(16);
                                c2324.m6408(8);
                                if (iM64104 == 3) {
                                    while (c2324.m6403() < iM64033) {
                                        int iM64105 = c2324.m6410(8);
                                        Charset charset = AbstractC4010.f15451;
                                        byte[] bArr = new byte[iM64105];
                                        c2324.m6393(iM64105, bArr);
                                        String str3 = new String(bArr, charset);
                                        int iM64106 = c2324.m6410(8);
                                        for (int i3 = 0; i3 < iM64106; i3++) {
                                            c2324.m6391(c2324.m6410(8));
                                        }
                                        str = str3;
                                    }
                                }
                            } else if (iM64102 == 21) {
                                Charset charset2 = AbstractC4010.f15451;
                                byte[] bArr2 = new byte[iM64103];
                                c2324.m6393(iM64103, bArr2);
                                str2 = new String(bArr2, charset2);
                            }
                            c2324.m6407(iM64033 * 8);
                        }
                        c2324.m6407(iM64032 * 8);
                        if (str != null && str2 != null) {
                            arrayList.add(new C5192(iM6410, str.concat(str2)));
                        }
                        i = 12;
                        i2 = 4;
                    }
                    if (!arrayList.isEmpty()) {
                        return new C2401(arrayList);
                    }
                }
                return null;
        }
    }
}
