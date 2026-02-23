package com.github.catvod.spider.merge.b0;

import android.app.ProgressDialog;
import androidx.core.content.res.ResourcesCompat;
import com.github.catvod.spider.Market;
import com.github.catvod.spider.merge.J0.C0021;
import com.github.catvod.spider.merge.Z.C0038;
import com.github.catvod.spider.merge.Z.C0039;
import com.github.catvod.spider.merge.b.C0044;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d1.C0049;
import com.github.catvod.spider.merge.f.C0051;

/* loaded from: classes.dex */
public final /* synthetic */ class n implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ n(Object obj, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.b = i;
    }

    /* renamed from: ۣۤ۠ۧ, reason: not valid java name and contains not printable characters */
    public static void m7533(Object obj, int i) {
        if (C0038.m6471() >= 0) {
            ResourcesCompat.FontCallback.b((ResourcesCompat.FontCallback) obj, i);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (C0021.m4386(this)) {
            case 0:
                int iM8234 = C0051.m8234(this);
                Market market = (Market) C0047.m7788(this);
                C0047.m7777(market);
                try {
                    ProgressDialog progressDialogM7471 = C0044.m7471(market);
                    if (progressDialogM7471 != null) {
                        C0039.m6475(progressDialogM7471, iM8234);
                        break;
                    }
                } catch (Exception e) {
                    C0049.m7975(e);
                    return;
                }
                break;
            default:
                m7533((ResourcesCompat.FontCallback) C0047.m7788(this), C0051.m8234(this));
                break;
        }
    }
}