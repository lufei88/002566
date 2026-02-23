package com.github.catvod.spider.merge.W;

import android.view.View;
import android.webkit.WebView;
import com.github.catvod.spider.merge.P0.C0024;
import com.github.catvod.spider.merge.S0.C0028;
import com.github.catvod.spider.merge.Z.C0037;
import com.github.catvod.spider.merge.Z.C0039;
import com.github.catvod.spider.merge.Z.C0040;
import com.github.catvod.spider.merge.Z0.C0041;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.p000mergexbpq.r.C0014;

/* loaded from: classes.dex */
public final /* synthetic */ class j implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ x b;

    public /* synthetic */ j(x xVar, int i) {
        this.a = i;
        this.b = xVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (C0028.m5116(this)) {
            case 0:
                x xVarM6599 = C0040.m6599(this);
                WebView webViewM4665 = C0024.m4665(xVarM6599);
                if (webViewM4665 != null && C0014.m3339(webViewM4665)) {
                    C0041.m6798(C0024.m4665(xVarM6599));
                    break;
                }
                break;
            default:
                x xVarM65992 = C0040.m6599(this);
                if (!C0048.m7946(xVarM65992)) {
                    xVarM65992.g = true;
                    C0037.m6386(C0039.m6491(xVarM65992), new com.github.catvod.spider.merge.F.b(7, xVarM65992));
                    break;
                }
                break;
        }
    }
}