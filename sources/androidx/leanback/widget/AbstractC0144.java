package androidx.leanback.widget;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import java.util.Random;
import java.util.regex.Pattern;
import org.lsposed.hiddenapibypass.library.R;
import ˈⁱ.ˉⁱ;

/* renamed from: androidx.leanback.widget.ˆﾞ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC0144 extends EditText {

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public static final Pattern f1040 = Pattern.compile("\\S+");

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public static final C0148 f1041 = new C0148(Integer.class, "streamPosition", 3);

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public Bitmap f1042;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public ObjectAnimator f1043;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public Bitmap f1044;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public int f1045;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final Random f1046;

    public AbstractC0144(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.style._2_res_0x7f140246);
        this.f1046 = new Random();
    }

    public int getStreamPosition() {
        return this.f1045;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f1042 = Bitmap.createScaledBitmap(BitmapFactory.decodeResource(getResources(), R.drawable._2_res_0x7f0801a5), (int) (r0.getWidth() * 1.3f), (int) (r0.getHeight() * 1.3f), false);
        this.f1044 = Bitmap.createScaledBitmap(BitmapFactory.decodeResource(getResources(), R.drawable._2_res_0x7f0801a7), (int) (r0.getWidth() * 1.3f), (int) (r0.getHeight() * 1.3f), false);
        this.f1045 = -1;
        ObjectAnimator objectAnimator = this.f1043;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        setText("");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.leanback.widget.StreamingTextView");
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(ˉⁱ.ᵢʿ(callback, this));
    }

    public void setStreamPosition(int i) {
        this.f1045 = i;
        invalidate();
    }
}
