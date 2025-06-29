package p443;

import android.content.SharedPreferences;
import android.util.Pair;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import p064.AbstractC1470;
import p200.C2752;
import ᵎﹳ.ᐧʻ;

/* renamed from: ﾞʿ.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class SharedPreferencesEditorC5144 implements SharedPreferences.Editor {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final SharedPreferences.Editor f19665;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final SharedPreferencesC5142 f19667;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final AtomicBoolean f19668 = new AtomicBoolean(false);

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final CopyOnWriteArrayList f19666 = new CopyOnWriteArrayList();

    public SharedPreferencesEditorC5144(SharedPreferencesC5142 sharedPreferencesC5142, SharedPreferences.Editor editor) {
        this.f19667 = sharedPreferencesC5142;
        this.f19665 = editor;
    }

    @Override // android.content.SharedPreferences.Editor
    public final void apply() {
        m11452();
        this.f19665.apply();
        m11450();
        this.f19666.clear();
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor clear() {
        this.f19668.set(true);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final boolean commit() {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f19666;
        m11452();
        try {
            return this.f19665.commit();
        } finally {
            m11450();
            copyOnWriteArrayList.clear();
        }
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putBoolean(String str, boolean z) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(5);
        byteBufferAllocate.putInt(5);
        byteBufferAllocate.put(z ? (byte) 1 : (byte) 0);
        m11451(byteBufferAllocate.array(), str);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putFloat(String str, float f) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.putInt(4);
        byteBufferAllocate.putFloat(f);
        m11451(byteBufferAllocate.array(), str);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putInt(String str, int i) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.putInt(2);
        byteBufferAllocate.putInt(i);
        m11451(byteBufferAllocate.array(), str);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putLong(String str, long j) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(12);
        byteBufferAllocate.putInt(3);
        byteBufferAllocate.putLong(j);
        m11451(byteBufferAllocate.array(), str);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putString(String str, String str2) {
        if (str2 == null) {
            str2 = "__NULL__";
        }
        byte[] bytes = str2.getBytes(StandardCharsets.UTF_8);
        int length = bytes.length;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length + 8);
        byteBufferAllocate.putInt(0);
        byteBufferAllocate.putInt(length);
        byteBufferAllocate.put(bytes);
        m11451(byteBufferAllocate.array(), str);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putStringSet(String str, Set set) {
        if (set == null) {
            set = new C2752(0);
            set.add("__NULL__");
        }
        ArrayList arrayList = new ArrayList(set.size());
        int size = set.size() * 4;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            byte[] bytes = ((String) it.next()).getBytes(StandardCharsets.UTF_8);
            arrayList.add(bytes);
            size += bytes.length;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(size + 4);
        byteBufferAllocate.putInt(1);
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            byte[] bArr = (byte[]) it2.next();
            byteBufferAllocate.putInt(bArr.length);
            byteBufferAllocate.put(bArr);
        }
        m11451(byteBufferAllocate.array(), str);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor remove(String str) {
        SharedPreferencesC5142 sharedPreferencesC5142 = this.f19667;
        sharedPreferencesC5142.getClass();
        if (SharedPreferencesC5142.m11445(str)) {
            throw new SecurityException(ᐧʻ.ˉⁱ(str, " is a reserved key for the encryption keyset."));
        }
        this.f19665.remove(sharedPreferencesC5142.m11446(str));
        this.f19666.add(str);
        return this;
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final void m11450() {
        SharedPreferencesC5142 sharedPreferencesC5142 = this.f19667;
        Iterator it = sharedPreferencesC5142.f19660.iterator();
        while (it.hasNext()) {
            SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener = (SharedPreferences.OnSharedPreferenceChangeListener) it.next();
            Iterator it2 = this.f19666.iterator();
            while (it2.hasNext()) {
                onSharedPreferenceChangeListener.onSharedPreferenceChanged(sharedPreferencesC5142, (String) it2.next());
            }
        }
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final void m11451(byte[] bArr, String str) {
        SharedPreferencesC5142 sharedPreferencesC5142 = this.f19667;
        sharedPreferencesC5142.getClass();
        if (SharedPreferencesC5142.m11445(str)) {
            throw new SecurityException(ᐧʻ.ˉⁱ(str, " is a reserved key for the encryption keyset."));
        }
        this.f19666.add(str);
        if (str == null) {
            str = "__NULL__";
        }
        try {
            String strM11446 = sharedPreferencesC5142.m11446(str);
            try {
                Pair pair = new Pair(strM11446, new String(AbstractC1470.m5024(sharedPreferencesC5142.f19664.mo4122(bArr, strM11446.getBytes(StandardCharsets.UTF_8))), "US-ASCII"));
                this.f19665.putString((String) pair.first, (String) pair.second);
            } catch (UnsupportedEncodingException e) {
                throw new AssertionError(e);
            }
        } catch (GeneralSecurityException e2) {
            throw new SecurityException("Could not encrypt data: " + e2.getMessage(), e2);
        }
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void m11452() {
        if (this.f19668.getAndSet(false)) {
            SharedPreferencesC5142 sharedPreferencesC5142 = this.f19667;
            for (String str : ((HashMap) sharedPreferencesC5142.getAll()).keySet()) {
                if (!this.f19666.contains(str) && !SharedPreferencesC5142.m11445(str)) {
                    this.f19665.remove(sharedPreferencesC5142.m11446(str));
                }
            }
        }
    }
}
