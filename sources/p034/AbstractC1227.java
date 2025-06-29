package p034;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.Pair;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import p070.AbstractC1549;
import p090.C1749;

/* renamed from: ʼᵔ.ˑʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC1227 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public int f5033;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final /* synthetic */ int f5034;

    public /* synthetic */ AbstractC1227(int i) {
        this.f5034 = i;
    }

    public /* synthetic */ AbstractC1227(int i, int i2) {
        this.f5034 = i2;
        this.f5033 = i;
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static void m4398(String str) {
        if (str.equalsIgnoreCase(":memory:")) {
            return;
        }
        int length = str.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean z2 = AbstractC1549.m5145(str.charAt(!z ? i : length), 32) <= 0;
            if (z) {
                if (!z2) {
                    break;
                } else {
                    length--;
                }
            } else if (z2) {
                i++;
            } else {
                z = true;
            }
        }
        if (str.subSequence(i, length + 1).toString().length() == 0) {
            return;
        }
        "deleting the database file: ".concat(str);
        try {
            SQLiteDatabase.deleteDatabase(new File(str));
        } catch (Exception e) {
        }
    }

    /* renamed from: ˎٴ, reason: contains not printable characters */
    public static int m4399(int i) {
        return (i >> 24) & 255;
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static String m4400(int i) {
        return "" + ((char) ((i >> 24) & 255)) + ((char) ((i >> 16) & 255)) + ((char) ((i >> 8) & 255)) + ((char) (i & 255));
    }

    public String toString() {
        switch (this.f5034) {
            case 4:
                return m4400(this.f5033);
            default:
                return super.toString();
        }
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public boolean m4401(int i) {
        return (this.f5033 & i) == i;
    }

    /* renamed from: ˉי, reason: contains not printable characters */
    public abstract int mo4402();

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public void m4403(C1749 c1749) {
        String str = "Corruption reported by sqlite on database: " + c1749 + ".path";
        SQLiteDatabase sQLiteDatabase = c1749.f6780;
        if (!sQLiteDatabase.isOpen()) {
            String path = sQLiteDatabase.getPath();
            if (path != null) {
                m4398(path);
                return;
            }
            return;
        }
        List<Pair<String, String>> attachedDbs = null;
        try {
            try {
                attachedDbs = sQLiteDatabase.getAttachedDbs();
            } catch (SQLiteException unused) {
            }
            try {
                c1749.close();
            } catch (IOException unused2) {
            }
            if (attachedDbs != null) {
                return;
            }
        } finally {
            if (attachedDbs != null) {
                Iterator<T> it = attachedDbs.iterator();
                while (it.hasNext()) {
                    m4398((String) ((Pair) it.next()).second);
                }
            } else {
                String path2 = sQLiteDatabase.getPath();
                if (path2 != null) {
                    m4398(path2);
                }
            }
        }
    }

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public abstract void mo4404(C1749 c1749);

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public void mo4405(C1749 c1749) {
    }

    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public abstract void mo4406(C1749 c1749, int i, int i2);

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public abstract int mo4407();

    /* renamed from: ˑי, reason: contains not printable characters */
    public abstract void mo4408(C1749 c1749);

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public void m4409(int i) {
        this.f5033 = i | this.f5033;
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public abstract int mo4410();

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public abstract int mo4411();

    /* renamed from: ᵎـ, reason: contains not printable characters */
    public abstract void mo4412(C1749 c1749, int i, int i2);

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public abstract int mo4413();
}
