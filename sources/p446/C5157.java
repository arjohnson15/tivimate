package p446;

import java.util.Iterator;

/* renamed from: ﾞˉ.ʽᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C5157 extends AbstractC5164 implements Iterable {
    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C5165(this, null);
    }

    public final String toString() {
        return "Directory{fileId=" + this.f19733 + ", fileName='" + this.f19734 + "'}";
    }
}
