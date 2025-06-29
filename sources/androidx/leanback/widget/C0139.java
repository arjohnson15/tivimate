package androidx.leanback.widget;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import java.util.Random;

/* renamed from: androidx.leanback.widget.ʾˈ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0139 extends ReplacementSpan {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final int f1035;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final /* synthetic */ SearchEditText f1036;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final int f1037;

    public C0139(SearchEditText searchEditText, int i, int i2) {
        this.f1036 = searchEditText;
        this.f1037 = i;
        this.f1035 = i2;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        int iMeasureText = (int) paint.measureText(charSequence, i, i2);
        SearchEditText searchEditText = this.f1036;
        int width = searchEditText.f1042.getWidth();
        int i6 = width * 2;
        int i7 = iMeasureText / i6;
        int i8 = (iMeasureText % i6) / 2;
        int i9 = 1;
        int i10 = 0;
        boolean z = 1 == searchEditText.getLayoutDirection();
        Random random = searchEditText.f1046;
        random.setSeed(this.f1037);
        int alpha = paint.getAlpha();
        while (i10 < i7 && this.f1035 + i10 < searchEditText.f1045) {
            float f2 = (width / 2) + (i10 * i6) + i8;
            float f3 = z ? ((f + iMeasureText) - f2) - width : f + f2;
            paint.setAlpha((random.nextInt(4) + i9) * 63);
            if (random.nextBoolean()) {
                canvas.drawBitmap(searchEditText.f1044, f3, i4 - r14.getHeight(), paint);
            } else {
                canvas.drawBitmap(searchEditText.f1042, f3, i4 - r10.getHeight(), paint);
            }
            i10++;
            i9 = 1;
        }
        paint.setAlpha(alpha);
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        return (int) paint.measureText(charSequence, i, i2);
    }
}
