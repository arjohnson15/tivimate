package p424;

import android.os.Handler;
import android.os.Message;
import java.util.TreeMap;
import p076.C1653;
import p246.C3116;
import p356.C4039;
import p383.AbstractC4470;

/* renamed from: ﹶʾ.ˏᴵ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4898 implements Handler.Callback {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final C4902 f18507;

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public boolean f18509;

    /* renamed from: ـˆ, reason: contains not printable characters */
    public boolean f18511;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final C1653 f18513;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public C4039 f18514;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public boolean f18515;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final TreeMap f18508 = new TreeMap();

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final Handler f18512 = AbstractC4470.m10200(this);

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final C3116 f18510 = new C3116(0);

    public C4898(C4039 c4039, C4902 c4902, C1653 c1653) {
        this.f18514 = c4039;
        this.f18507 = c4902;
        this.f18513 = c1653;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (this.f18511) {
            return true;
        }
        if (message.what != 1) {
            return false;
        }
        C4896 c4896 = (C4896) message.obj;
        long j = c4896.f18492;
        TreeMap treeMap = this.f18508;
        long j2 = c4896.f18491;
        Long l = (Long) treeMap.get(Long.valueOf(j2));
        if (l == null || l.longValue() > j) {
            treeMap.put(Long.valueOf(j2), Long.valueOf(j));
        }
        return true;
    }
}
