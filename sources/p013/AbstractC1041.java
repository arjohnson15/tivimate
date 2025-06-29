package p013;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import p070.AbstractC1549;
import p338.InterfaceC3856;
import ﾞﹶ.ᵢʿ;

/* renamed from: ʻי.ˏʾ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC1041 extends AbstractC1052 {
    /* renamed from: ʻ, reason: contains not printable characters */
    public static int[] m4013(ArrayList arrayList) {
        int[] iArr = new int[arrayList.size()];
        Iterator it = arrayList.iterator();
        int i = 0;
        while (it.hasNext()) {
            iArr[i] = ((Number) it.next()).intValue();
            i++;
        }
        return iArr;
    }

    /* renamed from: ʻʻ, reason: contains not printable characters */
    public static Object m4014(List list) {
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    /* renamed from: ʽˆ, reason: contains not printable characters */
    public static ArrayList m4015(Iterable iterable) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* renamed from: ʽⁱ, reason: contains not printable characters */
    public static List m4016(Iterable iterable) {
        boolean z = iterable instanceof Collection;
        C1053 c1053 = C1053.f4449;
        if (!z) {
            List listM4020 = m4020(iterable);
            ArrayList arrayList = (ArrayList) listM4020;
            int size = arrayList.size();
            return size != 0 ? size != 1 ? listM4020 : Collections.singletonList(arrayList.get(0)) : c1053;
        }
        Collection collection = (Collection) iterable;
        int size2 = collection.size();
        if (size2 == 0) {
            return c1053;
        }
        if (size2 != 1) {
            return new ArrayList(collection);
        }
        return Collections.singletonList(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
    }

    /* renamed from: ʾˈ, reason: contains not printable characters */
    public static List m4017(Iterable iterable) {
        if (!(iterable instanceof Collection)) {
            List listM4020 = m4020(iterable);
            if (((ArrayList) listM4020).size() > 1) {
                Collections.sort(listM4020);
            }
            return listM4020;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return m4016(iterable);
        }
        Object[] array = collection.toArray(new Comparable[0]);
        Comparable[] comparableArr = (Comparable[]) array;
        if (comparableArr.length > 1) {
            Arrays.sort(comparableArr);
        }
        return Arrays.asList(array);
    }

    /* renamed from: ˆﾞ, reason: contains not printable characters */
    public static List m4018(Iterable iterable, Comparator comparator) {
        if (!(iterable instanceof Collection)) {
            List listM4020 = m4020(iterable);
            AbstractC1045.m4035(listM4020, comparator);
            return listM4020;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return m4016(iterable);
        }
        Object[] array = collection.toArray(new Object[0]);
        if (array.length > 1) {
            Arrays.sort(array, comparator);
        }
        return Arrays.asList(array);
    }

    /* renamed from: ˈﹳ, reason: contains not printable characters */
    public static boolean m4019(Iterable iterable, Object obj) {
        int iIndexOf;
        if (iterable instanceof Collection) {
            return ((Collection) iterable).contains(obj);
        }
        if (!(iterable instanceof List)) {
            Iterator it = iterable.iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    iIndexOf = -1;
                    break;
                }
                Object next = it.next();
                if (i < 0) {
                    AbstractC1037.m4008();
                    throw null;
                }
                if (AbstractC1549.m5138(obj, next)) {
                    iIndexOf = i;
                    break;
                }
                i++;
            }
        } else {
            iIndexOf = ((List) iterable).indexOf(obj);
        }
        return iIndexOf >= 0;
    }

    /* renamed from: ˊˆ, reason: contains not printable characters */
    public static List m4020(Iterable iterable) {
        if (iterable instanceof Collection) {
            return new ArrayList((Collection) iterable);
        }
        ArrayList arrayList = new ArrayList();
        m4032(iterable, arrayList);
        return arrayList;
    }

    /* renamed from: ˊﹶ, reason: contains not printable characters */
    public static ArrayList m4021(Collection collection, Object obj) {
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(obj);
        return arrayList;
    }

    /* renamed from: ˎᵢ, reason: contains not printable characters */
    public static final void m4022(Collection collection, StringBuilder sb, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, InterfaceC3856 interfaceC3856) {
        sb.append(charSequence2);
        int i2 = 0;
        for (Object obj : collection) {
            i2++;
            if (i2 > 1) {
                sb.append(charSequence);
            }
            if (i >= 0 && i2 > i) {
                break;
            } else {
                ᵢʿ.ـﹶ(sb, obj, interfaceC3856);
            }
        }
        if (i >= 0 && i2 > i) {
            sb.append(charSequence4);
        }
        sb.append(charSequence3);
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public static HashSet m4023(ArrayList arrayList) {
        HashSet hashSet = new HashSet(AbstractC1035.m3985(AbstractC1039.m4012(arrayList, 12)));
        m4032(arrayList, hashSet);
        return hashSet;
    }

    /* renamed from: ـᵎ, reason: contains not printable characters */
    public static Object m4025(Iterable iterable) {
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return list.get(0);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    /* renamed from: ٴᐧ, reason: contains not printable characters */
    public static Object m4026(Collection collection) {
        if (collection instanceof List) {
            return m4027((List) collection);
        }
        Iterator it = collection.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    /* renamed from: ٴﹶ, reason: contains not printable characters */
    public static Object m4027(List list) {
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(0);
    }

    /* renamed from: ᐧʼ, reason: contains not printable characters */
    public static ArrayList m4028(Collection collection, Iterable iterable) {
        if (!(iterable instanceof Collection)) {
            ArrayList arrayList = new ArrayList(collection);
            AbstractC1052.m4043(iterable, arrayList);
            return arrayList;
        }
        Collection collection2 = (Collection) iterable;
        ArrayList arrayList2 = new ArrayList(collection2.size() + collection.size());
        arrayList2.addAll(collection);
        arrayList2.addAll(collection2);
        return arrayList2;
    }

    /* renamed from: ᐧᴵ, reason: contains not printable characters */
    public static Set m4029(Iterable iterable) {
        boolean z = iterable instanceof Collection;
        C1038 c1038 = C1038.f4437;
        if (!z) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            m4032(iterable, linkedHashSet);
            int size = linkedHashSet.size();
            return size != 0 ? size != 1 ? linkedHashSet : Collections.singleton(linkedHashSet.iterator().next()) : c1038;
        }
        Collection collection = (Collection) iterable;
        int size2 = collection.size();
        if (size2 == 0) {
            return c1038;
        }
        if (size2 == 1) {
            return Collections.singleton(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet(AbstractC1035.m3985(collection.size()));
        m4032(iterable, linkedHashSet2);
        return linkedHashSet2;
    }

    /* renamed from: ᵎʾ, reason: contains not printable characters */
    public static Object m4030(int i, List list) {
        if (i < 0 || i >= list.size()) {
            return null;
        }
        return list.get(i);
    }

    /* renamed from: ᵎᵢ, reason: contains not printable characters */
    public static Object m4031(List list) {
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    /* renamed from: ᵢᵢ, reason: contains not printable characters */
    public static final void m4032(Iterable iterable, AbstractCollection abstractCollection) {
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            abstractCollection.add(it.next());
        }
    }

    /* renamed from: ⁱⁱ, reason: contains not printable characters */
    public static String m4033(Collection collection, String str, String str2, String str3, InterfaceC3856 interfaceC3856, int i) {
        if ((i & 1) != 0) {
            str = ", ";
        }
        String str4 = str;
        String str5 = (i & 2) != 0 ? "" : str2;
        String str6 = (i & 4) != 0 ? "" : str3;
        if ((i & 32) != 0) {
            interfaceC3856 = null;
        }
        StringBuilder sb = new StringBuilder();
        m4022(collection, sb, str4, str5, str6, -1, "...", interfaceC3856);
        return sb.toString();
    }

    /* renamed from: ﾞﾞ, reason: contains not printable characters */
    public static Object m4034(List list) {
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(AbstractC1037.m4009(list));
    }
}
