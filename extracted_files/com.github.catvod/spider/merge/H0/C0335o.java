package com.github.catvod.spider.merge.h0;

import android.app.AlertDialog;
import android.graphics.drawable.GradientDrawable;
import android.os.Handler;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.github.catvod.spider.merge.C.C0017;
import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.G.C0019;
import com.github.catvod.spider.merge.N.C0023;
import com.github.catvod.spider.merge.P0.C0024;
import com.github.catvod.spider.merge.Q0.C0025;
import com.github.catvod.spider.merge.Q0.C0026;
import com.github.catvod.spider.merge.S.C0027;
import com.github.catvod.spider.merge.S0.C0028;
import com.github.catvod.spider.merge.S0.C0029;
import com.github.catvod.spider.merge.T0.C0030;
import com.github.catvod.spider.merge.V.C0031;
import com.github.catvod.spider.merge.V.C0032;
import com.github.catvod.spider.merge.Y.C0035;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.Z.C0037;
import com.github.catvod.spider.merge.Z.C0039;
import com.github.catvod.spider.merge.Z0.C0041;
import com.github.catvod.spider.merge.a0.C0042;
import com.github.catvod.spider.merge.a0.ViewOnClickListenerC0260v;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.b0.C0045;
import com.github.catvod.spider.merge.c1.C0046;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.d1.C0050;
import com.github.catvod.spider.merge.f.C0051;
import com.github.catvod.spider.merge.f0.C0052;
import com.github.catvod.spider.merge.h.C0054;
import com.github.catvod.spider.merge.p.C0057;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.merge.r0.C0060;
import com.github.catvod.spider.merge.v.C0062;
import com.github.catvod.spider.merge.x0.C0063;
import com.github.catvod.spider.merge.y0.C0064;
import com.github.catvod.spider.merge.z.C0065;
import com.github.catvod.spider.p000mergexbpq.Q.C0000;
import com.github.catvod.spider.p000mergexbpq.Q.C0002;
import com.github.catvod.spider.p000mergexbpq.R.C0003;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.b0.C0008;
import com.github.catvod.spider.p000mergexbpq.c.C0009;
import com.github.catvod.spider.p000mergexbpq.c0.C0010;
import com.github.catvod.spider.p000mergexbpq.e0.C0011;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import com.github.catvod.spider.p000mergexbpq.j.C0013;
import com.github.catvod.spider.p000mergexbpq.r.C0014;
import com.github.catvod.spider.p000mergexbpq.x.C0016;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.github.catvod.spider.merge.h0.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0335o {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f818short = {2022, 2038, 1923, 2032, 2036, 1927, 2032, 2471, 2497, 2484, 2497, 2484, 2497, 2484, 573, 603, 558, 603, 558, 603, 558, -31929, 28615, 26162, 25603, 28587, 23373, 32138, 23237, -24988};
    public AlertDialog a;
    public LinearLayout b;
    public LinearLayout c;
    public HorizontalScrollView d;
    public LinearLayout e;
    public String g;
    public int h;
    public int i;
    public LinearLayout j;
    public String k;
    public String l;
    public final HashMap f = new HashMap();
    public final Handler m = new Handler(C0063.m9553());

    public static void e(Button button) {
        int iM3103 = C0013.m3103(12);
        GradientDrawable gradientDrawable = new GradientDrawable();
        C0036.m6222(gradientDrawable, C0000.m1044(C0045.m7657(m8670(), 0, 7, 1989)));
        float f = iM3103;
        C0029.m5216(gradientDrawable, f);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        C0036.m6222(gradientDrawable2, C0000.m1044(C0002.m1305(m8670(), 7, 7, 2436)));
        C0029.m5216(gradientDrawable2, f);
        C0047.m7801(button, true);
        C0018.m3985(button, gradientDrawable2);
        C0057.m8960(button, new ViewOnFocusChangeListenerC0326f(button, gradientDrawable, gradientDrawable2, 0));
    }

    public static void h(Button button, boolean z) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        C0029.m5216(gradientDrawable, C0013.m3103(10));
        String strM3106 = C0013.m3106(m8670(), 14, 7, 542);
        if (z) {
            C0026.m4878(button, -1);
            C0036.m6222(gradientDrawable, C0000.m1044(strM3106));
            C0027.m5070(button, C0013.m3103(2));
        } else {
            C0026.m4878(button, -16777216);
            C0036.m6222(gradientDrawable, C0000.m1044(strM3106));
            C0035.m6166(button);
        }
        C0018.m3985(button, gradientDrawable);
    }

    /* renamed from: ۟ۨۦ, reason: not valid java name and contains not printable characters */
    public static short[] m8670() {
        if (C0003.m1463() < 0) {
            return f818short;
        }
        return null;
    }

    public final void a() {
        double d;
        DisplayMetrics displayMetricsM1852 = C0007.m1852(C0002.m1335(C0031.m5652()));
        int iM7678 = C0046.m7678(displayMetricsM1852);
        int iM7623 = C0045.m7623(displayMetricsM1852);
        double d2 = 0.9d;
        double d3 = iM7678;
        if (iM7623 > iM7678) {
            C0004.m1564(d3);
            this.h = (int) (d3 * 0.9d);
            d = iM7623;
            d2 = 0.45d;
        } else {
            C0004.m1564(d3);
            this.h = (int) (d3 * 0.5d);
            d = iM7623;
        }
        C0004.m1564(d);
        this.i = (int) (d * d2);
    }

    public final LinearLayout b() {
        LinearLayout linearLayout = new LinearLayout(C0031.m5652());
        C0032.m5684(linearLayout, 0);
        C0014.m3381(linearLayout, 17);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        C0012.m2963(layoutParams, C0013.m3103(6), C0013.m3103(0), C0013.m3103(6), C0013.m3103(4));
        C0016.m3608(linearLayout, 0, C0013.m3103(4), 0, C0013.m3103(4));
        C0009.m2112(linearLayout, layoutParams);
        C0037.m6336(C0009.m2040(this), linearLayout);
        return linearLayout;
    }

    public final void c() {
        if (C0030.m5411(this) == null) {
            return;
        }
        C0054.m8585(this);
        Window windowM1119 = C0000.m1119(C0030.m5411(this));
        if (windowM1119 != null) {
            C0000.m1046(windowM1119, 80);
            GradientDrawable gradientDrawable = new GradientDrawable();
            C0036.m6222(gradientDrawable, -1);
            C0060.m9283(gradientDrawable, new float[]{C0013.m3103(12), C0013.m3103(12), C0013.m3103(12), C0013.m3103(12), 0.0f, 0.0f, 0.0f, 0.0f});
            C0035.m6135(windowM1119, gradientDrawable);
            WindowManager.LayoutParams layoutParamsM5058 = C0027.m5058(windowM1119);
            layoutParamsM5058.width = C0031.m5629(this);
            layoutParamsM5058.height = -2;
            layoutParamsM5058.verticalMargin = 0.0f;
            layoutParamsM5058.y = 0;
            C0052.m8338(windowM1119, layoutParamsM5058);
        }
    }

    public final void d() {
        C0031.m5563(C0009.m2040(this));
        C0031.m5563(C0010.m2382(this));
        C0062.m9402(C0002.m1256(this));
        this.g = null;
        C0010.m2319(C0013.m3137(this), 0);
        C0010.m2319(C0009.m2040(this), 8);
        C0025.m4829(new RunnableC0328h(this, 2));
    }

    public final void f(String str) {
        C0031.m5563(C0009.m2040(this));
        TextView textView = new TextView(C0031.m5652());
        C0042.m7106(textView, str);
        C0039.m6563(textView, 16.0f);
        C0026.m4878(textView, -7829368);
        C0017.m3709(textView, 0, C0013.m3103(32), 0, C0013.m3103(32));
        C0024.m4681(textView, 17);
        C0037.m6336(C0009.m2040(this), textView);
    }

    public final void g(String str) {
        float f;
        int iM3103;
        boolean z;
        this.g = str;
        C0031.m5563(C0009.m2040(this));
        for (int i = 0; i < C0026.m4897(C0010.m2382(this)); i++) {
            View viewM8237 = C0051.m8237(C0010.m2382(this), i);
            if (viewM8237 instanceof Button) {
                Button button = (Button) viewM8237;
                C0018.m3954(button, C0007.m1815(C0011.m2774(C0023.m4571(button)), str));
            }
        }
        List list = (List) C0065.m9715(C0002.m1256(this), str);
        if (list == null || C0035.m6132(list)) {
            C0047.m7835(this, C0009.m2037(m8670(), 21, 9, 2210));
            return;
        }
        int iM5629 = C0031.m5629(this) - C0013.m3103(40);
        if (iM5629 <= 0) {
            iM5629 = C0013.m3103(300);
        }
        ArrayList arrayList = new ArrayList();
        Iterator itM3109 = C0013.m3109(list);
        while (true) {
            f = 13.0f;
            if (!C0012.m2962(itM3109)) {
                break;
            }
            String strM7684 = C0046.m7684((C0332l) C0048.m7949(itM3109));
            TextView textView = new TextView(C0031.m5652());
            C0039.m6563(textView, 13.0f);
            C0042.m7106(textView, strM7684);
            C0041.m6797(textView, 0, 0);
            C0004.m1532(arrayList, C0011.m2808(C0008.m1965(C0013.m3103(12) + C0025.m4775(textView), C0013.m3103(40))));
        }
        int iM31032 = C0013.m3103(13);
        LinearLayout linearLayoutM8103 = null;
        int i2 = 0;
        int i3 = 0;
        while (i2 < C0064.m9636(list)) {
            C0332l c0332l = (C0332l) C0048.m7915(list, i2);
            int iM4690 = C0024.m4690((Integer) C0028.m5167(arrayList, i2));
            if (linearLayoutM8103 == null) {
                linearLayoutM8103 = C0050.m8103(this);
                i3 = 0;
            }
            if (i3 + iM4690 + (C0026.m4897(linearLayoutM8103) > 0 ? iM31032 : 0) > iM5629) {
                linearLayoutM8103 = C0050.m8103(this);
                i3 = 0;
            }
            Button button2 = new Button(C0031.m5652());
            C0042.m7106(button2, C0046.m7684(c0332l));
            C0039.m6563(button2, f);
            C0018.m3910(button2, false);
            C0000.m1085(button2, C0004.m1563());
            C0019.m4086(button2, -1);
            C0042.m7142(button2, true);
            C0023.m4590(button2, true);
            if (iM4690 > iM5629 - C0013.m3103(20)) {
                iM3103 = iM5629 - C0013.m3103(19);
                z = true;
            } else {
                iM3103 = iM4690;
                z = false;
            }
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(iM3103, C0013.m3103(35));
            List list2 = list;
            int i4 = iM5629;
            C0012.m2963(layoutParams, C0013.m3103(6), C0013.m3103(0), C0013.m3103(6), C0013.m3103(0));
            C0009.m2112(button2, layoutParams);
            C0016.m3608(button2, C0013.m3103(6), C0013.m3103(6), C0013.m3103(6), C0013.m3103(6));
            C0058.m9082(button2);
            if (z) {
                C0047.m7801(button2, true);
                C0000.m1065(button2, true);
                C0041.m6820(C0043.m7371(this), new com.github.catvod.spider.merge.F.b(14, button2), 500L);
            }
            C0002.m1251(button2, new ViewOnClickListenerC0260v(this, c0332l, 3));
            C0037.m6336(linearLayoutM8103, button2);
            i3 += iM4690 + (C0026.m4897(linearLayoutM8103) > 1 ? iM31032 : 0);
            i2++;
            list = list2;
            iM5629 = i4;
            f = 13.0f;
        }
    }
}