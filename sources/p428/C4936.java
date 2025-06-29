package p428;

import android.content.Context;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import p065.C1500;
import p122.C1904;
import p122.C1925;
import p122.C1969;
import p122.C1971;
import p331.C3758;
import ᵎﹳ.ᐧʻ;
import ﹶˋ.ـﹶ;

/* renamed from: ﹶˊ.ᵎˏ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4936 {

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public static final HashMap f18672;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public static final String f18673;

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final C4942 f18674;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final C1500 f18675;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final C4932 f18676;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final Context f18677;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final C3758 f18678;

    static {
        HashMap map = new HashMap();
        f18672 = map;
        ᐧʻ.ˎٴ(5, map, "armeabi", 6, "armeabi-v7a");
        ᐧʻ.ˎٴ(9, map, "arm64-v8a", 0, "x86");
        map.put("x86_64", 1);
        Locale locale = Locale.US;
        f18673 = "Crashlytics Android SDK/19.0.3";
    }

    public C4936(Context context, C4942 c4942, C4932 c4932, C3758 c3758, C1500 c1500) {
        this.f18677 = context;
        this.f18674 = c4942;
        this.f18676 = c4932;
        this.f18678 = c3758;
        this.f18675 = c1500;
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public static C1969 m11058() {
        byte b = (byte) 1;
        if (b == 1) {
            return new C1969(0L, "0", "0");
        }
        StringBuilder sb = new StringBuilder();
        if (b == 0) {
            sb.append(" address");
        }
        throw new IllegalStateException(ᐧʻ.ᴵʿ("Missing required properties:", sb));
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static C1971 m11059(ـﹶ r7, int i) {
        int i2;
        String str = (String) r7.ˎˑ;
        int i3 = 0;
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) r7.ᐧˋ;
        if (stackTraceElementArr == null) {
            stackTraceElementArr = new StackTraceElement[0];
        }
        ـﹶ r4 = (ـﹶ) r7.ˆᵔ;
        if (i >= 8) {
            for (ـﹶ r3 = r4; r3 != null; r3 = (ـﹶ) r3.ˆᵔ) {
                i3++;
            }
            i2 = i3;
        } else {
            i2 = 0;
        }
        List listM11060 = m11060(stackTraceElementArr, 4);
        if (listM11060 == null) {
            throw new NullPointerException("Null frames");
        }
        byte b = (byte) (0 | 1);
        C1971 c1971M11059 = null;
        if (r4 != null && i2 == 0) {
            c1971M11059 = m11059(r4, i + 1);
        }
        if (b == 1) {
            return new C1971(str, (String) r7.ˆʿ, listM11060, c1971M11059, i2);
        }
        StringBuilder sb = new StringBuilder();
        if ((b & 1) == 0) {
            sb.append(" overflowCount");
        }
        throw new IllegalStateException(ᐧʻ.ᴵʿ("Missing required properties:", sb));
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static List m11060(StackTraceElement[] stackTraceElementArr, int i) {
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            C1925 c1925 = new C1925();
            c1925.f7315 = i;
            c1925.f7318 = (byte) (c1925.f7318 | 4);
            long lineNumber = 0;
            long jMax = stackTraceElement.isNativeMethod() ? Math.max(stackTraceElement.getLineNumber(), 0L) : 0L;
            String str = stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName();
            String fileName = stackTraceElement.getFileName();
            if (!stackTraceElement.isNativeMethod() && stackTraceElement.getLineNumber() > 0) {
                lineNumber = stackTraceElement.getLineNumber();
            }
            c1925.f7317 = jMax;
            byte b = (byte) (c1925.f7318 | 1);
            c1925.f7318 = b;
            if (str == null) {
                throw new NullPointerException("Null symbol");
            }
            c1925.f7314 = str;
            c1925.f7316 = fileName;
            c1925.f7319 = lineNumber;
            c1925.f7318 = (byte) (b | 2);
            arrayList.add(c1925.m5636());
        }
        return DesugarCollections.unmodifiableList(arrayList);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a6  */
    /* renamed from: ʽᐧ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final p122.C1979 m11061(int r18) {
        /*
            Method dump skipped, instructions count: 244
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p428.C4936.m11061(int):ˈי.ⁱʿ");
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final List m11062() {
        byte b = (byte) (((byte) (0 | 1)) | 2);
        C4932 c4932 = this.f18676;
        String str = c4932.f18658;
        if (str == null) {
            throw new NullPointerException("Null name");
        }
        if (b == 3) {
            return Collections.singletonList(new C1904(0L, 0L, str, c4932.f18657));
        }
        StringBuilder sb = new StringBuilder();
        if ((b & 1) == 0) {
            sb.append(" baseAddress");
        }
        if ((b & 2) == 0) {
            sb.append(" size");
        }
        throw new IllegalStateException(ᐧʻ.ᴵʿ("Missing required properties:", sb));
    }
}
