package p406;

import androidx.work.impl.WorkDatabase;
import java.util.HashSet;
import java.util.Iterator;
import p414.AbstractC4723;
import p414.C4721;
import p414.C4722;
import p457.C5391;
import ⁱـ.ˑי;

/* renamed from: ﹳʿ.ˑʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC4656 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final String f17779 = C5391.m12164("EnqueueRunnable");

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0197 A[PHI: r3 r8 r15 r16 r17
  0x0197: PHI (r3v3 java.lang.String[]) = 
  (r3v2 java.lang.String[])
  (r3v2 java.lang.String[])
  (r3v2 java.lang.String[])
  (r3v6 java.lang.String[])
  (r3v6 java.lang.String[])
 binds: [B:28:0x0083, B:29:0x0085, B:31:0x0093, B:91:0x0196, B:90:0x0194] A[DONT_GENERATE, DONT_INLINE]
  0x0197: PHI (r8v2 boolean) = (r8v1 boolean), (r8v1 boolean), (r8v1 boolean), (r8v5 boolean), (r8v6 boolean) binds: [B:28:0x0083, B:29:0x0085, B:31:0x0093, B:91:0x0196, B:90:0x0194] A[DONT_GENERATE, DONT_INLINE]
  0x0197: PHI (r15v2 boolean) = (r15v1 boolean), (r15v1 boolean), (r15v1 boolean), (r15v4 boolean), (r15v4 boolean) binds: [B:28:0x0083, B:29:0x0085, B:31:0x0093, B:91:0x0196, B:90:0x0194] A[DONT_GENERATE, DONT_INLINE]
  0x0197: PHI (r16v2 boolean) = (r16v1 boolean), (r16v1 boolean), (r16v1 boolean), (r16v5 boolean), (r16v5 boolean) binds: [B:28:0x0083, B:29:0x0085, B:31:0x0093, B:91:0x0196, B:90:0x0194] A[DONT_GENERATE, DONT_INLINE]
  0x0197: PHI (r17v2 boolean) = (r17v1 boolean), (r17v1 boolean), (r17v1 boolean), (r17v5 boolean), (r17v5 boolean) binds: [B:28:0x0083, B:29:0x0085, B:31:0x0093, B:91:0x0196, B:90:0x0194] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01a4  */
    /* JADX WARN: Type inference failed for: r12v11, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* renamed from: ʽᐧ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean m10559(p414.C4721 r38) throws java.lang.ClassNotFoundException {
        /*
            Method dump skipped, instructions count: 828
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p406.AbstractC4656.m10559(ﹳـ.ˏʾ):boolean");
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static void m10560(C4721 c4721) {
        boolean z;
        c4721.getClass();
        HashSet hashSet = new HashSet();
        hashSet.addAll(c4721.f18118);
        HashSet hashSetM10632 = C4721.m10632(c4721);
        Iterator it = hashSet.iterator();
        while (true) {
            if (!it.hasNext()) {
                hashSet.removeAll(c4721.f18118);
                z = false;
                break;
            } else if (hashSetM10632.contains((String) it.next())) {
                z = true;
                break;
            }
        }
        if (z) {
            throw new IllegalStateException("WorkContinuation has cycles (" + c4721 + ")");
        }
        C4722 c4722 = c4721.f18111;
        WorkDatabase workDatabase = c4722.f18122;
        workDatabase.m5048();
        try {
            ˑי.ʿʼ(workDatabase, c4722.f18131, c4721);
            boolean zM10559 = m10559(c4721);
            workDatabase.m5055();
            if (zM10559) {
                AbstractC4723.m10640(c4722.f18131, c4722.f18122, c4722.f18123);
            }
        } finally {
            workDatabase.m5046();
        }
    }
}
