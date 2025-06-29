package p230;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.opengl.Matrix;
import android.view.Display;
import com.bumptech.glide.C0295;

/* renamed from: ˑˈ.ﹳﹳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3073 implements SensorEventListener {

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final Display f11857;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final InterfaceC3069[] f11860;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public boolean f11861;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final float[] f11859 = new float[16];

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final float[] f11856 = new float[16];

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final float[] f11858 = new float[16];

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final float[] f11862 = new float[3];

    public C3073(Display display, InterfaceC3069... interfaceC3069Arr) {
        this.f11857 = display;
        this.f11860 = interfaceC3069Arr;
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        int i;
        float[] fArr = sensorEvent.values;
        float[] fArr2 = this.f11859;
        SensorManager.getRotationMatrixFromVector(fArr2, fArr);
        int rotation = this.f11857.getRotation();
        float[] fArr3 = this.f11856;
        if (rotation != 0) {
            int i2 = 129;
            if (rotation != 1) {
                i = 130;
                if (rotation != 2) {
                    if (rotation != 3) {
                        throw new IllegalStateException();
                    }
                    i2 = 130;
                    i = 1;
                }
            } else {
                i2 = 2;
                i = 129;
            }
            System.arraycopy(fArr2, 0, fArr3, 0, fArr3.length);
            SensorManager.remapCoordinateSystem(fArr3, i2, i, fArr2);
        }
        SensorManager.remapCoordinateSystem(fArr2, 1, 131, fArr3);
        float[] fArr4 = this.f11862;
        SensorManager.getOrientation(fArr3, fArr4);
        float f = fArr4[2];
        Matrix.rotateM(fArr2, 0, 90.0f, 1.0f, 0.0f, 0.0f);
        boolean z = this.f11861;
        float[] fArr5 = this.f11858;
        if (!z) {
            C0295.m1601(fArr5, fArr2);
            this.f11861 = true;
        }
        System.arraycopy(fArr2, 0, fArr3, 0, fArr3.length);
        Matrix.multiplyMM(fArr2, 0, fArr3, 0, fArr5, 0);
        InterfaceC3069[] interfaceC3069Arr = this.f11860;
        for (int i3 = 0; i3 < 2; i3++) {
            interfaceC3069Arr[i3].mo7559(fArr2, f);
        }
    }
}
