package p435;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: ﹶᵔ.ﾞʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C5066 {

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public boolean f19214;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final /* synthetic */ C5054 f19216;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final ArrayList f19215 = new ArrayList();

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final ArrayDeque f19213 = new ArrayDeque();

    public C5066(C5054 c5054) {
        this.f19216 = c5054;
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final void m11223(boolean z) {
        this.f19213.removeLast();
        if (this.f19213.isEmpty()) {
            this.f19216.f19184.remove();
            if (z) {
                synchronized (this.f19216.f19185) {
                    try {
                        int size = this.f19215.size();
                        for (int i = 0; i < size; i++) {
                            C5067 c5067 = (C5067) this.f19215.get(i);
                            AbstractC5044 abstractC5044 = (AbstractC5044) this.f19216.f19185.put(c5067.f19218, c5067.f19220);
                            if (abstractC5044 != null) {
                                c5067.f19220 = abstractC5044;
                                this.f19216.f19185.put(c5067.f19218, abstractC5044);
                            }
                        }
                    } finally {
                    }
                }
            }
        }
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final IllegalArgumentException m11224(IllegalArgumentException illegalArgumentException) {
        if (this.f19214) {
            return illegalArgumentException;
        }
        this.f19214 = true;
        ArrayDeque arrayDeque = this.f19213;
        if (arrayDeque.size() == 1 && ((C5067) arrayDeque.getFirst()).f19217 == null) {
            return illegalArgumentException;
        }
        StringBuilder sb = new StringBuilder(illegalArgumentException.getMessage());
        Iterator itDescendingIterator = arrayDeque.descendingIterator();
        while (itDescendingIterator.hasNext()) {
            C5067 c5067 = (C5067) itDescendingIterator.next();
            sb.append("\nfor ");
            sb.append(c5067.f19219);
            String str = c5067.f19217;
            if (str != null) {
                sb.append(' ');
                sb.append(str);
            }
        }
        return new IllegalArgumentException(sb.toString(), illegalArgumentException);
    }
}
