package p429;

import android.os.Message;
import java.util.Comparator;
import p278.AbstractC3362;

/* renamed from: ﹶˎ.ˑⁱ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4965 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return AbstractC3362.m8218(Long.valueOf(((Message) obj).getWhen()), Long.valueOf(((Message) obj2).getWhen()));
    }
}
