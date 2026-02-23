package com.github.catvod.spider.merge.f0;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.StateListDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.K0.C0022;
import com.github.catvod.spider.merge.P0.C0024;
import com.github.catvod.spider.merge.Q0.C0026;
import com.github.catvod.spider.merge.S.C0027;
import com.github.catvod.spider.merge.S0.C0028;
import com.github.catvod.spider.merge.T0.C0030;
import com.github.catvod.spider.merge.W.C0034;
import com.github.catvod.spider.merge.Y.C0035;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.Z.C0039;
import com.github.catvod.spider.merge.Z.C0040;
import com.github.catvod.spider.merge.Z0.C0041;
import com.github.catvod.spider.merge.a0.C0042;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.b0.C0045;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.d1.C0049;
import com.github.catvod.spider.merge.f.C0051;
import com.github.catvod.spider.merge.i0.C0055;
import com.github.catvod.spider.merge.o0.C0056;
import com.github.catvod.spider.merge.p.C0057;
import com.github.catvod.spider.merge.r0.C0059;
import com.github.catvod.spider.merge.v.C0062;
import com.github.catvod.spider.merge.y0.C0064;
import com.github.catvod.spider.p000mergexbpq.Q.C0001;
import com.github.catvod.spider.p000mergexbpq.Q.C0002;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.b0.C0008;
import com.github.catvod.spider.p000mergexbpq.c.C0009;
import com.github.catvod.spider.p000mergexbpq.c0.C0010;
import com.github.catvod.spider.p000mergexbpq.e0.C0011;
import com.github.catvod.spider.p000mergexbpq.x.C0015;
import com.github.catvod.spider.p000mergexbpq.x.C0016;

/* renamed from: com.github.catvod.spider.merge.f0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0302e implements com.github.catvod.spider.merge.e1.a {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f787short = {1811, 1797, 1793, 1810, 1795, 1800, 1855, 1794, 1813, 1812, 1812, 1807, 1806, 25200, 2784, 2806, 2802, 2785, 2800, 2811, 2764, 2801, 2790, 2791, 2791, 2812, 2813, 1776, 1781, 1786, 1785, 1761, 1735, 1777, 1760, 1760, 1789, 1786, 1779};

    public C0302e() {
        new ThreadLocal();
        new com.github.catvod.spider.merge.g1.a();
    }

    public /* synthetic */ C0302e(boolean z) {
    }

    public static TextView b(Activity activity, int i, ViewGroup.LayoutParams layoutParams) {
        TextView textView = new TextView(activity);
        C0024.m4683(textView, C0042.m7151(m8281(), 0, 13, 1888));
        C0042.m7106(textView, C0026.m4951(m8281(), 13, 1, 1644));
        C0039.m6563(textView, 12.0f);
        C0026.m4878(textView, -1);
        C0024.m4681(textView, 17);
        StateListDrawable stateListDrawable = new StateListDrawable();
        ShapeDrawable shapeDrawableM3483 = C0015.m3483(activity, 0, -1);
        C0036.m6185(stateListDrawable, new int[]{R.attr.state_pressed}, C0015.m3483(activity, C0042.m7113(30, 255, 255, 255), C0042.m7113(200, 255, 255, 255)));
        C0036.m6185(stateListDrawable, new int[0], shapeDrawableM3483);
        C0049.m8037(stateListDrawable, 200);
        C0028.m5126(stateListDrawable, 200);
        C0018.m3985(textView, stateListDrawable);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(C0056.m8888(activity, 21.0f), C0056.m8888(activity, 18.0f));
        layoutParams2.gravity = 3;
        layoutParams2.leftMargin = i;
        layoutParams2.topMargin = C0056.m8888(activity, 8.0f);
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            layoutParams2.rightMargin = C0043.m7361((LinearLayout.LayoutParams) layoutParams);
        }
        C0009.m2112(textView, layoutParams2);
        C0048.m7968(textView, true);
        C0047.m7801(textView, true);
        C0002.m1251(textView, new ViewOnClickListenerC0299b(activity, 1));
        return textView;
    }

    public static ShapeDrawable c(Context context, int i, int i2) {
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{C0056.m8888(context, 8.0f), C0056.m8888(context, 8.0f), C0056.m8888(context, 8.0f), C0056.m8888(context, 8.0f), C0056.m8888(context, 8.0f), C0056.m8888(context, 8.0f), C0056.m8888(context, 8.0f), C0056.m8888(context, 8.0f)}, null, null));
        Paint paintM6094 = C0035.m6094(shapeDrawable);
        C0008.m1983(paintM6094, true);
        if (i != 0) {
            C0064.m9631(paintM6094, i);
            C0064.m9606(paintM6094, C0047.m7782());
        }
        C0059.m9237(paintM6094, C0056.m8888(context, 1.5f));
        C0064.m9631(paintM6094, i2);
        C0064.m9606(paintM6094, C0057.m9000());
        return shapeDrawable;
    }

    public static int d(Context context, float f) {
        return (int) ((f * C0016.m3554(C0007.m1852(C0002.m1335(context)))) + 0.5f);
    }

    public static void e() {
        View viewM2778;
        View viewM9401;
        ViewGroup viewGroup;
        View viewM8237;
        try {
            Activity activityM4453 = C0022.m4453();
            if (activityM4453 == null || (viewM2778 = C0011.m2778(activityM4453, R.id.content)) == null || (viewM9401 = C0062.m9401(viewM2778)) == null || (viewGroup = (ViewGroup) C0030.m5434(viewM9401)) == null) {
                return;
            }
            int i = 0;
            while (true) {
                if (i >= C0026.m4897(viewGroup)) {
                    viewM8237 = null;
                    break;
                }
                viewM8237 = C0051.m8237(viewGroup, i);
                if (C0007.m1815(C0048.m7902(m8281(), 14, 13, 2707), C0045.m7589(viewM8237))) {
                    break;
                } else {
                    i++;
                }
            }
            if (viewM8237 != null) {
                return;
            }
            int iM8888 = C0056.m8888(activityM4453, 21.0f);
            int[] iArr = new int[2];
            C0001.m1195(viewGroup, iArr);
            C0027.m5012(viewGroup, C0055.m8750(activityM4453, C0008.m1965(iM8888 - iArr[0], 0), C0041.m6774(viewM9401)), C0051.m8253(viewGroup, viewM9401) + 1);
        } catch (Exception e) {
            C0049.m7975(e);
        }
    }

    public static View f(View view) {
        String strM1970 = C0008.m1970(m8281(), 27, 12, 1684);
        if (view == null) {
            return null;
        }
        try {
            if (C0007.m1815(strM1970, C0001.m1225(C0034.m6008(view), C0010.m2375(view)))) {
                return view;
            }
        } catch (Exception unused) {
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < C0026.m4897(viewGroup); i++) {
                View viewM9401 = C0062.m9401(C0051.m8237(viewGroup, i));
                if (viewM9401 != null) {
                    return viewM9401;
                }
            }
        }
        return null;
    }

    /* renamed from: ۟۟ۦۤۦ, reason: not valid java name and contains not printable characters */
    public static short[] m8281() {
        if (C0040.m6582() >= 0) {
            return f787short;
        }
        return null;
    }

    @Override // com.github.catvod.spider.merge.e1.a
    public com.github.catvod.spider.merge.e1.b a(String str) {
        return C0034.m6014();
    }
}