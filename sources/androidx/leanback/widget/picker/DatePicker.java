package androidx.leanback.widget.picker;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.text.format.DateFormat;
import android.util.AttributeSet;
import androidx.leanback.widget.RunnableC0183;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Locale;
import org.lsposed.hiddenapibypass.library.R;
import p227.C3053;
import p348.AbstractC3996;
import p378.AbstractC4345;
import p395.AbstractC4535;
import p456.C5349;

/* loaded from: classes.dex */
public class DatePicker extends Picker {

    /* renamed from: ʻﹳ, reason: contains not printable characters */
    public static final int[] f982 = {5, 2, 1};

    /* renamed from: ʻʿ, reason: contains not printable characters */
    public C3053 f983;

    /* renamed from: ʿˊ, reason: contains not printable characters */
    public final C5349 f984;

    /* renamed from: ˉᵎ, reason: contains not printable characters */
    public final Calendar f985;

    /* renamed from: ˊᵔ, reason: contains not printable characters */
    public int f986;

    /* renamed from: ˋﾞ, reason: contains not printable characters */
    public int f987;

    /* renamed from: ˎˉ, reason: contains not printable characters */
    public final Calendar f988;

    /* renamed from: יˋ, reason: contains not printable characters */
    public final Calendar f989;

    /* renamed from: ᵎʽ, reason: contains not printable characters */
    public final SimpleDateFormat f990;

    /* renamed from: ᵔ, reason: contains not printable characters */
    public C3053 f991;

    /* renamed from: ᵔٴ, reason: contains not printable characters */
    public C3053 f992;

    /* renamed from: ᵔﹳ, reason: contains not printable characters */
    public String f993;

    /* renamed from: ⁱʿ, reason: contains not printable characters */
    public final Calendar f994;

    /* renamed from: ﾞˎ, reason: contains not printable characters */
    public int f995;

    public DatePicker(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr._2_res_0x7f0401bb);
        this.f990 = new SimpleDateFormat("MM/dd/yyyy", Locale.getDefault());
        Locale locale = Locale.getDefault();
        getContext().getResources();
        this.f984 = new C5349(locale);
        this.f989 = AbstractC4535.m10351(this.f989, locale);
        this.f985 = AbstractC4535.m10351(this.f985, (Locale) this.f984.f20756);
        this.f994 = AbstractC4535.m10351(this.f994, (Locale) this.f984.f20756);
        this.f988 = AbstractC4535.m10351(this.f988, (Locale) this.f984.f20756);
        C3053 c3053 = this.f983;
        if (c3053 != null) {
            c3053.f11760 = (String[]) this.f984.f20757;
            m893(this.f995, c3053);
        }
        int[] iArr = AbstractC3996.f15429;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        AbstractC4345.m9881(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, 0);
        try {
            String string = typedArrayObtainStyledAttributes.getString(0);
            String string2 = typedArrayObtainStyledAttributes.getString(1);
            String string3 = typedArrayObtainStyledAttributes.getString(2);
            typedArrayObtainStyledAttributes.recycle();
            this.f989.clear();
            if (TextUtils.isEmpty(string) || !m884(string, this.f989)) {
                this.f989.set(1900, 0, 1);
            }
            this.f985.setTimeInMillis(this.f989.getTimeInMillis());
            this.f989.clear();
            if (TextUtils.isEmpty(string2) || !m884(string2, this.f989)) {
                this.f989.set(2100, 0, 1);
            }
            this.f994.setTimeInMillis(this.f989.getTimeInMillis());
            setDatePickerFormat(TextUtils.isEmpty(string3) ? new String(DateFormat.getDateFormatOrder(context)) : string3);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public long getDate() {
        return this.f988.getTimeInMillis();
    }

    public String getDatePickerFormat() {
        return this.f993;
    }

    public long getMaxDate() {
        return this.f994.getTimeInMillis();
    }

    public long getMinDate() {
        return this.f985.getTimeInMillis();
    }

    public void setDate(long j) {
        this.f989.setTimeInMillis(j);
        m883(this.f989.get(1), this.f989.get(2), this.f989.get(5));
    }

    public void setDatePickerFormat(String str) {
        int i = 6;
        C5349 c5349 = this.f984;
        String str2 = TextUtils.isEmpty(str) ? new String(DateFormat.getDateFormatOrder(getContext())) : str;
        if (TextUtils.equals(this.f993, str2)) {
            return;
        }
        this.f993 = str2;
        String bestDateTimePattern = DateFormat.getBestDateTimePattern((Locale) c5349.f20756, str2);
        if (TextUtils.isEmpty(bestDateTimePattern)) {
            bestDateTimePattern = "MM/dd/yyyy";
        }
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder();
        char[] cArr = {'Y', 'y', 'M', 'm', 'D', 'd'};
        int i2 = 0;
        boolean z = false;
        char c = 0;
        while (i2 < bestDateTimePattern.length()) {
            char cCharAt = bestDateTimePattern.charAt(i2);
            if (cCharAt != ' ') {
                if (cCharAt != '\'') {
                    if (!z) {
                        int i3 = 0;
                        while (true) {
                            if (i3 >= i) {
                                sb.append(cCharAt);
                                break;
                            } else if (cCharAt != cArr[i3]) {
                                i3++;
                                i = 6;
                            } else if (cCharAt != c) {
                                arrayList.add(sb.toString());
                                sb.setLength(0);
                            }
                        }
                    } else {
                        sb.append(cCharAt);
                    }
                    c = cCharAt;
                } else if (z) {
                    z = false;
                } else {
                    sb.setLength(0);
                    z = true;
                }
            }
            i2++;
            i = 6;
        }
        arrayList.add(sb.toString());
        if (arrayList.size() != str2.length() + 1) {
            throw new IllegalStateException("Separators size: " + arrayList.size() + " must equal the size of datePickerFormat: " + str2.length() + " + 1");
        }
        setSeparators(arrayList);
        this.f992 = null;
        this.f983 = null;
        this.f991 = null;
        this.f995 = -1;
        this.f986 = -1;
        this.f987 = -1;
        String upperCase = str2.toUpperCase((Locale) c5349.f20756);
        ArrayList arrayList2 = new ArrayList(3);
        for (int i4 = 0; i4 < upperCase.length(); i4++) {
            char cCharAt2 = upperCase.charAt(i4);
            if (cCharAt2 == 'D') {
                if (this.f992 != null) {
                    throw new IllegalArgumentException("datePicker format error");
                }
                C3053 c3053 = new C3053();
                this.f992 = c3053;
                arrayList2.add(c3053);
                this.f992.f11757 = "%02d";
                this.f986 = i4;
            } else if (cCharAt2 != 'M') {
                if (cCharAt2 != 'Y') {
                    throw new IllegalArgumentException("datePicker format error");
                }
                if (this.f991 != null) {
                    throw new IllegalArgumentException("datePicker format error");
                }
                C3053 c30532 = new C3053();
                this.f991 = c30532;
                arrayList2.add(c30532);
                this.f987 = i4;
                this.f991.f11757 = "%d";
            } else {
                if (this.f983 != null) {
                    throw new IllegalArgumentException("datePicker format error");
                }
                C3053 c30533 = new C3053();
                this.f983 = c30533;
                arrayList2.add(c30533);
                this.f983.f11760 = (String[]) c5349.f20757;
                this.f995 = i4;
            }
        }
        setColumns(arrayList2);
        post(new RunnableC0183(17, this));
    }

    public void setMaxDate(long j) {
        this.f989.setTimeInMillis(j);
        if (this.f989.get(1) != this.f994.get(1) || this.f989.get(6) == this.f994.get(6)) {
            this.f994.setTimeInMillis(j);
            if (this.f988.after(this.f994)) {
                this.f988.setTimeInMillis(this.f994.getTimeInMillis());
            }
            post(new RunnableC0183(17, this));
        }
    }

    public void setMinDate(long j) {
        this.f989.setTimeInMillis(j);
        if (this.f989.get(1) != this.f985.get(1) || this.f989.get(6) == this.f985.get(6)) {
            this.f985.setTimeInMillis(j);
            if (this.f988.before(this.f985)) {
                this.f988.setTimeInMillis(this.f985.getTimeInMillis());
            }
            post(new RunnableC0183(17, this));
        }
    }

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public final void m883(int i, int i2, int i3) {
        if (this.f988.get(1) == i && this.f988.get(2) == i3 && this.f988.get(5) == i2) {
            return;
        }
        this.f988.set(i, i2, i3);
        if (this.f988.before(this.f985)) {
            this.f988.setTimeInMillis(this.f985.getTimeInMillis());
        } else if (this.f988.after(this.f994)) {
            this.f988.setTimeInMillis(this.f994.getTimeInMillis());
        }
        post(new RunnableC0183(17, this));
    }

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public final boolean m884(String str, Calendar calendar) {
        try {
            calendar.setTime(this.f990.parse(str));
            return true;
        } catch (ParseException unused) {
            String str2 = "Date: " + str + " not in format: MM/dd/yyyy";
            return false;
        }
    }

    @Override // androidx.leanback.widget.picker.Picker
    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final void mo885(int i, int i2) {
        this.f989.setTimeInMillis(this.f988.getTimeInMillis());
        int i3 = m890(i).f11759;
        if (i == this.f986) {
            this.f989.add(5, i2 - i3);
        } else if (i == this.f995) {
            this.f989.add(2, i2 - i3);
        } else {
            if (i != this.f987) {
                throw new IllegalArgumentException();
            }
            this.f989.add(1, i2 - i3);
        }
        m883(this.f989.get(1), this.f989.get(2), this.f989.get(5));
    }
}
