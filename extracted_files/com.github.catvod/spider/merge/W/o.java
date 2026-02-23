package com.github.catvod.spider.merge.W;

import android.view.View;
import android.webkit.WebView;
import com.github.catvod.spider.merge.Q0.C0025;
import com.github.catvod.spider.merge.S0.C0028;
import com.github.catvod.spider.merge.Z.C0037;
import com.github.catvod.spider.merge.Z0.C0041;
import com.github.catvod.spider.merge.h.C0054;
import com.github.catvod.spider.merge.z.C0065;
import com.github.catvod.spider.p000mergexbpq.Q.C0001;
import com.github.catvod.spider.p000mergexbpq.r.C0014;

/* loaded from: classes.dex */
public final /* synthetic */ class o implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ q b;

    public /* synthetic */ o(q qVar, int i) {
        this.a = i;
        this.b = qVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (C0054.m8650(this)) {
            case 0:
                q qVarM4801 = C0025.m4801(this);
                WebView webViewM9749 = C0065.m9749(qVarM4801);
                if (webViewM9749 != null && C0014.m3339(webViewM9749)) {
                    C0041.m6798(C0065.m9749(qVarM4801));
                    break;
                }
                break;
            default:
                q qVarM48012 = C0025.m4801(this);
                if (!C0028.m5191(qVarM48012)) {
                    qVarM48012.g = true;
                    C0037.m6386(C0001.m1234(qVarM48012), new com.github.catvod.spider.merge.F.b(8, qVarM48012));
                    break;
                }
                break;
        }
    }
}