package p127;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p070.AbstractC1549;

/* renamed from: ˈⁱ.ﹶˆ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2035 implements InvocationHandler {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public boolean f7701;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public String f7702;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final ArrayList f7703;

    public C2035(ArrayList arrayList) {
        this.f7703 = arrayList;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        if (objArr == null) {
            objArr = new Object[0];
        }
        String name = method.getName();
        Class<?> returnType = method.getReturnType();
        if (AbstractC1549.m5138(name, "supports") && AbstractC1549.m5138(Boolean.TYPE, returnType)) {
            return Boolean.TRUE;
        }
        if (AbstractC1549.m5138(name, "unsupported") && AbstractC1549.m5138(Void.TYPE, returnType)) {
            this.f7701 = true;
            return null;
        }
        boolean zM5138 = AbstractC1549.m5138(name, "protocols");
        ArrayList arrayList = this.f7703;
        if (zM5138 && objArr.length == 0) {
            return arrayList;
        }
        if ((AbstractC1549.m5138(name, "selectProtocol") || AbstractC1549.m5138(name, "select")) && String.class.equals(returnType) && objArr.length == 1) {
            Object obj2 = objArr[0];
            if (obj2 instanceof List) {
                List list = (List) obj2;
                int size = list.size();
                if (size >= 0) {
                    int i = 0;
                    while (true) {
                        String str = (String) list.get(i);
                        if (!arrayList.contains(str)) {
                            if (i == size) {
                                break;
                            }
                            i++;
                        } else {
                            this.f7702 = str;
                            return str;
                        }
                    }
                }
                String str2 = (String) arrayList.get(0);
                this.f7702 = str2;
                return str2;
            }
        }
        if ((!AbstractC1549.m5138(name, "protocolSelected") && !AbstractC1549.m5138(name, "selected")) || objArr.length != 1) {
            return method.invoke(this, Arrays.copyOf(objArr, objArr.length));
        }
        this.f7702 = (String) objArr[0];
        return null;
    }
}
