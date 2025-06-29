package p396;

import java.lang.reflect.Array;
import java.util.Iterator;

/* renamed from: ⁱᴵ.ᐧⁱ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4578 extends AbstractC4581 {

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC4581 f17523;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final /* synthetic */ int f17524;

    public /* synthetic */ C4578(AbstractC4581 abstractC4581, int i) {
        this.f17524 = i;
        this.f17523 = abstractC4581;
    }

    @Override // p396.AbstractC4581
    /* renamed from: ـﹶ */
    public final void mo10422(C4570 c4570, Object obj) {
        switch (this.f17524) {
            case 0:
                Iterable iterable = (Iterable) obj;
                if (iterable != null) {
                    Iterator it = iterable.iterator();
                    while (it.hasNext()) {
                        this.f17523.mo10422(c4570, it.next());
                    }
                    break;
                }
                break;
            default:
                if (obj != null) {
                    int length = Array.getLength(obj);
                    for (int i = 0; i < length; i++) {
                        this.f17523.mo10422(c4570, Array.get(obj, i));
                    }
                    break;
                }
                break;
        }
    }
}
