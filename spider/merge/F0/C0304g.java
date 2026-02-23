package com.github.catvod.spider.merge.f0;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.StateListDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.github.catvod.spider.merge.C.C0017;
import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.I0.C0020;
import com.github.catvod.spider.merge.J0.C0021;
import com.github.catvod.spider.merge.K0.C0022;
import com.github.catvod.spider.merge.P0.C0024;
import com.github.catvod.spider.merge.Q0.C0025;
import com.github.catvod.spider.merge.Q0.C0026;
import com.github.catvod.spider.merge.S.C0027;
import com.github.catvod.spider.merge.S0.C0029;
import com.github.catvod.spider.merge.T0.C0030;
import com.github.catvod.spider.merge.V.C0031;
import com.github.catvod.spider.merge.V.C0032;
import com.github.catvod.spider.merge.V.C0033;
import com.github.catvod.spider.merge.W.C0034;
import com.github.catvod.spider.merge.Y.C0035;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.Z.C0037;
import com.github.catvod.spider.merge.Z.C0038;
import com.github.catvod.spider.merge.Z.C0039;
import com.github.catvod.spider.merge.Z.C0040;
import com.github.catvod.spider.merge.Z0.C0041;
import com.github.catvod.spider.merge.a0.C0042;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.b0.C0045;
import com.github.catvod.spider.merge.c1.C0046;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.d1.C0049;
import com.github.catvod.spider.merge.d1.C0050;
import com.github.catvod.spider.merge.f.C0051;
import com.github.catvod.spider.merge.f1.C0053;
import com.github.catvod.spider.merge.h.C0054;
import com.github.catvod.spider.merge.o0.C0056;
import com.github.catvod.spider.merge.p.C0057;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.merge.r0.C0059;
import com.github.catvod.spider.merge.r0.C0060;
import com.github.catvod.spider.merge.x0.C0063;
import com.github.catvod.spider.merge.y0.C0064;
import com.github.catvod.spider.p000mergexbpq.Q.C0000;
import com.github.catvod.spider.p000mergexbpq.Q.C0001;
import com.github.catvod.spider.p000mergexbpq.Q.C0002;
import com.github.catvod.spider.p000mergexbpq.R.C0003;
import com.github.catvod.spider.p000mergexbpq.S.C0005;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.b0.C0008;
import com.github.catvod.spider.p000mergexbpq.c.C0009;
import com.github.catvod.spider.p000mergexbpq.c0.C0010;
import com.github.catvod.spider.p000mergexbpq.e0.C0011;
import com.github.catvod.spider.p000mergexbpq.j.C0013;
import com.github.catvod.spider.p000mergexbpq.r.C0014;
import com.github.catvod.spider.p000mergexbpq.x.C0015;
import com.github.catvod.spider.p000mergexbpq.x.C0016;

/* renamed from: com.github.catvod.spider.merge.f0.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0304g {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f789short = {2562, 2569, 2563, 2574, 2569, 2560, 1084, 1066, 1070, 1085, 1068, 1063, 1040, 1069, 1082, 1083, 1083, 1056, 1057, 23075, 23375, 24838, 30776, 3099, 3085, 3081, 3098, 3083, 3072, 3127, 3082, 3101, 3100, 3100, 3079, 3078};
    public String a = C0025.m4795(m8283(), 0, 6, 2663);

    public static TextView b(Activity activity, View view) {
        LinearLayout.LayoutParams layoutParams;
        Drawable drawableM1633;
        TextView textView = new TextView(activity);
        C0024.m4683(textView, C0046.m7718(m8283(), 6, 13, 1103));
        C0042.m7106(textView, C0046.m7718(m8283(), 19, 4, 1306));
        if (view instanceof TextView) {
            TextView textView2 = (TextView) view;
            C0039.m6563(textView, C0024.m4666(textView2) / C0047.m7820(C0007.m1852(C0002.m1335(activity))));
            C0033.m5821(textView, C0058.m9083(textView2));
            C0024.m4681(textView, C0057.m9035(textView2));
            C0041.m6808(textView, C0013.m3153(textView2));
            C0026.m4942(textView, C0059.m9181(textView2), C0064.m9626(textView2));
            C0000.m1085(textView, C0029.m5263(textView2));
            C0053.m8415(textView, C0064.m9679(textView2));
            C0020.m4206(textView, C0058.m9076(textView2));
        }
        ViewGroup.LayoutParams layoutParamsM6774 = C0041.m6774(view);
        if (layoutParamsM6774 instanceof LinearLayout.LayoutParams) {
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParamsM6774;
            layoutParams = new LinearLayout.LayoutParams(layoutParams2);
            ViewParent viewParentM5434 = C0030.m5434(view);
            if ((viewParentM5434 instanceof LinearLayout) && C0060.m9282((LinearLayout) viewParentM5434) == 1) {
                layoutParams.topMargin = (int) ((8.0f * C0016.m3554(C0007.m1852(C0002.m1335(activity)))) + 0.5f);
            } else {
                layoutParams.topMargin = C0026.m4918(layoutParams2);
                layoutParams.bottomMargin = C0053.m8418(layoutParams2);
            }
            layoutParams.gravity = C0040.m6603(layoutParams2);
        } else {
            layoutParams = new LinearLayout.LayoutParams(C0056.m8929(layoutParamsM6774), C0054.m8577(layoutParamsM6774));
            layoutParams.leftMargin = 0;
            layoutParams.rightMargin = 0;
            layoutParams.topMargin = 0;
            layoutParams.bottomMargin = 0;
        }
        C0009.m2112(textView, layoutParams);
        C0017.m3709(textView, C0015.m3491(view), C0013.m3110(view), C0042.m7152(view), C0018.m3932(view));
        Drawable drawableM9251 = C0059.m9251(view);
        if (drawableM9251 != null) {
            Drawable.ConstantState constantStateM4905 = C0026.m4905(drawableM9251);
            if (constantStateM4905 != null) {
                drawableM1633 = C0043.m7285(constantStateM4905);
                C0040.m6669(drawableM1633, C0037.m6345(drawableM9251));
                C0038.m6431(drawableM1633, C0020.m4250(drawableM9251));
                C0018.m3963(drawableM1633, C0034.m6011(drawableM9251));
                C0054.m8621(drawableM1633, C0063.m9580(drawableM9251), true);
            } else {
                drawableM1633 = C0005.m1633(drawableM9251);
            }
            C0018.m3985(textView, drawableM1633);
            if (drawableM1633 instanceof ColorDrawable) {
                C0048.m7907(textView, C0050.m8134((ColorDrawable) drawableM1633));
            }
        } else {
            StateListDrawable stateListDrawable = new StateListDrawable();
            ShapeDrawable shapeDrawableM6215 = C0036.m6215(activity, 0, -1);
            C0036.m6185(stateListDrawable, new int[]{R.attr.state_pressed}, C0036.m6215(activity, C0042.m7113(30, 255, 255, 255), C0042.m7113(200, 255, 255, 255)));
            C0036.m6185(stateListDrawable, new int[0], shapeDrawableM6215);
            C0018.m3985(textView, stateListDrawable);
        }
        C0032.m5702(textView, C0050.m8130(view));
        C0010.m2319(textView, C0018.m3915(view));
        C0048.m7968(textView, C0014.m3389(view));
        C0040.m6682(textView, C0021.m4368(view));
        C0047.m7801(textView, C0036.m6251(view));
        C0000.m1065(textView, C0056.m8874(view));
        C0022.m4474(textView, C0014.m3283(view));
        C0053.m8441(textView, C0016.m3589(view));
        C0036.m6178(textView, C0009.m2077(view));
        C0002.m1251(textView, new ViewOnClickListenerC0303f(activity));
        return textView;
    }

    public static ShapeDrawable c(Context context, int i, int i2) {
        float fM3554 = (int) ((4.0f * C0016.m3554(C0007.m1852(C0002.m1335(context)))) + 0.5f);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{fM3554, fM3554, fM3554, fM3554, fM3554, fM3554, fM3554, fM3554}, null, null));
        Paint paintM6094 = C0035.m6094(shapeDrawable);
        C0008.m1983(paintM6094, true);
        if (i != 0) {
            C0064.m9631(paintM6094, i);
            C0064.m9606(paintM6094, C0047.m7782());
        }
        C0059.m9237(paintM6094, (int) ((1.5f * C0016.m3554(C0007.m1852(C0002.m1335(context)))) + 0.5f));
        C0064.m9631(paintM6094, i2);
        C0064.m9606(paintM6094, C0057.m9000());
        return shapeDrawable;
    }

    public static View e(View view, String str) {
        if (view == null) {
            return null;
        }
        try {
            if (C0007.m1815(str, C0001.m1225(C0034.m6008(view), C0010.m2375(view)))) {
                return view;
            }
        } catch (Exception unused) {
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < C0026.m4897(viewGroup); i++) {
                View viewM8189 = C0051.m8189(C0051.m8237(viewGroup, i), str);
                if (viewM8189 != null) {
                    return viewM8189;
                }
            }
        }
        return null;
    }

    /* renamed from: ۠۟ۨ, reason: not valid java name and contains not printable characters */
    public static short[] m8283() {
        if (C0029.m5282() > 0) {
            return f789short;
        }
        return null;
    }

    public final void a(String str) {
        this.a = str;
        Activity activityM4453 = C0022.m4453();
        if (activityM4453 == null) {
            return;
        }
        if (C0021.m4332(C0003.m1438(activityM4453)) != C0031.m5631()) {
            C0037.m6386(activityM4453, new RunnableC0301d(1, this));
        } else {
            C0018.m3901(this);
        }
    }

    public final void d() {
        View viewM2778;
        View viewM8189;
        ViewGroup viewGroup;
        View viewM8237;
        try {
            Activity activityM4453 = C0022.m4453();
            if (activityM4453 == null || (viewM2778 = C0011.m2778(activityM4453, R.id.content)) == null || (viewM8189 = C0051.m8189(viewM2778, C0063.m9522(this))) == null || (viewGroup = (ViewGroup) C0030.m5434(viewM8189)) == null) {
                return;
            }
            int i = 0;
            while (true) {
                if (i >= C0026.m4897(viewGroup)) {
                    viewM8237 = null;
                    break;
                }
                viewM8237 = C0051.m8237(viewGroup, i);
                if (C0007.m1815(C0036.m6188(m8283(), 23, 13, 3176), C0045.m7589(viewM8237))) {
                    break;
                } else {
                    i++;
                }
            }
            if (viewM8237 != null) {
                return;
            }
            C0027.m5012(viewGroup, C0059.m9222(activityM4453, viewM8189), C0051.m8253(viewGroup, viewM8189) + 1);
        } catch (Exception e) {
            C0049.m7975(e);
        }
    }
}