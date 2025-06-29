package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;
import p036.C1262;
import p222.AbstractC2873;
import p222.AbstractC2902;
import p222.AbstractC2962;
import p222.C2860;
import p383.C4456;
import ᴵﹳ.ٴˎ;

/* loaded from: classes.dex */
public class AppCompatImageView extends ImageView {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final C4456 f146;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public boolean f147;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final C1262 f148;

    public AppCompatImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        AbstractC2902.m7248(context);
        this.f147 = false;
        AbstractC2873.m7187(getContext(), this);
        C1262 c1262 = new C1262(this);
        this.f148 = c1262;
        c1262.m4491(attributeSet, i);
        C4456 c4456 = new C4456(this);
        this.f146 = c4456;
        c4456.m10076(attributeSet, i);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C1262 c1262 = this.f148;
        if (c1262 != null) {
            c1262.m4520();
        }
        C4456 c4456 = this.f146;
        if (c4456 != null) {
            c4456.m10069();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C1262 c1262 = this.f148;
        if (c1262 != null) {
            return c1262.m4505();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C1262 c1262 = this.f148;
        if (c1262 != null) {
            return c1262.m4514();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        C2860 c2860;
        C4456 c4456 = this.f146;
        if (c4456 == null || (c2860 = (C2860) c4456.f17164) == null) {
            return null;
        }
        return (ColorStateList) c2860.f11119;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        C2860 c2860;
        C4456 c4456 = this.f146;
        if (c4456 == null || (c2860 = (C2860) c4456.f17164) == null) {
            return null;
        }
        return (PorterDuff.Mode) c2860.f11121;
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        return !(((ImageView) this.f146.f17163).getBackground() instanceof RippleDrawable) && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1262 c1262 = this.f148;
        if (c1262 != null) {
            c1262.m4506();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C1262 c1262 = this.f148;
        if (c1262 != null) {
            c1262.m4517(i);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        C4456 c4456 = this.f146;
        if (c4456 != null) {
            c4456.m10069();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        C4456 c4456 = this.f146;
        if (c4456 != null && drawable != null && !this.f147) {
            c4456.f17161 = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        if (c4456 != null) {
            c4456.m10069();
            if (this.f147) {
                return;
            }
            ImageView imageView = (ImageView) c4456.f17163;
            if (imageView.getDrawable() != null) {
                imageView.getDrawable().setLevel(c4456.f17161);
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i) {
        super.setImageLevel(i);
        this.f147 = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        C4456 c4456 = this.f146;
        if (c4456 != null) {
            ImageView imageView = (ImageView) c4456.f17163;
            if (i != 0) {
                Drawable drawable = ٴˎ.ˏᵢ(imageView.getContext(), i);
                if (drawable != null) {
                    AbstractC2962.m7332(drawable);
                }
                imageView.setImageDrawable(drawable);
            } else {
                imageView.setImageDrawable(null);
            }
            c4456.m10069();
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        C4456 c4456 = this.f146;
        if (c4456 != null) {
            c4456.m10069();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C1262 c1262 = this.f148;
        if (c1262 != null) {
            c1262.m4510(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C1262 c1262 = this.f148;
        if (c1262 != null) {
            c1262.m4493(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        C4456 c4456 = this.f146;
        if (c4456 != null) {
            if (((C2860) c4456.f17164) == null) {
                c4456.f17164 = new C2860();
            }
            C2860 c2860 = (C2860) c4456.f17164;
            c2860.f11119 = colorStateList;
            c2860.f11118 = true;
            c4456.m10069();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        C4456 c4456 = this.f146;
        if (c4456 != null) {
            if (((C2860) c4456.f17164) == null) {
                c4456.f17164 = new C2860();
            }
            C2860 c2860 = (C2860) c4456.f17164;
            c2860.f11121 = mode;
            c2860.f11120 = true;
            c4456.m10069();
        }
    }
}
