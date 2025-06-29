package androidx.leanback.widget.picker;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.text.format.DateFormat;
import android.util.AttributeSet;
import java.text.DateFormatSymbols;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Locale;
import org.lsposed.hiddenapibypass.library.R;
import p227.C3053;
import p348.AbstractC3996;
import p378.AbstractC4345;
import p395.AbstractC4535;
import p447.AbstractC5179;
import ᴵﹳ.ﹶˆ;

/* loaded from: classes.dex */
public class TimePicker extends Picker {

    /* renamed from: ʻʿ, reason: contains not printable characters */
    public C3053 f1012;

    /* renamed from: ʿˊ, reason: contains not printable characters */
    public int f1013;

    /* renamed from: ˉᵎ, reason: contains not printable characters */
    public int f1014;

    /* renamed from: ˊᵔ, reason: contains not printable characters */
    public int f1015;

    /* renamed from: ˋﾞ, reason: contains not printable characters */
    public final ﹶˆ f1016;

    /* renamed from: ˎˉ, reason: contains not printable characters */
    public String f1017;

    /* renamed from: ᵎʽ, reason: contains not printable characters */
    public boolean f1018;

    /* renamed from: ᵔ, reason: contains not printable characters */
    public int f1019;

    /* renamed from: ᵔٴ, reason: contains not printable characters */
    public C3053 f1020;

    /* renamed from: ᵔﹳ, reason: contains not printable characters */
    public C3053 f1021;

    /* renamed from: ⁱʿ, reason: contains not printable characters */
    public int f1022;

    /* renamed from: ﾞˎ, reason: contains not printable characters */
    public int f1023;

    public TimePicker(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr._2_res_0x7f0405fb);
        Locale locale = Locale.getDefault();
        context.getResources();
        ﹶˆ r1 = new ﹶˆ();
        r1.ᐧⁱ = locale;
        DateFormatSymbols dateFormatSymbols = DateFormatSymbols.getInstance(locale);
        AbstractC4535.m10367(1, 12);
        r1.ˆʿ = AbstractC4535.m10367(0, 23);
        r1.ˎˑ = AbstractC4535.m10367(0, 59);
        r1.ᐧˋ = dateFormatSymbols.getAmPmStrings();
        this.f1016 = r1;
        int[] iArr = AbstractC3996.f15434;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        AbstractC4345.m9881(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, 0);
        try {
            this.f1018 = typedArrayObtainStyledAttributes.getBoolean(0, DateFormat.is24HourFormat(context));
            boolean z = typedArrayObtainStyledAttributes.getBoolean(3, true);
            typedArrayObtainStyledAttributes.recycle();
            m896();
            m895();
            if (z) {
                Calendar calendar = Calendar.getInstance(locale);
                setHour(calendar.get(11));
                setMinute(calendar.get(12));
                if (this.f1018) {
                    return;
                }
                m887(this.f1015, this.f1022);
            }
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public String getBestHourMinutePattern() {
        String bestDateTimePattern = DateFormat.getBestDateTimePattern((Locale) this.f1016.ᐧⁱ, this.f1018 ? "Hma" : "hma");
        return TextUtils.isEmpty(bestDateTimePattern) ? "h:mma" : bestDateTimePattern;
    }

    public int getHour() {
        return this.f1018 ? this.f1013 : this.f1022 == 0 ? this.f1013 % 12 : (this.f1013 % 12) + 12;
    }

    public int getMinute() {
        return this.f1014;
    }

    public void setHour(int i) {
        if (i < 0 || i > 23) {
            throw new IllegalArgumentException(AbstractC5179.m11548(i, "hour: ", " is not in [0-23] range in"));
        }
        this.f1013 = i;
        boolean z = this.f1018;
        if (!z) {
            if (i >= 12) {
                this.f1022 = 1;
                if (i > 12) {
                    this.f1013 = i - 12;
                }
            } else {
                this.f1022 = 0;
                if (i == 0) {
                    this.f1013 = 12;
                }
            }
            if (!z) {
                m887(this.f1015, this.f1022);
            }
        }
        m887(this.f1019, this.f1013);
    }

    public void setIs24Hour(boolean z) {
        if (this.f1018 == z) {
            return;
        }
        int hour = getHour();
        int minute = getMinute();
        this.f1018 = z;
        m896();
        m895();
        setHour(hour);
        setMinute(minute);
        if (this.f1018) {
            return;
        }
        m887(this.f1015, this.f1022);
    }

    public void setMinute(int i) {
        if (i < 0 || i > 59) {
            throw new IllegalArgumentException(AbstractC5179.m11548(i, "minute: ", " is not in [0-59] range."));
        }
        this.f1014 = i;
        m887(this.f1023, i);
    }

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public final void m895() {
        C3053 c3053 = this.f1021;
        boolean z = this.f1018;
        int i = !z ? 1 : 0;
        if (i != c3053.f11756) {
            c3053.f11756 = i;
        }
        int i2 = z ? 23 : 12;
        if (i2 != c3053.f11758) {
            c3053.f11758 = i2;
        }
        C3053 c30532 = this.f1012;
        if (c30532.f11756 != 0) {
            c30532.f11756 = 0;
        }
        if (59 != c30532.f11758) {
            c30532.f11758 = 59;
        }
        C3053 c30533 = this.f1020;
        if (c30533 != null) {
            if (c30533.f11756 != 0) {
                c30533.f11756 = 0;
            }
            if (1 != c30533.f11758) {
                c30533.f11758 = 1;
            }
        }
    }

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public final void m896() {
        int i = 7;
        String bestHourMinutePattern = getBestHourMinutePattern();
        if (TextUtils.equals(bestHourMinutePattern, this.f1017)) {
            return;
        }
        this.f1017 = bestHourMinutePattern;
        String bestHourMinutePattern2 = getBestHourMinutePattern();
        ﹶˆ r7 = this.f1016;
        boolean z = TextUtils.getLayoutDirectionFromLocale((Locale) r7.ᐧⁱ) == 1;
        boolean z2 = bestHourMinutePattern2.indexOf(97) < 0 || bestHourMinutePattern2.indexOf("a") > bestHourMinutePattern2.indexOf("m");
        String strConcat = z ? "mh" : "hm";
        if (!this.f1018) {
            strConcat = z2 ? strConcat.concat("a") : "a".concat(strConcat);
        }
        String bestHourMinutePattern3 = getBestHourMinutePattern();
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder();
        char[] cArr = {'H', 'h', 'K', 'k', 'm', 'M', 'a'};
        int i2 = 0;
        boolean z3 = false;
        char c = 0;
        while (i2 < bestHourMinutePattern3.length()) {
            char cCharAt = bestHourMinutePattern3.charAt(i2);
            if (cCharAt != ' ') {
                if (cCharAt != '\'') {
                    if (!z3) {
                        int i3 = 0;
                        while (true) {
                            if (i3 >= i) {
                                sb.append(cCharAt);
                                break;
                            } else if (cCharAt != cArr[i3]) {
                                i3++;
                                i = 7;
                            } else if (cCharAt != c) {
                                arrayList.add(sb.toString());
                                sb.setLength(0);
                            }
                        }
                    } else {
                        sb.append(cCharAt);
                    }
                    c = cCharAt;
                } else if (z3) {
                    z3 = false;
                } else {
                    sb.setLength(0);
                    z3 = true;
                }
            }
            i2++;
            i = 7;
        }
        arrayList.add(sb.toString());
        if (arrayList.size() != strConcat.length() + 1) {
            throw new IllegalStateException("Separators size: " + arrayList.size() + " must equal the size of timeFieldsPattern: " + strConcat.length() + " + 1");
        }
        setSeparators(arrayList);
        String upperCase = strConcat.toUpperCase((Locale) r7.ᐧⁱ);
        this.f1020 = null;
        this.f1012 = null;
        this.f1021 = null;
        this.f1015 = -1;
        this.f1023 = -1;
        this.f1019 = -1;
        ArrayList arrayList2 = new ArrayList(3);
        for (int i4 = 0; i4 < upperCase.length(); i4++) {
            char cCharAt2 = upperCase.charAt(i4);
            if (cCharAt2 == 'A') {
                C3053 c3053 = new C3053();
                this.f1020 = c3053;
                arrayList2.add(c3053);
                C3053 c30532 = this.f1020;
                c30532.f11760 = (String[]) r7.ᐧˋ;
                this.f1015 = i4;
                if (c30532.f11756 != 0) {
                    c30532.f11756 = 0;
                }
                if (1 != c30532.f11758) {
                    c30532.f11758 = 1;
                }
            } else if (cCharAt2 == 'H') {
                C3053 c30533 = new C3053();
                this.f1021 = c30533;
                arrayList2.add(c30533);
                this.f1021.f11760 = (String[]) r7.ˆʿ;
                this.f1019 = i4;
            } else {
                if (cCharAt2 != 'M') {
                    throw new IllegalArgumentException("Invalid time picker format.");
                }
                C3053 c30534 = new C3053();
                this.f1012 = c30534;
                arrayList2.add(c30534);
                this.f1012.f11760 = (String[]) r7.ˎˑ;
                this.f1023 = i4;
            }
        }
        setColumns(arrayList2);
    }

    @Override // androidx.leanback.widget.picker.Picker
    /* renamed from: ˑʽ */
    public final void mo885(int i, int i2) {
        if (i == this.f1019) {
            this.f1013 = i2;
        } else if (i == this.f1023) {
            this.f1014 = i2;
        } else {
            if (i != this.f1015) {
                throw new IllegalArgumentException("Invalid column index.");
            }
            this.f1022 = i2;
        }
    }
}
