package com.github.catvod.spider.merge.W;

import android.R;
import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.K0.C0022;
import com.github.catvod.spider.merge.S0.C0028;
import com.github.catvod.spider.merge.T0.C0030;
import com.github.catvod.spider.merge.V.C0032;
import com.github.catvod.spider.merge.Y.C0035;
import com.github.catvod.spider.merge.Z.C0037;
import com.github.catvod.spider.merge.Z0.C0041;
import com.github.catvod.spider.merge.b.C0044;
import com.github.catvod.spider.merge.c1.C0046;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.d1.C0050;
import com.github.catvod.spider.merge.f1.C0053;
import com.github.catvod.spider.merge.i0.C0055;
import com.github.catvod.spider.merge.r0.C0060;
import com.github.catvod.spider.merge.x0.C0063;
import com.github.catvod.spider.merge.y0.C0064;
import com.github.catvod.spider.merge.z.C0065;
import com.github.catvod.spider.p000mergexbpq.Q.C0000;
import com.github.catvod.spider.p000mergexbpq.Q.C0001;
import com.github.catvod.spider.p000mergexbpq.Q.C0002;
import com.github.catvod.spider.p000mergexbpq.a0.C0006;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.c0.C0010;
import com.github.catvod.spider.p000mergexbpq.e0.C0011;
import com.github.catvod.spider.p000mergexbpq.x.C0015;
import com.github.catvod.spider.p000mergexbpq.x.C0016;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class q {
    public WeakReference a;
    public FrameLayout b;
    public WebView c;
    public ImageButton d;
    public ImageButton e;
    public FrameLayout f;
    public boolean g = false;
    public Handler h = new Handler(C0063.m9553());
    public FrameLayout.LayoutParams i;
    public final String j;

    /* renamed from: short, reason: not valid java name */
    private static final short[] f656short = {1433, 1432, 1435, 1436, 1416, 1425, 1417, 2659, 2625, 2646, 2635, 2644, 2635, 2646, 2651, 2562, 2640, 2631, 2628, 2631, 2640, 2631, 2636, 2625, 2631, 2562, 2635, 2641, 2562, 2636, 2637, 2562, 2638, 2637, 2636, 2629, 2631, 2640, 2562, 2644, 2627, 2638, 2635, 2630, 839, 848, 852, 861, 850, 802, 802};
    public static final HashMap k = new HashMap();

    public q(Activity activity, String str) {
        this.a = new WeakReference(activity);
        this.j = str;
    }

    public static synchronized q d(Activity activity) {
        return C0006.m1745(activity);
    }

    public static synchronized q e(Activity activity) {
        q qVar;
        boolean zM5191;
        String strM8814 = C0055.m8814(m5942(), 0, 7, 1533);
        synchronized (q.class) {
            try {
                q qVar2 = (q) C0065.m9715(C0015.m3479(), strM8814);
                if (qVar2 != null && !(zM5191 = C0028.m5191(qVar2)) && !zM5191) {
                    qVar2.g = true;
                    C0037.m6386(C0001.m1234(qVar2), new com.github.catvod.spider.merge.F.b(8, qVar2));
                }
                HashMap mapM3479 = C0015.m3479();
                qVar = (q) C0065.m9715(mapM3479, strM8814);
                if (qVar == null || C0028.m5191(qVar)) {
                    qVar = new q(activity, strM8814);
                    C0053.m8424(mapM3479, strM8814, qVar);
                } else {
                    qVar.a = new WeakReference(activity);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return qVar;
    }

    /* renamed from: ۡۤ, reason: not valid java name and contains not printable characters */
    public static short[] m5942() {
        if (C0032.m5686() <= 0) {
            return f656short;
        }
        return null;
    }

    public final void a() {
        try {
            FrameLayout frameLayout = (FrameLayout) C0011.m2778(C0001.m1234(this), R.id.content);
            WebView webViewM9749 = C0065.m9749(this);
            if (webViewM9749 != null && C0030.m5434(webViewM9749) != null) {
                C0018.m3892((ViewGroup) C0030.m5434(C0065.m9749(this)), C0065.m9749(this));
            }
            FrameLayout frameLayoutM9342 = C0060.m9342(this);
            if (frameLayoutM9342 != null && C0030.m5434(frameLayoutM9342) != null) {
                C0018.m3892((ViewGroup) C0030.m5434(C0060.m9342(this)), C0060.m9342(this));
            }
            FrameLayout frameLayoutM93422 = C0060.m9342(this);
            if (frameLayoutM93422 != null) {
                C0041.m6790(frameLayout, frameLayoutM93422, C0001.m1172(this));
            }
            WebView webViewM97492 = C0065.m9749(this);
            if (webViewM97492 == null || C0060.m9342(this) == null || C0030.m5434(webViewM97492) == C0060.m9342(this)) {
                return;
            }
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            layoutParams.bottomMargin = C0037.m6338(this, 35);
            C0041.m6790(C0060.m9342(this), C0065.m9749(this), layoutParams);
        } catch (Exception unused) {
        }
    }

    public final int b(int i) {
        return C0063.m9512(i * C0016.m3554(C0007.m1852(C0002.m1335(C0001.m1234(this)))));
    }

    public final Activity c() {
        Activity activity = (Activity) C0010.m2351(C0022.m4488(this));
        if (activity != null) {
            return activity;
        }
        throw new IllegalStateException(C0016.m3525(m5942(), 7, 37, 2594));
    }

    public final void f(ImageButton imageButton, int i) {
        Drawable drawableM5748 = C0032.m5748(C0002.m1335(C0001.m1234(this)), i);
        C0001.m1142(drawableM5748, -1, C0035.m6139());
        C0044.m7400(imageButton, drawableM5748);
        C0048.m7907(imageButton, 0);
        C0016.m3608(imageButton, C0037.m6338(this, 8), C0037.m6338(this, 8), C0037.m6338(this, 8), C0037.m6338(this, 8));
        C0028.m5147(imageButton, C0046.m7705());
    }

    public final void g() {
        Activity activityM1234 = C0001.m1234(this);
        FrameLayout frameLayout = new FrameLayout(activityM1234);
        this.f = frameLayout;
        C0048.m7907(frameLayout, C0000.m1044(C0047.m7833(m5942(), 44, 7, 868)));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, C0037.m6338(this, 35));
        layoutParams.gravity = 80;
        C0041.m6790(C0060.m9342(this), C0010.m2325(this), layoutParams);
        ImageButton imageButton = new ImageButton(activityM1234);
        this.d = imageButton;
        C0063.m9595(this, imageButton, R.drawable.ic_menu_revert);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(C0037.m6338(this, 25), C0037.m6338(this, 25));
        layoutParams2.gravity = 8388627;
        layoutParams2.leftMargin = C0037.m6338(this, 16);
        C0041.m6790(C0010.m2325(this), C0064.m9664(this), layoutParams2);
        ImageButton imageButton2 = new ImageButton(activityM1234);
        this.e = imageButton2;
        C0063.m9595(this, imageButton2, R.drawable.ic_menu_close_clear_cancel);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(C0037.m6338(this, 25), C0037.m6338(this, 25));
        layoutParams3.gravity = 8388629;
        layoutParams3.rightMargin = C0037.m6338(this, 16);
        C0041.m6790(C0010.m2325(this), C0050.m8068(this), layoutParams3);
        C0002.m1251(C0064.m9664(this), new o(this, 0));
        C0002.m1251(C0050.m8068(this), new o(this, 1));
    }
}