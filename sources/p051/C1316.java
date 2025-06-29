package p051;

import com.hierynomus.spnego.SpnegoException;
import p117.AbstractC1845;
import p419.C4852;
import p447.AbstractC5179;

/* renamed from: ʽﾞ.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1316 extends C1314 {
    @Override // p051.C1314, androidx.datastore.preferences.protobuf.AbstractC0080
    /* renamed from: ˏʾ */
    public final void mo572(C4852 c4852) throws SpnegoException {
        if (c4852.m10915().toString().contains("not_defined_in_RFC4178@please_ignore")) {
            return;
        }
        AbstractC1845 abstractC1845 = c4852.f7065;
        int i = abstractC1845.f7081;
        if (i == 0) {
            m4619(c4852.m10915());
            return;
        }
        if (i != 1) {
            if (i == 2) {
                m4618(c4852.m10915());
            } else if (i != 3 && i != 4) {
                throw new SpnegoException(AbstractC5179.m11550(new StringBuilder("Unknown Object Tag "), abstractC1845.f7081, " encountered."));
            }
        }
    }
}
