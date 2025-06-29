package p287;

import android.os.Parcel;
import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p200.C2741;

/* renamed from: ٴˏ.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC3393 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final C2741 f13239;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final C2741 f13240;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C2741 f13241;

    public AbstractC3393(C2741 c2741, C2741 c27412, C2741 c27413) {
        this.f13241 = c2741;
        this.f13239 = c27412;
        this.f13240 = c27413;
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final Class m8254(Class cls) throws ClassNotFoundException {
        String name = cls.getName();
        C2741 c2741 = this.f13240;
        Class cls2 = (Class) c2741.get(name);
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(cls.getPackage().getName() + "." + cls.getSimpleName() + "Parcelizer", false, cls.getClassLoader());
        c2741.put(cls.getName(), cls3);
        return cls3;
    }

    /* renamed from: ʿʼ */
    public abstract boolean mo8251(int i);

    /* renamed from: ˉי, reason: contains not printable characters */
    public final void m8255(int i, int i2) {
        mo8253(i2);
        ((C3391) this).f13231.writeInt(i);
    }

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public final void m8256(InterfaceC3392 interfaceC3392) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (interfaceC3392 == null) {
            ((C3391) this).f13231.writeString(null);
            return;
        }
        try {
            ((C3391) this).f13231.writeString(m8254(interfaceC3392.getClass()).getName());
            C3391 c3391Mo8252 = mo8252();
            try {
                m8262(interfaceC3392.getClass()).invoke(null, interfaceC3392, c3391Mo8252);
                int i = c3391Mo8252.f13238;
                if (i >= 0) {
                    int i2 = c3391Mo8252.f13237.get(i);
                    Parcel parcel = c3391Mo8252.f13231;
                    int iDataPosition = parcel.dataPosition();
                    parcel.setDataPosition(i2);
                    parcel.writeInt(iDataPosition - i2);
                    parcel.setDataPosition(iDataPosition);
                }
            } catch (ClassNotFoundException e) {
                throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e);
            } catch (IllegalAccessException e2) {
                throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e2);
            } catch (NoSuchMethodException e3) {
                throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
            } catch (InvocationTargetException e4) {
                if (!(e4.getCause() instanceof RuntimeException)) {
                    throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e4);
                }
                throw ((RuntimeException) e4.getCause());
            }
        } catch (ClassNotFoundException e5) {
            throw new RuntimeException(interfaceC3392.getClass().getSimpleName().concat(" does not have a Parcelizer"), e5);
        }
    }

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public final void m8257(Parcelable parcelable, int i) {
        mo8253(i);
        ((C3391) this).f13231.writeParcelable(parcelable, 0);
    }

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final InterfaceC3392 m8258() {
        String string = ((C3391) this).f13231.readString();
        if (string == null) {
            return null;
        }
        try {
            return (InterfaceC3392) m8259(string).invoke(null, mo8252());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
        } catch (InvocationTargetException e4) {
            if (e4.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e4.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e4);
        }
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final Method m8259(String str) throws NoSuchMethodException, SecurityException {
        C2741 c2741 = this.f13241;
        Method method = (Method) c2741.get(str);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, AbstractC3393.class.getClassLoader()).getDeclaredMethod("read", AbstractC3393.class);
        c2741.put(str, declaredMethod);
        return declaredMethod;
    }

    /* renamed from: ـﹶ */
    public abstract C3391 mo8252();

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final int m8260(int i, int i2) {
        return !mo8251(i2) ? i : ((C3391) this).f13231.readInt();
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final Parcelable m8261(Parcelable parcelable, int i) {
        if (!mo8251(i)) {
            return parcelable;
        }
        return ((C3391) this).f13231.readParcelable(C3391.class.getClassLoader());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final Method m8262(Class cls) throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        String name = cls.getName();
        C2741 c2741 = this.f13239;
        Method method = (Method) c2741.get(name);
        if (method != null) {
            return method;
        }
        Class clsM8254 = m8254(cls);
        System.currentTimeMillis();
        Method declaredMethod = clsM8254.getDeclaredMethod("write", cls, AbstractC3393.class);
        c2741.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    /* renamed from: ﹶˆ */
    public abstract void mo8253(int i);
}
