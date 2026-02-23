package com.github.catvod.spider.merge.W;

import android.app.Activity;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.github.catvod.spider.merge.G.C0019;
import com.github.catvod.spider.merge.I0.C0020;
import com.github.catvod.spider.merge.K0.C0022;
import com.github.catvod.spider.merge.T0.C0030;
import com.github.catvod.spider.merge.V.C0033;
import com.github.catvod.spider.merge.Y.C0035;
import com.github.catvod.spider.merge.Z.C0037;
import com.github.catvod.spider.merge.Z.C0040;
import com.github.catvod.spider.merge.a0.C0042;
import com.github.catvod.spider.merge.b.C0044;
import com.github.catvod.spider.merge.b0.C0045;
import com.github.catvod.spider.merge.d1.C0050;
import com.github.catvod.spider.merge.e0.C0285d;
import com.github.catvod.spider.merge.e0.C0288g;
import com.github.catvod.spider.merge.e0.RunnableC0282a;
import com.github.catvod.spider.merge.f0.C0052;
import com.github.catvod.spider.merge.i0.C0055;
import com.github.catvod.spider.merge.p.C0057;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.merge.r0.C0060;
import com.github.catvod.spider.merge.v.C0062;
import com.github.catvod.spider.merge.y0.C0064;
import com.github.catvod.spider.p000mergexbpq.Q.C0000;
import com.github.catvod.spider.p000mergexbpq.Q.C0001;
import com.github.catvod.spider.p000mergexbpq.a0.C0006;
import com.github.catvod.spider.p000mergexbpq.c0.C0010;
import com.github.catvod.spider.p000mergexbpq.r.C0014;
import com.github.catvod.spider.p000mergexbpq.x.C0016;

/* loaded from: classes.dex */
public final /* synthetic */ class k implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ k(int i, Object obj) {
        this.a = i;
        this.c = obj;
        this.b = false;
    }

    public /* synthetic */ k(C c) {
        this.a = 4;
        this.c = c;
        this.b = true;
    }

    public /* synthetic */ k(C0288g c0288g, Activity activity, boolean z, float f, float f2) {
        this.a = 5;
        this.c = c0288g;
        this.b = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        FrameLayout frameLayoutM1156;
        int i;
        FrameLayout frameLayoutM9342;
        int i2;
        FrameLayout frameLayoutM4481;
        int i3;
        FrameLayout frameLayoutM1196;
        int i4;
        switch (C0060.m9303(this)) {
            case 0:
                x xVar = (x) C0044.m7468(this);
                if (C0010.m2282(this)) {
                    if (C0030.m5434(C0001.m1156(xVar)) == null) {
                        C0033.m5837(xVar);
                    }
                    frameLayoutM1156 = C0001.m1156(xVar);
                    i = 0;
                } else {
                    frameLayoutM1156 = C0001.m1156(xVar);
                    i = 8;
                }
                C0010.m2319(frameLayoutM1156, i);
                break;
            case 1:
                q qVar = (q) C0044.m7468(this);
                if (C0010.m2282(this)) {
                    if (C0030.m5434(C0060.m9342(qVar)) == null) {
                        C0052.m8294(qVar);
                    }
                    frameLayoutM9342 = C0060.m9342(qVar);
                    i2 = 0;
                } else {
                    frameLayoutM9342 = C0060.m9342(qVar);
                    i2 = 8;
                }
                C0010.m2319(frameLayoutM9342, i2);
                break;
            case 2:
                t tVar = (t) C0044.m7468(this);
                if (C0010.m2282(this)) {
                    if (C0030.m5434(C0022.m4481(tVar)) == null) {
                        C0014.m3377(tVar);
                    }
                    frameLayoutM4481 = C0022.m4481(tVar);
                    i3 = 0;
                } else {
                    frameLayoutM4481 = C0022.m4481(tVar);
                    i3 = 8;
                }
                C0010.m2319(frameLayoutM4481, i3);
                break;
            case 3:
                w wVar = (w) C0044.m7468(this);
                if (C0010.m2282(this)) {
                    if (C0030.m5434(C0001.m1196(wVar)) == null) {
                        C0019.m4080(wVar);
                    }
                    frameLayoutM1196 = C0001.m1196(wVar);
                    i4 = 0;
                } else {
                    frameLayoutM1196 = C0001.m1196(wVar);
                    i4 = 8;
                }
                C0010.m2319(frameLayoutM1196, i4);
                break;
            case 4:
                C c = (C) C0044.m7468(this);
                WebSettings webSettingsM8148 = C0050.m8148(C0045.m7622(c));
                C0044.m7416(webSettingsM8148, true);
                C0042.m7175(webSettingsM8148, true);
                if (!C0010.m2282(this)) {
                    C0010.m2319(C0064.m9644(c), 8);
                    WebView webViewM7622 = C0045.m7622(c);
                    if (webViewM7622 != null) {
                        C0042.m7131(webViewM7622);
                        C0020.m4283(C0045.m7622(c));
                        c.e = true;
                        break;
                    }
                } else {
                    if (C0030.m5434(C0064.m9644(c)) == null) {
                        C0035.m6116(c);
                    }
                    C0010.m2319(C0064.m9644(c), 0);
                    WebView webViewM76222 = C0045.m7622(c);
                    if (webViewM76222 != null) {
                        if (C0058.m9090(c)) {
                            C0052.m8380(webViewM76222);
                            C0016.m3548(C0045.m7622(c));
                            c.e = false;
                        }
                        C0040.m6677(C0045.m7622(c));
                        break;
                    }
                }
                break;
            default:
                C0288g c0288g = (C0288g) C0044.m7468(this);
                C0285d c0285dM8766 = C0055.m8766(c0288g);
                if (c0285dM8766 == null || C0030.m5434(c0285dM8766) == null) {
                    WebView webViewM1741 = C0006.m1741();
                    C0000.m1127(c0288g, webViewM1741 != null ? C0044.m7510(webViewM1741) : C0057.m8981());
                }
                if (C0055.m8766(c0288g) != null) {
                    Activity activityM9446 = C0062.m9446(c0288g);
                    C0037.m6386(activityM9446, new RunnableC0282a(c0288g, C0010.m2282(this), activityM9446));
                    break;
                }
                break;
        }
    }
}