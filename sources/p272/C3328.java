package p272;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.lifecycle.RunnableC0246;
import androidx.media3.ui.DefaultTimeBar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.ViewOnClickListenerC0689;
import java.util.Arrays;
import java.util.Collections;
import java.util.Formatter;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import org.lsposed.hiddenapibypass.library.R;
import p036.C1245;
import p061.AbstractC1373;
import p166.AbstractC2394;
import p166.AbstractC2426;
import p166.C2398;
import p166.C2412;
import p166.C2429;
import p166.C2431;
import p166.C2434;
import p166.C2441;
import p166.InterfaceC2419;
import p345.AbstractC3962;
import p345.AbstractC3968;
import p345.AbstractC3980;
import p345.C3932;
import p371.AbstractC4208;
import p383.AbstractC4470;
import p438.C5110;
import p438.C5118;
import ʿﾞ.ﹳﹳ;
import ˆٴ.ˎᵢ;
import ˏᵢ.ᵢٴ;

/* renamed from: ـᐧ.ᵎˏ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3328 extends FrameLayout {

    /* renamed from: ˑˈ, reason: contains not printable characters */
    public static final float[] f12899;

    /* renamed from: ʻ, reason: contains not printable characters */
    public final String f12900;

    /* renamed from: ʻʻ, reason: contains not printable characters */
    public final String f12901;

    /* renamed from: ʻʿ, reason: contains not printable characters */
    public final TextView f12902;

    /* renamed from: ʻˉ, reason: contains not printable characters */
    public boolean f12903;

    /* renamed from: ʻﹳ, reason: contains not printable characters */
    public final TextView f12904;

    /* renamed from: ʼʼ, reason: contains not printable characters */
    public boolean f12905;

    /* renamed from: ʼᵎ, reason: contains not printable characters */
    public final String f12906;

    /* renamed from: ʼﹶ, reason: contains not printable characters */
    public final long[] f12907;

    /* renamed from: ʽˆ, reason: contains not printable characters */
    public final StringBuilder f12908;

    /* renamed from: ʽⁱ, reason: contains not printable characters */
    public final String f12909;

    /* renamed from: ʾʼ, reason: contains not printable characters */
    public final int f12910;

    /* renamed from: ʾˈ, reason: contains not printable characters */
    public final Drawable f12911;

    /* renamed from: ʿˉ, reason: contains not printable characters */
    public final boolean[] f12912;

    /* renamed from: ʿˊ, reason: contains not printable characters */
    public final ImageView f12913;

    /* renamed from: ˆʼ, reason: contains not printable characters */
    public boolean[] f12914;

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final Resources f12915;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final RecyclerView f12916;

    /* renamed from: ˆﾞ, reason: contains not printable characters */
    public final Drawable f12917;

    /* renamed from: ˈﹳ, reason: contains not printable characters */
    public final InterfaceC3317 f12918;

    /* renamed from: ˉʾ, reason: contains not printable characters */
    public int f12919;

    /* renamed from: ˉˑ, reason: contains not printable characters */
    public boolean f12920;

    /* renamed from: ˉᵎ, reason: contains not printable characters */
    public final View f12921;

    /* renamed from: ˊˆ, reason: contains not printable characters */
    public final Drawable f12922;

    /* renamed from: ˊᵔ, reason: contains not printable characters */
    public final ImageView f12923;

    /* renamed from: ˊﹶ, reason: contains not printable characters */
    public final String f12924;

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public final C3323 f12925;

    /* renamed from: ˋˏ, reason: contains not printable characters */
    public boolean f12926;

    /* renamed from: ˋﾞ, reason: contains not printable characters */
    public final ImageView f12927;

    /* renamed from: ˎˉ, reason: contains not printable characters */
    public final View f12928;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final ViewOnClickListenerC3314 f12929;

    /* renamed from: ˎי, reason: contains not printable characters */
    public long f12930;

    /* renamed from: ˎᵔ, reason: contains not printable characters */
    public final View f12931;

    /* renamed from: ˎᵢ, reason: contains not printable characters */
    public final Drawable f12932;

    /* renamed from: ˏ, reason: contains not printable characters */
    public final float f12933;

    /* renamed from: ˑʾ, reason: contains not printable characters */
    public final Drawable f12934;

    /* renamed from: ˑⁱ, reason: contains not printable characters */
    public final ImageView f12935;

    /* renamed from: ˑﾞ, reason: contains not printable characters */
    public final ImageView f12936;

    /* renamed from: יˆ, reason: contains not printable characters */
    public int f12937;

    /* renamed from: יˊ, reason: contains not printable characters */
    public boolean f12938;

    /* renamed from: יˋ, reason: contains not printable characters */
    public final TextView f12939;

    /* renamed from: יᴵ, reason: contains not printable characters */
    public long[] f12940;

    /* renamed from: ـˆ, reason: contains not printable characters */
    public final C3323 f12941;

    /* renamed from: ـᵎ, reason: contains not printable characters */
    public final C2434 f12942;

    /* renamed from: ٴᐧ, reason: contains not printable characters */
    public final Formatter f12943;

    /* renamed from: ٴﹶ, reason: contains not printable characters */
    public final C2412 f12944;

    /* renamed from: ᐧʼ, reason: contains not printable characters */
    public final String f12945;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final CopyOnWriteArrayList f12946;

    /* renamed from: ᐧᴵ, reason: contains not printable characters */
    public final Drawable f12947;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final C3339 f12948;

    /* renamed from: ᴵʼ, reason: contains not printable characters */
    public final ᵢٴ f12949;

    /* renamed from: ᴵˋ, reason: contains not printable characters */
    public InterfaceC3338 f12950;

    /* renamed from: ᴵᴵ, reason: contains not printable characters */
    public boolean f12951;

    /* renamed from: ᵎʽ, reason: contains not printable characters */
    public final ImageView f12952;

    /* renamed from: ᵎʾ, reason: contains not printable characters */
    public final Drawable f12953;

    /* renamed from: ᵎˆ, reason: contains not printable characters */
    public final Drawable f12954;

    /* renamed from: ᵎᵢ, reason: contains not printable characters */
    public final RunnableC0246 f12955;

    /* renamed from: ᵔ, reason: contains not printable characters */
    public final ImageView f12956;

    /* renamed from: ᵔˋ, reason: contains not printable characters */
    public final String f12957;

    /* renamed from: ᵔٴ, reason: contains not printable characters */
    public final TextView f12958;

    /* renamed from: ᵔᵢ, reason: contains not printable characters */
    public boolean f12959;

    /* renamed from: ᵔﹳ, reason: contains not printable characters */
    public final View f12960;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final C3327 f12961;

    /* renamed from: ᵢˆ, reason: contains not printable characters */
    public InterfaceC2419 f12962;

    /* renamed from: ᵢˎ, reason: contains not printable characters */
    public int f12963;

    /* renamed from: ᵢٴ, reason: contains not printable characters */
    public final ImageView f12964;

    /* renamed from: ᵢᵢ, reason: contains not printable characters */
    public final float f12965;

    /* renamed from: ᵢﹶ, reason: contains not printable characters */
    public final String f12966;

    /* renamed from: ⁱʿ, reason: contains not printable characters */
    public final View f12967;

    /* renamed from: ⁱⁱ, reason: contains not printable characters */
    public final Drawable f12968;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public final C3312 f12969;

    /* renamed from: ﹶʾ, reason: contains not printable characters */
    public final Drawable f12970;

    /* renamed from: ﹶﾞ, reason: contains not printable characters */
    public final String f12971;

    /* renamed from: ﾞˎ, reason: contains not printable characters */
    public final ImageView f12972;

    /* renamed from: ﾞᐧ, reason: contains not printable characters */
    public final PopupWindow f12973;

    /* renamed from: ﾞﾞ, reason: contains not printable characters */
    public final Drawable f12974;

    static {
        AbstractC2426.m6526("media3.ui");
        f12899 = new float[]{0.25f, 0.5f, 0.75f, 1.0f, 1.25f, 1.5f, 2.0f};
    }

    public C3328(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z;
        boolean z2;
        int i7;
        boolean z3;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        int i17;
        boolean z8;
        boolean z9;
        boolean z10;
        int i18;
        int i19;
        ViewOnClickListenerC3314 viewOnClickListenerC3314;
        int i20;
        int i21;
        ImageView imageView;
        boolean z11;
        int i22;
        ImageView imageView2;
        Typeface typefaceM9655;
        super(context, null, 0);
        this.f12905 = true;
        this.f12937 = 5000;
        this.f12963 = 0;
        this.f12919 = 200;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, AbstractC3337.f13030, 0, 0);
            try {
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(6, R.layout._2_res_0x7f0e003c);
                int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(12, R.drawable._2_res_0x7f0800fb);
                int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(11, R.drawable._2_res_0x7f0800fa);
                int resourceId4 = typedArrayObtainStyledAttributes.getResourceId(10, R.drawable._2_res_0x7f0800f7);
                int resourceId5 = typedArrayObtainStyledAttributes.getResourceId(7, R.drawable._2_res_0x7f080104);
                int resourceId6 = typedArrayObtainStyledAttributes.getResourceId(15, R.drawable._2_res_0x7f0800fc);
                int resourceId7 = typedArrayObtainStyledAttributes.getResourceId(20, R.drawable._2_res_0x7f080105);
                int resourceId8 = typedArrayObtainStyledAttributes.getResourceId(9, R.drawable._2_res_0x7f0800f6);
                int resourceId9 = typedArrayObtainStyledAttributes.getResourceId(8, R.drawable._2_res_0x7f0800f5);
                int resourceId10 = typedArrayObtainStyledAttributes.getResourceId(17, R.drawable._2_res_0x7f0800fe);
                int resourceId11 = typedArrayObtainStyledAttributes.getResourceId(18, R.drawable._2_res_0x7f0800ff);
                int resourceId12 = typedArrayObtainStyledAttributes.getResourceId(16, R.drawable._2_res_0x7f0800fd);
                int resourceId13 = typedArrayObtainStyledAttributes.getResourceId(35, R.drawable._2_res_0x7f080103);
                int resourceId14 = typedArrayObtainStyledAttributes.getResourceId(34, R.drawable._2_res_0x7f080102);
                int resourceId15 = typedArrayObtainStyledAttributes.getResourceId(37, R.drawable._2_res_0x7f080108);
                int resourceId16 = typedArrayObtainStyledAttributes.getResourceId(36, R.drawable._2_res_0x7f080107);
                int resourceId17 = typedArrayObtainStyledAttributes.getResourceId(41, R.drawable._2_res_0x7f080109);
                this.f12937 = typedArrayObtainStyledAttributes.getInt(32, this.f12937);
                this.f12963 = typedArrayObtainStyledAttributes.getInt(19, this.f12963);
                boolean z12 = typedArrayObtainStyledAttributes.getBoolean(29, true);
                boolean z13 = typedArrayObtainStyledAttributes.getBoolean(26, true);
                boolean z14 = typedArrayObtainStyledAttributes.getBoolean(28, true);
                boolean z15 = typedArrayObtainStyledAttributes.getBoolean(27, true);
                z3 = typedArrayObtainStyledAttributes.getBoolean(30, false);
                boolean z16 = typedArrayObtainStyledAttributes.getBoolean(31, false);
                boolean z17 = typedArrayObtainStyledAttributes.getBoolean(33, false);
                setTimeBarMinUpdateInterval(typedArrayObtainStyledAttributes.getInt(38, this.f12919));
                boolean z18 = typedArrayObtainStyledAttributes.getBoolean(2, true);
                typedArrayObtainStyledAttributes.recycle();
                i2 = resourceId;
                i13 = resourceId3;
                i14 = resourceId8;
                i15 = resourceId7;
                i3 = resourceId4;
                i17 = resourceId5;
                i4 = resourceId6;
                i8 = resourceId10;
                i10 = resourceId12;
                i6 = resourceId13;
                i = resourceId15;
                i12 = resourceId16;
                z4 = z12;
                z5 = z13;
                z6 = z14;
                z7 = z15;
                i16 = resourceId9;
                z = z16;
                z2 = z17;
                z8 = z18;
                i11 = resourceId2;
                i9 = resourceId11;
                i5 = resourceId14;
                i7 = resourceId17;
            } catch (Throwable th) {
                typedArrayObtainStyledAttributes.recycle();
                throw th;
            }
        } else {
            i = R.drawable._2_res_0x7f080108;
            i2 = R.layout._2_res_0x7f0e003c;
            i3 = R.drawable._2_res_0x7f0800f7;
            i4 = R.drawable._2_res_0x7f0800fc;
            i5 = R.drawable._2_res_0x7f080102;
            i6 = R.drawable._2_res_0x7f080103;
            z = false;
            z2 = false;
            i7 = R.drawable._2_res_0x7f080109;
            z3 = false;
            i8 = R.drawable._2_res_0x7f0800fe;
            i9 = R.drawable._2_res_0x7f0800ff;
            i10 = R.drawable._2_res_0x7f0800fd;
            i11 = R.drawable._2_res_0x7f0800fb;
            i12 = R.drawable._2_res_0x7f080107;
            i13 = R.drawable._2_res_0x7f0800fa;
            i14 = R.drawable._2_res_0x7f0800f6;
            i15 = R.drawable._2_res_0x7f080105;
            i16 = R.drawable._2_res_0x7f0800f5;
            z4 = true;
            z5 = true;
            z6 = true;
            z7 = true;
            i17 = R.drawable._2_res_0x7f080104;
            z8 = true;
        }
        LayoutInflater.from(context).inflate(i2, this);
        setDescendantFocusability(262144);
        ViewOnClickListenerC3314 viewOnClickListenerC33142 = new ViewOnClickListenerC3314(this);
        this.f12929 = viewOnClickListenerC33142;
        this.f12946 = new CopyOnWriteArrayList();
        this.f12944 = new C2412();
        this.f12942 = new C2434();
        StringBuilder sb = new StringBuilder();
        this.f12908 = sb;
        int i23 = i5;
        int i24 = i6;
        this.f12943 = new Formatter(sb, Locale.getDefault());
        this.f12940 = new long[0];
        this.f12914 = new boolean[0];
        this.f12907 = new long[0];
        this.f12912 = new boolean[0];
        this.f12955 = new RunnableC0246(15, this);
        this.f12939 = (TextView) findViewById(R.id._2_res_0x7f0b0162);
        this.f12904 = (TextView) findViewById(R.id._2_res_0x7f0b0176);
        ImageView imageView3 = (ImageView) findViewById(R.id._2_res_0x7f0b0182);
        this.f12927 = imageView3;
        if (imageView3 != null) {
            imageView3.setOnClickListener(viewOnClickListenerC33142);
        }
        ImageView imageView4 = (ImageView) findViewById(R.id._2_res_0x7f0b0168);
        this.f12952 = imageView4;
        ViewOnClickListenerC0689 viewOnClickListenerC0689 = new ViewOnClickListenerC0689(7, this);
        if (imageView4 != null) {
            imageView4.setVisibility(8);
            imageView4.setOnClickListener(viewOnClickListenerC0689);
        }
        ImageView imageView5 = (ImageView) findViewById(R.id._2_res_0x7f0b016d);
        this.f12913 = imageView5;
        ViewOnClickListenerC0689 viewOnClickListenerC06892 = new ViewOnClickListenerC0689(7, this);
        if (imageView5 != null) {
            imageView5.setVisibility(8);
            imageView5.setOnClickListener(viewOnClickListenerC06892);
        }
        View viewFindViewById = findViewById(R.id._2_res_0x7f0b017d);
        this.f12921 = viewFindViewById;
        if (viewFindViewById != null) {
            viewFindViewById.setOnClickListener(viewOnClickListenerC33142);
        }
        View viewFindViewById2 = findViewById(R.id._2_res_0x7f0b0175);
        this.f12967 = viewFindViewById2;
        if (viewFindViewById2 != null) {
            viewFindViewById2.setOnClickListener(viewOnClickListenerC33142);
        }
        View viewFindViewById3 = findViewById(R.id._2_res_0x7f0b0158);
        this.f12928 = viewFindViewById3;
        if (viewFindViewById3 != null) {
            viewFindViewById3.setOnClickListener(viewOnClickListenerC33142);
        }
        InterfaceC3317 interfaceC3317 = (InterfaceC3317) findViewById(R.id._2_res_0x7f0b0178);
        View viewFindViewById4 = findViewById(R.id._2_res_0x7f0b0179);
        if (interfaceC3317 != null) {
            this.f12918 = interfaceC3317;
            z9 = z;
            z10 = z2;
        } else if (viewFindViewById4 != null) {
            z10 = z2;
            z9 = z;
            DefaultTimeBar defaultTimeBar = new DefaultTimeBar(context, null, attributeSet, R.style._2_res_0x7f140140);
            defaultTimeBar.setId(R.id._2_res_0x7f0b0178);
            defaultTimeBar.setLayoutParams(viewFindViewById4.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) viewFindViewById4.getParent();
            int iIndexOfChild = viewGroup.indexOfChild(viewFindViewById4);
            viewGroup.removeView(viewFindViewById4);
            viewGroup.addView(defaultTimeBar, iIndexOfChild);
            this.f12918 = defaultTimeBar;
        } else {
            z9 = z;
            z10 = z2;
            this.f12918 = null;
        }
        InterfaceC3317 interfaceC33172 = this.f12918;
        if (interfaceC33172 != null) {
            ((DefaultTimeBar) interfaceC33172).f1460.add(viewOnClickListenerC33142);
        }
        Resources resources = context.getResources();
        this.f12915 = resources;
        ImageView imageView6 = (ImageView) findViewById(R.id._2_res_0x7f0b0174);
        this.f12964 = imageView6;
        if (imageView6 != null) {
            imageView6.setOnClickListener(viewOnClickListenerC33142);
        }
        ImageView imageView7 = (ImageView) findViewById(R.id._2_res_0x7f0b0177);
        this.f12936 = imageView7;
        if (imageView7 != null) {
            imageView7.setImageDrawable(AbstractC4470.m10216(context, resources, i4));
            imageView7.setOnClickListener(viewOnClickListenerC33142);
        }
        ImageView imageView8 = (ImageView) findViewById(R.id._2_res_0x7f0b016e);
        this.f12935 = imageView8;
        if (imageView8 != null) {
            imageView8.setImageDrawable(AbstractC4470.m10216(context, resources, i3));
            imageView8.setOnClickListener(viewOnClickListenerC33142);
        }
        ThreadLocal threadLocal = AbstractC4208.f16226;
        if (context.isRestricted()) {
            viewOnClickListenerC3314 = viewOnClickListenerC33142;
            imageView = imageView8;
            i18 = i11;
            i19 = i12;
            i20 = i;
            i21 = i23;
            imageView2 = imageView3;
            typefaceM9655 = null;
            z11 = z3;
            i22 = i24;
        } else {
            i18 = i11;
            i19 = i12;
            viewOnClickListenerC3314 = viewOnClickListenerC33142;
            i20 = i;
            i21 = i23;
            imageView = imageView8;
            z11 = z3;
            i22 = i24;
            imageView2 = imageView3;
            typefaceM9655 = AbstractC4208.m9655(context, R.font._2_res_0x7f090000, new TypedValue(), 0, null, false, false);
        }
        ImageView imageView9 = (ImageView) findViewById(R.id._2_res_0x7f0b017b);
        TextView textView = (TextView) findViewById(R.id._2_res_0x7f0b017c);
        if (imageView9 != null) {
            imageView9.setImageDrawable(AbstractC4470.m10216(context, resources, i15));
            this.f12960 = imageView9;
            this.f12958 = null;
        } else if (textView != null) {
            textView.setTypeface(typefaceM9655);
            this.f12958 = textView;
            this.f12960 = textView;
        } else {
            this.f12958 = null;
            this.f12960 = null;
        }
        View view = this.f12960;
        ViewOnClickListenerC3314 viewOnClickListenerC33143 = viewOnClickListenerC3314;
        if (view != null) {
            view.setOnClickListener(viewOnClickListenerC33143);
        }
        ImageView imageView10 = (ImageView) findViewById(R.id._2_res_0x7f0b0166);
        TextView textView2 = (TextView) findViewById(R.id._2_res_0x7f0b0167);
        if (imageView10 != null) {
            imageView10.setImageDrawable(AbstractC4470.m10216(context, resources, i17));
            this.f12931 = imageView10;
            this.f12902 = null;
        } else if (textView2 != null) {
            textView2.setTypeface(typefaceM9655);
            this.f12902 = textView2;
            this.f12931 = textView2;
        } else {
            this.f12902 = null;
            this.f12931 = null;
        }
        View view2 = this.f12931;
        if (view2 != null) {
            view2.setOnClickListener(viewOnClickListenerC33143);
        }
        ImageView imageView11 = (ImageView) findViewById(R.id._2_res_0x7f0b017a);
        this.f12956 = imageView11;
        if (imageView11 != null) {
            imageView11.setOnClickListener(viewOnClickListenerC33143);
        }
        ImageView imageView12 = (ImageView) findViewById(R.id._2_res_0x7f0b017f);
        this.f12972 = imageView12;
        if (imageView12 != null) {
            imageView12.setOnClickListener(viewOnClickListenerC33143);
        }
        this.f12965 = resources.getInteger(R.integer._2_res_0x7f0c000c) / 100.0f;
        this.f12933 = resources.getInteger(R.integer._2_res_0x7f0c000b) / 100.0f;
        ImageView imageView13 = (ImageView) findViewById(R.id._2_res_0x7f0b0187);
        this.f12923 = imageView13;
        if (imageView13 != null) {
            imageView13.setImageDrawable(AbstractC4470.m10216(context, resources, i7));
            m8128(imageView13, false);
        }
        C3339 c3339 = new C3339(this);
        this.f12948 = c3339;
        c3339.f13036 = z8;
        C3327 c3327 = new C3327(this, new String[]{resources.getString(R.string._2_res_0x7f130098), resources.getString(R.string._2_res_0x7f1300b9)}, new Drawable[]{AbstractC4470.m10216(context, resources, R.drawable._2_res_0x7f080106), AbstractC4470.m10216(context, resources, R.drawable._2_res_0x7f0800f2)});
        this.f12961 = c3327;
        this.f12910 = resources.getDimensionPixelSize(R.dimen._2_res_0x7f0700af);
        RecyclerView recyclerView = (RecyclerView) LayoutInflater.from(context).inflate(R.layout._2_res_0x7f0e003e, (ViewGroup) null);
        this.f12916 = recyclerView;
        recyclerView.setAdapter(c3327);
        getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(1));
        PopupWindow popupWindow = new PopupWindow((View) recyclerView, -2, -2, true);
        this.f12973 = popupWindow;
        if (AbstractC4470.f17202 < 23) {
            popupWindow.setBackgroundDrawable(new ColorDrawable(0));
        }
        popupWindow.setOnDismissListener(viewOnClickListenerC33143);
        this.f12903 = true;
        this.f12949 = new ᵢٴ(getResources());
        this.f12922 = AbstractC4470.m10216(context, resources, i20);
        this.f12947 = AbstractC4470.m10216(context, resources, i19);
        this.f12971 = resources.getString(R.string._2_res_0x7f13008d);
        this.f12906 = resources.getString(R.string._2_res_0x7f13008c);
        this.f12925 = new C3323(this, 1);
        this.f12941 = new C3323(this, 0);
        this.f12969 = new C3312(this, resources.getStringArray(R.array._2_res_0x7f030000), f12899);
        this.f12953 = AbstractC4470.m10216(context, resources, i18);
        this.f12932 = AbstractC4470.m10216(context, resources, i13);
        this.f12954 = AbstractC4470.m10216(context, resources, i14);
        this.f12970 = AbstractC4470.m10216(context, resources, i16);
        this.f12934 = AbstractC4470.m10216(context, resources, i8);
        this.f12968 = AbstractC4470.m10216(context, resources, i9);
        this.f12974 = AbstractC4470.m10216(context, resources, i10);
        this.f12911 = AbstractC4470.m10216(context, resources, i22);
        this.f12917 = AbstractC4470.m10216(context, resources, i21);
        this.f12957 = resources.getString(R.string._2_res_0x7f130091);
        this.f12966 = resources.getString(R.string._2_res_0x7f130090);
        this.f12901 = resources.getString(R.string._2_res_0x7f13009b);
        this.f12945 = resources.getString(R.string._2_res_0x7f13009c);
        this.f12924 = resources.getString(R.string._2_res_0x7f13009a);
        this.f12900 = resources.getString(R.string._2_res_0x7f1300a2);
        this.f12909 = resources.getString(R.string._2_res_0x7f1300a1);
        c3339.m8168((ViewGroup) findViewById(R.id._2_res_0x7f0b015a), true);
        c3339.m8168(this.f12931, z5);
        c3339.m8168(this.f12960, z4);
        c3339.m8168(imageView7, z6);
        c3339.m8168(imageView, z7);
        c3339.m8168(imageView12, z11);
        c3339.m8168(imageView2, z9);
        c3339.m8168(imageView13, z10);
        c3339.m8168(imageView11, this.f12963 != 0);
        addOnLayoutChangeListener(new ˎᵢ(2, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlaybackSpeed(float f) {
        ﹳﹳ r0 = this.f12962;
        if (r0 == null || !r0.ٴᐧ(13)) {
            return;
        }
        C5118 c5118 = (C5118) this.f12962;
        c5118.m11358();
        C2441 c2441 = new C2441(f, c5118.f19520.f19455.f9728);
        c5118.m11358();
        if (c5118.f19520.f19455.equals(c2441)) {
            return;
        }
        C5110 c5110M11331 = c5118.f19520.m11331(c2441);
        c5118.f19551++;
        c5118.f19579.f19262.m10159(4, c2441).m10121();
        c5118.m11380(c5110M11331, 0, false, 5, -9223372036854775807L, -1, false);
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static boolean m8121(InterfaceC2419 interfaceC2419, C2434 c2434) {
        AbstractC2394 abstractC2394M11369;
        int iMo6474;
        ﹳﹳ r9 = (ﹳﹳ) interfaceC2419;
        if (!r9.ٴᐧ(17) || (iMo6474 = (abstractC2394M11369 = ((C5118) r9).m11369()).mo6474()) <= 1 || iMo6474 > 100) {
            return false;
        }
        for (int i = 0; i < iMo6474; i++) {
            if (abstractC2394M11369.mo6179(i, c2434, 0L).f9707 == -9223372036854775807L) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static void m8122(C3328 c3328) {
        if (c3328.f12950 == null) {
            return;
        }
        boolean z = c3328.f12951;
        c3328.f12951 = !z;
        String str = c3328.f12966;
        Drawable drawable = c3328.f12970;
        String str2 = c3328.f12957;
        Drawable drawable2 = c3328.f12954;
        ImageView imageView = c3328.f12952;
        if (imageView != null) {
            if (z) {
                imageView.setImageDrawable(drawable);
                imageView.setContentDescription(str);
            } else {
                imageView.setImageDrawable(drawable2);
                imageView.setContentDescription(str2);
            }
        }
        boolean z2 = c3328.f12951;
        ImageView imageView2 = c3328.f12913;
        if (imageView2 == null) {
            return;
        }
        if (z2) {
            imageView2.setImageDrawable(drawable2);
            imageView2.setContentDescription(str2);
        } else {
            imageView2.setImageDrawable(drawable);
            imageView2.setContentDescription(str);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return m8138(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    public InterfaceC2419 getPlayer() {
        return this.f12962;
    }

    public int getRepeatToggleModes() {
        return this.f12963;
    }

    public boolean getShowShuffleButton() {
        return this.f12948.m8165(this.f12972);
    }

    public boolean getShowSubtitleButton() {
        return this.f12948.m8165(this.f12927);
    }

    public int getShowTimeoutMs() {
        return this.f12937;
    }

    public boolean getShowVrButton() {
        return this.f12948.m8165(this.f12923);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        C3339 c3339 = this.f12948;
        c3339.f13049.addOnLayoutChangeListener(c3339.f13060);
        this.f12959 = true;
        if (m8130()) {
            c3339.m8171();
        }
        m8124();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C3339 c3339 = this.f12948;
        c3339.f13049.removeOnLayoutChangeListener(c3339.f13060);
        this.f12959 = false;
        removeCallbacks(this.f12955);
        c3339.m8170();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        View view = this.f12948.f13033;
        if (view != null) {
            view.layout(0, 0, i3 - i, i4 - i2);
        }
    }

    public void setAnimationEnabled(boolean z) {
        this.f12948.f13036 = z;
    }

    @Deprecated
    public void setOnFullScreenModeChangedListener(InterfaceC3338 interfaceC3338) {
        this.f12950 = interfaceC3338;
        boolean z = interfaceC3338 != null;
        ImageView imageView = this.f12952;
        if (imageView != null) {
            if (z) {
                imageView.setVisibility(0);
            } else {
                imageView.setVisibility(8);
            }
        }
        boolean z2 = interfaceC3338 != null;
        ImageView imageView2 = this.f12913;
        if (imageView2 == null) {
            return;
        }
        if (z2) {
            imageView2.setVisibility(0);
        } else {
            imageView2.setVisibility(8);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setPlayer(p166.InterfaceC2419 r5) {
        /*
            r4 = this;
            android.os.Looper r0 = android.os.Looper.myLooper()
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r2 = 0
            r3 = 1
            if (r0 != r1) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            p383.AbstractC4464.m10132(r0)
            if (r5 == 0) goto L1f
            r0 = r5
            ﹶﾞ.ﾞʽ r0 = (p438.C5118) r0
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            android.os.Looper r0 = r0.f19518
            if (r0 != r1) goto L20
        L1f:
            r2 = 1
        L20:
            p383.AbstractC4464.m10142(r2)
            ˊﹶ.ˑﾞ r0 = r4.f12962
            if (r0 != r5) goto L28
            return
        L28:
            ـᐧ.ˏᵢ r1 = r4.f12929
            if (r0 == 0) goto L31
            ﹶﾞ.ﾞʽ r0 = (p438.C5118) r0
            r0.m11365(r1)
        L31:
            r4.f12962 = r5
            if (r5 == 0) goto L3f
            ﹶﾞ.ﾞʽ r5 = (p438.C5118) r5
            r1.getClass()
            ᴵˎ.ˎˋ r5 = r5.f19524
            r5.ـﹶ(r1)
        L3f:
            r4.m8124()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p272.C3328.setPlayer(ˊﹶ.ˑﾞ):void");
    }

    public void setProgressUpdateListener(InterfaceC3305 interfaceC3305) {
    }

    public void setRepeatToggleModes(int i) {
        this.f12963 = i;
        ﹳﹳ r0 = this.f12962;
        if (r0 != null && r0.ٴᐧ(15)) {
            C5118 c5118 = (C5118) this.f12962;
            c5118.m11358();
            int i2 = c5118.f19530;
            if (i == 0 && i2 != 0) {
                ((C5118) this.f12962).m11366(0);
            } else if (i == 1 && i2 == 2) {
                ((C5118) this.f12962).m11366(1);
            } else if (i == 2 && i2 == 1) {
                ((C5118) this.f12962).m11366(2);
            }
        }
        this.f12948.m8168(this.f12956, i != 0);
        m8131();
    }

    public void setShowFastForwardButton(boolean z) {
        this.f12948.m8168(this.f12931, z);
        m8125();
    }

    @Deprecated
    public void setShowMultiWindowTimeBar(boolean z) {
        this.f12938 = z;
        m8135();
    }

    public void setShowNextButton(boolean z) {
        this.f12948.m8168(this.f12935, z);
        m8125();
    }

    public void setShowPlayButtonIfPlaybackIsSuppressed(boolean z) {
        this.f12905 = z;
        m8126();
    }

    public void setShowPreviousButton(boolean z) {
        this.f12948.m8168(this.f12936, z);
        m8125();
    }

    public void setShowRewindButton(boolean z) {
        this.f12948.m8168(this.f12960, z);
        m8125();
    }

    public void setShowShuffleButton(boolean z) {
        this.f12948.m8168(this.f12972, z);
        m8127();
    }

    public void setShowSubtitleButton(boolean z) {
        this.f12948.m8168(this.f12927, z);
    }

    public void setShowTimeoutMs(int i) {
        this.f12937 = i;
        if (m8130()) {
            this.f12948.m8171();
        }
    }

    public void setShowVrButton(boolean z) {
        this.f12948.m8168(this.f12923, z);
    }

    public void setTimeBarMinUpdateInterval(int i) {
        this.f12919 = AbstractC4470.m10172(i, 16, 1000);
    }

    public void setVrButtonListener(View.OnClickListener onClickListener) {
        ImageView imageView = this.f12923;
        if (imageView != null) {
            imageView.setOnClickListener(onClickListener);
            m8128(imageView, onClickListener != null);
        }
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final void m8123(AbstractC1373 abstractC1373, View view) {
        this.f12916.setAdapter(abstractC1373);
        m8136();
        this.f12903 = false;
        PopupWindow popupWindow = this.f12973;
        popupWindow.dismiss();
        this.f12903 = true;
        int width = getWidth() - popupWindow.getWidth();
        int i = this.f12910;
        popupWindow.showAsDropDown(view, width - i, (-popupWindow.getHeight()) - i);
    }

    /* renamed from: ˉי, reason: contains not printable characters */
    public final void m8124() {
        m8126();
        m8125();
        m8131();
        m8127();
        m8137();
        m8134();
        m8135();
    }

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public final void m8125() {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        long j;
        long j2;
        if (m8139() && this.f12959) {
            ﹳﹳ r2 = this.f12962;
            if (r2 != null) {
                z2 = (this.f12938 && m8121(r2, this.f12942)) ? r2.ٴᐧ(10) : r2.ٴᐧ(5);
                ﹳﹳ r22 = r2;
                z3 = r22.ٴᐧ(7);
                z4 = r22.ٴᐧ(11);
                z5 = r22.ٴᐧ(12);
                z = r22.ٴᐧ(9);
            } else {
                z = false;
                z2 = false;
                z3 = false;
                z4 = false;
                z5 = false;
            }
            Resources resources = this.f12915;
            View view = this.f12960;
            if (z4) {
                InterfaceC2419 interfaceC2419 = this.f12962;
                if (interfaceC2419 != null) {
                    C5118 c5118 = (C5118) interfaceC2419;
                    c5118.m11358();
                    j2 = c5118.f19563;
                } else {
                    j2 = 5000;
                }
                int i = (int) (j2 / 1000);
                TextView textView = this.f12958;
                if (textView != null) {
                    textView.setText(String.valueOf(i));
                }
                if (view != null) {
                    view.setContentDescription(resources.getQuantityString(R.plurals._2_res_0x7f110002, i, Integer.valueOf(i)));
                }
            }
            View view2 = this.f12931;
            if (z5) {
                InterfaceC2419 interfaceC24192 = this.f12962;
                if (interfaceC24192 != null) {
                    C5118 c51182 = (C5118) interfaceC24192;
                    c51182.m11358();
                    j = c51182.f19578;
                } else {
                    j = 15000;
                }
                int i2 = (int) (j / 1000);
                TextView textView2 = this.f12902;
                if (textView2 != null) {
                    textView2.setText(String.valueOf(i2));
                }
                if (view2 != null) {
                    view2.setContentDescription(resources.getQuantityString(R.plurals._2_res_0x7f110001, i2, Integer.valueOf(i2)));
                }
            }
            m8128(this.f12936, z3);
            m8128(view, z4);
            m8128(view2, z5);
            m8128(this.f12935, z);
            InterfaceC3317 interfaceC3317 = this.f12918;
            if (interfaceC3317 != null) {
                interfaceC3317.setEnabled(z2);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x005b  */
    /* renamed from: ˋⁱ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m8126() {
        /*
            r4 = this;
            boolean r0 = r4.m8139()
            if (r0 == 0) goto L5f
            boolean r0 = r4.f12959
            if (r0 != 0) goto Lb
            goto L5f
        Lb:
            android.widget.ImageView r0 = r4.f12964
            if (r0 == 0) goto L5f
            ˊﹶ.ˑﾞ r1 = r4.f12962
            boolean r2 = r4.f12905
            boolean r1 = p383.AbstractC4470.m10209(r1, r2)
            if (r1 == 0) goto L1c
            android.graphics.drawable.Drawable r2 = r4.f12953
            goto L1e
        L1c:
            android.graphics.drawable.Drawable r2 = r4.f12932
        L1e:
            if (r1 == 0) goto L24
            r1 = 2131951767(0x7f130097, float:1.9539958E38)
            goto L27
        L24:
            r1 = 2131951766(0x7f130096, float:1.9539956E38)
        L27:
            r0.setImageDrawable(r2)
            android.content.res.Resources r2 = r4.f12915
            java.lang.String r1 = r2.getString(r1)
            r0.setContentDescription(r1)
            ˊﹶ.ˑﾞ r1 = r4.f12962
            if (r1 == 0) goto L5b
            ʿﾞ.ﹳﹳ r1 = (ʿﾞ.ﹳﹳ) r1
            r2 = 1
            boolean r1 = r1.ٴᐧ(r2)
            if (r1 == 0) goto L5b
            ˊﹶ.ˑﾞ r1 = r4.f12962
            r3 = 17
            ʿﾞ.ﹳﹳ r1 = (ʿﾞ.ﹳﹳ) r1
            boolean r1 = r1.ٴᐧ(r3)
            if (r1 == 0) goto L5c
            ˊﹶ.ˑﾞ r1 = r4.f12962
            ﹶﾞ.ﾞʽ r1 = (p438.C5118) r1
            ˊﹶ.ʻʿ r1 = r1.m11369()
            boolean r1 = r1.m6477()
            if (r1 != 0) goto L5b
            goto L5c
        L5b:
            r2 = 0
        L5c:
            r4.m8128(r0, r2)
        L5f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p272.C3328.m8126():void");
    }

    /* renamed from: ˎٴ, reason: contains not printable characters */
    public final void m8127() {
        ImageView imageView;
        if (m8139() && this.f12959 && (imageView = this.f12972) != null) {
            ﹳﹳ r1 = this.f12962;
            if (!this.f12948.m8165(imageView)) {
                m8128(imageView, false);
                return;
            }
            String str = this.f12909;
            Drawable drawable = this.f12917;
            if (r1 == null || !r1.ٴᐧ(14)) {
                m8128(imageView, false);
                imageView.setImageDrawable(drawable);
                imageView.setContentDescription(str);
                return;
            }
            m8128(imageView, true);
            C5118 c5118 = (C5118) r1;
            c5118.m11358();
            if (c5118.f19522) {
                drawable = this.f12911;
            }
            imageView.setImageDrawable(drawable);
            c5118.m11358();
            if (c5118.f19522) {
                str = this.f12900;
            }
            imageView.setContentDescription(str);
        }
    }

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public final void m8128(View view, boolean z) {
        if (view == null) {
            return;
        }
        view.setEnabled(z);
        view.setAlpha(z ? this.f12965 : this.f12933);
    }

    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public final void m8129() {
        long jM11387;
        long jM11391;
        if (m8139() && this.f12959) {
            ﹳﹳ r0 = this.f12962;
            if (r0 == null || !r0.ٴᐧ(16)) {
                jM11387 = 0;
                jM11391 = 0;
            } else {
                long j = this.f12930;
                C5118 c5118 = (C5118) r0;
                c5118.m11358();
                jM11387 = c5118.m11387(c5118.f19520) + j;
                jM11391 = c5118.m11391() + this.f12930;
            }
            TextView textView = this.f12904;
            if (textView != null && !this.f12926) {
                textView.setText(AbstractC4470.m10169(this.f12908, this.f12943, jM11387));
            }
            InterfaceC3317 interfaceC3317 = this.f12918;
            if (interfaceC3317 != null) {
                ((DefaultTimeBar) interfaceC3317).m1152(jM11387, 0L);
                interfaceC3317.setBufferedPosition(jM11391);
            }
            RunnableC0246 runnableC0246 = this.f12955;
            removeCallbacks(runnableC0246);
            int iM11361 = r0 == null ? 1 : ((C5118) r0).m11361();
            if (r0 != null) {
                C5118 c51182 = (C5118) r0;
                if (c51182.m11361() == 3 && c51182.m11362()) {
                    c51182.m11358();
                    if (c51182.f19520.f19462 == 0) {
                        long jMin = Math.min(interfaceC3317 != null ? interfaceC3317.getPreferredUpdateDelay() : 1000L, 1000 - (jM11387 % 1000));
                        C5118 c51183 = (C5118) r0;
                        c51183.m11358();
                        float f = c51183.f19520.f19455.f9730;
                        postDelayed(runnableC0246, AbstractC4470.m10184(f > 0.0f ? (long) (jMin / f) : 1000L, this.f12919, 1000L));
                        return;
                    }
                }
            }
            if (iM11361 == 4 || iM11361 == 1) {
                return;
            }
            postDelayed(runnableC0246, 1000L);
        }
    }

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final boolean m8130() {
        C3339 c3339 = this.f12948;
        return c3339.f13057 == 0 && c3339.f13049.m8139();
    }

    /* renamed from: ˑי, reason: contains not printable characters */
    public final void m8131() {
        ImageView imageView;
        if (m8139() && this.f12959 && (imageView = this.f12956) != null) {
            if (this.f12963 == 0) {
                m8128(imageView, false);
                return;
            }
            ﹳﹳ r1 = this.f12962;
            String str = this.f12901;
            Drawable drawable = this.f12934;
            if (r1 == null || !r1.ٴᐧ(15)) {
                m8128(imageView, false);
                imageView.setImageDrawable(drawable);
                imageView.setContentDescription(str);
                return;
            }
            m8128(imageView, true);
            C5118 c5118 = (C5118) r1;
            c5118.m11358();
            int i = c5118.f19530;
            if (i == 0) {
                imageView.setImageDrawable(drawable);
                imageView.setContentDescription(str);
            } else if (i == 1) {
                imageView.setImageDrawable(this.f12968);
                imageView.setContentDescription(this.f12945);
            } else {
                if (i != 2) {
                    return;
                }
                imageView.setImageDrawable(this.f12974);
                imageView.setContentDescription(this.f12924);
            }
        }
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final C3932 m8132(C2398 c2398, int i) {
        AbstractC3968.m9177(4, "initialCapacity");
        Object[] objArrCopyOf = new Object[4];
        AbstractC3980 abstractC3980 = c2398.f9466;
        int i2 = 0;
        for (int i3 = 0; i3 < abstractC3980.size(); i3++) {
            C2429 c2429 = (C2429) abstractC3980.get(i3);
            if (c2429.f9651.f9698 == i) {
                for (int i4 = 0; i4 < c2429.f9654; i4++) {
                    if (c2429.m6536(i4)) {
                        C2431 c2431 = c2429.f9651.f9700[i4];
                        if ((c2431.f9658 & 2) == 0) {
                            C3316 c3316 = new C3316(c2398, i3, i4, this.f12949.ʿˏ(c2431));
                            int i5 = i2 + 1;
                            if (objArrCopyOf.length < i5) {
                                objArrCopyOf = Arrays.copyOf(objArrCopyOf, AbstractC3962.m9169(objArrCopyOf.length, i5));
                            }
                            objArrCopyOf[i2] = c3316;
                            i2 = i5;
                        }
                    }
                }
            }
        }
        return AbstractC3980.m9206(i2, objArrCopyOf);
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final void m8133() {
        C3339 c3339 = this.f12948;
        int i = c3339.f13057;
        if (i == 3 || i == 2) {
            return;
        }
        c3339.m8170();
        if (!c3339.f13036) {
            c3339.m8172(2);
        } else if (c3339.f13057 == 1) {
            c3339.f13041.start();
        } else {
            c3339.f13053.start();
        }
    }

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public final void m8134() {
        C3312 c3312;
        InterfaceC2419 interfaceC2419 = this.f12962;
        if (interfaceC2419 == null) {
            return;
        }
        C5118 c5118 = (C5118) interfaceC2419;
        c5118.m11358();
        float f = c5118.f19520.f19455.f9730;
        float f2 = Float.MAX_VALUE;
        int i = 0;
        int i2 = 0;
        while (true) {
            c3312 = this.f12969;
            float[] fArr = c3312.f12867;
            if (i >= fArr.length) {
                break;
            }
            float fAbs = Math.abs(f - fArr[i]);
            if (fAbs < f2) {
                i2 = i;
                f2 = fAbs;
            }
            i++;
        }
        c3312.f12868 = i2;
        String str = c3312.f12870[i2];
        C3327 c3327 = this.f12961;
        ((String[]) c3327.f12896)[0] = str;
        m8128(this.f12921, c3327.m8119(1) || c3327.m8119(0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0140  */
    /* JADX WARN: Type inference failed for: r8v6, types: [ˊﹶ.ʻʿ] */
    /* renamed from: ᵎˏ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m8135() {
        /*
            Method dump skipped, instructions count: 410
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p272.C3328.m8135():void");
    }

    /* renamed from: ᵎـ, reason: contains not printable characters */
    public final void m8136() {
        RecyclerView recyclerView = this.f12916;
        recyclerView.measure(0, 0);
        int width = getWidth();
        int i = this.f12910;
        int iMin = Math.min(recyclerView.getMeasuredWidth(), width - (i * 2));
        PopupWindow popupWindow = this.f12973;
        popupWindow.setWidth(iMin);
        popupWindow.setHeight(Math.min(getHeight() - (i * 2), recyclerView.getMeasuredHeight()));
    }

    /* renamed from: ﹳˎ, reason: contains not printable characters */
    public final void m8137() {
        C3323 c3323 = this.f12925;
        c3323.getClass();
        c3323.f12888 = Collections.emptyList();
        C3323 c33232 = this.f12941;
        c33232.getClass();
        c33232.f12888 = Collections.emptyList();
        ﹳﹳ r2 = this.f12962;
        ImageView imageView = this.f12927;
        if (r2 != null && r2.ٴᐧ(30) && this.f12962.ٴᐧ(29)) {
            C2398 c2398M11367 = ((C5118) this.f12962).m11367();
            C3932 c3932M8132 = m8132(c2398M11367, 1);
            c33232.f12888 = c3932M8132;
            C3328 c3328 = c33232.f12887;
            InterfaceC2419 interfaceC2419 = c3328.f12962;
            interfaceC2419.getClass();
            C1245 c1245M11371 = ((C5118) interfaceC2419).m11371();
            boolean zIsEmpty = c3932M8132.isEmpty();
            C3327 c3327 = c3328.f12961;
            if (!zIsEmpty) {
                if (c33232.m8114(c1245M11371)) {
                    int i = 0;
                    while (true) {
                        if (i >= c3932M8132.f15276) {
                            break;
                        }
                        C3316 c3316 = (C3316) c3932M8132.get(i);
                        if (c3316.f12876.f9652[c3316.f12874]) {
                            ((String[]) c3327.f12896)[1] = c3316.f12875;
                            break;
                        }
                        i++;
                    }
                } else {
                    ((String[]) c3327.f12896)[1] = c3328.getResources().getString(R.string._2_res_0x7f1300b7);
                }
            } else {
                ((String[]) c3327.f12896)[1] = c3328.getResources().getString(R.string._2_res_0x7f1300b8);
            }
            if (this.f12948.m8165(imageView)) {
                c3323.m8115(m8132(c2398M11367, 3));
            } else {
                c3323.m8115(C3932.f15274);
            }
        }
        m8128(imageView, c3323.mo974() > 0);
        C3327 c33272 = this.f12961;
        m8128(this.f12921, c33272.m8119(1) || c33272.m8119(0));
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x006d  */
    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m8138(android.view.KeyEvent r14) {
        /*
            r13 = this;
            int r0 = r14.getKeyCode()
            ˊﹶ.ˑﾞ r1 = r13.f12962
            r2 = 0
            if (r1 == 0) goto Lc9
            r3 = 88
            r4 = 87
            r5 = 127(0x7f, float:1.78E-43)
            r6 = 126(0x7e, float:1.77E-43)
            r7 = 79
            r8 = 85
            r9 = 89
            r10 = 90
            if (r0 == r10) goto L29
            if (r0 == r9) goto L29
            if (r0 == r8) goto L29
            if (r0 == r7) goto L29
            if (r0 == r6) goto L29
            if (r0 == r5) goto L29
            if (r0 == r4) goto L29
            if (r0 != r3) goto Lc9
        L29:
            int r11 = r14.getAction()
            r12 = 1
            if (r11 != 0) goto Lc8
            if (r0 != r10) goto L53
            r14 = r1
            ﹶﾞ.ﾞʽ r14 = (p438.C5118) r14
            int r14 = r14.m11361()
            r0 = 4
            if (r14 == r0) goto Lc8
            ʿﾞ.ﹳﹳ r1 = (ʿﾞ.ﹳﹳ) r1
            r14 = 12
            boolean r0 = r1.ٴᐧ(r14)
            if (r0 == 0) goto Lc8
            r0 = r1
            ﹶﾞ.ﾞʽ r0 = (p438.C5118) r0
            r0.m11358()
            long r2 = r0.f19578
            r1.ʾˈ(r14, r2)
            goto Lc8
        L53:
            if (r0 != r9) goto L6d
            r9 = r1
            ʿﾞ.ﹳﹳ r9 = (ʿﾞ.ﹳﹳ) r9
            r10 = 11
            boolean r11 = r9.ٴᐧ(r10)
            if (r11 == 0) goto L6d
            r14 = r9
            ﹶﾞ.ﾞʽ r14 = (p438.C5118) r14
            r14.m11358()
            long r0 = r14.f19563
            long r0 = -r0
            r9.ʾˈ(r10, r0)
            goto Lc8
        L6d:
            int r14 = r14.getRepeatCount()
            if (r14 != 0) goto Lc8
            if (r0 == r7) goto Laf
            if (r0 == r8) goto Laf
            if (r0 == r4) goto La1
            if (r0 == r3) goto L94
            if (r0 == r6) goto L90
            if (r0 == r5) goto L80
            goto Lc8
        L80:
            int r14 = p383.AbstractC4470.f17202
            ʿﾞ.ﹳﹳ r1 = (ʿﾞ.ﹳﹳ) r1
            boolean r14 = r1.ٴᐧ(r12)
            if (r14 == 0) goto Lc8
            ﹶﾞ.ﾞʽ r1 = (p438.C5118) r1
            r1.m11381(r2)
            goto Lc8
        L90:
            p383.AbstractC4470.m10193(r1)
            goto Lc8
        L94:
            ʿﾞ.ﹳﹳ r1 = (ʿﾞ.ﹳﹳ) r1
            r14 = 7
            boolean r14 = r1.ٴᐧ(r14)
            if (r14 == 0) goto Lc8
            r1.ˆﾞ()
            goto Lc8
        La1:
            ʿﾞ.ﹳﹳ r1 = (ʿﾞ.ﹳﹳ) r1
            r14 = 9
            boolean r14 = r1.ٴᐧ(r14)
            if (r14 == 0) goto Lc8
            r1.ˊﹶ()
            goto Lc8
        Laf:
            boolean r14 = r13.f12905
            boolean r14 = p383.AbstractC4470.m10209(r1, r14)
            if (r14 == 0) goto Lbb
            p383.AbstractC4470.m10193(r1)
            goto Lc8
        Lbb:
            ʿﾞ.ﹳﹳ r1 = (ʿﾞ.ﹳﹳ) r1
            boolean r14 = r1.ٴᐧ(r12)
            if (r14 == 0) goto Lc8
            ﹶﾞ.ﾞʽ r1 = (p438.C5118) r1
            r1.m11381(r2)
        Lc8:
            return r12
        Lc9:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p272.C3328.m8138(android.view.KeyEvent):boolean");
    }

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final boolean m8139() {
        return getVisibility() == 0;
    }
}
