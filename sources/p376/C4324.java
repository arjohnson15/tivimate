package p376;

import androidx.lifecycle.C0248;
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import p070.AbstractC1549;
import p288.C3395;
import p288.C3406;
import p293.C3474;
import p366.AbstractC4147;
import p366.C4143;
import p366.C4154;
import p366.C4155;
import p366.C4167;
import ٴᐧ.ᐧⁱ;

/* renamed from: ᵢˑ.ﹳﹳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4324 extends AbstractC4147 {

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public static final C4167 f16796;

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final ClassLoader f16797;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final AbstractC4147 f16798 = AbstractC4147.f16047;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final C3406 f16799 = new C3406(new C0248(9, this));

    static {
        String str = C4167.f16083;
        f16796 = C3474.m8339("/");
    }

    public C4324(ClassLoader classLoader) {
        this.f16797 = classLoader;
    }

    @Override // p366.AbstractC4147
    /* renamed from: ـﹶ */
    public final C4154 mo9542(C4167 c4167) throws EOFException, FileNotFoundException {
        C4167 c4167M9820;
        C4167 c41672 = c4167;
        if (!ᐧⁱ.ᴵʿ(c4167)) {
            throw new FileNotFoundException("file not found: " + c41672);
        }
        C4167 c41673 = f16796;
        c41673.getClass();
        C4167 c4167M9815 = AbstractC4320.m9815(c41673, c41672, true);
        int iM9818 = AbstractC4320.m9818(c4167M9815);
        C4155 c4155 = c4167M9815.f16084;
        C4167 c41674 = iM9818 == -1 ? null : new C4167(c4155.mo9562(0, iM9818));
        int iM98182 = AbstractC4320.m9818(c41673);
        C4155 c41552 = c41673.f16084;
        if (!AbstractC1549.m5138(c41674, iM98182 != -1 ? new C4167(c41552.mo9562(0, iM98182)) : null)) {
            throw new IllegalArgumentException(("Paths of different roots cannot be relative to each other: " + c4167M9815 + " and " + c41673).toString());
        }
        ArrayList arrayListM9581 = c4167M9815.m9581();
        ArrayList arrayListM95812 = c41673.m9581();
        int iMin = Math.min(arrayListM9581.size(), arrayListM95812.size());
        int i = 0;
        while (i < iMin && AbstractC1549.m5138(arrayListM9581.get(i), arrayListM95812.get(i))) {
            i++;
        }
        if (i == iMin && c4155.mo9566() == c41552.mo9566()) {
            String str = C4167.f16083;
            c4167M9820 = C3474.m8339(".");
        } else {
            if (arrayListM95812.subList(i, arrayListM95812.size()).indexOf(AbstractC4320.f16778) != -1) {
                throw new IllegalArgumentException(("Impossible relative path to resolve: " + c4167M9815 + " and " + c41673).toString());
            }
            C4143 c4143 = new C4143();
            C4155 c4155M9817 = AbstractC4320.m9817(c41673);
            if (c4155M9817 == null && (c4155M9817 = AbstractC4320.m9817(c4167M9815)) == null) {
                c4155M9817 = AbstractC4320.m9819(C4167.f16083);
            }
            int size = arrayListM95812.size();
            for (int i2 = i; i2 < size; i2++) {
                c4143.m9524(AbstractC4320.f16778);
                c4143.m9524(c4155M9817);
            }
            int size2 = arrayListM9581.size();
            while (i < size2) {
                c4143.m9524((C4155) arrayListM9581.get(i));
                c4143.m9524(c4155M9817);
                i++;
            }
            c4167M9820 = AbstractC4320.m9820(c4143, false);
        }
        String strM9564 = c4167M9820.f16084.m9564();
        for (C3395 c3395 : (List) this.f16799.getValue()) {
            try {
                return ((AbstractC4147) c3395.f13245).mo9542(((C4167) c3395.f13244).m9579(strM9564));
            } catch (FileNotFoundException unused) {
            }
        }
        throw new FileNotFoundException("file not found: " + c41672);
    }
}
