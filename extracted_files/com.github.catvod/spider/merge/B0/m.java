package com.github.catvod.spider.merge.b0;

import android.app.ProgressDialog;
import com.github.catvod.spider.Market;
import com.github.catvod.spider.merge.J0.C0021;
import com.github.catvod.spider.merge.K0.C0022;
import com.github.catvod.spider.merge.Y.C0035;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.b.C0044;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d1.C0049;
import com.github.catvod.spider.merge.r0.C0060;
import com.github.catvod.spider.p000mergexbpq.Q.C0001;
import com.github.catvod.spider.p000mergexbpq.Q.C0002;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.x.C0016;

/* loaded from: classes.dex */
public final /* synthetic */ class m implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Market b;

    public /* synthetic */ m(Market market, int i) {
        this.a = i;
        this.b = market;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (C0001.m1187(this)) {
            case 0:
                Market marketM6130 = C0035.m6130(this);
                C0047.m7777(marketM6130);
                C0016.m3575(new m(marketM6130, 2));
                break;
            case 1:
                Market marketM61302 = C0035.m6130(this);
                C0047.m7777(marketM61302);
                try {
                    C0060.m9315(marketM61302, false);
                    ProgressDialog progressDialogM7471 = C0044.m7471(marketM61302);
                    if (progressDialogM7471 != null) {
                        C0004.m1577(progressDialogM7471);
                        break;
                    }
                } catch (Exception e) {
                    C0049.m7975(e);
                    return;
                }
                break;
            default:
                Market marketM61303 = C0035.m6130(this);
                C0047.m7777(marketM61303);
                try {
                    ProgressDialog progressDialog = new ProgressDialog(C0022.m4453());
                    marketM61303.a = progressDialog;
                    C0021.m4366(progressDialog, 1);
                    C0002.m1301(C0044.m7471(marketM61303), false);
                    if (C0043.m7338(marketM61303)) {
                        C0007.m1816(C0044.m7471(marketM61303));
                        break;
                    }
                } catch (Exception e2) {
                    C0049.m7975(e2);
                }
                break;
        }
    }
}