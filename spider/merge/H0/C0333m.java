package com.github.catvod.spider.merge.h0;

import android.app.AlertDialog;
import android.app.Application;
import android.content.res.Configuration;
import android.widget.LinearLayout;
import com.github.catvod.spider.merge.G.C0019;
import com.github.catvod.spider.merge.N.C0023;
import com.github.catvod.spider.merge.S0.C0029;
import com.github.catvod.spider.merge.T0.C0030;
import com.github.catvod.spider.merge.a0.C0042;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.b.C0044;
import com.github.catvod.spider.merge.f0.C0052;
import com.github.catvod.spider.merge.h.C0054;
import com.github.catvod.spider.merge.r0.C0059;
import com.github.catvod.spider.p000mergexbpq.e0.C0011;
import com.github.catvod.spider.p000mergexbpq.r.C0014;
import com.github.catvod.spider.p000mergexbpq.x.C0016;

/* renamed from: com.github.catvod.spider.merge.h0.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0333m extends LinearLayout {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0333m(Object obj, Application application, int i) {
        super(application);
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        switch (C0044.m7406(this)) {
            case 0:
                super.onConfigurationChanged(configuration);
                C0335o c0335o = (C0335o) C0052.m8351(this);
                C0054.m8585(c0335o);
                C0019.m4040(this);
                AlertDialog alertDialogM5411 = C0030.m5411(c0335o);
                if (alertDialogM5411 != null && C0016.m3578(alertDialogM5411)) {
                    C0042.m7172(c0335o);
                    break;
                }
                break;
            default:
                super.onConfigurationChanged(configuration);
                C0340u c0340u = (C0340u) C0052.m8351(this);
                C0029.m5273(c0340u);
                C0019.m4040(this);
                AlertDialog alertDialogM3296 = C0014.m3296(c0340u);
                if (alertDialogM3296 != null && C0016.m3578(alertDialogM3296)) {
                    C0059.m9263(c0340u);
                    break;
                }
                break;
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        switch (C0044.m7406(this)) {
            case 0:
                super.onMeasure(i, C0011.m2767(C0043.m7358((C0335o) C0052.m8351(this)), Integer.MIN_VALUE));
                break;
            default:
                super.onMeasure(i, C0011.m2767(C0023.m4535((C0340u) C0052.m8351(this)), Integer.MIN_VALUE));
                break;
        }
    }
}