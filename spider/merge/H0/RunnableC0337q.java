package com.github.catvod.spider.merge.h0;

import android.R;
import android.app.AlertDialog;
import android.view.View;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.LinearLayout;
import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.J0.C0021;
import com.github.catvod.spider.merge.P0.C0024;
import com.github.catvod.spider.merge.Q0.C0026;
import com.github.catvod.spider.merge.S0.C0028;
import com.github.catvod.spider.merge.S0.C0029;
import com.github.catvod.spider.merge.T0.C0030;
import com.github.catvod.spider.merge.V.C0031;
import com.github.catvod.spider.merge.V.C0033;
import com.github.catvod.spider.merge.Z.C0037;
import com.github.catvod.spider.merge.Z.C0038;
import com.github.catvod.spider.merge.Z.C0039;
import com.github.catvod.spider.merge.Z0.C0041;
import com.github.catvod.spider.merge.a0.C0042;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.b.C0044;
import com.github.catvod.spider.merge.b0.C0045;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.f.C0051;
import com.github.catvod.spider.merge.f1.C0053;
import com.github.catvod.spider.merge.r0.C0059;
import com.github.catvod.spider.merge.x0.C0063;
import com.github.catvod.spider.merge.y0.C0064;
import com.github.catvod.spider.p000mergexbpq.Q.C0000;
import com.github.catvod.spider.p000mergexbpq.Q.C0002;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.c.C0009;
import com.github.catvod.spider.p000mergexbpq.c0.C0010;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import com.github.catvod.spider.p000mergexbpq.j.C0013;
import com.github.catvod.spider.p000mergexbpq.r.C0014;
import com.github.catvod.spider.p000mergexbpq.x.C0016;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: com.github.catvod.spider.merge.h0.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0337q implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ C0340u b;

    public /* synthetic */ RunnableC0337q(C0340u c0340u, int i) {
        this.a = i;
        this.b = c0340u;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (C0013.m3180(this)) {
            case 0:
                C0340u c0340uM5155 = C0028.m5155(this);
                if (C0014.m3296(c0340uM5155) != null) {
                    C0059.m9263(c0340uM5155);
                    C0007.m1816(C0014.m3296(c0340uM5155));
                    View viewM3365 = C0014.m3365(C0000.m1119(C0014.m3296(c0340uM5155)));
                    TranslateAnimation translateAnimation = new TranslateAnimation(2, 0.0f, 2, 0.0f, 2, 1.0f, 2, 0.0f);
                    C0044.m7401(translateAnimation, 300L);
                    C0033.m5846(translateAnimation, true);
                    C0063.m9549(viewM3365, translateAnimation);
                    break;
                } else {
                    C0010.m2366(c0340uM5155);
                    break;
                }
            case 1:
                C0340u c0340uM51552 = C0028.m5155(this);
                AlertDialog alertDialogM3296 = C0014.m3296(c0340uM51552);
                if (alertDialogM3296 != null && C0016.m3578(alertDialogM3296)) {
                    View viewM33652 = C0014.m3365(C0000.m1119(C0014.m3296(c0340uM51552)));
                    TranslateAnimation translateAnimation2 = new TranslateAnimation(2, 0.0f, 2, 0.0f, 2, 0.0f, 2, 1.0f);
                    C0044.m7401(translateAnimation2, 300L);
                    C0033.m5846(translateAnimation2, true);
                    C0007.m1860(translateAnimation2, new AnimationAnimationListenerC0331k(c0340uM51552, viewM33652, 1));
                    C0063.m9549(viewM33652, translateAnimation2);
                    break;
                }
                break;
            default:
                C0340u c0340uM51553 = C0028.m5155(this);
                C0010.m2319(C0012.m2967(c0340uM51553), 8);
                C0031.m5563(C0053.m8472(c0340uM51553));
                C0031.m5563(C0024.m4753(c0340uM51553));
                HashMap mapM9692 = C0064.m9692(c0340uM51553);
                Iterator itM5199 = C0029.m5199(C0000.m1121(mapM9692));
                while (C0012.m2962(itM5199)) {
                    String str = (String) C0048.m7949(itM5199);
                    Button button = new Button(C0031.m5652());
                    C0042.m7106(button, str);
                    C0039.m6563(button, 13.0f);
                    C0016.m3608(button, C0013.m3103(12), C0013.m3103(4), C0013.m3103(12), C0013.m3103(4));
                    C0024.m4681(button, 17);
                    C0018.m3910(button, false);
                    C0044.m7440(button, 0);
                    C0051.m8206(button, 0);
                    C0013.m3174(button, 0);
                    C0030.m5348(button, 0);
                    C0026.m4916(button, R.drawable.list_selector_background);
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                    C0043.m7283(layoutParams, C0013.m3103(8));
                    C0009.m2112(button, layoutParams);
                    C0002.m1251(button, new ViewOnClickListenerC0330j(c0340uM51553, str, button, 1));
                    C0045.m7580(button);
                    C0038.m6460(button, C0007.m1815(str, C0044.m7421(c0340uM51553)));
                    C0037.m6336(C0024.m4753(c0340uM51553), button);
                }
                if (!C0041.m6760(mapM9692)) {
                    C0038.m6455(c0340uM51553, (String) C0048.m7949(C0029.m5199(C0000.m1121(mapM9692))));
                    break;
                } else {
                    C0021.m4374(c0340uM51553);
                    break;
                }
        }
    }
}