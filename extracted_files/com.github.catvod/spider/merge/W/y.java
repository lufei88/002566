package com.github.catvod.spider.merge.W;

import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.T0.C0030;
import com.github.catvod.spider.merge.V.C0031;
import com.github.catvod.spider.merge.Z.C0037;
import com.github.catvod.spider.merge.Z.C0040;
import com.github.catvod.spider.merge.b.C0044;
import com.github.catvod.spider.merge.b0.C0045;
import com.github.catvod.spider.merge.c1.C0046;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.d1.C0049;
import com.github.catvod.spider.merge.f1.C0053;
import com.github.catvod.spider.merge.o0.C0056;
import com.github.catvod.spider.merge.v.C0062;
import com.github.catvod.spider.merge.y0.C0064;
import com.github.catvod.spider.p000mergexbpq.Q.C0002;
import com.github.catvod.spider.p000mergexbpq.b0.C0008;
import com.github.catvod.spider.p000mergexbpq.c0.C0010;
import com.github.catvod.spider.p000mergexbpq.e0.C0011;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import com.github.catvod.spider.p000mergexbpq.x.C0015;
import java.util.Iterator;

/* loaded from: classes.dex */
public final /* synthetic */ class y implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ C b;

    public /* synthetic */ y(C c, int i) {
        this.a = i;
        this.b = c;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (C0064.m9634(this)) {
            case 0:
                C cM1307 = C0002.m1307(this);
                C0047.m7777(cM1307);
                try {
                    FrameLayout frameLayoutM9644 = C0064.m9644(cM1307);
                    if (frameLayoutM9644 != null && C0030.m5434(frameLayoutM9644) != null) {
                        C0018.m3892((ViewGroup) C0030.m5434(C0064.m9644(cM1307)), C0064.m9644(cM1307));
                    }
                    C0011.m2786(C0015.m3456(cM1307), null);
                    cM1307.f = null;
                    Iterator itM1943 = C0008.m1943(C0031.m5639(C0010.m2332()));
                    while (C0012.m2962(itM1943)) {
                        if (!C0053.m8421((C) C0048.m7949(itM1943))) {
                            break;
                        }
                    }
                    WebView webViewM7668 = C0046.m7668();
                    if (webViewM7668 != null) {
                        B.d = C0056.m8873(webViewM7668);
                        C0044.m7396(C0046.m7668());
                        C0037.m6361(C0046.m7668(), null);
                        C0062.m9371(C0046.m7668(), null);
                        C0062.m9409(C0046.m7668());
                        B.a = null;
                        B.b = null;
                        break;
                    }
                } catch (Exception e) {
                    C0049.m7975(e);
                    return;
                }
                break;
            default:
                C cM13072 = C0002.m1307(this);
                WebView webViewM7622 = C0045.m7622(cM13072);
                if (webViewM7622 != null && !C0053.m8421(cM13072)) {
                    C0040.m6677(webViewM7622);
                    break;
                }
                break;
        }
    }
}