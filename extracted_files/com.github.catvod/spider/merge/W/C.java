package com.github.catvod.spider.merge.W;

import android.R;
import android.app.Activity;
import android.os.Handler;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.P0.C0024;
import com.github.catvod.spider.merge.S.C0027;
import com.github.catvod.spider.merge.T0.C0030;
import com.github.catvod.spider.merge.Z.C0037;
import com.github.catvod.spider.merge.Z0.C0041;
import com.github.catvod.spider.merge.d1.C0049;
import com.github.catvod.spider.merge.f1.C0053;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.merge.x0.C0063;
import com.github.catvod.spider.merge.y0.C0064;
import com.github.catvod.spider.merge.z.C0065;
import com.github.catvod.spider.p000mergexbpq.Q.C0001;
import com.github.catvod.spider.p000mergexbpq.c0.C0010;
import com.github.catvod.spider.p000mergexbpq.e0.C0011;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class C {
    public WeakReference a;
    public FrameLayout b;
    public WebView c;
    public boolean d = false;
    public boolean e = false;
    public Handler f = new Handler(C0063.m9553());
    public FrameLayout.LayoutParams g;
    public final String h;

    /* renamed from: short, reason: not valid java name */
    private static final short[] f647short = {3035, 3034, 3033, 3038, 3018, 3027, 3019, 1296, 1330, 1317, 1336, 1319, 1336, 1317, 1320, 1393, 1315, 1332, 1335, 1332, 1315, 1332, 1343, 1330, 1332, 1393, 1336, 1314, 1393, 1343, 1342, 1393, 1341, 1342, 1343, 1334, 1332, 1315, 1393, 1319, 1328, 1341, 1336, 1333};
    public static final HashMap i = new HashMap();

    public C(Activity activity, String str) {
        this.a = new WeakReference(activity);
        this.h = str;
    }

    public static synchronized C c(Activity activity) {
        C c;
        boolean zM8421;
        String strM9106 = C0058.m9106(m5912(), 0, 7, 3007);
        synchronized (C.class) {
            try {
                C c2 = (C) C0065.m9715(C0010.m2332(), strM9106);
                if (c2 != null && !(zM8421 = C0053.m8421(c2)) && !zM8421) {
                    c2.d = true;
                    C0037.m6386(C0027.m5022(c2), new y(c2, 0));
                }
                HashMap mapM2332 = C0010.m2332();
                c = (C) C0065.m9715(mapM2332, strM9106);
                if (c == null || C0053.m8421(c)) {
                    c = new C(activity, strM9106);
                    C0053.m8424(mapM2332, strM9106, c);
                } else {
                    c.a = new WeakReference(activity);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c;
    }

    /* renamed from: ۣ۟۠۠ۤ, reason: not valid java name and contains not printable characters */
    public static short[] m5912() {
        if (C0001.m1164() < 0) {
            return f647short;
        }
        return null;
    }

    public final void a() {
        try {
            FrameLayout frameLayout = (FrameLayout) C0011.m2778(C0027.m5022(this), R.id.content);
            FrameLayout frameLayoutM9644 = C0064.m9644(this);
            if (frameLayoutM9644 != null && C0030.m5434(frameLayoutM9644) != null) {
                C0018.m3892((ViewGroup) C0030.m5434(C0064.m9644(this)), C0064.m9644(this));
            }
            FrameLayout frameLayoutM96442 = C0064.m9644(this);
            if (frameLayoutM96442 != null) {
                C0041.m6790(frameLayout, frameLayoutM96442, C0024.m4664(this));
            }
        } catch (Exception e) {
            C0049.m7975(e);
        }
    }

    public final Activity b() {
        Activity activity = (Activity) C0010.m2351(C0063.m9558(this));
        if (activity != null) {
            return activity;
        }
        throw new IllegalStateException(C0041.m6779(m5912(), 7, 37, 1361));
    }
}