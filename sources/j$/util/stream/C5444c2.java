package j$.util.stream;

import java.util.function.Consumer;
import java.util.function.IntFunction;
import p334.C3789;

/* renamed from: j$.util.stream.c2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C5444c2 implements IntFunction, Consumer {
    public final /* synthetic */ int a;

    private final void accept$j$$util$stream$StreamSpliterators$SliceSpliterator$OfRef$$ExternalSyntheticLambda0(Object obj) {
    }

    private final void accept$j$$util$stream$StreamSpliterators$SliceSpliterator$OfRef$$ExternalSyntheticLambda1(Object obj) {
    }

    @Override // java.util.function.Consumer
    public void accept(Object obj) {
        int i = this.a;
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.a) {
        }
        return j$.com.android.tools.r8.a.d(this, consumer);
    }

    @Override // java.util.function.IntFunction
    public Object apply(int i) {
        switch (this.a) {
            case 0:
                return new Object[i];
            case 1:
                return new Integer[i];
            case 2:
                return new Long[i];
            case 3:
                return new Double[i];
            case 4:
            case 5:
            default:
                return new Double[i];
            case C3789.STRING_SET_FIELD_NUMBER /* 6 */:
                return new Integer[i];
            case C3789.DOUBLE_FIELD_NUMBER /* 7 */:
                return new Integer[i];
            case 8:
                return new Long[i];
            case 9:
                return new Long[i];
            case 10:
                return new Double[i];
        }
    }
}
