package p043;

import j$.util.DesugarTimeZone;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import p103.InterfaceC1788;
import p103.InterfaceC1791;

/* renamed from: ʽי.ˑʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1291 implements InterfaceC1788 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final SimpleDateFormat f5306;

    static {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
        f5306 = simpleDateFormat;
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
    }

    @Override // p103.InterfaceC1790
    /* renamed from: ـﹶ */
    public final void mo4581(Object obj, Object obj2) {
        ((InterfaceC1791) obj2).mo4590(f5306.format((Date) obj));
    }
}
