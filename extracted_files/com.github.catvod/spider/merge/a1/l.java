package com.github.catvod.spider.merge.a1;

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
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.merge.C.C0017;
import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.I0.C0020;
import com.github.catvod.spider.merge.K0.C0022;
import com.github.catvod.spider.merge.N.C0023;
import com.github.catvod.spider.merge.P0.C0024;
import com.github.catvod.spider.merge.Q0.C0026;
import com.github.catvod.spider.merge.S.C0027;
import com.github.catvod.spider.merge.S0.C0028;
import com.github.catvod.spider.merge.T0.C0030;
import com.github.catvod.spider.merge.W.C0034;
import com.github.catvod.spider.merge.Y.C0035;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.Z.C0039;
import com.github.catvod.spider.merge.Z0.C0041;
import com.github.catvod.spider.merge.a0.C0042;
import com.github.catvod.spider.merge.b0.C0045;
import com.github.catvod.spider.merge.c1.C0046;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.d1.C0049;
import com.github.catvod.spider.merge.d1.C0050;
import com.github.catvod.spider.merge.f.C0051;
import com.github.catvod.spider.merge.f0.ViewOnClickListenerC0299b;
import com.github.catvod.spider.merge.o0.C0056;
import com.github.catvod.spider.merge.p.C0057;
import com.github.catvod.spider.merge.r0.C0059;
import com.github.catvod.spider.merge.r0.C0060;
import com.github.catvod.spider.merge.y0.C0064;
import com.github.catvod.spider.merge.z.C0065;
import com.github.catvod.spider.p000mergexbpq.Q.C0001;
import com.github.catvod.spider.p000mergexbpq.Q.C0002;
import com.github.catvod.spider.p000mergexbpq.S.C0005;
import com.github.catvod.spider.p000mergexbpq.a0.C0006;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.b0.C0008;
import com.github.catvod.spider.p000mergexbpq.c.C0009;
import com.github.catvod.spider.p000mergexbpq.c0.C0010;
import com.github.catvod.spider.p000mergexbpq.e0.C0011;
import com.github.catvod.spider.p000mergexbpq.j.C0013;
import com.github.catvod.spider.p000mergexbpq.x.C0016;

/* loaded from: classes.dex */
public abstract class l {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f743short = {804, 818, 822, 805, 820, 831, 776, 821, 802, 803, 803, 824, 825, 28586, 28250, -28763, 20637, 18521, 31769, 28209, 27493, 23339, 2431, 2426, 2421, 2422, 2414, 2376, 2430, 2415, 2415, 2418, 2421, 2428, 30687, 18413, 661, 656, 671, 668, 644, 674, 660, 645, 645, 664, 671, 662, 28240, 26104, 28871, 22856, 21657, 3020, 3034, 3038, 3021, 3036, 3031, 3040, 3037, 3018, 3019, 3019, 3024, 3025, 27782, 30136, 27539, -25548, 21864, 21442, 24498, 28303, 30641, 27034, -25027, 22369, 26755, 22540, 26472, 22579, -2661, -30898, 29480, 22236, 21702, 22389, 17716, -2679, 2721, 2722, 2749, 2723, 2807, 2787, -2662, 26693, 22302, 24994, 30876, 26295, -28400, 23695, -30565, -1372, 2191, 2186, 2181, 2182, 2206, 2232, 2190, 2207, 2207, 2178, 2181, 2188};

    public static TextView a(Activity activity, int i, ViewGroup.LayoutParams layoutParams) {
        TextView textView = new TextView(activity);
        C0024.m4683(textView, C0046.m7718(m7264(), 0, 13, 855));
        C0042.m7106(textView, C0046.m7718(m7264(), 13, 1, 2998));
        C0039.m6563(textView, 12.0f);
        C0026.m4878(textView, -1);
        C0024.m4681(textView, 17);
        StateListDrawable stateListDrawable = new StateListDrawable();
        ShapeDrawable shapeDrawableM3133 = C0013.m3133(activity, 0, -1);
        C0036.m6185(stateListDrawable, new int[]{R.attr.state_pressed}, C0013.m3133(activity, C0042.m7113(30, 255, 255, 255), C0042.m7113(200, 255, 255, 255)));
        C0036.m6185(stateListDrawable, new int[0], shapeDrawableM3133);
        C0049.m8037(stateListDrawable, 200);
        C0028.m5126(stateListDrawable, 200);
        C0018.m3985(textView, stateListDrawable);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(C0011.m2799(activity, 21.0f), C0011.m2799(activity, 18.0f));
        layoutParams2.gravity = 3;
        layoutParams2.leftMargin = i;
        layoutParams2.topMargin = C0011.m2799(activity, 8.0f);
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            layoutParams2.rightMargin = C0043.m7361((LinearLayout.LayoutParams) layoutParams);
        }
        C0009.m2112(textView, layoutParams2);
        C0048.m7968(textView, true);
        C0047.m7801(textView, true);
        C0002.m1251(textView, new ViewOnClickListenerC0299b(activity, 0));
        return textView;
    }

    public static ShapeDrawable b(Context context, int i, int i2) {
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{C0011.m2799(context, 8.0f), C0011.m2799(context, 8.0f), C0011.m2799(context, 8.0f), C0011.m2799(context, 8.0f), C0011.m2799(context, 8.0f), C0011.m2799(context, 8.0f), C0011.m2799(context, 8.0f), C0011.m2799(context, 8.0f)}, null, null));
        Paint paintM6094 = C0035.m6094(shapeDrawable);
        C0008.m1983(paintM6094, true);
        if (i != 0) {
            C0064.m9631(paintM6094, i);
            C0064.m9606(paintM6094, C0047.m7782());
        }
        C0059.m9237(paintM6094, C0011.m2799(context, 1.5f));
        C0064.m9631(paintM6094, i2);
        C0064.m9606(paintM6094, C0057.m9000());
        return shapeDrawable;
    }

    public static int c(Context context, float f) {
        return (int) ((f * C0016.m3554(C0007.m1852(C0002.m1335(context)))) + 0.5f);
    }

    public static void d() {
        View viewM8237;
        try {
            Activity activityM4453 = C0022.m4453();
            if (activityM4453 == null) {
                return;
            }
            View viewM2778 = C0011.m2778(activityM4453, R.id.content);
            if (viewM2778 == null) {
                m7265(C0023.m4536(m7264(), 14, 5, 1635));
                return;
            }
            View viewM8937 = C0056.m8937(viewM2778);
            if (viewM8937 == null) {
                m7265(C0050.m8131(m7264(), 19, 17, 2331));
                return;
            }
            ViewGroup viewGroup = (ViewGroup) C0030.m5434(viewM8937);
            if (viewGroup == null) {
                m7265(C0005.m1645(m7264(), 36, 17, 753));
                return;
            }
            int i = 0;
            while (true) {
                if (i >= C0026.m4897(viewGroup)) {
                    viewM8237 = null;
                    break;
                }
                viewM8237 = C0051.m8237(viewGroup, i);
                if (C0007.m1815(C0020.m4199(m7264(), 53, 13, 3007), C0045.m7589(viewM8237))) {
                    break;
                } else {
                    i++;
                }
            }
            if (viewM8237 != null) {
                m7265(C0050.m8131(m7264(), 66, 7, 2202));
                return;
            }
            int iM2799 = C0011.m2799(activityM4453, 21.0f);
            int[] iArr = new int[2];
            C0001.m1195(viewGroup, iArr);
            C0027.m5012(viewGroup, C0006.m1709(activityM4453, C0008.m1965(iM2799 - iArr[0], 0), C0041.m6774(viewM8937)), C0051.m8253(viewGroup, viewM8937) + 1);
            m7265(C0060.m9352(m7264(), 73, 24, 2707));
        } catch (Exception e) {
            C0049.m7975(e);
            C0043.m7366(e, new StringBuilder(C0017.m3646(m7264(), 97, 9, 1470)));
        }
    }

    public static View e(View view) {
        String strM9775 = C0065.m9775(m7264(), 106, 12, 2283);
        if (view == null) {
            return null;
        }
        try {
            if (C0007.m1815(strM9775, C0001.m1225(C0034.m6008(view), C0010.m2375(view)))) {
                return view;
            }
        } catch (Exception unused) {
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < C0026.m4897(viewGroup); i++) {
                View viewM8937 = C0056.m8937(C0051.m8237(viewGroup, i));
                if (viewM8937 != null) {
                    return viewM8937;
                }
            }
        }
        return null;
    }

    /* renamed from: ۣ۟ۡ۠۠, reason: not valid java name and contains not printable characters */
    public static short[] m7264() {
        if (C0016.m3596() <= 0) {
            return f743short;
        }
        return null;
    }

    /* renamed from: ۠ۤۨ, reason: not valid java name and contains not printable characters */
    public static void m7265(Object obj) {
        if (C0042.m7147() < 0) {
            SpiderDebug.log((String) obj);
        }
    }
}