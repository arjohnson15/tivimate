package p222;

import android.R;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.os.Build;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AbsSeekBar;
import android.widget.EditText;
import androidx.leanback.widget.ﾞᐧ;
import com.google.android.gms.internal.measurement.C0559;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import p004.AbstractC0919;
import p019.C1119;
import p019.C1120;
import p019.C1122;
import p019.C1128;
import p171.C2467;
import p171.InterfaceC2465;
import p192.C2676;
import p300.AbstractC3505;
import p331.C3762;
import ˈי.ʾˈ;

/* renamed from: ˏᴵ.ˈٴ, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C2883 {

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static final int[] f11166 = {R.attr.indeterminateDrawable, R.attr.progressDrawable};

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public View f11167;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public Object f11168;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final /* synthetic */ int f11169 = 2;

    public /* synthetic */ C2883() {
    }

    public C2883(AbsSeekBar absSeekBar) {
        this.f11167 = absSeekBar;
    }

    public C2883(EditText editText) {
        this.f11167 = editText;
        this.f11168 = new ﾞᐧ(editText);
    }

    /* renamed from: ʽᐧ */
    public void mo7192(AttributeSet attributeSet, int i) {
        switch (this.f11169) {
            case 0:
                AbsSeekBar absSeekBar = (AbsSeekBar) this.f11167;
                C3762 c3762M8778 = C3762.m8778(absSeekBar.getContext(), attributeSet, f11166, i);
                Drawable drawableM8792 = c3762M8778.m8792(0);
                if (drawableM8792 != null) {
                    if (drawableM8792 instanceof AnimationDrawable) {
                        AnimationDrawable animationDrawable = (AnimationDrawable) drawableM8792;
                        int numberOfFrames = animationDrawable.getNumberOfFrames();
                        AnimationDrawable animationDrawable2 = new AnimationDrawable();
                        animationDrawable2.setOneShot(animationDrawable.isOneShot());
                        for (int i2 = 0; i2 < numberOfFrames; i2++) {
                            Drawable drawableM7204 = m7204(animationDrawable.getFrame(i2), true);
                            drawableM7204.setLevel(10000);
                            animationDrawable2.addFrame(drawableM7204, animationDrawable.getDuration(i2));
                        }
                        animationDrawable2.setLevel(10000);
                        drawableM8792 = animationDrawable2;
                    }
                    absSeekBar.setIndeterminateDrawable(drawableM8792);
                }
                Drawable drawableM87922 = c3762M8778.m8792(1);
                if (drawableM87922 != null) {
                    absSeekBar.setProgressDrawable(m7204(drawableM87922, false));
                }
                c3762M8778.m8783();
                return;
            default:
                TypedArray typedArrayObtainStyledAttributes = ((EditText) this.f11167).getContext().obtainStyledAttributes(attributeSet, AbstractC3505.f13597, i, 0);
                try {
                    boolean z = typedArrayObtainStyledAttributes.hasValue(14) ? typedArrayObtainStyledAttributes.getBoolean(14, true) : true;
                    typedArrayObtainStyledAttributes.recycle();
                    m7207(z);
                    return;
                } catch (Throwable th) {
                    typedArrayObtainStyledAttributes.recycle();
                    throw th;
                }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ʿʼ, reason: contains not printable characters */
    public Drawable m7204(Drawable drawable, boolean z) {
        if (drawable instanceof InterfaceC2465) {
            C2467 c2467 = (C2467) ((InterfaceC2465) drawable);
            Drawable drawable2 = c2467.f9810;
            if (drawable2 != null) {
                c2467.m6591(m7204(drawable2, z));
            }
        } else {
            if (drawable instanceof LayerDrawable) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                int numberOfLayers = layerDrawable.getNumberOfLayers();
                Drawable[] drawableArr = new Drawable[numberOfLayers];
                for (int i = 0; i < numberOfLayers; i++) {
                    int id = layerDrawable.getId(i);
                    drawableArr[i] = m7204(layerDrawable.getDrawable(i), id == 16908301 || id == 16908303);
                }
                LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
                for (int i2 = 0; i2 < numberOfLayers; i2++) {
                    layerDrawable2.setId(i2, layerDrawable.getId(i2));
                    if (Build.VERSION.SDK_INT >= 23) {
                        AbstractC0919.m3754(layerDrawable, layerDrawable2, i2);
                    }
                }
                return layerDrawable2;
            }
            if (drawable instanceof BitmapDrawable) {
                BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
                Bitmap bitmap = bitmapDrawable.getBitmap();
                if (((Bitmap) this.f11168) == null) {
                    this.f11168 = bitmap;
                }
                ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null));
                shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
                shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
                return z ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
            }
        }
        return drawable;
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public C1119 m7205(InputConnection inputConnection, EditorInfo editorInfo) {
        ﾞᐧ r0 = (ﾞᐧ) this.f11168;
        if (inputConnection == null) {
            r0.getClass();
            inputConnection = null;
        } else {
            C0559 c0559 = (C0559) r0.ˆʿ;
            c0559.getClass();
            if (!(inputConnection instanceof C1119)) {
                inputConnection = new C1119((EditText) c0559.f2912, inputConnection, editorInfo);
            }
        }
        return (C1119) inputConnection;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public KeyListener m7206(KeyListener keyListener) {
        if (keyListener instanceof NumberKeyListener) {
            return keyListener;
        }
        ((C0559) ((ﾞᐧ) this.f11168).ˆʿ).getClass();
        if (keyListener instanceof C1120) {
            return keyListener;
        }
        if (keyListener == null) {
            return null;
        }
        return keyListener instanceof NumberKeyListener ? keyListener : new C1120(keyListener);
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public void m7207(boolean z) {
        C1128 c1128 = (C1128) ((C0559) ((ﾞᐧ) this.f11168).ˆʿ).f2913;
        if (c1128.f4757 != z) {
            if (c1128.f4756 != null) {
                C2676 c2676M6853 = C2676.m6853();
                C1122 c1122 = c1128.f4756;
                c2676M6853.getClass();
                ʾˈ.ʿʼ(c1122, "initCallback cannot be null");
                ReentrantReadWriteLock reentrantReadWriteLock = c2676M6853.f10580;
                reentrantReadWriteLock.writeLock().lock();
                try {
                    c2676M6853.f10576.remove(c1122);
                } finally {
                    reentrantReadWriteLock.writeLock().unlock();
                }
            }
            c1128.f4757 = z;
            if (z) {
                C1128.m4144(c1128.f4758, C2676.m6853().m6854());
            }
        }
    }
}
