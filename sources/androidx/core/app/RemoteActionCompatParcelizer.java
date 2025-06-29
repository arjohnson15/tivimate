package androidx.core.app;

import android.app.PendingIntent;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import java.lang.reflect.InvocationTargetException;
import p287.AbstractC3393;
import p287.C3391;
import p287.InterfaceC3392;

/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(AbstractC3393 abstractC3393) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        InterfaceC3392 interfaceC3392M8258 = remoteActionCompat.f303;
        if (abstractC3393.mo8251(1)) {
            interfaceC3392M8258 = abstractC3393.m8258();
        }
        remoteActionCompat.f303 = (IconCompat) interfaceC3392M8258;
        CharSequence charSequence = remoteActionCompat.f300;
        if (abstractC3393.mo8251(2)) {
            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((C3391) abstractC3393).f13231);
        }
        remoteActionCompat.f300 = charSequence;
        CharSequence charSequence2 = remoteActionCompat.f302;
        if (abstractC3393.mo8251(3)) {
            charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((C3391) abstractC3393).f13231);
        }
        remoteActionCompat.f302 = charSequence2;
        remoteActionCompat.f305 = (PendingIntent) abstractC3393.m8261(remoteActionCompat.f305, 4);
        boolean z = remoteActionCompat.f301;
        if (abstractC3393.mo8251(5)) {
            z = ((C3391) abstractC3393).f13231.readInt() != 0;
        }
        remoteActionCompat.f301 = z;
        boolean z2 = remoteActionCompat.f304;
        if (abstractC3393.mo8251(6)) {
            z2 = ((C3391) abstractC3393).f13231.readInt() != 0;
        }
        remoteActionCompat.f304 = z2;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, AbstractC3393 abstractC3393) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        abstractC3393.getClass();
        IconCompat iconCompat = remoteActionCompat.f303;
        abstractC3393.mo8253(1);
        abstractC3393.m8256(iconCompat);
        CharSequence charSequence = remoteActionCompat.f300;
        abstractC3393.mo8253(2);
        Parcel parcel = ((C3391) abstractC3393).f13231;
        TextUtils.writeToParcel(charSequence, parcel, 0);
        CharSequence charSequence2 = remoteActionCompat.f302;
        abstractC3393.mo8253(3);
        TextUtils.writeToParcel(charSequence2, parcel, 0);
        abstractC3393.m8257(remoteActionCompat.f305, 4);
        boolean z = remoteActionCompat.f301;
        abstractC3393.mo8253(5);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = remoteActionCompat.f304;
        abstractC3393.mo8253(6);
        parcel.writeInt(z2 ? 1 : 0);
    }
}
