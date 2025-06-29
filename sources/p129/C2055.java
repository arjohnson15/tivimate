package p129;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import p037.AbstractC1266;
import p037.C1263;
import p266.C3263;
import ˆʽ.ᵎˏ;
import ﾞﹶ.ᵢʿ;

/* renamed from: ˈﹶ.ﹶˆ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2055 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final HashMap f7781 = new HashMap();

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C2049 m5722(Class cls) throws NoSuchMethodException, SecurityException {
        InterfaceC2054[] interfaceC2054Arr;
        Method declaredMethod;
        Class cls2 = cls;
        C2049 c2049 = new C2049();
        c2049.f7769 = new ArrayList();
        ArrayList arrayList = new ArrayList();
        ᵢʿ.ˏᴵ(cls2, arrayList);
        int size = arrayList.size();
        Method[] methodArr = new Method[size];
        arrayList.toArray(methodArr);
        char c = 0;
        int i = 0;
        while (i < size) {
            Method method = methodArr[i];
            int i2 = 0;
            while (true) {
                if (i2 < size) {
                    Method method2 = methodArr[i2];
                    if (!method.getDeclaringClass().equals(method2.getDeclaringClass()) && method.getDeclaringClass().isAssignableFrom(method2.getDeclaringClass()) && method.getName().equals(method2.getName())) {
                        Class<?>[] parameterTypes = method.getParameterTypes();
                        Class<?>[] parameterTypes2 = method2.getParameterTypes();
                        for (int i3 = 0; i3 < parameterTypes2.length; i3++) {
                            if (!parameterTypes[i3].equals(parameterTypes2[i3])) {
                                break;
                            }
                        }
                        break;
                    }
                    i2++;
                } else {
                    InterfaceC2050 interfaceC2050 = (InterfaceC2050) ᵢʿ.ˉⁱ(method, InterfaceC2050.class);
                    if (!interfaceC2050.enabled() || method == null || ᵢʿ.ˉⁱ(method, InterfaceC2050.class) == null) {
                        break;
                    }
                    if (method.getParameterTypes().length != 1) {
                        System.out.println("Found no or more than one parameter in messageHandler [" + method.getName() + "]. A messageHandler must define exactly one parameter");
                    } else {
                        InterfaceC2051 interfaceC2051 = (InterfaceC2051) ᵢʿ.ˉⁱ(method, InterfaceC2051.class);
                        if (interfaceC2051 != null && !C3263.class.isAssignableFrom(method.getParameterTypes()[c])) {
                            System.out.println("Message envelope configured but no subclass of MessageEnvelope found as parameter");
                        } else if (interfaceC2051 == null || interfaceC2051.messages().length != 0) {
                            Class superclass = cls2;
                            while (true) {
                                interfaceC2054Arr = null;
                                if (superclass.equals(method.getDeclaringClass())) {
                                    declaredMethod = null;
                                    break;
                                }
                                try {
                                    declaredMethod = superclass.getDeclaredMethod(method.getName(), method.getParameterTypes());
                                    break;
                                } catch (NoSuchMethodException unused) {
                                    superclass = superclass.getSuperclass();
                                }
                            }
                            if (declaredMethod != null) {
                                method = declaredMethod;
                            }
                            if (interfaceC2050.filters().length != 0) {
                                interfaceC2054Arr = new InterfaceC2054[interfaceC2050.filters().length];
                                int i4 = 0;
                                for (InterfaceC2045 interfaceC2045 : interfaceC2050.filters()) {
                                    HashMap map = this.f7781;
                                    InterfaceC2054 interfaceC2054 = (InterfaceC2054) map.get(interfaceC2045.value());
                                    if (interfaceC2054 == null) {
                                        try {
                                            interfaceC2054 = (InterfaceC2054) interfaceC2045.value().newInstance();
                                            map.put(interfaceC2045.value(), interfaceC2054);
                                        } catch (Exception e) {
                                            throw new RuntimeException(e);
                                        }
                                    }
                                    interfaceC2054Arr[i4] = interfaceC2054;
                                    i4++;
                                }
                            }
                            if (interfaceC2054Arr == null) {
                                interfaceC2054Arr = new InterfaceC2054[0];
                            }
                            InterfaceC2051 interfaceC20512 = (InterfaceC2051) ᵢʿ.ˉⁱ(method, InterfaceC2051.class);
                            Class[] clsArrMessages = interfaceC20512 != null ? interfaceC20512.messages() : method.getParameterTypes();
                            method.setAccessible(true);
                            HashMap map2 = new HashMap();
                            map2.put("handler", method);
                            if (interfaceC2050.condition().length() > 0) {
                                if (AbstractC1266.f5182 == null) {
                                    throw new IllegalStateException("A handler uses an EL filter but no EL implementation is available.");
                                }
                                InterfaceC2054[] interfaceC2054Arr2 = new InterfaceC2054[interfaceC2054Arr.length + 1];
                                for (int i5 = 0; i5 < interfaceC2054Arr.length; i5++) {
                                    interfaceC2054Arr2[i5] = interfaceC2054Arr[i5];
                                }
                                interfaceC2054Arr2[interfaceC2054Arr.length] = new C1263();
                                interfaceC2054Arr = interfaceC2054Arr2;
                            }
                            map2.put("filter", interfaceC2054Arr);
                            String strCondition = interfaceC2050.condition();
                            if (!strCondition.trim().startsWith("${") && !strCondition.trim().startsWith("#{")) {
                                strCondition = ᵎˏ.ˑי("${", strCondition, "}");
                            }
                            map2.put("condition", strCondition);
                            map2.put("priority", Integer.valueOf(interfaceC2050.priority()));
                            map2.put("invocation", interfaceC2050.invocation());
                            map2.put("invocationMode", interfaceC2050.delivery());
                            map2.put("envelope", Boolean.valueOf(interfaceC20512 != null));
                            map2.put("subtypes", Boolean.valueOf(!interfaceC2050.rejectSubtypes()));
                            map2.put("listener", c2049);
                            map2.put("synchronized", Boolean.valueOf(ᵢʿ.ˉⁱ(method, InterfaceC2048.class) != null));
                            map2.put("messages", clsArrMessages);
                            c2049.f7769.add(new C2053(map2));
                        } else {
                            System.out.println("Message envelope configured but message types defined for handler");
                        }
                    }
                }
            }
            i++;
            cls2 = cls;
            c = 0;
        }
        return c2049;
    }
}
