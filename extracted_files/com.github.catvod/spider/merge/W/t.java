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
import com.github.catvod.spider.merge.I0.C0020;
import com.github.catvod.spider.merge.K0.C0022;
import com.github.catvod.spider.merge.P0.C0024;
import com.github.catvod.spider.merge.Q0.C0026;
import com.github.catvod.spider.merge.S0.C0028;
import com.github.catvod.spider.merge.T0.C0030;
import com.github.catvod.spider.merge.V.C0032;
import com.github.catvod.spider.merge.V.C0033;
import com.github.catvod.spider.merge.Y.C0035;
import com.github.catvod.spider.merge.Z.C0037;
import com.github.catvod.spider.merge.Z0.C0041;
import com.github.catvod.spider.merge.a0.C0042;
import com.github.catvod.spider.merge.b.C0044;
import com.github.catvod.spider.merge.b0.C0045;
import com.github.catvod.spider.merge.c1.C0046;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.d1.C0050;
import com.github.catvod.spider.merge.f1.C0053;
import com.github.catvod.spider.merge.x0.C0063;
import com.github.catvod.spider.merge.y0.C0064;
import com.github.catvod.spider.merge.z.C0065;
import com.github.catvod.spider.p000mergexbpq.Q.C0000;
import com.github.catvod.spider.p000mergexbpq.Q.C0001;
import com.github.catvod.spider.p000mergexbpq.Q.C0002;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.c0.C0010;
import com.github.catvod.spider.p000mergexbpq.e0.C0011;
import com.github.catvod.spider.p000mergexbpq.x.C0015;
import com.github.catvod.spider.p000mergexbpq.x.C0016;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class t {
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
    private static final short[] f658short = {1634, 1635, 1632, 1639, 1651, 1642, 1650, 486, 452, 467, 462, 465, 462, 467, 478, 391, 469, 450, 449, 450, 469, 450, 457, 452, 450, 391, 462, 468, 391, 457, 456, 391, 459, 456, 457, 448, 450, 469, 391, 465, 454, 459, 462, 451, 1689, 1678, 1674, 1667, 1676, 1788, 1788};
    public static final HashMap k = new HashMap();

    public t(Activity activity, String str) {
        this.a = new WeakReference(activity);
        this.j = str;
    }

    public static synchronized t d(Activity activity) {
        return C0010.m2381(activity);
    }

    public static synchronized t e(Activity activity) {
        t tVar;
        boolean zM3609;
        String strM4951 = C0026.m4951(m5945(), 0, 7, 1542);
        synchronized (t.class) {
            try {
                t tVar2 = (t) C0065.m9715(C0022.m4395(), strM4951);
                if (tVar2 != null && !(zM3609 = C0016.m3609(tVar2)) && !zM3609) {
                    tVar2.g = true;
                    C0037.m6386(C0015.m3460(tVar2), new com.github.catvod.spider.merge.F.b(9, tVar2));
                }
                HashMap mapM4395 = C0022.m4395();
                tVar = (t) C0065.m9715(mapM4395, strM4951);
                if (tVar == null || C0016.m3609(tVar)) {
                    tVar = new t(activity, strM4951);
                    C0053.m8424(mapM4395, strM4951, tVar);
                } else {
                    tVar.a = new WeakReference(activity);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return tVar;
    }

    /* renamed from: ۟ۡۤۡ, reason: not valid java name and contains not printable characters */
    public static short[] m5945() {
        if (C0028.m5152() < 0) {
            return f658short;
        }
        return null;
    }

    public final void a() {
        try {
            FrameLayout frameLayout = (FrameLayout) C0011.m2778(C0015.m3460(this), R.id.content);
            WebView webViewM4737 = C0024.m4737(this);
            if (webViewM4737 != null && C0030.m5434(webViewM4737) != null) {
                C0018.m3892((ViewGroup) C0030.m5434(C0024.m4737(this)), C0024.m4737(this));
            }
            FrameLayout frameLayoutM4481 = C0022.m4481(this);
            if (frameLayoutM4481 != null && C0030.m5434(frameLayoutM4481) != null) {
                C0018.m3892((ViewGroup) C0030.m5434(C0022.m4481(this)), C0022.m4481(this));
            }
            FrameLayout frameLayoutM44812 = C0022.m4481(this);
            if (frameLayoutM44812 != null) {
                C0041.m6790(frameLayout, frameLayoutM44812, C0018.m3937(this));
            }
            WebView webViewM47372 = C0024.m4737(this);
            if (webViewM47372 == null || C0022.m4481(this) == null || C0030.m5434(webViewM47372) == C0022.m4481(this)) {
                return;
            }
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            layoutParams.bottomMargin = C0050.m8147(this, 35);
            C0041.m6790(C0022.m4481(this), C0024.m4737(this), layoutParams);
        } catch (Exception unused) {
        }
    }

    public final int b(int i) {
        return C0063.m9512(i * C0016.m3554(C0007.m1852(C0002.m1335(C0015.m3460(this)))));
    }

    public final Activity c() {
        Activity activity = (Activity) C0010.m2351(C0064.m9638(this));
        if (activity != null) {
            return activity;
        }
        throw new IllegalStateException(C0035.m6131(m5945(), 7, 37, 423));
    }

    public final void f(ImageButton imageButton, int i) {
        Drawable drawableM5748 = C0032.m5748(C0002.m1335(C0015.m3460(this)), i);
        C0001.m1142(drawableM5748, -1, C0035.m6139());
        C0044.m7400(imageButton, drawableM5748);
        C0048.m7907(imageButton, 0);
        C0016.m3608(imageButton, C0050.m8147(this, 8), C0050.m8147(this, 8), C0050.m8147(this, 8), C0050.m8147(this, 8));
        C0028.m5147(imageButton, C0046.m7705());
    }

    public final void g() {
        Activity activityM3460 = C0015.m3460(this);
        FrameLayout frameLayout = new FrameLayout(activityM3460);
        this.f = frameLayout;
        C0048.m7907(frameLayout, C0000.m1044(C0042.m7151(m5945(), 44, 7, 1722)));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, C0050.m8147(this, 35));
        layoutParams.gravity = 80;
        C0041.m6790(C0022.m4481(this), C0065.m9799(this), layoutParams);
        ImageButton imageButton = new ImageButton(activityM3460);
        this.d = imageButton;
        C0020.m4242(this, imageButton, R.drawable.ic_menu_revert);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(C0050.m8147(this, 25), C0050.m8147(this, 25));
        layoutParams2.gravity = 8388627;
        layoutParams2.leftMargin = C0050.m8147(this, 16);
        C0041.m6790(C0065.m9799(this), C0045.m7544(this), layoutParams2);
        ImageButton imageButton2 = new ImageButton(activityM3460);
        this.e = imageButton2;
        C0020.m4242(this, imageButton2, R.drawable.ic_menu_close_clear_cancel);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(C0050.m8147(this, 25), C0050.m8147(this, 25));
        layoutParams3.gravity = 8388629;
        layoutParams3.rightMargin = C0050.m8147(this, 16);
        C0041.m6790(C0065.m9799(this), C0033.m5808(this), layoutParams3);
        C0002.m1251(C0045.m7544(this), new r(this, 0));
        C0002.m1251(C0033.m5808(this), new r(this, 1));
    }
}