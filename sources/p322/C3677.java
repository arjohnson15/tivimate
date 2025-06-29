package p322;

import android.app.Application;
import android.os.Build;
import android.os.Process;
import p070.AbstractC1547;
import p077.C1672;
import p238.AbstractC3095;
import p338.InterfaceC3856;

/* renamed from: ᴵˉ.ᐧʻ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3677 extends AbstractC1547 implements InterfaceC3856 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public static final C3677 f14096 = new C3677(1);

    @Override // p338.InterfaceC3856
    /* renamed from: ʽᐧ */
    public final Object mo4036(Object obj) {
        String strM7613;
        StringBuilder sb = new StringBuilder("CorruptionException in settings DataStore in ");
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            strM7613 = Process.myProcessName();
        } else if ((i < 28 || (strM7613 = Application.getProcessName()) == null) && (strM7613 = AbstractC3095.m7613()) == null) {
            strM7613 = "";
        }
        sb.append(strM7613);
        sb.append('.');
        sb.toString();
        return new C1672(true);
    }
}
