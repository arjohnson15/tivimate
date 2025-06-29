package p043;

import com.google.firebase.encoders.EncodingException;
import java.util.Map;
import p103.InterfaceC1789;
import p103.InterfaceC1792;
import p302.C3508;

/* renamed from: ʽי.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final /* synthetic */ class C1292 implements InterfaceC1789 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final /* synthetic */ int f5307;

    @Override // p103.InterfaceC1790
    /* renamed from: ـﹶ */
    public final void mo4581(Object obj, Object obj2) {
        switch (this.f5307) {
            case 0:
                throw new EncodingException("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                InterfaceC1792 interfaceC1792 = (InterfaceC1792) obj2;
                interfaceC1792.mo4589(C3508.f13605, entry.getKey());
                interfaceC1792.mo4589(C3508.f13603, entry.getValue());
                return;
            default:
                throw new EncodingException("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }
    }
}
