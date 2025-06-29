package p035;

import android.support.v4.media.session.AbstractC0001;
import java.util.ArrayList;
import p158.AbstractC2339;
import p317.AbstractC3616;
import p430.C5014;

/* renamed from: ʼⁱ.ʽᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1232 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final ArrayList f5042;

    public C1232(int i) {
        switch (i) {
            case 1:
                this.f5042 = new ArrayList(20);
                break;
            default:
                this.f5042 = new ArrayList();
                break;
        }
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public void m4424(String str, String str2) {
        ArrayList arrayList = this.f5042;
        arrayList.add(str);
        arrayList.add(AbstractC3616.m8539(str2).toString());
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public void m4425(String str) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f5042;
            if (i >= arrayList.size()) {
                return;
            }
            if (str.equalsIgnoreCase((String) arrayList.get(i))) {
                arrayList.remove(i);
                arrayList.remove(i);
                i -= 2;
            }
            i += 2;
        }
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public void m4426(String str, String str2) {
        if (str.length() <= 0) {
            throw new IllegalArgumentException("name is empty");
        }
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if ('!' > cCharAt || cCharAt >= 127) {
                throw new IllegalArgumentException(AbstractC2339.m6442("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(cCharAt), Integer.valueOf(i), str).toString());
            }
        }
        m4424(str, str2);
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public void m4427(String str, String str2) {
        AbstractC0001.m2(str);
        AbstractC0001.m18(str2, str);
        m4424(str, str2);
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public void m4428(String str, String str2) {
        AbstractC0001.m2(str);
        AbstractC0001.m18(str2, str);
        m4425(str);
        m4424(str, str2);
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public C5014 m4429() {
        return new C5014((String[]) this.f5042.toArray(new String[0]));
    }
}
