package p230;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.opengl.GLSurfaceView;
import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import android.view.View;
import android.view.WindowManager;
import androidx.lifecycle.RunnableC0246;
import java.util.concurrent.CopyOnWriteArrayList;
import p007.InterfaceC0939;

/* renamed from: ˑˈ.ˉⁱ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3065 extends GLSurfaceView {

    /* renamed from: ʾʼ, reason: contains not printable characters */
    public static final /* synthetic */ int f11808 = 0;

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final SensorManager f11809;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final Handler f11810;

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public Surface f11811;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final Sensor f11812;

    /* renamed from: ـˆ, reason: contains not printable characters */
    public boolean f11813;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final C3073 f11814;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final CopyOnWriteArrayList f11815;

    /* renamed from: ᴵʼ, reason: contains not printable characters */
    public boolean f11816;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final C3064 f11817;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public SurfaceTexture f11818;

    /* renamed from: ﾞᐧ, reason: contains not printable characters */
    public boolean f11819;

    public C3065(Context context) {
        super(context, null);
        this.f11815 = new CopyOnWriteArrayList();
        this.f11810 = new Handler(Looper.getMainLooper());
        Object systemService = context.getSystemService("sensor");
        systemService.getClass();
        SensorManager sensorManager = (SensorManager) systemService;
        this.f11809 = sensorManager;
        Sensor defaultSensor = sensorManager.getDefaultSensor(15);
        this.f11812 = defaultSensor == null ? sensorManager.getDefaultSensor(11) : defaultSensor;
        C3064 c3064 = new C3064();
        this.f11817 = c3064;
        C3067 c3067 = new C3067(this, c3064);
        View.OnTouchListener viewOnTouchListenerC3066 = new ViewOnTouchListenerC3066(context, c3067);
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        windowManager.getClass();
        this.f11814 = new C3073(windowManager.getDefaultDisplay(), viewOnTouchListenerC3066, c3067);
        this.f11813 = true;
        setEGLContextClientVersion(2);
        setRenderer(c3067);
        setOnTouchListener(viewOnTouchListenerC3066);
    }

    public InterfaceC3070 getCameraMotionListener() {
        return this.f11817;
    }

    public InterfaceC0939 getVideoFrameMetadataListener() {
        return this.f11817;
    }

    public Surface getVideoSurface() {
        return this.f11811;
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f11810.post(new RunnableC0246(10, this));
    }

    @Override // android.opengl.GLSurfaceView
    public final void onPause() {
        this.f11816 = false;
        m7558();
        super.onPause();
    }

    @Override // android.opengl.GLSurfaceView
    public final void onResume() {
        super.onResume();
        this.f11816 = true;
        m7558();
    }

    public void setDefaultStereoMode(int i) {
        this.f11817.f11807 = i;
    }

    public void setUseSensorRotation(boolean z) {
        this.f11813 = z;
        m7558();
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void m7558() {
        boolean z = this.f11813 && this.f11816;
        Sensor sensor = this.f11812;
        if (sensor == null || z == this.f11819) {
            return;
        }
        C3073 c3073 = this.f11814;
        SensorManager sensorManager = this.f11809;
        if (z) {
            sensorManager.registerListener(c3073, sensor, 0);
        } else {
            sensorManager.unregisterListener(c3073);
        }
        this.f11819 = z;
    }
}
