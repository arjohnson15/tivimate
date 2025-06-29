package androidx.leanback.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import org.lsposed.hiddenapibypass.library.R;

/* loaded from: classes.dex */
class MediaRowFocusView extends View {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final RectF f859;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public int f860;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final Paint f861;

    public MediaRowFocusView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f859 = new RectF();
        Paint paint = new Paint();
        paint.setColor(context.getResources().getColor(R.color._2_res_0x7f0600e7));
        this.f861 = paint;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight() / 2;
        this.f860 = height;
        int height2 = ((height * 2) - getHeight()) / 2;
        RectF rectF = this.f859;
        rectF.set(0.0f, -height2, getWidth(), getHeight() + height2);
        int i = this.f860;
        canvas.drawRoundRect(rectF, i, i, this.f861);
    }
}
