package androidx.leanback.widget;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.widget.TextView;
import p348.AbstractC3996;
import ˈⁱ.ˉⁱ;

@SuppressLint({"AppCompatCustomView"})
/* loaded from: classes.dex */
class ResizingTextView extends TextView {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final int f891;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final int f892;

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public float f893;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final boolean f894;

    /* renamed from: ـˆ, reason: contains not printable characters */
    public int f895;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final int f896;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final int f897;

    /* renamed from: ᴵʼ, reason: contains not printable characters */
    public int f898;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public boolean f899;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public int f900;

    public ResizingTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.textViewStyle);
        this.f899 = false;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC3996.f15431, R.attr.textViewStyle, 0);
        try {
            this.f897 = typedArrayObtainStyledAttributes.getInt(1, 1);
            this.f891 = typedArrayObtainStyledAttributes.getDimensionPixelSize(4, -1);
            this.f894 = typedArrayObtainStyledAttributes.getBoolean(0, false);
            this.f896 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(3, 0);
            this.f892 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(2, 0);
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00cd A[PHI: r2
  0x00cd: PHI (r2v6 boolean) = (r2v2 boolean), (r2v8 boolean) binds: [B:40:0x00ca, B:27:0x0097] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onMeasure(int r8, int r9) {
        /*
            Method dump skipped, instructions count: 220
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.leanback.widget.ResizingTextView.onMeasure(int, int):void");
    }

    @Override // android.widget.TextView
    public final void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(ˉⁱ.ᵢʿ(callback, this));
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void m872(int i, int i2) {
        if (isPaddingRelative()) {
            setPaddingRelative(getPaddingStart(), i, getPaddingEnd(), i2);
        } else {
            setPadding(getPaddingLeft(), i, getPaddingRight(), i2);
        }
    }
}
