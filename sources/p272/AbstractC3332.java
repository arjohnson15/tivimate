package p272;

import android.R;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.ui.AspectRatioFrameLayout;
import androidx.media3.ui.SubtitleView;
import ar.tvplayer.tv.player.ui.CustomPlayerView;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p166.C2437;
import p166.InterfaceC2408;
import p166.InterfaceC2419;
import p345.AbstractC3980;
import p383.AbstractC4464;
import p383.AbstractC4470;
import p438.C5118;
import ʾי.ˑʽ;
import ʿﾞ.ﹳﹳ;

/* renamed from: ـᐧ.ᵢʿ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC3332 extends FrameLayout {

    /* renamed from: ʻʿ, reason: contains not printable characters */
    public final Object f12985;

    /* renamed from: ʻﹳ, reason: contains not printable characters */
    public boolean f12986;

    /* renamed from: ʽˆ, reason: contains not printable characters */
    public int f12987;

    /* renamed from: ʾʼ, reason: contains not printable characters */
    public final C3328 f12988;

    /* renamed from: ʿˊ, reason: contains not printable characters */
    public int f12989;

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final AspectRatioFrameLayout f12990;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final boolean f12991;

    /* renamed from: ˈﹳ, reason: contains not printable characters */
    public boolean f12992;

    /* renamed from: ˉᵎ, reason: contains not printable characters */
    public boolean f12993;

    /* renamed from: ˊᵔ, reason: contains not printable characters */
    public int f12994;

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public final ImageView f12995;

    /* renamed from: ˋﾞ, reason: contains not printable characters */
    public int f12996;

    /* renamed from: ˎˉ, reason: contains not printable characters */
    public int f12997;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final View f12998;

    /* renamed from: ˎᵔ, reason: contains not printable characters */
    public final Class f12999;

    /* renamed from: ˑⁱ, reason: contains not printable characters */
    public final FrameLayout f13000;

    /* renamed from: ˑﾞ, reason: contains not printable characters */
    public final FrameLayout f13001;

    /* renamed from: יˋ, reason: contains not printable characters */
    public boolean f13002;

    /* renamed from: ـˆ, reason: contains not printable characters */
    public final SubtitleView f13003;

    /* renamed from: ـᵎ, reason: contains not printable characters */
    public boolean f13004;

    /* renamed from: ٴᐧ, reason: contains not printable characters */
    public boolean f13005;

    /* renamed from: ٴﹶ, reason: contains not printable characters */
    public boolean f13006;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final View f13007;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final ViewOnLayoutChangeListenerC3325 f13008;

    /* renamed from: ᴵʼ, reason: contains not printable characters */
    public final View f13009;

    /* renamed from: ᵎʽ, reason: contains not printable characters */
    public Drawable f13010;

    /* renamed from: ᵔ, reason: contains not printable characters */
    public boolean f13011;

    /* renamed from: ᵔٴ, reason: contains not printable characters */
    public InterfaceC2419 f13012;

    /* renamed from: ᵔﹳ, reason: contains not printable characters */
    public final Method f13013;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final C3302 f13014;

    /* renamed from: ᵢٴ, reason: contains not printable characters */
    public final Handler f13015;

    /* renamed from: ⁱʿ, reason: contains not printable characters */
    public CharSequence f13016;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public final ImageView f13017;

    /* renamed from: ﾞˎ, reason: contains not printable characters */
    public InterfaceC3310 f13018;

    /* renamed from: ﾞᐧ, reason: contains not printable characters */
    public final TextView f13019;

    /* JADX WARN: Removed duplicated region for block: B:102:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0306  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public AbstractC3332(android.content.Context r22, android.util.AttributeSet r23, int r24) throws java.lang.NoSuchMethodException, java.lang.SecurityException, java.lang.IllegalArgumentException {
        /*
            Method dump skipped, instructions count: 821
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p272.AbstractC3332.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    private void setImage(Drawable drawable) {
        ImageView imageView = this.f13017;
        if (imageView == null) {
            return;
        }
        imageView.setImageDrawable(drawable);
        m8157();
    }

    private void setImageOutput(InterfaceC2419 interfaceC2419) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Class cls = this.f12999;
        if (cls == null || !cls.isAssignableFrom(interfaceC2419.getClass())) {
            return;
        }
        try {
            Method method = this.f13013;
            method.getClass();
            Object obj = this.f12985;
            obj.getClass();
            method.invoke(interfaceC2419, obj);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static void m8142(TextureView textureView, int i) {
        Matrix matrix = new Matrix();
        float width = textureView.getWidth();
        float height = textureView.getHeight();
        if (width != 0.0f && height != 0.0f && i != 0) {
            float f = width / 2.0f;
            float f2 = height / 2.0f;
            matrix.postRotate(i, f, f2);
            RectF rectF = new RectF(0.0f, 0.0f, width, height);
            RectF rectF2 = new RectF();
            matrix.mapRect(rectF2, rectF);
            matrix.postScale(width / rectF2.width(), height / rectF2.height(), f, f2);
        }
        textureView.setTransform(matrix);
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static void m8143(CustomPlayerView customPlayerView, Bitmap bitmap) {
        customPlayerView.setImage(new BitmapDrawable(customPlayerView.getResources(), bitmap));
        if (customPlayerView.m8144()) {
            return;
        }
        ImageView imageView = customPlayerView.f13017;
        if (imageView != null) {
            imageView.setVisibility(0);
            customPlayerView.m8157();
        }
        customPlayerView.m8152();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        C3302 c3302;
        super.dispatchDraw(canvas);
        if (AbstractC4470.f17202 != 34 || (c3302 = this.f13014) == null) {
            return;
        }
        c3302.m8107();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        ﹳﹳ r0 = this.f13012;
        if (r0 != null && r0.ٴᐧ(16) && ((C5118) this.f13012).m11356()) {
            return super.dispatchKeyEvent(keyEvent);
        }
        int keyCode = keyEvent.getKeyCode();
        boolean z = keyCode == 19 || keyCode == 270 || keyCode == 22 || keyCode == 271 || keyCode == 20 || keyCode == 269 || keyCode == 21 || keyCode == 268 || keyCode == 23;
        C3328 c3328 = this.f12988;
        if (z && m8159() && !c3328.m8130()) {
            m8151(true);
        } else {
            if ((!m8159() || !c3328.m8138(keyEvent)) && !super.dispatchKeyEvent(keyEvent)) {
                if (!z || !m8159()) {
                    return false;
                }
                m8151(true);
                return false;
            }
            m8151(true);
        }
        return true;
    }

    public List<ˑʽ> getAdOverlayInfos() {
        ArrayList arrayList = new ArrayList();
        FrameLayout frameLayout = this.f13000;
        if (frameLayout != null) {
            arrayList.add(new ˑʽ(29, frameLayout));
        }
        C3328 c3328 = this.f12988;
        if (c3328 != null) {
            arrayList.add(new ˑʽ(29, c3328));
        }
        return AbstractC3980.m9209(arrayList);
    }

    public ViewGroup getAdViewGroup() {
        FrameLayout frameLayout = this.f13001;
        AbstractC4464.m10136(frameLayout, "exo_ad_overlay must be present for ad playback");
        return frameLayout;
    }

    public int getArtworkDisplayMode() {
        return this.f12994;
    }

    public boolean getControllerAutoShow() {
        return this.f13002;
    }

    public boolean getControllerHideOnTouch() {
        return this.f12992;
    }

    public int getControllerShowTimeoutMs() {
        return this.f12997;
    }

    public Drawable getDefaultArtwork() {
        return this.f13010;
    }

    public int getImageDisplayMode() {
        return this.f12996;
    }

    public FrameLayout getOverlayFrameLayout() {
        return this.f13000;
    }

    public InterfaceC2419 getPlayer() {
        return this.f13012;
    }

    public int getResizeMode() {
        AspectRatioFrameLayout aspectRatioFrameLayout = this.f12990;
        AbstractC4464.m10146(aspectRatioFrameLayout);
        return aspectRatioFrameLayout.getResizeMode();
    }

    public SubtitleView getSubtitleView() {
        return this.f13003;
    }

    @Deprecated
    public boolean getUseArtwork() {
        return this.f12994 != 0;
    }

    public boolean getUseController() {
        return this.f13011;
    }

    public View getVideoSurfaceView() {
        return this.f13007;
    }

    @Override // android.view.View
    public final boolean onTrackballEvent(MotionEvent motionEvent) {
        if (!m8159() || this.f13012 == null) {
            return false;
        }
        m8151(true);
        return true;
    }

    @Override // android.view.View
    public final boolean performClick() {
        m8147();
        return super.performClick();
    }

    public void setArtworkDisplayMode(int i) {
        AbstractC4464.m10132(i == 0 || this.f12995 != null);
        if (this.f12994 != i) {
            this.f12994 = i;
            m8148(false);
        }
    }

    public void setAspectRatioListener(InterfaceC3315 interfaceC3315) {
        AspectRatioFrameLayout aspectRatioFrameLayout = this.f12990;
        AbstractC4464.m10146(aspectRatioFrameLayout);
        aspectRatioFrameLayout.setAspectRatioListener(interfaceC3315);
    }

    public void setControllerAnimationEnabled(boolean z) {
        C3328 c3328 = this.f12988;
        AbstractC4464.m10146(c3328);
        c3328.setAnimationEnabled(z);
    }

    public void setControllerAutoShow(boolean z) {
        this.f13002 = z;
    }

    public void setControllerHideDuringAds(boolean z) {
        this.f12986 = z;
    }

    public void setControllerHideOnTouch(boolean z) {
        AbstractC4464.m10146(this.f12988);
        this.f12992 = z;
        m8153();
    }

    @Deprecated
    public void setControllerOnFullScreenModeChangedListener(InterfaceC3338 interfaceC3338) {
        C3328 c3328 = this.f12988;
        AbstractC4464.m10146(c3328);
        c3328.setOnFullScreenModeChangedListener(interfaceC3338);
    }

    public void setControllerShowTimeoutMs(int i) {
        C3328 c3328 = this.f12988;
        AbstractC4464.m10146(c3328);
        this.f12997 = i;
        if (c3328.m8130()) {
            m8149(m8145());
        }
    }

    public void setControllerVisibilityListener(InterfaceC3301 interfaceC3301) {
        if (interfaceC3301 != null) {
            setControllerVisibilityListener((InterfaceC3310) null);
        }
    }

    @Deprecated
    public void setControllerVisibilityListener(InterfaceC3310 interfaceC3310) {
        C3328 c3328 = this.f12988;
        AbstractC4464.m10146(c3328);
        InterfaceC3310 interfaceC33102 = this.f13018;
        if (interfaceC33102 == interfaceC3310) {
            return;
        }
        CopyOnWriteArrayList copyOnWriteArrayList = c3328.f12946;
        if (interfaceC33102 != null) {
            copyOnWriteArrayList.remove(interfaceC33102);
        }
        this.f13018 = interfaceC3310;
        if (interfaceC3310 != null) {
            copyOnWriteArrayList.add(interfaceC3310);
            setControllerVisibilityListener((InterfaceC3301) null);
        }
    }

    public void setCustomErrorMessage(CharSequence charSequence) {
        AbstractC4464.m10132(this.f13019 != null);
        this.f13016 = charSequence;
        m8158();
    }

    public void setDefaultArtwork(Drawable drawable) {
        if (this.f13010 != drawable) {
            this.f13010 = drawable;
            m8148(false);
        }
    }

    public void setErrorMessageProvider(InterfaceC2408 interfaceC2408) {
        if (interfaceC2408 != null) {
            m8158();
        }
    }

    public void setFullscreenButtonClickListener(InterfaceC3309 interfaceC3309) {
        C3328 c3328 = this.f12988;
        AbstractC4464.m10146(c3328);
        c3328.setOnFullScreenModeChangedListener(this.f13008);
    }

    public void setImageDisplayMode(int i) {
        AbstractC4464.m10132(this.f13017 != null);
        if (this.f12996 != i) {
            this.f12996 = i;
            m8157();
        }
    }

    public void setKeepContentOnPlayerReset(boolean z) {
        if (this.f12993 != z) {
            this.f12993 = z;
            m8148(false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x01fe  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setPlayer(p166.InterfaceC2419 r12) throws java.lang.IllegalAccessException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 560
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p272.AbstractC3332.setPlayer(ˊﹶ.ˑﾞ):void");
    }

    public void setRepeatToggleModes(int i) {
        C3328 c3328 = this.f12988;
        AbstractC4464.m10146(c3328);
        c3328.setRepeatToggleModes(i);
    }

    public void setShowBuffering(int i) {
        if (this.f12989 != i) {
            this.f12989 = i;
            m8150();
        }
    }

    public void setShowFastForwardButton(boolean z) {
        C3328 c3328 = this.f12988;
        AbstractC4464.m10146(c3328);
        c3328.setShowFastForwardButton(z);
    }

    @Deprecated
    public void setShowMultiWindowTimeBar(boolean z) {
        C3328 c3328 = this.f12988;
        AbstractC4464.m10146(c3328);
        c3328.setShowMultiWindowTimeBar(z);
    }

    public void setShowNextButton(boolean z) {
        C3328 c3328 = this.f12988;
        AbstractC4464.m10146(c3328);
        c3328.setShowNextButton(z);
    }

    public void setShowPlayButtonIfPlaybackIsSuppressed(boolean z) {
        C3328 c3328 = this.f12988;
        AbstractC4464.m10146(c3328);
        c3328.setShowPlayButtonIfPlaybackIsSuppressed(z);
    }

    public void setShowPreviousButton(boolean z) {
        C3328 c3328 = this.f12988;
        AbstractC4464.m10146(c3328);
        c3328.setShowPreviousButton(z);
    }

    public void setShowRewindButton(boolean z) {
        C3328 c3328 = this.f12988;
        AbstractC4464.m10146(c3328);
        c3328.setShowRewindButton(z);
    }

    public void setShowShuffleButton(boolean z) {
        C3328 c3328 = this.f12988;
        AbstractC4464.m10146(c3328);
        c3328.setShowShuffleButton(z);
    }

    public void setShowSubtitleButton(boolean z) {
        C3328 c3328 = this.f12988;
        AbstractC4464.m10146(c3328);
        c3328.setShowSubtitleButton(z);
    }

    public void setShowVrButton(boolean z) {
        C3328 c3328 = this.f12988;
        AbstractC4464.m10146(c3328);
        c3328.setShowVrButton(z);
    }

    public void setShutterBackgroundColor(int i) {
        View view = this.f12998;
        if (view != null) {
            view.setBackgroundColor(i);
        }
    }

    public void setShutterEnabled(boolean z) {
        this.f13005 = z;
    }

    @Deprecated
    public void setUseArtwork(boolean z) {
        setArtworkDisplayMode(!z ? 1 : 0);
    }

    public void setUseController(boolean z) {
        boolean z2 = true;
        C3328 c3328 = this.f12988;
        AbstractC4464.m10132((z && c3328 == null) ? false : true);
        if (!z && !hasOnClickListeners()) {
            z2 = false;
        }
        setClickable(z2);
        if (this.f13011 == z) {
            return;
        }
        this.f13011 = z;
        if (m8159()) {
            c3328.setPlayer(this.f13012);
        } else if (c3328 != null) {
            c3328.m8133();
            c3328.setPlayer(null);
        }
        m8153();
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        View view = this.f13007;
        if (view instanceof SurfaceView) {
            view.setVisibility(i);
        }
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final boolean m8144() {
        ﹳﹳ r0 = this.f13012;
        return r0 != null && r0.ٴᐧ(30) && ((C5118) r0).m11367().m6486(2);
    }

    /* renamed from: ˉי, reason: contains not printable characters */
    public final boolean m8145() {
        InterfaceC2419 interfaceC2419 = this.f13012;
        if (interfaceC2419 == null) {
            return true;
        }
        int iM11361 = ((C5118) interfaceC2419).m11361();
        if (this.f13002 && (!this.f13012.ٴᐧ(17) || !((C5118) this.f13012).m11369().m6477())) {
            if (iM11361 == 1 || iM11361 == 4) {
                return true;
            }
            InterfaceC2419 interfaceC24192 = this.f13012;
            interfaceC24192.getClass();
            if (!((C5118) interfaceC24192).m11362()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public final void m8146(boolean z) {
        View view = this.f12998;
        if (view == null || view.getVisibility() == 0) {
            return;
        }
        view.setVisibility(0);
        if (!z) {
            view.setAlpha(1.0f);
        } else {
            view.setAlpha(0.0f);
            view.animate().alpha(1.0f).withLayer().setDuration(150L);
        }
    }

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public final void m8147() {
        if (!m8159() || this.f13012 == null) {
            return;
        }
        C3328 c3328 = this.f12988;
        if (!c3328.m8130()) {
            m8151(true);
        } else if (this.f12992) {
            c3328.m8133();
        }
    }

    /* renamed from: ˎٴ, reason: contains not printable characters */
    public final void m8148(boolean z) {
        Drawable drawable;
        ﹳﹳ r0 = this.f13012;
        boolean zM8161 = false;
        boolean z2 = (r0 == null || !r0.ٴᐧ(30) || ((C5118) r0).m11367().f9466.isEmpty()) ? false : true;
        boolean z3 = this.f12993;
        ImageView imageView = this.f12995;
        if (!z3 && (!z2 || z)) {
            if (imageView != null) {
                imageView.setImageResource(R.color.transparent);
                imageView.setVisibility(4);
            }
            m8152();
            m8154();
        }
        if (z2) {
            boolean zM8144 = m8144();
            boolean zM8160 = m8160();
            if (!zM8144 && !zM8160) {
                m8152();
                m8154();
            }
            ImageView imageView2 = this.f13017;
            View view = this.f12998;
            boolean z4 = (view == null || view.getVisibility() != 4 || imageView2 == null || (drawable = imageView2.getDrawable()) == null || drawable.getAlpha() == 0) ? false : true;
            if (zM8160 && !zM8144 && z4) {
                m8152();
                if (imageView2 != null) {
                    imageView2.setVisibility(0);
                    m8157();
                }
            } else if (zM8144 && !zM8160 && z4) {
                m8154();
            }
            if (!zM8144 && !zM8160 && this.f12994 != 0) {
                AbstractC4464.m10146(imageView);
                if (r0 != null && r0.ٴᐧ(18)) {
                    C5118 c5118 = (C5118) r0;
                    c5118.m11358();
                    byte[] bArr = c5118.f19574.f9562;
                    if (bArr != null) {
                        zM8161 = m8161(new BitmapDrawable(getResources(), BitmapFactory.decodeByteArray(bArr, 0, bArr.length)));
                    }
                }
                if (zM8161 || m8161(this.f13010)) {
                    return;
                }
            }
            if (imageView != null) {
                imageView.setImageResource(R.color.transparent);
                imageView.setVisibility(4);
            }
        }
    }

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public final void m8149(boolean z) {
        if (m8159()) {
            int i = z ? 0 : this.f12997;
            C3328 c3328 = this.f12988;
            c3328.setShowTimeoutMs(i);
            C3339 c3339 = c3328.f12948;
            C3328 c33282 = c3339.f13049;
            if (!c33282.m8139()) {
                c33282.setVisibility(0);
                c33282.m8124();
                ImageView imageView = c33282.f12964;
                if (imageView != null) {
                    imageView.requestFocus();
                }
            }
            c3339.m8167();
        }
    }

    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public abstract void m8150();

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final void m8151(boolean z) {
        if (!(m8155() && this.f12986) && m8159()) {
            C3328 c3328 = this.f12988;
            boolean z2 = c3328.m8130() && c3328.getShowTimeoutMs() <= 0;
            boolean zM8145 = m8145();
            if (z || z2 || zM8145) {
                m8149(zM8145);
            }
        }
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final void m8152() {
        if (!this.f13005 || this.f13006) {
            return;
        }
        m8146(true);
    }

    /* renamed from: ˑי, reason: contains not printable characters */
    public final void m8153() {
        C3328 c3328 = this.f12988;
        if (c3328 == null || !this.f13011) {
            setContentDescription(null);
        } else if (c3328.m8130()) {
            setContentDescription(this.f12992 ? getResources().getString(org.lsposed.hiddenapibypass.library.R.string._2_res_0x7f130092) : null);
        } else {
            setContentDescription(getResources().getString(org.lsposed.hiddenapibypass.library.R.string._2_res_0x7f1300a0));
        }
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final void m8154() {
        ImageView imageView = this.f13017;
        if (imageView != null) {
            imageView.setVisibility(4);
        }
        if (imageView != null) {
            imageView.setImageResource(R.color.transparent);
        }
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final boolean m8155() {
        ﹳﹳ r0 = this.f13012;
        return r0 != null && r0.ٴᐧ(16) && ((C5118) this.f13012).m11356() && ((C5118) this.f13012).m11362();
    }

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public final void m8156() {
        C2437 c2437;
        InterfaceC2419 interfaceC2419 = this.f13012;
        if (interfaceC2419 != null) {
            C5118 c5118 = (C5118) interfaceC2419;
            c5118.m11358();
            c2437 = c5118.f19566;
        } else {
            c2437 = C2437.f9721;
        }
        int i = c2437.f9724;
        int i2 = c2437.f9722;
        float f = (i2 == 0 || i == 0) ? 0.0f : (i * c2437.f9725) / i2;
        View view = this.f13007;
        if (view instanceof TextureView) {
            int i3 = c2437.f9723;
            if (f > 0.0f && (i3 == 90 || i3 == 270)) {
                f = 1.0f / f;
            }
            int i4 = this.f12987;
            ViewOnLayoutChangeListenerC3325 viewOnLayoutChangeListenerC3325 = this.f13008;
            if (i4 != 0) {
                view.removeOnLayoutChangeListener(viewOnLayoutChangeListenerC3325);
            }
            this.f12987 = i3;
            if (i3 != 0) {
                view.addOnLayoutChangeListener(viewOnLayoutChangeListenerC3325);
            }
            m8142((TextureView) view, this.f12987);
        }
        float f2 = this.f12991 ? 0.0f : f;
        AspectRatioFrameLayout aspectRatioFrameLayout = this.f12990;
        if (aspectRatioFrameLayout != null) {
            aspectRatioFrameLayout.setAspectRatio(f2);
        }
    }

    /* renamed from: ᵎˏ, reason: contains not printable characters */
    public final void m8157() {
        Drawable drawable;
        AspectRatioFrameLayout aspectRatioFrameLayout;
        ImageView imageView = this.f13017;
        if (imageView == null || (drawable = imageView.getDrawable()) == null) {
            return;
        }
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            return;
        }
        float width = intrinsicWidth / intrinsicHeight;
        ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_XY;
        if (this.f12996 == 1) {
            width = getWidth() / getHeight();
            scaleType = ImageView.ScaleType.CENTER_CROP;
        }
        if (imageView.getVisibility() == 0 && (aspectRatioFrameLayout = this.f12990) != null) {
            aspectRatioFrameLayout.setAspectRatio(width);
        }
        imageView.setScaleType(scaleType);
    }

    /* renamed from: ᵎـ, reason: contains not printable characters */
    public final void m8158() {
        TextView textView = this.f13019;
        if (textView != null) {
            CharSequence charSequence = this.f13016;
            if (charSequence != null) {
                textView.setText(charSequence);
                textView.setVisibility(0);
                return;
            }
            InterfaceC2419 interfaceC2419 = this.f13012;
            if (interfaceC2419 != null) {
                C5118 c5118 = (C5118) interfaceC2419;
                c5118.m11358();
                ExoPlaybackException exoPlaybackException = c5118.f19520.f19460;
            }
            textView.setVisibility(8);
        }
    }

    /* renamed from: ﹳˎ, reason: contains not printable characters */
    public final boolean m8159() {
        if (!this.f13011) {
            return false;
        }
        AbstractC4464.m10146(this.f12988);
        return true;
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final boolean m8160() {
        ﹳﹳ r0 = this.f13012;
        return r0 != null && this.f12985 != null && r0.ٴᐧ(30) && ((C5118) r0).m11367().m6486(4);
    }

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final boolean m8161(Drawable drawable) {
        ImageView imageView = this.f12995;
        if (imageView != null && drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicWidth > 0 && intrinsicHeight > 0) {
                float width = intrinsicWidth / intrinsicHeight;
                ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_XY;
                if (this.f12994 == 2) {
                    width = getWidth() / getHeight();
                    scaleType = ImageView.ScaleType.CENTER_CROP;
                }
                AspectRatioFrameLayout aspectRatioFrameLayout = this.f12990;
                if (aspectRatioFrameLayout != null) {
                    aspectRatioFrameLayout.setAspectRatio(width);
                }
                imageView.setScaleType(scaleType);
                imageView.setImageDrawable(drawable);
                imageView.setVisibility(0);
                return true;
            }
        }
        return false;
    }
}
