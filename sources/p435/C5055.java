package p435;

import j$.util.DesugarCollections;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.TreeMap;
import p169.AbstractC2458;
import p169.C2460;
import ᵎﹳ.ᐧʻ;

/* renamed from: ﹶᵔ.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C5055 implements InterfaceC5049 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final /* synthetic */ int f19187;

    public /* synthetic */ C5055(int i) {
        this.f19187 = i;
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static void m11215(Type type, Class cls) {
        Class<?> clsM11172 = AbstractC5047.m11172(type);
        if (cls.isAssignableFrom(clsM11172)) {
            throw new IllegalArgumentException("No JsonAdapter for " + type + ", you should probably use " + cls.getSimpleName() + " instead of " + clsM11172.getSimpleName() + " (Moshi only supports the collection interfaces by default) or else register a custom JsonAdapter.");
        }
    }

    @Override // p435.InterfaceC5049
    /* renamed from: ـﹶ */
    public final AbstractC5044 mo11183(Type type, Set set, C5054 c5054) throws NoSuchFieldException, NoSuchMethodException, ClassNotFoundException, SecurityException {
        AbstractC5047 c5052;
        Class cls;
        boolean z;
        Field[] fieldArr;
        int i;
        InterfaceC5065 interfaceC5065;
        Class clsM11172;
        Type[] actualTypeArguments;
        C2460 c2460M11157;
        Class<?> cls2;
        Constructor<?> declaredConstructor;
        Object[] objArr;
        Type typeM6578 = type;
        Class<?> cls3 = null;
        switch (this.f19187) {
            case 0:
                Type genericComponentType = typeM6578 instanceof GenericArrayType ? ((GenericArrayType) typeM6578).getGenericComponentType() : typeM6578 instanceof Class ? ((Class) typeM6578).getComponentType() : null;
                if (genericComponentType == null || !set.isEmpty()) {
                    return null;
                }
                Class clsM111722 = AbstractC5047.m11172(genericComponentType);
                c5054.getClass();
                return new C5038(clsM111722, c5054.m11213(genericComponentType, AbstractC2458.f9787, null)).m11157();
            case 1:
                if (!(typeM6578 instanceof Class) && !(typeM6578 instanceof ParameterizedType)) {
                    return null;
                }
                Class clsM111723 = AbstractC5047.m11172(type);
                if (clsM111723.isInterface() || clsM111723.isEnum() || !set.isEmpty()) {
                    return null;
                }
                if (AbstractC2458.m6580(clsM111723)) {
                    m11215(typeM6578, List.class);
                    m11215(typeM6578, Set.class);
                    m11215(typeM6578, Map.class);
                    m11215(typeM6578, Collection.class);
                    String str = "Platform " + clsM111723;
                    if (typeM6578 instanceof ParameterizedType) {
                        str = str + " in " + typeM6578;
                    }
                    throw new IllegalArgumentException(ᐧʻ.ˉⁱ(str, " requires explicit JsonAdapter to be registered"));
                }
                if (clsM111723.isAnonymousClass()) {
                    throw new IllegalArgumentException("Cannot serialize anonymous class ".concat(clsM111723.getName()));
                }
                if (clsM111723.isLocalClass()) {
                    throw new IllegalArgumentException("Cannot serialize local class ".concat(clsM111723.getName()));
                }
                if (clsM111723.getEnclosingClass() != null && !Modifier.isStatic(clsM111723.getModifiers())) {
                    throw new IllegalArgumentException("Cannot serialize non-static nested class ".concat(clsM111723.getName()));
                }
                if (Modifier.isAbstract(clsM111723.getModifiers())) {
                    throw new IllegalArgumentException("Cannot serialize abstract class ".concat(clsM111723.getName()));
                }
                Class<? extends Annotation> cls4 = AbstractC2458.f9788;
                if (cls4 != null && clsM111723.isAnnotationPresent(cls4)) {
                    throw new IllegalArgumentException("Cannot serialize Kotlin type " + clsM111723.getName() + ". Reflective serialization of Kotlin classes without using kotlin-reflect has undefined and unexpected behavior. Please use KotlinJsonAdapterFactory from the moshi-kotlin artifact or use code gen from the moshi-kotlin-codegen artifact.");
                }
                try {
                    try {
                        try {
                            try {
                                Constructor declaredConstructor2 = clsM111723.getDeclaredConstructor(null);
                                declaredConstructor2.setAccessible(true);
                                c5052 = new C5052(declaredConstructor2, clsM111723);
                            } catch (IllegalAccessException unused) {
                                throw new AssertionError();
                            } catch (NoSuchMethodException unused2) {
                                Method declaredMethod = ObjectInputStream.class.getDeclaredMethod("newInstance", Class.class, Class.class);
                                declaredMethod.setAccessible(true);
                                c5052 = new C5052(declaredMethod, clsM111723);
                            } catch (InvocationTargetException e) {
                                AbstractC2458.m6579(e);
                                throw null;
                            }
                        } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused3) {
                            Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", Class.class);
                            declaredMethod2.setAccessible(true);
                            int iIntValue = ((Integer) declaredMethod2.invoke(null, Object.class)).intValue();
                            Method declaredMethod3 = ObjectStreamClass.class.getDeclaredMethod("newInstance", Class.class, Integer.TYPE);
                            declaredMethod3.setAccessible(true);
                            c5052 = new C5039(declaredMethod3, clsM111723, iIntValue);
                        } catch (IllegalAccessException unused4) {
                            throw new AssertionError();
                        }
                    } catch (Exception unused5) {
                        throw new IllegalArgumentException("cannot construct instances of ".concat(clsM111723.getName()));
                    }
                } catch (NoSuchMethodException unused6) {
                    Class<?> cls5 = Class.forName("sun.misc.Unsafe");
                    Field declaredField = cls5.getDeclaredField("theUnsafe");
                    declaredField.setAccessible(true);
                    c5052 = new C5064(cls5.getMethod("allocateInstance", Class.class), declaredField.get(null), clsM111723);
                }
                TreeMap treeMap = new TreeMap();
                while (typeM6578 != Object.class) {
                    Class clsM111724 = AbstractC5047.m11172(typeM6578);
                    boolean zM6580 = AbstractC2458.m6580(clsM111724);
                    Field[] declaredFields = clsM111724.getDeclaredFields();
                    int length = declaredFields.length;
                    int i2 = 0;
                    while (i2 < length) {
                        Field field = declaredFields[i2];
                        int modifiers = field.getModifiers();
                        if (Modifier.isStatic(modifiers) || Modifier.isTransient(modifiers) || (!(Modifier.isPublic(modifiers) || Modifier.isProtected(modifiers) || !zM6580) || ((interfaceC5065 = (InterfaceC5065) field.getAnnotation(InterfaceC5065.class)) != null && interfaceC5065.ignore()))) {
                            cls = clsM111724;
                            z = zM6580;
                            fieldArr = declaredFields;
                            i = length;
                        } else {
                            Type typeM65782 = AbstractC2458.m6578(typeM6578, clsM111724, field.getGenericType(), new LinkedHashSet());
                            Annotation[] annotations = field.getAnnotations();
                            int length2 = annotations.length;
                            cls = clsM111724;
                            int i3 = 0;
                            LinkedHashSet linkedHashSet = null;
                            while (i3 < length2) {
                                boolean z2 = zM6580;
                                Annotation annotation = annotations[i3];
                                Field[] fieldArr2 = declaredFields;
                                int i4 = length;
                                if (annotation.annotationType().isAnnotationPresent(InterfaceC5059.class)) {
                                    if (linkedHashSet == null) {
                                        linkedHashSet = new LinkedHashSet();
                                    }
                                    LinkedHashSet linkedHashSet2 = linkedHashSet;
                                    linkedHashSet2.add(annotation);
                                    linkedHashSet = linkedHashSet2;
                                }
                                i3++;
                                zM6580 = z2;
                                declaredFields = fieldArr2;
                                length = i4;
                            }
                            z = zM6580;
                            fieldArr = declaredFields;
                            i = length;
                            Set setUnmodifiableSet = linkedHashSet != null ? DesugarCollections.unmodifiableSet(linkedHashSet) : AbstractC2458.f9787;
                            String name = field.getName();
                            AbstractC5044 abstractC5044M11213 = c5054.m11213(typeM65782, setUnmodifiableSet, name);
                            field.setAccessible(true);
                            if (interfaceC5065 != null) {
                                String strName = interfaceC5065.name();
                                if (!"\u0000".equals(strName)) {
                                    name = strName;
                                }
                            }
                            C5056 c5056 = (C5056) treeMap.put(name, new C5056(name, field, abstractC5044M11213));
                            if (c5056 != null) {
                                throw new IllegalArgumentException("Conflicting fields:\n    " + c5056.f19188 + "\n    " + field);
                            }
                        }
                        i2++;
                        clsM111724 = cls;
                        zM6580 = z;
                        declaredFields = fieldArr;
                        length = i;
                    }
                    Class clsM111725 = AbstractC5047.m11172(typeM6578);
                    typeM6578 = AbstractC2458.m6578(typeM6578, clsM111725, clsM111725.getGenericSuperclass(), new LinkedHashSet());
                }
                return new C5057(c5052, treeMap).m11157();
            case 2:
                Class clsM111726 = AbstractC5047.m11172(type);
                if (!set.isEmpty()) {
                    return null;
                }
                if (clsM111726 == List.class || clsM111726 == Collection.class) {
                    Type typeM11169 = AbstractC5047.m11169(typeM6578, Collection.class);
                    c5054.getClass();
                    return new C5051(c5054.m11213(typeM11169, AbstractC2458.f9787, null), 0).m11157();
                }
                if (clsM111726 != Set.class) {
                    return null;
                }
                Type typeM111692 = AbstractC5047.m11169(typeM6578, Collection.class);
                c5054.getClass();
                return new C5051(c5054.m11213(typeM111692, AbstractC2458.f9787, null), 1).m11157();
            case 3:
                if (!set.isEmpty() || (clsM11172 = AbstractC5047.m11172(type)) != Map.class) {
                    return null;
                }
                if (typeM6578 == Properties.class) {
                    actualTypeArguments = new Type[]{String.class, String.class};
                } else {
                    if (!Map.class.isAssignableFrom(clsM11172)) {
                        throw new IllegalArgumentException();
                    }
                    Type typeM65783 = AbstractC2458.m6578(typeM6578, clsM11172, AbstractC2458.m6576(typeM6578, clsM11172, Map.class), new LinkedHashSet());
                    actualTypeArguments = typeM65783 instanceof ParameterizedType ? ((ParameterizedType) typeM65783).getActualTypeArguments() : new Type[]{Object.class, Object.class};
                }
                return new C5038(c5054, actualTypeArguments[0], actualTypeArguments[1]).m11157();
            case 4:
                return null;
            default:
                if (!set.isEmpty()) {
                    return null;
                }
                Class cls6 = Boolean.TYPE;
                C5042 c5042 = AbstractC5047.f19146;
                if (typeM6578 == cls6) {
                    return c5042;
                }
                Class cls7 = Byte.TYPE;
                C5042 c50422 = AbstractC5047.f19150;
                if (typeM6578 == cls7) {
                    return c50422;
                }
                Class cls8 = Character.TYPE;
                C5042 c50423 = AbstractC5047.f19154;
                if (typeM6578 == cls8) {
                    return c50423;
                }
                Class cls9 = Double.TYPE;
                C5042 c50424 = AbstractC5047.f19147;
                if (typeM6578 == cls9) {
                    return c50424;
                }
                Class cls10 = Float.TYPE;
                C5042 c50425 = AbstractC5047.f19152;
                if (typeM6578 == cls10) {
                    return c50425;
                }
                Class cls11 = Integer.TYPE;
                C5042 c50426 = AbstractC5047.f19153;
                if (typeM6578 == cls11) {
                    return c50426;
                }
                Class cls12 = Long.TYPE;
                C5042 c50427 = AbstractC5047.f19149;
                if (typeM6578 == cls12) {
                    return c50427;
                }
                Class cls13 = Short.TYPE;
                C5042 c50428 = AbstractC5047.f19155;
                if (typeM6578 == cls13) {
                    return c50428;
                }
                if (typeM6578 == Boolean.class) {
                    return c5042.m11157();
                }
                if (typeM6578 == Byte.class) {
                    return c50422.m11157();
                }
                if (typeM6578 == Character.class) {
                    return c50423.m11157();
                }
                if (typeM6578 == Double.class) {
                    return c50424.m11157();
                }
                if (typeM6578 == Float.class) {
                    return c50425.m11157();
                }
                if (typeM6578 == Integer.class) {
                    return c50426.m11157();
                }
                if (typeM6578 == Long.class) {
                    return c50427.m11157();
                }
                if (typeM6578 == Short.class) {
                    return c50428.m11157();
                }
                if (typeM6578 == String.class) {
                    return AbstractC5047.f19148.m11157();
                }
                if (typeM6578 == Object.class) {
                    return new C5041(c5054).m11157();
                }
                Class clsM111727 = AbstractC5047.m11172(type);
                Set set2 = AbstractC2458.f9787;
                InterfaceC5046 interfaceC5046 = (InterfaceC5046) clsM111727.getAnnotation(InterfaceC5046.class);
                if (interfaceC5046 == null || !interfaceC5046.generateAdapter()) {
                    c2460M11157 = null;
                } else {
                    try {
                        try {
                            cls2 = Class.forName(clsM111727.getName().replace("$", "_") + "JsonAdapter", true, clsM111727.getClassLoader());
                        } catch (ClassNotFoundException e2) {
                            throw new RuntimeException("Failed to find the generated JsonAdapter class for " + typeM6578, e2);
                        } catch (IllegalAccessException e3) {
                            throw new RuntimeException("Failed to access the generated JsonAdapter for " + typeM6578, e3);
                        } catch (InstantiationException e4) {
                            throw new RuntimeException("Failed to instantiate the generated JsonAdapter for " + typeM6578, e4);
                        } catch (InvocationTargetException e5) {
                            AbstractC2458.m6579(e5);
                            throw null;
                        }
                    } catch (NoSuchMethodException e6) {
                        e = e6;
                    }
                    try {
                        if (typeM6578 instanceof ParameterizedType) {
                            Type[] actualTypeArguments2 = ((ParameterizedType) typeM6578).getActualTypeArguments();
                            try {
                                declaredConstructor = cls2.getDeclaredConstructor(C5054.class, Type[].class);
                                objArr = new Object[]{c5054, actualTypeArguments2};
                            } catch (NoSuchMethodException unused7) {
                                declaredConstructor = cls2.getDeclaredConstructor(Type[].class);
                                objArr = new Object[]{actualTypeArguments2};
                            }
                        } else {
                            try {
                                declaredConstructor = cls2.getDeclaredConstructor(C5054.class);
                                objArr = new Object[]{c5054};
                            } catch (NoSuchMethodException unused8) {
                                declaredConstructor = cls2.getDeclaredConstructor(null);
                                objArr = new Object[0];
                            }
                        }
                        declaredConstructor.setAccessible(true);
                        c2460M11157 = ((AbstractC5044) declaredConstructor.newInstance(objArr)).m11157();
                    } catch (NoSuchMethodException e7) {
                        e = e7;
                        cls3 = cls2;
                        if ((typeM6578 instanceof ParameterizedType) || cls3.getTypeParameters().length == 0) {
                            throw new RuntimeException("Failed to find the generated JsonAdapter constructor for " + typeM6578, e);
                        }
                        throw new RuntimeException("Failed to find the generated JsonAdapter constructor for '" + typeM6578 + "'. Suspiciously, the type was not parameterized but the target class '" + cls3.getCanonicalName() + "' is generic. Consider using Types#newParameterizedType() to define these missing type variables.", e);
                    }
                }
                if (c2460M11157 != null) {
                    return c2460M11157;
                }
                if (clsM111727.isEnum()) {
                    return new C5058(clsM111727).m11157();
                }
                return null;
        }
    }
}
