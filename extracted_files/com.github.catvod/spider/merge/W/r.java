package com.github.catvod.spider.merge.W;

import android.view.View;
import android.webkit.WebView;
import com.github.catvod.spider.merge.P0.C0024;
import com.github.catvod.spider.merge.Z.C0037;
import com.github.catvod.spider.merge.Z0.C0041;
import com.github.catvod.spider.p000mergexbpq.S.C0005;
import com.github.catvod.spider.p000mergexbpq.c0.C0010;
import com.github.catvod.spider.p000mergexbpq.r.C0014;
import com.github.catvod.spider.p000mergexbpq.x.C0015;
import com.github.catvod.spider.p000mergexbpq.x.C0016;

/* loaded from: classes.dex */
public final /* synthetic */ class r implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ t b;

    public /* synthetic */ r(t tVar, int i) {
        this.a = i;
        this.b = tVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (C0005.m1618(this)) {
            case 0:
                t tVarM2290 = C0010.m2290(this);
                WebView webViewM4737 = C0024.m4737(tVarM2290);
                if (webViewM4737 != null && C0014.m3339(webViewM4737)) {
                    C0041.m6798(C0024.m4737(tVarM2290));
                    break;
                }
                break;
            default:
                t tVarM22902 = C0010.m2290(this);
                if (!C0016.m3609(tVarM22902)) {
                    tVarM22902.g = true;
                    C0037.m6386(C0015.m3460(tVarM22902), new com.github.catvod.spider.merge.F.b(9, tVarM22902));
                    break;
                }
                break;
        }
    }
}