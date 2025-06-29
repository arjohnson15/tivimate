package p162;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.carousel.CarouselLayoutManager;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.lsposed.hiddenapibypass.library.R;
import p061.AbstractC1360;
import p421.AbstractC4862;

/* renamed from: ˊᴵ.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2354 extends AbstractC1360 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final List f9321;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final Paint f9322;

    public C2354() {
        Paint paint = new Paint();
        this.f9322 = paint;
        this.f9321 = DesugarCollections.unmodifiableList(new ArrayList());
        paint.setStrokeWidth(5.0f);
        paint.setColor(-65281);
    }

    @Override // p061.AbstractC1360
    /* renamed from: ˑʽ */
    public final void mo4727(Canvas canvas, RecyclerView recyclerView) {
        Paint paint = this.f9322;
        paint.setStrokeWidth(recyclerView.getResources().getDimension(R.dimen._2_res_0x7f070223));
        Iterator it = this.f9321.iterator();
        while (it.hasNext()) {
            ((AbstractC2353) it.next()).getClass();
            ThreadLocal threadLocal = AbstractC4862.f18368;
            float f = 1.0f - 0.0f;
            paint.setColor(Color.argb((int) ((Color.alpha(-16776961) * 0.0f) + (Color.alpha(-65281) * f)), (int) ((Color.red(-16776961) * 0.0f) + (Color.red(-65281) * f)), (int) ((Color.green(-16776961) * 0.0f) + (Color.green(-65281) * f)), (int) ((Color.blue(-16776961) * 0.0f) + (Color.blue(-65281) * f))));
            if (((CarouselLayoutManager) recyclerView.getLayoutManager()).m2842()) {
                canvas.drawLine(0.0f, ((CarouselLayoutManager) recyclerView.getLayoutManager()).f3231.mo4402(), 0.0f, ((CarouselLayoutManager) recyclerView.getLayoutManager()).f3231.mo4410(), paint);
            } else {
                canvas.drawLine(((CarouselLayoutManager) recyclerView.getLayoutManager()).f3231.mo4411(), 0.0f, ((CarouselLayoutManager) recyclerView.getLayoutManager()).f3231.mo4407(), 0.0f, paint);
            }
        }
    }
}
