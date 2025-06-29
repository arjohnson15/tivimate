package p305;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.Callable;
import p238.AbstractC3095;
import p417.AbstractC4753;

/* renamed from: ᐧˆ.ˏʾ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final /* synthetic */ class CallableC3530 implements Callable {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final /* synthetic */ String f13658;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final /* synthetic */ BinderC3538 f13659;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final /* synthetic */ boolean f13660;

    public /* synthetic */ CallableC3530(boolean z, String str, BinderC3538 binderC3538) {
        this.f13660 = z;
        this.f13658 = str;
        this.f13659 = binderC3538;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() throws NoSuchAlgorithmException {
        MessageDigest messageDigest;
        BinderC3538 binderC3538 = this.f13659;
        boolean z = this.f13660;
        String str = this.f13658;
        String str2 = (z || !AbstractC3534.m8422(str, binderC3538, true, false).f13691) ? "not allowed" : "debug cert rejected";
        int i = 0;
        while (true) {
            if (i >= 2) {
                messageDigest = null;
                break;
            }
            try {
                messageDigest = MessageDigest.getInstance("SHA-256");
            } catch (NoSuchAlgorithmException unused) {
            }
            if (messageDigest != null) {
                break;
            }
            i++;
        }
        AbstractC4753.m10683(messageDigest);
        byte[] bArrDigest = messageDigest.digest(binderC3538.f13682);
        int length = bArrDigest.length;
        char[] cArr = new char[length + length];
        int i2 = 0;
        for (byte b : bArrDigest) {
            char[] cArr2 = AbstractC3095.f11944;
            cArr[i2] = cArr2[(b & 255) >>> 4];
            cArr[i2 + 1] = cArr2[b & 15];
            i2 += 2;
        }
        return str2 + ": pkg=" + str + ", sha256=" + new String(cArr) + ", atk=" + z + ", ver=12451000.false";
    }
}
