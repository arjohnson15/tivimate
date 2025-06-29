package p374;

import android.content.res.AssetManager;
import android.os.Build;
import androidx.media3.exoplayer.dash.DashMediaSource$Factory;
import androidx.media3.exoplayer.hls.HlsMediaSource$Factory;
import androidx.media3.exoplayer.rtsp.RtspMediaSource$Factory;
import androidx.media3.exoplayer.smoothstreaming.SsMediaSource$Factory;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.HashMap;
import java.util.concurrent.Executor;
import p193.C2705;
import p254.C3161;
import p293.C3474;
import p331.C3767;
import p353.InterfaceC4012;
import p362.C4125;
import p383.RunnableC4466;
import p404.AbstractC4630;
import p404.InterfaceC4634;
import ـˈ.ˉᵎ;

/* renamed from: ᵢˎ.ˋⁱ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4257 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final Object f16538;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public Object f16539;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public Object f16540;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final Object f16541;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public boolean f16542;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public Object f16543;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public Object f16544;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final Object f16545;

    public C4257(AssetManager assetManager, Executor executor, InterfaceC4634 interfaceC4634, String str, File file) {
        this.f16542 = false;
        this.f16538 = executor;
        this.f16541 = interfaceC4634;
        this.f16543 = str;
        this.f16539 = file;
        int i = Build.VERSION.SDK_INT;
        byte[] bArr = null;
        if (i >= 24 && i <= 34) {
            switch (i) {
                case 24:
                case 25:
                    bArr = AbstractC4630.f17737;
                    break;
                case 26:
                    bArr = AbstractC4630.f17741;
                    break;
                case 27:
                    bArr = AbstractC4630.f17740;
                    break;
                case 28:
                case 29:
                case 30:
                    bArr = AbstractC4630.f17735;
                    break;
                case 31:
                case 32:
                case 33:
                case 34:
                    bArr = AbstractC4630.f17742;
                    break;
            }
        }
        this.f16545 = bArr;
    }

    public C4257(C3161 c3161, C3474 c3474) {
        this.f16538 = c3161;
        this.f16543 = c3474;
        this.f16541 = new HashMap();
        this.f16545 = new HashMap();
        this.f16542 = true;
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public FileInputStream m9722(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e) {
            String message = e.getMessage();
            if (message != null && message.contains("compressed")) {
                ((InterfaceC4634) this.f16541).m10541();
            }
            return null;
        }
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public void m9723(int i, Serializable serializable) {
        ((Executor) this.f16538).execute(new RunnableC4466(this, i, serializable, 2));
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public InterfaceC4270 m9724(int i) {
        InterfaceC4012 interfaceC4012;
        InterfaceC4012 c4253;
        HashMap map = (HashMap) this.f16545;
        InterfaceC4270 interfaceC4270 = (InterfaceC4270) map.get(Integer.valueOf(i));
        if (interfaceC4270 != null) {
            return interfaceC4270;
        }
        HashMap map2 = (HashMap) this.f16541;
        InterfaceC4012 interfaceC40122 = (InterfaceC4012) map2.get(Integer.valueOf(i));
        if (interfaceC40122 == null) {
            final C3767 c3767 = (C3767) this.f16539;
            c3767.getClass();
            if (i == 0) {
                final Class clsAsSubclass = DashMediaSource$Factory.class.asSubclass(InterfaceC4270.class);
                final int i2 = 0;
                interfaceC4012 = new InterfaceC4012() { // from class: ᵢˎ.ˏʾ
                    @Override // p353.InterfaceC4012
                    public final Object get() {
                        switch (i2) {
                            case 0:
                                return C4279.m9739((Class) clsAsSubclass, c3767);
                            case 1:
                                return C4279.m9739((Class) clsAsSubclass, c3767);
                            case 2:
                                return C4279.m9739((Class) clsAsSubclass, c3767);
                            default:
                                return new C4262(c3767, (C3161) ((C4257) clsAsSubclass).f16538);
                        }
                    }
                };
            } else if (i == 1) {
                final Class clsAsSubclass2 = SsMediaSource$Factory.class.asSubclass(InterfaceC4270.class);
                final int i3 = 1;
                interfaceC4012 = new InterfaceC4012() { // from class: ᵢˎ.ˏʾ
                    @Override // p353.InterfaceC4012
                    public final Object get() {
                        switch (i3) {
                            case 0:
                                return C4279.m9739((Class) clsAsSubclass2, c3767);
                            case 1:
                                return C4279.m9739((Class) clsAsSubclass2, c3767);
                            case 2:
                                return C4279.m9739((Class) clsAsSubclass2, c3767);
                            default:
                                return new C4262(c3767, (C3161) ((C4257) clsAsSubclass2).f16538);
                        }
                    }
                };
            } else if (i != 2) {
                if (i == 3) {
                    c4253 = new C4253(0, RtspMediaSource$Factory.class.asSubclass(InterfaceC4270.class));
                } else {
                    if (i != 4) {
                        throw new IllegalArgumentException(ˉᵎ.ˉⁱ("Unrecognized contentType: ", i));
                    }
                    final int i4 = 3;
                    c4253 = new InterfaceC4012() { // from class: ᵢˎ.ˏʾ
                        @Override // p353.InterfaceC4012
                        public final Object get() {
                            switch (i4) {
                                case 0:
                                    return C4279.m9739((Class) this, c3767);
                                case 1:
                                    return C4279.m9739((Class) this, c3767);
                                case 2:
                                    return C4279.m9739((Class) this, c3767);
                                default:
                                    return new C4262(c3767, (C3161) ((C4257) this).f16538);
                            }
                        }
                    };
                }
                interfaceC40122 = c4253;
                map2.put(Integer.valueOf(i), interfaceC40122);
            } else {
                final Class clsAsSubclass3 = HlsMediaSource$Factory.class.asSubclass(InterfaceC4270.class);
                final int i5 = 2;
                interfaceC4012 = new InterfaceC4012() { // from class: ᵢˎ.ˏʾ
                    @Override // p353.InterfaceC4012
                    public final Object get() {
                        switch (i5) {
                            case 0:
                                return C4279.m9739((Class) clsAsSubclass3, c3767);
                            case 1:
                                return C4279.m9739((Class) clsAsSubclass3, c3767);
                            case 2:
                                return C4279.m9739((Class) clsAsSubclass3, c3767);
                            default:
                                return new C4262(c3767, (C3161) ((C4257) clsAsSubclass3).f16538);
                        }
                    }
                };
            }
            interfaceC40122 = interfaceC4012;
            map2.put(Integer.valueOf(i), interfaceC40122);
        }
        InterfaceC4270 interfaceC42702 = (InterfaceC4270) interfaceC40122.get();
        C4125 c4125 = (C4125) this.f16544;
        if (c4125 != null) {
            interfaceC42702.mo1146(c4125);
        }
        C2705 c2705 = (C2705) this.f16540;
        if (c2705 != null) {
            interfaceC42702.mo1144(c2705);
        }
        interfaceC42702.mo1142((C3474) this.f16543);
        interfaceC42702.mo1145(this.f16542);
        map.put(Integer.valueOf(i), interfaceC42702);
        return interfaceC42702;
    }
}
