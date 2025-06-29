package p316;

import com.bumptech.glide.ˑʽ;
import java.io.EOFException;
import java.util.regex.Pattern;
import p366.C4143;
import p396.InterfaceC4560;
import p430.AbstractC4996;
import p430.C5002;
import p435.AbstractC5044;
import p435.C5061;

/* renamed from: ᐧﹶ.ʽᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3611 implements InterfaceC4560 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public static final C5002 f13846;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final AbstractC5044 f13847;

    static {
        Pattern pattern = C5002.f18947;
        f13846 = ˑʽ.ˋⁱ("application/json; charset=UTF-8");
    }

    public C3611(AbstractC5044 abstractC5044) {
        this.f13847 = abstractC5044;
    }

    @Override // p396.InterfaceC4560
    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final Object mo8506(Object obj) throws EOFException {
        C4143 c4143 = new C4143();
        this.f13847.mo1391(new C5061(c4143), obj);
        return AbstractC4996.create(f13846, c4143.mo9522(c4143.f16041));
    }
}
