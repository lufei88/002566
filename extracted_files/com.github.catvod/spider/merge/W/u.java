package com.github.catvod.spider.merge.W;

import android.view.View;
import android.webkit.WebView;
import com.github.catvod.spider.merge.G.C0019;
import com.github.catvod.spider.merge.S0.C0028;
import com.github.catvod.spider.merge.Z.C0037;
import com.github.catvod.spider.merge.Z0.C0041;
import com.github.catvod.spider.merge.d1.C0050;
import com.github.catvod.spider.p000mergexbpq.r.C0014;
import com.github.catvod.spider.p000mergexbpq.x.C0016;

/* loaded from: classes.dex */
public final /* synthetic */ class u implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ w b;

    public /* synthetic */ u(w wVar, int i) {
        this.a = i;
        this.b = wVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (C0019.m4052(this)) {
            case 0:
                w wVarM6330 = C0037.m6330(this);
                WebView webViewM8150 = C0050.m8150(wVarM6330);
                if (webViewM8150 != null && C0014.m3339(webViewM8150)) {
                    C0041.m6798(C0050.m8150(wVarM6330));
                    break;
                }
                break;
            default:
                w wVarM63302 = C0037.m6330(this);
                if (!C0016.m3520(wVarM63302)) {
                    wVarM63302.g = true;
                    C0037.m6386(C0028.m5173(wVarM63302), new com.github.catvod.spider.merge.F.b(10, wVarM63302));
                    break;
                }
                break;
        }
    }
}