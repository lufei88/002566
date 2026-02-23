package com.github.catvod.spider.merge.W;

import android.R;
import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import com.github.catvod.spider.merge.C.C0017;
import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.G.C0019;
import com.github.catvod.spider.merge.S0.C0028;
import com.github.catvod.spider.merge.T0.C0030;
import com.github.catvod.spider.merge.V.C0032;
import com.github.catvod.spider.merge.V.C0033;
import com.github.catvod.spider.merge.Y.C0035;
import com.github.catvod.spider.merge.Z.C0037;
import com.github.catvod.spider.merge.Z.C0039;
import com.github.catvod.spider.merge.Z0.C0041;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.b.C0044;
import com.github.catvod.spider.merge.c1.C0046;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.d1.C0050;
import com.github.catvod.spider.merge.f0.C0052;
import com.github.catvod.spider.merge.f1.C0053;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.merge.x0.C0063;
import com.github.catvod.spider.merge.z.C0065;
import com.github.catvod.spider.p000mergexbpq.Q.C0000;
import com.github.catvod.spider.p000mergexbpq.Q.C0001;
import com.github.catvod.spider.p000mergexbpq.Q.C0002;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.c0.C0010;
import com.github.catvod.spider.p000mergexbpq.e0.C0011;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import com.github.catvod.spider.p000mergexbpq.j.C0013;
import com.github.catvod.spider.p000mergexbpq.x.C0016;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class w {
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
    private static final short[] f660short = {2545, 2544, 2547, 2548, 2528, 2553, 2529, 558, 524, 539, 518, 537, 518, 539, 534, 591, 541, 522, 521, 522, 541, 522, 513, 524, 522, 591, 518, 540, 591, 513, 512, 591, 515, 512, 513, 520, 522, 541, 591, 537, 526, 515, 518, 523, 360, 383, 379, 370, 381, 269, 269};
    public static final HashMap k = new HashMap();

    public w(Activity activity, String str) {
        this.a = new WeakReference(activity);
        this.j = str;
    }

    public static synchronized w d(Activity activity) {
        return C0034.m6040(activity);
    }

    public static synchronized w e(Activity activity) {
        w wVar;
        boolean zM3520;
        String strM3646 = C0017.m3646(m5947(), 0, 7, 2453);
        synchronized (w.class) {
            try {
                w wVar2 = (w) C0065.m9715(C0033.m5817(), strM3646);
                if (wVar2 != null && !(zM3520 = C0016.m3520(wVar2)) && !zM3520) {
                    wVar2.g = true;
                    C0037.m6386(C0028.m5173(wVar2), new com.github.catvod.spider.merge.F.b(10, wVar2));
                }
                HashMap mapM5817 = C0033.m5817();
                wVar = (w) C0065.m9715(mapM5817, strM3646);
                if (wVar == null || C0016.m3520(wVar)) {
                    wVar = new w(activity, strM3646);
                    C0053.m8424(mapM5817, strM3646, wVar);
                } else {
                    wVar.a = new WeakReference(activity);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return wVar;
    }

    /* renamed from: ۨ۟ۦ, reason: not valid java name and contains not printable characters */
    public static short[] m5947() {
        if (C0052.m8320() >= 0) {
            return f660short;
        }
        return null;
    }

    public final void a() {
        try {
            FrameLayout frameLayout = (FrameLayout) C0011.m2778(C0028.m5173(this), R.id.content);
            WebView webViewM8150 = C0050.m8150(this);
            if (webViewM8150 != null && C0030.m5434(webViewM8150) != null) {
                C0018.m3892((ViewGroup) C0030.m5434(C0050.m8150(this)), C0050.m8150(this));
            }
            FrameLayout frameLayoutM1196 = C0001.m1196(this);
            if (frameLayoutM1196 != null && C0030.m5434(frameLayoutM1196) != null) {
                C0018.m3892((ViewGroup) C0030.m5434(C0001.m1196(this)), C0001.m1196(this));
            }
            FrameLayout frameLayoutM11962 = C0001.m1196(this);
            if (frameLayoutM11962 != null) {
                C0041.m6790(frameLayout, frameLayoutM11962, C0013.m3179(this));
            }
            WebView webViewM81502 = C0050.m8150(this);
            if (webViewM81502 == null || C0001.m1196(this) == null || C0030.m5434(webViewM81502) == C0001.m1196(this)) {
                return;
            }
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            layoutParams.bottomMargin = C0019.m4111(this, 35);
            C0041.m6790(C0001.m1196(this), C0050.m8150(this), layoutParams);
        } catch (Exception unused) {
        }
    }

    public final int b(int i) {
        return C0063.m9512(i * C0016.m3554(C0007.m1852(C0002.m1335(C0028.m5173(this)))));
    }

    public final Activity c() {
        Activity activity = (Activity) C0010.m2351(C0041.m6824(this));
        if (activity != null) {
            return activity;
        }
        throw new IllegalStateException(C0012.m2973(m5947(), 7, 37, 623));
    }

    public final void f(ImageButton imageButton, int i) {
        Drawable drawableM5748 = C0032.m5748(C0002.m1335(C0028.m5173(this)), i);
        C0001.m1142(drawableM5748, -1, C0035.m6139());
        C0044.m7400(imageButton, drawableM5748);
        C0048.m7907(imageButton, 0);
        C0016.m3608(imageButton, C0019.m4111(this, 8), C0019.m4111(this, 8), C0019.m4111(this, 8), C0019.m4111(this, 8));
        C0028.m5147(imageButton, C0046.m7705());
    }

    public final void g() {
        Activity activityM5173 = C0028.m5173(this);
        FrameLayout frameLayout = new FrameLayout(activityM5173);
        this.f = frameLayout;
        C0048.m7907(frameLayout, C0000.m1044(C0043.m7290(m5947(), 44, 7, 331)));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, C0019.m4111(this, 35));
        layoutParams.gravity = 80;
        C0041.m6790(C0001.m1196(this), C0002.m1310(this), layoutParams);
        ImageButton imageButton = new ImageButton(activityM5173);
        this.d = imageButton;
        C0058.m9062(this, imageButton, R.drawable.ic_menu_revert);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(C0019.m4111(this, 25), C0019.m4111(this, 25));
        layoutParams2.gravity = 8388627;
        layoutParams2.leftMargin = C0019.m4111(this, 16);
        C0041.m6790(C0002.m1310(this), C0039.m6568(this), layoutParams2);
        ImageButton imageButton2 = new ImageButton(activityM5173);
        this.e = imageButton2;
        C0058.m9062(this, imageButton2, R.drawable.ic_menu_close_clear_cancel);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(C0019.m4111(this, 25), C0019.m4111(this, 25));
        layoutParams3.gravity = 8388629;
        layoutParams3.rightMargin = C0019.m4111(this, 16);
        C0041.m6790(C0002.m1310(this), C0019.m4055(this), layoutParams3);
        C0002.m1251(C0039.m6568(this), new u(this, 0));
        C0002.m1251(C0019.m4055(this), new u(this, 1));
    }
}