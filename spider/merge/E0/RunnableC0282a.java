package com.github.catvod.spider.merge.e0;

import android.app.Activity;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.G.C0019;
import com.github.catvod.spider.merge.I0.C0020;
import com.github.catvod.spider.merge.S.C0027;
import com.github.catvod.spider.merge.T0.C0030;
import com.github.catvod.spider.merge.V.C0031;
import com.github.catvod.spider.merge.V.C0032;
import com.github.catvod.spider.merge.V.C0033;
import com.github.catvod.spider.merge.Y.C0035;
import com.github.catvod.spider.merge.Z.C0037;
import com.github.catvod.spider.merge.Z.C0038;
import com.github.catvod.spider.merge.Z.C0040;
import com.github.catvod.spider.merge.a0.C0042;
import com.github.catvod.spider.merge.b.C0044;
import com.github.catvod.spider.merge.b0.C0045;
import com.github.catvod.spider.merge.c1.C0046;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.d1.C0050;
import com.github.catvod.spider.merge.f0.C0052;
import com.github.catvod.spider.merge.i0.C0055;
import com.github.catvod.spider.merge.p.C0057;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.merge.v.C0062;
import com.github.catvod.spider.p000mergexbpq.Q.C0000;
import com.github.catvod.spider.p000mergexbpq.Q.C0002;
import com.github.catvod.spider.p000mergexbpq.S.C0005;
import com.github.catvod.spider.p000mergexbpq.a0.C0006;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.c.C0009;
import com.github.catvod.spider.p000mergexbpq.c0.C0010;
import com.github.catvod.spider.p000mergexbpq.j.C0013;
import com.github.catvod.spider.p000mergexbpq.x.C0015;
import com.github.catvod.spider.p000mergexbpq.x.C0016;

/* renamed from: com.github.catvod.spider.merge.e0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0282a implements Runnable {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f778short = {-29608, 2604, 24949, 23870, 28170, 30516, 2604, 789, 777, 777, 781, 839, 850, 850, 844, 847, 842, 851, 845, 851, 845, 851, 844, 839, 836, 836, 836, 842, 850, 781, 783, 786, 773, 772, 834, 793, 786, 832, 782, 792, 796, 798, 789, 793, 796, 787, 784, 776, 859, 794, 786, 832, 782, 792, 796, 798, 789, 859, 791, 776, 784, 788, 787, 794, 832, 302, 291, 308, 307};
    public final /* synthetic */ int a;
    public final /* synthetic */ C0288g b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;

    public /* synthetic */ RunnableC0282a(C0288g c0288g, Activity activity, String str) {
        this.a = 0;
        this.b = c0288g;
        this.d = str;
        this.c = false;
    }

    public /* synthetic */ RunnableC0282a(C0288g c0288g, boolean z, Activity activity) {
        this.a = 1;
        this.b = c0288g;
        this.c = z;
        this.d = activity;
    }

    /* renamed from: ۣ۟ۧۢ۟, reason: not valid java name and contains not printable characters */
    public static short[] m8170() {
        if (C0033.m5872() > 0) {
            return f778short;
        }
        return null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        WebView webViewM1741;
        switch (C0015.m3429(this)) {
            case 0:
                C0288g c0288gM1629 = C0005.m1629(this);
                C0285d c0285dM8766 = C0055.m8766(c0288gM1629);
                String str = (String) C0047.m7843(this);
                if (c0285dM8766 == null || C0030.m5434(c0285dM8766) == null) {
                    C0000.m1127(c0288gM1629, str);
                } else if (str != null) {
                    WebView webViewM17412 = C0006.m1741();
                    if (!C0007.m1815(str, webViewM17412 != null ? C0044.m7510(webViewM17412) : C0057.m8981()) && (webViewM1741 = C0006.m1741()) != null) {
                        C0048.m7899(webViewM1741, str);
                        AbstractC0287f.b = str;
                    }
                }
                if (C0055.m8766(c0288gM1629) != null) {
                    Activity activityM9446 = C0062.m9446(c0288gM1629);
                    C0037.m6386(activityM9446, new RunnableC0282a(c0288gM1629, C0019.m4099(this), activityM9446));
                    break;
                }
                break;
            default:
                C0288g c0288gM16292 = C0005.m1629(this);
                boolean zM4099 = C0019.m4099(this);
                Activity activity = (Activity) C0047.m7843(this);
                String strM1842 = C0007.m1842(m8170(), 0, 7, 2582);
                String strM8814 = C0055.m8814(m8170(), 7, 58, 893);
                WebSettings webSettingsM8148 = C0050.m8148(C0013.m3158(c0288gM16292));
                C0044.m7416(webSettingsM8148, true);
                C0042.m7175(webSettingsM8148, true);
                if (!zM4099) {
                    C0010.m2319(C0055.m8766(c0288gM16292), 8);
                    WebView webViewM3158 = C0013.m3158(c0288gM16292);
                    if (webViewM3158 != null) {
                        C0042.m7131(webViewM3158);
                        C0020.m4283(C0013.m3158(c0288gM16292));
                        c0288gM16292.f = true;
                        break;
                    }
                } else {
                    if (C0030.m5434(C0055.m8766(c0288gM16292)) != null) {
                        C0058.m9072(c0288gM16292);
                    }
                    C0010.m2319(C0055.m8766(c0288gM16292), 0);
                    if (C0032.m5701(c0288gM16292) > 0.0f && C0047.m7753(c0288gM16292) > 0.0f) {
                        int iM7623 = C0045.m7623(C0007.m1852(C0002.m1335(activity)));
                        int iM7678 = C0046.m7678(C0007.m1852(C0002.m1335(activity)));
                        int iM5701 = (int) (iM7623 * C0032.m5701(c0288gM16292));
                        int iM7753 = (int) (iM7678 * C0047.m7753(c0288gM16292));
                        FrameLayout.LayoutParams layoutParamsM5580 = C0031.m5580(c0288gM16292);
                        layoutParamsM5580.width = iM5701;
                        layoutParamsM5580.height = iM7753;
                        layoutParamsM5580.topMargin = iM7678 - iM7753;
                        C0009.m2112(C0032.m5687(c0288gM16292), layoutParamsM5580);
                    }
                    WebView webViewM31582 = C0013.m3158(c0288gM16292);
                    if (webViewM31582 != null) {
                        if (C0027.m5080(c0288gM16292)) {
                            C0052.m8380(webViewM31582);
                            C0016.m3548(C0013.m3158(c0288gM16292));
                            c0288gM16292.f = false;
                        }
                        C0040.m6677(C0013.m3158(c0288gM16292));
                    }
                    try {
                        if (C0044.m7510(C0013.m3158(c0288gM16292)) != null) {
                            String strM9421 = C0062.m9421(C0044.m7510(C0013.m3158(c0288gM16292)));
                            if (!C0058.m9127(strM9421, C0019.m4107(m8170(), 65, 4, 327)) && !C0058.m9127(strM9421, C0002.m1316(C0035.m6110()))) {
                                WebView webViewM31583 = C0013.m3158(c0288gM16292);
                                StringBuilder sb = new StringBuilder(strM8814);
                                C0018.m3933(sb, C0002.m1316(C0035.m6110()));
                                C0048.m7899(webViewM31583, C0047.m7763(sb));
                                StringBuilder sb2 = new StringBuilder(strM1842);
                                C0018.m3933(sb2, C0002.m1316(C0035.m6110()));
                                C0038.m6402(C0047.m7763(sb2));
                                break;
                            }
                        }
                    } catch (Exception unused) {
                        return;
                    }
                }
                break;
        }
    }
}