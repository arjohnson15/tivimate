package androidx.leanback.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.lsposed.hiddenapibypass.library.R;

/* loaded from: classes.dex */
public class TitleView extends FrameLayout {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final TextView f976;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public boolean f977;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final SearchOrbView f978;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final int f979;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final ImageView f980;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final C0194 f981;

    public TitleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr._2_res_0x7f0400a9);
        this.f979 = 6;
        this.f977 = false;
        this.f981 = new C0194();
        View viewInflate = LayoutInflater.from(context).inflate(R.layout._2_res_0x7f0e00ca, this);
        this.f980 = (ImageView) viewInflate.findViewById(R.id._2_res_0x7f0b039c);
        this.f976 = (TextView) viewInflate.findViewById(R.id._2_res_0x7f0b039f);
        this.f978 = (SearchOrbView) viewInflate.findViewById(R.id._2_res_0x7f0b039d);
        setClipToPadding(false);
        setClipChildren(false);
    }

    public Drawable getBadgeDrawable() {
        return this.f980.getDrawable();
    }

    public C0166 getSearchAffordanceColors() {
        return this.f978.getOrbColors();
    }

    public View getSearchAffordanceView() {
        return this.f978;
    }

    public CharSequence getTitle() {
        return this.f976.getText();
    }

    public AbstractC0161 getTitleViewAdapter() {
        return this.f981;
    }

    public void setBadgeDrawable(Drawable drawable) {
        this.f980.setImageDrawable(drawable);
        ImageView imageView = this.f980;
        Drawable drawable2 = imageView.getDrawable();
        TextView textView = this.f976;
        if (drawable2 != null) {
            imageView.setVisibility(0);
            textView.setVisibility(8);
        } else {
            imageView.setVisibility(8);
            textView.setVisibility(0);
        }
    }

    public void setOnSearchClickedListener(View.OnClickListener onClickListener) {
        this.f977 = onClickListener != null;
        SearchOrbView searchOrbView = this.f978;
        searchOrbView.setOnOrbClickedListener(onClickListener);
        searchOrbView.setVisibility((this.f977 && (this.f979 & 4) == 4) ? 0 : 4);
    }

    public void setSearchAffordanceColors(C0166 c0166) {
        this.f978.setOrbColors(c0166);
    }

    public void setTitle(CharSequence charSequence) {
        this.f976.setText(charSequence);
        ImageView imageView = this.f980;
        Drawable drawable = imageView.getDrawable();
        TextView textView = this.f976;
        if (drawable != null) {
            imageView.setVisibility(0);
            textView.setVisibility(8);
        } else {
            imageView.setVisibility(8);
            textView.setVisibility(0);
        }
    }
}
